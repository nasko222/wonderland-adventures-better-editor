









; BUTTONS
Function SetupMenu()
	
	
	DialogBackGroundEntity=CreateMesh(camera)
	surface=CreateSurface(DialogBackGroundEntity)
	AddVertex surface,-2,1.3,5,0,0
	AddVertex surface,2,1.3,5,1,0
	AddVertex surface,-2,-0.5,5,0,1
	AddVertex surface,2,-0.5,5,1,1
	AddTriangle surface,0,1,2
	AddTriangle surface,2,1,3
	
	EntityColor DialogBackGroundEntity,200,50,30
	EntityAlpha DialogBackGroundEntity,.5
	EntityOrder DialogBackGroundEntity,-9
	
	HideEntity DialogBackGroundEntity
	
	DialogBackGroundEntity2=CreateMesh(camera)
	surface=CreateSurface(DialogBackGroundEntity2)
	AddVertex surface,-3,-1.9,5,0,0
	AddVertex surface,3,-1.9,5,1,0
	AddVertex surface,-3,-2.3,5,0,1
	AddVertex surface,3,-2.3,5,1,1
	AddTriangle surface,0,1,2
	AddTriangle surface,2,1,3

	EntityColor DialogBackGroundEntity2,120,100,80
	EntityAlpha DialogBackGroundEntity2,.5
	EntityOrder DialogBackGroundEntity2,-9
	
	;HideEntity DialogBackGroundEntity2
	
	; Standard Title Entities
	
	If WAEpisode=0
		; logo
		titlemenuentity(60)=CreateSquare()
		titlemenutexture(60)=myLoadTexture("data\graphics\logos\wonderlandadventures.bmp",4)
		EntityTexture titlemenuentity(60),titlemenutexture(60)
		RotateEntity titlemenuentity(60),-90,0,0
		PositionEntity titlemenuentity(60),0,.35,2
		ScaleEntity titlemenuentity(60),.8,.8,.8
		EntityFX titlemenuentity(60),1
		HideEntity TItlemenuentity(60)
		
	; background plane
		titlemenuentity(80)=CreatePlane()
		PositionEntity titlemenuentity(80),0,0,200
		RotateEntity titlemenuentity(80),-90,0,0
		TurnEntity titlemenuentity(80),0,90,0
		titlemenutexture(80)=myLoadTexture("data\graphics\logos\starpaper2.jpg",1)
		ScaleTexture titlemenutexture(80),70,70
		EntityTexture titlemenuentity(80),titlemenutexture(80)
		EntityFX titlemenuentity(80),1
		
		; falling stars
		For i=81 To 99
			titlemenuentity(i)=CopyEntity(starmesh)
			RotateEntity Titlemenuentity(i),-90,0,0
			EntityFX titlemenuentity(i),1
			PositionEntity titlemenuentity(i),Rnd(-10,30),Rnd(15,30),Rnd(20,30)

		Next
	EndIf
	
	
	; Save Slot Picture

	For i=0 To 9
		SaveSlotEntity(i)=CreateMesh(camera)
		surface=CreateSurface (SaveSlotEntity(i))
		AddVertex (surface,-1,1,0,0,0)
		AddVertex (surface,1,1,0,1,0)
		AddVertex (surface,-1,-0.5,0,0,0.75)
		AddVertex (surface,1,-0.5,0,1,0.75)
		AddTriangle (surface,0,1,2)
		AddTriangle (surface,1,3,2)
		UpdateNormals SaveSlotEntity(i)
		EntityFX SaveSlotEntity(i),1
		If i=0
			ScaleEntity SaveSlotEntity(i),2,2,2
			TranslateEntity SaveSlotEntity(i),0,-0.6,12
		Else
			TranslateEntity SaveSlotEntity(i),1.5*(i-5),2.5,16
			ScaleEntity SaveSlotEntity(i),0.5,0.5,0.5
		EndIf
		
		
		EntityOrder SaveSlotEntity(i),-10
		HideEntity SaveSlotEntity(i)
	Next
	Return
	
	SaveSlotImage=CreateImage(256,256)
	For i=0 To 9
		SaveSlotEntity(i)=CreateMesh(camera)
		surface=CreateSurface (SaveSlotEntity(i))
		AddVertex (surface,-1,1,0,0.01,0.01)
		AddVertex (surface,1,1,0,.99,0.01)
		AddVertex (surface,-1,-0.5,0,0.01,0.74)
		AddVertex (surface,1,-0.5,0,.99,0.74)
		AddTriangle (surface,0,1,2)
		AddTriangle (surface,1,3,2)
		UpdateNormals SaveSlotEntity(i)
		EntityFX SaveSlotEntity(i),1
		If i=0
			ScaleEntity SaveSlotEntity(i),2,2,2
			TranslateEntity SaveSlotEntity(i),-2,-1.15,9.7
			xxx=LoadTexture("saveslot.bmp")
			EntityTexture SaveSlotEntity(i),xxx
		Else
			TranslateEntity SaveSlotEntity(i),1.5*(i-5),2.2,16
			ScaleEntity SaveSlotEntity(i),0.5,0.5,0.5
		EndIf
		
		
		EntityOrder SaveSlotEntity(i),-10
	Next
	
	
		



		



End Function

Function CreateIcon(x,y,tex,btype,SubText$,HelpText$)

	

	; types:	0 - stinker
	
	; check if button is already active
	If IconEntity(x+y*10)>0 Then Return

		
	IconX(x+y*10)=-.9+.2*x
	IconY(x+y*10)=.65-.187*y
	IconTexture(x+y*10)=tex
	
	IconEntity(x+y*10)=CreateMesh(camera)
	surface=CreateSurface(IconEntity(x+y*10))
	AddVertex surface,-.04,.04,0,(tex Mod 8)*0.125+0.001,Floor((tex Mod 64)/8)*0.125+0.001
	AddVertex surface,.04,.04,0,(tex Mod 8)*0.125+0.1249,Floor((tex Mod 64)/8)*0.125+0.001
	AddVertex surface,-.04,-.04,0,(tex Mod 8)*0.125+0.001,Floor((tex Mod 64)/8)*0.125+0.1249
	AddVertex surface,.04,-.04,0,(tex Mod 8)*0.125+0.1249,Floor((tex Mod 64)/8)*0.125+0.1249

	AddTriangle surface,0,1,2
	AddTriangle surface,1,3,2
	UpdateNormals IconEntity(x+y*10)
	
	If tex>=64
		EntityTexture IconEntity(x+y*10),IconTextureCustom
	Else
		EntityTexture IconEntity(x+y*10),IconTextureStandard
	EndIf
		
	EntityOrder IconEntity(x+y*10),-10
	EntityPickMode IconEntity(x+y*10),2
	EntityFX IconEntity(x+y*10),1
	
	ScaleEntity IconEntity(x+y*10),0,0,0
	PositionEntity IconEntity(x+y*10),IconX(x+y*10)/CameraZoomLevel,IconY(x+y*10)/CameraZoomLevel,1
	
	IconSize(x+y*10)=1
	;If btype=0 Then IconSize(x+y*10)=100
	
	IconType(x+y*10)=btype
	
	IconSubText$(x+y*10)=SubText$
	IconHelpText$(x+y*10)=HelpText$
		
		
End Function	

Function ControlIcons()

	Entity=CameraPick(camera,MouseX(),MouseY())
	
	
	IconPicked=-1
	For i=0 To 79
		; go through eachpossible icon position
		If IconEntity(i)>0 
		
	
		
			; if active/exists
			If IconSize(i)=1201 Then IconSize(i)=1001
			
			; check if mouse is currently pointing at it
			If Entity=IconEntity(i) And IconSize(i)=1001 And MouseGameMode=-1 And PlayerControlMode=0
				yep=False
				
				; which icons can be used in different gameplay modes
				If GameMode=0  Or (GameMode=12 And (oldGameMode<>8 Or IconType(i)=4))
					; in-game or in Menu
					yep=True
				Else If GameMode=5 Or GameMode=6
					; inventory / swapping
					If IconType(i)=2 Or IconType(i)=4 Or (IconType(i)>=1000 And ((IconType(i)-1001) Mod 10)=0) 
						yep=True	
					EndIf
					If Mouse2=True And Mouse1=False
						; can select active spell/charm when in inventory
						If (IconType(i)>=1000 And ((IconType(i)-1001) Mod 10)=1)
							yep=True
						EndIf
					EndIf
				Else If GameMode=8
					; Dialog
					If IconType(i)=4
						yep=True
					Else
						yep=False
					EndIf
				
					
				EndIf
			
				If yep=True
					IconSize(i)=1201
					IconPicked=i
					EntityAlpha MouseCursor,.8
					HideEntity LevelCursor
					
					If Mouse1=True
						ActivateIcon(i,1)
						MouseGameMode=-2
						For j=0 To 79
							; deactivate icons
							If IconEntity(j)>0 Then EntityPickMode IconEntity(j),0
						Next

					Else If Mouse2=True
						ActivateIcon(i,2)
						MouseGameMode=-2
						For j=0 To 79
							; deactivate icons
							If IconEntity(j)>0 Then EntityPickMode IconEntity(j),0
						Next

					EndIf
				EndIf

			EndIf
		
			; zooming in/out
			If IconSize(i)>0 And (IconSize(i) Mod 2)=0
				; deactivating
				IconSize(i)=IconSize(i)-50
				If IconSize(i)<0 
					; turn off
					IconSize(i)=0
				EndIf
			Else If IconSize(i)<1001 And (IconSize(i) Mod 2)=1
				; activating
				IconSize(i)=IconSize(i)+50
				If IconSize(i)>1001
					; turn on
					IconSize(i)=1001
				EndIf
			EndIf
			
			If IconEntity(i)>0
				ScaleEntity IconEntity(i),Float(IconSize(i))/1001.0,Float(IconSize(i))/1001.0,Float(IconSize(i))/1001.0
			EndIf
			
			; mouse is on it?
	;		If IconSize(i)=1201
	;			IconSize(i)=1001
	;		EndIf
			
			
			; delete
			If IconSize(i)=0
				DeleteIcon(i)
			EndIf
		EndIf
	Next
	
	; Special Case Icons
	If GameMode<10
		If LevelTimer<1000000000
			If NofWeeStinkersInAdventure>0 And AdventureGoal=1
				CreateIcon(7,0,8,3,Str$(NofWeeStinkersInAdventure),"Rescue")
				IconSubText$(7)=Str$(NofWeeStinkersInAdventure)	
			EndIf
			If NofGemsInAdventure>0 And AdventureGoal=3
				CreateIcon(7,0,9,3,Str$(NofGemsInAdventure),"Collect")
				IconSubText$(7)=Str$(NofGemsInAdventure)	
			EndIf
			If NofScrittersInAdventure>0 And AdventureGoal=2
				CreateIcon(7,0,10,3,Str$(NofScrittersInAdventure),"Capture")
				IconSubText$(7)=Str$(NofScrittersInAdventure)	
			EndIf
			If NofFireFlowersInAdventure>0 And AdventureGoal=5
				CreateIcon(7,0,11,3,Str$(NofFireFlowersInAdventure),"Destroy")
				IconSubText$(7)=Str$(NofFireFlowersInAdventure)	
			EndIf
			If NofBricksInAdventure>0 And AdventureGoal=4
				CreateIcon(7,0,12,3,Str$(NofBricksInAdventure),"Destroy")
				IconSubText$(7)=Str$(NofBricksInAdventure)	
			EndIf
			
			If NofCrabsInAdventure>0 And AdventureGoal=7
				CreateIcon(7,0,13,3,Str$(NofCrabsInAdventure),"Capture")
				IconSubText$(7)=Str$(NofCrabsInAdventure)	
			EndIf
			
			If NofBabyBoomersInAdventure>0 And AdventureGoal=8
				CreateIcon(7,0,14,3,Str$(NofBabyBoomersInAdventure),"Rescue")
				IconSubText$(7)=Str$(NofBabyBoomersInAdventure)	
			EndIf


		EndIf
		
		If currentcharm=1 And currentlightpower>0
			; lamp - drain
			If leveltimer Mod 800 =0
				currentlightpower=currentlightpower-1
				IconSubText$(1)="- "+currentlightpower+" -"
				If currentlightpower=0
					MessageLineText1$="Your lamp has run out."
					MessageLineText2$=""
	
					MessageLineTimer=100
					deleteicon(1)
					currentcharm=0
				EndIf
				For j=0 To 99
					If InventoryItem(j)=2001 Then InventoryHelpText$(j)="- "+currentlightpower+" -"
				Next
			EndIf
		EndIf
	
	
	
		
		If SpellActive=True 
	;		For j=0 To 359 Step 10
		
		;	If leveltimer Mod 10=0
		;		k=Rand(0,360)
		;		AddParticle2(16+CurrentSpell,-2.25+.1*Sin(k),1.65+.1*Cos(k),5,0,.05,.001*Sin(k),.001*Cos(k),0,0,.001,0,0,0,50,2)
		;	;	k=(k+180) Mod 360
		;	;	AddParticle2(16+CurrentSpell,-2.25+.14*Sin(k),1.65+.14*Cos(k),5,0,.05,0,0,0,0,0,0,0,0,50,2)
		;	EndIf
	
		
			If leveltimer Mod 3=0
				r#=.1+.04*Sin((leveltimer) Mod 360)
				k=(leveltimer*4) Mod 360
				AddParticle2(Rand(16,23),-2.25+r*Sin(k),1.65+r*Cos(k),5,0,.05,.0005*Sin(k),.0005*Cos(k),0,.04,.001,0,0,0,50,2)
				k=(k+180) Mod 360
				AddParticle2(Rand(16,23),-2.25+r*Sin(k),1.65+r*Cos(k),5,0,.05,.0005*Sin(k),.0005*Cos(k),0,.04,.001,0,0,0,50,2)
			EndIf
			
	;				Next
		EndIf
		
		; shard melody
		If ShardHitCounter=4
			ShardMelodyTimer=ShardMelodyTimer+1
			If ShardMelodyTimer Mod 60 = 0
				k=(ShardMelodyTimer/60)-1
				SoundPitch SoundFX(13),22000+22000*InventoryID(ShardMelody(k))/7
				PlaySoundFX(13,-1,-1)
				
				k2=19-InventorySize+(ShardMelody(k) Mod inventorysize) + 10*Floor(ShardMelody(k)/inventorysize)
				IconSize(k2)=401
				
				If k=6
					; end song
					ShardHitCounter=5
					ShardMelodyTimer=0
				EndIf
			EndIf
		EndIf
	EndIf

			
				
End Function

Function ActivateIcon(i,MouseButton)

	; if playing shard melody, cancel
	If shardhitcounter=4
		shardhitcounter=0
		shardlasthit=-1
	EndIf

	Select IconType(i)

	Case 1
		; Rucksack - closed
		; Open it
		If levelTimer<1000000000 Or leveltimer>1000000050

			OpenRucksack(i)
			PlaySoundFX(131,-1,-1)
		EndIf

	Case 2
		; Rucksack - open
		; Close it
		CloseRucksack(i)
		PlaySoundFX(132,-1,-1)
		
	Case 3
		; Stinker/gem/etc counter
		; no action
		
	Case 4
		; Menu
		If GameMode<>12
			PlaySoundFX(131,-1,-1)
			StartMenu(0)
			
		Else
			endmenu()
		EndIf
		
		

	
	; **** Important: 1001+ x*10 is always an inventory item
				
	Case 1001
		; Glove in Inventory
		If GameMode=6
			; Swap places
			If InventorySwapIcon<>i
				SwapItem(i)
			EndIf
			
		Else If MouseButton=1
			; Examine the glove
			If CurrentSpellPower<=0
				playsoundfx(175,-1,-1)
				messagelinetext1="It's a pair of Rainbow Gloves."
				messagelinetext2="They are currently not charged."
				messagelinetimer=100
			Else If currentspell < 0
				playsoundfx(176,-1,-1)
				messagelinetext1="These gloves are charged"
				messagelinetext2="with an unknown destructive magic!"
				messagelinetimer=100
			Else Select currentspell
			Case 3
				playsoundfx(176,-1,-1)
				messagelinetext1="These gloves are charged"
				messagelinetext2="with 'Grow' Magic!"
				messagelinetimer=100
			Case 5
				playsoundfx(176,-1,-1)
				messagelinetext1="These gloves are charged"
				messagelinetext2="with 'Flash' Magic!"
				messagelinetimer=100
			Case 4
				playsoundfx(176,-1,-1)
				messagelinetext1="These gloves are charged"
				messagelinetext2="with 'Brr' Magic!"
				messagelinetimer=100
			Case 6
				playsoundfx(176,-1,-1)
				messagelinetext1="These gloves are charged"
				messagelinetext2="with 'Blink' Magic!"
				messagelinetimer=100
			Case 2
				playsoundfx(176,-1,-1)
				messagelinetext1="These gloves are charged"
				messagelinetext2="with 'Pop' Magic!"
				messagelinetimer=100
			Case 1
				playsoundfx(176,-1,-1)
				messagelinetext1="These gloves are charged"
				messagelinetext2="with 'Pow' Magic!"
				messagelinetimer=100
			Case 0
				playsoundfx(176,-1,-1)
				messagelinetext1="These gloves are charged"
				messagelinetext2="with 'Crimson' Magic!"
				messagelinetimer=100
			Case 7
				playsoundfx(176,-1,-1)
				messagelinetext1="These gloves are charged"
				messagelinetext2="with 'Null' Magic!"
				messagelinetimer=100
			Default
				playsoundfx(176,-1,-1)
				messagelinetext1="These gloves are charged"
				messagelinetext2="with an unknown magic!"
				messagelinetimer=100
			End Select End If
		
				
		Else If MouseButton=2
			; go into swap mode
			
			GameMode=6	
			row=Floor(i/10)-1
			col=(i Mod 10)-(9-InventorySize)
			InventorySwapItem=row*InventorySize+col
			InventorySwapIcon=i
			
		EndIf
		
	Case 1002,1003,1004,1005,1006,1007,1008,1009,1010
		; Glove Icon In Upper Left Corner
		
		; Toggle Active
		ToggleSpell()
		

		
	
	
			
	Case 2001,2011 ; lamp/light
		If GameMode=6
			; Swap places
			If InventorySwapIcon<>i
				SwapItem(i)
				
			EndIf
			
		Else If MouseButton=1
			; Select
			If TooDark()=False
				PlaySoundFX(175,-1,-1)

				MessageLineText1$="This item will activate automatically"
				MessageLineText2$="if you enter a dark area."
				MessageLineTimer=180
			Else
				DeleteIcon(1)
				If IconTYpe(i)=2001
					CreateIcon(1,0,66,2002,"- "+CurrentLightPower+" -","Remove")
					CurrentCharm=1
				Else
					CreateIcon(1,0,67,2012,"Light","Remove")
					CurrentCharm=2
				EndIf
				
				CloseRuckSack(8)
			EndIf

		Else If MouseButton=2
			
			GameMode=6	
			row=Floor(i/10)-1
			col=(i Mod 10)-(9-InventorySize)
			InventorySwapItem=row*InventorySize+col
			InventorySwapIcon=i
			
		EndIf

	Case 2021 ; spy eye
		; "Charms" in Inventory 
		If GameMode=6
			; Swap places
			If InventorySwapIcon<>i
				SwapItem(i)
				
			EndIf
			
		Else If MouseButton=1
			; Select
			If ObjectMovementTimer(PlayerObject)>0
				MessageLineText1$="You must be standing still"
				MessageLineText2$="to use the Spy-Eye."
				MessageLineTimer=180
			Else
			
				
	
				PlaySoundFX(176,-1,-1)

				DeleteIcon(1)
				CreateIcon(1,0,68,2022,"Spy-Eye","Remove")
				CurrentCharm=3
				CloseRuckSack(8)
				TurnOffIcons()
				MoveMouse GfxWidth/2,9*GfxHeight/24
				
			EndIf
		Else If MouseButton=2
			
			GameMode=6	
			row=Floor(i/10)-1
			col=(i Mod 10)-(9-InventorySize)
			InventorySwapItem=row*InventorySize+col
			InventorySwapIcon=i
			
		EndIf
	Case 2031 ; token
		
		If GameMode=6
			; Swap places
			If InventorySwapIcon<>i
				SwapItem(i)
				
			EndIf
			
		Else If MouseButton=1
			; Select
			; look for an active arcade in neighbourhood
			For j=0 To NofObjects-1
				If objectType(j)=165
				
					If Abs(Floor(ObjectX(j))-Floor(ObjectX(PlayerObject)))<1.1 And Abs(Floor(ObjectY(j))-Floor(ObjectY(PlayerObject)))<1.1
						; got one
						If ObjectSubType(j)=1
							; not active
							j=NofObjects+10
						Else
							row=Floor(i/10)-1
							col=(i Mod 10)-(9-InventorySize)
							InvenItem=row*InventorySize+col
							PlaySoundFX(12,-1,-1)

							activatecommand(1,ObjectData(j,0),0,0,0)
							ObjectData(j,0)=ObjectData(j,0)+1
							
								If ((ObjectData(j,0)-200) Mod 3) = 0
									; played all three
									ObjectSubType(j)=1
								EndIf
							
							; and delete
							RemoveItemFromInventory(InvenItem)
							CloseRuckSack(8)

						
							j=NofObjects+20
						EndIf
					EndIf
				EndIf
			Next
			If j<NofObjects+10
			
				MessageLineText1$="To use a token you must find and stand"
				MessageLineText2$="next to an active arcade game machine."
				MessageLineTimer=180
				CloseRuckSack(8)

			Else If j<NofObjects+20
				MessageLineText1$="You have already played all three levels"
				MessageLineText2$="on this arcade game."
				MessageLineTimer=180
				CloseRuckSack(8)

			EndIf


	
		Else If MouseButton=2
			
			GameMode=6	
			row=Floor(i/10)-1
			col=(i Mod 10)-(9-InventorySize)
			InventorySwapItem=row*InventorySize+col
			InventorySwapIcon=i
			
		EndIf
			
	Case 2002,2012
		; Lamp/Light Gem active
		
		;remove
		DeleteIcon(1)
		CurrentCharm=0

	
	Case 2022
		; Spyglass active
		
		; never used - deactived in playercontrol
		
	
		
		
		
	
		
		
	Case 3001
		; Key Item in inventory - ID is the ID of the item it can open
		If GameMode=6
			; Swap places
			If InventorySwapIcon<>i
				SwapItem(i)
				
			EndIf
			
		Else If MouseButton=1
			; look in neighbourhood of player to see if a keyblock exists with matching ID
			row=Floor(i/10)-1
			col=(i Mod 10)-(9-InventorySize)
			InvenItem=row*InventorySize+col
			x=Floor(ObjectX(PlayerObject))
			y=Floor(ObjectY(PlayerObject))
			flag=False
			For j=0 To NofObjects-1
				If (ObjectType(j)=10) And ObjectExists(j)=True  And ObjectActive(j)=1001
					If Abs(ObjectTileX(j)-x)<=1 And Abs(ObjectTileY(j)-y)<=1
						flag=True
						If ObjectID(j)=InventoryID(InvenItem)
							PlaySoundFX(176,-1,-1)
	
							; Open Gate
							DeActivateObject(j)
							
							j=NofObjects+5
							RemoveItemFromInventory(InvenItem)
							;DeActivateIcon(i)
							
							CloseRuckSack(8)
						EndIf
					EndIf
				EndIf
			Next
			If j<NofObjects+5
				If flag=True
					; gate doesn't match
					MessageLineText1$="Your key doesn't fit"
					messagelinetext2$="this lock."

				Else
					; no item found
					
	
					MessageLineText1$="To use a key, stand directly next to"
					messagelinetext2$="a gate with matching colours."
				EndIf
				PlaySoundFX(175,-1,-1)
				MessageLineTimer=200
				CloseRuckSack(8)
			EndIf

		Else If MouseButton=2
			
			GameMode=6	
			row=Floor(i/10)-1
			col=(i Mod 10)-(9-InventorySize)
			InventorySwapItem=row*InventorySize+col
			InventorySwapIcon=i
			
		EndIf
	Case 3011
	
		If GameMode=6
			; Swap places
			If InventorySwapIcon<>i
				SwapItem(i)
				
			EndIf
			
		Else If MouseButton=1
			
			; Stinker Whistle in inventory
			AddParticle(4,ObjectX(PlayerObject),0.1,-ObjectY(PlayerObject),0,1,0,0,0,0,.05,0,0,0,60,4)
			Animate GetChild(objectentity(playerobject),3),3,.3,8
			
			; wake up stinkers
			For j=0 To NofObjects-1
				If ObjectType(j)=120 And (ObjectSubType(j)=0 Or ObjectSubType(j)=3) And ObjectExists(j)=True 
					
					If Abs(ObjectTileX(j)-ObjectTileX(PlayerObject))<=3 And Abs(ObjectTileY(j)-ObjectTileY(PlayerObject))<=3
						ObjectSubType(j)=1
						ObjectMovementType(j)=14
						EntityTexture ObjectEntity(j),StinkerWeeTexture
						

					EndIf
				EndIf
			Next
			CloseRuckSack(8)
		Else If MouseButton=2
			
			GameMode=6	
			row=Floor(i/10)-1
			col=(i Mod 10)-(9-InventorySize)
			InventorySwapItem=row*InventorySize+col
			InventorySwapIcon=i
			
		EndIf
		
	Case 3021
		; Rainbow Shard
		If GameMode=6
			; Swap places
			If InventorySwapIcon<>i
				SwapItem(i)
				
			EndIf
			
		Else If MouseButton=1

			row=Floor(i/10)-1
			col=(i Mod 10)-(9-InventorySize)
			InvenItem=row*InventorySize+col
	
			If ShardsAreActive=False
				MessageLineText1$="The shard makes a beautiful sound,"
				MessageLineText2$="but nothing happens."
				MessageLineTimer=200
			Else If AdventureCurrentLevel=-93 Or AdventureCurrentLevel=-94 Or AdventureCurrentLevel=-95
				; in void - can't use
				MessageLineText1$="The shard makes a dull sound."
				MessageLineText2$="Something is wrong."
				MessageLineTimer=200

			Else
			
				If AdventureCurrentStatus>0
					; in Adventure
					MessageLineText1$="You cannot use the shards"
					MessageLineText2$="in an adventure."
					MessageLineTimer=200
				

				
				
				Else If ShardHitCounter<4
					If InventoryID(InvenItem)=ShardLastHit
						ShardHitCounter=ShardHitCounter+1
					Else
						ShardHitCounter=1
					EndIf
					Select ShardHitCounter
						Case 2
							MessageLineText1$="The shard has begun to vibrate..."
							MessageLineText2$="gently at first, but growing stronger."
							MessageLineTimer=200
						Case 3
							MessageLineText1$="A beautiful song begins to play."
							MessageLineText2$=""
							MessageLineTimer=200
							ShardHitCounter=4
							StopChannel (musicchannel)
							currentmusic=0
							For j=0 To 6
								Repeat
									k=Rand(0,InventorySize^2-1)
								Until InventoryItem(k)=3021
								ShardMelody(j)=k
							Next
							ShardMelodyTimer=0
						Default
							ShardHitCounter=1
							MessageLineText1$="A gentle and beautiful glow"
							MessageLineText2$="has begun to eminate from the shard."
							MessageLineTimer=200
					End Select
					
					ShardLastHit=InventoryID(InvenItem)
				Else If ShardHitCounter=5
					; replaying music
					If InvenItem=ShardMelody(ShardMelodyTimer)
						ShardMelodyTimer=ShardMelodyTimer+1
						If ShardMelodyTimer=7
							; you did it - warp!
							
							
							Select ShardLastHit
							Case 0 ; red goes to Forest's End
								ActivateCommand(7,-70,11,15,0)
							Case 1 ; orange goes to Windy Hills
								ActivateCommand(7,-12,17,19,0)
							Case 2	 ; yellow goes to Plains
								ActivateCommand(7,-44,34,14,0)
							Case 3  ; green goes to Wasteland
								ActivateCommand(7,-90,16,15,0)
							Case 4		; blue goes to Foggy Mountains
								ActivateCommand(7,-64,14,12,0)
							Case 5		; indigo goes to Wondertown
								ActivateCommand(7,-21,10,16,0)
							Case 6		; purple goes to Lonely Top
								ActivateCommand(7,-86,11,12,0)
							End Select
							CloseRucksack(8)

						EndIf
					Else
						ShardHitCounter=0
						ShardLastHit=-1
						MessageLineText1$="I think you played"
						MessageLineText2$="a wrong note."
						MessageLineTimer=200
					EndIf
				
				EndIf
			EndIf
					
	
	
						
	
			
			SoundPitch SoundFX(13),22000+22000*InventoryID(InvenItem)/7
			
			PlaySoundFX(13,-1,-1)
		Else If MouseButton=2
			
			GameMode=6	
			row=Floor(i/10)-1
			col=(i Mod 10)-(9-InventorySize)
			InventorySwapItem=row*InventorySize+col
			InventorySwapIcon=i
			
		EndIf



	Case 3091
		; Special Item from Won Adventure
		If GameMode=6
			; Swap places
			If InventorySwapIcon<>i
				SwapItem(i)
				
			EndIf
			
		Else If MouseButton=1
			MessageLineText1$="You cannot use this item here."
			MessageLineText2$=""
			MessageLineTimer=100
		
			CloseRuckSack(8)
			


		Else If MouseButton=2
			
			GameMode=6	
			row=Floor(i/10)-1
			col=(i Mod 10)-(9-InventorySize)
			InventorySwapItem=row*InventorySize+col
			InventorySwapIcon=i
			
		EndIf
		
	Case 4001,4011,4021,4031,4041,4051,4061,4071,4081,4091,4101,4111,4121,4131,4141,4151,4161,4171,4181,4191,4201,4211,4221,4231,4241,4251,4261,4271,4281,4291
		; Custom Item
		If GameMode=6
			; Swap places
			If InventorySwapIcon<>i
				SwapItem(i)
				
			EndIf
			
		Else If MouseButton=1
		
			btype=Floor((IconType(i)-4001) / 10)
			btype2=btype Mod 10
			flag=False
			row=Floor(i/10)-1
			col=(i Mod 10)-(9-InventorySize)
			InvenItem=row*InventorySize+col
		
			
				
				If btype2=1 
					 AdventureWon()
				Else If btype2>=2 And btype2<=7
				
					; look (for some types only in neighbourhood of player) to see if a keyblock exists with matching ID
					
					x=Floor(ObjectX(PlayerObject))
					y=Floor(ObjectY(PlayerObject))
					For j=0 To NofObjects-1
						If ObjectExists(j)=True And ObjectID(j)=InventoryID(InvenItem)
						
							If (Abs(ObjectTileX(j)-x)<=1 And Abs(ObjectTileY(j)-y)<=1) Or btype2=5 Or btype2=6 Or btype2=7
								
								; got something - open/close/toggle
								
								If btype2=2 Or btype2=5 
									If (ObjectActive(j) Mod 2)=0
										ActivateObject(j)
										flag=True
									Else
										flag=False
									EndIf
								Else If btype2=3 Or btype2=6
									If (ObjectActive(j) Mod 2)=1
										DeActivateObject(j)
										flag=True
									Else
										flag=False
									EndIf
	
									
								Else If btype2=4 Or btype2=7
									ToggleObject(j)
									flag=True
								EndIf
								
							EndIf
							
						EndIf
					Next
				EndIf
				If flag=False
					; no item found
					MessageLineText1$="You cannot use this item here."
					MessageLineText2$=""
	
					MessageLineTimer=100
					
				Else
					If btype<10
						; destroy object in inventory
						RemoveItemFromInventory(InvenItem)
					EndIf
				EndIf
				
			
			CloseRuckSack(8)
			


		Else If MouseButton=2
			
			GameMode=6	
			row=Floor(i/10)-1
			col=(i Mod 10)-(9-InventorySize)
			InventorySwapItem=row*InventorySize+col
			InventorySwapIcon=i
			
		EndIf

			
	

					
	Case 9091
		; Empty Inventory Item
		If GameMode=6
			; Swap places
			If InventorySwapIcon<>i
				SwapItem(i)
			EndIf
		Else If MouseButton=2
		
			GameMode=6	
			row=Floor(i/10)-1
			col=(i Mod 10)-(9-InventorySize)
			InventorySwapItem=row*InventorySize+col
			InventorySwapIcon=i
		EndIf

		

	
;	Case 1
;		; stinkers - disengage
;		For i=0 To NofStinkers-1
;;			StinkerFollowing(i)=False
;			DeActivateIcon(1)
;		Next	
	End Select
End Function

Function DeActivateIcon(i)
	
	
	If IconSize(i)>=1001
		IconSize(i)=1000
	Else If IconSize(i) Mod 2 =1 And IconSize(i)>0
		IconSize(i)=IconSize(i)-1
	EndIf	
End Function	

Function DeleteIcon(i)

	If IconEntity(i)>0 FreeEntity IconEntity(i)
	IconEntity(i)=0
		
End Function

Function TurnOffIcons()

	For i=0 To 79
		If IconEntity(i)>0
			EntityPickMode IconEntity(i),0
		EndIf
	Next
End Function

Function TurnOnIcons()

	For i=0 To 79
		If IconEntity(i)>0
			EntityPickMode IconEntity(i),2
		EndIf
	Next
End Function



Function OpenRucksack(i)

	
	ShardHitCounter=0
	ShardLastHit=-1


	If GameMode=12 Then EndMenu()
	
	IconType(i)=2
	tex=1
	VertexTexCoords GetSurface(IconEntity(i),1),0,(tex Mod 8)*0.125+0.001,Floor((tex Mod 64)/8)*0.125+0.001
	VertexTexCoords GetSurface(IconEntity(i),1),1,(tex Mod 8)*0.125+0.1249,Floor((tex Mod 64)/8)*0.125+0.001
	VertexTexCoords GetSurface(IconEntity(i),1),2,(tex Mod 8)*0.125+0.001,Floor((tex Mod 64)/8)*0.125+0.1249
	VertexTexCoords GetSurface(IconEntity(i),1),3,(tex Mod 8)*0.125+0.1249,Floor((tex Mod 64)/8)*0.125+0.1249
	IconHelpText$(i)="Close"
	; Create Inventory Icons
	j=0
	For y=1 To InventorySize
		For x=9-InventorySize To 8
			If IconSize(x+y*10)>0 And IconSize(x+y*10) Mod 2 = 0
					IconSize(x+y*10)=1001
				Else
					CreateIcon(x,y,InventoryTexture(j),InventoryItem(j),InventorySubText$(j),InventoryHelpText$(j))
				EndIf
			j=j+1
		Next
	Next
	If IconSize(y*10+x)>0 And IconSize(y*10+x) Mod 2 = 0
		IconSize(7+(InventorySize+1)*10)=1001
	Else
		CreateIcon(7,InventorySize+1,6,-1,"","")
	EndIf
	If IconSize(y*10+x)>0 And IconSize(y*10+x) Mod 2 = 0
		IconSize(8+(InventorySize+1)*10)=1001
	Else
		CreateIcon(8,InventorySize+1,7,-1,"","")
	EndIf

	
	
	GameMode=5
End Function

Function CloseRucksack(i)

	
	ShardHitCounter=0
	ShardLastHit=-1


;	If NofInventoryItems>0	

		IconType(i)=1
		tex=0
		VertexTexCoords GetSurface(IconEntity(i),1),0,(tex Mod 8)*0.125+0.001,Floor((tex Mod 64)/8)*0.125+0.001
		VertexTexCoords GetSurface(IconEntity(i),1),1,(tex Mod 8)*0.125+0.1249,Floor((tex Mod 64)/8)*0.125+0.001
		VertexTexCoords GetSurface(IconEntity(i),1),2,(tex Mod 8)*0.125+0.001,Floor((tex Mod 64)/8)*0.125+0.1249
		VertexTexCoords GetSurface(IconEntity(i),1),3,(tex Mod 8)*0.125+0.1249,Floor((tex Mod 64)/8)*0.125+0.1249
		IconHelpText$(i)="Open"
;	EndIf
	; Close Inventory Icons
	For x=9-InventorySize To 8
		For y=1 To InventorySize
			DeActivateIcon(x+y*10)
		Next
	Next

	DeActivateIcon(7+(InventorySize+1)*10)
	DeActivateIcon(8+(InventorySize+1)*10)
	
	GameMode=0
End Function

Function AddItemToInventory(Spot,Item,ID,Tex,SubText$,HelpText$)

	If NofInventoryItems=0 And usedinventoryonce=False
		CreateIcon(8,0,0,1,"Items","Open")
		usedInventoryonce=True
	EndIf


	If Spot=-1
		; none specified - just picked first one
		For Spot=0 To 100
			If InventoryItem(Spot)=9091
				Exit
			EndIf
		Next
	EndIf
		
	InventoryItem(Spot)=Item
	InventoryID(Spot)=ID
	InventoryTexture(Spot)=Tex
	InventorySubText$(Spot)=SubText$
	InventoryHelpText$(Spot)=HelpText$	
	NofInventoryItems=NofInventoryItems+1
	
	; check if inventory is open
	IconSpotX=9-InventorySize+(Spot Mod InventorySize)
	IconSpotY=(Floor(Spot/InventorySize)+1)
	If IconEntity(IconSpotX+IconSpotY*10)>0
		DeleteIcon(IconSpotX+IconSpotY*10)
		CreateIcon(IconSpotX,IconSpotY,Tex,Item,SubText$,HelpText$)
	EndIf
	

		
End Function

Function RemoveItemFromInventory(i)

	
	InventoryItem(i)=9091
	InventoryID(i)=-1
	InventoryTexture(i)=3
	InventorySubText$(i)=""
	InventoryHelpText$(i)="Empty"
	
	NofInventoryItems=NofInventoryItems-1
	
	
	
End Function

Function SelectSpell(i,InvenIcon)

	Restore SpellData
	For j=1 To i
		Read a$
		Read b$
	Next

	DeleteIcon(0)
	CreateIcon(0,0,16+i-1,1002+(i-1)*10,a$,b$)
	
	
	If InvenIcon>=0
		row=Floor(InvenIcon/10)-1
		col=(InvenIcon Mod 10)-(9-InventorySize)
		RemoveItemFromInventory(row*InventorySize+col)
	EndIf

	If CurrentSpell<>i And CurrentSpell>0
		Restore .SpellData
		For j=1 To CurrentSpell
			Read a$
			Read b$
		Next
		If InvenItem=-1
			AddItemToInventory(-1,1001+(CurrentSpell-1)*10,-1,16+CurrentSpell-1,a$,"Put On")
		Else
			AddItemToInventory(row*InventorySize+col,1001+(CurrentSpell-1)*10,-1,16+CurrentSpell-1,a$,"Put On")
		EndIf
	EndIf
	
	CurrentSpell=i
End Function

Function ToggleSpell()

	; turn the glove from active to deactive and vice versa
	SpellActive=Not SpellActive
	If SpellActive=True
		ObjectMoveXGoal(PlayerObject)=ObjectTileX2(PlayerObject)
		ObjectMoveYGoal(PlayerObject)=ObjectTileY2(PlayerObject)
		PlayerTalkToGoalObject=-1
		IconSubText$(0)="- "+Str$(CurrentSpellPower)+" -"
		IconHelpText$(0)="Remove"
		;PlaySoundFX(90,-1,-1)
	Else
		IconSubText$(0)="- "+Str$(CurrentSpellPower)+" -"
		IconHelpText$(0)="Activate"
		;PlaySoundFX(91,-1,-1)
	EndIf
		
End Function


Function SelectCharm(i,InvenIcon)

	Restore Charmdata
	For j=1 To i
		Read a$
		Read b$
	Next

	DeleteIcon(1)
	CreateIcon(1,0,32+i-1,2002+(i-1)*10,a$,b$)
	
	If InvenIcon>=0	
		row=Floor(InvenIcon/10)-1
		col=(InvenIcon Mod 10)-(9-InventorySize)
		RemoveItemFromInventory(row*InventorySize+col)
	EndIf
	
	If CurrentCharm<>i And CurrentCharm>0
		Restore Charmdata
		For j=1 To CurrentCharm
			Read a$
			Read b$
		Next
		
		If invenitem=-1
			AddItemToInventory(-1,2001+(CurrentCharm-1)*10,-1,32+CurrentCharm-1,a$,"Wear")
		Else
			AddItemToInventory(row*InventorySize+col,2001+(CurrentCharm-1)*10,-1,32+CurrentCharm-1,a$,"Wear")
		EndIf
		
	EndIf		
	CurrentCharm=i

End Function

Function TooDark()
	
	If LightRedgoal+LightBluegoal+LightGreengoal+AmbientRedgoal+AmbientBluegoal+AmbientGreengoal<500
		
		Return True
	EndIf
	Return False
End Function


Function TurnOnLightSpell()


End Function


Function SwapItem(i)
	; i is the current icon number
	; other icon/item is stored in SwapItem/SwapIcon
	GameMode=5
				
	row=Floor(i/10)-1
	col=(i Mod 10)-(9-InventorySize)
	ThisItem=row*InventorySize+col

	SwapItem=InventoryItem(ThisItem)
	SwapID=InventoryID(ThisItem)
	SwapTexture=InventoryTexture(ThisItem)
	SwapSubText$=InventorySubText$(ThisItem)
	SwapHelpText$=InventoryHelpText$(ThisItem)
	
	j=InventorySwapItem
	AddItemToInventory(ThisItem,InventoryItem(j),InventoryID(j),InventoryTexture(j),InventorySubText$(j),InventoryHelpText$(j))
	;IconSize(i)=1001
	
	AddItemToInventory(InventorySwapItem,SwapItem,SwapID,SwapTexture,SwapSubText$,SwapHelpText$)
	NofInventoryItems=NofInventoryItems-2
	;IconSize(InventorySwapIcon)=1001
End Function

Function StartDialog(i,i2,Full)

	; starts conversation #i (i.e. entire file) with starting interchange #i2
	;						(UNLESS i2=-1, in which case the characters set starting conversation is used)

	GameMode=8
	PlayerControlMode=0

	DialogObject1=-1 ; toward what object player should turn (as default:none)
	DialogObject2=-1 ; what object should turn toward player (as default:none)

	
	; stop the player
	ObjectMoveXGoal(PlayerObject)=ObjectTileX2(PlayerObject)
	ObjectMoveYGoal(PlayerObject)=ObjectTileY2(PlayerObject)


	
	CurrentDialog=i
	CurrentInterChange=i2
	If Full=0
		DialogLineLength=38
	Else 
		DialogLineLength=30
	EndIf
	
	; load data from dialog i
	LoadDialog(i)
	
	
	If i2<0 Then CurrentInterChange=StartingInterChange
	StartInterChange()
	
	MoveMouse GfxWidth/2.0,GfxHeight*14/24.0

	
	ShowEntity DialogBackgroundEntity
	
	

End Function

Function EndDialog()
	
	; save data 
	SaveDialog(CurrentDialog)
	CameraAddZoom=0
	CameraAddX=0
	CameraAddY=0
	CameraAddZ=0
	
	GameMode=0
		
	DialogObject1=-1
	DialogObject2=-1

End Function

Function LoadDialog(dia)
	

	; first clear all data
	StartingInterChange=0
	NofInterchanges=1
	For i=0 To MaxInterChanges-1
		NofInterChangeTextLines(i)=0	
		For j=0 To 6
			InterChangeTextLine$(i,j)=""
		Next
		NofTextCommands(i)=0
		For j=0 To 199
			DialogTextCommand$(i,j)=""
			DialogTextCommandPos(i,j)=-1
		Next
		NofInterChangeReplies(i)=1
		For j=0 To 7
			InterChangeReplyText$(i,j)=""
			InterChangeReplyFunction(i,j)=0
			InterChangeReplyData(i,j)=0
			InterChangeReplyCommand(i,j)=0
			For k=0 To 3
				InterChangeReplyCommandData(i,j,k)=0
			Next
		Next
		
	Next
	NofAskAbouts=0
	AskAboutTopText$=""
	For i=0 To MaxAskAbouts-1
		AskAboutText$(i)=""
		AskAboutActive(i)=0
		AskAboutInterchange(i)=0
		AskAboutRepeat(i)=0
	Next
	
	; Now load
	If AdventureCurrentLevel<0
		; In Hub
		
		file=ReadFile(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\"+Str$(dia)+".dia")
	Else
		; in Adventure
		file=ReadFile(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Adventure\"+Str$(dia)+".dia")
	EndIf

	NofInterchanges=ReadInt(file)
	
	For i=0 To NofInterchanges-1
		NofInterChangeTextLines(i)=ReadInt(file)	
		For j=0 To NofInterChangeTextLines(i)-1
			InterChangeTextLine$(i,j)=ReadString$(file)
			
		Next
		NofTextCommands(i)=ReadInt(file)
		For j=0 To NofTextCommands(i)-1
			DialogTextCommand$(i,j)=ReadString$(file)
			DialogTextCommandPos(i,j)=ReadInt(file)
		Next
		NofInterChangeReplies(i)=ReadInt(file)
		For j=0 To NofInterChangeReplies(i)-1
			InterChangeReplyText$(i,j)=ReadString$(file)
			InterChangeReplyFunction(i,j)=ReadInt(file)
			InterChangeReplyData(i,j)=ReadInt(file)
			InterChangeReplyCommand(i,j)=ReadInt(file)
			For k=0 To 3
				InterChangeReplyCommandData(i,j,k)=ReadInt(file)
			Next
		Next
	Next
	NofAskAbouts=ReadInt(file)
	AskAboutTopText$=ReadString$(file)
	For i=0 To NofAskAbouts-1
		AskAboutText$(i)=ReadString$(File)
		AskAboutActive(i)=ReadInt(file)
		AskAboutInterchange(i)=ReadInt(file)
		AskAboutRepeat(i)=ReadInt(file)
	Next
	StartingInterChange=ReadInt(file)
	CloseFile file
	

	
	

	

End Function

Function SaveDialog(dia)

	If AdventureCurrentLevel<0

		; In Hub
		file=WriteFile(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Hub\"+Str$(dia)+".dia")
	Else
		file=WriteFile(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Adventure\"+Str$(dia)+".dia")
	EndIf

	WriteInt File,NofInterchanges
	For i=0 To NofInterchanges-1
				
		WriteInt File,NofInterChangeTextLines(i)
		For j=0 To NofInterChangeTextLines(i)-1

		
		
			WriteString file,InterChangeTextLine$(i,j)
		Next
		WriteInt file,NofTextCommands(i)
		For j=0 To NofTextCommands(i)-1
			WriteString file,DialogTextCommand$(i,j)
			WriteInt File,DialogTextCommandPos(i,j)
		Next
		
		

		WriteInt File,NofInterChangeReplies(i)
		For j=0 To NofInterChangeReplies(i)-1
			WriteString file,InterChangeReplyText$(i,j)
			WriteInt File,InterChangeReplyFunction(i,j)
			WriteInt File,InterChangeReplyData(i,j)
			WriteInt File,InterChangeReplyCommand(i,j)
			For k=0 To 3
				WriteInt File,InterChangeReplyCommandData(i,j,k)
			Next
		Next
	Next

	WriteInt File,NofAskAbouts
	WriteString file,AskAboutTopText$
	For i=0 To NofAskAbouts-1
		WriteString file,AskAboutText$(i)
		WriteInt File,AskAboutActive(i)
		WriteInt File,AskAboutInterchange(i)
		WriteInt File,AskAboutRepeat(i)
	Next
	WriteInt file,StartingInterChange
	CloseFile file
	
	
	
End Function


Function StartInterChange()

	
	
	Width=38
	
	
	; re-size the box
	surface=GetSurface(DialogBackGroundEntity,1)
	VertexCoords surface,0,-2,1.3,5
	VertexCoords surface,1,2,1.3,5
	VertexCoords surface,2,-2,-0.5-(NofInterChangeReplies(CurrentInterChange)-1)*0.16,5
	VertexCoords surface,3,2,-0.5-(NofInterChangeReplies(CurrentInterChange)-1)*0.16,5
	
	
	DialogTimer=0
	
	MouseGameMode=-2
	
	

End Function

Function DisplayDialog()

	DialogcurrentRed=255
	DialogcurrentGreen=255
	DialogcurrentBlue=255
	DialogcurrentEffect=0
	
	If CurrentInterChange=-1 ; in Ask-About List
		DisplayAskAbout()
		Return
	EndIf
	
	Width=38
	
	
	; display the text
	If NofInterChangeTextLines(CurrentInterChange)<7 Then Yoffset=(7-NofInterChangeTextLines(CurrentInterChange))
	totalletters=0

	For i=0 To NofInterChangeTextLines(CurrentInterChange)-1
		; how much of this line is to be displayed?
		If totalletters+Len(InterChangeTextLine$(CurrentInterChange,i))<=DialogTimer
			; display entire line
			length=Len(InterChangeTextLine$(CurrentInterChange,i))
		Else If totalletters>DialogTimer
			; don't display line
			length=0
		Else
			; display part of line
			length=dialogtimer-totalletters
		EndIf
		DialogLineLength=Len(InterChangeTextLine$(CurrentInterChange,i))
		; now add the letters of this line
		For j=1 To length
			
			For k=0 To NofTextCommands(CurrentInterChange)
				If j+i*38-1=DialogTextCommandPos(CurrentInterChange,k); Or (j=length And j+i*38=DialogTextCommandPos(CurrentInterChange,k))
						; yes, special command
					Select DialogTextCommand$(CurrentInterChange,k)
					Case "CWHI"
						DialogCurrentRed=255
						DialogCurrentGreen=255
						DialogCurrentBlue=255
					Case "CGRY"
						DialogCurrentRed=195
						DialogCurrentGreen=195
						DialogCurrentBlue=195
					Case "CRED"
						DialogCurrentRed=255
						DialogCurrentGreen=100
						DialogCurrentBlue=100
					Case "CORA"
						DialogCurrentRed=255
						DialogCurrentGreen=155
						DialogCurrentBlue=000
					Case "CYEL"
						DialogCurrentRed=255
						DialogCurrentGreen=255
						DialogCurrentBlue=000
					Case "CGRE"
						DialogCurrentRed=0
						DialogCurrentGreen=255
						DialogCurrentBlue=0
					Case "CCYA"
						DialogCurrentRed=0
						DialogCurrentGreen=255
						DialogCurrentBlue=255
					Case "CBLU"
						DialogCurrentRed=130
						DialogCurrentGreen=130
						DialogCurrentBlue=255
					Case "CPUR"
						DialogCurrentRed=255
						DialogCurrentGreen=100
						DialogCurrentBlue=255
					Case "CRAI"
						DialogCurrentRed=Rand(0,255)
						DialogCurrentGreen=Rand(0,255)
						DialogCurrentBlue=Rand(0,255)
					Case "CBLI"
						DialogCurrentRed=150+105*Sin(DialogTimer*8)
						DialogCurrentGreen=150+105*Sin(DialogTimer*8)
						DialogCurrentBlue=150+105*Sin(DialogTimer*8)
					Case "CWAR"
						DialogCurrentRed=150+105*Sin(DialogTimer*8)
						DialogCurrentGreen=60
						DialogCurrentBlue=60
	
	
	
					Case "ENON"
						DialogCurrentEffect=0
					Case "ESHI"
						DialogCurrentEffect=1
					Case "EJIT"
						DialogCurrentEffect=2
					Case "EWAV"
						DialogCurrentEffect=3
					Case "EBOU"
						DialogCurrentEffect=4
					Case "EZOO"
						DialogCurrentEffect=5
					Case "EZSH"
						DialogCurrentEffect=6
					Case "ECIR"
						DialogCurrentEffect=7
					Case "EEIG"
						DialogCurrentEffect=8
					Case "EUPD"
						DialogCurrentEffect=9
					Case "ELER"
						DialogCurrentEffect=10
					Case "EROT"
						DialogCurrentEffect=11
	
					
					End Select		
				EndIf
			Next		
			
			size#=1.0
			spacing#=1.0
			angle#=0.0
			xoff#=0.0
			yoff#=0.0
			Select DialogCurrentEffect
			Case 1
				xoff#=Rnd(-.1,.1)
			Case 2
				xoff#=Rnd(-.15,.15)
				yoff#=Rnd(-.1,.1)
			Case 3
				yoff#=0.2*Sin((totalletters+dialogtimer)*10)
			Case 4
				size=1.0+0.3*Sin((totalletters+dialogtimer)*10)
				spacing=1.0/size
			Case 5
				If dialogtimer<totalletters*2
					size=0.00001
				Else If dialogtimer<totalletters*2+5
					size=4.0-Sin((dialogtimer-totalletters*2)*18)*3
					spacing=1.0/size
				EndIf
			Case 6
				If dialogtimer<totalletters*2
					size=0.00001
				Else If dialogtimer<totalletters*2+5
					size=4.0-Sin((dialogtimer-totalletters*2)*18)*3
					spacing=1.0/size
				EndIf
				xoff#=Rnd(-.15,.15)
				yoff#=Rnd(-.1,.1)
			Case 7
				xoff#=Cos(dialogtimer*4)
				yoff#=Sin(dialogtimer*4)
			Case 8
				xoff#=Cos(dialogtimer*2)
				yoff#=Sin(dialogtimer*4)
			Case 9
				yoff#=Sin(dialogtimer*8)
			Case 10
				xoff#=Cos(dialogtimer*8)
			






			End Select
			
			x#=5+(40-Width)/2.0+(Width-DialogLineLength)/2+(j-1)+xoff
			y#=4+YOffset/2.0+i+yoff
			let=Asc(Mid$(InterChangeTextLine$(CurrentInterChange,i),j,1))-32
			
			AddLetter(let,(-.97+x*.0396*size*spacing)/CameraZoomLevel,(.7-y*.0623*size*spacing)/CameraZoomLevel,1.0,0,.044*size/CameraZoomLevel,0,0,0,0,0,0,0,0,0,dialogcurrentred,dialogcurrentgreen,dialogcurrentblue)
		
			totalletters=totalletters+1
		Next
			
	Next
	
	
	
	; now display responses
	If InterChangeReplyText$(CurrentInterChange,0)<>"(OK)"
		DisplayText("Choose Your Response:",49.5-21/2.0,12.5*2,0.5,1,255,255*0.9,0)
	EndIf
	MouseFlag=False
	For i=0 To NofInterChangeReplies(CurrentInterChange)-1
		size2#=1.0
		If DialogTimer<25
			size2#=Float(DialogTimer)/25.0
		EndIf
		If i=CurrentInterChangeReply
			MouseFlag=True
			size#=(0.25*Sin(LevelTimer*4 Mod 360)+1)*size2
			col#=1.0
		Else
			
			size#=1.0*size2
			col#=0.75
		EndIf
		If InterChangeReplyText$(CurrentInterChange,i)<>"(OK)"
			length=Len(InterChangeReplyText$(CurrentInterChange,i))+2
			DisplayText(Chr$(34)+InterChangeReplyText$(CurrentInterChange,i)+Chr$(34),25-length/2.0,13.5+i,size,1.0/size,255,255*col,0)
		Else
			length=Len(InterChangeReplyText$(CurrentInterChange,i))
			DisplayText(InterChangeReplyText$(CurrentInterChange,i),25-length/2.0,13.5+i,size,1.0/size,255,255*col,0)
		EndIf
	Next
	If MouseFlag=True
		EntityAlpha MouseCursor,.4
	Else
		EntityAlpha MouseCursor,.8
	EndIf
		

	
End Function

Function StartAskAbout()

	


	DialogTextLine$(0)=AskAboutTopText$
	j=1
	
	For i=0 To NofAskAbouts-1
		; check if this askabout topic is active
		If AskAboutRepeat(i)<>0
			If AskAboutActive(i)>=0 ; extra test if tied to masterlist
				If MasterAskAboutActive(AskAboutActive(i))=1
					DialogTextLine$(j)=AskAboutText$(i)
					j=j+1
				EndIf
			Else If AskaboutActive(i)=-2
				DialogTextLine$(j)=AskAboutText$(i)
				j=j+1
			EndIf
		EndIf
	Next
		
	CurrentInterChangeNofLines=j
	
	; responses
	
	; re-size the box
	surface=GetSurface(DialogBackGroundEntity,1)
	VertexCoords surface,2,-2,-0.5,5
	VertexCoords surface,3,2,-0.5,5
	
	
	DialogTimer=0
	
	

End Function

Function DisplayAskAbout()
	
	
	
	
	; display the text
	If CurrentInterChangeNofLines<10 Then j=(10-CurrentInterChangeNofLines)
	DisplayText(DialogTextLine$(0),(50-Len(DialogTextLine$(0)))/2,4+j/2.0,1,1,255,255*0.9,0)
	MouseFlag=False
	For i=1 To CurrentInterChangeNofLines-1
		size2#=1.0
		If DialogTimer<25
			size2#=Float(DialogTimer)/25.0
		EndIf
		If i=CurrentInterChangeReply
			size#=(0.25*Sin(LevelTimer*4 Mod 360)+1)*size2
			col#=1.0
			MouseFlag=True
		Else
			size#=1.0*size2
			col#=0.75
		EndIf

			
		DisplayText(DialogTextLine$(i),(50-Len(DialogTextLine$(i)))/2,4.5+j/2.0+i,size,1.0/size,255,255*col,0)
	Next
	If MouseFlag=True
		EntityAlpha MouseCursor,.4
	Else
		EntityAlpha MouseCursor,.8
	EndIf
		
		

	
End Function


Function ControlDialog()

	If menukeydown=True
		If KeyDown(208)=False And KeyDown(200)=False And KeyDown(156)=False And KeyDown(28)=False
			menukeydown=False
		EndIf
	EndIf
	
	
	DialogTimer=DialogTimer+1
	
	; do zoom in/out of background box 
	PositionEntity DialogBackGroundEntity,0,0,20-20*Sin(DialogBackGroundSize)
	EntityAlpha DialogBackGroundEntity,Float(DialogBackGroundSize)/180.0
	If GameMode=8
		If DialogBackGroundSize<90 
			DialogBackGroundSize=DialogBackGroundSize+2	
			Return
		EndIf
	Else
		If DialogBackGroundSize>0 
			DialogBackGroundSize=DialogBackGroundSize-2
		Else
			HideEntity DialogBackGroundEntity
		EndIf
	EndIf
	
	
	
	
	; but if not in dialog mode, do nothing else
	If GameMode<>8 Return
	
	;EntityAlpha MouseCursor,.8
	HideEntity LevelCursor


	
	; check mouse position
	CurrentInterChangeReply=-1
	mx#=MouseX()*50.0/Float(GfxWidth)
	my#=MouseY()*24.0/Float(GfxHeight)
	
	
	
	
	If CurrentInterChange=-1
		; in ask about
		j=0
		If CurrentInterChangeNofLines<10 Then j=(10-CurrentInterChangeNofLines)
		For i=1 To CurrentInterChangeNofLines-1
			If mx>15 And mx<45 And my>5+i+j/2.0 And my<6+i+j/2.0
				CurrentInterChangeReply=i
			EndIf
		Next
		
		If KeyDown(200) And MenuKeydown=False
			MenuKeydown=True
			
			
			If CurrentInterChangeReply=-1 
				CurrentInterChangeReply=1
			Else
				CurrentInterChangeReply=CurrentInterChangeReply-1
				If CurrentInterChangeReply=0 
					CurrentInterChangeReply=CurrentInterChangeNofLines-1
				EndIf
			EndIf
			MoveMouse GfxWidth/2.0,(5.5+CurrentInterChangeReply+j/2.0)*Float(GfxHeight)/24.0
			
		
		EndIf
		If KeyDown(208) And menukeydown=False
			menukeydown=True
			If CurrentInterChangeReply=-1 
				CurrentInterChangeReply=1
			Else
				CurrentInterChangeReply=CurrentInterChangeReply+1
				If CurrentInterChangeReply=CurrentInterChangeNofLines
 					CurrentInterChangeReply=1
				EndIf
			EndIf
			MoveMouse GfxWidth/2.0,(5.5+CurrentInterChangeReply+j/2.0)*Float(GfxHeight)/24.0
			
		
		EndIf

		keyboardenterflag=False
		If (KeyDown(28) Or KeyDown(156)) And menukeydown=False 
			keyboardenterflag=True
			If currentinterchangereply=-1
				currentinterchangereply=1
			EndIf
		EndIf
		
		If (Mouse1 Or keyboardenterflag) And MouseGameMode<>-2 And CurrentInterChangeReply>=0
			menukeydown=True
			; start the interchange associated with this askabout
			; skip the 'hidden' ones to figure which one this is
			k=0
			For j=0 To 20
				If AskAboutRepeat(j)<>0
					If AskAboutActive(j)>=0 ; extra test if tied to masterlist
						If MasterAskAboutActive(AskAboutActive(j))=1
							k=k+1
						EndIf
					Else If AskAboutActive(j)=-2
						k=k+1
					EndIf
				EndIf
				If k=CurrentInterChangeReply Then Exit
			Next
			; check if this topic has limited use
			If AskAboutRepeat(j)>0 Then AskAboutRepeat(j)=AskAboutRepeat(j)-1
			; and start the associated interchange
			PlaysoundfxNow(136)

			CurrentInterChange=AskAboutInterChange(j)
			StartInterChange()
		EndIf

		
	Else
		; in regular reply mode
		For i=0 To NofInterChangeReplies(CurrentInterChange)-1
			If mx>5 And mx<45 And my>13.5+i And my<14.5+i ; And mx<2+DialogReplyXpos(i)+Len(InterChangeReplyText$(CurrentInterChange,i)) And my>13 And my<15
				CurrentInterChangeReply=i
			EndIf
		Next
		
		If KeyDown(200) And MenuKeydown=False
			MenuKeydown=True
			
			
			If CurrentInterChangeReply=-1 
				CurrentInterChangeReply=0
			Else
				CurrentInterChangeReply=CurrentInterChangeReply-1
				If CurrentInterChangeReply=-1 
					CurrentInterChangeReply=NofInterChangeReplies(CurrentInterChange)-1
				EndIf
			EndIf
			MoveMouse GfxWidth/2.0,(14.0+CurrentInterChangeReply)*Float(GfxHeight)/24.0
			
		
		EndIf
		If KeyDown(208) And menukeydown=False
			menukeydown=True
			If CurrentInterChangeReply=-1 
				CurrentInterChangeReply=0
			Else
				CurrentInterChangeReply=CurrentInterChangeReply+1
				If CurrentInterChangeReply=NofInterChangeReplies(CurrentInterChange)
 					CurrentInterChangeReply=0
				EndIf
			EndIf
			MoveMouse GfxWidth/2.0,(14.0+CurrentInterChangeReply)*Float(GfxHeight)/24.0
			
		
		EndIf
		
		keyboardenterflag=False
		If (KeyDown(28) Or KeyDown(156)) And menukeydown=False 
			keyboardenterflag=True
			If currentinterchangereply=-1
				currentinterchangereply=0
			EndIf
		EndIf

	
		; do control of replies
		If (Mouse1  Or keyboardenterflag=True) And MouseGameMode<>-2 And CurrentInterChangeReply>=0
			Menukeydown=True
			; first do the general adventure command associated with it
			ActivateCommand(InterChangeReplyCommand(CurrentInterChange,CurrentInterChangeReply),InterChangeReplyCommandData(CurrentInterChange,CurrentInterChangeReply,0),InterChangeReplyCommandData(CurrentInterChange,CurrentInterChangeReply,1),InterChangeReplyCommandData(CurrentInterChange,CurrentInterChangeReply,2),InterChangeReplyCommandData(CurrentInterChange,CurrentInterChangeReply,3))
		
			; then the interchange reply function
			PlaysoundfxNow(136)
			Data1=InterChangeReplyData(CurrentInterChange,CurrentInterChangeReply)
			Select InterChangeReplyFunction(CurrentInterChange,CurrentInterChangeReply)
			Case 1
				; Stop dialog and set 
				If Data1>=0 Then StartingInterChange=Data1
				EndDialog()
			Case 2
				; Go to interchange Data1
				CurrentInterChange=Data1
				StartInterChange()
			Case 3
				; Open Ask About
				CurrentInterChange=-1
				StartAskAbout()	
			Case 4
				; do a gold check
				If PlayerCoins>=Data1
					PlayerCoins=PlayerCoins-Data1
					CurrentInterChange=CurrentInterCHange+2
					StartInterChange()
				Else
					CurrentInterChange=CurrentInterCHange+1
					StartInterChange()
				EndIf
				
			Case 5
				; do an item check
				flag=False
				For j=0 To 99
					If InventoryID(j)=Data1
						flag=True
						i=j
					EndIf
				Next
				If flag=True
					RemoveItemFromInventory(i)
					CurrentInterChange=CurrentInterCHange+2
					StartInterChange()
				Else
					CurrentInterChange=CurrentInterCHange+1
					StartInterChange()
				EndIf

					
				
				
			End Select
				
			MouseGameMode=-2
		EndIf
	EndIf
		


	
End Function

Function StartMenu(menu)


	
	
	; general clean up for all menus
	CurrentMenu=menu
	CurrentMenuNofItems=0
	For i=0 To 9
		MenuActive(menu,i)=2
		If MenuText(menu,i)<>""
			CurrentMenuNofItems=i+1
		EndIf
	Next
	
	For i=0 To 9
		HideEntity SaveSlotEntity(i)
	Next
		
	menutime=MilliSecs()
	RotateEntity levellight,35,-35,0
	
	If Menu=0	
		; In-Game Main Menu
		
		ExitAfterThisSave=False
		
		; save slot image - prepare each time in-game menu is started
		If SaveSlotImage>0 FreeImage SaveSlotImage
		SaveSlotImage=CreateImage(256,256)
		
		If SaveSlotImage2>0 FreeImage SaveSlotImage2
		
		SaveSlotImage2=CreateImage(2048,2048)
		GrabImage SaveSlotImage2,0,0
					
		If GameMode=8 ; disable load/save if in dialog
			MenuActive(menu,1)=1
			MenuActive(menu,2)=1
		EndIf
		If AdventureCurrentStatus=0 ; disable adventure options if in hub
			MenuActive(menu,3)=1
			MenuActive(menu,4)=1
		EndIf
		If LevelTimer>=1000002000 And LevelTimer<=1000002500
			; game lost - don't allow save
			MenuActive(menu,2)=1
		EndIf
		
	Else If Menu=1 Or Menu=2 Or menu=3
		; abort - yes/no
		MenuActive(menu,0)=3
		MenuActive(menu,1)=3
		MenuActive(menu,2)=3
	
	Else If menu=4 Or menu=5 Or menu=16
		MenuActive(menu,0)=3
		MenuActive(menu,1)=3
		; load/save	- prepare info on save slots
		For i=1 To 9
			
			If SaveSlotTexture(i)>0
				FreeTexture SaveSlotTexture(i)
				SaveSlotTexture(i)=0
			EndIf
			If FileType (GlobalDirName$+"\Player Profiles\"+playername$+"\SaveFiles\"+Str$(i)+"\wla")=0
				SaveSlotLevelName$(i)=""
				SaveSlotDateTime$(i)=""
				SaveSlotTexture(i)=myLoadTexture("data\graphics\emptyslot.jpg",1)
				EntityTexture SaveSlotEntity(i),SaveSlotTexture(i)
				ShowEntity SaveSlotEntity(i)
				
			Else
				
				file=ReadFile (GlobalDirName$+"\Player Profiles\"+playername$+"\SaveFiles\"+Str$(i)+"\wla")	
				SaveSlotDateTime$(i)=ReadString$(file)
				SaveSlotLevelName$(i)=ReadString$(file)
				screenshotnumber=ReadInt(file)
				CloseFile file
				
				SaveSlotTexture(i)=LoadTexture(GlobalDirName$+"\Player Profiles\"+playername$+"\SaveFiles\"+Str$(i)+"\"+screenshotnumber+".bmp")
				If SaveSlotTexture(i)>0
					EntityTexture SaveSlotEntity(i),SaveSlotTexture(i)
					ShowEntity SaveSlotEntity(i)
				EndIf
				
			EndIf
		Next
		
	Else If menu=6
		MenuActive(menu,0)=3
		MenuActive(menu,1)=3
		MenuActive(menu,2)=3
		MenuActive(menu,3)=3
		MenuText$(menu,1)=GameNameToBeSaved$
		
	Else If menu=8
		; Floingint - replay old adventures
		currentmenuNofItems=8
		CurrentReplayAdventure=1
		CurrentReplayAdventureName$="Stinker Rescue"

	Else If menu=11
		CameraClsColor camera,0,0,0
		
		ShowEntity titlemenuentity(60)

		; main menu
		
		menuactive(menu,0)=3
		
		
		file=WriteFile(globaldirname$+"\global.wdf")
		WriteString file,PlayerName$
		WriteString file,PlayerCharacterName$
		WriteInt file,GlobalSoundVolume2
		WriteInt file,GlobalMusicVolume2
		WriteInt file,KeyBoardMode
		CloseFile file
		

		
		; are there saved games?
		
		menuactive(menu,3)=1
		
		For i=1 To 9
		
			If FileType (GlobalDirName$+"\Player Profiles\"+playername$+"\SaveFiles\"+Str$(i)+"\wla")=1
				
				menuactive(menu,3)=2
			EndIf
		Next
			
	Else If menu=12
	
		If FileType(GlobalDirName$+"\Player Profiles")<>2 Then
			CreateDir GlobalDirName$+"\Player Profiles"
		EndIf
		
		
		If playername$<>"" 
			OldPlayerName$=PlayerName$
			OldPlayerCharacterName$=PlayerCharacterName$
			PlayerName$=""
			PlayerCharacterName$=""
		EndIf

	
		; select player profile
		MenuActive(menu,0)=3
	
		For i=1 To 8
			menutext$(menu,i)=""
		Next
		; check what profiles exist
		dirfile=ReadDir(GlobalDirName$+"\Player Profiles")
	
		i=1
		ex$=NextFile$(dirfile)
		Repeat
			If FileType(GlobalDirName$+"\Player Profiles\"+ex$)=2 And ex$<>"." And ex$<>".."
				menutext$(menu,i)=ex$;Upper$(Left$(ex$,1))+Lower$(Right$(ex$,Len(ex$)-1))
				i=i+1
			EndIf
			ex$=NextFile$(dirfile)
		Until ex$="" Or i=9
		CloseDir dirfile
		
		If i=9
			menutext$(menu,9)=""
			menuactive(menu,9)=3
		Else
			menutext$(menu,9)="Create New Profile"
			menuactive(menu,9)=2
		EndIf
		
		If i=1 ; no players yet
			startmenu(13)
;			menutext$(menu,i)="Default"
		EndIf
		
		
			
		
		
	Else If menu=13
		; enter new profile name
		
		menuactive(menu,0)=3
		menuactive(menu,2)=3
		menutext$(menu,2)="_"
	Else If menu=14
		; select a character
		menuactive(menu,0)=3
		menuactive(menu,9)=0
		For i=5 To 9
			titlemenuentity(i)=CopyEntity(stinkermesh)
			
			If i=9
				EntityColor GetChild(titlemenuentity(i),3),10,10,10
			Else
				EntityTexture GetChild(titlemenuentity(i),3),stinkertexture(i-4,0)
			EndIf
			
		Next
		; stinky
		PositionEntity titlemenuentity(5),-1,0.2,7
		ScaleEntity titlemenuentity(5),.035,.035,.035
		PointEntity titlemenuentity(5),camera
		TurnEntity titlemenuentity(5),-20,180,0
		titlemenuentity(10)=myLoadMesh("data/models/stinker/accessory001.3ds",0)
		titlemenuTexture(10)=myLoadTexture("data/models/stinker/accessory001a.jpg",4)
		EntityTexture titlemenuentity(10),titlemenutexture(10)
		ScaleEntity titlemenuentity(10),.035,.035,.035
		Animate GetChild(titlemenuentity(5),3),1,.05,10

		
		; loof
		PositionEntity titlemenuentity(6),1,0.2,7
		ScaleEntity titlemenuentity(6),.027,.027,.027
		PointEntity titlemenuentity(6),camera
		TurnEntity titlemenuentity(6),-20,180,0
		titlemenuentity(11)=myLoadMesh("data/models/stinker/accessory001.3ds",0)
		titlemenuTexture(11)=myLoadTexture("data/models/stinker/accessory001b.jpg",4)
		EntityTexture titlemenuentity(11),titlemenutexture(11)
		ScaleEntity titlemenuentity(11),.027,.027,.027
		Animate GetChild(titlemenuentity(6),3),1,.12,10


		
		; qookie
		PositionEntity titlemenuentity(7),-2,-1.4,7
		ScaleEntity titlemenuentity(7),.038,.038,.034
		PointEntity titlemenuentity(7),camera
		TurnEntity titlemenuentity(7),-25,180,0
		titlemenuentity(12)=myLoadMesh("data/models/stinker/accessory001.3ds",0)
		titlemenuTexture(12)=myLoadTexture("data/models/stinker/accessory001c.jpg",4)
		EntityTexture titlemenuentity(12),titlemenutexture(12)
		ScaleEntity titlemenuentity(12),.038,.034,.038
		Animate GetChild(titlemenuentity(7),3),1,.08,10
		EntityPickMode titlemenuentity(7),3


		
		; peegue
		PositionEntity titlemenuentity(8),0,-1.4,7
		ScaleEntity titlemenuentity(8),.035,.035,.035
		PointEntity titlemenuentity(8),camera
		TurnEntity titlemenuentity(8),-20,180,0
		titlemenuentity(13)=myLoadMesh("data/models/stinker/accessory002.3ds",0)
		titlemenuTexture(13)=myLoadTexture("data/models/stinker/accessory002a.jpg",4)
		EntityTexture titlemenuentity(13),titlemenutexture(13)
		ScaleEntity titlemenuentity(13),.035,.035,.035
		Animate GetChild(titlemenuentity(8),3),1,.1,10


		
		; custom
		PositionEntity titlemenuentity(9),2,-1.4,7
		ScaleEntity titlemenuentity(9),.035,.035,.035
		PointEntity titlemenuentity(9),camera
		TurnEntity titlemenuentity(9),-20,180,0
		Animate GetChild(titlemenuentity(9),3),1,.02,10

		titlemenupointat=0

			
	Else If menu=15
		; create custom stinker
		menuactive(15,0)=3
		
		titlemenuentity(5)=CopyEntity(stinkermesh)
		EntityTexture GetChild(titlemenuentity(5),3),stinkertexture(1,0)
		titlemenuentity(6)=0
		titlemenuentity(7)=0
			
		PlayerCharacterName$=""
		PlayerTextureBody=1
		PlayerAcc1=0
		PlayerTexAcc1=0
		PlayerAcc2=0
		PlayerTexAcc2=0
		PlayerSizeX#=0.035
		PlayerSizeY#=0.035
		PlayerSizeZ#=0.035
		PlayerVoice=1

		
		
		PositionEntity titlemenuentity(5),-1,-.2,5
		Animate GetChild(titlemenuentity(5),3),1,.02,10
		
		PointEntity titlemenuentity(5),camera
		TurnEntity titlemenuentity(5),-45,180,0
	Else If menu=17
		; replace existing profile
		For i=0 To 5
			menuactive(menu,i)=3
		Next
	Else If menu=18
		; options
		menuactive(menu,0)=3
		; control
		If KeyBoardMode=1
			MenuText$(18,3)="Mouse Control"
		Else
			MenuText$(18,3)="Mouse/Keyboard"
		EndIf
		; volume
		MenuText$(18,4)="Sound Volume: "+GlobalSoundVolume2
		MenuText$(18,5)="Music Volume: "+GlobalMusicVolume2
		
	Else If menu=19
		menuactive(menu,0)=3
		menuactive(menu,1)=3
		menuactive(menu,2)=3
	EndIf
	
	If GameMode=5 Or GameMode=6
		GameMode=0
		CloseRuckSack(8)
	EndIf

	OldGameMode=GameMode
	GameMode=12

	IconSize(9)=1
	DialogTimer=0
	IconHelpText$(9)="Close"
	
	surface=GetSurface(DialogBackGroundEntity,1)
	VertexCoords surface,0,-2.2,.2+0.16*CurrentMenuNofItems,5
	VertexCoords surface,1,2.2,.2+0.16*CurrentMenuNofItems,5
	VertexCoords surface,2,-2.2,-0.16*CurrentMenuNofItems,5
	VertexCoords surface,3,2.2,-0.16*CurrentMenuNofItems,5
	
	
	If menu<10
	
		; General In-Game Menus
		ShowEntity DialogBackgroundEntity
		
		
	Else
	
		; General Out-Game Menus
		
		; Show Stars
		HideEntity DialogBackgroundEntity
		For i=80 To 99
			ShowEntity TitleMenuEntity(i)
		Next
		
		; Main Music
		If currentmusic<>1
			If globalmusicvolume2>0
				If ChannelPlaying(musicchannel)
					StopChannel musicchannel
				EndIf
				MusicChannel=PlayMusic ("data\music\1.ogg")
				ChannelVolume MusicChannel,GlobalMusicVolume
				currentmusic=1
			Else 
				currentmusic=-1
			EndIf

			
		EndIf
	
		; Camera/Lights
		PositionEntity camera,0,0,0
		RotateEntity camera,0,0,0
		AmbientLight 255,255,255
		RotateEntity levellight,35,-35,0
		CameraFogMode camera,0
		CameraRange camera, 0.1,1000
				
		; no icons		
		For i=0 To 79
			deleteicon(i)
		Next
		
		
	EndIf

	DialogBackGroundSize=70
	
	
	
End Function

Function UpdateMenu()

	For i=7 To 8
		If IconSize(i)>0 And ((IconSize(i) Mod 2)=1 Or IconSize(i)=1000) IconSize(i)=1
	Next

	If CurrentMenu<100
		UpdateOldMenu()
	Else
		Select CurrentMenu
		Case 100
			CustomSelectMenu()
		Case 101
			CustomDeleteMenu()
		Case 102
			WaEditorTitleMenu()
			
	
		End Select
	EndIf
		
End Function
Function UpdateOldMenu()

	; general for all menus
	UpdateWorld

	Mouse1=False
	Mouse2=False
	If MouseDown(1)=True Or MouseHit(1)>0
		Mouse1=True
	EndIf
	If MouseDown(2)=True Or MouseHit(2)>0
		Mouse2=True
	EndIf

	
	ShowEntity MouseCursor
	MouseCursorVisible=True
	
	; general out-of-game menus
	If CurrentMenu>10
		PositionTexture TitleMenuTexture(80),(-(menutimer Mod 2500))/2500.0,menutimer Mod 5000/5000.0
			For i=81 To 99
				; move stars
				TranslateEntity TitleMenuEntity(i),-(Float(i)/10000.0),-(Float(i*2)/10000.0),0
	
				If EntityX(TitleMenuEntity(i))<-14 Or EntityY(TitleMenuEntity(i))<-14
					FreeEntity TitleMenuEntity(i)
					
					titlemenuentity(i)=CopyEntity(starmesh)
					
					RotateEntity Titlemenuentity(i),-90,0,0
					
					EntityFX titlemenuentity(i),1
					PositionEntity titlemenuentity(i),Rnd(-10,20),14,Rnd(20,30)
	
	
		
				EndIf
				TurnEntity TitleMenuEntity(i),0,1,0
			Next
			
			RotateEntity TitleMenuEntity(60),-90,0,0
			
			TurnEntity TitleMenuEntity(60),-0,5*Sin(menutimer Mod 360),0
	EndIf
		
	

	; special cases
	
	

	
	
	If CurrentMenu=4
		; save game
		flag=False
		HideEntity SaveSlotEntity(0)
		For i=1 To 9
			If MouseX()>i*75*GfxWidth/800.0 And MouseX()<(i*75+50)*GfxWidth/800.0 And MouseY()>150*GfxHeight/600.0 And MouseY()<200*GfxHeight/600.0
				ScaleEntity SaveSlotEntity(i),.7,.7,.7
				
				If SaveSlotDateTime$(i)<>""
					ShowEntity SaveSlotEntity(0)
					EntityTexture SaveSlotEntity(0),SaveSlotTexture(i)
										
					DisplayText(SaveSlotLevelName$(i),25-0.5*Len(SaveSlotLevelName$(i)),16.5,1,1,255,255,255)
					DisplayText(SaveSlotDateTime$(i),25-0.5*Len(SaveSlotDateTime$(i)),17.5,1,1,255,255,255)
				EndIf
				
			Else
				ScaleEntity SaveSLotEntity(i),.5,.5,.5
			EndIf
			If SaveSlotDateTime$(i)<>"" Then flag=True
		Next
		If flag=False
			; all save slots free 
			b$="Select one of the nine 'Save Slots' above."
			DisplayText(b$,25-0.5*Len(b$),12,1,1,200,200,200)
			b$="Once saved, you can resume your game from"
			DisplayText(b$,25-0.5*Len(b$),13,1,1,200,200,200)
			b$="this position using the Load Game function."
			DisplayText(b$,25-0.5*Len(b$),14,1,1,200,200,200)
		EndIf
	Else If CurrentMenu=5 Or currentmenu=16
		; load game
		flag=False
		HideEntity SaveSlotEntity(0)
		For i=1 To 9
			If MouseX()>i*75*GfxWidth/800.0 And MouseX()<(i*75+50)*GfxWidth/800.0 And MouseY()>150*GfxHeight/600.0 And MouseY()<200*GfxHeight/600.0
					
				If SaveSlotDateTime$(i)<>""
					ScaleEntity SaveSlotEntity(i),.7,.7,.7
					ShowEntity SaveSlotEntity(0)
					EntityTexture SaveSlotEntity(0),SaveSlotTexture(i)
										
					DisplayText(SaveSlotLevelName$(i),25-0.5*Len(SaveSlotLevelName$(i)),16.5,1,1,255,255,255)
					DisplayText(SaveSlotDateTime$(i),25-0.5*Len(SaveSlotDateTime$(i)),17.5,1,1,255,255,255)
				EndIf
				
			Else
				ScaleEntity SaveSLotEntity(i),.5,.5,.5
			EndIf
			If SaveSlotDateTime$(i)<>"" Then flag=True
		Next
		If flag=False
			; all save slots free 
			b$="You have no Saved Games available."
			DisplayText(b$,25-0.5*Len(b$),12,1,1,200,200,200)
			b$="You need to use the Save Game function"
			DisplayText(b$,25-0.5*Len(b$),13,1,1,200,200,200)
			b$="to be able to resume from a saved spot."
			DisplayText(b$,25-0.5*Len(b$),14,1,1,200,200,200)
		EndIf
		
	Else If currentmenu=8
		; Floinging
		ex$="Select Adventure To Replay:"
		DisplayText(ex$,Float((50-Len(ex$)))/2.0,7,1,1,255,255,0)
		ex$=CurrentReplayAdventureName
		DisplayText(ex$,Float((50-Len(ex$)))/2.0,9,1,1,255,255,255)
		
		ex$="Coins: "+adventurecompletedcoins(currentreplayadventure)+" of "+adventurecompletedcoinstotal(currentreplayadventure)
		ex$=ex$+", Gems: "+adventurecompletedgems(currentreplayadventure)+" of "+adventurecompletedgemstotal(currentreplayadventure)
		ex$=ex$+", Score: "+adventurecompletedscore(currentreplayadventure)
		DisplayText(ex$,Float((50-Len(ex$)))/2.0,10,1,1,255,255,255)
		ex$="<Back 10>   <Back>   <PLAY>   <Next>   <Next 10>"
		DisplayText(ex$,Float((50-Len(ex$)))/2.0,12,1,1,255,255,0)
		ex$="<CANCEL>"
		DisplayText(ex$,Float((50-Len(ex$)))/2.0,14,1,1,255,255,0)

		If MouseGameMode=-1 And Mouse1=True
			MouseGameMode=-2
			If Float(MouseX())/Float(GfxWidth)>0.42 And Float(MouseX())/Float(GfxWidth)<0.58 And Float(MouseY())/Float(GfxHeight)>0.59 And Float(MouseY())/Float(GfxHeight)<0.65
				; cancel
				endmenu()
				PlaysoundfxNow(130)
			EndIf
	
			If Float(MouseX())/Float(GfxWidth)>0.62 And Float(MouseX())/Float(GfxWidth)<0.75 And Float(MouseY())/Float(GfxHeight)>0.50 And Float(MouseY())/Float(GfxHeight)<0.56
				; forward
				Repeat
					CurrentReplayAdventure=CurrentReplayAdventure+1
					If CurrentReplayAdventure=500 Then CurrentReplayAdventure=1
				Until AdventureCompleted(CurrentReplayAdventure)=1
			
				; get the name
				file=ReadFile("data\adventures\adventure"+currentreplayadventure+"\master.dat")
				currentreplayadventurename$=ReadString$(file)
				CloseFile file
			EndIf
			If Float(MouseX())/Float(GfxWidth)>0.80 And Float(MouseY())/600.0>0.50 And Float(MouseY())/Float(GfxHeight)<0.56
				; forward ten
				For j=1 To 10
					Repeat
						CurrentReplayAdventure=CurrentReplayAdventure+1
						If CurrentReplayAdventure=500 Then CurrentReplayAdventure=1
					Until AdventureCompleted(CurrentReplayAdventure)=1
				Next
			
				; get the name
				file=ReadFile("data\adventures\adventure"+currentreplayadventure+"\master.dat")
				currentreplayadventurename$=ReadString$(file)
				CloseFile file
			EndIf
			
			If Float(MouseX())/Float(GfxWidth)>0.25 And Float(MouseX())/Float(GfxWidth)<0.38 And Float(MouseY())/Float(GfxHeight)>0.50 And Float(MouseY())/Float(GfxHeight)<0.56
				; back
				Repeat
					CurrentReplayAdventure=CurrentReplayAdventure-1
					If CurrentReplayAdventure=0 Then CurrentReplayAdventure=499
				Until AdventureCompleted(CurrentReplayAdventure)=1
			
				; get the name
				file=ReadFile("data\adventures\adventure"+currentreplayadventure+"\master.dat")
				currentreplayadventurename$=ReadString$(file)
				CloseFile file
			EndIf
			If Float(MouseX())/Float(GfxWidth)<0.2 And Float(MouseY())/Float(GfxHeight)>0.50 And Float(MouseY())/Float(GfxHeight)<0.56
				; back ten
				For j=1 To 10
					Repeat
						CurrentReplayAdventure=CurrentReplayAdventure-1
						If CurrentReplayAdventure=0 Then CurrentReplayAdventure=499
					Until AdventureCompleted(CurrentReplayAdventure)=1
				Next
			
				; get the name
				file=ReadFile("data\adventures\adventure"+currentreplayadventure+"\master.dat")
				currentreplayadventurename$=ReadString$(file)
				CloseFile file
			EndIf
			
			If Float(MouseX())/Float(GfxWidth)>0.44 And Float(MouseX())/Float(GfxWidth)<0.56 And Float(MouseY())/Float(GfxHeight)>0.50 And Float(MouseY())/Float(GfxHeight)<0.56
				; PLAY
				endmenu()
				AdventureCurrentStatus=3
				activatecommand(8,currentreplayadventure,0,0,0)
				playsoundfxnow(42)

			EndIf




			
		EndIf
	
	Else If currentmenu=11
	
	ex$ = "Player: " + playername
	DisplayText(ex$, (66.5-Len(ex$))/2,28.595001,0.75,1,255,255,0)
	ex$="(click to change)"
	DisplayText(ex$, (66.5-Len(ex$))/2,29.925001,0.75,1,255,255,0)

	
		If (Mouse1=True And MouseGameMode=-1) And MouseY()>GfxHeight*0.9
			MouseGameMode=-2
			Endmenu()
			Startmenu(12)
		EndIf
		
	Else If currentmenu=13
	
		If menutimer Mod 60<30
			menutext$(13,2)=Left$(menutext$(13,2),Len(menutext$(13,2))-1)+" "
		Else
			menutext$(13,2)=Left$(menutext$(13,2),Len(menutext$(13,2))-1)+"_"
		EndIf
		
		key=GetKey()
		
		If key=13
			playername$=Left$(menutext$(13,2),Len(menutext$(13,2))-1)
			; delete leading spaces
			If Left$(playername$,1)=" "
				Repeat
					playername$=Right$(playername$,Len(playername$)-1)
				Until Left$(playername$,1)<>" "
			EndIf

			
			If playername$<>""
				; ok
				If FileType(GlobalDirName$+"\Player Profiles\"+playername$)=2
					endmenu()
					;PlaysoundfxNow(135)

					startmenu(17)
				Else
					endmenu()
					PlaysoundfxNow(131)

					startmenu(14)
				EndIf
			EndIf

		Else If key=8
			menutext$(13,2)="_"
		Else If ((key>=65 And key<90) Or (key>=97 And key<=122) Or (key>=48 And key<=57) Or key=32) And Len(menutext$(13,2))<21
			;If menutext$(13,2)="PLAYER1_" Or menutext$(13,2)="PLAYER1 "
			;	menutext$(13,2)=Chr$(key)+"_"
			;	
			;Else
			menutext$(13,2)=Left$(menutext$(13,2),Len(menutext$(13,2))-1)+Chr$(key)+"_"
			;EndIf
		EndIf
	Else If currentmenu=14
		; select character
		For i=5 To 8
			bone=FindChild(titlemenuentity(i),"hat_bone")
			PositionEntity titlemenuentity(i+5),EntityX(bone,True),EntityY(bone,True),EntityZ(bone,True)
			RotateEntity titlemenuentity(i+5),EntityPitch(bone,True),EntityYaw(bone,True),EntityRoll(bone,True)
		Next
		mx=MouseX()
		my=MouseY()
		
		If (mx-GfxWidth*287/800)^2+(my-GfxHeight*224/600)^2<((75*GfxWidth)/800)^2
			picked=1
		EndIf
		If (mx-GfxWidth*519/800)^2+(my-GfxHeight*229/600)^2<((75*GfxWidth)/800)^2
			picked=2
		EndIf
		If (mx-GfxWidth*173/800)^2+(my-GfxHeight*414/600)^2<((75*GfxWidth)/800)^2
			picked=3
		EndIf
		If (mx-GfxWidth*408/800)^2+(my-GfxHeight*414/600)^2<((75*GfxWidth)/800)^2
			picked=4
		EndIf
		If (mx-GfxWidth*631/800)^2+(my-GfxHeight*414/600)^2<((75*GfxWidth)/800)^2
			picked=5
		EndIf

		If picked=1 And titlemenupointat<>1
			Animate GetChild(titlemenuentity(5),3),1,.1,15
		EndIf
		If picked<>1 And titlemenupointat=1
			Animate GetChild(titlemenuentity(5),3),1,0.05,10
		EndIf
		If picked=2 And titlemenupointat<>2
			Animate GetChild(titlemenuentity(6),3),1,.6,11
		EndIf
		If picked<>2 And titlemenupointat=2
			Animate GetChild(titlemenuentity(6),3),1,0.12,10
		EndIf
		If picked=3 And titlemenupointat<>3
			Animate GetChild(titlemenuentity(7),3),1,.3,12
		EndIf
		If picked<>3 And titlemenupointat=3
			Animate GetChild(titlemenuentity(7),3),1,0.08,10
		EndIf
		If picked=4 And titlemenupointat<>4
			Animate GetChild(titlemenuentity(8),3),1,.4,9
		EndIf
		If picked<>4 And titlemenupointat=4
			Animate GetChild(titlemenuentity(8),3),1,0.1,10
		EndIf
		If picked=5 
			TurnEntity Titlemenuentity(9),0,2,0
		EndIf
		If picked<>5
			
		EndIf



		
		
		titlemenupointat=picked
		
		
		If Mouse1=True And MouseGameMode=-1 And picked>0
			mousegamemode=-2
			If picked>=1 And picked<=4
				endmenu()
				FreeSound soundfx(177)
				SoundFX(177)=myLoadSound("data\sound\voices\"+Str$(picked)+"\intro.wav")

				PlaysoundfxNow(177)
				
				timeflag=MilliSecs()
				
				ResetText("data/graphics/font.bmp")
				AmbientLight 255,255,255
				cube=CreateCube(camera)
				cubetex=myLoadTexture("load.jpg",1)
				EntityTexture cube,cubetex
				PositionEntity cube,0,0,10
				
				RenderWorld
				Text GfxWidth*0.5,Gfxheight*2/7,"...Creating Player...",True
				Text GfxWidth*0.5,Gfxheight*2/3,"...Please Wait...",True
				Flip
				
				Repeat
				Until Millisecs()-timeflag>4000
				
			EndIf

			Select picked
			Case 1
				PlayerCharacterName$="Stinky"
				PlayerTextureBody=1
				PlayerAcc1=1
				PlayerTexAcc1=1
				PlayerAcc2=0
				PlayerTexAcc2=0
				PlayerSizeX#=0.035
				PlayerSizeY#=0.035
				PlayerSizeZ#=0.035
				PlayerVoice=1
			;	endmenu()
				CreateNewPlayer()
				

				startmenu(11)
			Case 2
				PlayerCharacterName$="Loof"
				PlayerTextureBody=2
				PlayerAcc1=1
				PlayerTexAcc1=2
				PlayerAcc2=0
				PlayerTexAcc2=0
				PlayerSizeX#=0.029
				PlayerSizeY#=0.029
				PlayerSizeZ#=0.029
				PlayerVoice=2
			;	endmenu()
				CreateNewPlayer()
				

				startmenu(11)
			Case 3
				PlayerCharacterName$="Qookie"
				PlayerTextureBody=3
				PlayerAcc1=1
				PlayerTexAcc1=3
				PlayerAcc2=0
				PlayerTexAcc2=0
				PlayerSizeX#=0.038
				PlayerSizeY#=0.038
				PlayerSizeZ#=0.034
				PlayerVoice=3
			;	endmenu()
				CreateNewPlayer()
				

				startmenu(11)
			Case 4
				PlayerCharacterName$="Peegue"
				PlayerTextureBody=4
				PlayerAcc1=2
				PlayerTexAcc1=1
				PlayerAcc2=0
				PlayerTexAcc2=0
				PlayerSizeX#=0.035
				PlayerSizeY#=0.035
				PlayerSizeZ#=0.035
				PlayerVoice=4
			;	endmenu()
				CreateNewPlayer()
				
				startmenu(11)
			Case 5
				endmenu()
				startmenu(15)
			End Select
			If picked>=1 And picked<=4
				
				FreeTexture cubetex
				FreeEntity cube			

			EndIf
		EndIf
		
		If currentmenu=14 ; still
			DisplayText(mytext$,x#,y#,size#,spacing#,red,green,blue)
	
			Displaytext("Stinky",14.8,11.2,1.0,1.0,255,255,255)
			Displaytext("Loof",30.3,11.2,1.0,1.0,255,255,255)
			Displaytext("Qookie",7.5,18.6,1.0,1.0,255,255,255)
			Displaytext("Peegue",22,18.6,1.0,1.0,255,255,255)
			Displaytext("Custom",36.5,18.6,1.0,1.0,255,255,255)
		EndIf

	Else If currentmenu=15
	
		textline=-1
		If MouseX()>(400.0*GfxWidth)/800.0 And MouseX()<(720.0*gfxwidth)/800.0
			textline=Floor(((MouseY()-234.0*GfxHeight/600.0)/((151.0*GfxHeight/600.0)/6.0)))
		EndIf

		TurnEntity titlemenuentity(5),0,.5,0
		ScaleEntity titlemenuentity(5),PlayerSizeX,PlayerSizeZ,PlayerSizeY
		EntityTexture GetChild(titlemenuentity(5),3),Stinkertexture(PlayerTextureBody,0)
		For i=6 To 7
			If titlemenuentity(i)>0
				bone=FindChild(titlemenuentity(5),"hat_bone")
				PositionEntity titlemenuentity(i),EntityX(bone,True),EntityY(bone,True),EntityZ(bone,True)
				RotateEntity titlemenuentity(i),EntityPitch(bone,True),EntityYaw(bone,True),EntityRoll(bone,True)
				ScaleEntity titlemenuentity(i),PlayerSizeX,PlayerSizeZ,PlayerSizeY

			EndIf
		Next
		
		;If menutimer Mod 60 <30
			ex$="Customize:"
		;Else
		;	ex$="Name: "+PlayerCharacterName$+" "
		;EndIf
		
		DisplayText(ex$,(18+(30-Len(ex$))/2.0)/1.5,7/1.5,1.5,1,255,255,0)
		;isplayText("----------------",27,8,1,1,255,255,255)
		
		col=255
		If textline=0 Then col=0
		ex$="Hat"
		DisplayText(ex$,20+(30-Len(ex$))/2.0,9,1,1,255,255,col)
		col=255
		If textline=1 Then col=0
		ex$="Eyes/Shoes"
		DisplayText(ex$,20+(30-Len(ex$))/2.0,10,1,1,255,255,col)
		col=255
		If textline=2 Then col=0
		ex$="Glasses"
		DisplayText(ex$,20+(30-Len(ex$))/2.0,11,1,1,255,255,col)
		col=255
		If textline=3 Then col=0
		If playersizez<0.03
			ex$="Height: Tiny"
		Else If playersizez<0.033
			ex$="Height: Small"
		Else If playersizez<0.036
			ex$="Height: Medium"
		Else If playersizez<0.039
			ex$="Height: Large"
		Else 
			ex$="Height: Huge"
		EndIf

		DisplayText(ex$,20+(30-Len(ex$))/2.0,12,1,1,255,255,col)
		col=255
		If textline=4 Then col=0
		If playersizex<0.03
			ex$="Width: Tiny"
		Else If playersizex<0.033
			ex$="Width: Small"
		Else If playersizex<0.036
			ex$="Width: Medium"
		Else If playersizex<0.039
			ex$="Width: Large"
		Else 
			ex$="Width: Huge"
		EndIf

		DisplayText(ex$,20+(30-Len(ex$))/2.0,13,1,1,255,255,col)
		col=255
		If textline=5 Then col=0
		
		Select playervoice
		Case 1
			ex$="Voice: Stinky"
		Case 2
			ex$="Voice: Loof"
		Case 3
			ex$="Voice: Qookie"
		Case 4
			ex$="Voice: Peegue"
		End Select
		DisplayText(ex$,20+(30-Len(ex$))/2.0,14,1,1,255,255,col)
		col=255
		If textline=6 Then col=0
		
		col=255
		ex$="(click any above to change)"
		DisplayText(ex$,20+(30-Len(ex$))/2.0,15.5,1,1,255,255,255)
		
		

		key=GetKey()
		
		

		If key=8
			playercharactername$=""
			
		Else If ((key>=65 And key<90) Or (key>=97 And key<=122) Or (key>=48 And key<=57) Or key=32) And Len(playercharactername$)<12
			;If menutext$(13,2)="PLAYER1_" Or menutext$(13,2)="PLAYER1 "
			;	menutext$(13,2)=Chr$(key)+"_"
			;	
			;Else
			playercharactername$=playercharactername$+Chr$(key)
			;EndIf
		EndIf
		
		If mouse1=True And mousegamemode=-1 And textline>=0 And textline<=6

			mousegamemode=-2
			
						
			Select textline
			Case 0
				PlaysoundfxNow(130)
				playertexacc1=playertexacc1+1
				
				If playeracc1>9 
					ex$=""
				Else
					ex$="0"
				EndIf
				If myFileType("data\models\stinker/accessory0"+ex$+Str$(playeracc1)+Chr$(64+playertexacc1)+".jpg")=0
					If titlemenuentity(6)>0
						FreeEntity titlemenuentity(6)
						FreeTexture titlemenutexture(6)
						titlemenuentity(6)=0
						titlemenutexture(6)=0
					EndIf
					playertexacc1=1
					playeracc1=playeracc1+1
					If playeracc1>9 
						ex$=""
					Else
						ex$="0"
					EndIf

					If playeracc1=22 
						playeracc1=0
					
					;Else If playeracc1=0
					
					Else
						titlemenuentity(6)=myLoadMesh("data\models\stinker/accessory0"+ex$+Str$(playeracc1)+".3ds",0)
						titlemenutexture(6)=myLoadTexture("data\models\stinker/accessory0"+ex$+Str$(playeracc1)+Chr$(64+playertexacc1)+".jpg",4)
						EntityTexture titlemenuentity(6),titlemenutexture(6)
						ScaleEntity titlemenuentity(6),.01,.01,.01
					EndIf
				Else
					FreeTexture titlemenutexture(6)
					titlemenutexture(6)=myLoadTexture("data\models\stinker/accessory0"+ex$+Str$(playeracc1)+Chr$(64+playertexacc1)+".jpg",4)
					EntityTexture titlemenuentity(6),titlemenutexture(6)

		
				EndIf
					
			
			Case 1
				PlaysoundfxNow(130)

				PlayerTextureBody=PlayerTextureBody+1
				If PlayerTextureBody=5 Then PlayerTextureBody=1
				
			Case 2
				PlaysoundfxNow(130)
				
				playertexacc2=playertexacc2+1
			
				If myFileType("data\models\stinker/accessory"+Str$(playeracc2)+Chr$(64+playertexacc2)+".jpg")=0
					If titlemenuentity(7)>0
						FreeEntity titlemenuentity(7)
						FreeTexture titlemenutexture(7)
						titlemenuentity(7)=0
						titlemenutexture(7)=0
					EndIf
					playertexacc2=1
					
					playeracc2=playeracc2+1
					
					If playeracc2=1 Then playeracc2=101
					If playeracc2=103
						playeracc2=0
					

					;If playeracc2=0
					
					Else
						titlemenuentity(7)=myLoadMesh("data\models\stinker/accessory"+Str$(playeracc2)+".3ds",0)
						titlemenutexture(7)=myLoadTexture("data\models\stinker/accessory"+Str$(playeracc2)+Chr$(64+playertexacc2)+".jpg",4)
						EntityTexture titlemenuentity(7),titlemenutexture(7)
						ScaleEntity titlemenuentity(7),.01,.01,.01

					EndIf
				Else
					FreeTexture titlemenutexture(7)
					titlemenutexture(7)=myLoadTexture("data\models\stinker/accessory"+Str$(playeracc2)+Chr$(64+playertexacc2)+".jpg",4)
					EntityTexture titlemenuentity(7),titlemenutexture(7)

		
				EndIf
			Case 3
				PlaysoundfxNow(130)

				playersizeZ=playersizeZ+0.003
				If playersizeZ>=0.041 Then playersizeZ=0.029
			Case 4
				PlaysoundfxNow(130)

				playersizex=playersizex+0.003
				If playersizex>=0.041 Then playersizex=0.029
				playersizeY=playersizex
			
			Case 5
				playervoice=playervoice+1
				If playervoice=5 Then playervoice=1
				FreeSound soundfx(177)
				SoundFX(177)=myLoadSound("data\sound\voices\"+Str$(playervoice)+"\intro.wav")

				PlaysoundfxNow(177)

				
				
			End Select
		EndIf

	EndIf

	yposstart#=1+.5*(10-CurrentMenuNofItems)
	
	If DialogBackGroundSize<90 Then DialogBackGroundSize=DialogBackGroundSize+2
	
	If currentmenu=24
		PositionEntity DialogBackGroundEntity,0,0,20-21*Sin(DialogBackGroundSize)
	Else
		PositionEntity DialogBackGroundEntity,0,0,20-20*Sin(DialogBackGroundSize)
	EndIf
	
	EntityAlpha DialogBackGroundEntity,Float(DialogBackGroundSize)/100.0
	
	ControlIcons()

	PositionEntity MouseCursor,-10+20*Float(MouseX())/Float(GFXWidth),7.5-15*Float(MouseY())/Float(GfxHeight),20

	If Mouse1=False And Mouse2=False 
		MouseGameMode=-1
		For i=0 To 79
			; activate icons
			If IconEntity(i)>0 Then EntityPickMode IconEntity(i),2
		Next
	EndIf
	
	MenuTimer=MenuTimer+1
	DialogTimer=DialogTimer+1
	
	; find what item we're on
	CurrentMenuLine=-1
	If MouseX()>GfxWidth/5 And MouseX()<GfxWidth*4/5
		CurrentMenuLine=((MouseY()-(-10+50*yposstart)*GfxHeight/600)/(50*GfxHeight/600))-.5
	EndIf
	
	; Display the menu
	For i=0 To CurrentMenuNofItems-1
		If MenuActive(currentmenu,i)=1
			width#=1.0
			tex$=MenuText$(currentmenu,i)
			DisplayText(tex$,(26.0-Len(tex$)*width)/(width*2.0),(yposstart+i)/width,2.0,width,100,100,0)

		Else If MenuActive(currentmenu,i)=2

			If i<>CurrentMenuLine
				width#=1.05+.05*Sin((DialogTimer*2)+i*60)
				tex$=MenuText$(currentmenu,i)
				DisplayText(tex$,(26.0-Len(tex$)*width)/(width*2.0),(yposstart+i)/width,2.0,width,255,255,0)
			Else

				width#=1.1+.1*Sin((DialogTimer*2)+i*60)
				tex$=MenuText$(currentmenu,i)
				DisplayText(tex$,(26.0-Len(tex$)*width)/(width*2.0),(yposstart+i)/width,2.0,width,255,255,255)
			EndIf
		Else If MenuActive(currentmenu,i)=3
			width#=1.0
			tex$=MenuText$(currentmenu,i)
			If currentmenu=12 And i=0
				fluxcompensator#=0.4
			Else
				fluxcompensator#=0.0
			EndIf
			DisplayText(tex$,(26.0-Len(tex$)*width)/(width*2.0),(yposstart+i-fluxcompensator)/width,2.0,width,255,255,100)

		EndIf
	Next
	
	
	If Mouse1=True And MouseGameMode=-1 And (CurrentMenu=4 Or CurrentMenu=5 Or CurrentMenu=16)
		; load/save
		For i=1 To 9
			If MouseX()>i*75*GfxWidth/800.0 And MouseX()<(i*75+50)*GfxWidth/800.0 And MouseY()>150*GfxHeight/600.0 And MouseY()<200*GfxHeight/600.0
				
				If CurrentMenu=4
					; save
					If SaveSlotDateTime$(i)=""
						; empty slot - just save
						If LightRedGoal2=-1
							LightRedGoal2=LightRedGoal
							LightGreenGoal2=LightGreenGoal
							LightBlueGoal2=LightBlueGoal
							AmbientRedGoal2=AmbientRedGoal
							AmbientGreenGoal2=AmbientGreenGoal
							AmbientBlueGoal2=AmbientBlueGoal
						EndIf
						ex$=Mid$(CurrentDate$(),4,4)+Left$(CurrentDate$(),2)+" "
						ex$=ex$+" "+CurrentTime$()
						SaveGame(i,ex$,adventuretitle4saving$)
						EndMenu()
						MessageLineText1$="Game Saved in Slot #"+Str$(i)
						MessageLineText2$=""
						MessageLineTimer=300
						PlaysoundfxNow(132)
						TimeOfLastGameSaved=MilliSecs()
	
						If ExitAfterThisSave=True
							EndLevel()
							endadventure()
							StartMenu(11)
						EndIf
					
					Else
						; overwrite
						EndMenu()
						GameSlotToBeSaved=i
						GameNameToBeSaved$=SaveSlotDateTime$(i)
						PlaysoundfxNow(135)
						
						MenuText$(6,0)="Overwrite Slot #"+Str$(i)+"?"
				
						StartMenu(6)
					EndIf
					
				Else If SaveSlotDateTime$(i)<>""

					; load
					
					EndMenu()
					EndLevel()
					EndAdventure()

					PlaysoundfxNow(132)

					LoadGame(i)
					
					MessageLineText1$="Game Loaded From Slot #"+Str$(i)
					MessageLineText2$=""
					MessageLineTimer=300
					
				EndIf
					
				
			EndIf
		Next
	EndIf

	
	If Mouse1=True And MouseGameMode=-1 And CurrentMenuLine>=0 And CurrentMenuLine<CurrentMenuNofItems 
		If MenuActive(CurrentMenu,CurrentMenuLine)=2
		
			Select CurrentMenu
			
			Case 0 ; in -game
				Select CurrentMenuLine
				Case 0
					; resume game
					EndMenu()
					PlaysoundfxNow(130)

				Case 1
					; load game
					EndMenu()
					StartMenu(5)
					PlaysoundfxNow(133)


				Case 2
					; save game
					EndMenu()
					StartMenu(4)
					PlaysoundfxNow(134)


				Case 3
					; restart adventure
					EndMenu()
					StartMenu(2)
					PlaysoundfxNow(131)

				Case 4
					; abort adventure
					
					endmenu()
					startmenu(1)
					PlaysoundfxNow(131)

					
				Case 5
					; exit game
					
					endmenu()
					
					startmenu(3)
					PlaysoundfxNow(131)

				End Select
			Case 1 ; abort - are you sure?
				Select CurrentMenuLine
				Case 3
					; Yes
					
							
					EndLevel()
					EndAdventure()
					AdventureCancelData()
					
					
					Select AdventureCurrentStatus
					Case 0,1; hub (shouldn't happen) or regular adventure
						StartHubLevel(-AdventureExitLostLevel,AdventureExitLostX,AdventureExitLostY)
					
					Case 2 ; custom
						HideEntity DialogBackGroundEntity
						StartCustomSelectMenu()	
					Case 3 ; replayadventure
						StartHubLevel(-23,27,13)

					End Select

				Case 4
					; No
					EndMenu()
					PlaysoundfxNow(130)

				End Select
			Case 2 ; restart - are you sure?
				Select CurrentMenuLine
				Case 3
					; Yes
					
					Endmenu()
					PlaysoundfxNow(132)

					
					AdventureCancelData()
								
					If AdventureCurrentStatus=1 Or AdventureCurrentStatus=3
						; regular adventure or replay adventure
						ActivateCommand(8,AdventureCurrentNumber,0,0,0)
					Else If AdventureCurrentStatus=2
						; custom adventure
						ActivateCommand(8,0,0,0,0)
					EndIf

				Case 4
					; No
					PlaysoundfxNow(130)

					EndMenu()
				End Select
			Case 3 ; exit - are you sure?
				Select CurrentMenuLine
				Case 3
					; Yes
					EndMenu()
					
					If WAEpisode=0
						EndLevel()
						endadventure()
						PlaysoundfxNow(132)
						StartMenu(11)

					Else
					
					
						If MilliSecs()-TimeOfLastGameSaved>60000
							PlaysoundfxNow(135)
							StartMenu(7)					
						Else
							EndLevel()
							endadventure()
							PlaysoundfxNow(132)
							StartMenu(11)
						EndIf
					EndIf
				Case 4
					; No
					PlaysoundfxNow(130)

					EndMenu()
				End Select

			Case 4 ; save game
				If CurrentMenuLine=9
					; Cancel (everything else taken care above separately)
					PlaysoundfxNow(130)

					EndMenu()
							
				EndIf
			Case 5 ; load game
				If CurrentMenuLine=9 

					; Cancel (everything else above)
					PlaysoundfxNow(130)

					EndMenu()
				
						
				
				EndIf

			Case 6 ; overwrite saved game - are you sure?
				Select CurrentMenuLine
				Case 4
					; Yes
					PlaysoundfxNow(132)

					If LightRedGoal2=-1
						LightRedGoal2=LightRedGoal
						LightGreenGoal2=LightGreenGoal
						LightBlueGoal2=LightBlueGoal
						AmbientRedGoal2=AmbientRedGoal
						AmbientGreenGoal2=AmbientGreenGoal
						AmbientBlueGoal2=AmbientBlueGoal
						
					EndIf
					ex$=Mid$(CurrentDate$(),4,4)+Left$(CurrentDate$(),2)+" "
					ex$=ex$+" "+CurrentTime$()

					SaveGame(GameSlotToBeSaved,ex$,adventuretitle4saving$)
					EndMenu()
					MessageLineText1$="Game Saved in Slot #"+Str$(GameSlotToBeSaved)
					MessageLineText2$=""
					MessageLineTimer=300
					TimeOfLastGameSaved=MilliSecs()
					
					If ExitAfterThisSave=True
						EndLevel()
						endadventure()
						StartMenu(11)
					EndIf



				Case 5
					; No
					PlaysoundfxNow(130)

					EndMenu()
					StartMenu(4)
				End Select
			
			Case 7
				; save before exit?
				Select currentmenuline
				Case 4
					; don't save
					endmenu()
					endadventure()
					startmenu(11)
				Case 5
					; save
					endmenu()
					startmenu(4)
					ExitAfterThisSave=True
				
					
				End Select
			
			
			
			
				
			Case 11
				; main menu
				Select currentmenuline
				Case 4
					PlaysoundfxNow(131)
					endmenu()
					
					StartCustomSelectMenu()
				
				Case 5
					endmenu()
					PlaysoundfxNow(133)

					startmenu(16)
				Case 6
					endmenu()
					PlaysoundfxNow(131)

					startmenu(18)
				
				Case 7
				
					ExecFile("http://www.midnightsynergy.com/adventures/levelex/index.html")
					End	
					
						
				Case 8
					Endmenu()
					PlaysoundfxNow(131)
					startmenu(19)

				End Select
				
				
			Case 12
				; select profile
				Select currentmenuline
				Case 1,2,3,4,5,6,7,8
					If Menutext$(currentmenu,currentmenuline)<>""
						
						PlayerName$=Menutext$(currentmenu,currentmenuline)
						file=ReadFile(GlobalDirName$+"\Player Profiles\"+playername$+"\Current\Playerfile.wpf")
						If file=0
							PlayerCharacterName$=""
							PlayerTimePlayed=0
						Else
							playername$=ReadString$(file)
							playercharactername$=ReadString$(file)
							CloseFile file
						EndIf
						endmenu()
						If PlayerCharacterName$=""
							PlaysoundfxNow(131)
							startmenu(14)
						Else
							PlaysoundfxNow(132)
							startmenu(11)
						EndIf
					EndIf
				Case 9
					endmenu()
					PlaysoundfxNow(131)

					startmenu(13)
				End Select
			Case 13
				; enter new name
				Select currentmenuline
				Case 4
					
					playername$=Left$(menutext$(13,2),Len(menutext$(13,2))-1)
					; delete leading spaces
					If Left$(playername$,1)=" "
						Repeat
							playername$=Right$(playername$,Len(playername$)-1)
						Until Left$(playername$,1)<>" "
					EndIf
					If playername$<>""
						; ok
						If FileType(GlobalDirName$+"\Player Profiles\"+playername$)=2
							endmenu()
							;PlaysoundfxNow(135)

							startmenu(17)
						Else
							endmenu()
							PlaysoundfxNow(131)

							startmenu(14)
						EndIf
					EndIf
				Case 5
					; cancel
					endmenu()
					PlaysoundfxNow(130)

					startmenu(12)
				End Select
			Case 15
				; custom stinker
				If currentmenuline=8
					; delete leading spaces
					If Left$(playercharactername$,1)=" "
						Repeat
							playercharactername$=Right$(playercharactername$,Len(playercharactername$)-1)
						Until Left$(playercharactername$,1)<>" "
					EndIf

					If playercharactername$="" Then PlayerCharacterName$="Anonymous"
					endmenu()
					
					timeflag=MilliSecs()
					
					ResetText("data/graphics/font.bmp")

					AmbientLight 255,255,255
					cube=CreateCube(camera)
					cubetex=myLoadTexture("load.jpg",1)
					EntityTexture cube,cubetex
					PositionEntity cube,0,0,10
					
					RenderWorld
					Text GfxWidth*0.5,Gfxheight*2/7,"...Creating Player...",True
					Text GfxWidth*0.5,Gfxheight*2/3,"...Please Wait...",True
					Flip

					
					CreateNewPlayer()
					playsoundfxnow(132)
					

					Repeat
					Until MilliSecs()-timeflag>2000
					FreeTexture cubetex
					FreeEntity cube

					startmenu(11)
					
				EndIf
				If currentmenuline=9
					PlaysoundfxNow(130)

					endmenu()
					startmenu(14)
				EndIf
			Case 16
				; load saved game from main menu
				
				If CurrentMenuLine=9 ; (only do cancel - all else above)

					; Cancel
					EndMenu()
					PlaysoundfxNow(130)

					startmenu(11)
				
						
				
				EndIf

			
			Case 17
				; profile already exists
				Select currentmenuline
				Case 6
					; yes
					endmenu()
					PlaysoundfxNow(131)

					startmenu(12)

				
				End Select	
			Case 18
				; options
				Select currentmenuline
				Case 2
					Endmenu()
					PlaysoundfxNow(131)

					startmenu(12)
					
					
				
			;	Case 3
			;		endmenu()
			;		PlaySoundfxnow(131)
			;		Startmenu(14)
			;		OldPlayerCharacterName$=".."
			;		OldPlayerCharacterName2$=PlayerCharacterName$
				Case 3
					PlaysoundfxNow(130)

					Keyboardmode=3-Keyboardmode
					endmenu()
					Startmenu(18)
				Case 4
				
					; sound
					GlobalSoundVolume2=(GlobalSoundVolume2+1) Mod 6
					GlobalSoundVolume=Float(globalsoundvolume2)*0.2
					MenuText$(18,4)="Sound Volume: "+GlobalSoundVolume2
					PlaysoundfxNow(130)


				Case 5
					; music
					GlobalMusicVolume2=(GlobalMusicVolume2+1) Mod 6
					GlobalMusicVolume=Float(globalMusicvolume2)*0.2
					MenuText$(18,5)="Music Volume: "+GlobalMusicVolume2
					If ChannelPlaying(musicchannel)=1
						StopChannel(musicchannel)
					EndIf
					If globalmusicvolume2>0
						MusicChannel=PlayMusic ("data\music\1.ogg")
						ChannelVolume MusicChannel,GlobalMusicVolume
						currentmusic=1

					Else 
						currentmusic=-1
					EndIf
					PlaysoundfxNow(130)
					
				Case 6
					PlaysoundfxNow(132)

					endmenu()
					startmenu(11)
				End Select
			Case 19
				; exit to windows - are you sure
				Select currentmenuline
				Case 3
					; yes
					If FullVersion=True Or TrailerAlreadyPlayed=True
					
						End
					Else
						endmenu()
						startmenu(25)
						exitaftertrailer=True
					EndIf
				Case 4
					; no
					endmenu()
					PlaysoundfxNow(130)

					startmenu(11)
				End Select
				
			End Select
		
			MouseGameMode=-2
		EndIf
	EndIf


End Function

Function EndMenu()
	GameMode=OldGameMode
	IconHelpText$(9)="Open"
	CameraProjMode  camera,1

	
	If GameMode=8 And CurrentInterChange>=0
		surface=GetSurface(DialogBackGroundEntity,1)
		VertexCoords surface,0,-2,1.3,5
		VertexCoords surface,1,2,1.3,5
		VertexCoords surface,2,-2,-0.5-(NofInterChangeReplies(CurrentInterChange)-1)*0.16,5
		VertexCoords surface,3,2,-0.5-(NofInterChangeReplies(CurrentInterChange)-1)*0.16,5
		DialogTimer=1000
	EndIf
	

	For i=0 To 10
		If titlemenuentity(i)>0
			FreeEntity titlemenuentity(i)
			
			titlemenuentity(i)=0
		EndIf
		If titlemenutexture(i)>0
			FreeTexture titlemenutexture(i)
			
			titlemenutexture(i)=0
		EndIf

	Next
	For i=11 To 30
		If titlemenuentity(i)>0
			FreeEntity titlemenuentity(i)
			titlemenuentity(i)=0
		EndIf

	Next
	
	HideEntity TitleMenuEntity(60)
	For i=80 To 99
		HideEntity TitleMenuEntity(i)
	Next

	If currentmenu>=10 And currentmenu<>24	endlevel()
	
	For i=0 To 9
		HideEntity SaveSlotEntity(i)
	Next

	
End Function

Function UpdateTitleMenu()
	
	leveltimer=leveltimer+1
	controlparticles()
	controlobjects()
	TranslateEntity titlemenuentity(0),0.01,0.03,0.02,0
	If menutimer<1000 Then
		If menutimer<100 Then
			AmbientLight leveltimer,leveltimer,leveltimer
			LightColor levellight,leveltimer*1.55,leveltimer*1.55,leveltimer*1.55
		End If
		For x=11 To 30
			PositionEntity titlemenuentity(x),5.0*Sin(x*72*x Mod 360),((-(x*17 Mod 10))/5.0-2.5)-(x/45.0)+(3*menutimer/1000.0),(menutimer-(x*30))*0.2,0
			TurnEntity titlemenuentity(x),0.0,2.0,0.0,0
		Next
	Else If menutimer<1100 Then
		For x=11 To 30
			EntityAlpha titlemenuentity(x),(1100-menutimer)/100.0
			PositionEntity titlemenuentity(x),5.0*Sin(x*72*x Mod 360),((Float(menutimer-1000)/Float(x-9)-(x*17 Mod 10/5.0))-2.5)-(x/45.0)+(3*menutimer/1000.0),(menutimer-(x*30))*0.2,0
			TurnEntity titlemenuentity(x),0.0,2.0,0.0,0
		Next
	End If
	TurnEntity titlemenuentity(1),0.0,-0.2,0.0,0
	If menutimer<500 Then
		PositionEntity titlemenuentity(1),1.5-(2.35*(menutimer/500.0)),0.5+(0.6*(menutimer/500.0)),0.5+(4.5*(menutimer/500.0)),0
		EntityAlpha titlemenuentity(1),1.0
		EntityAlpha titlemenuentity(2),0.0
	Else If menutimer<700 Then
		EntityAlpha titlemenuentity(1),1.0-((menutimer-500)/300.0)
		EntityAlpha titlemenuentity(2),(menutimer-500)/300.0
	Else If menutimer<800 Then
		EntityAlpha titlemenuentity(1),1.0-((menutimer-500)/300.0)
		EntityAlpha titlemenuentity(2),(menutimer-500)/300.0
		displaytext("PRESENTS",21.0,7.5,0.8,1.25,(menutimer-700)/2+55,(menutimer-700)/2+55,(menutimer-700)/2+55)
	Else If menutimer<900 Then
		displaytext("PRESENTS",21.0,7.5,0.8,1.25,(menutimer-700)/2+55,(menutimer-700)/2+55,(menutimer-700)/2+55)
	Else If menutimer<1000 Then
		EntityAlpha titlemenuentity(2),(999-menutimer)/100.0
		displaytext("PRESENTS",21.0,7.5,0.8,1.25,1000-menutimer,1000-menutimer,1000-menutimer)
	Else If menutimer<1800 Then
		If Millisecs()-menutime>18200 Then
			If titlemenuflag<10 Then
				titlemenuflag=titlemenuflag+10
				EntityAlpha titlemenuentity(3),1.0
				For x=0 To 359
					v2#=Rnd(0.3,1.0)
					addparticle(18,EntityX(titlemenuentity(3),1),EntityY(titlemenuentity(3),1),EntityZ(titlemenuentity(3),1)-0.011,0.0,0.04,v2#*0.06*Sin(x),v2#*0.06*Cos(x),0.0,5.0,0.0003,(-v2#)*0.0011*Sin(x),(-v2#)*0.0011*Cos(x),0.0,75,3)
				Next
			End If
			If (menutimer>1340 And (menutimer<1700)) Then
				If Rand(0,100)<20 Then
					addparticle(Rand(16,23),EntityX(titlemenuentity(3),1)-(0.42000002*Cos((menutimer-1340)/2))+Rnd(-0.08,0.08),(EntityY(titlemenuentity(3),1)+Rnd(-0.08,0.08))-0.1+0.252*Sin((menutimer-1340)/2),EntityZ(titlemenuentity(3),1)-0.4,0.0,0.0001,0.0,0.0,0.0,Rand(-5,5),0.001,0.0,0.0,0.0,75,3)
				End If
			End If
		End If
	Else If menutimer<1900 Then
		EntityAlpha titlemenuentity(3),1.0-((menutimer-1800)/100.0)
	Else If menutimer<2000 Then
		CameraFogMode camera,1
		CameraClsColor camera,255.0,255.0,255.0
		CameraFogColor camera,255.0,255.0,255.0
		CameraFogRange camera,200-((menutimer-1900)*2),1000-((menutimer-1900)*10)
	Else If menutimer=2000 Then
		CameraRange camera,0.0,0.0
		HideEntity titlemenuentity(0)
		HideEntity titlemenuentity(1)
		loadlevel("Data\Adventures\Hub\1.wlv",0,1)
		createlevel()
		PositionEntity camera,10.0,2.0,-40.0,0
		TurnEntity camera,40.0,0.0,0.0,0
	Else If menutimer<3000 Then
		updatewater(10,20,10)
		CameraRange camera,0.1,100.0
		If menutimer<2255 Then
			AmbientLight menutimer-2000,menutimer-2000,menutimer-2000
		End If
		CameraFogRange camera,(menutimer-2000)/100.0,(menutimer-2000)/5.0
		PositionEntity camera,10.0+Sin((menutimer-2000)/6.0)*4.0,6.0,-40.0+0.01*(menutimer-2000),1
		TurnEntity camera,0.0,0.0,0.025*Sin((menutimer-1000)/2.0),0
		If menutimer>2800 Then
			TurnEntity camera,(-0.1)*Sin((menutimer-2700)/2),0.0,0.0,0
		End If
	Else If menutimer<3100 Then
		updatewater(10,20,10)
		PositionEntity camera,10.0+Sin((menutimer-2000)/6.0)*4.0,6.0,-40.0+0.01*(menutimer-2000),1
		CameraFogRange camera,25-((menutimer-3000)/4),100-(menutimer-3000)
	Else If menutimer=3100 Then
		endlevel()
		CameraRange camera,0.0,0.0
		AmbientLight 0.0,0.0,0.0
		loadlevel("Data\Adventures\Hub\2.wlv",0,1)
		createlevel()
		PositionEntity camera,25.0,1.5,-14.0,0
		RotateEntity camera,65.0,0.0,0.0,0
		TurnEntity camera,0.0,90.0,0.0,1
	Else If menutimer<3950 Then
		updatewater(20,24,10)
		CameraRange camera,0.1,100.0
		If menutimer<3355 Then
			AmbientLight menutimer-3100,menutimer-3100,menutimer-3100
		End If
		CameraFogRange camera,(menutimer-3100)/100.0,(menutimer-3100)/5.0
		TurnEntity camera,0.0,0.075,0.0,1
		If menutimer<3820 Then
			TurnEntity camera,(-0.1)*Cos((menutimer-3100)/8),0.0,0.0,0
		End If
	Else If menutimer<4050 Then
		updatewater(20,24,10)
		CameraFogRange camera,25-((menutimer-3950)/4),100-(menutimer-3950)
		TurnEntity camera,0.0,0.075,0.0,1
	Else If menutimer=4050 Then
		endlevel()
		CameraRange camera,0.0,0.0
		AmbientLight 0.0,0.0,0.0
		loadlevel("Data\Adventures\Hub\3.wlv",0,1)
		createlevel()
		PositionEntity camera,5.0,2.5,-40.0,0
		RotateEntity camera,15.0,0.0,0.0,0
		For y=0 To nofobjects-1
			If objectid(y)=1 Then
				titlemenupointat=y
			End If
		Next
	Else If menutimer<4800 Then
		If Millisecs()-menutime<10700 Then
			menutimer=4050
		End If
		updatewater(10,20,10)
		CameraRange camera,0.1,100.0
		If menutimer<4305 Then
			AmbientLight menutimer-4050,menutimer-4050,menutimer-4050
		End If
		CameraFogRange camera,(menutimer-4050)/30.0,(menutimer-4050)/1.0
		PositionEntity camera,7.0+Sin((menutimer-4050)/6.0)*3.0,2.5,-40.0+0.017*(menutimer-4050),1
		PointEntity camera,objectentity(titlemenupointat),0.0
	Else If menutimer<5500 Then
		PointEntity camera,objectentity(titlemenupointat),0.0
		updatewater(10,20,10)
		PositionEntity camera,7.0+Sin((menutimer-4050)/6.0)*3.0,2.5+(1.0-Cos((menutimer-4800)/8.0))*15.0,-40.0+0.017*(menutimer-4050),1
	Else If menutimer<5600 Then
		If Millisecs()-menutime>88000 Then
			menutimer=5600
		End If
		CameraFogRange camera,25-((menutimer-5500)/4),100-(menutimer-5500)
		PositionEntity camera,7.0+Sin((menutimer-4050)/6.0)*3.0,2.5+(1.0-Cos((menutimer-4800)/8.0))*15.0,-40.0+0.017*(menutimer-4050),1
		PointEntity camera,objectentity(titlemenupointat),0.0
	Else If menutimer<5700 Then
		If Millisecs()-menutime<88000 Then
			menutimer=5600
		End If
		CameraFogColor camera,255.0-(2.5*(menutimer-5600)),255.0-(2.5*(menutimer-5600)),255.0-(2.5*(menutimer-5600))
		CameraClsColor camera,255.0-(2.5*(menutimer-5600)),255.0-(2.5*(menutimer-5600)),255.0-(2.5*(menutimer-5600))
		If menutimer=5602 Then
			endlevel()
		End If
	Else If menutimer<5702 Then
		If Millisecs()-menutime<92000 Then
			menutimer=5700
		End If
	Else If menutimer=5702 Then
		PositionEntity camera,0.0,0.0,0.0,0
		RotateEntity camera,0.0,0.0,0.0,0
		ShowEntity titlemenuentity(0)
		PositionEntity titlemenuentity(0),0.0,-75.0,200.0,0
		EntityAlpha titlemenuentity(3),1.0
		CameraRange camera,0.1,300.0
		CameraFogRange camera,400.0,1000.0
		For x=0 To 359
			v2#=Rnd(0.3,1.0)
			addparticle(18,EntityX(titlemenuentity(3),1),EntityY(titlemenuentity(3),1),EntityZ(titlemenuentity(3),1)-0.011,0.0,0.04,v2#*0.06*Sin(x),v2#*0.06*Cos(x),0.0,5.0,0.0003,(-v2#)*0.0011*Sin(x),(-v2#)*0.0011*Cos(x),0.0,75,3)
		Next
	Else If menutimer<6000 Then
	Else If menutimer<7700 Then
		If menutimer<6360 Then
			If Rand(0,100)<10 Then
				addparticle(Rand(16,23),EntityX(titlemenuentity(3),1)-(0.42000002*Cos((menutimer-6000)/2))+Rnd(-0.08,0.08),(EntityY(titlemenuentity(3),1)+Rnd(-0.08,0.08))-0.1+0.252*Sin((menutimer-6000)/2),EntityZ(titlemenuentity(3),1)-0.4,0.0,0.0001,0.0,0.0,0.0,Rand(-5,5),0.001,0.0,0.0,0.0,150,3)
			End If
		End If
		If (menutimer>7000 And (menutimer<7360)) Then
			If Rand(0,100)<10 Then
				addparticle(Rand(16,23),EntityX(titlemenuentity(3),1)-(0.42000002*Cos((menutimer-7000)/2))+Rnd(-0.08,0.08),(EntityY(titlemenuentity(3),1)+Rnd(-0.08,0.08))-0.1+0.252*Sin((menutimer-7000)/2),EntityZ(titlemenuentity(3),1)-0.4,0.0,0.0001,0.0,0.0,0.0,Rand(-5,5),0.001,0.0,0.0,0.0,150,3)
			End If
		End If
		v4$=""
		If (menutimer>6200 And (menutimer<6500)) Then
			v4$="Design And Code"
			v5=6200
			v6$="PATRICK MAIDORN"
		End If
		If (menutimer>6500 And (menutimer<6800)) Then
			v4$="3D Visuals"
			v5=6500
			v6$="JAMES ABRAHAM"
		End If
		If (menutimer>6800 And (menutimer<7100)) Then
			v4$="Musical Score"
			v5=6800
			v6$="JONNE VALTONEN"
		End If
		If (menutimer>7100 And (menutimer<7400)) Then
			v4$="Software Development Consultant"
			v5=7100
			v6$="CLAIRE POLSTER"
		End If
		If (menutimer>7400 And (menutimer<7700)) Then
			v4$="Voice Talent"
			v5=7400
			v6$="STINKY, LOOF, QOOKIE, AND PEEGUE"
		End If
		v7#=0.0
		If v4$<>"" Then
			If (menutimer>v5 And (menutimer<v5+50)) Then
				v7#=(menutimer-v5)/50.0
				displaytext(v4$,(32-Len(v4$))/2.0,10.0,1.25,1.25,255.0*v7#,125.0*v7#,125.0*v7#)
			End If
			If (menutimer>=v5+50 And (menutimer<v5+100)) Then
				v7#=150.0
				displaytext(v4$,(32-Len(v4$))/2.0,10.0,1.25,1.25,255,125,125)
				v7#=((menutimer-v5)-50)/50.0
				displaytext(v6$,(32-Len(v6$))/2.0,11.0,1.25,1.25,255.0*v7#,200.0*v7#,0)
			End If
			If (menutimer>=v5+100 And (menutimer<v5+200)) Then
				v7#=150.0
				displaytext(v4$,(32-Len(v4$))/2.0,10.0,1.25,1.25,255,125,125)
				v7#=250.0
				displaytext(v6$,(32-Len(v6$))/2.0,11.0,1.25,1.25,255,200,0)
			End If
			If (menutimer>=v5+200 And (menutimer<v5+300)) Then
				v7#=((v5+300)-menutimer)/100.0
				displaytext(v4$,(32-Len(v4$))/2.0,10.0,1.25,1.25,255.0*v7#,125.0*v7#,125.0*v7#)
				displaytext(v6$,(32-Len(v6$))/2.0,11.0,1.25,1.25,255.0*v7#,200.0*v7#,0)
			End If
		End If
	Else If menutimer<7702 Then
		If Millisecs()-menutimer<125000 Then
			menutimer=7700
		End If
	Else If menutimer<8000 Then
		EntityAlpha titlemenuentity(3),1.0-((menutimer-7700)/300.0)
	Else If menutimer=9000 Then
		If ChannelPlaying(musicchannel)=0 Then
			musicchannel=PlayMusic("data\music\1.ogg")
			ChannelVolume musicchannel,globalmusicvolume
			currentmusic=1
		End If
		menutimer=0
		titlemenuflag=titlemenuflag-10
		PositionEntity titlemenuentity(1),-0.9,1.1,5.0,0
		ShowEntity titlemenuentity(1)
		menutime=Millisecs()
		For x=11 To 30
			EntityAlpha titlemenuentity(x),1.0
		Next
		leveltimer=0
	End If
End Function


Function UpdateCutScene1()
	
	LightColor spotlight,0.0,0.0,0.0
	leveltimer=leveltimer+1
	controlparticles()
	controlobjects()
	If menutimer<99 Then
		CameraFogMode camera,1
		CameraClsColor camera,0.0,0.0,0.0
		CameraFogColor camera,0.0,0.0,0.0
		CameraFogRange camera,200.0,1000.0
		PositionEntity camera,0.0,0.0,(-menutimer)*10,0
		If menutimer=97 Then
			CameraProjMode camera,0
		End If
		ChannelVolume musicchannel,(1.0-(menutimer/100.0))*globalmusicvolume
		currentmusic=0
	Else If menutimer=99 Then
		menutimer=3300
	Else If menutimer=100 Then
		FreeEntity titlemenuentity(0)
		titlemenuentity(0)=0
		loadlevel("Data\Adventures\Hub\4.wlv",0,1)
		createlevel()
		PositionEntity camera,6.0,2.0,-40.0,0
		TurnEntity camera,20.0,0.0,0.0,0
		AmbientLight 0.0,0.0,0.0
		StopChannel musicchannel
	Else If menutimer<900 Then
		If menutimer=102 Then
			CameraProjMode camera,1
		End If
		PositionEntity camera,6.0,2.0,-40.0+((menutimer-100)/100.0),0
		LightColor levellight,(menutimer-100)/8,(menutimer-100)/16,0.0
		updatewater(6,20,10)
	Else If menutimer<1600 Then
		PositionEntity camera,6.0,2.0,-40.0+((menutimer-100)/100.0),0
		LightColor levellight,(menutimer-900)*155/700+100,(menutimer-900)*205/700+50,(menutimer-900)*255/700
		updatewater(6,20,10)
		AmbientLight (menutimer-900)*255/1600,(menutimer-900)*255/1600,(menutimer-900)*255/1600
	Else If menutimer<2500 Then
		PositionEntity camera,14.0-(Cos((menutimer-1600)/10.0)*8.0),3.0+Sin((menutimer-1600)/5.0-90.0),-25.0+Sin((menutimer-1600)/10.0)*10.0,0
		RotateEntity camera,0.0,(-(menutimer-1600))/10.0,0.0,0
		TurnEntity camera,30.0+(Sin((menutimer-1600)/5.0-90.0))*10.0,0.0,0.0,0
	Else If menutimer<3200 Then
		PositionEntity camera,14.0-(Cos((menutimer-1600)/10.0)*4.0),4.0,-15.0,0
	Else If menutimer<3400 Then
		LightColor levellight,255.0-((menutimer-3200)*1.25),255.0-((menutimer-3200)*1.25),255.0-((menutimer-3200)*1.25)
		AmbientLight 100.0-((menutimer-3200)*0.5),100.0-((menutimer-3200)*0.5),100.0-((menutimer-3200)*0.5)
	Else If menutimer=3400 Then
		LightColor levellight,0.0,0.0,0.0
		AmbientLight 0.0,0.0,0.0
		endmenu()
		AmbientLight 255.0,255.0,255.0
		v1=CreateCube(camera)
		v2=myloadtexture("load.jpg",1)
		EntityTexture v1,v2,0,0
		PositionEntity v1,0.0,0.0,10.0,0
		RenderWorld 1.0
		Text gfxwidth*0.5,gfxheight*2/7,"...Loading...",1,0
		Text gfxwidth*0.5,gfxheight*2/3,"...Please Wait...",1,0
		Flip 1
		v3=ReadDir("Data\Adventures\Hub")
		Repeat
			v4$=NextFile(v3)
			If FileType("Data\Adventures\Hub\"+v4$)=1 Then
				CopyFile "Data\Adventures\Hub\"+v4$,globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+v4$
			End If
		Until v4$=""
		CloseDir v3
		loadplayer(globaldirname+"\Player Profiles\"+playername+"\Current\playerfile.wpf")
		starthublevel(-9,13,7)
		FreeTexture v2
		FreeEntity v1
	End If
End Function

Function UpdateCutScene2()
	
	LightColor spotlight,0.0,0.0,0.0
	leveltimer=leveltimer+1
	controlparticles()
	controlobjects()
	AmbientLight 255.0,255.0,255.0
	If menutimer>10 Then
		TurnEntity titlemenuentity(0),0.0,(-0.2)*Cos((leveltimer-10) Mod 360),0.0,0
	End If
	If menutimer<10 Then
		CameraFogMode camera,1
		CameraClsColor camera,0.0,0.0,0.0
		CameraFogColor camera,0.0,0.0,0.0
		CameraFogRange camera,200.0,1000.0
		PositionEntity camera,7.0,(-5.0)*(menutimer/100.0),-27.0,0
		CameraProjMode camera,0
		currentmusic=0
	Else If menutimer=10 Then
		If ChannelPlaying(musicchannel)=1 Then
			StopChannel musicchannel
		End If
		musicchannel=PlayMusic("data\music\5.ogg")
		ChannelVolume musicchannel,globalmusicvolume
		currentmusic=5
		loadlevel("Data\Adventures\Hub\5.wlv",0,1)
		createlevel()
		CameraProjMode camera,1
		titlemenuentity(0)=CopyMesh(starmesh,camera)
		EntityTexture titlemenuentity(0),wisptexture,0,0
		EntityFX titlemenuentity(0),1
		EntityOrder titlemenuentity(0),-1
		RotateEntity titlemenuentity(0),-110.0,60.0,0.0,0
		TranslateEntity titlemenuentity(0),-2.8,1.9,7.0,0
	Else If menutimer<2000 Then
		If menutimer<200 Then
		Else If menutimer<400 Then
			displaytext("'Let me tell you about a place",10.0,2.0,1.0,1.0,255,255,255)
		Else If menutimer<480 Then
			displaytext("'Let me tell you about a place",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" deep, ",10.0,3.0,1.0,1.0,255,255,255)
		Else If menutimer<560 Then
			displaytext("'Let me tell you about a place",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" deep, deep,",10.0,3.0,1.0,1.0,255,255,255)
		Else If menutimer<1000 Then
			displaytext("'Let me tell you about a place",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" deep, deep, deep inside The Void.'",10.0,3.0,1.0,1.0,255,255,255)
		Else If menutimer<1050 Then
		Else If menutimer<1250 Then
			displaytext("'It is a dark and cold place...",10.0,2.0,1.0,1.0,255,255,255)
		Else If menutimer<1500 Then
			displaytext("'It is a dark and cold place...",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" a place without colour or music",10.0,3.0,1.0,1.0,255,255,255)
		Else
			displaytext("'It is a dark and cold place...",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" a place without colour or music",10.0,3.0,1.0,1.0,255,255,255)
			displaytext(" on the other side of Wonderland.'",10.0,4.0,1.0,1.0,255,255,255)
		End If
		RotateEntity camera,60.0-(menutimer*60/2000.0),0.0,180.0,0
		PositionEntity camera,7.0,-4.0+(menutimer/400.0),-25.0,0
	Else If menutimer<2100 Then
		RotateEntity camera,(menutimer-2000.0)/200.0,0.0,180.0-((menutimer-2000.0)*180.0/100.0),0
		PositionEntity camera,7.0,-4.0+(menutimer/400.0),-25.0,0
	Else If menutimer<2190 Then
		PositionEntity camera,7.0,1.5+Sin(menutimer-2100),-25.0+Sin(menutimer-2100),0
		If menutimer<2145 Then
			displaytext("'There,",10.0,2.0,1.0,1.0,255,255,255)
		Else
			displaytext("'There, in the darkness and stillness,",10.0,2.0,1.0,1.0,255,255,255)
		End If
	Else If menutimer<4800 Then
		PositionEntity camera,7.0,2.5,-24.0+((menutimer-2190)/200.0),0
		If menutimer<2250 Then
			displaytext("'There, in the darkness and stillness,",10.0,2.0,1.0,1.0,255,255,255)
		Else If menutimer<2600 Then
			displaytext("'There, in the darkness and stillness,",10.0,2.0,1.0,1.0,255,255,255)
			displaytext("     live the seven Thwarts.'",10.0,3.0,1.0,1.0,255,255,255)
		Else If menutimer<2650 Then
		Else If menutimer<2800 Then
			displaytext("'The Thwarts are neither mean nor evil,",10.0,2.0,1.0,1.0,255,255,255)
		Else If menutimer<2900 Then
			displaytext("'The Thwarts are neither mean nor evil,",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" but they are jealous,",10.0,3.0,1.0,1.0,255,255,255)
		Else If menutimer<3200 Then
			displaytext("'The Thwarts are neither mean nor evil,",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" but they are jealous, and foolish!'",10.0,3.0,1.0,1.0,255,255,255)
		Else If menutimer<3250 Then
		Else If menutimer<3600 Then
			displaytext("'They are jealous of all the colour",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" and diversity in Wonderland,",10.0,3.0,1.0,1.0,255,255,255)
		Else If menutimer<4100 Then
			displaytext("'They are jealous of all the colour",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" and diversity in Wonderland,",10.0,3.0,1.0,1.0,255,255,255)
			displaytext(" and they have come to take it away!'",10.0,4.0,1.0,1.0,255,255,255)
		Else If menutimer<4150 Then
		Else If menutimer<4400 Then
			displaytext("'They want us all to be the same...",10.0,2.0,1.0,1.0,255,255,255)
		Else
			displaytext("'They want us all to be the same...",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" as drab and as dull as they are!",10.0,3.0,1.0,1.0,255,255,255)
		End If
	Else If menutimer<7200 Then
		If menutimer<5000 Then
			displaytext("'But what they don't know",10.0,2.0,1.0,1.0,255,255,255)
		Else If menutimer<5200 Then
			displaytext("'But what they don't know",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" is that colour is at the heart of",10.0,3.0,1.0,1.0,255,255,255)
			displaytext(" Wonderland,",10.0,4.0,1.0,1.0,255,255,255)
		Else If menutimer<5600 Then
			displaytext("'But what they don't know",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" is that colour is at the heart of",10.0,3.0,1.0,1.0,255,255,255)
			displaytext(" Wonderland, and without it all of",10.0,4.0,1.0,1.0,255,255,255)
			displaytext(" Wonderland will be destroyed!'",10.0,5.0,1.0,1.0,255,255,255)
		Else If menutimer<5650 Then
		Else If menutimer<5800 Then
			displaytext("'The only way to stop their plan",10.0,2.0,1.0,1.0,255,255,255)
		Else If menutimer<6300 Then
			displaytext("'The only way to stop their plan",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" is to find all seven shards of",10.0,3.0,1.0,1.0,255,255,255)
			displaytext(" the Rainbow Crystal.'",10.0,4.0,1.0,1.0,255,255,255)
		Else If menutimer<6350 Then
		Else If menutimer<6400 Then
			displaytext("'Once all seven shards are found,",10.0,2.0,1.0,1.0,255,255,255)
		Else If menutimer<7200 Then
			displaytext("'Once all seven shards are found,",10.0,2.0,1.0,1.0,255,255,255)
			displaytext(" The Void will be pushed back",10.0,3.0,1.0,1.0,255,255,255)
			displaytext(" and Wonderland will be saved.'",10.0,4.0,1.0,1.0,255,255,255)
		End If
		PositionEntity camera,24.0+((menutimer-4700)/800.0),4.0,-17.0,0
		RotateEntity camera,30.0,0.0,0.0,0
	Else If menutimer=7200 Then
		LightColor levellight,0.0,0.0,0.0
		AmbientLight 0.0,0.0,0.0
		endlevel()
		endmenu()
		starthublevel(-21,9,8)
	End If
End Function

Function UpdateCutScene3()
	
	LightColor spotlight,0.0,0.0,0.0
	leveltimer=leveltimer+1
	controlparticles()
	controlobjects()
	AmbientLight 255.0,255.0,255.0
	If menutimer<10 Then
		CameraFogMode camera,1
		CameraClsColor camera,255.0,255.0,255.0
		CameraFogColor camera,255.0,255.0,255.0
		CameraFogRange camera,100.0,200.0
		AmbientLight 255.0,255.0,255.0
		PositionEntity camera,13.0,5.0,-18.0,0
		RotateEntity camera,30.0,0.0,0.0,0
		currentmusic=0
	Else If menutimer=10 Then
		If ChannelPlaying(musicchannel)=1 Then
			StopChannel musicchannel
		End If
		musicchannel=PlayMusic("data\music\1.ogg")
		ChannelVolume musicchannel,globalmusicvolume
		currentmusic=1
	Else If menutimer<800 Then
		PositionEntity camera,13.5,5.0+(menutimer/200.0),(-18.0)-(menutimer/100.0),0
		RotateEntity camera,30.0+(menutimer/160.0),0.0,0.0,0
		If (((((((menutimer=250 Or (menutimer=400)) Or (menutimer=500)) Or (menutimer=585)) Or (menutimer=655)) Or (menutimer=710)) Or (menutimer=750)) Or (menutimer=775)) Then
			;v1=0
			For v1=0 To 359 Step 2
				v2#=Rnd(0.3,1.0)
				addparticle(Rand(16,23),13.5,0.5,-11.0,0.0,0.4,v2#*0.12*Sin(v1),0.0,v2#*0.12*Cos(v1),5.0,0.002,0.0,0.0,0.0,150,3)
				;v1=v1+2
			Next
			playsoundfxnow(81)
		End If
		If menutimer>750 Then
			CameraFogRange camera,0.0,52-(menutimer-750)
		End If
	Else If menutimer=800 Then
		endlevel()
		loadlevel("Data\Adventures\Hub\7.wlv",0,1)
		createlevel()
	Else If menutimer<1000 Then
		CameraFogRange camera,0.0,menutimer-800.0
		messagelinetimer=100
		messagelinetext1="And so ..."
		messagelinetext2=""
	Else If menutimer<1400 Then
		CameraFogMode camera,0
		messagelinetimer=100
		messagelinetext1="With a burst of light, the seven shards"
		messagelinetext2="have restored all colour to Wonderland."
		If menutimer>1380 Then
			messagelinetext1=" "
			messagelinetext2=" "
		End If
	Else If menutimer<1800 Then
		messagelinetimer=100
		messagelinetext1="The Thwarts' spell has been broken,"
		messagelinetext2="and The Void has been pushed back."
		If menutimer>1780 Then
			messagelinetext1=" "
			messagelinetext2=" "
		End If
	Else If menutimer<2200 Then
		messagelinetimer=100
		messagelinetext1="Peace and harmony can once again"
		messagelinetext2="return to Wonderland."
	Else If menutimer<2600 Then
		messagelinetimer=100
		messagelinetext1=" "
		messagelinetext2=" "
	Else If menutimer<3000 Then
		messagelinetimer=100
		messagelinetext1="But what about the Thwarts?"
		messagelinetext2=""
		RotateEntity camera,35.0+5.0*(menutimer-2600)/400.0,180.0*(menutimer-2600)/400.0,0.0,0
		PositionEntity camera,13.5,9.0,-26.0+((menutimer-2600)/100.0),0
		If menutimer>2950 Then
			messagelinetext1=" "
			messagelinetext2=" "
		End If
	Else If menutimer<3600 Then
		messagelinetimer=100
		messagelinetext1="Let's just say that their lives"
		messagelinetext2="have become a lot more colourful."
		PositionEntity camera,13.5,9.0+((menutimer-3000)/100.0),-26.0+((menutimer-2600)/100.0),0
		RotateEntity camera,35.0+5.0*(menutimer-2600)/400.0,180.0,0.0,0
		If menutimer>3560 Then
			messagelinetext1=" "
			messagelinetext2=" "
		End If
	Else If menutimer<4200 Then
		messagelinetimer=100
		messagelinetext1="They now understand that diversity"
		messagelinetext2="is not to be feared, but to be treasured..."
		If menutimer>4160 Then
			messagelinetext1=" "
			messagelinetext2=" "
		End If
	Else If menutimer<5000 Then
		messagelinetimer=100
		messagelinetext1="... and that making new friends"
		messagelinetext2="is the greatest treasure of all."
	Else If menutimer=5000 Then
		LightColor levellight,0.0,0.0,0.0
		AmbientLight 0.0,0.0,0.0
		endlevel()
		endmenu()
		starthublevel(-21,9,8)
	End If
End Function	


Function CreateSquare()

	m=CreateMesh(camera)
	s=CreateSurface(m)
	AddVertex (s,-.5,0,.5,0,0)
	AddVertex (s,.5,0,.5,1,0)
	AddVertex (s,-.5,0,-.5,0,1)
	AddVertex (s,.5,0,-.5,1,1)
	AddTriangle (s,0,1,2)
	AddTriangle (s,1,3,2)
	UpdateNormals m
	Return m

End Function	

Function StartCustomSelectMenu()

	GameMode=12
	CurrentMenu=100
	MenuTimer=0
	
	; camera/lights
	PositionEntity camera,0,0,0
	RotateEntity camera,0,0,0
	AmbientLight 255,255,255
	RotateEntity levellight,35,-35,0
	CameraFogMode camera,0
	CameraRange camera, 0.1,1000
	
	; music	
	If currentmusic<>1
		If globalmusicvolume2>0
			If ChannelPlaying(musicchannel)
				StopChannel musicchannel
			EndIf
			MusicChannel=PlayMusic ("data\music\1.ogg")
			ChannelVolume MusicChannel,GlobalMusicVolume

			currentmusic=1
		Else 
			currentmusic=-1
		EndIf
	EndIf
	
	; standard entities
	For i=80 To 99
		ShowEntity TitleMenuEntity(i)
	Next
	
	For i=0 To 79
		deleteicon(i)
	Next

	
	ShowEntity MouseCursor
	MouseCursorVisible=True

	
	CheckForNewCompiledLevels(True)
	
	
	
	; get levels
	If CustomCurrentArchive=0
		GetCurrentCustomLevels()
	Else
		GetArchiveCustomLevels()
	EndIf
	
	CustomLevelListSelected=-1
	


End Function

Function GetCurrentCustomLevels()
	
	CustomCurrentArchive=0
	NofCustomLevels=0
	dirfile=ReadDir (GlobalDirName$+"\Adventures\Current")
	Repeat
		CustomLevelListFileName$(NofCustomLevels)=""
		CustomLevelListName$(NofCustomLevels)=""
		CustomLevelListCreator$(NofCustomLevels)=""		
		CustomLevelListGems(NofCustomLevels)=0
		CustomLevelListGemsTotal(NofCustomLevels)=0
		CustomLevelListCoins(NofCustomLevels)=0
		CustomLevelListCoinsTotal(NofCustomLevels)=0
		CustomLevelListScore(NofCustomLevels)=0

		ex$=NextFile$(dirfile)
		If ex$<>"." And ex$<>".." And ex$<>"" And FileType(GlobalDirName$+"\Adventures\Current\"+ex$)=2
		
			file=ReadFile(GlobalDirName$+"\Adventures\Current\"+ex$+"\master.dat")
			If file>0
			
				CustomLevelListFileName$(NofCustomLevels)=ex$
				CustomLevelListName(NofCustomLevels)=ReadString(file)
				
				For int1=0 To 4
					ReadString(file)
				Next
				
				CustomLevelListCreator$(NofCustomLevels)=ReadString(file)
				If CustomLevelListCreator$(NofCustomLevels)="" Then CustomLevelListCreator$(NofCustomLevels)="(Unknown)"
				CloseFile(file)
				CustomLevelListCompleted(NofCustomLevels)=0
				file = ReadFile(globaldirname$+"\Adventures\Current\"+ex$+"\"+playername$+".score")
				If file>0 Then
					ReadInt(file)
					ReadInt(file)
					CustomLevelListGems(NofCustomLevels)=ReadInt(file)
					CustomLevelListGemsTotal(NofCustomLevels)=ReadInt(file)
					CustomLevelListCoins(NofCustomLevels)=ReadInt(file)
					CustomLevelListCoinsTotal(NofCustomLevels)=ReadInt(file)
					CustomLevelListScore(NofCustomLevels)=ReadInt(file)
					CloseFile(file)
					
					CustomLevelListCompleted(NofCustomLevels)=1
					If (CustomLevelListCoinsTotal(NofCustomLevels)=CustomLevelListCoins(NofCustomLevels) And (CustomLevelListGemsTotal(NofCustomLevels)=CustomLevelListGems(NofCustomLevels))) Then CustomLevelListCompleted(NofCustomLevels)=2
				EndIf
				NofCustomLevels=NofCustomLevels+1
			EndIf
		EndIf
	Until ex$=""
	CloseDir dirfile
		

End Function

Function GetArchiveCustomLevels()
	
End Function


Function CustomSelectMenu()

	menutimer=menutimer+1
	If MouseDown(1)=False And MouseDown(2)=False 
		MouseGameMode=-1
	EndIf
	
	PositionTexture TitleMenuTexture(80),-(menutimer Mod 2500)/2500.0,(menutimer Mod 5000)/5000.0
	
	PositionEntity MouseCursor,-10+20*Float(MouseX())/Float(GFXWidth),7.5-15*Float(MouseY())/Float(GfxHeight),20


	For i=81 To 99
		; move stars
		TranslateEntity TitleMenuEntity(i),-(Float(i)/10000.0),-(Float(i*2)/10000.0),0
		If EntityX(TitleMenuEntity(i))<-14 Or EntityY(TitleMenuEntity(i))<-14
			FreeEntity TitleMenuEntity(i)
			
			titlemenuentity(i)=CopyEntity(starmesh)
			RotateEntity Titlemenuentity(i),-90,0,0
			EntityFX titlemenuentity(i),1
			PositionEntity titlemenuentity(i),Rnd(-10,20),14,Rnd(20,30)

		EndIf
		TurnEntity TitleMenuEntity(i),0,1,0
	Next
	DisplayText("Select A Custom Adventure:",25-13,0.7,1,1,255,255,0)
	DisplayText("Adventure Name                         Creator            Complete",1,3,0.7,1,255,255,0)
	DisplayText("-----------------------------------------------------------------------",0,3.6,0.7,1,255,255,0)
	
	For i=0 To 14
		If CustomLevelListName$(i+CustomLevelListStart)<>""
			col1=200
			col2=200
			shiver#=0.0
			If CustomLevelListSelected=-1
				; selecting level
				If MouseY()>=(90.0+i*26.5)*gfxheight/600.0 And MouseY()<(90.0+(i+1)*26.5)*gfxheight/600.0 And MouseX()<750*Gfxwidth/800.0
					col1=255
					col2=150
					shiver#=0.2
				EndIf
			Else If CustomLevelListSelected=i+CustomLevelListStart
				; in play/delete phase
				col1=255
				col2=255
				shiver#=0.0

			EndIf
			DisplayText(CustomLevelListName$(i+CustomLevelListStart),1+shiver*Sin(menutimer Mod 360),4.5+shiver*Cos(menutimer Mod 360)+i*1.5,0.7,1,col1,col1,col2)
			DisplayText(CustomLevelListCreator$(i+CustomLevelListStart),40+shiver*Sin(menutimer Mod 360),4.5+shiver*Cos(menutimer Mod 360)+i*1.5,0.7,1,col1,col1,col2)
			Select CustomLevelListCompleted(i+CustomLevelListStart)
			Case 0
				DisplayText("NO",62+shiver*Sin(menutimer Mod 360),4.5+shiver*Cos(menutimer Mod 360)+i*1.5,0.7,1,255,100,100)
			Case 1
				DisplayText("YES",61.5+shiver*Sin(menutimer Mod 360),4.5+shiver*Cos(menutimer Mod 360)+i*1.5,0.7,1,0,255,0)
			Case 2
				DisplayText("GOLD",61+shiver*Sin(menutimer Mod 360),4.5+shiver*Cos(menutimer Mod 360)+i*1.5,0.7,1,255,255,0)
			End Select
		EndIf
					
	Next
	
	If NofCustomLevels>15

		For i=0 To 14
			DisplayText(":  :",67,4.5+i*1.5,0.7,1,255,255,0)
			
		Next
		If MouseX()>750*Gfxwidth/800.0 And MouseY()>82*gfxheight/600.0 And MouseY()<142*gfxheight/600.0
			DisplayText("Pg",68+0.1*Sin(menutimer Mod 360),4.5+0.1*Cos(menutimer Mod 360),0.7,1,255,255,155)
			DisplayText("Up",68+0.1*Sin(menutimer Mod 360),6+0.1*Cos(menutimer Mod 360),0.7,1,255,255,155)
		Else
			DisplayText("Pg",68,4.5,0.7,1,200,200,200)
			DisplayText("Up",68,6,0.7,1,200,200,200)
		EndIf		
		DisplayText("--",68,6.9,0.7,1,255,255,0)
		DisplayText("--",68,23.1,0.7,1,255,255,0)
		If MouseX()>750*Gfxwidth/800.0 And MouseY()>422*gfxheight/600.0 And MouseY()<482*gfxheight/600.0
			DisplayText("Pg",68+0.1*Sin(menutimer Mod 360),24+0.1*Cos(menutimer Mod 360),0.7,1,255,255,155)
			DisplayText("Dn",68+0.1*Sin(menutimer Mod 360),25.5+0.1*Cos(menutimer Mod 360),0.7,1,255,255,155)
		Else
			DisplayText("Pg",68,24,0.7,1,200,200,200)
			DisplayText("Dn",68,25.5,0.7,1,200,200,200)
		EndIf	
	
	EndIf
		
	DisplayText("-----------------------------------------------------------------------",0,26.3,0.7,1,255,255,0)
	
	If CustomLevelListSelected>=0
		DisplayText(CustomLevelListName$(CustomLevelListSelected),25-0.5*Len(CustomLevelListName$(CustomLevelListSelected)),19.3,1,1,255,255,255)
		
		If CustomLevelListCompleted(CustomLevelListSelected)=0
			b$="This Adventure Has Not Been Completed."
		Else
			b$="Score: "+CustomLevelListScore(CustomLevelListSelected)+"  Gems: "+CustomLevelListGems(CustomLevelListSelected)+" of "+CustomLevelListGemsTotal(CustomLevelListSelected)+"  Coins: "+CustomLevelListCoins(CustomLevelListSelected)+" of "+CustomLevelListCoinsTotal(CustomLevelListSelected)
		EndIf
		DisplayText(b$,25-0.5*Len(b$),20.3,1,1,255,255,255)
		
		If MouseY()>540*gfxheight/600.0 And MouseX()>150*Gfxwidth/800.0 And MouseX()<270*Gfxwidth/800.0
			DisplayText("> PLAY <",8.5+0.1*Sin(menutimer Mod 360),22+0.1*Cos(menutimer Mod 360),1,1,255,255,100)
		Else
			DisplayText(" PLAY ",9.5,22,1,1,200,200,200)
		EndIf
		
		If MouseY()>540*gfxheight/600.0 And MouseX()>340*Gfxwidth/800.0 And MouseX()<460*Gfxwidth/800.0
			DisplayText(">CANCEL<",21+.1*Sin(menutimer Mod 360),22+0.1*Cos(menutimer Mod 360),1,1,255,255,100)
		Else
			DisplayText("CANCEL",22,22,1,1,200,200,200)
		EndIf
		
		If MouseY()>540*gfxheight/600.0 And MouseX()>540*Gfxwidth/800.0 And MouseX()<660*Gfxwidth/800.0
			DisplayText(">DELETE<",33.5+.1*Sin(menutimer Mod 360),22+0.1*Cos(menutimer Mod 360),1,1,255,255,100)
		Else
			DisplayText("DELETE",34.5,22,1,1,200,200,200)
		EndIf
		
	Else
		If MouseY()>540*gfxheight/600.0 And MouseX()>360*Gfxwidth/800.0 And MouseX()<460*Gfxwidth/800.0
			DisplayText(" >EXIT<",21+0.1*Sin(menutimer Mod 360),22+0.1*Cos(menutimer Mod 360),1,1,255,255,100)
		Else
			DisplayText(" EXIT",22,22,1,1,200,200,200)
		EndIf

		

	EndIf

	If MouseDown(1) And MouseGameMode=-1
		MouseGameMode=2
		
		For i=0 To 14
			If MouseY()>=(90.0+i*26.5)*gfxheight/600.0 And MouseY()<(90.0+(i+1)*26.5)*gfxheight/600.0 And MouseX()<750*Gfxwidth/800.0
				If CustomLevelListName$(i)<>"" Then CustomLevellistselected=i+CustomLevelListStart
				PlaysoundfxNow(130)
			EndIf
		Next
		
			
		If Customlevellistselected>=0
			If MouseY()>540*gfxheight/600.0 And MouseX()>150*Gfxwidth/800.0 And MouseX()<270*Gfxwidth/800.0
				;play
				PlaysoundfxNow(131)
				EndCustomSelectMenu()
				b$=globaldirname$+"\adventures\"
				
				If CustomCurrentArchive=0
					b$=b$+"current\"
				Else
					b$=b$+"archive\"
				End If
			
				
				StartAdventure(b$+CustomLevelListFileName$(customlevellistselected),2,0)
			EndIf
		
			If MouseY()>540*gfxheight/600.0 And MouseX()>340*Gfxwidth/800.0 And MouseX()<460*Gfxwidth/800.0
				PlaysoundfxNow(132)
				;cancel
				CustomLevelListselected=-1
			EndIf

			
			If MouseY()>540*gfxheight/600.0 And MouseX()>540*Gfxwidth/800.0 And MouseX()<660*Gfxwidth/800.0
				;delete
				PlaysoundfxNow(135)
				StartCustomDeleteMenu()
			
			EndIf
		Else
		
			If MouseY()>540*gfxheight/600.0 And MouseX()>360*Gfxwidth/800.0 And MouseX()<460*Gfxwidth/800.0

				;exit
				PlaysoundfxNow(132)
				EndCustomSelectMenu()
				StartMenu(11)
				
			EndIf

		
		EndIf
		
		If MouseX()>750*Gfxwidth/800.0 And MouseY()>82*gfxheight/600.0 And MouseY()<142*gfxheight/600.0
			CustomLevelListStart=CustomLevelListStart-15
			PlaysoundfxNow(130)
			
		EndIf
		If MouseX()>750*Gfxwidth/800.0 And MouseY()>422*gfxheight/600.0 And MouseY()<482*gfxheight/600.0
			CustomLevelListStart=CustomLevelListStart+15
			PlaysoundfxNow(130)
			
		EndIf
	EndIf
		
	If CustomLevelListStart>NofCustomLevels-15 Then CustomLevelListStart=NofCustomLevels-15
	If CustomLevelListStart<0 Then CustomLevelListStart=0
	
	; refresh with f12
	If KeyDown(88) 
		StartCustomSelectMenu()
		PlaysoundfxNow(130)
	EndIf		

	
		
;	displaytext nofcustomlevels,0,0,1,1,255,255,255		


End Function

Function EndCustomSelectMenu()
	For i=80 To 99
		HideEntity TitleMenuEntity(i)
	Next
End Function

Function StartCustomDeleteMenu()
	CurrentMenu=101
	
	
End Function

Function CustomDeleteMenu()

	menutimer=menutimer+1
	If MouseDown(1)=False And MouseDown(2)=False 
		MouseGameMode=-1
	EndIf
	
	PositionEntity MouseCursor,-10+20*Float(MouseX())/Float(GFXWidth),7.5-15*Float(MouseY())/Float(GfxHeight),20

	For i=81 To 99
		; move stars
		TranslateEntity TitleMenuEntity(i),-(Float(i)/10000.0),-(Float(i*2)/10000.0),0
		If EntityX(TitleMenuEntity(i))<-14 Or EntityY(TitleMenuEntity(i))<-14
			FreeEntity TitleMenuEntity(i)
			
			titlemenuentity(i)=CopyEntity(starmesh)
			RotateEntity Titlemenuentity(i),-90,0,0
			EntityFX titlemenuentity(i),1
			PositionEntity titlemenuentity(i),Rnd(-10,20),14,Rnd(20,30)

		EndIf
		TurnEntity TitleMenuEntity(i),0,1,0
	Next
	
	b$="Delete Custom Adventure?"
	DisplayText(b$,25-0.5*Len(b$),4.5,1,1,255,255,0)
	b$="------------------------"
	DisplayText(b$,25-0.5*Len(b$),5.3,1,1,255,255,0)

	b$=CustomLevelListName$(CustomLevelListSelected)
	DisplayText(b$,25-0.5*Len(b$),7.5,1,1,255,255,255)
	b$="by"
	DisplayText(b$,25-0.5*Len(b$),8.45,1,1,255,255,0)
	b$=CustomLevelListCreator$(CustomLevelListSelected)
	DisplayText(b$,25-0.5*Len(b$),9.5,1,1,255,255,255)
	
	b$="Please Confirm:"
	DisplayText(b$,25-0.5*Len(b$),12,1,1,255,255,0)
	b$="Yes, Delete This Adventure"
	If MouseY()>340*GfxHeight/600.0 And MouseY()<370*GfxHeight/600.0
		DisplayText(">"+b$+"<",24-0.5*Len(b$)+0.1*Sin(menutimer Mod 360),13.5+0.1*Cos(menutimer Mod 360),1,1,255,255,100)
	Else
		DisplayText(b$,25-0.5*Len(b$),13.5,1,1,200,200,200)
	EndIf
	b$="No, Keep This Adventure"
	If MouseY()>370*GfxHeight/600.0 And MouseY()<405*GfxHeight/600.0
		DisplayText(">"+b$+"<",24-0.5*Len(b$)+0.1*Sin(menutimer Mod 360),15+0.1*Cos(menutimer Mod 360),1,1,255,255,100)
	Else
		DisplayText(b$,25-0.5*Len(b$),15,1,1,200,200,200)
	EndIf


	If MouseDown(1) And MouseGameMode=-1
		MouseGameMode=2
	
		If MouseY()>340*GfxHeight/600.0 And MouseY()<370*GfxHeight/600.0
			PlaysoundfxNow(132)
			dirfile=ReadDir(GlobalDirName$+"\Adventures\Current\"+CustomLevelListFileName$(CustomLevelListSelected))
			Repeat
				ex2$=NextFile$(dirfile)
				If ex2$<>"" And ex2$<>"." And ex2$<>".."
					DeleteFile GlobalDirName$+"\Adventures\Current\"+CustomLevelListFileName$(CustomLevelListSelected)+"\"+ex2$
				EndIf
			Until ex2$=""
			CloseDir dirfile
			DeleteDir GlobalDirName$+"\Adventures\Current\"+CustomLevelListFileName$(CustomLevelListSelected)
			StartCustomSelectMenu()

		EndIf
	
		If MouseY()>370*GfxHeight/600.0 And MouseY()<405*GfxHeight/600.0
			PlaysoundfxNow(130)
			CurrentMenu=100
			CustomLevelListSelected=-1
		EndIf

	EndIf
	


	


	
;	displaytext MouseX()+" "+MouseY(),0,0,1,1,255,255,255		


End Function

Function StartWAEditorTitleMenu()
	CurrentMenu=102
	
	GameMode=12
	

	; camera/lights
	PositionEntity camera,0,0,0
	RotateEntity camera,0,0,0
	AmbientLight 255,255,255
	RotateEntity levellight,35,-35,0
	CameraFogMode camera,0
	CameraRange camera, 0.1,1000
	
	; music	
	If currentmusic<>1
		If globalmusicvolume2>0
			If ChannelPlaying(musicchannel)
				StopChannel musicchannel
			EndIf
			MusicChannel=PlayMusic ("data\music\1.ogg")
			ChannelVolume MusicChannel,GlobalMusicVolume
			currentmusic=1

		Else 
			currentmusic=-1
		EndIf
	EndIf
	
	; standard entities
	For i=60 To 61
		ShowEntity TitleMenuEntity(i)
	Next
	For i=80 To 99
		ShowEntity TitleMenuEntity(i)
	Next
	
	For i=0 To 79
		deleteicon(i)
	Next

	
	ShowEntity MouseCursor
	MouseCursorVisible=True

		
	
End Function

Function WAEditorTitleMenu()

	menutimer=menutimer+1
	If MouseDown(1)=False And MouseDown(2)=False 
		MouseGameMode=-1
	EndIf
	
	PositionTexture TitleMenuTexture(80),-(menutimer Mod 2500)/2500.0,(menutimer Mod 5000)/5000.0
	
	
	PositionEntity MouseCursor,-10+20*Float(MouseX())/Float(GFXWidth),7.5-15*Float(MouseY())/Float(GfxHeight),20

	For i=81 To 99
		; move stars
		TranslateEntity TitleMenuEntity(i),-(Float(i)/10000.0),-(Float(i*2)/10000.0),0
		If EntityX(TitleMenuEntity(i))<-14 Or EntityY(TitleMenuEntity(i))<-14
			FreeEntity TitleMenuEntity(i)
			
			titlemenuentity(i)=CopyEntity(starmesh)
			RotateEntity Titlemenuentity(i),-90,0,0
			EntityFX titlemenuentity(i),1
			PositionEntity titlemenuentity(i),Rnd(-10,20),14,Rnd(20,30)

		EndIf
		TurnEntity TitleMenuEntity(i),0,1,0
	Next
	; move signs
	RotateEntity TitleMenuEntity(60),-90,0,0
	TurnEntity TitleMenuEntity(60),-0,5*Sin(menutimer Mod 360),0
	For i=0 To 3
		RotateEntity titlemenuentity(61+i),0,(12+(i Mod 2)*4)*Sin((((0.4+(i Mod 3)/6.0)*menutimer+i*70)) Mod 360),0
	Next

	b$="@ 2008 Midnight Synergy"
	DisplayText(b$,50-0.5*Len(b$),43,0.5,1,255,255,0)
	b$="www.midnightsynergy.com"
	DisplayText(b$,50-0.5*Len(b$),44.5,0.5,1,255,255,0)

	

End Function

Function EndWAEditorTitleMenu()
	
	For x=60 To 61
		HideEntity TitleMenuEntity(x)
	Next
	For x=80 To 99
		HideEntity TitleMenuEntity(x)
	Next
End Function

.expired
Data "THIS EDITOR VERSION HAS EXPIRED."
Data "PLEASE VISIT WWW.MIDNIGHTSYNERGY.COM"
Data "FOR UPDATE INFORMATION."

.SpellData
Data "Power", "Activate"
Data "Ice", "Activate"
Data "Fire", "Activate"
Data "Time", "Activate"

.CharmData
Data "Vision","Remove"
Data "Light","Detect"