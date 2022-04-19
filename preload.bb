

Function PreLoadModels()

	; Setup PreLoad Models
	
	; The LevelCursor
	LevelCursor=CreateMesh()
	surface=CreateSurface(LevelCursor)
	AddVertex (surface,-.5,0,.5,0,0)
	AddVertex (surface,.5,0,.5,0.25,0)
	AddVertex (surface,-.5,0,-.5,0,0.25)
	AddVertex (surface,.5,0,-.5,0.25,0.25)
	AddTriangle (surface,0,1,2)
	AddTriangle (surface,2,1,3)
	UpdateNormals LevelCursor
	EntityAlpha LevelCursor,.5
	EntityOrder LevelCursor,-50
	LevelCursorTexture=myLoadTexture("data\graphics\cursors.bmp",4)
	EntityTexture LevelCursor,LevelCursorTexture
	
	
	
	; The MouseCursor
	MouseCursor=CreateMesh(camera)
	surface=CreateSurface(MouseCursor)
	AddVertex (surface,-1,1,0,.75,0)
	AddVertex (surface,1,1,0,1,0)
	AddVertex (surface,-1,-1,0,.75,0.25)
	AddVertex (surface,1,-1,0,1,0.25)
	AddTriangle (surface,0,1,2)
	AddTriangle (surface,2,1,3)
	UpdateNormals MouseCursor
	EntityAlpha MouseCursor,.8
	EntityOrder MouseCursor,-51
	EntityFX MouseCursor,1
	EntityTexture MouseCursor,LevelCursorTexture
	
	
	
	IcontextureStandard=myLoadTexture("data\graphics\icons-standard.bmp",4)
	IconTextureCustom=myLoadTexture("data\graphics\icons-custom.bmp",4)

	
	
	

	; Particles
	ParticleTexture=myLoadTexture("data\graphics\particles.bmp",1)
		
	
	; Stinker
	StinkerMesh=myLoadAnimMesh("data/models/stinker/body.b3d",0)
	UpdateNormals GetChild(StinkerMesh,3)
	ExtractAnimSeq GetChild(StinkerMesh,3),1,20		; 1 - waddle, speed .2
	ExtractAnimSeq GetChild(StinkerMesh,3),21,40	; 2 - walk, speed .2
	ExtractAnimSeq GetChild(StinkerMesh,3),41,60	; 3 - run, speed .2
	ExtractAnimSeq GetChild(StinkerMesh,3),61,100	; 4 - spell, speed .2
	ExtractAnimSeq GetChild(StinkerMesh,3),61,80	; 5 - spell on, speed .2
	ExtractAnimSeq GetChild(StinkerMesh,3),80,84	; 6 - spell hold, speed .2
	ExtractAnimSeq GetChild(StinkerMesh,3),84,100	; 7 - spell off, speed .2
	ExtractAnimSeq GetChild(StinkerMesh,3),101,120	; 8 - wave, speed .2
	ExtractAnimSeq GetChild(StinkerMesh,3),121,140	; 9 - foottap, speed .15
	ExtractAnimSeq GetChild(StinkerMesh,3),141,160	; 10 - idle, speed .05
	ExtractAnimSeq GetChild(StinkerMesh,3),161,180	; 11 - death, speed .2
	ExtractAnimSeq GetChild(StinkerMesh,3),181,200	; 12 - dance, speed .2
	ExtractAnimSeq GetChild(StinkerMesh,3),201,220	; 13 - sit, speed .2
	ExtractAnimSeq GetChild(StinkerMesh,3),201,218	; 14 - sit, speed not too far back .2
	ExtractAnimSeq GetChild(StinkerMesh,3),108,114	; 15 - constant wave, speed .2
	ExtractAnimSeq GetChild(StinkerMesh,3),221,240	; 16 - use
	ExtractAnimSeq GetChild(StinkerMesh,3),201,220	; 17 - sit, again (for backwards eg after ice)

	HideEntity StinkerMesh
	
	StinkerSmokedTexture=myLoadTexture("data/models/stinker/bodysmoked.jpg",1)
	
	For tex=1 To 4
		For j=0 To 4
			StinkerTexture(tex,j)=MyLoadTexture("data/models/stinker/body00"+Str$(tex)+Chr$(65+j)+".jpg",1)
		Next
	Next

	
	
	; StinkerWee
	StinkerWeeMesh=myLoadMD2("data/models/stinkerwee/stinkerwee.md2")
	StinkerWeeTexture=MyLoadTexture("data/models/stinkerwee/stinkerwee.jpg",1)
	StinkerWeeTextureSleep=MyLoadTexture("data/models/stinkerwee/stinkerweesleep.jpg",1)
	StinkerWeeTextureSad=MyLoadTexture("data/models/stinkerwee/stinkerweesad.jpg",1)
	;EntityShininess StinkerWeeMesh,1
	EntityTexture StinkerWeeMesh,StinkerWeeTextureSleep
	HideEntity StinkerWeeMesh

	; Cages
	CageMesh=myLoadMesh("data/models/cage/cage.3ds",0)
	RotateMesh CageMesh,-90,0,0
	CageTexture=myLoadTexture("data/models/cage/cage.jpg",1)
	EntityTexture CageMesh,CageTexture
	HideEntity CageMesh
	
	; StarGate
	StarGateMesh=myLoadMesh("data/models/gate/gate.3ds",0)
	RotateMesh StarGateMesh,-90,0,0
	HideEntity StarGateMesh
	; AutoDoor
	AutodoorMesh=CreateCube()
	ScaleMesh autodoormesh,.47,.47,.47
	PositionMesh Autodoormesh,0,.5,0
	Autodoortexture=MyLoadTexture("data/models/autodoor/autodoor.jpg",1)
	EntityTexture Autodoormesh,autodoortexture
	HideEntity autodoormesh
	; Teleporters
	For i=0 To 8
		TeleporterTexture(i)=myLoadTexture("data/models/teleport/teleport"+Str$(i)+".jpg",1)
	Next
	
	; Scritters
	ScritterMesh=myLoadMesh("data/models/scritter/scritter.3ds",0)
	RotateMesh ScritterMesh,-90,0,0
	ScritterTexture=myLoadTexture("data/models/scritter/scritter.jpg",1)
	EntityTexture ScritterMesh,ScritterTexture
	HideEntity ScritterMesh
	
	; Stepping Stones
	For i=0 To 3
		SteppingStoneTexture(i)=myLoadTexture("data\models\bridges\bridge"+i+".jpg",1)
	Next
	
	; Waterfall
	WaterFallTexture=myLoadTexture("data\leveltextures\waterfall.jpg",1)
	WaterFallMesh=CreateWaterFallMesh()
	HideEntity WaterFallMesh

	; Star
	StarMesh=myLoadMesh("data\models\star\star.3ds",0)
	GoldStarTexture=myLoadTexture("data\models\star\goldstar.jpg",1)
	
	WispTexture=MyLoadTexture("data\models\star\wisp.bmp",1)
	EntityTexture StarMesh,GoldStarTexture
	HideEntity StarMesh

	
	; Coin
	CoinMesh=myLoadMesh("data\models\coin\coin.3ds",0)
	GoldCoinTexture=myLoadTexture("data\models\coin\coin.jpg",1)
	TokenCoinTexture=myLoadTexture("data\models\coin\token.jpg",1)
	EntityTexture CoinMesh,GoldCoinTexture
	HideEntity CoinMesh
	
	; Key
	KeyMesh=myLoadMesh("data\models\keys\key.3ds",0)
	HideEntity KeyMesh
	
	; Signs
	For i=0 To 3
		SignMesh(i)=myLoadMesh("data\models\sign\sign"+Str$(i)+".3ds",0)
		HideEntity SignMesh(i)
		SignTexture(i)=myLoadTexture("data\models\sign\sign"+Str$(i)+".jpg",1)

	Next
	
	
	; Houses
	For i=0 To 2
		DoorTexture(i)=myLoadTexture("data\models\houses\door"+Str$(i)+".png",1)
	Next
	For i=0 To 1
		CottageTexture(i)=myLoadTexture("data\models\houses\cottage"+Str$(i)+".png",4)
	Next
	For i=0 To 1
		HouseTexture(i)=myLoadTexture("data\models\houses\townhouse"+Str$(i)+".png",4)
		If i=0 Then exa1=HouseTexture(i)
		If i=1 Then exa2=HouseTexture(i)

	Next
	For i=0 To 0
		WindmillTexture(i)=myLoadTexture("data\models\houses\windmill"+Str$(i)+".png",4)
	Next
	For i=0 To 0
		FenceTexture(i)=myLoadTexture("data\models\houses\fence"+Str$(i)+".png",4)
	Next

	
	; Shadows
	For i=0 To 0
		ShadowTexture(i)=myLoadTexture("data\graphics\shadow"+Str$(i)+".bmp",1)
	Next
	
	
	; Gems
	For i=0 To 2
		GemMesh(i)=myLoadMesh("data\models\gems\gem"+Str$(i)+".3ds",0)
		HideEntity GemMesh(i)
	Next
	
	; Turtles
	TurtleMesh=myLoadMD2("data\models\turtle\dragonturtle.md2")
	TurtleTexture=myLoadTexture("data\models\turtle\dragonturtle2.png",1)
	TurtleTexture2=myLoadTexture("data\models\turtle\dragonturtle3.png",1)
	EntityTexture TurtleMesh,TurtleTexture
	ScaleEntity TurtleMesh,.03,.025,.03
	HideEntity TurtleMesh
	
	; Crabs
	CrabMesh=myLoadMD2("data\models\crab\crab.md2")
	CrabTexture1=myLoadTexture("data\models\crab\crab03a.jpg",1)
	CrabTexture2=myLoadTexture("data\models\crab\crab03b.jpg",1)
	EntityTexture CrabMesh,CrabTexture1
	HideEntity CrabMesh

	; Ice Troll
	TrollMesh=myLoadMD2("data\models\thwart\ice troll.md2")
	TrollTexture=myLoadTexture("data\models\thwart\icetroll01.bmp",1)
	EntityTexture TrollMesh,TrollTexture
	HideEntity TrollMesh
	; Kaboom
	KaboomMesh=myLoadMD2("data\models\kaboom\kaboom.md2")
	For i=1 To 5
		
		
		KaboomTexture(i)=myLoadTexture("data\models\kaboom\kaboom0"+Str$(i)+".jpg",1)
		
	Next
	EntityTexture KaboomMesh,KaboomTexture(1)
	KaboomTextureSquint=myLoadTexture("data\models\kaboom\kaboom00_squint.bmp",1)
	
	KaboomRTWMesh=myLoadMD2("data\models\bomb\bomb.md2")
	KaboomRTWTexture=myLoadTexture("data\models\bomb\bomb.bmp",1)
	EntityTexture KaboomRTWMesh,KaboomRTWTexture
	HideEntity KaboomRTWMesh

	HideEntity KaboomMesh
	; FireFlowers
	FireFlowerMesh=myLoadMD2("data\models\fireflower\fireflower.wdf")
	FireFlowerTexture=myLoadTexture("data\models\fireflower\fireflower04.png",4)
	FireFlowerTexture2=myLoadTexture("data\models\fireflower\fireflowerice.png",4)
	EntityTexture FireFlowerMesh,FireFlowerTexture
;	ScaleMesh FireFlowerMesh,.04,.04,.04
	HideEntity FireFlowerMesh
	
	; BurstFlowers
	BurstFlowerMesh=MyLoadMesh("data\models\burstflower\burstflower.b3d",0)
	BurstFlowerTexture=MyLoadTexture("data\models\burstflower\burstflower.png",1)
	
	EntityTexture BurstFlowerMesh,BurstFlowerTexture
	HideEntity BurstFlowerMesh
	; Boxes etc
	BarrelMesh=myLoadMesh("data\models\barrels\barrel.b3d",0)
	BarrelTexture1=myLoadTexture("Data\models\barrels\barrel1.jpg",1)
	BarrelTexture2=myLoadTexture("Data\models\barrels\barrel2.jpg",1)
;	BarrelTexture3=myLoadTexture("Data\models\barrels\barrel3.jpg",2)
	HideEntity BarrelMesh
	
	; Chompers
	If fullversion=True
		If portalversion=0
			ChomperMesh=myLoadMD2("data\models\chomper\chomper.md2")
		Else
			ChomperMesh=myLoadMD2("data\models\chomper\chomper2.md2")
		EndIf
		ChomperTexture=myLoadTexture("Data\models\chomper\chomper.png",1)
		ChomperTexture2=myLoadTexture("Data\models\chomper\mchomper.png",1)
		EntityTexture ChomperMesh,ChomperTexture
		HideEntity ChomperMesh
		
		; Bowlers
		
		BowlerMesh=myLoadMesh("data\models\spikyball\spikeyball01.b3d",0)
		BowlerTexture=myLoadTexture("Data\models\spikyball\spikeyball01.png",1)
		EntityTexture BowlerMesh,BowlerTexture
		HideEntity BowlerMesh
	EndIf
	; Busterfly
	BusterflyMesh=myLoadMD2("data\models\busterfly\buster.md2")
	BusterflyTexture=myLoadTexture("Data\models\busterfly\buster1.bmp",4)
	EntityTexture BusterflyMesh,BusterflyTexture
	
	HideEntity BusterflyMesh
	
	; Ducky
	rubberduckymesh=myLoadMesh("data\models\rubberducky\rubberducky.b3d",0)
	rubberduckytexture=myLoadTexture("data\models\rubberducky\rubberducky.png",1)
	EntityTexture rubberduckymesh,rubberduckytexture
	HideEntity rubberduckymesh
	
	
	; Spring
	SpringTexture=myLoadTexture("Data\models\bridges\spring.jpg",1)
	
	; Void
	VoidTexture=myLoadTexture("Data\models\void\void.jpg",1)
	
	;FireTrap
	FireTrapTexture=MyLoadTexture("data\models\squares\firetrap.bmp",4)


	
	; Thwarts
	ThwartMesh=myLoadMD2("data\models\thwart\thwart05.md2")
	For i=0 To 7
		ThwartTexture(i)=myLoadTexture("data\models\thwart\thwart"+Str$(i)+".jpg",1)
		
	Next

	EntityTexture ThwartMesh,ThwartTexture(0)
	HideEntity ThwartMesh
	
; Tentacle
	TentacleMesh=myLoadAnimMesh("data\models\trees\tentacle.b3d",0)
	ExtractAnimSeq GetChild(Tentaclemesh,3),41,60
	TentacleTexture = myLoadTexture ("data\models\trees\tentacle.jpg",1)
	TentacleTexture2 = myLoadTexture ("data\models\trees\tentacle2.jpg",1)
	For i=1 To CountChildren(tentaclemesh)
		EntityTexture GetChild(tentaclemesh,i),tentacletexture
	Next
;	EntityTexture TentacleMesh,TentacleTexture
	HideEntity TentacleMesh
; Retrostuff
	RetroBoxMesh=myLoadMesh("data\models\retro\box.3ds",0)
	RetroBoxTexture=myLoadTexture("data\models\retro\woodbox.bmp",1)
	EntityTexture Retroboxmesh,retroboxtexture
	HideEntity RetroBoxMesh
	RetroCoilyMesh=myLoadMD2("data\models\retro\coily.md2")
	RetroCoilyTexture=myLoadTexture("data\models\retro\coily.bmp",1)
	EntityTexture Retrocoilymesh,retrocoilytexture
	HideEntity RetroCoilyMesh
	RetroScougeMesh=myLoadMesh("data\models\retro\scouge.3ds",0)
	RetroScougeTexture=myLoadTexture("data\models\retro\scouge3.bmp",1)
	EntityTexture Retroscougemesh,retroscougetexture
	RotateMesh RetroScougeMesh,-90,0,0
	RotateMesh RetroScougeMesh,0,-90,0
	HideEntity RetroScougeMesh
	RetroUfoMesh=myLoadMesh("data\models\retro\ufo.3ds",0)
	RetroUfoTexture=myLoadTexture("data\models\retro\ufo.bmp",1)
	EntityTexture retroufomesh,retroufotexture
	RotateMesh RetroUFOMesh,-90,0,0
	RotateMesh RetroUFOMesh,0,-90,0
	HideEntity RetroUFOMesh
	RetroZbotMesh=myLoadMesh("data\models\retro\zbot.3ds",0)
	RetroZbotTexture=myLoadTexture("data\models\retro\zbot.bmp",1)
	EntityTexture retrozbotmesh,retrozbottexture
	RotateMesh RetrozbotMesh,-90,0,0
	RotateMesh RetrozbotMesh,0,90,0
	HideEntity RetrozbotMesh
	RetroRainbowCoinTexture=myLoadTexture("data\models\retro\rainbowcoin.bmp",1)
	WeeBotMesh=myLoadMesh("data\models\weebot\weebot.3ds",0)
	WeebotTexture=myLoadTexture("data\models\weebot\weebot.jpg",1)
	EntityTexture Weebotmesh,Weebottexture
	RotateMesh WeebotMesh,-90,0,0
	RotateMesh WeebotMesh,0,180,0
	HideEntity WeebotMesh
	
	ZapbotMesh=myLoadMesh("data\models\zapbot\zapbot.3ds",0)
	ZapbotTexture=myLoadTexture("data\models\zapbot\zapbot.jpg",1)
	EntityTexture Zapbotmesh,Zapbottexture
	RotateMesh ZapbotMesh,-90,0,0
	RotateMesh ZapbotMesh,0,180,0
	HideEntity ZapbotMesh

	
	PushbotTexture=myLoadTexture("data\graphics\pushbot.bmp",1)
	
	ZbotNPCMesh=myLoadMesh("data\models\zbots\zbotnpc.3ds",0)
	RotateMesh ZBOTNPCMesh,-90,0,0
	RotateMesh ZBOTNPCMesh,0,90,0
	ScaleMesh ZBotNPCMesh,1,1.5,1


	For i=0 To 7
		ZbotNPCTexture(i)=myLoadTexture("data\models\zbots\zbotnpc.jpg",1)
	Next
	HideEntity ZbotNPCMesh
	
	StarTexture=myloadTexture("data\graphics\stars.jpg",1)
 	RainbowTexture=myloadTexture("data\graphics\rainbow.jpg",1)
	RainbowTexture2=myloadTexture("data\graphics\rainbow.jpg",1)
	
	; Lurker
	LurkerMesh=MyLoadMesh ("data\models\lurker\lurker.3ds",0)
	LurkerTexture=MyLoadTexture ("data\models\lurker\lurker.jpg",1)
	EntityTexture LurkerMesh,LurkerTexture
	RotateMesh LurkerMesh,-90,0,0
	HideEntity LurkerMesh
	
	; Ghosts
	GhostMesh=MyLoadMesh ("data\models\ghost\ghost.3ds",0)
	GhostTexture=MyLoadTexture ("data\models\ghost\ghost.jpg",1)
	RotateMesh ghostmesh,-90,0,0
	RotateMesh ghostmesh,0,180,0
	EntityTexture GhostMesh,GhostTexture
	HideEntity GhostMesh
	
	WraithMesh=MyLoadMesh ("data\models\ghost\wraith.3ds",0)
	RotateMesh wraithmesh,-90,0,0
	RotateMesh wraithmesh,0,180,0

	WraithTexture(0)=MyLoadTexture ("data\models\ghost\wraith0.jpg",1)
	WraithTexture(1)=MyLoadTexture ("data\models\ghost\wraith1.jpg",1)
	WraithTexture(2)=MyLoadTexture ("data\models\ghost\wraith2.jpg",1)
	WraithTexture(3)=MyLoadTexture ("data\models\ghost\wraith3.jpg",1)
	WraithTexture(4)=MyLoadTexture ("data\models\ghost\wraith4.jpg",1)
	EntityTexture WraithMesh,WraithTexture(0)
	HideEntity WraithMesh
	
	; Obstacles
	ObstacleMesh(1)=myLoadMesh("data\models\Trees\rock1.3ds",0)
	ObstacleTexture(1)=myLoadTexture("data\models\Trees\rocks.jpg",1)
	EntityTexture ObstacleMesh(1),ObstacleTexture(1)
	HideEntity ObstacleMesh(1)
	
	ObstacleMesh(2)=myLoadMesh("data\models\Trees\rock2.3ds",0)
	ObstacleTexture(2)=myLoadTexture("data\models\Trees\rocks2.jpg",1)
	EntityTexture ObstacleMesh(2),ObstacleTexture(2)
	HideEntity ObstacleMesh(2)
	
	ObstacleMesh(5)=myLoadMesh("data\models\Trees\flower.3ds",0)
	ObstacleTexture(5)=myLoadTexture("data\models\Trees\flower1.jpg",1)
	EntityTexture ObstacleMesh(5),ObstacleTexture(5)
	HideEntity ObstacleMesh(5)
	
	ObstacleMesh(6)=myLoadMesh("data\models\Trees\flower2.3ds",0)
	ObstacleTexture(6)=myLoadTexture("data\models\Trees\flower2.bmp",1)
	EntityTexture ObstacleMesh(6),ObstacleTexture(6)
	UpdateNormals obstaclemesh(6)
	HideEntity ObstacleMesh(6)
	
	ObstacleMesh(7)=myLoadMesh("data\models\Trees\watervine.b3d",0)
	ObstacleTexture(7)=myLoadTexture("data\models\Trees\watervine.jpg",1)
	EntityTexture ObstacleMesh(7),ObstacleTexture(7)
	UpdateNormals obstaclemesh(7)
	HideEntity ObstacleMesh(7)

	ObstacleMesh(10)=myLoadMesh("data\models\Trees\mushroom.3ds",0)
	ObstacleTexture(10)=myLoadTexture("data\models\Trees\mushroom.jpg",1)
	EntityTexture ObstacleMesh(10),ObstacleTexture(10)
	HideEntity ObstacleMesh(10)
	
	ObstacleMesh(15)=myLoadMesh("data\models\Trees\leaftree01.b3d",0)
	ObstacleTexture(15)=myLoadTexture("data\models\Trees\leaftree01_03.png",4)
	EntityTexture ObstacleMesh(15),ObstacleTexture(15)
	HideEntity ObstacleMesh(15)
	
	ObstacleMesh(16)=myLoadMesh("data\models\Trees\evergreentree01.b3d",0)
	ObstacleTexture(16)=myLoadTexture("data\models\Trees\evergreen_01.png",4)
	EntityTexture ObstacleMesh(16),ObstacleTexture(16)
	HideEntity ObstacleMesh(16)
	
	ObstacleMesh(17)=myLoadMesh("data\models\Trees\evergreentree01.b3d",0)
	ObstacleTexture(17)=myLoadTexture("data\models\Trees\evergreen_02.png",4)
	EntityTexture ObstacleMesh(17),ObstacleTexture(17)
	HideEntity ObstacleMesh(17)
	
	ObstacleMesh(18)=myLoadMesh("data\models\Trees\leaftree01.b3d",0)
	ObstacleTexture(18)=myLoadTexture("data\models\Trees\leaftree01_02.png",4)
	EntityTexture ObstacleMesh(18),ObstacleTexture(18)
	HideEntity ObstacleMesh(18)
	
	ObstacleMesh(19)=myLoadMesh("data\models\Trees\leaftree01.b3d",0)
	ObstacleTexture(19)=myLoadTexture("data\models\Trees\leaftree01_01.png",4)
	EntityTexture ObstacleMesh(19),ObstacleTexture(19)
	HideEntity ObstacleMesh(19)
	
	ObstacleMesh(20)=myLoadMesh("data\models\Trees\leaftree02.b3d",0)
	ObstacleTexture(20)=myLoadTexture("data\models\Trees\leaftree02_01.png",4)
	EntityTexture ObstacleMesh(20),ObstacleTexture(20)
	HideEntity ObstacleMesh(20)
	
	ObstacleMesh(21)=myLoadMesh("data\models\Trees\leaftree02.b3d",0)
	ObstacleTexture(21)=myLoadTexture("data\models\Trees\leaftree02_02.png",4)
	EntityTexture ObstacleMesh(21),ObstacleTexture(21)
	HideEntity ObstacleMesh(21)
	
	ObstacleMesh(25)=myLoadMesh("data\models\Bridges\bridgeend.3ds",0)
	ObstacleTexture(25)=myLoadTexture("data\models\Bridges\bridgebrick.png",1)
	EntityTexture ObstacleMesh(25),ObstacleTexture(25)
	HideEntity ObstacleMesh(25)
	
	
	ObstacleMesh(26)=myLoadMesh("data\models\houses\canopy.3ds",0)
	ObstacleTexture(26)=myLoadTexture("data\models\houses\canopy.jpg",1)
	EntityTexture ObstacleMesh(26),ObstacleTexture(26)
	HideEntity ObstacleMesh(26)
	
	ObstacleMesh(27)=myLoadMesh("data\models\houses\streetlight01.b3d",0)
	ObstacleTexture(27)=myLoadTexture("data\models\houses\streetlight02.png",4)
	EntityTexture ObstacleMesh(27),ObstacleTexture(27)
	HideEntity ObstacleMesh(27)
	
	ObstacleMesh(28)=myLoadMesh("data\models\houses\pillar.3ds",0)
	ObstacleTexture(28)=myLoadTexture("data\models\houses\pillar1.jpg",1)
	EntityTexture ObstacleMesh(28),ObstacleTexture(28)
	HideEntity ObstacleMesh(28)
	
	ObstacleMesh(29)=myLoadMesh("data\models\ladder\ladder.3ds",0)
	ObstacleTexture(29)=myLoadTexture("data\models\houses\pillar1.jpg",1)
	EntityTexture ObstacleMesh(29),ObstacleTexture(29)
	HideEntity ObstacleMesh(29)
	
	ObstacleMesh(30)=myLoadMesh("data\models\furniture\table.3ds",0)
	ObstacleTexture(30)=myLoadTexture("data\models\furniture\table.jpg",1)
	EntityTexture ObstacleMesh(30),ObstacleTexture(30)
	HideEntity ObstacleMesh(30)
	
	ObstacleMesh(31)=myLoadMesh("data\models\furniture\chair.3ds",0)
	ObstacleTexture(31)=myLoadTexture("data\models\furniture\chair.jpg",1)
	EntityTexture ObstacleMesh(31),ObstacleTexture(31)
	HideEntity ObstacleMesh(31)
	
	ObstacleMesh(32)=myLoadMesh("data\models\furniture\bed.3ds",0)
	ObstacleTexture(32)=myLoadTexture("data\models\furniture\bed.jpg",1)
	EntityTexture ObstacleMesh(32),ObstacleTexture(32)
	HideEntity ObstacleMesh(32)
	
	ObstacleMesh(33)=myLoadMesh("data\models\furniture\bookshelf01.b3d",0)
	ObstacleTexture(33)=myLoadTexture("data\models\furniture\bookshelf01.png",1)
	EntityTexture ObstacleMesh(33),ObstacleTexture(33)
	HideEntity ObstacleMesh(33)
	
	ObstacleMesh(34)=myLoadMesh("data\models\furniture\arcade.3ds",0)
	ObstacleTexture(34)=myLoadTexture("data\models\furniture\arcade.jpg",1)
	EntityTexture ObstacleMesh(34),ObstacleTexture(34)
	HideEntity ObstacleMesh(34)

	ObstacleMesh(35)=myLoadMesh("data\models\houses\pyramid.3ds",0)
	ObstacleTexture(35)=myLoadTexture("data\models\houses\pyramid.jpg",1)
	EntityTexture ObstacleMesh(35),ObstacleTexture(35)
	HideEntity ObstacleMesh(35)
	
	ObstacleMesh(36)=myLoadMesh("data\models\houses\cottage.b3d",0)
	HideEntity ObstacleMesh(36)
	
	ObstacleMesh(37)=myLoadMesh("data\models\houses\townhouse_01a.b3d",0)
	HideEntity ObstacleMesh(37)
	
	ObstacleMesh(38)=myLoadMesh("data\models\houses\townhouse_01b.b3d",0)
	HideEntity ObstacleMesh(38)
	
	ObstacleMesh(39)=myLoadMesh("data\models\houses\townhouse_02a.b3d",0)
	HideEntity ObstacleMesh(39)
	
	ObstacleMesh(40)=myLoadMesh("data\models\houses\townhouse_02b.b3d",0)
	HideEntity ObstacleMesh(40)
	
	ObstacleMesh(41)=myLoadMesh("data\models\houses\windmill_main.b3d",0)
	HideEntity ObstacleMesh(41)
	
	ObstacleMesh(42)=myLoadMesh("data\models\houses\windmill_rotor.b3d",0)
	HideEntity ObstacleMesh(42)


	ButtonTexture=myLoadTexture("data/graphics/buttons1.bmp",4)
	GateTexture=myLoadTexture("data/graphics/gates.bmp",1)
	
	CloudTexture=myLoadTexture("Data/graphics/cloud.jpg",2)
	
	AdventureTitleBackgroundTex=myLoadTexture("data\graphics\logos\starpaper.jpg",1)
	PlasmaTexture=myLoadTexture("data\models\other\growflower.jpg",1)
	
	FlashTexture=myLoadTexture("data\models\other\flashbubble.jpg",1)
	

	; Preloaded Level Textures
	LevelTexture(0)=MyLoadTexture("data\leveltextures\leveltex abstract.bmp",1)
	LevelTexture(1)=MyLoadTexture("data\leveltextures\leveltex cave.bmp",1)
	LevelTexture(2)=MyLoadTexture("data\leveltextures\leveltex cellar.bmp",1)
	LevelTexture(3)=MyLoadTexture("data\leveltextures\leveltex forest.bmp",1)
	LevelTexture(4)=MyLoadTexture("data\leveltextures\leveltex hills.bmp",1)
	LevelTexture(5)=MyLoadTexture("data\leveltextures\leveltex snow.bmp",1)
	LevelTexture(6)=MyLoadTexture("data\leveltextures\leveltex temple.bmp",1)
	LevelTexture(7)=MyLoadTexture("data\leveltextures\leveltex town.bmp",1)
	Backgroundtexture1(0)=MyLoadTexture("data\leveltextures\backgroundtex abstract1.bmp",1)
	Backgroundtexture2(0)=MyLoadTexture("data\leveltextures\backgroundtex abstract2.bmp",1)
	Backgroundtexture1(1)=MyLoadTexture("Data\leveltextures\backgroundtex cave1.bmp",1)
	Backgroundtexture2(1)=MyLoadTexture("data\leveltextures\backgroundtex cave2.bmp",1)
	Backgroundtexture1(2)=MyLoadTexture("data\leveltextures\backgroundtex cellar1.bmp",1)
	Backgroundtexture2(2)=MyLoadTexture("data\leveltextures\backgroundtex cellar2.bmp",1)
	Backgroundtexture1(3)=MyLoadTexture("data\leveltextures\backgroundtex forest1.bmp",1)
	Backgroundtexture2(3)=MyLoadTexture("data\leveltextures\backgroundtex forest2.bmp",1)
	Backgroundtexture1(4)=MyLoadTexture("data\leveltextures\backgroundtex hills1.bmp",1)
	Backgroundtexture2(4)=MyLoadTexture("data\leveltextures\backgroundtex hills2.bmp",1)
	Backgroundtexture1(5)=MyLoadTexture("data\leveltextures\backgroundtex snow1.bmp",1)
	Backgroundtexture2(5)=MyLoadTexture("data\leveltextures\backgroundtex snow2.bmp",1)
	Backgroundtexture1(6)=MyLoadTexture("data\leveltextures\backgroundtex temple1.bmp",1)
	Backgroundtexture2(6)=MyLoadTexture("data\leveltextures\backgroundtex temple2.bmp",1)
	Backgroundtexture1(7)=MyLoadTexture("data\leveltextures\backgroundtex town1.bmp",1)
	Backgroundtexture2(7)=MyLoadTexture("data\leveltextures\backgroundtex town2.bmp",1)

	WaterTexture(0)=MyLoadTexture("data\leveltextures\watertex 1.jpg",1)

	Cylinder=MyLoadmesh("data\models\bridges\cylinder1.b3d",0)
	HideEntity Cylinder
	Fence1=MyLoadmesh("data\models\houses\fence.3ds",0)
	HideEntity Fence1
	Fence2=MyLoadmesh("data\models\houses\fenceb.b3d",0)
	HideEntity Fence2
	Fencepost=MyLoadmesh("data\models\houses\fence_post.3ds",0)
	HideEntity Fencepost
	Door01b3d=MyLoadmesh("data\models\houses\door01.b3d",0)
	HideEntity Door01b3d
	Door013ds=MyLoadmesh("data\models\houses\door01.3ds",0)
	HideEntity Door013ds
	Square=MyLoadmesh("data\models\squares\square1.b3d",0)
	HideEntity Square
	FireTrapTex=MyLoadTexture("data\models\squares\firetrap.bmp",4)
	GloveTex=MyLoadTexture("data\models\squares\glove.bmp",4)
	
	Fountain=MyLoadmesh("data\models\houses\fountain01.b3d",0)
	FountainTexture=MyLoadTexture("data\models\houses\fountain01.png",1)
	EntityTexture Fountain,FountainTexture
	HideEntity Fountain
	
	AdventureStartLogoTex=myLoadTexture("data\graphics\logos\wonderlandadventures.bmp",4)
	AdventureCompletedLogoTex=myLoadTexture("data\graphics\logos\adventurecompleted.bmp",4)
	AdventureLostLogoTex=myLoadTexture("data\graphics\logos\adventurelost.bmp",4)

	AdventureTitleStar=myLoadMesh("data\models\star\star.3ds", camera)
	HideEntity AdventureTitleStar
	AdventureTitleStarTex1=myLoadTexture("data\models\star\goldstar.jpg",1)
	AdventureTitleStarTex2=myLoadTexture("data\models\star\shadowstar.jpg",1)

	TownHouse01a=MyLoadMesh("Data\Models\Houses\townhouse_01a.b3d",0)
	HideEntity TownHouse01a
	TownHouse01b=MyLoadMesh("Data\Models\Houses\townhouse_01b.b3d",0)
	HideEntity TownHouse01b
	TownHouse02a=MyLoadMesh("Data\Models\Houses\townhouse_02a.b3d",0)
	HideEntity TownHouse02a
	TownHouse02b=MyLoadMesh("Data\Models\Houses\townhouse_02b.b3d",0)
	HideEntity TownHouse02b
	Cottage=MyLoadmesh("Data\Models\Houses\cottage.b3d",0)
	HideEntity Cottage


	; SOUND EFFECTS
	
	Restore SoundFXNames
	For i=0 To 159
		Read a$
		If a$<>"---"
			
			SoundFX(i)=myLoadSound("data\sound\"+a$+".wav")

		EndIf
	Next
End Function


Function ConvertName(ex$)

	Select Lower$(ex$)
	
	Case s


	End Select
End Function

Function MyLoadTexture(ex$,flag)

	exbackup$=ex$
	j=Len(ex$)
	Repeat
		j=j-1
	Until Mid$(ex$,j,1)="/" Or Mid$(ex$,j,1)="\" Or j=1
	
	If j=1
		ex2$=""
		j=0
	Else
		ex2$=Left$(ex$,j)
	EndIf
	
	Repeat
		j=j+1
		b=Asc(Mid$(Lower$(ex$),j,1))
		If b>=97 And b<=122
			b=b+1
			If b=123 Then b=97
		EndIf
		ex2$=ex2$+Chr$(b)
	Until Mid$(ex$,j,1)="."
	ex2$=ex2$+"wdf"
	
 
	;Print ex2$
	a=LoadTexture(ex2$,flag)
	If a=0
	
		a=LoadTexture(exbackup$,flag)
		If a=0
			jj=0
			Repeat
				jj=jj+1
			Until FileType("debug."+Str$(jj))=0
			
			debugfile=WriteFile ("debug."+Str$(jj))
			Print "Couldn't Load Texture:"+ex$
			Delay 5000
			WriteString debugfile,ex$
			WriteString debugfile,ex2$
			If FileType(ex2$)=1
				WriteString debugfile,"File Exists!"
			Else
				WriteString debugfile,"File Doesn't Exist!"
				If ex$="load.jpg"
					Print ""
					Print "Please ensure that you install any updates INTO"
					Print "your existing Wonderland Adventures directory"
					Print "(i.e. overwriting some of the existing files)."
					Print ""
					Print "Do not simply run the .exe file from within the"
					Print "update files, or you will receive this error."
					Print "Unzip the files into your Wonderland directory first."
					
					Delay 1000
					Print ""
					Print "Exiting... Press Any Key."
					WaitKey()
					
			;		While KeyDown()=False
			;		Wend
					
					
			;		Repeat
						;
			;		Until KeyDown()
					
					End
				EndIf
			EndIf
			WriteInt debugfile,TotalVidMem()
			WriteInt debugfile,AvailVidMem()
			Print "Trying Again"
			a=LoadTexture(ex2$,flag)
			If a=0
				Print "Nope."
				Delay 5000
				End
			EndIf
		EndIf
	EndIf
	Return a
End Function

Function MyLoadMesh(ex$,parent)
;	MyWriteString(debugfile,"Mesh: "+ex$)

	j=Len(ex$)
	Repeat
		j=j-1
	Until Mid$(ex$,j,1)="/" Or Mid$(ex$,j,1)="\" Or j=1
	
	If j=1
		ex2$=""
		j=0
	Else
		ex2$=Left$(ex$,j)
	EndIf
	
	Repeat
		j=j+1
		b=Asc(Mid$(Lower$(ex$),j,1))
		If b>=97 And b<=122
			b=b+1
			If b=123 Then b=97
		EndIf
		ex2$=ex2$+Chr$(b)
	Until Mid$(ex$,j,1)="."
	If Lower$(Right$(ex$,3))="3ds"
		ex2$=ex2$+"wd3"
	Else
		ex2$=ex2$+"wd1"
	EndIf

	
	CopyFile ex2$,ex$
 
	;Print ex2$
	If parent>0
		a=LoadMesh(ex$,parent)
	Else
		a=LoadMesh(ex$)
	EndIf
	DeleteFile ex$
	If a=0
		jj=0
		Repeat
			jj=jj+1
		Until FileType("debug."+Str$(jj))=0
		
		debugfile=WriteFile ("debug."+Str$(jj))
		Print "Couldn't Load Mesh:"+ex$
		Delay 5000
		WriteString debugfile,ex$
		WriteString debugfile,ex2$
		
		WriteInt debugfile,TotalVidMem()
		WriteInt debugfile,AvailVidMem()
		End
	EndIf
	Return a
End Function

Function MyLoadAnimMesh(ex$,parent)
	j=Len(ex$)
	Repeat
		j=j-1
	Until Mid$(ex$,j,1)="/" Or Mid$(ex$,j,1)="\" Or j=1
	
	If j=1
		ex2$=""
		j=0
	Else
		ex2$=Left$(ex$,j)
	EndIf
	

	Repeat
		j=j+1
		b=Asc(Mid$(Lower$(ex$),j,1))
		If b>=97 And b<=122
			b=b+1
			If b=123 Then b=97
		EndIf
		ex2$=ex2$+Chr$(b)
	Until Mid$(ex$,j,1)="."
	If Lower$(Right$(ex$,3))="3ds"
		ex2$=ex2$+"wd3"
	Else
		ex2$=ex2$+"wd1"
	EndIf
	
	CopyFile ex2$,ex$

 
	;Print ex2$
	If parent>0
		a=LoadAnimMesh(ex$,parent)
	Else
		a=LoadAnimMesh(ex$)
	EndIf
	DeleteFile ex$
	If a=0
		jj=0
		Repeat
			jj=jj+1
		Until FileType("debug."+Str$(jj))=0
		
		debugfile=WriteFile ("debug."+Str$(jj))
		Print "Couldn't Load AnimMesh:"+ex$
		Delay 5000
		WriteString debugfile,ex$
		WriteString debugfile,ex2$
		
		WriteInt debugfile,TotalVidMem()
		WriteInt debugfile,AvailVidMem()
		End
	EndIf

	Return a
End Function

Function MyLoadMD2(ex$)
;	MyWriteString(debugfile,"MD2: "+ex$)

	j=Len(ex$)
	Repeat
		j=j-1
	Until Mid$(ex$,j,1)="/" Or Mid$(ex$,j,1)="\" Or j=1
	
	If j=1
		ex2$=""
		j=0
	Else
		ex2$=Left$(ex$,j)
	EndIf
	
	Repeat
		j=j+1
		b=Asc(Mid$(Lower$(ex$),j,1))
		If b>=97 And b<=122
			b=b+1
			If b=123 Then b=97
		EndIf
		ex2$=ex2$+Chr$(b)
	Until Mid$(ex$,j,1)="."
	ex2$=ex2$+"wd2"
	
 
	;Print ex2$
	a=LoadMD2(ex2$,parent)
	
	If a=0
		jj=0
		Repeat
			jj=jj+1
		Until FileType("debug."+Str$(jj))=0
		
		debugfile=WriteFile ("debug."+Str$(jj))
		Print "Couldn't Load MD2:"+ex$
		Delay 5000
		WriteString debugfile,ex$
		WriteString debugfile,ex2$
		
		WriteInt debugfile,TotalVidMem()
		WriteInt debugfile,AvailVidMem()
		End
	EndIf

	Return a
End Function




Function MyLoadSound(ex$)
;	MyWriteString(debugfile,"Sound: "+ex$)

	j=Len(ex$)
	Repeat
		j=j-1
	Until Mid$(ex$,j,1)="/" Or Mid$(ex$,j,1)="\" Or j=1
	
	If j=1
		ex2$=""
		j=0
	Else
		ex2$=Left$(ex$,j)
	EndIf
	
	Repeat
		j=j+1
		b=Asc(Mid$(Lower$(ex$),j,1))
		If b>=97 And b<=122
			b=b+1
			If b=123 Then b=97
		EndIf
		ex2$=ex2$+Chr$(b)
	Until Mid$(ex$,j,1)="."
	ex2$=ex2$+"wdf"
	
 
	;Print ex2$
	a=LoadSound(ex2$)
	If a=0
		jj=0
		Repeat
			jj=jj+1
		Until FileType("debug."+Str$(jj))=0
		
		debugfile=WriteFile ("debug."+Str$(jj))
	;	Print "Couldn't Load MD2:"+ex$
	;	Delay 5000
		WriteString debugfile,ex$
		WriteString debugfile,ex2$
		
		WriteInt debugfile,TotalVidMem()
		WriteInt debugfile,AvailVidMem()
	;	End
	EndIf


	Return a
End Function
Function myFileType(ex$)
	j=Len(ex$)
	Repeat
		j=j-1
	Until Mid$(ex$,j,1)="/" Or Mid$(ex$,j,1)="\" Or j=1
	
	If j=1
		ex2$=""
		j=0
	Else
		ex2$=Left$(ex$,j)
	EndIf
	
	Repeat
		j=j+1
		b=Asc(Mid$(Lower$(ex$),j,1))
		If b>=97 And b<=122
			b=b+1
			If b=123 Then b=97
		EndIf
		ex2$=ex2$+Chr$(b)
	Until Mid$(ex$,j,1)="."
	ex2$=ex2$+"wdf"
	Return FileType(ex2$)

End Function

Function myWriteString(file,ex$)

	For i=1 To Len(ex$)
		WriteByte file,Asc(Mid$(ex$,i,1))
	Next
	WriteByte file,13
	WriteByte file,10
End Function

Function WhichLevelTexture(ex$)

	Select Lower$(ex$)
	Case "abstract"
		Return 0
	Case "cave"
		Return 1
	Case "cellar"
		Return 2
	Case "forest"
		Return 3
	Case "hills"
		Return 4
	Case "snow"
		Return 5
	Case "temple"
		Return 6
	Case "town"
		Return 7
	Case "lava"
		Return 8
	Case "beach"
		Return 9
	Case "jungle"
		Return 10
	Case "jtemple"
		Return 11
	Case "wonderfalls"
		Return 12
	Case "cave2"
		Return 13
	Case "sundog"
		Return 14
	End Select
	Return -1
End Function

.SoundFXNames
;0
Data "adventurewon1","adventurewon2","---","---","---","---","---","---","---","---"
;10
Data "pinball2","pickupjewel","pickupcoin2","shard","wakka","explosion","electricshock","---","---","---"
;20
Data "ice","buttonoff","buttonturn","buttontimer","colourchange","---","---","---","ghost","wraith"
;30
Data "fireon2","fireduring2","cageclose","bridgeup","bridgedown","gateon1","gateoff1","gatedoor","autodooropen","autodoorclose"
;40
Data "transporter","transporterflip","teleport","suctubein","suctubeout","flystop","---","---","---","---"
;50
Data "weehello1","weehello2","weehello3","weehello4","weehello5","weeyes1","weeyes2","weeyes3","weeyes4","weezee"
;60
Data "weeok1","weeok2","weeok3","weeok4","weeok5","weeouch1","weeouch2","weeouch3","weebored","weetired"
;70
Data "weewoo","weethanks","weebye","weeyeay","kaboom1","kaboom2","kaboom3","kaboom4","kaboom5","kaboom6"
;80
Data "magiccharge","magicblink2","magiccast","freeze","freezebreak","freezestinker","freezechomper","freezethwart","spellballbounce","---"
;90
Data "magicon","magicoff","grow","floingbubble","inflate","saucerfly","saucerdie","lurker","moobot1","moobot2"
;100
Data "scritterhop","chomper","flowergrow","flowerfire","flowerhit","flowerdie","thwart","thwartpickup","splosh","spikeyball"
;110
Data "brick","tentacleup","tentacledown","trollwalk","trollice","crabwalk","crabup","crabdown","bounce","chomper2"
;120
Data "waterfall","quack","quake","void","bubble","splash","surf1","surf2","seagull1","seagull2"
;130
Data "menuclick","invenopen","invenclose","loadgame","savegame","areyousure","menuclick2","loadinggame","mystery1","mystery2"
;140
Data "zbot10","zbot1","zbot2","zbot3","zbot4","zbot5","zbot6","zbot7","zbot8","zbot9"
;150
Data "voices\death1","voices\death2","voices\death3","voices\hot1","voices\hot2","lightning1","lightning2","lightning3","zbot11","zbot12"
;160
Data "lost1","lost2","lost3","lost4","start1","start2","start3","start4","start5","hello"
;170
Data "ice1","ice2","ice3","coin","item","item-no","aha","intro","---","---"
;180
Data "suc1","suc2","suc3","---"
;190
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"