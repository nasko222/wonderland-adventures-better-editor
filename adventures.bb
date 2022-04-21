
Function CreateNewPlayer()
	
	
	
	
	name$=PlayerName$
	; Create the Directory structure
	
	CreateDir GlobalDirName$+"\Player Profiles\"
	CreateDir GlobalDirName$+"\Player Profiles\"+name$
	CreateDir GlobalDirName$+"\Player Profiles\"+name$+"\Current"
	CreateDir GlobalDirName$+"\Player Profiles\"+name$+"\Current\Hub"
	CreateDir GlobalDirName$+"\Player Profiles\"+name$+"\Current\Adventure"
	CreateDir GlobalDirName$+"\Player Profiles\"+name$+"\SaveFiles"

	
	; and make the actual player data file
	file=WriteFile(GlobalDirName$+"\Player Profiles\"+name$+"\Current\playerfile.wpf")
	
	WriteString file,PlayerName$
	WriteString file,PlayerCharacterName$
	WriteInt file, PlayerTextureBody
	WriteInt file,PlayerAcc1
	WriteInt file,PlayerTexAcc1
	WriteInt file,PlayerAcc2
	WriteInt file,PlayerTexAcc2
	WriteFloat file,PlayerSizeX#
	WriteFloat file,PlayerSizeY#
	WriteFloat file,PlayerSizeZ#
	WriteInt file,PlayerVoice
	WriteInt file,PlayerPitch

	
	; save inventory
	WriteInt file,3
	WriteInt file,0	
 
	For i=0 To 99
		WriteInt file,9091
		WriteInt file,-1
		WriteInt file,3
		WriteString file,""
		WriteString file,"Empty"
	Next

	WriteInt file,0
	WriteInt file,0
	WriteInt file,0
	WriteInt file,0
	WriteInt file,0;ShardsAreActive
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	
	WriteInt file,3
	WriteInt file,0
	For i=0 To 99
		WriteInt file,9091
		WriteInt file,-1
		WriteInt file,3
		WriteString file,""
		WriteString file,"Empty"
	Next
	WriteInt file,0
	WriteInt file,0
	WriteInt file,0
	WriteInt file,0
	WriteInt file,0
	WriteInt file,0

	
	WriteInt file,0
	WriteInt file,0

	WriteInt file,future


	
	; Adventure/hub status	
	WriteInt file,0;AdventureCurrentLevel
	WriteInt file,0;AdventureCurrentStatus
	WriteInt file,0;AdventureCurrentNumber
	WriteString file,"";AdventureCurrentName
	
	WriteInt file,0;AdventureExitWonLevel
	WriteInt file,0;AdventureExitWonX
	WriteInt file,0;AdventureExitWonY 
	WriteInt file,0;AdventureExitLostLevel
	WriteInt file,0;AdventureExitLostX
	WriteInt file,0;AdventureExitLostY 

	WriteInt file,0;AdventureGoal	
	For i=0 To 2
		For j=0 To 5
			WriteInt file,0;AdventureWonCommand(i,j)
		Next
	Next

	For i=0 To 499
		WriteInt file,0;AdventureCompleted(i)
		WriteInt file,0;AdventureCompletedTime(i)
		WriteInt file,0;AdventureCompletedGems(i)
		WriteInt file,0;AdventureCompletedGemsTotal(i)
		WriteInt file,0;AdventureCompletedCoins(i)

	Next
	
	WriteInt file,0;NofWeeStinkersInAdventure
	WriteInt file,0;NofWeeStinkersFollowing
	WriteInt file,0;NofWeeStinkersFollowingLast
	WriteInt file,0;NofScrittersInAdventure
	WriteInt file,0;NofGemsInAdventure
	WriteInt file,0;NofBricksInAdventure
	WriteInt file,0;NofFireFlowersInAdventure
	WriteInt file,0;NofCrabsInAdventure
	WriteInt file,0;NofBabyBoomersInAdventure
	WriteInt file,0;NofZBotsInAdventure
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	
	; Other Global Data
	
	WriteInt file,0;PlayerObject
	WriteInt file,0;StinkerObject
	WriteInt file,0;CameraFocusObject
	WriteInt file,0;LevelTimer
	
	WriteInt file,0;PlayerControlMode
	WriteInt file,0;LastPlayerControl
	WriteInt file,0;PlayerTalkToGoalObject
	WriteInt file,0;GameMode
	WriteInt file,0;OldGameMode
	WriteInt file,0;MoveCursorNewTarge
	WriteInt file,0;MouseHeld
	
	WriteInt file,0;DelayCommand
	WriteInt file,0;DelayData1
	WriteInt file,0;DelayData2
	WriteInt file,0;DelayData3
	WriteInt file,0;DelayData4
	
	WriteInt file,0;SpellActive
	WriteInt file,0;CurrentSpell
	WriteInt file,0;CurrentCharm
	WriteInt file,0;CurrentSpellPower
	WriteInt file,0;currentlightpower
	
	

	
	WriteInt file,False ; usedinventoryonce
	WriteInt file,0 ; GlobalGrowFlowerCounter
	WriteInt file,future
	WriteInt file,future

	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future


	WriteString file,Stri$
	WriteString file,Stri$
	WriteString file,Stri$
	WriteString file,Stri$
	WriteString file,Stri$

	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa

	For i=0 To 999
		WriteInt file,0 ;MasterAskAboutActive
	Next

	CloseFile file

	loadplayer(GlobalDirName$+"\Player Profiles\"+name$+"\Current\playerfile.wpf")


End Function

Function StartHubLevel(Level,x,y)

	; Load Hub Level (negative!) and create player at x/y
	; This is used when a HubLevel is first started from e.g. within Menu, or after completed adventure.
	; ... Not for going from HubLevel to HubLevel
	
	
	
	GameMode=0
	AdventureCurrentLevel=Level
	AdventureGoal=0
	AdventureCurrentStatus=0
	AdventureCurrentNumber=0
	
	
	; Start Level 1 and Create Player
	
	
	StartLevel(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\"+Str$(-AdventureCurrentLevel)+".wlv",False)
	CreatePlayer(x,y)
	MouseGameMode=-2
			
	ResetParticles("data/graphics/particles.bmp")
	ScaleEntity LevelCursor,1,1,1
	RotateEntity LevelCursor,0,0,0
	EntityAlpha LevelCursor,.5
			
	
			
	ShowEntity MouseCursor
	MouseCursorVisible=True


End Function

Function StartLevel(name$,complete)

	cameraaddzoom=0.0
	cameraaddx=0.0
	cameraaddy=0.0
	cameraaddz=0.0
	
	RotateEntity Camera,55,0,0

	; Disable any Spells unless loading from currentsaved game
	If Lower$(Right$(name$,13))<>"savelevel.wlv"
		; delete charm
		currentcharm=0
		deleteicon(1)
		

		
		
		; check inventory for gloves
		For j=0 To 99
			If InventoryItem(j)=1001
				InventoryTexture(j)=23
				SpellActive=False 
				CurrentSpell=-1	 
				CurrentSpellPower=0
				DeleteIcon(0)
			EndIf
			
	
		Next
	Else
		If CurrentSpell>=0 And CurrentSpellPower>0
			SpellActive=Not SpellActive
			ToggleSpell()
			
		EndIf
	EndIf	
	ShardHitCounter=0
	ShardLastHit=-1
	
	
	
	 

	LevelTimer=0
	
	EntityAlpha LevelCursor,.5
	EntityAlpha MouseCursor,.8

	For i=0 To 99
		For j=0 To 99
			LevelTileLogic(i,j)=0
			ObjectTileLogic(i,j)=0
		Next
	Next

	
	; Load The Level
	LoadLevel(name$,complete,True)
	
	

	
	SetLight(LightRedGoal,LightGreenGoal,LightBlueGoal,4,AmbientRedGoal,AmbientGreenGoal,AmbientBlueGoal,4)
	
	; check inventory for light
	For j=0 To 99
		If (InventoryItem(j)=2001 Or InventoryItem(j)=2011) 
			If toodark()=True
				
				DeleteIcon(1)
				If InventoryItem(j)=2001
					CreateIcon(1,0,66,2002,"- "+CurrentLightPower+" -","Remove")
					CurrentCharm=1
				Else
					CreateIcon(1,0,67,2012,"Light","Remove")
					CurrentCharm=2
				EndIf
				
			EndIf

		EndIf

	Next
	If (currentcharm=0 Or currentlightpower=0) And toodark()=True
		If Rand(0,100)<10
			MessageLineText1$="It is pitch black."
			MessageLineText2$="You are likely to be eaten by a grue."
			MessageLineTimer=300
		Else

			MessageLineText1$="It is very dark!"
			MessageLineText2$="You need a lamp."
			MessageLineTimer=300
		EndIf
	EndIf

	
	CreateLevel()
	

	; Create the MousePickPlane - needs to be redone each level (different sizes)
	If MousePickPlane>0
		FreeEntity MousePickPlane
		MousePickPlane=0
	EndIf
	MousePickPlane=CreateMesh()
	Surface=CreateSurface(MousePickPlane)
	AddVertex (surface,-10,.05,10)
	AddVertex (surface,LevelWidth+10,.05,10)
	AddVertex (surface,-10,.05,-LevelHeight-10)
	AddVertex (surface,LevelWidth+10,.05,-LevelHeight-10)
	AddTriangle (surface,0,1,2)
	AddTriangle (surface,1,3,2)
	EntityPickMode MousePickPlane,2
	EntityAlpha MousePickPlane,0
	
	
	Playercontrolmode=7
	
	LightRedGoal2=-1
	
	deleteicon(7)
	
	
	
	
	
	If levelmusic<>CurrentMusic And GlobalMusicVolume2>0
		If ChannelPlaying (MusicChannel)=1
			StopChannel (MusicChannel)
		EndIf
		
		MusicChannel=PlayMusic ("data\music\"+levelmusic+".ogg")
		
		ChannelVolume musicchannel,GlobalMusicVolume
		CurrentMusic=levelmusic
	EndIf
	
	
	; Menu
	CreateIcon(9,0,4,4,"Menu","Open")
	; Rucksack
	If NofInventoryItems>0 Or UsedInventoryOnce=True Then CreateIcon(8,0,0,1,"Items","Open")
	
	

	
	
	
End Function

Function Loadlevel(name$,complete,create)

	LevelFormat104=False
	

	; complete=true: also create playercharacter, spellballs, etc (i.e. loaded from a savefile)
	; create=true: actually create the entities (not done if loaded to change e.g. AdventureWonCommand)

	file=ReadFile (name$)
	
	LevelWidth=ReadInt(file)
	
 	LevelHeight=ReadInt(file)
	LevelDetail=4
	
	If LevelWidth>=1000
		LevelFormat104=True
		LevelWidth=LevelWidth-1000
		
	EndIf

	For j=0 To LevelHeight-1
		For i=0 To LevelWidth-1
			LevelTileTexture(i,j)=ReadInt(file)
			LevelTileRotation(i,j)=ReadInt(file)
			LevelTileSideTexture(i,j) =ReadInt(file)
			LevelTileSideRotation(i,j)=ReadInt(file)
			LevelTileRandom#(i,j)=ReadFloat(file)
			LevelTileHeight#(i,j)=ReadFloat(file)
			LevelTileExtrusion#(i,j)=ReadFloat(file)
			LevelTileRounding(i,j)=ReadInt(file)
			LevelTileEdgeRandom(i,j)=ReadInt(file)
			LevelTileLogic(i,j)=ReadInt(file)
			
			ObjectTileLogic(i,j)=0
					
		Next
	Next
	
	
	
	For j=0 To LevelHeight-1
		For i=0 To LevelWidth-1
			WaterTileTexture(i,j)=ReadInt(file)
			WaterTileRotation(i,j)=ReadInt(file)
			WaterTileHeight(i,j)=ReadFloat(file)
			WaterTileTurbulence(i,j)=ReadFloat(file)		
		Next
	Next
	WaterFlow=ReadInt(file)
	WaterTransparent=ReadInt(file)
	WaterGlow=ReadInt(file)
	
	; LEVELTEXTURE
	leveltexturename$=ReadString$(file)
	usecustomleveltexture=False
	If customleveltexture>0
		FreeTexture customleveltexture
		customleveltexture=0
	EndIf
	If custombgtexture1>0
		FreeTexture custombgtexture1
		custombgtexture1=0
	EndIf
	If custombgtexture2>0
		FreeTexture custombgtexture2
		custombgtexture2=0
	EndIf

	If Len(leveltexturename$)<15
		ex$="custom"
	Else
		ex$=Mid$(leveltexturename$,10,Len(leveltexturename$)-9-4)
	EndIf
	If whichleveltexture(ex$)=-1
		; custom texture
		customleveltexture=LoadTexture(globaldirname$+"/custom content/textures/leveltex "+leveltexturename$+".bmp")
		custombgtexture1=LoadTexture(globaldirname$+"/custom content/textures/backgroundtex "+leveltexturename$+"1.bmp")
		custombgtexture2=LoadTexture(globaldirname$+"/custom content/textures/backgroundtex "+leveltexturename$+"2.bmp")
		If customleveltexture=0 Or custombgtexture1=0 Or custombgtexture2=0
			leveltexturename$="leveltex hills.bmp"
		Else
			usecustomleveltexture=True
		EndIf
	EndIf
		
	
	; WATERTEXTURE
	watertexturename$=ReadString$(file)
	usecustomwatertexture=False
	If customwatertexture>0
		FreeTexture customwatertexture
		customwatertexture=0
	EndIf
	
	If WaterTextureName$<>"watertex 1.jpg"
		customwatertexture=LoadTexture(globaldirname$+"/custom content/textures/watertex "+watertexturename$+".jpg")
		If customwatertexture>0 Then usecustomwatertexture=True
	EndIf

	
	
	NofObjects=0
	
	k=ReadInt(file)
	For i=0 To k-1
		LoadObject(file,complete,create)
		
	Next
	
	LevelEdgeStyle=ReadInt(file)
	
	LightRedGoal=ReadInt(file)
	LightGreenGoal=ReadInt(file)
	LightBlueGoal=ReadInt(file)
		
	AmbientRedGoal=ReadInt(file)
	AmbientGreenGoal=ReadInt(file)
	AmbientBlueGoal=ReadInt(file)


	LevelMusic=ReadInt(file)
	LevelWeather=ReadInt(file)
	
	AdventureTitle4Saving$=ReadString$(file)
	
	;WispLight=CreateLight(3)
	;PositionEntity wisplight,15,-10,.5

	
	; end of first-time data
	
	LevelTimer=0
	LevelTimer=ReadInt(file) ; if it's there
	
	
	
	
	; v1.04 - Save/Load the ObjectTileLogic for levels (except for player)
	If Eof(file)=True
		
	Else
		LevelFormat104=True
	
		For j=0 To LevelHeight-1
			For i=0 To LevelWidth-1
				ObjectTileLogic(i,j)=ReadInt(file)
				; delete any players
				If (ObjectTileLogic(i,j) And 2^1) >0
					ObjectTileLogic(i,j)=ObjectTileLogic(i,j)-2^1
				EndIf

			Next
		Next
		
		
		
	EndIf
	
	
	
	
	CloseFile file

End Function

Function EndLevel()
	; clear everything
	
	i=0
	While LevelEntity(i)>0
		
	
		FreeEntity LevelEntity(i)
		FreeEntity WaterEntity(i)
		LevelEntity(i)=0
		WaterEntity(i)=0
		i=i+1
	Wend
	
	If BackGroundEntity1>0
		FreeEntity BackGroundEntity1
		BackGroundEntity1=0
	EndIf
	If BackGroundEntity2>0
		FreeEntity BackGroundEntity2
		BackGroundEntity2=0
	EndIf
	
	
	For i=0 To NofObjects-1
		
	 	FreeEntity ObjectEntity(i)
	
		ObjectEntity(i)=0

		
		FreeTexture ObjectTexture(i)
		ObjectTexture(i)=0
		
	Next
	NofObjects=0
	
	
	
	If MousePickPlane>0
		FreeEntity MousePickPlane
		MousePickPlane=0;
	EndIf
	
	NofParticles=0
	NofParticles2=0
	
	For p.particle = Each particle
		Delete p
	Next
	For p2.particle2 = Each particle2
		Delete p2
	Next

	
	
	
	
	
	
End Function

Function SaveLevel(name$)
	


	file=WriteFile (name$)
	
	WriteInt file,LevelWidth+1000
	
	
	WriteInt file,LevelHeight
	For j=0 To LevelHeight-1
		For i=0 To LevelWidth-1
			WriteInt file,LevelTileTexture(i,j) ; corresponding to squares in LevelTexture
			WriteInt file,LevelTileRotation(i,j) ; 0-3 , and 4-7 for "flipped"
			WriteInt file,LevelTileSideTexture(i,j) ; texture for extrusion walls
			WriteInt file,LevelTileSideRotation(i,j) ; 0-3 , and 4-7 for "flipped"
			WriteFloat file,LevelTileRandom#(i,j) ; random height pertubation of tile
			WriteFloat file,LevelTileHeight#(i,j) ; height of "center" - e.g. to make ditches and hills
			WriteFloat file,LevelTileExtrusion#(i,j); extrusion with walls around it 
			WriteInt file,LevelTileRounding(i,j); 0-no, 1-yes: are floors rounded if on a drop-off corner
			WriteInt file,LevelTileEdgeRandom(i,j); 0-no, 1-yes: are edges rippled
			WriteInt file,LevelTileLogic(i,j)
			
			
		Next
	Next
	
	For j=0 To LevelHeight-1
		For i=0 To LevelWidth-1
			WriteInt file,WaterTileTexture(i,j)
			WriteInt file,WaterTileRotation(i,j)
			WriteFloat file,WaterTileHeight(i,j)
			WriteFloat file,WaterTileTurbulence(i,j)
		Next
	Next
	
	; Globals
	WriteInt file,WaterFlow
	WriteInt file,WaterTransparent
	WriteInt file,WaterGlow
	
	WriteString file,LevelTextureName$
	WriteString file,WaterTextureName$
	
	; Objects
	
	
	
	WriteInt file,NofObjects
	For i=0 To NofObjects-1
		Dest=i
		
		WriteString file,ObjectModelName$(Dest)
		WriteString file,ObjectTextureName$(Dest)
		WriteFloat file,ObjectXScale(Dest)
		WriteFloat file,ObjectYScale(Dest)
		WriteFloat file,ObjectZScale(Dest)
		WriteFloat file,ObjectXAdjust(Dest)
		WriteFloat file,ObjectYAdjust(Dest)
		WriteFloat file,ObjectZAdjust(Dest)
		WriteFloat file,ObjectPitchAdjust(Dest)
		WriteFloat file,ObjectYawAdjust(Dest)
		WriteFloat file,ObjectRollAdjust(Dest)
	
		WriteFloat file,ObjectX(Dest)
		WriteFloat file,ObjectY(Dest)
		WriteFloat file,ObjectZ(Dest)
		WriteFloat file,ObjectOldX(Dest)
		WriteFloat file,ObjectOldY(Dest)
		WriteFloat file,ObjectOldZ(Dest)
		WriteFloat file,ObjectDX(Dest)
		WriteFloat file,ObjectDY(Dest)
		WriteFloat file,ObjectDZ(Dest)
	
		WriteFloat file,ObjectPitch(Dest)
		WriteFloat file,ObjectYaw(Dest)
		WriteFloat file,ObjectRoll(Dest)
		WriteFloat file,ObjectPitch2(Dest)
		WriteFloat file,ObjectYaw2(Dest)
		WriteFloat file,ObjectRoll2(Dest)

		WriteFloat file,ObjectXGoal(Dest)
		WriteFloat file,ObjectYGoal(Dest)
		WriteFloat file,ObjectZGoal(Dest)
	
		WriteInt file,ObjectMovementType(Dest)
		WriteInt file,ObjectMovementTypeData(Dest)
		WriteFloat file,ObjectSpeed(Dest)
		WriteFloat file,ObjectRadius(Dest)
		WriteInt file,ObjectRadiusType(Dest)
	
		WriteInt file,ObjectData10(Dest)
	
		WriteFloat file,ObjectPushDX(Dest)
		WriteFloat file,ObjectPushDY(Dest)
	
		WriteInt file,ObjectAttackPower(Dest)
		WriteInt file,ObjectDefensePower(Dest)
		WriteInt file,ObjectDestructionType(Dest)
	
		WriteInt file,ObjectID(Dest)
		WriteInt file,ObjectType(Dest)
		WriteInt file,ObjectSubType(Dest)
	
		WriteInt file,ObjectActive(Dest)
		WriteInt file,ObjectLastActive(Dest)
		WriteInt file,ObjectActivationType(Dest)
		WriteInt file,ObjectActivationSpeed(Dest)
	
		WriteInt file,ObjectStatus(Dest)
		WriteInt file,ObjectTimer(Dest)
		WriteInt file,ObjectTimerMax1(Dest)
		WriteInt file,ObjectTimerMax2(Dest)
	
		WriteInt file,ObjectTeleportable(Dest)
		WriteInt file,ObjectButtonPush(Dest)
		WriteInt file,ObjectWaterReact(Dest)
	
		WriteInt file,ObjectTelekinesisable(Dest)
		WriteInt file,ObjectFreezable(Dest)
	
		WriteInt file,ObjectReactive(Dest)

		WriteInt file,ObjectChild(Dest)
		WriteInt file,ObjectParent(Dest)
	
		For k=0 To 9
			WriteInt file,ObjectData(Dest,k)
		Next
		For k=0 To 3
			WriteString file,ObjectTextData(Dest,k)
		Next
		
		WriteInt file,ObjectTalkable(Dest)
		WriteInt file,ObjectCurrentAnim(Dest)
		WriteInt file,ObjectStandardAnim(Dest)
		WriteInt file,ObjectTileX(Dest)
		WriteInt file,ObjectTileY(Dest)
		WriteInt file,ObjectTileX2(Dest)
		WriteInt file,ObjectTileY2(Dest)
		WriteInt file,ObjectMovementTimer(Dest)
		WriteInt file,ObjectMovementSpeed(Dest)
		WriteInt file,ObjectMoveXGoal(Dest)
		WriteInt file,ObjectMoveYGoal(Dest)
		WriteInt file,ObjectTileTypeCollision(Dest)
		WriteInt file,ObjectObjectTypeCollision(Dest)
		WriteInt file,ObjectCaged(Dest)
		WriteInt file,ObjectDead(Dest)
		WriteInt file,ObjectDeadTimer(Dest)
		WriteInt file,ObjectExclamation(Dest)
		WriteInt file,ObjectShadow(Dest)
		WriteInt file,ObjectLinked(Dest)
		WriteInt file,ObjectLinkBack(Dest)
		WriteInt file,ObjectFlying(Dest)
		WriteInt file,ObjectFrozen(Dest)
		WriteInt file,ObjectFutureInt23(Dest)
		WriteInt file,ObjectFutureInt24(Dest)
		WriteInt file,ObjectFutureInt25(Dest)
		WriteFloat file,ObjectScaleAdjust(Dest)
		WriteFloat file,ObjectScaleXAdjust(Dest)
		WriteFloat file,ObjectScaleYAdjust(Dest)
		WriteFloat file,ObjectScaleZAdjust(Dest)
		WriteFloat file,ObjectFutureFloat5(Dest)
		WriteFloat file,ObjectFutureFloat6(Dest)
		WriteFloat file,ObjectFutureFloat7(Dest)
		WriteFloat file,ObjectFutureFloat8(Dest)
		WriteFloat file,ObjectFutureFloat9(Dest)
		WriteFloat file,ObjectFutureFloat10(Dest)
		WriteString file,ObjectFutureString1$(Dest)
		WriteString file,ObjectFutureString2$(Dest)
		
		For k=0 To 30
			WriteString file,"BLA"
		Next
		


	Next
	
	WriteInt file,LevelEdgeStyle

	; The Rest is "extra" data, i.e. stuff that is changed from the original level file
	
	; Lights
	WriteInt file,LightRedGoal2
	WriteInt file,LightGreenGoal2
	WriteInt file,LightBlueGoal2
	
	WriteInt file,AmbientRedGoal2
	WriteInt file,AmbientGreenGoal2
	WriteInt file,AmbientBlueGoal2


	WriteInt file,LevelMusic
	WriteInt file,LevelWeather
	
	WriteString file,adventuretitle4saving$

	If LevelTimer<1000000000
		WriteInt file,LevelTimer
	Else 
		WriteInt file,0
	EndIf
	
	
	;v1.04 data
	For j=0 To LevelHeight-1
		For i=0 To LevelWidth-1
			WriteInt file,ObjectTileLogic(i,j)
		Next
	Next
	
	CloseFile file
	
	

End Function




Function LoadPlayer(name$)


	

	file=ReadFile(name$)
	
	
	
	PlayerName$=ReadString$(file)
	PlayerCharacterName$=ReadString$(file)
	
	PlayerTextureBody=ReadInt(file)
	PlayerAcc1=ReadInt(file)
	PlayerTexAcc1=ReadInt(file)
	PlayerAcc2=ReadInt(file)
	PlayerTexAcc2=ReadInt(file)
	PlayerSizeX#=ReadFloat(file)
	PlayerSizeY#=ReadFloat(file)
	PlayerSizeZ#=ReadFloat(file)
	PlayerVoice=ReadInt(file)
	PlayerPitch=ReadInt(File)


	
	; save inventory
	InventorySize=ReadInt(file)
	NofInventoryItems=ReadInt(file)
	For i=0 To 99
		InventoryItem(i)=ReadInt(file)
		InventoryID(i)=ReadInt(file)
		InventoryTexture(i)=ReadInt(file)
		InventorySubText$(i)=ReadString$(file)
		InventoryHelpText$(i)=ReadString$(file)
	Next
	Playercoins=ReadInt(file)
	PlayerCoinsCollected=ReadInt(file)
	PlayerStars=ReadInt(file)
	
	PlayerScore=ReadInt(file)
	ShardsAreActive=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)

	InventorySizeB4=ReadInt(file)
	NofInventoryItemsB4=ReadInt(file)
	For i=0 To 99
		InventoryItemB4(i)=ReadInt(file)
		InventoryIDB4(i)=ReadInt(file)
		InventoryTextureB4(i)=ReadInt(file)
		InventorySubTextB4$(i)=ReadString$(file)
		InventoryHelpTextB4$(i)=ReadString$(file)
	Next
	PlayerCoinsB4=ReadInt(file)
	PlayerCoinsCollectedB4=ReadInt(file)
	PlayerStarsB4=ReadInt(file)
	PlayerScoreB4=ReadInt(file)
	LightPowerB4=ReadInt(file)
	
	CurrentAdventureGems=ReadInt(file)
	CurrentAdventureCoins=ReadInt(file)
	CurrentAdventureTime=ReadInt(file)
	CurrentAdventureScore=ReadInt(file)


	future=ReadInt(file)


	
	; Adventure/hub status	
	AdventureCurrentLevel=ReadInt(file)
	AdventureCurrentStatus=ReadInt(file)
	AdventureCurrentNumber=ReadInt(file)
	AdventureCurrentName$=ReadString$(file)
	
	AdventureExitWonLevel=ReadInt(file)
	AdventureExitWonX=ReadInt(file)
	AdventureExitWonY =ReadInt(file)
	AdventureExitLostLevel=ReadInt(file)
	AdventureExitLostX=ReadInt(file)
	AdventureExitLostY=ReadInt(file) 

	AdventureGoal=ReadInt(file)
	For i=0 To 2
		For j=0 To 5
			AdventureWonCommand(i,j)=ReadInt(file)
		Next
	Next

	For i=0 To 499
		AdventureCompleted(i)=ReadInt(file)
		AdventureCompletedTime(i)=ReadInt(file)
		AdventureCompletedGems(i)=ReadInt(file)
		AdventureCompletedGemsTotal(i)=ReadInt(file)
		AdventureCompletedCoins(i)=ReadInt(file)
		AdventureCompletedCoinsTotal(i)=ReadInt(file)
		AdventureCompletedScore(i)=ReadInt(file)
	Next
	
	
		
	
	NofWeeStinkersInAdventure=ReadInt(file)
	NofWeeStinkersFollowing=ReadInt(file)
	NofWeeStinkersFollowingLast=ReadInt(file)
	NofScrittersInAdventure=ReadInt(file)
	NofGemsInAdventure=ReadInt(file)
	NofBricksInAdventure=ReadInt(file)
	NofFireFlowersInAdventure=ReadInt(file)
	NofCrabsInAdventure=ReadInt(file)
	NofBabyBoomersInAdventure=ReadInt(file)
	NofZBotsInAdventure=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	
	; GLobal Data
	PlayerObject=ReadInt(file)
	StinkerObject=ReadInt(file)
	CameraFocusObject=ReadInt(file)
	LevelTimer=ReadInt(file)
	
	PlayerControlMode=ReadInt(file)
	LastPlayerControl=ReadInt(file)
	PlayerTalkToGoalObject=ReadInt(file)
	GameMode=ReadInt(file)
	OldGameMode=ReadInt(file)
	MoveCursorNewTarge=ReadInt(file)
	MouseHeld=ReadInt(file)
	
	DelayCommand=ReadInt(file)
	DelayData1=ReadInt(file)
	DelayData2=ReadInt(file)
	DelayData3=ReadInt(file)
	DelayData4=ReadInt(file)
	
	SpellActive=ReadInt(file)
	CurrentSpell=ReadInt(file)
	CurrentCharm=ReadInt(file)
	CurrentSpellPower=ReadInt(file)
	CurrentLightPower=ReadInt(file)
	
	
	
	UsedInventoryOnce=ReadInt(file)
	GlobalGrowFlowerCounter=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	future=ReadInt(file)
	

	Stri$=ReadString$(file)
	Stri$=ReadString$(file)
	Stri$=ReadString$(file)
	Stri$=ReadString$(file)
	Stri$=ReadString$(file)

	floa=ReadFloat(file)
	floa=ReadFloat(file)
	floa=ReadFloat(file)
	floa=ReadFloat(file)
	floa=ReadFloat(file)
	floa=ReadFloat(file)
	floa=ReadFloat(file)
	floa=ReadFloat(file)
	floa=ReadFloat(file)
	floa=ReadFloat(file)
	
	For i=0 To 999
		MasterAskAboutActive(i)=ReadInt(file)
	Next
	
	CurrentReplayAdventure=ReadInt(file)

	CloseFile file
	
	; load voice
	
	Restore SoundFXNames
	For i=0 To 159
		Read a$
		
	Next
	For i=160 To 199
	Read a$
		If a$<>"---"
			;Print a$
			If SoundFX(i)>0 FreeSound SoundFX(i)
			soundfx(i)=0
			
			SoundFX(i)=myLoadSound("data\sound\voices\"+Str$(playervoice)+"\"+a$+".wav")
			
			
		EndIf

	Next

	TimeOfLastGameSaved=MilliSecs()
	
	


End Function

Function SavePlayer(name$)

	file=WriteFile(name$)
	
	WriteString file,PlayerName$
	WriteString file,PlayerCharacterName$
	
	WriteInt file, PlayerTextureBody
	WriteInt file,PlayerAcc1
	WriteInt file,PlayerTexAcc1
	WriteInt file,PlayerAcc2
	WriteInt file,PlayerTexAcc2
	WriteFloat file,PlayerSizeX#
	WriteFloat file,PlayerSizeY#
	WriteFloat file,PlayerSizeZ#
	WriteInt file,PlayerVoice
	WriteInt file,PlayerPitch

	
	; save inventory
	WriteInt file,InventorySize
	WriteInt file,NofInventoryItems
	For i=0 To 99
		WriteInt file,InventoryItem(i)
		WriteInt file,InventoryID(i)
		WriteInt file,InventoryTexture(i)
		WriteString file,InventorySubText$(i)
		WriteString file,InventoryHelpText$(i)
	Next
	
	WriteInt file,Playercoins
	WriteInt file,PlayerCoinsCollected
	WriteInt file,Playerstars

	WriteInt file,PlayerScore
	WriteInt file,ShardsAreActive
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	
	WriteInt file,InventorySizeB4
	WriteInt file,NofInventoryItemsB4
	For i=0 To 99
		WriteInt file,InventoryItemB4(i)
		WriteInt file,InventoryIDB4(i)
		WriteInt file,InventoryTextureB4(i)
		WriteString file,InventorySubTextB4$(i)
		WriteString file,InventoryHelpTextB4$(i)
	Next
	WriteInt file,PlayerCoinsB4
	WriteInt file,PlayerCoinsCollectedB4
	WriteInt file,PlayerStarsB4
	WriteInt file,PlayerScoreB4
	WriteInt file,LightPowerB4

	WriteInt file,CurrentAdventureGems
	WriteInt file,CurrentAdventureCoins
	WriteInt file,CurrentAdventureTime
	WriteInt file,CurrentAdventureScore
	WriteInt file,future


	
	; Adventure/hub status	
	WriteInt file,AdventureCurrentLevel
	WriteInt file,AdventureCurrentStatus
	WriteInt file,AdventureCurrentNumber
	WriteString file,AdventureCurrentName$
	
	WriteInt file,AdventureExitWonLevel
	WriteInt file,AdventureExitWonX
	WriteInt file,AdventureExitWonY 
	WriteInt file,AdventureExitLostLevel
	WriteInt file,AdventureExitLostX
	WriteInt file,AdventureExitLostY 

	WriteInt file,AdventureGoal	
	For i=0 To 2
		For j=0 To 5
			WriteInt file,AdventureWonCommand(i,j)
		Next
	Next

	For i=0 To 499
		WriteInt file,AdventureCompleted(i)
		WriteInt file,AdventureCompletedTime(i)
		WriteInt file,AdventureCompletedGems(i)
		WriteInt file,AdventureCompletedGemsTotal(i)
		WriteInt file,AdventureCompletedCoins(i)
		WriteInt file,AdventureCompletedCoinsTotal(i)
		WriteInt file,AdventureCompletedScore(i)
	Next
	
	WriteInt file,NofWeeStinkersInAdventure
	WriteInt file,NofWeeStinkersFollowing
	WriteInt file,NofWeeStinkersFollowingLast
	WriteInt file,NofScrittersInAdventure
	WriteInt file,NofGemsInAdventure
	WriteInt file,NofBricksInAdventure
	WriteInt file,NofFireFlowersInAdventure
	WriteInt file,NofCrabsInAdventure
	WriteInt file,NofBabyBoomersInAdventure
	WriteInt file,NofZBotsInAdventure
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	
	; Other Global Data
	
	WriteInt file,PlayerObject
	WriteInt file,StinkerObject
	WriteInt file,CameraFocusObject
	WriteInt file,LevelTimer
	
	WriteInt file,PlayerControlMode
	WriteInt file,LastPlayerControl
	WriteInt file,PlayerTalkToGoalObject
	WriteInt file,GameMode
	WriteInt file,OldGameMode
	WriteInt file,MoveCursorNewTarge
	WriteInt file,MouseHeld
	
	WriteInt file,DelayCommand
	WriteInt file,DelayData1
	WriteInt file,DelayData2
	WriteInt file,DelayData3
	WriteInt file,DelayData4
	
	WriteInt file,SpellActive
	WriteInt file,CurrentSpell
	WriteInt file,CurrentCharm
	WriteInt file,CurrentSpellPower
	WriteInt file,CurrentLightPower
	
	WriteInt file,UsedInventoryOnce
	WriteInt file,GlobalGrowFlowerCounter
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future
	WriteInt file,future

	WriteString file,Stri$
	WriteString file,Stri$
	WriteString file,Stri$
	WriteString file,Stri$
	WriteString file,Stri$

	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa
	WriteFloat file,floa


	For i=0 To 999
		WriteInt file,MasterAskAboutActive(i)
	Next
	
	WriteInt file,CurrentReplayAdventure
	CloseFile file
	
	; Inventory
	


	

End Function

Function SaveGame(savedgame,datetime$,levelname$)

	
	; create dir if necessary
	If FileType (GlobalDirName$+"\Player Profiles\"+playername$+"\SaveFiles\"+Str$(savedgame))=0
		CreateDir GlobalDirName$+"\Player Profiles\"+playername$+"\SaveFiles\"+Str$(savedgame)
	Else
		; erase current dir
			
		dir=ReadDir(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame))
		Repeat
			dirfile$=NextFile$(dir)
			If FileType(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\"+dirfile$)=1
				DeleteFile GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\"+dirfile$
			EndIf
		Until dirfile$=""
		CloseDir dir
		
		If FileType(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\Hub")=2
			dir=ReadDir(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\Hub")
			Repeat
				dirfile$=NextFile$(dir)
				If FileType(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\Hub\"+dirfile$)=1
					DeleteFile GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\Hub\"+dirfile$
				EndIf
			Until dirfile$=""
			CloseDir dir
		EndIf
		If FileType(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\Adventure")=2
			dir=ReadDir(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\Adventure")
			Repeat
				dirfile$=NextFile$(dir)
				If FileType(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\Adventure\"+dirfile$)=1
					DeleteFile GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\Adventure\"+dirfile$
				EndIf
			Until dirfile$=""
			CloseDir dir
		EndIf




	EndIf
	
	
	screenshotnumber=MilliSecs()
	; create datetime/levelname file
	file = WriteFile(GlobalDirName$+"\Player Profiles\"+playername$+"\SaveFiles\"+Str$(savedgame)+"\wla") 
	WriteString file,datetime$
	WriteString file,levelname$
	WriteInt file,Screenshotnumber
	CloseFile file
	
	; create screenshot
	If GfXWidth>2048
		sssize#=2048.0
	Else
		sssize#=Float(GfxWidth)
	EndIf
		
	ScaleImage SaveSlotImage2,256.0/sssize,256.0/sssize
		
	SetBuffer ImageBuffer(SaveSlotImage)
	DrawImageRect SaveSlotImage2,0,0,0,0,256,256
		
	SetBuffer BackBuffer()
			
	SaveBuffer (ImageBuffer(SaveSlotImage),GlobalDirName$+"\Player Profiles\"+playername$+"\SaveFiles\"+Str$(savedgame)+"\"+screenshotnumber+".bmp")
	


	; Copy Hub
	CreateDir GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\Hub"
	dir=ReadDir(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\Current\Hub")
	Repeat
		dirfile$=NextFile$(dir)
		If FileType(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\Current\Hub\"+dirfile$)=1
			CopyFile GlobalDirName$+"\Player Profiles\"+PlayerName$+"\Current\Hub\"+dirfile$,GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\Hub\"+dirfile$
		EndIf

	Until dirfile$=""
	CloseDir dir
	
	; Copy current Adventure
	CreateDir GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\Adventure"
	dir=ReadDir(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\Current\Adventure")
	If dir>0
		Repeat
			dirfile$=NextFile$(dir)
			If FileType(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\Current\Adventure\"+dirfile$)=1
				CopyFile GlobalDirName$+"\Player Profiles\"+PlayerName$+"\Current\Adventure\"+dirfile$,GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\Adventure\"+dirfile$
			EndIf
		Until dirfile$=""
		CloseDir dir
	EndIf

	; and the current level we're in	
	
	SaveLevel(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\savelevel.wlv")
	
	
	

	SavePlayer(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\playerfile.wpf")
	
End Function

Function LoadGame(savedgame)

	EndLevel()
	
	For x=1 To NofHubs
		y=ReadDir(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+savedgame+"\Hub")
		Repeat
			z$=NextFile(y)
			If FileType(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+savedgame+"\Hub\"+z$)=1 Then
				CopyFile globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+savedgame+"\Hub\"+z$,globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+z$
			EndIf
		Until z$=""
		CloseDir y
	Next
	
	y=ReadDir(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+savedgame+"\Adventure")
	Repeat
		z$=NextFile(y)
		If FileType(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+savedgame+"\Adventure\"+z$)=1 Then
			CopyFile globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+savedgame+"\Adventure\"+z$,globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+z$
		EndIf
	Until z$=""
	CloseDir y
	
	LoadPlayer(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\playerfile.wpf")
	StartLevel(GlobalDirName$+"\Player Profiles\"+PlayerName$+"\SaveFiles\"+Str$(savedgame)+"\savelevel.wlv",True)
	file = ReadFile(GlobalDirName$+"\Player Profiles\"+playername$+"\SaveFiles\"+Str$(savedgame)+"\wla") 
		adventuretoplaz$=ReadString$(file)
		
	CloseFile file
	
	If CurrentSpell>=0
		CreateIcon(0,0,16+CurrentSpell,1002+CurrentSpell,"- "+Str$(currentspellpower)+"-","Activate")
	EndIf
	
	If CurrentSpell=0 And CurrentSpellPower=0 Then DeleteIcon(0)
	
	If currentcharm=0 Then DeleteIcon(1)
	
	GameMode=0
	
	CameraFogMode camera,0
	CameraClsColor camera,0,0,0
	CameraFogColor camera,0,0,0
	CameraFogRange camera,200,1000
	CameraRange camera,0.1,1000
	EntityAlpha levelcursor,0.5
	
End Function

Function StartAdventure(AdventureName$,Status,Number)

	For i=0 To 79
		deleteicon(i)
	Next
	
	AdventureCurrentName$=AdventureName$
	AdventureCurrentStatus=Status
	AdventureCurrentNumber=Number
	

	CurrentAdventureGems=0
	CurrentAdventureCoins=0
	CurrentAdventureTime=MilliSecs()
	CurrentAdventureScore=0
	AdventureCompletedGemsTotal(AdventureCurrentNumber)=0
	AdventureCompletedCoinsTotal(AdventureCurrentNumber)=0
	
	; if custom adventure - clean player data and give some items
	If Status=2
		usedinventoryonce=False
		InventorySize=3
		NofInventoryItems=0

		For i=0 To 99
			InventoryItem(i)=9091
			InventoryID(i)=-1
			InventoryTexture(i)=3
			InventorySubText$(i)=""
			InventoryHelpText$(i)="Empty"
		Next
		PlayerCoins=0
		PlayerCoinsCollected=0
		PlayerStars=0
		PlayerScore=0
		CurrentLightpower=0
		future=0
	EndIf
	
	InventorySizeB4=InventorySize
	NofInventoryItemsB4=NofInventoryItems
	For i=0 To 99
		InventoryItemB4(i)=InventoryItem(i)
		InventoryIDB4(i)=InventoryID(i)
		InventoryTextureB4(i)=InventoryTexture(i)
		InventorySubTextB4$(i)=InventorySubText$(i)
		InventoryHelpTextB4$(i)=InventoryHelpText$(i)
	Next
	PlayerCoinsB4=PlayerCoins
	PlayerCoinsCollectedB4=PlayerCoinsCollected
	PlayerStarsB4=PlayerStars
	PlayerScoreB4=PlayerScore
	LightPowerB4=CurrentLightPower
	futureB4=future
	futureB4=future
	futureB4=future
	futureB4=future
	futureB4=future


	
	; Now Copy Load
	; delete old current adventure directory
	dir=ReadDir (GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Adventure\")
	Repeat
		dirfile$=NextFile$(dir)
		If dirfile$<>"" And dirfile$<>"." And dirfile$<>".."
			DeleteFile  GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Adventure\"+dirfile$
		EndIf
	Until dirfile$=""
	CloseDir dir

	
	; copy all data from master record into the temp player dir
	dir=ReadDir (adventurename$)
	Repeat
		dirfile$=NextFile$(dir)
		If FileType(Adventurename$+"\"+dirfile$)=1 And Upper$(Right$(dirfile$,6))<>".SCORE"
			CopyFile Adventurename$+"\"+dirfile$,GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Adventure\"+dirfile$
		EndIf
	Until dirfile$=""
	CloseDir dir
	
	; if it's a custom adventure - check if player's highscores exist
	If AdventureCurrentStatus=2
		If FileType(AdventureCurrentName$+"\"+PlayerName$+".score")=1
			;yes
			file=ReadFile(AdventureCurrentName$+"\"+PlayerName$+".score")
			AdventureCompleted(0)=ReadInt(file)
			AdventureCompletedTime(0)=ReadInt(file)
			AdventureCompletedGems(0)=ReadInt(file)
			AdventureCompletedGemsTotal(0)=ReadInt(file)
			AdventureCompletedCoins(0)=ReadInt(file)
			AdventureCompletedCoinsTotal(0)=ReadInt(file)
			AdventureCompletedScore(0)=ReadInt(file)
			CloseFile(file)

		Else
			;no
			AdventureCompleted(0)=0
			AdventureCompletedTime(0)=0
			AdventureCompletedGems(0)=0
			;AdventureCompletedGemsTotal(0)=0
			AdventureCompletedCoins(0)=0
			;AdventureCompletedCoinsTotal(0)=0
			AdventureCompletedScore(0)=0
		EndIf
	EndIf
	
	AnalyzeAdventure()

			
	; get the master file
	file=ReadFile (GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Adventure\master.dat")
	adventuretitle$=ReadString$(file)
	For i=0 To 4
		adventuretextline$(i)=ReadString$(file)
	Next
	ex$=ReadString$(file); adventureusername$ - don't think we need this
	IconName$=ReadString$(file)
	ex$=ReadString$(file)
	ex$=ReadString$(file)
	ex$=ReadString$(file)
	ex$=ReadString$(file)
	ex$=ReadString$(file)
	
			
	AdventureExitWonLevel=ReadInt(file)
	AdventureExitWonX=ReadInt(file)
	AdventureExitWonY =ReadInt(file); at what hub level and x/y do you reappear if won.
	AdventureExitLostLevel=ReadInt(file)
	AdventureExitLostX=ReadInt(file)
	AdventureExitLostY =ReadInt(file); at what hub level and x/y do you reappear if won.

	AdventureGoal=ReadInt(file)	

	For i=0 To 2
		For j=0 To 5
			AdventureWonCommand(i,j)=ReadInt(file)
		Next
	Next
	
	adventurestartx=ReadInt(file)
	adventurestarty=ReadInt(file)
	
	CloseFile file	
	
	
	AdventureCurrentLevel=1
	
	
	
	
	
	; Load Custom Icons

	FreeTexture icontexturecustom
	icontexturecustom=0
	
	If FileType(GlobalDirName$+"\Custom Content\Icons\icons "+iconname$+".bmp")=1
		IconTextureCustom=LoadTexture(GlobalDirName$+"\Custom Content\Icons\icons "+iconname$+".bmp",4)
	Else
		IconTextureCustom=myLoadTexture("data\Graphics\icons-custom.bmp",4)
	EndIf
	If icontexturecustom=0
		IconTextureCustom=myLoadTexture("data\Graphics\icons-custom.bmp",4)
	EndIf

	
	
	
	SetLightNow(255,255,255,100,100,100)
	GameMode=10
	LevelTimer=0
	AdventureTimer=0
	
	If AdventureTitleBackground>0 FreeEntity AdventureTitleBackground
	
	AdventureTitleBackground=CreatePlane(4,Camera)
	EntityPickMode AdventureTitleBackground,2
	ScaleEntity AdventureTitleBackground,2,2,2
	RotateEntity AdventureTitleBackground,-90,0,0
	PositionEntity AdventureTitleBackground,0,0,5.01
	EntityAlpha AdventureTitleBackground,0
	EntityOrder AdventureTitleBackground,100
	EntityTexture AdventureTitleBackground,AdventureTitleBackgroundTex
	
	If AdventureTitleSprite(0)>0 Then FreeEntity AdventureTitleSprite(0)
	AdventureTitleSprite(0)=CreateSprite(camera)
	
	PositionEntity AdventureTitleSprite(0),0,0,0
	EntityAlpha AdventureTitleSprite(0),0
	
	
	EntityTexture AdventureTitleSprite(0),AdventureStartLogoTex
	
	
		
	RotateEntity AdventureTitleStar,-100,0,0
	ScaleEntity AdventureTitleStar,.28,.28,.28
	EntityAlpha AdventureTitleStar,0
	HideEntity AdventureTitleStar
	EntityBlend AdventureTitleStar,3
	
	EntityTexture AdventureTitleStar,AdventureTitleStarTex1
	
	HideEntity MouseCursor
	MouseCursorVisible=False

	VertexTexCoords GetSurface(LevelCursor,1),0,0,0
	VertexTexCoords GetSurface(LevelCursor,1),1,0.25,0
	VertexTexCoords GetSurface(LevelCursor,1),2,0,0.25
	VertexTexCoords GetSurface(LevelCursor,1),3,0.25,0.25
	VertexColor GetSurface(LevelCursor,1),0,255,255,255
	VertexColor GetSurface(LevelCursor,1),1,255,255,255
	VertexColor GetSurface(LevelCursor,1),2,255,255,255
	VertexColor GetSurface(LevelCursor,1),3,255,255,255


	ResetParticles("data\graphics\particles.bmp")
	
	
	; replay level? clean out inventory
		
	If currentreplayadventure=delaydata1 And delaydata1>0
		j=0
		For i=0 To NofInventoryItems-1
			; keep only lamp/glowgem, spy-eye, glove
			If inventoryitem(i)<>1001 And inventoryitem(i)<>2001 And inventoryitem(i)<>2011 And inventoryitem(i)<>2021  
				InventoryItem(i)=9091 ; empty
				InventoryID(i)=-1
				InventoryTexture(i)=3
				InventorySubText$(i)=""
				INventoryHelpText$(i)="Empty"
				j=j+1
			EndIf
		Next
		nofinventoryitems=nofinventoryitems-1
	EndIf

End Function

Function AnalyzeAdventure()

	; goes through all the adventure level files to figure out the main adventure variables:
	;
	; NofWeeStinkersInAdventure,	NofScrittersInAdventure
	
	NofWeeStinkersInAdventure=0
	NofScrittersInAdventure=0
	NofGemsInAdventure=0
	NofBricksInAdventure=0
	NofFireFlowersInAdventure=0
	NofCrabsInAdventure=0
	NofBabyBoomersInAdventure=0
	NofZBotsInAdventure=0
	NofZBotNPCsInAdventure=0
	
	AdventureCompletedCoinsTotal(AdventureCurrentNumber)=0
	AdventureCompletedGemsTotal(AdventureCurrentNumber)=0
	
	
	For level=1 To 99
		If FileType (GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Adventure\"+Str$(level)+".wlv")=1
			
			; open each "wlv" file
			file=ReadFile (GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Adventure\"+Str$(level)+".wlv")
			x=ReadInt(file)
			y=ReadInt(file)
			For j=0 To y-1
				For i=0 To x-1
					a=ReadInt(file)
					a=ReadInt(file)
					a =ReadInt(file)
					a=ReadInt(file)
					b=ReadFloat(file)
					b=ReadFloat(file)
					b=ReadFloat(file)
					a=ReadInt(file)
					a=ReadInt(file)
					a=ReadInt(file)
				Next
			Next
			For j=0 To y-1
				For i=0 To x-1
					a=ReadInt(file)
					a=ReadInt(file)
					b=ReadFloat(file)
					b=ReadFloat(file)		
				Next
			Next
			a=ReadInt(file)
			a=ReadInt(file)
			a=ReadInt(file)
			c$=ReadString$(file)
			c$=ReadString$(file)
			
			
			k=ReadInt(file) ; nofobjetcs
			For i=0 To k-1
				
				For j=1 To 2
					c$=ReadString$(file)
				Next
				For j=1 To 27
					b=ReadFloat(file)
				Next
				a=ReadInt(file)
				a=ReadInt(file) 
				b=ReadFloat(file)
				b=ReadFloat(file)
				a=ReadInt(file)
				a=ReadInt(file)
				b=ReadFloat(file)
				b=ReadFloat(file)
				a=ReadInt(file)
				a=ReadInt(file)
				a=ReadInt(file)
					
				ID=ReadInt(file)
				oType=ReadInt(file)
				SubType=ReadInt(file)
		
				For j=1 To 16
					a=ReadInt(file)
				Next
				a2=ReadInt(file) ; data0
				For j=1 To 9
					a=ReadInt(file)
				Next
				For j=1 To 4
					c$=ReadString$(file)
				Next
				Talkable=ReadInt(file)
				For j=1 To 24
					a=ReadInt(file)
				Next
				For j=1 To 10
					b=ReadFloat(file)
				Next
				For j=1 To 2
					c$=ReadString$(file)
				Next
				For j=0 To 30
					ReadString$(file)
				Next
	
				
				
				Select oType
				Case 120
					NofWeeStinkersInAdventure=NofWeeStinkersInAdventure+1
				Case 150
					NofScrittersInAdventure=NofScrittersInAdventure+1
				Case 171
					AdventureCompletedCoinsTotal(AdventureCurrentNumber)=AdventureCompletedCoinsTotal(AdventureCurrentNumber)+1
				Case 173
					If a2<2
						NofGemsInAdventure=NofGemsInAdventure+1
						AdventureCompletedGemsTotal(AdventureCurrentNumber)=AdventureCompletedGemsTotal(AdventureCurrentNumber)+1
					EndIf
				Case 230
					NofFireFlowersInAdventure=NofFireFlowersInAdventure+1
				Case 242
					NofBricksInAdventure=NofBricksInAdventure+1
				Case 370
					NofCrabsInAdventure=NofCrabsInAdventure+1
				Case 400
					NofBabyBoomersInAdventure=NofBabyBoomersInAdventure+1
				Case 423,430,431,433
					NofZBotsInAdventure=NofZBotsInAdventure+1
					If oType=433 And a3=0 Then NofZBotNPCsInAdventure=NofZBotNPCsInAdventure+1
				
				End Select
			Next
			
			CloseFile(file)
	
		EndIf
	Next 
	
	


End Function



Function AdventureWon()

	If (LevelTimer>=1000001000 And LevelTimer<1000003000)
		; don't do this if either adventure already lost or already won
		Return
	EndIf
	If PlayerObject>=0
		If ObjectDead(PlayerObject)>0
			Return
		EndIf
	EndIf
	
	overwritescoreflag=False
	; Grab Total Time etc
	CurrentAdventureTime=(AdventureTimer/60)

	If (1000-5*CurrentAdventureTime)>0 Then CurrentAdventureScore=CurrentAdventureScore+1000-5*CurrentAdventureTime


	ReplayAdventureScoreBetter=1 ; also used as a flag for custom levelsto see if better result
								; 0-first time, 1-repeat but no better result, 2-repeat/improved 
								
	If AdventureCompleted(AdventureCurrentNumber)=0 
		; first time (could only get here via regular or customlevel, not replay)
		
		AdventureCompleted(AdventureCurrentNumber)=1
		AdventureCompletedTime(AdventureCurrentNumber)=CurrentAdventureTime
		AdventureCompletedGems(AdventureCurrentNumber)=CurrentAdventureGems
		AdventureCompletedCoins(AdventureCurrentNumber)=CurrentAdventureCoins
		PlayerScore=PlayerScore+CurrentAdventureScore
		AdventureCompletedScore(AdventureCurrentNumber)=CurrentAdventureScore

		overwritescoreflag=True
		ReplayAdventureScoreBetter=0 ; first time custom level
		
		

	Else
		; played again (e.g. custom or replay)
		If AdventureCurrentStatus=2
			; custom
			
			; only overwrite custom scores (=improved result) if 
			; gems or coins better, or equal with improved score
			
			If CurrentAdventureGems>AdventureCompletedGems(0) And CurrentAdventureCoins>=AdventureCompletedCoins(0)
				; more gems and not less coins
				overwritescoreflag=True
				ReplayAdventureScoreBetter=2 ; betterresult
			EndIf
			If CurrentAdventureCoins>AdventureCompletedCoins(0) And CurrentAdventureGems>=AdventureCompletedGems(0)
				; more coins and not less gems
				overwritescoreflag=True
				ReplayAdventureScoreBetter=2 ; betterresult
			EndIf
			If CurrentAdventureScore>AdventureCompletedScore(0) And CurrentAdventureGems>=AdventureCompletedGems(0) And CurrentAdventureCoins>=AdventureCompletedCoins(0)
				; better score with not less gems and not less coins
				overwritescoreflag=True
				ReplayAdventureScoreBetter=2 ; betterresult
			EndIf


		
		EndIf
		If AdventureCurrentStatus=3
			; replay
			ReplayAdventureScoreBetter=0
			ReplayAdventureGemsBetter=0
			ReplayAdventureCoinsBetter=0
	
			
			If CurrentAdventureTime<AdventureCompletedTime(AdventureCurrentNumber)
				AdventureCompletedTime(AdventureCurrentNumber)=CurrentAdventureTime
			EndIf
			If CurrentAdventureCoins>AdventureCompletedCoins(AdventureCurrentNumber)
				ReplayAdventureCoinsBetter=CurrentAdventureCoins-AdventureCompletedCoins(AdventureCurrentNumber)
				AdventureCompletedCoins(AdventureCurrentNumber)=CurrentAdventureCoins
			EndIf
			If CurrentAdventureGems>AdventureCompletedGems(AdventureCurrentNumber)
				ReplayAdventureGemsBetter=CurrentAdventureGems-AdventureCompletedGems(AdventureCurrentNumber)
				AdventureCompletedGems(AdventureCurrentNumber)=CurrentAdventureGems
			EndIf
		
			If CurrentAdventureScore>AdventureCompletedScore(AdventureCurrentNumber)
				ReplayAdventureScoreBetter=CurrentAdventureScore-AdventureCompletedScore(AdventureCurrentNumber)
				AdventureCompletedScore(AdventureCurrentNumber)=CurrentAdventureScore
			EndIf

			
			
		EndIf
		
			
	EndIf
	
	
	;custom? - update score file
	If overwritescoreflag=True

	
		AdventureCompleted(AdventureCurrentNumber)=1
		AdventureCompletedTime(AdventureCurrentNumber)=CurrentAdventureTime
		AdventureCompletedGems(AdventureCurrentNumber)=CurrentAdventureGems
		AdventureCompletedCoins(AdventureCurrentNumber)=CurrentAdventureCoins
		AdventureCompletedScore(AdventureCurrentNumber)=CurrentAdventureScore
			
		file=WriteFile(AdventureCurrentName$+"\"+PlayerName$+".score")
		WriteInt file,1
		WriteInt file,CurrentAdventureTime
		WriteInt file,CurrentAdventureGems
		WriteInt file,AdventureCompletedGemsTotal(0)
		WriteInt file,CurrentAdventureCoins
		WriteInt file,AdventureCompletedCoinsTotal(0)
		WriteInt file,CurrentAdventureScore
		CloseFile(file)
		
	EndIf


	
	PlaySoundFX(0,-1,-1)
	If ObjectMovementTimer(PlayerObject)<100
		ObjectMoveXGoal(PlayerObject)=ObjectTileX(PlayerObject)
		ObjectMoveYGoal(PlayerObject)=ObjectTileY(PlayerObject)
		ObjectTileX2(PlayerObject)=ObjectTileX(PlayerObject)
		ObjectTileY2(PlayerObject)=ObjectTileY(PlayerObject)
		ObjectMovementTimer(PlayerObject)=0
	Else
	
		ObjectMoveXGoal(PlayerObject)=ObjectTileX2(PlayerObject)
		ObjectMoveYGoal(PlayerObject)=ObjectTileY2(PlayerObject)
	EndIf
	PlayerTalkToGoalObject=-1
	
	Spellactive=False
	For i=0 To 79
		DeActivateIcon(i)
	Next
	If GameMode=8 Then EndDialog()
		
	GameMode=0
	LevelTimer=1000001000
	
	If AdventureTitleSprite(0)>0 Then FreeEntity AdventureTitleSprite(0)
	AdventureTitleSprite(0)=CreateSprite(camera)
	
	EntityAlpha AdventureTitleSprite(0),0
	
	
	
	EntityTexture AdventureTitleSprite(0),AdventureCompletedLogoTex
	EntityOrder AdventureTitleSprite(0),-200
	
	ShowEntity AdventureTitleStar

	PositionEntity AdventureTitleStar,0,0.7,4.7
	RotateEntity AdventureTitleStar,-100,0,0
	ScaleEntity AdventureTitleStar,0,0,0
	EntityAlpha AdventureTitleStar,0
	
	EntityTexture AdventureTitleStar,AdventureTitleStarTex1
	EntityOrder AdventureTitleStar,-199
	EntityFX AdventureTitleStar,1
			
End Function

Function AdventureWonUpdate()

	
	HideEntity MouseCursor
	MouseCursorVisible=False

	If LevelTimer=1000001100
		SetLight(0,0,0,1,0,0,0,1)
		; and particle burst
		playsoundfx(1,-1,-1)
		For i=0 To 359
			a#=Rnd(0.3,1.0)
			AddParticle(Rand(16,23),EntityX(AdventureTitleStar,True),EntityY(AdventureTitleStar,True)-0.1,EntityZ(AdventureTitleStar,True)-.011,0,0.4,a*0.12*Sin(i),a*0.12*Cos(i),0,5,.001,-a*0.0021*Sin(i),-a*0.0021*Cos(i),0,75,3)

		Next
			
	EndIf
	If LevelTimer>1000001002 And LevelTimer<1000001100
		PositionEntity AdventureTitleSprite(0),0,0.2+.7*Float(LevelTimer-1000001000)/100.0,1+3*Float(LevelTimer-1000001000)/100.0
		EntityAlpha AdventureTitleSprite(0),Float(LevelTimer-1000001000)/100.0
		
		EntityAlpha AdventureTitleStar,Float(LevelTimer-1000001000)/100.0
		ScaleEntity AdventureTitleStar,6.0-5.5*Float(LevelTimer-1000001000)/100.0,6.0-5.5*Float(LevelTimer-1000001000)/100.0,6.0-5.5*Float(LevelTimer-1000001000)/100.0

	EndIf
	TurnEntity AdventureTitleStar,0,2,0
	
	
	If AdventureCurrentStatus=1
		; Regular adventure
	
		If LevelTimer>1000001100 DisplayText("You Have Completed This Adventure!",8,11,1,1,255,255,0)
		
			
		If LevelTimer>1000001150 
			b$="Time: "+(AdventureCompletedTime(AdventureCurrentNumber)/60)+ " min "+(AdventureCompletedTime(AdventureCurrentNumber) Mod 60)+" sec"
			DisplayText(b$,25-0.5*Len(b$),14,1,1,255,255,255)
		EndIf
		If LevelTimer>1000001175 
			If AdventureCompletedGemsTotal(AdventureCurrentNumber)>0
				b$="Gems: "+AdventureCompletedGems(AdventureCurrentNumber)+" of "+AdventureCompletedGemsTotal(AdventureCurrentNumber)
			Else
				b$=""
			EndIf
			If AdventureCompletedCoinsTotal(AdventureCurrentNumber)>0
				If AdventureCompletedGemsTotal(AdventureCurrentNumber)>0 Then b$=b$+"   "
				b$=b$+"Coins: "+AdventureCompletedCoins(AdventureCurrentNumber)+" of "+AdventureCompletedCoinsTotal(AdventureCurrentNumber)
			EndIf
			DisplayText(b$,25-0.5*Len(b$),15,1,1,255,255,255)
		EndIf
		
		If leveltimer>1000001200 Then
			b$="Level Score: "+AdventureCompletedScore(AdventureCurrentStatus)
			DisplayText(b$,25-(Len(b$)*0.5),16,1,1,255,255,255)
		End If

	
		
		If LevelTimer>1000001250 
			b$="You Have Earned A Star!"
			DisplayText(b$,25.0-0.5*Len(b$)+0.6*Sin((LevelTimer-1000000000)*4),19+0.6*Cos((LevelTimer-1000000000)*4),1,1,255,255,255)
		EndIf
		If LevelTimer>1000001300 
			b$="Total Stars: "+Str$(PlayerStars+1)
			DisplayText(b$,25.0-0.5*Len(b$)+0.6*Sin((LevelTimer-1000000000)*4),20+0.6*Cos((LevelTimer-1000000000)*4),1,1,255,255,255)
		EndIf
	Else If AdventureCurrentStatus=2
		; custom adventure
	
		If LevelTimer>1000001100 DisplayText("Custom Adventure Completed!",11.5+0.5*Sin((leveltimer*4) Mod 360),11,1,1,255,255,0)
		
			
		If LevelTimer>1000001150 
			b$="Time: "+(CurrentAdventureTime/60)+ " min "+(CurrentAdventureTime Mod 60)+" sec"
			DisplayText(b$,25-0.5*Len(b$),14,1,1,255,255,255)
		EndIf
		If LevelTimer>1000001175 
			If AdventureCompletedGemsTotal(AdventureCurrentNumber)>0
				b$="Gems: "+CurrentAdventureGems+" of "+AdventureCompletedGemsTotal(AdventureCurrentNumber)
			Else
				b$=""
			EndIf
			If AdventureCompletedCoinsTotal(AdventureCurrentNumber)>0
				If AdventureCompletedGemsTotal(AdventureCurrentNumber)>0 Then b$=b$+"   "
				b$=b$+"Coins: "+CurrentAdventureCoins+" of "+AdventureCompletedCoinsTotal(AdventureCurrentNumber)
			EndIf
			DisplayText(b$,25-0.5*Len(b$),15,1,1,255,255,255)
		EndIf
		If LevelTimer>1000001200 
			b$="Level Score: "+CurrentAdventureScore
			DisplayText(b$,25-0.5*Len(b$),16,1,1,255,255,255)
		EndIf
	
		
		If LevelTimer>1000001250 
			If CurrentAdventureGems=AdventureCompletedGemsTotal(AdventureCurrentNumber) And CurrentAdventureCoins=AdventureCompletedCoinsTotal(AdventureCurrentNumber)
				b$="You got GOLD (all gems and coins)!!"
			Else
				b$=""
			EndIf
			DisplayText(b$,25.0-0.5*Len(b$)+0.6*Sin((LevelTimer-1000000000)*4),18+0.6*Cos((LevelTimer-1000000000)*4),1,1,255,255,255)

			If ReplayAdventureScoreBetter=1
				b$="(No Improvement over Previous Attempts)"
			Else If ReplayAdventureScoreBetter =2
				b$="Improved Results - Congratulations!"
			Else
				b$=""
			EndIf
			DisplayText(b$,25.0-0.5*Len(b$)+0.6*Sin((LevelTimer-1000000000)*4),19+0.6*Cos((LevelTimer-1000000000)*4),1,1,255,255,255)
		EndIf
		

		
	Else If AdventureCurrentStatus=3
		; replay adventure
		If LevelTimer>1000001100
			DisplayText("Adventure Replay Results:",12.5+Sin(leveltimer Mod 360),11,1,1,255,255,0)
			
			b$="Time: "+(CurrentAdventureTime/60)+ " min "+(CurrentAdventureTime Mod 60)+" sec"
			DisplayText(b$,25-0.5*Len(b$),13,1,1,255,255,255)
		
			b$="Gems: "+CurrentAdventureGems+" of "+AdventureCompletedGemsTotal(AdventureCurrentNumber)
			If ReplayAdventureGemsBetter>0
				b$=b$+"  ("+ReplayAdventureGemsBetter+" gained)"
			Else
				b$=b$+"  (no gain)"
			EndIf
			DisplayText(b$,25-0.5*Len(b$),14,1,1,255,255,255)
			
			b$="Coins: "+CurrentAdventureCoins+" of "+AdventureCompletedCoinsTotal(AdventureCurrentNumber)
			If ReplayAdventureCoinsBetter>0
				b$=b$+"  ("+ReplayAdventureCoinsBetter+" gained)"
			Else
				b$=b$+"  (no gain)"
			EndIf
			DisplayText(b$,25-0.5*Len(b$),15,1,1,255,255,255)
			
			b$="Score: "+CurrentAdventureScore
			If ReplayAdventureScoreBetter>0
				b$=b$+"  ("+ReplayAdventureScoreBetter+" points gained)"
			Else
				b$=b$+"  (no gain)"
			EndIf
			DisplayText(b$,25-0.5*Len(b$),16,1,1,255,255,255)

		EndIf

	EndIf

		
	
	If LevelTimer=1000001500 

		; Done
	
		EndLevel()
	
		
		; Back To Hub
		
		EndAdventure()
		
		; end of demo?
		If FullVersion=False And (WAEpisode=1 And AdventureCurrentNumber=13)
			; go to trailer
			
			startmenu(25)
		
		
		Else
			; Do the Won Commands
			If AdventureCurrentStatus=3
				; replay adventure
				keeplight=CurrentLightPower
				AdventureCancelData()
				CurrentLightpower=keeplight
				For i=0 To 99
					If InventoryItem(i)=2001 InventoryHelpText$(i)="- "+currentlightpower+" -"
				Next
	
				PlayerScore=PlayerScore+ReplayAdventureScoreBetter
				PlayerCoins=PlayerCoins+ReplayAdventureCoinsBetter
				StartHubLevel(-23,27,13)
				
			Else If AdventureCurrentStatus=2
				; custom adventure
				StartCustomSelectMenu()
			Else
				; regular adventure

				AdventureWonCommands()
				If WAEpisode=1 And AdventureCurrentNumber=130
					; end of main adventure
					
					CopyFile (GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\915.wlv",GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\15.wlv")
					CopyFile (GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\920.wlv",GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\20.wlv")
					CopyFile (GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\921.wlv",GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\21.wlv")
					startmenu(23)
				
				Else
					StartHubLevel(-AdventureExitWonLevel,AdventureExitWonX,AdventureExitWonY)
				EndIf
			EndIf
			
		EndIf
	EndIf



End Function

Function AdventureWonCommands()
	PlayerStars=PlayerStars+1
	
		
	

	For i=0 To 2
		If AdventureWonCommand(i,1)>0
			name$=GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\"+Str$(adventureWonCommand(i,0))+".wlv"
			
			loadlevel(name$,False,False)
			LightRedGoal2=LightRedGoal
			LightGreenGoal2=LightGreenGoal
			LightBlueGoal2=LightBlueGoal
			AmbientRedGoal2=AmbientRedGoal
			AmbientGreenGoal2=AmbientGreenGoal
			AmbientBlueGoal2=AmbientBlueGoal

			activatecommand(AdventureWonCommand(i,1),AdventureWonCommand(i,2),AdventureWonCommand(i,3),AdventureWonCommand(i,4),AdventureWonCommand(i,5))
			If (AdventureWonCommand(i,1)<>103 And AdventureWonCommand(i,1)<>104) Then savelevel(name$)
		EndIf
	Next
End Function


Function AdventureLost()

	If LevelTimer>=1000001000 And LevelTimer<1000003000
		; don't do this if either adventure already lost or already won
		Return
	EndIf
	
		; game over saying - check if zbot npcs on board
	
	flag=False
	For i=0 To nofobjects-1
		If (ObjectType(i)=433 And ObjectActive(i)>0) Or ObjectType(i)=431 Or ObjectType(i)=432 And ObjectSubType(i)>0
			flag=True
		EndIf
	Next
	
	If flag=True
		If Rand(0,100)<80
			PlaySoundFX(158,-1,-1)
		Else
			PlaySoundFX(Rand(148,149),-1,-1)
		EndIf
	Else
	
		If Rand(0,100)<50
			PlaySoundFX(Rand(160,163),-1,-1)
		Else
			playsoundFX(Rand(160,161),-1,-1)
		EndIf
	EndIf
	
	Spellactive=False
	If ObjectMovementTimer(PlayerObject)<100
		ObjectMoveXGoal(PlayerObject)=ObjectTileX(PlayerObject)
		ObjectMoveYGoal(PlayerObject)=ObjectTileY(PlayerObject)
		ObjectTileX2(PlayerObject)=ObjectTileX(PlayerObject)
		ObjectTileY2(PlayerObject)=ObjectTileY(PlayerObject)
		ObjectMovementTimer(PlayerObject)=0
	Else
	
		ObjectMoveXGoal(PlayerObject)=ObjectTileX2(PlayerObject)
		ObjectMoveYGoal(PlayerObject)=ObjectTileY2(PlayerObject)
	EndIf
	PlayerTalkToGoalObject=-1


	For i=0 To 79
		If i<>9 DeActivateIcon(i)
	Next
	If GameMode=8 Then EndDialog()
	
	GameMode=0
	LevelTimer=1000002000
	
	If AdventureTitleSprite(0)>0 Then FreeEntity AdventureTitleSprite(0)
	AdventureTitleSprite(0)=CreateSprite(camera)
	EntityAlpha AdventureTitleSprite(0),0
	
	
	EntityTexture AdventureTitleSprite(0),AdventureLostLogoTex
	EntityOrder AdventureTitleSprite(0),-5
	

	ShowEntity AdventureTitleStar
		
	PositionEntity AdventureTitleStar,0,2.4,4.7
	RotateEntity AdventureTitleStar,-100,0,0
	ScaleEntity AdventureTitleStar,0,0,0
	EntityAlpha AdventureTitleStar,1

	EntityTexture AdventureTitleStar,AdventureTitleStarTex2
	EntityOrder AdventureTitleStar,-4
	EntityFX AdventureTitleStar,1
			
End Function

Function AdventureLostUpdate()

	

	If LevelTimer=1000002100
		SetLight(0,0,0,1,0,0,0,1)
		
	EndIf
	If LevelTimer<1000002100
		PositionEntity AdventureTitleSprite(0),0,0.2+.7*Float(LevelTimer-1000002000)/100.0,1+3*Float(LevelTimer-1000002000)/100.0
		EntityAlpha AdventureTitleSprite(0),Float(LevelTimer-1000002000)/100.0
		
		EntityAlpha AdventureTitleStar,Float(LevelTimer-1000002000)/100.0
		ScaleEntity AdventureTitleStar,0.9,0.9,0.9
		

	EndIf
	TranslateEntity AdventureTitleStar,0,-.02,0
	TurnEntity AdventureTitleStar,0,2,0
	
	ChannelVolume musicchannel,GlobalMusicVolume*(1.0-(leveltimer-1000002000)/500.0)
	currentmusic=0
	

	
	If LevelTimer>1000002100 
		
		b$="You Have Lost This Adventure!"
		DisplayText(b$,25-0.5*Len(b$),11,1,1,255,255,0)
	EndIf
	If LevelTimer>1000002120 
		DisplayText(AdventureLostReason$,25-0.5*Len(AdventureLostReason$),13,1,1,255,255,255)
	EndIf
	If LevelTimer>1000002160 
		b$="Sorry... Better Luck Next Time!"
		DisplayText(b$,25-0.5*Len(b$),18,1,1,255,255,255)
	EndIf
	
	If LevelTimer=1000002500 
		; Done
		
		
		EndLevel()
		If adventurecurrentstatus=0
			; died in hub
			EndAdventure()

			startmenu(11)
			
		Else
			AdventureCancelData()
			
			EndAdventure()
			
			If AdventureCurrentStatus=3
				;replay adventure
				StartHubLevel(-23,27,13)

			Else If AdventureCurrentstatus=2
				;custom adventure
				StartAdventure(AdventureCurrentName$,AdventureCurrentStatus,AdventureCurrentNumber)
				

			Else
				;regular adventure
				StartHubLevel(-AdventureExitLostLevel,AdventureExitLostX,AdventureExitLostY)
			EndIf

			
			
		EndIf
	EndIf



End Function

Function EndAdventure()

	; restore some custom stuff
	
	
	
	
	If AdventureTitleSprite(0)>0
		FreeEntity AdventureTitleSprite(0)
		AdventureTitleSprite(0)=0

	
		HideEntity AdventureTitleStar
		
		
	EndIf

	ResetParticles("data/graphics/particles.bmp")

End Function

Function AdventureCancelData()

	InventorySize=InventorySizeB4
	NofInventoryItems=NofInventoryItemsB4
	For i=0 To 99
		InventoryItem(i)=InventoryItemB4(i)
		InventoryID(i)=InventoryIDB4(i)
		InventoryTexture(i)=InventoryTextureB4(i)
		InventorySubText$(i)=InventorySubTextB4$(i)
		InventoryHelpText$(i)=InventoryHelpTextB4$(i)
	Next
	PlayerCoins=PlayerCoinsB4
	PlayerCoinsCollected=PlayerCoinsCollectedB4
	PlayerStars=PlayerStarsB4
	PlayerScore=PlayerScoreB4
	CurrentLightpower=LightPowerB4
	future=futureB4
	future=futureB4
	future=futureB4
	future=futureB4
	future=futureB4


End Function




Function SetupObjects()

	; Called once at the beginning of the game
	; Loads/Creates all models, etc


	; no longer used
	

	
	
End Function

Function CreateNewObject()

	; clean this entry
	
	Dest=NofObjects
	
	
	Objectmodelname$(Dest)=""
	Objecttexturename$(Dest)=""
		
	
	
	ObjectXScale(Dest)=1
	ObjectYScale(Dest)=1
	ObjectZScale(Dest)=1
	ObjectXAdjust(Dest)=0
	ObjectYAdjust(Dest)=0
	ObjectZAdjust(Dest)=0
	ObjectPitchAdjust(Dest)=0
	ObjectYawAdjust(Dest)=0
	ObjectRollAdjust(Dest)=0

	
	
	ObjectExists(Dest)=True	
		
	ObjectEntity(Dest)=0
	ObjectTexture(Dest)=0
	
	ObjectX(Dest)=0
	ObjectY(Dest)=0
	ObjectZ(Dest)=0
	ObjectOldX(Dest)=-999
	ObjectOldY(Dest)=-999
	ObjectOldZ(Dest)=-999
	ObjectDX(Dest)=0
	ObjectDY(Dest)=0
	ObjectDZ(Dest)=0
	
	ObjectPitch(Dest)=0
	ObjectYaw(Dest)=0
	ObjectRoll(Dest)=0
	ObjectPitch2(Dest)=0
	ObjectYaw2(Dest)=0
	ObjectRoll2(Dest)=0


	ObjectXGoal(Dest)=0
	ObjectYGoal(Dest)=0
	ObjectZGoal(Dest)=0
	
	ObjectMovementType(Dest)=0
	ObjectMovementTypeData(Dest)=0
	ObjectSpeed(Dest)=0
	ObjectRadius(Dest)=0
	ObjectRadiusType(Dest)=0
	
	ObjectData10(Dest)=0
	
	ObjectPushDX(Dest)=0
	ObjectPushDY(Dest)=0

	
	ObjectAttackPower(Dest)=0
	ObjectDefensePower(Dest)=0
	ObjectDestructionType(Dest)=0
	

	ObjectID(Dest)=-1
	ObjectType(Dest)=0
	ObjectSubType(Dest)=0
	
	ObjectActive(Dest)=0
	ObjectLastActive(Dest)=0
	ObjectActivationType(Dest)=0
	ObjectActivationSpeed(Dest)=0
	
	ObjectStatus(Dest)=0
	ObjectTimer(Dest)=0
	ObjectTimerMax1(Dest)=0
	ObjectTimerMax2(Dest)=0
	
	ObjectTeleportable(Dest)=False
	ObjectButtonPush(Dest)=False
	ObjectWaterReact(Dest)=0
	
	ObjectTelekinesisable(Dest)=0
	ObjectFreezable(Dest)=0
	
	ObjectReactive(Dest)=True

	ObjectChild(Dest)=-1
	ObjectParent(Dest)=-1
	
	For k=0 To 9
		ObjectData(Dest,k)=0
	Next
	For k=0 To 3
		ObjectTextData(Dest,k)=""
	Next
	
	ObjectTalkable(Dest)=0
	;;ObjectCurrentAnim(Dest)=0
	ObjectStandardAnim(Dest)=0
	ObjectTileX(Dest)=0
	ObjectTileY(Dest)=0
	ObjectTileX2(Dest)=0
	ObjectTileY2(Dest)=0
	ObjectMovementTimer(Dest)=0
	ObjectMovementSpeed(Dest)=0
	ObjectMoveXGoal(Dest)=0
	ObjectMoveYGoal(Dest)=0
	ObjectTileTypeCollision(Dest)=0
	ObjectObjectTypeCollision(Dest)=0
	ObjectCaged(Dest)=0
	ObjectDead(Dest)=0
	ObjectDeadTimer(Dest)=0
	ObjectExclamation(Dest)=0
	ObjectShadow(Dest)=0
	ObjectLinked(Dest)=-1
	ObjectLinkBack(Dest)=-1
	ObjectFlying(Dest)=0
	ObjectFrozen(Dest)=0
	ObjectFutureInt23(Dest)=0
	ObjectFutureInt24(Dest)=0
	ObjectFutureInt25(Dest)=0

	ObjectScaleAdjust(Dest)=0
	ObjectScaleXAdjust(Dest)=1.0
	ObjectScaleYAdjust(Dest)=1.0
	ObjectScaleZAdjust(Dest)=1.0
	ObjectFutureFloat5(Dest)=0
	ObjectFutureFloat6(Dest)=0
	ObjectFutureFloat7(Dest)=0
	ObjectFutureFloat8(Dest)=0
	ObjectFutureFloat9(Dest)=0
	ObjectFutureFloat10(Dest)=0

	ObjectFutureString1$(Dest)=0
	ObjectFutureString2$(Dest)=0



	
	
	
	NofObjects=NofObjects+1
	Return Dest

End Function

Function LoadObject(file, complete,create)

	; complete=true means also load player, spellballs
	; create=true: also create entities (not used if just loaded to change e.g. AdventureWonCommand)
	
	; clean this entry
	
	Dest=NofObjects
	
	ObjectEntity(Dest)=0
	ObjectTexture(Dest)=0
	
	ObjectExists(Dest)=True	
	
	Objectmodelname$(Dest)=ReadString$(file)
	Objecttexturename$(Dest)=ReadString$(file)
		
	
	
	ObjectXScale(Dest)=ReadFloat(file)
	ObjectYScale(Dest)=ReadFloat(file)
	ObjectZScale(Dest)=ReadFloat(file)
	ObjectXAdjust(Dest)=ReadFloat(file)
	ObjectYAdjust(Dest)=ReadFloat(file)
	ObjectZAdjust(Dest)=ReadFloat(file)
	ObjectPitchAdjust(Dest)=ReadFloat(file)
	ObjectYawAdjust(Dest)=ReadFloat(file)
	ObjectRollAdjust(Dest)=ReadFloat(file)

	
	ObjectX(Dest)=ReadFloat(file)
	ObjectY(Dest)=ReadFloat(file)
	ObjectZ(Dest)=ReadFloat(file)
	ObjectOldX(Dest)=ReadFloat(file)
	ObjectOldY(Dest)=ReadFloat(file)
	ObjectOldZ(Dest)=ReadFloat(file)
	ObjectDX(Dest)=ReadFloat(file)
	ObjectDY(Dest)=ReadFloat(file)
	ObjectDZ(Dest)=ReadFloat(file)
	
	ObjectPitch(Dest)=ReadFloat(file)
	ObjectYaw(Dest)=ReadFloat(file)
	ObjectRoll(Dest)=ReadFloat(file)
	ObjectPitch2(Dest)=ReadFloat(file)
	ObjectYaw2(Dest)=ReadFloat(file)
	ObjectRoll2(Dest)=ReadFloat(file)


	ObjectXGoal(Dest)=ReadFloat(file)
	ObjectYGoal(Dest)=ReadFloat(file)
	ObjectZGoal(Dest)=ReadFloat(file)
	
	ObjectMovementType(Dest)=ReadInt(file)
	ObjectMovementTypeData(Dest)=ReadInt(file)
	ObjectSpeed(Dest)=ReadFloat(file)
	ObjectRadius(Dest)=ReadFloat(file)
	ObjectRadiusType(Dest)=ReadInt(file)
	
	ObjectData10(Dest)=ReadInt(file)

	ObjectPushDX(Dest)=ReadFloat(file)
	ObjectPushDY(Dest)=ReadFloat(file)

	
	ObjectAttackPower(Dest)=ReadInt(file)
	ObjectDefensePower(Dest)=ReadInt(file)
	ObjectDestructionType(Dest)=ReadInt(file)
	

	ObjectID(Dest)=ReadInt(file)
	ObjectType(Dest)=ReadInt(file)
	ObjectSubType(Dest)=ReadInt(file)
	
	ObjectActive(Dest)=ReadInt(file)
	ObjectLastActive(Dest)=ReadInt(file)
	ObjectActivationType(Dest)=ReadInt(file)
	ObjectActivationSpeed(Dest)=ReadInt(file)
	
	ObjectStatus(Dest)=ReadInt(file)
	ObjectTimer(Dest)=ReadInt(file)
	ObjectTimerMax1(Dest)=ReadInt(file)
	ObjectTimerMax2(Dest)=ReadInt(file)
	
	ObjectTeleportable(Dest)=ReadInt(file)
	ObjectButtonPush(Dest)=ReadInt(file)
	ObjectWaterReact(Dest)=ReadInt(file)
	
	ObjectTelekinesisable(Dest)=ReadInt(file)
	ObjectFreezable(Dest)=ReadInt(file)
	
	ObjectReactive(Dest)=ReadInt(file)

	ObjectChild(Dest)=ReadInt(file)
	ObjectParent(Dest)=ReadInt(file)
	
	For k=0 To 9
		ObjectData(Dest,k)=ReadInt(file)
	Next
	For k=0 To 3
		ObjectTextData(Dest,k)=ReadString$(file)
	Next
	
	ObjectTalkable(Dest)=ReadInt(file)
	ObjectCurrentAnim(Dest)=ReadInt(file)
	If (ObjectType(dest)<>370 Or Objectstatus(dest)<>2) ObjectCurrentAnim(Dest)=0 ; immediately reset to zero - animations should be restarted in=game	
														; exception - submerged crab	
	ObjectStandardAnim(Dest)=ReadInt(file)
	ObjectTileX(Dest)=ReadInt(file)
	ObjectTileY(Dest)=ReadInt(file)
	ObjectTileX2(Dest)=ReadInt(file)
	ObjectTileY2(Dest)=ReadInt(file)
	ObjectMovementTimer(Dest)=ReadInt(file)
	ObjectMovementSpeed(Dest)=ReadInt(file)
	ObjectMoveXGoal(Dest)=ReadInt(file)
	ObjectMoveYGoal(Dest)=ReadInt(file)
	ObjectTileTypeCollision(Dest)=ReadInt(file)
	ObjectObjectTypeCollision(Dest)=ReadInt(file)
	ObjectCaged(Dest)=ReadInt(file)
	ObjectDead(Dest)=ReadInt(file)
	ObjectDeadTimer(Dest)=ReadInt(file)
	ObjectExclamation(Dest)=ReadInt(file)
	ObjectShadow(Dest)=ReadInt(file)
	ObjectLinked(Dest)=ReadInt(file)
	ObjectLinkBack(Dest)=ReadInt(file)
	ObjectFlying(Dest)=ReadInt(file)
	ObjectFrozen(Dest)=ReadInt(file)
	ObjectFutureInt23(Dest)=ReadInt(file)
	ObjectFutureInt24(Dest)=ReadInt(file)
	ObjectFutureInt25(Dest)=ReadInt(file)
	ObjectScaleAdjust(Dest)=ReadFloat(file)
	ObjectScaleXAdjust(Dest)=ReadFloat(file)
	ObjectScaleYAdjust(Dest)=ReadFloat(file)
	ObjectScaleZAdjust(Dest)=ReadFloat(file)
	ObjectScaleXAdjust(Dest)=1.0
	ObjectScaleYAdjust(Dest)=1.0
	ObjectScaleZAdjust(Dest)=1.0

	ObjectFutureFloat5(Dest)=ReadFloat(file)
	ObjectFutureFloat6(Dest)=ReadFloat(file)
	ObjectFutureFloat7(Dest)=ReadFloat(file)
	ObjectFutureFloat8(Dest)=ReadFloat(file)
	ObjectFutureFloat9(Dest)=ReadFloat(file)
	ObjectFutureFloat10(Dest)=ReadFloat(file)
	ObjectFutureString1$(Dest)=ReadString$(file)
	ObjectFutureString2$(Dest)=ReadString$(file)
	
	
	


	
	For i=0 To 30
		ReadString$(file)
	Next
	
	
	If LevelFormat104=True
		
		If complete=True And objectType(Dest)=1
			AdjustLevelTileLogic(Floor(ObjectX(Dest)),Floor(ObjectY(Dest)),Dest)
		EndIf
		
	Else
	
		If ObjectType(Dest)<>1
			AdjustLevelTileLogic(Floor(ObjectX(Dest)),Floor(ObjectY(Dest)),Dest)
		EndIf
	EndIf
	
	If ObjectModelName$(Dest)="" Then Return 0
	
	If create=False 
		NofObjects=NofObjects+1
		Return
	EndIf
	
	If ObjectScaleAdjust(Dest)<>0.0
		ObjectXScale(Dest)=ObjectXScale(Dest)*ObjectScaleAdjust(Dest)
		ObjectYScale(Dest)=ObjectYScale(Dest)*ObjectScaleAdjust(Dest)
		ObjectZScale(Dest)=ObjectZScale(Dest)*ObjectScaleAdjust(Dest)
		
	EndIf
	ObjectScaleAdjust(Dest)=1.0
	
	If Left$(ObjectModelName$(Dest),9)="!Obstacle"
		ObjectEntity(Dest)=CopyEntity(ObstacleMesh((Asc(Mid$(ObjectModelName$(Dest),10,1))-48)*10+(Asc(Mid$(ObjectModelName$(Dest),11,1))-48)))
	Else

	Select ObjectModelName$(Dest)
	
		
	
	Case "!Player"
		If complete=True 
			NofObjects=NofObjects+1
			CreateStinkerModel(Dest,ObjectXScale(Dest),ObjectYScale(Dest),ObjectZScale(Dest),ObjectTextureName$(Dest))
		EndIf
		Return 0
	Case "!Hat", "!Shadow"
		Return 0 ; don't create - this s done in CreatePlayer
	Case "!NPC"
		; Create Texture/Accessory Code 
		; !T000b000a0 000a0
			;		T000 - which body texture, b - which expression
		;		000 - which accessory model, a - which accessory texture for that model, 0 - which bone to attach to
		ObjectTextureName$(Dest)="!T"
		If ObjectData(Dest,0)<10
			ObjectTextureName$(Dest)=ObjectTextureName$(Dest)+"00"+Str$(ObjectData(Dest,0))
		Else If ObjectData(Dest,0)<100
			ObjectTextureName$(Dest)=ObjectTextureName$(Dest)+"0"+Str$(ObjectData(Dest,0))
		Else
			ObjectTextureName$(Dest)=ObjectTextureName$(Dest)+Str$(ObjectData(Dest,0))
		EndIf
		ObjectTextureName$(Dest)=ObjectTextureName$(Dest)+Chr$(65+ObjectData(Dest,1))
		If ObjectData(Dest,2)>0
			If ObjectData(Dest,2)<10
				 ObjectTextureName$(Dest)=ObjectTextureName$(Dest)+"00"+Str$(ObjectData(Dest,2))
			Else If ObjectData(Dest,2)<100
				 ObjectTextureName$(Dest)=ObjectTextureName$(Dest)+"0"+Str$(ObjectData(Dest,2))
			Else
				 ObjectTextureName$(Dest)=ObjectTextureName$(Dest)+""+Str$(ObjectData(Dest,2))
			EndIf
			ObjectTextureName$(Dest)=ObjectTextureName$(Dest)+Chr$(64+ObjectData(dest,3))+"0"
		EndIf
		If ObjectData(Dest,4)>0 And ObjectData(Dest,2)>0 Then ObjectTextureName$(Dest)=ObjectTextureName$(Dest)+" "
		If ObjectData(Dest,4)>0
			If ObjectData(Dest,4)<10
				 ObjectTextureName$(Dest)=ObjectTextureName$(Dest)+"00"+Str$(ObjectData(Dest,4))
			Else If ObjectData(Dest,4)<100
				 ObjectTextureName$(Dest)=ObjectTextureName$(Dest)+"0"+Str$(ObjectData(Dest,4))
			Else
				 ObjectTextureName$(Dest)=ObjectTextureName$(Dest)+""+Str$(ObjectData(Dest,4))
			EndIf
			ObjectTextureName$(Dest)=ObjectTextureName$(Dest)+Chr$(65+ObjectData(dest,5))+"0"
		EndIf

		
		NofObjects=NofObjects+1
		CreateStinkerModel(Dest,ObjectXScale(Dest),ObjectYScale(Dest),ObjectZScale(Dest),ObjectTextureName$(Dest))

		If ObjectData(Dest,0)=5
			EntityTexture GetChild(ObjectEntity(Dest),3),Waterfalltexture
		Else
			EntityTexture GetChild(ObjectEntity(Dest),3),StinkerTexture(ObjectData(Dest,0),ObjectData(Dest,1))
		EndIf
		Return 0

	Case "!StinkerWee"
		ObjectEntity(Dest)=CopyEntity(StinkerWeeMesh)
		
	Case "!Cage"
		ObjectEntity(Dest)=CopyEntity(CageMesh)
		
	Case "!StarGate"
		ObjectEntity(Dest)=CopyEntity(StarGateMesh)	
		
	Case "!Scritter"
		ObjectEntity(Dest)=CopyEntity(ScritterMesh)
		
	Case "!RainbowBubble"
		ObjectEntity(Dest)=CreateSphere()
		ScaleMesh ObjectEntity(Dest),.5,.5,.5
		
		EntityTexture ObjectEntity(Dest),Rainbowtexture2
		
		
	Case "!Autodoor"
		ObjectEntity(Dest)=CopyEntity(AutodoorMesh)
		If ObjectTileX(Dest)=0
			ObjectTileX(Dest)=Floor(ObjectX(Dest))
			ObjectTileY(Dest)=Floor(ObjectY(Dest))
		EndIf
		

		
	Case "!Lurker"
		ObjectEntity(Dest)=CopyEntity(LurkerMesh)
		
	Case "!Ghost"
		ObjectEntity(Dest)=CopyEntity(GhostMesh)
		EntityFX ObjectEntity(Dest),1

	Case "!Wraith"
		ObjectEntity(Dest)=CopyEntity(WraithMesh)
		EntityTexture ObjectEntity(Dest),WraithTexture(ObjectData(Dest,2))
		EntityFX ObjectEntity(Dest),1
	Case "!Turtle"
		ObjectEntity(Dest)=CopyEntity(TurtleMesh)
		If ObjectStatus(Dest)=2 Then AnimateMD2 ObjectEntity(Dest),3,.2,31,49
		If ObjectData(Dest,4)>0 Then EntityTexture ObjectEntity(Dest),TurtleTexture2
		
	Case "!Crab"
		ObjectEntity(Dest)=CopyEntity(CrabMesh)
		If ObjectData(Dest,1)>=2 Then AnimateMD2 ObjectEntity(Dest),3,1,48,49 ; sleeping
		If ObjectSubType(Dest)=0 Then EntityTexture ObjectEntity(Dest),CrabTexture2
		If ObjectStatus(Dest)=2
			; in water
			ObjectZ(Dest)=-.1
			AnimateMD2 ObjectEntity(Dest),3,1,46,49
		EndIf
		
	Case "!Troll"
		ObjectEntity(Dest)=CopyEntity(TrollMesh)
		AnimateMD2 objectentity(dest),2,0.005,81,82
	Case "!Kaboom"
		ObjectEntity(Dest)=CopyEntity(KaboomMesh)
		EntityTexture ObjectEntity(Dest),KaboomTexture(ObjectData(dest,0))
		TurnEntity ObjectEntity(Dest),0,90,0
		
	Case "!KaboomRTW"
		ObjectEntity(Dest)=CopyEntity(KaboomRTWMesh)
		EntityTexture ObjectEntity(Dest),KaboomRTWTexture
		TurnEntity ObjectEntity(Dest),0,90,0
		
	Case "!BabyBoomer"
		ObjectEntity(Dest)=CopyEntity(KaboomMesh)
		EntityTexture ObjectEntity(Dest),KaboomTexture(1)
		TurnEntity ObjectEntity(Dest),0,90,0
		
	Case "!FireFlower"
		ObjectEntity(Dest)=CopyEntity(FireFlowerMesh)
		;;If ObjectData(Dest,1)=-3 EntityTexture ObjectEntity(Dest),FireFlowerTExture2
		
	Case "!BurstFlower"
		ObjectEntity(Dest)=CopyEntity(BurstFlowerMesh)
	Case "!Chomper"
		ObjectEntity(Dest)=CopyEntity(ChomperMesh)
		AnimateMD2 ObjectEntity(Dest),1,.6,1,29
		If ObjectData(Dest,1)=3 Then EntityTexture ObjectEntity(Dest),ChomperTexture2


	Case "!Thwart"
		ObjectEntity(Dest)=CopyEntity(ThwartMesh)
		EntityTexture ObjectEntity(Dest),ThwartTexture(ObjectData(Dest,0))
	
		
	Case "!Bowler"
		ObjectEntity(Dest)=CopyEntity(BowlerMesh)
	Case "!Tentacle"
		ObjectEntity(Dest)=CopyEntity(TentacleMesh)
		Animate GetChild(ObjectEntity(Dest),3),1,.1,1,0
		If ObjectSubType(Dest)=1 Then
			 EntityTexture ObjectEntity(Dest),TentacleTexture2
			 For x=1 To CountChildren(ObjectEntity(Dest))
				EntityTexture GetChild(ObjectEntity(Dest),x),TentacleTexture2
			Next
		EndIf
		ObjectDestructionType(Dest)=2
		

	Case "!Busterfly"
		ObjectEntity(Dest)=CopyEntity(BusterflyMesh)
		AnimateMD2 ObjectEntity(Dest),2,.4,2,9

	Case "!Rubberducky"
		ObjectEntity(Dest)=CopyEntity(RubberduckyMesh)

	Case "!GlowWorm","!Zipper"
		ObjectEntity(Dest)=CreateSphere(12)
		ScaleMesh ObjectEntity(Dest),.1,.1,.1
		EntityColor ObjectEntity(Dest),ObjectData(Dest,5),ObjectData(Dest,6),ObjectData(Dest,7)
		EntityBlend ObjectEntity(Dest),3

	Case "!Void"
		ObjectEntity(Dest)=CreateVoidMesh()
	Case "!GrowFlower"
	
		If ObjectData(Dest,0)=2
			ObjectEntity(Dest)=CopyEntity(ObstacleMesh(7))
		Else If ObjectData(Dest,0)=11 Or ObjectData(Dest,0)=12
			ObjectEntity(Dest)=CopyEntity(ObstacleMesh(16))
			;EntityTexture ObjectEntity(Dest),waterfalltexture
		Else
			ObjectEntity(Dest)=CopyEntity(ObstacleMesh(10))
		EndIf
	Case "!FlashBubble"
		ObjectEntity(Dest)=CreateSphere()
		s=CreateCylinder()
		ScaleMesh s,0.5,0.01,0.5
		PositionMesh s,0,-0.58,0
		AddMesh s,ObjectEntity(Dest)
		FreeEntity s
		EntityTexture ObjectEntity(Dest),FlashTexture
		EntityAlpha ObjectEntity(Dest),0.5
		EntityBlend ObjectEntity(Dest),3


	Case "!Spring"
		ObjectEntity(Dest)=CopyMesh (cylinder)

		RotateMesh ObjectEntity(Dest),90,0,0
		ScaleMesh ObjectEntity(Dest),1.1,1.1,1.1
		EntityTexture ObjectEntity(Dest),SpringTexture
		
	Case "!Suctube"
		ObjectEntity(Dest)=CreateSucTubeMesh(ObjectData(Dest,3),ObjectData(Dest,0),ObjectActive(Dest))
		Redosuctubemesh(Dest)
		
	Case "!SuctubeX"
		ObjectEntity(Dest)=CreateSucTubeXMesh(ObjectData(Dest,3))
	Case "!FlipBridge"
		ObjectEntity(Dest)=CreateFlipBridgeMesh(ObjectData(Dest,0))
		EntityTexture ObjectEntity(Dest),GateTexture
	Case "!WaterFall"
		ObjectEntity(Dest)=CreateWaterFallMesh()
	Case "!Star"
		ObjectEntity(Dest)=CopyEntity(StarMesh) 
		EntityTexture ObjectEntity(Dest),GoldStarTexture
	Case "!Wisp"
		ObjectEntity(Dest)=CopyEntity(StarMesh) 
		EntityTexture ObjectEntity(Dest),WispTexture

	Case "!Coin"
		ObjectEntity(Dest)=CopyEntity(CoinMesh)
		EntityTexture ObjectEntity(Dest),GoldCoinTexture
		If ObjectType(Dest)=425 Then EntityTexture ObjectEntity(Dest),RetroRainbowCoinTexture
	Case "!Token"
		ObjectEntity(Dest)=CopyEntity(CoinMesh)
		EntityTexture ObjectEntity(Dest),TokenCoinTexture

	
	Case "!Key"
		ObjectEntity(Dest)=CreateKeyMesh(ObjectData(Dest,0))
	Case "!KeyCard"
		ObjectEntity(Dest)=CreateKeyCardMesh(ObjectData(Dest,0))
	Case "!Gem"
		ObjectEntity(Dest)=CopyEntity(GemMesh(ObjectData(Dest,0))) 
		EntityTexture ObjectEntity(Dest),TeleporterTexture(ObjectData(Dest,1))
		
	Case "!CustomItem"
		ObjectEntity(Dest)=CreateCustomItemMesh(ObjectData(Dest,0))
		
	Case "!Sign"
		
		ObjectEntity(Dest)=CopyEntity(SignMesh(ObjectData(Dest,0)))
		EntityTexture ObjectEntity(Dest),SignTexture(ObjectData(Dest,1))
		
	Case "!Barrel1"
			ObjectEntity(Dest)=CopyEntity(BarrelMesh)
			EntityTexture ObjectEntity(Dest),BarrelTexture1
			If ObjectSubType(Dest)=1
				If ObjectData(Dest,0)=0 Then EntityTexture ObjectEntity(Dest),BarrelTexture00
				If ObjectData(Dest,0)=1 Then EntityTexture ObjectEntity(Dest),BarrelTexture01
				If ObjectData(Dest,0)=2 Then EntityTexture ObjectEntity(Dest),BarrelTexture02
				If ObjectData(Dest,0)=3 Then EntityTexture ObjectEntity(Dest),BarrelTexture03
				If ObjectData(Dest,0)=4 Then EntityTexture ObjectEntity(Dest),BarrelTexture04
				If ObjectData(Dest,0)=5 Then EntityTexture ObjectEntity(Dest),BarrelTexture05
				If ObjectData(Dest,0)=6 Then EntityTexture ObjectEntity(Dest),BarrelTexture06
				If ObjectData(Dest,0)=7 Then EntityTexture ObjectEntity(Dest),BarrelTexture07
				If ObjectData(Dest,0)=8 Then EntityTexture ObjectEntity(Dest),BarrelTexture08
			EndIf
	Case "!Barrel2"
			ObjectEntity(Dest)=CopyEntity(BarrelMesh)
			EntityTexture ObjectEntity(Dest),BarrelTexture2

	Case "!Cuboid"
			ObjectEntity(Dest)=CreateCube()
			ScaleMesh ObjectEntity(Dest),0.4,0.4,0.4
			PositionMesh ObjectEntity(Dest),0,0.5,0
			If ObjectData(Dest,0)<0 Or ObjectData(Dest,0)>8 Then ObjectData(Dest,0)=0
			EntityTexture ObjectEntity(Dest),TeleporterTexture(ObjectData(Dest,0))




	Case "!ColourGate"
		

		ObjectEntity(Dest)=CreateColourGateMesh(ObjectData(Dest,2),ObjectData(Dest,0))
	Case "!Transporter"
		
		ObjectEntity(Dest)=CreateTransporterMesh(ObjectData(Dest,0),3)
	;	RotateMesh ObjectEntity(Dest),0,90*ObjectData(Dest,2),0

	Case "!Conveyor"
		convsize#=1.0
		If ObjectType(Dest)=45 
			convsize=1.1
		Else
			convsize=0.7
		EndIf
		
		If ObjectData(Dest,4)=4
			ObjectEntity(Dest)=CreateCloudMesh(convsize,ObjectData(Dest,0))
		Else
			ObjectEntity(Dest)=CreateTransporterMesh(ObjectData(Dest,0),ObjectData(Dest,4))
			If ObjectType(Dest)=46
				ObjectXScale(Dest)=.8
				ObjectYScale(Dest)=.8
			EndIf
		EndIf
		
	Case "!Button"
		CreateButtonMesh(Dest,ObjectSubType(Dest),ObjectData(Dest,0),ObjectData(Dest,1),ObjectData(Dest,2),ObjectData(Dest,3))
		
	Case "!SteppingStone"
		

		ObjectEntity(Dest)=CopyEntity(cylinder)

		EntityTexture ObjectEntity(Dest),SteppingStoneTexture(ObjectData(Dest,0))
		
	Case "!Teleport"
		

		ObjectEntity(Dest)=CreateTeleporterMesh(ObjectData(Dest,0))
		
	Case "!IceBlock"
		ObjectEntity(Dest)=CreateIceBlockMesh()
	Case "!IceFloat"
		ObjectEntity(Dest)=CreateIceFloatMesh()
	Case "!PlantFloat"
		ObjectEntity(Dest)=CreatePlantFloatMesh()
	Case "!Door"
		ObjectEntity(Dest)=CopyEntity(door013ds)	
	Case "!SpellBall"
		If complete=True 
			ObjectEntity(Dest)=CreateSpellBallMesh(ObjectSubType(Dest))
		Else
			Return
		EndIf
	Case "!Item"
		ObjectEntity(Dest)=CreatePickUpItemMesh(ObjectData(Dest,2))
		
	Case "!Fence1"
		ObjectEntity(Dest)=CopyEntity(fence1)
	Case "!Fence2"
		ObjectEntity(Dest)=CopyEntity(fence2)
	Case "!Fencepost"
		ObjectEntity(Dest)=CopyEntity(fencepost)
	Case "!Fountain"
		ObjectEntity(Dest)=CopyEntity(Fountain)

	Case "!Cylinder"
		ObjectEntity(Dest)=CopyEntity(cylinder)
	

	
	Case "!Square"
		ObjectEntity(Dest)=CopyMesh(square)	
		
	Case "!Retrolasergate"
		ObjectEntity(Dest)=CreateRetroLaserGateMesh(ObjectData(Dest,0))

	Case "!Retrobox"
		ObjectEntity(Dest)=CopyEntity(RetroBoxMesh)
	
	Case "!Retrocoily"
		ObjectEntity(Dest)=CopyEntity(RetroCoilyMesh)
		
	Case "!Retroscouge"
		ObjectEntity(Dest)=CopyEntity(RetroScougeMesh)
		ObjectYawAdjust(Dest)=(-90*ObjectData(Dest,0) +3600) Mod 360
		If ObjectSubType(Dest)=1 Then EntityTexture ObjectEntity(Dest),GreenScouge
	
	Case "!Retrozbot"
		ObjectEntity(Dest)=CopyEntity(RetroZbotMesh)
		ObjectYawAdjust(Dest)=(-90*ObjectData(Dest,0) +3600) Mod 360
	
	Case "!Retroufo"
		ObjectEntity(Dest)=CopyEntity(RetroUFOMesh)
		ObjectYawAdjust(Dest)=(-90*ObjectData(Dest,0) +3600) Mod 360
		
	Case "!Weebot"
		ObjectEntity(Dest)=CopyEntity(WeebotMesh)
		ObjectYawAdjust(Dest)=(-90*ObjectData(Dest,0) +3600) Mod 360
		
	Case "!Zapbot"
		ObjectEntity(Dest)=CopyEntity(ZapbotMesh)
		
		ObjectYawAdjust(Dest)=(-90*ObjectData(Dest,0) +3600) Mod 360
	Case "!Pushbot"
		ObjectEntity(Dest)=CreatePushbotMesh(ObjectData(Dest,0),ObjectData(Dest,3))
		ObjectYawAdjust(Dest)=0 ; done withing control

	Case "!ZbotNPC"
		ObjectEntity(Dest)=CopyEntity(ZbotNPCMesh)
		EntityTexture ObjectEntity(Dest),ZbotNPCTexture(ObjectData(Dest,2))
	
	Case "!None"
		ObjectEntity(Dest)=CreatePivot()
		
	
	

		
	
		
	Default
		; normal model
		ObjectEntity(Dest)=myLoadMesh(Objectmodelname$(Dest),0)
		
		
	End Select
	EndIf
	
	If ObjectType(Dest)=163 
		; special fix for windmill rotor
		PositionMesh ObjectEntity(Dest),0,-5.65/.037,1.25/.037
		
	EndIf
	
	
	
	If ObjectTextureName$(Dest)="!Door"
			If DoorTexture(ObjectData(Dest,5))=0 Then ObjectData(Dest,5)=0
			EntityTexture ObjectEntity(Dest),DoorTexture(ObjectData(Dest,5))
	Else If ObjectTextureName$(Dest)="!Cottage"
			If CottageTexture(ObjectData(Dest,5))=0 Then ObjectData(Dest,5)=0
			EntityTexture ObjectEntity(Dest),CottageTexture(ObjectData(Dest,5))	
	Else If ObjectTextureName$(Dest)="!Townhouse"
			If HouseTexture(ObjectData(Dest,5))=0 Then ObjectData(Dest,5)=0
			EntityTexture ObjectEntity(Dest),HouseTexture(ObjectData(Dest,5))	
	Else If ObjectTextureName$(Dest)="!Windmill"
			If WindmillTexture(ObjectData(Dest,5))=0 Then ObjectData(Dest,5)=0
			EntityTexture ObjectEntity(Dest),WindmillTexture(ObjectData(Dest,5))
	Else If ObjectTextureName$(Dest)="!Fence"
			If FenceTexture(ObjectData(Dest,5))=0 Then ObjectData(Dest,5)=0
			EntityTexture ObjectEntity(Dest),FenceTexture(ObjectData(Dest,5))	
	Else If ObjectTextureName$(Dest)="data\models\squares\firetrap.bmp"
			EntityTexture ObjectEntity(dest),FireTrapTex
	Else If ObjectTextureName$(Dest)="!GloveTex"
			EntityTexture ObjectEntity(dest),GloveTex
	Else If ObjectTextureName$(Dest)="!FireTrap"
			EntityTexture ObjectEntity(dest),FireTrapTexture


	
	Else If ObjectTextureName$(Dest)<>"" And ObjectTextureName$(Dest)<>""<>"!None" And Left$(ObjectTextureName$(Dest),1)<>"!"  And Objectmodelname$(Dest)<>"!Button"

		ObjectTexture(Dest)=myLoadTexture(ObjectTextureName$(Dest),4)
		If (ObjectTexture(Dest)<>0)
		
			EntityTexture ObjectEntity(Dest),ObjectTexture(Dest)
			For i=1 To CountChildren (ObjectEntity(Dest))
				EntityTexture GetChild(ObjectEntity(Dest),i),ObjectTexture(Dest)
			Next
		Else
			ObjectTexture(Dest)=0
		EndIf
	EndIf
	
	NofObjects=NofObjects+1
	Select ObjectModelName$(Dest)

	Case "!StinkerWee","!Scritter","!BabyBoomer","!RainbowBubble"
		CreateShadow(Dest,.5)
	Case "!Turtle","!Thwart","!Troll"
		CreateShadow(Dest,.9)
	Case "!Chomper","!Bowler","!Kaboom","!KaboomRTW"
		CreateShadow(Dest,.6)
	Case "!Crab"
		If ObjectSubType(Dest)=0
			CreateShadow(Dest,.5)
		Else
			CreateShadow(Dest,.9)
		EndIf
		
	Case "!FlipBridge"
		i=CreateNewObject()
		ObjectEntity(i)=CreateCylinder(32)
		ObjectXScale(i)=.35
		ObjectYScale(i)=.35
		ObjectZScale(i)=.35
		
		ObjectX(i)=ObjectX(Dest)
		ObjectY(i)=ObjectY(Dest)
		ObjectZ(i)=-.241
		EntityTexture ObjectEntity(i),CageTexture
	End Select
	
End Function


Function CopyObjectData(Source,Dest)
	
	Objectmodelname$(Dest)=Objectmodelname$(Source)
	Objecttexturename$(Dest)=Objecttexturename$(Source)
	ObjectXScale(Dest)=ObjectXScale(Source)
	ObjectYScale(Dest)=ObjectYScale(Source)
	ObjectZScale(Dest)=ObjectZScale(Source)
	ObjectXAdjust(Dest)=ObjectXAdjust(Source)
	ObjectYAdjust(Dest)=ObjectYAdjust(Source)
	ObjectZAdjust(Dest)=ObjectZAdjust(Source)
	ObjectPitchAdjust(Dest)=ObjectPitchAdjust(Source)
	ObjectYawAdjust(Dest)=ObjectYawAdjust(Source)
	ObjectRollAdjust(Dest)=ObjectRollAdjust(Source)


	
	ObjectExists(Dest)=ObjectExists(Source)	
	
	ObjectEntity(Dest)=ObjectEntity(Source)
	ObjectTexture(Dest)=ObjectTexture(Source)
	
	ObjectX(Dest)=ObjectX(Source)
	ObjectY(Dest)=ObjectY(Source)
	ObjectZ(Dest)=ObjectZ(Source)
	ObjectDX(Dest)=ObjectDX(Source)
	ObjectDY(Dest)=ObjectDY(Source)
	ObjectDZ(Dest)=ObjectDZ(Source)
	
	ObjectPitch(Dest)=ObjectPitch(Source)
	ObjectYaw(Dest)=ObjectYaw(Source)
	ObjectRoll(Dest)=ObjectRoll(Source)
	ObjectPitch2(Dest)=ObjectPitch2(Source)
	ObjectYaw2(Dest)=ObjectYaw2(Source)
	ObjectRoll2(Dest)=ObjectRoll2(Source)


	ObjectXGoal(Dest)=ObjectXGoal(Source)
	ObjectYGoal(Dest)=ObjectYGoal(Source)
	ObjectZGoal(Dest)=ObjectZGoal(Source)
	
	ObjectMovementType(Dest)=ObjectMovementType(Source)
	ObjectMovementTypeData(Dest)=ObjectMovementTypeData(Source)
	ObjectSpeed(Dest)=ObjectSpeed(Source)
	ObjectRadius(Dest)=ObjectRadius(Source)
	ObjectRadiusType(Dest)=ObjectRadiusType(Source)
	
	ObjectData10(Dest)=ObjectData10(Source)
	
	ObjectPushDX(Dest)=ObjectPushDX(Source)
	ObjectPushDY(Dest)=ObjectPushDY(Source)

	
	ObjectAttackPower(Dest)=ObjectAttackPower(Source)
	ObjectDefensePower(Dest)=ObjectDefensePower(Source)
	ObjectDestructionType(Dest)=ObjectDestructionType(Source)
	

	ObjectID(Dest)=ObjectID(Source)
	ObjectType(Dest)=ObjectType(Source)
	ObjectSubType(Dest)=ObjectSubType(Source)
	
	ObjectActive(Dest)=ObjectActive(Source)
	ObjectLastActive(Dest)=ObjectLastActive(Source)
	ObjectActivationType(Dest)=ObjectActivationType(Source)
	ObjectActivationSpeed(Dest)=ObjectActivationSpeed(Source)
	
	ObjectStatus(Dest)=ObjectStatus(Source)
	ObjectTimer(Dest)=ObjectTimer(Source)
	ObjectTimerMax1(Dest)=ObjectTimerMax1(Source)
	ObjectTimerMax2(Dest)=ObjectTimerMax2(Source)
	
	ObjectTeleportable(Dest)=ObjectTeleportable(Source)
	ObjectButtonPush(Dest)=ObjectButtonPush(Source)
	ObjectWaterReact(Dest)=ObjectWaterReact(Source)
	
	ObjectTelekinesisable(Dest)=ObjectTelekinesisable(Source)
	ObjectFreezable(Dest)=ObjectFreezable(Source)
	
	ObjectReactive(Dest)=ObjectReactive(Source)
	
	ObjectChild(Dest)=ObjectChild(Source)
	ObjectParent(Dest)=ObjectParent(Source)

	
	For k=0 To 9
		ObjectData(Dest,k)=ObjectData(Source,k)
	Next
	For k=0 To 3
		ObjectTextData$(Dest,k)=ObjectTextData$(Source,k)
	Next
	
	
	ObjectTalkable(Dest)=ObjectTalkable(Source)
	ObjectCurrentAnim(Dest)=ObjectCurrentAnim(Source)
	ObjectStandardAnim(Dest)=ObjectStandardAnim(Source)
	ObjectTileX(Dest)=ObjectTileX(Source)
	ObjectTileY(Dest)=ObjectTileY(Source)
	ObjectTileX2(Dest)=ObjectTileX2(Source)
	ObjectTileY2(Dest)=ObjectTileY2(Source)
	ObjectMovementTimer(Dest)=ObjectMovementTimer(Source)
	ObjectMovementSpeed(Dest)=ObjectMovementSpeed(Source)
	ObjectMoveXGoal(Dest)=ObjectMoveXGoal(Source)
	ObjectMoveYGoal(Dest)=ObjectMoveYGoal(Source)
	ObjectTileTypeCollision(Dest)=ObjectTileTypeCollision(Source)
	ObjectObjectTypeCollision(Dest)=ObjectObjectTypeCollision(Source)
	ObjectCaged(Dest)=ObjectCaged(Source)
	ObjectDead(Dest)=ObjectDead(Source)
	ObjectDeadTimer(Dest)=ObjectDeadTimer(Source)
	ObjectExclamation(Dest)=ObjectExclamation(Source)
	ObjectShadow(Dest)=ObjectShadow(Source)
	ObjectLinked(Dest)=ObjectLinked(Source)
	ObjectLinkBack(Dest)=ObjectLinkBack(Source)
	ObjectFlying(Dest)=ObjectFlying(Source)
	ObjectFrozen(Dest)=ObjectFrozen(Source)
	ObjectFutureInt23(Dest)=ObjectFutureInt23(Source)
	ObjectFutureInt24(Dest)=ObjectFutureInt24(Source)
	ObjectFutureInt25(Dest)=ObjectFutureInt25(Source)
	ObjectScaleAdjust(Dest)=ObjectScaleAdjust(Source)
	ObjectScaleXAdjust(Dest)=ObjectScaleXAdjust(Source)
	ObjectScaleYAdjust(Dest)=ObjectScaleYAdjust(Source)
	ObjectScaleZAdjust(Dest)=ObjectScaleZAdjust(Source)
	ObjectFutureFloat5(Dest)=ObjectFutureFloat5(Source)
	ObjectFutureFloat6(Dest)=ObjectFutureFloat6(Source)
	ObjectFutureFloat7(Dest)=ObjectFutureFloat7(Source)
	ObjectFutureFloat8(Dest)=ObjectFutureFloat8(Source)
	ObjectFutureFloat9(Dest)=ObjectFutureFloat9(Source)
	ObjectFutureFloat10(Dest)=ObjectFutureFloat10(Source)
	ObjectFutureString1$(Dest)=ObjectFutureString1$(Source)
	ObjectFutureString2$(Dest)=ObjectFutureString1$(Source)

	
	; move special objects
	If Source=PlayerObject
		PlayerObject=Dest
	EndIf
	If Source=StinkerObject
		StinkerObject=Dest
	EndIf
	If Source=CameraFocusObject
		CameraFocusObject=Dest
	EndIf
	If Source=TelekinesisObject
		TelekinesisObject=Dest
	EndIf
	If Source=DialogObject1
		DialogObject1=Dest
	EndIf
	If Source=DialogObject2
		DialogObject2=Dest
	EndIf
	If Source=PlayerTalkToGoalObject
		PlayerTalkToGoalObject=Dest
	EndIf

	
	

		; also deal with childless parents
		For j=0 To NofObjects
			If ObjectParent(j)=Source Then ObjectParent(j)=Dest
			If ObjectChild(j)=Source Then ObjectChild(j)=Dest
			If ObjectLinked(j)=Source Then ObjectLinked(j)=Dest
			If ObjectLinkBack(j)=Source Then ObjectLinkBack(j)=Dest
		Next


End Function




Function AdjustLevelTileLogic(x,y,i)

	

	; Based on Object #i being placed at spot x/y, check how the Level and Object TileLogic should be altered

	If ObjectFrozen(i)>0 
		Select ObjectType(i)
		Case 1,110,120,150,220,230,250,260, 290,370,380,390,391,400,420,421,422,423,430,431,432,433
			If (ObjectTileLogic(x,y) And 2^10) =0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^10
			EndIf
			Return
		End Select
	EndIf

	

	Select ObjectType(i)
	
	Case 1
		; Player
		If (ObjectTileLogic(x,y) And 2^1) =0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^1
		EndIf
	
	Case 10 
		; gates
		
		; done in control gates
		
	Case 30 
		; teleporter
		If ObjectActive(i)=1001 Then LevelTileLogic(x,y)=3
	
	Case 40
		; Stepping Stone

		If ObjectActive(i)=1001 
			LevelTileLogic(x,y)=4
		EndIf
	
		
 
	
	Case 80,81,82,83,84,85,86,87
		; Keyblocks
		
		If ObjectType(i)=80 Or ObjectType(i)=81 Or ObjectType(i)=86 Or ObjectType(i)=85
			
			LevelTileLogic(x,y)=1
		EndIf
		
	Case 90,91,92
		; buttons
		LevelTileLogic(x,y)=9
		
	Case 110,180,330
		; NPC Stinkers or signs
		If (ObjectTileLogic(x,y) And 2^2) =0 And ObjectActive(i)>0 And ObjectTalkable(i)>0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^2
		EndIf
		If (ObjectTileLogic(x,y) And 2^7) =0 And ObjectActive(i)>0 And ObjectTalkable(i)=0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^7
		EndIf
	
		If ObjectType(i)=180 Then LevelTileLogic(x,y)=1

		
	Case 120,400
		; Wee Stinkers, Baby Boomers
		If (ObjectTileLogic(x,y) And 2^3) =0 And ObjectActive(i)=1001
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^3
		EndIf



	Case 130
		; Wee Stinker Exit
		LevelTileLogic(x,y)=10
	
	Case 140
		; Cage
		If ObjectActive(i)=1001 Then LevelTileLogic(x,y)=11
	
	Case 150, 340
		; Scritters, Tentacles
		logic=2^5
		If ObjectSubType(i)=1 And ObjectType(i)=340 Then logic=logic+2^9
		If (ObjectTileLogic(x,y) And logic) =0 And ObjectActive(i)>1
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+logic
		EndIf
		
	Case 160 , 165
		If ObjectModelName$(i)="!Obstacle46"
			If (ObjectZAdjust(i)>-1 And ObjectZAdjust(i)<1) Then LevelTileLogic(x,y)=0
		
		ElseIf ObjectTextureName$(i)<>"!Cottage" And ObjectTextureName$(i)<>"!Townhouse" And ObjectModelName$(i)<>"!Obstacle50"

			; Obstacle
			; 160 - just the main tile
			LevelTileLogic(x,y)=1
			; 161 - nothing (eg waterfalls)
		EndIf
		
		
	
	
	Case 170,171,172,173,174,175,176,177,178,179,425
		; Item
		
		If (ObjectTileLogic(x,y) And 2^4) =0 And ObjectActive(i)=1001
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^4
		EndIf
	Case 210
		; Transporter
		; first put in old water or lava
		
		LevelTileLogic(x,y)=4
		If (ObjectTileLogic(x,y) And 2^6) =0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^6
		EndIf

		
	Case 220
		; Turtle
		If ObjectStatus(i)<2
			If (ObjectTileLogic(x,y) And 2^7) =0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^7
			EndIf
		Else
			If (ObjectTileLogic(x,y) And 2^6) =0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^6
			EndIf
			LevelTileLogic(x,y)=0
		EndIf

	

		
	Case 230,310,432
		; FireFlower, Thwart, Zapbot
		If (ObjectTileLogic(x,y) And 2^7) =0 And ObjectActive(i)>0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^7
		EndIf
	Case 290,380,390,433
		; thwart, Troll, Kaboom
		If ObjectTalkable(i)>0
			If (ObjectTileLogic(x,y) And 2^2) =0 And ObjectActive(i)>0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^2
			EndIf
			
		Else
			If (ObjectTileLogic(x,y) And 2^7) =0 And ObjectActive(i)>0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^7
			EndIf


		EndIf






















	Case 250,260,420,422,423,430,431,151,391
		; Bowlers, Chompers, Zbots
		If (ObjectTileLogic(x,y) And 2^8) =0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^8
		EndIf
		
	Case 240,241,242, 350
		; Boxes, Grow Flowers
		If (ObjectTileLogic(x,y) And 2^9) =0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^9
	
	
		EndIf
	
	Case 300
		; Ice Float
		If LevelTileLogic(x,y)=2 And ObjectData(i,0)=0
			LevelTileLogic(x,y)=14
		EndIf
		
	Case 370
		; Turtle, Crab
		If ObjectStatus(i)<2
			If ObjectData(i,1)>1 ; sleeping
				If (ObjectTileLogic(x,y) And 2^7) =0
					ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^7
				EndIf
			Else	
				If (ObjectTileLogic(x,y) And 2^5) =0
					ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^5
				EndIf
			EndIf
		Else
					
			If (ObjectTileLogic(x,y) And 2^6) =0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^6
			EndIf
		
			LevelTileLogic(x,y)=0
		EndIf
		
		
	Case 410
		; flipbridge
		LevelTileLogic(x,y)=0
		If ObjectActive(i)>0 And ObjectActive(i) Mod 2 =1
			; active
			Select ObjectData(i,2)
			Case 0,4
				dx=0
				dy=-1
				k=3
			Case 1,5
				dx=1
				dy=-1
				k=2
			Case 2,6
				dx=1
				dy=0
				k=3
			Case 3,7
				dx=1
				dy=1
				k=2
			End Select
			
			For j=1 To k
				ObjectData(i,3)=LevelTileLogic(x-j*dx,y-j*dy)
				LevelTileLogic(x-j*dx,y-j*dy)=0
				LevelTileLogic(x+j*dx,y+j*dy)=0
			Next
		EndIf
						

	 
	

	
	End Select

End Function


Function ControlObjects()

	
	
	Entity=CameraPick(camera,MouseX(),MouseY())
	If Entity>0
		MousePickX#=PickedX()
		MousePickY#=-PickedZ()
	EndIf


	NofWeeStinkersFollowingLast=NofWeeStinkersFollowing
	NofWeeStinkersFollowing=0
	GrowFlowerFlag=False
	
	For i=0 To NofObjects-1
		
		If ObjectExists(i)=True And ObjectReactive(i)=True
		
			
			
		
		
			; *****************************
			; Visual and Logical Activation/Deactivation
			; (must come before specifics)
			; (ObjectLastActive comes at end)
			; *****************************
			
			; Adjust Value
			If ObjectActive(i)>0 And ObjectActive(i) Mod 2 = 0
				; deactivating
				ObjectActive(i)=ObjectActive(i)-ObjectActivationSpeed(i)
			Else If ObjectActive(i)<1001 And ObjectActive(i) Mod 2=1
				; activating
				ObjectActive(i)=ObjectActive(i)+ObjectActivationSpeed(i)
				
			EndIf
			If ObjectActive(i)<0 	ObjectActive(i)=0
			If ObjectActive(i)>1001 ObjectActive(i)=1001
			
			If ObjectLastActive(i)=0 And ObjectActive(i)>0
				If ObjectType(i)=110 Or ObjectType(i)=290 Or ObjectType(i)=60 Or ObjectType(i)=330 Or ObjectType(i)=230 Or ObjectType(i)=380 Or ObjectType(i)=390 Or ObjectType(i)=433
					; turn on npc, thwart, iceblock, flower
					OccupyObjectTile(i,ObjectTileX(i),ObjectTileY(i))
				EndIf
			EndIf
			If ObjectLastActive(i)>0 And ObjectActive(i)=0
				If ObjectType(i)=110 Or ObjectType(i)=290 Or ObjectType(i)=60 Or ObjectType(i)=230 Or ObjectType(i)=330 Or ObjectType(i)=380 Or ObjectType(i)=390 Or ObjectType(i)=433
					; turn off npc, thwart, iceblock, flower
					VacateObjectTile(i)
					If ObjectMovementTimer(i)>0 And (ObjectTileX2(i)<>ObjectTileX(i) Or ObjectTIleY2(i)<>ObjectTIleY(i))
						x1=ObjectTileX(i)
						y1=ObjectTileY(i)
						ObjectTileX(i)=ObjectTileX2(i)
						ObjectTileY(i)=ObjectTileY2(i)
						VacateObjectTile(i)
						ObjectTileX(i)=x1
						ObjectTileY(i)=y1
					EndIf

				EndIf
			EndIf
			
			; Get Scale
			ObjXScale#=ObjectXScale(i)*ObjectScaleXAdjust(i)
			ObjYScale#=ObjectYScale(i)*ObjectScaleYAdjust(i)
			ObjZScale#=ObjectZScale(i)*ObjectScaleZAdjust(i)

			
			; Select Visual Animation	
			Select ObjectActivationType(i)
			Case 0
				; nothing
			Case 1
				; Scale Vertical 0-1
				ObjZScale=ObjZScale*Float(ObjectActive(i))/1001.0
			
			
			Case 2
				; scale all directions 0-1
				ObjXScale=ObjXScale*Float(ObjectActive(i))/1001.0
				ObjYScale=ObjYScale*Float(ObjectActive(i))/1001.0
				ObjZScale=ObjZScale*Float(ObjectActive(i))/1001.0
			Case 3
				; scale planar only
				ObjXScale=ObjXScale*Float(ObjectActive(i))/1001.0
				ObjYScale=ObjYScale*Float(ObjectActive(i))/1001.0


			Case 11
				; push up from -1.01 to -0.01
				ObjectZ#(i)=-0.99+Float(ObjectActive(i))/1001.0
				
			Case 12,13,14,15,16
				; push up from -x.01 to -5.01 (used for stepping stones)
				ObjectZ#(i)=-(ObjectActivationType(i)-6)-.01+(ObjectActivationType(i)-11)*Float(ObjectActive(i))/1001.0
			Case 17 ; *** THESE ONLY WORK FOR AUTODOORS - OBJECTTILEX MUST BE PRE_SET
				; push north
				ObjectY#(i)=ObjectTileY(i)+0.5-ObjectYScale(i)*(0.99-Float(ObjectActive(i))/1001.0)
			Case 18
				; push East
				ObjectX#(i)=ObjectTileX(i)+0.5+ObjectXScale(i)*(0.99-Float(ObjectActive(i))/1001.0)

			Case 19
				; push south
				ObjectY#(i)=ObjectTileY(i)+0.5+ObjectYScale(i)*(0.99-Float(ObjectActive(i))/1001.0)

			Case 20
				; push west
				ObjectX#(i)=ObjectTileX(i)+0.5-ObjectXScale(i)*(0.99-Float(ObjectActive(i))/1001.0)

			
			
			Case 21
				; Fade in
				EntityAlpha ObjectEntity(i),Float(ObjectActive(i))/1001.0
										
			Case 31
				; push down from 1.01 to 0.01
				ObjectZ#(i)=1.01-Float(ObjectActive(i))/1001.0
				
			Case 41
				; rotate out (doors)
				ObjectYaw#(i)=-160+160*Float(ObjectActive(i))/1001.0

			
					
			End Select
		
			
			
			; **********************************************************
			;
			; MOVEMENT
			; 
			; 
			; **********************************************************
			
			If ObjectCaged(i)=False And ObjectDead(i)=0
				If ObjectMovementTimer(i)=0
					; Even if just standing, check what you're standing on
					EndMoveTileCheck(i,ObjectTileX(i),ObjectTileY(i))
					; And Accept Possible New Movement Commands
					ControlMoveObject(i)				
				EndIf
				
				If ObjectMovementTimer(i)>0
					; Object is in movement - complete it.
					ObjectDuringMove(i)
					
				EndIf
			EndIf
			
			
			
		
			
			; *****************************

			; Specific Controls
			; *****************************

			Select ObjectType(i)
			
			Case 0
				; Nothing
			Case 1
				; Player
				ControlPlayer(i)
			Case 10
				; Gates
				ControlGate(i)
			Case 11,426
				ControlStarGate(i)
			Case 20
				; Traps
				ControlTrap(i)
			Case 30
				; Teleporters
				ControlTeleporter(i)
			Case 40
				; Stepping Stones
				ControlSteppingStone(i)		
				
			Case 45
				; Conveyor
				ControlConveyor(i)
			Case 46
				; ConveyorTail
				ControlConveyorTail(i)
			Case 50
				; SpellBall
				ControlSpellBall(i)
				
			Case 60, 805
				; IceBlock
				ControlIceBlock(i)
			Case 70
				; PickUpItem
				ControlPickUpItem(i)
			Case 71
				; UsedItem
				ControlUsedItem(i)
			Case 80,81,82,83,84,85,86,87
				; Keyblocks
				ControlKeyBlock(i)
			Case 90;,91,92,93,94,95,96,97,98,99
				; Buttons
				ControlButton(i)
			Case 100
				; Accessories
				ControlAccessory(i)
			Case 101
				; Shadow
				ControlShadow(i)
			Case 110,111,112,113,114,115,116,117,118,119
				; NPCs
				ControlNPC(i)
			Case 120
				; Wee Stinkers
				ControlStinkerWee(i)
				
			Case 130
				; StinkerExit
				ControlStinkerWeeExit(i)
			Case 140
				; Cage
				ControlCage(i)
			Case 150 
				; Scritter
				ControlScritter(i)
			Case 151
				ControlRainbowBubble(i)
			Case 160
				; Obstacle
				; (no control, but used to adjust leveltilelogic)
				If ObjectModelName$(i)="!Obstacle03" ; volcano
					If Rand(0,40)=0
						AddParticle(Rand(24,26),ObjectX(i)+Rnd(-.7,.7),1.8+ObjectZAdjust(i),-ObjectY(i)+Rnd(-.9,.7),0,.2,0,Rnd(0.01,0.03),0,0,.03,0,0,0,100,3)
					EndIf
					If Rand(0,10)=0
						If Rand(0,5)=0
							part22=1
						Else
							part22=0
						EndIf
						AddParticle(part22,ObjectX(i)+Rnd(-.3,.3),1.5+ObjectZAdjust(i),-ObjectY(i)+Rnd(-.5,.3),0,.6,0,Rnd(0.01,0.03),0,0,.01,0,0,0,100,3)
					EndIf
				Else If ObjectModelName$(i)="!Obstacle04" ; acid pool
					If Rand(0,100)=0
						AddParticle(27,ObjectX(i)+Rnd(-.5,.5),1+ObjectZAdjust(i),-ObjectY(i)+Rnd(-.7,.5),0,.11,0,Rnd(0.01,0.03),0,0,.01,0,0,0,100,3)
					EndIf
					If Rand(0,100)=0
						AddParticle(35,ObjectX(i)+Rnd(-.3,.6),2.0+ObjectZAdjust(i),-ObjectY(i)+Rnd(-.6,.3),0,.04,0,0,0,0,.001,0,0,0,100,4)
					EndIf
					
				Else If ObjectModelName$(i)="!Obstacle45" ; waterwheel
					If ObjectYawAdjust(i)=0
						ObjectRoll(i)=ObjectRoll(i)+2
					EndIf
					If ObjectYawAdjust(i)=180
						ObjectRoll(i)=ObjectRoll(i)-2
					EndIf
					If ObjectYawAdjust(i)=90
						ObjectPitch(i)=ObjectPitch(i)+2
					EndIf
					If ObjectYawAdjust(i)=270
						ObjectPitch(i)=ObjectPitch(i)-2
					EndIf
				
				Else If ObjectModelName$(i)="!Obstacle48" ; UFO - by mistake in here
					If ObjectData(i,0)=0 Then ObjectYaw(i)=ObjectYaw(i)+1
				Else If ObjectModelName$(i)="!Crystal" ; UFO - by mistake in here
					ObjectYaw(i)=ObjectYaw(i)+1

				EndIf					
			Case 161
				; waterfall sprinkles
				If leveltimer Mod 60=0
	  			    PlaySoundFX(120,ObjectX(i),ObjectY(i))
				EndIf
				If Rand(0,200)=1 
					SoundPitch soundfx(124),Rand(18000,24000)
					PlaySoundFX(124,ObjectX(i),ObjectY(i))
				EndIf
				
				If Rand(0,100)=1
					SoundPitch soundfx(125),Rand(18000,24000)
					PlaySoundFX(125,ObjectX(i),ObjectY(i))
				EndIf
				
				If ObjectYawAdjust(i)=0
					k1=1
					k2=0
				EndIf
				
				If ObjectYawAdjust(i)=90
					k1=0
					k2=1
				EndIf
				If ObjectYawAdjust(i)=-90 Or ObjectYawAdjust(i)=270
					k1=0
					k2=-1
				EndIf

				If Rand(0,100)<10  	
					AddParticle(5,ObjectX(i)+k1*Rnd(-.5*ObjectXScale(i),.5*ObjectXScale(i))+k2*Rnd(0.55,0.6),ObjectZAdjust(i),-ObjectY(i)+k2*Rnd(-.5*ObjectXScale(i),.5*ObjectXScale(i))-k1*Rnd(0.55,0.6),0,.11,k1*Rnd(-.005,0.005)+k2*Rnd(0,.005),Rnd(0.01,0.03),-k1*Rnd(0,.001)+k2*Rnd(-.005,0.005),0,0,0,-0.0004,0,100,3)
				EndIf

				If Rand(0,100)<3 
					AddParticle(6,ObjectX(i)+k1*Rnd(-.5*ObjectXScale(i),.5*ObjectXScale(i))+k2*Rnd(0.65,0.7),Rnd(ObjectZAdjust(i),ObjectZAdjust(i)+ObjectZScale(i)/2.0),-ObjectY(i)+k2*Rnd(-.5*ObjectXScale(i),.5*ObjectXScale(i))-k1*0.6,0,.5,k2*Rnd(0,0.005),Rnd(0.01,0.02),0,0,.01,0,0,0,100,3)
				EndIf
				If Rand(0,100)<10 
					AddParticle(4,ObjectX(i)+k1*Rnd(-.35*ObjectXScale(i),.35*ObjectXScale(i))+k2*0.5,(-.2*ObjectZScale(i))+ObjectZAdjust(i),-ObjectY(i)+k2*Rnd(-.35*ObjectXScale(i),.35*ObjectXScale(i))-k1*0.5,0,.2,0,0,0,0,.012,0,0,0,100,4)
				EndIf

			Case 162
				
			Case 163
				; windmill rotor
				If ObjectYawAdjust(i)=0 Or ObjectYawAdjust(i)=180
					ObjectRoll(i)=ObjectRoll(i)+1
				Else 
					ObjectPitch(i)=ObjectPitch(i)+1
				EndIf
				ObjectZAdjust(i)=5.65
			Case 164
				; fountain
				If ObjectActive(i)>0
					AddParticle(ObjectData(i,0),ObjectTileX(i)+.5,ObjectZAdjust(i)+.5,-ObjectTileY(i)-.5,0,.1,Rnd(-.01,.01),Rnd(.07,.099),Rnd(-.01,.01),0,.001,0,-.001,0,150,3)
				EndIf
			Case 165
				; arcade machine
			

			Case 170
				; GoldStars
				ControlGoldStar(i)
			Case 171,174
				; GoldCoins
				ControlGoldCoin(i)
			Case 172
				; Keys
				ControlKey(i)
			Case 173
				; Gems
				ControlGem(i)
			Case 179
				; Custom
				ControlCustomItem(i)
			Case 180
				; Signs/Messages
				ControlSigns(i)
			Case 190
				ControlParticleEmitters(i)
			Case 200
				ControlGloveCharge(i)
			Case 210
				ControlTransporter(i)
			Case 220
				ControlTurtle(i)
			Case 230
				ControlFireFlower(i)
			
			Case 242 ;!Cuboid

				ObjectXScale(i)=.9+.1*Sin((LevelTimer*2) Mod 360)
				ObjectYScale(i)=.9+.1*Sin((LevelTimer*2) Mod 360)
				ObjectZScale(i)=.9+.1*Sin((LevelTimer*2) Mod 360)
				
				If ObjectData(i,1)<>0 ObjectYaw(i)=ObjectYaw(i)+1

			Case 250
				ControlChomper(i)
			Case 260
				ControlBowler(i)
			Case 270
				ControlButterfly(i)
			Case 271
				ControlZipper(i)
			Case 280
				ControlSpring(i)
			Case 281
				ControlSucTube(i)
			Case 282
				ControlSucTubeX(i)

			Case 290 
				ControlThwart(i)
			Case 300
				ControlIceFloat(i)
			Case 301
				ControlPlantFloat(i)
			Case 310
				ControlRubberducky(i)
			Case 320
				ControlVoid(i)
			Case 330
				ControlWisp(i)
			Case 340
				ControlTentacle(i)
			Case 350
				ControlGrowFlower(i)
				GrowFlowerFlag=True
			Case 360
				ControlFlashBubble(i)
			Case 370 
				ControlCrab(i)
			Case 380
				ControlTroll(i)
			Case 390
				ControlKaboom(i)
			Case 391
				ControlRTWKaboom(i)
			Case 400
				ControlBabyBoomer(i)
			Case 410
				ControlFlipBridge(i)
				
			Case 420
				ControlRetroCoily(i)
			Case 421
				ControlRetroScouge(i)
				
			Case 422,423,430,431
				ControlRetroZbotUfo(i)
			Case 424
				ControlRetroLaserGate(i)
			Case 425
				ControlRetroRainbowCoin(i)
			Case 432
				ControlPushbot(i)
			Case 433
				ControlZbotNPC(i)
			Case 450
				ControlLurker(i)
			Case 460
				ControlBurstFlower(i)
			Case 470
				ControlGhost(i)
			Case 471
				ControlWraith(i)
			End Select
		
			
			
		
			; ******************************
			;
			; Object Visual Placement
			; (if it exists)
			;
			; ******************************
		
			
			
			If ObjectEntity(i)>0
			
				ScaleEntity ObjectENtity(i),ObjXScale,ObjZScale,ObjYScale
			
				If (ObjectTileX(i)<>0 Or ObjectTIleX2(i)<>0 Or ObjectTileY(i)<>0 Or ObjectTIleY2(i)<>0) And ObjectModelName$(i)<>"!SpellBall" And ObjectType(i)<>270 And ObjectType(i)<>271 And ObjectType(i)<>434


					If ObjectType(i)=10 And (ObjectSubType(i)=1 Or ObjectSubType(i)=2 Or ObjectSubType(i)=3 Or ObjectSubType(i)=4 Or ObjectSubType(i)=9)
						; house door or dungeon door or autodoor
						; do nothing - done in activation
					Else If ObjectLinked(i)>=0 
						ObjectX(i)=ObjectX(ObjectLinked(i))
						ObjectY(i)=ObjectY(ObjectLinked(i))
						
					Else
						
						ObjectX(i)=ObjectTileX(i)+0.5+Float((ObjectTileX2(i)-ObjectTileX(i))*ObjectMovementTimer(i))/1000.0
						ObjectY(i)=ObjectTileY(i)+0.5+Float((ObjectTileY2(i)-ObjectTileY(i))*ObjectMovementTimer(i))/1000.0
					EndIf
				EndIf
			
				If ObjectType(i)=230; Or ObjectType(i)=220
					; adjustment for fireflower position
					xadjust#=-26.0
					yadjust#=0.0
					PositionEntity ObjectEntity(i),ObjectX(i)+ObjectXAdjust(i)+ObjectXScale(i)*xadjust*Cos(ObjectYaw(i))+ObjectYScale(i)*yadjust*Sin(ObjectYaw(i)),ObjectZ(i)+ObjectZAdjust(i),-ObjectY(i)-ObjectYAdjust(i)+ObjectXScale(i)*xadjust*Sin(ObjectYaw(i))-ObjectYScale(i)*yadjust*Cos(ObjectYaw(i))
				Else If ObjectType(i)=220; Or ObjectType(i)=220
					; adjustment for fireflower position
					xadjust#=-22.0
					yadjust#=0.0
					PositionEntity ObjectEntity(i),ObjectX(i)+ObjectXAdjust(i)+ObjectXScale(i)*xadjust*Cos(ObjectYaw(i))+ObjectYScale(i)*yadjust*Sin(ObjectYaw(i)),ObjectZ(i)+ObjectZAdjust(i),-ObjectY(i)-ObjectYAdjust(i)+ObjectXScale(i)*xadjust*Sin(ObjectYaw(i))-ObjectYScale(i)*yadjust*Cos(ObjectYaw(i))
				Else If ObjectType(i)=60 ; ice block
					If ObjectChild(i)>=0
													
						PositionEntity ObjectEntity(i),ObjectX(ObjectChild(i))+ObjectXAdjust(ObjectChild(i)),ObjectZ(ObjectChild(i))+ObjectZAdjust(ObjectChild(i)),-ObjectY(ObjectChild(i))-ObjectYAdjust(ObjectChild(i)),0
					EndIf
				Else
					PositionEntity ObjectEntity(i),ObjectX(i)+ObjectXAdjust(i),ObjectZ(i)+ObjectZAdjust(i),-ObjectY(i)-ObjectYAdjust(i)
				EndIf
				If ObjectType(i)=100
					; hat/accessory
					RotateEntity ObjectEntity(i),ObjectPitch(i),ObjectYaw(i),ObjectRoll(i)
				Else
					
	;				RotateEntity ObjectEntity(i),ObjectPitch(i),ObjectYaw(i),ObjectRoll(i)
					
					RotateEntity ObjectEntity(i),0,0,0
	
					TurnEntity ObjectEntity(i),ObjectPitch(i)+ObjectPitchAdjust(i),0,ObjectRoll(i)+ObjectRollAdjust(i)
					TurnEntity ObjectEntity(i),0,ObjectYaw(i)+ObjectYawAdjust(i),0
					
					TurnEntity ObjectEntity(i),ObjectPitch2(i),ObjectYaw2(i),ObjectRoll2(i)
					If ObjectModelName$(i)="!Troll" Or ObjectModelName$(i)="!Crab" 
						TurnEntity ObjectEntity(i),0,-90,0
					EndIf
					If ObjectModelName$(i)="!Kaboom" Or ObjectModelName$(i)="!BabyBoomer"
						TurnEntity ObjectEntity(i),0,90,0
					EndIf
				EndIf
	
			EndIf
		
			
			
					
		
		
			; special Objects (Camera, Player, etc)
			
			If i=PlayerObject
				PositionEntity SpotLight,ObjectX(i),5,-ObjectY(i)-3
			EndIf
			
			
			
			; ***********************************
			;
			; Final Updates
			;
			; ***********************************
			
			ObjectLastActive(i)=ObjectActive(i)
			
		EndIf		
	Next
	
	If GrowFlowerFlag=False Then GlobalGrowFlowerCounter=0
	If CameraShakeTimer>0
		CameraShakeX#=Rnd(-.1,.1)
		CameraShakeY#=Rnd(-.1,.1)
		CameraShakeTimer=CameraShakeTimer-1
	EndIf
	; Camera Placement
	
	If GameMode<>12 Or (CurrentMenu<>10 And CurrentMenu<>21 And CurrentMenu<>23) ; not in cutscene
		If CurrentCharm<>3 Or LevelTimer<50 Or LevelTimer>=1000000000			 
			If KeyDown(82)
				PositionEntity Camera,ObjectX(CameraFocusObject),5,-ObjectY(CameraFocusObject)-3.5
			Else
				If LevelTimer<50
					; entering level
					PositionEntity Camera,ObjectX(CameraFocusObject)+CameraAddXCurrent,12+CameraAddYCurrent-10.0+Float(Leveltimer)/5.0,-ObjectY(CameraFocusObject)-10+10.0-Float(LevelTimer)/5.0+CameraAddZCurrent;11
				Else If LevelTimer>=1000000000 And LevelTimer<1000001000
					; leaving level
					PositionEntity Camera,ObjectX(CameraFocusObject)+CameraAddXCurrent,12+CameraAddYCurrent-Float(Leveltimer-1000000000)/4.5,-ObjectY(CameraFocusObject)-10+Float(LevelTimer-1000000000)/5.0+CameraAddZCurrent;11
				Else If LevelTimer>=1000001000 And LevelTimer<1000002000
					; Adventure Won
					PositionEntity Camera,ObjectX(CameraFocusObject)+CameraAddXCurrent,12+CameraAddYCurrent-Float(Leveltimer-1000001000)/180.0,-ObjectY(CameraFocusObject)-10+Float(LevelTimer-1000001000)/200.0+CameraAddZCurrent;11
				Else If LevelTimer>=1000002000 And LevelTimer<1000003000
					; Adventure Lost
					PositionEntity Camera,AdventureLostCameraX+CameraAddXCurrent,12+CameraAddYCurrent,AdventureLostCameraY-10+CameraAddZCurrent
				
				Else
					; Normal In-Level
					PositionEntity Camera,ObjectX(CameraFocusObject)+CameraAddXCurrent+CameraShakeX,12+CameraAddYCurrent+CameraShakeY,-ObjectY(CameraFocusObject)-10+CameraAddZCurrent;11
				EndIf
			EndIf
		Else
			mpx#=MousePickX
			mpy#=MousePickY
			If mpx<0 Then mpx=0
			If mpy<0 Then mpy=0
			If mpx>Float(LevelWidth) Then mpx=Float(LevelWidth)
			If mpy>Float(LevelHeight) Then mpy=Float(LevelHeight)
			PositionEntity Camera,(mpx+(mpx+ObjectX(CameraFocusObject))/2.0)/2.0,12,-(mpy+(mpy+ObjectY(CameraFocusObject))/2.0)/2.0-10
		EndIf
	EndIf
	
	
	
	
	; Now do Object Cleanup
	
	
	NofDeleted=0
	For i=0 To NofObjects-1
		If ObjectExists(i)=False
			; delete this object
		
			If ObjectEntity(i)>0 
				FreeEntity ObjectEntity(i)
				ObjectEntity(i)=0
			EndIf
			If ObjectTexture(i)>0 
				FreeTexture ObjectTexture(i)
				ObjectTexture(i)=0
			EndIf
			NofDeleted=NofDeleted+1
		Else If NofDeleted>0
			CopyObjectData(i,i-NofDeleted)
		EndIf
	Next
	NofObjects=NofObjects-NofDeleted
	
	
	
 
	
	
	; Other Stuff
	
	; Scroll Teleporters
	For i=0 To 9
		If TeleporterTexture(i)>0
			PositionTexture TeleporterTexture(i),0,-Float((LevelTimer/3) Mod 100)/100.0
		EndIf
	Next
	
	
End Function

Function ActivateObject(i)
	; turns object toward activation (unless it's already active)
	If objectactive(i)=0 And (objecttype(i)=330 Or objecttype(i)=110)
		x=ObjectTileX(i)
		y=ObjectTileY(i)
		If ObjectTalkable(i)>0
			If (ObjectTileLogic(x,y) And 2^2) =0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^2
			EndIf
		Else
			If (ObjectTileLogic(x,y) And 2^7) =0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^7
			EndIf
		EndIf
		
	EndIf
	
	If ObjectActive(i)<1001 And ObjectActive(i) Mod 2 =0
	
		; special case for flipbridge
		If ObjectType(i)=410
			ActivateFlipBridge(i)
		Else
		
			ObjectActive(i)=ObjectActive(i)+ObjectActivationSpeed(i)+1
			
			
		EndIf	
		If ObjectActive(i)>1001 Then ObjectActive(i)=1001
		
	EndIf
	If ObjectType(i)=281 Then Redosuctubemesh(i)
End Function
Function DeActivateObject(i)
	; turns object toward deactivation (unless it's already deactive)
	If ObjectType(i)=330 Then VacateObjectTile(i)

; special case for flipbridge
	

	If ObjectActive(i)>0 And ObjectActive(i) Mod 2 =1
		If ObjectType(i)=410
			DeActivateFlipBridge(i)
		Else
			ObjectActive(i)=ObjectActive(i)-ObjectActivationSpeed(i)-1
		
		EndIf
	EndIf
	If ObjectActive(i)<0 Then ObjectActive(i)=0
	If ObjectType(i)=281 Then Redosuctubemesh(i)

End Function

Function ToggleObject(i)
	; switches objects from activating to deactivating or vice versa
	If ObjectActive(i)<1001 And ObjectActive(i) Mod 2 =0
		If ObjectType(i)=410
			ActivateFlipBridge(i)
		Else
			ObjectActive(i)=ObjectActive(i)+ObjectActivationSpeed(i)+1
			
		EndIf
		If ObjectActive(i)>1001 Then ObjectActive(i)=1001
	Else If ObjectActive(i)>0 And ObjectActive(i) Mod 2 =1
		If ObjectType(i)=410
			DeActivateFlipBridge(i)
		Else
			ObjectActive(i)=ObjectActive(i)-ObjectActivationSpeed(i)-1
			
		EndIf
	EndIf
	If ObjectType(i)=281 Then Redosuctubemesh(i)
	
End Function

Function DestroyObject(i,k)

	; k - special destruction type
	; 0 - regular, 1 - firetrap, 2 - water, 3 - lava, 4 - ice

	If ObjectDead(i)>0 Or objectexists(i)=False Return
	
	If i=PlayerObject And LevelTimer>=1000000000 Then Return

		
	; hitpoints - fireflower
	If ObjectType(i)=230 And ObjectData(i,3)>1
		ObjectData(i,3)=ObjectData(i,3)-1
		Return
	EndIf
	
	; increase score
	If ObjectType(i)=230 Or ObjectType(i)=250 Or ObjectType(i)=260
		AddParticle(15,ObjectTileX(i)+0.5,1.6,-ObjectTileY(i)-0.5,0,1,0,0.01,0,0,.01,0,0,0,50,3)
		PlayerScore=PlayerScore+250
		CurrentAdventureScore=CurrentAdventureScore+250
	EndIf
		

		
	x=ObjectTileX(i)
	y=ObjectTileY(i)
	
	VacateObjectTile(i) ;***BIG CHANGE***
	If ObjectMovementTimer(i)>0 And (ObjectTileX2(i)<>ObjectTileX(i) Or ObjectTIleY2(i)<>ObjectTIleY(i))
		ObjectTileX(i)=ObjectTileX2(i)
		ObjectTileY(i)=ObjectTileY2(i)
		VacateObjectTile(i) ;***BIG CHANGE***

	EndIf
	If ObjectType(i)=210 And ObjectLinkBack(i)>=0; transporter with something on it
		ObjectTileX(ObjectLinkBack(i))=ObjectTileX2(i)
		ObjectTileY(ObjectLinkBack(i))=ObjectTileY2(i)

		VacateObjectTile(ObjectLinkBack(i))
		ObjectTileX(ObjectLinkBack(i))=x
		ObjectTileY(ObjectLinkBack(i))=y

		DestroyObject(ObjectLinkBack(i),0)
	EndIf
	
	; destroy any shadows immediately
	;	(by looking For objects that have this guy as their parent
	;		- this allows multiple children)
	For j=0 To NofObjects-1
		If ObjectParent(j)=i And ObjectTYpe(j)=101
			DestroyObject(j,0)
		EndIf
	Next

		
	
	; Special cases
	
	
	If ObjectType(i)=423 Or ObjectTYpe(i)>=430 And ObjectType(i)<=433 And ObjectType(i)<>432
		NofZBotsInAdventure=NofZbotsInAdventure-1
	EndIf
	
	
	Select ObjectTYpe(i)
	Case 1
		; Player
		PlayerControlMode=0
		If objectfrozen(i)=0
			If k=0
				PlaySoundFX(Rand(150,151),-1,-1)
				AdventureLostReason$="Better Watch Your Step!"
				Animate GetChild(objectentity(i),3),1,.5,11
				ObjectDead(i)=1
				ObjectDeadTimer(i)=0
			Else If k=1
				PlaySoundFX(Rand(150,151),-1,-1)

				AdventureLostReason$="Careful... Stinkers Are Flammable!"
				Animate GetChild(objectentity(i),3),1,.5,9
				EntityTexture GetChild(ObjectEntity(i),3),StinkerSmokedTexture
				ObjectDead(i)=2
				ObjectDeadTimer(i)=0
				
				For j=1 To 360
					a#=Rnd(0.1,0.2)
					AddParticle(Rand(16,23),ObjectX(i)+Rnd(-.2,.2),ObjectZ(i)+.5,-ObjectY(i)+Rnd(-.2,.0),0,0.8,Rnd(-0.12,0.12),Rnd(0,0.12),Rnd(-0.12,0.12),5,0,0,0,0,75,3)
				Next
			Else If k=2
				PlaySoundFX(152,-1,-1)

				AdventureLostReason$="Careful... Stinkers Are Not Waterproof!"
				Animate GetChild(objectentity(i),3),1,.5,11
				ObjectDead(i)=3
				ObjectDeadTimer(i)=0
				AddParticle(4,ObjectX(i),-0.2,-ObjectY(i),0,0.8,0,0,0,0,.01,0,0,0,200,4)
	
			EndIf
			
			
			Return
		Else
			PlaySoundFX(Rand(150,151),-1,-1)

			AdventureLostReason$="Better Watch Your Step!"
			Animate GetChild(objectentity(i),3),1,.5,11
			ObjectDead(i)=1
			ObjectDeadTimer(i)=0
		EndIf
		
	Case 110
		;Stinker NPCs
		PlaySoundFX(Rand(150,151),-1,-1)

		AdventureLostReason$="You Must Protect All Stinkers From Harm!"
		AdventureLostCameraX=ObjectX(i)
		AdventureLostCameraY=-ObjectY(i)
		AdventureLost()
		
		; delete accessories!
		For j=0 To NofObjects-1
			If ObjectParent(j)=i And ObjectTYpe(j)=100
				DestroyObject(j,0)
			EndIf
		Next

			

	
	Case 120
		;Wee Stinkers
		AdventureLostReason$="You Must Protect The Wee Stinkers From Harm!"
		AdventureLostCameraX=ObjectX(i)
		AdventureLostCameraY=-ObjectY(i)
		AdventureLost()
		
		NofWeeStinkersInAdventure=NofWeeStinkersInAdventure-1
		
		If Objectfrozen(i)=0
			If k=2
				; sinking
				PlaySoundFX(67,-1,-1)
				AnimateMD2 ObjectEntity(i),1,0.5,161,180,1 
				ObjectDead(i)=3
				ObjectDeadTimer(i)=0
				AddParticle(4,ObjectX(i),-.2,-ObjectY(i),0,0.8,0,0,0,0,.01,0,0,0,200,3)
			
			Else
				; anything else
				PlaySoundFX(65,-1,-1)
				AnimateMD2 ObjectEntity(i),1,0.5,161,180,1 
				ObjectDead(i)=1
				ObjectDeadTimer(i)=0
				For j=0 To 360 Step 2
					a#=Rnd(0.7,1.5)
					AddParticle(Rand(16,23),ObjectX(i),ObjectZ(i)+.5,-ObjectY(i),0,0.4,a*0.12*Sin(j),0,a*0.12*Cos(j),5,.001,-a*0.0021*Sin(j),0,-a*0.0021*Cos(j),75,3)
				Next
	
				
	
			
			EndIf
			
			Return
		EndIf
		
	Case 150
		; Scritter
		NofScrittersInAdventure=NofScrittersInAdventure-1
		PlaySoundFX(15,-1,-1)
	Case 151
		; Rainbowbubble
		PlaySoundFX(15,ObjectTIleX(i),ObjectTIleY(i))
		PlaySoundFX(124,ObjectTIleX(i),ObjectTIleY(i))

		If ObjectMovementTimer(i)>250
			x=ObjectTileX2(i)
			y=ObjectTileY2(i)
		Else
			x=ObjectTileX(i)
			y=ObjectTIleY(i)
		EndIf
		If LevelTileLogic(x,y)=2 And ObjectTileLogic(x,y)=0
			CreatePlantFloat(x,y)
		EndIf
		
	Case 230
		; FireFlower
		NofFireFlowersInAdventure=NofFireFlowersInAdventure-1
		PlaySoundFX(105,ObjectTIleX(i),ObjectTIleY(i))
	Case 241
		; TNT Barrel
		;Delay 1000
		For j=0 To 7
			CreateSpellBall	(ObjectX(i),ObjectY(i),.7,0.02*Sin(j*45),0.02*Cos(j*45),1,ObjectX(i)+2*Sin(j*45),ObjectY(i)+2*Cos(j*45),False,50)
		Next	
		CameraShakeTimer=4
	Case 391
		;RTWBoom
		;Delay 1000
		For j=0 To 7
			CreateSpellBall	(ObjectX(i),ObjectY(i),.7,0.02*Sin(j*45),0.02*Cos(j*45),1,ObjectX(i)+2*Sin(j*45),ObjectY(i)+2*Cos(j*45),False,50)
		Next	
		CameraShakeTimer=4
	Case 242
		; Cuboid
		CameraShakeTimer=4
		PlaySoundFX(110,ObjectTIleX(i),ObjectTIleY(i))

		NofBricksInAdventure=NofBricksInAdventure-1
		If ObjectData(i,2)>0
			ActivateCommand(ObjectData(i,2),ObjectData(i,3),ObjectData(i,4),ObjectData(i,5),ObjectData(i,6))
		EndIf
		
	Case 220,250,260,290
		; turtle,chomper,bowler,thwart
		If (WAEpisode<>1 Or AdventureCurrentNumber<>70) ; unless in blue shard level or WA1
			PlaySoundFX(15,-1,-1)
		EndIf
	Case 240
		If ObjectSubType(i)=1 Then PlaySoundFX(15,-1,-1)
	Case 340
	For j=0 To NofObjects-1
		If (ObjectX(i)-ObjectX(j))^2+(ObjectY(i)-ObjectY(j))^2 <.3 And ObjectExists(j)=True And ObjectActive(j)>0
			If ObjectType(j)=360 Then DestroyObject(j,0)
		EndIf
	Next
	Case 370
		NofCrabsInAdventure=NofCrabsInAdventure-1
		
	Case 390
		;Kaboom!s
		PlaySoundFX(Rand(150,151),-1,-1)

		AdventureLostReason$="You Must Protect All Kaboom!s From Harm!"
		AdventureLostCameraX=ObjectX(i)
		AdventureLostCameraY=-ObjectY(i)
		AdventureLost()
		
		; delete accessories!
		For j=0 To NofObjects-1
			If ObjectParent(j)=i And ObjectTYpe(j)=100
				DestroyObject(j,0)
			EndIf
		Next
		
		
	Case 400
		;Kaboom!s
		PlaySoundFX(Rand(150,151),-1,-1)

		AdventureLostReason$="You Must Protect All Kaboom!s From Harm!"
		AdventureLostCameraX=ObjectX(i)
		AdventureLostCameraY=-ObjectY(i)
		AdventureLost()
		
		NofBabyBoomersInAdventure=NofBabyBoomersInAdventure-1
		
		If Objectfrozen(i)=0
			If k=2
				; sinking
				;PlaySoundFX(67,-1,-1)
				AnimateMD2 ObjectEntity(i),1,4,1,30 
				ObjectDead(i)=3
				ObjectDeadTimer(i)=0
				AddParticle(4,ObjectX(i),-.2,-ObjectY(i),0,0.8,0,0,0,0,.01,0,0,0,200,3)
			
			Else
				; anything else
				;PlaySoundFX(65,-1,-1)
				AnimateMD2 ObjectEntity(i),0,1,1,3,1 
				ObjectDead(i)=1
				ObjectDeadTimer(i)=0
				For j=0 To 360 Step 2
					a#=Rnd(0.7,1.5)
					AddParticle(Rand(16,23),ObjectX(i),ObjectZ(i)+.5,-ObjectY(i),0,0.4,a*0.12*Sin(j),0,a*0.12*Cos(j),5,.001,-a*0.0021*Sin(j),0,-a*0.0021*Cos(j),75,3)
				Next
	
				
	
			
			EndIf
			
			Return
		EndIf

	Case 420,421,422,423,430,431,432,433,470,471
		PlaySoundFX(15,ObjectTIleX(i),ObjectTIleY(i))
	Case 450
		;lurker: extra particle explosion
		If NofParticles<500 
			k=100
		Else If NofParticles<1000
			k=30
		Else
			k=15
		EndIf
		For j=0 To k
			AddParticle(8,ObjectX(i),ObjectZ(i)+0.5,-ObjectY(i),0,.92,Rnd(-.05,.05),Rnd(0.01,0.07),Rnd(-.05,.05),1,0,0,0,0,Rand(50,150),3)
		Next
	Case 460
		PlaySoundFX(104,ObjectTIleX(i),ObjectTIleY(i))
	
	End Select
	
	
	

	; Default destruction:

	ObjectExists(i)=False	
	
	Select ObjectDestructionType(i)
	
	Case 0
		;nothing
	Case 1
		

		;particle explosion
		If NofParticles<500 
			k=100
		Else If NofParticles<1000
			k=30
		Else
			k=15
		EndIf
		For j=0 To k
			AddParticle(3,ObjectX(i),ObjectZ(i)+0.5,-ObjectY(i),0,.2,Rnd(-.05,.05),Rnd(0,0.05),Rnd(-.05,.05),1,0,0,0,0,Rand(50,150),3)
		Next
		
	Case 2
		;reverse tentacle explosion
		For j=0 To 44
				AddParticle(2,ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,.01*2*Cos(j*8),0,.01*2*Sin(j*8),0,.001,0,0,0,100,3)
				AddParticle(2,ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,0,.01*2*Cos(j*8),.01*2*Sin(j*8),0,.001,0,0,0,100,3)
				AddParticle(2,ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,.01*2*Cos(j*8),.01*2*Sin(j*8),0,0,.001,0,0,0,100,3)
			Next
	
	End Select
	
	; if bound by telekinesis, release
	If TelekinesisActive=True And TelekinesisObject=i
		TelekinesisActive=False
		LastPLayerControl=3
		ObjectDX(i)=0
		ObjectDY(i)=0
	EndIf
	
	; if ice-block, also destroy the object within
	If (ObjectType(i)=60 Or ObjectType(i)=805) And ObjectChild(i)>=0
		DestroyObject(ObjectChild(i),0)
	EndIf
	
		
	
	If ObjectParent(i)>=0 
		If ObjectChild(ObjectParent(i))=i Then ObjectChild(ObjectParent(i))=-1
	EndIf
	If ObjectChild(i)>=0 
		If ObjectParent(objectChild(i))=i Then ObjectParent(ObjectChild(i))=-1
	EndIf
	If ObjectLinkBack(i)>=0
		If ObjectLinked(ObjectLinkBack(i))=i Then ObjectLinked(ObjectLinkBack(i))=-1
	EndIf
	If ObjectLinked(i)>=0
		If ObjectLinkBack(ObjectLinked(i))=i Then ObjectLinkBack(ObjectLinked(i))=-1
	EndIf

		
	
	If PlayerTalkToGoalObject=i
		PlayerTalkToGoalObject=-2
	EndIf

	

End Function

Function CanObjectMoveToTile(i,x,y,CheckDiagonal,FinalDestination)

	

	; CheckDiagonal - True if we want to see if a diagonal move is blocked on corners
	; FinalDestination - True if this is the last step (in which case e.g. we are allowed to step on teleporters and trampolines)
	;					Note that non-AStar movements will always treat each step as a final step
	
	If ObjectLinked(i)>=0 Then Return False 

	OTTC=ObjectTileTypeCollision(i)
	
	; Is Flying/icing? Can go over/into water and lava!
	If ObjectFlying(i)>0 And ((OTTC And 2^2) =0) Then OTTC=OTTC+2^2
	
	; Check: Out of Bounds?
	If x<0 Or y<0 Or x>=LevelWidth Or y>=LevelHeight
		Return False
	EndIf

	; Next check what tiles can be stepped on
	; Check the Objects Bit-List of Walkable Tiletypes
	Tile=LevelTileLogic(x,y)
	If (OTTC And Int(2^Tile))=0
		; goal is a non-walkable tile for this object
		Return False
	EndIf
	If FinalDestination=False
		; Special Cases: can also not move onto Teleporters, Trampolines, and other displacement devices
		If Tile=3 Then Return False
	EndIf
	
	; and check if not occupied by non-walkable object
	Obj=ObjectTileLogic(x,y)
	
	If Obj>0 And ((ObjectObjectTypeCollision(i) And Obj)<>Obj)
		; goal is occpied by a non-walkable object 
		Return False
	EndIf

	
	; Now check diagonal moves across tiles, but only if 'checkdiagonal' is true (e.g. not necessary for teleportation)
	If CheckDiagonal=True
		If Abs(ObjectTileX(i)-x)=1 And Abs(ObjectTileY(i)-y)=1
			; making a diagonal move
			; corners cannot be walls
			If (OTTC And 2) =0	; unless object can walk through walls
				If LevelTileLogic(ObjectTileX(i),y)=1 Or LevelTileLogic(x,ObjectTileY(i))=1
					Return False
				EndIf
			EndIf
			;Or ice walls
			If (OTTC And 2) =0	; unless object can walk through walls
				If LevelTileLogic(ObjectTileX(i),y)=13 Or LevelTileLogic(x,ObjectTileY(i))=13
					Return False
				EndIf
			EndIf

			; or water
		;	If (OTTC And 4) =0	; unless object can walk through water
		;		If LevelTileLogic(ObjectTileX(i),y)=2 Or LevelTileLogic(x,ObjectTileY(i))=2
		;			Return False
		;		EndIf
		;	EndIf

		EndIf
	EndIf
	
	; check for Weebots - stay on same texture
	If (ObjectType(i)=430 And ObjectData(i,4)=1) Or (ObjectType(i)=431 And ObjectData(i,4)=1)  Or (ObjectType(i)=422 And ObjectData(i,4)=1) ;;Or (ObjectType(i)=423 And ObjectData(i,4)=1) Or (ObjectType(i)=391 And ObjectData(i,4)=1)
		If LevelTileTexture(x,y)<>ObjectData(i,9) Return False
	EndIf
	
	If (ObjectType(i)=423 And ObjectData(i,4)>0)
		;special case for tile zbots
		If LevelTileTexture(x,y)+1<>ObjectData(i,4) Return False
		
	EndIf
	
	If (ObjectType(i)=432 And ObjectData(i,4)>0)
		;special case for tile moobots
		If LevelTileTexture(x,y)+1<>ObjectData(i,4) Return False
		
	EndIf
	
	If (ObjectType(i)=250 And ObjectData(i,1)=3 And ObjectData(i,4)>0)
		;special case for tile chomper
		If LevelTileTexture(x,y)+1<>ObjectData(i,4) Return False
		
	EndIf
	
	If (ObjectType(i)=220 And ObjectData(i,4)>0)
		;special case for tile turtle
		If LevelTileTexture(x,y)+1<>ObjectData(i,4) And LevelTileLogic(x,y)<>2 Then Return False
		
	EndIf
	
	If (ObjectType(i)=391 And ObjectData(i,4)>0)
		;special case for tile rtw kaboom
		If LevelTileTexture(x,y)+1<>ObjectData(i,4) And LevelTileLogic(x,y)<>2 Then Return False
		
	EndIf
	
	; All Clear - phew!
	Return True
	

End Function


Function ControlMoveObject(i)

	If ObjectFlying(i)/10 = 1	; bounced by spring
		dx=0
		dy=0
		If ObjectFlying(i) Mod 10 >=1 And ObjectFlying(i) Mod 10<=3 Then dx=1
		If ObjectFlying(i) Mod 10 >=5 And ObjectFlying(i) Mod 10<=7 Then dx=-1
		If ObjectFlying(i) Mod 10 >=3 And ObjectFlying(i) Mod 10<=5 Then dy=1
		If ObjectFlying(i) Mod 10 >=7 Or ObjectFlying(i) Mod 10<=1 Then dy=-1
		x=ObjectTileX(i)
		y=ObjectTileY(i)
		If CanObjectMoveToTile(i,x+dx,y+dy,True,True)
			MoveObjectToTile(i,x+dx,y+dy)
			
		Else
			ObjectFlying(i)=0
			

			ObjectMoveXGoal(i)=ObjectTileX(i)
			ObjectMoveYGoal(i)=ObjectTileY(i)
			If ObjectType(i)=120 PlaySoundFX(70,ObjectTileX(i),ObjectTileY(i))
			If ObjectType(i)=432 ObjectMovementType(i)=0
		EndIf
		Return
	EndIf
	
	If ObjectFlying(i)/10 = 2	; on ice
		dx=0
		dy=0
		If ObjectFlying(i) Mod 10 >=1 And ObjectFlying(i) Mod 10<=3 Then dx=1
		If ObjectFlying(i) Mod 10 >=5 And ObjectFlying(i) Mod 10<=7 Then dx=-1
		If ObjectFlying(i) Mod 10 >=3 And ObjectFlying(i) Mod 10<=5 Then dy=1
		If ObjectFlying(i) Mod 10 >=7 Or ObjectFlying(i) Mod 10<=1 Then dy=-1
		x=ObjectTileX(i)
		y=ObjectTileY(i)
		If CanObjectMoveToTile(i,x+dx,y+dy,True,True) And (LevelTileLogic(x,y)=11 Or LevelTileLogic(x,y)=12 Or LevelTileLogic(x,y)=14)
			MoveObjectToTile(i,x+dx,y+dy)
		Else
			ObjectFlying(i)=0
			ObjectMoveXGoal(i)=ObjectTileX(i)
			ObjectMoveYGoal(i)=ObjectTileY(i)
			If ObjectType(i)=432 ObjectMovementType(i)=0
		EndIf
		If ObjectType(i)=432
			If dy=-1 ObjectData(i,2)=0
			If dx=1 ObjectData(i,2)=1
			If dy=1 ObjectData(i,2)=2
			If dx=-1 ObjectData(i,2)=3
		EndIf
		Return
	EndIf


	If ObjectFrozen(i)>0		; frozen
	
		Return
		
	EndIf

		
	
	
	
	
	Select ObjectMovementType(i)
	
	Case 10,11,12, 13,14,15, 16,17,18
		;	
		; AStar Algorithm Toward ObjectMoveXGoal/ObjectMoveYGoal with Tolerance 0,1,2 and grouped into high/med/low quality search
		; 	Will Avoid Teleporters etc unless that is final goal.
		;	If A* Path exists will take it (will try with diagonal shortcuts but not along walls)
		;	If no A* Path exists will take one step closest to goal (if exists)
		Tolerance=(ObjectMovementType(i)-10) Mod 3
		; Check if at the MoveGoal (with Tolerance given by ObjectMovementType(i)-10), if not, try to walk toward it.
		
		If Abs(ObjectTileX(i)-ObjectMoveXGoal(i))>Tolerance Or Abs(ObjectTileY(i)-ObjectMoveYGoal(i))>Tolerance
			; Not at goal, need to keep moving
			
			; First, see if next to goal and we can move onto it (double check diagonal):
			If Abs(ObjectTileX(i)-ObjectMoveXGoal(i))<=1 And Abs(ObjectTileY(i)-ObjectMoveYGoal(i))<=1 And CanObjectMoveToTile(i,ObjectMoveXGoal(i),ObjectMoveYGoal(i),True,True)=True
				; got one, and can move diagonally toward it
				MoveObjectToTile(i,ObjectMoveXGoal(i),ObjectMoveYGoal(i))
		
			Else If ObjectMovementTypeData(i)>0
				; Not right next to goal - would do an A* search toward goal, but
				; we are currently in holding pattern because of previously unsuccessful search
				ObjectMovementTypeData(i)=ObjectMovementTypeData(i)-1
			
			Else
						
				; Not right next to goal - do an A* Algorithm toward Goal
				If ObjectMovementType(i)<13
					; high-quality search (really just player)
					AStar(i,ObjectTileX(i),ObjectTileY(i),ObjectMoveXGoal(i),ObjectMoveYGoal(i),3,400,ObjectMovementType(i)-10)
				Else If ObjectMovementType(i)<16
					; med-quality search 
					AStar(i,ObjectTileX(i),ObjectTileY(i),ObjectMoveXGoal(i),ObjectMoveYGoal(i),3,200,ObjectMovementType(i)-13)
				Else
					; low-quality search 
					AStar(i,ObjectTileX(i),ObjectTileY(i),ObjectMoveXGoal(i),ObjectMoveYGoal(i),3,75,ObjectMovementType(i)-16)

				EndIf
				
				If AStarPathNode(1)=-1 And (ObjectType(i)=120 Or ObjectType(i)=400)
					; special case for stinkers/boomers - see if you can find a path ignoring other stinkers. If so, take it
					ObjectObjectTypeCollision(i)=ObjectObjectTypeCollision(i)+2^3
					AStar(i,ObjectTileX(i),ObjectTileY(i),ObjectMoveXGoal(i),ObjectMoveYGoal(i),3,200,1)
					ObjectObjectTypeCollision(i)=ObjectObjectTypeCollision(i)-2^3
				EndIf
				
				If AStarPathNode(1)=-1
					
					; no path exists
					; Simply walk toward goal if possible
					; Find walkable Tile that is closest to goal
					; Default is Current Position
					LowDistance=(ObjectTileX(i)-ObjectMoveXGoal(i))^2+(ObjectTileY(i)-ObjectMoveYGoal(i))^2
					LowX2=0
					LowY2=0
					For x2=-1 To 1
						For y2=-1 To 1
							If CanObjectMoveToTile(i,ObjectTileX(i)+x2,ObjectTileY(i)+y2,True,False)
								If (ObjectTileX(i)+x2-ObjectMoveXGoal(i))^2+(ObjectTileY(i)+y2-ObjectMoveYGoal(i))^2<LowDistance
									; found a closer walkable tile
									LowDistance=(ObjectTileX(i)+x2-ObjectMoveXGoal(i))^2+(ObjectTileY(i)+y2-ObjectMoveYGoal(i))^2
									LowX2=x2
									LowY2=y2
								EndIf
							EndIf
						Next
					Next
					
					If LowX2<>0 Or LowY2<>0
						; actually found a better move - take it
						
						MoveObjectToTile(i,ObjectTileX(i)+LowX2,ObjectTileY(i)+LowY2)
						If ObjectType(i)=1 PlayerCancelMove=0
					
					
					Else
					
					ObjectMovementTypeData(i)=30
					If ObjectType(i)=1
						PlayerCancelMove=PlayerCancelMove+1
						If PlayerCancelMove>=20
							ObjectMoveXGoal(i)=ObjectTileX(i)
							ObjectMoveYGoal(i)=ObjectTileY(i)
							PlayerCancelMove=0
						EndIf
					EndIf
				EndIf

				Else
			
			For num=3 To 1 Step -1
			If ((Abs(astarx(astarpathnode(num))-objecttilex(i))<=1 And (Abs(astary(astarpathnode(num))-objecttiley(i))<=1)) And (canobjectmovetotile(i,astarx(astarpathnode(num)),astary(astarpathnode(num)),1,0)=1))
				MoveObjectToTile(i,AStarX(AStarPathNode(num)),AStarY(AStarPathNode(num)))
				num=-3
			EndIf
			Next
			If num>-3 Then ObjectMovementTypeData(i)=30
				
				
			EndIf
			
			EndIf
			
		EndIf
		
	Case 20
		; Follow PlayerPath
		
		; See if there is a Walkable Tile with a lower PlayerPath than your own tile nearby
		MyScore=LevelTilePlayerPathScore(ObjectTileX(i),ObjectTileY(i))
		
		
		MoveX=-1
		
		For i2=-1 To 1
			For j2=-1 To 1
				x=ObjectTileX(i)+i2
				y=ObjectTileY(i)+j2
				If LevelTilePlayerPathScore(x,y)<MyScore
					
					; better score
					If CanObjectMoveToTile(i,x,y,True,False)=True
						; and we can move there
						; Take it!
						MyScore=LevelTilePlayerPathScore(x,y)
						MoveX=x
						MoveY=y
						
					EndIf
				EndIf
			Next
		Next
		If MoveX<0
			; no better move was found (might be because e.g. a teleporter is blocking the path
			; so check if a better move can be found one step away
			For i2=-1 To 1
				For j2=-1 To 1
					x=ObjectTileX(i)+i2
					y=ObjectTileY(i)+j2

					If CanObjectMoveToTile(i,x,y,True,False)=True
						; must be walkable
						; now check if a "further" tile has a lower score
						If (i2+j2) Mod 2 = 0
							; diagonal - check three spots around corner
							If LevelTilePlayerPathScore(x+i2,y+j2)< MyScore
								MyScore=LevelTilePlayerPathScore(x,y)
								MoveX=x
								MoveY=y
							EndIf 
							If LevelTilePlayerPathScore(x+0,y+j2)< MyScore
								MyScore=LevelTilePlayerPathScore(x,y)
								MoveX=x
								MoveY=y
							EndIf 
							If LevelTilePlayerPathScore(x+i2,y+0)< MyScore
								MyScore=LevelTilePlayerPathScore(x,y)
								MoveX=x
								MoveY=y
							EndIf 
						Else If i2=0
							; vertical - check three spots along a row
							
							If LevelTilePlayerPathScore(x-1,y+j2)< MyScore
								MyScore=LevelTilePlayerPathScore(x,y)
								MoveX=x
								MoveY=y
							EndIf 
								
							If LevelTilePlayerPathScore(x+0,y+j2)< MyScore
								MyScore=LevelTilePlayerPathScore(x,y)
								MoveX=x
								MoveY=y
							EndIf 
								
							If LevelTilePlayerPathScore(x+1,y+j2)< MyScore
								MyScore=LevelTilePlayerPathScore(x,y)
								MoveX=x
								MoveY=y
							EndIf 
						Else If j2=0
							; horizontal - check three spots along a column
							
							If LevelTilePlayerPathScore(x+i2,y-1)< MyScore
								MyScore=LevelTilePlayerPathScore(x,y)
								MoveX=x
								MoveY=y
							EndIf 
								
							If LevelTilePlayerPathScore(x+i2,y+0)< MyScore
								MyScore=LevelTilePlayerPathScore(x,y)
								MoveX=x
								MoveY=y
							EndIf 
								
							If LevelTilePlayerPathScore(x+i2,y+1)< MyScore
								MyScore=LevelTilePlayerPathScore(x,y)
								MoveX=x
								MoveY=y
							EndIf 
						EndIf
					EndIf
				Next
			Next
		EndIf

					
		If MoveX>=0
			MoveObjectToTile(i,Movex,Movey)
		EndIf
		
	Case 30,31,32,33,34;,35,36,37,38,39
		; Avoid Player 	once closer than 2,3,4,5,6 tiles
		If Abs(ObjectTileX(i)-ObjectTileX(PlayerObject))<ObjectMovementType(i)-29 And Abs(ObjectTileY(i)-ObjectTileY(PlayerObject))<ObjectMovementType(i)-29
			; too close
			
			; special case for female crab - switch to longer distance
			If ObjectType(i)=370 And ObjectSubType(i)=1 Then ObjectMovementType(i)=33
			; first, if player/object line up, move directly in that direction, if possible
			x2=-1
			y2=-1
			If ObjectTileX(i)=ObjectTileX(PlayerObject)
				If ObjectTileY(i)>ObjectTileY(PlayerObject)
					; move south
					If CanObjectMoveToTile(i,ObjectTileX(i),ObjectTileY(i)+1,True,True)=True
						x2=ObjectTileX(i)
						y2=ObjectTileY(i)+1
					EndIf
				Else
					; move south
					If CanObjectMoveToTile(i,ObjectTileX(i),ObjectTileY(i)-1,True,True)=True
						x2=ObjectTileX(i)
						y2=ObjectTileY(i)-1
					EndIf
				EndIf
			Else If ObjectTileY(i)=ObjectTileY(PlayerObject)
				If ObjectTileX(i)>ObjectTileX(PlayerObject)
					; move east
					If CanObjectMoveToTile(i,ObjectTileX(i)+1,ObjectTileY(i),True,True)=True
						x2=ObjectTileX(i)+1
						y2=ObjectTileY(i)
					EndIf
				Else
					; move west
					If CanObjectMoveToTile(i,ObjectTileX(i)-1,ObjectTileY(i),True,True)=True
						x2=ObjectTileX(i)-1
						y2=ObjectTileY(i)
					EndIf
				EndIf
			EndIf

			
			; didn't find a spot, then
			; find walkable spot that is furthest away
			If x2=-1
				Dist=(ObjectTileX(i)-ObjectTileX(PlayerObject))^2+(ObjectTileY(i)-ObjectTileY(PlayerObject))^2
				a=1
				b=1
				If Rand(0,100)<50 a=-1
				If Rand(0,100)<50 b=-1
				
				For x=-1 To 1 
					For y=-1 To 1
						; check surrounding tiles for empty field
						If CanObjectMoveToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b,True,True)=True
							; found a walkable one
							If Dist<(ObjectTileX(i)+x*a-ObjectTileX(PlayerObject))^2+(ObjectTileY(i)+y*b-ObjectTileY(PlayerObject))^2
								x2=ObjectTileX(i)+x*a
								y2=ObjectTileY(i)+y*b
								Dist=(ObjectTileX(i)+x*a-ObjectTileX(PlayerObject))^2+(ObjectTileY(i)+y*b-ObjectTileY(PlayerObject))^2
	
							EndIf
						EndIf
					Next
				Next
			EndIf
			If x2>-1 ; found a goal - take it
				MoveObjectToTile(i,x2,y2)
			EndIf
			
		Else
			; special case for female crab - switch to shorter distance
			If ObjectType(i)=370 And ObjectSubType(i)=1 Then ObjectMovementType(i)=32
	
			
		EndIf

	Case 41,42,43,44,45,46,47,48
		; find preferred direction
		dx=0
		dy=0
		If ObjectMovementType(i)=41 Or ObjectMovementType(i)=42
			dy=-1
		Else If ObjectMovementType(i)=43 Or ObjectMovementType(i)=44
			dx=1
		Else If ObjectMovementType(i)=45 Or ObjectMovementType(i)=46
			dy=1
		Else If ObjectMovementType(i)=47 Or ObjectMovementType(i)=48
			dx=-1
		EndIf
		flag=False ; changed direction?
		
		If CanObjectMoveToTile(i,ObjectTileX(i)+dx,ObjectTileY(i)+dy,True,True)=True
			MoveObjectToTile(i,	ObjectTileX(i)+dx,ObjectTileY(i)+dy)
			
		Else 
			
			; try left/right
			If ObjectMovementType(i) Mod 2 = 1 ;left
				a=dx
				dx=dy
				dy=-a
			Else	; right
				a=dx
				dx=-dy
				dy=a
			EndIf
			
			If CanObjectMoveToTile(i,ObjectTileX(i)+dx,ObjectTileY(i)+dy,True,True)=True
				
				MoveObjectToTile(i,	ObjectTileX(i)+dx,ObjectTileY(i)+dy)
				flag=True
				
			Else 
			
				; still can't try other way
				dx=-dx
				dy=-dy
			
				If CanObjectMoveToTile(i,ObjectTileX(i)+dx,ObjectTileY(i)+dy,True,True)=True
					
					MoveObjectToTile(i,	ObjectTileX(i)+dx,ObjectTileY(i)+dy)
					flag=True
				Else
				
					; still can't - try reversing as a final direction
					If ObjectMovementType(i) Mod 2 = 0 
						a=dx
						dx=dy
						dy=-a
					Else	
						a=dx
						dx=-dy
						dy=a
					EndIf
					
					If CanObjectMoveToTile(i,ObjectTileX(i)+dx,ObjectTileY(i)+dy,True,True)=True
				
						MoveObjectToTile(i,	ObjectTileX(i)+dx,ObjectTileY(i)+dy)
						flag=True
					EndIf
				EndIf
			EndIf
	
		EndIf
		; and what is our way now?
		If flag=True
			If dx=0 And dy=-1
				ObjectMovementType(i)=((ObjectMovementType(i)-41) Mod 2)+41
			Else If dx=1 And dy=0
				ObjectMovementType(i)=((ObjectMovementType(i)-41) Mod 2)+43
			Else If dx=0 And dy=1
				ObjectMovementType(i)=((ObjectMovementType(i)-41) Mod 2)+45
			Else If dx=-1 And dy=0
				ObjectMovementType(i)=((ObjectMovementType(i)-41) Mod 2)+47
			EndIf
			
		EndIf
	Case 51,52,53,54,55,56,57,58
		; swimming turtle
		dx=0
		dy=0
		If ObjectMovementType(i)=51 Or ObjectMovementType(i)=52
			dy=-1
		Else If ObjectMovementType(i)=53 Or ObjectMovementType(i)=54
			dx=1
		Else If ObjectMovementType(i)=55 Or ObjectMovementType(i)=56
			dy=1
		Else If ObjectMovementType(i)=57 Or ObjectMovementType(i)=58
			dx=-1
		EndIf
		
		If LevelTileLogic(ObjectTileX(i)+dx,ObjectTileY(i)+dy)=2 And (ObjectTileLogic(ObjectTileX(i)+dx,ObjectTileY(i)+dy) And 2^6) =0 And (ObjectTileLogic(ObjectTileX(i)+dx,ObjectTileY(i)+dy) And 2^7) =0


			; can continue swimming in direction
			MoveObjectToTile(i,	ObjectTileX(i)+dx,ObjectTileY(i)+dy)
		Else
			; no -surface
			AnimateMD2 ObjectEntity(i),3,.2,31,49
			ObjectCurrentAnim(i)=2
			VacateObjectTile(i)
			ObjectStatus(i)=2
			OccupyObjectTile(i,ObjectTileX(i),ObjectTileY(i))
			ObjectMovementType(i)=ObjectMovementType(i)+10
			AddParticle(4,ObjectX(i),-.2,-ObjectY(i),0,0.8,0,0,0,0,.01,0,0,0,200,4)
		EndIf
	
	Case 61,62,63,64, 65,66,67,68
		; no movement - but keeping data about direction/orientation
		

	Case 71,73,75,77
		; bounce movement straight (north,east,south,west)
		dx=0
		dy=0
		Select ObjectMovementType(i)
		Case 71
			dy=-1
		Case 73
			dx=1
		Case 75
			dy=1
		Case 77
			dx=-1
		End Select
		
		If CanObjectMoveToTile(i,ObjectTileX(i)+dx,ObjectTileY(i)+dy,True,True)=True
			MoveObjectToTile(i,	ObjectTileX(i)+dx,ObjectTileY(i)+dy)
		Else If CanObjectMoveToTile(i,ObjectTileX(i)-dx,ObjectTileY(i)-dy,True,True)=True
			MoveObjectToTile(i,	ObjectTileX(i)-dx,ObjectTileY(i)-dy)
			ObjectMovementType(i)=(((ObjectMovementTYpe(i)-71)+4) Mod 8)+71
		EndIf

	Case 72,74,76,78
		; bounce movement diagonal (northeast,southeast,southwest,northwest)
		dx=0
		dy=0
		Select ObjectMovementType(i)
		Case 72
			dy=-1
			dx=1
		Case 74
			dx=1
			dy=1
		Case 76
			dx=-1
			dy=1
		Case 78
			dx=-1
			dy=-1
		End Select
		
		If CanObjectMoveToTile(i,ObjectTileX(i)+dx,ObjectTileY(i),True,True)=False
			dx=-dx
		EndIf
		If CanObjectMoveToTile(i,ObjectTileX(i)+dx,ObjectTileY(i)+dy,True,True)=False
			dy=-dy
		EndIf
		If CanObjectMoveToTile(i,ObjectTileX(i)+dx,ObjectTileY(i)+dy,True,True)=True
			MoveObjectToTile(i,	ObjectTileX(i)+dx,ObjectTileY(i)+dy)
		EndIf
		If dy=-1 And dx=1 ObjectMovementType(i)=72
		If dy=1 And dx=1 ObjectMovementType(i)=74
		If dy=1 And dx=-1 ObjectMovementType(i)=76
		If dy=-1 And dx=-1 ObjectMovementType(i)=78
	Case 81,82,83,84,85,86,87,88     ; 81/82 is left/right,
		; Push-Bot Algorithm
		; find current direction
		dx=0
		dy=0
		If ObjectMovementType(i)=81 Or ObjectMovementType(i)=82 

			dy=-1
		Else If ObjectMovementType(i)=83 Or ObjectMovementType(i)=84  

			dx=1
		Else If ObjectMovementType(i)=85 Or ObjectMovementType(i)=86  

			dy=1
		Else If ObjectMovementType(i)=87 Or ObjectMovementType(i)=88 

			dx=-1
		EndIf
		
		
		If CanObjectMoveToTile(i,ObjectTileX(i)+dx,ObjectTileY(i)+dy,True,True)=True
			; continue
			MoveObjectToTile(i,	ObjectTileX(i)+dx,ObjectTileY(i)+dy)
			
		Else 
			If ObjectSubType(i)=0
				SoundPitch (SoundFX(99),Rand(19000,25000))
				PlaySoundFX(99,ObjectTileX(i),ObjectTileY(i))
			Else
				SoundPitch (SoundFX(99),Rand(9000,15000))
				PlaySoundFX(99,ObjectTileX(i),ObjectTileY(i))
			EndIf
			
			; or turn left/right and stop
			If ObjectMovementType(i) Mod 2 = 1 ;left
				
				ObjectData(i,2)=(ObjectData(i,2)+3) Mod 4
			Else 	; right
				
				ObjectData(i,2)=(ObjectData(i,2)+1) Mod 4
			

			EndIf
			
			
			;*********************
			; special for push-bots. check for 180s
			
			If ObjectData(i,3)=2
			
				If ObjectMovementType(i) Mod 2 = 1 ;left
					
					ObjectData(i,2)=(ObjectData(i,2)+3) Mod 4
				Else 	; right
					
					ObjectData(i,2)=(ObjectData(i,2)+1) Mod 4
				
	
				EndIf
			EndIf
			
			ObjectMovementType(i)=0

			; ************************ end of 2nd check
		EndIf
	

	End Select

End Function

Function MoveObjectToTile(i,x,y)

	OccupyObjectTile(i,x,y)

	
	


	; Does an immediate move (without further checking) to Tile x/y using ObjectMovementSpeed
	; I.e. the Object's X/Y position will now be linearly spaced out between the start and goal tiles as
	; ObjectMovementTimer counts up to 1000 in steps of MovementSpeed
	ObjectTileX2(i)=x
	ObjectTileY2(i)=y
	If ObjectFlying(i)/10=1 
		ObjectMovementTimer(i)=10
	Else If ObjectFlying(i)/10=2 
		ObjectMovementTimer(i)=20
	Else
		ObjectMovementTimer(i)=ObjectMovementSpeed(i)
	EndIf
	
	If ObjectType(i)=150
		PlaySoundFX(100,ObjectTIleX(i),ObjectTIleY(i))
	EndIf
End Function

Function OccupyObjectTile(i,x,y)
	; Adjust/Occupy ObjectTileLogic()
	
	If ObjectFrozen(i)>0
		Select ObjectType(i)
		Case 1,110,120,150,220,230,250,260, 290,370,380,390,391,400,420,421,422,423,430,431,432,433,470,471
			If (ObjectTileLogic(x,y) And 2^10) =0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^10
			EndIf
			Return
		End Select
	EndIf
		
	Select ObjectType(i)
	Case 1
		; Player
		
		If (ObjectTileLogic(x,y) And 2^1) =0
			
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^1
		EndIf
		
	Case 432
		; moobot
				If (ObjectTileLogic(x,y) And 2^7) =0 
					ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^7
				EndIf
		
	Case 110,330,290,380,390,433
		; Stinker NPC/Wisp/Troll/Thwart/Kaboom
		If ObjectActive(i)>0
			If ObjectTalkable(i)>0
				If (ObjectTileLogic(x,y) And 2^2) =0 
					ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^2
				EndIf
			Else
				If (ObjectTileLogic(x,y) And 2^7) =0 
					ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^7
				EndIf
			EndIf
		EndIf
		
	Case 120,400
	; Wee Stinker, Baby Boomer
		If (ObjectTileLogic(x,y) And 2^3) =0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^3
		EndIf
		
	Case 150
		; Scritter
		If (ObjectTileLogic(x,y) And 2^5) =0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^5
		EndIf
	Case 210
		; Transporter
		If (ObjectTileLogic(x,y) And 2^6) =0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^6
		EndIf
	Case 220
		; Turtle
		If ObjectStatus(i)<2
			If (ObjectTileLogic(x,y) And 2^7) =0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^7
			EndIf
		Else
			If (ObjectTileLogic(x,y) And 2^6) =0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^6
			EndIf
		EndIf
	Case 370
		; Crab
		If ObjectStatus(i)<2
			If ObjectData(i,1)>1
				;sleeping
				If (ObjectTileLogic(x,y) And 2^7) =0
					ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^7
				EndIf
			Else
				If (ObjectTileLogic(x,y) And 2^5) =0
					ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^5
				EndIf
			EndIf
		Else
			If (ObjectTileLogic(x,y) And 2^6) =0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^6
			EndIf
		EndIf

	Case 230, 290, 310,460
		; Fireflower, ducky
		If (ObjectTileLogic(x,y) And 2^7) =0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^7
		EndIf
	Case 250,260,420,422,423,430,431,151,470,471,391
		; Bowlers, Chompers , Retromonsters,Ghosts
		If (ObjectTileLogic(x,y) And 2^8) =0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^8
		EndIf
	

	Case 240,241,242
		; Boxes
		If (ObjectTileLogic(x,y) And 2^9) =0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^9
		EndIf

	End Select
End Function



Function ObjectDuringMove(i)

	If ObjectFlying(i)/10 =1
		ObjectMovementTimer(i)=ObjectMovementTimer(i)+150
	Else If ObjectFlying(i)/20 =1 
		ObjectMovementTimer(i)=ObjectMovementTimer(i)+75
	Else
		ObjectMovementTimer(i)=ObjectMovementTimer(i)+ObjectMovementSpeed(i)
	EndIf
	
	
	If ObjectMovementTimer(i)>=1000
		; All Done the move, reset to rest and check tiles
		EndMoveObject(i)
	
	EndIf
	
	
End Function

Function EndMoveObject(i)

	
	VacateObjectTile(i)
	
	; special effect - water ripples
	If WaterTileHeight(ObjectTileX(i),ObjectTileY(i))>0
		AddParticle(4,(ObjectTileX(i)+ObjectTileX(i))/2.0+.5+Rnd(-.1,.1),WaterTileHeight(ObjectTileX(i),ObjectTileY(i))+.05,-(ObjectTileY(i)+ObjectTileY(i))/2.0-.5+Rnd(-.1,.1),0,.01,0,0,0,0,.01,0,0,0,40,4)
		AddParticle(4,(ObjectTileX(i)+ObjectTileX2(i))/2.0+.5+Rnd(-.1,.1),WaterTileHeight(ObjectTileX(i),ObjectTileY(i))+.05,-(ObjectTileY(i)+ObjectTileY2(i))/2.0-.5+Rnd(-.1,.1),0,.001,0,0,0,0,.007,0,0,0,60,4)
	EndIf
	
	; Set Object To Rest
	ObjectMovementTimer(i)=0
	oldx=ObjectTileX(i)
	oldy=ObjectTileY(i)
	ObjectTileX(i)=ObjectTileX2(i)
	ObjectTileY(i)=ObjectTileY2(i)
	
	
	
	
	EndMoveTileCheck(i,oldx,oldy)
	
	; if flying - check for suctube corners
	If ObjectFlying(i)/10 = 1
		For j=0 To nofobjects-1
			If ObjectType(j)=282
				If Floor(ObjectX(j))=ObjectTileX(i) And Floor(ObjectY(j))=ObjectTileY(i)
					; yup
					Select ObjectData(j,2)
					Case 0
						If ObjectFlying(i)=10
							ObjectFlying(i)=12
						Else
							ObjectFlying(i)=14
						EndIf
					Case 1
						If ObjectFlying(i)=12
							ObjectFlying(i)=14
						Else
							ObjectFlying(i)=16
						EndIf
					Case 2
						If ObjectFlying(i)=12
							ObjectFlying(i)=10
						Else
							ObjectFlying(i)=16
						EndIf
					Case 3
						If ObjectFlying(i)=14
							ObjectFlying(i)=12
						Else
							ObjectFlying(i)=10
						EndIf
					
					End Select
					If i=PlayerObject 
						If Rand(1,100)<70
							PlaySoundFX(Rand(180,182),ObjectTileX(i),ObjectTileY(i))
						Else
							PlaySoundFX(Rand(170,172),ObjectTileX(i),ObjectTileY(i))

						EndIf
					EndIf

						
				EndIf
			EndIf
		Next
	
	EndIf
	
	If i=PlayerObject And ObjectFlying(i)/10 <>1
		; step conveyors
		flag=False
		For j=0 To nofobjects-1
			If (ObjectType(j)=45 Or ObjectType(j)=46) And ObjectData(j,5)=1 And ObjectTileX(j)=ObjectTileX(i) And ObjectTileY(j)=ObjectTileY(i)
				col=ObjectData(j,0)
				subcol=ObjectData(j,1)
				flag=True
			EndIf
		Next
		If flag=True
			For j=0 To nofobjects-1
				If (ObjectType(j)=45) And ObjectData(j,5)=1 And ObjectData(j,0)=col And ObjectData(j,1)=subcol
					Activateconveyor(j)
					
				EndIf
			Next
		EndIf
	EndIf

	
	
End Function

Function VacateObjectTile(i)
	
	; Adjust ObjectTileLogic()
	x=ObjectTileX(i)
	y=ObjectTileY(i)
	
	If ObjectFrozen(i)>0
		Select ObjectType(i)
		Case 1,110,120,150,220,230,250,260, 290,370,380,390,391,400,420,421,422,423,430,431,432,433,470,471
			If (ObjectTileLogic(x,y) And 2^10) >0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^10
			EndIf
			Return
		End Select
	EndIf

	
	Select ObjectType(i)
	Case 1
		; Objects that vacate the field they leave
		; Player
		If (ObjectTileLogic(x,y) And 2^1) >0
			
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^1
		EndIf
	Case 432
		If (ObjectTileLogic(x,y) And 2^7) >0 
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^7
			EndIf
	Case 110,330,290,380,390,433
		; Stinker NPC/Wisp/Troll/Thwart/Kaboom
		If ObjectTalkable(i)>0
			If (ObjectTileLogic(x,y) And 2^2) >0 
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^2
			EndIf
		Else
			
			If (ObjectTileLogic(x,y) And 2^7) >0 
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^7
			EndIf
		EndIf

	Case 120,400
		; Stinker Wee, Baby Boomer
		If (ObjectTileLogic(x,y) And 2^3) >0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^3
		EndIf
		
	Case 150
		; Scritter
		If (ObjectTileLogic(x,y) And 2^5) >0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^5
		EndIf
	Case 210
		; Transporter
		If (ObjectTileLogic(x,y) And 2^6) >0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^6
		EndIf
	Case 220
		; Turtle
		If ObjectStatus(i)<2
			If (ObjectTileLogic(x,y) And 2^7) >0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^7
			EndIf
		Else
			If (ObjectTileLogic(x,y) And 2^6) >0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^6
			EndIf
		EndIf
		
	Case 370
		; Crab
		If ObjectStatus(i)<2
			If ObjectData(i,1)>1 ;sleeping
				If (ObjectTileLogic(x,y) And 2^7) >0
					ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^7
				EndIf

			Else
				If (ObjectTileLogic(x,y) And 2^5) >0
					ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^5
				EndIf
			EndIf
		Else
			If (ObjectTileLogic(x,y) And 2^6) >0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^6
			EndIf
			
		EndIf
		
	Case 230,290,310,460
		; fireflower and ducky
		If (ObjectTileLogic(x,y) And 2^7) >0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^7
		EndIf
	Case 250,260,420,422,423,430,431,151,470,471,391
		; bolwers, chompers
		If (ObjectTileLogic(x,y) And 2^8) >0
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^8
		EndIf
	

	Case 240,241,242
		; boxes
		If (ObjectTileLogic(x,y) And 2^9) >0 
			ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^9
		EndIf
	End Select
End Function

Function EndMoveTileCheck(i,oldx,oldy)
	
	If ObjectLinked(i)>=0 Then Return
	
	Select LevelTileLogic(ObjectTileX(i),ObjectTileY(i))
	
	Case 0
		

	
	Case 1
		; Solid Wall
		; Check if Object can be in solid wall, if not - destroy
		If ObjectType(i)=1  Or ObjectType(i)=110 Or ObjectType(i)=120 Or ObjectType(i)=150 Or ObjectType(i)=250 Or ObjectType(i)=260   Or ObjectType(i)=290 Or ObjectType(i)=380 Or ObjectType(i)=390 Or ObjectType(i)=400  Or ObjectType(i)=420  Or ObjectType(i)=422 Or ObjectType(i)=423 Or ObjectType(i)=430 Or ObjectType(i)=431 Or ObjectType(i)=432 Or ObjectType(i)=433 Or ObjectType(i)=470 Or ObjectType(i)=391
			; player - boom
			DestroyObject(i,0)
		EndIf
		
	Case 2
		; Water
		If (ObjectFlying(i) =0 Or ObjectFlying(i)>=20) 
			
			; anything frozen? Destroy
			If ObjectType(i)=1 Or ObjectType(i)=110 Or ObjectType(i)=120 Or ObjectType(i)=150 Or (ObjectType(i)=250 And ObjectData(i,1)<>1) Or ObjectType(i)=260 Or ObjectType(i)=290 Or ObjectType(i)=380 Or ObjectType(i)=390 Or ObjectType(i)=400 Or ObjectType(i)=423 Or ObjectType(i)=432 Or ObjectType(i)=433 Or ObjectTYpe(i)=470 Or ObjectType(i)=471
				DestroyObject(i,2)
			EndIf
				If (ObjectType(i)=220 Or ObjectType(i)=370) And ObjectStatus(i)=0
					; turtle/crab
					PlaySoundFX(108,ObjectX(i),ObjectY(i))
					VacateObjectTile(i)
					ObjectStatus(i)=1
					OccupyObjectTile(i,ObjectTileX(i),ObjectTileY(i))
					If ObjectType(i)=220
						; turtle - keep swimming
						ObjectMovementType(i)=(ObjectMovementType(i) Mod 10)+50
					Else
						; crab - sink immediately
						ObjectMovementType(i)=0
						AnimateMD2 ObjectEntity(i),3,1,31,49
						ObjectCurrentAnim(i)=4
						VacateObjectTile(i)
						ObjectStatus(i)=2
						OccupyObjectTile(i,ObjectTileX(i),ObjectTileY(i))
	
					EndIf
					AddParticle(4,ObjectX(i),-.2,-ObjectY(i),0,0.8,0,0,0,0,.01,0,0,0,200,4)
					
					
				EndIf
		EndIf
	
	Case 3

	
		; Active Teleporter
		If ObjectTeleportable(i)=True
			; find which teleporter colour we're standing on
			ID=-99999
			For k=0 To NofObjects-1
				If ObjectType(k)=30 And ObjectActive(k)=1001 And ObjectExists(k)=True
					If ObjectTileX(k)=ObjectTileX(i) And ObjectTileY(k)=ObjectTileY(i)
						; got one
						ID=ObjectID(k)
						k2=k
					EndIf
				EndIf
			Next
			If ID<>-99999
				; have found an active teleporter - now find a matching goal that is empty
				For k=0 To NofObjects-1
					If ObjectType(k)=30 And ObjectActive(k)=1001 And ObjectExists(k)=True And ObjectID(k)=ID
						If ObjectTileX(k)<>ObjectTileX(i) Or ObjectTileY(k)<>ObjectTileY(i)
							If ObjectTileLogic(ObjectTileX(k),ObjectTileY(k))=0
								; Got One
								; Teleport our object from Teleporter #k2 to Teleporter #k
								PlaySoundFX(42,ObjectTileX(i),ObjectTileY(i))
								VacateObjectTile(i)
								ObjectTileX(i)=ObjectTileX(k)
								ObjectTileY(i)=ObjectTileY(k)
								ObjectTileX2(i)=ObjectTileX(k)
								ObjectTileY2(i)=ObjectTileY(k)
								ObjectMoveXGoal(i)=ObjectTileX(k)
								ObjectMoveYGoal(i)=ObjectTileY(k)
								OccupyObjectTile(i,ObjectTileX(i),ObjectTileY(i))
								
								
								
								
								; Make Particle Starburst
								For j2=1 To 360 Step 4
									AddParticle(23,ObjectX(k2)+.8*Sin(j2*3),Rnd(1,2),-ObjectY(k2)-.8*Cos(j2*3),0,.5,-0.01*Sin(j2*3),-Rnd(0.01,0.02),+0.01*Cos(j2*3),1,0,0,0,0,Rand(30,75),3)
									AddParticle(23,ObjectX(k)+.2*Sin(j2*3),Rnd(0,1),-ObjectY(k)-.2*Cos(j2*3),0,.5,0.01*Sin(j2*3),Rnd(0.01,0.02),-0.01*Cos(j2*3),1,0,0,0,0,Rand(30,75),3)
								Next
								
																
								; and Deactivate both teleporters
								DeActivateObject(k)
								DeActivateObject(k2)
							EndIf

							
						EndIf
					EndIf
				Next
			EndIf
		EndIf
		
	Case 4
		If (ObjectType(i)=220 Or ObjectType(i)=370) And ObjectStatus(i)>0
			; swimming turtle or crab - surface again!
			; unless there already is another creature on top of the transporter - then destroy
			VacateObjectTile(i)
			If ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))>0
				DestroyObject(i,0)	
			Else
				ObjectStatus(i)=0
				
				If ObjectType(i)=220
					ObjectMovementType(i)=(ObjectMovementType(i) Mod 10) + 40
				Else If ObjectType(i)=370
					; awake crab
					If ObjectSubType(i)=0
						ObjectMovementType(i)=14 ; male
					Else
						ObjectMovementType(i)=32 ; female
					EndIf
					
					ObjectData(i,1)=0
					AnimateMD2 ObjectEntity(i),3,-0.5,49,31
					ObjectCurrentAnim(i)=5
				EndIf
				OccupyObjectTile(i,ObjectTileX(i),ObjectTileY(i))
			EndIf
		EndIf
			
	Case 10

		; StinkerWeeExit
		If ObjectType(i)=120 And ObjectActive(i)=1001
			; on Exit - GoodBye!
			PlaySoundFX(Rand(71,73),ObjectTileX(i),ObjectTIleY(i))
			TurnObjectTowardDirection(i,0,1,10,-90)		
			AnimateMD2 ObjectEntity(i),3,.2,101,120,0
			ObjectCurrentAnim(i)=4
			ObjectActive(i)=1000
			ObjectActivationType(i)=2
			ObjectActivationSpeed(i)=10
			ObjectSubType(i)=-1
			ObjectMovementType(i)=0
			VacateObjectTile(i)
			NofWeeStinkersInAdventure=NofWeeStinkersInAdventure-1
			
			AddParticle(14,ObjectTileX(i)+0.5,2,-ObjectTileY(i)-0.5,0,1,0,0.01,0,0,.01,0,0,0,50,3)
			PlayerScore=PlayerScore+100
			CurrentAdventureScore=CurrentAdventureScore+100

			
		EndIf
	If ObjectType(i)=400 And ObjectActive(i)=1001
			; on Exit - GoodBye!
			PlaySoundFX(Rand(75,76),ObjectTileX(i),ObjectTIleY(i))
;			TurnObjectTowardDirection(i,0,1,10,-90)		
;			AnimateMD2 ObjectEntity(i),3,.2,101,120,0
;			ObjectCurrentAnim(i)=4
			ObjectActive(i)=1000
			ObjectActivationType(i)=2
			ObjectActivationSpeed(i)=10
			ObjectSubType(i)=-1
			ObjectMovementType(i)=0
			VacateObjectTile(i)
			NofBabyBoomersInAdventure=NofBabyBoomersInAdventure-1
			
			AddParticle(14,ObjectTileX(i)+0.5,2,-ObjectTileY(i)-0.5,0,1,0,0.01,0,0,.01,0,0,0,50,3)
			PlayerScore=PlayerScore+100
			CurrentAdventureScore=CurrentAdventureScore+100

			
		EndIf

				
	Case 11,14
	If ObjectType(i)<>422 And ObjectType(i)<>423 And ObjectType(i)<>430 And ObjectType(i)<>431
			; Ice Straight
			If ObjectFlying(i)=0
	
				dx=ObjectTileX(i)-oldx
				dy=ObjectTileY(i)-oldy
				If (dx<>0 Or dy<>0) And Abs(dx)<=1 And Abs(dy)<=1
					ObjectFlying(i)=1 ; (just put in there for water check)
				;	If CanObjectMoveToTile(i,ObjectTileX(i)+dx,ObjectTileY(i)+dy,True,True)
						
						If dx=0 And dy=-1 ObjectFlying(i)=20
						If dx=1 And dy=-1 ObjectFlying(i)=21
						If dx=1 And dy=0 ObjectFlying(i)=22
						If dx=1 And dy=1 ObjectFlying(i)=23
						If dx=0 And dy=1 ObjectFlying(i)=24
						If dx=-1 And dy=1 ObjectFlying(i)=25
						If dx=-1 And dy=0 ObjectFlying(i)=26
						If dx=-1 And dy=-1 ObjectFlying(i)=27
		
		
				;	EndIf
					If ObjectFlying(i)=1 ObjectFlying(i)=0
					
					If ObjectType(i)=1
						If ObjectFlying(i)/10 = 2 Then PlaySoundFX(Rand(170,172),-1,-1)
					EndIf
					If ObjectType(i)=110 Or ObjectType(i)=120
						If ObjectFlying(i)/10 = 2 Then PlaySoundFX(70,-1,-1)
					EndIf
	
			
					
		
				EndIf
			EndIf
			If ObjectFlying(i)/10 = 2 
	
				If LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=14 And objecttype(i)<>50 And ObjectType(i)<>300 And ObjectType(i)<>40
				
					; destroy ice float
					For j=0 To nofobjects-1
						If ObjectType(j)=300
							If ObjectTileX(j)=ObjectTileX(i) And ObjectTileY(j)=ObjectTileY(i)
								DeActivateObject(j)
								ObjectData(j,0)=20
								;LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=2
								
							EndIf
						EndIf
					Next
								
				EndIf
			EndIf
			If ObjectFlying(i)/10 =2 Then PlaySoundFX(20,ObjectX(i),ObjectY(i))
		EndIf	
	Case 12
	
	If ObjectType(i)<>422 And ObjectType(i)<>423 And ObjectType(i)<>430 And ObjectType(i)<>431

			; Ice Corner
			oldflying=ObjectFLying(i)
			x=ObjectTileX(i)
			y=ObjectTileY(i)
			dx=ObjectTileX(i)-oldx
			dy=ObjectTileY(i)-oldy
	
				
			If ObjectFlying(i)=0 Or ObjectFlying(i)/10 = 2
	
				flag2=ObjectFlying(i)
				flag =False 
				Select LevelTileRotation(x,y)
				Case 0,7
					If dy=-1 And (dx=0 Or dx=1)
						ObjectFlying(i)=22
					Else If dx=-1 And (dy=0 Or dy=1)
						ObjectFlying(i)=24
					Else 
						flag=True
					EndIf	
				Case 1,4
					If dx=1 And (dy=0 Or dy=1)
						ObjectFlying(i)=24
					Else If dy=-1 And (dx=0 Or dx=-1)
						ObjectFlying(i)=26
					Else
						flag=True
					EndIf
				Case 2,5
					If dy=1 And (dx=0 Or dx=-1)
						ObjectFlying(i)=26
					Else If dx=1 And (dy=0 Or dy=-1)
						ObjectFlying(i)=20
					Else
						flag=True
					EndIf
				Case 3,6
					If dy=1 And (dx=0 Or dx=1)
						ObjectFlying(i)=22
					Else If dx=-1 And (dy=0 Or dy=-1)
						ObjectFlying(i)=20
					Else
						flag=True
					EndIf
						
					
				End Select
				If flag=True 
					; treat as if straight
					If dx=0 And dy=-1 ObjectFlying(i)=20
					If dx=1 And dy=-1 ObjectFlying(i)=21
					If dx=1 And dy=0 ObjectFlying(i)=22
					If dx=1 And dy=1 ObjectFlying(i)=23
					If dx=0 And dy=1 ObjectFlying(i)=24
					If dx=-1 And dy=1 ObjectFlying(i)=25
					If dx=-1 And dy=0 ObjectFlying(i)=26
					If dx=-1 And dy=-1 ObjectFlying(i)=27
				EndIf
				If ObjectType(i)=1 
					If oldflying/10<>2 And ObjectFlying(i)/10 = 2 Then PlaySoundFX(Rand(170,172),-1,-1)
				EndIf
				If ObjectType(i)=110 Or ObjectType(i)=120
					If oldflying/10<>2 And ObjectFlying(i)/10 = 2 Then PlaySoundFX(70,-1,-1)
				EndIf
	
				If ObjectFlying(i)/10 =2 Then PlaySoundFX(20,ObjectX(i),ObjectY(i))
	
			EndIf
		EndIf
			
			
	End Select 
		


End Function



Function TurnObjectTowardDirection(i,dx#,dy#,speed,Adjust)
	
	; Turns Object by speed degrees toward the angle made by dx/dy. 
	; Adjust is a fixed angle added to goal (in case the base models orientation is off, for example) 
	
	If dx<>0 Or dy<>0
		
		ObjectYawGoal=ATan2(-dy,dx)+90+Adjust
		While ObjectYawGoal>180 
			ObjectYawGoal=ObjectYawGoal-360
		Wend
		While ObjectYawGoal<=-180 
			ObjectYawGoal=ObjectYawGoal+360
		Wend

		If Abs(ObjectYawGoal-ObjectYaw(i))>speed
			dyaw=speed
		Else
			dyaw=1
		EndIf

		If ObjectYaw(i)>ObjectYawGoal
			If ObjectYaw(i)-ObjectYawGoal<180
				ObjectYaw(i)=ObjectYaw(i)-dyaw
			Else
				ObjectYaw(i)=ObjectYaw(i)+dyaw
			EndIf
		Else If ObjectYaw(i)<ObjectYawGoal
			If ObjectYawGoal-ObjectYaw(i)<180
				ObjectYaw(i)=ObjectYaw(i)+dyaw
			Else
				ObjectYaw(i)=ObjectYaw(i)-dyaw
			EndIf
		EndIf
		If ObjectYaw(i)>180 Then ObjectYaw(i)=ObjectYaw(i)-360
		If ObjectYaw(i)<-180 Then ObjectYaw(i)=ObjectYaw(i)+360
		
	EndIf

End Function


Function ObjectCollision(i)

	



End Function

Function ObjectObjectCollision(i,j)

	
	
End Function

Function ObjectObject3DCollision(i,j)

	

End Function





Function CreatePlayer(x3#,y3#)

	x=Floor(x3)
	y=Floor(y3)
	
	i=CreateNewObject()
	
	
	
	
	
	
	ObjectModelName$(i)="!Player"
	ObjectTextureName$(i)="!T00"+Str$(PlayerTextureBody)+"c"
	If PlayerAcc1>0
		If PlayerAcc1<10
			ObjectTextureName$(i)=ObjectTextureName$(i)+"00"+Str$(PlayerAcc1)+Chr$(64+PlayerTexAcc1)+"0"
		Else
			ObjectTextureName$(i)=ObjectTextureName$(i)+"0"+Str$(PlayerAcc1)+Chr$(64+PlayerTexAcc1)+"0"
		EndIf
		If PlayerAcc2>0 Then ObjectTextureName$(i)=ObjectTextureName$(i)+" "
	EndIf
	If PlayerAcc2>0
		
		ObjectTextureName$(i)=ObjectTextureName$(i)+Str$(PlayerAcc2)+Chr$(64+PlayerTexAcc2)+"0"
		
	EndIf



	CreateStinkerModel(i,PlayerSizeX,PlayerSizeY,PlayerSizeZ,ObjectTextureName$(i))

	


	ObjectX(i)=x
	ObjectY(i)=y
	
	ObjectTileX(i)=Floor(x)
	ObjectTileY(i)=Floor(y)
	ObjectTileX2(i)=Floor(x)
	ObjectTileY2(i)=Floor(y)
	ObjectMovementType(i)=10
	ObjectMovementTimer(i)=0
	ObjectMovementSpeed(i)=40
	
	ObjectMoveXGoal(i)=ObjectTileX(i)
	ObjectMoveYGoal(i)=ObjectTileY(i)
	
	
	ObjectYaw(i)=0
	
	ObjectSpeed(i)=.06
	ObjectRadius(i)=.4

	ObjectData(i,2)=0;  is used internally To make sure we don't switch animations Right After Stop walking from tile To tile

	
;	PlayerExists(NofPlayers)=True
	
	PositionEntity ObjectEntity(i),x,0,-y
	PositionEntity Camera,ObjectX(0),15,-ObjectY(0)-8
	
	ObjectTeleportable(i)=True
	ObjectButtonPush(i)=True
	ObjectWaterReact(i)=10
	
	PlayerObject=i
	CameraFocusObject=i

	
	
	
	
	ObjectActive(i)=1001

	ObjectType(i)=1
	ObjectID(i)=-1



	
	For i2=0 To 99
		PlayerTilePathX(i2)=x
		PlayerTilePathY(i2)=y
	Next
	PlayerTilePathPos=0
	For i2=0 To LevelWidth-1
		For j=0 To LevelHeight-1
			LevelTilePlayerPathScore(i2,j)=100
		Next
	Next
	LevelTilePlayerPathScore(x,y)=0
	
		
	ObjectTileTypeCollision(i)=2^0+2^3+2^4+2^9+2^10+2^11+2^12+2^14
	ObjectObjectTypeCollision(i)=2^3+2^4+2^5+2^6+2^8
	OccupyObjectTile(i,x,y)
	
	PlayerTalkToGoalObject=-1
	
	EntityFX ObjectEntity(i),0

End Function

Function CreateStinkerModel(i,sizex#,sizey#,sizez#,code$)
		
	
;	ObjectTextureName$(i)="models/stinkers/body"+Chr$(96+bodytex)+"1.png"

	
	

	
	ObjectEntity(i)=CopyEntity(StinkerMesh)
	
	;EntityFX ObjectEntity(i),1
	
	ObjectXScale(i)=sizex
	ObjectYScale(i)=sizey
	ObjectZScale(i)=sizez
;	ScaleEntity ObjectEntity(i),ObjectXScale(i),ObjectYScale(i),ObjectZScale(i)
	
	
	; check if this texture is already loaded - if not, load the set
	
	tex=(Asc(Mid$(code$,3,1))-48)*100+(Asc(Mid$(code$,4,1))-48)*10+(Asc(Mid$(code$,5,1))-48)
	
	; shadow/fire stinker (texture applied in loadobject)
	If tex=5
		tex=1
		ObjectData(i,0)=5
	EndIf
	
	EntityTexture GetChild(ObjectEntity(i),3),StinkerTexture(tex,0)
	
	
	ObjectTexture(i)=0
	
	
	
	Animate GetChild(objectentity(i),3),1,.05,10
	ObjectCurrentAnim(i)=10

	; now do accessories. Create models based on texture code
	; !T000b000a0 000a0
	;		T000 - which body texture
	;		b which expression
	;		000 - which accessory model, a - which accessory texture for that model, 0 - which bone to attach to
	For j=1 To (Len(code$)-5)/6
		; which bone to attach to
		Select Mid$(code$,j*6+5,1)
		Case "0"	; hat_bone
			bone=FindChild(ObjectEntity(i),"hat_bone")
		End Select
		; type and tex
		
		CreateAccessory(bone,sizex,sizey,sizez,Mid$(code$,j*6+1,4))
		If Mid$(code$,j*6+1,1)="0"
			; only link parent to child if it's a hat (for de-linking in dying animation)
			; the first 100 accessorys are reserved for hats, hence this check
			ObjectChild(i)=NofObjects-1
		EndIf
		ObjectParent(NofObjects-1)=i
	Next
	
	CreateShadow(i,(sizex+sizey)*11.6)


	
End Function

Function ControlPlayer(i)

	; spy eye
	If CurrentCharm=3
	
		
		HideEntity LevelCursor
		If (Mouse1=True Or Mouse2=True) And mousegamemode=-1
			; remember to also do this when esc is pressed
			ShowEntity LevelCursor
			CurrentCharm=0
			TurnOnIcons()
			DeleteIcon(1)
			MouseGameMode=-2

		EndIf
		
		Return
	EndIf
	
	If GameMode=8
		; in dialog or reading sign
		
		; turn toward sign
		If DialogObject1>=0 TurnObjectTowardDirection(i,ObjectX(DialogObject1)-ObjectX(i),ObjectY(DialogObject1)-ObjectY(i),4,0)
		If DialogObject2>=0 TurnObjectTowardDirection(DialogObject2,ObjectX(i)-ObjectX(DialogObject2),ObjectY(i)-ObjectY(DialogObject2),4,-ObjectYawAdjust(DialogObject2))
		
		; stop walking
		If ObjectMovementTimer(i)=0 And ObjectCurrentAnim(i)<>10
			Animate GetChild(objectentity(i),3),1,.05,10
			ObjectCurrentAnim(i)=10
		EndIf
	
	Else
		; normal in game
		ControlPlayerInGame(i)
	
	EndIf

End Function


Function ControlPlayerInGame(i)

	

	; ------------------------------------------
	
	; Check if Dead first - do various death anims
	
	; ------------------------------------------
	If ObjectDead(i)=1
	
		; spinning up and rainbow burst
		
		EntityTexture GetChild(ObjectEntity(i),3),StinkerTexture(PlayerTExtureBody,4)
		
		ObjectDeadTimer(i)=ObjectDeadTimer(i)+1
		
		
		If ObjectDeadTimer(i)<100
			ObjectYaw(i)=(ObjectYaw(i)+10) Mod 360
			ObjectZ(i)=ObjectZ(i)+.015
			
		EndIf
		If ObjectDeadTimer(i)=100
			HideEntity ObjectEntity(i)
			ObjectActive(i)=0
			
			
			For j=0 To 360 Step 2
				a#=Rnd(0.7,1.5)
				AddParticle(Rand(16,23),ObjectX(i),ObjectZ(i)+.5,-ObjectY(i),0,0.4,a*0.12*Sin(j),0,a*0.12*Cos(j),5,.001,-a*0.0021*Sin(j),0,-a*0.0021*Cos(j),75,3)
			Next
			
			; also look for second accessory and hide
			For j=0 To NofObjects-1
				If ObjectParent(j)=i And ObjectChild(i)<>j
					; matching parent/child = hat	,	non-matching = other (i.e.second) accessory
					
					HideEntity ObjectEntity(j)
				EndIf
			Next
			
		EndIf
		If ObjectDeadTimer(i)=150 And LevelTimer<1000000000
			AdventureLostCameraX=ObjectX(i)
			AdventureLostCameraY=-ObjectY(i)
			AdventureLostCameraZ=ObjectZ(i)
			AdventureLost()
		EndIf
		If ObjectChild(i)>=0
			If ObjectDeadTimer(i)=100 Then ObjectType(ObjectChild(i))=0 ; de-couple hat
			If ObjectDeadTimer(i)>100 
				; control hat seperately
				ObjectYaw(ObjectChild(i))=(ObjectYaw(ObjectChild(i))+4) Mod 360
				ObjectRoll2(ObjectChild(i))=-40
				bone=ObjectData(ObjectChild(i),0)
				ObjectX(ObjectChild(i))=EntityX(bone,True)
				ObjectY(ObjectChild(i))=-EntityZ(bone,True)
				ObjectZ(ObjectChild(i))=ObjectZ(ObjectChild(i))-.005
			
			EndIf
		EndIf

		Return
	EndIf
	If ObjectDead(i)=2
		; burnt to crisp
		ObjectDeadTimer(i)=ObjectDeadTimer(i)+1
		TurnObjectTowardDirection(i,0,1,4,0)
		
		a#=Rnd(0.1,0.2)
		j=Rand(0,90)*4
		AddParticle(0,ObjectX(i)+Rnd(-.1,.1),ObjectZ(i)+.5,-ObjectY(i)+Rnd(-.1,.0),0,0.4,a*0.12*Sin(j),0.03,a*0.12*Cos(j),5,.001,-a*0.0021*Sin(j),0,-a*0.0021*Cos(j),75,3)
		If ObjectDeadTimer(i)=200  And LevelTimer<1000000000
			AdventureLostCameraX=ObjectX(i)
			AdventureLostCameraY=-ObjectY(i)
			AdventureLostCameraZ=ObjectZ(i)
			AdventureLost()
		EndIf

		Return
		
	EndIf
	If ObjectDead(i)=3 
	
		ObjectYaw(i)=0
		; sinking in water
		EntityTexture GetChild(ObjectEntity(i),3),StinkerTexture(PlayerTExtureBody,1)

		
		ObjectDeadTimer(i)=ObjectDeadTimer(i)+1
		
		
		
		
		
		If ObjectDeadTimer(i)<=18
			ObjectPitch2(i)=ObjectPitch2(i)+1
			
			ObjectZ(i)=ObjectZ(i)-.06
			ObjectY(i)=ObjectY(i)+.008
		Else 

			ObjectZ(i)=ObjectZ(i)-.002
	
		EndIf
		
		If ObjectDeadTimer(i)=150  And LevelTimer<1000000000
			AdventureLostCameraX=ObjectX(i)
			AdventureLostCameraY=-ObjectY(i)
			AdventureLostCameraZ=ObjectZ(i)
			AdventureLost()
		EndIf
		
		
		If ObjectChild(i)>=0
			ObjectType(ObjectChild(i))=0 ; de-couple hat
			; control hat seperately
			ObjectYaw(ObjectChild(i))=(ObjectYaw(ObjectChild(i))+.5) Mod 360
			ObjectRoll2(ObjectChild(i))=-40
			bone=ObjectData(ObjectChild(i),0)
			ObjectX(ObjectChild(i))=EntityX(bone,True)
			ObjectY(ObjectChild(i))=-EntityZ(bone,True)
			If ObjectZ(ObjectChild(i))>-0.2
				ObjectZ(ObjectChild(i))=ObjectZ(ObjectChild(i))-.02
			EndIf
		EndIf
		
		
		

		Return
	EndIf
	If ObjectFrozen(i)=1
		ObjectFrozen(i)=1000
		ObjectMoveXGoal(i)=ObjectTileX2(i)
		ObjectMoveYGoal(i)=ObjectTileY2(i)
		PlayerTalkToGoalObject=-1
		Animate GetChild(ObjectEntity(i),3),1,.05,10,0
		ObjectCurrentAnim(i)=10
	EndIf
	
	If ObjectFrozen(i)=2 ObjectFrozen(i)=0
	
	If ObjectFrozen(i)>2
		ObjectFrozen(i)=ObjectFrozen(i)-1
		Return
	EndIf


	
	If LevelTimer>=1000000000 
		; Level End/Lost/Won/etc, but not dead
		
		; won
		If LevelTimer>1000001000 And LevelTimer<1000002000
			If ObjectCurrentAnim(i)<>12 Then Animate GetChild(objectentity(i),3),1,.3,12
			ObjectCurrentAnim(i)=12
			ObjectYaw(i)=ObjectYaw(i)+2
		EndIf
		; lost
		If LevelTimer>1000002000 And LevelTimer<1000003000
			If ObjectCurrentAnim(i)<>10 Then Animate GetChild(objectentity(i),3),1,.05,10
			ObjectCurrentAnim(i)=10
		EndIf

		
		; end (eg exit)
		If LevelTimer>1000000000 And LevelTimer<1000001000
			If ObjectCurrentAnim(i)<>10 Then Animate GetChild(objectentity(i),3),1,.05,10
			ObjectCurrentAnim(i)=10
		EndIf

		
		Return
	EndIf
	
		
	
	; Walking toward talker?
	If PlayerTalkToGoalObject>=0
		
		; Is that object still stationary, talkable etc
		If ObjectMovementTimer(PlayerTalkToGoalObject)<>0 Or ObjectTalkable(PlayerTalkToGoalObject)=0 Or ObjectActive(PlayerTalkToGoalObject)<1001 Or ObjectFrozen(PlayerTalkToGoalObject)>0
			; no - disable walk/talk
			PlayerTalkToGoalObject=-2
		Else
			; yep - check if in distance
			If Abs(ObjectTileX2(i)-ObjectTileX(PlayerTalkToGoalObject))<2 And Abs(ObjectTileY2(i)-ObjectTileY(PlayerTalkToGoalObject))<2
				If ObjectTalkable(PlayerTalkToGoalObject)>0 And ObjectTalkable(PlayerTalkToGoalObject)<10001
					; NPC Talk
					
					; get hello sound #
					
					
					PlaySoundFX(169,-1,-1)
					
					StartDialog(ObjectTalkable(PlayerTalkToGoalObject),-1,0)
					CameraAddX=(ObjectX(PlayerTalkToGoalObject)-ObjectX(i))/2.0
					CameraAddZ=-(ObjectY(PlayerTalkToGoalObject)-ObjectY(i))/2.0+7
					CameraAddY=-5
					
					; Turn player and object toward each other
					DialogObject1=PlayerTalkToGoalObject
					
					If ObjectType(theObject)<>290 DialogObject2=PlayerTalkToGoalObject
					
				Else If ObjectTalkable(PlayerTalkToGoalObject)>=10001
					; Sign Read
					StartDialog(ObjectTalkable(PlayerTalkToGoalObject)-10000,-1,0)
					; Turn player toward object
					DialogObject1=PlayerTalkToGoalObject
					PlaySoundFX(176,-1,-1)
					
				EndIf
				; and stop movement
				PlayerTalkToGoalObject=-2
				
			EndIf
		EndIf
	EndIf
	If PlayerTalkToGoalObject=-2
		; just lost focus on goal object (it moved, died, etc)
		; stop moving
		
		ObjectMoveXGoal(i)=ObjectTileX2(i)
		ObjectMoveYGoal(i)=ObjectTileY2(i)
		PlayerTalkToGoalObject=-1
		
	EndIf
	
 
	
	; right click
	If Mouse2 And MouseHeld=0 And CurrentSpell>=0 And CurrentSpellPower>0
		ToggleSpell()
	EndIf	
	
	; keyboard control
	If keyboardmode=2
		If Playercontrolmode=0 And GameMode=0 And ObjectMovementTimer(i)=0
			NX=0
			NY=0
			If KeyDown(71) Or (KeyDown(200) And KeyDown(203)) Or (KeyDown(17) And KeyDown(30))
				NX=-1
				NY=-1
			Else If KeyDown(73) Or (KeyDown(200) And KeyDown(205)) Or (KeyDown(17) And KeyDown(32))

				NX=1
				NY=-1
			Else If KeyDown(79) Or (KeyDown(208) And KeyDown(203)) Or (KeyDown(31) And KeyDown(30))

				NX=-1
				NY=1
			Else If KeyDown(81) Or (KeyDown(205) And KeyDown(208)) Or (KeyDown(31) And KeyDown(32))

				NX=1
				NY=1
			Else If KeyDown(72) Or KeyDown(200) Or KeyDown(17)
				Nx=0
				NY=-1
			Else If KeyDown(205) Or KeyDown(77) Or KeyDown(32)
				NX=1
				NY=0
			Else If KeyDown(208) Or KeyDown(80) Or KeyDown(31)
				NX=0
				NY=1
			Else If KeyDown(203) Or KeyDown(75) Or KeyDown(30)
				NX=-1
				NY=0
			EndIf
			If NX<>0 Or NY<>0 And CanObjectMoveToTile(i,ObjectTileX(i)+NX,ObjectTileY(i)+NY,False,True) 
				; Check if Mouse Target Cursor is on Walkable Tiles	
				; Can select the current position as goal
				PositionEntity 	LevelCursor,ObjectTileX(i)+NX+.5,.05,-(ObjectTileY(i)+NY)-.5
				ScaleEntity LevelCursor,1,1,1
				EntityAlpha LevelCursor,0;.6
				
				EntityColor LevelCursor,255,255,255
						
				VertexTexCoords GetSurface(LevelCursor,1),0,0,0
				VertexTexCoords GetSurface(LevelCursor,1),1,0.25,0
				VertexTexCoords GetSurface(LevelCursor,1),2,0,0.25
				VertexTexCoords GetSurface(LevelCursor,1),3,0.25,0.25
				
				
				PlayerTalkToGoalObject=-1
				ObjectMoveXGoal(i)=ObjectTIleX(i)+NX
				ObjectMoveYGoal(i)=ObjectTileY(i)+NY
					
				MoveCursorNewTarget=20
				EntityColor LevelCursor,100,255,100
				PlayerControlMode=1
				ObjectMovementTypeData(i)=0
				TurnOffIcons()
				
				SpellActive=False	
				
			EndIf
			
		EndIf
	EndIf
		
	

	
	; Now normal controls
	; ---------------------------------------------

	; PlayerControlMode
	; 0 - not doing anything - look at tile to decide what standard action to take
	; 1 - walking (first step) - no input accepted
	; 2 - walking (continuous) - simply moving to tiles
	; 3 - grabbed Stinker
	; 4 - stinker just sent off
	
	; 5 - cast a spell 
	; 6 - wait for mouse release

	
	
	
	MX=Floor(MousePickX)
	MY=Floor(MousePickY)
	If MX>=0 And MY>=0 And MX<LevelWidth And MY<LevelHeight
		CursorInBounds=True
	EndIf
	
	If Mouse1 Or Mouse2 
		MouseHeld=MouseHeld+1
	Else
		MouseHeld=0
		
	EndIf
	ScaleEntity LevelCursor,1,1,1
	If MouseGameMode=-1 And GameMode=0
		
		Select PlayerControlMode
		
		Case 0
			; Accepting any input
			
			
			
			; First check if there are non-walking actions that take precedence
			If CursorInBounds=True
			
				; Do Spells first
				If SpellActive=True	
					; allow spells  BLINK only on walkable, FLOING ALSO NOT ON ICE positions
					If CurrentSpell=2 Or CurrentSpell=3 Or CurrentSpell=4 Or CurrentSpell=5 Or CanObjectMoveToTile(i,MX,MY,False,True)
						PositionEntity 	LevelCursor,MX+.5,.05,-MY-.5
						
						EntityAlpha LevelCursor,.6
						; Check If Mouse Target Cursor is on Walkable Tiles	
						;If (   (MX=ObjectTileX(i) And Abs(ObjectTileY(i)-MY)=3) Or (MY=ObjectTileY(i) And Abs(ObjectTileX(i)-MX)=3) Or  (Abs(ObjectTileX(i)-MX)=2 And Abs(ObjectTileY(i)-MY)=2)  )
						If True; (ObjectTileX(i)-MX)^2 + (ObjectTileY(i)-MY)^2 <17.01;
							; in Jumping Range? 3 Straight or 2 Diagonal?
						
							
							EntityColor LevelCursor,255,255,255;Rand(0,255),Rand(0,255),Rand(0,255)
									
							VertexTexCoords GetSurface(LevelCursor,1),0,.5,.25
							VertexTexCoords GetSurface(LevelCursor,1),1,0.75,.25
							VertexTexCoords GetSurface(LevelCursor,1),2,.5,0.5
							VertexTexCoords GetSurface(LevelCursor,1),3,0.75,0.5
							ScaleEntity LevelCursor,1.25+.25*Sin((Leveltimer*6) Mod 360),1.25+.25*Sin((Leveltimer*6) Mod 360),1.25+.25*Sin((Leveltimer*6) Mod 360)
							If Mouse1
								; we clicked
						
								
								dx=(mx-ObjectTileX(i))
								dy=(my-ObjectTIleY(i))
								total=Sqr(dx^2+dy^2)
								If total>=1
								
									; do an extra wall check to avoid wallblinking etc
									wallblinkingcheck=True
							;		If currentspell=6
										If dx>1 And dy=0
											If LevelTileLogic(ObjectTileX(i)+1,ObjectTileY(i))=1
												wallblinkingcheck=False
											EndIf
										EndIf
										If dx<1 And dy=0
											If   LevelTileLogic(ObjectTileX(i)-1,ObjectTileY(i))=1
												wallblinkingcheck=False
											EndIf
										EndIf
										If dx=0 And dy>1
											If  LevelTileLogic(ObjectTileX(i),ObjectTileY(i)+1)=1
												wallblinkingcheck=False
											EndIf
										EndIf
										If dx=0 And dy<1
											If  LevelTileLogic(ObjectTileX(i),ObjectTileY(i)-1)=1
												wallblinkingcheck=False
											EndIf
										EndIf
										If dx>0 And dy>0
											If  LevelTileLogic(ObjectTileX(i),ObjectTileY(i)+1)=1 And  LevelTileLogic(ObjectTileX(i)+1,ObjectTileY(i))=1
												wallblinkingcheck=False
											EndIf
										EndIf
										If dy<0 And dx>0
											If  LevelTileLogic(ObjectTileX(i),ObjectTileY(i)-1)=1 And  LevelTileLogic(ObjectTileX(i)+1,ObjectTileY(i))=1
												wallblinkingcheck=False
											EndIf
										EndIf
										If dy>0 And dx<0
											If  LevelTileLogic(ObjectTileX(i),ObjectTileY(i)+1)=1 And  LevelTileLogic(ObjectTileX(i)-1,ObjectTileY(i))=1
												wallblinkingcheck=False
											EndIf
										EndIf
										If dy<0 And dx<0
											If  LevelTileLogic(ObjectTileX(i),ObjectTileY(i)-1)=1 And  LevelTileLogic(ObjectTileX(i)-1,ObjectTileY(i))=1
												wallblinkingcheck=False
											EndIf
										EndIf
							;		EndIf
									
									If wallblinking=False And wallblinkingcheck=False
										; do an 'empty' spellball
										PlayerControlMode=6
										CreateSpellBall(ObjectTileX(i)+.5+.6*dx/total,ObjectTileY(i)+.5+.6*dy/total,.7,.1*dx/total,.1*dy/total,CurrentSpell+10,MX,MY,True,2)
											
										CurrentSpellPower=CurrentSpellPower-1
										
										If CurrentSpellPower=0
											PlaySoundFX(91,-1,-1)
		
											; check inventory for gloves
											For j=0 To 99
												If InventoryItem(j)=1001
													InventoryTexture(j)=23
													SpellActive=False 
													CurrentSpell=-1	  
													DeleteIcon(0)
												EndIf
											Next
		
										Else
										
											IconSubText$(0)="- "+Str$(CurrentSPellPower)+" -"
										EndIf
										ObjectYaw(i)=ATan2(-(MY-ObjectTileY(i)),MX-ObjectTileX(i))+90

									
									EndIf


						
									If wallblinking=True Or wallblinkingcheck=True
										
											If CurrentSpell=6 ; teleport - hold it
												PlayerControlMode=5
											Else 	; other spells, release hand once mouse released
												PlayerControlMode=6
											EndIf
											
											
											CreateSpellBall(ObjectTileX(i)+.5+.6*dx/total,ObjectTileY(i)+.5+.6*dy/total,.7,.1*dx/total,.1*dy/total,CurrentSpell,MX,MY,True,300)										
											CurrentSpellPower=CurrentSpellPower-1
											

										
											
										If CurrentSpellPower=0
											PlaySoundFX(91,-1,-1)
		
											; check inventory for gloves
											For j=0 To 99
												If InventoryItem(j)=1001
													InventoryTexture(j)=23
													SpellActive=False 
													CurrentSpell=-1	  
													DeleteIcon(0)
												EndIf
											Next
		
										Else
											IconSubText$(0)="- "+Str$(CurrentSPellPower)+" -"
										EndIf
										
										ObjectYaw(i)=ATan2(-(MY-ObjectTileY(i)),MX-ObjectTileX(i))+90
										ObjectCurrentAnim(i)=5
										Animate GetChild(objectentity(i),3),3,2,5
									EndIf
									
									
								EndIf
								
							;	ObjectMovementTypeData(i)=0
								;TurnOffIcons()
							
									
							EndIf
						
							Goto EndOfPLayerControl
						Else 
							; no in jumping range - diff cursor
							EntityColor LevelCursor,255,0,0		
							VertexTexCoords GetSurface(LevelCursor,1),0,.5,.25
							VertexTexCoords GetSurface(LevelCursor,1),1,0.75,.25
							VertexTexCoords GetSurface(LevelCursor,1),2,.5,0.5
							VertexTexCoords GetSurface(LevelCursor,1),3,0.75,0.5
							
							Goto EndOfPLayerControl

						EndIf
					Else
						; Current Goal is unwalkable - fade out cursor
						
						EntityAlpha LevelCursor,0
						Goto EndOfPLayerControl

					EndIf
				EndIf
				
				
				
				; Now non-spell bevaviours
				
			
				; See if there's an active stinker in reach
				If (ObjectTileLogic(MX,MY) And 2^3)>0 
					
					; there's a stinker there - check which one and if active and at rest
					For j=0 To NofObjects-1
						If ObjectExists(j)=True And (ObjectType(j)=120 Or ObjectType(j)=400)
				
							If (ObjectSubType(j)=1 Or ObjectSubType(j)=2) And ObjectMovementTimer(j)=0 And ObjectCurrentAnim(j)<>7
							
								If ObjectTileX(j)=MX And ObjectTileY(j)=MY
								
									; got 'em
									PositionEntity 	LevelCursor,MX+.5,.05,-MY-.5
									ScaleEntity LevelCursor,1,1,1
									EntityAlpha LevelCursor,.6
									EntityColor LevelCursor,255,255,255
									
									VertexTexCoords GetSurface(LevelCursor,1),0,.25,0
									VertexTexCoords GetSurface(LevelCursor,1),1,0.5,0
									VertexTexCoords GetSurface(LevelCursor,1),2,.25,0.25
									VertexTexCoords GetSurface(LevelCursor,1),3,0.5,0.25
									
									If Mouse1
										; we clicked - grab this stinker
										PlayerControlMode=3
										StinkerObject=j
										If ObjectType(j)=400
											PlaySoundFX(74,-1,-1)
										Else
											PlaySoundFX(Rand(55,58),-1,-1)
										EndIf
										TurnoffIcons()
									EndIf
									
									Goto EndofPlayerControl	
								EndIf
							EndIf
						EndIf
					Next
				EndIf
				
				; See if there's an NPC stinker in reach (can only talk when at rest) or a sign
				If (ObjectTileLogic(MX,MY) And 2^2)>0 And ObjectMovementTimer(i)=0
				
					; yep - check which one, and is it talkable
					For j=0 To NofObjects-1
						If ObjectExists(j)=True And (ObjectType(j)=110 Or ObjectType(j)=180 Or ObjectType(j)=290 Or ObjectType(j)=330 Or ObjectType(j)=380 Or ObjectType(j)=390 Or ObjectType(j)=433)
							If ObjectMovementTimer(j)=0 And ObjectTalkable(j)>0 And ObjectActive(j)=1001
							
								If ObjectTileX(j)=MX And ObjectTileY(j)=MY
								
									; got 'em
									
									PositionEntity 	LevelCursor,MX+.5,.5,-MY;-.5
									ScaleEntity LevelCursor,1,1,1
									EntityAlpha LevelCursor,.6
									EntityColor LevelCursor,255,255,0
	
									If ObjectTalkable(j)>10000
										VertexTexCoords GetSurface(LevelCursor,1),0,.25,.25
										VertexTexCoords GetSurface(LevelCursor,1),1,0.5,.25
										VertexTexCoords GetSurface(LevelCursor,1),2,.25,0.5
										VertexTexCoords GetSurface(LevelCursor,1),3,0.5,0.5

									Else
										VertexTexCoords GetSurface(LevelCursor,1),0,.0,.25
										VertexTexCoords GetSurface(LevelCursor,1),1,0.25,.25
										VertexTexCoords GetSurface(LevelCursor,1),2,0,0.5
										VertexTexCoords GetSurface(LevelCursor,1),3,0.25,0.5
									EndIf
									RotateEntity LevelCursor,0,0,0

									
									If Mouse1
										theObject=j
										; we clicked - try to talk this stinker
										If Abs(ObjectTileX(i)-ObjectTileX(theObject))>1 Or Abs(ObjectTileY(i)-ObjectTileY(theObject))>1
											; Too Far away - walk toward
;											Delay 1000
											PlayerTalkToGoalObject=theObject
											ObjectMoveXGoal(i)=MX
											ObjectMoveYGoal(i)=MY
											MoveCursorNewTarget=36
											EntityColor LevelCursor,100,255,100
											PlayerControlMode=1
											ObjectMovementTypeData(i)=0
											
											
											

										Else
											If ObjectTalkable(theObject)>0 And ObjectTalkable(theObject)<10001
												
												PlaySoundFX(169,-1,-1)

											

												StartDialog(ObjectTalkable(theObject),-1,0)
												CameraAddX=(ObjectX(theObject)-ObjectX(i))/2.0
												CameraAddZ=-(ObjectY(theObject)-ObjectY(i))/2.0+7
												CameraAddY=-5
												
												; Turn player and object toward each other (except thwart)
												DialogObject1=theObject
												If ObjectType(theObject)<>290 Then DialogObject2=theObject
											;	ObjectYaw(theObject)=ATan2(ObjectY(theObject)-ObjectY(i),-ObjectX(theObject)+ObjectX(i))+90
											;	ObjectYaw(i)=ATan2(-ObjectY(theObject)+ObjectY(i),+ObjectX(theObject)-ObjectX(i))+90
												
											Else If ObjectTalkable(theObject)>=10001
												; Sign Read
												StartDialog(ObjectTalkable(theObject)-10000,-1,0)
												; Turn player toward object
												DialogObject1=theObject
												PlaySoundFX(176,-1,-1)
												;ObjectYaw(i)=ATan2(-ObjectY(theObject)+ObjectY(i),+ObjectX(theObject)-ObjectX(i))+90
							
							
											EndIf
											
										EndIf
										TurnOffIcons()
	
									EndIf
									
									Goto EndofPlayerControl	
	
								EndIf
							EndIf
						EndIf
					Next
				EndIf
	
	
			
			
				; Finally check if we can simply walk
				If CanObjectMoveToTile(i,MX,MY,False,True) 
					; Check if Mouse Target Cursor is on Walkable Tiles	
					; Can select the current position as goal
					PositionEntity 	LevelCursor,MX+.5,.05,-MY-.5
					ScaleEntity LevelCursor,1,1,1
					EntityAlpha LevelCursor,.6
					EntityColor LevelCursor,255,255,255
							
					VertexTexCoords GetSurface(LevelCursor,1),0,0,0
					VertexTexCoords GetSurface(LevelCursor,1),1,0.25,0
					VertexTexCoords GetSurface(LevelCursor,1),2,0,0.25
					VertexTexCoords GetSurface(LevelCursor,1),3,0.25,0.25
					
					If Mouse1
						; we clicked - start walking and/or change goal
						PlayerTalkToGoalObject=-1
						ObjectMoveXGoal(i)=MX
						ObjectMoveYGoal(i)=MY
						
						MoveCursorNewTarget=36
						EntityColor LevelCursor,100,255,100
						PlayerControlMode=1
						ObjectMovementTypeData(i)=0
						TurnOffIcons()
						
					EndIf
					
					Goto EndOfPLayerControl
				Else
					; Current Goal is unwalkable - fade out cursor
					EntityAlpha LevelCursor,0
					
					; Help Dialog - Don't click there (for first time)
					If Mouse1 And WAEpisode=1 And AdventureCurrentLevel=-9 And ClickonUnwalkable=False
						ClickOnUnwalkable=True
						ActivateCommand(21,1,8,0,0)
					EndIf
				EndIf
				
				TurnOnIcons()
				.EndOfPlayerControl
			Else
				EntityAlpha LevelCursor,0

			EndIf
			
		Case 1
			; Doing the first step of walking - play cursor animation, no further input accepted until done.
			MoveCursorNewTarget=MoveCursorNewTarget-1
			RotateEntity LevelCursor,0,MoveCursorNewTarget*10,0
			ScaleEntity LevelCursor,0.1+Float(MoveCursorNewTarget)/36.0,0.1+Float(MoveCursorNewTarget)/36.0,0.1+Float(MoveCursorNewTarget)/36.0;1-0.5*Sin(MoveCursorNewTarget*10),1-0.5*Sin(MoveCursorNewTarget*10),1-0.5*Sin(MoveCursorNewTarget*10)
			If MoveCursorNewTarget=0
				; done the animation - are we holding the mouse still?
				If MouseHeld>35
					; yes, go into continuous movement mode
					PlayerControlMode=2
				Else
					; no, revert to zero control
					PlayerControlMode=0
				EndIf
			EndIf
		
		Case 2
			; In continuous movement mode - stay here until mouse is released
			
			If True; CanObjectMoveToTile(i,MX,MY,False,True)=True
				ObjectMoveXGOal(i)=MX
				ObjectMoveYGoal(i)=MY
			Else
				DX=MX-ObjectTileX(i)
				DY=MY-ObjectTileY(i)
				DX2=0
				DY2=0
				case2flag=False
				If DX>0
					If Abs(DX)>Abs(2.41*DY)
						DX2=1
						case2flag=True
					Else If Abs(dy*0.41)<Abs(DX)<Abs(dy*2.41)
						If DY<0
							DX2=1
							DY2=-1
						Else
							DX2=1
							DY2=1
						EndIf
						case2flag=True
					EndIf
				Else
					If Abs(DX)>Abs(2.41*DY)
						DX2=-1
						case2flag=True
					Else If Abs(dy*0.41)<Abs(DX)<Abs(dy*2.41)
						If DY<0
							DX2=-1
							DY2=-1
						Else
							DX2=-1
							DY2=1
						EndIf
						case2flag=True
					EndIf
				EndIf
				If case2flag=False
					If dy<0 
						dy2=-1
						
					Else
						dy2=1
					EndIf
				EndIf
	
				
				
				ObjectMoveXGoal(i)=ObjectTileX(i)+DX2
				ObjectMoveYGoal(i)=ObjectTileY(i)+DY2
			EndIf
			MoveCursorNewTarget=36
			PositionEntity 	LevelCursor,MX+.5,.05,-MY-.5
			ScaleEntity LevelCursor,1,1,1
			EntityColor LevelCursor,100,255,100
	
			If Mouse1=False
				; Released - go back to cursor animation mode
				PlayerControlMode=1
			EndIf
			
		Case 3
			; Has selected a Stinker - wait until released, then show goal
			
			PositionEntity 	LevelCursor,MX+.5,.05,-MY-.5
			ScaleEntity LevelCursor,1,1,1
			EntityAlpha LevelCursor,.6
			EntityColor LevelCursor,255,255,100
					
			VertexTexCoords GetSurface(LevelCursor,1),0,0,0
			VertexTexCoords GetSurface(LevelCursor,1),1,0.25,0
			VertexTexCoords GetSurface(LevelCursor,1),2,0,0.25
			VertexTexCoords GetSurface(LevelCursor,1),3,0.25,0.25
			
			If Mouse1=False
				
				; Released - send off stinker and show animation 
				
				
				If MX=ObjectTileX(StinkerObject) And MY=ObjectTileY(StinkerObject);ObjectMoveXGoal(StinkerObject) And MY=ObjectMoveYGoal(StinkerObject) 
					; special case - same goal: do a move there instead
					If ObjectType(StinkerObject)<>400 Or ObjectData(StinkerObject,8)<50
						
						ObjectMoveXGoal(i)=MX
						ObjectMoveYGoal(i)=MY
					Else
						
						ObjectMoveXGoal(i)=ObjectTileX(i)
						ObjectMoveYGoal(i)=ObjectTileY(i)

					EndIf					MoveCursorNewTarget=36
					EntityColor LevelCursor,100,255,100
					PlayerControlMode=1
					ObjectMovementTypeData(i)=0
	
				Else If ObjectMovementTimer(PlayerObject)=0 And MX=ObjectTileX(PlayerObject) And MY=ObjectTileY(PlayerObject)
					; special case - revert to following player
					If ObjectType(StinkerObject)=400
						PlaySoundFX(Rand(75,76),-1,-1)
					Else
						PlaySoundFX(Rand(60,64),-1,-1)
					EndIf					ObjectSubType(StinkerObject)=1			
					PlayerControlMode=4
					MoveCursorNewTarget=18
					ObjectMoveXGoal(StinkerObject)=MX
					ObjectMoveYGoal(StinkerObject)=MY
					ObjectMovementtype(StinkerObject)=14
					
				Else
					; regular case - move stinker to goal
					If ObjectType(StinkerObject)=400
						PlaySoundFX(Rand(75,76),-1,-1)
					Else
						PlaySoundFX(Rand(60,64),-1,-1)
					EndIf

					PlayerControlMode=4
					MoveCursorNewTarget=18
					ObjectMoveXGoal(StinkerObject)=MX
					ObjectMoveYGoal(StinkerObject)=MY
					ObjectMovementtype(StinkerObject)=13
					ObjectSubType(StinkerObject)=2
				EndIf
				
				If ObjectType(StinkerObject)=400 And ObjectData(StinkerObject,8)>0
					ObjectData(StinkerObject,8)=1
				EndIf
			; holding - is it a lit BabyBoomer? If so, up counter until BOOM
			Else If ObjectType(StinkerObject)=400 And ObjectData(StinkerObject,8)>0
				If MX=ObjectTileX(StinkerObject) And MY=ObjectTileY(StinkerObject)
					ObjectData(StinkerObject,8)=ObjectData(StinkerObject,8)+1
					If ObjectData(StinkerObject,8)=120
						ObjectData(StinkerObject,8)=0
						For kk=0 To 7
							CreateSpellBall	(ObjectX(StinkerObject)+0.7*Sin(kk*45),ObjectY(StinkerObject)+0.7*Cos(kk*45),.7,0.02*Sin(kk*45),0.02*Cos(kk*45),1,-1,-1,False,50)
						Next	
						For kk=0 To 50
							AddParticle(Rand(16,18),ObjectX(StinkerObject),Rnd(0.7,0.8),-ObjectY(StinkerObject),0,.4,Rnd(-0.05,0.05),Rnd(0,0.05),Rnd(-0.05,0.05),0,.004,0,-.0001,0,50,3)
						Next
						PlaySoundFX(78,-1,-1)
						CameraShakeTimer=30
						PlayerControlMode=7
						MoveCursorNewTarget=18


					EndIf
					
				Else
					ObjectData(StinkerObject,8)=1
				EndIf
			EndIf
				
				
			
		Case 4
			PositionEntity 	LevelCursor,MX+.5,.05,-MY-.5

			; Stinker was just sent off - show animation and wait for mouse release
			MoveCursorNewTarget=MoveCursorNewTarget-1
			RotateEntity LevelCursor,0,MoveCursorNewTarget*20,0
			ScaleEntity LevelCursor,0.1+Float(MoveCursorNewTarget)/18.0,0.1+Float(MoveCursorNewTarget)/18.0,0.1+Float(MoveCursorNewTarget)/18.0;1-0.5*Sin(MoveCursorNewTarget*10),1-0.5*Sin(MoveCursorNewTarget*10),1-0.5*Sin(MoveCursorNewTarget*10)
			If MoveCursorNewTarget<=0 And Mouse1=False
				; done the animation - are we holding the mouse still?
				PlayerControlMode=0
			EndIf
		
		Case 5
			; no control possible,
			; e.g. 	waiting for teleport spell to reach target
		
		Case 6	
			; waiting for mouse release after spell cast - will retract motion
			If Mouse1=False
				PlayerControlMode=0
				Animate GetChild(objectentity(playerobject),3),3,.4,7
				ObjectCurrentAnim(playerobject)=7
				
			EndIf
		Case 7
			; waiting for mouse release after new level started
			If Mouse1=False
				PlayerControlMode=0
				
				
			EndIf

				
		
		End Select
	
	EndIf
	
	; ***
	; Data(2) shows how long you have been standing
	; ***
	If ObjectMovementTimer(i)>0
		ObjectData(i,2)=0
	Else 
		ObjectData(i,2)=ObjectData(i,2)+1
	EndIf
	
	; start walking animation?
	If ObjectMovementTimer(i)>0 
		If ObjectFlying(i)/10 = 1
			If ObjectCurrentAnim(i)<>11
				Animate GetChild(objectentity(i),3),1,1,11
				ObjectCurrentAnim(i)=11
			EndIf
		Else If ObjectFlying(i)/10 = 2
			If ObjectCurrentAnim(i)<>13
				Animate GetChild(objectentity(i),3),3,2,13
				ObjectCurrentAnim(i)=13
			EndIf

		Else
			If ObjectCurrentAnim(i)<>2
				If AdventureGoal=6
					Animate GetChild(objectentity(i),3),1,.4,3
				Else
					Animate GetChild(objectentity(i),3),1,.4,2
				EndIf
					
				ObjectCurrentAnim(i)=2
			EndIf
		EndIf
	EndIf
	; stop walking animation?
	If ObjectCurrentAnim(i)=2 And ObjectData(i,2)=2
		; stopped after walking
		Animate GetChild(objectentity(i),3),1,.05,10
		ObjectCurrentAnim(i)=10
	EndIf
	If ObjectCurrentAnim(i)=11 And ObjectData(i,2)=2
		; stopped after flying
		Animate GetChild(objectentity(i),3),3,1,14
		ObjectCurrentAnim(i)=10
		; create circle of stars
		For j=0 To 19
			AddParticle(18,ObjectX(i)+.2*Sin(j*18),ObjectZ(i)+.7,-ObjectY(i)-.2*Cos(j*18),0,.3,0.02*Sin(j*18),0,-0.02*Cos(j*18),10,0,0,0,0,50,3)
		Next

	EndIf
	If ObjectCurrentAnim(i)=13 And ObjectData(i,2)=2
		; stopped after ice
		Animate GetChild(objectentity(i),3),3,-.4,17
		ObjectCurrentAnim(i)=17
		

	EndIf
	If ObjectCurrentAnim(i)=17 And Animating(GetChild(ObjectEntity(i),3))=False 
		Animate GetChild(objectentity(i),3),3,.04,10
		ObjectCurrentAnim(i)=10
	EndIf


	
	; walking - turn into direction
	If ObjectMovementTimer(i)>0
		If ObjectFlying(i)/10 =2
			; on ice
			ObjectYaw(i)=ObjectYaw(i)+4
		Else
			TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),11,0)
		EndIf
	EndIf
	


	
	
End Function



Function CreateAccessory(Bone,sizex#,sizey#,sizez#,acccode$)

;	Return

	

	i=CreateNewObject()
	
	ObjectTileX(i)=0
	ObjectTileY(i)=0
	ObjectTileX2(i)=0
	ObjectTileY2(i)=0

	
	ObjectModelName$(i)="!Hat"

			
	ObjectEntity(i)=myLoadMesh("data/models/stinker/accessory"+Left$(acccode$,3)+".3ds",0)
;	ObjectEntity(i)=LoadMesh("data/models/stinker/accessory101.3ds")
	ObjectTexture(i)=myLoadTexture("data/models/stinker/accessory"+acccode$+".jpg",4)
;	ObjectTexture(i)=LoadTexture("data/models/stinker/accessory101a.png")

		
;	ScaleEntity ObjectEntity(i),sizey,sizez,sizex
	ObjectXScale(i)=sizey
	ObjectYScale(i)=sizex
	ObjectZScale(i)=sizez
	EntityTexture ObjectEntity(i),ObjectTexture(i)

	ObjectData(i,0)=Bone
	ObjectType(i)=100

End Function

Function ControlAccessory(i)

;	Return
	


	bone=ObjectData(i,0)
	
	
	ObjectX(i)=EntityX(bone,True)
	ObjectY(i)=-EntityZ(bone,True)
	ObjectZ(i)=EntityY(bone,True);+.075
	
	
	
	ObjectPitch(i)=EntityPitch(bone,True)
	ObjectYaw(i)=EntityYaw(bone,True)
	ObjectRoll(i)=EntityRoll(bone,True)
	If ObjectParent(i)<0 Then Return
	If ObjectActive(ObjectParent(i))=0
		HideEntity ObjectEntity(i)
	Else
		ShowEntity ObjectEntity(i)
	EndIf

	
End Function

Function CreateShadow(parent,scale#)
	
	i=CreateNewObject()
	ObjectEntity(i)=CreateMesh()
	surface=CreateSurface(ObjectEntity(i))

	AddVertex (surface,-.49*scale,0.05,.49*scale,0,0)
	AddVertex (surface,.49*scale,0.05,.49*scale,1,0)
	AddVertex (surface,-.49*scale,0.05,-.49*scale,0,1)
	AddVertex (surface,.49*scale,0.05,-.49*scale,1,1)
	AddTriangle surface,0,1,2
	AddTriangle surface,1,3,2
	UpdateNormals ObjectEntity(i)
	
	EntityTexture ObjectEntity(i),ShadowTexture(0)
	
	ObjectType(i)=101
	ObjectParent(i)=parent
	
	EntityBlend ObjectEntity(i),2
	

	EntityFX ObjectEntity(i),1
	
	ObjectModelName$(i)="!Shadow"

End Function

Function ControlShadow(i)

	ObjectX(i)=ObjectX(ObjectParent(i))+.03
	ObjectY(i)=ObjectY(ObjectParent(i))+.1
	ObjectZ(i)=0.06
	
	If ObjectType(ObjectParent(i))=120  And ObjectSubType(ObjectParent(i))=0 ; asleep stinker
		ObjectX(i)=ObjectX(ObjectParent(i))+.1
		ObjectY(i)=ObjectY(ObjectParent(i))-.15
	EndIf
	If ObjectType(ObjectParent(i))=120  And ObjectCurrentAnim(ObjectParent(i))=7 ; asleep stinker
		ObjectX(i)=ObjectX(ObjectParent(i))+.06
		ObjectY(i)=ObjectY(ObjectParent(i))-.07
	EndIf
	
	
	
	If ObjectActive(ObjectParent(i))=0
		HideEntity ObjectEntity(i)
	Else
		ShowEntity ObjectEntity(i)
		If ObjectType(ObjectParent(i))=220 
			; turtle
			If objectstatus(ObjectParent(i))>0
				HideEntity objectentity(i)
			Else
				ShowEntity objectentity(i)
			EndIf
		EndIf
		If ObjectType(ObjectParent(i))=370
			; crab
			If objectstatus(ObjectParent(i))>0 Or ObjectData(ObjectParent(i),1)>1
				HideEntity objectentity(i)
			Else
				ShowEntity objectentity(i)
			EndIf
		EndIf

	EndIf
	
	
	
	


	

End Function

Function ControlStinkerWee(i)
	If ObjectFrozen(i)=1
		ObjectFrozen(i)=1000
		AnimateMD2 ObjectEntity(i),3,1,161,178,1
		ObjectPitch(i)=Rand(-30,30)
		ObjectRoll(i)=Rand(-30,30)
		ObjectZ(i)=.3
		PlaySoundFX(85,ObjectX(i),ObjectY(i))


		
	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		AnimateMD2 ObjectEntity(i),1,Rnd(.01,.08),141,160,1
		ObjectCurrentAnim(i)=3
		ObjectPitch(i)=0
		ObjectRoll(i)=0
		ObjectZ(i)=0


	EndIf
	If ObjectFrozen(i)>2
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		Return
	EndIf

	If ObjectTileTypeCollision(i)=0
		; First time (should later be put into object creation at level editor)
		ObjectTileTypeCollision(i)=2^0+2^3+2^4+2^9+2^10+2^11+2^12+2^14
		ObjectObjectTypeCollision(i)=2^6+2^8
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileX2(i)=Floor(ObjectX(i))
		ObjectTileY2(i)=Floor(ObjectY(i))
		ObjectMovementType(i)=0
		ObjectMovementTimer(i)=0
		ObjectMovementSpeed(i)=35	
		ObjectSubType(i)=0  ; -2 dying, -1 exiting, 0- asleep, 1-follow, 2-directive, 3-about to fall asleep (still walking), 4 caged
		AnimateMD2 ObjectEntity(i),1,Rnd(.002,.008),217,219,1
		ObjectCurrentAnim(i)=1 ; 1-asleep, 2-getting up, 3-idle, 4-wave, 5-tap, 6-walk, 7 sit down, 8-fly, 9-sit on ice	
		ObjectXScale(i)=0.025
		ObjectYScale(i)=0.025
		ObjectZScale(i)=0.025
	EndIf

	If ObjectDead(i)=1
		; spinning out of control
		ObjectYaw(i)=(ObjectYaw(i)+10) Mod 360
		ObjectZ(i)=ObjectZ(i)+.01
		ObjectSubType(i)=-2
		Return
	EndIf
	If ObjectDead(i)=3
		; drowning
		ObjectYaw(i)=90
		ObjectZ(i)=ObjectZ(i)-.005
		ObjectSubType(i)=-2
		Return
	EndIf
		

	If ObjectSubType(i)=-1 
		TurnObjectTowardDirection(i,0,1,4,0)
		Return ; already on its way out
	EndIf
	
	
	If ObjectCaged(i)=True And ObjectSubType(i)<>4 And ObjectSubType(i)<>5
		; just Caged
		EntityTexture ObjectEntity(i),StinkerWeeTextureSad
		PlaySoundFX(66,ObjectTileX(i),ObjectTileY(i))
		If ObjectSubType(i)=2
			ObjectSubType(i)=5
		Else
			ObjectSubType(i)=4
		EndIf
		
		AnimateMD2 ObjectEntity(i),1,.2,108,114,1
	EndIf
	If ObjectCaged(i)=False And (ObjectSubType(i)=4 Or ObjectSubType(i)=5)
		; just released
		EntityTexture ObjectEntity(i),StinkerWeeTexture

		ObjectSubType(i)=ObjectSubType(i)-3
		AnimateMD2 ObjectEntity(i),1,.4,1,20,1
		ObjectCurrentAnim(i)=4
		ObjectMovementTypeData(i)=0
		
		; check if not-moving right now: run to a safe spot if possible
		If ObjectSubType(i)=2 And ObjectTileX(i)=ObjectMoveXGoal(i) And ObjectTileY(i)=ObjectMoveYGoal(i)
			; bingo!
			a=1
			b=1
			If Rand(0,100)<50 a=-1
			If Rand(0,100)<50 b=-1
			For x=-1 To 1 
				For y=-1 To 1
					; check surrounding tiles for empty field
					If CanObjectMoveToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b,True,True)=True
						; found one
						MoveObjectToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b)
						ObjectMoveXGoal(i)=ObjectTileX(i)+x*a
						ObjectMoveYGoal(i)=ObjectTileY(i)+y*b
						x=2
						y=2
					EndIf
				Next
			Next
			; if you couldn't find an escape spot you'll just stay there -in which case the
			; cage will close again immediately
		EndIf
			
	EndIf
	
	If ObjectCaged(i)=True
		TurnObjectTowardDirection(i,ObjectTileX(PlayerObject)-ObjectTileX(i),ObjectTileY(PlayerObject)-ObjectTileY(i),3,0)
		Return
	EndIf
		
		

	
	If ObjectSubType(i)=1 Then NofWeeStinkersFollowing=NofWeeStinkersFollowing+1

	;objectyaw(i)=(objectyaw(i)+1) Mod 360
	
	;ObjectYaw(i)=90

	; OBJECTDATA(0) is used for Animation Timing
	; ObjectData(1) is used for Timer until Falls asleep again
	; ObjectData(2) is used internally to make sure we don't switch animations right after stop walking from tile to tile
	;				and used for snoring Zs
	; ObjectData(6) is used for lavatimer
	
	
	; do visual controls
	
	If ObjectSubType(i)=0 
		EntityTexture ObjectEntity(i),StinkerWeeTextureSleep

	Else
		EntityTexture ObjectEntity(i),StinkerWeeTexture

	EndIf
	
	If ObjectMovementTimer(i)>0 
		ObjectData(i,1)=0
		ObjectData(i,2)=0
		If ObjectFlying(i)/10=1
			; flying
			If ObjectCurrentAnim(i)<>8 ; fly animation
				AnimateMD2 ObjectEntity(i),1,.4,161,180,1
				ObjectCurrentAnim(i)=8
			EndIf
			; turn direction
			TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),4,0)
		Else If ObjectFlying(i)/10=2
			; on ice
			If ObjectCurrentAnim(i)<>9 ; sit animation
				AnimateMD2 ObjectEntity(i),3,2,201,219,1
				ObjectCurrentAnim(i)=9
			EndIf
			ObjectYaw(i)=ObjectYaw(i)+4
			

		Else
		    ; walking
			If ObjectCurrentAnim(i)<>6 ; walk animation
				AnimateMD2 ObjectEntity(i),1,.4,21,40,1
				
				ObjectCurrentAnim(i)=6
			EndIf
			; turn direction
			TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),4,0)
		EndIf
		
		
		; keep awake
		ObjectData(i,1)=0
	Else
		If ObjectSubType(i)=3 ; asleep after walking
			; fall asleep now
			;EntityTexture ObjectEntity(i),StinkerWeeTextureSleep
			AnimateMD2 ObjectEntity(i),3,.2,201,217,1
			ObjectCurrentAnim(i)=7
			ObjectData(i,0)=0
			ObjectData(i,1)=0
			ObjectData(i,2)=4
			ObjectSubType(i)=2
			ObjectMoveXGoal(i)=ObjectTileX(i)
			ObjectMoveYGoal(i)=ObjectTileY(i)
		Else If ObjectData(i,2)<4
			; stopped - but wait a few frames before switching animation
			; (to avoid start/stop animation)
			ObjectData(i,2)=ObjectData(i,2)+1
			
		Else
			; not walking
			If ObjectSubType(i)=0 ; asleep
				ObjectData(i,2)=ObjectData(i,2)+1
				If ObjectData(i,2)>200
					If Rand(0,100)<3  
						AddParticle(9,ObjectTileX(i)+.5,.9,-ObjectTileY(i)-.5,0,0.5,0,0.01,0,0,.001,0,0,0,200,3)
						ObjectData(i,2)=0
						PlaySoundFX(59,ObjectTileX(i),ObjectTileY(i))
					EndIf
					
					
				EndIf
				If ObjectCurrentAnim(i)<>1
					AnimateMD2 ObjectEntity(i),1,Rnd(.002,.008),217,219,1
					ObjectCurrentAnim(i)=1
				EndIf
				If ObjectYaw(i)<>180 Then TurnObjectTowardDirection(i,0,1,5,0)
			

			Else ; either in follow or directive mode, but standing
				
				If ObjectCurrentAnim(i)<>7
					; turn toward player unless sitting
					TurnObjectTowardDirection(i,ObjectTileX(PlayerObject)-ObjectTileX(i),ObjectTileY(PlayerObject)-ObjectTileY(i),3,0)
				EndIf
				If ObjectCurrentAnim(i)<>3 And ObjectCurrentAnim(i)<>4 And ObjectCurrentAnim(i)<>5 And ObjectCurrentAnim(i)<>7
					AnimateMD2 ObjectEntity(i),1,Rnd(.01,.08),141,160,1
					ObjectCurrentAnim(i)=3
					ObjectData(i,0)=0
				Else If ObjectCurrentAnim(i)=3
					; possible wave/tap animation when in directive mode
					If Rand(0,1000)<2 And ObjectData(i,1)>100
						; do an animation
						If (Rand(0,100)<50) ; wave
							PlaySoundFX(Rand(50,54),ObjectTileX(i),ObjectTileY(i))
							AnimateMD2 ObjectENtity(i),3,.2,101,120,1
							ObjectCurrentAnim(i)=4
						Else If objectSubtype(i)=2			   ; tap
							AnimateMD2 ObjectENtity(i),1,.2,121,140,1
							ObjectCurrentAnim(i)=5
						EndIf			
					EndIf
				Else If ObjectCurrentAnim(i)=4
					ObjectData(i,0)=ObjectData(i,0)+1
					If ObjectData(i,0)>100
						ObjectData(i,0)=0
						AnimateMD2 ObjectEntity(i),1,Rnd(.01,.03),141,160,1
						ObjectCurrentAnim(i)=3
					EndIf
				Else If ObjectCurrentAnim(i)=5
					ObjectData(i,0)=ObjectData(i,0)+1
					If ObjectData(i,0)>1500
						ObjectData(i,0)=0
						AnimateMD2 ObjectEntity(i),1,Rnd(.01,.03),141,160,1
						ObjectCurrentAnim(i)=3
					EndIf
				Else If ObjectCurrentAnim(i)=7
					ObjectData(i,0)=ObjectData(i,0)+1
					If ObjectYaw(i)<>180 Then TurnObjectTowardDirection(i,0,1,1,0)

					If ObjectData(i,0)>100
						; asleep
						AnimateMD2 ObjectEntity(i),1,Rnd(.002,.008),217,219,1
						ObjectCurrentAnim(i)=1
						ObjectSubType(i)=0
					EndIf
				EndIf
				
				; If in directive mode - use timer to see if falling asleep again
				If ObjectSubType(i)=1
					ObjectData(i,1)=ObjectData(i,1)+1
					If ObjectData(i,1)>5000 And leveltimer Mod 5000=0
						; bored!
						PlaySoundFX(68,ObjectTileX(i),ObjectTileY(i))
						ObjectData(i,1)=0
 					EndIf
				EndIf
	
				If ObjectSubType(i)=2
					ObjectData(i,1)=ObjectData(i,1)+1
					
					If ObjectData(i,1)>4800
						; fell asleep again
						PlaySoundFX(69,ObjectTileX(i),ObjectTileY(i))
				;		EntityTexture ObjectEntity(i),StinkerWeeTextureSleep
						AnimateMD2 ObjectEntity(i),3,.2,201,217,1
						ObjectCurrentAnim(i)=7
						ObjectData(i,0)=0
						ObjectData(i,1)=0
					EndIf
				EndIf
			EndIf
		EndIf
			
	EndIf
	
	; do logical controls
	If ObjectMovementTimer(i)=0
		; ready to receive new move commands 
		
		; default, keep setting goal as the player
		If ObjectSubType(i)=1
			ObjectMoveXGoal(i)=ObjectTileX(PlayerObject)
			ObjectMoveYGoal(i)=ObjectTileY(PlayerObject)
		EndIf
	
		; special case: check if player is on your tile or entering your tile
		If (ObjectTileLogic(ObjectTileX(i),ObjectTileY(i)) And 2^1) >0
			
			;yes player is on or coming to this tile - "wake up" (if not already) and evacuate!
			If ObjectSubType(i)=0 Then PlaySoundFX(Rand(50,54),ObjectTileX(i),ObjectTileY(i))
			If ObjectSubType(i)=2 Then PlaySoundFX(64,ObjectTileX(i),ObjectTileY(i))
			ObjectSubType(i)=1
			ObjectMovementType(i)=14
			
		;	EntityTexture ObjectEntity(i),StinkerWeeTexture
			flag=False
			a=1
			b=1
			If Rand(0,100)<50 a=-1
			If Rand(0,100)<50 b=-1
			For x=-1 To 1 
				For y=-1 To 1
					; check surrounding tiles for empty field
					If CanObjectMoveToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b,True,True)=True
						; found one
						MoveObjectToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b)
						x=2
						y=2
						flag=True
					EndIf
				Next
			Next
			If flag=False
				; no move was found - try going to player's position
				; we just "delete" the player from that tile and re-check move possibility
				x=ObjectTileX(PlayerObject)
				y=ObjectTileY(PlayerObject)
			
				If (x<>ObjectTileX(i) Or y<>ObjectTileY(i)) And Abs(x-ObjectTileX(i))<=1 And Abs(y-ObjectTileY(i))<=1
					; one step away
					urg=True
					If (ObjectTileLogic(x,y) And 2^1)>0
						ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^1
						If CanObjectMoveToTile(i,x,y,True,True)=True
							MoveObjectToTile(i,x,y)
							flag=True
						EndIf
						ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^1
					EndIf
				EndIf
			EndIf
			If flag=False
				; still coudln't find a move out
				
				; this can happen and be benign, such as if a player walks quickly through a crowd of stinkers:
				; stinkers might be vacating and so haven't quite cleared their last tiles yet, leaving some stinkers stuck
				; until they're clear.
				
				; So I would think we should just leave this as is... however that does leave the theoretical possibility that
				; Stinkers might indeed just get stuck within the player.
				
			EndIf
				
		EndIf	
						
	
	EndIf
	
	
	
	
	

End Function

Function ControlStinkerWeeExit(i)
	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))

	If LevelTimer Mod 3 = 0
		AddParticle(Rand(16,23),ObjectTileX(i)+0.5+0.2*Sin(LevelTimer*10),0,-ObjectTileY(i)-0.5-0.2*Cos(LevelTimer*10),Rand(0,360),0.1,0,0.02,0,0,0.005,0,0,0,100,3)
	EndIf
	
	; check if there is a stinkerwee in the neighbourhood
	For j=0 To NofObjects-1
		If ObjectExists(j)=True And (ObjectType(j)=120 Or ObjectType(j)=400) And ObjectMovementTimer(j)=0 And ObjectSubType(j)=1
			If Abs(ObjectTileX(j)-ObjectTileX(i))<=3 And Abs(ObjectTileY(j)-ObjectTileY(i))<=3
				; got one - change stinker to move toward exit
				ObjectMoveXGoal(j)=ObjectTileX(i)
				ObjectMoveYGoal(j)=ObjectTileY(i)
				ObjectMovementtype(j)=13
				ObjectSubType(j)=2
				
			EndIf
		EndIf
	Next

End Function


Function ControlNPC(i)


	If ObjectFrozen(i)=1
		; freeze
		ObjectFrozen(i)=1000
		ObjectCurrentAnim(i)=11
		Animate GetChild(objectentity(i),3),3,1,11
		PlaySoundFX(85,ObjectX(i),ObjectY(i))

	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		ObjectCurrentAnim(i)=10
		Animate GetChild(objectentity(i),3),1,.05,10

	EndIf
	If ObjectFrozen(i)>2
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		Return
	EndIf


	If ObjectTileTypeCollision(i)=0
		; First time (should later be put into object creation at level editor)
		ObjectData10(i)=-1

		ObjectTileTypeCollision(i)=2^0+2^3+2^4+2^9+2^11+2^12+2^14
		ObjectObjectTypeCollision(i)=2^6
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileX2(i)=Floor(ObjectX(i))
		ObjectTileY2(i)=Floor(ObjectY(i))
		If ObjectMoveXGoal(i)=0 And ObjectMoveYGoal(i)=0
			ObjectMoveXGoal(i)=Floor(ObjectX(i))
			ObjectMoveYGoal(i)=Floor(ObjectY(i))
			;ObjectMovementType(i)=0
			;ObjectMovementTimer(i)=0
			;ObjectSubType(i)=0  
			ObjectCurrentAnim(i)=10
		EndIf
		
				
		
	EndIf
	If ObjectActive(i)=0
		HideEntity(ObjectEntity(i))
	Else
		ShowEntity(ObjectEntity(i))
	EndIf
	
	; Calculate distance to player - used several times
	Dist=maximum2(Abs(ObjectTileX(i)-ObjectTileX(PlayerObject)),Abs(ObjectTileY(i)-ObjectTileY(PlayerObject)))
	; Exclamation
	If ObjectExclamation(i)>=100 And ObjectExclamation(i)<200 And Dist>4
		ObjectExclamation(i)=ObjectExclamation(i)-100
	EndIf
	If ObjectExclamation(i)>=0 And ObjectExclamation(i)<100 And Dist<4
		
		AddParticle(ObjectExclamation(i),ObjectTileX(i)+.5,1.3,-ObjectTileY(i)-.5,0,.5,0,0.0125,0,0,.004,0,-.0001,0,150,3)
		ObjectExclamation(i)=ObjectExclamation(i)+100
	EndIf
	
		
	If ((GameMode<>8 Or DialogObject1<>i) And ObjectLinked(i)=-1) And ObjectData10(i)>=0
		
		; just restarted after talking and/or after transporter
	;	If ObjectMoveXGoal(i)=ObjectTileX(i) And ObjectMoveYGoal(i)=ObjectTileY(i)
			ObjectMoveXGoal(i)=ObjectData10(i) Mod 200
			ObjectMoveYGoal(i)=ObjectData10(i) / 200
			ObjectMovementType(i)=10
	;	EndIf
		ObjectData10(i)=-1
	EndIf
		
	
	If GameMode=8 And DialogObject1=i
		; stop moving when the NPC is talking 
		;If ObjectData10(i)=-1 
		;	ObjectData10(i)=ObjectMoveXGoal(i)+ObjectMoveYGoal(i)*200
		;	ObjectMoveXGoal(i)=ObjectTileX(i)
		;	ObjectMoveYGoal(i)=ObjectTileY(i)
		;EndIf
		If ObjectCurrentAnim(i)<>10 And ObjectData(i,8)<>7 
			ObjectCurrentAnim(i)=10
			Animate GetChild(objectentity(i),3),1,.05,10
		EndIf
		
	Else If ObjectMovementType(i)>0
		; Moving
		If ObjectMovementTimer(i)=0 Then ObjectData(i,9)=ObjectData(i,9)+1
		If ObjectMovementTimer(i)>0 Then ObjectData(i,9)=0
		
		If ObjectData(i,9)>10 ; has been standing for a bit
			Animate GetChild(objectentity(i),3),1,.05,10
			ObjectCurrentAnim(i)=10
			TurnObjectTowardDirection(i,-(ObjectTileX(i)-ObjectMoveXGoal(i)),-(ObjectTileY(i)-ObjectMoveYGoal(i)),4,-ObjectYawAdjust(i))
		Else
			
			If ObjectCurrentAnim(i)<>1
				Animate GetChild(objectentity(i),3),1,.4,ObjectData(i,6)+1
				ObjectCurrentAnim(i)=1
			EndIf
			TurnObjectTowardDirection(i,-(ObjectTileX(i)-ObjectTileX2(i)),-(ObjectTileY(i)-ObjectTileY2(i)),4,-ObjectYawAdjust(i))
		EndIf
			
		; At Goal?
		If ObjectMovementTimer(i)=0 And ObjectTileX(i)=ObjectMoveXGoal(i) And ObjectTileY(i)=ObjectMoveYGoal(i)
			; Done - revert to standing
			ObjectMovementType(i)=0
			ObjectCurrentAnim(i)=10
			Animate GetChild(objectentity(i),3),1,.05,10

		EndIf
		
	Else If ObjectFlying(i)/10=1
		; flying
		If ObjectCurrentAnim(i)<>11
			Animate GetChild(objectentity(i),3),1,1,11
			ObjectCurrentAnim(i)=11
		EndIf
		TurnObjectTowardDirection(i,-(ObjectTileX(i)-ObjectTileX2(i)),-(ObjectTileY(i)-ObjectTileY2(i)),10,-ObjectYawAdjust(i))
	Else If ObjectFlying(i)/10=2
		; on ice
		If ObjectCurrentAnim(i)<>13
			Animate GetChild(objectentity(i),3),3,2,13
			ObjectCurrentAnim(i)=13
		EndIf

	Else 
		; standing controls
		
		; Turning?
		Select ObjectData(i,7) Mod 10
		Case 0
			; Turn toward ObjectYawAdjust, i.e. Angle 0
			If ObjectYaw(i)<>0
				TurnObjectTowardDirection(i,0,1,4,0)
			EndIf
		Case 1
			; Turn Toward Player
			TurnObjectTowardDirection(i,ObjectX(PlayerObject)-ObjectX(i),ObjectY(PlayerObject)-ObjectY(i),6,-ObjectYawAdjust(i))
		
		Case 2
			; Various turning options
			ObjectYaw(i)=(ObjectYaw(i)+.5) Mod 360
		Case 3
			; Various turning options
			ObjectYaw(i)=(ObjectYaw(i)+2) Mod 360
		Case 4
			; Various turning options
			ObjectYaw(i)=(ObjectYaw(i)-.5) Mod 360
		Case 5
			; Various turning options
			ObjectYaw(i)=(ObjectYaw(i)-2) Mod 360
		End Select
		; Jumping?
		If ObjectData(i,7)/10=1
			ObjectZ(i)=0.4*Abs(Sin((Float(Leveltimer)*3.6) Mod 360))
		Else If ObjectData(i,7)/10=2
			ObjectZ(i)=0.2*Abs(Sin((Float(Leveltimer)*7.2) Mod 360))
		EndIf
		; Animation?
		Select ObjectData(i,8)
		Case 0
			; Just Swaying
			If ObjectCurrentAnim(i)<>10
				ObjectCurrentAnim(i)=10
				Animate GetChild(objectentity(i),3),1,.05,10
			EndIf
		Case 1
			; Wave from time to Time
			If ObjectCurrentAnim(i)=10
				If Rand(1,10)<5 And Leveltimer Mod 120 =0 
					ObjectCurrentAnim(i)=8
					Animate GetChild(objectentity(i),3),3,.2,8
				EndIf
			Else If Animating (GetChild(objectentity(i),3))=False
				ObjectCurrentAnim(i)=10
				Animate GetChild(objectentity(i),3),1,.05,10
			EndIf


		Case 2
			; Wave All The Time
			If ObjectCurrentAnim(i)<>15
				ObjectCurrentAnim(i)=15
				Animate GetChild(objectentity(i),3),1,.2,15
			EndIf
		Case 3
			; Foottap from time to Time
			If ObjectCurrentAnim(i)=10
				If Rand(1,10)<5 And Leveltimer Mod 240 =0 
					ObjectCurrentAnim(i)=9
					Animate GetChild(objectentity(i),3),1,.4,9
				EndIf
			Else 
				If Rand(0,1000)<2
					ObjectCurrentAnim(i)=10
					Animate GetChild(objectentity(i),3),1,.05,10
				EndIf
			EndIf
	
		Case 4
			; Foottap All The Time
			If ObjectCurrentAnim(i)<>9
				ObjectCurrentAnim(i)=9
				Animate GetChild(objectentity(i),3),1,.2,9
			EndIf
			
		Case 5
			; Dance
			If ObjectCurrentAnim(i)<>12
				ObjectCurrentAnim(i)=12
				If ObjectData(i,7)>=20
					Animate GetChild(objectentity(i),3),1,.4,12
				Else
					Animate GetChild(objectentity(i),3),1,.2,12
				EndIf
			EndIf
		Case 6
			; Just Sit
			If ObjectCurrentAnim(i)<>14
				ObjectCurrentAnim(i)=14
				Animate GetChild(objectentity(i),3),3,.2,14
			EndIf
		Case 7
			; Sit if far from player, otherwise stand
			
			If ObjectCurrentAnim(i)<>14 And dist>3
				ObjectCurrentAnim(i)=14
				Animate GetChild(objectentity(i),3),3,.4,14
			EndIf
			If ObjectCurrentAnim(i)<>114 And dist<=3
				ObjectCurrentAnim(i)=114
				Animate GetChild(objectentity(i),3),3,-.4,14
			EndIf
		Case 8
			; Sit if far from player, otherwise stand and wave fast
			Dist=maximum2(Abs(ObjectTileX(i)-ObjectTileX(PlayerObject)),Abs(ObjectTileY(i)-ObjectTileY(PlayerObject)))
			If ObjectCurrentAnim(i)<>14 And dist>3
				ObjectCurrentAnim(i)=14
				Animate GetChild(objectentity(i),3),3,.4,14
			EndIf
			If ObjectCurrentAnim(i)<>114 And dist<=3
				ObjectCurrentAnim(i)=114
				Animate GetChild(objectentity(i),3),3,-.4,14
			EndIf
			If ObjectCurrentAnim(i)=114 And Animating(GetChild(objectentity(i),3))=False
				Animate GetChild(objectentity(i),3),3,.4,15
			EndIf




		Case 9
			; Deathwave from time to Time (+Jumping)
			If ObjectCurrentAnim(i)=10
				If Rand(1,10)<5 And Leveltimer Mod 240 =0 
					ObjectCurrentAnim(i)=11
					Animate GetChild(objectentity(i),3),1,.4,11
					If ObjectData(i,y)<10 Then ObjectData(i,7)=ObjectData(i,7)+20
				EndIf
			Else 
				If Leveltimer Mod 120 =0 
					ObjectCurrentAnim(i)=10
					Animate GetChild(objectentity(i),3),1,.05,10
					ObjectData(i,7)=ObjectData(i,7)-20
					ObjectZ(i)=0
				EndIf
			EndIf

		Case 10
			; Deathwave All The Time
			If ObjectCurrentAnim(i)<>11
				ObjectCurrentAnim(i)=11
				If ObjectData(i,7)>=20
					Animate GetChild(objectentity(i),3),1,.4,11
				Else
					Animate GetChild(objectentity(i),3),1,.2,11
				EndIf

			EndIf
		End Select




	EndIf

	

End Function

Function ControlThwart(i)



	If ObjectFrozen(i)=1
		; freeze
		ObjectFrozen(i)=1000

		AnimateMD2 objectentity(i),3,.5,121,135
		;SoundPitch SoundFX(87),44000 
		PlaySoundFX(87,ObjectX(i),ObjectY(i))

	EndIf
	If ObjectFrozen(i)=2
		; revert
		AnimateMD2 objectentity(i),2,0.005,81,82
		ObjectCurrentAnim(i)=10
		ObjectTimer(i)=ObjectData(i,7)
		ObjectFrozen(i)=0
	EndIf
	If ObjectFrozen(i)>2
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		Return
	EndIf


	If ObjectTileTypeCollision(i)=0
		; First time (should later be put into object creation at level editor)
		ObjectData10(i)=-1

		ObjectTileTypeCollision(i)=2^0+2^3+2^4+2^9+2^11+2^12+2^14
		ObjectObjectTypeCollision(i)=2^4+2^6
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileX2(i)=Floor(ObjectX(i))
		ObjectTileY2(i)=Floor(ObjectY(i))
		If ObjectMoveXGoal(i)=0 And ObjectMoveYGoal(i)=0
			ObjectMoveXGoal(i)=Floor(ObjectX(i))
			ObjectMoveYGoal(i)=Floor(ObjectY(i))
			AnimateMD2 objectentity(i),2,0.005,81,82

			ObjectCurrentAnim(i)=10
			
		EndIf
		
				
		
	EndIf
	If objectdata(i,2)>0
		EntityTexture objectentity(i),thwarttexture((objectdata(i,2)) Mod 8)
	EndIf
	
	If ObjectActive(i)=0
		HideEntity(ObjectEntity(i))
	Else
		ShowEntity(ObjectEntity(i))
	EndIf
	
	; Calculate distance to player - used several times
	Dist=maximum2(Abs(ObjectTileX(i)-ObjectTileX(PlayerObject)),Abs(ObjectTileY(i)-ObjectTileY(PlayerObject)))
		
	If ((GameMode<>8 Or DialogObject1<>i) And ObjectLinked(i)=-1) And ObjectData10(i)>=0
		
		; just restarted after talking and/or after transporter
		ObjectMoveXGoal(i)=ObjectData10(i) Mod 200
		ObjectMoveYGoal(i)=ObjectData10(i) / 200
		ObjectMovementType(i)=10

		ObjectData10(i)=-1
	EndIf
		
	; stop moving when the NPC is talking
	If GameMode=8 And DialogObject1=i
		If ObjectCurrentAnim(i)<>10 And ObjectData(i,8)<>7 
			ObjectCurrentAnim(i)=10
			;Animate GetChild(objectentity(i),3),1,.05,10
		EndIf
	Else If ObjectMovementType(i)>0
		; Moving
		If ObjectMovementTimer(i)=0 Then ObjectData(i,9)=ObjectData(i,9)+1
		If ObjectMovementTimer(i)>0 Then ObjectData(i,9)=0
		
		If ObjectData(i,9)>10 ; has been standing for a bit
			AnimateMD2 objectentity(i),2,0.005,81,82

			ObjectCurrentAnim(i)=10
			TurnObjectTowardDirection(i,(ObjectTileX(i)-ObjectMoveXGoal(i)),(ObjectTileY(i)-ObjectMoveYGoal(i)),4,-ObjectYawAdjust(i))
		Else
			
			If ObjectCurrentAnim(i)<>1
				If ObjectData(i,1)=1
					; hands up running
					AnimateMD2 objectentity(i),2,1,41,80
				Else
					; normal
					AnimateMD2 objectentity(i),2,1,1,40

				EndIf
				ObjectCurrentAnim(i)=1
			EndIf
			TurnObjectTowardDirection(i,(ObjectTileX(i)-ObjectTileX2(i)),(ObjectTileY(i)-ObjectTileY2(i)),4,-ObjectYawAdjust(i))
		EndIf
			
		; At Goal?
		If ObjectMovementTimer(i)=0 And ObjectTileX(i)=ObjectMoveXGoal(i) And ObjectTileY(i)=ObjectMoveYGoal(i)
			; Done - revert to standing
			ObjectMovementType(i)=0
			ObjectCurrentAnim(i)=10
			AnimateMD2 objectentity(i),2,0.005,81,82

		EndIf
		
	Else If ObjectFlying(i)/10=1
		; flying
		If ObjectCurrentAnim(i)<>11
		;	Animate GetChild(objectentity(i),3),1,1,11
			ObjectCurrentAnim(i)=11
		EndIf
		TurnObjectTowardDirection(i,(ObjectTileX(i)-ObjectTileX2(i)),(ObjectTileY(i)-ObjectTileY2(i)),10,-ObjectYawAdjust(i))
	Else If ObjectFlying(i)/10=2
		; on ice
		If ObjectCurrentAnim(i)<>13
		;	Animate GetChild(objectentity(i),3),3,2,13
			ObjectCurrentAnim(i)=13
		EndIf

	Else 
		; standing controls
		
		; turn towart player - if present!
		If ObjectType(playerobject)=1 And playerobject<nofobjects
			TurnObjectTowardDirection(i,-ObjectX(PlayerObject)+ObjectX(i),-ObjectY(PlayerObject)+ObjectY(i),6,-ObjectYawAdjust(i))
		Else
			If Objectstatus(i)=0
				ObjectYaw(i)=ObjectYaw(i)+180
				Objectstatus(i)=1
			EndIf
		EndIf
		; shooting?
		If ObjectData(i,6)>0
			dx#=ObjectX(PlayerObject)-ObjectX(i)
			dy#=ObjectY(PlayerObject)-ObjectY(i)
			total#=Sqr(dx^2+dy^2)
			dx=dx/total
			dy=dy/total
			
			ObjectTimer(i)=ObjectTimer(i)-1
			
			If ObjectTimer(i)<0
				If ObjectTimer(i)=-10
					; aquire target now
					ObjectData(i,4)=dx*10000
					ObjectData(i,5)=dy*10000
				EndIf
				If ObjectTimer(i)=-1
					AnimateMD2 ObjectEntity(i),3,1,81,120,1
					
				EndIf
			
				If ObjectTimer(i)=-40
					ObjectTimer(i)=ObjectData(i,7)
				EndIf
				
				; and fire
				If ObjectTimer(i)=-30
					dx#=Float(ObjectData(i,4))/10000.0
					dy#=Float(ObjectData(i,5))/10000.0
					CreateSpellBall(ObjectTileX(i)+.5+.6*dx,ObjectTileY(i)+.5+.6*dy,1.1,.1*dx,.1*dy,1,-1,-1,False,300)
					
					PlaySoundFX(103,ObjectTIleX(i),ObjectTIleY(i))
		
					
				EndIf
		
				
			EndIf
		EndIf



	EndIf

	; check if a pickup has occured
	If (ObjectTileLogic(ObjectTileX(i),ObjectTileY(i)) And 2^4) >0
		; standing on item
		
		For j=0 To NofObjects-1
			If objecttype(j)/10=17 And ObjectActive(j)=1001
				If ObjectTileX(j)=ObjectTileX(i) And ObjectTileY(j)=ObjectTileY(i)
					; got something - pick it up!
					PlaySoundFX(107,ObjectX(i),ObjectY(i))

					ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))=ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))-2^4
									
					ObjectActivationType(j)=0
					ObjectActivationSpeed(j)=20
			
					DeActivateObject(j)
					
				EndIf
			EndIf
		Next
	EndIf
						
					
	If ObjectMovementTimer(i)>0 And ObjectData(i,3)=0 Then PlaySoundFX(106,ObjectX(i),ObjectY(i))

	ObjectData(i,3)=ObjectMovementTimer(i)
	


	

End Function

Function ControlWisp(i)


	If ObjectTileTypeCollision(i)=0
		; First time (should later be put into object creation at level editor)
		ObjectTileTypeCollision(i)=2^0+2^2+2^3+2^4+2^9+2^10+2^11+2^12+2^14
		ObjectObjectTypeCollision(i)=2^6+2^8
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileX2(i)=Floor(ObjectX(i))
		ObjectTileY2(i)=Floor(ObjectY(i))
		ObjectMoveXGoal(i)=Floor(ObjectX(i))
		ObjectMoveYGoal(i)=Floor(ObjectY(i))
		ObjectMovementType(i)=10
		ObjectMovementSpeed(i)=45	
		
		
		ObjectStatus(i)=0
	EndIf
	EntityFX ObjectEntity(i),1
	
	If ((GameMode<>8 Or DialogObject1<>i) And ObjectLinked(i)=-1) And ObjectData10(i)>=0
		
		; just restarted after talking and/or after transporter
	;	If ObjectMoveXGoal(i)=ObjectTileX(i) And ObjectMoveYGoal(i)=ObjectTileY(i)
			ObjectMoveXGoal(i)=ObjectData10(i) Mod 200
			ObjectMoveYGoal(i)=ObjectData10(i) / 200
			ObjectMovementType(i)=10
	;	EndIf
	
		ObjectData10(i)=-1
	
	EndIf

	
	If Leveltimer Mod 360 =0
		a=Rand(0,100)
		If a<60
			ObjectStatus(i)=0
		Else If a<80
			
			ObjectStatus(i)=1
		Else If a<90
		

			objectstatus(i)=2
		Else
		

			objectstatus(i)=3
		EndIf
		
	EndIf
	If ObjectStatus(i)=0
		ObjectZ(i)=0.6+.1*Sin(leveltimer Mod 360)
		ObjectYaw(i)=30*Sin((leveltimer*4) Mod 360)
		ObjectRoll(i)=20*Sin((leveltimer*2) Mod 360)
	Else If ObjectStatus(i)=1

		ObjectZ(i)=0.6+.1*Sin(leveltimer Mod 360)
		ObjectYaw(i)=180*Sin((leveltimer) Mod 360)
		ObjectRoll(i)=20*Sin((leveltimer*2) Mod 360)
	Else If ObjectStatus(i)=2

		ObjectZ(i)=0.6+.1*Sin(leveltimer Mod 360)
		ObjectYaw(i)=360*Sin((leveltimer/2) Mod 360)
		ObjectRoll(i)=180*Sin((leveltimer*2) Mod 360)
	Else If ObjectStatus(i)=3
		ObjectZ(i)=0.6+.4*Sin(leveltimer Mod 180)
		ObjectYaw(i)=60*Sin((leveltimer*4) Mod 360)
		ObjectRoll(i)=20*Sin((leveltimer*2) Mod 360)


	EndIf
	If Rand(0,100)<3 And ObjectActive(i)=1001	AddParticle(Rand(16,23),ObjectTileX(i)+0.5,.7,-ObjectTileY(i)-0.5,Rand(0,360),0.16,Rnd(-.015,.015),0.03,Rnd(-.015,.015),0,0.001,0,-.00025,0,100,3)


End Function



Function CreateColourGateMesh(subtype,tex)
	
	Entity=CreateMesh()
	Surface=CreateSurface(Entity)
	
	; Top 
	AddVertex (surface,-.496,1.04,.496,subtype*0.25+.01,.26)
	AddVertex (surface,.496,1.04,.496,subtype*0.25+.24,.26)
	AddVertex (surface,-.496,1.04,-.496,subtype*0.25+.01,.49)
	AddVertex (surface,.496,1.04,-.496,subtype*0.25+.24,.49)
	AddTriangle (surface,0,1,2)
	AddTriangle (surface,1,3,2)
	AddVertex (surface,-.25,1.08,.25,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51)
	AddVertex (surface,.25,1.08,.25,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51)
	AddVertex (surface,-.25,1.08,-.25,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51+.115)
	AddVertex (surface,.25,1.08,-.25,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51+.115)
	AddTriangle (surface,4,5,6)
	AddTriangle (surface,5,7,6)
	
	; Sides
	For i=0 To 3
		Select i
		Case 0
			x1#=-.49
			x2#=.49
			y1#=-.49
			y2#=-.49
		Case 1
			x1#=.49
			x2#=.49
			y1#=-.49
			y2#=.49
		Case 2
			x1#=.49
			x2#=-.49
			y1#=.49
			y2#=.49
		Case 3
			x1#=-.49
			x2#=-.49
			y1#=.49
			y2#=-.49
		End Select

	
			
		AddVertex (surface,x1,1.04,y1,subtype*0.25+.01,.01)
		AddVertex (surface,x2,1.04,y2,subtype*0.25+.24,.01)
		AddVertex (surface,x1,0,y1,subtype*0.25+.01,.24)
		AddVertex (surface,x2,0,y2,subtype*0.25+.24,.24)
		AddTriangle (surface,8+i*8,9+i*8,10+i*8)
		AddTriangle (surface,9+i*8,11+i*8,10+i*8)
		AddVertex (surface,x1*1.01,.8,y1*1.01,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51)
		AddVertex (surface,x2*1.01,.8,y2*1.01,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51)
		AddVertex (surface,x1*1.01,.6,y1*1.01,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51+.115)
		AddVertex (surface,x2*1.01,.6,y2*1.01,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51+.115)
	
		AddTriangle (surface,12+i*8,13+i*8,14+i*8)
		AddTriangle (surface,13+i*8,15+i*8,14+i*8)
		
		
	Next


	
	
	UpdateNormals Entity
	
	EntityTexture Entity,GateTexture
	Return Entity

End Function

Function RedoGateTexture(i)
	
	
	Surface=GetSurface(ObjectEntity(i),1)
	tex=(ObjectID(i)-500)/5
	; 5 Sides
	For j=0 To 4 
		VertexTexCoords surface,j*8+4,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51
		VertexTexCoords surface,j*8+5,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51
		VertexTexCoords surface,j*8+6,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51+.115
		VertexTexCoords surface,j*8+7,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51+.115
	
	Next
	
	UpdateNormals ObjectEntity(i)
	
	
	
	

End Function



Function ControlGate(i)



	If ObjectID(i)=-1
		ObjectID(i)=500+ObjectData(i,0)*5+ObjectData(i,1)
		
	EndIf

	If ObjectSubType(i)=1 And ObjectYawAdjust(i)=90
		; door gate
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))-1
	Else If ObjectSubType(i)=1 And ObjectYawAdjust(i)=315
		; door gate
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))+1
	Else If ObjectSubType(i)=1 And ObjectYawAdjust(i)=45
		; door gate
		ObjectTileX(i)=Floor(ObjectX(i))+1
		ObjectTileY(i)=Floor(ObjectY(i))

	Else If ObjectSubType(i)=2 And ObjectYawAdjust(i)=0
		; door gate
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))-1
	Else If ObjectSubType(i)=2 And ObjectYawAdjust(i)=90
		; door gate
		ObjectTileX(i)=Floor(ObjectX(i))-1
		ObjectTileY(i)=Floor(ObjectY(i))-1
	Else If ObjectSubType(i)=2 And ObjectYawAdjust(i)=180
		; door gate
		ObjectTileX(i)=Floor(ObjectX(i))-1
		ObjectTileY(i)=Floor(ObjectY(i))
	Else If ObjectSubType(i)=3 And ObjectYawAdjust(i)=90
		; door townhouse1
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))-1
	Else If ObjectSubType(i)=3 And ObjectYawAdjust(i)=315
		; door townhouse1
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))+1
	Else If ObjectSubType(i)=3 And ObjectYawAdjust(i)=45
		; door townhouse1
		ObjectTileX(i)=Floor(ObjectX(i))+1
		ObjectTileY(i)=Floor(ObjectY(i))
	Else If ObjectSubType(i)=4 And ObjectYawAdjust(i)=90
		; door townhouse2
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))-1
	Else If ObjectSubType(i)=4 And ObjectYawAdjust(i)=315
		; door townhouse2
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))+1
	Else If ObjectSubType(i)=4 And ObjectYawAdjust(i)=45
		; door townhouse2
		ObjectTileX(i)=Floor(ObjectX(i))+1
		ObjectTileY(i)=Floor(ObjectY(i))+1




	Else If ObjectSubType(i)<>9 ; not for autodoor (preset and then controlled in activationtype)
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
	EndIf
	
	If ObjectActive(i)<4*ObjectActivationSpeed(i)
			; open 
			If LevelTileLogic(ObjectTileX(i),ObjectTileY(i))<>0
			
				LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=0
			EndIf
			
			
	Else If LevelTileLogic(ObjectTileX(i),ObjectTileY(i))<>1
				
				LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=1
	EndIf
	
	
	; auto door controls
	autoflag=False ;false=keep door closing/closed
	If ObjectSubType(i)=9 Then autoflag=True ;And (ObjectData(i,4)<>0 Or ObjectData(i,5)<>0 Or ObjectData(i,6)<>0 Or ObjectData(i,7)<>0) Then autoflag=True
	
	If ObjectSubType(i)=9 
		For k=4 To 6
			;If ObjectData(i,k)<>0
				For j=0 To nofobjects-1
				ot=ObjectType(j)
					If (ObjectData(i,k)>0 And ObjectData(i,k)=ObjectID(j)) Or (ObjectData(i,k)<0 And ObjectData(i,k)=-ObjectType(j)) Or (ObjectData(i,k)=0 And (ot=1 Or ot=110 Or ot=120 Or ot=150 Or ot=220 Or ot=250 Or ot=260 Or ot=290 Or ot=330 Or ot=370 Or ot=380 Or ot=390 Or ot=391 Or ot=400 Or ot=420 Or ot=422 Or ot=423 Or ot=430 Or ot=431 Or ot=432 Or ot=433))
						
						; got one
						
						If Abs(ObjectTileX(i)-ObjectTileX(j))<3 And Abs(ObjectTileY(i)-ObjectTileY(j))<3
							; close enough, just make sure it's not behind (lower range)
							If ObjectActivationType(i)=17 And ObjectTileY(i)-ObjectTileY(j)=2
								;
							Else If ObjectActivationType(i)=19 And ObjectTileY(i)-ObjectTileY(j)=-2
								;
							Else If ObjectActivationType(i)=18 And ObjectTileX(i)-ObjectTileX(j)=-2
								;
							Else If ObjectActivationType(i)=20 And ObjectTileX(i)-ObjectTileX(j)=2
								;
							Else
							
								DeActivateObject(i)
								

								ObjectData(i,8)=ObjectData(i,7)
								autoflag=False
							EndIf
						EndIf
					EndIf
				Next
			;EndIf
		Next
		
		
	EndIf
	If autoflag=True
		If ObjectData(i,8)>0 ObjectData(i,8)=ObjectData(i,8)-1
		If ObjectData(i,8)<=0 
			ActivateObject(i)
			
		EndIf
	EndIf
	; Sound Effect Controls
	;If ObjectActive(i)<4*ObjectActivationSpeed(i) And ObjectActive(i)>1001-4*ObjectActivationSpeed(i)
		If (ObjectLastActive(i) Mod 2 =0 And ObjectLastActive(i)>0) And ObjectActive(i) Mod 2 =1
			If ObjectSubType(i)=0
				PlaySoundFX(36,	ObjectTileX(i),ObjectTileY(i))	
			;Else If ObjectSubType(i)=9
			;	PlaySoundFX(39,	ObjectTileX(i),ObjectTileY(i))
			Else
				
				PlaySoundFX(37,	ObjectTileX(i),ObjectTileY(i))	
			EndIf
		EndIf
		If ObjectLastActive(i) Mod 2 =0 And ObjectActive(i) Mod 2 =1 And ObjectSubType(i)=9 And LevelTimer>10; autodoor closing
			PlaySoundFX(39,	ObjectTileX(i),ObjectTileY(i))
		EndIf

		If ObjectLastActive(i) Mod 2 =1 And ObjectActive(i) Mod 2 =0
			If ObjectSubType(i)=0
				PlaySoundFX(35,	ObjectTileX(i),ObjectTileY(i))
			Else If ObjectSubType(i)=9
				PlaySoundFX(38,	ObjectTileX(i),ObjectTileY(i))
			Else
				PlaySoundFX(37,	ObjectTileX(i),ObjectTileY(i))	
			EndIf
	
		EndIf
	;EndIf
		
End Function

Function ControlStarGate(i)
	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))
	
	If ObjectData(i,0)<0 Then ObjectData(i,0)=PlayerStars-ObjectData(i,0)

	If ObjectActive(i)=0
		LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=0
		Return
	Else
		LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=1
	EndIf
	If ObjectActive(i)=1001 And ObjectType(i)<>426
		If Abs(ObjectTileX(i)-ObjectTileX(PlayerObject))<=1 And Abs(ObjectTileY(i)-ObjectTileY(PlayerObject))<=1
			If ObjectData(i,1)=1
				; coingate
				If PlayerCoins>=ObjectData(i,0)
					DeActivateObject(i)
					PlaySoundFX(1,-1,-1)
					PlayerCoins=PlayerCoins-ObjectData(i,0)
		
				Else
				;	If MessageLineTimer<=0
						MessageLineTimer=30
						MessageLineText1$="This TollGate will open at the"
						MessageLineText2$="cost of "+ObjectData(i,0)+" coins."
				;	EndIf
				EndIf
			ElseIf ObjectData(i,1)=2
				; scoregate
				If PlayerScore>=ObjectData(i,0)
					DeActivateObject(i)
					PlaySoundFX(1,-1,-1)
		
				Else
				;	If MessageLineTimer<=0
						MessageLineTimer=30
						MessageLineText1$="This ScoreGate will open once you"
						MessageLineText2$="have earned "+ObjectData(i,0)+" score."
				;	EndIf
				EndIf
			Else
				; stargate
				If PlayerStars>=ObjectData(i,0)
					DeActivateObject(i)
					PlaySoundFX(1,-1,-1)
		
				Else
				;	If MessageLineTimer<=0
						MessageLineTimer=30
						MessageLineText1$="This StarGate will open once you"
						MessageLineText2$="have earned "+ObjectData(i,0)+" stars."
				;	EndIf
				EndIf
			EndIf
	
			
		EndIf			
	EndIf

End Function

Function ControlCage(i)

	If ObjectID(i)=-1
		ObjectID(i)=500+ObjectData(i,0)*5+ObjectData(i,1)
	EndIf
	
	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))


	
	If (ObjectActive(i) Mod 2 =1) Or ObjectActive(i)=0 ; ready And waiting
		flag=True
		; just ensure that it's not propped open by a round button
		For k=0 To NofObjects-1	
			If ObjectType(k)=90 And ObjectSubType(k)=1 And ObjectStatus(k)=1	
				For j=0 To 3
					If ObjectExists(k)=True And ObjectID(i)=500+(ObjectData(k,j)-16)*5+ObjectData(k,j+4)
						; bingo
						flag=False
					EndIf
				Next
			EndIf
		Next

		If flag=True
		; check if there's an object below
			For j=0 To NofObjects-1
				If i<>j And ObjectMovementTimer(j)=0 And ObjectExists(j)=True And ObjectCaged(j)=False And ObjectType(j)<>50 And ObjectType(j)<>360
					If ObjectTileX(j)=ObjectTileX(i) And ObjectTileY(j)=ObjectTileY(i) And ObjectFlying(j)/10<>1
						; got one
						ActivateObject(i)
						ObjectCaged(j)=True
						PlaySoundFX(32,ObjectTIleX(i),ObjectTIleY(i))

					EndIf
				EndIf
			Next
		EndIf
	EndIf
	
	If (ObjectActive(i) Mod 2)=0 And ((ObjectActive(i)<=100 And ObjectLastActive(i)>100) Or (ObjectLastActive(i) Mod 2)=1)
		; just opened up again - release anything inside
		
		For j=0 To NofObjects-1
			If i<>j And ObjectExists(j)=True And ObjectCaged(j)=True
				If ObjectTileX(j)=ObjectTileX(i) And ObjectTileY(j)=ObjectTileY(i)
					; got one
					ObjectCaged(j)=False
					
				EndIf
			EndIf
		Next
	EndIf
	
		If ObjectActive(i)=0
			LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=0
		Else
			LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=8
		EndIf
		
End Function
	
	
Function ControlScritter(i)


	If ObjectFrozen(i)=1
		; freeze
		ObjectFrozen(i)=1000

		ObjectPitch(i)=Rand(-30,30)
		ObjectRoll(i)=Rand(-30,30)
		ObjectZ(i)=.3
	
	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		ObjectPitch(i)=0
		ObjectRoll(i)=0
		ObjectZ(i)=0
	EndIf
	If ObjectFrozen(i)>2
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		Return
	EndIf


	

	If ObjectCaged(i)=True And ObjectSubType(i)=0
		; just caged
		ObjectSubType(i)=1
		NofScrittersInAdventure=NofScrittersInAdventure-1
		PlaySoundFX(101,ObjectTIleX(i),ObjectTIleY(i))
		AddParticle(14,ObjectTileX(i)+0.5,1.6,-ObjectTileY(i)-0.5,0,1,0,0.01,0,0,.01,0,0,0,50,3)
		PlayerScore=PlayerScore+100
		CurrentAdventureScore=CurrentAdventureScore+100

	EndIf
	
	If ObjectCaged(i)=False And ObjectSubType(i)=1
		; just released
		ObjectSubType(i)=0
		NofScrittersInAdventure=NofScrittersInAdventure+1
		PlayerScore=PlayerScore-100
		CurrentAdventureScore=CurrentAdventureScore-100


		
		; check if not-moving right now: run to a safe spot if possible
		If ObjectMovementTimer(i)=0
			; bingo!
			a=1
			b=1
			If Rand(0,100)<50 a=-1
			If Rand(0,100)<50 b=-1
			For x=-1 To 1 
				For y=-1 To 1
					; check surrounding tiles for empty field
					If CanObjectMoveToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b,True,True)=True
						; found one
						MoveObjectToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b)
						PlaySoundFX(100,ObjectTIleX(i),ObjectTIleY(i))

						ObjectMoveXGoal(i)=ObjectTileX(i)+x*a
						ObjectMoveYGoal(i)=ObjectTileY(i)+y*b
						x=2
						y=2
					EndIf
				Next
			Next
			; if you couldn't find an escape spot you'll just stay there -in which case the
			; cage will close again immediately
		EndIf

	EndIf

	If ObjectTileTypeCollision(i)=0
		; First time (should later be put into object creation at level editor)
		ObjectTileTypeCollision(i)=2^0+2^3+2^4+2^9+2^10+2^11+2^12+2^14
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileX2(i)=Floor(ObjectX(i))
		ObjectTileY2(i)=Floor(ObjectY(i))
		ObjectMovementTimer(i)=0
		ObjectMovementSpeed(i)=50
		ObjectObjectTypeCollision(i)=2^6

		
	EndIf
	
	If ObjectMovementTimer(i)>0
		ObjectZ(i)=0.4*Abs(Sin(ObjectMovementTimer(i)*360/1000))
		TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),10,0)
	Else
		TurnObjectTowardDirection(i,ObjectTileX(PlayerObject)-ObjectTileX(i),ObjectTileY(PlayerObject)-ObjectTileY(i),6,0)

	EndIf


End Function



Function ControlTrap(i)
	

	If ObjectID(i)=-1
		ObjectID(i)=500+ObjectData(i,0)*5+ObjectData(i,1)
	EndIf

	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))
	ObjectZ(i)=0.04

	If ObjectActive(i)=1001 ; if it's active
		If ObjectStatus(i)=0
			; currently off
			ObjectTimer(i)=ObjectTimer(i)-1
			If ObjectTimer(i)<=0
				; turn on
				PlaySoundFX(30,ObjectTileX(i),ObjectTileY(i))
				ObjectTimer(i)=ObjectTimerMax1(i)
				ObjectStatus(i)=1
			EndIf
		Else
			; currently on
			ObjectTimer(i)=ObjectTimer(i)-1
			If leveltimer Mod 50 =0
				PlaySoundFx(31,ObjectTileX(i),ObjectTileY(i))
			EndIf
			If ObjectTimer(i)<=0
				; turn off
				ObjectTimer(i)=ObjectTimerMax2(i)
				ObjectStatus(i)=0
			EndIf
		EndIf
		
		
		CoveredFlag=False
	;	If ObjectStatus(i)=1
	;		; check if covered
	;		For j=0 To NofObjects-1
	;			If j<>i And ObjectActive(j)=1001
	;				If ObjectAttackPower(i)<=ObjectDefensePower(j)
	;					If ObjectObjectCollision(i,j)=True
	;						CoveredFlag=True
	;					EndIf
	;				EndIf
	;					
	;			EndIf
	;		Next
	;	EndIf

		
		
		If ObjectStatus(i)=1 And CoveredFlag=False
			; destroy objects on it
			For j=0 To NofObjects-1
				If j<>i
					If ObjectActive(j)=1001 And (ObjectType(j)=1 Or ObjectType(j)=120 Or ObjectType(j)=150) 
						If (ObjectMovementTimer(j)>(ObjectMovementSpeed(j)/2) And ObjectTileX(i)=ObjectTileX(j) And ObjectTileY(i)=ObjectTIleY(j)) Or (ObjectMovementTimer(j)<=(ObjectMovementSpeed(j)/2) And ObjectTileX(i)=ObjectTileX2(j) And ObjectTileY(i)=ObjectTIleY2(j))
							DestroyObject(j,1)
						EndIf
					EndIf
					
					If ObjectActive(j)=1001 And ObjectType(j)=400
						If (ObjectMovementTimer(j)>(ObjectMovementSpeed(j)/2) And ObjectTileX(i)=ObjectTileX(j) And ObjectTileY(i)=ObjectTIleY(j)) Or (ObjectMovementTimer(j)<=(ObjectMovementSpeed(j)/2) And ObjectTileX(i)=ObjectTileX2(j) And ObjectTileY(i)=ObjectTIleY2(j))
							ObjectData(j,8)=1
						EndIf
					EndIf
						
				EndIf
			Next
			
		EndIf
		
		Select ObjectSubType(i)
			Case 0
				; fire - create particle when on
				
			If ObjectStatus(i)=1
				If CoveredFlag=False
					If Rand(0,100)<50 AddParticle(2,ObjectX(i)+Rnd(-.1,.1),ObjectZAdjust(i),-ObjectY(i),0-Rnd(-.1,.1),.5,Rnd(-.005,.005),.05,Rnd(-.005,.005),0,.01,0,-.0001,0,50,0)
				Else
					If Rand(0,100)<5 AddParticle(0,ObjectX(i)+Rnd(-.1,.1),ObjectZAdjust(i),-ObjectY(i),0-Rnd(-.1,.1),.3,Rnd(-.005,.005),.02,Rnd(-.005,.005),0,.01,0,-.0001,0,50,0)
				EndIf
			
			EndIf
			
		End Select
	Else
	
		If Rand(0,100)<2 AddParticle(0,ObjectX(i)+Rnd(-.1,.1),ObjectZAdjust(i),-ObjectY(i),0-Rnd(-.1,.1),.3,Rnd(-.005,.005),.02,Rnd(-.005,.005),0,.01,0,-.0001,0,50,0)

		
	EndIf
	

End Function


Function ControlSteppingStone(i)

	If ObjectID(i)=-1
		ObjectID(i)=500+(8+ObjectData(i,0))*5+ObjectData(i,1)
	EndIf

	x=Floor(ObjectX(i))
	y=Floor(ObjectY(i))
	ObjectTileX(i)=x
	ObjectTileY(i)=y

	; Data(2) - Collapse?
	If ObjectData(i,2)=1
		; check if there's weight on it
		
		Weight=False
		
		For j=0 To NofObjects-1
			If ObjectExists(j)=True And ObjectButtonPush(j)=True And i<>j
				; check if object is on tile - either first part of movement (or rest) and x/y, or last part of movement and x2/y2
				If (ObjectTileX(j)=ObjectTileX(i) And ObjectTileY(j)=ObjectTileY(i) And ObjectMovementTimer(j)<500) Or (ObjectTileX2(j)=ObjectTileX(i) And ObjectTileY2(j)=ObjectTileY(i) And ObjectMovementTimer(j)>=500)
					If ObjectFlying(j) /10 <>1
						; Yup
						
						weight=True
					EndIf
				
				EndIf
			EndIf
						
		Next

		
		
		If ObjectStatus(i)=1
			If weight=False
				ObjectStatus(i)=0
				DeactivateObject(i)
			EndIf
		Else
			If weight=True
				ObjectStatus(i)=1
			EndIf
		EndIf
	EndIf
	; Data(2) - Alternating?
	If ObjectData(i,2)=2
		ObjectTimer(i)=ObjectTimer(i)-1
		If ObjectTimer(i)<0 Then ObjectTimer(i)=ObjectTimerMax1(i)
		If ObjectTimer(i)=0
			ToggleObject(i)
			ObjectTimer(i)=ObjectTimerMax1(i)

			
		EndIf
	EndIf
		
	
	; 0-submerged, 1001-surfaced
	If (ObjectActive(i)<1001-4*ObjectActivationSpeed(i)) And ObjectLastActive(i)>=1001-4*ObjectActivationSpeed(i)

		; just submerged
		If ObjectData(i,3)=0
			PlaySoundFX(34,ObjectX(i),ObjectY(i))
			LevelTileLogic(x,y)=2
			AddParticle(4,Floor(ObjectX(i))+0.5,-0.4,-Floor(ObjectY(i))-0.5,0,.6,0,0,0,0,.006,0,0,0,50,4)
		Else If ObjectData(i,3)=1
			PlaySoundFX(35,ObjectX(i),ObjectY(i))
			LevelTileLogic(x,y)=2
		Else If ObjectData(i,3)=2
			PlaySoundFX(90,ObjectX(i),ObjectY(i))
			LevelTileLogic(x,y)=2
		EndIf


	
	EndIf
	
	If (ObjectActive(i)=>1001-4*ObjectActivationSpeed(i)) And ObjectLastActive(i)<1001-4*ObjectActivationSpeed(i)
		
		; just emerged
		If ObjectData(i,3)=0
			PlaySoundFX(33,ObjectX(i),ObjectY(i))
			LevelTileLogic(x,y)=4
			AddParticle(4,Floor(ObjectX(i))+0.5,-0.4,-Floor(ObjectY(i))-0.5,0,1,0,0,0,0,.006,0,0,0,100,4)
		Else If ObjectData(i,3)=1
			PlaySoundFX(36,ObjectX(i),ObjectY(i))
			LevelTileLogic(x,y)=4
		Else If ObjectData(i,3)=2
			PlaySoundFX(91,ObjectX(i),ObjectY(i))
			LevelTileLogic(x,y)=4
		EndIf

		; destroy any transporters/icefloats/growflowers above it
		For j=0 To NofObjects-1
			If ObjectType(j)=210 Or ObjectType(j)=300
				If (ObjectTileX(j)=ObjectTileX(i) And ObjectTileY(j)=ObjectTileY(i)) Or (ObjectTileX2(j)=ObjectTileX(i) And ObjectTileY2(j)=ObjectTileY(i))
					
					DestroyObject(j,0)
				EndIf
			EndIf
					
		Next
		
		
	EndIf

	
End Function


Function CreateTeleporterMesh(tex)


	
	entity=CreateCylinder(16,False)
	;ObjectTexture(i)=TeleporterTexture(texture)	
	
	PositionMesh entity,0,1,0
	ScaleMesh entity,.4,2,.4
	EntityAlpha entity,.6
	;EntityTexture ObjectEntity(i),ObjectTexture(i)
	EntityBlend entity,3
	EntityFX entity,2
	For j=0 To 16
		VertexColor GetSurface(entity,1),j*2,0,0,0
	Next
	
	If TeleporterTexture(tex)>0
		EntityTexture entity,TeleporterTexture(tex)
	Else
		; default red
		EntityTexture entity,TeleporterTexture(0)
	EndIf

	
	Return entity
End Function
	
	

Function ControlTeleporter(i)

;Teleporter
;* ObjectType = 30;
;* In Editor, can only be laced unto Empty Floor (as it turns into Empty Floor LevelTileLogic when de-activating)
;* Variables:	ID (both For activation, And To find matching pair)
;		Texture (For colour)
;		Active (True False)
;		
;* To DO Still: Check If a non-teleportable Object is at End-location. If so, destroy it.


	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))
	
	If ObjectID(i)=-1 Then ObjectID(i)=500+ObjectData(i,0)*5+ObjectData(i,1)	
	
	If Rand(0,100)<5 And ObjectActive(i)>0
		a=Rand(0,360)
		b#=Rnd(0.002,0.006)
		AddParticle(23,ObjectX(i)+0.5*Sin(a),0,-ObjectY(i)-0.5*Cos(a),0,.2,b*Sin(a),0.015,-b*Cos(a),1,0,0,0,0,150,3)
	EndIf
	
	ObjectYaw(i)=ObjectYaw(i)+.5
	If ObjectID(i) Mod 5<3
		; standard effect
		ScaleEntity ObjectEntity(i),1,ObjectActive(i)/1001.0,1
	Else If ObjectID(i) Mod 5=3
		; unstable effect
		ObjectYaw(i)=ObjectYaw(i)+4.5
		ObjectXScale(i)=0.6+0.4*Sin ((LevelTimer/7) Mod 360)
		ObjectZScale(i)=ObjectActive(i)/1001.0
		ObjectYScale(i)=0.6+0.4*Cos ((LevelTimer/2) Mod 360)
		;ScaleEntity ObjectEntity(i),0.6+0.4*Sin ((LevelTimer/7) Mod 360),,
	Else
		; pulsating effect
		ObjectYaw(i)=ObjectYaw(i)+9.5
		ObjectXScale(i)=0.6+0.4*Sin ((LevelTimer) Mod 360)
		ObjectZScale(i)=ObjectActive(i)/1001.0
		ObjectYScale(i)=0.6+0.4*Sin ((LevelTimer) Mod 360)

		;ScaleEntity ObjectEntity(i),,ObjectActive(i)/1001.0,)
	EndIf


	If ObjectActive(i)>0 And ObjectLastActive(i)=0
		PlaySoundFX(90,ObjectTileX(i),ObjectTileY(i))
	EndIf
		
	If ObjectActive(i)=1001 And ObjectLastActive(i)<1001
		; just became active
		LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=3
		
	EndIf
	If ObjectActive(i)<1001 And ObjectLastActive(i)=1001
		; just deactivated - revert to floor
		LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=0
		PlaySoundFX(91,ObjectTileX(i),ObjectTileY(i))

	EndIf
	
	
End Function

Function CreateUsedItem(x,y,tex)

	i=CreateNewObject()
	
	ObjectX(i)=x+.5
	ObjectY(i)=y+.5
	ObjectZ(i)=2.0
	
	ObjectModelName$(i)="!Item"
	ObjectTextureName$(i)="models\icons-standard.bmp"
	
	
	ObjectEntity(i)=CreatePickUpItemMesh(tex)
	EntityTexture ObjectEntity(i),IconTextureStandard
	
	ObjectType(i)=71
	ObjectID(i)=-1
	
	ObjectTimer(i)=120
	
End Function	

Function ControlUsedItem(i)

	
		
	ObjectYaw(i)=(ObjectYaw(i)+10) Mod 360
	
	
	
	If ObjectTimer(i)=120
		For j=0 To 29
			k=Rand(0,360)
			AddParticle(23,ObjectX(i)+1.8*Sin(k),ObjectZ(i),-ObjectY(i)-1.8*Cos(k),0,.4,-0.06*Sin(k),0,0.06*Cos(k),5,0,0,0,0,30,3)
		Next
	EndIf
	
	ObjectTimer(i)=ObjectTimer(i)-1
	
	If ObjectTimer(i)<=0 DestroyObject(i,0)

End Function



Function CreateButtonMesh(i,btype,col1,col2,col3,col4)
	; texture is the available "colour" from 0-15
	
	
	If btype=11 Or btype>=32
		; npc commands or invisible
		objectentity(i)=CreatePivot()

		Return
	EndIf
	; expired adventurestart button?
	If btype=13
		If AdventureCompleted(ObjectData(i,0))=1 
			ObjectSubType(i)=14
			btype=14
		EndIf
	EndIf
		
	If btype>=5 And btype<10 ; Switchers, only use two colours
		col3=col1
		col4=col2
	EndIf
	
	If btype=16 Or btype=17; rotator
		col2=col1
		col3=col1
		col4=col1
	EndIf

	
	ObjectEntity(i)=CreateMesh()
	surface=CreateSurface(ObjectEntity(i))
	
	; first, the outline shape
	AddVertex (surface,-.45,0.06,.45,(btype Mod 8)*0.125,(btype/8)*0.125)
	AddVertex (surface,.45,0.06,.45,(btype Mod 8)*0.125+0.125,(btype/8)*0.125)
	AddVertex (surface,-.45,0.06,-.45,(btype Mod 8)*0.125,(btype/8)*0.125+0.125)
	AddVertex (surface,.45,0.06,-.45,(btype Mod 8)*0.125+0.125,(btype/8)*0.125+0.125)
	AddTriangle (surface,0,1,2)
	AddTriangle (surface,1,3,2)
	
	If btype<10 Or btype>14 ; no colours for levelexit, npc command, stinkerexit, adventurestart
	
		; now the four colours - the placement of these depend on the btype shape
		Select btype
		Case 0,5
			; square
			nudge#=.01
			radius#=.4
			alt=True
		Case 1,6,16,17
			; circle
			nudge#=.01
			radius#=.3
			alt=True
		Case 2,3,7,8
			; diamond
			nudge#=.01
			radius#=.4
			alt=False
		Case 4,9
			; star
			nudge#=.01
			radius#=.28
			alt=True
					
		End Select
		nudge2#=.002
		
		AddVertex (Surface,-radius,0.02,radius,(col1 Mod 8)*0.125+nudge,(col1/8)*0.125+0.5+nudge)
		AddVertex (Surface,nudge2,0.02,radius,(col1 Mod 8)*0.125+0.125-nudge,(col1/8)*0.125+.5+nudge)
		AddVertex (Surface,-radius,0.02,-nudge2,(col1 Mod 8)*0.125+nudge,(col1/8)*0.125+0.5+.125-nudge)
		AddVertex (Surface,nudge2,0.02,-nudge2,(col1 Mod 8)*0.125+0.125-nudge,(col1/8)*0.125+.5+.125-nudge)
		If alt=True
			
			AddTriangle (surface,4,5,6)
			AddTriangle (surface,5,7,6)
		Else
			AddTriangle (surface,5,7,6)
		EndIf
		
		AddVertex (Surface,-nudge2,0.02,radius,(col2 Mod 8)*0.125+nudge,(col2/8)*0.125+0.5+nudge)
		AddVertex (Surface,radius,0.02,radius,(col2 Mod 8)*0.125+0.125-nudge,(col2/8)*0.125+.5+nudge)
		AddVertex (Surface,-nudge2,0.02,-nudge2,(col2 Mod 8)*0.125+nudge,(col2/8)*0.125+0.5+.125-nudge)
		AddVertex (Surface,radius,0.02,-nudge2,(col2 Mod 8)*0.125+0.125-nudge,(col2/8)*0.125+.5+.125-nudge)
		If alt=True
			AddTriangle (surface,8,9,10)
			AddTriangle (surface,9,11,10)
		Else
			AddTriangle (surface,8,11,10)
		EndIf
		
		AddVertex (Surface,-radius,0.02,nudge2,(col3 Mod 8)*0.125+nudge,(col3/8)*0.125+0.5+nudge)
		AddVertex (Surface,nudge2,0.02,nudge2,(col3 Mod 8)*0.125+0.125-nudge,(col3/8)*0.125+.5+nudge)
		AddVertex (Surface,-radius,0.02,-radius,(col3 Mod 8)*0.125+nudge,(col3/8)*0.125+0.5+.125-nudge)
		AddVertex (Surface,nudge2,0.02,-radius,(col3 Mod 8)*0.125+0.125-.02,(col3/8)*0.125+.5+.125-nudge)
		If alt=True
			AddTriangle (surface,12,13,14)
			AddTriangle (surface,13,15,14)
		Else
			AddTriangle (surface,12,13,15)
		EndIf
		
		AddVertex (Surface,-nudge2,0.02,nudge2,(col4 Mod 8)*0.125+nudge,(col4/8)*0.125+0.5+nudge)
		AddVertex (Surface,radius,0.02,nudge2,(col4 Mod 8)*0.125+0.125-nudge,(col4/8)*0.125+.5+nudge)
		AddVertex (Surface,-nudge2,0.02,-radius,(col4 Mod 8)*0.125+nudge,(col4/8)*0.125+0.5+.125-nudge)
		AddVertex (Surface,radius,0.02,-radius,(col4 Mod 8)*0.125+0.125-nudge,(col4/8)*0.125+.5+.125-nudge)
		If alt=True
			AddTriangle (surface,16,17,18)
			AddTriangle (surface,17,19,18)
		Else
			AddTriangle (surface,16,17,18)
		EndIf
	EndIf

	If btype=10 Then EntityFX ObjectEntity(i),1
	
	UpdateNormals ObjectEntity(i)
	
	EntityTexture ObjectEntity(i),ButtonTexture
	
	

End Function





Function ControlButton(i)

	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))
	
	ObjectZ(i)=0.02
	If ObjectActive(i)=1001
			
		; check if weight is on button
		Weight=False
		
		For j=0 To NofObjects-1
			If ObjectExists(j)=True And ObjectButtonPush(j)=True And i<>j
				; check if object is on tile - either first part of movement (or rest) and x/y, or last part of movement and x2/y2
				If (ObjectTileX(j)=ObjectTileX(i) And ObjectTileY(j)=ObjectTileY(i) And ObjectMovementTimer(j)<500) Or (ObjectTileX2(j)=ObjectTileX(i) And ObjectTileY2(j)=ObjectTileY(i) And ObjectMovementTimer(j)>=500)
					; Yup
					
					weight=True
					
					; but: somethings do not register
					If j<>PlayerObject And (ObjectSubtype(i)=10 Or ObjectSubType(i)=13)
						; don't activate exitlevel command unless player
						weight=False
					EndIf
					If ObjectData(i,8)>0 And ObjectID(j)<>ObjectData(i,8)
						
						; only activate this button with matching ID
						weight=False
					EndIf
					If ObjectData(i,8)=-2 And j<>PLayerObject
						weight=False
					EndIf
					If ObjectFlying(j)/10 = 1 
						weight=False
					EndIf
					
				EndIf
			EndIf
						
		Next
	
		If weight=True
			; do all of these in a separat function, so that they can be easily activated e.g. via powerspell from another function
			ObjectData10(i)=0
			ActivateButton(i)
		
		EndIf
		If weight=False
			; short waiting period before shutting off
			If ObjectData10(i)>=0
				ObjectData10(i)=-1
			Else 
				ObjectData10(i)=ObjectData10(i)-1
				If ObjectData10(i)<-5
				
					
		
		
					; and now all the weight=false etc.
					Select (ObjectSubType(i))
					Case 0,32
						; Colour Square Button
						; no stepping off needed
					Case 1,33
						; Colour Round Button
						; Stepping Off
						If weight=False And ObjectStatus(i)=1
						;	PlaySoundFX(21,-1,-1)
						
							ObjectStatus(i)=0
							For j=0 To 3 ; go through all four colours
								If ObjectData(i,j)>15 ; deactivated 
								
									
									; check if there isn't another button currently pressed (round)
									flag=False
									For k=0 To NofObjects-1
										If ObjectExists(k)=True And ObjectType(k)=90
											If (ObjectSubType(k)=1 Or ObjectSubType(k)=33) And ObjectStatus(k)=1
												For k2=0 To 3
													If (ObjectData(i,j) Mod 16)*5+ObjectData(i,j+4)=(ObjectData(k,k2) Mod 16)*5+ObjectData(k,k2+4)
														flag=True
													EndIf
												Next
											EndIf
										EndIf
									Next
									If flag=False
										; deactivate teleporters, but close gates, etc
										For k=0 To NofObjects-1
											If ObjectExists(k)=True And ObjectID(k)=500+(ObjectData(i,j)-16)*5+ObjectData(i,j+4)
												
												If ObjectType(k)=10 Or ObjectType(k)=140 Or ObjectType(k)=20 Or ObjectType(k)=424
				
													ActivateObject(k)
													
												Else If ObjectType(k)=210
													; do nothing for transporters
												Else 
													DeActivateObject(k)
												EndIf
												
											EndIf
										Next
									EndIf
			
									
								
									ObjectData(i,j)=ObjectData(i,j)-16
									If ObjectSubType(i)<32 Then ReDoButtonTexture(i)
								EndIf
							Next
						EndIf
			
			
					Case 2,34
						; Colour Diamond Locked Button
						; no stepping off needed
						
					Case 3,35
						; Colour Dimaond Button
						; Stepping Off - Just Re-Enable this button (not a second toggle)
						If weight=False And ObjectStatus(i)=1
							ObjectStatus(i)=0
							;PlaySoundFX(21,-1,-1)
			
							For j=0 To 3 ; go through all four colours
								If ObjectData(i,j)>15 ; deactivated 
									
								
									; since we don't want to toggle back and forth, disable any other colours of this type
									For j2=j+1 To 3
										If ObjectData(i,j2)=ObjectData(i,j) Then ObjectData(i,j2)=ObjectData(i,j2)-16
									Next
									ObjectData(i,j)=ObjectData(i,j)-16
									
									
									If ObjectSubType(i)<32 Then ReDoButtonTexture(i)
			
								EndIf
							Next
						EndIf
			
			
					
					Case 4,36
						; Colour Star Button
						; Rotating
						
						ObjectYaw(i)=-(ObjectStatus(i) Mod 360)
						
						
						If weight=False And ObjectStatus(i)>360 Then ObjectStatus(i)=ObjectStatus(i)-360
						; Timer Off
						If (ObjectStatus(i) Mod 360)<>0 Then ObjectStatus(i)=ObjectStatus(i)+1
						If ObjectStatus(i)=360 Or ObjectStatus(i)=720
							If ObjectStatus(i)=360 Then ObjectStatus(i)=0
							For j=0 To 3 ; go through all four colours
								If ObjectData(i,j)>15 ; deactivated 
									; deactivate teleporters, close gates, etc
									For k=0 To NofObjects-1
										If ObjectExists(k)=True And ObjectID(k)=500+(ObjectData(i,j)-16)*5+ObjectData(i,j+4)
											If ObjectType(k)=10 Or ObjectType(k)=140 Or ObjectType(k)=20 Or ObjectType(k)=424
			
												ActivateObject(k)
											Else If ObjectType(k)=210 Or ObjectType(k)=432
												; do nothing for transporters
											Else If ObjectType(k)=45 
													If ObjectData(k,5)=0 
														DeActivateObject(k) ; mover - just turns off
				
													EndIf
												
											Else If ObjectType(k)=46
												; do nothing!
												
											Else 
												DeActivateObject(k)
											EndIf
										EndIf
									Next
			
									
									; reactivate all square/dimaondround/star buttons
								;	For k=0 To NofObjects-1
								;		If ObjectType(k)=90 And (ObjectSubType(k)<4) And k<>i
								;			For k2=0 To 3
								;				If (ObjectData(k,k2))=(ObjectData(i,j)) Then ObjectData(k,k2)=ObjectData(k,k2)-16
								;			Next
								;			ReDoButtonTexture(k)
								;		EndIf
								;		
								;	Next
									; and turn off this button
									ObjectData(i,j)=ObjectData(i,j)-16
									If ObjectSubType(i)<32 Then ReDoButtonTexture(i)
								EndIf
							Next
						EndIf
					Case 5,6,37,38
						; ColourChange Square/Round Button
						If weight=False And ObjectStatus(i)=1
							ObjectStatus(i)=0
							For j=0 To 2 Step 2 
								; round - reactivate
								If (ObjectSubType(i) Mod 32)=6 And ObjectData(i,j)>15
									ObjectData(i,j)=ObjectData(i,j)-16
									ObjectData(i,j+1)=ObjectData(i,j+1)-16
									
									
			
								EndIf
								ReDoButtonTexture(i)
							Next
						EndIf
					Case 7,8,39,40
						; ColourChange Diamond Button
						
						If weight=False And ObjectStatus(i)=1
							ObjectStatus(i)=0
							j=0
								; round - reactivate
								If (ObjectSubType(i) Mod 32)=8 And ObjectData(i,j)>15
									ObjectData(i,j)=ObjectData(i,j)-16
									ObjectData(i,j+1)=ObjectData(i,j+1)-16
								EndIf
								ReDoButtonTexture(i)
							
						EndIf
					End Select
				EndIf
			EndIf
		EndIf
		
		
			Select (ObjectSubType(i))
	
			Case 9,41
				; Colourchange star button
				; Rotating
				
				ObjectYaw(i)=-(ObjectStatus(i) Mod 360)
				
				
				If weight=False And ObjectStatus(i)>360 Then ObjectStatus(i)=ObjectStatus(i)-360
				; Timer Off
				If (ObjectStatus(i) Mod 360)<>0 Then ObjectStatus(i)=ObjectStatus(i)+1
				If ObjectStatus(i)=360 Or ObjectStatus(i)=720
					If ObjectStatus(i)=360 Then ObjectStatus(i)=0
					j=0
						If ObjectData(i,j)>15 ; deactivated
							; reactivate this button
							ObjectData(i,j)=ObjectData(i,j)-16
							ObjectData(i,j+1)=ObjectData(i,j+1)-16
	
							; change colours
							For k=0 To NofObjects-1
								If ObjectExists(k)=True And ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									
									If ObjectType(k)=10
										; gates
										ObjectID(k)=500+ObjectData(i,j+0)*5+ObjectData(i,j+2)
										ReDoGateTexture(k)
	
									
									Else If ObjectType(k)=30
										; teleporters
										ObjectID(k)=500+ObjectData(i,j+0)*5+ObjectData(i,j+2)
										EntityTexture ObjectEntity(k),TeleporterTexture((ObjectID(k)-500)/5)
									Else If ObjectType(k)=210
										; transporters
										ObjectID(k)=500+ObjectData(i,j+0)*5+ObjectData(i,j+2)
									Else If ObjectType(k)=45 Or objecttype(k)=46
										; conveyors
										ObjectID(k)=500+ObjectData(i,j+0)*5+ObjectData(i,j+2)
										ReDoTransporterTexture(k)
										
									Else If ObjectType(k)=410
										; Flipbridge
										ObjectID(k)=500+ObjectData(i,j+0)*5+ObjectData(i,j+2)
										ReDoFlipbridgeTexture(k)
										
									Else If ObjectType(k)=40
										; stepping stones
										If ObjectData(i,j+0)>=8 And ObjectData(i,j+0)<12
											ObjectID(k)=500+ObjectData(i,j+0)*5+ObjectData(i,j+2)
											ObjectData(k,0)=ObjectData(i,j+0)-8
											ObjectData(k,1)=ObjectData(i,j+2)
											EntityTexture ObjectEntity(k),SteppingStoneTexture(ObjectData(k,0))
										EndIf
									Else If ObjectType(k)=432
										; pushbot
										ObjectID(k)=500+ObjectData(i,j+0)*5+ObjectData(i,j+2)
										RedoPushbotTexture(k)
									Else If ObjectType(k)=281
										; suctube
										ObjectID(k)=500+ObjectData(i,j+0)*5+ObjectData(i,j+2)
										ObjectData(k,0)=ObjectData(i,j)
										ObjectData(k,1)=ObjectData(i,j+2)
										Redosuctubemesh(k)
	
	
										
									EndIf
								EndIf
							Next
	
													
														
							ReDoButtonTexture(i)
						EndIf
	
				EndIf
			Case 10
				; LevelExit
				If weight=True
					ActivateCommand(7,ObjectData(i,1),ObjectData(i,2),ObjectData(i,3),0)
				EndIf
				
			Case 11
				; NPC Control
				If weight=True
					
					If ObjectData(i,0)=0
						; Move Command
						If ObjectData(i,6)=0 Then ObjectData(i,6)=ObjectData(i,5)
						If ObjectData(i,5)<=0
							ObjectData(i,5)=ObjectData(i,6)
							If GameMode<>8
								; don't do this if in conversation
								ActivateCommand(61,ObjectData(i,1),ObjectData(i,2),ObjectData(i,3),0)
							EndIf
							If ObjectData(i,4)=1 ; disable button after use
								ObjectActive(i)=0
							EndIf
						Else
							ObjectData(i,5)=ObjectData(i,5)-1
						EndIf
					Else If ObjectData(i,0)=1
						; Change NPC Command
						
						ActivateCommand(62,ObjectData(i,1),ObjectData(i,2),ObjectData(i,3),ObjectData(i,4))
						ActivateCommand(63,ObjectData(i,1),ObjectData(i,6),ObjectData(i,7),ObjectData(i,9))
						If ObjectData(i,5)=1 ; disable button after use
							ObjectActive(i)=0
							
						EndIf
					Else If ObjectData(i,0)=2
						; NPC Exlamation
						ActivateCommand(64,ObjectData(i,1),ObjectData(i,2),ObjectData(i,3),0)
					
						If ObjectData(i,4)=1 ; disable button after use
							ObjectActive(i)=0
						Else 
							ObjectActive(i)=1
							ObjectActivationSpeed(i)=2
						EndIf
	
					EndIf
						
				EndIf
				
			Case 12
				; StinkerWeeExit - no control from here
				
			Case 13
				
				If weight=True
					; AdventureStart
					ActivateCommand(8,ObjectData(i,0),0,0,0)
				EndIf
			Case 14
				; Expired Adventure Start - no control
	
			Case 15
				If weight=True And ObjectStatus(i)=0
					; General Command
					ActivateCommand(ObjectData(i,0),ObjectData(i,1),ObjectData(i,2),ObjectData(i,3),ObjectData(i,4))
					If ObjectData(i,5)=1
						ObjectActive(i)=0
					EndIf
					ObjectStatus(i)=1
				EndIf
				If weight=False And ObjectStatus(i)=1
					ObjectStatus(i)=0
	
				EndIf
			Case 16,17,48,49
				;rotator
				If weight=False And ObjectStatus(i)=1
					ObjectStatus(i)=0
					
					
				EndIf
			End Select
		
				
		
				
		
	
	EndIf
	If ObjectSubType(i)=13
		; do "starblast" when AdventureStart first activated
		If ObjectActive(i)>20 And ObjectLastActive(i)<=20
			For j=0 To 359 Step 20
			;	j=Rand(0,359)
				;AddParticle(19,ObjectTileX(i)+.5+.3*Sin(j),0,-ObjectTileY(i)-.5-.3*Cos(j),0,.2,.02*Sin(j),.06,-.02*Cos(j),4,0,0,-.002,0,70,4)
				AddParticle(19,ObjectTileX(i)+.5+.3*Sin(j),0,-ObjectTileY(i)-.5-.3*Cos(j),0,.1,.02*Sin(j),.004,-.02*Cos(j),8,.002,0,-.000,0,70,4)

			Next
			
		EndIf
	EndIf
	
	
End Function

Function ActivateButton(i)

	; basically the weight=true routines are listed here. Useful for Power Spell: needs to activate button from other functions
	weight=True
	Select (ObjectSubType(i))
		Case 0,32
			; Colour Square Button
			If weight=True 
				
				For j=0 To 3 ; go through all four colours
					If ObjectData(i,j)<16 ; not deactivated yet
						If ObjectSubType(i)<32 Then PlaySoundFX(21,ObjectTileX(i),ObjectTileY(i))
						; activate teleporters, open gates, etc
						For k=0 To NofObjects-1
							If ObjectExists(k)=True And ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+4)
								
								If ObjectType(k)=10 Or ObjectType(k)=140 Or ObjectType(k)=20 Or ObjectType(k)=424
									DeActivateObject(k)
								Else If ObjectType(k)=210
							
									ActivateTransporter(k)
								Else If ObjectType(k)=45
									
									If  ObjectData(k,5)=1 And ObjectActive(k)=1001 And ObjectMovementTimer(k)=0
										ActivateConveyor(k) ; stepper- makes one move
									Else If ObjectData(k,5)=0 
										ActivateObject(k) ; mover - just turns on

									EndIf

								
								Else If ObjectType(k)=46
									; do nothing!
								Else If ObjectType(k)=432
									If ObjectSubType(k)=0
										SoundPitch (SoundFX(98),Rand(19000,25000))
										PlaySoundFX(98,ObjectTileX(i),ObjectTileY(i))
									Else
										SoundPitch (SoundFX(98),Rand(9000,15000))
										PlaySoundFX(98,ObjectTileX(i),ObjectTileY(i))
									EndIf

									ObjectMovementType(k)=81+2*ObjectData(k,2)+(ObjectData(k,3) Mod 2)
								Else
									ActivateObject(k)
								EndIf
							EndIf
						Next

						
						; turn off all round/star buttons
			;			For k=0 To NofObjects-1
			;				If ObjectType(k)=90 And (ObjectSubType(k)=1 Or ObjectSubType(k)=4) And k<>i
			;					For k2=0 To 3
			;						If (ObjectData(k,k2) Mod 16)=(ObjectData(i,j) Mod 16) And ObjectData(k,k2+4)=ObjectData(i,j+4) Then ObjectData(k,k2)=15
			;					Next
			;					
			;					ReDoButtonTexture(k)
			;				EndIf
			;				
			;			Next
						; and turn off this button
						ObjectData(i,j)=31
						If ObjectSubType(i)<32 Then ReDoButtonTexture(i)
					EndIf
				Next
			EndIf
		Case 1,33
			; Colour Round Button
			; Stepping On
			If weight=True
				ObjectStatus(i)=1 
				For j=0 To 3 ; go through all four colours
					If ObjectData(i,j)<16 ; not deactivated yet
					
						
					
						If ObjectSubType(i)<32  Then PlaySoundFX(21,ObjectTileX(i),ObjectTileY(i))

						; activate teleporters, open gates, etc
						For k=0 To NofObjects-1
							If ObjectExists(k)=True And ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+4)
								If ObjectType(k)=10 Or ObjectType(k)=140 Or ObjectType(k)=20 Or ObjectType(k)=424

									DeActivateObject(k)
								Else If ObjectType(k)=210
									ActivateTransporter(k)
								Else If ObjectType(k)=45
									
									If  ObjectData(k,5)=1 And ObjectActive(k)=1001 And ObjectMovementTimer(k)=0
										ActivateConveyor(k) ; stepper- makes one move
									Else If ObjectData(k,5)=0 
										ActivateObject(k) ; mover - just turns on

									EndIf

								Else If ObjectType(k)=46
									; do nothing!
								Else If ObjectType(k)=432
									If ObjectSubType(k)=0
										SoundPitch (SoundFX(98),Rand(19000,25000))
										PlaySoundFX(98,ObjectTileX(i),ObjectTileY(i))
									Else
										SoundPitch (SoundFX(98),Rand(9000,15000))
										PlaySoundFX(98,ObjectTileX(i),ObjectTileY(i))
									EndIf

									ObjectMovementType(k)=81+2*ObjectData(k,2)+(ObjectData(k,3) Mod 2)

								Else 
									ActivateObject(k)
								EndIf
							EndIf
						Next

						
						; deactivate all dimaond/round/star (not square!) buttons
			;			For k=0 To NofObjects-1
			;				If ObjectType(k)=90 And ObjectSubType(k)<4 And ObjectSubType(k)>0 And k<>i
			;					
			;					For k2=0 To 3
			;						If ObjectData(k,k2)=ObjectData(i,j) And ObjectData(k,k2+4)=ObjectData(i,j+4) Then ObjectData(k,k2)=ObjectData(k,k2)+16
			;					
			;					Next
			;					ReDoButtonTexture(k)
			;				EndIf
			;				
			;			Next
						; and turn off this button
						ObjectData(i,j)=ObjectData(i,j)+16
						If ObjectSubType(i)<32 Then ReDoButtonTexture(i)
					EndIf
				Next
			EndIf
		Case 2,34
			; Colour Diamond Locked Button
			If weight=True 
				For j=0 To 3 ; go through all four colours
					If ObjectData(i,j)<16 ; not deactivated yet
						If ObjectSubType(i)<32 Then PlaySoundFX(21,ObjectTileX(i),ObjectTileY(i))

						; toggle teleporters, gates, etc
						For k=0 To NofObjects-1
							If ObjectExists(k)=True And ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+4)
								If ObjectType(k)=210
									ActivateTransporter(k)
								Else If ObjectType(k)=432
									If ObjectSubType(k)=0
										SoundPitch (SoundFX(98),Rand(19000,25000))
										PlaySoundFX(98,ObjectTileX(i),ObjectTileY(i))
									Else
										SoundPitch (SoundFX(98),Rand(9000,15000))
										PlaySoundFX(98,ObjectTileX(i),ObjectTileY(i))
									EndIf

									ObjectMovementType(k)=81+2*ObjectData(k,2)+(ObjectData(k,3) Mod 2)
								Else If ObjectType(k)=45
									
									If  ObjectData(k,5)=1 And ObjectActive(k)=1001 And ObjectMovementTimer(k)=0
										ActivateConveyor(k) ; stepper- makes one move
									Else If ObjectData(k,5)=0 
										ToggleObject(k) ; mover - just toggles

									EndIf

								
							
	
								Else If ObjectType(k)=46
									; do nothing!
								Else
									ToggleObject(k)
								EndIf
							EndIf
							
							
						Next
						
						; since we don't want to toggle back and forth, disable any other colours of this type
						For j2=j+1 To 3
							If ObjectData(i,j2)=ObjectData(i,j) And ObjectData(i,j2+4)=ObjectData(i,j+4) Then ObjectData(i,j2)=ObjectData(i,j2)+16
						Next
						ObjectData(i,j)=ObjectData(i,j)+16
						
						
						If ObjectSubType(i)<32 Then ReDoButtonTexture(i)
					EndIf
				Next
			EndIf
			
		Case 3,35
			; Colour Dimaond Button
			; Stepping On
			If weight=True
				ObjectStatus(i)=1 
				
				For j=0 To 3 ; go through all four colours
					If ObjectData(i,j)<16 ; not deactivated yet
						If ObjectSubType(i)<32 Then PlaySoundFX(21,ObjectTileX(i),ObjectTileY(i))

						; toggle teleporters, gates, etc
						For k=0 To NofObjects-1
							If ObjectExists(k)=True And ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+4)
								If ObjectType(k)=210
									ActivateTransporter(k)
								Else If ObjectType(k)=432
									If ObjectSubType(k)=0
										SoundPitch (SoundFX(98),Rand(19000,25000))
										PlaySoundFX(98,ObjectTileX(i),ObjectTileY(i))
									Else
										SoundPitch (SoundFX(98),Rand(9000,15000))
										PlaySoundFX(98,ObjectTileX(i),ObjectTileY(i))
									EndIf
									ObjectMovementType(k)=81+2*ObjectData(k,2)+(ObjectData(k,3) Mod 2)
								
								Else If ObjectType(k)=45
									
									If  ObjectData(k,5)=1 And ObjectActive(k)=1001 And ObjectMovementTimer(k)=0
										ActivateConveyor(k) ; stepper- makes one move
									Else If ObjectData(k,5)=0 
										ToggleObject(k) ; mover - just toggles

									EndIf


								
								
								Else If ObjectType(k)=46
									; do nothing!
								Else
									ToggleObject(k)
								EndIf
							EndIf
							
							
						Next
						
						; since we don't want to toggle back and forth, disable any other colours of this type
						For j2=j+1 To 3
							If ObjectData(i,j2)=ObjectData(i,j) And ObjectData(i,j2+4)=ObjectData(i,j+4) Then ObjectData(i,j2)=ObjectData(i,j2)+16
						Next
						ObjectData(i,j)=ObjectData(i,j)+16
						
						
						If ObjectSubType(i)<32 Then ReDoButtonTexture(i)
					EndIf
				Next
				
			EndIf
		Case 4,36
		; timer button
		; Stepping On
			If weight=True And ObjectStatus(i)<360
				If ObjectSubType(i)<32 Then PlaySoundFX(23,ObjectTileX(i),ObjectTileY(i))
				ObjectStatus(i)=361 
				For j=0 To 3 ; go through all four colours
					If ObjectData(i,j)<16 ; not deactivated yet
						
						; activate teleporters, open gates, etc
						For k=0 To NofObjects-1
							If ObjectExists(k)=True And ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+4)
								If ObjectType(k)=10 Or ObjectType(k)=140 Or ObjectType(k)=20 Or ObjectType(k)=424

									DeActivateObject(k)
								Else If ObjectType(k)=432
									If ObjectSubType(k)=0
										SoundPitch (SoundFX(98),Rand(19000,25000))
										PlaySoundFX(98,ObjectTileX(i),ObjectTileY(i))
									Else
										SoundPitch (SoundFX(98),Rand(9000,15000))
										PlaySoundFX(98,ObjectTileX(i),ObjectTileY(i))
									EndIf

									ObjectMovementType(k)=81+2*ObjectData(k,2)+(ObjectData(k,3) Mod 2)
								Else If ObjectType(k)=45
									
									If  ObjectData(k,5)=1 And ObjectActive(k)=1001 And ObjectMovementTimer(k)=0
										ActivateConveyor(k) ; stepper- makes one move
									Else If ObjectData(k,5)=0 
										ActivateObject(k) ; mover - just turns on

									EndIf

								
																
								Else If ObjectType(k)=46
									; do nothing!
								Else If ObjectType(k)=210
									ActivateTransporter(k)

								Else 
									ActivateObject(k)
								EndIf
							EndIf
						Next

						
						; deactivate all square/dimaond/round/star buttons
				;		For k=0 To NofObjects-1
				;			If ObjectType(k)=90 And ObjectSubType(k)<4 And k<>i
				;				
				;				For k2=0 To 3
				;					If ObjectData(k,k2)=ObjectData(i,j) Then ObjectData(k,k2)=ObjectData(k,k2)+16
				;				
				;				Next
				;				ReDoButtonTexture(k)
				;			EndIf
							
				;		Next
						; and deactivate this button
						ObjectData(i,j)=ObjectData(i,j)+16
						If ObjectSubType(i)<32 Then ReDoButtonTexture(i)
					EndIf
				Next
			EndIf
		Case 5,6,37,38
			; ColourChange Square/Round Button
			If weight=True 
				ObjectStatus(i)=1
				j=0
					If ObjectData(i,j)<15 ; not deactivated yet
						If ObjectSubType(i)<32 Then PlaySoundFX(24,ObjectTileX(i),ObjectTileY(i))

						; change colours
						For k=0 To NofObjects-1
							If ObjectExists(k)=True And ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+2)
								
								If ObjectType(k)=10
									; gates
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									ReDoGateTexture(k)


								
								Else If ObjectType(k)=30
									; teleporters
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									EntityTexture ObjectEntity(k),TeleporterTexture((ObjectID(k)-500)/5)

								Else If ObjectType(k)=210 Or ObjectType(k)=45 Or ObjectType(k)=46
									; transporters
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									RedoTransporterTexture(k)
									
								Else If ObjectType(k)=410
									; flipbridge
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									RedoFlipbridgeTexture(k)
								Else If ObjectType(k)=40
									; stepping stones
									If ObjectData(i,j+1)>=8 And ObjectData(i,j+1)<12
										ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
										ObjectData(k,0)=ObjectData(i,j+1)-8
										ObjectData(k,1)=ObjectData(i,j+3)
										EntityTexture ObjectEntity(k),SteppingStoneTexture(ObjectData(k,0))
									EndIf
								Else If ObjectType(k)=432 ; pushbot
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
						
									RedoPushbotTexture(k)
								Else If ObjectType(k)=281 ; suctube
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									ObjectData(k,0)=ObjectData(i,j+1)
									ObjectData(k,1)=ObjectData(i,j+3)
									Redosuctubemesh(k)


									
								EndIf
								
							EndIf
						Next

												
						; and turn off this button
						; square:
						If (ObjectSubType(i) Mod 32)=5
							ObjectData(i,j)=15
							ObjectData(i,j+1)=15
							

						Else
						; round
							ObjectData(i,j)=ObjectData(i,j)+16
							ObjectData(i,j+1)=ObjectData(i,j+1)+16
							

						EndIf
						ReDoButtonTexture(i)
					EndIf
				
			EndIf
		Case 7,8,39,40
			; ColourChange Diamond Button
			If weight=True 
				ObjectStatus(i)=1
				j=0 
					If ObjectData(i,j)<15 ; not deactivated yet
						If ObjectSubType(i)<32 Then PlaySoundFX(24,ObjectTileX(i),ObjectTileY(i))

						; swap colours
						For k=0 To NofObjects-1
							If ObjectExists(k)=True And ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+2)

								
								If ObjectType(k)=10
									; gates
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									ReDoGateTexture(k)

								
								Else If ObjectType(k)=30
									; teleporters
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									EntityTexture ObjectEntity(k),TeleporterTexture((ObjectID(k)-500)/5)
								Else If ObjectType(k)=210 

									; transporters
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									RedoTransporterTexture(k)
									
								Else If ObjectType(k)=410
									; transporters
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									
									RedoFlipbridgeTexture(k)
									
								Else If ObjectType(k)=40
									; stepping stones
									If ObjectData(i,j+1)>=8 And ObjectData(i,j+1)<12
										ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
										ObjectData(k,0)=ObjectData(i,j+1)-8
										ObjectData(k,1)=ObjectData(i,j+3)
										EntityTexture ObjectEntity(k),SteppingStoneTexture(ObjectData(k,0))
									EndIf
								Else If ObjectType(k)=432
									; pushbots
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									RedoPushbotTexture(k)
								Else If ObjectType(k)=281
									; suctube
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									ObjectData(k,0)=ObjectData(i,j+1)
									ObjectData(k,1)=ObjectData(i,j+3)
									Redosuctubemesh(k)



									
								EndIf
							Else If ObjectExists(k)=True And ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)

								
								If ObjectType(k)=10
									; gates
									ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+2)
									ReDoGateTexture(k)

								
								Else If ObjectType(k)=30
									; teleporters
									ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+2)
									EntityTexture ObjectEntity(k),TeleporterTexture((ObjectID(k)-500)/5)
								Else If ObjectType(k)=210 Or ObjectType(k)=45 Or ObjectType(k)=46

									; transporters
									ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+2)
									RedoTransporterTexture(k)
								Else If ObjectType(k)=410
									; transporters
									ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+2)
									RedoFlipbridgeTexture(k)

								Else If ObjectType(k)=40
									; stepping stones
									If ObjectData(i,j)>=8 And ObjectData(i,j)<12
										ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+2)
										ObjectData(k,0)=ObjectData(i,j)-8
										ObjectData(k,1)=ObjectData(i,j+2)
										EntityTexture ObjectEntity(k),SteppingStoneTexture(ObjectData(k,0))
									EndIf
								Else If ObjectType(k)=432
									; pushbots
									ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+2)

									RedoPushbotTexture(k)
								Else If ObjectType(k)=281
									; suctube
									ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+2)
									ObjectData(k,0)=ObjectData(i,j)
									ObjectData(k,1)=ObjectData(i,j+2)
									Redosuctubemesh(k)


									
								EndIf

								
							EndIf
						Next

												
						; and turn off this button
						; locked:
						If (ObjectSubType(i) Mod 32)=7
							ObjectData(i,j)=15
							ObjectData(i,j+1)=15
						Else
						; nonlocked
							ObjectData(i,j)=ObjectData(i,j)+16
							ObjectData(i,j+1)=ObjectData(i,j+1)+16
						EndIf
						ReDoButtonTexture(i)
					EndIf
				
			EndIf
		Case 9,41
			; Colourchange star button
			; Rotating
			
			; Stepping On
			If weight=True And ObjectStatus(i)<360
				ObjectStatus(i)=361 
				j=0
					If ObjectData(i,j)<15 ; not deactivated yet
						If ObjectSubType(i)<32 Then PlaySoundFX(24,ObjectTileX(i),ObjectTileY(i))

						; change colours
						For k=0 To NofObjects-1
							If ObjectExists(k)=True And ObjectID(k)=500+ObjectData(i,j)*5+ObjectData(i,j+2)
								
								If ObjectType(k)=10
									; gates
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									ReDoGateTexture(k)
									
								
								Else If ObjectType(k)=30
									; teleporters
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									EntityTexture ObjectEntity(k),TeleporterTexture((ObjectID(k)-500)/5)
								Else If ObjectType(k)=210 Or ObjectType(k)=45 Or ObjectType(k)=46

									; transporters
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									RedoTransporterTexture(k)
									
								Else If ObjectType(k)=410
									; Flipbridge
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									RedoFlipbridgeTexture(k)
									
								Else If ObjectType(k)=40
									; stepping stones
									If ObjectData(i,j+1)>=8 And ObjectData(i,j+1)<12
										ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
										ObjectData(k,0)=ObjectData(i,j+1)-8
										ObjectData(k,1)=ObjectData(i,j+3)
										EntityTexture ObjectEntity(k),SteppingStoneTexture(ObjectData(k,0))
									EndIf
								Else If ObjectType(k)=432
									; pushbot
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									
									RedoPushbotTexture(k)
								Else If ObjectType(k)=281
									; suctube
									ObjectID(k)=500+ObjectData(i,j+1)*5+ObjectData(i,j+3)
									ObjectData(k,0)=ObjectData(i,j+1)
									ObjectData(k,1)=ObjectData(i,j+3)
									Redosuctubemesh(k)





									
								EndIf						
							EndIf
						Next

												
						; and deactivate this button
						ObjectData(i,j)=ObjectData(i,j)+16
						ObjectData(i,j+1)=ObjectData(i,j+1)+16
							
						ReDoButtonTexture(i)
					EndIf
				

			EndIf
		Case 16,17,48,49
			;rotator
			
			If ObjectStatus(i)=0
				ObjectStatus(i)=1
					PlaySoundFX(22,ObjectTileX(i),ObjectTileY(i))

					; rotate all matching transporters and springs
					For k=0 To NofObjects-1
						If ObjectExists(k)=True And ObjectID(k)=500+ObjectData(i,0)*5+ObjectData(i,1)
							If ObjectType(k)=280 
							
								If ObjectData(i,2)=0
									ObjectData(k,2)=(ObjectData(k,2)-1+8) Mod 8
								Else
									ObjectData(k,2)=(ObjectData(k,2)+1) Mod 8
								EndIf
							EndIf
							If ObjectTYpe(k)=210 And ObjectStatus(k)=0
								If ObjectData(i,2)<>0
									ObjectData(k,2)=(ObjectData(k,2)-1+4) Mod 4
								Else
									ObjectData(k,2)=(ObjectData(k,2)+1) Mod 4
								EndIf
							EndIf
							If ObjectType(k)=45
								If ObjectData(i,2)=0
									ObjectData(k,2)=(ObjectData(k,2)-1+4) Mod 4
								Else
									ObjectData(k,2)=(ObjectData(k,2)+1) Mod 4
								EndIf

							
							EndIf
							
							
							;	rotatable scouge
							If ObjectType(k)=421 And ObjectSubType(k)=1
								If ObjectData(i,2)=0 ; left
									ObjectData(k,0)=(ObjectData(k,0)+3) Mod 4
									ObjectYaw(k)=ObjectYaw(k)+90 Mod 360
								Else ; right
									ObjectData(k,0)=(ObjectData(k,0)+1) Mod 4
									ObjectYaw(k)=ObjectYaw(k)+270 Mod 360
								EndIf
								ObjectTimer(k)=ObjectTimerMax1(k)
							EndIf
							
							If ObjectType(k)=410
								TurnFlipBridge(k,ObjectData(i,2))
							EndIf
							If ObjectType(k)=432 And ObjectMovementType(k)=0
								;pushbots
								If ObjectData(i,2)=0 ; left
									ObjectData(k,2)=(ObjectData(k,2)+3) Mod 4
								Else
									ObjectData(k,2)=(ObjectData(k,2)+1) Mod 4
								EndIf
								
							EndIf
							If ObjectType(k)=281
								;suctube
								ObjectData(k,2)=ObjectData(k,2)-2
								If ObjectData(k,2)<0 Then ObjectData(k,2)=ObjectData(k,2)+4
								Redosuctubemesh(k)

							EndIf					
						EndIf
					Next
					
					
					

				
			EndIf

	End Select



End Function



Function ControlKeyBlock(i)

	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))
	
	If ObjectType(i)>=84
		; Currently in Use
		ObjectTimer(i)=ObjectTimer(i)-1
		If ObjectTimer(i)<=0
			; Now activate
			ActivateCommand(ObjectData(i,0),ObjectData(i,1),ObjectData(i,2),ObjectData(i,3),ObjectData(i,4))
			
			If ObjectType(i)=85
				; Solid Keyblock destroyed - change floor
				LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=0
			EndIf

			If ObjectType(i)=85 Or ObjectType(i)=87
				DestroyObject(i,0)
			EndIf
			
		EndIf
	EndIf
			
	
End Function

Function ReDoButtonTexture(i)

	; unless inivislbe 
	If ObjectSubType(i)>=32 Then Return

	nudge#=0.01
	Surface=GetSurface (ObjectEntity(i),1)
	col1=ObjectData(i,0)
	VertexTexCoords Surface,4,(col1 Mod 8)*0.125+nudge,(col1/8)*0.125+0.5+nudge
	VertexTexCoords Surface,5,(col1 Mod 8)*0.125+0.125-nudge,(col1/8)*0.125+.5+nudge
	VertexTexCoords Surface,6,(col1 Mod 8)*0.125+nudge,(col1/8)*0.125+0.5+.125-nudge
	VertexTexCoords Surface,7,(col1 Mod 8)*0.125+0.125-nudge,(col1/8)*0.125+.5+.125-nudge
	col2=ObjectData(i,1)

	VertexTexCoords Surface,8,(col2 Mod 8)*0.125+nudge,(col2/8)*0.125+0.5+nudge
	VertexTexCoords Surface,9,(col2 Mod 8)*0.125+0.125-nudge,(col2/8)*0.125+.5+nudge
	VertexTexCoords Surface,10,(col2 Mod 8)*0.125+nudge,(col2/8)*0.125+0.5+.125-nudge
	VertexTexCoords Surface,11,(col2 Mod 8)*0.125+0.125-nudge,(col2/8)*0.125+.5+.125-nudge
	
	If ObjectSubType(i)>=5 And ObjectSubType(i)<10
		col3=ObjectData(i,0)
	Else
		col3=ObjectData(i,2)
	EndIf
	VertexTexCoords Surface,12,(col3 Mod 8)*0.125+nudge,(col3/8)*0.125+0.5+nudge
	VertexTexCoords Surface,13,(col3 Mod 8)*0.125+0.125-nudge,(col3/8)*0.125+.5+nudge
	VertexTexCoords Surface,14,(col3 Mod 8)*0.125+nudge,(col3/8)*0.125+0.5+.125-nudge
	VertexTexCoords Surface,15,(col3 Mod 8)*0.125+0.125-.02,(col3/8)*0.125+.5+.125-nudge
	
	If ObjectSubType(i)>=5 And ObjectSubType(i)<10
		col4=ObjectData(i,1)
	Else
		col4=ObjectData(i,3)
	EndIf
	VertexTexCoords Surface,16,(col4 Mod 8)*0.125+nudge,(col4/8)*0.125+0.5+nudge
	VertexTexCoords Surface,17,(col4 Mod 8)*0.125+0.125-nudge,(col4/8)*0.125+.5+nudge
	VertexTexCoords Surface,18,(col4 Mod 8)*0.125+nudge,(col4/8)*0.125+0.5+.125-nudge
	VertexTexCoords Surface,19,(col4 Mod 8)*0.125+0.125-nudge,(col4/8)*0.125+.5+.125-nudge


End Function


Function CreateWaterFallMesh()
	
	Entity=CreateMesh()
	surface=CreateSurface(Entity)
	
	AddVertex surface,-.5,0.81,-.51,0,0
	AddVertex surface,.5,0.81,-.51,1,0
	AddVertex surface,-.5,-0.21,-.51,0,1
	AddVertex surface,.5,-0.21,-.51,1,1
	
	AddVertex surface,-.5,0.31,-.51,0,1
	AddVertex surface,.5,0.31,-.51,1,1
	AddVertex surface,-.5,0.31,-.51,0,0
	AddVertex surface,.5,0.31,-.51,1,0
	
	AddTriangle (surface,0,1,2)
	AddTriangle (surface,1,3,2)
	
	AddTriangle (surface,0,1,4)
	AddTriangle (surface,1,5,4)
	AddTriangle (surface,6,7,2)
	AddTriangle (surface,7,3,2)
	
	AddTriangle (surface,1,0,3)
	AddTriangle (surface,0,2,3)
	
	EntityTexture Entity,WaterFallTexture
	EntityAlpha Entity,.5
		
	UpdateNormals Entity
	
	Return Entity

End Function

Function ControlGoldStar(i)
	
	ObjectZ(i)=.8
	If AdventureCurrentStatus=0
		ObjectXScale(i)=.5
		ObjectYScale(i)=.5
		ObjectZScale(i)=.5
		ObjectZ(i)=.4
	EndIf
	
	ObjectYaw(i)=ObjectYaw(i)+2
	
	If ObjectActive(i)<1001 Then Return
	
	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))
	
	
	dist=Maximum2(Abs(ObjectTileX(i)-ObjectTileX(PlayerObject)),Abs(ObjectTileY(i)-ObjectTileY(PlayerObject)))
	If LevelTimer<1000000000	
		a=Rand(0,300)
		
		If (dist<3 And a<50) Or (dist<4 And a<40) Or (dist<5 And a<28) Or (dist<6 And a<15) Or (dist<7 And a<2)
			AddParticle(19,ObjectTileX(i)+0.5,.7,-ObjectTileY(i)-0.5,Rand(0,360),0.16,Rnd(-.015,.015),0.03,Rnd(-.015,.015),0,0.001,0,-.00025,0,100,3)
		EndIf
	EndIf
	
	If ObjectMovementTimer(PlayerObject)=0 And dist=0
		If AdventureCurrentStatus=0
			PlaySoundFX(1,-1,-1)
			PlayerStars=PlayerStars+1
			MessageLineText1$="You have earned a Star!"
			MessageLineText2$="Total Stars: "+Str$(PlayerStars)
			MessageLineTimer=180
			destroyobject(i,0)

		Else
 			AdventureWon()
			HideEntity ObjectEntity(i)
		EndIf
	EndIf
		
	
End Function
Function ControlGoldCoin(i)
	
	If ObjectActive(i)<1001 
		; picked up animation
		ObjectYaw(i)=ObjectYaw(i)+10
		


		If ObjectActive(i)>600
			ObjectZ(i)=.2+Float(1000-ObjectActive(i))/400.0
		Else
			ObjectZ(i)=1.2
		EndIf
		If ObjectActive(i)=400
			; Little Spark
			For j=1 To 20
				AddParticle(19,ObjectTileX(i)+0.5,1.6,-ObjectTileY(i)-0.5,Rand(0,360),0.15,Rnd(-.035,.035),Rnd(-.015,.015),Rnd(-.035,.035),0,0,0,0,0,50,3)
			Next
		EndIf
		If ObjectActive(i)<600
			ObjectScaleXAdjust(i)=Float(ObjectActive(i))/600.0
			ObjectScaleYAdjust(i)=Float(ObjectActive(i))/600.0
			ObjectScaleZAdjust(i)=Float(ObjectActive(i))/600.0

		EndIf
		
		
		
	Else
		ObjectYaw(i)=ObjectYaw(i)+3
		ObjectZ(i)=0
	

		dist=Maximum2(Abs(ObjectTileX(i)-ObjectTileX(PlayerObject)),Abs(ObjectTileY(i)-ObjectTileY(PlayerObject)))
		
		If ObjectMovementTimer(PlayerObject)=0 And dist=0
			; pick up
			If ObjectType(i)=171
				; Gold Coin
				If (ObjectTileLogic(ObjectTileX(i),ObjectTileY(i)) And 2^4)>0
					ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))=ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))-2^4
				EndIf
				PlayerCoins=PlayerCoins+1
				PlayerCoinsCollected=PlayerCoinCollected+1
				CurrentAdventureCoins=CurrentAdventureCoins+1
		
				ObjectActivationType(i)=0
				ObjectActivationSpeed(i)=20
		
				DeActivateObject(i)
				PlaySoundFX(12,-1,-1)
				PlaySoundFX(173,-1,-1)
			Else
				; TOken
				If NofInventoryItems<InventorySize^2	
				
					; delete logic from tiles
					If (ObjectTileLogic(ObjectTileX(i),ObjectTileY(i)) And 2^4)>0
						ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))=ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))-2^4
					EndIf
					ObjectActivationType(i)=0
					ObjectActivationSpeed(i)=20
					DeActivateObject(i)
					PlaySoundFX(12,-1,-1)
					PlaySoundFX(173,-1,-1)
					; and add to inventory	
					AddItemToInventory(-1,2031,-1,69,"Token","Play!")

					; Do a little blip around the Rucksack
					IconSize(8)=601
					For j=0 To 359 Step 10
						AddParticle2(16,1.74+.5*Sin(j),1.63+.5*Cos(j),5,0,.08,-.01*Sin(j),-.01*Cos(j),0,0,-.001,0,0,0,50,2)
					Next
				 	ObjectID(i)=-1
				Else
					MessageLineText1$="You Cannot Carry Any More"
					MessageLineText2$=""
					MessageLineTimer=100
		
				EndIf
			EndIf

		EndIf
	EndIf
		
	
End Function

Function CreateKeyMesh(col)

	Entity=CopyMesh(KeyMesh)
	
	;adjust the colour
	

	For i=0 To CountVertices (GetSurface(Entity,1))-1
		If VertexU(GetSurface(Entity,1),i)>0.124 
			u#=0.124
		Else
			u#=VertexU(GetSurface(Entity,1),i)
		EndIf
		If col=8
			VertexTexCoords GetSurface(Entity,1),i,VertexV(GetSurface(Entity,1),i)+(col Mod 8)*0.125,u*0.7+0.5+Floor(col/8)*0.125
		Else
			VertexTexCoords GetSurface(Entity,1),i,u+(col Mod 8)*0.125,VertexV(GetSurface(Entity,1),i)+0.5+Floor(col/8)*0.125
			;VertexColor GetSurface(Entity,1),i,((i*27) Mod 128)+127,((i*27) Mod 128)+127,((i*27) Mod 128)+127
		EndIf
	Next
	;EntityFX Entity,2
	UpdateNormals Entity
	EntityTexture Entity,ButtonTexture
	Return Entity
End Function

Function CreateKeyCardMesh(col)


	tex=24+col

	entity=CreateMesh()


	surface=CreateSurface(entity)
	
	AddVertex (surface,-.4,.4,-.021,(tex Mod 8)*0.125+0.000,Floor((tex Mod 64)/8)*0.125+0.000)
	AddVertex (surface,.4,.4,-.0210,(tex Mod 8)*0.125+0.125,Floor((tex Mod 64)/8)*0.125+0.000)
	AddVertex (surface,-.4,-.4,-.0210,(tex Mod 8)*0.125+0.000,Floor((tex Mod 64)/8)*0.125+0.125)
	AddVertex (surface,.4,-.4,0-.021,(tex Mod 8)*0.125+0.125,Floor((tex Mod 64)/8)*0.125+0.125)
	
	AddVertex (surface,-.4,.4,.0210,(tex Mod 8)*0.125+0.000,Floor((tex Mod 64)/8)*0.125+0.000)
	AddVertex (surface,.4,.4,.0210,(tex Mod 8)*0.125+0.125,Floor((tex Mod 64)/8)*0.125+0.000)
	AddVertex (surface,-.4,-.4,.0210,(tex Mod 8)*0.125+0.000,Floor((tex Mod 64)/8)*0.125+0.125)
	AddVertex (surface,.4,-.4,.0210,(tex Mod 8)*0.125+0.125,Floor((tex Mod 64)/8)*0.125+0.125)


	AddTriangle(surface,0,1,2)
	AddTriangle(surface,1,3,2)
	
	;AddTriangle(surface,0,4,1)
	;AddTriangle(surface,4,5,1)
	;AddTriangle(surface,1,5,7)
	;AddTriangle(surface,1,7,3)
	;AddTriangle(surface,4,0,6)
	;AddTriangle(surface,0,2,6)
	
;	AddTriangle(surface,5,4,6)
;	AddTriangle(surface,5,6,7)
	
;	AddTriangle(surface,0,2,1)
;	AddTriangle(surface,1,2,3)
	
	AddTriangle(surface,5,4,6)
	AddTriangle(surface,5,6,7)

	
;	RotateMesh Entity,90,0,0
;	PositionMesh Entity,0,.3,0

	
	
	
	UpdateNormals Entity
	
	EntityTexture Entity,ButtonTexture
	
	Return Entity
End Function
Function ControlKey(i)
	
	If ObjectActive(i)<1001 
	
		; picked up animation
		
		ObjectYaw(i)=ObjectYaw(i)+10

		If ObjectActive(i)>600
			ObjectZ(i)=.6+2*Float(1000-ObjectActive(i))/400.0
		Else
			ObjectZ(i)=2.6
		EndIf
		If ObjectActive(i)=400
			; Little Spark
			For j=1 To 60
				AddParticle(Rnd(16,23),ObjectTileX(i)+0.5,2.6,-ObjectTileY(i)-0.5,Rand(0,360),0.2,Rnd(-.035,.035),Rnd(-.015,.015),Rnd(-.035,.035),0,0,0,0,0,50,3)
			Next
		EndIf
		If ObjectActive(i)<600
			ObjectScaleXAdjust(i)=Float(ObjectActive(i))/600.0
			ObjectScaleYAdjust(i)=Float(ObjectActive(i))/600.0
			ObjectScaleZAdjust(i)=Float(ObjectActive(i))/600.0

		EndIf
		
		
		
	Else
	;	ObjectYaw(i)=ObjectYaw(i)+2
		If ObjectModelName$(i)="!KeyCard"
			ObjectYaw2(i)=((leveltimer) Mod 90)*4
		Else
			ObjectRoll2(i)=30*Sin((leveltimer) Mod 360)
		EndIf	
		ObjectZ(i)=.4
	
		dist=Maximum2(Abs(ObjectTileX(i)-ObjectTileX(PlayerObject)),Abs(ObjectTileY(i)-ObjectTileY(PlayerObject)))
		; see if picked up
		If ObjectMovementTimer(PlayerObject)=0 And dist=0
			
			; do we have room in inventory?
			
			
			If NofInventoryItems<InventorySize^2	
				; yes - pick up. Delete logic from tiles
				If (ObjectTileLogic(ObjectTileX(i),ObjectTileY(i)) And 2^4)>0
					ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))=ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))-2^4
				EndIf
			
								
				; and add to inventory
				If ObjectModelName$(i)="!Key"	
					AddItemToInventory(-1,3001,500+ObjectData(i,0)*5+ObjectData(i,1),ObjectData(i,0)+48,"Key","Use")
				Else
					AddItemToInventory(-1,3001,500+ObjectData(i,0)*5+ObjectData(i,1),ObjectData(i,0)+32,"KeyCard","Use")

				EndIf								
				; Do a little blip around the Rucksack
				IconSize(8)=601
				For j=0 To 359 Step 10
					AddParticle2(16,1.74+.5*Sin(j),1.63+.5*Cos(j),5,0,.08,-.01*Sin(j),-.01*Cos(j),0,0,-.001,0,0,0,50,2)
				Next
				 
				
				; Destroy/Deactivate Key in Level	
				ObjectActivationType(i)=0
				ObjectActivationSpeed(i)=10
	
				DeActivateObject(i)
				ObjectID(i)=-1
				PlaySoundFX(174,-1,-1)
			Else
				MessageLineText1$="You Cannot Carry Any More"
				MessageLineText2$=""

				MessageLineTimer=100
	
			EndIf
		

	
			
			
		EndIf
	EndIf
		
	
End Function

Function ControlGem(i)
	
	If ObjectActive(i) Mod 2=1 Then ShowEntity ObjectEntity(i)
	
	If ObjectActive(i)<1001 
		; picked up animation
		ObjectYaw(i)=ObjectYaw(i)+10

		If ObjectActive(i)>600
			ObjectZ(i)=.6+Float(1000-ObjectActive(i))/400.0
		Else
			ObjectZ(i)=1.6
		EndIf
		If ObjectActive(i)=400
			
			; Little Spark
			For j=1 To 20
				AddParticle(19,ObjectTileX(i)+0.5,1.6,-ObjectTileY(i)-0.5,Rand(0,360),0.15,Rnd(-.035,.035),Rnd(-.015,.015),Rnd(-.035,.035),0,0,0,0,0,50,3)
			Next
			If WaEpisode=1 And (adventurecurrentnumber>=200 And adventurecurrentnumber<=203) 
				; not in pacman level or WA1
			
			Else
				If ObjectData(i,0)=0 Then AddParticle(14,ObjectTileX(i)+0.5,1.6,-ObjectTileY(i)-0.5,0,1,0,0.01,0,0,.01,0,0,0,50,3)
				If ObjectData(i,0)=1 Then AddParticle(15,ObjectTileX(i)+0.5,1.6,-ObjectTileY(i)-0.5,0,1,0,0.01,0,0,.01,0,0,0,50,3)
			EndIf
		EndIf
		If ObjectActive(i)<600
			ObjectScaleXAdjust(i)=Float(ObjectActive(i))/600.0
			ObjectScaleYAdjust(i)=Float(ObjectActive(i))/600.0
			ObjectScaleZAdjust(i)=Float(ObjectActive(i))/600.0

		EndIf
		If ObjectActive(i)<100
			HideEntity ObjectEntity(i)
		EndIf
		
		
		
	Else
		If (ObjectTileLogic(ObjectTileX(i),ObjectTileY(i)) And 2^4)=0 Then ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))=ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))+2^4

		If ObjectData(i,0)=2
			If Rand(0,10)<3
				
				AddParticle(16+ObjectData(i,1)+Rand(0,1)*8,ObjectTileX(i)+.5,Rnd(0,1),-ObjectTileY(i)-.5,0,.01,Rnd(-.01,.01),Rnd(-.01,.01),Rnd(0,.02),Rnd(-4,4),.01,0,0,0,70,3)
			EndIf
		EndIf
	
		If ObjectYaw(i)=0 And ObjectData(i,0)<>1
			ObjectRoll(i)=Rand(-10,10)
			ObjectYaw(i)=Rand(1,180)
		;	For j=0 To CountVertices (GetSurface(ObjectEntity(i),1))-1
		;	
	;			VertexTexCoords GetSurface(ObjectEntity(i),1),j,VertexU(GetSurface(ObjectEntity(i),1),j)*.1,VertexV(GetSurface(ObjectEntity(i),1),j)*.1
	;			
;
;			Next 
			
;			UpdateNormals ObjectEntity(i)
;			
		EndIf
		If ObjectData(i,0)=0 Or ObjectData(i,0)=2 Then ObjectYaw(i)=ObjectYaw(i)+Rnd(1.8,2.2)
		If ObjectData(i,0)=1 Then ObjectPitch(i)=ObjectPitch(i)+Rnd(2,3)+(i Mod 3)/3.0
		ObjectZ(i)=.4
		
	
		dist=Maximum2(Abs(ObjectTileX(i)-ObjectTileX(PlayerObject)),Abs(ObjectTileY(i)-ObjectTileY(PlayerObject)))
		
		If ObjectMovementTimer(PlayerObject)=0 And dist=0
		
			; pickup
		
			If ObjectData(i,0)=2
				; special gems
				
				If NofInventoryItems<InventorySize^2	
					; yes - pick up. Delete logic from tiles
					If (ObjectTileLogic(ObjectTileX(i),ObjectTileY(i)) And 2^4)>0
						ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))=ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))-2^4
					EndIf
				
									
					; and add to inventory	
					AddItemToInventory(-1,3021,ObjectData(i,1),ObjectData(i,1)+40,"Shard","Use")
									
					; Do a little blip around the Rucksack
					IconSize(8)=601
					For j=0 To 359 Step 10
						AddParticle2(16,1.74+.5*Sin(j),1.63+.5*Cos(j),5,0,.08,-.01*Sin(j),-.01*Cos(j),0,0,-.001,0,0,0,50,2)
					Next
					 
					
					; Destroy/Deactivate Key in Level	
					ObjectActivationType(i)=0
					ObjectActivationSpeed(i)=10
		
					DeActivateObject(i)
					ObjectID(i)=-1
					PlaySoundFX(174,-1,-1)
				Else
					MessageLineText1$="You Cannot Carry Any More"
					MessageLineText2$=""

					MessageLineTimer=100
		
				EndIf

				
			Else
				
		
				If (ObjectTileLogic(ObjectTileX(i),ObjectTileY(i)) And 2^4)>0
					ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))=ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))-2^4
				EndIf
				
				If WAEpisode=1 And AdventureCurrentNumber>=200 And AdventureCurrentNumber<=202 
					; don't add points in pacman level
				Else
					If ObjectData(i,0)=0
						PlayerScore=PlayerScore+100
						CurrentAdventureScore=CurrentAdventureScore+100
					EndIf
						
					If ObjectData(i,0)=1 
						PlayerScore=PlayerScore+250
						CurrentAdventureScore=CurrentAdventureScore+250
					EndIf
				EndIf
				CurrentAdventureGems=CurrentAdventureGems+1
				ObjectActivationType(i)=0
				ObjectActivationSpeed(i)=20
				
				NofGemsInAdventure=NofGemsInAdventure-1
				If WAEpisode=1 And AdventureCurrentNumber>=200 And AdventureCurrentNumber<=202
					; Wakka soundin Pacman Level
					PlaySoundFX(14,-1,-1)
				Else
					PlaySoundFX(11,-1,-1)
				EndIf
				DeActivateObject(i)
			EndIf
			
		EndIf
	EndIf
		
	
End Function


Function CreateCustomItemMesh(tex)
	
	
		
	entity=CreateMesh()


	surface=CreateSurface(entity)
	
	AddVertex (surface,-.4,.4,-.13,(tex Mod 8)*0.125+0.013,Floor((tex Mod 64)/8)*0.125+0.013)
	AddVertex (surface,.4,.4,-.13,(tex Mod 8)*0.125+0.1135,Floor((tex Mod 64)/8)*0.125+0.013)
	AddVertex (surface,-.4,-.4,-.13,(tex Mod 8)*0.125+0.013,Floor((tex Mod 64)/8)*0.125+0.0945)
	AddVertex (surface,.4,-.4,0-.13,(tex Mod 8)*0.125+0.1135,Floor((tex Mod 64)/8)*0.125+0.0945)
	
	AddVertex (surface,-.4,.4,.13,(tex Mod 8)*0.125+0.013,Floor((tex Mod 64)/8)*0.125+0.013)
	AddVertex (surface,.4,.4,.13,(tex Mod 8)*0.125+0.1135,Floor((tex Mod 64)/8)*0.125+0.013)
	AddVertex (surface,-.4,-.4,.13,(tex Mod 8)*0.125+0.013,Floor((tex Mod 64)/8)*0.125+0.0945)
	AddVertex (surface,.4,-.4,.13,(tex Mod 8)*0.125+0.1135,Floor((tex Mod 64)/8)*0.125+0.0945)


	AddTriangle(surface,0,1,2)
	AddTriangle(surface,1,3,2)
	
	AddTriangle(surface,5,4,6)
	AddTriangle(surface,5,6,7)
	
	
	tex=63
	AddVertex (surface,-.45,.45,-.0951,(tex Mod 8)*0.125+0.013,Floor((tex Mod 64)/8)*0.125+0.013)
	AddVertex (surface,.45,.45,-.09510,(tex Mod 8)*0.125+0.1135,Floor((tex Mod 64)/8)*0.125+0.013)
	AddVertex (surface,-.45,-.45,-.09510,(tex Mod 8)*0.125+0.013,Floor((tex Mod 64)/8)*0.125+0.0945)
	AddVertex (surface,.45,-.45,0-.0951,(tex Mod 8)*0.125+0.1135,Floor((tex Mod 64)/8)*0.125+0.0945)
	
	AddVertex (surface,-.45,.45,.09510,(tex Mod 8)*0.125+0.013,Floor((tex Mod 64)/8)*0.125+0.013)
	AddVertex (surface,.45,.45,.09510,(tex Mod 8)*0.125+0.1135,Floor((tex Mod 64)/8)*0.125+0.013)
	AddVertex (surface,-.45,-.45,.09510,(tex Mod 8)*0.125+0.013,Floor((tex Mod 64)/8)*0.125+0.0945)
	AddVertex (surface,.45,-.45,.09510,(tex Mod 8)*0.125+0.1135,Floor((tex Mod 64)/8)*0.125+0.0945)


	AddTriangle(surface,8,9,10)
	AddTriangle(surface,9,11,10)
	
	AddTriangle(surface,13,12,14)
	AddTriangle(surface,13,14,15)
	
	
	AddTriangle(surface,12,13,9)
	AddTriangle(surface,8,12,9)
	
	
	AddTriangle(surface,11,15,14)
	AddTriangle(surface,11,14,10)
	
	
	AddTriangle(surface,12,8,14)
	AddTriangle(surface,8,10,14)
	
	
	AddTriangle(surface,9,13,15)
	AddTriangle(surface,9,15,11)







	
	
	UpdateNormals Entity
	EntityTexture Entity,IconTextureCustom
	
	Return Entity
End Function



Function ControlCustomItem(i)
	If ObjectActive(i)<1001 
		; picked up animation
		ObjectYaw(i)=ObjectYaw(i)+10
		


		If ObjectActive(i)>600
			ObjectZ(i)=.6+2*Float(1000-ObjectActive(i))/400.0
		Else
			ObjectZ(i)=2.6
		EndIf
		If ObjectActive(i)=400
			; Little Spark
			For j=1 To 60
				AddParticle(Rnd(16,23),ObjectTileX(i)+0.5,2.6,-ObjectTileY(i)-0.5,Rand(0,360),0.2,Rnd(-.035,.035),Rnd(-.015,.015),Rnd(-.035,.035),0,0,0,0,0,50,3)
			Next
		EndIf
		If ObjectActive(i)<600
			ObjectScaleXAdjust(i)=Float(ObjectActive(i))/600.0
			ObjectScaleYAdjust(i)=Float(ObjectActive(i))/600.0
			ObjectScaleZAdjust(i)=Float(ObjectActive(i))/600.0


		EndIf
		
		
		
		
	Else
		
		ObjectYaw(i)=ObjectYaw(i)+Cos(Leveltimer Mod 360)
		
		ObjectZ(i)=.5
			
		dist=Maximum2(Abs(ObjectTileX(i)-ObjectTileX(PlayerObject)),Abs(ObjectTileY(i)-ObjectTileY(PlayerObject)))
		; see if picked up
		If ObjectMovementTimer(PlayerObject)=0 And dist=0
			
			; do we have room in inventory?
			
			
			If NofInventoryItems<InventorySize^2	
				
				; delete logic from tiles
				If (ObjectTileLogic(ObjectTileX(i),ObjectTileY(i)) And 2^4)>0
					ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))=ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))-2^4
				EndIf

								
				; and add to inventory	
				If ObjectSubType(i)<10 Or ObjectSubType(i)>=20
				
					If ObjectSubType(i)=-1
						; gloves special case
						AddItemToInventory(-1,1001,-1,23,"Gloves","Examine")
						ObjectSubType(i)=0
					Else If ObjectSubType(i)=-2
						; lamp special case
						AddItemToInventory(-1,2001,-1,66,"Lamp","- 99 -")
						CurrentLightPower=99
					Else If ObjectSubType(i)=-3
						; lamp special case
						AddItemToInventory(-1,2011,-1,67,"GlowGem","Charged")
						CurrentLightPower=-1
						; and delete the old lamp
						For j=0 To 99
							If InventoryItem(j)=2001 Then removeitemfrominventory(j)
						Next
						
						
					Else If ObjectSubType(i)=-4
						; spyeye special case
						AddItemToInventory(-1,2021,-1,68,"Spy-Eye","Use")
						
					; note: 2031 is used for tokens


	
					Else
						AddItemToInventory(-1,4001+ObjectSubType(i)*10,ObjectData(i,1),ObjectData(i,0)+64,ObjectTextData$(i,0),ObjectTextData$(i,1))
					EndIf
					PlaySoundFX(174,-1,-1)
					; Do a little blip around the Rucksack
					IconSize(8)=601
					For j=0 To 359 Step 10
						AddParticle2(16,1.74+.5*Sin(j),1.63+.5*Cos(j),5,0,.08,-.01*Sin(j),-.01*Cos(j),0,0,-.001,0,0,0,50,2)
					Next
				 	ObjectActivationSpeed(i)=10
					
				
					; if Adventure won - do it now
					If ObjectSubType(i) Mod 10 =1 Then AdventureWon()

				Else
				; immediate use
					
					btype=ObjectSubType(i)
					btype2=btype Mod 10
					
					flag=False
					
					
				
					
					If btype2=1
						;Adventure Won
						
						AdventureWon()
					Else If btype2>=2 And btype2<=7
						
					
						; look (for some types only in neighbourhood of player) to see if a keyblock exists with matching ID
						
						x=Floor(ObjectX(i))
						y=Floor(ObjectY(i))
						For j=0 To NofObjects-1
							If ObjectExists(j)=True And ObjectID(j)=ObjectData(i,1)
							
								If (Abs(ObjectTileX(j)-x)<=1 And Abs(ObjectTileY(j)-y)<=1) Or btype2=5 Or btype2=6 Or btype2=7
						
									; got something - open/close/toggle
									
									If btype2=2 Or btype2=5
										ActivateObject(j)
									Else If btype2=3 Or btype2=6
										DeActivateObject(j)
									Else If btype2=4 Or btype2=7
										ToggleObject(j)
									EndIf
									flag=True
								EndIf
								
							EndIf
						Next
					EndIf
					ObjectActivationSpeed(i)=100
				
				EndIf				
				
				
				; Destroy/Deactivate Key in Level	
				ObjectActivationType(i)=0
				
				ObjectID(i)=-1
				DeActivateObject(i)
			Else
				MessageLineText1$="You Cannot Carry Any More"
				MessageLineText2$=""

				MessageLineTimer=100
	
			EndIf
		

	
			
			
		EndIf
	EndIf
		
	
End Function


Function ControlSigns(i)
	
	
	Select ObjectData(i,2)
	
	Case 0
		; nuthin'
	Case 1
		; Sway
		ObjectPitch(i)=5*Sin((leveltimer*1.5) Mod 360)
		ObjectYaw(i)=5*Sin((leveltimer/2) Mod 360)
		ObjectRoll(i)=5*Sin(leveltimer Mod 360)

	Case 2
		; Bounce
		ObjectScaleZAdjust(i)=1.0+0.15*Sin((Leveltimer*4) Mod 360)
		ObjectRoll(i)=5*Sin((leveltimer*2) Mod 360)
	Case 3
		; turn
		ObjectYaw(i)=ObjectYaw(i)+3
	End Select

		

End Function

Function ControlParticleEmitters(i)
	
	If ObjectActive(i)=0 Then Return
	
	Select ObjectSubType(i)
	Case 1
		; steam
		If ObjectStatus(i)=0
			; not steaming - check if start
			If Rand(0,400)<=ObjectData(i,1)*2
				ObjectStatus(i)=1
			EndIf
		Else
			If Rand(0,200*ObjectData(i,1))<2
				
				ObjectStatus(i)=0
				
			EndIf
			Select ObjectData(i,2)
			Case 0
				If Rand(0,25)<ObjectData(i,1)*3-2 AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,0,.03,0,0,.01,0,0,0,100,3)
			Case 1
				If Rand(0,10)<ObjectData(i,1) AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,0,-.03,0,0,.01,0,0,0,100,3)
			Case 2
				If Rand(0,10)<ObjectData(i,1) AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,.03,0,0,0,.01,0,0,0,100,3)
			Case 3
				If Rand(0,10)<ObjectData(i,1) AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,-.03,0,0,0,.01,0,0,0,100,3)
			Case 4
				If Rand(0,10)<ObjectData(i,1) AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,0,0,.03,0,.01,0,0,0,100,3)
			Case 5
				If Rand(0,10)<ObjectData(i,1) AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,0,0,-.03,0,.01,0,0,0,100,3)
			End Select
					
				
		EndIf
	Case 2
		; splish
		If Rand (0,1000)<=ObjectData(i,1)*2
			AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.01,0,0,0,0,.01,0,0,0,100,4)
		EndIf
		
	Case 3
		; fountain
		Select ObjectData(i,2)
		Case 0
			If Rand(0,12)<ObjectData(i,1)*3-2 AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,Rnd(-.01,.01),Rnd(.05,.07),Rnd(-.01,.01),0,.001,0,-.001,0,100,3)
		Case 1
			If Rand(0,12)<ObjectData(i,1)*3-2 AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,Rnd(-.01,.01),-Rnd(0,.02),Rnd(-.01,.01),0,.001,0,-.001,0,100,3)
		Case 2
			If Rand(0,12)<ObjectData(i,1)*3-2 AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,Rnd(.05,.07),Rnd(.02,.01),Rnd(-.01,.01),0,.001,0,-.001,0,100,3)
		Case 3
			If Rand(0,12)<ObjectData(i,1)*3-2 AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,-Rnd(.05,.07),Rnd(.02,.01),Rnd(-.01,.01),0,.001,0,-.001,0,100,3)
		Case 4
			If Rand(0,12)<ObjectData(i,1)*3-2 AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,Rnd(-.01,.01),Rnd(.02,.01),Rnd(.05,.07),0,.001,0,-.001,0,100,3)
		Case 5
			If Rand(0,12)<ObjectData(i,1)*3-2 AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,Rnd(-.01,.01),Rnd(.02,.01),-Rnd(.05,.07),0,.001,0,-.001,0,100,3)
		End Select
	Case 4
		; sparks
		If Rand(0,1000)<ObjectData(i,1)*ObjectData(i,1)
			If ObjectData(i,3)>=1
				SoundPitch SoundFX(16),Rand(24000,29000)
				PlaySoundFX(16,ObjectTileX(i)+.5,ObjectTileY(i)+.5)
			EndIf
			For j=0 To ObjectData(i,1)*30
				Select ObjectData(i,2)
				Case 0
					AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0.01,.2,Rnd(-.01,.01),Rnd(.09,.11),Rnd(-.01,.01),0,.0001,0,-.0015,0,50,3)
				Case 1
					AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0.01,.2,Rnd(-.01,.01),-Rnd(0,.02),Rnd(-.01,.01),0,.0001,0,-.0015,0,50,3)
				Case 2
					AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0.01,.2,Rnd(.01,.04),Rnd(.03,.01),Rnd(-.01,.01),0,.0001,0,-.0015,0,50,3)
				Case 3
					AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0.01,.2,-Rnd(.01,.04),Rnd(.03,.01),Rnd(-.01,.01),0,.0001,0,-.0015,0,50,3)
				Case 4
					AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0.01,.2,Rnd(-.01,.01),Rnd(.03,.01),Rnd(.01,.04),0,.0001,0,-.0015,0,50,3)
				Case 5
					AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0.01,.2,Rnd(-.01,.01),Rnd(.03,.01),-Rnd(.01,.04),0,.0001,0,-.0015,0,50,3)
				End Select
			Next
		EndIf
	Case 5
		; blinker
		If (ObjectData(i,4)=0 And Rand(0,200)<ObjectData(i,1)) Or (ObjectData(i,4)=1 And LevelTimer Mod (500-ObjectData(i,1)*100)=0)
			If ObjectData(i,3)>=1
				If ObjectData(i,3)=1 ; quiet magic
					SoundPitch SoundFX(90),Rand(16000,20000)
					PlaySoundFX(90,ObjectTileX(i)+.5,ObjectTileY(i)+.5)
				EndIf
				If ObjectData(i,3)=2 ; loud mecha
					
					PlaySoundFX(35,ObjectTileX(i)+.5,ObjectTileY(i)+.5)
				EndIf

				If ObjectData(i,3)=3 ; variable gong
					SoundPitch SoundFX(13),Rand(24000,44000)
					PlaySoundFX(13,ObjectTileX(i)+.5,ObjectTileY(i)+.5)
				EndIf
				If ObjectData(i,3)=4 ; grow
					
					PlaySoundFX(92,ObjectTileX(i)+.5,ObjectTileY(i)+.5)
				EndIf
				
				If ObjectData(i,3)=5 ; floing
					
					PlaySoundFX(93,ObjectTileX(i)+.5,ObjectTileY(i)+.5)
				EndIf
				
				If ObjectData(i,3)=6 ; gem
					
					PlaySoundFX(11,ObjectTileX(i)+.5,ObjectTileY(i)+.5)
				EndIf



			EndIf
			AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0.01,.4,0,0,0,0,.0005,0,0,0,100,3)
			
		EndIf
		
	Case 6
		; circle
		If (ObjectData(i,4)=0 And Rand(0,200)<ObjectData(i,1)) Or (ObjectData(i,4)=1 And LevelTimer Mod (500-ObjectData(i,1)*100)=0)

			For j=0 To 44
				Select ObjectData(i,2)
				Case 0,1
					AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,.01*ObjectData(i,1)*Cos(j*8),0,.01*ObjectData(i,1)*Sin(j*8),0,.001,0,0,0,100,3)
				Case 2,3
					AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,0,.01*ObjectData(i,1)*Cos(j*8),.01*ObjectData(i,1)*Sin(j*8),0,.001,0,0,0,100,3)
				Case 4,5
					AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,.01*ObjectData(i,1)*Cos(j*8),.01*ObjectData(i,1)*Sin(j*8),0,0,.001,0,0,0,100,3)
				
				End Select
			Next
		EndIf

		
	Case 7
		; spiral
		Select ObjectData(i,2)
		Case 0
			AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,.02*ObjectData(i,1)*Cos((Leveltimer*ObjectData(i,1)) Mod 360),0,.02*ObjectData(i,1)*Sin((Leveltimer*ObjectData(i,1)) Mod 360),0,.001,0,0,0,100,3)
		Case 2
			AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,0,.02*ObjectData(i,1)*Cos((Leveltimer*ObjectData(i,1)) Mod 360),.02*ObjectData(i,1)*Sin((Leveltimer*ObjectData(i,1)) Mod 360),0,.001,0,0,0,100,3)
		Case 4
			AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,.02*ObjectData(i,1)*Cos((Leveltimer*ObjectData(i,1)) Mod 360),.02*ObjectData(i,1)*Sin((Leveltimer*ObjectData(i,1)) Mod 360),0,0,.001,0,0,0,100,3)
		
		Case 1
			AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,-.02*ObjectData(i,1)*Cos((Leveltimer*ObjectData(i,1)) Mod 360),0,.02*ObjectData(i,1)*Sin((Leveltimer*ObjectData(i,1)) Mod 360),0,.001,0,0,0,100,3)
		Case 3
			AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,0,-.02*ObjectData(i,1)*Cos((Leveltimer*ObjectData(i,1)) Mod 360),.02*ObjectData(i,1)*Sin((Leveltimer*ObjectData(i,1)) Mod 360),0,.001,0,0,0,100,3)
		Case 5
			AddParticle(ObjectData(i,0),ObjectXAdjust(i)+ObjectTileX(i)+.5,ObjectZAdjust(i),-ObjectYAdjust(i)-ObjectTileY(i)-.5,0,.2,-.02*ObjectData(i,1)*Cos((Leveltimer*ObjectData(i,1)) Mod 360),.02*ObjectData(i,1)*Sin((Leveltimer*ObjectData(i,1)) Mod 360),0,0,.001,0,0,0,100,3)

		End Select
	


		
	




	


	
	End Select

End Function

Function ControlGloveCharge(i)
	ObjectZ(i)=0.04
	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))
	myparticle=16+ObjectData(i,0)
	If (ObjectData(i,0)=9 Or ObjectData(i,0)=10) Then myparticle=26-ObjectData(i,0)
;	If ObjectData(i,3)=0 Or ObjectData(i,0)=8
		EntityFX ObjectEntity(i),2
		red=0
		green=0
		blue=0
		For ii=0 To 3
			Select ObjectData(i,0)
			Case 0
				red=255
			Case 1
				red=255
				green=100
			Case 2
				red=255
				green=255
			Case 3
				green=255
			Case 4
				green=255
				blue=255
			Case 5
				blue=255
			Case 6
				red=255
				blue=255
			Case 7
				red=255
				blue=255
				green=255
			Case 8
				red=128+120*Sin(Leveltimer Mod 360)
				green=128+120*Cos(Leveltimer Mod 360)
				blue=128-120*Sin(Leveltimer Mod 360)
			Case 9
				red=145
				green=109
				blue=35
			Case 10
				red=93
				green=2
				blue=7
	
			End Select
			
			If ObjectSubType(i)>0
				If ObjectData(i,0)=9 Or ObjectData(i,0)=10
					red=red-64
					green=green-64
					blue=blue-64
					If red<0 Then red=0
					If green<0 Then green=0
					If blue<0 Then blue=0
				Else
					red=red-128
					green=green-128
					blue=blue-128
					If red<0 Then red=0
					If green<0 Then green=0
					If blue<0 Then blue=0
					If ObjectData(i,0)=0 Then red=red-16
				EndIf
			EndIf
		
			VertexColor GetSurface(ObjectENtity(i),1),ii,red,green,blue
		Next
		ObjectData(i,3)=1
		
	
	
	
	j2=Rand(0,359)
	If ObjectData(i,1)=1 ; one time charge
		If leveltimer Mod 5 = 0
			AddParticle(myparticle,ObjectTileX(i)+.5+.3*Sin(j2*3),0,-ObjectTileY(i)-.5-.3*Cos(j2*3),0,.2,0,.03,0,4,0,0,0,0,50,3)
		EndIf
	Else If ObjectData(i,1)=0; multi-charge
		If leveltimer Mod 2 = 0
			AddParticle(myparticle,ObjectTileX(i)+.5+.3*Sin(j2*3),0,-ObjectTileY(i)-.5-.3*Cos(j2*3),0,.3,0,.04,0,4,0,0,0,0,50,3)
		EndIf
	Else If ObjectData(i,1)=3 ; uo charger
		If leveltimer Mod 5 = 0
			AddParticle(myparticle,ObjectTileX(i)+.5+.1*Sin(j2*3),0,-ObjectTileY(i)-.5-.1*Cos(j2*3),0,.2,0,.03,0,4,0,0,0,0,50,3)
			;ObjectScaleAdjust(i)=0.5
		EndIf
	EndIf
	
	;	j2=(j2+180) Mod 360
	;	AddParticle(myparticle,ObjectTileX(i)+.5+.4*Sin(j2*3),0,-ObjectTileY(i)-.5-.4*Cos(j2*3),0,.5,0.01*Sin(j2*3),.03,-0.01*Cos(j2*3),1,0,0,0,0,50,3)
	
	
	; check if player standing on it
	If ObjectTileX(PlayerObject)=ObjectTileX(i) And ObjectTileY(PlayerObject)=ObjectTileY(i)
		If ObjectMovementTimer(PlayerObject)=0 And ObjectData(i,1)<>2 And (CurrentSpell<>ObjectData(i,0) Or (CurrentSpell=ObjectData(i,0) And (CurrentSpellPower<9 Or ObjectSubType(i)=1)))
			
			If ObjectSubType(i)=0 Then
				; check inventory for gloves
				For j=0 To 99
					If InventoryItem(j)=1001
						; recharge!
						
						If ObjectData(i,1)<>3
							If CurrentSpellPower<8 Or ObjectData(i,9)=0 Then PlaySoundFX(80,-1,-1)
							ObjectData(i,9)=1
							If ObjectData(i,0)=8
								For k=0 To 7
									AddParticle(32+k,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5+k/10.0,0,.9,0,.04,0,0,0,0,0,0,75,4)
								Next
							ElseIf ObjectData(i,0)=9
								AddParticle(1,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5,0,.9,0,.04,0,0,0,0,0,0,75,4)
							ElseIf ObjectData(i,0)=10
								AddParticle(2,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5,0,.9,0,.04,0,0,0,0,0,0,75,4)
							Else
								AddParticle(myparticle+16,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5,0,.9,0,.04,0,0,0,0,0,0,75,4)
								AddParticle(myparticle+16,ObjectTileX(i)+.5,2,-ObjectTileY(i)-.5,0,.9,0,-.03,0,0,0,0,0,0,75,4)
								AddParticle(myparticle+16,ObjectTileX(i)+.5,.3,-ObjectTileY(i)-.5,0,.9,0,.02,0,0,0,0,0,0,75,4)
							EndIf
							InventoryTexture(j)=16+ObjectData(i,0)
							CurrentSpell=ObjectData(i,0)
							CurrentSpellPower=9
							If ObjectData(i,1)=1 Then ObjectData(i,1)=2
							; activate glove icon
							DeleteIcon(0)
							CreateIcon(0,0,16+CurrentSpell,1002+CurrentSpell,"- 9 -","Activate")
						Else
							If CurrentSpellPower<8 Or ObjectData(i,9)=0 Then PlaySoundFX(80,-1,-1)
							ObjectData(i,9)=1
							If ObjectData(i,0)=8
								For k=0 To 7
									AddParticle(32+k,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5+k/10.0,0,.9,0,.04,0,0,0,0,0,0,75,4)
								Next
							ElseIf ObjectData(i,0)=9
								AddParticle(1,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5,0,.9,0,.04,0,0,0,0,0,0,75,4)
							ElseIf ObjectData(i,0)=10
								AddParticle(2,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5,0,.9,0,.04,0,0,0,0,0,0,75,4)
							Else
								AddParticle(myparticle+16,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5,0,.9,0,.04,0,0,0,0,0,0,75,4)
								AddParticle(myparticle+16,ObjectTileX(i)+.5,2,-ObjectTileY(i)-.5,0,.9,0,-.03,0,0,0,0,0,0,75,4)
								AddParticle(myparticle+16,ObjectTileX(i)+.5,.3,-ObjectTileY(i)-.5,0,.9,0,.02,0,0,0,0,0,0,75,4)
							EndIf
							
							InventoryTexture(j)=16+ObjectData(i,0)
							
							
							If CurrentSpellPower<9 And CurrentSpell=ObjectData(i,0)
								CurrentSpellPower=CurrentSpellPower+1
							Else
								CurrentSpellPower=1
							EndIf
							CurrentSpell=ObjectData(i,0)
							If ObjectData(i,1)=1 Then ObjectData(i,1)=2
							; activate glove icon
							DeleteIcon(0)
							CreateIcon(0,0,16+CurrentSpell,1002+CurrentSpell,"- "+Str$(currentspellpower)+" -","Activate")
							DestroyObject(i,0)
						EndIf
					EndIf
				Next
			Else
				; check inventory for gloves
				For j=0 To 99
					If InventoryItem(j)=1001
						; discharge!
						
						If ObjectData(i,1)<>3
							If CurrentSpell=ObjectData(i,0)
								If CurrentSpellPower>0 Or ObjectData(i,9)=0 Then PlaySoundFX(91,-1,-1)
								ObjectData(i,9)=1
								If ObjectData(i,0)=8
									For k=0 To 7
										AddParticle(32+k,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5+k/10.0,0,.9,0,.04,0,0,0,0,0,0,75,4)
									Next
								ElseIf ObjectData(i,0)=9
									AddParticle(1,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5,0,.9,0,.04,0,0,0,0,0,0,75,4)
								ElseIf ObjectData(i,0)=10
									AddParticle(2,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5,0,.9,0,.04,0,0,0,0,0,0,75,4)
								Else
									AddParticle(myparticle+16,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5,0,.9,0,.04,0,0,0,0,0,0,75,4)
									AddParticle(myparticle+16,ObjectTileX(i)+.5,2,-ObjectTileY(i)-.5,0,.9,0,-.03,0,0,0,0,0,0,75,4)
									AddParticle(myparticle+16,ObjectTileX(i)+.5,.3,-ObjectTileY(i)-.5,0,.9,0,.02,0,0,0,0,0,0,75,4)
								EndIf
								InventoryTexture(j)=23
								CurrentSpell=-1
								CurrentSpellPower=0
								If ObjectData(i,1)=1 Then ObjectData(i,1)=2
								; activate glove icon
								DeleteIcon(0)
								SpellActive=false
							EndIf
						Else
							If CurrentSpell=ObjectData(i,0)
								If CurrentSpellPower>0 Or ObjectData(i,9)=0 Then PlaySoundFX(91,-1,-1)
								ObjectData(i,9)=1
								If ObjectData(i,0)=8
									For k=0 To 7
										AddParticle(32+k,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5+k/10.0,0,.9,0,.04,0,0,0,0,0,0,75,4)
									Next
								ElseIf ObjectData(i,0)=9
									AddParticle(1,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5,0,.9,0,.04,0,0,0,0,0,0,75,4)
								ElseIf ObjectData(i,0)=10
									AddParticle(2,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5,0,.9,0,.04,0,0,0,0,0,0,75,4)
								Else
									AddParticle(myparticle+16,ObjectTileX(i)+.5,0,-ObjectTileY(i)-.5,0,.9,0,.04,0,0,0,0,0,0,75,4)
									AddParticle(myparticle+16,ObjectTileX(i)+.5,2,-ObjectTileY(i)-.5,0,.9,0,-.03,0,0,0,0,0,0,75,4)
									AddParticle(myparticle+16,ObjectTileX(i)+.5,.3,-ObjectTileY(i)-.5,0,.9,0,.02,0,0,0,0,0,0,75,4)
								EndIf
								
								
								
								
								
								
								If CurrentSpellPower>0 And CurrentSpell=ObjectData(i,0) Then CurrentSpellPower=CurrentSpellPower-1
								If ObjectData(i,1)=1 Then ObjectData(i,1)=2
								If CurrentSpellPower=0
								; deactivate glove icon
									InventoryTexture(j)=16+ObjectData(i,0)
									CurrentSpell=-1
									SpellActive=false
									DeleteIcon(0)
								Else
									DeleteIcon(0)
									CreateIcon(0,0,16+CurrentSpell,1002+CurrentSpell,"- "+Str$(currentspellpower)+" -","Activate")
								EndIf
								
								
								DestroyObject(i,0)
							EndIf
						EndIf
					EndIf
				Next
			EndIf

		EndIf
	Else
		ObjectData(i,9)=0
	EndIf
				

End Function

Function CreateTransporterMesh(tex,Subtype)
	
	Entity=CreateMesh()
	Surface=CreateSurface(Entity)
	
	; Top 
	AddVertex (surface,-.495,0.01,.495,Subtype*0.25+.01,.26)
	AddVertex (surface,.495,0.01,.495,Subtype*0.25+.24,.26)
	AddVertex (surface,-.495,0.01,-.495,Subtype*0.25+.01,.49)
	AddVertex (surface,.495,0.01,-.495,Subtype*0.25+.24,.49)
	AddTriangle (surface,0,1,2)
	AddTriangle (surface,1,3,2)
	AddVertex (surface,-.25,0.02,.25,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51)
	AddVertex (surface,.25,0.02,.25,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51)
	AddVertex (surface,-.25,0.02,-.25,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51+.115)
	AddVertex (surface,.25,0.02,-.25,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51+.115)
	AddTriangle (surface,4,5,6)
	AddTriangle (surface,5,7,6)
	
	; Sides
	For i=0 To 3
		Select i
		Case 0
			x1#=-.49
			x2#=.49
			y1#=-.49
			y2#=-.49
		Case 1
			x1#=.49
			x2#=.49
			y1#=-.49
			y2#=.49
		Case 2
			x1#=.49
			x2#=-.49
			y1#=.49
			y2#=.49
		Case 3
			x1#=-.49
			x2#=-.49
			y1#=.49
			y2#=-.49
		End Select

	
			
		AddVertex (surface,x1,0,y1,subtype*0.25+.01,.01)
		AddVertex (surface,x2,0,y2,subtype*0.25+.24,.01)
		AddVertex (surface,x1,-.3,y1,subtype*0.25+.01,.24)
		AddVertex (surface,x2,-.3,y2,subtype*0.25+.24,.24)
		AddTriangle (surface,8+i*4,9+i*4,10+i*4)
		AddTriangle (surface,9+i*4,11+i*4,10+i*4)
		
		
	Next


	
	
	UpdateNormals Entity
	
	EntityTexture Entity,GateTexture
	Return Entity

End Function

Function ControlTransporter(i)

	If ObjectID(i)=-1
		ObjectID(i)=500+ObjectData(i,0)*5+ObjectData(i,1)
	EndIf


	If ObjectTileX(i)=0 And ObjectTileY(i)=0 And ObjectMovementTimer(i)=0
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
	EndIf
	x=ObjectTileX(i)
	y=ObjectTileY(i)
	
	Select (ObjectData(i,2)+40) Mod 4
	Case 0
		dx=0
		dy=-1
	Case 1
		dx=-1
		dy=0
	Case 2
		dx=0
		dy=1
	Case 3
		dx=1
		dy=0
	End Select
	
	TurnobjectTowardDirection(i,dx,dy,20,180)
	
	; check if weight is on transporter
	Weight=False
	obj=-1	
	For j=0 To NofObjects-1
		If ObjectExists(j)=True And ObjectButtonPush(j)=True And i<>j
			; check if object is on tile 
			If (ObjectTileX(j)=ObjectTileX(i) And ObjectTileY(j)=ObjectTileY(i) And ObjectMovementTimer(j)=0 And ObjectLinked(i)=-1) 
				If ObjectFlying(j) / 10 <>1
					; Yup
					
					weight=True
					obj=j
					
					If ObjectData(i,8)>0 And ObjectID(j)<>ObjectData(i,8)
						; only activate this button with matching ID
						weight=False
					EndIf
				EndIf
			EndIf
		EndIf
					
	Next

	If ObjectActive(i)=1001
		
			
		If ObjectStatus(i)=0 ; stationary and waiting	
			
			
			; Activate this transporter
			If weight=True
				
				
				; check - can move?
				
				; must be totally empty (except for items) to move
				
				If LevelTileLogic(x+dx,y+dy)=2 And (ObjectTileLogic(x+dx,y+dy)=0 Or (ObjectTileLogic(x+dx,y+dy)=2^4 And obj=PlayerObject))
					; yep - go!
					PlaySoundFX(40,x,y)
					ObjectStatus(i)=1
					LevelTileLogic(x,y)=2
					
					
					ObjectLinked(obj)=i
					ObjectLinkBack(i)=obj
					
					
					ObjectMovementSpeed(i)=50
					MoveObjectToTile(i,x+dx,y+dy)
					If ObjectLinkBack(i)>=0
						OccupyObjectTile(ObjectLinkBack(i),x+dx,y+dy)
					EndIf
				Else
					; no - just turn
					PlaySoundFX(41,x,y)
					ObjectStatus(i)=2
					ObjectData(i,2)=(ObjectData(i,2)+2) Mod 4

				EndIf
					
				
				
			EndIf
		Else If ObjectStatus(i)=1
			; moving
			If ObjectMovementTimer(i)=0
				; keep going?
				Flag=False ; go through objects if empty or with player
				If ObjectLinkBack(i)=-1
					Flag=True
				Else If ObjectLinkBack(i)=PlayerObject 
					Flag=True
				EndIf

				If LevelTileLogic(x+dx,y+dy)=2 And (ObjectTileLogic(x+dx,y+dy)=0 Or (ObjectTileLogic(x+dx,y+dy)=2^4 And Flag=True))
					; yep - go!
					PlaySoundFX(40,x,y)
					MoveObjectToTile(i,x+dx,y+dy)
					If ObjectLinkBack(i)>=0
						
						VacateObjectTile(ObjectLinkBack(i))
						If ObjectData10(ObjectLinkBack(i))=-1 And ObjectType(ObjectLinkBack(i))=110 And (ObjectMoveXGoal(ObjectLinkBack(i))<> ObjectTileX(ObjectLinkBack(i)) Or ObjectMoveYGoal(ObjectLinkBack(i))<>ObjectTileY(ObjectLinkBack(i)))
							ObjectData10(ObjectLinkBack(i))=ObjectMoveXGoal(ObjectLinkBack(i))+ObjectMoveYGoal(ObjectLinkBack(i))*200
						EndIf
						ObjectTileX(ObjectLinkBack(i))=x
						ObjectTileY(ObjectLinkBack(i))=y
						ObjectTileX2(ObjectLinkBack(i))=x
						ObjectTileY2(ObjectLinkBack(i))=y
						
						ObjectMoveXGoal(ObjectLinkBack(i))=x
						ObjectMoveYGoal(ObjectLinkBack(i))=y
						OccupyObjectTile(ObjectLinkBack(i),x+dx,y+dy)
						
					EndIf
				Else
					
					; no and reverse
					PlaySoundFX(41,x,y)

					If ObjectLinkBack(i)>=0
						; release object
						VacateObjectTile(ObjectLinkBack(i))
						

						ObjectLinked(ObjectLinkBack(i))=-1
						ObjectTileX(ObjectLinkBack(i))=x
						ObjectTileY(ObjectLinkBack(i))=y
						ObjectTileX2(ObjectLinkBack(i))=x
						ObjectTileY2(ObjectLinkBack(i))=y
						ObjectMoveXGoal(ObjectLinkBack(i))=x
						ObjectMoveYGoal(ObjectLinkBack(i))=y
						
						ObjectLinkBack(i)=-1
					EndIf

			
					
					
					ObjectStatus(i)=2
					LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=4
					ObjectData(i,2)=(ObjectData(i,2)+2) Mod 4
				;	RotateMesh ObjectEntity(i),0,180,0
				EndIf
			EndIf

		Else If ObjectStatus(i)=2
			; waiting for object to step off
			If weight=False
				ObjectStatus(i)=3
			EndIf		
		Else If ObjectStatus(i)=3
			; waiting for object to step off
			If weight=False
				ObjectStatus(i)=0
			EndIf		
			
	
		EndIf
			
		
	EndIf
End Function

Function ActivateTransporter(i)
	
	If ObjectActive(i)<1001 Or ObjectStatus(i)=1 Then Return
	
	x=ObjectTileX(i)
	y=ObjectTileY(i)
	
	Select (ObjectData(i,2)+40) Mod 4
	Case 0
		dx=0
		dy=-1
	Case 1
		dx=-1
		dy=0
	Case 2
		dx=0
		dy=1
	Case 3
		dx=1
		dy=0
	End Select
	
	; can we move in that direction?
	Flag=False ; go through objects if empty or with player
	If ObjectLinkBack(i)=-1
		Flag=True
	Else If ObjectLinkBack(i)=PlayerObject 
		Flag=True
	EndIf
	If LevelTileLogic(x+dx,y+dy)=2 And (ObjectTileLogic(x+dx,y+dy)=0 Or (ObjectTileLogic(x+dx,x+dy)=2^4 And Flag=True)	)
		; check if something is on button
		Weight=False
		obj=-1	
		For j=0 To NofObjects-1
			If ObjectExists(j)=True And ObjectButtonPush(j)=True And i<>j
				; check if object is on tile - either first part of movement (or rest) and x/y, or last part of movement and x2/y2
				If (ObjectTileX(j)=ObjectTileX(i) And ObjectTileY(j)=ObjectTileY(i) And ObjectMovementTimer(j)=0 And ObjectLinked(i)=-1) 
					; Yup
					
					weight=True
					obj=j
					

					If ObjectData(i,8)>0 And ObjectID(j)<>ObjectData(i,8)
						; only activate this button with matching ID
						weight=False
					EndIf
				EndIf
			EndIf
						
		Next
		
		ObjectStatus(i)=1
		LevelTileLogic(x,y)=2
		PlaySoundFX(40,x,y)

		
		
		ObjectMovementSpeed(i)=50
		MoveObjectToTile(i,x+dx,y+dy)
		
		; move object on top as well
		If weight=True
			ObjectLinked(obj)=i
			ObjectLinkBack(i)=obj
			
			OccupyObjectTile(ObjectLinkBack(i),x+dx,y+dy)
		EndIf
	Else
		ObjectData(i,2)=(ObjectData(i,2)+2) Mod 4

	EndIf
End Function

Function ControlConveyor(i)

	ObjectMovementSpeed(i)=60
	
	
	If ObjectID(i)=-1
		; first time 
		ObjectID(i)=500+ObjectData(i,0)*5+ObjectData(i,1)
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		x=ObjectTileX(i)
		y=ObjectTileY(i)
		ObjectData(i,8)=LevelTileLogic(x,y)
		Leveltilelogic(x,y)=4
		
		; chase the tail
		noftails=0
		Repeat
			
			; Check the four directions
			foundtail=False
			For x2=-1 To 1
				For y2=-1 To 1
					If (x2=0 And y2<>0) Or (x2<>0 And y2=0)
						; is there a matching tail there
						For j=0 To nofobjects-1
							If ObjectType(j)=46
								If Floor(ObjectX(j))=x+x2 And Floor(ObjectY(j))=y+y2 
									If ObjectData(j,0)=ObjectData(i,0) And ObjectData(j,1)=ObjectData(i,1) And ObjectData(j,3)=-1
											foundtail=True
											noftails=noftails+1
											ObjectID(j)=500+ObjectData(j,0)*5+ObjectData(j,1)
											ObjectData(j,3)=noftails
											;ObjectData(j,4)=ObjectData(i,4)
											ObjectData(j,8)=LevelTileLogic(x+x2,y+y2)
											ObjectData(i,9)=noftails+1
											LevelTileLogic(x+x2,y+y2)=4
											ObjectData(j,5)=ObjectData(i,5)
											ObjectData(j,6)=-x2
											Objectdata(j,7)=-y2
											ObjectData(j,9)=Rand(-5,5)
											ObjectTileX(j)=x+x2
											ObjectTileY(j)=y+y2
											ObjectActivationspeed(j)=60
											ObjectMovementSpeed(j)=20

											If x2=0
												If y2=+1
													ObjectData(j,2)=0
												Else
													ObjectData(j,2)=2
												EndIf
											Else
												If x2=+1
													objectData(j,2)=3
												Else
													ObjectData(j,2)=1
												EndIf
											EndIf
											
											If ObjectData(j,4)=3	ObjectYaw(j)=-90*ObjectData(j,2)
											x=x+x2
											y=y+y2
									EndIf
								EndIf
							EndIf
						Next
					EndIf
				Next
			Next
		Until foundtail=False
		
		If noftails>0
			; now go backwards to increase length of tail
		;	foundtail=False
		;	tailcount=2
		;	Repeat
		;		For y2=1 To -1 Step -1
		;			For x2=1 To -1 Step -1
		;				If (x2=0 And y2<>0) Or (x2<>0 And y2=0)
							; is there a matching tail there
							For j=0 To nofobjects-1
								If ObjectType(j)=46
		;							If Floor(ObjectX(j))=x+x2 And Floor(ObjectY(j))=y+y2 
										If ObjectData(j,0)=ObjectData(i,0) And ObjectData(j,1)=ObjectData(i,1) ;And ObjectData(j,3)=1
											ObjectData(j,3)=noftails+1-ObjectData(j,3)
		;										foundtail=True
		;										ObjectData(j,3)=noftails+1
		;										x=x+x2
		;										y=y+y2
		;										tailcount=tailcount+1
										EndIf
		;							EndIf
								EndIf
							Next
		;				EndIf
		;			Next
		;		Next
		;	Until foundtail=False
		EndIf
	

	EndIf
	x=ObjectTileX(i)
	y=ObjectTileY(i)

	If ObjectFrozen(i)>2
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		Return
	EndIf


	


	
	
	
	Select (ObjectData(i,2)+40) Mod 4
	Case 0
		dx=0
		dy=-1
	Case 1
		dx=1
		dy=0
	Case 2
		dx=0
		dy=1
	Case 3
		dx=-1
		dy=0
	End Select
	
	If ObjectData(i,4)=3 TurnobjectTowardDirection(i,dx,dy,20,180)
	
	If ObjectData(i,4)=4 ObjectYaw(i)=(ObjectYaw(i)+ObjectData(i,9)/10.0) Mod 360
	
	If objectMovementTimer(i)=0 
		size#=1.0
	Else
		size#=Float(1001-ObjectMovementTimer(i))/Float(1001)
		If size<0 Then size=0.0
		size=1.0-size
	EndIf
	If ObjectData(i,4)=4
		ObjectXScale(i)=1.5*size*(0.9+0.095*Sin((leveltimer*4) Mod 360))
		objectYScale(i)=1.5*size*(0.9+0.095*Sin((leveltimer*4) Mod 360))
		ObjectZScale(i)=1.5*size

	Else
		ObjectXScale(i)=size*(0.9+0.095*Sin((leveltimer*4) Mod 360))
		objectYScale(i)=size*(0.9+0.095*Sin((leveltimer*4) Mod 360))
		ObjectZScale(i)=size
	EndIf
	
	If ObjectActive(i)=1001 And ObjectData(i,5)=0
		
		
			
		
			; standing
			If ObjectMovementTimer(i)=0
				

				ObjectData(i,7)=ObjectData(i,7)-1
				If ObjectData(i,7)<=0
					; time to move
					
					ObjectData(i,7)=ObjectData(i,6)
					ActivateConveyor(i)
					
					
					
				
				EndIf
			EndIf

		
		
		
	EndIf
End Function


Function ActivateConveyor(i)

	x=ObjectTileX(i)
	y=ObjectTileY(i)

	Select (ObjectData(i,2)+40) Mod 4
	Case 0
		dx=0
		dy=-1
	Case 1
		dx=1
		dy=0
	Case 2
		dx=0
		dy=1
	Case 3
		dx=-1
		dy=0
	End Select


	movedflag=False
		; figure out direction
		If (LevelTileLogic(x+dx,y+dy)=2 Or LevelTileLogic(x+dx,y+dy)=5) And (ObjectTileLogic(x+dx,y+dy)=0 Or ObjectTileLogic(x+dx,y+dy)=2^4)
			; yep - go!
			
			MoveConveyorToTile(i,x,y,dx,dy,ObjectData(i,2))

			movedflag=True
		Else 
			; turn?
			olddir=ObjectData(i,2)
			If ObjectData(i,3)=0
				; pref direction left
				ObjectData(i,2)=(ObjectData(i,2)+3) Mod 4
				Select (ObjectData(i,2)+40) Mod 4
				Case 0
					dx=0
					dy=-1
				Case 1
					dx=1
					dy=0
				Case 2
					dx=0
					dy=1
				Case 3
					dx=-1
					dy=0
				End Select
				If (LevelTileLogic(x+dx,y+dy)=2 Or LevelTileLogic(x+dx,y+dy)=5) And (ObjectTileLogic(x+dx,y+dy)=0 Or ObjectTileLogic(x+dx,y+dy)=2^4)

					; yep - go!
			
					MoveConveyorToTile(i,x,y,dx,dy,olddir)

					movedflag=True
				Else
					; try right
					ObjectData(i,2)=(olddir+1) Mod 4
					Select (ObjectData(i,2)+40) Mod 4
					Case 0
						dx=0
						dy=-1
					Case 1
						dx=1
						dy=0
					Case 2
						dx=0
						dy=1
					Case 3
						dx=-1
						dy=0
					End Select
					If (LevelTileLogic(x+dx,y+dy)=2 Or LevelTileLogic(x+dx,y+dy)=5) And (ObjectTileLogic(x+dx,y+dy)=0 Or ObjectTileLogic(x+dx,y+dy)=2^4)

						; yep - go!
				
						MoveConveyorToTile(i,x,y,dx,dy,olddir)

						movedflag=True
					EndIf
				EndIf
				If movedflag=False
					ObjectData(i,2)=olddir
				EndIf
			Else
				; pref direction right
				ObjectData(i,2)=(ObjectData(i,2)+1) Mod 4
				Select (ObjectData(i,2)+40) Mod 4
				Case 0
					dx=0
					dy=-1
				Case 1
					dx=1
					dy=0
				Case 2
					dx=0
					dy=1
				Case 3
					dx=-1
					dy=0
				End Select
				If (LevelTileLogic(x+dx,y+dy)=2 Or LevelTileLogic(x+dx,y+dy)=5) And (ObjectTileLogic(x+dx,y+dy)=0 Or ObjectTileLogic(x+dx,y+dy)=2^4)

					; yep - go!
			
					MoveConveyorToTile(i,x,y,dx,dy,olddir)

					movedflag=True
				Else
					; try left
					ObjectData(i,2)=(olddir+3) Mod 4
					Select (ObjectData(i,2)+40) Mod 4
					Case 0
						dx=0
						dy=-1
					Case 1
						dx=1
						dy=0
					Case 2
						dx=0
						dy=1
					Case 3
						dx=-1
						dy=0
					End Select
					If (LevelTileLogic(x+dx,y+dy)=2 Or LevelTileLogic(x+dx,y+dy)=5) And (ObjectTileLogic(x+dx,y+dy)=0 Or ObjectTileLogic(x+dx,y+dy)=2^4)

						; yep - go!
				
						MoveConveyorToTile(i,x,y,dx,dy,olddir)
						movedflag=True
					EndIf
				EndIf
				If movedflag=False
					ObjectData(i,2)=olddir
				EndIf



				
			EndIf
			
		EndIf
					
End Function

Function MoveConveyorToTile(i,x,y,dx,dy,olddir)



	MoveObjectToTile(i,x+dx,y+dy)
	Leveltilelogic(x+dx,y+dy)=4	
	; create new tail
	CreateConveyorTail(i,x,y,dx,dy,olddir)	
	
	
	
	; and go through all other conveyor tails - decrease them
	For j=0 To nofobjects-1
		If ObjectType(j)=46
			If ObjectData(j,0)=ObjectData(i,0) And ObjectData(j,1)=ObjectData(i,1) And (ObjectActive(j) Mod 2 = 1)
				; matching colours
				ObjectData(j,3)=ObjectData(j,3)-1
				If ObjectData(j,3)<=0
					; all done - disappear
					
					LevelTileLogic(ObjectTileX(j),ObjectTileY(j))=ObjectData(j,8)
					MoveObjectToTile(j,ObjectTileX(j)+ObjectData(j,6),ObjectTileY(j)+ObjectData(j,7))
					DeActivateObject(j)
					
				EndIf
			EndIf
		EndIf
	Next
					
	
	
End Function

Function CreateConveyorTail(parent,x,y,dx,dy,olddir)

	i=CreateNewObject()
	
	ObjectModelName$(i)="!Conveyor"
	ObjectTextureName$(i)="!None"
	If ObjectData(parent,4)=4
		ObjectEntity(i)=CreateCloudMesh(.7,ObjectData(parent,0))
	Else
		ObjectEntity(i)=CreateTransporterMesh(ObjectData(Parent,0),ObjectData(Parent,4))
		ObjectXScale(i)=.8
		ObjectYScale(i)=.8
	EndIf
	ObjectX(i)=x+0.5
	ObjectY(i)=y+0.5
	ObjectTileX(i)=x
	ObjectTileY(i)=y
	ObjectID(i)=-1
	ObjectType(i)=46
	ObjectActive(i)=1001
	ObjectActivationType(i)=2
	ObjectActivationSpeed(i)=20
	ObjectMovementSpeed(i)=20
	ObjectYaw(i)=ObjectYaw(parent)
	ObjectChild(i)=-1
	ObjectParent(i)=-1
	ObjectData(i,0)=ObjectData(parent,0)
	ObjectData(i,1)=ObjectData(parent,1)
	ObjectData(i,2)=ObjectData(parent,2)
	ObjectData(i,3)=ObjectData(parent,9) ; tail length
	ObjectData(i,4)=ObjectData(parent,4)
	ObjectData(i,5)=ObjectData(parent,5)
	ObjectData(i,6)=dx
	ObjectData(i,7)=dy
	ObjectData(i,8)=ObjectData(parent,8)
	ObjectData(i,9)=Rand(-5,5)
	ObjectActivationSpeed(i)=60
	ObjectDestructionType(i)=1
		ObjectID(i)=500+ObjectData(i,0)*5+ObjectData(i,1)

	If ObjectData(i,4)=3	ObjectYaw(i)=-90*olddir
	

	If ObjectData(i,4)=4
		ObjectXScale(i)=1.5*(0.9+0.095*Sin((leveltimer*4) Mod 360))
		objectYScale(i)=1.5*(0.9+0.095*Sin((leveltimer*4) Mod 360))

	
	Else
		ObjectXScale(i)=1*(0.9+0.095*Sin((leveltimer*4) Mod 360))
		objectYScale(i)=1*(0.9+0.095*Sin((leveltimer*4) Mod 360))
	EndIf
	


End Function

Function ControlConveyorTail(i)
	
	
	
	If objectactive(i)=1001 
	
	
			
	
		Select (ObjectData(i,2)+40) Mod 4
		Case 0
			dx=0
			dy=-1
		Case 1
			dx=1
			dy=0
		Case 2
			dx=0
			dy=1
		Case 3
			dx=-1
			dy=0
		End Select
		
		If ObjectData(i,4)=3 TurnobjectTowardDirection(i,dx,dy,6,180)
		If ObjectData(i,4)=4 ObjectYaw(i)=(ObjectYaw(i)+ObjectData(i,9)/10.0) Mod 360
	
		If ObjectData(i,4)=4
			ObjectXScale(i)=1.5*(0.9+0.095*Sin((leveltimer*4) Mod 360))
			objectYScale(i)=1.5*(0.9+0.095*Sin((leveltimer*4) Mod 360))
	
		
		Else
			ObjectXScale(i)=.8*(0.9+0.095*Sin((leveltimer*4) Mod 360))
			objectYScale(i)=.8*(0.9+0.095*Sin((leveltimer*4) Mod 360))
		EndIf

		
		
		ObjectZScale(i)=1
	EndIf
	
	If objectactive(i)=0 Then ObjectExists(i)=False	

		


End Function

Function CreateCloudMesh(bigr#,col)

	Select col
	Case 0
		red=255
		green=0
		blue=0
	Case 1
		red=255
		green=128
		blue=0
	Case 2
		red=255
		green=255
		blue=100
	Case 3
		red=0
		green=255
		blue=0
	Case 4
		red=0
		green=255
		blue=255
	Case 5
		red=0
		green=0
		blue=255
	Case 6
		red=255
		green=0
		blue=255
	Default
		red=255
		green=255
		blue=255
	End Select





	
	Entity=CreateMesh()
	Surface=CreateSurface(Entity)
	
	
	
	r#=.4*bigr
	angle=0;Rand(0,359)
	
	AddVertex (surface,r*Cos(angle+135),0.01,r*Sin(angle+135),0,0)
	AddVertex (surface,r*Cos(angle+45),0.01,r*Sin(angle+45),1,0)
	AddVertex (surface,r*Cos(angle+225),0.01,r*Sin(angle+225),0,1)
	AddVertex (surface,r*Cos(angle+315),0.01,r*Sin(angle+315),1,1)

	
	
	AddTriangle (surface,0,1,2)
	AddTriangle (surface,1,3,2)
	
	r#=.3*bigr
	angle=Rand(0,359)
	
	AddVertex (surface,r*Cos(angle+135),0.01,r*Sin(angle+135),0,0)
	AddVertex (surface,r*Cos(angle+45),0.01,r*Sin(angle+45),1,0)
	AddVertex (surface,r*Cos(angle+225),0.01,r*Sin(angle+225),0,1)
	AddVertex (surface,r*Cos(angle+315),0.01,r*Sin(angle+315),1,1)

	AddTriangle (surface,4,5,6)
	AddTriangle (surface,5,7,6)


	r#=.2*bigr
	angle=Rand(0,359)
	
	AddVertex (surface,r*Cos(angle+135),0.01,r*Sin(angle+135),0,0)
	AddVertex (surface,r*Cos(angle+45),0.01,r*Sin(angle+45),1,0)
	AddVertex (surface,r*Cos(angle+225),0.01,r*Sin(angle+225),0,1)
	AddVertex (surface,r*Cos(angle+315),0.01,r*Sin(angle+315),1,1)

	AddTriangle (surface,8,9,10)
	AddTriangle (surface,9,11,10)



	UpdateNormals Entity
	
	EntityTexture Entity,CloudTexture
	EntityColor Entity,red,green,blue
	EntityAlpha Entity,.8
	EntityFX Entity,1
	Return Entity


End Function
Function RedoTransporterTexture(i)
	
	Surface=GetSurface(ObjectEntity(i),1)
	tex=(ObjectID(i)-500)/5
	; 5 Sides
	For j=0 To 0 
		VertexTexCoords surface,j*8+4,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51
		VertexTexCoords surface,j*8+5,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51
		VertexTexCoords surface,j*8+6,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51+.115
		VertexTexCoords surface,j*8+7,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51+.115
	
	Next
	
	UpdateNormals ObjectEntity(i)
	
	
	
	

End Function

Function ControlRTWKaboom(i)


	If ObjectFrozen(i)=1
		ObjectFrozen(i)=1000

		ObjectPitch(i)=Rand(-30,30)
		ObjectRoll(i)=Rand(-30,30)
		ObjectZ(i)=.3
		AnimateMD2 ObjectEntity(i),0,.01,1,2
		ObjectCurrentAnim(i)=0

	
	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		ObjectPitch(i)=0
		ObjectRoll(i)=0
		ObjectZ(i)=0
	EndIf
	If ObjectFrozen(i)>2
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		Return
	EndIf


	
	If ObjectTileTypeCollision(i)=0
		ObjectYawAdjust(i)=0
		ObjectMovementSpeed(i)=35
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectObjectTypeCollision(i)=2^1+2^3
		ObjectTileTypeCollision(i) =2^0+2^9+2^10+2^11+2^12
		ObjectMovementType(i)=41+ObjectData(i,0)*2+ObjectData(i,1)
		CreateShadow(i,.9)
	EndIf
	For j=0 To NofObjects-1
		If ObjectFrozen(j)<10000 And (ObjectX(i)-ObjectX(j))^2+(ObjectY(i)-ObjectY(j))^2 <1.4 And ObjectExists(j)=True And ObjectActive(j)>0
			If ObjectType(j)=1 Or ObjectType(j)=110 Or ObjectType(j)=120 Or ObjectType(j)=390 Or ObjectType(j)=400 Or ObjectType(j)=241 Or ObjectType(j)=470
				DestroyObject(i,0)
				DestroyObject(j,1)
			EndIf
		EndIf
	Next
		
	dx=0
	dy=0
	If ObjectMovementType(i)=41 Or ObjectMovementType(i)=42
		dy=-1
	Else If ObjectMovementType(i)=43 Or ObjectMovementType(i)=44
		dx=1
	Else If ObjectMovementType(i)=45 Or ObjectMovementType(i)=46
		dy=1
	Else If ObjectMovementType(i)=47 Or ObjectMovementType(i)=48
		dx=-1
	EndIf
	TurnObjectTowardDirection(i,-dx,-dy,4,0)
	
	If ObjectStatus(i)=0
		; walking
		If ObjectZ(i)<>0 Then ObjectZ(i)=0
		If ObjectMovementTImer(i)>0
			ObjectData(i,9)=0
			If objectcurrentanim(i)<>1
				AnimateMD2 ObjectEntity(i),1,1,1,30
				ObjectCurrentAnim(i)=1
			EndIf
		EndIf
		If objectcurrentanim(i)=1 And Objectmovementtimer(i)=0
			ObjectData(i,9)=ObjectData(i,9)+1
			If ObjectData(i,9)=5
				AnimateMD2 ObjectEntity(i),0,.01,1,2
				ObjectCurrentAnim(i)=0
				DestroyObject(i,0)

			EndIf
		EndIf
		
	EndIf

	

	
End Function

Function ControlTurtle(i)


	If ObjectFrozen(i)=1
		ObjectFrozen(i)=1000

		ObjectPitch(i)=Rand(-30,30)
		ObjectRoll(i)=Rand(-30,30)
		ObjectZ(i)=.3
		AnimateMD2 ObjectEntity(i),0,.01,1,2
		ObjectCurrentAnim(i)=0

	
	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		ObjectPitch(i)=0
		ObjectRoll(i)=0
		ObjectZ(i)=0
	EndIf
	If ObjectFrozen(i)>2
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		Return
	EndIf


	
	If ObjectTileTypeCollision(i)=0
		ObjectYawAdjust(i)=0
		ObjectMovementSpeed(i)=25
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileTypeCollision(i)=2^0+2^2+2^3+2^4+2^9+2^10+2^11+2^12+2^14
		ObjectObjectTypeCollision(i)=2^6
		ObjectMovementType(i)=41+ObjectData(i,0)*2+ObjectData(i,1)
		CreateShadow(i,.9)
	EndIf
		
		
	dx=0
	dy=0
	If ObjectMovementType(i)=41 Or ObjectMovementType(i)=42
		dy=-1
	Else If ObjectMovementType(i)=43 Or ObjectMovementType(i)=44
		dx=1
	Else If ObjectMovementType(i)=45 Or ObjectMovementType(i)=46
		dy=1
	Else If ObjectMovementType(i)=47 Or ObjectMovementType(i)=48
		dx=-1
	EndIf
	TurnObjectTowardDirection(i,-dx,-dy,4,0)
	
	If ObjectStatus(i)=0
		; walking
		If ObjectZ(i)<>0 Then ObjectZ(i)=0
		If ObjectMovementTImer(i)>0
			ObjectData(i,9)=0
			If objectcurrentanim(i)<>1
				AnimateMD2 ObjectEntity(i),1,1,1,30
				ObjectCurrentAnim(i)=1
			EndIf
		EndIf
		If objectcurrentanim(i)=1 And Objectmovementtimer(i)=0
			ObjectData(i,9)=ObjectData(i,9)+1
			If ObjectData(i,9)=5
				AnimateMD2 ObjectEntity(i),0,.01,1,2
				ObjectCurrentAnim(i)=0

			EndIf
		EndIf
		
	EndIf
	If ObjectStatus(i)=1
		; swimming
		If ObjectZ(i)>-.6 Then ObjectZ(i)=ObjectZ(i)-.1
		If objectcurrentanim(i)<>3
			AnimateMD2 ObjectEntity(i),1,.1,1,30
			ObjectCurrentAnim(i)=3
		EndIf
		
	EndIf
	If ObjectStatus(i)=2

		; stopped swimming
		If ObjectZ(i)<-.20 Then ObjectZ(i)=ObjectZ(i)+.05
		If ObjectZ(i)>-.25 Then ObjectZ(i)=ObjectZ(i)-.05
		LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=0
		
	EndIf

	

	
End Function

Function ControlFireFlower(i)

	If ObjectFrozen(i)=1
		; freeze
		ObjectFrozen(i)=1000

		AnimateMD2 ObjectEntity(i),3,.5,61,67,1
	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		AnimateMD2 ObjectEntity(i),1,.2,1,20,1
		ObjectTimer(i)=ObjectTimerMax1(i)
		ObjectData(i,2)=0
		

	EndIf
	If ObjectFrozen(i)>2
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		
		Return
	EndIf
	


	If ObjectData(i,3)>ObjectData(i,4)
		; set backup hitpoints
		ObjectData(i,4)=ObjectData(i,3)
	EndIf
	If ObjectData(i,3)<ObjectData(i,4)
		; uhoh - was hit!
		PlaySoundFX(104,ObjectTIleX(i),ObjectTIleY(i))

		ObjectTimer(i)=ObjectTimerMax1(i)+30
		AnimateMD2 ObjectEntity(i),3,1,61,88,1
		ObjectData(i,2)=2
		ObjectData(i,4)=ObjectData(i,3)
	EndIf

	If (ObjectTimer(i)>=0 And ObjectData(i,2)=0) Or (ObjectData(i,2)=2 And ObjectTimer(i)=ObjectTimerMax1(i))
		ObjectData(i,2)=1
		AnimateMD2 ObjectEntity(i),1,.2,1,20,1
	EndIf
	
	If ObjectActive(i)<1001
		ObjectTimer(i)=ObjectTimerMax1(i)
	EndIf

	ObjectTimer(i)=ObjectTimer(i)-1
	ObjectData(i,0)=(ObjectData(i,0)+80) Mod 8
	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))
	ObjectYawAdjust(i)=0
	
	
	x=ObjectTileX(i)
	y=ObjectTileY(i)
	If ObjectActive(i)>0 And ObjectLastActive(i)=0 And (WAEpisode<>1 Or AdventureCurrentNumber<>70) Then PlaySoundFX(102,ObjectTIleX(i),ObjectTIleY(i))
	If (ObjectTileLogic(x,y) And 2^7) =0 And ObjectActive(i)>0
		; activate
		
		ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^7
	EndIf
	If (ObjectTileLogic(x,y) And 2^7) =2^7 And ObjectActive(i)=0
		; deactivate
		ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^7
	EndIf
	
	dx#=0
	dy#=0
	If ObjectSubType(i)=1
		; follow player
		dx=ObjectX(PlayerObject)-ObjectX(i)
		dy=ObjectY(PlayerObject)-ObjectY(i)
		total#=Sqr(dx^2+dy^2)
		dx=dx/total
		dy=dy/total
		
	Else
		; turn or static
		If ObjectData(i,0)>0 And ObjectData(i,0)<4
			dx=1
		EndIf
		If ObjectData(i,0)>4
			dx=-1
		EndIf
		If ObjectData(i,0)<2 Or ObjectData(i,0)>6
			dy=-1
		EndIf
		If ObjectData(i,0)>2 And ObjectData(i,0)<6
			dy=1
		EndIf
	EndIf
	If ObjectTimer(i)>-10
		TurnObjectTowardDirection(i,dx,dy,3,180)
	EndIf
	
	If ObjectTimer(i)<0
	
		If ObjectTimer(i)=-10
			; aquire target now
			ObjectData(i,8)=dx*10000
			ObjectData(i,9)=dy*10000
		EndIf
		If ObjectData(i,2)=1
			AnimateMD2 ObjectEntity(i),1,.5,21,60,1
			ObjectData(i,2)=0
		EndIf
	
		If ObjectTimer(i)=-80
			ObjectTimer(i)=ObjectTimerMax1(i)
		EndIf
		
		; and fire
		If ObjectTimer(i)=-60
			dx#=Float(ObjectData(i,8))/10000.0
			dy#=Float(ObjectData(i,9))/10000.0
			
				CreateSpellBall(ObjectTileX(i)+.5+.6*dx,ObjectTileY(i)+.5+.6*dy,1.1,.1*dx,.1*dy,1-ObjectData(i,1),-1,-1,False,300)
				
			PlaySoundFX(103,ObjectTIleX(i),ObjectTIleY(i))

			If ObjectSubType(i)=2
				ObjectData(i,0)=(ObjectData(i,0)+1) Mod 8
			EndIf
			If ObjectSubType(i)=3
				ObjectData(i,0)=(ObjectData(i,0)-1) Mod 8
			EndIf

		EndIf

		
	EndIf


End Function

Function ControlChomper(i)

	; check if biting someone
		For j=0 To NofObjects-1
				If ObjectType(j)=1 Or ObjectType(j)=120 Or ObjectType(j)=400
					If (ObjectX(i)-ObjectX(j))^2+(ObjectY(i)-ObjectY(j))^2<.5
						DestroyObject(j,0)
					EndIf
				EndIf
		Next

	If ObjectFrozen(i)=1
		; freeze
		ObjectFrozen(i)=1000

		AnimateMD2 ObjectEntity(i),0,.01,1,2

		ObjectPitch(i)=Rand(-30,30)
		ObjectRoll(i)=Rand(-30,30)
		ObjectZ(i)=.3

		PlaySoundFX(86,ObjectX(i),ObjectY(i))

	
	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		AnimateMD2 ObjectEntity(i),1,.6,1,29
		ObjectPitch(i)=0
		ObjectRoll(i)=0
		ObjectZ(i)=0
	EndIf
	If ObjectFrozen(i)>2
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		
		Return
	EndIf

	
	If ObjectTileTypeCollision(i)=0
	;	ObjectZ(i)=.5
		AnimateMD2 ObjectEntity(i),1,.6,1,29
		ObjectYawAdjust(i)=0
		ObjectMovementSpeed(i)=20+5*ObjectData(i,0)
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileTypeCollision(i)=2^0+2^3+2^4+2^9+2^10+2^11+2^12+2^14
		ObjectObjectTypeCollision(i)=2^1+2^3+2^6
		ObjectMovementType(i)=13
		If ObjectData(i,1)=1
			ObjectObjectTypeCollision(i)=2^1+2^6+2^4
			EntityBlend ObjectEntity(i),3
			
		EndIf
		If objectData(i,1)=2
			EntityFX ObjectEntity(i),1
		EndIf
	EndIf
	
	
	If ObjectData(i,1)=1
		If leveltimer Mod 360<180
			EntityAlpha ObjectEntity(i),Abs(Sin(LevelTimer Mod 360))
		Else
			EntityAlpha ObjectEntity(i),0.3*Abs(Sin(LevelTimer Mod 360))

		EndIf
	EndIf
	
	ObjectMoveXGoal(i)=ObjectTileX2(PlayerObject)
	ObjectMoveYGoal(i)=ObjectTileY2(PlayerObject)
	
	If ObjectMovementTimer(i)>0
		TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),3,180)
	Else
		TurnObjectTowardDirection(i,ObjectTileX(PlayerObject)-ObjectTileX(i),ObjectTileY(PlayerObject)-ObjectTileY(i),1,180)
	EndIf
	
	If ObjectMovementTimer(i)>0 And ObjectData10(i)=0
		If ObjectData(i,1)=3
			PlaySoundFX(119,ObjectX(i),ObjectY(i))

		Else
			PlaySoundFX(101,ObjectX(i),ObjectY(i))
		EndIf
	EndIf
	
	ObjectData10(i)=ObjectMovementTimer(i)
	

	
	
		
End Function


Function ControlBowler(i)

	; check if on someone
	For j=0 To NofObjects-1
		
				If ObjectType(j)=1 Or ObjectType(j)=120 Or ObjectType(j)=110 Or Floor(ObjectType(j)/10)=24 Or ObjectType(j)=400 Or ObjectType(j)=390
					If (ObjectX(i)-ObjectX(j))^2+(ObjectY(i)-ObjectY(j))^2<.5
						DestroyObject(j,0)
					EndIf
				EndIf
	Next

	If ObjectFrozen(i)=1
	
		ObjectFrozen(i)=1000

		ObjectPitch(i)=Rand(-30,30)
		ObjectRoll(i)=Rand(-30,30)
		ObjectZ(i)=.3
	

	
	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		ObjectPitch(i)=0
		ObjectRoll(i)=0
		ObjectZ(i)=0
	EndIf
	If ObjectFrozen(i)>2
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		
		Return
	EndIf


	
	If ObjectTileTypeCollision(i)=0
		ObjectData(i,0)=ObjectData(i,0) Mod 8
		ObjectYawAdjust(i)=0
		ObjectMovementSpeed(i)=25+5*ObjectData(i,2)
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileTypeCollision(i)=2^0+2^2+2^3+2^4+2^9+2^10+2^11+2^12+2^14
		ObjectObjectTypeCollision(i)=2^1+2^2+2^3+2^6+2^9
		If ObjectData(i,1)=0 Or ObjectData(i,1)=1
			; zbot movement
			ObjectMovementType(i)=41+ObjectData(i,0)*2+ObjectData(i,1)
		Else If ObjectData(i,1)=2
			; bounce movement
			ObjectMovementType(i)=71+ObjectData(i,0)
			
		EndIf
	EndIf
		
		
	dx=ObjectTileX2(i)-ObjectTileX(i)
	dy=ObjectTileY2(i)-ObjectTileY(i)
	If dx<>0 Or dy<>0 Then TurnObjectTowardDirection(i,dx,dy,4,180)
	
	ObjectPitch2(i)=(ObjectPitch2(i)+Rnd(3,5)) Mod 360
	ObjectZ(i)=.4+.4*Sin((Leveltimer*4) Mod 180)
	If leveltimer Mod 45 =0
		PlaySoundFX(109,ObjectTileX(i),ObjectTileY(i))
	EndIf
	
	


	
End Function

Function ControlButterfly(i)
	
	
	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))
	If ObjectTileTypeCollision(i)=0
		ObjectTileTypeCollision(i)=-1 ; not really used
		
		If ObjectModelName$(i)="!Busterfly"

			ObjectXScale(i)=.01
			ObjectYScale(i)=.01
			ObjectZScale(i)=.01
			ObjectRoll2(i)=90
			
			
			
			AnimateMD2 ObjectEntity(i),2,.4,2,9
		Else
			EntityBlend ObjectEntity(i),3
		EndIf
		
		ObjectMoveXGoal(i)=ObjectTileX(i)
		ObjectMoveYGoal(i)=ObjectTileY(i)
		
		ObjectData(i,1)=Rand(0,360)
			ObjectData(i,2)=Rand(1,4)
		
		
	EndIf
	
	If ObjectTIleX(i)=ObjectMoveXGoal(i) And ObjectTileY(i)=ObjectMoveYGoal(i)
		If Rand(0,100)<30
			ObjectData(i,3)=Rand(-1,1)
			ObjectData(i,4)=Rand(-1,1)
		EndIf
		x=ObjectTileX(i)+ObjectData(i,3)
		y=ObjectTileY(i)+ObjectData(i,4)
		If x>=0 And y>=0 And x<LevelWidth And y<LevelHeight
			If (LevelTileLogic(x,y)=0) And ObjectTileLogic(x,y)=0
				If (LevelTileLogic(ObjectTileX(i),y)=0 Or LevelTileLogic(ObjectTileX(i),y)=2 Or LevelTileLogic(ObjectTileX(i),y)=4) And ObjectTileLogic(ObjectTileX(i),y)=0
					If (LevelTileLogic(x,ObjectTileY(i))=0 Or LevelTileLogic(x,ObjectTileY(i))=2 Or LevelTileLogic(x,ObjectTileY(i))=4) And ObjectTileLogic(x,ObjectTileY(i))=0
 
						ObjectMoveXGoal(i)=x
						ObjectMoveYGoal(i)=y
					EndIf
				EndIf
			EndIf
		EndIf
	EndIf
	
	If ObjectX(i)<ObjectMoveXGoal(i)+.5 And ObjectDX(i)<.015
		ObjectDX(i)=ObjectDX(i)+.001
	EndIf
	If ObjectX(i)>ObjectMoveXGoal(i)+.5 And ObjectDX(i)>-.015
		ObjectDX(i)=ObjectDX(i)-.001
	EndIf
	If ObjectY(i)<ObjectMoveYGoal(i)+.5 And ObjectDY(i)<.015
		ObjectDY(i)=ObjectDY(i)+.001
	EndIf
	If ObjectY(i)>ObjectMoveYGoal(i)+.5 And ObjectDY(i)>-.015
		ObjectDY(i)=ObjectDY(i)-.001
	EndIf
	
	ObjectX(i)=ObjectX(i)+ObjectDX(i)
	ObjectY(i)=ObjectY(i)+ObjectDY(i)
	
	
	

	If ObjectModelName$(i)="!Busterfly"
		zz#=.2*Sin((ObjectData(i,2)*(Leveltimer+ObjectData(i,1))) Mod 360)
		TurnObjectTowardDirection(i,ObjectDX(i),ObjectDY(i),2,90)
		ObjectZ(i)=.4+zz
	Else
		zz#=.2*Sin(((Leveltimer+ObjectData(i,1))) Mod 360)
		ObjectZ(i)=.4+zz
		size#=.4+2*zz
		If size<0 Then size=0

		ObjectXScale(i)=size
		ObjectYScale(i)=size
		ObjectZScale(i)=size
		If leveltimer Mod 4=1		AddParticle(Rand(24,30),ObjectX(i)-3*ObjectDX(i),ObjectZ(i),-ObjectY(i)+3*ObjectDY(i),0,.3*size,0,0.00,0,3,0,0,0,0,15,3)



	EndIf
;	ObjectYaw(i)=ObjectYaw(i)+1
End Function

Function ControlZipper(i)

	

	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))
	If ObjectData(i,0)=-1 Then ObjectData(i,0)=Leveltiletexture(ObjectTileX(i),ObjectTileY(i))
	
	
	
	If ObjectTileTypeCollision(i)=0
		ObjectTileTypeCollision(i)=-1 ; not really used
		
		
		EntityBlend ObjectEntity(i),3
		
		
		ObjectMoveXGoal(i)=ObjectTileX(i)
		ObjectMoveYGoal(i)=ObjectTileY(i)
		
		ObjectData(i,1)=Rand(0,360)
		ObjectData(i,2)=Rand(1,4)
		
		
	EndIf
	
	
	

	xx#=ObjectX(i)-Floor(ObjectX(i))
	yy#=Objecty(i)-Floor(Objecty(i))
	If ObjectTIleX(i)=ObjectMoveXGoal(i) And ObjectTileY(i)=ObjectMoveYGoal(i) And xx>.45 And xx<.55 And yy>.45 And yy<.55
	
		flag=False
		; first check current direction
		If (ObjectDX(i)<>0 Or ObjectDY(i)<>0) And Rand(0,20)>0
			x=ObjectTileX(i)+ObjectDX(i)
			y=ObjectTileY(i)+ObjectDY(i)	

			
			
			If x>=0 And y>=0 And x<LevelWidth And y<LevelHeight
				If (LevelTileTexture(x,y)=objectdata(i,0))
					
					ObjectMoveXGoal(i)=x
					ObjectMoveYGoal(i)=y
					flag=True	
				EndIf
			EndIf
		EndIf
		
		If flag=False
	
	
	
			ObjectDX(i)=0
			ObjectDY(i)=0
	
			If Rand(0,100)<50
				ObjectDx(i)=Rand(-1,1)
			Else
				ObjectDy(i)=Rand(-1,1)
			EndIf
	
			x=ObjectTileX(i)+ObjectDX(i)
			y=ObjectTileY(i)+ObjectDY(i)	
	
			flag=False
			
			If x>=0 And y>=0 And x<LevelWidth And y<LevelHeight
				If (LevelTileTexture(x,y)=objectdata(i,0))
					
					ObjectMoveXGoal(i)=x
					ObjectMoveYGoal(i)=y
					flag=True	
				EndIf
			EndIf
			
			If flag=False
				ObjectDX(i)=0
				ObjectDY(i)=0
			EndIf
		EndIf
	EndIf
	
	
		
		
		ObjectX(i)=ObjectX(i)+ObjectDX(i)*.05
		ObjectY(i)=ObjectY(i)+ObjectDY(i)*.05

	
	
	

	
		;zz#=.05*Sin(((Leveltimer+ObjectData(i,1))) Mod 360)
		ObjectZ(i)=0
		size#=.7+.1*Sin(leveltimer Mod 360) 
		If size<0 Then size=0

		ObjectXScale(i)=size
		ObjectYScale(i)=size
		ObjectZScale(i)=size
		If leveltimer Mod 4=1		AddParticle(Rand(24,30),ObjectX(i),ObjectZ(i),-ObjectY(i),0,.4*size,0,0.00,0,3,0,0,0,0,25,3)




End Function

Function ControlSpring(i)
	ObjectYawAdjust(i)=0
	ObjectZ(i)=.5
	ObjectData(i,2)=(ObjectData(i,2)+80) Mod 8
	ObjectID(i)=500+ObjectData(i,0)*5+ObjectData(i,1)
	; Check if an object is in front of it
	dx=0
	dy=0
	If ObjectData(i,2)>=1 And ObjectData(i,2)<=3 dx=1
	If ObjectData(i,2)>=5 And ObjectData(i,2)<=7 dx=-1
	If ObjectData(i,2)>=3 And ObjectData(i,2)<=5 dy=1
	If ObjectData(i,2)<=1 Or ObjectData(i,2)>=7 dy=-1
	x=Floor(ObjectX(i))
	y=Floor(ObjectY(i))
	
	turnobjecttowarddirection(i,dx,dy,10,180)

	For j=0 To NofObjects-1
		If ObjectButtonPush(j)=True And ObjectMovementTimer(j)=0
			If ObjectTileX(j)=x+dx And ObjectTileY(j)=y+dy And ObjectDead(j)=0 And ObjectExists(j)=True
				; got it
					; check if it can fly in that direction (one step)
					OldTile=ObjectTileTypeCollision(j)
					If (ObjectTileTypeCollision(j) And 4)=0 Then ObjectTileTypeCollision(j)=ObjectTileTypeCollision(j)+4 ; add water and lava
					If CanObjectMoveToTile(j,x+2*dx,y+2*dy,True,True)=True
						ObjectFlying(j)=10+ObjectData(i,2)
					Else
						DestroyObject(j,0)
					EndIf
					
					ObjectData(i,4)=30
					ObjectTileTypeCollision(j)=OldTile
					
					PlaySoundFX(10,ObjectTileX(i),ObjectTileY(i))
				
			EndIf
		EndIf
	Next
	
	If ObjectData(i,4)>0
		ObjectData(i,4)=ObjectData(i,4)-1
		ObjectXAdjust(i)=dx*Float(ObjectData(i,4))/60.0
		ObjectYAdjust(i)=dy*Float(ObjectData(i,4))/60.0

	EndIf
	

	
End Function

Function CreateSuctubeMesh(tex,col,active)

	If active Mod 2 =1
		active=0
	Else
		active=1
	EndIf
	
	Entity=CreateMesh()
	Surface=CreateSurface(Entity)
	
	nofsegments#=16
	
	i=0
	angle#=-(360.0/nofsegments)/2.0+i*(360.0/nofsegments)
	; top triangle
	AddVertex (surface,-0.3,1.71,-0.3,(col Mod 8)*0.125+.01,(col/8)*0.125+.51+.25*active)
	AddVertex (surface,+0.3,1.71,-0.3,(col Mod 8)*0.125+.115,(col/8)*0.125+.51+.25*active)
	AddVertex (surface,0,1.71,+0.3,(col Mod 8)*0.125+.01,(col/8)*0.125+.51+.115+.25*active)
	;AddTriangle (surface,0,1,2)
	AddTriangle (surface,0,2,1)
	
	
	
	
	; point arrow
	If dir=0
		VertexCoords surface,0,-0.3,1.71,-0.3
		VertexCoords surface,1,+0.3,1.71,-0.3
		VertexCoords surface,2,0,1.71,+0.3
	Else
		VertexCoords surface,0,-0.3,1.71,+0.3
		VertexCoords surface,2,+0.3,1.71,+0.3
		VertexCoords surface,1,0,1.71,-0.3
	EndIf


	
	For i=0 To nofsegments-1
		angle#=-(360.0/nofsegments)/2.0+i*(360.0/nofsegments)
		AddVertex (surface,1.5*Sin(angle),0.7+1.0*Cos(angle),-0.505,0.25*tex,107.0/512.0)
		AddVertex (surface,1.5*Sin(angle),0.7+1.0*Cos(angle),+0.505,0.25*tex,88.0/512.0)
		AddVertex (surface,1.5*Sin(angle+(360.0/nofsegments)),0.7+1.0*Cos(angle+(360.0/nofsegments)),-0.505,0.25*tex+0.25,107.0/512.0)
		AddVertex (surface,1.5*Sin(angle+(360.0/nofsegments)),0.7+1.0*Cos(angle+(360.0/nofsegments)),+0.505,0.25*tex+0.25,88.0/512.0)

		;i=i+1 ; to account for the first four vertices
		AddTriangle(surface,i*4+0+3,i*4+1+3,i*4+2+3)
		AddTriangle(surface,i*4+1+3,i*4+3+3,i*4+2+3)
		
		AddTriangle(surface,i*4+2+3,i*4+1+3,i*4+0+3)
		AddTriangle(surface,i*4+2+3,i*4+3+3,i*4+1+3)
		;i=i-1
	Next
	

	

	UpdateNormals Entity
	
	EntityTexture Entity,GateTexture
	Return Entity
End Function

Function RedoSuctubeMesh(i)

	Surface=GetSurface(ObjectEntity(i),1)
	col=ObjectData(i,0) 
	If objectactive(i) Mod 2 = 1
		active=0
	Else
		active=1
	EndIf
	If ObjectYawAdjust(i)=(-90*ObjectData(i,2) +3600) Mod 360
		; in original position
		dir=0
	Else
		; switched from original
		dir=1
	EndIf
	
	; point arrow
	If dir=0
		VertexCoords surface,0,-0.3,1.71,-0.3
		VertexCoords surface,1,+0.3,1.71,-0.3
		VertexCoords surface,2,0,1.71,+0.3
	Else
		VertexCoords surface,0,-0.3,1.71,+0.3
		VertexCoords surface,2,+0.3,1.71,+0.3
		VertexCoords surface,1,0,1.71,-0.3
	EndIf
	
	; and give colour
	
	VertexTexCoords surface,0,(col Mod 8)*0.125+.01,(col/8)*0.125+.51+.25*active
	VertexTexCoords surface,1,(col Mod 8)*0.125+.115,(col/8)*0.125+.51+.25*active
	VertexTexCoords surface,2,(col Mod 8)*0.125+.051,(col/8)*0.125+.51+.115+.25*active

	UpdateNormals ObjectEntity(i)
	


End Function


Function ControlSuctube(i)
	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))
	ObjectID(i)=500+ObjectData(i,0)*5+ObjectData(i,1)
	; Check if an object is in front of it
	dx=0
	dy=0
	Select ObjectData(i,2)
	Case 0
		dy=1
	Case 1
		dx=-1
	Case 2
		dy=-1
	Case 3
		dx=1
	End Select
	
	
	x=Floor(ObjectX(i))
	y=Floor(ObjectY(i))
	
	; make walls left and right (only for standard sizes)
	If ObjectZAdjust(i)=0.0 And ObjectScaleAdjust(i)=1.0
		Select ObjectData(i,2)
		Case 0,2
			LevelTileLogic(x+1,y)=1
			LevelTileLogic(x-1,y)=1
		Case 1,3
			LevelTileLogic(x,y-1)=1
			Leveltilelogic(x,y+1)=1
		End Select
	EndIf
	
	If ObjectActive(i)<>1001 Then Return
	
	
	suck=True
	blow=True

	
	; check if sucking/blowing active (e.g. if another tube in front of it)
	For j=0 To NofObjects-1
		If ObjectType(j)=281 And i<>j
			; found another suctube
			If ObjectData(i,2)=ObjectData(j,2) And ObjectData(i,0)=ObjectData(j,0) And ObjectData(i,1)=ObjectData(j,1)
				; same direction
				If ObjectData(i,2)=0 
					If ObjectTileX(i)=ObjectTileX(j) And ObjectTileY(i)=ObjectTileY(j)-1
						suck=False
					EndIf
					If ObjectTileX(i)=ObjectTileX(j) And ObjectTileY(i)=ObjectTileY(j)+1
						blow=False
					EndIf
				Else If ObjectData(i,2)=1 
					If ObjectTileX(i)=ObjectTileX(j)+1 And ObjectTileY(i)=ObjectTileY(j)
						suck=False
					EndIf
					If  ObjectTileX(i)=ObjectTileX(j)-1 And ObjectTileY(i)=ObjectTileY(j)
						blow=False
					EndIf
				Else If ObjectData(i,2)=2 
					If ObjectTileX(i)=ObjectTileX(j) And ObjectTileY(i)=ObjectTileY(j)+1
						suck=False
					EndIf
					If ObjectTileX(i)=ObjectTileX(j) And ObjectTileY(i)=ObjectTileY(j)-1
						blow=False
					EndIf
				Else If ObjectData(i,2)=3 
					If ObjectTileX(i)=ObjectTileX(j)-1 And ObjectTileY(i)=ObjectTileY(j)
						suck=False
					EndIf
					If ObjectTileX(i)=ObjectTileX(j)+1 And ObjectTileY(i)=ObjectTileY(j)
						blow=False
					EndIf
				EndIf
			EndIf
		EndIf
	Next
	
	If ObjectData(i,5)=0
		; particle effects
		If Rand(0,100)<30
			psize#=Rnd(0.1,0.2)
			pspeed#=Rnd(1,2)
			parttex=Rand(16,23)
			If suck=True
				Select ObjectData(i,2)
				Case 0
					AddParticle(parttex,ObjectX(i)+Rnd(-1,1),Rnd(0.5,1.4),-ObjectY(i)-Rnd(1.0,1.9),0,psize,0.0,0.0,-Rnd(-0.01,-0.02)*pspeed,0,0,0,0,0,Rand(10,50),3)
		 		Case 1
					AddParticle(parttex,ObjectX(i)-Rnd(1.0,1.5),Rnd(0.5,1.4),-ObjectY(i)+Rnd(-1,1),0,psize,Rnd(0.01,0.02)*pspeed,0.0,0.0,0,0,0,0,0,Rand(10,50),3)
		 		Case 2
				;	AddParticle(0,0,Rnd(0.5,5.5),0,0,5,0.0,0.0,Rnd(-0.01,-0.02),0,0,0,0,0,Rand(10,50),3)
		
					AddParticle(parttex,ObjectX(i)+Rnd(-1,1),Rnd(0.5,1.4),-ObjectY(i)+Rnd(1.0,1.9),0,psize,0.0,0.0,Rnd(-0.01,-0.02)*pspeed,0,0,0,0,0,Rand(10,50),3)
		 		Case 3
					AddParticle(parttex,ObjectX(i)+Rnd(1.0,1.5),Rnd(0.5,1.4),-ObjectY(i)+Rnd(-1,1),0,psize,-Rnd(0.01,0.02)*pspeed,0.0,0.0,0,0,0,0,0,Rand(10,50),3)
		 		End Select
			EndIf
			If blow=True
				Select ObjectData(i,2)
				Case 0
					AddParticle(parttex,ObjectX(i)+Rnd(-1,1),Rnd(0.5,1.4),-ObjectY(i)+Rnd(0.0,0.5),0,psize,0.0,0.0,-Rnd(-0.01,-0.02)*pspeed,0,0,0,0,0,Rand(10,50),3)
		 		Case 1
					AddParticle(parttex,ObjectX(i)+Rnd(0,0.5),Rnd(0.5,1.4),-ObjectY(i)+Rnd(-1,1),0,psize,Rnd(0.01,0.02)*pspeed,0.0,0.0,0,0,0,0,0,Rand(10,50),3)
		 		Case 2
					AddParticle(parttex,ObjectX(i)+Rnd(-1,1),Rnd(0.5,1.4),-ObjectY(i)-Rnd(0.0,0.5),0,psize,0.0,0.0,Rnd(-0.01,-0.02)*pspeed,0,0,0,0,0,Rand(10,50),3)
		 		Case 3
					AddParticle(parttex,ObjectX(i)-Rnd(0.0,0.5),Rnd(0.5,1.4),-ObjectY(i)+Rnd(-1,1),0,psize,-Rnd(0.01,0.02)*pspeed,0.0,0.0,0,0,0,0,0,Rand(10,50),3)
		 		End Select
			EndIf
		EndIf
	EndIf
	
	
		


	For j=0 To NofObjects-1
		If ObjectButtonPush(j)=True And ObjectMovementTimer(j)=0
		
			; special case for submerged waterchomps
			If ObjectType(j)=250 And ObjectSubType(j)=1 And ObjectData(j,5)=1
			
			Else
				;suck 
				If ObjectTileX(j)=x+dx And ObjectTileY(j)=y+dy And ObjectDead(j)=0 And ObjectExists(j)=True
					; got it
					; (no checking if blocked)
					If ObjectFlying(j)=0 
						If ObjectData(i,4)=0
						 	PlaySoundFX(43,ObjectTileX(j),ObjectTileY(j))
					    Else
							;portal sound
							PlaySoundFX(80,ObjectTileX(j),ObjectTileY(j))
							PlaySoundFX(81,ObjectTileX(j),ObjectTileY(j))
							PlaySoundFX(82,ObjectTileX(j),ObjectTileY(j))
							PlaySoundFX(42,ObjectTileX(j),ObjectTileY(j))
							PlaySoundFX(43,ObjectTileX(j),ObjectTileY(j))

						EndIf

						
						If j=PlayerObject  And objectdata(i,4)=0
							If Rand(1,100)<70
								PlaySoundFX(Rand(180,182),ObjectTileX(j),ObjectTileY(j))
							Else
								PlaySoundFX(Rand(170,172),ObjectTileX(j),ObjectTileY(j))
							EndIf
						EndIf

								
					EndIf
					ObjectFlying(j)=10+ObjectData(i,2)*2
					
				EndIf
				;blow
				If ObjectTileX(j)=x-dx And ObjectTileY(j)=y-dy And ObjectDead(j)=0 And ObjectExists(j)=True
					; got it
					; check if it can fly in that direction (one step)
					OldTile=ObjectTileTypeCollision(j)
					If (ObjectTileTypeCollision(j) And 4)=0 Then ObjectTileTypeCollision(j)=ObjectTileTypeCollision(j)+4 ; add water and lava
					If (ObjectTileTypeCollision(j) And 32)=0 Then ObjectTileTypeCollision(j)=ObjectTileTypeCollision(j)+32
					If CanObjectMoveToTile(j,x-2*dx,y-2*dy,True,True)=True
						If ObjectFlying(j)<>10+ObjectData(i,2)*2 
							PlaySoundFX(44,ObjectTileX(j),ObjectTileY(j))
							If j=PlayerObject 
								If Rand(1,100)<70
									PlaySoundFX(Rand(180,182),ObjectTileX(j),ObjectTileY(j))
								Else
									PlaySoundFX(Rand(170,172),ObjectTileX(j),ObjectTileY(j))
								EndIf
							EndIf
	
			
						EndIf
						ObjectFlying(j)=10+ObjectData(i,2)*2
					Else
					;	DestroyObject(j,0)
					EndIf
					
					ObjectTileTypeCollision(j)=OldTile
				
					
				EndIf
			EndIf

			
		EndIf
	Next


		For j=0 To NofObjects-1
			If ObjectButtonPush(j)=True And ObjectMovementTimer(j)=0 And ObjectFrozen(j)<10000
				If ObjectTileX(j)=x+dx And ObjectTileY(j)=y+dy And ObjectDead(j)=0 And ObjectExists(j)=True
					; got it
					; check if it can fly in that direction (one step)
								
					; special case for submerged waterchomps
					If ObjectType(j)=250 And ObjectSubType(j)=1 And ObjectData(j,5)=1

					Else
						If ObjectFlying(j)=0 	PlaySoundFX(44,ObjectTileX(j),ObjectTileY(j))
						ObjectFlying(j)=10+ObjectData(i,2)*2
					EndIf
			
				EndIf
			EndIf
		Next


	

	
End Function

Function CreateSuctubeXMesh(tex)
	
	Entity=CreateMesh()
	Surface=CreateSurface(Entity)
	
	nofsegments#=16
	nofarcpoints#=8
	
		

	For j=0 To nofarcpoints
		angle2#=(90.0/nofarcpoints)*j
		For i=0 To nofsegments-1
			angle#=-(360.0/nofsegments)/2.0+i*(360.0/nofsegments)
			height#=0.7+1.0*Cos(angle)
			radius#=1.5-1.5*Sin(angle)
			
			
			If i Mod 2 =0
				xtex#=0.25
			Else
				xtex#=0.0
			EndIf

			If j Mod 2 =0
				ytex#=19.0
			Else
				ytex#=0.0
			EndIf
			
			AddVertex (surface,1.5-radius*Cos(angle2),height,-1.5+radius*Sin(angle2),0.25*tex+xtex,(107.0-ytex)/512.0)
			
		Next
	Next
	
	For j=0 To nofarcpoints-1
		For i=0 To nofsegments-1
		
			AddTriangle(surface,j*nofsegments+i,j*nofsegments+((i+1) Mod nofsegments),(j+1)*nofsegments+i)
			AddTriangle(surface,(j+1)*nofsegments+i,j*nofsegments+((i+1) Mod nofsegments),(j+1)*nofsegments+((i+1) Mod nofsegments))
			
			AddTriangle(surface,j*nofsegments+((i+1) Mod nofsegments),j*nofsegments+i,(j+1)*nofsegments+i)
			AddTriangle(surface,(j+1)*nofsegments+((i+1) Mod nofsegments),j*nofsegments+((i+1) Mod nofsegments),(j+1)*nofsegments+i)


			
		Next
	Next
	

	

	UpdateNormals Entity
	
	EntityTexture Entity,GateTexture
	Return Entity
End Function

Function ControlSucTubeX(i)

	; build walls and ice corner
	x=Floor(objectX(i))
	y=Floor(ObjectY(i))
	Select ObjectData(i,2) ; direction
	
	Case 0
		LevelTileLogic(x-1,y-1)=1
		LevelTileLogic(x-1,y-0)=1
		LevelTileLogic(x-1,y+1)=1
		LevelTileLogic(x,y-1)=1
		LevelTileLogic(x+1,y-1)=1
		LevelTileLogic(x+1,y+1)=1
		
	Case 1
		LevelTileLogic(x-1,y-1)=1
		LevelTileLogic(x,y-1)=1
		LevelTileLogic(x-1,y+1)=1
		LevelTileLogic(x+1,y-1)=1
		LevelTileLogic(x+1,y)=1
		LevelTileLogic(x+1,y+1)=1
		
	Case 2
		LevelTileLogic(x-1,y-1)=1
		LevelTileLogic(x+1,y-1)=1
		LevelTileLogic(x+1,y)=1
		LevelTileLogic(x,y+1)=1
		LevelTileLogic(x,y+1)=1
		LevelTileLogic(x+1,y+1)=1
		
	Case 3
		LevelTileLogic(x-1,y-1)=1
		LevelTileLogic(x+1,y-1)=1
		LevelTileLogic(x-1,y)=1
		LevelTileLogic(x-1,y+1)=1
		LevelTileLogic(x,y+1)=1
		LevelTileLogic(x+1,y+1)=1
		
	End Select
	
	
	
End Function

Function CreatePickUpItemMesh(tex)
	entity=CreateMesh()
	surface=CreateSurface(entity)
	
	AddVertex (surface,0,.1,0,.9375,.9375)
	
	R#=.3
	AddVertex (surface,R,.1,.5+R,.875,.875)
	AddVertex (surface,.5+R,.1,R,.875,1)
	AddTriangle (surface,0,1,2)
	AddVertex (surface,.5+R,.1,-R,1,1)
	AddTriangle (surface,0,2,3)
	AddVertex (surface,+R,.1,-.5-R,1,.875)
	AddTriangle (surface,0,3,4)
	AddVertex (surface,-R,.1,-.5-R,.875,.875)
	AddTriangle (surface,0,4,5)
	AddVertex (surface,-.5-R,.1,-R,1,.875)
	AddTriangle (surface,0,5,6)
	AddVertex (surface,-.5-R,.1,R,1,1)
	AddTriangle (surface,0,6,7)
	AddVertex (surface,-R,.1,.5+R,.875,1)
	AddTriangle (surface,0,7,8)
	AddTriangle (surface,0,8,1)
	
	AddVertex (surface,-.5,.2,.5,(tex Mod 8)*0.125+0.013,Floor((tex Mod 64)/8)*0.125+0.013)
	AddVertex (surface,.5,.2,.5,(tex Mod 8)*0.125+0.1135,Floor((tex Mod 64)/8)*0.125+0.013)
	AddVertex (surface,-.5,.2,-.5,(tex Mod 8)*0.125+0.013,Floor((tex Mod 64)/8)*0.125+0.0945)
	AddVertex (surface,.5,.2,-.5,(tex Mod 8)*0.125+0.1135,Floor((tex Mod 64)/8)*0.125+0.0945)
	AddTriangle (surface,9,10,11)
	AddTriangle (surface,10,12,11)
	
	AddVertex(surface,0,1.5,0,.9375,.9375)
	AddTriangle (surface,13,1,2)
	AddTriangle (surface,13,2,3)
	AddTriangle (surface,13,3,4)
	AddTriangle (surface,13,4,5)
	AddTriangle (surface,13,5,6)
	AddTriangle (surface,13,6,7)
	AddTriangle (surface,13,7,8)
	AddTriangle (surface,13,8,1)
	
	 
	For j=0 To 8
		VertexColor  surface,j,255,255,255,.5
	Next
	VertexColor  surface,13,255,255,255,.5

	EntityFX Entity,32+2

	ScaleMesh Entity,.5,.5,.5
	
	UpdateNormals Entity
;	EntityTexture Entity,IconTextureStandard
	
	Return Entity
End Function

Function ControlPickUpItem(i)

		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))


	ObjectYaw(i)=(ObjectYaw(i)+2) Mod 360
	
	ObjectPitch2(i)=10*Sin(LevelTimer Mod 360)

	If ObjectActive(i)=1001
		

		; see if picked up
		If (ObjectTileX(i)=ObjectTileX(PlayerObject) And ObjectTileY(i)=ObjectTileY(PlayerObject) And ObjectMovementTimer(PlayerObject)<500) Or (ObjectTileX(i)=ObjectTileX2(PlayerObject) And ObjectTileY(i)=ObjectTileY2(PlayerObject) And ObjectMovementTimer(PlayerObject)>=500) 
			; yep - do we have room in inventory?
			
			
			If NofItems<InventorySize^2	
				; yes - pick up. Delete logic from tiles
				If (ObjectTileLogic(ObjectTileX(i),ObjectTileY(i)) And 2^4)>0
					ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))=ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))-2^4
				EndIf
			
				; visuals
				DestroyObject(i,0)
				For j=0 To 29
					a=j*12
					b#=.02
					AddParticle(Rand(16,23),ObjectX(i)+0.1*Sin(a),0,-ObjectY(i)-0.1*Cos(a),0,.5,b*Sin(a),0.05,-b*Cos(a),1,0,0,0,0,50,3)
				Next
				
				; and add to inventory	
				If CurrentSpell=0 And ObjectData(i,0)>1000 And ObjectData(i,0)<2000
					; see if a spell is picked up : equip
					SelectSpell((ObjectData(i,0)-1001)/10+1,-1)
				Else
					AddItemToInventory(-1,ObjectData(i,0),ObjectData(i,1),ObjectData(i,2),ObjectTextData$(i,0),ObjectTextData$(i,1))
				EndIf
				
				; Do a little blip around the Rucksack
				IconSize(8)=601
				For j=0 To 359 Step 10
					AddParticle2(16,1.74+.5*Sin(j),1.63+.5*Cos(j),5,0,.08,-.01*Sin(j),-.01*Cos(j),0,0,-.001,0,0,0,50,2)
				Next
				 
			EndIf
		EndIf
	Else
		
	EndIf

End Function



Function CreateSpellBall(x#,y#,z#,dx#,dy#,subtype,goalx,goaly,player,timer)

	If x<0 Or y<0 
		Delay 10000
	EndIf
	
	; note - Timer>0 is really only used for explosions (eg tnt barrels, as some other rules apply to them)
	If player=-99
		PlaySoundFX(82,ObjectX(PlayerObject),ObjectY(PlayerObject))
	Else
		PlaySoundFX(82,x,y)
	EndIf
	i=CreateNewObject()
	
	ObjectModelName$(i)="!SpellBall"
	ObjectTextureName$(i)=""

	
	ObjectEntity(i)=CreateSpellBallMesh(subtype Mod 10)
	If player=-99
		; special code (e.g. from zapbots) to make laser shape
		If dx=0
			ScaleMesh ObjectEntity(i),.3,.3,10
		Else If dy=0
			ScaleMesh ObjectEntity(i),10,.3,.3
		EndIf
		ObjectData(i,8)=-99
		player=False
	EndIf
			
	
	ObjectX(i)=x
	ObjectY(i)=y
	ObjectZ(i)=z
	ObjectTileX(i)=Floor(x)
	ObjectTileY(i)=Floor(y)
	
	
	ObjectType(i)=50
	ObjectSubType(i)=subtype	
	ObjectID(i)=-1
	ObjectStatus(i)=Player ; True=fired by player
	
	ObjectActive(i)=1001
	
	ObjectDX(i)=dx
	ObjectDY(i)=dy
	
	; first particles and spell generation effect
;	If ObjectSubtype(i)=1
;		AddParticle(6,ObjectX(i)+Rnd(-.1,.1),0.5+Rnd(-.1,.1),-ObjectY(i)+Rnd(-.1,.1),0,1.2,0,0.00,0,1,.02,0,0,0,75,3)
;	Else If ObjectSubType(i) =2
;		AddParticle(8,ObjectX(i)+Rnd(-.1,.1),0.5+Rnd(-.1,.1),-ObjectY(i)+Rnd(-.1,.1),0,1.2,0,0.00,0,1,.02,0,0,0,75,3)
;	EndIf

	ObjectTileTypeCollision(i)=32285
	ObjectObjectTypeCollision(i)=-1;2^6
	
	ObjectData(i,0)=goalx
	ObjectData(i,1)=goaly
	ObjectData(i,2)=ObjectTileX(i)
	ObjectData(i,3)=ObjectTileY(i)
	
	If WAEpisode=1 And (AdventureCurrentNumber>=212 And AdventureCurrentNumber<=214) Then timer=timer*2
	ObjectTimer(i)=timer
;	If timer>0 HideEntity ObjectEntity(i)


End Function
Function CreateSpellBallMesh(subtype)
	entity=CreateSphere(4)
	Select subtype
	Case 9
		EntityColor Entity,145,109,35
	Case 10
		EntityColor Entity,93,2,7
	Case 7,8
		EntityColor Entity,255,255,255
	Case 0
		EntityColor Entity,255,120,0
	Case 1
		EntityColor Entity,255,180,50
	Case 2
		EntityColor Entity,255,255,50
	Case 3
		EntityColor Entity,50,255,50
	Case 4
		EntityColor Entity,100,200,255
	Case 5
		EntityColor Entity,50,50,255
	Case 6
		EntityColor Entity,255,50,255
	End Select 
	ScaleMesh Entity,.15,.15,.15
	EntityBlend Entity,3
	
	Return Entity
End Function

Function ControlSpellBall(i)

	For j=0 To NofObjects-1
		If (ObjectX(i)-ObjectX(j))^2+(ObjectY(i)-ObjectY(j))^2 <.3 And ObjectExists(j)=True And ObjectActive(j)>0
			If ObjectType(j)=360
				Return
			EndIf
		EndIf
	Next
	ObjectTimer(i)=ObjectTimer(i)-1
	If ObjectTimer(i)=0
		DestroyObject(i,0)
		

		Return
	EndIf
	
	; move the ball
	
	
	
	ObjectX(i)=ObjectX(i)+ObjectDX(i)
	
	If LevelTileLogic(Floor(ObjectX(i)),Floor(ObjectY(i)))=13
		PlaySoundFX(88,ObjectTIleX(i),ObjectTIleY(i))
		ObjectDX(i)=-ObjectDX(i)
		ObjectX(i)=ObjectX(i)+ObjectDX(i)
	EndIf
	ObjectY(i)=ObjectY(i)+ObjectDY(i)

	If LevelTileLogic(Floor(ObjectX(i)),Floor(ObjectY(i)))=13
		PlaySoundFX(88,ObjectTIleX(i),ObjectTIleY(i))
		ObjectDY(i)=-ObjectDY(i)
		ObjectY(i)=ObjectY(i)+ObjectDY(i)
	EndIf

	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))
	
	If objectsubtype(i)=0 Then
		v1#=0.05
		If (objectx(i)<objectx(playerobject) And (objectdx(i)<v1#)) Then
			objectdx(i)=objectdx(i)+0.001
		End If
		If (objectx(i)>objectx(playerobject) And (objectdx(i)>-v1#)) Then
			objectdx(i)=objectdx(i)-0.001
		End If
		If (objecty(i)<objecty(playerobject) And (objectdy(i)<v1#)) Then
			objectdy(i)=objectdy(i)+0.001
		End If
		If (objecty(i)>objecty(playerobject) And (objectdy(i)>-v1#)) Then
			objectdy(i)=objectdy(i)-0.001
		End If
		If objectdx(i)>v1# Then
			objectdx(i)=v1#
		End If
		If objectdx(i)<-v1# Then
			objectdx(i)=-v1#
		End If
		If objectdy(i)>v1# Then
			objectdy(i)=v1#
		End If
		If objectdy(i)<-v1# Then
			objectdy(i)=-v1#
		End If
	End If
	
	If ObjectSubType(i)<8
		myparticle=24+ObjectSubType(i)
	ElseIf ObjectSubType(i)=9
		myparticle=7
	ElseIf ObjectSubType(i)=10
		myparticle=8
	Else
		myparticle=Rand(24,31)
	EndIf
	
	; do the trail
	If LevelTimer Mod 2 =0 And ObjectData(i,8)<>-99 Then AddParticle(myparticle,ObjectX(i)+Rnd(-.1,.1),ObjectZ(i)+Rnd(-.1,.1),-ObjectY(i)+Rnd(-.1,.1),0,0.5,0,0.00,0,3,.01,0,0,0,75,3)
	
	; check corners for collision with tiles
	k1#=0
	k2#=0
	For j=0 To 3
		k1#=(2*Floor(j/2)-1)*0.1
		If j=1 Then k2#=-.1
		If j=3 Then k2#=.1
		x=Floor(ObjectX(i)+k1)
		y=Floor(ObjectY(i)+k2)
		
		If CanObjectMoveToTile(i,x,y,False,True)=False And (x<>ObjectData(i,2) Or y<>ObjectData(i,3))
			DestroyObject(i,0)
			
			If ObjectTimer(i)<0
				For j2=1 To 360 Step 16
					AddParticle(myparticle-8,ObjectX(i)+.2*Sin(j2*3),Rnd(0,1),-ObjectY(i)-.2*Cos(j2*3),0,.25,0.01*Sin(j2*3),Rnd(0.01,0.02),-0.01*Cos(j2*3),1,0,0,0,0,Rand(30,40),3)
				Next
			EndIf

			If ObjectStatus(i)=True Then PlayerControlMode=6
			

			Return
		EndIf
		
	Next
	
	; now check collision with other object - do this with circles around x/y
	For j=0 To NofObjects-1
		If (ObjectX(i)-ObjectX(j))^2+(ObjectY(i)-ObjectY(j))^2 <.3 And ObjectExists(j)=True And ObjectActive(j)>0
;				If otype=1 Or otype=110 Or otype=120 Or otype=150 Or Floor(otype/10)=17 Or otype=220 Or otype=230
			destructoflag=False
			
			
				Select ObjectType(j)
				Case 1
					; player
					If ObjectSubType(i)<2 ; fire 
						destroyobject(j,1)
					EndIf
	
					destructoflag=True
				Case 110,390,391,400
					; npc
					If ObjectSubType(i)<2 ; fire 
						destroyobject(j,1)
					EndIf
					If ObjectSubType(i)=4 ; ice
						CreateIceBlock(ObjectX(j),ObjectY(j),j)
					EndIf
					destructoflag=True
				Case 433
					; zbot npc
					If ObjectSubType(i)<2  And ObjectData(j,0)=0 ; fire 
						PlaySoundFX(Rand(144,146),ObjectX(j),ObjectY(j))
						ObjectData(j,0)=1
					EndIf
					If ObjectSubType(i)=4 And ObjectData(j,0)=0; ice
						CreateIceBlock(ObjectX(j),ObjectY(j),j)
					EndIf
							
						
				
					destructoflag=True

	
				Case 120
					; wee stinker
					If ObjectSubType(i)<2 ; fire 
						destroyobject(j,1)
					EndIf
					If ObjectSubType(i)=4 ; ice
						CreateIceBlock(ObjectX(j),ObjectY(j),j)
					EndIf
					
					destructoflag=True
	
				Case 150
					; scritter
					If ObjectSubType(i)<2 ; fire 
						destroyobject(j,1)
					EndIf
					If ObjectSubType(i)=4 ; ice
						CreateIceBlock(ObjectX(j),ObjectY(j),j)
						
					EndIf
					destructoflag=True
					
				Case 151
					;rainbwobubble
					If ObjectSubType(i)<=2 Or ObjectSubType(i)=4; fire 
						destroyobject(j,1)
					EndIf
							
					
					destructoflag=True
				
				Case 170,171,172,173,174,175,176,177,178,179,425
					; item
					destructoflag=True
					
				Case 220
					; turtle (not harmed by fire)
					If ObjectStatus(j)=0
						destructoflag=True
					EndIf
					If ObjectSubType(i)=4 And ObjectStatus(j)=0
						CreateIceBlock(ObjectX(j),ObjectY(j),j)
						destructoflag=True
					EndIf
					
					
				Case 230
					; fireflower
					If ObjectSubType(i)<2 ; fire 
						destroyobject(j,1)
					EndIf
					If ObjectSubType(i)=4 ; ice
						CreateIceBlock(ObjectX(j),ObjectY(j),j)
					EndIf
					destructoflag=True
				Case 460
					; burstflower
					If ObjectSubType(i)<2 ; fire 
						destroyobject(j,1)
					EndIf
					If ObjectSubType(i)=4 ; ice
						CreateIceBlock(ObjectX(j),ObjectY(j),j)
					EndIf
					If ObjectSubType(i)=3 ; grow
						destroyobject(j,1)
					Else
						destructoflag=True
					EndIf
				Case 240,241,242
					; box
					If ObjectSubType(i)<2 ; fire 
						destroyobject(j,1)
						; linked barrel only
						If ObjectType(j)=240 And ObjectSubtype(j)>0
							For k=0 To nofobjects-1
								If ObjectType(k)=240 And ObjectData(j,0)=ObjectData(k,0) And ObjectData(j,1)=ObjectData(k,1) And ObjectExists(k)=True And ObjectActive(k)>0
									DestroyObject(k,1)
								EndIf
							Next
						EndIf
					EndIf
					destructoflag=True
					
				Case 370
					; crab - change their behaviour
					If ObjectStatus(j)=0 ; not submerged
						If ObjectSubType(i)<2 ; fire
							If ObjectSubType(j)=0
								; male ; make curious
								If ObjectData(j,1)>1 ; previously sleeping
									VacateObjectTile(j)
									ObjectData(j,1)=1
									OccupyObjectTile(j,ObjectTileX2(j),ObjectTileY2(j))
								Else
									ObjectData(j,1)=1
								EndIf
								ObjectMovementType(j)=14
								If Objectdata(j,1)=2 Or Objectdata(j,1)=3
									; wake up animation (if necessary)
									AnimateMD2 ObjectEntity(j),3,-0.5,49,31
									ObjectCurrentAnim(j)=5
									PlaySoundFX(116,ObjectX(i),ObjectY(i))
								EndIf
																
							Else
								; female
								If ObjectData(j,1)=0 Or ObjectData(j,1)=1
									; close
								
									VacateObjectTile(j)
									ObjectData(j,1)=3
									OccupyObjectTile(j,ObjectTileX2(j),ObjectTileY2(j))
									PlaySoundFX(117,ObjectX(i),ObjectY(i))
								
									ObjectMovementType(j)=0
									AnimateMD2 ObjectEntity(j),3,0.5,31,49
									ObjectCurrentAnim(j)=4
								EndIf
							
							EndIf
						EndIf
						
						If ObjectSubType(i)=4 ; ice
							CreateIceBlock(ObjectX(j),ObjectY(j),j)
						EndIf

		
						destructoflag=True
					EndIf

				Case 470,471
					; Ghosts: only if active
					If ObjectStatus(j)=1
					
						If ObjectSubType(i)<2 ; fire 
							destroyobject(j,1)
						EndIf
						
						If ObjectSubType(i)=4 ; ice
							CreateIceBlock(ObjectX(j),ObjectY(j),j)
						EndIf
		
						destructoflag=True
					EndIf
					
				Case 250,260,290,420,422,423,430,431
					If ObjectSubType(i)<2 Then DestroyObject(j,1)
						If ObjectSubType(i)=4 ; ice
							CreateIceBlock(ObjectX(j),ObjectY(j),j)
						EndIf
						
					destructoflag=True
				Case 432
					; pushbot (not harmed by fire, activated by pop)
					
					If ObjectSubtype(i)=2; pop
						If ObjectSubType(j)=0
							SoundPitch (SoundFX(98),Rand(19000,25000))
							PlaySoundFX(98,ObjectTileX(i),ObjectTileY(i))
						Else
							SoundPitch (SoundFX(98),Rand(9000,15000))
							PlaySoundFX(98,ObjectTileX(i),ObjectTileY(i))
						EndIf

						ObjectMovementType(j)=81+2*ObjectData(j,2)+(ObjectData(j,3) Mod 2)
						
					EndIf
					If ObjectSubType(i)=4; ice
						CreateIceBlock(ObjectX(j),ObjectY(j),j)
						
	
					EndIf
					destructoflag=True


				Case 330
					; wysp
					If ObjectSubType(i)<2 ; fire 
						destroyobject(j,1)
					EndIf
					destructoflag=True
					
					
				Case 350
					; growflower (not if on ice)
					If LevelTileLogic(Floor(ObjectX(j)),Floor(ObjectY(j)))<>13 And ObjectActive(j)>1 destructoflag=True
	
	
	
				Case 421
					; retroscouge
					
					If LevelTileLogic(Floor(ObjectX(j)),Floor(ObjectY(j)))<>13 And ObjectActive(j)>1 destructoflag=True

				End Select
			
			If destructoflag=True	
				; destroy the spellball
				DestroyObject(i,0)
				
				If ObjectTimer(i)<0

					For j2=1 To 360 Step 16
						AddParticle(myparticle-8,ObjectX(i)+.2*Sin(j2*3),Rnd(0,1),-ObjectY(i)-.2*Cos(j2*3),0,.25,0.01*Sin(j2*3),Rnd(0.01,0.02),-0.01*Cos(j2*3),1,0,0,0,0,Rand(30,40),3)
					Next
				EndIf
				If ObjectStatus(i)=True Then PlayerControlMode=6
				Return
			EndIf
		EndIf
	Next
		
	
	If ObjectTileX(i)=ObjectData(i,0) And ObjectTileY(i)=ObjectData(i,1) And Abs(ObjectX(i)-ObjectTileX(i)-0.5)<0.25 And Abs(ObjectY(i)-ObjectTileY(i)-0.5)<0.25
	
		; arrived a goal
	
		Select Objectsubtype(i)
		
		Case 2
			; Power spell
			; activate anything at goal
			For j=0 To NofObjects-1
				If ObjectType(j)=90 And ObjectActive(j)=1001 And ObjectData(j,8)=0
					If ObjectTileX(j)=ObjectData(i,0) And ObjectTileY(j)=ObjectData(i,1)
						ActivateButton(j)
					EndIf
				EndIf
				; stepper converyor
			If (ObjectType(j)=45 Or ObjectType(j)=46) And ObjectData(j,5)=1 And ObjectActive(j)=1001 And ObjectMovementTimer(j)=0
					If ObjectTileX(j)=ObjectData(i,0) And ObjectTileY(j)=ObjectData(i,1)
						If ObjectType(j)=45
							ActivateConveyor(j)
							
							j=nofobjects
						Else
							For k=0 To NofObjects-1
								If ObjectType(k)=45 And ObjectData(k,0)=ObjectData(j,0) And ObjectData(k,1)=ObjectData(j,1) And ObjectMovementTimer(k)=0
									ActivateConveyor(k)
									
								EndIf
							Next
						EndIf
									
					EndIf
				EndIf
				; mover conveyor
				If (ObjectType(j)=45 Or ObjectType(j)=46) And ObjectData(j,5)=0 
					If ObjectTileX(j)=ObjectData(i,0) And ObjectTileY(j)=ObjectData(i,1)
						If ObjectType(j)=45 
							ActivateObject(j)
							
							j=nofobjects
						Else
							For k=0 To NofObjects-1
								If ObjectType(k)=45 And ObjectData(k,0)=ObjectData(j,0) And ObjectData(k,1)=ObjectData(j,1)
									ActivateObject(k)
									
								EndIf
							Next
						EndIf
									
					EndIf
				EndIf


				If ObjectType(j)=210 And ObjectActive(j)=1001 
					If ObjectTileX(j)=ObjectData(i,0) And ObjectTileY(j)=ObjectData(i,1)
						ActivateTransporter(j)
					EndIf
				EndIf
				If ObjectType(j)=40 And ObjectActive(j)=1001 
					If ObjectTileX(j)=ObjectData(i,0) And ObjectTileY(j)=ObjectData(i,1)
						DeActivateObject(j)
					EndIf
				EndIf
			If ObjectType(j)=450 And ObjectData(j,0)=0
					If Floor(ObjectX(j))=ObjectData(i,0) And Floor(ObjectY(j))=ObjectData(i,1)
						ObjectData(j,0)=1
						ObjectData(j,1)=0
						PlaySoundFX(97,ObjectTileX(j),ObjectTileY(j))

					EndIf
				EndIf
				
				If (ObjectType(j)=300 Or ObjectType(j)=301) And ObjectData(j,0)=0
					If ObjectTileX(j)=ObjectData(i,0) And ObjectTileY(j)=ObjectData(i,1)
					ObjectStatus(j)=0
					ObjectData(j,0)=40
					ObjectActive(j)=400
					If ObjectType(j)=300
						PlaySoundFX(83,ObjectX(j),ObjectY(j))
					Else
						PlaySoundFX(124,ObjectX(j),ObjectY(j))
					EndIf
					EndIf
				EndIf
				
			Next
			
			
		Case 3
			; Grow Spell
			; Check the Leveltilelogic and grow something there
			CreateGrowFlower(ObjectData(i,0),ObjectData(i,1))
		Case 4
			; Ice Spell
			If LevelTIleLogic(ObjectData(i,0),ObjectData(i,1))=2 And ObjectTileLogic(ObjectData(i,0),ObjectData(i,1))=0
				CreateIceFloat(ObjectData(i,0),ObjectData(i,1))
			EndIf
			
		Case 5
			; Flash bubble spell
			CreateFlashBubble(ObjectData(i,0),ObjectData(i,1))
		Case 6
			; Teleport spell
			If ObjectDead(PlayerObject)=0
			
				PlaySoundFX(81,-1,-1)
				VacateObjectTile(PlayerObject)
				
				ObjectX(PlayerObject)=ObjectData(i,0)+.5
				ObjectY(PlayerObject)=ObjectData(i,1)+.5
				ObjectTileX(PlayerObject)=ObjectData(i,0)
				ObjectTileY(PlayerObject)=ObjectData(i,1)
				ObjectTileX2(PlayerObject)=ObjectData(i,0)
				ObjectTileY2(PlayerObject)=ObjectData(i,1)
				ObjectMoveXGoal(PlayerObject)=ObjectData(i,0)
				ObjectMoveYGoal(PlayerObject)=ObjectData(i,1)
				OccupyObjectTile(PlayerObject,ObjectTileX(PlayerObject),ObjectTileY(PlayerObject))
				
				
				If ObjectStatus(i)=True Then PlayerControlMode=6
				
				Animate GetChild(objectentity(playerobject),3),1,.05,10
				ObjectCurrentAnim(playerobject)=10
			EndIf
		
		Case 9
			; barrel spell
			ObjectData(i,6)=100
			CreateOMGBarrel(ObjectTileX(i),ObjectTileY(i),False)
			
		Case 10
			; barrel tnt spell
			ObjectData(i,6)=100
			CreateOMGBarrel(ObjectTileX(i),ObjectTileY(i),True)
			
		End Select
		
		
		
		DestroyObject(i,0)
		If ObjectTimer(i)<0
			For j2=1 To 360 Step 4
				AddParticle(myparticle-8,ObjectData(i,0)+.5+.2*Sin(j2*3),Rnd(0,1),-ObjectData(i,1)-.5-.2*Cos(j2*3),0,.5,0.01*Sin(j2*3),Rnd(0.01,0.02),-0.01*Cos(j2*3),1,0,0,0,0,Rand(30,75),3)
			Next
		EndIf
		


		
	EndIf

		
	

End Function

Function CreateIceBlock(x#,y#,child)

	; type- 0-regular ice
	; lasting- true-regular, false-forever (e.g. IceTrolls/IceFlowers)

	If ObjectFrozen(child)>0 Then Return ; already frozen
	
	PlaySoundFX(83,x,y)
	
	i=CreateNewObject()

	
	ObjectModelName$(i)="!IceBlock"
	ObjectTextureName$(i)=""

	
	ObjectEntity(i)=CreateIceBlockMesh()
	
	ObjectTexture(i)=0
	;EntityTexture ObjectEntity(i),ObjectTexture(i)
	
	ObjectDestructionType(i)=1

	
	ObjectX(i)=x
	ObjectY(i)=y
	
	ObjectActive(i)=501
	
	ObjectActivationSpeed(i)=20
	ObjectActivationType(i)=2
	
	ObjectDX(i)=0
	ObjectDY(i)=0
		
	
	
	PositionEntity ObjectEntity(i),ObjectX(i),0.5,-ObjectY(i)
	
	ObjectChild(i)=child					; which object is frozen within
	
	
	ObjectData(i,1)=ObjectZ(child)*1000		; that object's z-value (to move along)
	ObjectData(i,2)=Rand(-6,6)				; for frozen angle
	
	
	
	ObjectType(i)=60
	
	; vacate the 'old' object and re-occupy as frozen
	vacateobjecttile(child)
	
	If ObjectLinked(child)>=0
		If objecttype(objectlinked(child))=210
			x1=objecttilex(child)
			y1=objecttileY(child)
			ObjectTileX(child)=ObjectTileX2(objectlinked(child))
			ObjectTileY(child)=ObjectTileY2(objectlinked(child))
			vacateobjecttile(child)
			ObjectTileX(child)=ObjectTileX(objectlinked(child))
			ObjectTileY(child)=ObjectTileY(objectlinked(child))
			vacateobjecttile(child)
			objecttilex(child)=x1
			objecttiley(child)=y1
		EndIf
			
	EndIf
	If ObjectMovementTimer(child)>0 
		x1=objecttilex(child)
		y1=objecttileY(child)
		ObjectTileX(child)=ObjectTileX2(child)
		ObjectTileY(child)=ObjectTileY2(child)
		vacateobjecttile(child)
		objecttilex(child)=x1
		objecttiley(child)=y1
	EndIf
	
	ObjectFrozen(child)=1
	
	If ObjectMovementTimer(child)>0
		OccupyObjectTile(child,ObjectTileX2(child),ObjectTileY2(child))
	Else
		OccupyObjectTile(child,ObjectTileX(child),ObjectTileY(child))
	EndIf

	
	If ObjectType(child)=110
		ObjectData(i,0)=ObjectData(child,1)
		ActivateCommand(62,ObjectID(child),-1,1,-1)
	EndIf
	
End Function

Function CreateIceBlockMesh()

	; type- 0-ice

		Entity=CreateCube()
		ScaleMesh Entity,.52,.75,.52
		PositionMesh Entity,0,.75,0
		EntityAlpha Entity,.5
		EntityBlend Entity,3
		EntityColor Entity,100,255,255
		
	

	
	
	Return Entity
End Function

Function ControlIceBlock(i)

	
	child=Objectchild(i)
	ObjectX(i)=ObjectX(child)
	ObjectY(i)=ObjectY(child)
	If ObjectFrozen(ObjectChild(i))=0
		; no longer frozen
		PlaySoundFX(84,ObjectX(i),ObjectY(i))
		; vacate the 'old' object and re-occupy as unfrozen
		ObjectFrozen(child)=1
		vacateobjecttile(child)
		If ObjectMovementTimer(child)>0
			x1=objecttilex(child)
			y1=objecttileY(child)
			ObjectTileX(child)=ObjectTileX2(child)
			ObjectTileY(child)=ObjectTileY2(child)
			vacateobjecttile(child)
			objecttilex(child)=x1
			objecttiley(child)=y1
		EndIf
		
		ObjectFrozen(child)=0
		OccupyObjectTile(child,ObjectTileX(child),ObjectTileY(child))

		
		
		
		If ObjectType(objectchild(i))=110
			ObjectData(objectchild(i),1)=ObjectData(i,0)
			ActivateCommand(62,ObjectID(objectchild(i)),-1,ObjectData(objectchild(i),1),-1)
		EndIf

		
		ObjectChild(i)=-1
		
		DestroyObject(i,0)
	EndIf

End Function


Function CreateIceFloat(x,y)
	
	i=CreateNewObject()
	PlaySoundFX(83,x,y)
	
	ObjectModelName$(i)="!IceFloat"
	ObjectTextureName$(i)=""

	
	ObjectEntity(i)=CreateIceFloatMesh()
	
	ObjectTexture(i)=0
	;EntityTexture ObjectEntity(i),ObjectTexture(i)
	
	ObjectDestructionType(i)=0
	ObjectActive(i)=501
	ObjectActivationSpeed(i)=20
	ObjectActivationType(i)=2

	LevelTileLogic(x,y)=14
	
	ObjectType(i)=300

	
	ObjectX(i)=x+.5
	ObjectY(i)=y+.5
	ObjectTileX(i)=x
	ObjectTileY(i)=y
	
	ObjectData(i,1)=Rand(0,360)
	Objectdata(i,2)=Rand(-3,3)
	ObjectData(i,3)=Rand(-3,3)

End Function

Function CreateIceFloatMesh()
	Entity=CreateCylinder(16,True)
	;For i=1 To CountVertices (GetSurface(entity,1))-1
	;	VertexCoords GetSurface(entity,1),i,VertexX(GetSurface(entity,1),i)+Rnd(-.1,.1),VertexY(GetSurface(entity,1),i),VertexZ(GetSurface(entity,1),i)+Rnd(-.1,.1)
	;Next
	ScaleMesh Entity,.45,.05,.45
	PositionMesh Entity,0,-.1,0
	EntityAlpha Entity,.8
	;EntityBlend Entity,3
	EntityColor Entity,255,255,255
	Return Entity
End Function
Function ControlIceFloat(i)
	If ObjectData(i,0)>0
		; deactivating
		ObjectData(i,0)=ObjectData(i,0)-1
		If ObjectData(i,0)=0
			If LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=14 Then LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=2
			destroyObject(i,0)
		EndIf
	EndIf
	
	ObjectPitch(i)=2*ObjectData(i,2)*Sin((LevelTimer + ObjectData(i,1)) Mod 360)
	Objectroll(i)=3*ObjectData(i,3)*Cos((LevelTimer+ ObjectData(i,1))  Mod 360)
	

End Function

Function CreateOMGBarrel(x,y,explosive)
	If ObjectTileLogic(x,y)<>512 And (LevelTileLogic(x,y)=0 Or LevelTileLogic(x,y)=4 Or LevelTileLogic(x,y)=9 Or LevelTileLogic(x,y)=11 Or LevelTileLogic(x,y)=12)
		i=CreateNewObject()
		ObjectEntity(i)=CopyEntity(BarrelMesh)
		ObjectExists(i)=True
		ObjectButtonPush(i)=True
		If explosive>0 Then
			ObjectModelName$(i)="!Barrel2"
			ObjectType(i)=241
			EntityTexture ObjectEntity(i),BarrelTexture2
		Else
			ObjectModelName$(i)="!Barrel1"
			ObjectType(i)=240
			EntityTexture ObjectEntity(i),BarrelTexture1
		EndIf
		ObjectX(i)=x+0.5
		ObjectY(i)=y+0.5
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectActive(i)=1
		ObjectActivationSpeed(i)=60
		ObjectActivationType(i)=2
		ObjectDX(i)=0
		ObjectDY(i)=0
		PositionEntity ObjectEntity(i),ObjectX(i)+.5,0,-ObjectY(i)-.5,1
		ObjectDestructionType(i)=1
		OccupyObjectTile(i,x,y)
		AddParticle(22+16-1-1-1-1-explosive,ObjectTileX(i)+.5, 0,-ObjectTileY(i)-.5,0,1.1,0, .04,0,0,0,0,0,0,75,4)
		AddParticle(22+16-1-1-1-1-explosive,ObjectTileX(i)+.5, 2,-ObjectTileY(i)-.5,0,1.1,0,-.03,0,0,0,0,0,0,75,4)
		AddParticle(22+16-1-1-1-1-explosive,ObjectTileX(i)+.5,.3,-ObjectTileY(i)-.5,0,1.1,0, .02,0,0,0,0,0,0,75,4)
		EntityAlpha ObjectEntity(i),1
		PlaySoundFX(94,-1,-1)
	EndIf
End Function


Function CreateGrowFlower(x,y)
	
	i=CreateNewObject()
	
	ObjectModelName$(i)="!GrowFlower"
	ObjectTextureName$(i)=""

	If LevelTileLogic(x,y)=2
		PlaySoundFX(92,x,y)
		PlaySoundFX(33,x,y)
		ObjectEntity(i)=CopyEntity(ObstacleMesh(7))
		ObjectXScale(i)=0.2
		ObjectYScale(i)=0.2
		ObjectZScale(i)=0.2
		ObjectYaw(i)=Rand(0,360)
		ObjectZAdjust(i)=-5
	;	ObjectData(i,1)=1
		
		ObjectData(i,0)=LevelTileLogic(x,y)
		LevelTileLogic(x,y)=1
	;	EntityBlend ObjectEntity(i),3


	Else If LevelTileLogic(x,y)=11 Or LevelTileLogic(x,y)=12
		PlaySoundFX(92,x,y)
		PlaySoundFX(83,x,y)
		ObjectEntity(i)=CopyEntity(ObstacleMesh(16))
		ObjectXScale(i)=0.007
		ObjectYScale(i)=0.007
		ObjectZScale(i)=0.014
		ObjectZAdjust(i)=-0.2
		ObjectYaw(i)=Rand(0,360)
		EntityTexture ObjectEntity(i),waterfalltexture
		ObjectData(i,0)=LevelTileLogic(x,y)
		LevelTileLogic(x,y)=13
	;	ObjectData(i,1)=2

	Else
		PlaySoundFX(92,x,y)
		ObjectEntity(i)=CopyEntity(ObstacleMesh(10))
		ObjectXScale(i)=0.7
		ObjectYScale(i)=0.7
		ObjectZScale(i)=0.7
		ObjectYaw(i)=Rand(0,360)
		ObjectData(i,2)=0
		
		ObjectData(i,0)=LevelTileLogic(x,y)
		LevelTileLogic(x,y)=1
		


	EndIf
	
	ObjectTexture(i)=0
	;EntityTexture ObjectEntity(i),ObjectTexture(i)
	
	
	ObjectX(i)=x+0.5
	ObjectY(i)=y+0.5

	
	ObjectActive(i)=1
	ObjectActivationSpeed(i)=60
	ObjectActivationType(i)=2
	
	ObjectDX(i)=0
	ObjectDY(i)=0
	
	PositionEntity ObjectEntity(i),ObjectX(i)+.5,0,-ObjectY(i)-.5
	
	ObjectDestructionType(i)=1

	
	ObjectType(i)=350
	
	;OccupyObjectTile(i,x,y)
	
	
	ObjectData(i,1)=LevelTileLogic(x,y)


End Function

Function ControlGrowFlower(i)

	; destroy if on lava, or if on changed floor
	

	If LevelTileLogic(Floor(ObjectX(i)),Floor(ObjectY(i)))<>ObjectData(i,1) Or ObjectData(i,0)=5
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		DestroyObject(i,0)
		PlaySoundFX(84,ObjectTileX(i),ObjectTileY(i))
		If ObjectData(i,0)=5 Then LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=5
		Return
	EndIf
	
	If ObjectData(i,0)=12 Or ObjectData(i,0)=11
		EntityTexture ObjectEntity(i),WaterFallTexture
	Else
		EntityTexture ObjectEntity(i),PlasmaTexture
		EntityBlend ObjectEntity(i),3
	EndIf
	EntityFX ObjectEntity(i),1

	
	
	GlobalGrowFlowerCounter=GlobalGrowFlowerCounter+1
	
	If GlobalGrowFlowerCounter>5000
		; destroy
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		
		LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=ObjectData(i,0)
		
		DestroyObject(i,0)
		PlaySoundFX(84,ObjectTileX(i),ObjectTileY(i))
	EndIf
	
	If ObjectData(i,0)=12 Or ObjectData(i,0)=11
		EntityTexture ObjectEntity(i),WaterFallTexture
	Else
		EntityTexture ObjectEntity(i),PlasmaTexture
	;	EntityBlend ObjectEntity(i),3
	EndIf
	EntityFX ObjectEntity(i),1
;	EntityAlpha ObjectEntity(i),.5
	
	
	
	

	
	If GlobalGrowFlowerCounter>4000
		ObjectX(i)=Floor(ObjectX(i))+0.5+(Float(GlobalGrowFlowerCounter)/150000.0)*Rnd(-1,1)
		ObjectY(i)=Floor(ObjectY(i))+0.5+(Float(GlobalGrowFlowerCounter)/150000.0)*Rnd(-1,1)
	EndIf
	
	ObjectYaw(i)=ObjectYaw(i)+GlobalGrowFlowerCounter/1000.0
		
	
End Function
Function CreateFlashBubble(x,y)


	If (LevelTileLogic(x,y)=1); Or LevelTileLogic(x,y)=2 Or LevelTileLogic(x,y)=11 Or LevelTileLogic(x,y)=12 Or LevelTileLogic(x,y)=14)
		; can't make a bubble here
		Return
	EndIf
	
	; don't make extra floing bubbles
	For i=0 To nofObjects-1
		If ObjectType(i)=360
			If Floor(ObjectX(i))=x And Floor(ObjectY(i))=y Then Return
		EndIf
	Next
	
	
	
	i=CreateNewObject()
	
	ObjectModelName$(i)="!FlashBubble"
	ObjectTextureName$(i)=""

	PlaySoundFX(93,x,y)
	
	ObjectEntity(i)=CreateSphere()
	s=CreateCylinder()
	ScaleMesh s,0.5,0.01,0.5
	PositionMesh s,0,-0.58,0
	AddMesh s,ObjectEntity(i)
	FreeEntity s
	EntityTexture ObjectEntity(i),FlashTexture
	EntityAlpha ObjectEntity(i),0.5
	EntityBlend ObjectEntity(i),3
	ObjectXScale(i)=0.8
	ObjectYScale(i)=0.8
	ObjectZScale(i)=0.8
	ObjectYaw(i)=Rand(0,360)
	;ObjectPitch(i)=Rand(0,360)
	;ObjectRoll(i)=Rand(0,360)
	ObjectZAdjust(i)=.6

	
	
	ObjectTexture(i)=0
	;EntityTexture ObjectEntity(i),ObjectTexture(i)
	
	
	ObjectX(i)=x+0.5
	ObjectY(i)=y+0.5

	
	ObjectActive(i)=1
	ObjectActivationSpeed(i)=60
	ObjectActivationType(i)=2
	
	ObjectDX(i)=0
	ObjectDY(i)=0
	
	PositionEntity ObjectEntity(i),ObjectX(i)+.5,0,-ObjectY(i)-.5
	
	ObjectDestructionType(i)=1

	
	ObjectType(i)=360
	
	
	
	



End Function

Function ControlFlashBubble(i)

	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))

	If LevelTileLogic(Floor(ObjectX(i)),Floor(ObjectY(i)))=1  
		destroyobject(i,0)
		Return
	EndIf
	
	ObjectYaw(i)=ObjectYaw(i)+ObjectData(i,7)/1000.0



	
	
	TurnEntity ObjectENtity(i),0.1,0.15,0.27
	
	
	ObjectXScale(i)=0.8+0.1*Sin((LevelTimer+i*27) Mod 360)
	ObjectYScale(i)=0.8+0.1*Sin((LevelTimer+i*27)Mod 360)
	ObjectZScale(i)=0.8+0.1*Sin((LevelTimer+i*27)Mod 360)

	; check what enters
	For j=0 To NofObjects-1
		If ObjectFrozen(j)<10000 And (ObjectX(i)-ObjectX(j))^2+(ObjectY(i)-ObjectY(j))^2 <.4 And ObjectExists(j)=True And ObjectActive(j)>0
			Select ObjectType(j)
			
			Case 1,45,46,110,120,150,210,220,250,260,290,370,380,390,391,400,420,422,423,430,431,432,433,450,460,470,471
					; destroy
				ObjectTileX(i)=Floor(ObjectX(i))
				ObjectTileY(i)=Floor(ObjectY(i))
				
				DestroyObject(i,0)
				PlaySoundFX(84,ObjectTileX(i),ObjectTileY(i))
			Case 340
				If ObjectActive(j)>1 And ObjectActive(j)<1001
					; tentacles, only if theyre rised
						ObjectTileX(i)=Floor(ObjectX(i))
					ObjectTileY(i)=Floor(ObjectY(i))
					
					DestroyObject(i,0)
					PlaySoundFX(84,ObjectTileX(i),ObjectTileY(i))
				EndIf
			Case 50
				; freeze spell balls with exception of other FLASH
				If Objectsubtype(j)=5
					; destroy
					ObjectTileX(i)=Floor(ObjectX(i))
					ObjectTileY(i)=Floor(ObjectY(i))
					
					DestroyObject(i,0)
					DestroyObject(j,0)
					
					
					PlaySoundFX(84,ObjectTileX(i),ObjectTileY(i))
				Else
					If ObjectSubType(j)=6 And PlayerControlMode=5 Then PlayerControlMode=6
					
					ObjectData(i,7)=ObjectData(i,7)+1
					
				EndIf
				

			End Select
			
					If ObjectData(i,7)>5000
						ObjectTileX(i)=Floor(ObjectX(i))
						ObjectTileY(i)=Floor(ObjectY(i))
						
						DestroyObject(i,0)
						;DestroyObject(j,0)
						
						PlaySoundFX(84,ObjectTileX(i),ObjectTileY(i))
					EndIf
					
					
		EndIf
	Next

End Function
Function ControlRubberducky(i)

	
	If ObjectTileTypeCollision(i)=0
		ObjectTileTypeCollision(i)=-1 ; not really used
		ObjectObjectTypeCollision(i)=-1
		ObjectMoveXGoal(i)=ObjectTileX(i)
		ObjectMoveYGoal(i)=ObjectTileY(i)
	;ObjectMovementType(i)=11
		
		ObjectData(i,1)=Rand(1,3)
		ObjectData(i,2)=Rand(0,360)
		ObjectMovementSpeed(i)=4
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		
		
	EndIf
	
	If objectdata(i,0)=1
		If objectmovementtimer(i)=0
		
			If Rand(0,1000)<30
				ObjectData(i,3)=Rand(-1,1)
				ObjectData(i,4)=Rand(-1,1)
			
				x=ObjectTileX(i)+ObjectData(i,3)
				y=ObjectTileY(i)+ObjectData(i,4)
				If x>=0 And y>=0 And x<LevelWidth And y<LevelHeight
					If (LevelTileLogic(x,y)=2) And ObjectTileLogic(x,y)=0
						If (LevelTileLogic(ObjectTileX(i),y)=2) And ObjectTileLogic(ObjectTileX(i),y)=0
							If (LevelTileLogic(x,ObjectTileY(i))=2) And ObjectTileLogic(x,ObjectTileY(i))=0
		 
								MoveObjectToTile(i,x,y)
								ObjectMoveXGoal(i)=x
								ObjectMoveYGoal(i)=y
							EndIf
						EndIf
					EndIf
				EndIf
			EndIf
		Else
			TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),2,0)
			If Rand(0,100)<5
				AddParticle(4,ObjectX(i),-0.4,-ObjectY(i),0,.1,0,0,0,0,.004,0,0,0,100,4)

			EndIf
		
		EndIf
	

	Else
		TurnObjectTowardDirection(i,ObjectX(PlayerObject)-ObjectX(i),ObjectY(PlayerObject)-ObjectY(i),2,0)
	EndIf
		
		
	Objectroll2(i)=1*ObjectData(i,1)*Sin((LevelTimer+ObjectData(i,2)) Mod 360)
	Objectpitch2(i)=2*ObjectData(i,1)*Cos((LevelTimer*3+ObjectData(i,2))  Mod 360)

	
	If Rand(0,1500)<3
		SoundPitch SoundFX(121),Rand(19000,22000)
		PlaySoundFX(121,ObjectX(i),ObjectY(i))
	EndIf
	
	If leveltileLogic(Floor(ObjectX(i)),Floor(ObjectY(i)))<>2
		DestroyObject(i,0)
	EndIf

End Function

Function CreateVoidMesh()

	LevelExitEntity=CreateMesh()
	surface=CreateSurface(LevelExitEntity)
	For i=0 To 17
		AddVertex surface,.5*Sin(i*20),1,.5*Cos(i*20),i*.0555,0
		AddVertex surface,.1*Sin(i*20),0,.1*Cos(i*20),i*.0555,1
	Next
	For i=0 To 16
		AddTriangle surface,i*2,i*2+2,i*2+1
		AddTriangle surface,i*2+2,i*2+3,i*2+1
		AddTriangle surface,i*2+1,i*2+2,i*2
		AddTriangle surface,i*2+1,i*2+3,i*2+2

	Next
	AddTriangle surface,34,0,35
	AddTriangle surface,0,1,35
	AddTriangle surface,35,0,34
	AddTriangle surface,35,1,1
	For i=0 To 17
		AddVertex surface,.7*Sin(i*20),.5,.7*Cos(i*20),i*.0555,0
		AddVertex surface,.15*Sin(i*20),0,.15*Cos(i*20),i*.0555,1
	Next
	For i=18 To 34
		AddTriangle surface,i*2,i*2+2,i*2+1
		AddTriangle surface,i*2+2,i*2+3,i*2+1
		AddTriangle surface,i*2+1,i*2+2,i*2
		AddTriangle surface,i*2+1,i*2+3,i*2+2

	Next
	AddTriangle surface,70,36,71
	AddTriangle surface,36,37,71
	AddTriangle surface,71,36,70
	AddTriangle surface,71,37,36


	UpdateNormals LevelExitEntity
	EntityBlend LevelExitEntity,3
;	EntityAlpha LevelExitEntity,.5
	
	EntityTexture LevelExitEntity,VoidTexture
	
;	PositionEntity LevelExitEntity,x+.5,0,-y-.5



	Return LevelExitEntity
End Function

Function ControlVoid(i)

	If ObjectData(i,0)=0
		ObjectData(i,0)=Rand(1,360)
	EndIf

	ObjectZ(i)=-.2
	
	PositionTexture voidtexture,((leveltimer/10) Mod 100)/100.0,((leveltimer/10) Mod 100)/100.0

	If objectactive(i)>0
		leveltilelogic(Floor(ObjectX(i)),Floor(ObjectY(i)))=1
		If objectlastactive(i)=0 
			CameraShakeTimer=120
			PlaySoundFX(122,-1,-1)
		EndIf
		If leveltimer Mod 400 =0
			PlaySoundFX(123,ObjectX(i),ObjectY(i))
		EndIf
			
	Else
		leveltilelogic(Floor(ObjectX(i)),Floor(ObjectY(i)))=0
	EndIf
	
	ObjectXScale(i)=(.8+.4*Sin((leveltimer+objectData(i,0)) Mod 360))*(1.0+Float(ObjectData(i,2)))
	ObjectYScale(i)=(.8+.4*Sin((leveltimer+objectData(i,0)) Mod 360))*(1.0+Float(ObjectData(i,2)))

	ObjectZScale(i)=(1.3+.6*Sin((leveltimer*2+objectData(i,0)) Mod 360));*(1.0+Float(ObjectData(i,2)))

		
	TurnEntity ObjectENtity(i),0,.1,0
	surface=GetSurface(ObjectENtity(i),1)
	For i=0 To 17
		VertexCoords surface,i*2,VertexX(surface,i*2),(1+.6*Sin(i*80+((LevelTimer*4) Mod 360))),VertexZ(surface,i*2)
	Next
	For i=18 To 35
		VertexCoords surface,i*2,VertexX(surface,i*2),(.5+.4*Sin(i*160+((LevelTimer*4) Mod 360))),VertexZ(surface,i*2)
	Next
	
	

	; dont use i

	
	
	

End Function

Function ControlTentacle(i)

	If ObjectData(i,0)=0 Then ObjectData(i,0)=Rand(-10,10)
	TurnEntity GetChild(ObjectEntity(i),3),0,Float(ObjectData(i,0))/10.0,0
	x=Floor(ObjectX(i))
	y=Floor(ObjectY(i))
	; check if player or stinkers or wee stinkers closeby
	flag=False
	For j=0 To NofObjects-1
		If ObjectTYpe(j)=1 Or ObjectType(j)=110 Or ObjectTYpe(j)=120
			If Abs(ObjectTileX(j)-Floor(ObjectX(i)))<3 And Abs(ObjectTileY(j)-Floor(ObjectY(i)))<3
				flag=True
				j=NofObjects
			EndIf
		EndIf
	Next
	
	logic=2^5
	If ObjectSubType(i)=1
		flag=Not flag
		logic=logic+2^9
	EndIf
	
				

	
	If flag=True
		; yes
		If ObjectActive(i)>1
			If ObjectActive(i)=1001 PlaySoundFX(112,Floor(ObjectX(i)),Floor(ObjectY(i)))
			ObjectActive(i)=ObjectActive(i)-80
			If ObjectActive(i)<1 Then ObjectActive(i)=1
		
			If ObjectActive(i)=1
				If (ObjectTileLogic(x,y) And logic) >0
					ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-logic
				EndIf
				
				

				
			EndIf
		EndIf
	Else
		;no
		; (only start reappearing if empty tile)
		
		
				
				
		If ObjectActive(i)<1001 And (ObjectActive(i)>1 Or ObjectTileLogic(Floor(ObjectX(i)),Floor(ObjectY(i)))=0)
			If ObjectActive(i)=1 Then PlaySoundFX(111,Floor(ObjectX(i)),Floor(ObjectY(i)))
			ObjectActive(i)=ObjectActive(i)+20

			If (ObjectTileLogic(x,y) And logic) =0
				ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+logic
			EndIf
			
				

			

		EndIf

	EndIf
	
	For j=0 To NofObjects-1
					If (ObjectX(i)-ObjectX(j))^2+(ObjectY(i)-ObjectY(j))^2 <.3 And ObjectExists(j)=True And ObjectActive(j)>0
						If ObjectType(j)=50 And ObjectSubType(j)<2 And ObjectSubType(i)=1 And ObjectActive(i)>1
							; if spellball and destructive and reverse tentacle and active
							ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-logic
							DestroyObject(i,2)
							; if zapbot magic - continue shooting
							If ObjectData(j,8)<>-99 Then DestroyObject(j,0)
							
						EndIf
						If ObjectType(j)=50 And ObjectActive(i)>1
							; if spellball and tentacle is active
							If ObjectData(j,8)=-99 And ObjectSubType(i)=1
							Else
								; if not zapbot magic on reverse tentacle then destroy the spell
								DestroyObject(j,0)
							EndIf
							If ObjectSubType(j)=6 And PlayerControlMode=5 Then PlayerControlMode=6
						EndIf
						
					EndIf
				Next

End Function

Function ControlRainbowBubble(i)

	


	EntityAlpha ObjectEntity(i),.8
	EntityBlend ObjectEntity(i),3	

	If ObjectTileTypeCollision(i)=0
		; First time (should later be put into object creation at level editor)
		ObjectTileTypeCollision(i)=2^0+2^2+2^3+2^4+2^9+2^10+2^11+2^12+2^14
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileX2(i)=Floor(ObjectX(i))
		ObjectTileY2(i)=Floor(ObjectY(i))
		ObjectMovementTimer(i)=0
		ObjectMovementSpeed(i)=25
		ObjectMovementType(i)=33
		ObjectYawAdjust(i)=Rand(0,360)
		ObjectRollAdjust(i)=Rand(0,360)
		ObjectPitchAdjust(i)=Rand(0,360)


		
		;ObjectObjectTypeCollision(i)=2^6
		
		ObjectData(i,2)=Rand(0,360)

		
	EndIf
	
	
	
	l=leveltimer/4+objectData(i,2)
	
	ObjectXScale(i)=0.5-0.1*Sin((leveltimer + objectData(i,2)) Mod 360)

	ObjectYScale(i)=0.5-0.1*Sin((leveltimer + objectData(i,2)) Mod 360)

	ObjectZScale(i)=0.6+0.2*Sin((leveltimer + objectData(i,2)) Mod 360)

	
	ObjectPitch(i)=(ObjectPitch(i)+1) Mod 360
	ObjectYaw2(i)=360*Sin(l Mod 360)
	ObjectRoll(i)=180*Cos(l Mod 360)

	

	
	
	ObjectZ(i)=0.5+0.3*Abs(Sin((leveltimer + objectData(i,2)) Mod 360))
	
	


End Function



Function CreatePlantFloat(x,y)
	
	i=CreateNewObject()
	
	
	ObjectModelName$(i)="!PlantFloat"
	ObjectTextureName$(i)=""

	
	ObjectEntity(i)=CreatePlantFloatMesh()
	
	ObjectTexture(i)=0
	;EntityTexture ObjectEntity(i),ObjectTexture(i)
	
	ObjectDestructionType(i)=0
	ObjectActive(i)=901
	ObjectActivationSpeed(i)=20
	ObjectActivationType(i)=2

	LevelTileLogic(x,y)=4
	
	ObjectType(i)=301

	
	ObjectX(i)=x+.5
	ObjectY(i)=y+.5
	ObjectTileX(i)=x
	ObjectTileY(i)=y
	
	ObjectData(i,1)=Rand(0,360)
	Objectdata(i,2)=Rand(-3,3)
	ObjectData(i,3)=Rand(-3,3)

End Function

Function CreatePlantFloatMesh()
	Entity=CreateCylinder(9,True)
	;For i=1 To CountVertices (GetSurface(entity,1))-1
	;	VertexCoords GetSurface(entity,1),i,VertexX(GetSurface(entity,1),i)+Rnd(-.1,.1),VertexY(GetSurface(entity,1),i),VertexZ(GetSurface(entity,1),i)+Rnd(-.1,.1)
	;Next
	ScaleMesh Entity,.45,.05,.45
	PositionMesh Entity,0,-.1,0
	EntityAlpha Entity,.7
	EntityBlend Entity,3
	EntityColor Entity,0,255,0
	Return Entity
End Function
Function ControlPlantFloat(i)

	If ObjectData(i,2)=0 Then ObjectData(i,2)=Rand(1,360)

	l=leveltimer+ObjectData(i,2)
	EntityColor ObjectEntity(i),128+120*Cos(l Mod 360),128+120*Sin(l Mod 360),200+50*Cos(l Mod 360)
	If ObjectData(i,0)>0
		; deactivating
		ObjectData(i,0)=ObjectData(i,0)-1
		If ObjectData(i,0)=1
			If LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=4 Then LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=2
			destroyObject(i,0)
		EndIf
	Else
		LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=4
	EndIf
	
	;ObjectPitch(i)=4*ObjectData(i,2)*Sin((LevelTimer + ObjectData(i,1)) Mod 360)
	;Objectroll(i)=6*ObjectData(i,3)*Cos((LevelTimer+ ObjectData(i,1))  Mod 360)
	ObjectYaw(i)=leveltimer Mod 360
	
	
	If ObjectID(i)=-1
		ObjectID(i)=500+(8+ObjectData(i,0))*5+ObjectData(i,1)
	EndIf

	x=Floor(ObjectX(i))
	y=Floor(ObjectY(i))
	ObjectTileX(i)=x
	ObjectTileY(i)=y


	If ObjectData(i,0)=0
		; Collapse?
	
		; check if there's weight on it
		
		Weight=False
		
		For j=0 To NofObjects-1
			If ObjectExists(j)=True And ObjectButtonPush(j)=True And i<>j
				; check if object is on tile - either first part of movement (or rest) and x/y, or last part of movement and x2/y2
				If (ObjectTileX(j)=ObjectTileX(i) And ObjectTileY(j)=ObjectTileY(i) And ObjectMovementTimer(j)<500) Or (ObjectTileX2(j)=ObjectTileX(i) And ObjectTileY2(j)=ObjectTileY(i) And ObjectMovementTimer(j)>=500)
					If ObjectFlying(j) /10 <>1
						; Yup
						
						weight=True
					EndIf
				
				EndIf
			EndIf
						
		Next

		
		
		If ObjectStatus(i)=1
			If weight=False
				ObjectStatus(i)=0
				ObjectData(i,0)=40
				ObjectActive(i)=400
				PlaySoundFX(124,ObjectX(i),ObjectY(i))
			EndIf
		Else
			If weight=True
				ObjectStatus(i)=1
			EndIf
		EndIf
	EndIf


End Function
Function ControlCrab(i)

	;subtype -0-male, 1-female
	;data1 - 0-normal,1-curious, 2- asleep, 3- disabled
	;status - 0 normal, 2 submerged

	If ObjectTileTypeCollision(i)=0
		; First time (should later be put into object creation at level editor)
		If ObjectSubType(i)=0
			; male
			ObjectTileTypeCollision(i)=2^0+2^3+2^4+2^9+2^10+2^11+2^12+2^14
			ObjectObjectTypeCollision(i)=2^6
			Select ObjectData(i,1)
			Case 0
				; normal
				ObjectMovementType(i)=0
			Case 1
				; curious
				ObjectMovementType(i)=32
			Case 2,3
				; asleep
				ObjectMovementType(i)=0
				AnimateMD2 ObjectEntity(i),3,1,48,49
			End Select
			ObjectXScale(i)=0.006
			ObjectYScale(i)=0.006
			ObjectZScale(i)=0.006
		Else
			;female
			ObjectTileTypeCollision(i)=2^0+2^2+2^3+2^4+2^9+2^10+2^11+2^12+2^14
			ObjectObjectTypeCollision(i)=2^6
			Select ObjectData(i,1)
			Case 0
				; normal
				ObjectMovementType(i)=32
			Case 1
				; curious
				ObjectMovementType(i)=0
			Case 2,3
				; asleep
				ObjectMovementType(i)=0
				AnimateMD2 ObjectEntity(i),3,1,48,49
			End Select

		EndIf
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileX2(i)=Floor(ObjectX(i))
		ObjectTileY2(i)=Floor(ObjectY(i))
		ObjectMovementTimer(i)=0
		ObjectCurrentAnim(i)=0
		ObjectMovementSpeed(i)=40
		
		

		
	EndIf
	
	; anim
	; 1-idle
	; 2-walk
	; 3-walk (used for non-stop animation between tiles)
	; 4-retract
	; 5-come out
	If ObjectFrozen(i)>0
		AnimateMD2 ObjectEntity(i),2,.01,1,2
		ObjectCurrentAnim(i)=0
	Else If ObjectMovementTimer(i)=0 And (ObjectCurrentAnim(i)=0 Or ObjectCurrentAnim(i)=3) And Objectdata(i,1)<2
		
		
		AnimateMD2 ObjectEntity(i),2,Rnd(.02,.04),1,13
		ObjectCurrentAnim(i)=1
		
		
	Else If ObjectCurrentAnim(i)=2 
		ObjectCurrentAnim(i)=3
	Else If ObjectMovementTimer(i)>0 And (ObjectCurrentAnim(i)=0 Or ObjectCurrentAnim(i)=1 Or ObjectCurrentAnim(i)=20)
		AnimateMD2 ObjectEntity(i),1,1,1,30
		ObjectCurrentAnim(i)=2
	Else If ObjectCurrentAnim(i)>=5 And ObjectCurrentAnim(i)<20
		; delay for coming out anim so it doesn' immediately go into walking
		ObjectCurrentAnim(i)=ObjectCurrentAnim(i)+1
	EndIf



	If ObjectFrozen(i)=1
		; freeze
		ObjectFrozen(i)=1000*ObjectFrozen(i)

		ObjectPitch(i)=Rand(-30,30)
		ObjectRoll(i)=Rand(-30,30)
		ObjectZ(i)=.3
	
	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		ObjectPitch(i)=0
		ObjectRoll(i)=0
		ObjectZ(i)=0
		ObjectCurrentAnim(i)=0
		ObjectData(i,1)=0
		If ObjectSubType(i)=1 Then ObjectMovementType(i)=32
	EndIf
	If ObjectFrozen(i)>2 Or ObjectFrozen(i)<0
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		Return
	EndIf
	
	If ObjectStatus(i)=0 And ObjectMovementTimer(i)=0 And Abs(ObjectX(i)-ObjectX(PlayerObject))<.5 And Abs(ObjectY(i)-ObjectY(PLayerObject))<.5
		; bingo!
		a=1
		b=1
		If Rand(0,100)<50 a=-1
		If Rand(0,100)<50 b=-1
		For x=-1 To 1 
			For y=-1 To 1
				; check surrounding tiles for empty field
				If (x<>0 Or y<>0) And CanObjectMoveToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b,True,True)=True
					; found one
					MoveObjectToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b)
					
					ObjectMoveXGoal(i)=ObjectTileX(i)+x*a
					ObjectMoveYGoal(i)=ObjectTileY(i)+y*b
					x=2
					y=2
				EndIf
			Next
		Next
		
	EndIf
	
	; object behaviour
	If ObjectStatus(i)=0
		Select ObjectData(i,1)
		
		Case 0
			; awake - male, switch  to curious if close
			If ObjectSubType(i)=0 And ObjectStatus(i)=0
				If Abs(ObjectTileX(i)-ObjectTileX(PlayerObject))<4 And Abs(ObjectTileY(i)-ObjectTileY(PlayerObject))<6
					ObjectMovementType(i)=14
					

				EndIf
			EndIf
		Case 1
			; curious - male, if standing on player, move away
			If (objectsubtype(i)=1 And (objectstatus(i)=0)) Then
				If (Abs(objecttilex(i)-objecttilex(playerobject))<4 And (Abs(objecttiley(i)-objecttiley(playerobject))<6)) Then
					objectmovementtype(i)=14
				End If
			End If
			
	
			
		Case 2
			; asleep - awake if close
			If Abs(ObjectTileX(i)-ObjectTileX(PlayerObject))<4 And Abs(ObjectTileY(i)-ObjectTileY(PlayerObject))<4
				; wake up
			
				VacateObjectTile(i)
				ObjectData(i,1)=0
				OccupyObjectTile(i,ObjectTileX2(i),ObjectTileY2(i))
				If ObjectSubType(i)=0
					ObjectMovementType(i)=14
				Else
					ObjectMovementType(i)=32
				EndIf
				AnimateMD2 ObjectEntity(i),3,-0.5,49,31
				ObjectCurrentAnim(i)=5
				SoundPitch SoundFX(116),Rand(39000,42000)
				PlaySoundFX(116,ObjectX(i),ObjectY(i))
			EndIf
		End Select
	EndIf
	

	If ObjectCaged(i)=True And ObjectData(i,0)=0
		; just caged
		ObjectData(i,0)=1
		NofCrabsInAdventure=NofCrabsInAdventure-1
		PlaySoundFX(101,ObjectTIleX(i),ObjectTIleY(i))
		AddParticle(14,ObjectTileX(i)+0.5,1.6,-ObjectTileY(i)-0.5,0,1,0,0.01,0,0,.01,0,0,0,50,3)
		PlayerScore=PlayerScore+100
		CurrentAdventureScore=CurrentAdventureScore+100

	EndIf
	
	If ObjectCaged(i)=False And ObjectData(i,0)=1
		; just released
		ObjectData(i,0)=0
		NofCrabsInAdventure=NofCrabsInAdventure+1
		PlayerScore=PlayerScore-100
		CurrentAdventureScore=CurrentAdventureScore-100


		
		; check if not-moving right now: run to a safe spot if possible
		If ObjectMovementTimer(i)=0
			; bingo!
			a=1
			b=1
			If Rand(0,100)<50 a=-1
			If Rand(0,100)<50 b=-1
			For x=-1 To 1 
				For y=-1 To 1
					; check surrounding tiles for empty field
					If CanObjectMoveToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b,True,True)=True
						; found one
						MoveObjectToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b)
						
						ObjectMoveXGoal(i)=ObjectTileX(i)+x*a
						ObjectMoveYGoal(i)=ObjectTileY(i)+y*b
						x=2
						y=2
					EndIf
				Next
			Next
			; if you couldn't find an escape spot you'll just stay there -in which case the
			; cage will close again immediately
		EndIf

	EndIf
	
	If ObjectMovementType(i)=14 ; toward player
		ObjectMoveXGoal(i)=ObjectTileX(PlayerObject)
		ObjectMoveYGoal(i)=ObjectTileY(PlayerObject)
	EndIf
	
	
	If ObjectStatus(i)=2
		; in water
		ObjectZ(i)=-.1
		LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=0
		
	EndIf

	If ObjectStatus(i)=0 And ObjectData(i,1)<2
		ObjectZ(i)=0
		If ObjectMovementTimer(i)>0 
			TurnObjectTowardDirection(i,-(ObjectTileX2(i)-ObjectTileX(i)),-(ObjectTileY2(i)-ObjectTileY(i)),10,0)
		Else
			TurnObjectTowardDirection(i,-(ObjectX(PlayerObject)-ObjectX(i)),-(ObjectY(PlayerObject)-ObjectY(i)),6,0)
		EndIf
	EndIf
	
	If ObjectMovementTimer(i)>0 And ObjectData10(i)=0 
		If ObjectSubType(i)=0
			SoundPitch SoundFX(115),20000
		Else
			SoundPitch SoundFX(115),18000
		EndIf
		SoundVolume SoundFX(115),.1
		PlaySoundFX(115,ObjectX(i),ObjectY(i))
	EndIf
		

	ObjectData10(i)=ObjectMovementTimer(i)



End Function

Function ControlTroll(i)

	If ObjectFrozen(i)=1
		ObjectFrozen(i)=1000*ObjectFrozen(i)
		AnimateMD2 objectentity(i),3,.5,121,135
		PlaySoundFX(114,ObjectX(i),ObjectY(i))

	EndIf
	If ObjectFrozen(i)=2
		; revert
		AnimateMD2 objectentity(i),2,0.005,81,82
		ObjectCurrentAnim(i)=10
		ObjectTimer(i)=ObjectData(i,7)
		ObjectFrozen(i)=0
	EndIf
	If ObjectFrozen(i)>2 Or ObjectFrozen(i)<=-1
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		Return
	EndIf


	If ObjectTileTypeCollision(i)=0
		; First time (should later be put into object creation at level editor)
		ObjectData10(i)=-1

		ObjectTileTypeCollision(i)=2^0+2^3+2^4+2^9+2^11+2^12+2^14
		ObjectObjectTypeCollision(i)=2^4+2^6
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileX2(i)=Floor(ObjectX(i))
		ObjectTileY2(i)=Floor(ObjectY(i))
		If ObjectMoveXGoal(i)=0 And ObjectMoveYGoal(i)=0
			ObjectMoveXGoal(i)=Floor(ObjectX(i))
			ObjectMoveYGoal(i)=Floor(ObjectY(i))
			AnimateMD2 objectentity(i),2,0.005,81,82

			ObjectCurrentAnim(i)=10
			
		EndIf
		
				
		
	EndIf
	If objectdata(i,2)>0
		EntityTexture objectentity(i),thwarttexture((objectdata(i,2)) Mod 8)
	EndIf
	
	If ObjectActive(i)=0
		HideEntity(ObjectEntity(i))
	Else
		ShowEntity(ObjectEntity(i))
	EndIf
	
	; Calculate distance to player - used several times
	Dist=maximum2(Abs(ObjectTileX(i)-ObjectTileX(PlayerObject)),Abs(ObjectTileY(i)-ObjectTileY(PlayerObject)))
		
	If ((GameMode<>8 Or DialogObject1<>i) And ObjectLinked(i)=-1) And ObjectData10(i)>=0
		
		; just restarted after talking and/or after transporter
		ObjectMoveXGoal(i)=ObjectData10(i) Mod 200
		ObjectMoveYGoal(i)=ObjectData10(i) / 200
		ObjectMovementType(i)=10

		ObjectData10(i)=-1
	EndIf
		
	; stop moving when the NPC is talking
	If GameMode=8 And DialogObject1=i
		If ObjectCurrentAnim(i)<>10 And ObjectData(i,8)<>7 
			ObjectCurrentAnim(i)=10
			;Animate GetChild(objectentity(i),3),1,.05,10
		EndIf
	Else If ObjectMovementType(i)>0
		; Moving
		If ObjectMovementTimer(i)=0 Then ObjectData(i,9)=ObjectData(i,9)+1
		If ObjectMovementTimer(i)>0 Then ObjectData(i,9)=0
		
		If ObjectData(i,9)>10 ; has been standing for a bit
			AnimateMD2 objectentity(i),2,0.005,81,82

			ObjectCurrentAnim(i)=10
			TurnObjectTowardDirection(i,(ObjectTileX(i)-ObjectMoveXGoal(i)),(ObjectTileY(i)-ObjectMoveYGoal(i)),4,-ObjectYawAdjust(i))
		Else
			
			If ObjectCurrentAnim(i)<>1
				If ObjectData(i,1)=1
					; hands up running
					AnimateMD2 objectentity(i),2,1,42,79
				Else
					; normal
					AnimateMD2 objectentity(i),2,1,2,39

				EndIf
				ObjectCurrentAnim(i)=1
			EndIf
			TurnObjectTowardDirection(i,(ObjectTileX(i)-ObjectTileX2(i)),(ObjectTileY(i)-ObjectTileY2(i)),4,-ObjectYawAdjust(i))
		EndIf
			
		; At Goal?
		If ObjectMovementTimer(i)=0 And ObjectTileX(i)=ObjectMoveXGoal(i) And ObjectTileY(i)=ObjectMoveYGoal(i)
			; Done - revert to standing
			ObjectMovementType(i)=0
			ObjectCurrentAnim(i)=10
			AnimateMD2 objectentity(i),2,0.005,81,82

		EndIf
		
	Else If ObjectFlying(i)/10=1
		; flying
		If ObjectCurrentAnim(i)<>11
		;	Animate GetChild(objectentity(i),3),1,1,11
			ObjectCurrentAnim(i)=11
		EndIf
		TurnObjectTowardDirection(i,(ObjectTileX(i)-ObjectTileX2(i)),(ObjectTileY(i)-ObjectTileY2(i)),10,-ObjectYawAdjust(i))
	Else If ObjectFlying(i)/10=2
		; on ice
		If ObjectCurrentAnim(i)<>13
		;	Animate GetChild(objectentity(i),3),3,2,13
			ObjectCurrentAnim(i)=13
		EndIf

	Else 
		; standing controls
		
		; turn towart player - if present!
		If ObjectType(playerobject)=1 And playerobject<nofobjects
			TurnObjectTowardDirection(i,-ObjectX(PlayerObject)+ObjectX(i),-ObjectY(PlayerObject)+ObjectY(i),6,-ObjectYawAdjust(i))
		Else
			If Objectstatus(i)=0
				ObjectYaw(i)=ObjectYaw(i)+180
				Objectstatus(i)=1
			EndIf
		EndIf
		; shooting?
		If ObjectData(i,6)>0 And ObjectActive(i)=1001
			dx#=ObjectX(PlayerObject)-ObjectX(i)
			dy#=ObjectY(PlayerObject)-ObjectY(i)
			total#=Sqr(dx^2+dy^2)
			dx=dx/total
			dy=dy/total
			
			ObjectTimer(i)=ObjectTimer(i)-1
			
			If ObjectTimer(i)<0
				If ObjectTimer(i)=-10
					; aquire target now
					ObjectData(i,4)=dx*10000
					ObjectData(i,5)=dy*10000
				EndIf
				If ObjectTimer(i)=-1
					AnimateMD2 ObjectEntity(i),3,1,81,119,1
					
				EndIf
			
				If ObjectTimer(i)=-40
					ObjectTimer(i)=ObjectData(i,7)
				EndIf
				
				; and fire
				If ObjectTimer(i)=-30
					dx#=Float(ObjectData(i,4))/5000.0
					dy#=Float(ObjectData(i,5))/5000.0
					If LevelTileLogic(ObjectTileX(i)+dx,ObjectTileY(i)+dy)<>1
						CreateSpellBall(ObjectTileX(i)+.5+.6*dx,ObjectTileY(i)+.5+.6*dy,1.1,.1*dx,.1*dy,4,-1,-1,False,300)
					EndIf
					PlaySoundFX(103,ObjectTIleX(i),ObjectTIleY(i))
					PlaySoundFX(113,ObjectX(i),ObjectY(i))

					
				EndIf
		
				
			EndIf
		EndIf



	EndIf

	; check if a pickup has occured
	If (ObjectTileLogic(ObjectTileX(i),ObjectTileY(i)) And 2^4) >0
		; standing on item
		
		For j=0 To NofObjects-1
			If objecttype(j)/10=17 And ObjectActive(j)=1001
				If ObjectTileX(j)=ObjectTileX(i) And ObjectTileY(j)=ObjectTileY(i)
					; got something - pick it up!
					PlaySoundFX(107,ObjectX(i),ObjectY(i))

					ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))=ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))-2^4
									
					ObjectActivationType(j)=0
					ObjectActivationSpeed(j)=20
			
					DeActivateObject(j)
					
				EndIf
			EndIf
		Next
	EndIf
						
					
	If ObjectMovementTimer(i)>0 And ObjectData(i,3)=0 Then PlaySoundFX(106,ObjectX(i),ObjectY(i))

	ObjectData(i,3)=ObjectMovementTimer(i)


End Function
Function ControlKaboom(i)
	
	If ObjectFrozen(i)=1
		; freeze
		ObjectFrozen(i)=1000*ObjectFrozen(i)

		ObjectCurrentAnim(i)=11
		;Animate GetChild(objectentity(i),3),3,1,11	*** INSERT SIT ANIMATION (FAST)
		AnimateMD2 ObjectEntity(i),3,2,31,50
		;PlaySoundFX(85,ObjectX(i),ObjectY(i))

	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		ObjectCurrentAnim(i)=10
		AnimateMD2 ObjectEntity(i),0,.2,1,2

	EndIf
	If ObjectFrozen(i)>2 Or ObjectFrozen(i)<0
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		Return
	EndIf


	If ObjectTileTypeCollision(i)=0
		; First time (should later be put into object creation at level editor)
		ObjectData10(i)=-1

		ObjectTileTypeCollision(i)=2^0+2^3+2^4+2^9+2^11+2^12+2^14
		ObjectObjectTypeCollision(i)=2^6
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileX2(i)=Floor(ObjectX(i))
		ObjectTileY2(i)=Floor(ObjectY(i))
		ObjectActivationSpeed(i)=50
		If ObjectMoveXGoal(i)=0 And ObjectMoveYGoal(i)=0
			ObjectMoveXGoal(i)=Floor(ObjectX(i))
			ObjectMoveYGoal(i)=Floor(ObjectY(i))
			;ObjectMovementType(i)=0
			;ObjectMovementTimer(i)=0
			;ObjectSubType(i)=0  
			ObjectCurrentAnim(i)=10
			AnimateMD2 ObjectEntity(i),0,.2,1,2

		EndIf
		
				
		
	EndIf
	
	
	If ObjectDead(i)=1
		; spinning out of control
		ObjectYaw(i)=(ObjectYaw(i)+10) Mod 360
		ObjectZ(i)=ObjectZ(i)+.01
		
		Return
	EndIf
	If ObjectDead(i)=3
		; drowning
		ObjectYaw(i)=0
		ObjectZ(i)=ObjectZ(i)-.005
		
		Return
	EndIf

	
	If ObjectActive(i)=0
		HideEntity(ObjectEntity(i))
	Else
		ShowEntity(ObjectEntity(i))
	EndIf
	
	; Calculate distance to player - used several times
	Dist=maximum2(Abs(ObjectTileX(i)-ObjectTileX(PlayerObject)),Abs(ObjectTileY(i)-ObjectTileY(PlayerObject)))
	; Exclamation
	If ObjectExclamation(i)>=100 And ObjectExclamation(i)<200 And Dist>4
		ObjectExclamation(i)=ObjectExclamation(i)-100
	EndIf
	If ObjectExclamation(i)>=0 And ObjectExclamation(i)<100 And Dist<4
		
		AddParticle(ObjectExclamation(i),ObjectTileX(i)+.5,1.3,-ObjectTileY(i)-.5,0,.5,0,0.0125,0,0,.004,0,-.0001,0,150,3)
		ObjectExclamation(i)=ObjectExclamation(i)+100
	EndIf
	
		
	If ((GameMode<>8 Or DialogObject1<>i) And ObjectLinked(i)=-1) And ObjectData10(i)>=0
		
		; just restarted after talking and/or after transporter
	;	If ObjectMoveXGoal(i)=ObjectTileX(i) And ObjectMoveYGoal(i)=ObjectTileY(i)
			ObjectMoveXGoal(i)=ObjectData10(i) Mod 200
			ObjectMoveYGoal(i)=ObjectData10(i) / 200
			ObjectMovementType(i)=10
	;	EndIf
		ObjectData10(i)=-1
	EndIf
		
	
	If GameMode=8 And DialogObject1=i
		; stop moving when the NPC is talking 
		
		If ObjectCurrentAnim(i)<>10 And ObjectCurrentAnim(i)<>16
			ObjectCurrentAnim(i)=10
			AnimateMD2 ObjectEntity(i),0,.2,1,2
		EndIf
		ObjectZ(i)=0

	Else If ObjectMovementType(i)>0
		; Moving
		If ObjectMovementTimer(i)=0 Then ObjectData(i,9)=ObjectData(i,9)+1
		If ObjectMovementTimer(i)>0 Then ObjectData(i,9)=0
		ObjectZ(i)=0
		
		If ObjectData(i,9)>10 ; has been standing for a bit
			AnimateMD2 ObjectEntity(i),0,.2,1,2
			ObjectCurrentAnim(i)=10
			TurnObjectTowardDirection(i,-(ObjectTileX(i)-ObjectMoveXGoal(i)),-(ObjectTileY(i)-ObjectMoveYGoal(i)),4,-ObjectYawAdjust(i))
		Else
			
			If ObjectCurrentAnim(i)<>1
				;Animate GetChild(objectentity(i),3),1,.4,ObjectData(i,6)+1
				AnimateMD2 ObjectEntity(i),1,1.5,1,30
				ObjectCurrentAnim(i)=1
			EndIf
			TurnObjectTowardDirection(i,-(ObjectTileX(i)-ObjectTileX2(i)),-(ObjectTileY(i)-ObjectTileY2(i)),4,-ObjectYawAdjust(i))
		EndIf
			
		; At Goal?
		If ObjectMovementTimer(i)=0 And ObjectTileX(i)=ObjectMoveXGoal(i) And ObjectTileY(i)=ObjectMoveYGoal(i)
			; Done - revert to standing
			ObjectMovementType(i)=0
			ObjectCurrentAnim(i)=10
			
			AnimateMD2 ObjectEntity(i),0,.2,1,2

		EndIf
		
	Else If ObjectFlying(i)/10=1
		; flying
		If ObjectCurrentAnim(i)<>11
			;Animate GetChild(objectentity(i),3),1,1,11
			AnimateMD2 ObjectEntity(i),3,2,31,60
			ObjectCurrentAnim(i)=11
		EndIf
		TurnObjectTowardDirection(i,-(ObjectTileX(i)-ObjectTileX2(i)),-(ObjectTileY(i)-ObjectTileY2(i)),10,-ObjectYawAdjust(i))
	Else If ObjectFlying(i)/10=2
		; on ice
		If ObjectCurrentAnim(i)<>11
			;Animate GetChild(objectentity(i),3),3,2,13
			AnimateMD2 ObjectEntity(i),3,2,31,60
			ObjectCurrentAnim(i)=11
		EndIf

	Else 
		; standing controls
		
		; Turning?
		Select ObjectData(i,7) Mod 10
		Case 0
			; Turn toward ObjectYawAdjust, i.e. Angle 0
			If ObjectYaw(i)<>0
				TurnObjectTowardDirection(i,0,1,4,0)
			EndIf
		Case 1
			; Turn Toward Player
			TurnObjectTowardDirection(i,ObjectX(PlayerObject)-ObjectX(i),ObjectY(PlayerObject)-ObjectY(i),6,-ObjectYawAdjust(i))
		
		Case 2
			; Various turning options
			ObjectYaw(i)=(ObjectYaw(i)-.5) Mod 360
		Case 3
			; Various turning options
			ObjectYaw(i)=(ObjectYaw(i)-2) Mod 360
		Case 4
			; Various turning options
			ObjectYaw(i)=(ObjectYaw(i)+.5) Mod 360
		Case 5
			; Various turning options
			ObjectYaw(i)=(ObjectYaw(i)+2) Mod 360
		End Select
		; Jumping?
		If ObjectData(i,7)/10=1
			ObjectZ(i)=0.4*Abs(Sin((Float(Leveltimer)*3.6) Mod 360))
		Else If ObjectData(i,7)/10=2
			ObjectZ(i)=0.2*Abs(Sin((Float(Leveltimer)*7.2) Mod 360))
		EndIf
		; Animation?
		Select ObjectData(i,8)
		Case 0
			; Just Swaying
			If ObjectCurrentAnim(i)<>10
				ObjectCurrentAnim(i)=10
				;Animate GetChild(objectentity(i),3),1,.05,10
				AnimateMD2 ObjectEntity(i),0,.2,1,2
			EndIf
		
		Case 1
			; Just Sit
			If ObjectCurrentAnim(i)<>13
				ObjectCurrentAnim(i)=13
				;Animate GetChild(objectentity(i),3),3,.2,14
				AnimateMD2 ObjectEntity(i),3,.5,31,50
			EndIf
		Case 2
			; Sit if far from player, otherwise stand
			
			If ObjectCurrentAnim(i)<>13 And dist>3
				ObjectCurrentAnim(i)=13
				;Animate GetChild(objectentity(i),3),3,.4,14
				AnimateMD2 ObjectEntity(i),3,.5,31,50
			EndIf
			If ObjectCurrentAnim(i)<>113 And dist<=3
				ObjectCurrentAnim(i)=113
				;Animate GetChild(objectentity(i),3),3,-.4,14
				AnimateMD2 ObjectEntity(i),3,-.5,50,31
			EndIf
		

		Case 3
			; Shiver from time to time
			If ObjectCurrentAnim(i)=10
				If Rand(1,10)<5 And Leveltimer Mod 240 =0 
					ObjectCurrentAnim(i)=15
					;Animate GetChild(objectentity(i),3),1,.4,11
					AnimateMD2 ObjectEntity(i),2,.5,55,70
					
				EndIf
			Else 
				If Leveltimer Mod 240 =0 
					ObjectCurrentAnim(i)=10
					;Animate GetChild(objectentity(i),3),1,.05,10
					AnimateMD2 ObjectEntity(i),3,-.2,70,53
					
					
				EndIf
			EndIf

		Case 4
			; Shiver All The Time
			If ObjectCurrentAnim(i)<>15
				ObjectCurrentAnim(i)=15
				AnimateMD2 ObjectEntity(i),2,.5,59,70
				
			EndIf
		Case 5
			; Bounce
			If ObjectCurrentAnim(i)<>16
				ObjectCurrentAnim(i)=16
				;Animate GetChild(objectentity(i),3),3,.2,14
				AnimateMD2 ObjectEntity(i),2,.5,31,50
			EndIf

		End Select




	EndIf


End Function

Function ControlBabyBoomer(i)

	If ObjectFrozen(i)=1
		; freeze
		ObjectFrozen(i)=1000*ObjectFrozen(i)

		ObjectCurrentAnim(i)=11
		;Animate GetChild(objectentity(i),3),3,1,11	*** INSERT SIT ANIMATION (FAST)
		AnimateMD2 ObjectEntity(i),3,2,31,50
		;PlaySoundFX(85,ObjectX(i),ObjectY(i))

	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		ObjectCurrentAnim(i)=10
		AnimateMD2 ObjectEntity(i),0,.2,1,2

	EndIf
	If ObjectFrozen(i)>2 Or ObjectFrozen(i)<0
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		Return
	EndIf
	
	



	If ObjectTileTypeCollision(i)=0
		; First time (should later be put into object creation at level editor)
		ObjectTileTypeCollision(i)=2^0+2^3+2^4+2^9+2^10+2^11+2^12+2^14
		ObjectObjectTypeCollision(i)=2^6+2^8
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileX2(i)=Floor(ObjectX(i))
		ObjectTileY2(i)=Floor(ObjectY(i))
		ObjectMovementType(i)=0
		ObjectMovementTimer(i)=0
		ObjectMovementSpeed(i)=35	
		ObjectSubType(i)=1  ; -2 dying, -1 exiting, 0- asleep, 1-follow, 2-directive, 3-about to fall asleep (still walking), 4 caged when directed 5 caged when follow
		ObjectCurrentAnim(i)=3 ; 1-asleep, 2-getting up, 3-idle, 4-wave, 5-tap, 6-walk, 7 sit down, 8-fly, 9-sit on ice	
		
	EndIf

	If ObjectDead(i)=1
		; spinning out of control
		ObjectYaw(i)=(ObjectYaw(i)+10) Mod 360
		ObjectZ(i)=ObjectZ(i)+.01
		ObjectSubType(i)=-2
		Return
	EndIf
	If ObjectDead(i)=3
		; drowning
		ObjectYaw(i)=90
		ObjectZ(i)=ObjectZ(i)-.005
		ObjectSubType(i)=-2
		Return
	EndIf
	
	If ObjectSubType(i)=-1 
		
		Return ; already on its way out
	EndIf
	
	If ObjectData(i,8)=1
		; lit
;		For j=1 To 5
			If Rand(0,100)<20
				AddParticle(23,ObjectX(i),Rnd(0.7,0.8),-ObjectY(i),0,.05,Rnd(-0.005,0.005),Rnd(0,0.005),Rnd(-0.005,0.005),0,.004,0,0,0,50,3)
			EndIf
;		Next
	EndIf

	
	If ObjectData(i,8)>0
		EntityTexture ObjectEntity(i),KaboomTextureSquint
		If ObjectData(i,8) Mod 10 =0 And ObjectData(i,8)>=50
			SoundPitch SoundFX(77),44000+ObjectData(i,8)*75
			PlaySoundFX (77,-1,-1)
		EndIf
		; lit and burning
		For j=1 To 5
			If Rand(0,100)<ObjectData(i,8)
				AddParticle(Rand(16,18),ObjectX(i),Rnd(0.7,0.8),-ObjectY(i),0,.1,Rnd(-0.02,0.02),Rnd(0,0.02),Rnd(-0.02,0.02),0,.004,0,-.0001,0,50,3)
			EndIf
		Next
	EndIf
	If ObjectData(i,8)>=50
		EntityTexture ObjectEntity(i),KaboomTextureSquint
	Else
		EntityTexture ObjectEntity(i),KaboomTexture(1)
	EndIf


		

		
	If ObjectCaged(i)=True And ObjectSubType(i)<>4 And ObjectSubType(i)<>5
		; just Caged
		PlaySoundFX(79,ObjectTileX(i),ObjectTileY(i))
		If ObjectSubType(i)=2
			ObjectSubType(i)=5
		Else
			ObjectSubType(i)=4
		EndIf
		AnimateMD2 ObjectEntity(i),0,.2,1,2
		ObjectCurrentAnim(i)=10
				
	EndIf
	If ObjectCaged(i)=False And (ObjectSubType(i)=4 Or ObjectSubType(i)=5)
		; just released
		
		ObjectSubType(i)=ObjectSubType(i)-3
		
		ObjectMovementTypeData(i)=0
		
		; check if not-moving right now: run to a safe spot if possible
		If ObjectSubType(i)=2 And ObjectTileX(i)=ObjectMoveXGoal(i) And ObjectTileY(i)=ObjectMoveYGoal(i)
			; bingo!
			a=1
			b=1
			If Rand(0,100)<50 a=-1
			If Rand(0,100)<50 b=-1
			For x=-1 To 1 
				For y=-1 To 1
					; check surrounding tiles for empty field
					If CanObjectMoveToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b,True,True)=True
						; found one
						MoveObjectToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b)
						ObjectMoveXGoal(i)=ObjectTileX(i)+x*a
						ObjectMoveYGoal(i)=ObjectTileY(i)+y*b
						x=2
						y=2
					EndIf
				Next
			Next
			; if you couldn't find an escape spot you'll just stay there -in which case the
			; cage will close again immediately
		EndIf
			
	EndIf
	
	If ObjectCaged(i)=True
		TurnObjectTowardDirection(i,ObjectTileX(PlayerObject)-ObjectTileX(i),ObjectTileY(PlayerObject)-ObjectTileY(i),3,0)
		Return
	EndIf
		
		

	
	

		
	
	; do visual controls
	
		
	If ObjectMovementType(i)>0
		; Moving
		If ObjectMovementTimer(i)=0 Then ObjectData(i,9)=ObjectData(i,9)+1
		If ObjectMovementTimer(i)>0 Then ObjectData(i,9)=0
		ObjectZ(i)=0
		
		
			
		If ObjectCurrentAnim(i)<>1 And ObjectData(i,9)<10
			;Animate GetChild(objectentity(i),3),1,.4,ObjectData(i,6)+1
			AnimateMD2 ObjectEntity(i),1,1.5,1,30
			ObjectCurrentAnim(i)=1
		EndIf
		TurnObjectTowardDirection(i,-(ObjectTileX(i)-ObjectTileX2(i)),-(ObjectTileY(i)-ObjectTileY2(i)),4,-ObjectYawAdjust(i))
		
			
		; At Goal?
		If ObjectMovementTimer(i)=0 And ObjectTileX(i)=ObjectMoveXGoal(i) And ObjectTileY(i)=ObjectMoveYGoal(i)
			; Done - revert to standing
			If ObjectSubType(i)=2
				ObjectMovementType(i)=0
				ObjectCurrentAnim(i)=10
			EndIf
			
			AnimateMD2 ObjectEntity(i),0,.2,1,2

		EndIf
		
	Else If ObjectFlying(i)/10=1
		; flying
		If ObjectCurrentAnim(i)<>11
			;Animate GetChild(objectentity(i),3),1,1,11
			AnimateMD2 ObjectEntity(i),3,2,31,60
			ObjectCurrentAnim(i)=11
		EndIf
		TurnObjectTowardDirection(i,-(ObjectTileX(i)-ObjectTileX2(i)),-(ObjectTileY(i)-ObjectTileY2(i)),10,-ObjectYawAdjust(i))
	Else If ObjectFlying(i)/10=2
		; on ice
		If ObjectCurrentAnim(i)<>11
			;Animate GetChild(objectentity(i),3),3,2,13
			AnimateMD2 ObjectEntity(i),3,2,31,60
			ObjectCurrentAnim(i)=11
		EndIf
	Else
		AnimateMD2 ObjectEntity(i),0,.2,1,2
	EndIf

	If ObjectData(i,9)=10	
		
		ObjectCurrentAnim(i)=10
			
		AnimateMD2 ObjectEntity(i),0,.2,1,2

	EndIf


	
	; do logical controls
	If ObjectMovementTimer(i)=0
		; ready to receive new move commands 
		
		; default, keep setting goal as the player
		If ObjectSubType(i)=1
			ObjectMoveXGoal(i)=ObjectTileX(PlayerObject)
			ObjectMoveYGoal(i)=ObjectTileY(PlayerObject)
		EndIf
	
		; special case: check if player is on your tile or entering your tile
		If (ObjectTileLogic(ObjectTileX(i),ObjectTileY(i)) And 2^1) >0
			
			;yes player is on or coming to this tile - "wake up" (if not already) and evacuate!
			If ObjectSubType(i)=2 Then PlaySoundFX(74,ObjectTileX(i),ObjectTileY(i))
			ObjectSubType(i)=1
			ObjectMovementType(i)=14
			
			flag=False
			a=1
			b=1
			If Rand(0,100)<50 a=-1
			If Rand(0,100)<50 b=-1
			For x=-1 To 1 
				For y=-1 To 1
					; check surrounding tiles for empty field
					If CanObjectMoveToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b,True,True)=True
						; found one
						MoveObjectToTile(i,ObjectTileX(i)+x*a,ObjectTileY(i)+y*b)
						x=2
						y=2
						flag=True
					EndIf
				Next
			Next
			If flag=False
				; no move was found - try going to player's position
				; we just "delete" the player from that tile and re-check move possibility
				x=ObjectTileX(PlayerObject)
				y=ObjectTileY(PlayerObject)
			
				If (x<>ObjectTileX(i) Or y<>ObjectTileY(i)) And Abs(x-ObjectTileX(i))<=1 And Abs(y-ObjectTileY(i))<=1
					; one step away
					urg=True
					If (ObjectTileLogic(x,y) And 2^1)>0
						ObjectTileLogic(x,y)=ObjectTileLogic(x,y)-2^1
						If CanObjectMoveToTile(i,x,y,True,True)=True
							MoveObjectToTile(i,x,y)
							flag=True
						EndIf
						ObjectTileLogic(x,y)=ObjectTileLogic(x,y)+2^1
					EndIf
				EndIf
			EndIf
			If flag=False
				; still coudln't find a move out
				
				; this can happen and be benign, such as if a player walks quickly through a crowd of stinkers:
				; stinkers might be vacating and so haven't quite cleared their last tiles yet, leaving some stinkers stuck
				; until they're clear.
				
				; So I would think we should just leave this as is... however that does leave the theoretical possibility that
				; Stinkers might indeed just get stuck within the player.
				
			EndIf
				
		EndIf	
						
	
	EndIf
	


End Function

Function CreateFlipBridgeMesh(tex)
	

	subtype=3
	
	Entity=CreateMesh()
	Surface=CreateSurface(Entity)
	
	; Top 
	AddVertex (surface,-.25,.1,.49,.76,.01)
	AddVertex (surface,.25,.1,.49,.76+.24,.01)
	AddVertex (surface,-.25,.1,-.49,.76,.24)
	AddVertex (surface,.25,.1,-.49,.76+.24,.24)
	AddTriangle (surface,0,1,2)
	AddTriangle (surface,1,3,2)
	AddVertex (surface,-.20,.105,.45,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51)
	AddVertex (surface,-.10,.105,.45,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51)
	AddVertex (surface,-.20,.105,-.45,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51+.115)
	AddVertex (surface,-.10,.105,-.45,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51+.115)
	AddTriangle (surface,4,5,6)
	AddTriangle (surface,5,7,6)
	AddVertex (surface,.10,.105,.45,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51)
	AddVertex (surface,.20,.105,.45,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51)
	AddVertex (surface,.10,.105,-.45,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51+.115)
	AddVertex (surface,.20,.105,-.45,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51+.115)
	AddTriangle (surface,8,9,10)
	AddTriangle (surface,9,11,10)

	
	
	
	; Sides
	For i=0 To 3
		Select i
		Case 0
			x1#=-.25
			x2#=.25
			y1#=-.49
			y2#=-.49
		Case 1
			x1#=.25
			x2#=.25
			y1#=-.49
			y2#=.49
		Case 2
			x1#=.25
			x2#=-.25
			y1#=.49
			y2#=.49
		Case 3
			x1#=-.25
			x2#=-.25
			y1#=.49
			y2#=-.49
		End Select

	
			
		AddVertex (surface,x1,.104,y1,subtype*0.25+.01,.01)
		AddVertex (surface,x2,.104,y2,subtype*0.25+.24,.01)
		AddVertex (surface,x1,-.4,y1,subtype*0.25+.01,.24)
		AddVertex (surface,x2,-.4,y2,subtype*0.25+.24,.24)
		AddTriangle (surface,12+i*4,13+i*4,14+i*4)
		AddTriangle (surface,13+i*4,15+i*4,14+i*4)
;		AddVertex (surface,x1*1.01,.8,y1*1.01,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51)
;		AddVertex (surface,x2*1.01,.8,y2*1.01,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51)
;		AddVertex (surface,x1*1.01,.6,y1*1.01,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51+.115)
;		AddVertex (surface,x2*1.01,.6,y2*1.01,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51+.115)
	
;		AddTriangle (surface,16+i*8,17+i*8,18+i*8)
;		AddTriangle (surface,17+i*8,19+i*8,18+i*8)
		
		
	Next
	
	
	

	
	
	UpdateNormals Entity
	
;	Entity2=CreateCylinder()
;	ScaleEntity Entity2,.25,.11,.25
;	AddMesh Entity2,Entity
;	FreeEntity Entity2
	
	EntityTexture Entity,GateTexture
	Return Entity

End Function

Function RedoFlipBridgeTexture(i)
	
	
	Surface=GetSurface(ObjectEntity(i),1)
	tex=(ObjectID(i)-500)/5
	; 5 Sides
	For j=0 To 1 
		VertexTexCoords surface,j*4+4,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51
		VertexTexCoords surface,j*4+5,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51
		VertexTexCoords surface,j*4+6,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51+.115
		VertexTexCoords surface,j*4+7,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51+.115
	
	Next
	
	UpdateNormals ObjectEntity(i)
	
	
	
	

End Function



Function ControlFlipBridge(i)

	ObjectYawAdjust(i)=0

	If ObjectID(i)=-1
		ObjectID(i)=500+ObjectData(i,0)*5+ObjectData(i,1)
	EndIf

	ObjectScaleYAdjust(i)=1+5.6*Float(ObjectActive(i))/1001.0


	Select ObjectData(i,2)
	Case 0
		dx=0
		dy=-1
		
	Case 1
		dx=1
		dy=-1
		
	Case 2
		dx=1
		dy=0
		
	Case 3
		dx=1
		dy=1
	Case 4
		dx=0
		dy=1
		
	Case 5
		dx=-1
		dy=1
		
	Case 6
		dx=-1
		dy=0
		
	Case 7
		dx=-1
		dy=-1

		
	End Select

	
	TurnObjectTowardDirection(i,dx,dy,2,0)
	
	
	


End Function

Function ActivateFlipBridge(i)

	; check if space is empty
	empty=True
	x=Floor(ObjectX(i))
	y=Floor(ObjectY(i))
	Select ObjectData(i,2)
	Case 0,4
		dx=0
		dy=-1
		k=3
	Case 1,5
		dx=1
		dy=-1
		k=2
	Case 2,6
		dx=1
		dy=0
		k=3
	Case 3,7
		dx=1
		dy=1
		k=2
	End Select
	For j=1 To k
		If LevelTileLogic(x+j*dx,y+j*dy)<>2 And LevelTileLogic(x+j*dx,y+j*dy)<>5
			empty=False
		Else If LevelTileLogic(x-j*dx,y-j*dy)<>2 And LevelTileLogic(x-j*dx,y-j*dy)<>5
			empty=False
		Else If (ObjectTileLogic(x+j*dx,y+j*dy)>0 And ObjectTileLogic(x+j*dx,y+j*dy)<>2^10) Or (ObjectTileLogic(x-j*dx,y-j*dy)>0 And ObjectTileLogic(x-j*dx,y-j*dy)<>2^10)
			empty=False
		EndIf
	Next
	If empty=False
		; no - just do a little wiggle
		ObjectActive(i)=200
	Else
		; go ahead
		ObjectActive(i)=ObjectActive(i)+ObjectActivationSpeed(i)+1
		If ObjectActive(i)>1001 Then ObjectActive(i)=1001
		
		For j=1 To k
			ObjectData(i,3)=LevelTileLogic(x-j*dx,y-j*dy)
			LevelTileLogic(x-j*dx,y-j*dy)=0
			LevelTileLogic(x+j*dx,y+j*dy)=0
		Next
		
	
	EndIf
		
		
	
			


End Function
Function DeActivateFlipBridge(i)

	x=Floor(ObjectX(i))
	y=Floor(ObjectY(i))
	Select ObjectData(i,2)
	Case 0,4
		dx=0
		dy=-1
		k=3
	Case 1,5
		dx=1
		dy=-1
		k=2
	Case 2,6
		dx=1
		dy=0
		k=3
	Case 3,7
		dx=1
		dy=1
		k=2
	End Select
	
	
	; go ahead
	ObjectActive(i)=ObjectActive(i)-ObjectActivationSpeed(i)-1
	If ObjectActive(i)<0 Then ObjectActive(i)=0
		
	For j=1 To k
		LevelTileLogic(x-j*dx,y-j*dy)=ObjectData(i,3)
		LevelTileLogic(x+j*dx,y+j*dy)=ObjectData(i,3)
	Next
		

End Function



Function TurnFlipBridge(i,dir)

	
	; first check if anything is in the way
	allow=False
	
	
	x=Floor(ObjectX(i))
	y=Floor(ObjectY(i))
	
	dir2=ObjectData(i,2)
	k=1
	Select dir
	Case 1 ; right
	
		Select dir2 ; currentdir
		Case 0,4
			k2=1
			If CheckFlipBridgeDestination(x+1*k*k2,y-3*k2) And CheckFlipBridgeDestination(x+2*k*k2,y-3*k2) And CheckFlipBridgeDestination(x+1*k*k2,y-2*k2) 
				k2=-1
				If CheckFlipBridgeDestination(x+1*k*k2,y-3*k2) And CheckFlipBridgeDestination(x+2*k*k2,y-3*k2) And CheckFlipBridgeDestination(x+1*k*k2,y-2*k2) 
					allow=True
				EndIf
			EndIf
	
		Case 1,5
			k2=1
			If CheckFlipBridgeDestination(x+3*k*k2,y-2*k2) And CheckFlipBridgeDestination(x+2*k*k2,y-1*k2) And CheckFlipBridgeDestination(x+3*k*k2,y-1*k2) 
				k2=-1
				If CheckFlipBridgeDestination(x+3*k*k2,y-2*k2) And CheckFlipBridgeDestination(x+2*k*k2,y-1*k2) And CheckFlipBridgeDestination(x+3*k*k2,y-1*k2) 
					allow=True
				EndIf
			EndIf
		Case 2,6
			k2=1
			If  CheckFlipBridgeDestination(x+2*k*k2,y+1*k2) And CheckFlipBridgeDestination(x+3*k*k2,y+1*k2) And CheckFlipBridgeDestination(x+3*k*k2,y+2*k2)
				k2=-1
				If  CheckFlipBridgeDestination(x+2*k*k2,y+1*k2) And CheckFlipBridgeDestination(x+3*k*k2,y+1*k2) And CheckFlipBridgeDestination(x+3*k*k2,y+2*k2)
					allow=True
				EndIf
			EndIf
		Case 3,7
			k2=1
			If CheckFlipBridgeDestination(x+1*k*k2,y+3*k2) And CheckFlipBridgeDestination(x+2*k*k2,y+3*k2) And CheckFlipBridgeDestination(x+1*k*k2,y+2*k2) 
				k2=-1
				If CheckFlipBridgeDestination(x+1*k*k2,y+3*k2) And CheckFlipBridgeDestination(x+2*k*k2,y+3*k2) And CheckFlipBridgeDestination(x+1*k*k2,y+2*k2) 
					allow=True
				EndIf
			EndIf
		End Select
	Case 0 ; Left
		Select dir2 ; currentdir
		Case 0,4
			k2=1
			If CheckFlipBridgeDestination(x-1*k*k2,y-3*k2) And CheckFlipBridgeDestination(x-2*k*k2,y-3*k2) And CheckFlipBridgeDestination(x-1*k*k2,y-2*k2) 
				k2=-1
				If CheckFlipBridgeDestination(x-1*k*k2,y-3*k2) And CheckFlipBridgeDestination(x-2*k*k2,y-3*k2) And CheckFlipBridgeDestination(x-1*k*k2,y-2*k2) 
					allow=True
				EndIf
			EndIf
	
		Case 1,5
			k2=1
			If CheckFlipBridgeDestination(x+2*k*k2,y-3*k2) And CheckFlipBridgeDestination(x+1*k*k2,y-2*k2) And CheckFlipBridgeDestination(x+1*k*k2,y-3*k2) 
				k2=-1
				If CheckFlipBridgeDestination(x+2*k*k2,y-3*k2) And CheckFlipBridgeDestination(x+1*k*k2,y-2*k2) And CheckFlipBridgeDestination(x+1*k*k2,y-3*k2) 
					allow=True
				EndIf
			EndIf
		Case 2,6
			k2=1
			If  CheckFlipBridgeDestination(x+2*k*k2,y-1*k2) And CheckFlipBridgeDestination(x+3*k*k2,y-1*k2) And CheckFlipBridgeDestination(x+3*k*k2,y-2*k2)
				k2=-1
				If  CheckFlipBridgeDestination(x+2*k*k2,y-1*k2) And CheckFlipBridgeDestination(x+3*k*k2,y-1*k2) And CheckFlipBridgeDestination(x+3*k*k2,y-2*k2)
					allow=True
				EndIf
			EndIf
		Case 3,7
			k2=1
			If CheckFlipBridgeDestination(x+3*k*k2,y+1*k2) And CheckFlipBridgeDestination(x+3*k*k2,y+2*k2) And CheckFlipBridgeDestination(x+2*k*k2,y+1*k2) 
				k2=-1
				If CheckFlipBridgeDestination(x+3*k*k2,y+1*k2) And CheckFlipBridgeDestination(x+3*k*k2,y+2*k2) And CheckFlipBridgeDestination(x+2*k*k2,y+1*k2) 
					allow=True
				EndIf
			EndIf
		End Select
		
	End Select

	
		
	
	activeflag=False
	If ObjectActive(i)>0 And ObjectActive(i) Mod 2 =1 Then activeflag=True	
	
	If activeflag=True DeActivateFlipBridge(i)
	If dir=0
		ObjectData(i,2)=(ObjectData(i,2)-1+8) Mod 8
	Else
		ObjectData(i,2)=(ObjectData(i,2)+1) Mod 8
	EndIf
	If allow=True
		
		If activeflag=True ActivateFlipBridge(i)
	EndIf




End Function

Function CheckFlipBridgeDestination(x,y)

	If (LevelTileLogic(x,y)=2 Or LevelTileLogic(x,y)=5) And ObjectTileLogic(x,y)=0
		Return True
	EndIf
	
	Return False

End Function

Function ControlRetroZbotUfo(i)

	; check if biting someone
	For j=0 To NofObjects-1
			If ObjectType(j)=1 Or ObjectType(j)=120 Or ObjectType(j)=400 Or ObjectType(j)=110 Or ObjectType(j)=390
				If (ObjectX(i)-ObjectX(j))^2+(ObjectY(i)-ObjectY(j))^2<.5
					DestroyObject(j,0)
				EndIf
			EndIf
	Next
	
	; ojbectdata 8/9 reserved
	; Weebot/Zapbot - tiletype
	If ObjectData(i,9)=-1
		ObjectData(i,9)=LevelTileTexture(Floor(ObjectX(i)),Floor(ObjectY(i)))
	EndIf

	If ObjectFrozen(i)=1
		; freeze
		ObjectFrozen(i)=1000*ObjectFrozen(i)

		

		ObjectPitch(i)=Rand(-30,30)
		ObjectRoll(i)=Rand(-30,30)
		ObjectZ(i)=.3
		
		
		If Objecttype(i)=431
		
			PlaySoundFX(143+Rand(1,4),ObjectX(i),ObjectY(i))

		Else
			PlaySoundFX(86,ObjectX(i),ObjectY(i))
		EndIf
	
	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
	
		ObjectPitch(i)=0
		ObjectRoll(i)=0
		ObjectZ(i)=0
	EndIf
	If ObjectFrozen(i)>2 Or ObjectFrozen(i)<0
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		
		Return
	EndIf

	
	If ObjectTileTypeCollision(i)=0
	;	ObjectZ(i)=.5
		If ObjectType(i)=423
			ObjectMovementSpeed(i)=60
		Else If ObjectType(i)=422
			ObjectMovementSpeed(i)=20
		Else If ObjectType(i)=430
			ObjectMovementSpeed(i)=120
		Else If ObjectType(i)=431
			ObjectMovementSpeed(i)=20*ObjectData(i,2)


		EndIf
		
		
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		
		ObjectTileTypeCollision(i) =2^0+2^2+2^3+2^4+2^9+2^10+2^11+2^12+2^14
		
		If ObjectType(i)=431 Or ObjectType(i)=422 ; no player collision for ufo or zapbot (shoots anyhow)
			ObjectObjectTypeCollision(i)=2^3+2^6
		Else If ObjectTYpe(i)=430 ; no water for zipbots
			ObjectObjectTypeCollision(i)=2^1+2^3+2^6
			ObjectTileTypeCollision(i) =2^0+2^3+2^4+2^9+2^10+2^11+2^12+2^14

		Else
			ObjectObjectTypeCollision(i)=2^1+2^3+2^6
		EndIf
		
		
		ObjectMovementType(i)=41+2*ObjectData(i,0)+ObjectData(i,1)
		
	EndIf
	
	If ObjectType(i)=423 
		If ObjectData(i,0)=0
			TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),4,-180)
		Else If ObjectData(i,0)=1
			TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),4,-90)
		Else If ObjectData(i,0)=2
			TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),4,0)
		Else If ObjectData(i,0)=3
			TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),4,90)
		EndIf
	Else If ObjectType(i)=430
		If ObjectData(i,0)=0
			TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),12,-180)
		Else If ObjectData(i,0)=1
			TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),12,-90)
		Else If ObjectData(i,0)=2
			TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),12,0)
		Else If ObjectData(i,0)=3
			TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),12,90)
		EndIf

	Else 
		ObjectYaw(i)=ObjectYaw(i)+2
	EndIf
	
	ObjectData10(i)=ObjectMovementTimer(i)
	

	If ObjectType(i)=422 ; ufo
		If ObjectData(i,3)>0
			ObjectData(i,3)=ObjectData(i,3)-1
		Else
			;shoot
			If ObjectTileX(i)=ObjectTileX(PlayerObject); Or ObjectTileX2(i)=ObjectTileX(PlayerObject)
				If ObjectTileY(i)<ObjectTileY(PlayerObject) 
					If LevelTileLogic(ObjectTileX(i),ObjectTileY(i)+1)<>1 
						CreateSpellBall(ObjectX(i),ObjectY(i)+.5,0.5,0,0.1,1,-1,-1,False,300)
						
						ObjectData(i,3)=60
					EndIf
				Else 
					If LevelTileLogic(ObjectTileX(i),ObjectTileY(i)-1)<>1 
						CreateSpellBall(ObjectX(i),ObjectY(i)-.5,0.5,0,-0.1,1,-1,-1,False,300)
						ObjectData(i,3)=60
					EndIf
				EndIf	
			EndIf
			If ObjectTileY(i)=ObjectTileY(PlayerObject); Or ObjectTileY2(i)=ObjectTileY(PlayerObject)
				If ObjectTileX(i)<ObjectTileX(PlayerObject) 
					If LevelTileLogic(ObjectTileX(i)+1,ObjectTileY(i))<>1 
						CreateSpellBall(ObjectX(i)+.5,ObjectY(i),0.5,0.1,0,1,-1,-1,False,300)
						ObjectData(i,3)=60
					EndIf
				Else 
					If LevelTileLogic(ObjectTileX(i)-1,ObjectTileY(i))<>1 
						CreateSpellBall(ObjectX(i)-.5,ObjectY(i),0.5,-0.1,0,1,-1,-1,False,300)
						ObjectData(i,3)=60
					EndIf
				EndIf	
			EndIf

			
		
		EndIf
	EndIf
	flag=True
	If ObjectType(i)=431 
	
		If LevelTimer Mod 50 =0 PlaySoundFX(91,ObjectX(i),ObjectY(i))
		
		If Leveltimer Mod 1000 <20 And leveltimer Mod 4 = 0 AddParticle(32,ObjectX(i),0.7,-ObjectY(i),0,1,0,.01,0,0,0.02,0,0,0,2,4)
		
		If LevelTimer Mod 1000 = 0 
			

			If Rand(0,100)<50
				PlaySoundFX(140,ObjectX(i),ObjectY(i))
			Else
				PlaySoundFX(159,ObjectX(i),ObjectY(i))
			EndIf
		EndIf
		
		If ObjectData(i,8)>0
			ObjectData(i,8)=ObjectData(i,8)-1
		Else
			;shoot
			If ObjectTileX(i)=ObjectTileX(PlayerObject) Or ObjectTileX(i)=ObjectTileX2(PlayerObject)
				If ObjectTileY(i)<ObjectTileY(PlayerObject) 
					If ObjectTileY(PlayerObject)-ObjectTileY(i)>ObjectData(i,3)
						flag=False
					EndIf
					k=ObjectTileY(PlayerObject)-ObjectTileY(i)
					For j=1 To k
						If LevelTileLogic(ObjectTileX(i),ObjectTileY(i)+j)=1
							flag =False
						EndIf
					Next
					If flag=True 
						CreateSpellBall(ObjectX(i),ObjectY(i)+.2,0.5,0,1.0,1,-1,-1,-99,300)
						ObjectYaw(i)=0
						ObjectData(i,8)=1;60
					EndIf
				Else 
					If ObjectTileY(i)-ObjectTileY(PlayerObject)>ObjectData(i,3)
						flag=False
					EndIf
					k=ObjectTileY(i)-ObjectTileY(PlayerObject)
					For j=1 To k

						If LevelTileLogic(ObjectTileX(i),ObjectTileY(i)-j)=1
							flag =False
						EndIf
					Next
					If flag=True 
						CreateSpellBall(ObjectX(i),ObjectY(i)-.2,0.5,0,-1.0,1,-1,-1,-99,300)
						ObjectYaw(i)=0
						ObjectData(i,8)=1;60
					EndIf

					
				EndIf	
			EndIf
			If ObjectTileY(i)=ObjectTileY(PlayerObject) Or ObjectTileY(i)=ObjectTileY2(PlayerObject)
				If ObjectTileX(i)<ObjectTileX(PlayerObject) 
					If ObjectTileX(PlayerObject)-ObjectTileX(i)>ObjectData(i,3)
						flag=False
					EndIf
					k=ObjectTileX(PlayerObject)-ObjectTileX(i)
					For j=1 To k

						If LevelTileLogic(ObjectTileX(i)+j,ObjectTileY(i))=1
							flag =False
						EndIf
					Next
					If flag=True 
						CreateSpellBall(ObjectX(i)+.2,ObjectY(i),0.5,1.0,0,1,-1,-1,-99,300)
						ObjectYaw(i)=0

						ObjectData(i,8)=1;60
					EndIf

				
				Else 
					If ObjectTileX(i)-ObjectTileX(PlayerObject)>ObjectData(i,3)
						flag=False
					EndIf
					k=ObjectTileX(i)-ObjectTileX(PlayerObject)
					For j=1 To k

						If LevelTileLogic(ObjectTileX(i)-j,ObjectTileY(i))=1
							flag =False
						EndIf
					Next
					If flag=True 
						CreateSpellBall(ObjectX(i)-.2,ObjectY(i),0.5,-1.0,0,1,-1,-1,-99,300)
						ObjectYaw(i)=0

						ObjectData(i,8)=1;60
					EndIf

				EndIf	
			EndIf

			
		
		EndIf
	EndIf
	
	
		
End Function

Function ControlRetroCoily(i)

	; check if biting someone
		For j=0 To NofObjects-1
			
				If ObjectType(j)=1 Or ObjectType(j)=120  Or ObjectType(j)=400 Or ObjectType(j)=110 Or ObjectType(j)=390
					If (ObjectX(i)-ObjectX(j))^2+(ObjectY(i)-ObjectY(j))^2<.5
						DestroyObject(j,0)
					EndIf
				EndIf
			
		Next

	If ObjectFrozen(i)=1
		; freeze
		ObjectFrozen(i)=1000*ObjectFrozen(i)

		

		ObjectPitch(i)=Rand(-30,30)
		ObjectRoll(i)=Rand(-30,30)
		ObjectZ(i)=.3

		PlaySoundFX(86,ObjectX(i),ObjectY(i))

	
	EndIf
	If ObjectFrozen(i)=2 Or ObjectFrozen(i)=10002
		; revert
		ObjectFrozen(i)=0
	
		ObjectPitch(i)=0
		ObjectRoll(i)=0
		ObjectZ(i)=0
	EndIf
	If ObjectFrozen(i)>2 Or ObjectFrozen(i)<0
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		
		Return
	EndIf

	
	If ObjectTileTypeCollision(i)=0
	;	ObjectZ(i)=.5
		
		ObjectMovementSpeed(i)=30
		
		
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileTypeCollision(i)=2^0+2^3+2^9+2^10+2^14
		ObjectObjectTypeCollision(i)=2^1+2^3+2^6
		ObjectMovementType(i)=41+2*ObjectData(i,0)+ObjectData(i,1)
		
	EndIf
	
	
	ObjectYaw(i)=ObjectYaw(i)+2
	
	If ObjectMovementTimer(i)=0
		ObjectZ(i)=0
		
		dir=Rand(0,3)
		Select dir
		Case 0
			dx=0
			dy=-1
		Case 1
			dx=1
			dy=0
		Case 2
			dx=0
			dy=1
		Case 3
			dx=-1
			dy=0
		End Select
		
		If CanObjectMoveToTile(i,ObjectTileX(i)+dx,ObjectTileY(i)+dy,False,True)
			MoveObjectToTile(i,ObjectTileX(i)+dx,ObjectTileY(i)+dy)
			PlaySoundFX(118,ObjectX(i),ObjectY(i))
		EndIf
			
		
		
	Else
		ObjectZ(i)=Sin(Float(ObjectMovementTimer(i))/1001.0*180.0)
	EndIf
	
	
	
		
End Function


Function ControlRetroScouge(i)


	ObjectTimer(i)=ObjectTimer(i)-1
	
	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))

	
	
	
	x=ObjectTileX(i)
	y=ObjectTileY(i)
	
	LevelTileLogic(x,y)=1
	
	
	dx#=0
	dy#=0
	
	; turn or static
	Select ObjectData(i,0)
	
	Case 0
		dx=0
		dy=-1
	Case 1
		dx=1
		dy=0
	Case 2
		dx=0
		dy=1
	Case 3
		dx=-1
		dy=0
	End Select
	
	
	If ObjectTimer(i)<0
		
		ObjectTimer(i)=ObjectTimerMax1(i)
		If LevelTileLogic(ObjectTileX(i)+dx,ObjectTileY(i)+dy)<>1
			CreateSpellBall(ObjectX(i)+.6*dx,ObjectY(i)+.6*dy,0.5,.1*dx,.1*dy,1,-1,-1,False,300)
		EndIf
		PlaySoundFX(103,ObjectTIleX(i),ObjectTIleY(i))
			
				
	EndIf


End Function


Function ControlRetroRainbowCoin(i)

	
	If ObjectActive(i)<1001 
		; picked up animation
		ObjectYaw(i)=ObjectYaw(i)+10
		


		If ObjectActive(i)>600
			ObjectZ(i)=1.2+Float(1000-ObjectActive(i))/400.0
		Else
			ObjectZ(i)=2.2
		EndIf
		If ObjectActive(i)=400
			; Little Spark
			For j=1 To 20
				AddParticle(19,ObjectTileX(i)+0.5,2.6,-ObjectTileY(i)-0.5,Rand(0,360),0.15,Rnd(-.035,.035),Rnd(-.015,.015),Rnd(-.035,.035),0,0,0,0,0,50,3)
			Next
		EndIf
		If ObjectActive(i)<600
			ObjectScaleXAdjust(i)=Float(ObjectActive(i))/600.0
			ObjectScaleYAdjust(i)=Float(ObjectActive(i))/600.0
			ObjectScaleZAdjust(i)=Float(ObjectActive(i))/600.0

		EndIf
		
		
		
	Else
		ObjectYaw(i)=ObjectYaw(i)+3
		ObjectZ(i)=0
	

		dist=Maximum2(Abs(ObjectTileX(i)-ObjectTileX(PlayerObject)),Abs(ObjectTileY(i)-ObjectTileY(PlayerObject)))
		
		If ObjectMovementTimer(PlayerObject)=0 And dist=0
			; pick up
			If (ObjectTileLogic(ObjectTileX(i),ObjectTileY(i)) And 2^4)>0
				ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))=ObjectTileLogic(ObjectTileX(i),ObjectTileY(i))-2^4
			EndIf
			DeActivateObject(i)
			PlaySoundFX(173,-1,-1)
			
			flag=True
			For j=0 To nofObjects-1
				If ObjectType(j)=425 And ObjectActive(j)=1001
					flag=False
				EndIf
			Next
			
			; check if there are any other rainbow coins left
			If flag=True
				; no more coins - open all coingates
				For j=0 To nofobjects-1
					If ObjectType(j)=426 And ObjectActive(j)=1001 
						DeActivateObject(j)
						PlaySoundFX(12,-1,-1)
						
					EndIf
				Next
			EndIf

			
			
			

		EndIf
	EndIf
		
	
End Function

Function CreateRetroLaserGateMesh(col)
		
	
	; create the mesh if laser gate
	Entity=CreateMesh() 
	cyl=CreateCylinder (6,False) ; an individual cylinder
	ScaleMesh cyl,0.05,0.5,0.05
	RotateMesh cyl,0,0,90
	PositionMesh cyl,0,.25,0.0
	AddMesh cyl,Entity
	PositionMesh cyl,0,-.375,.2165
	AddMesh cyl,Entity
	PositionMesh cyl,0,0,-.433
	AddMesh cyl,Entity
	FreeEntity cyl
	
	EntityAlpha Entity,0.5
	
	If col=0
		EntityColor Entity,255,0,0
	Else If col=1
		EntityColor Entity,255,128,0
	Else If col=2
		EntityColor Entity,255,255,0
	Else If col=3
		EntityColor Entity,0,255,0
	Else If col=4
		EntityColor Entity,0,255,255
	Else If col=5
		EntityColor Entity,0,0,255
	Else 
		EntityColor Entity,255,0,255
	EndIf
	
	Return Entity
	
End Function

Function CreatePushbotMesh(tex,dir)
	
	Entity=CreateMesh()
	Surface=CreateSurface(Entity)
	If dir=2
		; special for turn-around
		dir=0
		; Front
		AddVertex (surface,-.4,0,.4,0,.25+.25*dir)
		AddVertex (surface,+.4,0,.4,0,0+.25*dir)
		AddVertex (surface,-.2,.3,.2,.25,.20+.25*dir)
		AddVertex (surface,+.2,.3,.2,.25,.05+.25*dir)
		AddTriangle (surface,0,1,2)
		AddTriangle (surface,1,3,2)
		; Top
		AddVertex (surface,-.4,.4,-.4,.5,.20+.25*dir)
		AddVertex (surface,+.4,.4,-.4,.5,.05+.25*dir)
		AddTriangle (surface,2,3,4)
		AddTriangle (surface,3,5,4)
		;Back
		AddVertex (surface,-.45,0,-.45,.75,.25+.25*dir)
		AddVertex (surface,+.45,0,-.45,.75,0+.25*dir)
		AddTriangle (surface,4,5,6)
		AddTriangle (surface,5,7,6)
		; Left
		AddVertex (surface,-.4,0,.4,.75,.25+.25*dir)
		AddVertex (surface,-.45,0,-.45,.75,0+.25*dir)
		AddVertex (surface,-.2,.3,.2,1,.25+.25*dir)
		AddVertex (surface,-.4,.4,-.4,1,0+.25*dir)
		AddTriangle (surface,10,9,8)
		AddTriangle (surface,10,11,9)
		; Right
		AddVertex (surface,.4,0,.4,.75,.25+.25*dir)
		AddVertex (surface,.45,0,-.45,.75,0+.25*dir)
		AddVertex (surface,.2,.3,.2,1,.25+.25*dir)
		AddVertex (surface,.4,.4,-.4,1,0+.25*dir)
		AddTriangle (surface,12,13,14)
		AddTriangle (surface,13,15,14)

	Else
	
		dir=1-dir
		
		; Front
		AddVertex (surface,-.4,0,.4,0,.25+.25*dir)
		AddVertex (surface,+.4,0,.4,0,0+.25*dir)
		AddVertex (surface,-.2,.3,.2,.25,.25+.25*dir)
		AddVertex (surface,+.2,.3,.2,.25,0+.25*dir)
		AddTriangle (surface,0,1,2)
		AddTriangle (surface,1,3,2)
		; Top
		AddVertex (surface,-.4,.4,-.4,.5,.25+.25*dir)
		AddVertex (surface,+.4,.4,-.4,.5,0+.25*dir)
		AddTriangle (surface,2,3,4)
		AddTriangle (surface,3,5,4)
		;Back
		AddVertex (surface,-.45,0,-.45,.75,.25+.25*dir)
		AddVertex (surface,+.45,0,-.45,.75,0+.25*dir)
		AddTriangle (surface,4,5,6)
		AddTriangle (surface,5,7,6)
		; Left
		AddVertex (surface,-.4,0,.4,.75,.25+.25*dir)
		AddVertex (surface,-.45,0,-.45,.75,0+.25*dir)
		AddVertex (surface,-.2,.3,.2,1,.25+.25*dir)
		AddVertex (surface,-.4,.4,-.4,1,0+.25*dir)
		AddTriangle (surface,10,9,8)
		AddTriangle (surface,10,11,9)
		; Right
		AddVertex (surface,.4,0,.4,.75,.25+.25*dir)
		AddVertex (surface,.45,0,-.45,.75,0+.25*dir)
		AddVertex (surface,.2,.3,.2,1,.25+.25*dir)
		AddVertex (surface,.4,.4,-.4,1,0+.25*dir)
		AddTriangle (surface,12,13,14)
		AddTriangle (surface,13,15,14)
	EndIf

	
	
	; Col
	AddVertex (surface,-.05,.33,.05,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51)
	AddVertex (surface,.05,.33,.05,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51)
	AddVertex (surface,-.25,.4,-.35,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51+.115)
	AddVertex (surface,.25,.4,-.35,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51+.115)
	AddTriangle (surface,16,17,18)
	AddTriangle (surface,17,19,18)
	
		
	
	UpdateNormals Entity
	
	EntityTexture Entity,PushbotTexture
	Return Entity

End Function


Function ControlPushbot(i)


	

	If ObjectFrozen(i)=1
		; freeze
		ObjectFrozen(i)=1000*ObjectFrozen(i)

		

		ObjectPitch(i)=Rand(-30,30)
		ObjectRoll(i)=Rand(-30,30)
		ObjectZ(i)=.3

		PlaySoundFX(86,ObjectX(i),ObjectY(i))

	
	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
	
		ObjectPitch(i)=0
		ObjectRoll(i)=0
		ObjectZ(i)=0
	EndIf
	If ObjectFrozen(i)>2 Or ObjectFrozen(i)<0
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		
		Return
	EndIf
	
	
	For j=0 To NofObjects-1
			If (ObjectX(i)-ObjectX(j))^2+(ObjectY(i)-ObjectY(j))^2 <.3 And ObjectExists(j)=True And ObjectActive(j)>0 And ObjectSubType(i)>0
				If ObjectType(j)=1 Or ObjectType(j)=110 Or ObjectType(j)=120 Or ObjectType(j)=330 Or ObjectType(j)=290  Or ObjectType(j)=380 Or ObjectType(j)=390 Or ObjectType(j)=400 Or ObjectType(j)=433 Then DestroyObject(j,0)
				; kill player, npc, wee stinker, wysp, ice troll, kaboom, baby boomer, master zbot
			EndIf
		Next
	

	
	If ObjectTileTypeCollision(i)=0
	
		
	
		ObjectMovementSpeed(i)=60
		
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		
		If ObjectSubType(i)=0
			ObjectObjectTypeCollision(i)=2^6
		Else
			ObjectObjectTypeCollision(i)=2^1+2^2+2^3+2^6+2^7
		EndIf
		
		ObjectTileTypeCollision(i) =2^0+2^3+2^4+2^9+2^10+2^11+2^12+2^14
		
		ObjectMovementType(i)=0;81+2*ObjectData(i,2)+ObjectData(i,3)
		
		ObjectID(i)=500+ObjectData(i,0)*5+ObjectData(i,1)

		
	EndIf
	
	If ObjectData(i,2)=0
		TurnObjectTowardDirection(i,0,1,8,0)
	Else If ObjectData(i,2)=1
		TurnObjectTowardDirection(i,-1,0,8,00)
	Else If ObjectData(i,2)=2
		TurnObjectTowardDirection(i,0,-1,8,0)
	Else If ObjectData(i,2)=3
		TurnObjectTowardDirection(i,1,0,8,00)
	EndIf
	

		
	ObjectData10(i)=ObjectMovementTimer(i)
	

	

End Function

Function RedoPushbotTexture(i)
	
	
	Surface=GetSurface(ObjectEntity(i),1)
	tex=(ObjectID(i)-500)/5
	
	For j=0 To 0 
		VertexTexCoords surface,j*8+16,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51
		VertexTexCoords surface,j*8+17,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51
		VertexTexCoords surface,j*8+18,(tex Mod 8)*0.125+.01,(tex/8)*0.125+.51+.115
		VertexTexCoords surface,j*8+19,(tex Mod 8)*0.125+.115,(tex/8)*0.125+.51+.115
	
	Next
	
	UpdateNormals ObjectEntity(i)
	
	
	
	

End Function

Function ControlZbotNPC(i)

	If ObjectData(i,0)>0
		ObjectData(i,0)=ObjectData(i,0)+1
		If ObjectData(i,0)=120 
			DestroyObject(i,0)
			Return
		EndIf
	EndIf


	If ObjectFrozen(i)=1
		; freeze
		ObjectFrozen(i)=1000*ObjectFrozen(i)

	;	AnimateMD2 objectentity(i),3,.5,121,135
		
		PlaySoundFX(143+Rand(1,4),ObjectX(i),ObjectY(i))


	EndIf
	If ObjectFrozen(i)=2
		; revert
	;	AnimateMD2 objectentity(i),2,0.005,81,82
		playsoundfx(Rand(141,142),ObjectX(i),ObjectY(i))
		ObjectCurrentAnim(i)=10
		ObjectTimer(i)=ObjectData(i,7)
		ObjectFrozen(i)=0
	EndIf
	If ObjectFrozen(i)>2 Or ObjectFrozen(i)<0
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		Return
	EndIf
	
	If ObjectData(i,0)>0
		ObjectYaw(i)=ObjectYaw(i)+Float(ObjectData(i,0))/10.0
		ObjectZ(i)=ObjectZ(i)+0.002
		Return
	EndIf
	
	
	; particle effects
	If ObjectActive(i)>0 And ObjectActive(i)<1001 ; in process
		If Rand(0,100)<50
			a=Rand(0,360)
			b#=Rnd(0.002,0.006)
			AddParticle(23,ObjectX(i)+0.5*Sin(a),0,-ObjectY(i)-0.5*Cos(a),0,.2,b*Sin(a),0.015,-b*Cos(a),1,0,0,0,0,150,3)
		EndIf

	
	EndIf



	If ObjectTileTypeCollision(i)=0
		; First time (should later be put into object creation at level editor)
		ObjectData10(i)=-1

		ObjectTileTypeCollision(i)=2^0+2^3+2^4+2^9+2^11+2^12+2^14
		ObjectObjectTypeCollision(i)=2^6
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileX2(i)=Floor(ObjectX(i))
		ObjectTileY2(i)=Floor(ObjectY(i))
		If ObjectMoveXGoal(i)=0 And ObjectMoveYGoal(i)=0
			ObjectMoveXGoal(i)=Floor(ObjectX(i))
			ObjectMoveYGoal(i)=Floor(ObjectY(i))
	;		AnimateMD2 objectentity(i),2,0.005,81,82

			ObjectCurrentAnim(i)=10
			
		EndIf
		
				
		
	EndIf
	
	
	
	If ObjectActive(i)>0 And ObjectLastActive(i)=0 Then Playsoundfx(143,-1,-1)

	
	If Rand(1,10000)=1 playsoundfx(Rand(141,143),-1,-1)
	
	; Calculate distance to player - used several times
	Dist=maximum2(Abs(ObjectTileX(i)-ObjectTileX(PlayerObject)),Abs(ObjectTileY(i)-ObjectTileY(PlayerObject)))
		
	If ((GameMode<>8 Or DialogObject1<>i) And ObjectLinked(i)=-1) And ObjectData10(i)>=0
		
		; just restarted after talking and/or after transporter
		ObjectMoveXGoal(i)=ObjectData10(i) Mod 200
		ObjectMoveYGoal(i)=ObjectData10(i) / 200
		ObjectMovementType(i)=10

		ObjectData10(i)=-1
	EndIf
	

		
	If ObjectMovementType(i)>0
		; Moving
		If ObjectMovementTimer(i)=0 Then ObjectData(i,9)=ObjectData(i,9)+1
		If ObjectMovementTimer(i)>0 Then ObjectData(i,9)=0
		
		If ObjectData(i,9)>10 ; has been standing for a bit
		;	AnimateMD2 objectentity(i),2,0.005,81,82

		;	ObjectCurrentAnim(i)=10
			TurnObjectTowardDirection(i,(ObjectTileX(i)-ObjectMoveXGoal(i)),(ObjectTileY(i)-ObjectMoveYGoal(i)),4,-ObjectYawAdjust(i))
		Else
			
			
			TurnObjectTowardDirection(i,(ObjectTileX(i)-ObjectTileX2(i)),(ObjectTileY(i)-ObjectTileY2(i)),4,-ObjectYawAdjust(i))
		EndIf
			
		; At Goal?
		If ObjectMovementTimer(i)=0 And ObjectTileX(i)=ObjectMoveXGoal(i) And ObjectTileY(i)=ObjectMoveYGoal(i)
			; Done - revert to standing
			ObjectMovementType(i)=0
			ObjectCurrentAnim(i)=10
			;AnimateMD2 objectentity(i),2,0.005,81,82

		EndIf
		
	Else If ObjectFlying(i)/10=1
		; flying
		
		TurnObjectTowardDirection(i,(ObjectTileX(i)-ObjectTileX2(i)),(ObjectTileY(i)-ObjectTileY2(i)),10,-ObjectYawAdjust(i))
	Else If ObjectFlying(i)/10=2
		; on ice
		

	Else 
		; standing controls
		
		; turn towart player - if present!
		If ObjectType(playerobject)=1 And playerobject<nofobjects
			If ObjectData(i,2)=0
				TurnObjectTowardDirection(i,-ObjectX(PlayerObject)+ObjectX(i),-ObjectY(PlayerObject)+ObjectY(i),6,-ObjectYawAdjust(i))
			EndIf
		Else
			If Objectstatus(i)=0
				ObjectYaw(i)=ObjectYaw(i)+180
				Objectstatus(i)=1
			EndIf
		EndIf
		; shooting?
		If ObjectData(i,6)>0
			dx#=ObjectX(PlayerObject)-ObjectX(i)
			dy#=ObjectY(PlayerObject)-ObjectY(i)
			total#=Sqr(dx^2+dy^2)
			dx=dx/total
			dy=dy/total
			
			ObjectTimer(i)=ObjectTimer(i)-1
			
			If ObjectTimer(i)<0
				If ObjectTimer(i)=-10
					; aquire target now
					ObjectData(i,4)=dx*10000
					ObjectData(i,5)=dy*10000
				EndIf
				
			
				If ObjectTimer(i)=-40
					ObjectTimer(i)=ObjectData(i,7)
				EndIf
				
				; and fire
				If ObjectTimer(i)=-30
					dx#=Float(ObjectData(i,4))/10000.0
					dy#=Float(ObjectData(i,5))/10000.0
					If ObjectTileX(i)+dx>=0 And ObjectTileY(i)+dy>=0
						If LevelTileLogic(ObjectTileX(i)+dx,ObjectTileY(i)+dy)<>1
							CreateSpellBall(ObjectTileX(i)+.5+.6*dx,ObjectTileY(i)+.5+.6*dy,1.1,.1*dx,.1*dy,1,-1,-1,False,300)
						EndIf
					EndIf
					PlaySoundFX(103,ObjectTIleX(i),ObjectTIleY(i))
		
					
				EndIf
		
				
			EndIf
		EndIf



	EndIf

	
	
	ObjectData(i,3)=ObjectMovementTimer(i)
	


	

End Function

Function ControlRetroLaserGate(i)

	If ObjectID(i)=-1
		ObjectID(i)=500+ObjectData(i,0)*5+ObjectData(i,1)
	EndIf
	ObjectTileX(i)=Floor(ObjectX(i))
	ObjectTileY(i)=Floor(ObjectY(i))
	

	If ObjectActive(i)=0
		; open 
		If LevelTileLogic(ObjectTileX(i),ObjectTileY(i))<>0
			
			LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=0
		EndIf
		
		
	Else 
		; closed
		If LevelTileLogic(ObjectTileX(i),ObjectTileY(i))<>1
			
			LevelTileLogic(ObjectTileX(i),ObjectTileY(i))=1
		EndIf

	

	EndIf
	
	If objectYawAdjust(i)=0 Or ObjectYawAdjust(i)=180
		ObjectPitch(i)=(ObjectPitch(i)+2) Mod 360
	Else
		ObjectRoll(i)=(ObjectRoll(i)+2) Mod 360
	EndIf
			
End Function

Function ControlLurker(i)

	x=Floor(ObjectX(i))
	y=Floor(ObjectY(i))
	If ObjectData(i,0)=0
		; lurking
		If ObjectYawAdjust(i)<>0
			ObjectYaw(i)=ObjectYawAdjust(i)
			ObjectYawAdjust(i)=0
		EndIf
		ObjectPitch2(i)=180
		ObjectZ(i)=-0.1
		ObjectData(i,2)=-1
		
		
		For j=0 To NofObjects-1
			If ObjectFlying(j)=0 And ObjectDead(j)=0 
				If ObjectType(j)=1 Or ObjectType(j)=110 Or ObjectType(j)=120 Or ObjectType(j)=150 Or ObjectType(j)=220 Or ObjectType(j)=230 Or ObjectType(j)=240 Or ObjectType(j)=241 Or ObjectType(j)=242 Or ObjectType(j)=250 Or ObjectType(j)=260 Or ObjectType(j)=290 Or ObjectType(j)=230 Or ObjectType(j)=340 Or ObjectType(j)=370 Or ObjectType(j)=380 Or ObjectType(j)=390 Or ObjectType(j)=391 Or ObjectType(j)=400 Or ObjectType(j)=420 Or ObjectType(j)=421 Or ObjectType(j)=422 Or ObjectType(j)=423 Or ObjectType(j)=430 Or ObjectType(j)=431 Or ObjectType(j)=432 Or ObjectType(j)=433 Or ObjectType(j)=460 
					If (ObjectTileX(j)=x And Abs(objecttileY(j)-y)<=1) Or (ObjectTileY(j)=y And Abs(objecttileX(j)-x)<=1)
						; gotcha
						PlaySoundFX(97,x,y)
						ObjectData(i,0)=1
						ObjectData(i,1)=0
						ObjectData(i,2)=j  ;changed April 20/2012: Try this - do a seek'n'destroy for the surrounding area immediately after closing
					EndIf
				EndIf
			EndIf
		Next
	EndIf
	lurkerdead=False
	If ObjectData(i,0)=1
		; snapping
		ObjectData(i,1)=ObjectData(i,1)+1
		If ObjectData(i,1)<20
			ObjectPitch2(i)=ObjectPitch2(i)-9
		Else If ObjectData(i,1)=20
			CameraShakeTimer=30
			If ObjectData(i,2)>=0
				
				
				
				
				
				
				; deleted April 20/2012
				; HideEntity ObjectEntity(ObjectData(i,2))
				; DestroyObject(ObjectData(i,2),0)
				
				; replaced with
				For j=0 To NofObjects-1
					If ObjectFlying(i)=0 And ObjectDead(i)=0
						If ObjectType(j)=1 Or ObjectType(j)=110 Or ObjectType(j)=120 Or ObjectType(j)=150 Or ObjectType(j)=220 Or ObjectType(j)=230 Or ObjectType(j)=240 Or ObjectType(j)=241 Or ObjectType(j)=242 Or ObjectType(j)=250 Or ObjectType(j)=260 Or ObjectType(j)=290 Or ObjectType(j)=330 Or ObjectType(j)=340 Or ObjectType(j)=370 Or ObjectType(j)=380 Or ObjectType(j)=390 Or ObjectType(j)=391 Or ObjectType(j)=400 Or ObjectType(j)=420 Or ObjectType(j)=421 Or ObjectType(j)=422 Or ObjectType(j)=423 Or ObjectType(j)=430 Or ObjectType(j)=431 Or ObjectType(j)=432 Or ObjectType(j)=433 Or ObjectType(j)=460 
							If ((Abs(objecttileY(j)-y)<=1) And (Abs(objecttileX(j)-x)<=1)) Or ((Abs(objecttileY2(j)-y)<=1) And (Abs(objecttileX2(j)-x)<=1))
								; gotcha
								HideEntity ObjectEntity(j)
								DestroyObject(j,0)
								
								; special case: TNT
								If objectType(j)=241
									; BIG BANG
									DestroyObject(i,0)
									lurkerdead=True
									CameraShakeTimer=60

								EndIf

							EndIf
						EndIf
					EndIf
				Next
 				; end add
				
			EndIf
			If lurkerdead=False
				For x2=-1 To 1
					For y2=-1 To 1
						LevelTileLogic(x+x2,y+y2)=1
					Next
				Next
			EndIf
			
		Else If ObjectData(i,1)<100
		
		Else If ObjectData(i,1)<175
			ObjectZ(i)=ObjectZ(i)-0.02
		Else If ObjectData(i,1)=175
			For x2=-1 To 1
				For y2=-1 To 1
					LevelTileLogic(x+x2,y+y2)=0
				Next
			Next

		Else If ObjectData(i,1)<400
		
		Else If ObjectData(i,1)=400
			;reset
			ObjectData(i,0)=0
		EndIf
		
	EndIf
	


End Function


Function ControlBurstFlower(i)
	

	If ObjectFrozen(i)=1 
		; freeze
			ObjectFrozen(i)=1000*ObjectFrozen(i)

		
	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		
	;	ObjectTimer(i)=ObjectTimerMax1(i)
	;	ObjectData(i,2)=0
		

	EndIf
	If ObjectFrozen(i)>2 Or ObjectFrozen(i)<0
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		
		Return
	EndIf
	
	

	
	
	ObjectData(i,0)=(ObjectData(i,0)+1) Mod 720
	objectYaw(i)=ObjectYaw(i)+.5*Sin(ObjectData(i,0)/2)
	Objectxscale(i)=0.3+0.02*Cos(ObjectData(i,0)*2)
	Objectyscale(i)=0.3+0.02*Cos(ObjectData(i,0)*2)

	If ObjectData(i,1)>=0 And Rand(0,100)<2 AddParticle(7,ObjectX(i),0.5,-ObjectY(i),Rand(0,360),0.4,0,0.02,0,Rnd(0,2),.01,0,0,0,50,4)

		
	If ObjectData(i,1)<0 Then ObjectData(i,1)=ObjectData(i,1)+1

	
	
	x=ObjectTileX(i)
	y=ObjectTileY(i)
	; player near or other stinkers near? increase burst timer
		flag=0
		For j=0 To nofobjects-1
			If Objecttype(j)=1 Or ObjectType(j)=110 Or ObjectType(j)=120
				If Abs(x-objectTileX(j))<4 And Abs(y-ObjectTileY(j))<4
					; close enough
					flag=1
					objectdata(i,1)=ObjectData(i,1)+1
					If ObjectData(i,1)>0 And ObjectData(i,1) Mod 3 =0
						 AddParticle(8,ObjectX(i),0.8,-ObjectY(i),Rand(0,360),ObjectData(i,1)/200.0+.5,0,0,0,Rnd(0,2),0,0,0,0,30,4)
					EndIf
					If ObjectData(i,1)>0 And ObjectData(i,1) Mod 30 =0
						SoundPitch SoundFX(90),18000+ObjectData(i,1)*200
						PlaySoundFX(90,ObjectTileX(i)+.5,ObjectTIleY(i)+.5)
					EndIf

					If ObjectData(i,1)=150
						ObjectData(i,1)=-1000
						For k=0 To 7
							dx#=Sin(k*45)
							dy#=Cos(k*45)
							CreateSpellBall(ObjectTileX(i)+.5+.6*dx,ObjectTileY(i)+.5+.6*dy,1.1,.1*dx,.1*dy,1,-1,-1,False,300)
						Next
					EndIf
				EndIf
			EndIf
		Next
		
		If flag=0 And ObjectData(i,1)>0
			ObjectData(i,1)=ObjectData(i,1)-1
		EndIf
		
			


End Function

Function ControlGhost(i)



	If ObjectActive(i)=1001
			EntityAlpha ObjectEntity(i),1
		;	HideEntity ObjectEntity(ObjectChild(i))
			;Return
	EndIf
	

	; check if biting someone
		For j=0 To NofObjects-1
			If ObjectActive(j)=1001
				If ObjectType(j)=1 Or ObjectType(j)=120  Or ObjectType(j)=400 Or ObjectType(j)=110 Or ObjectType(j)=390 Or ObjectType(j)=433
					If (ObjectX(i)-ObjectX(j))^2+(ObjectY(i)-ObjectY(j))^2<.5
						DestroyObject(j,0)
					EndIf
				EndIf
			EndIf
		Next

	If ObjectFrozen(i)=1
		; freeze
			ObjectFrozen(i)=1000*ObjectFrozen(i)

		

		

		

	
	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		
		ObjectPitch(i)=0
		ObjectRoll(i)=0
		ObjectZ(i)=0
	EndIf
	If ObjectFrozen(i)>2 Or ObjectFrozen(i)<0
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		
		Return
	EndIf
	
	If ObjectTileTypeCollision(i)=0
	
		ObjectYawAdjust(i)=0
		ObjectMovementSpeed(i)=5+5*ObjectData(i,1)
		ObjectTileX(i)=Floor(ObjectX(i))
		ObjectTileY(i)=Floor(ObjectY(i))
		ObjectTileTypeCollision(i)=2^0+2^3+2^4+2^9+2^10+2^11+2^12+2^14
		ObjectObjectTypeCollision(i)=2^1+2^3+2^6
		ObjectMovementType(i)=0
		
	EndIf
	
	
	ObjectMoveXGoal(i)=ObjectTileX2(PlayerObject)
	ObjectMoveYGoal(i)=ObjectTileY2(PlayerObject)
	
	If ObjectMovementTimer(i)>0
		TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),3,180)
	Else
		TurnObjectTowardDirection(i,ObjectTileX(PlayerObject)-ObjectTileX(i),ObjectTileY(PlayerObject)-ObjectTileY(i),1,180)
	EndIf
	
	If ObjectMovementTimer(i)>0 And ObjectData10(i)=0 
		If Rand(1,100)<20
			SoundPitch SoundFX(28),Rand(18000,30000)
			PlaySoundFX(28,ObjectX(i),ObjectY(i))
		EndIf
		
	EndIf
	ObjectData10(i)=ObjectMovementTimer(i)
	

	If ObjectStatus(i)=0
		If Rand(0,100)<5
			If ObjectData(i,8)=1
				a=Rand(0,360)
				b#=Rnd(0.002,0.003)
	
				AddParticle(30,ObjectX(i)+0.2*Sin(a),0,-ObjectY(i)-0.2*Cos(a),0,.2,b*Sin(a),0.005,-b*Cos(a),1,0,0,0,0,80,3)
	
			EndIf
		EndIf
			
		EntityAlpha ObjectEntity(i),Float(ObjectData(i,9))/60.0
		If ObjectData(i,9)>0 Then ObjectData(i,9)=ObjectData(i,9)-1
		
		ObjectMovementType(i)=0
		If Abs(ObjectX(i)-ObjectX(PlayerObject))<=ObjectData(i,0) And Abs(ObjectY(i)-ObjectY(PlayerObject))<=ObjectData(i,0)

			; in range
			ObjectStatus(i)=1
			SoundPitch SoundFX(28),21000

			PlaySoundFX(28,ObjectX(i),ObjectY(i))
		EndIf
			
	
	Else If ObjectStatus(i)=1
		ObjectData(i,8)=1
		ObjectMovementTYpe(i)=13
		EntityAlpha ObjectEntity(i),Float(ObjectData(i,9))/60.0
		If ObjectData(i,9)<50 Then ObjectData(i,9)=ObjectData(i,9)+2
		
		If Abs(ObjectX(i)-ObjectX(PlayerObject))>ObjectData(i,0) Or Abs(ObjectY(i)-ObjectY(PlayerObject))>ObjectData(i,0)

			; in range
			ObjectStatus(i)=0
			;PlaySoundFX(102,ObjectX(i),ObjectY(i))
		EndIf


	EndIf
		
	
		
End Function

Function ControlWraith(i)



	If ObjectActive(i)=1001
			EntityAlpha ObjectEntity(i),1
		;	HideEntity ObjectEntity(ObjectChild(i))
			;Return
	EndIf
	

	; check if biting someone
		For j=0 To NofObjects-1
			If ObjectActive(j)=1001
				If ObjectType(j)=1 Or ObjectType(j)=120  Or ObjectType(j)=400 Or ObjectType(j)=110 Or ObjectType(j)=390 Or ObjectType(j)=433
					If (ObjectX(i)-ObjectX(j))^2+(ObjectY(i)-ObjectY(j))^2<.5
						DestroyObject(j,0)
					EndIf
				EndIf
			EndIf
		Next

	If ObjectFrozen(i)=1
		; freeze
		ObjectFrozen(i)=1000*ObjectFrozen(i)

		
		

	
	EndIf
	If ObjectFrozen(i)=2
		; revert
		ObjectFrozen(i)=0
		
		ObjectPitch(i)=0
		ObjectRoll(i)=0
		ObjectZ(i)=0
	EndIf
	If ObjectFrozen(i)>2 Or ObjectFrozen(i)<0
		; frozen
		ObjectFrozen(i)=ObjectFrozen(i)-1
		
		
		Return
	EndIf
	
	
	ObjectMoveXGoal(i)=ObjectTileX2(PlayerObject)
	ObjectMoveYGoal(i)=ObjectTileY2(PlayerObject)
	
	If ObjectMovementTimer(i)>0
		TurnObjectTowardDirection(i,ObjectTileX2(i)-ObjectTileX(i),ObjectTileY2(i)-ObjectTileY(i),3,180)
	Else
		TurnObjectTowardDirection(i,ObjectTileX(PlayerObject)-ObjectTileX(i),ObjectTileY(PlayerObject)-ObjectTileY(i),1,180)
	EndIf
	
	
	ObjectData10(i)=ObjectMovementTimer(i)
	

	If ObjectStatus(i)=0
		EntityAlpha ObjectEntity(i),Float(ObjectData(i,9))/60.0
		If ObjectData(i,9)>0 Then ObjectData(i,9)=ObjectData(i,9)-1
		
		ObjectMovementType(i)=0
		If Abs(ObjectX(i)-ObjectX(PlayerObject))<=ObjectData(i,0) And Abs(ObjectY(i)-ObjectY(PlayerObject))<=ObjectData(i,0)


			; in range
			ObjectStatus(i)=1
			PlaySoundFX(29,ObjectX(i),ObjectY(i))
		EndIf
		ObjectData(i,8)=0

			
	
	Else If ObjectStatus(i)=1
		
		
		EntityAlpha ObjectEntity(i),Float(ObjectData(i,9))/60.0
		If ObjectData(i,9)<50 Then ObjectData(i,9)=ObjectData(i,9)+2
		
		If ObjectData(i,8)<ObjectData(i,1)
			ObjectData(i,8)=ObjectData(i,8)+1
		 	If ObjectData(i,8)=ObjectData(i,1)-20
				Select ObjectData(i,2)
					
					Case 0
						part=25
					Case 1
						part=28
					Case 2
						part=27
					
				End Select
				
				For xx=1 To 30
					AddParticle(part,ObjectX(i)+Sin(xx*12),1.1,-ObjectY(i)+Cos(xx*12),Rand(0,360),.3,-0.05*Sin(xx*12),0,-0.05*Cos(xx*12),Rnd(0,2),0,0,0,0,30,4)
				Next
				If ObjectData(i,2)=2
					ObjectData(i,6)=ObjectTileX2(PlayerObject)*100+50
					ObjectData(i,7)=ObjectTileY2(PlayerObject)*100+50
				Else
					ObjectData(i,6)=(ObjectX(PlayerObject)*100+0)
					ObjectData(i,7)=ObjectY(PlayerObject)*100+0
				EndIf

				

			EndIf	
		Else
			;fire
			If ObjectData(i,6)=-1
				If ObjectData(i,2)=2
					ObjectData(i,6)=ObjectTileX2(PlayerObject)*100+50

					ObjectData(i,7)=ObjectTileY2(PlayerObject)*100+50

				Else
					ObjectData(i,6)=(ObjectX(PlayerObject)*100+0)
					ObjectData(i,7)=ObjectY(PlayerObject)*100+0
				EndIf

			EndIf
			ObjectData(i,8)=0
			
			dx#=(ObjectData(i,6)/100.0)-ObjectX(i)
			dy#=(ObjectData(i,7)/100.0)-ObjectY(i)
			
			total#=Sqr(dx^2+dy^2)
			dx=dx/total
			dy=dy/total
			
			

			
			If ObjectTileX(i)+dx>=0 And ObjectTileY(i)+dy>=0 And ObjectTileX(i)+dx<levelwidth And ObjectTileY(i)+dy<levelheight
				If LevelTileLogic(ObjectTileX(i)+dx,ObjectTileY(i)+dy)<>1
					If ObjectData(i,3)=0
						If ObjectData(i,2)=0
							CreateSpellBall(ObjectX(i)+.6*dx,ObjectY(i)+.6*dy,1.1,.1*dx,.1*dy,1,ObjectData(i,6)/100,ObjectData(i,7)/100,False,300)
						Else If ObjectData(i,2)=1
							CreateSpellBall(ObjectX(i)+.6*dx,ObjectY(i)+.6*dy,1.1,.1*dx,.1*dy,4,ObjectData(i,6)/100,ObjectData(i,7)/100,False,300)
						Else If ObjectData(i,2)=2
							CreateSpellBall(ObjectX(i)+.6*dx,ObjectY(i)+.6*dy,1.1,.1*dx,.1*dy,3,ObjectData(i,6)/100,ObjectData(i,7)/100,False,300)
						Else If ObjectData(i,2)=3
							CreateSpellBall(ObjectX(i)+.6*dx,ObjectY(i)+.6*dy,1.1,.1*dx,.1*dy,2,ObjectData(i,6)/100,ObjectData(i,7)/100,False,300)
						Else If ObjectData(i,2)=4
							CreateSpellBall(ObjectX(i)+.6*dx,ObjectY(i)+.6*dy,1.1,.1*dx,.1*dy,6,ObjectData(i,6)/100,ObjectData(i,7)/100,False,300)
						Else If ObjectData(i,2)=5
							CreateSpellBall(ObjectX(i)+.6*dx,ObjectY(i)+.6*dy,1.1,.1*dx,.1*dy,5,ObjectData(i,6)/100,ObjectData(i,7)/100,False,300)
						EndIf
					Else
						If ObjectData(i,2)=0
						CreateSpellBall(ObjectX(i)+.6*dx,ObjectY(i)+.6*dy,1.1,.1*dx,.1*dy,1,-1,-1,False,300)
						Else If ObjectData(i,2)=1
							CreateSpellBall(ObjectX(i)+.6*dx,ObjectY(i)+.6*dy,1.1,.1*dx,.1*dy,4,-1,-1,False,300)
						Else If ObjectData(i,2)=2
							CreateSpellBall(ObjectX(i)+.6*dx,ObjectY(i)+.6*dy,1.1,.1*dx,.1*dy,3,-1,-1,False,300)
						Else If ObjectData(i,2)=3
							CreateSpellBall(ObjectX(i)+.6*dx,ObjectY(i)+.6*dy,1.1,.1*dx,.1*dy,2,-1,-1,False,300)
						Else If ObjectData(i,2)=4
							CreateSpellBall(ObjectX(i)+.6*dx,ObjectY(i)+.6*dy,1.1,.1*dx,.1*dy,6,-1,-1,False,300)
						Else If ObjectData(i,2)=5
							CreateSpellBall(ObjectX(i)+.6*dx,ObjectY(i)+.6*dy,1.1,.1*dx,.1*dy,5,-1,-1,False,300)
						EndIf
					EndIf
				EndIf
			EndIf
			PlaySoundFX(103,ObjectTIleX(i),ObjectTIleY(i))

			ObjectData(i,6)=-1

			
		EndIf
		
		If Abs(ObjectX(i)-ObjectX(PlayerObject))>ObjectData(i,0) Or Abs(ObjectY(i)-ObjectY(PlayerObject))>ObjectData(i,0)

			ObjectData(i,8)=0
			; in range
			ObjectStatus(i)=0
			;PlaySoundFX(102,ObjectX(i),ObjectY(i))
		EndIf


	EndIf
		

	

	
	
		
End Function



Function ActivateCommand(command,data1,data2,data3,data4)
	; performs the indicated command
	Select command
	Case 0
		; no function
		Return
	Case 1
		; open/turn-on objects with ID data1
		; data 4: If 0, use this level, if >0 use that numbered .lev file, 
		;		  If <0, use that (-) numbered hub file (except if in customlevel)
		;If data4=0 Or data4=AdventureCurrentLevel
			For i=0 To NofObjects-1
				If ObjectExists(i)=True
					If ObjectID(i)=data1
					If ObjectType(i)=51
							; spellball generator
							dx=(ObjectData(i,1)-Floor(ObjectX(i)))
							dy=(ObjectData(i,2)-Floor(ObjectY(i)))
							total=Sqr(dx^2+dy^2)
							If total>=1
								CreateSpellBall(ObjectX(i)+.6*dx/total,ObjectY(i)+.6*dy/total,.7,.1*dx/total,.1*dy/total,ObjectData(i,0),ObjectData(i,1),ObjectData(i,2),False,300)
							EndIf
						Else
							ActivateObject(i)
						EndIf


					EndIf
					
				EndIf
			Next
		;EndIf
	Case 2
		; close/turn-off objects with ID data1
		; data 4: If 0, use this level, if >0 use that numbered .lev file, 
		;		  If <0, use that (-) numbered hub file (except if in customlevel)
		For i=0 To NofObjects-1
			If ObjectExists(i)=True
				If ObjectID(i)=data1
					DeActivateObject(i)
				EndIf
			EndIf
		Next

	Case 3
		; toggle objects with ID data1
		; data 4: If 0, use this level, if >0 use that numbered .lev file, 
		;		  If <0, use that (-) numbered  file (except if in customlevel)
		
		For i=0 To NofObjects-1
			If ObjectExists(i)=True
				If ObjectID(i)=data1
					ToggleObject(i)
				EndIf
			EndIf
		Next
	
					
	Case 4
		; Change an Object Value with ID data1 to new value (data3)
		; The data to be changed is determined by a coded data 2
		; The level is determined by data4 - either 0 (current), or 1+ (adventure .lev) or (-1)- (hub .lev)
		If Data4=0 Or data4=AdventureCurrentLevel
			; change it in the current data
			ChangeIntCurrentLevel(data1,data2,data3)
			
		Else If data4>0
			; change it in adventure .lev file
			ChangeIntAcrossLevels(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Adventure\"+Str$(data4)+".wlv",data1,data2,data3)
		Else If data4<0
			; change it in hub .lev file
			ChangeIntAcrossLevels(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\"+Str$(-data4)+".wlv",data1,data2,data3)

			
		EndIf
		
		
		
		
		
		
	
		
	Case 5
		; destroy object with ID data1	
		For i=0 To NofObjects-1
			If ObjectExists(i)=True
				If ObjectID(i)=data1
					DestroyObject(i,0)
				EndIf
			EndIf
		Next
	Case 6
		; Set Light to data1/data2/data3
		
		SetLight(data1,data2,data3,1,data1/2,data2/2,data3/2,1)
					
	Case 7
	
		; Start Level data1 with StartX/Y Data2/Data3
		; (you should only get here if button was pushed by a player)
		If LevelTimer<1000000000
			DelayCommand=7
			DelayData1=Data1
			DelayData2=Data2
			DelayData3=Data3
			LevelTimer=1000000000
			; note - need to make sure that if there are other delaycommands, the cannot overlap
			; (this one, e.g., stays active for 50 frames)
			LightRedGoal2=LightRedGoal
			LightGreenGoal2=LightGreenGoal
			LightBlueGoal2=LightBlueGoal
			AmbientRedGoal2=AmbientRedGoal
			AmbientGreenGoal2=AmbientGreenGoal
			AmbientBlueGoal2=AmbientBlueGoal
			SetLight(0,0,0,7,0,0,0,7)
			
			ObjectMoveXGoal(PlayerObject)=ObjectTileX2(PlayerObject)
			ObjectMoveYGoal(PlayerObject)=ObjectTileY2(PlayerObject)
			PlayerTalkToGoalObject=-1
			
			; also turn fx=1 for level arrows
			For i=0 To NofObjects-1
				If ObjectTYpe(i)=90 And ObjectSubTYpe(i)=10
					EntityFX ObjectENtity(i),0
				EndIf
			Next
			
			If gamemode=5 Or gamemode=6 Then closerucksack(8)

		EndIf
		
	Case 8
		; Start Adventure # Data1
		If LevelTimer<1000000000
			; during game
			DelayCommand=8
			DelayData1=Data1
						
			LevelTimer=1000000000
			LightRedGoal2=LightRedGoal
			LightGreenGoal2=LightGreenGoal
			LightBlueGoal2=LightBlueGoal
			AmbientRedGoal2=AmbientRedGoal
			AmbientGreenGoal2=AmbientGreenGoal
			AmbientBlueGoal2=AmbientBlueGoal

			SetLight(0,0,0,7,0,0,0,7)
			
			For i=0 To 79
				DeActivateIcon(i)
			Next
			If GameMode=8 Then EndDialog()
			EntityAlpha LevelCursor,0
			EntityAlpha MouseCursor,0
			
			ObjectMoveXGoal(PlayerObject)=ObjectTileX2(PlayerObject)
			ObjectMoveYGoal(PlayerObject)=ObjectTileY2(PlayerObject)
			; also turn fx=1 for level arrows
			For i=0 To NofObjects-1
				If ObjectTYpe(i)=90 And ObjectSubTYpe(i)=10
					EntityFX ObjectENtity(i),0
				EndIf
			Next

		Else If LevelTimer>=1000002000  And LevelTimer<=1000002500
			; in level lost
			EndLevel()
			AdventureCancelData()
			EndAdventure()
			DialogBackGroundSize=0 
			HideEntity DialogBackGroundEntity
			DeleteIcon(9)
			StartAdventure(AdventureCurrentName$,AdventureCurrentStatus,AdventureCurrentNumber)
		EndIf
	

		
		
			
		

	Case 9
		; Earthquake with time Data1
		CameraShakeTimer=Data1
		PlaySoundFX(122,-1,-1)
		
		
	Case 10
		; Play Global Sound FX
		PlaySoundFX(Data1,-1,-1)
		
	Case 13
		; change weather
		levelweather=data1	
		If data1=8 Then playsoundfxnow(98)
		
	; *******
	; DIALOG COMMANDS
	; *******
	Case 21
		; Start Dialog #Data1 with interchange #Data2 (-1 if using the default 
		;											starting interchange of that dialog)
		; Data3=0 means fullscreen, data3=1 means image display
		StartDialog(Data1,Data2,Data3)	
		PlaySoundFX(131,-1,-1)
	Case 22
		; Change Starting Dialog of Dialog Data1 (either in hub or adventure, depends where you are)
		
		; do not run this from within a dialog!!! or if there is possibility of being in a dialog
		; while this is being activated!
		
		LoadDialog(Data1)
		StartingInterchange=Data2
		SaveDialog(Data1)
	Case 23
		; Activate AskAbout #Data2 of Dialog #Data1
		If GameMode<>8 Or Data1<>CurrentDialog
			; not already in this dialog - load/save the file
			If GameMode=8
				SaveDialog(CurrentDialog)
			EndIf
			LoadDialog(Data1)
		EndIf
		; Now do the activating
		AskAboutActive(Data2)=-2
		If GameMode<>8 Or Data1<>CurrentDialog
			; not already in this dialog - load/save the file
			SaveDialog(Data1)
			If GameMode=8
				LoadDialog(CurrentDialog)
			EndIf
		EndIf
	Case 24
		; DeActivate AskAbout #Data2 of Dialog #Data1
		If GameMode<>8 Or Data1<>CurrentDialog
			; not already in this dialog - load/save the file
			If GameMode=8
				SaveDialog(CurrentDialog)
			EndIf
			LoadDialog(Data1)
		EndIf
		; Now do the toggling
		AskAboutActive(Data2)=-1
		If GameMode<>8 Or Data1<>CurrentDialog
			; not already in this dialog - load/save the file
			SaveDialog(Data1)
			If GameMode=8
				LoadDialog(CurrentDialog)
			EndIf
		EndIf
	Case 25
		; Toggle AskAbout #Data2 of Dialog #Data1
		If GameMode<>8 Or Data1<>CurrentDialog
			; not already in this dialog - load/save the file
			If GameMode=8
				SaveDialog(CurrentDialog)
			EndIf
			LoadDialog(Data1)
		EndIf
		; Now do the toggling
		If AskAboutActive(Data2)=-1 
			AskAboutActive(Data2)=-2
		Else
			AskAboutActive(Data2)=-1
		EndIf
		If GameMode<>8 Or Data1<>CurrentDialog
			; not already in this dialog - load/save the file
			SaveDialog(Data1)
			If GameMode=8
				LoadDialog(CurrentDialog)
			EndIf
		EndIf

	Case 26
		; Set AskAboutActive #Data2 of Dialog #Data1 to value #Data3
		If GameMode<>8 Or Data1<>CurrentDialog
			; not already in this dialog - load/save the file
			If GameMode=8
				SaveDialog(CurrentDialog)
			EndIf
			LoadDialog(Data1)
		EndIf
		; Now do the toggling
		AskAboutActive(Data2)=Data3
		If GameMode<>8 Or Data1<>CurrentDialog
			; not already in this dialog - load/save the file
			SaveDialog(Data1)
			If GameMode=8
				LoadDialog(CurrentDialog)
			EndIf
		EndIf
	Case 27
		; Set AskAbout #Data2 of Dialog #Data1 to point to Interchange #Data3
		If GameMode<>8 Or Data1<>CurrentDialog
			; not already in this dialog - load/save the file
			If GameMode=8
				SaveDialog(CurrentDialog)
			EndIf
			LoadDialog(Data1)
		EndIf
		; Now do the toggling
		AskAboutInterChange(Data2)=Data3
		If GameMode<>8 Or Data1<>CurrentDialog
			; not already in this dialog - load/save the file
			SaveDialog(Data1)
			If GameMode=8
				LoadDialog(CurrentDialog)
			EndIf
		EndIf
	Case 28
		; Activate MasterAskAbout #Data1
		MasterAskAboutActive(Data1)=1
	Case 29
		; DeActivate MasterAskAbout #Data1
		MasterAskAboutActive(Data1)=0
	Case 30
		; Toggle MasterAskAbout #Data3
		MasterAskAboutActive(Data1)=1-MasterAskAboutActive(Data1)
	
	; *******
	; MOVEMENT COMMANDS
	; *******
	Case 51
		; move object with ID data1 to midpoint of (data2,data3) using movementtype data4 
		; speed must be preset by objectspeed(i)
		For i=0 To NofObjects-1
			If ObjectExists(i)=True
				If ObjectID(i)=data1
					ObjectMovementType(i)=data4
					ObjectXGoal(i)=data2+.5
					ObjectYGoal(i)=data3+.5
					
					ObjectSpeed(i)=0.015
									
				EndIf
			EndIf
		Next
	Case 52
		; move object with ID data1 using movementtype data2 and movementtypedata data3
		For i=0 To NofObjects-1
			If ObjectExists(i)=True
				If ObjectID(i)=data1
					ObjectMovementType(i)=data2
					ObjectMovementTypeData(i)=data3
									
				EndIf
			EndIf
		Next
		
	; *********
	; NPC COMMANDS
	; *********

	Case 61
		; Move NPC with ID data1 to point (data2,data3) - ALSO WORKS FOR THWARTS/WISP
		
		For i=0 To NofObjects-1
			If ObjectExists(i)=True And (ObjectType(i)=110 Or ObjectType(i)=290 Or ObjectType(i)=330 Or ObjectType(i)=380 Or ObjectType(i)=390 Or ObjectType(i)=433)
				If ObjectID(i)=data1 And (ObjectMovementTimer(i)>0 Or (data2<>ObjectTileX(i) Or data3<>ObjectTileY(i)))
					
					If i=dialogObject1 And gamemode=8
						
						ObjectData10(i)=data2+data3*200
					Else
						ObjectMovementType(i)=10
						ObjectMoveXGoal(i)=data2
						ObjectMoveYGoal(i)=data3
						
					EndIf
									
				EndIf
			EndIf
		Next
	Case 62
		; Change NPC with ID data1 : Talkable/ExpressionTexture/ObjectYaw
		

		For i=0 To NofObjects-1
			If ObjectExists(i)=True  And (ObjectType(i)=110 Or ObjectType(i)=330 Or ObjectType(i)=180 Or ObjectType(i)=380 Or ObjectType(i)=390)
				If ObjectID(i)=data1 
					
					If data2>=0 
						ObjectTalkable(i)=data2
						
					EndIf
					
					If ObjectYawAdjust(i)<>data4
						For j=1 To 3
							If ObjectEntity(i)>0
								If data4>=0
									RotateEntity GetChild(ObjectEntity(i),j),0,data4-ObjectYawAdjust(i),0
								EndIf
							EndIf

						Next
					EndIf
					
					If data3>=0 
						ObjectData(i,1)=data3 
						If ObjectEntity(i)>0 Then EntityTexture GetChild(ObjectEntity(i),3),StinkerTexture(ObjectData(i,0),data3)
					EndIf
					
					If data4>=0 ObjectYawAdjust(i)=data4
									
				EndIf
			EndIf
		Next
	Case 63
		; Change NPC with ID data1 : WalkAnim/IdleTurning/IdleAnim
		

		For i=0 To NofObjects-1
			If ObjectExists(i)=True  And (ObjectType(i)=110 Or ObjectType(i)=290)
				If ObjectID(i)=data1
					If data2>=0 ObjectData(i,6)=data2
					If data3>=0 ObjectData(i,7)=data3
					If data4>=0 ObjectData(i,8)=data4
													
				EndIf
			EndIf
		Next
	Case 64
		; Do an NPC Exlamation for ID data1:   Particle Data2 (Data3 times)	- this works for any object (not just NPC)
		
		; if Data1=-1 do for PlayerObject
		If Data1=-1
			AddParticle(data2,ObjectTileX(PlayerObject)+.5,1.3,-ObjectTileY(PlayerObject)-.5,0,.5,0,0.0125,0,0,.004,0,-.0001,0,150,3)
			If data3>1
				For j=2 To data3
					AddParticle(data2,ObjectTileX(PlayerObject)+.5,1.3,-ObjectTileY(PlayerObject)-.5,0,0.4,Rnd(-.01,.01),Rnd(0.01,0.014),Rnd(-.01,.01),0,.004,0,Rnd(-.0002,.00005),0,Rand(50,150),3)
				Next
			EndIf
	
		Else
			For i=0 To NofObjects-1
				If ObjectExists(i)=True 
					If ObjectID(i)=data1
						AddParticle(data2,ObjectTileX(i)+.5,1.3,-ObjectTileY(i)-.5,0,.5,0,0.0125,0,0,.004,0,-.0001,0,150,3)
						If data3>1
							For j=2 To data3
								AddParticle(data2,ObjectTileX(i)+.5,1.3,-ObjectTileY(i)-.5,0,0.4,Rnd(-.01,.01),Rnd(0.01,0.014),Rnd(-.01,.01),0,.004,0,Rnd(-.0002,.00005),0,Rand(50,150),3)
							Next
						EndIf
					EndIf
				EndIf
			Next
		EndIf
	; *****
	; SPECIAL COMMMANDS
	; *****
	Case 102
		; start cutscene harbour
		LightRedGoal2=LightRedGoal
		LightGreenGoal2=LightGreenGoal
		LightBlueGoal2=LightBlueGoal
		AmbientRedGoal2=AmbientRedGoal
		AmbientGreenGoal2=AmbientGreenGoal
		AmbientBlueGoal2=AmbientBlueGoal

		delaycommand=102
		For i=0 To 79
			deleteicon(i)
		Next
	Case 103,104
		num=0
		For j=0 To 99
			If inventoryitem(j)=3021
				num=num+1
			EndIf
		Next
		
	If (num=4 And command=103) Or (num=3 And command=104)
		MasterAskAboutActive(2)=1
		string$=GlobalDirName$+"\Player Profiles\"+playername+"\Current\Hub\21.wlv"
		LoadLevel(string$,0,0)
		
		LightRedGoal2=LightRedGoal
		LightGreenGoal2=LightGreenGoal
		LightBlueGoal2=LightBlueGoal
		AmbientRedGoal2=AmbientRedGoal
		AmbientGreenGoal2=AmbientGreenGoal
		AmbientBlueGoal2=AmbientBlueGoal
		
		ActivateCommand(62,1,71,-1,-1)
		ActivateCommand(62,21,72,-1,-1)
		
		SaveLevel(string$)
		
		If command=103
			string$=GlobalDirName$+"\Player Profiles\"+playername+"\Current\Hub\41.wlv"
		Else If command=104
			string$=GlobalDirName$+"\Player Profiles\"+playername+"\Current\Hub\65.wlv"
		EndIf
		
		LoadLevel(string$,0,0)
		LightRedGoal2=LightRedGoal
		LightGreenGoal2=LightGreenGoal
		LightBlueGoal2=LightBlueGoal
		AmbientRedGoal2=AmbientRedGoal
		AmbientGreenGoal2=AmbientGreenGoal
		AmbientBlueGoal2=AmbientBlueGoal
		
		ActivateCommand(1,39,0,0,0)
		SaveLevel(string$)
		
	EndIf

		
				

	Case 111
		; refill lamp
		currentlightpower=99
	Case 112
		inventorysize=4
	Case 113
		inventorysize=5
	Case 114
		ShardsAreActive=True
		
	Case 115
		DelayCommand=115
		playsoundfxnow(42)
		StartMenu(8)
		
	Case 211
		inventorysize=1
	Case 212
		inventorysize=2
	Case 213
		inventorysize=3
	Case 216
		inventorysize=6
	Case 217
		inventorysize=7
		
	Case 222
		If data1=0 Or data1=1 Then
			For j=0 To NofObjects-1
				If data1=0 Then ObjectXScale(j)=ObjectXScale(j)+data2/100.0
				If data1=1 Then ObjectXScale(j)=ObjectXScale(j)-data2/100.0
			Next
		ElseIf data1=2 Or data1=3 Then
			For j=0 To NofObjects-1
				If data1=2 Then ObjectYScale(j)=ObjectYScale(j)+data2/100.0
				If data1=3 Then ObjectYScale(j)=ObjectYScale(j)-data2/100.0
			Next
		ElseIf data1=4 Or data1=5 Then
			For j=0 To NofObjects-1
				If data1=4 Then ObjectZScale(j)=ObjectZScale(j)+data2/100.0
				If data1=5 Then ObjectZScale(j)=ObjectZScale(j)-data2/100.0
			Next
		EndIf
		
	Case 223
		If data1=0 Or data1=1 Then
			For j=0 To NofObjects-1
				If ObjectID(j)=data4
					If data1=0 Then ObjectXScale(j)=ObjectXScale(j)+data2/100.0
					If data1=1 Then ObjectXScale(j)=ObjectXScale(j)-data2/100.0
				EndIf
			Next
		ElseIf data1=2 Or data1=3 Then
			For j=0 To NofObjects-1
				If ObjectID(j)=data4
					If data1=2 Then ObjectYScale(j)=ObjectYScale(j)+data2/100.0
					If data1=3 Then ObjectYScale(j)=ObjectYScale(j)-data2/100.0
				EndIf
			Next
		ElseIf data1=4 Or data1=5 Then
			For j=0 To NofObjects-1
				If ObjectID(j)=data4
					If data1=4 Then ObjectZScale(j)=ObjectZScale(j)+data2/100.0
					If data1=5 Then ObjectZScale(j)=ObjectZScale(j)-data2/100.0
				EndIf
			Next
		EndIf
		
	End Select

End Function

Function ChangeIntCurrentLevel(ID,code,value)
	For i=0 To NofObjects-1
		If ObjectExists(i)=True
			If ObjectID(i)=ID
				Select code
				Case 1
					ObjectMovementType(i)=value
				Case 2
					ObjectMovementTypeData(i)=value
				Case 3
					ObjectRadiusType(i)=value
				Case 4
					ObjectData10(i)=value
				Case 5
					ObjectAttackPower(i)=value
				Case 6
					ObjectDefensePower(i)=value
				Case 7
					ObjectDestructionType(i)=value
				Case 8
					ObjectID(i)=value
				Case 9
					ObjectType(i)=value
				Case 10
					ObjectSubType(i)=value
				Case 11
					ObjectActive(i)=value
				Case 12
					ObjectActivationType(i)=value
				Case 13
					ObjectActivationSpeed(i)=value
				Case 14
					ObjectStatus(i)=value
				Case 15
					ObjectTimer(i)=value
				Case 16
					ObjectTimerMax1(i)=value
				Case 17
					ObjectTimerMax2(i)=value
				Case 18
					ObjectTeleportable(i)=value
				Case 19
					ObjectButtonPush(i)=value
				Case 20
					ObjectWaterReact(i)=value
				Case 21
					ObjectTelekinesisable(i)=value
				Case 22
					ObjectFreezable(i)=value
				Case 23,24,25,26,27,28,29,30,31,32
					ObjectData(i,code-23)=value
				
				End Select
			EndIf
		EndIf
	Next


End Function

Function ChangeIntAcrossLevels(filename$,ID,code,value)
	
	; change a coded value for each object ID in the given level filename
	
	; to do this we open the file and go through all objectdata to search for matching ID
	
	; code is re-worked into a filepos
	Select code
	Case 1,2
		code=108+(code-1)*4
	Case 3,4
		code=124+(code-3)*4
	Case 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22
		code=140+(code-5)*4
	Case 23,24,25,26,27,28,29,30,31,32
		code=228+(code-23)*4
	End Select
	
	file=OpenFile (filename$)
	
	a=ReadInt(file) ; length and width
	b=ReadInt(file)
	
	; get to beginning of objects
	SeekFile file,8+4*(a*b*13+3)
	k=ReadInt(file) ; nofobjects
	For i=1 To k
		; now the objects
		ReadString$(file)
		ReadString$(file)
		lastpos=FilePos(file) ; get this in order to "track back" if we find one with matching ID
		; get to ID
		SeekFile File,lastpos+38*4
		ThisID=ReadInt(file)
		If ThisID=ID
			; yep
				
			SeekFile file,lastpos+code
			WriteInt file,value
			SeekFile file,FilePos(file)
			
		EndIf
		; go to end of object
		SeekFile File,lastpos+(38+29)*4
		SeekFile file,FilePos(file)
		For j=0 To 3
			ReadString$(file)
		Next
		
		SeekFile file,FilePos(file)+35*4
		;For j=0 To 24
		;	ReadInt(file)
		;Next
		;For j=0 To 9
		;	ReadFloat(file)
		;Next
		ReadString$(file)
		ReadString$(File)
			
	Next
		
		
		
		
	
	CloseFile file

End Function


Function Minimum2#(x#,y#)
	If x<y
		Return x
	Else
		Return y
	EndIf
End Function
Function Minimum4#(x#,y#,z#,w#)
	If x<=y And x<=z And x<=w
		Return x
	Else If y<=x And y<=z And y<=W
		Return y
	Else If z<=x And z<=y And z<=w
		Return z
	Else 
		Return w
	EndIf
End Function
Function Maximum2#(x#,y#)
	If x>y
		Return x
	Else
		Return y
	EndIf
End Function

Function Value(tex$)
	;converts a string of digits to an integer - ignores any non-digit values
	integer=0
	For i=1 To Len(tex$)
		digit=Asc(Mid$(tex$,i,1))-48
		If digit>=0 And digit<10
			integer=(integer+digit)*10
		EndIf
	Next
	Return integer/10
End Function

Function AStar(Obj,StartX,StartY,EndX,EndY,ReportNodes,MaxNodes,Tolerance)
	
	; Performs an AStar Search From StartX/Y To EndX/Y
	
	; Reports back in the form of AStarPathNodes... the number of nodes (i.e. the number of next steps) to report is 
	; given by variable 'ReportNodes' (3 is minimum). After call to this function, the variables AStarX(i) and AStarY(i)
	; contain the next few steps to be taken in this path. 
	
	; Obj is the object number - used to determine if tiles are walkable or not
	
	; MaxNodes contains how many nodes to explore before 'giving up'. E.g. if after 200 Nodes the path is not found, a failure
	; is reported. 
	
	; Tolerance is when to report back success and end search (e.g. tol=0: must be on endtile, tol=2: can be two steps away)
	
	; Failure of the search is reported by returning AStarPathNode(1)=-1
	
	If ReportNodes<3 Then ReportNodes=3
	If ReportNodes>100 Then ReportNodes=100
	
	NofAStarNodes=1
	AStarParent(1)=1
	AStarX(1)=StartX
	AStarY(1)=StartY
	AStarOpen(1)=1
	AStarH(1)=(endx-startx)^2+(endy-starty)^2;10*(Abs(EndX-StartX)+Abs(EndY-StartY))
	AStarG(1)=0
	AStarF(1)=AStarG(1)+AStarH(1)
	AStarGrid(StartX,StartY)=1
	
	PathFound=False
	NoPath=False
	
	
	Repeat
	
		; Go through list of open Nodes, find one with lowest F-Score
		LowF=99999
		LowNode=-1
		For i=1 To NofAStarNodes
			
			If AStarOpen(i)=1 And AStarF(i)<LowF
				LowNode=i
				LowF=AStarF(i)
			EndIf
			
		Next
	
		If LowNode=-1 Or NofAStarNodes>=MaxNodes
			; no Path was found
			NoPath=True
			Exit
		EndIf
		
		; Found Lowest F-Score. Close this Node 
		AStarOpen(LowNode)=2
		AStarGrid(AStarX(LowNode),AStarY(LowNode))=9999
		
		;And check its four neighbours
		
		
		For i=1 To 4
			Select i
			Case 1
				x=AStarX(LowNode)+1
				y=AStarY(LowNode)
			Case 2
				x=AStarX(LowNode)-1
				y=AStarY(LowNode)
			Case 3
				x=AStarX(LowNode)
				y=AStarY(LowNode)+1
			Case 4
				x=AStarX(LowNode)
				y=AStarY(LowNode)-1
			End Select
		
			If x>=0 And x<100 And y>=0 And y<100
				If CanObjectMoveToTile(obj,x,y,False,False)=True Or (x=Endx And y=Endy)
					; found a walkable tile 
					; (doesn't check for diagonal moves in this algorithm,
					;  and doesn't allow for final-destination moves (e.g. onto teleporter) unless x/y is at end)
					If AStarGrid(x,y)=0
						; undiscovered-make new
			
						NofAStarNodes=NofAStarNodes+1
						AStarParent(NofAStarNodes)=LowNode
						AStarX(NofAStarNodes)=x
						AStarY(NofAStarNodes)=y
						AStarOpen(NofAStarNodes)=1
						AStarH(NofAStarNodes)=(endx-x)^2+(endy-y)^2;10*(Abs(EndX-x)+Abs(EndY-y))
						AStarG(NofAStarNodes)=AStarG(LowNode)+10 ; (only doing straight moves, otherwise add 14)
						AStarF(NofAStarNodes)=AStarG(NofAStarNodes)+AStarH(NofAStarNodes)
						AStarGrid(x,y)=1
						
					Else 
						; already on list 
						If AStarOpen(AStarGrid(x,y))=1 ;(but Not closed yet)
							; check if we can get lower score
							h=(endx-x)^2+(endy-y)^2;10*(Abs(EndX-x)+Abs(EndY-y))
							g=AStarG(LowNode)+10 ; (only doing straight moves, otherwise add 14)
							If (g+h)<AStarF(AStarGrid(x,y))
								; yep, found better path
								AStarG(AStarGrid(x,y))=g
								AStarH(AStarGrid(x,y))=h
								AStarF(AStarGrid(x,y))=g+h
								AStarParent(AStarGrid(x,y))=LowNode
							EndIf
						EndIf
					EndIf
					; did we reach goal
					If Abs(x-EndX)<=Tolerance And Abs(y-endY)<=Tolerance
						PathFound=True
						i=4
					EndIf
				EndIf
			EndIf
		Next
	Until pathfound=True Or nopath=True
	
	
	
	; clean up astargrid
	For i=1 To NofAStarNodes
		AStarGrid(AStarX(i),AStarY(i))=0
	Next
	
	If nopath=True
		AStarPathNode(1)=-1
		Return
	EndIf
	
	; now return the path (the first "nodes" steps)
	For i=1 To ReportNodes
		AStarPathNode(i)=NofAStarNodes
	Next
	
	Repeat
		For i=ReportNodes To 2 Step -1
			AStarPathNode(i)=AStarPathNode(i-1)
		Next
		AStarPathNode(1)=AStarParent(AStarPathNode(1))
	Until AStarX(AStarParent(AStarPathNode(1)))=StartX And AStarY(AStarParent(AStarPathNode(1)))=StartY
	
	
	
End Function				