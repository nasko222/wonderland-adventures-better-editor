
;Local var01
;Local var02
;Local var03
;Local var04
;Local var05

AppTitle "Wonderland Adventures"
; Global Definitions

Include "particles-define.bb"
Include "level-define.bb"
Include "menu-define.bb"
Include "adventures-define.bb"
Include "sound-define.bb"

Global GlobalDirName$ = "User Data"
Global WAEpisode=0
	
Goto skiplocker	
If (Upper$(Right$(CurrentDate(),4))<>"2008" And (Upper$(Right$(CurrentDate(),4))<>"2007" Or FileType("mpbe.wdf")=0)) Then
	Restore expired
	Read ex2$
	Print ex2$
	Print "-------------------------------"
	Read ex2$
	Print ex2$
	Read ex2$
	Print ex2$
	DeleteFile "mpbe.wdf"
	Delay 5000
	End
End If

.skiplocker



	; Check for New Compiled Levels
	CheckForNewCompiledLevels(False)

	


Global FullVersion=True
Global PortalVersion=False ;1-true, 0-false
Global AffiliateID=1046627

Global ExitAfterTrailer=False
Global TrailerAlreadyPlayed=False
Global TimeOfLastGameSaved=0
Global ExitAfterThisSave=False

Global GfxWidth=800;1280;800;1280;640
Global GfxHeight=600;960;600;768;480
Global GfxDepth=16
Global GfxWindowed=1
Global OldGfxWIndowed


Global NofMyGfxModes, MyGfxMode
Dim MyGfxModeWidth(1000),MyGfxModeHeight(1000),MyGfxModeDepth(1000)

Global FPSDisplay=False
Global MidnightVault=0
Global MidnightVaultTimer
Global WallBlinking=False
Global BackSpaceDown
Global LevelFormat104=False
Global Menukeydown=False



Global scoreflag

file=ReadFile (globaldirname$+"\display.wdf")
If file>0

	j=ReadInt(file)
	For i=0 To j-1
		MyGfxModeWidth(i)=ReadInt(file)
		MyGfxModeHeight(i)=ReadInt(file)
		MyGfxModeDepth(i)=ReadInt(file)
	Next
	mygfxmode=ReadInt(file)
	GfxWindowed=ReadInt(file)
	GfxWidth=MyGfxModeWidth(mygfxmode)
	GfxHeight=MyGfxModeHeight(mygfxmode)
	GfxDepth=MyGfxModeDepth(mygfxmode)
	
	
	; something is wrong withe graphics mode: try different versions
	If GfxMode3DExists (GfxWidth,GfxHeight,GfxDepth)=False
		GfxWidth=800
		GfxHeight=600
		GfxDepth=16
	EndIf
	If GfxMode3DExists (GfxWidth,GfxHeight,GfxDepth)=False
		GfxWidth=800
		GfxHeight=600
		GfxDepth=32
	EndIf
	If GfxMode3DExists (GfxWidth,GfxHeight,GfxDepth)=False
		GfxWidth=640
		GfxHeight=480
		GfxDepth=16
	EndIf
	If GfxMode3DExists (GfxWidth,GfxHeight,GfxDepth)=False
		GfxWidth=640
		GfxHeight=480
		GfxDepth=32
	EndIf
	
Else
	Print "File Not Found: 'display.wdf'"
	Delay 3000
	End


	
EndIf

If GfxMode3DExists (GfxWidth,GfxHeight,GfxDepth)=False
	Print "Unable to set graphics mode!"
	Print ""
	Print "Please ensure that your video card drivers"
	Print "are up-to-date, or use the graphic options"
	Print "to select a different display mode."
	Print ""
	Print "Exiting... press any key."
	WaitKey()
	End
	
EndIf



Global KeyboardMode=2	; 1- mouse only, 2- mouse/keyboard, 3- gamepad?
						
Global MouseGameMode=-1	; What Game Mode the Mouse is Responsive to 
						; -1 = responsive to movement, icons, anything
						; -2 = non responsive - wait for button release
Global Mouse1, Mouse2, EscPressed

Global Tween#,TweenPeriod,TweenTime,TweenElapsed,TweenTicks
Global justregainedfocus

Type AltXType
	Field KeyPressed, InUse, Reset
	Field X#,Y#,Z#
	Field Roll#,Yaw#,Pitch#
End Type
Global AltX.AltXType=New AltXType

Dim ConsoleData(6)

; global ini file


OldGfxWindowed=GfxWindowed




; Main

Graphics3D GfxWidth,GfxHeight,GfxDepth,GfxWindowed
SetBuffer BackBuffer()
HidePointer 


file=ReadFile(globaldirname$+"\global.wdf")
If file=0
	PlayerName$=""
	PlayerCharacterName$=""
	GlobalSoundVolume2=5
	GlobalMusicVolume2=3
	KeyBoardMode=2
Else
	playername$=ReadString$(file)
	playercharactername$=ReadString$(file)
	GlobalSoundVolume2=ReadInt(file)
	GlobalMusicVolume2=ReadInt(file)
	KeyboardMode=ReadInt(file)
	CloseFile file
	GlobalSoundVolume=Float(globalsoundvolume2)*0.2
	GlobalMusicVolume=Float(globalMusicvolume2)*0.2

EndIf
	
; Randomize
For bla= 1 To MilliSecs() Mod 100
	blabla=Rand(0,44)
Next

SetupCamera()
SetupLight()
AmbientLight 255.0,255.0,255.0
cube=CreateCube(camera)

If portalversion=0
	cubetex=myLoadTexture("load.jpg",1)
	EntityTexture cube,cubetex
	PositionEntity cube,0,0,10
	RenderWorld
	Text GfxWidth*0.5,GfxHeight*2/7,"...Loading...",True
	Text GfxWidth*0.5,GfxHeight*2/3,"...Please Wait...",True
	Text GfxWidth*0.5,GfxHeight*34/36,"WA Custom Editor (C) 2008 Midnight Synergy",True
	Text GfxWidth*0.5,GfxHeight*35/36,"www.MidnightSynergy.com",True
Else
	cubetex=LoadTexture("logo.jpg",1)
	EntityTexture cube,cubetex
	PositionEntity cube,0,0,5
	
	RenderWorld
	Text GfxWidth*0.5,Gfxheight*25/28,"...Loading...",True
	Text GfxWidth*0.5,Gfxheight*26/28,"...Please Wait...",True


EndIf

Flip
PreLoadModels()
SetupMenu()

FreeTexture cubetex
FreeEntity cube

ResetParticles("data/graphics/particles.bmp")
ResetText("data/graphics/font.bmp")




; Start Main Menu
If playername$=""
	StartMenu(12)
Else
	loadplayer(globaldirname$+"\player profiles\"+playername$+"\current\playerfile.wpf")
	StartMenu(11)
EndIf

AltX\InUse=True


fpscounter=-1
fps=0
fpstime=0


TweenPeriod=1000/60;85
TweenTime=MilliSecs()-TweenPeriod

Global EndGame=False

Repeat

	If HasFocus()
	
		If justregainedfocus=1
			justregainedfocus=0
			If currentmusic>0 Then ResumeChannel(musicchannel)
		EndIf
		If currentmusic>0 And (gamemode<10 Or currentmenu<>10)
			; music looping
			If ChannelPlaying(musicchannel)=0
				MusicChannel=PlayMusic("data\music\"+currentmusic+".ogg")
				ChannelVolume musicchannel,GlobalMusicVolume	
			EndIf
		EndIf
		


		Repeat
			TweenElapsed=MilliSecs()-TweenTime
		Until TweenElapsed>TweenPeriod
		
		If TweenElapsed>20*TweenPeriod 
			TweenElapsed=20*TweenPeriod
			TweenTime=MilliSecs()-TweenElapsed
		EndIf
	
		;how many 'frames' have elapsed	
		TweenTicks=TweenElapsed/TweenPeriod
		;fractional remainder
		Tween#=Float(TweenElapsed Mod TweenPeriod)/Float(TweenPeriod)
	
		For k=1 To TweenTicks
			Tweentime=Tweentime+Tweenperiod
			If k=Tweenticks 
				CaptureWorld
			EndIf
			
			; do the game in here
			
			If GameMode<10
				UpdateGame()
			Else If GameMode=10
				UpdateAdventureTitle()

			Else If gamemode=12
				; Menus
				UpdateMenu()
			EndIf
			
				
			If GameMode<>12
				ControlLight()
				LevelTimer=LevelTimer+1	
				AdventureTimer=AdventureTimer+1	
				
				UpdateWorld
			EndIf
		
		Next
	
	
		
		If fpscounter=-1
			fpstime=MilliSecs()
			fpscounter=100
		Else If fpscounter=0
			timepassed=MilliSecs()-fpstime
			fps=100000/timepassed
			fpscounter=100
			fpstime=MilliSecs()
		Else
			fpscounter=fpscounter-1
		EndIf
		MX=Floor(MousePickX)
		MY=Floor(MousePickY)
	
		If FPSDisplay=True;False
			DisplayText("FPS: "+fps,0,46,.5,1,255,255,255)
			
			
		EndIf
	;	DisplayText(LevelTileLogic(Mx,MY),0,0,1,1,255,255,255)
	;	DisplayText(objecttilelogic(mx,my),0,1,1,1,255,255,255)
	;	DisplayText("FPS: "+Leveltimer,0,0,1,1,255,255,255)

	
	
		; MESSAGELINE
		If MessageLineTimer>0 And MessageLineText1$<>""
			ShowEntity DialogBackGroundEntity2
			If MessageLineTimer<30
				PositionEntity DialogBackGroundEntity2,0,.4-.4*Float(30-MessageLineTimer)/30.0,0

				DisplayText(MessageLineText1$,24.5-Len(MessageLineText1$)/2.0,24-2*MessageLineTimer/30.0,1,1,255,255,0)
				DisplayText(MessageLineText2$,24.5-Len(MessageLineText2$)/2.0,25-2*MessageLineTimer/30.0,1,1,255,255,0)
	
			Else 
				PositionEntity DialogBackGroundEntity2,0,.4,0
				DisplayText(MessageLineText1$,24.5-Len(MessageLineText1$)/2.0+.25*Sin(16*(messagelinetimer-30)),22,1,1,255,255,0)
				DisplayText(MessageLineText2$,24.5-Len(MessageLineText2$)/2.0+.25*Sin(16*(messagelinetimer-30)),23,1,1,255,255,0)
	
			EndIf
		Else
			HideEntity DialogBackGroundEntity2
		EndIf
		If MessageLineTimer>0 Then MessageLineTimer=MessageLineTimer-1
	
		; ICON SUBTEXTS
		For i=0 To 79
			If IconEntity(i)>0 And IconSize(i)>=1001
				If IconSize(i)=1201 
					DisplayText(IconHelpText$(i),3.2+10.1*(i Mod 10)-(Len(IconHelpText$(i))-1.0)/2.0,4.3+6*Floor(i/10),.5,1,255,255,255)
				Else
					DisplayText(IconSubText$(i),3.2+10.1*(i Mod 10)-(Len(IconSubText$(i))-1.0)/2.0,3.9+6*Floor(i/10),.5,1,255,255,255)
				EndIf
			EndIf
		Next
		If GameMode=5
			DisplayText("Items:",40.6-6.8*(InventorySize-3),2.67,.75,1,255,255,0)
		EndIf
		If GameMode=6
			DisplayText("Swap Item:",40.6,2.67,0.75,1,255,255,0)
		EndIf	
		If GameMode=5 Or GameMode=6
			
			DisplayText("Stars",49.65-4*.5,16+(InventorySize-3)*4,.75,1,255,255,0)
			DisplayText("Coins",56.3-4*.5,16+(InventorySize-3)*4,.75,1,255,255,0)

			DisplayText("Score: "+PlayerScore,52.3-Len(playerscore),20+(InventorySize-3)*4,.75,1,255,255,0)
	
			
			If PlayerStars<10
				k=0
			Else If PlayerStars<100
				k=1
			Else If PlayerStars<1000
				k=2
			Else If PlayerStars<10000
				k=3
			Else
				k=4
			EndIf
	
			DisplayText(Str$(PlayerStars),49.65-k*0.5,18.8+(InventorySize-3)*4,.75,1,255,255,0)
			
			If PlayerCoins<10
				k=0
			Else If PlayerCoins<100
				k=1
			Else If PlayerCoins<1000
				k=2
			Else If PlayerCoins<10000
				k=3
			Else
				k=4
			EndIf
			DisplayText(Str$(PlayerCoins),56.3-k*0.5,18.8+(InventorySize-3)*4,.75,1,255,255,0)
		EndIf
		
		

		
		; TEXT DIALOG
		If GameMode=8
			DisplayDialog()
			
		EndIf	
		
		If KeyDown(63) Then FpsDisplay=True
		
	 	If MidnightVault=0 And KeyDown(6)
	 		MidnightVault=1
	 		MidnightVaultTimer=MilliSecs()
	 	Else If MidnightVault=1 And KeyDown(9)
	 		MidnightVault=2
	 	Else If MidnightVault=2 And KeyDown(3)
	 		MidnightVault=3
	 	Else If MidnightVault=3 And KeyDown(6)
	 		MidnightVault=4
	 		MessageLineText1$="Sorry. I don't have the"
	 		MessageLineText2$="key to the Vault ;-)"
	 		MessageLineTimer=100
	 	Else If KeyDown(2) Or KeyDown(4) Or KeyDown(5) Or KeyDown(8) Or KeyDown(10)
	 		MidnightVault=0
	 	EndIf
		If KeyDown(48) And (KeyDown(29) Or KeyDown(157))
			WallBlinking=True
			MessageLineText1$="Wall-Blinking Activated"
			MessageLineText2$="(use at your own risk)"
			MessageLineTimer=100
		EndIf

		If MidnightVaultTimer>0 And MidnightVault<4
			If MilliSecs()-MidnightVaultTimer>1500
				MidnightVault=0
				MidnightVaultTimer=0
			EndIf
		EndIf
		
		If KeyDown(1)
			If EscPressed=False
				EscPressed=True
			
			
				; select via game mode
				If gamemode<10
					; in game
					If CurrentCharm=3
						; turn off spy eye\map
						ShowEntity LevelCursor
						CurrentCharm=0
						TurnOnIcons()
						DeleteIcon(1)
						MouseGameMode=-2
						
					Else If LevelTimer<1000001000 Or LevelTimer>=1000001500
						; not in adventure won animation
						PlaySoundFX(131,-1,-1)
						HideEntity LevelCursor
						StartMenu(0)
					Else 
						; in adventure won animation
						LevelTimer=1000001498

					EndIf
				Else If gamemode=10
					; in adventure start animation
					LevelTimer=1000000000
				Else If gamemode=12
					; in menu
					Select currentmenu
					Case 0
						; in game 
						endmenu()
						startmenu(3)
					Case 1,2,4,5,6
						endmenu()
					Case 3
						; in game exit are you sure
						EndMenu()
						endLevel()
						endadventure()
						StartMenu(11)
					
					Case 11
						; main menu
						endmenu()
						startmenu(19)
					Case 16,18
						endmenu()
						startmenu(11)
					Case 12
						If OldPlayerName$<>"" And OldPlayerCharacterName$<>""
							PlayerName$=OldPlayerName$
							PlayerCharacterName$=OldPlayerCharacterName$

							endmenu()
							startmenu(11)
						EndIf
					Case 13
						If OldPlayerName$<>"" And OldPlayerCharacterName$<>""
							PlayerName$=OldPlayerName$
							PlayerCharacterName$=OldPlayerCharacterName$
							endmenu()
							startmenu(11)
						EndIf
					Case 14
						If OldPlayerCharacterName$=".." ; can only exit if from within options menu
							PlayerCharacterName$=OldPlayerCharacterName2$
							OldPlayerCharacterName$=""
							endmenu()
							startmenu(11)
						EndIf
					Case 15
						endmenu()
						startmenu(14)
					Case 17
						endmenu()
						startmenu(12)	
						
					Case 19
						End	
					Case 100
						endcustomselectmenu()
						startmenu(11)
						MouseGameMode=2
					Case 101
						CurrentMenu=100
						CustomLevelListSelected=-1

							

					
					End Select
					
				EndIf
				
			EndIf
		Else
			EscPressed=False
			
			
		EndIf
		
		If GfxWindowed=2 ; remove mousecursor if at endge of screen in windowed mode
			If MouseX()<10 Or MouseY()<10 Or MouseX()>GfxWidth-10 Or MouseY()>GfxHeight-10
				HideEntity MouseCursor
			Else If MouseCursorVisible=True
				ShowEntity MouseCursor
			EndIf
		EndIf

		
		RenderGame()
		


	Else
		; out of focus
		If currentmusic>0
			PauseChannel musicchannel
		EndIf
		justregainedfocus=1
		Repeat
			Delay 200
		Until HasFocus()
		TweenTime=MilliSecs()
		
		
	EndIf	
	
Until endgame=True


;EndGraphics()
End 



Function UpdateGame()

	ResetSounds()
	
	
	
	
	Mouse1=False
	Mouse2=False
	If MouseDown(1)=True Or MouseHit(1)>0
		Mouse1=True
	EndIf
	If MouseDown(2)=True Or MouseHit(2)>0
		Mouse2=True
	EndIf
	
	PositionEntity MouseCursor,-10+20*Float(MouseX())/Float(GFXWidth),7.5-15*Float(MouseY())/Float(GfxHeight),20
	If GameMode=0 

		ShowEntity LevelCursor
	EndIf



	CameraControls()
	ControlCamera()
	ControlIcons()
	ControlDialog()
	ControlObjects()
	ControlParticles()

	
	
	; Check End-of-Adventure
	If LevelTimer<1000001000 Or LevelTimer>=1000002000
		Flag=False
		Select AdventureGoal
		Case 0
			; no goal
		Case 1
			If NofWeeStinkersInAdventure=0
				Flag=True
			EndIf
		Case 2
			If NofScrittersInAdventure=0
				Flag=True
			EndIf
		Case 3
			If NofGemsInAdventure=0
				Flag=True
			EndIf
		Case 4
			If NofBricksInAdventure=0
				Flag=True
			EndIf
		Case 5
			If NofFireFlowersInAdventure=0
				Flag=True
			EndIf
		Case 6
			; race - no goal
		
		Case 7
			If NofCrabsInAdventure=0
				Flag=True
			EndIf
		Case 8
			If NofBabyBoomersInAdventure=0
				Flag=True
			EndIf

		End Select
		If (Flag=True Or ((((KeyDown(88) And ((KeyDown(29) Or (KeyDown(157))))) And (AdventureCurrentStatus>0)) And (MidnightVault>0))))
			
			AdventureWon()

		EndIf
	EndIf
	
	

	
	; Do End of Adventure Animations
	If LevelTimer>1000001000 And LevelTimer<1000002000
		AdventureWonUpdate()
		
	EndIf
	If LevelTimer>1000002000 And LevelTimer<1000003000
		AdventureLostUpdate()
		
	EndIf

	
	If Mouse1=False And Mouse2=False 
		MouseGameMode=-1
		If currentcharm<>3
			For i=0 To 79
				; activate icons
				If IconEntity(i)>0 Then EntityPickMode IconEntity(i),2
			Next
		EndIf
	EndIf
		
	
	If DelayCommand=7 And LevelTimer=1000000050
	
		
		If AdventureCurrentStatus=0
		
			
		
		
			; Currently in Hub
			CurrentReplayAdventure=0
			DelayCommand=0
			
			; save levelstate
			SaveLevel(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\"+Str$(-AdventureCurrentLevel)+".wlv")
			EndLevel()
			
			
				; and start the new level
				StartLevel(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\"+Str$(-Delaydata1)+".wlv",False)
	
				CreatePlayer(Delaydata2+.5,Delaydata3+.5)
				
				AdventureCurrentLevel=DelayData1
				

			
		Else
			; Currently in Adventure
			DelayCommand=0
			; save levelstate
			SaveLevel(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Adventure\"+Str$(AdventureCurrentLevel)+".wlv")
			EndLevel()
			
			; and start the new level
			StartLevel(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Adventure\"+Str$(Delaydata1)+".wlv",False)

			AdventureCurrentLevel=DelayData1
			CreatePlayer(Delaydata2+.5,Delaydata3+.5)
		EndIf
	EndIf
	If DelayCommand=8 And LevelTimer=1000000050
		; Start an Adventure 
		DelayCommand=0
		; save levelstate
		SaveLevel(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\"+Str$(-AdventureCurrentLevel)+".wlv")
		EndLevel()
		
		; and start the adventure
		If delaydata1>0
			
			If currentreplayadventure=0
				; regular
				StartAdventure("data\adventures\Adventure"+delaydata1,1,num)
			Else
				;replay
				StartAdventure("data\adventures\Adventure"+delaydata1,3,num)
			EndIf
				
		Else
			; custom
			StartAdventure(AdventureCurrentName$,2,0)
		EndIf

		
		
		

			
		
		
	EndIf
	If delaycommand=102
		delaycommand=0
		enddialog()
		SaveLevel(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\"+Str$(-AdventureCurrentLevel)+".wlv")

		endlevel()
		startmenu(22)	
	EndIf
	
	If delaycommand=115
		delaycommand=0
		enddialog()
		startmenu(24)
	EndIf

	; weather animations etc


	Select levelweather
	Case 1
		; light snow
		If Rand(1,3)=3 	AddParticle(40,ObjectX(CameraFocusObject)+Rnd(-10,10),8,-ObjectY(CameraFocusObject)+Rnd(-10,10),0,.2,Rnd(-.01,0.01),-.03,Rnd(-.01,0.01),2,0,0,0,0,200,3)

	Case 2
		; heavy snow
		AddParticle(40,ObjectX(CameraFocusObject)+Rnd(-10,10),8,-ObjectY(CameraFocusObject)+Rnd(-10,10),0,.3,0,-.05,0,2,0,0,0,0,120,3)
	Case 3
		; very heavy snow right to left
		AddParticle(40,ObjectX(CameraFocusObject)+Rnd(5,10),5,-ObjectY(CameraFocusObject)+Rnd(-8,4),0,.4,-0.3,-.09,0,2,0,0,0,0,80,3)
	Case 4
		; very heavy snow left to right
		AddParticle(40,ObjectX(CameraFocusObject)+Rnd(-10,-5),5,-ObjectY(CameraFocusObject)+Rnd(-8,4),0,.4,0.3,-.09,0,2,0,0,0,0,80,3)


	Case 5
		; rain
		AddParticle(41,ObjectX(CameraFocusObject)+Rnd(-10,10),8,-ObjectY(CameraFocusObject)+Rnd(-10,10),0,.2,0,-.2,0,0,0,0,0,0,60,2)
	
		; leaves
	;	If Rand(1,3)=1 AddParticle(42,Objectx(CameraFocusObject)+Rnd(-10,10),5,-ObjectY(CameraFocusObject)+Rnd(-10,10),0,1,Rnd(0,.2),Rnd(-.1,0),0,Rand(1,5),0,0,0,0,60,3)

	Case 6
		; void
		If Rand(0,200)<2 
			SetLight(Rand(0,255),Rand(0,255),Rand(0,255),2,Rand(0,255),Rand(0,255),Rand(0,255),2)
		EndIf
	End Select
	
	; cheats
	If MidnightVault=4
		If KeyDown(72) ObjectFlying(PlayerObject)=10
		If KeyDown(73) ObjectFlying(PlayerObject)=11
		If KeyDown(77) ObjectFlying(PlayerObject)=12
		If KeyDown(81) ObjectFlying(PlayerObject)=13
		If KeyDown(80) ObjectFlying(PlayerObject)=14
		If KeyDown(79) ObjectFlying(PlayerObject)=15
		If KeyDown(75) ObjectFlying(PlayerObject)=16
		If KeyDown(71) ObjectFlying(PlayerObject)=17
		If KeyDown(76) ObjectFlying(PlayerObject)=0
		; cheats
	;
	EndIf

	If KeyDown(14) 
		BackSpaceDown=BackSpaceDown+1
		If MidnightVault=4 Or BackSpaceDown=300
			Repeat
			Until KeyDown(14)=False
			Locate 0,0
			Color 0,0,0
			Rect 0,0,300,200,True
			Color 255,255,255
			c=Input ("Command:")
			d1=Input ("Data 1:")
			d2=Input ("Data 2:")
			d3=Input ("Data 3:")
			d4=Input ("Data 4:")
			activatecommand(c,d1,d2,d3,d4)
			Repeat
			Until KeyDown(14)=False

		EndIf
	Else
		BackSpaceDown=0	
	EndIf

		

	PlayAllSounds()

End Function



Function RenderGame()
	
	; Only called once per frame 
	; - any timing related issues should be dependent on the change in LevelTimer (not just +1)
	; 
	
	RenderParticles()
	RenderLetters()
	If GameMode<10
	;	If CurrentCharm<>3
	;		UpdateWater(ObjectX(CameraFocusObject),ObjectY(CameraFocusObject)-3,12)
	;	Else
			UpdateWater(EntityX(Camera),-EntityZ(Camera)-12,12)

	;	EndIf
	EndIf
	
	
	
	RenderWorld tween
	
	Flip;  False
	
	
	
	
	
End Function

Function UpdateAdventureTitle()

	If Leveltimer=0 Then Return

	CameraPick (camera,MouseX(),MouseY())
	
	If LevelTimer=10
		ShowEntity LevelCursor
		EntityAlpha LevelCursor,.5
		;For i=1 To 3
		;	If AdventureTitleSprite(i)>0 Then PositionEntity AdventureTitleSprite(i),-0.75+(i-1)*0.75,-.95,5
		;Next
		PositionEntity AdventureTitleStar,0,0.27,4.7
		PositionEntity AdventureTitleSprite(0),0,-.9+.6*Float(LevelTimer)/100.0,1+3*Float(LevelTimer)/100.0

	EndIf
	If LevelTimer=16
		ShowEntity AdventureTitleStar
	EndIf

	;If LevelTimer<100
		AddParticle(Rand(16,23),PickedX(),PickedY(),PickedZ()-.011,0,0.01,Rnd(-.005,.005),Rnd(-.004,.008),0,5,.001,0,-.00005,0,75,3)
	;EndIf
	;If LevelTimer>100 And LevelTimer<1000000000
	;	AddParticle(Rand(16,23),PickedX(),PickedY(),PickedZ()-.011,0,0.01,Rnd(-.005,.005),Rnd(-.004,.008),0,5,.004,0,-.00005,0,75,3)
	;EndIf
	PositionEntity LevelCursor,PickedX(),PickedY(),PickedZ()
	ScaleEntity LevelCursor,.2,.2,.2
	PointEntity LevelCursor,Camera,(LevelTimer*4) Mod 360
	TurnEntity LevelCursor,90,0,0
	
	ControlParticles()



	PositionTexture AdventureTitleBackgroundTex,(LevelTimer Mod 2000)/2000.0,(LevelTimer Mod 2000)/2000.0
	TurnEntity AdventureTitleStar,0,0,2
	If LevelTimer>15 And LevelTimer<300
		EntityAlpha AdventureTitleBackground,Float(LevelTimer)/300.0
	
	EndIf

	If LevelTimer>15 And LevelTimer<100
		PositionEntity AdventureTitleSprite(0),0,0.2+.6*Float(LevelTimer)/100.0,1+3*Float(LevelTimer)/100.0
		EntityAlpha AdventureTitleSprite(0),Float(LevelTimer)/100.0
		

	EndIf
	If leveltimer<1000
		EntityAlpha AdventureTitleStar,Float(LevelTimer)/1000.0
	;	If leveltimer=199
	;		EntityBlend AdventureTitleStar,3
;
;		EndIf
	EndIf

	
	If LevelTimer<1000000000
		RotateSprite AdventureTitleSprite(0),10*Sin((LevelTimer-100))
		ScaleSprite AdventureTitleSprite(0),0.9+0.1*Sin(LevelTimer Mod 1000000000),.90+0.1*Sin(leveltimer)
	EndIf
	
;	If Leveltimer>200 And LevelTimer<250
;		For i=1 To 3
;			If AdventureTitleSprite(i)>0
;				ScaleSprite AdventureTitleSprite(i),0.006*(Leveltimer-200),0.006*(LevelTImer-200)
;			EndIf
;		Next
;	EndIf
	
	If LevelTimer<1000000000
		col=0
		If Leveltimer>200 And LevelTimer<250
			col=(LevelTimer-200)*5
		Else If LevelTimer>=250
			col=255
		EndIf
;		If LevelTimer>200 
;			DisplayText(AdventureHelpLine$(1),34.4-0.5*Len(AdventureHelpLine$(1)),39.5,0.5,1,col,col,col)
;			DisplayText(AdventureHelpLine$(2),49.5-0.5*Len(AdventureHelpLine$(2)),39.5,0.5,1,col,col,col)
;			DisplayText(AdventureHelpLine$(3),64.8-0.5*Len(AdventureHelpLine$(3)),39.5,0.5,1,col,col,col)
;		EndIf
		
		col=255
		If leveltimer<64
			col=leveltimer*4.0
		EndIf
		If Leveltimer<Len(AdventureTitle$)*5
			DisplayText(Left$(AdventureTitle$,leveltimer/5),25.0/1.5-0.5*Len(AdventureTitle$),8+.2*Sin(leveltimer*2),1.5,1,col,col,0)
		Else 
			DisplayText(AdventureTitle$,25.0/1.5-0.5*Len(AdventureTitle$),8+.2*Sin(leveltimer*2),1.5,1,col,col,0)
		EndIf
		col=255
		If leveltimer<256
			col=leveltimer/1.0
		EndIf
	
		
		For i=0 To 4
			DisplayText(AdventureTextLine$(i),25.0-0.5*Len(AdventureTextLine$(i)),14+i,1,1,col,col,col)
		Next
		
		col=256*2/3
		If leveltimer<512
			col=leveltimer/3.0
		EndIf

		
		;If leveltimer>150 
			DisplayText("(Click To Start The Adventure)",25.0-0.5*30,21,1,1,col,col,0)
		;EndIf
	EndIf


	If (MouseDown(1)=True Or KeyDown(57) Or KeyDown(28) Or KeyDown(156)) And LevelTimer<1000000000 And LevelTimer>40
		LevelTimer=1000000000
	EndIf
	
	If LevelTimer>1000000000
		;For i=0 To 3
		;	If AdventureTitleSprite(i)>0 Then EntityAlpha AdventureTitleSprite(i),0.5-Float(LevelTimer-1000000000)/100.0
		;Next
		EntityBlend AdventureTitleStar,1
		EntityAlpha AdventureTitleStar,0.5-Float(LevelTimer-1000000000)/100.0
		EntityAlpha AdventureTitleBackGround,0.5-Float(LevelTimer-1000000000)/100.0
		EntityAlpha AdventureTitleSprite(0),0.5-Float(LevelTimer-1000000000)/100.0
		
		
		TranslateEntity AdventureTitleSprite(0),0,-.025,-.1


	EndIf
	
	If LevelTimer=1000000050
		For i=0 To 0
			If AdventureTitleSprite(i)>0
				FreeEntity AdventureTitleSprite(i)
				AdventureTitleSprite(i)=0
			EndIf
		;	If AdventureTitleSpriteTex(i)>0
		;		FreeTexture AdventureTitleSpriteTex(i)
		;		AdventureTitleSpriteTex(i)=0
		;	EndIf
		Next
		FreeEntity AdventureTitleBackground
		AdventureTitleBackground=0
	;	FreeTexture AdventureTitleBackgroundTex
	;	FreeEntity AdventureTitleStar
	;	AdventureTitleStar=0
	;	FreeTexture AdventureTitleStarTex
		AdventureTitleStartex=0
		
		GameMode=0
	
		; Start Level 1 and Create Player
		
		StartLevel(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Adventure\"+Str$(AdventureCurrentLevel)+".wlv",False)
		CreatePlayer(AdventureStartX,AdventureStartY)
		MouseGameMode=-2
		
		ResetParticles("data/graphics/particles.bmp")
		ScaleEntity LevelCursor,1,1,1
		RotateEntity LevelCursor,0,0,0
		
		PlaySoundFXNow(Rand(164,168))
		
		; Menu
		CreateIcon(9,0,4,4,"Menu","Open")
		; Rucksack
		If NofInventoryItems>0 Then CreateIcon(8,0,0,1,"Items","Open")
		
		ShowEntity MouseCursor
		MouseCursorVisible=True
	EndIf
	

End Function



Function CameraControls()
	; Camera Controls
	; TurnControl On and Off
	If KeyDown(56) And KeyDown(45) And AltX\KeyPressed=False ; Alt-X
		AltX\KeyPressed=True
		If CameraControl=True
			AltX\InUse=False
		Else
			AltX\InUse=True
		EndIf
	Else
		AltX\KeyPressed=False
	EndIf
	; Use NumPad to Control
	If False
		If KeyDown(75) 
			If AltX\Reset = 0 StoreCameraSettings()
			TranslateEntity Camera,-0.1,0,0
		EndIf
		If KeyDown(77) 
			If AltX\Reset = 0 StoreCameraSettings()
			TranslateEntity Camera,0.1,0,0
		EndIf
		If KeyDown(72) 
			If AltX\Reset = 0 StoreCameraSettings()
			TranslateEntity Camera,0,0,0.1
		EndIf
		If KeyDown(80) 
			If AltX\Reset = 0 StoreCameraSettings()
			TranslateEntity Camera,0,0,-0.1
		EndIf
		If KeyDown(73)
			If AltX\Reset = 0 StoreCameraSettings()
			TranslateEntity Camera,0,0.1,0
		EndIf
		If KeyDown(81)
			If AltX\Reset = 0 StoreCameraSettings()
			TranslateEntity Camera,0,-0.1,0
		EndIf
		If KeyDown(71)
			If AltX\Reset = 0 StoreCameraSettings()
			TurnEntity Camera,1,0,0
		EndIf
		If KeyDown(79)
			If AltX\Reset = 0 StoreCameraSettings()
			TurnEntity Camera,-1,0,0
		EndIf
		If KeyDown(181)
			If AltX\Reset = 0 StoreCameraSettings()
			TurnEntity Camera,0,1,0
		EndIf
		If KeyDown(55)
			If AltX\Reset = 0 StoreCameraSettings()
			TurnEntity Camera,0,-1,0
		EndIf
		If KeyDown(76) And AltX\Reset=1
			RestoreCameraSettings()
		EndIf
		
	EndIf
	
End Function

Function StoreCameraSettings()
	AltX\Reset=1
	AltX\X=EntityX(Camera)
	AltX\Y=EntityY(Camera)
	AltX\Z=EntityZ(Camera)
	AltX\Roll=EntityRoll(Camera)
	AltX\Yaw=EntityYaw(Camera)
	AltX\Pitch=EntityPitch(Camera)
End Function
Function RestoreCameraSettings()
	AltX\Reset=0
	RotateEntity Camera,AltX\Pitch,AltX\Yaw,AltX\Roll
	PositionEntity Camera,AltX\X,AltX\Y,AltX\Z
End Function

Function CheckForNewCompiledLevels(silent)
	If silent=False
		Print "Checking for New Custom Adventures:"
		Print ""
	EndIf
	dirfile=ReadDir(globaldirname$+"\adventures\downloads inbox")
	Repeat
		ex$=NextFile$(dirfile)
		If Upper$(Right$(ex$,4))=".WA2"
		
			ex$=Left$(ex$,Len(ex$)-4)

			; got one - unpack it 
			If silent=False Print "Found: "+ex$
			
			CreateDir Globaldirname$ + "\adventures\current\" + ex$
			dir=ReadDir(globaldirname$+"\adventures\current\"+ex$)
			Repeat
				file$=NextFile(dir)
				If (file$<>"" And (FileType(Globaldirname$+"\adventures\current\"+ex$+"\"+file$)=1))
					DeleteFile globaldirname$+"\adventures\current\"+ex$+"\"+file$
				EndIf
			Until file$=""
			CloseDir dir
			
			file2 = ReadFile(globaldirname$+"\adventures\downloads inbox\"+ex$+".wa2")
			int2 = ReadInt(file2)
			For int3 = 0 To int2-1
				string1$ = ReadString(file2)
				int4 = ReadInt(file2)
				file3 = WriteFile(globaldirname$+"\adventures\current\"+ex$+"\"+string1$)
				For int5=0 To int4-1
					byte1 = ReadByte(file2)
					WriteByte(file3,byte1)
				Next
				CloseFile(file3)
			Next
			CloseFile(file2)
			DeleteFile globaldirname$+"\adventures\downloads inbox\"+ex$+".wa2"
			
		EndIf
		
	Until ex$=""
	
	CloseDir dirfile
	
	
			

End Function

; Level
		



Include "particles.bb"
Include "level.bb"
Include "adventures.bb"
Include "menu.bb"
Include "sound.bb"
Include "preload.bb"