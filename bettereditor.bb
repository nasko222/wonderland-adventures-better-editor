
Type particle
Field f0
Field f1#
Field f2#
Field f3#
Field f4#
Field f5#
Field f6#
Field f7#
Field f8#
Field f9#
Field f10#
Field f11#
Field f12#
Field f13#
Field f14
Field f15
Field f16
Field f17
End Type

Type particle2
Field f0
Field f1#
Field f2#
Field f3#
Field f4#
Field f5#
Field f6#
Field f7#
Field f8#
Field f9#
Field f10#
Field f11#
Field f12#
Field f13#
Field f14
Field f15
Field f16
Field f17
End Type

Type letter
Field f0
Field f1#
Field f2#
Field f3#
Field f4#
Field f5#
Field f6#
Field f7#
Field f8#
Field f9#
Field f10#
Field f11#
Field f12#
Field f13#
Field f14
Field f15
Field f16
Field f17
Field f18
Field f19
End Type

Type altxtype
Field f0
Field f1
Field f2
Field f3#
Field f4#
Field f5#
Field f6#
Field f7#
Field f8#
End Type

AppTitle "Wonderland Adventures [FEATURE BUILD #5]",""

Global particlemesh
Global particlesurface
Global particlemesh2
Global particlesurface2
Global particletexture
Global nofparticles=0
Global nofparticles2=0
Dim savedtformedx1#(360)
Dim savedtformedy1#(360)
Dim savedtformedz1#(360)
Dim savedtformedx2#(360)
Dim savedtformedy2#(360)
Dim savedtformedz2#(360)
Global savedtformedpitch#
Global savedtformedyaw#
Global savedtformedroll#
Global textmesh
Global textsurface
Global texttexture
Dim levelentity(200)
Dim levelsurface(200)
Dim waterentity(200)
Dim watersurface(200)
Dim leveltexture(10)
Dim watertexture(10)
Global leveltexturename$
Global watertexturename$
Global leveldetail
Global customleveltexture
Global custombgtexture1
Global custombgtexture2
Global usecustomleveltexture=0
Global customwatertexture
Global usecustomwatertexture=0
Global levelwidth
Global levelheight
Global leveledgestyle
Global backgroundentity1
Global backgroundentity2
Dim backgroundtexture1(10)
Dim backgroundtexture2(10)
Dim leveltiletexture(100,100)
Dim leveltilerotation(100,100)
Dim leveltilesidetexture(100,100)
Dim leveltilesiderotation(100,100)
Dim leveltilerandom#(100,100)
Dim leveltileheight#(100,100)
Dim leveltileextrusion#(100,100)
Dim leveltilerounding(100,100)
Dim leveltileedgerandom(100,100)
Dim watertiletexture(100,100)
Dim watertilerotation(100,100)
Dim watertileheight#(100,100)
Dim watertileturbulence#(100,100)
Global waterflow
Global watertransparent
Global waterglow
Global waterturbulenceglobal
Global currentlevelchunk
Global chunksize
Global chunkwidth
Global chunkheight
Dim chunktiletexture(100,100)
Dim chunktilerotation(100,100)
Dim chunktilesidetexture(100,100)
Dim chunktilesiderotation(100,100)
Dim chunktilerandom#(100,100)
Dim chunktileheight#(100,100)
Dim chunkstoredvheight#(0)
Dim chunktileextrusion#(100,100)
Dim chunktilerounding(100,100)
Dim chunktileedgerandom(100,100)
Global chunktileu#
Global chunktilev#
Dim chunkwatertiletexture(100,100)
Dim chunkwatertilerotation(100,100)
Dim chunkwatertileheight#(100,100)
Global camera
Global camerazoomlevel#
Global cameraaddx#
Global cameraaddy#
Global cameraaddz#
Global cameraaddxcurrent#
Global cameraaddycurrent#
Global cameraaddzcurrent#
Global cameraaddzoom#
Global cameraaddzoomcurrent#
Global camerashaketimer
Global levellight
Global spotlight
Global lightred
Global lightgreen
Global lightblue
Global lightredgoal
Global lightgreengoal
Global lightbluegoal
Global lightchangespeed
Global lightredgoal2=-1
Global lightgreengoal2
Global lightbluegoal2
Global ambientred
Global ambientgreen
Global ambientblue
Global ambientredgoal
Global ambientgreengoal
Global ambientbluegoal
Global ambientchangespeed
Global ambientredgoal2
Global ambientgreengoal2
Global ambientbluegoal2
Global customcurrentarchive=0
Global customlevelliststart=0
Global customlevellistselected=-1
Dim customlevellistfilename$(5000)
Dim customlevellistname$(5000)
Dim customlevellistcreator$(5000)
Dim customlevellistcompleted(5000)
Dim customlevellistscore(5000)
Dim customlevellistgems(5000)
Dim customlevellistgemstotal(5000)
Dim customlevellistcoins(5000)
Dim customlevellistcoinstotal(5000)
Global nofcustomlevels
Global nofcustomtags
Dim customtag$(1000)
Global currentcustomtag$="Not Archived"
Global currentcustomtagnumber=-2
Global newtagnameentered$
Global saveslotimage
Global saveslotimage2
Global adventuretitle4saving$
Dim saveslotentity(9)
Dim saveslottexture(9)
Dim saveslotdatetime$(9)
Dim saveslotlevelname$(9)
Global dialogbackgroundentity
Global dialogbackgroundentity2
Global dialogbackgroundsize
Global currentdialog
Global currentinterchange
Global currentinterchangenoflines
Global currentinterchangereply
Global dialogtimer
Global dialoglinelength
Global dialogcurrentred
Global dialogcurrentgreen
Global dialogcurrentblue
Global dialogcurrenteffect
Global dialogobject1
Global dialogobject2
Global startinginterchange
Global nofinterchanges
Dim nofinterchangetextlines(100)
Dim interchangetextline$(100,7)
Dim dialogtextcommand$(100,200)
Dim dialogtextcommandpos(100,200)
Dim noftextcommands(100)
Dim nofinterchangereplies(100)
Dim interchangereplytext$(100,8)
Dim interchangereplyfunction(100,8)
Dim interchangereplydata(100,8)
Dim interchangereplycommand(100,8)
Dim interchangereplycommanddata(100,8,4)
Global nofaskabouts
Global askabouttoptext$
Dim askabouttext$(100)
Dim askaboutactive(100)
Dim askaboutinterchange(100)
Dim askaboutrepeat(100)
Dim masteraskaboutactive(1000)
Dim dialogtextline$(10)
Global icontexturestandard
Global icontexturecustom
Dim iconentity(100)
Dim iconx#(100)
Dim icony#(100)
Dim icontexture(100)
Dim iconsize(100)
Dim icontype(100)
Dim iconhelptext$(100)
Dim iconsubtext$(100)
Global iconpicked=-1
Dim titlemenuentity(100)
Dim titlemenutexture(100)
Global titlemenuflag
Global titlemenupointat
Global clickonunwalkable=0
Global usedinventoryonce=0
Global messagelinetext1$
Global messagelinetext2$
Global messagelinetimer
Global currentmenu
Global currentmenunofitems
Global menutimer
Global menutime
Dim menutext$(30,10)
Dim menuactive(30,10)
Restore dataLabel0
;v1=0
For v1=0 To 19
	;v2=0
	For v2=0 To 9
		Read menutext(v1,v2)
		;v2=v2+1
	Next
	;v1=v1+1
Next
.menutexts
Global gameslottobesaved
Global gamenametobesaved$
Global gamemode=0
Global oldgamemode
Global playercontrolmode
Global movecursornewtarget
Global mouseheld
Dim astaropen(10000)
Dim astarf(10000)
Dim astarg(10000)
Dim astarh(10000)
Dim astarparent(10000)
Dim astarx(10000)
Dim astary(10000)
Dim astargrid(100,100)
Dim astarpathnode(100)
Dim playertilepathx(100)
Dim playertilepathy(100)
Global playertilepathpos
Dim leveltileplayerpathscore(100,100)
Dim leveltileplayerpathscorechange(100,100)
Global mousepickplane
Global mousepickx#
Global mousepicky#
Global levelcursor
Global mousecursor
Global mousecursorvisible
Global delaycommand
Global delaydata1
Global delaydata2
Global delaydata3
Global delaydata4
Dim leveltilelogic(100,100)
Dim objecttilelogic(100,100)
Global leveltimer
Global adventuretimer
Global levelmusic
Global levelweather
Global nofobjects=0
Dim objectmodelname$(1000)
Dim objecttexturename$(1000)
Dim objectxscale#(1000)
Dim objectzscale#(1000)
Dim objectyscale#(1000)
Dim objectxadjust#(1000)
Dim objectzadjust#(1000)
Dim objectyadjust#(1000)
Dim objectpitchadjust#(1000)
Dim objectyawadjust#(1000)
Dim objectrolladjust#(1000)
Dim objectexists(1000)
Dim objectentity(1000)
Dim objecttexture(1000)
Dim objectx#(1000)
Dim objecty#(1000)
Dim objectz#(1000)
Dim objectoldx#(1000)
Dim objectoldy#(1000)
Dim objectoldz#(1000)
Dim objectdx#(1000)
Dim objectdy#(1000)
Dim objectdz#(1000)
Dim objectpitch#(1000)
Dim objectyaw#(1000)
Dim objectroll#(1000)
Dim objectpitch2#(1000)
Dim objectyaw2#(1000)
Dim objectroll2#(1000)
Dim objectxgoal#(1000)
Dim objectygoal#(1000)
Dim objectzgoal#(1000)
Dim objectmovementtype(1000)
Dim objectmovementtypedata(1000)
Dim objectspeed#(1000)
Dim objectradius#(1000)
Dim objectradiustype(1000)
Dim objectdata10(1000)
Dim objectpushdx#(1000)
Dim objectpushdy#(1000)
Dim objectattackpower(1000)
Dim objectdefensepower(1000)
Dim objectdestructiontype(1000)
Dim objectid(1000)
Dim objecttype(1000)
Dim objectsubtype(1000)
Dim objectactive(1000)
Dim objectlastactive(1000)
Dim objectactivationtype(1000)
Dim objectactivationspeed(1000)
Dim objectstatus(1000)
Dim objecttimer(1000)
Dim objecttimermax1(1000)
Dim objecttimermax2(1000)
Dim objectteleportable(1000)
Dim objectbuttonpush(1000)
Dim objectwaterreact(1000)
Dim objecttelekinesisable(1000)
Dim objectfreezable(1000)
Dim objectreactive(1000)
Dim objectchild(1000)
Dim objectparent(1000)
Dim objectdata(1000,10)
Dim objecttextdata$(1000,4)
Dim objecttalkable(1000)
Dim objectcurrentanim(1000)
Dim objectstandardanim(1000)
Dim objecttilex(1000)
Dim objecttiley(1000)
Dim objecttilex2(1000)
Dim objecttiley2(1000)
Dim objectmovementtimer(1000)
Dim objectmovementspeed(1000)
Dim objectmovexgoal(1000)
Dim objectmoveygoal(1000)
Dim objecttiletypecollision(1000)
Dim objectobjecttypecollision(1000)
Dim objectcaged(1000)
Dim objectdead(1000)
Dim objectdeadtimer(1000)
Dim objectexclamation(1000)
Dim objectshadow(1000)
Dim objectlinked(1000)
Dim objectlinkback(1000)
Dim objectflying(1000)
Dim objectfrozen(1000)
Dim objectfutureint23(1000)
Dim objectfutureint24(1000)
Dim objectfutureint25(1000)
Dim objectscaleadjust#(1000)
Dim objectscalexadjust#(1000)
Dim objectscaleyadjust#(1000)
Dim objectscalezadjust#(1000)
Dim objectfuturefloat5#(1000)
Dim objectfuturefloat6#(1000)
Dim objectfuturefloat7#(1000)
Dim objectfuturefloat8#(1000)
Dim objectfuturefloat9#(1000)
Dim objectfuturefloat10#(1000)
Dim objectfuturestring1$(1000)
Dim objectfuturestring2$(1000)
Global camerafocusobject
Global stinkermesh
Dim stinkertexture(100,10)
Global stinkersmokedtexture
Global nofweestinkersinadventure
Global nofweestinkersfollowing
Global nofweestinkersfollowinglast
Global stinkerweemesh
Global stinkerweetexture
Global stinkerweetexturesleep
Global stinkerweetexturesad
Global cagemesh
Global cagetexture
Global stargatemesh
Global buttontexture
Global gatetexture
Global firetraptexture
Dim teleportertexture(16)
Global scrittermesh
Global scrittertexture
Global nofscrittersinadventure
Dim steppingstonetexture(4)
Global waterfallmesh
Global waterfalltexture
Global starmesh
Global goldstartexture
Global wisptexture
Global coinmesh
Global goldcointexture
Global tokencointexture
Global keymesh
Dim signmesh(4)
Dim signtexture(4)
Dim doortexture(10)
Dim cottagetexture(10)
Dim housetexture(10)
Dim windmilltexture(10)
Dim fencetexture(10)
Dim shadowtexture(10)
Dim gemmesh(10)
Global nofgemsinadventure
Global gempitch
Global turtlemesh
Global turtletexture
Global crabmesh
Global crabtexture1
Global crabtexture2
Global nofcrabsinadventure
Global kaboommesh
Global kaboomtexturesquint
Dim kaboomtexture(5)
Global nofbabyboomersinadventure
Global fireflowermesh
Global fireflowertexture
Global noffireflowersinadventure
Global barrelmesh
Global barreltexture1
Global barreltexture2
Dim thwarttexture(9)
Global nofbricksinadventure
Global chompermesh
Global chompertexture
Global bowlermesh
Global bowlertexture
Global busterflymesh
Global busterflytexture
Global rubberduckymesh
Global rubberduckytexture
Global springtexture
Global voidtexture
Global thwartmesh
Global tentaclemesh
Global tentacletexture
Global retroboxmesh
Global retroboxtexture
Global retrocoilymesh
Global retrocoilytexture
Global retroscougemesh
Global retroscougetexture
Global retroufomesh
Global retroufotexture
Global retrozbotmesh
Global retrozbottexture
Global retrorainbowcointexture
Dim obstaclemesh(50)
Dim obstacletexture(50)
Global cylinder
Global fence1
Global fence2
Global fencepost
Global door01b3d
Global door013ds
Global fountain
Global adventuretitlestar
Global adventuretitlestartex1
Global adventuretitlestartex2
Global adventurestartlogotex
Global adventurecompletedlogotex
Global adventurelostlogotex
Global square
Global firetraptex
Global glovetex
Global townhouse01a
Global townhouse01b
Global townhouse02a
Global townhouse02b
Global cottage
Global playerobject
Global stinkerobject
Global playertalktogoalobject
Global lastplayercontrol
Global playername$
Global oldplayername$
Global playercharactername$
Global oldplayercharactername$
Global oldplayercharactername2$
Global playertexturebody=Rand(1,4)
Global playeracc1=Rand(0,22)
Global playertexacc1=1
Global playeracc2=Rand(0,2)
Global playertexacc2=1
Global playersizex#=0.035
Global playersizey#=0.035
Global playersizez#=0.035
Global playervoice=1
Global playerpitch
Dim adventurecompleted(500)
Dim adventurecompletedtime(500)
Dim adventurecompletedgems(500)
Dim adventurecompletedgemstotal(500)
Dim adventurecompletedcoins(500)
Dim adventurecompletedcoinstotal(500)
Dim adventurecompletedscore(500)
Global currentadventuregems
Global currentadventurecoins
Global currentadventuretime
Global currentadventurescore
Global replayadventuregemsbetter
Global replayadventurecoinsbetter
Global replayadventurescorebetter
Global currentreplayadventure=0
Global currentreplayadventurename$
Global playercoins
Global playercoinscollected
Global playerstars
Global playerscore
Global inventorysize=3
Global nofinventoryitems
Dim inventoryitem(100)
Dim inventoryid(100)
Dim inventorytexture(100)
Dim inventoryhelptext$(100)
Dim inventorysubtext$(100)
Global inventoryswapitem
Global inventoryswapicon
Global shardsareactive=0
Global shardhitcounter
Global shardlasthit
Global shardmelodytimer
Dim shardmelody(7)
Global playercoinsb4
Global playercoinscollectedb4
Global playerstarsb4
Global playerscoreb4
Global lightpowerb4
Global inventorysizeb4
Global nofinventoryitemsb4
Dim inventoryitemb4(100)
Dim inventoryidb4(100)
Dim inventorytextureb4(100)
Dim inventoryhelptextb4$(100)
Dim inventorysubtextb4$(100)
Global nofhubs=2
Global adventurecurrentlevel
Global adventurecurrentstatus
Global adventurecurrentnumber
Global adventurecurrentname$
Global adventurestartx
Global adventurestarty
Global adventuretitle$
Dim adventuretextline$(5)
Dim adventuretitlesprite(4)
Dim adventuretitlespritetex(4)
Dim adventurehelpsprite$(3)
Dim adventurehelpline$(3)
Global adventuretitlebackground
Global adventuretitlebackgroundtex
Dim adventurewoncommand(3,6)
Global adventureexitwonlevel
Global adventureexitwonx
Global adventureexitwony
Global adventureexitlostlevel
Global adventureexitlostx
Global adventureexitlosty
Global adventuregoal
Global adventurelostreason$
Global adventurelostcamerax#
Global adventurelostcameray#
Global adventurelostcameraz#
Global spellactive=0
Global currentspell=-1
Global currentcharm=0
Global currentspellpower=0
Global currentlightpower=0
Global telekinesisactive
Global telekinesisobject
Dim soundfx(500)
Global playercancelmove
Dim soundfxvolume#(500)
Global musicchannel
Global currentmusic
Global globalmusicvolume#=0.5
Global globalsoundvolume#=1.0
Global globalmusicvolume2=3
Global globalsoundvolume2=5
Global exa1
Global exa2
Global globaldirname$="User Data"
Global waepisode=0
Goto skiplocker
If (Upper$(Right$(CurrentDate(),4))="2010" Or (FileType("mpbe.wdf")=0)) Then
	Restore dataLabel200
	Read v3$
	Print v3$
	Print "-------------------------------"
	Read v3$
	Print v3$
	Read v3$
	Print v3$
	DeleteFile "mpbe.wdf"
	Delay 5000
	End
End If
.skiplocker
checkfornewcompiledlevels(0)
Global fullversion=1
Global portalversion=0
Global affiliateid=1046627
Global exitaftertrailer=0
Global traileralreadyplayed=0
Global timeoflastgamesaved=0
Global exitafterthissave=0
Global gfxwidth=800
Global gfxheight=600
Global gfxdepth=16
Global gfxwindowed=1
Global oldgfxwindowed
Dim mygfxmodewidth(1000)
Global mygfxmode
Dim mygfxmodeheight(1000)
Dim mygfxmodedepth(1000)
Global fpsdisplay=0
Global midnightvault=0
Global midnightvaulttimer
Global wallblinking=0
Global backspacedown
Global levelformat104=0
Global menukeydown=0
v4=ReadFile(globaldirname+"\display.wdf")
If v4>0 Then
	v2=ReadInt(v4)
	;v1=0
	For v1=0 To v2-1
		mygfxmodewidth(v1)=ReadInt(v4)
		mygfxmodeheight(v1)=ReadInt(v4)
		mygfxmodedepth(v1)=ReadInt(v4)
		;v1=v1+1
	Next
	mygfxmode=ReadInt(v4)
	gfxwindowed=ReadInt(v4)
	gfxwidth=mygfxmodewidth(mygfxmode)
	gfxheight=mygfxmodeheight(mygfxmode)
	gfxdepth=mygfxmodedepth(mygfxmode)
	If GfxMode3DExists(gfxwidth,gfxheight,gfxdepth)=0 Then
		gfxwidth=800
		gfxheight=600
		gfxdepth=16
	End If
	If GfxMode3DExists(gfxwidth,gfxheight,gfxdepth)=0 Then
		gfxwidth=800
		gfxheight=600
		gfxdepth=32
	End If
	If GfxMode3DExists(gfxwidth,gfxheight,gfxdepth)=0 Then
		gfxwidth=640
		gfxheight=480
		gfxdepth=16
	End If
	If GfxMode3DExists(gfxwidth,gfxheight,gfxdepth)=0 Then
		gfxwidth=640
		gfxheight=480
		gfxdepth=32
	End If
Else
	Print "File Not Found: 'display.wdf'"
	Delay 3000
	End
End If
If GfxMode3DExists(gfxwidth,gfxheight,gfxdepth)=0 Then
	Print "Unable to set graphics mode!"
	Print ""
	Print "Please ensure that your video card drivers"
	Print "are up-to-date, or use the graphic options"
	Print "to select a different display mode."
	Print ""
	Print "Exiting... press any key."
	WaitKey()
	End
End If
Global keyboardmode=2
Global mousegamemode=-1
Global mouse1
Global mouse2
Global escpressed
Global tween#
Global tweenperiod
Global tweentime
Global tweenelapsed
Global tweenticks
Global justregainedfocus
Global altx.altxtype=New altxtype
Dim consoledata(6)
oldgfxwindowed=gfxwindowed
Graphics3D gfxwidth,gfxheight,gfxdepth,gfxwindowed
SetBuffer BackBuffer()
HidePointer
v4=ReadFile(globaldirname+"\global.wdf")
If v4=0 Then
	playername=""
	playercharactername=""
	globalsoundvolume2=5
	globalmusicvolume2=3
	keyboardmode=2
Else
	playername=ReadString(v4)
	playercharactername=ReadString(v4)
	globalsoundvolume2=ReadInt(v4)
	globalmusicvolume2=ReadInt(v4)
	keyboardmode=ReadInt(v4)
	CloseFile(v4)
	globalsoundvolume=globalsoundvolume2*0.2
	globalmusicvolume=globalmusicvolume2*0.2
End If
;v5=1
For v5=1 To Millisecs() Mod 100
	v6=Rand(0,44)
	;v5=v5+1
Next
setupcamera()
setuplight()
AmbientLight 255.0,255.0,255.0
v7=CreateCube(camera)
If portalversion=0 Then
	v8=myloadtexture("load.jpg",1)
	EntityTexture v7,v8,0,0
	PositionEntity v7,0.0,0.0,10.0,0
	RenderWorld 1.0
	Text gfxwidth*0.5,gfxheight*2/7,"...Loading...",1,0
	Text gfxwidth*0.5,gfxheight*2/3,"...Please Wait...",1,0
	Text gfxwidth*0.5,gfxheight*34/36,"WA Custom Editor (C) 2008 Midnight Synergy",1,0
	Text gfxwidth*0.5,gfxheight*35/36,"www.MidnightSynergy.com",1,0
Else
	v8=LoadTexture("logo.jpg",1)
	EntityTexture v7,v8,0,0
	PositionEntity v7,0.0,0.0,5.0,0
	RenderWorld 1.0
	Text gfxwidth*0.5,gfxheight*25/28,"...Loading...",1,0
	Text gfxwidth*0.5,gfxheight*26/28,"...Please Wait...",1,0
End If
Flip 1
preloadmodels()
setupmenu()
FreeTexture v8
FreeEntity v7
resetparticles("data/graphics/particles.bmp")
resettext("data/graphics/font.bmp")
If playername="" Then
	startmenu(12)
Else
	loadplayer(globaldirname+"\player profiles\"+playername+"\current\playerfile.wpf")
	startmenu(11)
End If
altx\f1=1
v9=-1
v10=0
v11=0
tweenperiod=16
tweentime=Millisecs()-tweenperiod
Global endgame=0
Repeat
	If hasfocus() Then
		If justregainedfocus=1 Then
			justregainedfocus=0
			If currentmusic>0 Then
				ResumeChannel musicchannel
			End If
		End If
		If (currentmusic>0 And ((gamemode<10 Or (currentmenu<>10)))) Then
			If ChannelPlaying(musicchannel)=0 Then
				musicchannel=PlayMusic("data\music\"+currentmusic+".ogg")
				ChannelVolume musicchannel,globalmusicvolume
			End If
		End If
		Repeat
			tweenelapsed=Millisecs()-tweentime
		Until tweenelapsed>tweenperiod
		If tweenelapsed>20*tweenperiod Then
			tweenelapsed=20*tweenperiod
			tweentime=Millisecs()-tweenelapsed
		End If
		tweenticks=tweenelapsed/tweenperiod
		tween=Float(tweenelapsed Mod tweenperiod)/Float(tweenperiod)
		;v12=1
		For v12=1 To tweenticks
			tweentime=tweentime+tweenperiod
			If v12=tweenticks Then
				CaptureWorld
			End If
			If gamemode<10 Then
				updategame()
			Else If gamemode=10 Then
				updateadventuretitle()
			Else If gamemode=12 Then
				updatemenu()
			End If
			If gamemode<>12 Then
				controllight()
				leveltimer=leveltimer+1
				adventuretimer=adventuretimer+1
				UpdateWorld 1.0
			End If
			;v12=v12+1
		Next
		If v9=-1 Then
			v11=Millisecs()
			v9=100
		Else If v9=0 Then
			v13=Millisecs()-v11
			v10=100000/v13
			v9=100
			v11=Millisecs()
		Else
			v9=v9-1
		End If
		v14=Floor(mousepickx)
		v15=Floor(mousepicky)
		If fpsdisplay=1 Then
			displaytext("FPS: "+v10,0.0,46.0,0.5,1.0,255,255,255)
		End If
		If (messagelinetimer>0 And (messagelinetext1<>"")) Then
			ShowEntity dialogbackgroundentity2
			If messagelinetimer<30 Then
				PositionEntity dialogbackgroundentity2,0.0,0.4-(0.4*(30-messagelinetimer)/30.0),0.0,0
				displaytext(messagelinetext1,24.5-(Len(messagelinetext1)/2.0),24.0-(messagelinetimer*2/30.0),1.0,1.0,255,255,0)
				displaytext(messagelinetext2,24.5-(Len(messagelinetext2)/2.0),25.0-(messagelinetimer*2/30.0),1.0,1.0,255,255,0)
			Else
				PositionEntity dialogbackgroundentity2,0.0,0.4,0.0,0
				displaytext(messagelinetext1,24.5-(Len(messagelinetext1)/2.0)+0.25*Sin((messagelinetimer-30)*16),22.0,1.0,1.0,255,255,0)
				displaytext(messagelinetext2,24.5-(Len(messagelinetext2)/2.0)+0.25*Sin((messagelinetimer-30)*16),23.0,1.0,1.0,255,255,0)
			End If
		Else
			HideEntity dialogbackgroundentity2
		End If
		If messagelinetimer>0 Then
			messagelinetimer=messagelinetimer-1
		End If
		;v1=0
		For v1=0 To 79
			If (iconentity(v1)>0 And (iconsize(v1)>=1001)) Then
				If iconsize(v1)=1201 Then
					displaytext(iconhelptext(v1),(10.1*(v1 Mod 10)+3.2)-((Len(iconhelptext(v1))-1.0)/2.0),4.3+Floor(v1/10)*6.0,0.5,1.0,255,255,255)
				Else
					displaytext(iconsubtext(v1),(10.1*(v1 Mod 10)+3.2)-((Len(iconsubtext(v1))-1.0)/2.0),3.9+Floor(v1/10)*6.0,0.5,1.0,255,255,255)
				End If
			End If
			;v1=v1+1
		Next
		If gamemode=5 Then
			displaytext("Items:",40.6-(6.8*(inventorysize-3)),2.67,0.75,1.0,255,255,0)
		End If
		If gamemode=6 Then
			displaytext("Swap Item:",40.6,2.67,0.75,1.0,255,255,0)
		End If
		If (gamemode=5 Or (gamemode=6)) Then
			displaytext("Stars",47.65,(inventorysize-3)*4+16,0.75,1.0,255,255,0)
			displaytext("Coins",54.3,(inventorysize-3)*4+16,0.75,1.0,255,255,0)
			displaytext("Score: "+playerscore,52.3-Len(playerscore),(inventorysize-3)*4+20,0.75,1.0,255,255,0)
			If playerstars<10 Then
				v12=0
			Else If playerstars<100 Then
				v12=1
			Else If playerstars<1000 Then
				v12=2
			Else If playerstars<10000 Then
				v12=3
			Else
				v12=4
			End If
			displaytext(playerstars,49.65-(v12*0.5),18.8+((inventorysize-3)*4),0.75,1.0,255,255,0)
			If playercoins<10 Then
				v12=0
			Else If playercoins<100 Then
				v12=1
			Else If playercoins<1000 Then
				v12=2
			Else If playercoins<10000 Then
				v12=3
			Else
				v12=4
			End If
			displaytext(playercoins,56.3-(v12*0.5),18.8+((inventorysize-3)*4),0.75,1.0,255,255,0)
		End If
		If gamemode=8 Then
			displaydialog()
		End If
		If KeyDown(63) Then
			fpsdisplay=1
		End If
		If (midnightvault=0 And (KeyDown(6))) Then
			midnightvault=1
			midnightvaulttimer=Millisecs()
		Else If (midnightvault=1 And (KeyDown(9))) Then
			midnightvault=2
		Else If (midnightvault=2 And (KeyDown(3))) Then
			midnightvault=3
		Else If (midnightvault=3 And (KeyDown(6))) Then
			messagelinetext1="Sorry. I don't have the"
			messagelinetext2="key to the Vault ;-)"
			messagelinetimer=100
			midnightvault=4
		Else If ((((KeyDown(2) Or (KeyDown(4))) Or (KeyDown(5))) Or (KeyDown(8))) Or (KeyDown(10))) Then
			midnightvault=0
		End If
		If (KeyDown(48) And ((KeyDown(29) Or (KeyDown(157))))) Then
			wallblinking=1
			messagelinetext1="Wall-Blinking Activated"
			messagelinetext2="(use at your own risk)"
			messagelinetimer=100
		End If
		If (midnightvaulttimer>0 And (midnightvault<4)) Then
			If Millisecs()-midnightvaulttimer>1500 Then
				midnightvault=0
				midnightvaulttimer=0
			End If
		End If
		If KeyDown(1) Then
			If escpressed=0 Then
				escpressed=1
				If gamemode<10 Then
					If currentcharm=3 Then
						ShowEntity levelcursor
						currentcharm=0
						turnonicons()
						deleteicon(1)
						mousegamemode=-2
					Else If (leveltimer<1000001000 Or (leveltimer>=1000001500)) Then
						playsoundfx(131,-1,-1)
						HideEntity levelcursor
						startmenu(0)
					Else
						leveltimer=1000001498
					End If
				Else If gamemode=10 Then
					leveltimer=1000000000
				Else If gamemode=12 Then
					Select currentmenu
					Case 0
						endmenu()
						startmenu(3)
					Case 1,2,4,5,6
						endmenu()
					Case 3
						endmenu()
						endlevel()
						endadventure()
						startmenu(11)
					Case 11
						endmenu()
						startmenu(19)
					Case 16,18
						endmenu()
						startmenu(11)
					Case 12
						If (oldplayername<>"" And (oldplayercharactername<>"")) Then
							playername=oldplayername
							playercharactername=oldplayercharactername
							endmenu()
							startmenu(11)
						End If
					Case 13
						If (oldplayername<>"" And (oldplayercharactername<>"")) Then
							playername=oldplayername
							playercharactername=oldplayercharactername
							endmenu()
							startmenu(11)
						End If
					Case 14
						If oldplayercharactername=".." Then
							playercharactername=oldplayercharactername2
							oldplayercharactername=""
							endmenu()
							startmenu(11)
						End If
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
						mousegamemode=2
					Case 101
						currentmenu=100
						customlevellistselected=-1
					End Select
				End If
			End If
		Else
			escpressed=0
		End If
		If gfxwindowed=2 Then
			If (((MouseX()<10 Or (MouseY()<10)) Or (MouseX()>gfxwidth-10)) Or (MouseY()>gfxheight-10)) Then
				HideEntity mousecursor
			Else If mousecursorvisible=1 Then
				ShowEntity mousecursor
			End If
		End If
		rendergame()
	Else
		If currentmusic>0 Then
			PauseChannel musicchannel
		End If
		justregainedfocus=1
		Repeat
			Delay 200
		Until hasfocus()
		tweentime=Millisecs()
	End If
Until endgame=1
End
.charmdata
.expired
.soundfxnames
.spelldata

Function updategame()
	
	resetsounds()
	mouse1=0
	mouse2=0
	If (MouseDown(1)=1 Or (MouseHit(1)>0)) Then
		mouse1=1
	End If
	If (MouseDown(2)=1 Or (MouseHit(2)>0)) Then
		mouse2=1
	End If
	PositionEntity mousecursor,-10.0+MouseX()*20.0/gfxwidth,7.5-(MouseY()*15.0/gfxheight),20.0,0
	If gamemode=0 Then
		ShowEntity levelcursor
	End If
	cameracontrols()
	controlcamera()
	controlicons()
	controldialog()
	controlobjects()
	controlparticles()
	If (leveltimer<1000001000 Or (leveltimer>=1000002000)) Then
		v1=0
		Select adventuregoal
		Case 0
		Case 1
			If nofweestinkersinadventure=0 Then
				v1=1
			End If
		Case 2
			If nofscrittersinadventure=0 Then
				v1=1
			End If
		Case 3
			If nofgemsinadventure=0 Then
				v1=1
			End If
		Case 4
			If nofbricksinadventure=0 Then
				v1=1
			End If
		Case 5
			If noffireflowersinadventure=0 Then
				v1=1
			End If
		Case 6
		Case 7
			If nofcrabsinadventure=0 Then
				v1=1
			End If
		Case 8
			If nofbabyboomersinadventure=0 Then
				v1=1
			End If
		End Select
		If (v1=1 Or ((((KeyDown(88) And ((KeyDown(29) Or (KeyDown(157))))) And (adventurecurrentstatus>0)) And (midnightvault>0)))) Then
			adventurewon()
		End If
	End If
	If (leveltimer>1000001000 And (leveltimer<1000002000)) Then
		adventurewonupdate()
	End If
	If (leveltimer>1000002000 And (leveltimer<1000003000)) Then
		adventurelostupdate()
	End If
	If (mouse1=0 And (mouse2=0)) Then
		mousegamemode=-1
		If currentcharm<>3 Then
			;v3=0
			For v3=0 To 79
				If iconentity(v3)>0 Then
					EntityPickMode iconentity(v3),2,1
				End If
				;v3=v3+1
			Next
		End If
	End If
	If (delaycommand=7 And (leveltimer=1000000050)) Then
		If adventurecurrentstatus=0 Then
			currentreplayadventure=0
			delaycommand=0
			savelevel(globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+(-adventurecurrentlevel)+".wlv")
			endlevel()
			startlevel(globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+(-delaydata1)+".wlv",0)
			createplayer(delaydata2+0.5,delaydata3+0.5)
			adventurecurrentlevel=delaydata1
		Else
			delaycommand=0
			savelevel(globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+adventurecurrentlevel+".wlv")
			endlevel()
			startlevel(globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+delaydata1+".wlv",0)
			adventurecurrentlevel=delaydata1
			createplayer(delaydata2+0.5,delaydata3+0.5)
		End If
	End If
	If (delaycommand=8 And (leveltimer=1000000050)) Then
		delaycommand=0
		savelevel(globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+(-adventurecurrentlevel)+".wlv")
		endlevel()
		If delaydata1>0 Then
			If currentreplayadventure=0 Then
				startadventure("data\adventures\Adventure"+delaydata1,1,v4)
			Else
				startadventure("data\adventures\Adventure"+delaydata1,3,v4)
			End If
		Else
			startadventure(adventurecurrentname,2,0)
		End If
	End If
	If delaycommand=102 Then
		delaycommand=0
		enddialog()
		savelevel(globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+(-adventurecurrentlevel)+".wlv")
		endlevel()
		startmenu(22)
	End If
	If delaycommand=115 Then
		delaycommand=0
		enddialog()
		startmenu(24)
	End If
	Select levelweather
	Case 1
		If Rand(1,3)=3 Then
			addparticle(40,objectx(camerafocusobject)+Rnd(-10.0,10.0),8.0,-objecty(camerafocusobject)+Rnd(-10.0,10.0),0.0,0.2,Rnd(-0.01,0.01),-0.03,Rnd(-0.01,0.01),2.0,0.0,0.0,0.0,0.0,200,3)
		End If
	Case 2
		addparticle(40,objectx(camerafocusobject)+Rnd(-10.0,10.0),8.0,-objecty(camerafocusobject)+Rnd(-10.0,10.0),0.0,0.3,0.0,-0.05,0.0,2.0,0.0,0.0,0.0,0.0,120,3)
	Case 3
		addparticle(40,objectx(camerafocusobject)+Rnd(5.0,10.0),5.0,-objecty(camerafocusobject)+Rnd(-8.0,4.0),0.0,0.4,-0.3,-0.09,0.0,2.0,0.0,0.0,0.0,0.0,80,3)
	Case 4
		addparticle(40,objectx(camerafocusobject)+Rnd(-10.0,-5.0),5.0,-objecty(camerafocusobject)+Rnd(-8.0,4.0),0.0,0.4,0.3,-0.09,0.0,2.0,0.0,0.0,0.0,0.0,80,3)
	Case 5
		addparticle(41,objectx(camerafocusobject)+Rnd(-10.0,10.0),8.0,-objecty(camerafocusobject)+Rnd(-10.0,10.0),0.0,0.2,0.0,-0.2,0.0,0.0,0.0,0.0,0.0,0.0,60,2)
	Case 6
		If Rand(0,200)<2 Then
			setlight(Rand(0,255),Rand(0,255),Rand(0,255),2,Rand(0,255),Rand(0,255),Rand(0,255),2)
		End If
	End Select
	If midnightvault=4 Then
		If KeyDown(72) Then
			objectflying(playerobject)=10
		End If
		If KeyDown(73) Then
			objectflying(playerobject)=11
		End If
		If KeyDown(77) Then
			objectflying(playerobject)=12
		End If
		If KeyDown(81) Then
			objectflying(playerobject)=13
		End If
		If KeyDown(80) Then
			objectflying(playerobject)=14
		End If
		If KeyDown(79) Then
			objectflying(playerobject)=15
		End If
		If KeyDown(75) Then
			objectflying(playerobject)=16
		End If
		If KeyDown(71) Then
			objectflying(playerobject)=17
		End If
	End If
	If KeyDown(14) Then
		backspacedown=backspacedown+1
		If (midnightvault=4 Or (backspacedown=300)) Then
			Repeat
			Until KeyDown(14)=0
			Locate(0,0)
			Color 0,0,0
			Rect 0,0,300,200,1
			Color 255,255,255
			v6=Input("Command:")
			v7=Input("Data 1:")
			v8=Input("Data 2:")
			v9=Input("Data 3:")
			v10=Input("Data 4:")
			activatecommand(v6,v7,v8,v9,v10)
			Repeat
			Until KeyDown(14)=0
		End If
	Else
		backspacedown=0
	End If
	playallsounds()
End Function

Function rendergame()
	
	renderparticles()
	renderletters()
	If gamemode<10 Then
		updatewater(EntityX(camera,0),(-EntityZ(camera,0))-12.0,12)
	End If
	RenderWorld tween
	Flip 1
End Function

Function updateadventuretitle()
	
	If leveltimer=0 Then
		Return 0
	End If
	CameraPick(camera,MouseX(),MouseY())
	If leveltimer=10 Then
		ShowEntity levelcursor
		EntityAlpha levelcursor,0.5
		PositionEntity adventuretitlestar,0.0,0.27,4.7,0
		PositionEntity adventuretitlesprite(0),0.0,-0.9+0.6*leveltimer/100.0,1.0+3.0*leveltimer/100.0,0
	End If
	If leveltimer=16 Then
		ShowEntity adventuretitlestar
	End If
	addparticle(Rand(16,23),PickedX(),PickedY(),PickedZ()-0.011,0.0,0.01,Rnd(-0.005,0.005),Rnd(-0.004,0.008),0.0,5.0,0.001,0.0,-0.00005,0.0,75,3)
	PositionEntity levelcursor,PickedX(),PickedY(),PickedZ(),0
	ScaleEntity levelcursor,0.2,0.2,0.2,0
	PointEntity levelcursor,camera,leveltimer*4 Mod 360
	TurnEntity levelcursor,90.0,0.0,0.0,0
	controlparticles()
	PositionTexture adventuretitlebackgroundtex,leveltimer Mod 2000/2000.0,leveltimer Mod 2000/2000.0
	TurnEntity adventuretitlestar,0.0,0.0,2.0,0
	If (leveltimer>15 And (leveltimer<300)) Then
		EntityAlpha adventuretitlebackground,leveltimer/300.0
	End If
	If (leveltimer>15 And (leveltimer<100)) Then
		PositionEntity adventuretitlesprite(0),0.0,0.2+0.6*leveltimer/100.0,1.0+3.0*leveltimer/100.0,0
		EntityAlpha adventuretitlesprite(0),leveltimer/100.0
	End If
	If leveltimer<1000 Then
		EntityAlpha adventuretitlestar,leveltimer/1000.0
	End If
	If leveltimer<1000000000 Then
		RotateSprite adventuretitlesprite(0),10.0*Sin(leveltimer-100)
		ScaleSprite adventuretitlesprite(0),0.9+Sin(leveltimer Mod 1000000000)*0.1,0.9+0.1*Sin(leveltimer)
	End If
	If leveltimer<1000000000 Then
		v1=0
		If (leveltimer>200 And (leveltimer<250)) Then
			v1=(leveltimer-200)*5
		Else If leveltimer>=250 Then
			v1=255
		End If
		v1=255
		If leveltimer<64 Then
			v1=leveltimer*4.0
		End If
		If leveltimer<Len(adventuretitle)*5 Then
			displaytext(Left$(adventuretitle,leveltimer/5),16.666666-(Len(adventuretitle)*0.5),8.0+0.2*Sin(leveltimer*2),1.5,1.0,v1,v1,0)
		Else
			displaytext(adventuretitle,16.666666-(Len(adventuretitle)*0.5),8.0+0.2*Sin(leveltimer*2),1.5,1.0,v1,v1,0)
		End If
		v1=255
		If leveltimer<256 Then
			v1=leveltimer/1.0
		End If
		;v2=0
		For v2=0 To 4
			displaytext(adventuretextline(v2),25.0-(Len(adventuretextline(v2))*0.5),14+v2,1.0,1.0,v1,v1,v1)
			;v2=v2+1
		Next
		v1=170
		If leveltimer<512 Then
			v1=leveltimer/3.0
		End If
		displaytext("(Click To Start The Adventure)",10.0,21.0,1.0,1.0,v1,v1,0)
	End If
	If (((((MouseDown(1)=1 Or (KeyDown(57))) Or (KeyDown(28))) Or (KeyDown(156))) And (leveltimer<1000000000)) And (leveltimer>40)) Then
		leveltimer=1000000000
	End If
	If leveltimer>1000000000 Then
		EntityBlend adventuretitlestar,1
		EntityAlpha adventuretitlestar,0.5-((leveltimer-1000000000)/100.0)
		EntityAlpha adventuretitlebackground,0.5-((leveltimer-1000000000)/100.0)
		EntityAlpha adventuretitlesprite(0),0.5-((leveltimer-1000000000)/100.0)
		TranslateEntity adventuretitlesprite(0),0.0,-0.025,-0.1,0
	End If
	If leveltimer=1000000050 Then
		;v2=0
		For v2=0 To 0
			If adventuretitlesprite(v2)>0 Then
				FreeEntity adventuretitlesprite(v2)
				adventuretitlesprite(v2)=0
			End If
			;v2=v2+1
		Next
		FreeEntity adventuretitlebackground
		adventuretitlebackground=0
		v3=0
		gamemode=0
		startlevel(globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+adventurecurrentlevel+".wlv",0)
		createplayer(adventurestartx,adventurestarty)
		mousegamemode=-2
		resetparticles("data/graphics/particles.bmp")
		ScaleEntity levelcursor,1.0,1.0,1.0,0
		RotateEntity levelcursor,0.0,0.0,0.0,0
		playsoundfxnow(Rand(164,168))
		createicon(9,0,4,4,"Menu","Open")
		If nofinventoryitems>0 Then
			createicon(8,0,0,1,"Items","Open")
		End If
		ShowEntity mousecursor
		mousecursorvisible=1
	End If
End Function

Function cameracontrols()
	
	If ((KeyDown(56) And (KeyDown(45))) And (altx\f0=0)) Then
		altx\f0=1
		If v1=1 Then
			altx\f1=0
		Else
			altx\f1=1
		End If
	Else
		altx\f0=0
	End If
End Function

Function storecamerasettings()
	
	altx\f2=1
	altx\f3=EntityX(camera,0)
	altx\f4=EntityY(camera,0)
	altx\f5=EntityZ(camera,0)
	altx\f6=EntityRoll(camera,0)
	altx\f7=EntityYaw(camera,0)
	altx\f8=EntityPitch(camera,0)
End Function

Function restorecamerasettings()
	
	altx\f2=0
	RotateEntity camera,altx\f8,altx\f7,altx\f6,0
	PositionEntity camera,altx\f3,altx\f4,altx\f5,0
End Function

Function checkfornewcompiledlevels(a0)
	
	If a0=0 Then
		Print "Checking for New Custom Adventures:"
		Print ""
	End If
	v1=ReadDir(globaldirname+"\adventures\downloads inbox")
	Repeat
		v2$=NextFile(v1)
		If Upper$(Right$(v2$,4))=".WA2" Then
			v2$=Left$(v2$,Len(v2$)-4)
			If a0=0 Then
				Print "Found: "+v2$
			End If
			CreateDir globaldirname+"\adventures\current\unpack"
			v3=ReadFile(globaldirname+"\adventures\downloads inbox\"+v2$+".wa2")
			v4=ReadInt(v3)
			;v5=0
			For v5=0 To v4-1
				v6$=ReadString(v3)
				v7=ReadInt(v3)
				v8=WriteFile(globaldirname+"\adventures\current\unpack\"+v6$)
				;v9=0
				For v9=0 To v7-1
					v10=ReadByte(v3)
					WriteByte(v8,v10)
					;v9=v9+1
				Next
				CloseFile(v8)
				;v5=v5+1
			Next
			CloseFile(v3)
			If compareadventures(v2$)=0 Then
				v11=ReadDir(globaldirname+"\adventures\current\"+v2$)
				Repeat
					v12$=NextFile(v11)
					If (v12$<>"" And (FileType(globaldirname+"\adventures\current\"+v2$+"\"+v12$)=1)) Then
						DeleteFile globaldirname+"\adventures\current\"+v2$+"\"+v12$
					End If
				Until v12$=""
				CloseDir v11
				v11=ReadDir(globaldirname+"\adventures\current\unpack")
				Repeat
					v12$=NextFile(v11)
					If (v12$<>"" And (FileType(globaldirname+"\adventures\current\unpack\"+v12$)=1)) Then
						CopyFile globaldirname+"\adventures\current\unpack\"+v12$,globaldirname+"\adventures\current\"+v2$+"\"+v12$
					End If
				Until v12$=""
				CloseDir v11
				If a0=0 Then
					Print "          Unpacking..."
				End If
			Else If a0=0 Then
				Print "          Already Exists."
			End If
			DeleteFile globaldirname+"\adventures\downloads inbox\"+v2$+".wa2"
			v11=ReadDir(globaldirname+"\adventures\current\unpack")
			Repeat
				v12$=NextFile(v11)
				If (v12$<>"" And (FileType(globaldirname+"\adventures\current\unpack\"+v12$)=1)) Then
					DeleteFile globaldirname+"\adventures\current\unpack\"+v12$
				End If
			Until v12$=""
			CloseDir v11
			DeleteDir globaldirname+"\adventures\current\unpack"
		End If
	Until v2$=""
	CloseDir v1
End Function

Function compareadventures(a0$)
	
	If FileType(globaldirname+"\adventures\current\"+a0$)<>2 Then
		CreateDir globaldirname+"\adventures\current\"+a0$
		Return 0
	End If
	v1=ReadDir(globaldirname+"\adventures\current\unpack\")
	Repeat
		v2$=NextFile(v1)
		If (v2$<>"" And (FileType(globaldirname+"\adventures\current\unpack\"+v2$)=1)) Then
			If FileType(globaldirname+"\adventures\current\"+a0$+"\"+v2$)<>1 Then
				Return 0
			End If
			v3=ReadFile(globaldirname+"\adventures\current\unpack\"+v2$)
			v4=ReadFile(globaldirname+"\adventures\current\"+a0$+"\"+v2$)
			v5=1
			Repeat
				v6=ReadByte(v3)
				v7=ReadByte(v4)
				If (v6<>v7 Or ((Eof(v4)=1 And (Eof(v3)=0)))) Then
					v5=0
				End If
			Until (v5=0 Or (Eof(v3)=1))
			CloseFile(v3)
			CloseFile(v4)
			If v5=0 Then
				Return 0
			End If
		End If
	Until v2$=""
	CloseDir v8
	Return 1
End Function

Function resetparticles(a0$)
	
	If particlemesh<>0 Then
		FreeEntity particlemesh
		particlemesh=0
	End If
	If particlemesh2<>0 Then
		FreeEntity particlemesh2
		particlemesh2=0
	End If
	nofparticles=0
	nofparticles2=0
	For v1.particle=Each particle
		Delete v1
	Next
	For v2.particle2=Each particle2
		Delete v2
	Next
	particlemesh=CreateMesh(0)
	particlemesh2=CreateMesh(camera)
	particlesurface=CreateSurface(particlemesh,0)
	particlesurface2=CreateSurface(particlemesh2,0)
	EntityFX particlemesh,35
	EntityBlend particlemesh,3
	EntityTexture particlemesh,particletexture,0,0
	EntityFX particlemesh2,35
	EntityBlend particlemesh2,3
	EntityTexture particlemesh2,particletexture,0,0
	EntityOrder particlemesh2,-100
	savedtformedpitch=-9838993.0
	particlefixedcameracheck()
End Function

Function addparticle(a0,a1#,a2#,a3#,a4#,a5#,a6#,a7#,a8#,a9#,a10#,a11#,a12#,a13#,a14,a15)
	
	v1.particle=New particle
	v1\f0=a0
	v1\f1=a1#
	v1\f2=a2#
	v1\f3=a3#
	v1\f4=a4#
	v1\f5=a5#/2.0
	v1\f6=a6#
	v1\f7=a7#
	v1\f8=a8#
	v1\f9=a9#
	v1\f10=a10#
	v1\f11=a11#
	v1\f12=a12#
	v1\f13=a13#
	v1\f14=a14
	v1\f15=a14
	v1\f17=a15
	v1\f16=0
	If ((v1\f6<>0.0 Or (v1\f7<>0.0)) Or (v1\f8<>0.0)) Then
		v1\f16=1
		If (v1\f9<>0.0 Or (v1\f10<>0.0)) Then
			v1\f16=v1\f16+2
		End If
	End If
	If ((v1\f11<>0.0 Or (v1\f12<>0.0)) Or (v1\f13<>0.0)) Then
		v1\f16=2
		If (v1\f9<>0.0 Or (v1\f10<>0.0)) Then
			v1\f16=v1\f16+2
		End If
	End If
	If (v1\f16=0 And ((v1\f9<>0.0 Or (v1\f10<>0.0)))) Then
		v1\f16=5
	End If
	nofparticles=nofparticles+1
End Function

Function addparticle2(a0,a1#,a2#,a3#,a4#,a5#,a6#,a7#,a8#,a9#,a10#,a11#,a12#,a13#,a14,a15)
	
	v1.particle2=New particle2
	v1\f0=a0
	v1\f1=a1#
	v1\f2=a2#
	v1\f3=a3#
	v1\f4=a4#
	v1\f5=a5#/2.0
	v1\f6=a6#
	v1\f7=a7#
	v1\f8=a8#
	v1\f9=a9#
	v1\f10=a10#
	v1\f11=a11#
	v1\f12=a12#
	v1\f13=a13#
	v1\f14=a14
	v1\f15=a14
	v1\f17=a15
	v1\f16=0
	If ((v1\f6<>0.0 Or (v1\f7<>0.0)) Or (v1\f8<>0.0)) Then
		v1\f16=1
		If (v1\f9<>0.0 Or (v1\f10<>0.0)) Then
			v1\f16=v1\f16+2
		End If
	End If
	If ((v1\f11<>0.0 Or (v1\f12<>0.0)) Or (v1\f13<>0.0)) Then
		v1\f16=2
		If (v1\f9<>0.0 Or (v1\f10<>0.0)) Then
			v1\f16=v1\f16+2
		End If
	End If
	If (v1\f16=0 And ((v1\f9<>0.0 Or (v1\f10<>0.0)))) Then
		v1\f16=5
	End If
	nofparticles2=nofparticles2+1
End Function

Function controlparticles()
	
	For v1.particle=Each particle
		Select v1\f16
		Case 0
		Case 1
			v1\f1=v1\f1+v1\f6
			v1\f2=v1\f2+v1\f7
			v1\f3=v1\f3+v1\f8
		Case 2
			v1\f6=v1\f6+v1\f11
			v1\f7=v1\f7+v1\f12
			v1\f8=v1\f8+v1\f13
			v1\f1=v1\f1+v1\f6
			v1\f2=v1\f2+v1\f7
			v1\f3=v1\f3+v1\f8
		Case 3
			v1\f1=v1\f1+v1\f6
			v1\f2=v1\f2+v1\f7
			v1\f3=v1\f3+v1\f8
			v1\f4=v1\f4+v1\f9
			v1\f5=v1\f5+v1\f10
		Case 4
			v1\f6=v1\f6+v1\f11
			v1\f7=v1\f7+v1\f12
			v1\f8=v1\f8+v1\f13
			v1\f1=v1\f1+v1\f6
			v1\f2=v1\f2+v1\f7
			v1\f3=v1\f3+v1\f8
			v1\f4=v1\f4+v1\f9
			v1\f5=v1\f5+v1\f10
		Case 5
			v1\f4=v1\f4+v1\f9
			v1\f5=v1\f5+v1\f10
		End Select
		If v1\f14>0 Then
			v1\f15=v1\f15-1
			If v1\f15=0 Then
				Delete v1
				nofparticles=nofparticles-1
			End If
		End If
	Next
	For v3.particle2=Each particle2
		Select v3\f16
		Case 0
		Case 1
			v3\f1=v3\f1+v3\f6
			v3\f2=v3\f2+v3\f7
			v3\f3=v3\f3+v3\f8
		Case 2
			v3\f6=v3\f6+v3\f11
			v3\f7=v3\f7+v3\f12
			v3\f8=v3\f8+v3\f13
			v3\f1=v3\f1+v3\f6
			v3\f2=v3\f2+v3\f7
			v3\f3=v3\f3+v3\f8
		Case 3
			v3\f1=v3\f1+v3\f6
			v3\f2=v3\f2+v3\f7
			v3\f3=v3\f3+v3\f8
			v3\f4=v3\f4+v3\f9
			v3\f5=v3\f5+v3\f10
		Case 4
			v3\f6=v3\f6+v3\f11
			v3\f7=v3\f7+v3\f12
			v3\f8=v3\f8+v3\f13
			v3\f1=v3\f1+v3\f6
			v3\f2=v3\f2+v3\f7
			v3\f3=v3\f3+v3\f8
			v3\f4=v3\f4+v3\f9
			v3\f5=v3\f5+v3\f10
		Case 5
			v3\f4=v3\f4+v3\f9
			v3\f5=v3\f5+v3\f10
		End Select
		If v3\f14>0 Then
			v3\f15=v3\f15-1
			If v3\f15=0 Then
				Delete v3
				nofparticles2=nofparticles2-1
			End If
		End If
	Next
End Function

Function renderparticles()
	
	v1=CreatePivot(0)
	v2=CreatePivot(0)
	particlefixedcameracheck()
	v3=0
	v4#=0.001
	v5=particlesurface
	ClearSurface v5,1,1
	For v6.particle=Each particle
		v7#=v6\f5
		v8=v6\f0
		v9#=v8 Mod 8*0.125+v4#
		v10#=(v9#+0.125)-(2.0*v4#)
		v11#=Floor(v8/8)*0.125+v4#
		v12#=(v11#+0.125)-(2.0*v4#)
		Select v6\f17
		Case 0
			PositionEntity v1,v6\f1-EntityX(camera,0),v6\f2-EntityY(camera,0),v6\f3-EntityZ(camera,0),0
			PointEntity v2,v1,0.0
			TurnEntity v2,0.0,0.0,-v6\f4,0
			TFormVector -v7#,v7#,0.0,v2,0
			AddVertex(v5,v6\f1+TFormedX(),v6\f2+TFormedY(),v6\f3+TFormedZ(),v9#,v11#,1.0)
			AddVertex(v5,v6\f1-TFormedX(),v6\f2-TFormedY(),v6\f3-TFormedZ(),v10#,v12#,1.0)
			TFormVector v7#,v7#,0.0,v2,0
			AddVertex(v5,v6\f1+TFormedX(),v6\f2+TFormedY(),v6\f3+TFormedZ(),v10#,v11#,1.0)
			AddVertex(v5,v6\f1-TFormedX(),v6\f2-TFormedY(),v6\f3-TFormedZ(),v9#,v12#,1.0)
		Case 1
			v14#=v6\f1-EntityX(camera,0)
			v15#=v6\f3-EntityZ(camera,0)
			v16#=Sqr(v14#^2.0+v15#^2.0)
			v14#=v14#/v16#
			v15#=v15#/v16#
			AddVertex(v5,v6\f1-(v7#*v15#),v6\f2+v7#,v6\f3+v7#*v14#,v9#,v11#,1.0)
			AddVertex(v5,v6\f1+v7#*v15#,v6\f2-v7#,v6\f3-(v7#*v14#),v10#,v12#,1.0)
			AddVertex(v5,v6\f1+v7#*v15#,v6\f2+v7#,v6\f3-(v7#*v14#),v10#,v11#,1.0)
			AddVertex(v5,v6\f1-(v7#*v15#),v6\f2-v7#,v6\f3+v7#*v14#,v9#,v12#,1.0)
		Case 2
			AddVertex(v5,v6\f1-v7#,v6\f2+v7#,v6\f3,v9#,v11#,1.0)
			AddVertex(v5,v6\f1+v7#,v6\f2-v7#,v6\f3,v10#,v12#,1.0)
			AddVertex(v5,v6\f1+v7#,v6\f2+v7#,v6\f3,v10#,v11#,1.0)
			AddVertex(v5,v6\f1-v7#,v6\f2-v7#,v6\f3,v9#,v12#,1.0)
		Case 3
			v17=Floor(v6\f4)
			If v17<0 Then
				Repeat
					v17=v17+360
				Until v17>=0
			End If
			If v17>=360 Then
				v17=v17 Mod 360
			End If
			AddVertex(v5,v6\f1+savedtformedx1(v17)*v7#,v6\f2+savedtformedy1(v17)*v7#,v6\f3+savedtformedz1(v17)*v7#,v9#,v11#,1.0)
			AddVertex(v5,v6\f1-(savedtformedx1(v17)*v7#),v6\f2-(savedtformedy1(v17)*v7#),v6\f3-(savedtformedz1(v17)*v7#),v10#,v12#,1.0)
			AddVertex(v5,v6\f1+savedtformedx2(v17)*v7#,v6\f2+savedtformedy2(v17)*v7#,v6\f3+savedtformedz2(v17)*v7#,v10#,v11#,1.0)
			AddVertex(v5,v6\f1-(savedtformedx2(v17)*v7#),v6\f2-(savedtformedy2(v17)*v7#),v6\f3-(savedtformedz2(v17)*v7#),v9#,v12#,1.0)
		Case 4
			AddVertex(v5,v6\f1-v7#,v6\f2,v6\f3+v7#,v9#,v11#,1.0)
			AddVertex(v5,v6\f1+v7#,v6\f2,v6\f3-v7#,v10#,v12#,1.0)
			AddVertex(v5,v6\f1+v7#,v6\f2,v6\f3+v7#,v10#,v11#,1.0)
			AddVertex(v5,v6\f1-v7#,v6\f2,v6\f3-v7#,v9#,v12#,1.0)
		Case 5
			AddVertex(v5,v6\f1,v6\f2-v7#,v6\f3+v7#,v9#,v11#,1.0)
			AddVertex(v5,v6\f1,v6\f2+v7#,v6\f3-v7#,v10#,v12#,1.0)
			AddVertex(v5,v6\f1,v6\f2+v7#,v6\f3+v7#,v10#,v11#,1.0)
			AddVertex(v5,v6\f1,v6\f2-v7#,v6\f3-v7#,v9#,v12#,1.0)
		End Select
		AddTriangle(v5,v3*4+0,v3*4+2,v3*4+3)
		AddTriangle(v5,v3*4+2,v3*4+1,v3*4+3)
		If v6\f14>0 Then
			v18#=Float(v6\f15)/Float(v6\f14)
			;v19=0
			For v19=0 To 3
				VertexColor v5,v3*4+v19,255.0,255.0,255.0,v18#
				;v19=v19+1
			Next
		End If
		v3=v3+1
	Next
	v3=0
	v4#=0.001
	v5=particlesurface2
	ClearSurface v5,1,1
	For v20.particle2=Each particle2
		v7#=v20\f5
		v8=v20\f0
		v9#=v8 Mod 8*0.125+v4#
		v10#=(v9#+0.125)-(2.0*v4#)
		v11#=Floor(v8/8)*0.125+v4#
		v12#=(v11#+0.125)-(2.0*v4#)
		Select v20\f17
		Case 0
			PositionEntity v1,v20\f1-EntityX(camera,0),v20\f2-EntityY(camera,0),v20\f3-EntityZ(camera,0),0
			PointEntity v2,v1,0.0
			TurnEntity v2,0.0,0.0,-v6\f4,0
			TFormVector -v7#,v7#,0.0,v2,0
			AddVertex(v5,v20\f1+TFormedX(),v20\f2+TFormedY(),v20\f3+TFormedZ(),v9#,v11#,1.0)
			AddVertex(v5,v20\f1-TFormedX(),v20\f2-TFormedY(),v20\f3-TFormedZ(),v10#,v12#,1.0)
			TFormVector v7#,v7#,0.0,v2,0
			AddVertex(v5,v20\f1+TFormedX(),v20\f2+TFormedY(),v20\f3+TFormedZ(),v10#,v11#,1.0)
			AddVertex(v5,v20\f1-TFormedX(),v20\f2-TFormedY(),v20\f3-TFormedZ(),v9#,v12#,1.0)
		Case 1
			v14#=v20\f1-EntityX(camera,0)
			v15#=v20\f3-EntityZ(camera,0)
			v16#=Sqr(v14#^2.0+v15#^2.0)
			v14#=v14#/v16#
			v15#=v15#/v16#
			AddVertex(v5,v20\f1-(v7#*v15#),v20\f2+v7#,v20\f3+v7#*v14#,v9#,v11#,1.0)
			AddVertex(v5,v20\f1+v7#*v15#,v20\f2-v7#,v20\f3-(v7#*v14#),v10#,v12#,1.0)
			AddVertex(v5,v20\f1+v7#*v15#,v20\f2+v7#,v20\f3-(v7#*v14#),v10#,v11#,1.0)
			AddVertex(v5,v20\f1-(v7#*v15#),v20\f2-v7#,v20\f3+v7#*v14#,v9#,v12#,1.0)
		Case 2
			AddVertex(v5,v20\f1-v7#,v20\f2+v7#,v20\f3,v9#,v11#,1.0)
			AddVertex(v5,v20\f1+v7#,v20\f2-v7#,v20\f3,v10#,v12#,1.0)
			AddVertex(v5,v20\f1+v7#,v20\f2+v7#,v20\f3,v10#,v11#,1.0)
			AddVertex(v5,v20\f1-v7#,v20\f2-v7#,v20\f3,v9#,v12#,1.0)
		Case 3
			v17=Floor(v20\f4)
			If v17<0 Then
				Repeat
					v17=v17+360
				Until v17>=0
			End If
			If v17>=360 Then
				v17=v17 Mod 360
			End If
			AddVertex(v5,v20\f1+savedtformedx1(v17)*v7#,v20\f2+savedtformedy1(v17)*v7#,v20\f3+savedtformedz1(v17)*v7#,v9#,v11#,1.0)
			AddVertex(v5,v20\f1-(savedtformedx1(v17)*v7#),v20\f2-(savedtformedy1(v17)*v7#),v20\f3-(savedtformedz1(v17)*v7#),v10#,v12#,1.0)
			AddVertex(v5,v20\f1+savedtformedx2(v17)*v7#,v20\f2+savedtformedy2(v17)*v7#,v20\f3+savedtformedz2(v17)*v7#,v10#,v11#,1.0)
			AddVertex(v5,v20\f1-(savedtformedx2(v17)*v7#),v20\f2-(savedtformedy2(v17)*v7#),v20\f3-(savedtformedz2(v17)*v7#),v9#,v12#,1.0)
		Case 4
			AddVertex(v5,v20\f1-v7#,v20\f2,v20\f3+v7#,v9#,v11#,1.0)
			AddVertex(v5,v20\f1+v7#,v20\f2,v20\f3-v7#,v10#,v12#,1.0)
			AddVertex(v5,v20\f1+v7#,v20\f2,v20\f3+v7#,v10#,v11#,1.0)
			AddVertex(v5,v20\f1-v7#,v20\f2,v20\f3-v7#,v9#,v12#,1.0)
		Case 5
			AddVertex(v5,v20\f1,v20\f2-v7#,v20\f3+v7#,v9#,v11#,1.0)
			AddVertex(v5,v20\f1,v20\f2+v7#,v20\f3-v7#,v10#,v12#,1.0)
			AddVertex(v5,v20\f1,v20\f2+v7#,v20\f3+v7#,v10#,v11#,1.0)
			AddVertex(v5,v20\f1,v20\f2-v7#,v20\f3-v7#,v9#,v12#,1.0)
		End Select
		AddTriangle(v5,v3*4+0,v3*4+2,v3*4+3)
		AddTriangle(v5,v3*4+2,v3*4+1,v3*4+3)
		If v20\f14>0 Then
			v18#=Float(v20\f15)/Float(v20\f14)
			;v19=0
			For v19=0 To 3
				VertexColor v5,v3*4+v19,255.0,255.0,255.0,v18#
				;v19=v19+1
			Next
		End If
		v3=v3+1
	Next
	FreeEntity v1
	FreeEntity v2
End Function

Function particlefixedcameracheck()
	
	If ((EntityPitch(camera,0)<>savedtformedpitch Or (EntityYaw(camera,0)<>savedtformedyaw)) Or (EntityRoll(camera,0)<>savedtformedroll)) Then
		v1=CreatePivot(0)
		savedtformedpitch=EntityPitch(camera,0)
		savedtformedyaw=EntityYaw(camera,0)
		savedtformedroll=EntityRoll(camera,0)
		RotateEntity v1,savedtformedpitch,savedtformedyaw,savedtformedroll,1
		;v2=0
		For v2=0 To 359
			TFormVector -0.5,0.5,0.0,v1,0
			savedtformedx1(v2)=TFormedX()
			savedtformedy1(v2)=TFormedY()
			savedtformedz1(v2)=TFormedZ()
			TFormVector 0.5,0.5,0.0,v1,0
			savedtformedx2(v2)=TFormedX()
			savedtformedy2(v2)=TFormedY()
			savedtformedz2(v2)=TFormedZ()
			TurnEntity v1,0.0,0.0,-1.0,0
			;v2=v2+1
		Next
		FreeEntity v1
	End If
End Function

Function resettext(a0$)
	
	If texttexture<>0 Then
		FreeTexture texttexture
		texttexture=0
	End If
	If textmesh<>0 Then
		FreeEntity textmesh
		textmesh=0
	End If
	v1=0
	For v2.letter=Each letter
		Delete v2
	Next
	textmesh=CreateMesh(camera)
	textsurface=CreateSurface(textmesh,0)
	EntityFX textmesh,35
	EntityOrder textmesh,-20
	texttexture=myloadtexture(a0$,4)
	EntityTexture textmesh,texttexture,0,0
End Function

Function addletter(a0,a1#,a2#,a3#,a4#,a5#,a6#,a7#,a8#,a9#,a10#,a11#,a12#,a13#,a14,a15,a16,a17)
	
	v1.letter=New letter
	v1\f0=a0
	v1\f1=a1#
	v1\f2=a2#
	v1\f3=a3#
	v1\f4=a4#
	v1\f5=a5#/2.0
	v1\f6=a6#
	v1\f7=a7#
	v1\f8=a8#
	v1\f9=a9#
	v1\f10=a10#
	v1\f11=a11#
	v1\f12=a12#
	v1\f13=a13#
	v1\f14=a14
	v1\f15=a14
	v1\f17=a15
	v1\f18=a16
	v1\f19=a17
	v1\f16=0
	If ((v1\f6<>0.0 Or (v1\f7<>0.0)) Or (v1\f8<>0.0)) Then
		v1\f16=1
		If (v1\f9<>0.0 Or (v1\f10<>0.0)) Then
			v1\f16=v1\f16+2
		End If
	End If
	If ((v1\f11<>0.0 Or (v1\f12<>0.0)) Or (v1\f13<>0.0)) Then
		v1\f16=2
		If (v1\f9<>0.0 Or (v1\f10<>0.0)) Then
			v1\f16=v1\f16+2
		End If
	End If
	If (v1\f16=0 And ((v1\f9<>0.0 Or (v1\f10<>0.0)))) Then
		v1\f16=5
	End If
End Function

Function controlletters()
	
	For v1.particle=Each particle
		Select v1\f16
		Case 0
		Case 1
			v1\f1=v1\f1+v1\f6
			v1\f2=v1\f2+v1\f7
			v1\f3=v1\f3+v1\f8
		Case 2
			v1\f6=v1\f6+v1\f11
			v1\f7=v1\f7+v1\f12
			v1\f8=v1\f8+v1\f13
			v1\f1=v1\f1+v1\f6
			v1\f2=v1\f2+v1\f7
			v1\f3=v1\f3+v1\f8
		Case 3
			v1\f1=v1\f1+v1\f6
			v1\f2=v1\f2+v1\f7
			v1\f3=v1\f3+v1\f8
			v1\f4=v1\f4+v1\f9
			v1\f5=v1\f5+v1\f10
		Case 4
			v1\f6=v1\f6+v1\f11
			v1\f7=v1\f7+v1\f12
			v1\f8=v1\f8+v1\f13
			v1\f1=v1\f1+v1\f6
			v1\f2=v1\f2+v1\f7
			v1\f3=v1\f3+v1\f8
			v1\f4=v1\f4+v1\f9
			v1\f5=v1\f5+v1\f10
		Case 5
			v1\f4=v1\f4+v1\f9
			v1\f5=v1\f5+v1\f10
		End Select
		If v1\f14>0 Then
			v1\f15=v1\f15-1
			If v1\f15=0 Then
				Delete v1
				nofparticles=nofparticles-1
			End If
		End If
	Next
End Function

Function renderletters()
	
	v1=0
	v2#=0.004
	v3=textsurface
	ClearSurface v3,1,1
	For v4.letter=Each letter
		v5#=v4\f5
		v6=v4\f0
		v7#=v6 Mod 16*0.0625+v2#
		v8#=(v7#+0.0625)-(2.0*v2#)
		v9#=Floor(v6/16)*0.125+v2#
		v10#=(v9#+0.125)-(2.0*v2#)
		AddVertex(v3,v4\f1-v5#,v4\f2+2.0*v5#,v4\f3,v7#,v9#,1.0)
		AddVertex(v3,v4\f1+v5#,v4\f2-(2.0*v5#),v4\f3,v8#,v10#,1.0)
		AddVertex(v3,v4\f1+v5#,v4\f2+2.0*v5#,v4\f3,v8#,v9#,1.0)
		AddVertex(v3,v4\f1-v5#,v4\f2-(2.0*v5#),v4\f3,v7#,v10#,1.0)
		AddTriangle(v3,v1*4+0,v1*4+2,v1*4+3)
		AddTriangle(v3,v1*4+2,v1*4+1,v1*4+3)
		If v4\f14>0 Then
			v11#=Float(v4\f15)/Float(v4\f14)
		Else
			v11#=1.0
		End If
		;v12=0
		For v12=0 To 3
			VertexColor v3,v1*4+v12,v4\f17,v4\f18,v4\f19,v11#
			;v12=v12+1
		Next
		v1=v1+1
		Delete v4
	Next
End Function

Function displaytext(a0$,a1#,a2#,a3#,a4#,a5,a6,a7)
	
	;v1=1
	For v1=1 To Len(a0$)
		v2=Asc(Mid$(a0$,v1,1))-32
		addletter(v2,(((((a1#+v1)-1.0)*0.0396)*a3#)*a4#+-0.97)/camerazoomlevel,(0.7-(a2#*0.0623*a3#*a4#))/camerazoomlevel,1.0,0.0,0.044*a3#/camerazoomlevel,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,1,a5,a6,a7)
		;v1=v1+1
	Next
End Function

Function createlevel()
	
	currentlevelchunk=0
	chunksize=12
	waterturbulenceglobal=0
	;v1=0
	For v1=0 To (levelheight-1)/chunksize
		;v2=0
		For v2=0 To (levelwidth-1)/chunksize
			If (v2=(levelwidth-1)/chunksize And (levelwidth Mod chunksize>0)) Then
				chunkwidth=levelwidth Mod chunksize+2
			Else
				chunkwidth=chunksize+2
			End If
			If (v1=(levelheight-1)/chunksize And (levelheight Mod chunksize>0)) Then
				chunkheight=levelheight Mod chunksize+2
			Else
				chunkheight=chunksize+2
			End If
			;v3=0
			For v3=0 To chunkwidth-1
				;v4=0
				For v4=0 To chunkheight-1
					If (v3=0 And (v2=0)) Then
						v5=v2*chunksize
					Else If (v3=chunkwidth-1 And (v2=(levelwidth-1)/chunksize)) Then
						v5=(v2*chunksize+chunkwidth)-3
					Else
						v5=(v2*chunksize+v3)-1
					End If
					If (v4=0 And (v1=0)) Then
						v6=v1*chunksize
					Else If (v4=chunkheight-1 And (v1=(levelheight-1)/chunksize)) Then
						v6=(v1*chunksize+chunkheight)-3
					Else
						v6=(v1*chunksize+v4)-1
					End If
					chunktiletexture(v3,v4)=leveltiletexture(v5,v6)
					chunktilerotation(v3,v4)=leveltilerotation(v5,v6)
					chunktilesidetexture(v3,v4)=leveltilesidetexture(v5,v6)
					chunktilesiderotation(v3,v4)=leveltilesiderotation(v5,v6)
					chunktilerandom(v3,v4)=leveltilerandom(v5,v6)
					chunktileextrusion(v3,v4)=leveltileextrusion(v5,v6)
					chunktilerounding(v3,v4)=leveltilerounding(v5,v6)
					chunktileedgerandom(v3,v4)=leveltileedgerandom(v5,v6)
					chunktileheight(v3,v4)=leveltileheight(v5,v6)
					chunkwatertiletexture(v3,v4)=watertiletexture(v5,v6)
					chunkwatertilerotation(v3,v4)=watertilerotation(v5,v6)
					chunkwatertileheight(v3,v4)=watertileheight(v5,v6)
					If watertileturbulence(v5,v6)>0.0 Then
						waterturbulenceglobal=1
					End If
					If chunkwatertiletexture(v3,v4)<0 Then
						chunkwatertileheight(v3,v4)=-10.0
					End If
					;v4=v4+1
				Next
				;v3=v3+1
			Next
			createlevelchunk(v2*chunksize-1,v1*chunksize-1)
			currentlevelchunk=currentlevelchunk+1
			;v2=v2+1
		Next
		;v1=v1+1
	Next
	Select leveledgestyle
	Case 0
	Case 1
		backgroundentity1=CreateMesh(0)
		v8=CreateSurface(backgroundentity1,0)
		AddVertex(v8,-10.0,1.0,10.0,0.0,0.0,1.0)
		AddVertex(v8,levelwidth+10,1.0,10.0,levelwidth+20,0.0,1.0)
		AddVertex(v8,-10.0,1.0,0.0,0.0,10.0,1.0)
		AddVertex(v8,levelwidth+10,1.0,0.0,levelwidth+20,10.0,1.0)
		AddTriangle(v8,0,1,2)
		AddTriangle(v8,2,1,3)
		AddVertex(v8,-10.0,1.0,-levelheight,0.0,0.0,1.0)
		AddVertex(v8,levelwidth+10,1.0,-levelheight,levelwidth+20,0.0,1.0)
		AddVertex(v8,-10.0,1.0,(-levelheight)-10,0.0,10.0,1.0)
		AddVertex(v8,levelwidth+10,1.0,(-levelheight)-10,levelwidth+20,10.0,1.0)
		AddTriangle(v8,4,5,6)
		AddTriangle(v8,6,5,7)
		AddVertex(v8,-10.0,1.0,0.0,0.0,0.0,1.0)
		AddVertex(v8,0.0,1.0,0.0,10.0,0.0,1.0)
		AddVertex(v8,-10.0,1.0,-levelheight,0.0,levelheight,1.0)
		AddVertex(v8,0.0,1.0,-levelheight,10.0,levelheight,1.0)
		AddTriangle(v8,8,9,10)
		AddTriangle(v8,10,9,11)
		AddVertex(v8,levelwidth,1.0,0.0,0.0,0.0,1.0)
		AddVertex(v8,levelwidth+10,1.0,0.0,10.0,0.0,1.0)
		AddVertex(v8,levelwidth,1.0,-levelheight,0.0,levelheight,1.0)
		AddVertex(v8,levelwidth+10,1.0,-levelheight,10.0,levelheight,1.0)
		AddTriangle(v8,12,13,14)
		AddTriangle(v8,14,13,15)
		UpdateNormals backgroundentity1
		v9$=Mid$(leveltexturename,10,(Len(leveltexturename)-9)-4)
		If usecustomleveltexture=1 Then
			EntityTexture backgroundentity1,custombgtexture1,0,0
		Else
			EntityTexture backgroundentity1,backgroundtexture1(whichleveltexture(v9$)),0,0
		End If
		backgroundentity2=CreateMesh(0)
		v8=CreateSurface(backgroundentity2,0)
		AddVertex(v8,0.0,1.0,0.0,0.0,0.0,1.0)
		AddVertex(v8,levelwidth,1.0,0.0,levelwidth,0.0,1.0)
		AddVertex(v8,0.0,0.0,0.0,0.0,1.0,1.0)
		AddVertex(v8,levelwidth,0.0,0.0,levelwidth,1.0,1.0)
		AddTriangle(v8,0,1,2)
		AddTriangle(v8,2,1,3)
		AddVertex(v8,levelwidth,1.0,0.0,0.0,0.0,1.0)
		AddVertex(v8,levelwidth,1.0,-levelheight,levelheight,0.0,1.0)
		AddVertex(v8,levelwidth,0.0,0.0,0.0,1.0,1.0)
		AddVertex(v8,levelwidth,0.0,-levelheight,levelheight,1.0,1.0)
		AddTriangle(v8,4,5,6)
		AddTriangle(v8,6,5,7)
		AddVertex(v8,levelwidth,1.0,-levelheight,0.0,0.0,1.0)
		AddVertex(v8,0.0,1.0,-levelheight,levelwidth,0.0,1.0)
		AddVertex(v8,levelwidth,0.0,-levelheight,0.0,1.0,1.0)
		AddVertex(v8,0.0,0.0,-levelheight,levelwidth,1.0,1.0)
		AddTriangle(v8,8,9,10)
		AddTriangle(v8,10,9,11)
		AddVertex(v8,0.0,1.0,-levelheight,0.0,0.0,1.0)
		AddVertex(v8,0.0,1.0,0.0,levelheight,0.0,1.0)
		AddVertex(v8,0.0,0.0,-levelheight,0.0,1.0,1.0)
		AddVertex(v8,0.0,0.0,0.0,levelheight,1.0,1.0)
		AddTriangle(v8,12,13,14)
		AddTriangle(v8,14,13,15)
		UpdateNormals backgroundentity2
		If usecustomleveltexture=1 Then
			EntityTexture backgroundentity2,custombgtexture2,0,0
		Else
			EntityTexture backgroundentity2,backgroundtexture2(whichleveltexture(v9$)),0,0
		End If
	End Select
End Function

Function createlevelchunk(a0,a1)
	
	levelentity(currentlevelchunk)=CreateMesh(0)
	levelsurface(currentlevelchunk)=CreateSurface(levelentity(currentlevelchunk),0)
	v1=levelsurface(currentlevelchunk)
	;v2=1
	For v2=1 To chunkheight-2
		;v3=1
		For v3=1 To chunkwidth-2
			;v4=0
			For v4=0 To leveldetail
				;v5=0
				For v5=0 To leveldetail
					v6#=0.0
					v7#=0.0
					v8#=0.0
					If (((v4=0 Or (v4=leveldetail)) Or (v5=0)) Or (v5=leveldetail)) Then
						If v5=0 Then
							v6#=-0.005
						End If
						If v4=0 Then
							v7#=0.005
						End If
						v9=0
					End If
					calculateuv(chunktiletexture(v3,v2),v5,v4,chunktilerotation(v3,v2),8)
					AddVertex(v1,a0+v3+(Float(v5)/Float(leveldetail))+v6#,v9+v8#,-Float(Float(v4)/Float(leveldetail)+(a1+v2))+v7#,chunktileu,chunktilev,1.0)
					;v5=v5+1
				Next
				;v4=v4+1
			Next
			;v4=0
			For v4=0 To leveldetail-1
				;v5=0
				For v5=0 To leveldetail-1
					AddTriangle(v1,getlevelvertex(v3,v2,v5,v4),getlevelvertex(v3,v2,v5+1,v4),getlevelvertex(v3,v2,v5,v4+1))
					AddTriangle(v1,getlevelvertex(v3,v2,v5+1,v4),getlevelvertex(v3,v2,v5+1,v4+1),getlevelvertex(v3,v2,v5,v4+1))
					;v5=v5+1
				Next
				;v4=v4+1
			Next
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	;v2=1
	For v2=1 To chunkheight-2
		;v3=1
		For v3=1 To chunkwidth-2
			;v5=0
			For v5=0 To leveldetail
				;v4=0
				For v4=0 To leveldetail
					If (v5=0 And (v4=0)) Then
						v10#=minimum4(chunktilerandom(v3-1,v2-1),chunktilerandom(v3,v2-1),chunktilerandom(v3-1,v2),chunktilerandom(v3,v2))
					Else If (v4=0 And (v5=leveldetail)) Then
						v10#=minimum4(chunktilerandom(v3+1,v2-1),chunktilerandom(v3,v2-1),chunktilerandom(v3+1,v2),chunktilerandom(v3,v2))
					Else If (v4=leveldetail And (v5=0)) Then
						v10#=minimum4(chunktilerandom(v3-1,v2+1),chunktilerandom(v3-1,v2),chunktilerandom(v3,v2+1),chunktilerandom(v3,v2))
					Else If (v5=leveldetail And (v4=leveldetail)) Then
						v10#=minimum4(chunktilerandom(v3+1,v2+1),chunktilerandom(v3,v2+1),chunktilerandom(v3+1,v2),chunktilerandom(v3,v2))
					Else If v4=0 Then
						v10#=minimum2(chunktilerandom(v3,v2-1),chunktilerandom(v3,v2))
					Else If v4=leveldetail Then
						v10#=minimum2(chunktilerandom(v3,v2+1),chunktilerandom(v3,v2))
					Else If v5=0 Then
						v10#=minimum2(chunktilerandom(v3-1,v2),chunktilerandom(v3,v2))
					Else If v5=leveldetail Then
						v10#=minimum2(chunktilerandom(v3+1,v2),chunktilerandom(v3,v2))
					Else
						v10#=chunktilerandom(v3,v2)
					End If
					v11=getlevelvertex(v3,v2,v5,v4)
					v12#=v10#*levelvertexrandom(v5,v4)
					VertexCoords v1,v11,VertexX(v1,v11),VertexY(v1,v11)+v12#,VertexZ(v1,v11)
					;v4=v4+1
				Next
				;v5=v5+1
			Next
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	If (leveldetail<2 Or (Floor(leveldetail/2)*2.0<>leveldetail)) Then
		Goto nolevelheight
	End If
	Dim chunkstoredvheight#((leveldetail+1)*chunkwidth)
	;v2=0
	For v2=0 To chunkheight-1
		;v3=0
		For v3=0 To chunkwidth-1
			;v5=0
			For v5=0 To leveldetail
				If v5<leveldetail/2 Then
					If v3=0 Then
						v13#=0.0
					Else
						v13#=chunktileheight(v3-1,v2)
					End If
					v14#=v13#+((chunktileheight(v3,v2)-v13#)*(leveldetail/2.0+v5))/leveldetail
				Else
					If v3=chunkwidth-1 Then
						v13#=0.0
					Else
						v13#=chunktileheight(v3+1,v2)
					End If
					v14#=chunktileheight(v3,v2)+(v13#-chunktileheight(v3,v2))*(v5-(leveldetail/2))/leveldetail
				End If
				If (((v3>0 And (v2>0)) And (v3<chunkwidth-1)) And (v2<chunkheight-1)) Then
					v11=getlevelvertex(v3,v2,v5,leveldetail/2)
					VertexCoords v1,v11,VertexX(v1,v11),VertexY(v1,v11)+v14#,VertexZ(v1,v11)
				End If
				If v2>0 Then
					;v4=leveldetail/2+1
					For v4=leveldetail/2+1 To leveldetail
						v13#=chunkstoredvheight(((leveldetail+1)*v3+v5))
						v15#=v13#+(v14#-v13#)*(v4-(leveldetail/2))/leveldetail
						If ((v3>0 And (v2>1)) And (v3<chunkwidth-1)) Then
							v11=getlevelvertex(v3,v2-1,v5,v4)
							VertexCoords v1,v11,VertexX(v1,v11),VertexY(v1,v11)+v15#,VertexZ(v1,v11)
						End If
						;v4=v4+1
					Next
					;v4=0
					For v4=0 To leveldetail/2-1
						v13#=chunkstoredvheight(((leveldetail+1)*v3+v5))
						v15#=v13#+(v14#-v13#)*(leveldetail/2+v4)/leveldetail
						If (((v3>0 And (v2>0)) And (v3<chunkwidth-1)) And (v2<chunkheight-1)) Then
							v11=getlevelvertex(v3,v2,v5,v4)
							VertexCoords v1,v11,VertexX(v1,v11),VertexY(v1,v11)+v15#,VertexZ(v1,v11)
						End If
						;v4=v4+1
					Next
				End If
				chunkstoredvheight(((leveldetail+1)*v3+v5))=v14#
				;v5=v5+1
			Next
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	.nolevelheight
	;v2=1
	For v2=1 To chunkheight-2
		;v3=1
		For v3=1 To chunkwidth-2
			;v4=0
			For v4=0 To leveldetail
				;v5=0
				For v5=0 To leveldetail
					v11=getlevelvertex(v3,v2,v5,v4)
					VertexCoords v1,v11,VertexX(v1,v11),VertexY(v1,v11)+chunktileextrusion(v3,v2),VertexZ(v1,v11)
					;v5=v5+1
				Next
				;v4=v4+1
			Next
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	;v2=1
	For v2=1 To chunkheight-2
		;v3=1
		For v3=1 To chunkwidth-2
			If chunktilerounding(v3,v2)=1 Then
				If ((chunktileextrusion(v3+1,v2)<chunktileextrusion(v3,v2) And (chunktileextrusion(v3,v2-1)<chunktileextrusion(v3,v2))) And (chunktileextrusion(v3+1,v2)=chunktileextrusion(v3,v2-1))) Then
					;v5=leveldetail/2+1
					For v5=leveldetail/2+1 To leveldetail
						;v4=leveldetail/2+1
						For v4=leveldetail/2+1 To leveldetail
							v11=getlevelvertex(v3,v2,v5,leveldetail-v4)
							v16#=Float(v5-(leveldetail/2))/Float(leveldetail/2)
							v17#=Float(v4-(leveldetail/2))/Float(leveldetail/2)
							v18#=(maximum2(v5,v4)-(leveldetail/2))/(leveldetail/2)
							v19#=v18#/Sqr(1.0+v17#^2.0/v16#^2.0)
							v20#=Sqr(v18#^2.0-v19#^2.0)
							VertexCoords v1,v11,a0+v3+0.5+v19#/2.0,VertexY(v1,v11),-Float((a1+v2+0.5)-(v20#/2.0))
							;v4=v4+1
						Next
						;v5=v5+1
					Next
				End If
				If ((chunktileextrusion(v3+1,v2)<chunktileextrusion(v3,v2) And (chunktileextrusion(v3,v2+1)<chunktileextrusion(v3,v2))) And (chunktileextrusion(v3+1,v2)=chunktileextrusion(v3,v2+1))) Then
					;v5=leveldetail/2+1
					For v5=leveldetail/2+1 To leveldetail
						;v4=leveldetail/2+1
						For v4=leveldetail/2+1 To leveldetail
							v11=getlevelvertex(v3,v2,v5,v4)
							v16#=Float(v5-(leveldetail/2))/Float(leveldetail/2)
							v17#=Float(v4-(leveldetail/2))/Float(leveldetail/2)
							v18#=(maximum2(v5,v4)-(leveldetail/2))/(leveldetail/2)
							v19#=v18#/Sqr(1.0+v17#^2.0/v16#^2.0)
							v20#=Sqr(v18#^2.0-v19#^2.0)
							VertexCoords v1,v11,a0+v3+0.5+v19#/2.0,VertexY(v1,v11),-Float(a1+v2+0.5+v20#/2.0)
							;v4=v4+1
						Next
						;v5=v5+1
					Next
				End If
				If ((chunktileextrusion(v3-1,v2)<chunktileextrusion(v3,v2) And (chunktileextrusion(v3,v2+1)<chunktileextrusion(v3,v2))) And (chunktileextrusion(v3-1,v2)=chunktileextrusion(v3,v2+1))) Then
					;v5=leveldetail/2+1
					For v5=leveldetail/2+1 To leveldetail
						;v4=leveldetail/2+1
						For v4=leveldetail/2+1 To leveldetail
							v11=getlevelvertex(v3,v2,leveldetail-v5,v4)
							v16#=Float(v5-(leveldetail/2))/Float(leveldetail/2)
							v17#=Float(v4-(leveldetail/2))/Float(leveldetail/2)
							v18#=(maximum2(v5,v4)-(leveldetail/2))/(leveldetail/2)
							v19#=v18#/Sqr(1.0+v17#^2.0/v16#^2.0)
							v20#=Sqr(v18#^2.0-v19#^2.0)
							VertexCoords v1,v11,(a0+v3+0.5)-(v19#/2.0),VertexY(v1,v11),-Float(a1+v2+0.5+v20#/2.0)
							;v4=v4+1
						Next
						;v5=v5+1
					Next
				End If
				If ((chunktileextrusion(v3-1,v2)<chunktileextrusion(v3,v2) And (chunktileextrusion(v3,v2-1)<chunktileextrusion(v3,v2))) And (chunktileextrusion(v3-1,v2)=chunktileextrusion(v3,v2-1))) Then
					;v5=leveldetail/2+1
					For v5=leveldetail/2+1 To leveldetail
						;v4=leveldetail/2+1
						For v4=leveldetail/2+1 To leveldetail
							v11=getlevelvertex(v3,v2,leveldetail-v5,leveldetail-v4)
							v16#=Float(v5-(leveldetail/2))/Float(leveldetail/2)
							v17#=Float(v4-(leveldetail/2))/Float(leveldetail/2)
							v18#=(maximum2(v5,v4)-(leveldetail/2))/(leveldetail/2)
							v19#=v18#/Sqr(1.0+v17#^2.0/v16#^2.0)
							v20#=Sqr(v18#^2.0-v19#^2.0)
							VertexCoords v1,v11,(a0+v3+0.5)-(v19#/2.0),VertexY(v1,v11),-Float((a1+v2+0.5)-(v20#/2.0))
							;v4=v4+1
						Next
						;v5=v5+1
					Next
				End If
			End If
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	v21#=0.1
	;v2=1
	For v2=1 To chunkheight-2
		;v3=1
		For v3=1 To chunkwidth-2
			If chunktileedgerandom(v3,v2)=1 Then
				If chunktileextrusion(v3,v2-1)<chunktileextrusion(v3,v2) Then
					v4=0
					;v5=0
					For v5=0 To leveldetail
						v11=getlevelvertex(v3,v2,v5,v4)
						If v5=0 Then
							If chunktileextrusion(v3-1,v2)=chunktileextrusion(v3,v2-1) Then
								v10#=1.0
							Else
								v10#=0.0
							End If
						Else If v5=leveldetail Then
							If chunktileextrusion(v3+1,v2)=chunktileextrusion(v3,v2-1) Then
								v10#=1.0
							Else
								v10#=0.0
							End If
						Else
							v10#=Rnd(0.0,1.0)
						End If
						VertexCoords v1,v11,VertexX(v1,v11),VertexY(v1,v11),VertexZ(v1,v11)-(v10#*v21#)
						;v5=v5+1
					Next
				End If
				If chunktileextrusion(v3+1,v2)<chunktileextrusion(v3,v2) Then
					v5=leveldetail
					;v4=0
					For v4=0 To leveldetail
						v11=getlevelvertex(v3,v2,v5,v4)
						If v4=0 Then
							If chunktileextrusion(v3+1,v2)=chunktileextrusion(v3,v2-1) Then
								v10#=1.0
							Else
								v10#=0.0
							End If
						Else If v4=leveldetail Then
							If chunktileextrusion(v3+1,v2)=chunktileextrusion(v3,v2+1) Then
								v10#=1.0
							Else
								v10#=0.0
							End If
						Else
							v10#=Rnd(0.0,1.0)
						End If
						VertexCoords v1,v11,VertexX(v1,v11)-(v10#*v21#),VertexY(v1,v11),VertexZ(v1,v11)
						;v4=v4+1
					Next
				End If
				If chunktileextrusion(v3,v2+1)<chunktileextrusion(v3,v2) Then
					v4=leveldetail
					;v5=0
					For v5=0 To leveldetail
						v11=getlevelvertex(v3,v2,v5,v4)
						If v5=0 Then
							If chunktileextrusion(v3-1,v2)=chunktileextrusion(v3,v2+1) Then
								v10#=1.0
							Else
								v10#=0.0
							End If
						Else If v5=leveldetail Then
							If chunktileextrusion(v3+1,v2)=chunktileextrusion(v3,v2+1) Then
								v10#=1.0
							Else
								v10#=0.0
							End If
						Else
							v10#=Rnd(0.0,1.0)
						End If
						VertexCoords v1,v11,VertexX(v1,v11),VertexY(v1,v11),VertexZ(v1,v11)+v10#*v21#
						;v5=v5+1
					Next
				End If
				If chunktileextrusion(v3-1,v2)<chunktileextrusion(v3,v2) Then
					v5=0
					;v4=0
					For v4=0 To leveldetail
						v11=getlevelvertex(v3,v2,v5,v4)
						If v4=0 Then
							If chunktileextrusion(v3-1,v2)=chunktileextrusion(v3,v2-1) Then
								v10#=1.0
							Else
								v10#=0.0
							End If
						Else If v4=leveldetail Then
							If chunktileextrusion(v3-1,v2)=chunktileextrusion(v3,v2+1) Then
								v10#=1.0
							Else
								v10#=0.0
							End If
						Else
							v10#=Rnd(0.0,1.0)
						End If
						VertexCoords v1,v11,VertexX(v1,v11)+v10#*v21#,VertexY(v1,v11),VertexZ(v1,v11)
						;v4=v4+1
					Next
				End If
			End If
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	v22=getlevelvertex(chunkwidth-2,chunkheight-2,leveldetail,leveldetail)+1
	;v2=1
	For v2=1 To chunkheight-2
		;v3=1
		For v3=1 To chunkwidth-2
			If chunktileedgerandom(v3,v2)=1 Then
				v21#=0.2
			Else
				v21#=0.0
			End If
			v23#=0.0
			v10#=0.0
			If chunktileextrusion(v3,v2-1)<chunktileextrusion(v3,v2) Then
				;v5=0
				For v5=0 To leveldetail-1
					v11=getlevelvertex(v3,v2,leveldetail-v5,0)
					calculateuv(chunktilesidetexture(v3,v2),v5,0,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,VertexX(v1,v11),VertexY(v1,v11),VertexZ(v1,v11)-v23#,chunktileu,chunktilev,1.0)
					v11=getlevelvertex(v3,v2,(leveldetail-v5)-1,0)
					calculateuv(chunktilesidetexture(v3,v2),v5+1,0,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,VertexX(v1,v11),VertexY(v1,v11),VertexZ(v1,v11)-v23#,chunktileu,chunktilev,1.0)
					v11=getlevelvertex(v3,v2,leveldetail-v5,0)
					calculateuv(chunktilesidetexture(v3,v2),v5,leveldetail,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,a0+v3+(Float(leveldetail-v5)/Float(leveldetail)),VertexY(v1,v11)-chunktileextrusion(v3,v2)+chunktileextrusion(v3,v2-1),(-a1)-v2+v10#,chunktileu,chunktilev,1.0)
					v11=getlevelvertex(v3,v2,(leveldetail-v5)-1,0)
					If v5<leveldetail-1 Then
						v10#=Rnd(0.0,v21#)
					Else
						v10#=0.0
					End If
					calculateuv(chunktilesidetexture(v3,v2),v5+1,leveldetail,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,a0+v3+((Float((leveldetail-v5)-1))/Float(leveldetail)),VertexY(v1,v11)-chunktileextrusion(v3,v2)+chunktileextrusion(v3,v2-1),(-a1)-v2+v10#,chunktileu,chunktilev,1.0)
					AddTriangle(v1,v22,v22+1,v22+2)
					AddTriangle(v1,v22+1,v22+3,v22+2)
					v22=v22+4
					;v5=v5+1
				Next
			End If
			v10#=0.0
			If chunktileextrusion(v3+1,v2)<chunktileextrusion(v3,v2) Then
				;v4=0
				For v4=0 To leveldetail-1
					v11=getlevelvertex(v3,v2,leveldetail,leveldetail-v4)
					calculateuv(chunktilesidetexture(v3,v2),v4,0,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,VertexX(v1,v11)-v23#,VertexY(v1,v11),VertexZ(v1,v11),chunktileu,chunktilev,1.0)
					v11=getlevelvertex(v3,v2,leveldetail,(leveldetail-v4)-1)
					calculateuv(chunktilesidetexture(v3,v2),v4+1,0,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,VertexX(v1,v11)-v23#,VertexY(v1,v11),VertexZ(v1,v11),chunktileu,chunktilev,1.0)
					v11=getlevelvertex(v3,v2,leveldetail,leveldetail-v4)
					calculateuv(chunktilesidetexture(v3,v2),v4,leveldetail,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,a0+v3+1+v10#,VertexY(v1,v11)-chunktileextrusion(v3,v2)+chunktileextrusion(v3+1,v2),-Float(Float(leveldetail-v4)/Float(leveldetail)+(a1+v2)),chunktileu,chunktilev,1.0)
					v11=getlevelvertex(v3,v2,leveldetail,(leveldetail-v4)-1)
					If v4<leveldetail-1 Then
						v10#=Rnd(0.0,v21#)
					Else
						v10#=0.0
					End If
					calculateuv(chunktilesidetexture(v3,v2),v4+1,leveldetail,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,a0+v3+1+v10#,VertexY(v1,v11)-chunktileextrusion(v3,v2)+chunktileextrusion(v3+1,v2),-Float((Float((leveldetail-v4)-1))/Float(leveldetail)+(a1+v2)),chunktileu,chunktilev,1.0)
					AddTriangle(v1,v22,v22+1,v22+2)
					AddTriangle(v1,v22+1,v22+3,v22+2)
					v22=v22+4
					;v4=v4+1
				Next
			End If
			v10#=0.0
			If chunktileextrusion(v3,v2+1)<chunktileextrusion(v3,v2) Then
				;v5=0
				For v5=0 To leveldetail-1
					v11=getlevelvertex(v3,v2,v5,leveldetail)
					calculateuv(chunktilesidetexture(v3,v2),v5,0,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,VertexX(v1,v11),VertexY(v1,v11),VertexZ(v1,v11)+v23#,chunktileu,chunktilev,1.0)
					v11=getlevelvertex(v3,v2,v5+1,leveldetail)
					calculateuv(chunktilesidetexture(v3,v2),v5+1,0,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,VertexX(v1,v11),VertexY(v1,v11),VertexZ(v1,v11)+v23#,chunktileu,chunktilev,1.0)
					v11=getlevelvertex(v3,v2,v5,leveldetail)
					calculateuv(chunktilesidetexture(v3,v2),v5,leveldetail,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,a0+v3+(Float(v5)/Float(leveldetail)),VertexY(v1,v11)-chunktileextrusion(v3,v2)+chunktileextrusion(v3,v2+1),-Float(a1+v2+1+v10#),chunktileu,chunktilev,1.0)
					v11=getlevelvertex(v3,v2,v5+1,leveldetail)
					If v5<leveldetail-1 Then
						v10#=Rnd(0.0,v21#)
					Else
						v10#=0.0
					End If
					calculateuv(chunktilesidetexture(v3,v2),v5+1,leveldetail,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,a0+v3+(Float(v5+1)/Float(leveldetail)),VertexY(v1,v11)-chunktileextrusion(v3,v2)+chunktileextrusion(v3,v2+1),-Float(a1+v2+1+v10#),chunktileu,chunktilev,1.0)
					AddTriangle(v1,v22,v22+1,v22+2)
					AddTriangle(v1,v22+1,v22+3,v22+2)
					v22=v22+4
					;v5=v5+1
				Next
			End If
			v10#=0.0
			If chunktileextrusion(v3-1,v2)<chunktileextrusion(v3,v2) Then
				;v4=0
				For v4=0 To leveldetail-1
					v11=getlevelvertex(v3,v2,0,v4)
					calculateuv(chunktilesidetexture(v3,v2),v4,0,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,VertexX(v1,v11)+v23#,VertexY(v1,v11),VertexZ(v1,v11),chunktileu,chunktilev,1.0)
					v11=getlevelvertex(v3,v2,0,v4+1)
					calculateuv(chunktilesidetexture(v3,v2),v4+1,0,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,VertexX(v1,v11)+v23#,VertexY(v1,v11),VertexZ(v1,v11),chunktileu,chunktilev,1.0)
					v11=getlevelvertex(v3,v2,0,v4)
					calculateuv(chunktilesidetexture(v3,v2),v4,leveldetail,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,(a0+v3)-v10#,VertexY(v1,v11)-chunktileextrusion(v3,v2)+chunktileextrusion(v3-1,v2),-Float(Float(v4)/Float(leveldetail)+(a1+v2)),chunktileu,chunktilev,1.0)
					v11=getlevelvertex(v3,v2,0,v4+1)
					If v4<leveldetail-1 Then
						v10#=Rnd(0.0,v21#)
					Else
						v10#=0.0
					End If
					calculateuv(chunktilesidetexture(v3,v2),v4+1,leveldetail,chunktilesiderotation(v3,v2),8)
					AddVertex(v1,(a0+v3)-v10#,VertexY(v1,v11)-chunktileextrusion(v3,v2)+chunktileextrusion(v3-1,v2),-Float(Float(v4+1)/Float(leveldetail)+(a1+v2)),chunktileu,chunktilev,1.0)
					AddTriangle(v1,v22,v22+1,v22+2)
					AddTriangle(v1,v22+1,v22+3,v22+2)
					v22=v22+4
					;v4=v4+1
				Next
			End If
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	UpdateNormals levelentity(currentlevelchunk)
	;v2=1
	For v2=1 To chunkheight-2
		;v3=1
		For v3=1 To chunkwidth-2
			;v5=0
			For v5=0 To leveldetail
				;v4=0
				For v4=0 To leveldetail
					If (((v5=0 Or (v5=leveldetail)) Or (v4=0)) Or (v4=leveldetail)) Then
						v11=getlevelvertex(v3,v2,v5,v4)
						VertexNormal v1,v11,0.0,1.0,0.0
					End If
					;v4=v4+1
				Next
				;v5=v5+1
			Next
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	v24$=Mid$(leveltexturename,10,(Len(leveltexturename)-9)-4)
	If usecustomleveltexture=1 Then
		EntityTexture levelentity(currentlevelchunk),customleveltexture,0,0
	Else
		EntityTexture levelentity(currentlevelchunk),leveltexture(whichleveltexture(v24$)),0,0
	End If
	waterentity(currentlevelchunk)=CreateMesh(0)
	watersurface(currentlevelchunk)=CreateSurface(waterentity(currentlevelchunk),0)
	v1=watersurface(currentlevelchunk)
	;v2=1
	For v2=1 To chunkheight-2
		;v3=1
		For v3=1 To chunkwidth-2
			calculateuv(chunkwatertiletexture(v3,v2),0,0,chunkwatertilerotation(v3,v2),4)
			AddVertex(v1,a0+v3,chunkwatertileheight(v3,v2),(-a1)-v2,chunktileu,chunktilev,1.0)
			calculateuv(chunkwatertiletexture(v3,v2),leveldetail,0,chunkwatertilerotation(v3,v2),4)
			AddVertex(v1,a0+v3+1,chunkwatertileheight(v3,v2),(-a1)-v2,chunktileu,chunktilev,1.0)
			calculateuv(chunkwatertiletexture(v3,v2),0,leveldetail,chunkwatertilerotation(v3,v2),4)
			AddVertex(v1,a0+v3,chunkwatertileheight(v3,v2),((-a1)-v2)-1,chunktileu,chunktilev,1.0)
			calculateuv(chunkwatertiletexture(v3,v2),leveldetail,leveldetail,chunkwatertilerotation(v3,v2),4)
			AddVertex(v1,a0+v3+1,chunkwatertileheight(v3,v2),((-a1)-v2)-1,chunktileu,chunktilev,1.0)
			AddTriangle(v1,(v3-1)*4+(v2-1)*4*(chunkwidth-2)+0,(v3-1)*4+(v2-1)*4*(chunkwidth-2)+1,(v3-1)*4+(v2-1)*4*(chunkwidth-2)+2)
			AddTriangle(v1,(v3-1)*4+(v2-1)*4*(chunkwidth-2)+1,(v3-1)*4+(v2-1)*4*(chunkwidth-2)+3,(v3-1)*4+(v2-1)*4*(chunkwidth-2)+2)
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	UpdateNormals waterentity(currentlevelchunk)
	If waterglow=1 Then
		EntityBlend waterentity(currentlevelchunk),3
	Else
		EntityBlend waterentity(currentlevelchunk),1
	End If
	If watertransparent=1 Then
		EntityAlpha waterentity(currentlevelchunk),0.5
	Else
		EntityAlpha waterentity(currentlevelchunk),1.0
	End If
	If usecustomwatertexture=1 Then
		EntityTexture waterentity(currentlevelchunk),customwatertexture,0,0
	Else
		EntityTexture waterentity(currentlevelchunk),watertexture(0),0,0
	End If
	TranslateEntity waterentity(currentlevelchunk),0.0,-0.04,0.0,0
End Function

Function getlevelvertex(a0,a1,a2,a3)
	
	a0=a0-1
	a1=a1-1
	v1=(((chunkwidth-2)*a1+a0)*(leveldetail+1))*(leveldetail+1)
	v1=(leveldetail+1)*a3+v1+a2
	Return v1
End Function

Function levelvertexrandom#(a0#,a1#)
	
	If (((Floor(a0#)>0.0 And (Floor(a1#)>0.0)) And (Floor(a0#)<leveldetail)) And (Floor(a1#)<leveldetail)) Then
		Return Rnd(0.0,1.0)
	End If
	a0#=Abs(a0#-(leveldetail/2))
	a1#=Abs(a1#-(leveldetail/2))
	v1#=(a0#+0.59)*(a1#+0.73)*241783.0
	v2=v1#
	v2=v2 Mod 700+v2 Mod 300
	v1#=v2/1000.0
	Return v1#
End Function

Function calculateuv(a0,a1,a2,a3,a4)
	
	v1#=0.0
	v2#=0.0
	chunktileu=Float(a0 Mod a4)/Float(a4)+(Float(Float(a1)/Float(leveldetail))/Float(a4))
	chunktilev=Float(a0/a4)/Float(a4)+(Float(Float(a2)/Float(leveldetail))/Float(a4))
	If (((a2=0 Or (a2=leveldetail)) Or (a1=0)) Or (a1=leveldetail)) Then
		If a1=0 Then
			v1#=0.002
		Else If a1=leveldetail Then
			v1#=-0.002
		Else
			v1#=0.0
		End If
		If a2=0 Then
			v2#=0.002
		Else If a2=leveldetail Then
			v2#=-0.002
		Else
			v2#=0.0
		End If
	End If
	Select a3
	Case 0
		chunktileu=Float(a0 Mod a4)/Float(a4)+(Float(Float(a1)/Float(leveldetail))/Float(a4))+v1#
		chunktilev=Float(a0/a4)/Float(a4)+(Float(Float(a2)/Float(leveldetail))/Float(a4))+v2#
	Case 1
		chunktileu=Float(a0 Mod a4+0)/Float(a4)+(Float(Float(a2)/Float(leveldetail))/Float(a4))+v2#
		chunktilev=(Float(a0/a4+1)/Float(a4)-Float(Float(a1)/Float(leveldetail))/Float(a4))-v1#
	Case 2
		chunktileu=(Float(a0 Mod a4+1)/Float(a4)-Float(Float(a1)/Float(leveldetail))/Float(a4))-v1#
		chunktilev=(Float(a0/a4+1)/Float(a4)-Float(Float(a2)/Float(leveldetail))/Float(a4))-v2#
	Case 3
		chunktileu=(Float(a0 Mod a4+1)/Float(a4)-Float(Float(a2)/Float(leveldetail))/Float(a4))-v2#
		chunktilev=Float(a0/a4)/Float(a4)+(Float(Float(a1)/Float(leveldetail))/Float(a4))+v1#
	Case 4
		chunktileu=(Float(a0 Mod a4+1)/Float(a4)-Float(Float(a1)/Float(leveldetail))/Float(a4))-v1#
		chunktilev=Float(a0/a4)/Float(a4)+(Float(Float(a2)/Float(leveldetail))/Float(a4))+v2#
	Case 7
		chunktileu=Float(a0 Mod a4+0)/Float(a4)+(Float(Float(a2)/Float(leveldetail))/Float(a4))+v2#
		chunktilev=Float(a0/a4+0)/Float(a4)+(Float(Float(a1)/Float(leveldetail))/Float(a4))+v1#
	Case 6
		chunktileu=Float(a0 Mod a4+0)/Float(a4)+(Float(Float(a1)/Float(leveldetail))/Float(a4))+v1#
		chunktilev=(Float(a0/a4+1)/Float(a4)-Float(Float(a2)/Float(leveldetail))/Float(a4))-v2#
	Case 5
		chunktileu=(Float(a0 Mod a4+1)/Float(a4)-Float(Float(a2)/Float(leveldetail))/Float(a4))-v2#
		chunktilev=(Float(a0/a4+1)/Float(a4)-Float(Float(a1)/Float(leveldetail))/Float(a4))-v1#
	Default
		chunktileu=Float(a0 Mod a4)/Float(a4)+(Float(Float(a1)/Float(leveldetail))/Float(a4))+v1#
		chunktilev=Float(a0/a4)/Float(a4)+(Float(Float(a2)/Float(leveldetail))/Float(a4))+v2#
	End Select
End Function

Function updatewater(a0,a1,a2)
	
	PositionTexture waterfalltexture,0.0,leveltimer Mod 50/50.0
	If waterflow>=0 Then
		PositionTexture watertexture(0),0.0,(-(leveltimer*4*waterflow Mod 10000))/10000.0
		If customwatertexture>0 Then
			PositionTexture customwatertexture,0.0,(-(leveltimer*4*waterflow Mod 10000))/10000.0
		End If
	End If
	If waterflow<0 Then
		PositionTexture watertexture(0),0.0,0.5+0.125*waterflow/4.0*Sin((-(leveltimer*4*waterflow))/10.0)
		If customwatertexture>0 Then
			PositionTexture customwatertexture,0.0,0.5+0.125*waterflow/4.0*Sin((-(leveltimer*4*waterflow))/10.0)
		End If
	End If
	If (waterturbulenceglobal=1 And (leveltimer<1000000000)) Then
		;v1=Floor(a1)-a2
		For v1=Floor(a1)-a2 To Floor(a1)+a2
			;v2=Floor(a0)-a2
			For v2=Floor(a0)-a2 To Floor(a0)+a2
				If (((v2>=0 And (v1>=0)) And (v2<levelwidth)) And (v1<levelheight)) Then
					If (watertiletexture(v2,v1)>=0 And (watertileturbulence(v2,v1)>0.0)) Then
						v3=Floor((levelwidth-1)/chunksize)+1.0
						v4=Floor(v2/chunksize)+Floor(v1/chunksize)*v3
						If v2>=(v3-1)*chunksize Then
							v5=(levelwidth-1) Mod chunksize+1
						Else
							v5=chunksize
						End If
						v6=v2 Mod chunksize
						v7=v1 Mod chunksize
						v8=watersurface(v4)
						VertexCoords v8,(v7*v5+v6)*4+0,VertexX(v8,(v7*v5+v6)*4+0),watertileheight(v2,v1)+Cos(v6 Mod 4*90+leveltimer+v7 Mod 2*180)*watertileturbulence(v2,v1),VertexZ(v8,(v7*v5+v6)*4+0)
						VertexCoords v8,(v7*v5+v6)*4+1,VertexX(v8,(v7*v5+v6)*4+1),watertileheight(v2,v1)+Cos(v6 Mod 4*90+leveltimer+v7 Mod 2*180+90)*watertileturbulence(v2,v1),VertexZ(v8,(v7*v5+v6)*4+1)
						VertexCoords v8,(v7*v5+v6)*4+2,VertexX(v8,(v7*v5+v6)*4+2),watertileheight(v2,v1)+(Cos((v6 Mod 4*90+leveltimer+v7 Mod 2*180)-180))*watertileturbulence(v2,v1),VertexZ(v8,(v7*v5+v6)*4+2)
						VertexCoords v8,(v7*v5+v6)*4+3,VertexX(v8,(v7*v5+v6)*4+3),watertileheight(v2,v1)+(Cos((v6 Mod 4*90+leveltimer+v7 Mod 2*180+90)-180))*watertileturbulence(v2,v1),VertexZ(v8,(v7*v5+v6)*4+3)
					End If
				End If
				;v2=v2+1
			Next
			;v1=v1+1
		Next
	End If
End Function

Function setupcamera()
	
	camera=CreateCamera(0)
	RotateEntity camera,55.0,0.0,0.0,0
	CameraRange camera,0.1,1000.0
	CameraZoom camera,2.0
	camerazoomlevel=2.0
	CameraViewport camera,0,0,gfxwidth,gfxheight
End Function

Function controlcamera()
	
	v1#=0.01
	If cameraaddx+v1#<cameraaddxcurrent Then
		cameraaddxcurrent=cameraaddxcurrent-((cameraaddxcurrent-cameraaddx)*0.05)
	Else If cameraaddx-v1#>cameraaddxcurrent Then
		cameraaddxcurrent=cameraaddxcurrent-((cameraaddxcurrent-cameraaddx)*0.05)
	Else
		cameraaddxcurrent=cameraaddx
	End If
	If cameraaddy+v1#<cameraaddycurrent Then
		cameraaddycurrent=cameraaddycurrent-((cameraaddycurrent-cameraaddy)*0.05)
	Else If cameraaddy-v1#>cameraaddycurrent Then
		cameraaddycurrent=cameraaddycurrent-((cameraaddycurrent-cameraaddy)*0.05)
	Else
		cameraaddycurrent=cameraaddy
	End If
	If cameraaddz+v1#<cameraaddzcurrent Then
		cameraaddzcurrent=cameraaddzcurrent-((cameraaddzcurrent-cameraaddz)*0.05)
	Else If cameraaddz-v1#>cameraaddzcurrent Then
		cameraaddzcurrent=cameraaddzcurrent-((cameraaddzcurrent-cameraaddz)*0.05)
	Else
		cameraaddzcurrent=cameraaddz
	End If
	v1#=0.0001
	If cameraaddzoom+v1#<cameraaddzoomcurrent Then
		cameraaddzoomcurrent=cameraaddzoomcurrent-v1#
	Else If cameraaddzoom-v1#>cameraaddzoomcurrent Then
		cameraaddzoomcurrent=cameraaddzoomcurrent+v1#
	Else
		cameraaddzoomcurrent=cameraaddzoom
	End If
	CameraZoom camera,camerazoomlevel+cameraaddzoom
End Function

Function setuplight()
	
	levellight=CreateLight(1,0)
	RotateEntity levellight,35.0,-35.0,0.0,0
	spotlight=CreateLight(3,0)
	RotateEntity spotlight,60.0,0.0,0.0,0
	LightConeAngles spotlight,0.0,60.0
	lightred=0
	lightgreen=0
	lightblue=0
	ambientred=0
	ambientgreen=0
	ambientblue=0
End Function

Function setlight(a0,a1,a2,a3,a4,a5,a6,a7)
	
	lightredgoal=a0
	lightgreengoal=a1
	lightbluegoal=a2
	lightchangespeed=a3
	ambientredgoal=a4
	ambientgreengoal=a5
	ambientbluegoal=a6
	ambientchangespeed=a7
End Function

Function setlightnow(a0,a1,a2,a3,a4,a5)
	
	lightred=a0
	lightgreen=a1
	lightblue=a2
	lightredgoal=a0
	lightgreengoal=a1
	lightbluegoal=a2
	ambientred=a3
	ambientblue=a5
	ambientgreen=a4
	ambientredgoal=a3
	ambientgreengoal=a4
	ambientbluegoal=a5
End Function

Function controllight()
	
	If lightred>lightredgoal Then
		lightred=lightred-lightchangespeed
		If lightred<lightredgoal Then
			lightred=lightredgoal
		End If
	Else If lightred<lightredgoal Then
		lightred=lightred+lightchangespeed
		If lightred>lightredgoal Then
			lightred=lightredgoal
		End If
	End If
	If lightgreen>lightgreengoal Then
		lightgreen=lightgreen-lightchangespeed
		If lightgreen<lightgreengoal Then
			lightgreen=lightgreengoal
		End If
	Else If lightgreen<lightgreengoal Then
		lightgreen=lightgreen+lightchangespeed
		If lightgreen>lightgreengoal Then
			lightgreen=lightgreengoal
		End If
	End If
	If lightblue>lightbluegoal Then
		lightblue=lightblue-lightchangespeed
		If lightblue<lightbluegoal Then
			lightblue=lightbluegoal
		End If
	Else If lightblue<lightbluegoal Then
		lightblue=lightblue+lightchangespeed
		If lightblue>lightbluegoal Then
			lightblue=lightbluegoal
		End If
	End If
	If ambientred>ambientredgoal Then
		ambientred=ambientred-ambientchangespeed
		If ambientred<ambientredgoal Then
			ambientred=ambientredgoal
		End If
	Else If ambientred<ambientredgoal Then
		ambientred=ambientred+ambientchangespeed
		If ambientred>ambientredgoal Then
			ambientred=ambientredgoal
		End If
	End If
	If ambientgreen>ambientgreengoal Then
		ambientgreen=ambientgreen-ambientchangespeed
		If ambientgreen<ambientgreengoal Then
			ambientgreen=ambientgreengoal
		End If
	Else If ambientgreen<ambientgreengoal Then
		ambientgreen=ambientgreen+ambientchangespeed
		If ambientgreen>ambientgreengoal Then
			ambientgreen=ambientgreengoal
		End If
	End If
	If ambientblue>ambientbluegoal Then
		ambientblue=ambientblue-ambientchangespeed
		If ambientblue<ambientbluegoal Then
			ambientblue=ambientbluegoal
		End If
	Else If ambientblue<ambientbluegoal Then
		ambientblue=ambientblue+ambientchangespeed
		If ambientblue>ambientbluegoal Then
			ambientblue=ambientbluegoal
		End If
	End If
	LightColor levellight,lightred,lightgreen,lightblue
	If ((((currentcharm=1 Or (currentcharm=2)) And (leveltimer<1000000000)) And (leveltimer>70)) And (currentlightpower<>0)) Then
		LightColor spotlight,10.0,4.0,0.0
	Else
		LightColor spotlight,0.0,0.0,0.0
	End If
	AmbientLight ambientred,ambientgreen,ambientblue
End Function

Function createnewplayer()
	
	v1$=playername
	CreateDir globaldirname+"\Player Profiles\"
	CreateDir globaldirname+"\Player Profiles\"+v1$
	CreateDir globaldirname+"\Player Profiles\"+v1$+"\Current"
	CreateDir globaldirname+"\Player Profiles\"+v1$+"\Current\Hub"
	CreateDir globaldirname+"\Player Profiles\"+v1$+"\Current\Adventure"
	CreateDir globaldirname+"\Player Profiles\"+v1$+"\SaveFiles"
	v2=WriteFile(globaldirname+"\Player Profiles\"+v1$+"\Current\playerfile.wpf")
	WriteString(v2,playername)
	WriteString(v2,playercharactername)
	WriteInt(v2,playertexturebody)
	WriteInt(v2,playeracc1)
	WriteInt(v2,playertexacc1)
	WriteInt(v2,playeracc2)
	WriteInt(v2,playertexacc2)
	WriteFloat(v2,playersizex)
	WriteFloat(v2,playersizey)
	WriteFloat(v2,playersizez)
	WriteInt(v2,playervoice)
	WriteInt(v2,playerpitch)
	WriteInt(v2,3)
	WriteInt(v2,0)
	;v3=0
	For v3=0 To 99
		WriteInt(v2,9091)
		WriteInt(v2,-1)
		WriteInt(v2,3)
		WriteString(v2,"")
		WriteString(v2,"Empty")
		;v3=v3+1
	Next
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,3)
	WriteInt(v2,0)
	;v3=0
	For v3=0 To 99
		WriteInt(v2,9091)
		WriteInt(v2,-1)
		WriteInt(v2,3)
		WriteString(v2,"")
		WriteString(v2,"Empty")
		;v3=v3+1
	Next
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,v4)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteString(v2,"")
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	;v3=0
	For v3=0 To 2
		;v5=0
		For v5=0 To 5
			WriteInt(v2,0)
			;v5=v5+1
		Next
		;v3=v3+1
	Next
	;v3=0
	For v3=0 To 499
		WriteInt(v2,0)
		WriteInt(v2,0)
		WriteInt(v2,0)
		WriteInt(v2,0)
		WriteInt(v2,0)
		;v3=v3+1
	Next
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,0)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteInt(v2,v4)
	WriteString(v2,v6$)
	WriteString(v2,v6$)
	WriteString(v2,v6$)
	WriteString(v2,v6$)
	WriteString(v2,v6$)
	WriteFloat(v2,v7)
	WriteFloat(v2,v7)
	WriteFloat(v2,v7)
	WriteFloat(v2,v7)
	WriteFloat(v2,v7)
	WriteFloat(v2,v7)
	WriteFloat(v2,v7)
	WriteFloat(v2,v7)
	WriteFloat(v2,v7)
	WriteFloat(v2,v7)
	;v3=0
	For v3=0 To 999
		WriteInt(v2,0)
		;v3=v3+1
	Next
	CloseFile(v2)
	loadplayer(globaldirname+"\Player Profiles\"+v1$+"\Current\playerfile.wpf")
End Function

Function starthublevel(a0,a1,a2)
	
	gamemode=0
	adventurecurrentlevel=a0
	adventuregoal=0
	adventurecurrentstatus=0
	adventurecurrentnumber=0
	startlevel(globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+(-adventurecurrentlevel)+".wlv",0)
	createplayer(a1,a2)
	mousegamemode=-2
	resetparticles("data/graphics/particles.bmp")
	ScaleEntity levelcursor,1.0,1.0,1.0,0
	RotateEntity levelcursor,0.0,0.0,0.0,0
	EntityAlpha levelcursor,0.5
	ShowEntity mousecursor
	mousecursorvisible=1
End Function

Function startlevel(a0$,a1)
	
	cameraaddzoom=0.0
	cameraaddx=0.0
	cameraaddy=0.0
	cameraaddz=0.0
	RotateEntity camera,55.0,0.0,0.0,0
	If Lower$(Right$(a0$,13))<>"savelevel.wlv" Then
		currentcharm=0
		deleteicon(1)
		;v1=0
		For v1=0 To 99
			If inventoryitem(v1)=1001 Then
				inventorytexture(v1)=23
				spellactive=0
				currentspell=-1
				currentspellpower=0
				deleteicon(0)
			End If
			;v1=v1+1
		Next
	Else If (currentspell>=0 And (currentspellpower>0)) Then
		spellactive=spellactive=0
		togglespell()
	End If
	shardhitcounter=0
	shardlasthit=-1
	leveltimer=0
	EntityAlpha levelcursor,0.5
	EntityAlpha mousecursor,0.8
	;v2=0
	For v2=0 To 99
		;v1=0
		For v1=0 To 99
			leveltilelogic(v2,v1)=0
			objecttilelogic(v2,v1)=0
			;v1=v1+1
		Next
		;v2=v2+1
	Next
	loadlevel(a0$,a1,1)
	setlight(lightredgoal,lightgreengoal,lightbluegoal,4,ambientredgoal,ambientgreengoal,ambientbluegoal,4)
	;v1=0
	For v1=0 To 99
		If (inventoryitem(v1)=2001 Or (inventoryitem(v1)=2011)) Then
			If toodark()=1 Then
				deleteicon(1)
				If inventoryitem(v1)=2001 Then
					createicon(1,0,66,2002,"- "+currentlightpower+" -","Remove")
					currentcharm=1
				Else
					createicon(1,0,67,2012,"Light","Remove")
					currentcharm=2
				End If
			End If
		End If
		;v1=v1+1
	Next
	If ((currentcharm=0 Or (currentlightpower=0)) And (toodark()=1)) Then
		If Rand(0,100)<10 Then
			messagelinetext1="It is pitch black."
			messagelinetext2="You are likely to be eaten by a grue."
			messagelinetimer=300
		Else
			messagelinetext1="It is very dark!"
			messagelinetext2="You need a lamp."
			messagelinetimer=300
		End If
	End If
	createlevel()
	If mousepickplane>0 Then
		FreeEntity mousepickplane
		mousepickplane=0
	End If
	mousepickplane=CreateMesh(0)
	v3=CreateSurface(mousepickplane,0)
	AddVertex(v3,-10.0,0.05,10.0,0.0,0.0,1.0)
	AddVertex(v3,levelwidth+10,0.05,10.0,0.0,0.0,1.0)
	AddVertex(v3,-10.0,0.05,(-levelheight)-10,0.0,0.0,1.0)
	AddVertex(v3,levelwidth+10,0.05,(-levelheight)-10,0.0,0.0,1.0)
	AddTriangle(v3,0,1,2)
	AddTriangle(v3,1,3,2)
	EntityPickMode mousepickplane,2,1
	EntityAlpha mousepickplane,0.0
	playercontrolmode=7
	lightredgoal2=-1
	deleteicon(7)
	If (levelmusic<>currentmusic And (globalmusicvolume2>0)) Then
		If ChannelPlaying(musicchannel)=1 Then
			StopChannel musicchannel
		End If
		musicchannel=PlayMusic("data\music\"+levelmusic+".ogg")
		ChannelVolume musicchannel,globalmusicvolume
		currentmusic=levelmusic
	End If
	createicon(9,0,4,4,"Menu","Open")
	If (nofinventoryitems>0 Or (usedinventoryonce=1)) Then
		createicon(8,0,0,1,"Items","Open")
	End If
End Function

Function loadlevel(a0$,a1,a2)
	
	levelformat104=0
	v1=ReadFile(a0$)
	levelwidth=ReadInt(v1)
	levelheight=ReadInt(v1)
	leveldetail=4
	If levelwidth>=1000 Then
		levelformat104=1
		levelwidth=levelwidth-1000
	End If
	;v2=0
	For v2=0 To levelheight-1
		;v3=0
		For v3=0 To levelwidth-1
			leveltiletexture(v3,v2)=ReadInt(v1)
			leveltilerotation(v3,v2)=ReadInt(v1)
			leveltilesidetexture(v3,v2)=ReadInt(v1)
			leveltilesiderotation(v3,v2)=ReadInt(v1)
			leveltilerandom(v3,v2)=ReadFloat(v1)
			leveltileheight(v3,v2)=ReadFloat(v1)
			leveltileextrusion(v3,v2)=ReadFloat(v1)
			leveltilerounding(v3,v2)=ReadInt(v1)
			leveltileedgerandom(v3,v2)=ReadInt(v1)
			leveltilelogic(v3,v2)=ReadInt(v1)
			objecttilelogic(v3,v2)=0
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	;v2=0
	For v2=0 To levelheight-1
		;v3=0
		For v3=0 To levelwidth-1
			watertiletexture(v3,v2)=ReadInt(v1)
			watertilerotation(v3,v2)=ReadInt(v1)
			watertileheight(v3,v2)=ReadFloat(v1)
			watertileturbulence(v3,v2)=ReadFloat(v1)
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	waterflow=ReadInt(v1)
	watertransparent=ReadInt(v1)
	waterglow=ReadInt(v1)
	leveltexturename=ReadString(v1)
	usecustomleveltexture=0
	If customleveltexture>0 Then
		FreeTexture customleveltexture
		customleveltexture=0
	End If
	If custombgtexture1>0 Then
		FreeTexture custombgtexture1
		custombgtexture1=0
	End If
	If custombgtexture2>0 Then
		FreeTexture custombgtexture2
		custombgtexture2=0
	End If
	If Len(leveltexturename)<15 Then
		v4$="custom"
	Else
		v4$=Mid$(leveltexturename,10,(Len(leveltexturename)-9)-4)
	End If
	If whichleveltexture(v4$)=-1 Then
		customleveltexture=LoadTexture(globaldirname+"/custom content/textures/leveltex "+leveltexturename+".bmp",1)
		custombgtexture1=LoadTexture(globaldirname+"/custom content/textures/backgroundtex "+leveltexturename+"1.bmp",1)
		custombgtexture2=LoadTexture(globaldirname+"/custom content/textures/backgroundtex "+leveltexturename+"2.bmp",1)
		If ((customleveltexture=0 Or (custombgtexture1=0)) Or (custombgtexture2=0)) Then
			leveltexturename="leveltex hills.bmp"
		Else
			usecustomleveltexture=1
		End If
	End If
	watertexturename=ReadString(v1)
	usecustomwatertexture=0
	If customwatertexture>0 Then
		FreeTexture customwatertexture
		customwatertexture=0
	End If
	If watertexturename<>"watertex 1.jpg" Then
		customwatertexture=LoadTexture(globaldirname+"/custom content/textures/watertex "+watertexturename+".jpg",1)
		If customwatertexture>0 Then
			usecustomwatertexture=1
		End If
	End If
	nofobjects=0
	v5=ReadInt(v1)
	;v3=0
	For v3=0 To v5-1
		loadobject(v1,a1,a2)
		;v3=v3+1
	Next
	leveledgestyle=ReadInt(v1)
	lightredgoal=ReadInt(v1)
	lightgreengoal=ReadInt(v1)
	lightbluegoal=ReadInt(v1)
	ambientredgoal=ReadInt(v1)
	ambientgreengoal=ReadInt(v1)
	ambientbluegoal=ReadInt(v1)
	levelmusic=ReadInt(v1)
	levelweather=ReadInt(v1)
	adventuretitle4saving=ReadString(v1)
	leveltimer=0
	leveltimer=ReadInt(v1)
	If Eof(v1)=1 Then
	Else
		levelformat104=1
		;v2=0
		For v2=0 To levelheight-1
			;v3=0
			For v3=0 To levelwidth-1
				objecttilelogic(v3,v2)=ReadInt(v1)
				If (objecttilelogic(v3,v2) And (2))>0 Then
					objecttilelogic(v3,v2)=objecttilelogic(v3,v2)-2.0
				End If
				;v3=v3+1
			Next
			;v2=v2+1
		Next
	End If
	CloseFile(v1)
End Function

Function endlevel()
	
	v1=0
	While levelentity(v1)>0
		FreeEntity levelentity(v1)
		FreeEntity waterentity(v1)
		levelentity(v1)=0
		waterentity(v1)=0
		v1=v1+1
	Wend
	If backgroundentity1>0 Then
		FreeEntity backgroundentity1
		backgroundentity1=0
	End If
	If backgroundentity2>0 Then
		FreeEntity backgroundentity2
		backgroundentity2=0
	End If
	;v1=0
	For v1=0 To nofobjects-1
		FreeEntity objectentity(v1)
		objectentity(v1)=0
		FreeTexture objecttexture(v1)
		objecttexture(v1)=0
		;v1=v1+1
	Next
	nofobjects=0
	If mousepickplane>0 Then
		FreeEntity mousepickplane
		mousepickplane=0
	End If
	nofparticles=0
	nofparticles2=0
	For v2.particle=Each particle
		Delete v2
	Next
	For v3.particle2=Each particle2
		Delete v3
	Next
End Function

Function savelevel(a0$)
	
	v1=WriteFile(a0$)
	WriteInt(v1,levelwidth+1000)
	WriteInt(v1,levelheight)
	;v2=0
	For v2=0 To levelheight-1
		;v3=0
		For v3=0 To levelwidth-1
			WriteInt(v1,leveltiletexture(v3,v2))
			WriteInt(v1,leveltilerotation(v3,v2))
			WriteInt(v1,leveltilesidetexture(v3,v2))
			WriteInt(v1,leveltilesiderotation(v3,v2))
			WriteFloat(v1,leveltilerandom(v3,v2))
			WriteFloat(v1,leveltileheight(v3,v2))
			WriteFloat(v1,leveltileextrusion(v3,v2))
			WriteInt(v1,leveltilerounding(v3,v2))
			WriteInt(v1,leveltileedgerandom(v3,v2))
			WriteInt(v1,leveltilelogic(v3,v2))
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	;v2=0
	For v2=0 To levelheight-1
		;v3=0
		For v3=0 To levelwidth-1
			WriteInt(v1,watertiletexture(v3,v2))
			WriteInt(v1,watertilerotation(v3,v2))
			WriteFloat(v1,watertileheight(v3,v2))
			WriteFloat(v1,watertileturbulence(v3,v2))
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	WriteInt(v1,waterflow)
	WriteInt(v1,watertransparent)
	WriteInt(v1,waterglow)
	WriteString(v1,leveltexturename)
	WriteString(v1,watertexturename)
	WriteInt(v1,nofobjects)
	;v3=0
	For v3=0 To nofobjects-1
		v4=v3
		WriteString(v1,objectmodelname(v4))
		WriteString(v1,objecttexturename(v4))
		WriteFloat(v1,objectxscale(v4))
		WriteFloat(v1,objectyscale(v4))
		WriteFloat(v1,objectzscale(v4))
		WriteFloat(v1,objectxadjust(v4))
		WriteFloat(v1,objectyadjust(v4))
		WriteFloat(v1,objectzadjust(v4))
		WriteFloat(v1,objectpitchadjust(v4))
		WriteFloat(v1,objectyawadjust(v4))
		WriteFloat(v1,objectrolladjust(v4))
		WriteFloat(v1,objectx(v4))
		WriteFloat(v1,objecty(v4))
		WriteFloat(v1,objectz(v4))
		WriteFloat(v1,objectoldx(v4))
		WriteFloat(v1,objectoldy(v4))
		WriteFloat(v1,objectoldz(v4))
		WriteFloat(v1,objectdx(v4))
		WriteFloat(v1,objectdy(v4))
		WriteFloat(v1,objectdz(v4))
		WriteFloat(v1,objectpitch(v4))
		WriteFloat(v1,objectyaw(v4))
		WriteFloat(v1,objectroll(v4))
		WriteFloat(v1,objectpitch2(v4))
		WriteFloat(v1,objectyaw2(v4))
		WriteFloat(v1,objectroll2(v4))
		WriteFloat(v1,objectxgoal(v4))
		WriteFloat(v1,objectygoal(v4))
		WriteFloat(v1,objectzgoal(v4))
		WriteInt(v1,objectmovementtype(v4))
		WriteInt(v1,objectmovementtypedata(v4))
		WriteFloat(v1,objectspeed(v4))
		WriteFloat(v1,objectradius(v4))
		WriteInt(v1,objectradiustype(v4))
		WriteInt(v1,objectdata10(v4))
		WriteFloat(v1,objectpushdx(v4))
		WriteFloat(v1,objectpushdy(v4))
		WriteInt(v1,objectattackpower(v4))
		WriteInt(v1,objectdefensepower(v4))
		WriteInt(v1,objectdestructiontype(v4))
		WriteInt(v1,objectid(v4))
		WriteInt(v1,objecttype(v4))
		WriteInt(v1,objectsubtype(v4))
		WriteInt(v1,objectactive(v4))
		WriteInt(v1,objectlastactive(v4))
		WriteInt(v1,objectactivationtype(v4))
		WriteInt(v1,objectactivationspeed(v4))
		WriteInt(v1,objectstatus(v4))
		WriteInt(v1,objecttimer(v4))
		WriteInt(v1,objecttimermax1(v4))
		WriteInt(v1,objecttimermax2(v4))
		WriteInt(v1,objectteleportable(v4))
		WriteInt(v1,objectbuttonpush(v4))
		WriteInt(v1,objectwaterreact(v4))
		WriteInt(v1,objecttelekinesisable(v4))
		WriteInt(v1,objectfreezable(v4))
		WriteInt(v1,objectreactive(v4))
		WriteInt(v1,objectchild(v4))
		WriteInt(v1,objectparent(v4))
		;v5=0
		For v5=0 To 9
			WriteInt(v1,objectdata(v4,v5))
			;v5=v5+1
		Next
		;v5=0
		For v5=0 To 3
			WriteString(v1,objecttextdata(v4,v5))
			;v5=v5+1
		Next
		WriteInt(v1,objecttalkable(v4))
		WriteInt(v1,objectcurrentanim(v4))
		WriteInt(v1,objectstandardanim(v4))
		WriteInt(v1,objecttilex(v4))
		WriteInt(v1,objecttiley(v4))
		WriteInt(v1,objecttilex2(v4))
		WriteInt(v1,objecttiley2(v4))
		WriteInt(v1,objectmovementtimer(v4))
		WriteInt(v1,objectmovementspeed(v4))
		WriteInt(v1,objectmovexgoal(v4))
		WriteInt(v1,objectmoveygoal(v4))
		WriteInt(v1,objecttiletypecollision(v4))
		WriteInt(v1,objectobjecttypecollision(v4))
		WriteInt(v1,objectcaged(v4))
		WriteInt(v1,objectdead(v4))
		WriteInt(v1,objectdeadtimer(v4))
		WriteInt(v1,objectexclamation(v4))
		WriteInt(v1,objectshadow(v4))
		WriteInt(v1,objectlinked(v4))
		WriteInt(v1,objectlinkback(v4))
		WriteInt(v1,objectflying(v4))
		WriteInt(v1,objectfrozen(v4))
		WriteInt(v1,objectfutureint23(v4))
		WriteInt(v1,objectfutureint24(v4))
		WriteInt(v1,objectfutureint25(v4))
		WriteFloat(v1,objectscaleadjust(v4))
		WriteFloat(v1,objectscalexadjust(v4))
		WriteFloat(v1,objectscaleyadjust(v4))
		WriteFloat(v1,objectscalezadjust(v4))
		WriteFloat(v1,objectfuturefloat5(v4))
		WriteFloat(v1,objectfuturefloat6(v4))
		WriteFloat(v1,objectfuturefloat7(v4))
		WriteFloat(v1,objectfuturefloat8(v4))
		WriteFloat(v1,objectfuturefloat9(v4))
		WriteFloat(v1,objectfuturefloat10(v4))
		WriteString(v1,objectfuturestring1(v4))
		WriteString(v1,objectfuturestring2(v4))
		;v5=0
		For v5=0 To 30
			WriteString(v1,"BLA")
			;v5=v5+1
		Next
		;v3=v3+1
	Next
	WriteInt(v1,leveledgestyle)
	WriteInt(v1,lightredgoal2)
	WriteInt(v1,lightgreengoal2)
	WriteInt(v1,lightbluegoal2)
	WriteInt(v1,ambientredgoal2)
	WriteInt(v1,ambientgreengoal2)
	WriteInt(v1,ambientbluegoal2)
	WriteInt(v1,levelmusic)
	WriteInt(v1,levelweather)
	WriteString(v1,adventuretitle4saving)
	If leveltimer<1000000000 Then
		WriteInt(v1,leveltimer)
	Else
		WriteInt(v1,0)
	End If
	;v2=0
	For v2=0 To levelheight-1
		;v3=0
		For v3=0 To levelwidth-1
			WriteInt(v1,objecttilelogic(v3,v2))
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	CloseFile(v1)
End Function

Function loadplayer(a0$)
	
	v1=ReadFile(a0$)
	playername=ReadString(v1)
	playercharactername=ReadString(v1)
	playertexturebody=ReadInt(v1)
	playeracc1=ReadInt(v1)
	playertexacc1=ReadInt(v1)
	playeracc2=ReadInt(v1)
	playertexacc2=ReadInt(v1)
	playersizex=ReadFloat(v1)
	playersizey=ReadFloat(v1)
	playersizez=ReadFloat(v1)
	playervoice=ReadInt(v1)
	playerpitch=ReadInt(v1)
	inventorysize=ReadInt(v1)
	nofinventoryitems=ReadInt(v1)
	;v2=0
	For v2=0 To 99
		inventoryitem(v2)=ReadInt(v1)
		inventoryid(v2)=ReadInt(v1)
		inventorytexture(v2)=ReadInt(v1)
		inventorysubtext(v2)=ReadString(v1)
		inventoryhelptext(v2)=ReadString(v1)
		;v2=v2+1
	Next
	playercoins=ReadInt(v1)
	playercoinscollected=ReadInt(v1)
	playerstars=ReadInt(v1)
	playerscore=ReadInt(v1)
	shardsareactive=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	inventorysizeb4=ReadInt(v1)
	nofinventoryitemsb4=ReadInt(v1)
	;v2=0
	For v2=0 To 99
		inventoryitemb4(v2)=ReadInt(v1)
		inventoryidb4(v2)=ReadInt(v1)
		inventorytextureb4(v2)=ReadInt(v1)
		inventorysubtextb4(v2)=ReadString(v1)
		inventoryhelptextb4(v2)=ReadString(v1)
		;v2=v2+1
	Next
	playercoinsb4=ReadInt(v1)
	playercoinscollectedb4=ReadInt(v1)
	playerstarsb4=ReadInt(v1)
	playerscoreb4=ReadInt(v1)
	lightpowerb4=ReadInt(v1)
	currentadventuregems=ReadInt(v1)
	currentadventurecoins=ReadInt(v1)
	currentadventuretime=ReadInt(v1)
	currentadventurescore=ReadInt(v1)
	v3=ReadInt(v1)
	adventurecurrentlevel=ReadInt(v1)
	adventurecurrentstatus=ReadInt(v1)
	adventurecurrentnumber=ReadInt(v1)
	adventurecurrentname=ReadString(v1)
	adventureexitwonlevel=ReadInt(v1)
	adventureexitwonx=ReadInt(v1)
	adventureexitwony=ReadInt(v1)
	adventureexitlostlevel=ReadInt(v1)
	adventureexitlostx=ReadInt(v1)
	adventureexitlosty=ReadInt(v1)
	adventuregoal=ReadInt(v1)
	;v2=0
	For v2=0 To 2
		;v4=0
		For v4=0 To 5
			adventurewoncommand(v2,v4)=ReadInt(v1)
			;v4=v4+1
		Next
		;v2=v2+1
	Next
	;v2=0
	For v2=0 To 499
		adventurecompleted(v2)=ReadInt(v1)
		adventurecompletedtime(v2)=ReadInt(v1)
		adventurecompletedgems(v2)=ReadInt(v1)
		adventurecompletedgemstotal(v2)=ReadInt(v1)
		adventurecompletedcoins(v2)=ReadInt(v1)
		adventurecompletedcoinstotal(v2)=ReadInt(v1)
		adventurecompletedscore(v2)=ReadInt(v1)
		;v2=v2+1
	Next
	nofweestinkersinadventure=ReadInt(v1)
	nofweestinkersfollowing=ReadInt(v1)
	nofweestinkersfollowinglast=ReadInt(v1)
	nofscrittersinadventure=ReadInt(v1)
	nofgemsinadventure=ReadInt(v1)
	nofbricksinadventure=ReadInt(v1)
	noffireflowersinadventure=ReadInt(v1)
	nofcrabsinadventure=ReadInt(v1)
	nofbabyboomersinadventure=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	playerobject=ReadInt(v1)
	stinkerobject=ReadInt(v1)
	camerafocusobject=ReadInt(v1)
	leveltimer=ReadInt(v1)
	playercontrolmode=ReadInt(v1)
	lastplayercontrol=ReadInt(v1)
	playertalktogoalobject=ReadInt(v1)
	gamemode=ReadInt(v1)
	oldgamemode=ReadInt(v1)
	v5=ReadInt(v1)
	mouseheld=ReadInt(v1)
	delaycommand=ReadInt(v1)
	delaydata1=ReadInt(v1)
	delaydata2=ReadInt(v1)
	delaydata3=ReadInt(v1)
	delaydata4=ReadInt(v1)
	spellactive=ReadInt(v1)
	currentspell=ReadInt(v1)
	currentcharm=ReadInt(v1)
	currentspellpower=ReadInt(v1)
	currentlightpower=ReadInt(v1)
	usedinventoryonce=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v3=ReadInt(v1)
	v6$=ReadString(v1)
	v6$=ReadString(v1)
	v6$=ReadString(v1)
	v6$=ReadString(v1)
	v6$=ReadString(v1)
	v7=ReadFloat(v1)
	v7=ReadFloat(v1)
	v7=ReadFloat(v1)
	v7=ReadFloat(v1)
	v7=ReadFloat(v1)
	v7=ReadFloat(v1)
	v7=ReadFloat(v1)
	v7=ReadFloat(v1)
	v7=ReadFloat(v1)
	v7=ReadFloat(v1)
	;v2=0
	For v2=0 To 999
		masteraskaboutactive(v2)=ReadInt(v1)
		;v2=v2+1
	Next
	currentreplayadventure=ReadInt(v1)
	CloseFile(v1)
	Restore dataLabel215
	;v2=0
	For v2=0 To 159
		Read v8$
		;v2=v2+1
	Next
	;v2=160
	For v2=160 To 199
		Read v8$
		If v8$<>"---" Then
			If soundfx(v2)>0 Then
				FreeSound soundfx(v2)
			End If
			soundfx(v2)=0
			soundfx(v2)=myloadsound("data\sound\voices\"+playervoice+"\"+v8$+".wav")
		End If
		;v2=v2+1
	Next
	timeoflastgamesaved=Millisecs()
End Function

Function saveplayer(a0$)
	
	v1=WriteFile(a0$)
	WriteString(v1,playername)
	WriteString(v1,playercharactername)
	WriteInt(v1,playertexturebody)
	WriteInt(v1,playeracc1)
	WriteInt(v1,playertexacc1)
	WriteInt(v1,playeracc2)
	WriteInt(v1,playertexacc2)
	WriteFloat(v1,playersizex)
	WriteFloat(v1,playersizey)
	WriteFloat(v1,playersizez)
	WriteInt(v1,playervoice)
	WriteInt(v1,playerpitch)
	WriteInt(v1,inventorysize)
	WriteInt(v1,nofinventoryitems)
	;v2=0
	For v2=0 To 99
		WriteInt(v1,inventoryitem(v2))
		WriteInt(v1,inventoryid(v2))
		WriteInt(v1,inventorytexture(v2))
		WriteString(v1,inventorysubtext(v2))
		WriteString(v1,inventoryhelptext(v2))
		;v2=v2+1
	Next
	WriteInt(v1,playercoins)
	WriteInt(v1,playercoinscollected)
	WriteInt(v1,playerstars)
	WriteInt(v1,playerscore)
	WriteInt(v1,shardsareactive)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,inventorysizeb4)
	WriteInt(v1,nofinventoryitemsb4)
	;v2=0
	For v2=0 To 99
		WriteInt(v1,inventoryitemb4(v2))
		WriteInt(v1,inventoryidb4(v2))
		WriteInt(v1,inventorytextureb4(v2))
		WriteString(v1,inventorysubtextb4(v2))
		WriteString(v1,inventoryhelptextb4(v2))
		;v2=v2+1
	Next
	WriteInt(v1,playercoinsb4)
	WriteInt(v1,playercoinscollectedb4)
	WriteInt(v1,playerstarsb4)
	WriteInt(v1,playerscoreb4)
	WriteInt(v1,lightpowerb4)
	WriteInt(v1,currentadventuregems)
	WriteInt(v1,currentadventurecoins)
	WriteInt(v1,currentadventuretime)
	WriteInt(v1,currentadventurescore)
	WriteInt(v1,v3)
	WriteInt(v1,adventurecurrentlevel)
	WriteInt(v1,adventurecurrentstatus)
	WriteInt(v1,adventurecurrentnumber)
	WriteString(v1,adventurecurrentname)
	WriteInt(v1,adventureexitwonlevel)
	WriteInt(v1,adventureexitwonx)
	WriteInt(v1,adventureexitwony)
	WriteInt(v1,adventureexitlostlevel)
	WriteInt(v1,adventureexitlostx)
	WriteInt(v1,adventureexitlosty)
	WriteInt(v1,adventuregoal)
	;v2=0
	For v2=0 To 2
		;v4=0
		For v4=0 To 5
			WriteInt(v1,adventurewoncommand(v2,v4))
			;v4=v4+1
		Next
		;v2=v2+1
	Next
	;v2=0
	For v2=0 To 499
		WriteInt(v1,adventurecompleted(v2))
		WriteInt(v1,adventurecompletedtime(v2))
		WriteInt(v1,adventurecompletedgems(v2))
		WriteInt(v1,adventurecompletedgemstotal(v2))
		WriteInt(v1,adventurecompletedcoins(v2))
		WriteInt(v1,adventurecompletedcoinstotal(v2))
		WriteInt(v1,adventurecompletedscore(v2))
		;v2=v2+1
	Next
	WriteInt(v1,nofweestinkersinadventure)
	WriteInt(v1,nofweestinkersfollowing)
	WriteInt(v1,nofweestinkersfollowinglast)
	WriteInt(v1,nofscrittersinadventure)
	WriteInt(v1,nofgemsinadventure)
	WriteInt(v1,nofbricksinadventure)
	WriteInt(v1,noffireflowersinadventure)
	WriteInt(v1,nofcrabsinadventure)
	WriteInt(v1,nofbabyboomersinadventure)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,playerobject)
	WriteInt(v1,stinkerobject)
	WriteInt(v1,camerafocusobject)
	WriteInt(v1,leveltimer)
	WriteInt(v1,playercontrolmode)
	WriteInt(v1,lastplayercontrol)
	WriteInt(v1,playertalktogoalobject)
	WriteInt(v1,gamemode)
	WriteInt(v1,oldgamemode)
	WriteInt(v1,v5)
	WriteInt(v1,mouseheld)
	WriteInt(v1,delaycommand)
	WriteInt(v1,delaydata1)
	WriteInt(v1,delaydata2)
	WriteInt(v1,delaydata3)
	WriteInt(v1,delaydata4)
	WriteInt(v1,spellactive)
	WriteInt(v1,currentspell)
	WriteInt(v1,currentcharm)
	WriteInt(v1,currentspellpower)
	WriteInt(v1,currentlightpower)
	WriteInt(v1,usedinventoryonce)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteInt(v1,v3)
	WriteString(v1,v6$)
	WriteString(v1,v6$)
	WriteString(v1,v6$)
	WriteString(v1,v6$)
	WriteString(v1,v6$)
	WriteFloat(v1,v7)
	WriteFloat(v1,v7)
	WriteFloat(v1,v7)
	WriteFloat(v1,v7)
	WriteFloat(v1,v7)
	WriteFloat(v1,v7)
	WriteFloat(v1,v7)
	WriteFloat(v1,v7)
	WriteFloat(v1,v7)
	WriteFloat(v1,v7)
	;v2=0
	For v2=0 To 999
		WriteInt(v1,masteraskaboutactive(v2))
		;v2=v2+1
	Next
	WriteInt(v1,currentreplayadventure)
	CloseFile(v1)
End Function

Function savegame(a0,a1$,a2$)
	
	If FileType(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0)=0 Then
		CreateDir globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0
	Else
		v1=ReadDir(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0)
		Repeat
			v2$=NextFile(v1)
			If FileType(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\"+v2$)=1 Then
				DeleteFile globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\"+v2$
			End If
		Until v2$=""
		CloseDir v1
		If FileType(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Hub")=2 Then
			v1=ReadDir(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Hub")
			Repeat
				v2$=NextFile(v1)
				If FileType(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Hub\"+v2$)=1 Then
					DeleteFile globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Hub\"+v2$
				End If
			Until v2$=""
			CloseDir v1
		End If
		If FileType(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Adventure")=2 Then
			v1=ReadDir(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Adventure")
			Repeat
				v2$=NextFile(v1)
				If FileType(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Adventure\"+v2$)=1 Then
					DeleteFile globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Adventure\"+v2$
				End If
			Until v2$=""
			CloseDir v1
		End If
	End If
	v3=Millisecs()
	v4=WriteFile(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\wla")
	WriteString(v4,a1$)
	WriteString(v4,a2$)
	WriteInt(v4,v3)
	CloseFile(v4)
	If gfxwidth>2048 Then
		v5#=2048.0
	Else
		v5#=gfxwidth
	End If
	ScaleImage saveslotimage2,256.0/v5#,256.0/v5#
	SetBuffer ImageBuffer(saveslotimage,0)
	DrawImageRect saveslotimage2,0,0,0,0,256,256,0
	SetBuffer BackBuffer()
	SaveBuffer(ImageBuffer(saveslotimage,0),globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\"+v3+".bmp")
	CreateDir globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Hub"
	v1=ReadDir(globaldirname+"\Player Profiles\"+playername+"\Current\Hub")
	Repeat
		v2$=NextFile(v1)
		If FileType(globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+v2$)=1 Then
			CopyFile globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+v2$,globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Hub\"+v2$
		End If
	Until v2$=""
	CloseDir v1
	CreateDir globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Adventure"
	v1=ReadDir(globaldirname+"\Player Profiles\"+playername+"\Current\Adventure")
	If v1>0 Then
		Repeat
			v2$=NextFile(v1)
			If FileType(globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+v2$)=1 Then
				CopyFile globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+v2$,globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Adventure\"+v2$
			End If
		Until v2$=""
		CloseDir v1
	End If
	savelevel(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\savelevel.wlv")
	saveplayer(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\playerfile.wpf")
End Function

Function loadgame(a0)
	
	endlevel()
	;v1=1
	For v1=1 To nofhubs
		v2=ReadDir(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Hub")
		Repeat
			v3$=NextFile(v2)
			If FileType(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Hub\"+v3$)=1 Then
				CopyFile globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Hub\"+v3$,globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+v3$
			End If
		Until v3$=""
		CloseDir v2
		;v1=v1+1
	Next
	v2=ReadDir(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Adventure")
	Repeat
		v3$=NextFile(v2)
		If FileType(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Adventure\"+v3$)=1 Then
			CopyFile globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\Adventure\"+v3$,globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+v3$
		End If
	Until v3$=""
	CloseDir v2
	loadplayer(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\playerfile.wpf")
	startlevel(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\savelevel.wlv",1)
	v4=ReadFile(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+a0+"\wla")
	v5$=ReadString(v4)
	CloseFile(v4)
	If currentspell>=0 Then
		createicon(0,0,16+currentspell,1002+currentspell,"- "+currentspellpower+"-","Activate")
	End If
	If currentspell=0 And currentspellpower=0 Then
		deleteicon(0)
	End If
	If currentcharm=0 Then
		deleteicon(1)
	End If
	gamemode=0
	CameraFogMode camera,0
	CameraClsColor camera,0.0,0.0,0.0
	CameraFogColor camera,0.0,0.0,0.0
	CameraFogRange camera,200.0,1000.0
	CameraRange camera,0.1,1000.0
	EntityAlpha levelcursor,0.5
End Function

Function startadventure(a0$,a1,a2)
	
	;v1=0
	For v1=0 To 79
		deleteicon(v1)
		;v1=v1+1
	Next
	adventurecurrentname=a0$
	adventurecurrentstatus=a1
	adventurecurrentnumber=a2
	currentadventuregems=0
	currentadventurecoins=0
	currentadventuretime=Millisecs()
	currentadventurescore=0
	adventurecompletedgemstotal(adventurecurrentnumber)=0
	adventurecompletedcoinstotal(adventurecurrentnumber)=0
	If a1=2 Then
		usedinventoryonce=0
		inventorysize=3
		nofinventoryitems=0
		;v1=0
		For v1=0 To 99
			inventoryitem(v1)=9091
			inventoryid(v1)=-1
			inventorytexture(v1)=3
			inventorysubtext(v1)=""
			inventoryhelptext(v1)="Empty"
			;v1=v1+1
		Next
		playercoins=0
		playercoinscollected=0
		playerstars=0
		playerscore=0
		currentlightpower=0
		v2=0
	End If
	inventorysizeb4=inventorysize
	nofinventoryitemsb4=nofinventoryitems
	;v1=0
	For v1=0 To 99
		inventoryitemb4(v1)=inventoryitem(v1)
		inventoryidb4(v1)=inventoryid(v1)
		inventorytextureb4(v1)=inventorytexture(v1)
		inventorysubtextb4(v1)=inventorysubtext(v1)
		inventoryhelptextb4(v1)=inventoryhelptext(v1)
		;v1=v1+1
	Next
	playercoinsb4=playercoins
	playercoinscollectedb4=playercoinscollected
	playerstarsb4=playerstars
	playerscoreb4=playerscore
	lightpowerb4=currentlightpower
	v3=v2
	v3=v2
	v3=v2
	v3=v2
	v3=v2
	v4=ReadDir(globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\")
	Repeat
		v5$=NextFile(v4)
		If ((v5$<>"" And (v5$<>".")) And (v5$<>"..")) Then
			DeleteFile globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+v5$
		End If
	Until v5$=""
	CloseDir v4
	v4=ReadDir(a0$)
	Repeat
		v5$=NextFile(v4)
		If (FileType(a0$+"\"+v5$)=1 And (Upper$(Right$(v5$,6))<>".SCORE")) Then
			CopyFile a0$+"\"+v5$,globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+v5$
		End If
	Until v5$=""
	CloseDir v4
	If adventurecurrentstatus=2 Then
		If FileType(adventurecurrentname+"\"+playername+".score")=1 Then
			v6=ReadFile(adventurecurrentname+"\"+playername+".score")
			adventurecompleted(0)=ReadInt(v6)
			adventurecompletedtime(0)=ReadInt(v6)
			adventurecompletedgems(0)=ReadInt(v6)
			adventurecompletedgemstotal(0)=ReadInt(v6)
			adventurecompletedcoins(0)=ReadInt(v6)
			adventurecompletedcoinstotal(0)=ReadInt(v6)
			adventurecompletedscore(0)=ReadInt(v6)
			CloseFile(v6)
		Else
			adventurecompleted(0)=0
			adventurecompletedtime(0)=0
			adventurecompletedgems(0)=0
			adventurecompletedcoins(0)=0
			adventurecompletedscore(0)=0
		End If
	End If
	analyzeadventure()
	v6=ReadFile(globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\master.dat")
	adventuretitle=ReadString(v6)
	;v1=0
	For v1=0 To 4
		adventuretextline(v1)=ReadString(v6)
		;v1=v1+1
	Next
	v7$=ReadString(v6)
	v8$=ReadString(v6)
	v7$=ReadString(v6)
	v7$=ReadString(v6)
	v7$=ReadString(v6)
	v7$=ReadString(v6)
	v7$=ReadString(v6)
	adventureexitwonlevel=ReadInt(v6)
	adventureexitwonx=ReadInt(v6)
	adventureexitwony=ReadInt(v6)
	adventureexitlostlevel=ReadInt(v6)
	adventureexitlostx=ReadInt(v6)
	adventureexitlosty=ReadInt(v6)
	adventuregoal=ReadInt(v6)
	;v1=0
	For v1=0 To 2
		;v9=0
		For v9=0 To 5
			adventurewoncommand(v1,v9)=ReadInt(v6)
			;v9=v9+1
		Next
		;v1=v1+1
	Next
	adventurestartx=ReadInt(v6)
	adventurestarty=ReadInt(v6)
	CloseFile(v6)
	adventurecurrentlevel=1
	FreeTexture icontexturecustom
	icontexturecustom=0
	If FileType(globaldirname+"\Custom Content\Icons\icons "+v8$+".bmp")=1 Then
		icontexturecustom=LoadTexture(globaldirname+"\Custom Content\Icons\icons "+v8$+".bmp",4)
	Else
		icontexturecustom=myloadtexture("data\Graphics\icons-custom.bmp",4)
	End If
	If icontexturecustom=0 Then
		icontexturecustom=myloadtexture("data\Graphics\icons-custom.bmp",4)
	End If
	setlightnow(255,255,255,100,100,100)
	gamemode=10
	leveltimer=0
	adventuretimer=0
	If adventuretitlebackground>0 Then
		FreeEntity adventuretitlebackground
	End If
	adventuretitlebackground=CreatePlane(4,camera)
	EntityPickMode adventuretitlebackground,2,1
	ScaleEntity adventuretitlebackground,2.0,2.0,2.0,0
	RotateEntity adventuretitlebackground,-90.0,0.0,0.0,0
	PositionEntity adventuretitlebackground,0.0,0.0,5.01,0
	EntityAlpha adventuretitlebackground,0.0
	EntityOrder adventuretitlebackground,100
	EntityTexture adventuretitlebackground,adventuretitlebackgroundtex,0,0
	If adventuretitlesprite(0)>0 Then
		FreeEntity adventuretitlesprite(0)
	End If
	adventuretitlesprite(0)=CreateSprite(camera)
	PositionEntity adventuretitlesprite(0),0.0,0.0,0.0,0
	EntityAlpha adventuretitlesprite(0),0.0
	EntityTexture adventuretitlesprite(0),adventurestartlogotex,0,0
	RotateEntity adventuretitlestar,-100.0,0.0,0.0,0
	ScaleEntity adventuretitlestar,0.28,0.28,0.28,0
	EntityAlpha adventuretitlestar,0.0
	HideEntity adventuretitlestar
	EntityBlend adventuretitlestar,3
	EntityTexture adventuretitlestar,adventuretitlestartex1,0,0
	HideEntity mousecursor
	mousecursorvisible=0
	VertexTexCoords GetSurface(levelcursor,1),0,0.0,0.0,1.0,0
	VertexTexCoords GetSurface(levelcursor,1),1,0.25,0.0,1.0,0
	VertexTexCoords GetSurface(levelcursor,1),2,0.0,0.25,1.0,0
	VertexTexCoords GetSurface(levelcursor,1),3,0.25,0.25,1.0,0
	VertexColor GetSurface(levelcursor,1),0,255.0,255.0,255.0,1.0
	VertexColor GetSurface(levelcursor,1),1,255.0,255.0,255.0,1.0
	VertexColor GetSurface(levelcursor,1),2,255.0,255.0,255.0,1.0
	VertexColor GetSurface(levelcursor,1),3,255.0,255.0,255.0,1.0
	resetparticles("data\graphics\particles.bmp")
	If (currentreplayadventure=delaydata1 And (delaydata1>0)) Then
		v9=0
		;v1=0
		For v1=0 To nofinventoryitems-1
			If (((inventoryitem(v1)<>1001 And (inventoryitem(v1)<>2001)) And (inventoryitem(v1)<>2011)) And (inventoryitem(v1)<>2021)) Then
				inventoryitem(v1)=9091
				inventoryid(v1)=-1
				inventorytexture(v1)=3
				inventorysubtext(v1)=""
				inventoryhelptext(v1)="Empty"
				v9=v9+1
			End If
			;v1=v1+1
		Next
		nofinventoryitems=nofinventoryitems-1
	End If
End Function

Function analyzeadventure()
	
	nofweestinkersinadventure=0
	nofscrittersinadventure=0
	nofgemsinadventure=0
	nofbricksinadventure=0
	noffireflowersinadventure=0
	nofcrabsinadventure=0
	nofbabyboomersinadventure=0
	adventurecompletedcoinstotal(adventurecurrentnumber)=0
	adventurecompletedgemstotal(adventurecurrentnumber)=0
	;v1=1
	For v1=1 To 99
		If FileType(globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+v1+".wlv")=1 Then
			v2=ReadFile(globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+v1+".wlv")
			v3=ReadInt(v2)
			v4=ReadInt(v2)
			;v5=0
			For v5=0 To v4-1
				;v6=0
				For v6=0 To v3-1
					v7=ReadInt(v2)
					v7=ReadInt(v2)
					v7=ReadInt(v2)
					v7=ReadInt(v2)
					v8=ReadFloat(v2)
					v8=ReadFloat(v2)
					v8=ReadFloat(v2)
					v7=ReadInt(v2)
					v7=ReadInt(v2)
					v7=ReadInt(v2)
					;v6=v6+1
				Next
				;v5=v5+1
			Next
			;v5=0
			For v5=0 To v4-1
				;v6=0
				For v6=0 To v3-1
					v7=ReadInt(v2)
					v7=ReadInt(v2)
					v8=ReadFloat(v2)
					v8=ReadFloat(v2)
					;v6=v6+1
				Next
				;v5=v5+1
			Next
			v7=ReadInt(v2)
			v7=ReadInt(v2)
			v7=ReadInt(v2)
			v9$=ReadString(v2)
			v9$=ReadString(v2)
			v10=ReadInt(v2)
			;v6=0
			For v6=0 To v10-1
				;v5=1
				For v5=1 To 2
					v9$=ReadString(v2)
					;v5=v5+1
				Next
				;v5=1
				For v5=1 To 27
					v8=ReadFloat(v2)
					;v5=v5+1
				Next
				v7=ReadInt(v2)
				v7=ReadInt(v2)
				v8=ReadFloat(v2)
				v8=ReadFloat(v2)
				v7=ReadInt(v2)
				v7=ReadInt(v2)
				v8=ReadFloat(v2)
				v8=ReadFloat(v2)
				v7=ReadInt(v2)
				v7=ReadInt(v2)
				v7=ReadInt(v2)
				v11=ReadInt(v2)
				v12=ReadInt(v2)
				v13=ReadInt(v2)
				;v5=1
				For v5=1 To 16
					v7=ReadInt(v2)
					;v5=v5+1
				Next
				v14=ReadInt(v2)
				;v5=1
				For v5=1 To 9
					v7=ReadInt(v2)
					;v5=v5+1
				Next
				;v5=1
				For v5=1 To 4
					v9$=ReadString(v2)
					;v5=v5+1
				Next
				v15=ReadInt(v2)
				;v5=1
				For v5=1 To 24
					v7=ReadInt(v2)
					;v5=v5+1
				Next
				;v5=1
				For v5=1 To 10
					v8=ReadFloat(v2)
					;v5=v5+1
				Next
				;v5=1
				For v5=1 To 2
					v9$=ReadString(v2)
					;v5=v5+1
				Next
				;v5=0
				For v5=0 To 30
					ReadString(v2)
					;v5=v5+1
				Next
				Select v12
				Case 120
					nofweestinkersinadventure=nofweestinkersinadventure+1
				Case 150
					nofscrittersinadventure=nofscrittersinadventure+1
				Case 171
					adventurecompletedcoinstotal(adventurecurrentnumber)=adventurecompletedcoinstotal(adventurecurrentnumber)+1
				Case 173
					If v14<2 Then
						nofgemsinadventure=nofgemsinadventure+1
						adventurecompletedgemstotal(adventurecurrentnumber)=adventurecompletedgemstotal(adventurecurrentnumber)+1
					End If
				Case 230
					noffireflowersinadventure=noffireflowersinadventure+1
				Case 242
					nofbricksinadventure=nofbricksinadventure+1
				Case 370
					nofcrabsinadventure=nofcrabsinadventure+1
				Case 400
					nofbabyboomersinadventure=nofbabyboomersinadventure+1
				End Select
				;v6=v6+1
			Next
			CloseFile(v2)
		End If
		;v1=v1+1
	Next
End Function

Function adventurewon()
	
	If (leveltimer>=1000001000 And (leveltimer<1000003000)) Then
		Return 0
	End If
	If playerobject>=0 Then
		If objectdead(playerobject)>0 Then
			Return 0
		End If
	End If
	v1=0
	currentadventuretime=adventuretimer/60
	If 1000-(5*currentadventuretime)>0 Then
		currentadventurescore=(currentadventurescore+1000)-(5*currentadventuretime)
	End If
	replayadventurescorebetter=1
	If adventurecompleted(adventurecurrentnumber)=0 Then
		adventurecompleted(adventurecurrentnumber)=1
		adventurecompletedtime(adventurecurrentnumber)=currentadventuretime
		adventurecompletedgems(adventurecurrentnumber)=currentadventuregems
		adventurecompletedcoins(adventurecurrentnumber)=currentadventurecoins
		playerscore=playerscore+currentadventurescore
		adventurecompletedscore(adventurecurrentnumber)=currentadventurescore
		v1=1
		replayadventurescorebetter=0
	Else
		If adventurecurrentstatus=2 Then
			If (currentadventuregems>adventurecompletedgems(0) And (currentadventurecoins>=adventurecompletedcoins(0))) Then
				v1=1
				replayadventurescorebetter=2
			End If
			If (currentadventurecoins>adventurecompletedcoins(0) And (currentadventuregems>=adventurecompletedgems(0))) Then
				v1=1
				replayadventurescorebetter=2
			End If
			If ((currentadventurescore>adventurecompletedscore(0) And (currentadventuregems>=adventurecompletedgems(0))) And (currentadventurecoins>=adventurecompletedcoins(0))) Then
				v1=1
				replayadventurescorebetter=2
			End If
		End If
		If adventurecurrentstatus=3 Then
			replayadventurescorebetter=0
			replayadventuregemsbetter=0
			replayadventurecoinsbetter=0
			If currentadventuretime<adventurecompletedtime(adventurecurrentnumber) Then
				adventurecompletedtime(adventurecurrentnumber)=currentadventuretime
			End If
			If currentadventurecoins>adventurecompletedcoins(adventurecurrentnumber) Then
				replayadventurecoinsbetter=currentadventurecoins-adventurecompletedcoins(adventurecurrentnumber)
				adventurecompletedcoins(adventurecurrentnumber)=currentadventurecoins
			End If
			If currentadventuregems>adventurecompletedgems(adventurecurrentnumber) Then
				replayadventuregemsbetter=currentadventuregems-adventurecompletedgems(adventurecurrentnumber)
				adventurecompletedgems(adventurecurrentnumber)=currentadventuregems
			End If
			If currentadventurescore>adventurecompletedscore(adventurecurrentnumber) Then
				replayadventurescorebetter=currentadventurescore-adventurecompletedscore(adventurecurrentnumber)
				adventurecompletedscore(adventurecurrentnumber)=currentadventurescore
			End If
		End If
	End If
	If v1=1 Then
		adventurecompleted(adventurecurrentnumber)=1
		adventurecompletedtime(adventurecurrentnumber)=currentadventuretime
		adventurecompletedgems(adventurecurrentnumber)=currentadventuregems
		adventurecompletedcoins(adventurecurrentnumber)=currentadventurecoins
		adventurecompletedscore(adventurecurrentnumber)=currentadventurescore
		v2=WriteFile(adventurecurrentname+"\"+playername+".score")
		WriteInt(v2,1)
		WriteInt(v2,currentadventuretime)
		WriteInt(v2,currentadventuregems)
		WriteInt(v2,adventurecompletedgemstotal(0))
		WriteInt(v2,currentadventurecoins)
		WriteInt(v2,adventurecompletedcoinstotal(0))
		WriteInt(v2,currentadventurescore)
		CloseFile(v2)
	End If
	playsoundfx(0,-1,-1)
	If objectmovementtimer(playerobject)<100 Then
		objectmovexgoal(playerobject)=objecttilex(playerobject)
		objectmoveygoal(playerobject)=objecttiley(playerobject)
		objecttilex2(playerobject)=objecttilex(playerobject)
		objecttiley2(playerobject)=objecttiley(playerobject)
		objectmovementtimer(playerobject)=0
	Else
		objectmovexgoal(playerobject)=objecttilex2(playerobject)
		objectmoveygoal(playerobject)=objecttiley2(playerobject)
	End If
	playertalktogoalobject=-1
	spellactive=0
	;v3=0
	For v3=0 To 79
		deactivateicon(v3)
		;v3=v3+1
	Next
	If gamemode=8 Then
		enddialog()
	End If
	gamemode=0
	leveltimer=1000001000
	If adventuretitlesprite(0)>0 Then
		FreeEntity adventuretitlesprite(0)
	End If
	adventuretitlesprite(0)=CreateSprite(camera)
	EntityAlpha adventuretitlesprite(0),0.0
	EntityTexture adventuretitlesprite(0),adventurecompletedlogotex,0,0
	EntityOrder adventuretitlesprite(0),-200
	ShowEntity adventuretitlestar
	PositionEntity adventuretitlestar,0.0,0.7,4.7,0
	RotateEntity adventuretitlestar,-100.0,0.0,0.0,0
	ScaleEntity adventuretitlestar,0.0,0.0,0.0,0
	EntityAlpha adventuretitlestar,0.0
	EntityTexture adventuretitlestar,adventuretitlestartex1,0,0
	EntityOrder adventuretitlestar,-199
	EntityFX adventuretitlestar,1
End Function

Function adventurewonupdate()
	
	HideEntity mousecursor
	mousecursorvisible=0
	If leveltimer=1000001100 Then
		setlight(0,0,0,1,0,0,0,1)
		playsoundfx(1,-1,-1)
		;v1=0
		For v1=0 To 359
			v2#=Rnd(0.3,1.0)
			addparticle(Rand(16,23),EntityX(adventuretitlestar,1),EntityY(adventuretitlestar,1)-0.1,EntityZ(adventuretitlestar,1)-0.011,0.0,0.4,v2#*0.12*Sin(v1),v2#*0.12*Cos(v1),0.0,5.0,0.001,(-v2#)*0.0021*Sin(v1),(-v2#)*0.0021*Cos(v1),0.0,75,3)
			;v1=v1+1
		Next
	End If
	If (leveltimer>1000001002 And (leveltimer<1000001100)) Then
		PositionEntity adventuretitlesprite(0),0.0,0.2+0.7*(leveltimer-1000001000)/100.0,1.0+3.0*(leveltimer-1000001000)/100.0,0
		EntityAlpha adventuretitlesprite(0),(leveltimer-1000001000)/100.0
		EntityAlpha adventuretitlestar,(leveltimer-1000001000)/100.0
		ScaleEntity adventuretitlestar,6.0-(5.5*(leveltimer-1000001000)/100.0),6.0-(5.5*(leveltimer-1000001000)/100.0),6.0-(5.5*(leveltimer-1000001000)/100.0),0
	End If
	TurnEntity adventuretitlestar,0.0,2.0,0.0,0
	If adventurecurrentstatus=1 Then
		If leveltimer>1000001100 Then
			displaytext("You Have Completed This Adventure!",8.0,11.0,1.0,1.0,255,255,0)
		End If
		If leveltimer>1000001150 Then
			v3$="Time: "+(adventurecompletedtime(adventurecurrentnumber)/60)+" min "+adventurecompletedtime(adventurecurrentnumber) Mod 60+" sec"
			displaytext(v3$,25.0-(Len(v3$)*0.5),14.0,1.0,1.0,255,255,255)
		End If
		If leveltimer>1000001175 Then
			If adventurecompletedgemstotal(adventurecurrentnumber)>0 Then
				v3$="Gems: "+adventurecompletedgems(adventurecurrentnumber)+" of "+adventurecompletedgemstotal(adventurecurrentnumber)
			Else
				v3$=""
			End If
			If adventurecompletedcoinstotal(adventurecurrentnumber)>0 Then
				If adventurecompletedgemstotal(adventurecurrentnumber)>0 Then
					v3$=v3$+"   "
				End If
				v3$=v3$+"Coins: "+adventurecompletedcoins(adventurecurrentnumber)+" of "+adventurecompletedcoinstotal(adventurecurrentnumber)
			End If
			displaytext(v3$,25.0-(Len(v3$)*0.5),15.0,1.0,1.0,255,255,255)
		End If
		If leveltimer>1000001200 Then
			v3$="Level Score: "+adventurecompletedscore(adventurecurrentstatus)
			displaytext(v3$,25.0-(Len(v3$)*0.5),16.0,1.0,1.0,255,255,255)
		End If
		If leveltimer>1000001250 Then
			v3$="You Have Earned A Star!"
			displaytext(v3$,25.0-(Len(v3$)*0.5)+0.6*Sin((leveltimer-1000000000)*4),19.0+0.6*Cos((leveltimer-1000000000)*4),1.0,1.0,255,255,255)
		End If
		If leveltimer>1000001300 Then
			v3$="Total Stars: "+(playerstars+1)
			displaytext(v3$,25.0-(Len(v3$)*0.5)+0.6*Sin((leveltimer-1000000000)*4),20.0+0.6*Cos((leveltimer-1000000000)*4),1.0,1.0,255,255,255)
		End If
	Else If adventurecurrentstatus=2 Then
		If leveltimer>1000001100 Then
			displaytext("Custom Adventure Completed!",11.5+Sin(leveltimer*4 Mod 360)*0.5,11.0,1.0,1.0,255,255,0)
		End If
		If leveltimer>1000001150 Then
			v3$="Time: "+(currentadventuretime/60)+" min "+currentadventuretime Mod 60+" sec"
			displaytext(v3$,25.0-(Len(v3$)*0.5),14.0,1.0,1.0,255,255,255)
		End If
		If leveltimer>1000001175 Then
			If adventurecompletedgemstotal(adventurecurrentnumber)>0 Then
				v3$="Gems: "+currentadventuregems+" of "+adventurecompletedgemstotal(adventurecurrentnumber)
			Else
				v3$=""
			End If
			If adventurecompletedcoinstotal(adventurecurrentnumber)>0 Then
				If adventurecompletedgemstotal(adventurecurrentnumber)>0 Then
					v3$=v3$+"   "
				End If
				v3$=v3$+"Coins: "+currentadventurecoins+" of "+adventurecompletedcoinstotal(adventurecurrentnumber)
			End If
			displaytext(v3$,25.0-(Len(v3$)*0.5),15.0,1.0,1.0,255,255,255)
		End If
		If leveltimer>1000001200 Then
			v3$="Level Score: "+currentadventurescore
			displaytext(v3$,25.0-(Len(v3$)*0.5),16.0,1.0,1.0,255,255,255)
		End If
		If leveltimer>1000001250 Then
			If (currentadventuregems=adventurecompletedgemstotal(adventurecurrentnumber) And (currentadventurecoins=adventurecompletedcoinstotal(adventurecurrentnumber))) Then
				v3$="You got GOLD (all gems and coins)!!"
			Else
				v3$=""
			End If
			displaytext(v3$,25.0-(Len(v3$)*0.5)+0.6*Sin((leveltimer-1000000000)*4),18.0+0.6*Cos((leveltimer-1000000000)*4),1.0,1.0,255,255,255)
			If replayadventurescorebetter=1 Then
				v3$="(No Improvement over Previous Attempts)"
			Else If replayadventurescorebetter=2 Then
				v3$="Improved Results - Congratulations!"
			Else
				v3$=""
			End If
			displaytext(v3$,25.0-(Len(v3$)*0.5)+0.6*Sin((leveltimer-1000000000)*4),19.0+0.6*Cos((leveltimer-1000000000)*4),1.0,1.0,255,255,255)
		End If
	Else If adventurecurrentstatus=3 Then
		If leveltimer>1000001100 Then
			displaytext("Adventure Replay Results:",12.5+Sin(leveltimer Mod 360),11.0,1.0,1.0,255,255,0)
			v3$="Time: "+(currentadventuretime/60)+" min "+currentadventuretime Mod 60+" sec"
			displaytext(v3$,25.0-(Len(v3$)*0.5),13.0,1.0,1.0,255,255,255)
			v3$="Gems: "+currentadventuregems+" of "+adventurecompletedgemstotal(adventurecurrentnumber)
			If replayadventuregemsbetter>0 Then
				v3$=v3$+"  ("+replayadventuregemsbetter+" gained)"
			Else
				v3$=v3$+"  (no gain)"
			End If
			displaytext(v3$,25.0-(Len(v3$)*0.5),14.0,1.0,1.0,255,255,255)
			v3$="Coins: "+currentadventurecoins+" of "+adventurecompletedcoinstotal(adventurecurrentnumber)
			If replayadventurecoinsbetter>0 Then
				v3$=v3$+"  ("+replayadventurecoinsbetter+" gained)"
			Else
				v3$=v3$+"  (no gain)"
			End If
			displaytext(v3$,25.0-(Len(v3$)*0.5),15.0,1.0,1.0,255,255,255)
			v3$="Score: "+currentadventurescore
			If replayadventurescorebetter>0 Then
				v3$=v3$+"  ("+replayadventurescorebetter+" points gained)"
			Else
				v3$=v3$+"  (no gain)"
			End If
			displaytext(v3$,25.0-(Len(v3$)*0.5),16.0,1.0,1.0,255,255,255)
		End If
	End If
	If leveltimer=1000001500 Then
		endlevel()
		endadventure()
		If (fullversion=0 And ((waepisode=1 And (adventurecurrentnumber=13)))) Then
			startmenu(25)
		Else If adventurecurrentstatus=3 Then
			v4=currentlightpower
			adventurecanceldata()
			currentlightpower=v4
			;v1=0
			For v1=0 To 99
				If inventoryitem(v1)=2001 Then
					inventoryhelptext(v1)="- "+currentlightpower+" -"
				End If
				;v1=v1+1
			Next
			playerscore=playerscore+replayadventurescorebetter
			playercoins=playercoins+replayadventurecoinsbetter
			starthublevel(-23,27,13)
		Else If adventurecurrentstatus=2 Then
			startcustomselectmenu()
		Else
			adventurewoncommands()
			If (waepisode=1 And (adventurecurrentnumber=130)) Then
				CopyFile globaldirname+"\Player Profiles\"+playername+"\Current\Hub\915.wlv",globaldirname+"\Player Profiles\"+playername+"\Current\Hub\15.wlv"
				CopyFile globaldirname+"\Player Profiles\"+playername+"\Current\Hub\920.wlv",globaldirname+"\Player Profiles\"+playername+"\Current\Hub\20.wlv"
				CopyFile globaldirname+"\Player Profiles\"+playername+"\Current\Hub\921.wlv",globaldirname+"\Player Profiles\"+playername+"\Current\Hub\21.wlv"
				startmenu(23)
			Else
				starthublevel(-adventureexitwonlevel,adventureexitwonx,adventureexitwony)
			End If
		End If
	End If
End Function

Function adventurewoncommands()
	
	playerstars=playerstars+1
	;v1=0
	For v1=0 To 2
		If adventurewoncommand(v1,1)>0 Then
			v2$=globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+adventurewoncommand(v1,0)+".wlv"
			loadlevel(v2$,0,0)
			lightredgoal2=lightredgoal
			lightgreengoal2=lightgreengoal
			lightbluegoal2=lightbluegoal
			ambientredgoal2=ambientredgoal
			ambientgreengoal2=ambientgreengoal
			ambientbluegoal2=ambientbluegoal
			activatecommand(adventurewoncommand(v1,1),adventurewoncommand(v1,2),adventurewoncommand(v1,3),adventurewoncommand(v1,4),adventurewoncommand(v1,5))
			If (adventurewoncommand(v1,1)<>103 And (adventurewoncommand(v1,1)<>104)) Then
				savelevel(v2$)
			End If
		End If
		;v1=v1+1
	Next
End Function

Function adventurelost()
	
	If (leveltimer>=1000001000 And (leveltimer<1000003000)) Then
		Return 0
	End If
	If Rand(0,100)<50 Then
		playsoundfx(Rand(160,163),-1,-1)
	Else
		playsoundfx(Rand(160,161),-1,-1)
	End If
	spellactive=0
	If objectmovementtimer(playerobject)<100 Then
		objectmovexgoal(playerobject)=objecttilex(playerobject)
		objectmoveygoal(playerobject)=objecttiley(playerobject)
		objecttilex2(playerobject)=objecttilex(playerobject)
		objecttiley2(playerobject)=objecttiley(playerobject)
		objectmovementtimer(playerobject)=0
	Else
		objectmovexgoal(playerobject)=objecttilex2(playerobject)
		objectmoveygoal(playerobject)=objecttiley2(playerobject)
	End If
	playertalktogoalobject=-1
	;v1=0
	For v1=0 To 79
		If v1<>9 Then
			deactivateicon(v1)
		End If
		;v1=v1+1
	Next
	If gamemode=8 Then
		enddialog()
	End If
	gamemode=0
	leveltimer=1000002000
	If adventuretitlesprite(0)>0 Then
		FreeEntity adventuretitlesprite(0)
	End If
	adventuretitlesprite(0)=CreateSprite(camera)
	EntityAlpha adventuretitlesprite(0),0.0
	EntityTexture adventuretitlesprite(0),adventurelostlogotex,0,0
	EntityOrder adventuretitlesprite(0),-5
	ShowEntity adventuretitlestar
	PositionEntity adventuretitlestar,0.0,2.4,4.7,0
	RotateEntity adventuretitlestar,-100.0,0.0,0.0,0
	ScaleEntity adventuretitlestar,0.0,0.0,0.0,0
	EntityAlpha adventuretitlestar,1.0
	EntityTexture adventuretitlestar,adventuretitlestartex2,0,0
	EntityOrder adventuretitlestar,-4
	EntityFX adventuretitlestar,1
End Function

Function adventurelostupdate()
	
	If leveltimer=1000002100 Then
		setlight(0,0,0,1,0,0,0,1)
	End If
	If leveltimer<1000002100 Then
		PositionEntity adventuretitlesprite(0),0.0,0.2+0.7*(leveltimer-1000002000)/100.0,1.0+3.0*(leveltimer-1000002000)/100.0,0
		EntityAlpha adventuretitlesprite(0),(leveltimer-1000002000)/100.0
		EntityAlpha adventuretitlestar,(leveltimer-1000002000)/100.0
		ScaleEntity adventuretitlestar,0.9,0.9,0.9,0
	End If
	TranslateEntity adventuretitlestar,0.0,-0.02,0.0,0
	TurnEntity adventuretitlestar,0.0,2.0,0.0,0
	ChannelVolume musicchannel,globalmusicvolume*(1.0-((leveltimer-1000002000)/500.0))
	currentmusic=0
	If leveltimer>1000002100 Then
		v1$="You Have Lost This Adventure!"
		displaytext(v1$,25.0-(Len(v1$)*0.5),11.0,1.0,1.0,255,255,0)
	End If
	If leveltimer>1000002120 Then
		displaytext(adventurelostreason,25.0-(Len(adventurelostreason)*0.5),13.0,1.0,1.0,255,255,255)
	End If
	If leveltimer>1000002160 Then
		v1$="Sorry... Better Luck Next Time!"
		displaytext(v1$,25.0-(Len(v1$)*0.5),18.0,1.0,1.0,255,255,255)
	End If
	If leveltimer=1000002500 Then
		endlevel()
		If adventurecurrentstatus=0 Then
			endadventure()
			startmenu(11)
		Else
			adventurecanceldata()
			endadventure()
			If adventurecurrentstatus=3 Then
				starthublevel(-23,27,13)
			Else If adventurecurrentstatus=2 Then
				startadventure(adventurecurrentname,adventurecurrentstatus,adventurecurrentnumber)
			Else
				starthublevel(-adventureexitlostlevel,adventureexitlostx,adventureexitlosty)
			End If
		End If
	End If
End Function

Function endadventure()
	
	If adventuretitlesprite(0)>0 Then
		FreeEntity adventuretitlesprite(0)
		adventuretitlesprite(0)=0
		HideEntity adventuretitlestar
	End If
	resetparticles("data/graphics/particles.bmp")
End Function

Function adventurecanceldata()
	
	inventorysize=inventorysizeb4
	nofinventoryitems=nofinventoryitemsb4
	;v1=0
	For v1=0 To 99
		inventoryitem(v1)=inventoryitemb4(v1)
		inventoryid(v1)=inventoryidb4(v1)
		inventorytexture(v1)=inventorytextureb4(v1)
		inventorysubtext(v1)=inventorysubtextb4(v1)
		inventoryhelptext(v1)=inventoryhelptextb4(v1)
		;v1=v1+1
	Next
	playercoins=playercoinsb4
	playercoinscollected=playercoinscollectedb4
	playerstars=playerstarsb4
	playerscore=playerscoreb4
	currentlightpower=lightpowerb4
	v2=v3
	v2=v3
	v2=v3
	v2=v3
	v2=v3
End Function

Function setupobjects()
	
End Function

Function createnewobject()
	
	v1=nofobjects
	objectmodelname(v1)=""
	objecttexturename(v1)=""
	objectxscale(v1)=1.0
	objectyscale(v1)=1.0
	objectzscale(v1)=1.0
	objectxadjust(v1)=0.0
	objectyadjust(v1)=0.0
	objectzadjust(v1)=0.0
	objectpitchadjust(v1)=0.0
	objectyawadjust(v1)=0.0
	objectrolladjust(v1)=0.0
	objectexists(v1)=1
	objectentity(v1)=0
	objecttexture(v1)=0
	objectx(v1)=0.0
	objecty(v1)=0.0
	objectz(v1)=0.0
	objectoldx(v1)=-999.0
	objectoldy(v1)=-999.0
	objectoldz(v1)=-999.0
	objectdx(v1)=0.0
	objectdy(v1)=0.0
	objectdz(v1)=0.0
	objectpitch(v1)=0.0
	objectyaw(v1)=0.0
	objectroll(v1)=0.0
	objectpitch2(v1)=0.0
	objectyaw2(v1)=0.0
	objectroll2(v1)=0.0
	objectxgoal(v1)=0.0
	objectygoal(v1)=0.0
	objectzgoal(v1)=0.0
	objectmovementtype(v1)=0
	objectmovementtypedata(v1)=0
	objectspeed(v1)=0.0
	objectradius(v1)=0.0
	objectradiustype(v1)=0
	objectdata10(v1)=0
	objectpushdx(v1)=0.0
	objectpushdy(v1)=0.0
	objectattackpower(v1)=0
	objectdefensepower(v1)=0
	objectdestructiontype(v1)=0
	objectid(v1)=-1
	objecttype(v1)=0
	objectsubtype(v1)=0
	objectactive(v1)=0
	objectlastactive(v1)=0
	objectactivationtype(v1)=0
	objectactivationspeed(v1)=0
	objectstatus(v1)=0
	objecttimer(v1)=0
	objecttimermax1(v1)=0
	objecttimermax2(v1)=0
	objectteleportable(v1)=0
	objectbuttonpush(v1)=0
	objectwaterreact(v1)=0
	objecttelekinesisable(v1)=0
	objectfreezable(v1)=0
	objectreactive(v1)=1
	objectchild(v1)=-1
	objectparent(v1)=-1
	;v2=0
	For v2=0 To 9
		objectdata(v1,v2)=0
		;v2=v2+1
	Next
	;v2=0
	For v2=0 To 3
		objecttextdata(v1,v2)=""
		;v2=v2+1
	Next
	objecttalkable(v1)=0
	objectstandardanim(v1)=0
	objecttilex(v1)=0
	objecttiley(v1)=0
	objecttilex2(v1)=0
	objecttiley2(v1)=0
	objectmovementtimer(v1)=0
	objectmovementspeed(v1)=0
	objectmovexgoal(v1)=0
	objectmoveygoal(v1)=0
	objecttiletypecollision(v1)=0
	objectobjecttypecollision(v1)=0
	objectcaged(v1)=0
	objectdead(v1)=0
	objectdeadtimer(v1)=0
	objectexclamation(v1)=0
	objectshadow(v1)=0
	objectlinked(v1)=-1
	objectlinkback(v1)=-1
	objectflying(v1)=0
	objectfrozen(v1)=0
	objectfutureint23(v1)=0
	objectfutureint24(v1)=0
	objectfutureint25(v1)=0
	objectscaleadjust(v1)=0.0
	objectscalexadjust(v1)=1.0
	objectscaleyadjust(v1)=1.0
	objectscalezadjust(v1)=1.0
	objectfuturefloat5(v1)=0.0
	objectfuturefloat6(v1)=0.0
	objectfuturefloat7(v1)=0.0
	objectfuturefloat8(v1)=0.0
	objectfuturefloat9(v1)=0.0
	objectfuturefloat10(v1)=0.0
	objectfuturestring1(v1)="0"
	objectfuturestring2(v1)="0"
	nofobjects=nofobjects+1
	Return v1
End Function

Function loadobject(a0,a1,a2)
	
	v1=nofobjects
	objectentity(v1)=0
	objecttexture(v1)=0
	objectexists(v1)=1
	objectmodelname(v1)=ReadString(a0)
	objecttexturename(v1)=ReadString(a0)
	objectxscale(v1)=ReadFloat(a0)
	objectyscale(v1)=ReadFloat(a0)
	objectzscale(v1)=ReadFloat(a0)
	objectxadjust(v1)=ReadFloat(a0)
	objectyadjust(v1)=ReadFloat(a0)
	objectzadjust(v1)=ReadFloat(a0)
	objectpitchadjust(v1)=ReadFloat(a0)
	objectyawadjust(v1)=ReadFloat(a0)
	objectrolladjust(v1)=ReadFloat(a0)
	objectx(v1)=ReadFloat(a0)
	objecty(v1)=ReadFloat(a0)
	objectz(v1)=ReadFloat(a0)
	objectoldx(v1)=ReadFloat(a0)
	objectoldy(v1)=ReadFloat(a0)
	objectoldz(v1)=ReadFloat(a0)
	objectdx(v1)=ReadFloat(a0)
	objectdy(v1)=ReadFloat(a0)
	objectdz(v1)=ReadFloat(a0)
	objectpitch(v1)=ReadFloat(a0)
	objectyaw(v1)=ReadFloat(a0)
	objectroll(v1)=ReadFloat(a0)
	objectpitch2(v1)=ReadFloat(a0)
	objectyaw2(v1)=ReadFloat(a0)
	objectroll2(v1)=ReadFloat(a0)
	objectxgoal(v1)=ReadFloat(a0)
	objectygoal(v1)=ReadFloat(a0)
	objectzgoal(v1)=ReadFloat(a0)
	objectmovementtype(v1)=ReadInt(a0)
	objectmovementtypedata(v1)=ReadInt(a0)
	objectspeed(v1)=ReadFloat(a0)
	objectradius(v1)=ReadFloat(a0)
	objectradiustype(v1)=ReadInt(a0)
	objectdata10(v1)=ReadInt(a0)
	objectpushdx(v1)=ReadFloat(a0)
	objectpushdy(v1)=ReadFloat(a0)
	objectattackpower(v1)=ReadInt(a0)
	objectdefensepower(v1)=ReadInt(a0)
	objectdestructiontype(v1)=ReadInt(a0)
	objectid(v1)=ReadInt(a0)
	objecttype(v1)=ReadInt(a0)
	objectsubtype(v1)=ReadInt(a0)
	objectactive(v1)=ReadInt(a0)
	objectlastactive(v1)=ReadInt(a0)
	objectactivationtype(v1)=ReadInt(a0)
	objectactivationspeed(v1)=ReadInt(a0)
	objectstatus(v1)=ReadInt(a0)
	objecttimer(v1)=ReadInt(a0)
	objecttimermax1(v1)=ReadInt(a0)
	objecttimermax2(v1)=ReadInt(a0)
	objectteleportable(v1)=ReadInt(a0)
	objectbuttonpush(v1)=ReadInt(a0)
	objectwaterreact(v1)=ReadInt(a0)
	objecttelekinesisable(v1)=ReadInt(a0)
	objectfreezable(v1)=ReadInt(a0)
	objectreactive(v1)=ReadInt(a0)
	objectchild(v1)=ReadInt(a0)
	objectparent(v1)=ReadInt(a0)
	;v2=0
	For v2=0 To 9
		objectdata(v1,v2)=ReadInt(a0)
		;v2=v2+1
	Next
	;v2=0
	For v2=0 To 3
		objecttextdata(v1,v2)=ReadString(a0)
		;v2=v2+1
	Next
	objecttalkable(v1)=ReadInt(a0)
	objectcurrentanim(v1)=ReadInt(a0)
	If (objecttype(v1)<>370 Or (objectstatus(v1)<>2)) Then
		objectcurrentanim(v1)=0
	End If
	objectstandardanim(v1)=ReadInt(a0)
	objecttilex(v1)=ReadInt(a0)
	objecttiley(v1)=ReadInt(a0)
	objecttilex2(v1)=ReadInt(a0)
	objecttiley2(v1)=ReadInt(a0)
	objectmovementtimer(v1)=ReadInt(a0)
	objectmovementspeed(v1)=ReadInt(a0)
	objectmovexgoal(v1)=ReadInt(a0)
	objectmoveygoal(v1)=ReadInt(a0)
	objecttiletypecollision(v1)=ReadInt(a0)
	objectobjecttypecollision(v1)=ReadInt(a0)
	objectcaged(v1)=ReadInt(a0)
	objectdead(v1)=ReadInt(a0)
	objectdeadtimer(v1)=ReadInt(a0)
	objectexclamation(v1)=ReadInt(a0)
	objectshadow(v1)=ReadInt(a0)
	objectlinked(v1)=ReadInt(a0)
	objectlinkback(v1)=ReadInt(a0)
	objectflying(v1)=ReadInt(a0)
	objectfrozen(v1)=ReadInt(a0)
	objectfutureint23(v1)=ReadInt(a0)
	objectfutureint24(v1)=ReadInt(a0)
	objectfutureint25(v1)=ReadInt(a0)
	objectscaleadjust(v1)=ReadFloat(a0)
	objectscalexadjust(v1)=ReadFloat(a0)
	objectscaleyadjust(v1)=ReadFloat(a0)
	objectscalezadjust(v1)=ReadFloat(a0)
	objectscalexadjust(v1)=1.0
	objectscaleyadjust(v1)=1.0
	objectscalezadjust(v1)=1.0
	objectfuturefloat5(v1)=ReadFloat(a0)
	objectfuturefloat6(v1)=ReadFloat(a0)
	objectfuturefloat7(v1)=ReadFloat(a0)
	objectfuturefloat8(v1)=ReadFloat(a0)
	objectfuturefloat9(v1)=ReadFloat(a0)
	objectfuturefloat10(v1)=ReadFloat(a0)
	objectfuturestring1(v1)=ReadString(a0)
	objectfuturestring2(v1)=ReadString(a0)
	;v3=0
	For v3=0 To 30
		ReadString(a0)
		;v3=v3+1
	Next
	If levelformat104=1 Then
		If (a1=1 And (objecttype(v1)=1)) Then
			adjustleveltilelogic(Floor(objectx(v1)),Floor(objecty(v1)),v1)
		End If
	Else If objecttype(v1)<>1 Then
		adjustleveltilelogic(Floor(objectx(v1)),Floor(objecty(v1)),v1)
	End If
	If objectmodelname(v1)="" Then
		Return 0
	End If
	If a2=0 Then
		nofobjects=nofobjects+1
		Return 0
	End If
	If objectscaleadjust(v1)<>0.0 Then
		objectxscale(v1)=objectxscale(v1)*objectscaleadjust(v1)
		objectyscale(v1)=objectyscale(v1)*objectscaleadjust(v1)
		objectzscale(v1)=objectzscale(v1)*objectscaleadjust(v1)
	End If
	objectscaleadjust(v1)=1.0
	If Left$(objectmodelname(v1),9)="!Obstacle" Then
		objectentity(v1)=CopyEntity(obstaclemesh(((Asc(Mid$(objectmodelname(v1),10,1))-48)*10+Asc(Mid$(objectmodelname(v1),11,1))-48)),0)
	Else
		Select objectmodelname(v1)
		Case "!Player"
			If a1=1 Then
				nofobjects=nofobjects+1
				createstinkermodel(v1,objectxscale(v1),objectyscale(v1),objectzscale(v1),objecttexturename(v1))
			End If
			Return 0
		Case "!Hat","!Shadow"
			Return 0
		Case "!NPC"
			objecttexturename(v1)="!T"
			If objectdata(v1,0)<10 Then
				objecttexturename(v1)=objecttexturename(v1)+"00"+objectdata(v1,0)
			Else If objectdata(v1,0)<100 Then
				objecttexturename(v1)=objecttexturename(v1)+"0"+objectdata(v1,0)
			Else
				objecttexturename(v1)=objecttexturename(v1)+objectdata(v1,0)
			End If
			objecttexturename(v1)=objecttexturename(v1)+Chr$(objectdata(v1,1)+65)
			If objectdata(v1,2)>0 Then
				If objectdata(v1,2)<10 Then
					objecttexturename(v1)=objecttexturename(v1)+"00"+objectdata(v1,2)
				Else If objectdata(v1,2)<100 Then
					objecttexturename(v1)=objecttexturename(v1)+"0"+objectdata(v1,2)
				Else
					objecttexturename(v1)=objecttexturename(v1)+""+objectdata(v1,2)
				End If
				objecttexturename(v1)=objecttexturename(v1)+Chr$(objectdata(v1,3)+64)+"0"
			End If
			If (objectdata(v1,4)>0 And (objectdata(v1,2)>0)) Then
				objecttexturename(v1)=objecttexturename(v1)+" "
			End If
			If objectdata(v1,4)>0 Then
				If objectdata(v1,4)<10 Then
					objecttexturename(v1)=objecttexturename(v1)+"00"+objectdata(v1,4)
				Else If objectdata(v1,4)<100 Then
					objecttexturename(v1)=objecttexturename(v1)+"0"+objectdata(v1,4)
				Else
					objecttexturename(v1)=objecttexturename(v1)+""+objectdata(v1,4)
				End If
				objecttexturename(v1)=objecttexturename(v1)+Chr$(objectdata(v1,5)+64)+"0"
			End If
			nofobjects=nofobjects+1
			createstinkermodel(v1,objectxscale(v1),objectyscale(v1),objectzscale(v1),objecttexturename(v1))
			If objectdata(v1,0)=5 Then
				EntityTexture GetChild(objectentity(v1),3),waterfalltexture,0,0
			Else
				EntityTexture GetChild(objectentity(v1),3),stinkertexture(objectdata(v1,0),objectdata(v1,1)),0,0
			End If
			Return 0
		Case "!StinkerWee"
			objectentity(v1)=CopyEntity(stinkerweemesh,0)
		Case "!Cage"
			objectentity(v1)=CopyEntity(cagemesh,0)
		Case "!StarGate"
			objectentity(v1)=CopyEntity(stargatemesh,0)
		Case "!Scritter"
			objectentity(v1)=CopyEntity(scrittermesh,0)
		Case "!Turtle"
			objectentity(v1)=CopyEntity(turtlemesh,0)
			If objectstatus(v1)=2 Then
				AnimateMD2 objectentity(v1),3,0.2,31,49,0.0
			End If
		Case "!Crab"
			objectentity(v1)=CopyEntity(crabmesh,0)
			If objectdata(v1,1)>=2 Then
				AnimateMD2 objectentity(v1),3,1.0,48,49,0.0
			End If
			If objectsubtype(v1)=0 Then
				EntityTexture objectentity(v1),crabtexture2,0,0
			End If
			If objectstatus(v1)=2 Then
				objectz(v1)=-0.1
				AnimateMD2 objectentity(v1),3,1.0,46,49,0.0
			End If
		Case "!Kaboom"
			objectentity(v1)=CopyEntity(kaboommesh,0)
			EntityTexture objectentity(v1),kaboomtexture(objectdata(v1,0)),0,0
			TurnEntity objectentity(v1),0.0,90.0,0.0,0
		Case "!BabyBoomer"
			objectentity(v1)=CopyEntity(kaboommesh,0)
			EntityTexture objectentity(v1),kaboomtexture(1),0,0
			TurnEntity objectentity(v1),0.0,90.0,0.0,0
		Case "!FireFlower"
			objectentity(v1)=CopyEntity(fireflowermesh,0)
		Case "!Chomper"
			objectentity(v1)=CopyEntity(chompermesh,0)
			AnimateMD2 objectentity(v1),1,0.6,1,29,0.0
		Case "!Thwart"
			objectentity(v1)=CopyEntity(thwartmesh,0)
			EntityTexture objectentity(v1),thwarttexture(objectdata(v1,0)),0,0
		Case "!Bowler"
			objectentity(v1)=CopyEntity(bowlermesh,0)
		Case "!Tentacle"
			objectentity(v1)=CopyEntity(tentaclemesh,0)
			Animate GetChild(objectentity(v1),3),1,0.1,1,0.0
		Case "!Busterfly"
			objectentity(v1)=CopyEntity(busterflymesh,0)
			AnimateMD2 objectentity(v1),2,0.4,2,9,0.0
		Case "!Rubberducky"
			objectentity(v1)=CopyEntity(rubberduckymesh,0)
		Case "!GlowWorm"
			objectentity(v1)=CreateSphere(12,0)
			ScaleMesh objectentity(v1),0.1,0.1,0.1
			EntityColor objectentity(v1),objectdata(v1,5),objectdata(v1,6),objectdata(v1,7)
			EntityBlend objectentity(v1),3
		Case "!Void"
			objectentity(v1)=createvoidmesh()
		Case "!Spring"
			objectentity(v1)=CopyMesh(cylinder,0)
			RotateMesh objectentity(v1),90.0,0.0,0.0
			ScaleMesh objectentity(v1),1.1,1.1,1.1
			EntityTexture objectentity(v1),springtexture,0,0
		Case "!FlipBridge"
			objectentity(v1)=createflipbridgemesh(objectdata(v1,0))
			EntityTexture objectentity(v1),gatetexture,0,0
		Case "!WaterFall"
			objectentity(v1)=createwaterfallmesh()
		Case "!Star"
			objectentity(v1)=CopyEntity(starmesh,0)
			EntityTexture objectentity(v1),goldstartexture,0,0
		Case "!Wisp"
			objectentity(v1)=CopyEntity(starmesh,0)
			EntityTexture objectentity(v1),wisptexture,0,0
		Case "!Coin"
			objectentity(v1)=CopyEntity(coinmesh,0)
			EntityTexture objectentity(v1),goldcointexture,0,0
			If objecttype(v1)=425 Then
				EntityTexture objectentity(v1),retrorainbowcointexture,0,0
			End If
		Case "!Token"
			objectentity(v1)=CopyEntity(coinmesh,0)
			EntityTexture objectentity(v1),tokencointexture,0,0
		Case "!Key"
			objectentity(v1)=createkeymesh(objectdata(v1,0))
		Case "!Gem"
			objectentity(v1)=CopyEntity(gemmesh(objectdata(v1,0)),0)
			EntityTexture objectentity(v1),teleportertexture(objectdata(v1,1)),0,0
		Case "!CustomItem"
			objectentity(v1)=createcustomitemmesh(objectdata(v1,0))
		Case "!Sign"
			objectentity(v1)=CopyEntity(signmesh(objectdata(v1,0)),0)
			EntityTexture objectentity(v1),signtexture(objectdata(v1,1)),0,0
		Case "!Barrel1"
			objectentity(v1)=CopyEntity(barrelmesh,0)
			EntityTexture objectentity(v1),barreltexture1,0,0
		Case "!Barrel2"
			objectentity(v1)=CopyEntity(barrelmesh,0)
			EntityTexture objectentity(v1),barreltexture2,0,0
		Case "!Cuboid"
			objectentity(v1)=CreateCube(0)
			ScaleMesh objectentity(v1),0.4,0.4,0.4
			PositionMesh objectentity(v1),0.0,0.5,0.0
			If (objectdata(v1,0)<0 Or (objectdata(v1,0)>8)) Then
				objectdata(v1,0)=0
			End If
			EntityTexture objectentity(v1),teleportertexture(objectdata(v1,0)),0,0
		Case "!ColourGate"
			objectentity(v1)=createcolourgatemesh(objectdata(v1,2),objectdata(v1,0))
		Case "!Transporter"
			objectentity(v1)=createtransportermesh(objectdata(v1,0))
		Case "!Button"
			createbuttonmesh(v1,objectsubtype(v1),objectdata(v1,0),objectdata(v1,1),objectdata(v1,2),objectdata(v1,3))
		Case "!SteppingStone"
			objectentity(v1)=CopyEntity(cylinder,0)
			EntityTexture objectentity(v1),steppingstonetexture(objectdata(v1,0)),0,0
		Case "!Teleport"
			objectentity(v1)=createteleportermesh(objectdata(v1,0))
		Case "!IceBlock"
			objectentity(v1)=createiceblockmesh()
		Case "!IceFloat"
			objectentity(v1)=createicefloatmesh()
		Case "!Door"
			objectentity(v1)=CopyEntity(door013ds,0)
		Case "!SpellBall"
			If a1=1 Then
				objectentity(v1)=createspellballmesh(objectsubtype(v1))
			Else
				Return 0
			End If
		Case "!Item"
			objectentity(v1)=createpickupitemmesh(objectdata(v1,2))
		Case "!Fence1"
			objectentity(v1)=CopyEntity(fence1,0)
		Case "!Fence2"
			objectentity(v1)=CopyEntity(fence2,0)
		Case "!Fencepost"
			objectentity(v1)=CopyEntity(fencepost,0)
		Case "!Fountain"
			objectentity(v1)=CopyEntity(fountain,0)
		Case "!Cylinder"
			objectentity(v1)=CopyEntity(cylinder,0)
		Case "!Square"
			objectentity(v1)=CopyMesh(square,0)
		Case "!Retrolasergate"
			objectentity(v1)=createretrolasergatemesh(objectdata(v1,0))
		Case "!Retrobox"
			objectentity(v1)=CopyEntity(retroboxmesh,0)
		Case "!Retrocoily"
			objectentity(v1)=CopyEntity(retrocoilymesh,0)
		Case "!Retroscouge"
			objectentity(v1)=CopyEntity(retroscougemesh,0)
			objectyawadjust(v1)=(objectdata(v1,0)*(-90)+3600) Mod 360
		Case "!Retrozbot"
			objectentity(v1)=CopyEntity(retrozbotmesh,0)
			objectyawadjust(v1)=(objectdata(v1,0)*(-90)+3600) Mod 360
		Case "!Retroufo"
			objectentity(v1)=CopyEntity(retroufomesh,0)
			objectyawadjust(v1)=(objectdata(v1,0)*(-90)+3600) Mod 360
		Case "!None"
			objectentity(v1)=CreatePivot(0)
		Default
			objectentity(v1)=myloadmesh(objectmodelname(v1),0)
		End Select
	End If
	If objecttype(v1)=163 Then
		PositionMesh objectentity(v1),0.0,-152.7027,33.783783
	End If
	If objecttexturename(v1)="!Door" Then
		If doortexture(objectdata(v1,5))=0 Then
			objectdata(v1,5)=0
		End If
		EntityTexture objectentity(v1),doortexture(objectdata(v1,5)),0,0
	Else If objecttexturename(v1)="!Cottage" Then
		If cottagetexture(objectdata(v1,5))=0 Then
			objectdata(v1,5)=0
		End If
		EntityTexture objectentity(v1),cottagetexture(objectdata(v1,5)),0,0
	Else If objecttexturename(v1)="!Townhouse" Then
		If housetexture(objectdata(v1,5))=0 Then
			objectdata(v1,5)=0
		End If
		EntityTexture objectentity(v1),housetexture(objectdata(v1,5)),0,0
	Else If objecttexturename(v1)="!Windmill" Then
		If windmilltexture(objectdata(v1,5))=0 Then
			objectdata(v1,5)=0
		End If
		EntityTexture objectentity(v1),windmilltexture(objectdata(v1,5)),0,0
	Else If objecttexturename(v1)="!Fence" Then
		If fencetexture(objectdata(v1,5))=0 Then
			objectdata(v1,5)=0
		End If
		EntityTexture objectentity(v1),fencetexture(objectdata(v1,5)),0,0
	Else If objecttexturename(v1)="data\models\squares\firetrap.bmp" Then
		EntityTexture objectentity(v1),firetraptex,0,0
	Else If objecttexturename(v1)="!GloveTex" Then
		EntityTexture objectentity(v1),glovetex,0,0
	Else If objecttexturename(v1)="!FireTrap" Then
		EntityTexture objectentity(v1),firetraptexture,0,0
	Else If (((objecttexturename(v1)<>"" And ((objecttexturename(v1)<>"")<>"!None")) And (Left$(objecttexturename(v1),1)<>"!")) And (objectmodelname(v1)<>"!Button")) Then
	objecttexture(v1)=myloadtexture(objecttexturename(v1),4)
	If (objecttexture(v1)<>0)
			EntityTexture objectentity(v1),objecttexture(v1),0,0
			;v3=1
			For v3=1 To CountChildren(objectentity(v1))
				EntityTexture GetChild(objectentity(v1),v3),objecttexture(v1),0,0
				;v3=v3+1
			Next
		Else
			objecttexture(v1)=0
		End If
	End If
	nofobjects=nofobjects+1
	Select objectmodelname(v1)
	Case "!StinkerWee","!Scritter","!BabyBoomer"
		createshadow(v1,0.5)
	Case "!Turtle","!Thwart"
		createshadow(v1,0.9)
	Case "!Chomper","!Bowler","!Kaboom"
		createshadow(v1,0.6)
	Case "!Crab"
		If objectsubtype(v1)=0 Then
			createshadow(v1,0.5)
		Else
			createshadow(v1,0.9)
		End If
	Case "!FlipBridge"
		v3=createnewobject()
		objectentity(v3)=CreateCylinder(32,1,0)
		objectxscale(v3)=0.35
		objectyscale(v3)=0.35
		objectzscale(v3)=0.35
		objectx(v3)=objectx(v1)
		objecty(v3)=objecty(v1)
		objectz(v3)=-0.241
		EntityTexture objectentity(v3),cagetexture,0,0
	End Select
End Function

Function copyobjectdata(a0,a1)
	
	objectmodelname(a1)=objectmodelname(a0)
	objecttexturename(a1)=objecttexturename(a0)
	objectxscale(a1)=objectxscale(a0)
	objectyscale(a1)=objectyscale(a0)
	objectzscale(a1)=objectzscale(a0)
	objectxadjust(a1)=objectxadjust(a0)
	objectyadjust(a1)=objectyadjust(a0)
	objectzadjust(a1)=objectzadjust(a0)
	objectpitchadjust(a1)=objectpitchadjust(a0)
	objectyawadjust(a1)=objectyawadjust(a0)
	objectrolladjust(a1)=objectrolladjust(a0)
	objectexists(a1)=objectexists(a0)
	objectentity(a1)=objectentity(a0)
	objecttexture(a1)=objecttexture(a0)
	objectx(a1)=objectx(a0)
	objecty(a1)=objecty(a0)
	objectz(a1)=objectz(a0)
	objectdx(a1)=objectdx(a0)
	objectdy(a1)=objectdy(a0)
	objectdz(a1)=objectdz(a0)
	objectpitch(a1)=objectpitch(a0)
	objectyaw(a1)=objectyaw(a0)
	objectroll(a1)=objectroll(a0)
	objectpitch2(a1)=objectpitch2(a0)
	objectyaw2(a1)=objectyaw2(a0)
	objectroll2(a1)=objectroll2(a0)
	objectxgoal(a1)=objectxgoal(a0)
	objectygoal(a1)=objectygoal(a0)
	objectzgoal(a1)=objectzgoal(a0)
	objectmovementtype(a1)=objectmovementtype(a0)
	objectmovementtypedata(a1)=objectmovementtypedata(a0)
	objectspeed(a1)=objectspeed(a0)
	objectradius(a1)=objectradius(a0)
	objectradiustype(a1)=objectradiustype(a0)
	objectdata10(a1)=objectdata10(a0)
	objectpushdx(a1)=objectpushdx(a0)
	objectpushdy(a1)=objectpushdy(a0)
	objectattackpower(a1)=objectattackpower(a0)
	objectdefensepower(a1)=objectdefensepower(a0)
	objectdestructiontype(a1)=objectdestructiontype(a0)
	objectid(a1)=objectid(a0)
	objecttype(a1)=objecttype(a0)
	objectsubtype(a1)=objectsubtype(a0)
	objectactive(a1)=objectactive(a0)
	objectlastactive(a1)=objectlastactive(a0)
	objectactivationtype(a1)=objectactivationtype(a0)
	objectactivationspeed(a1)=objectactivationspeed(a0)
	objectstatus(a1)=objectstatus(a0)
	objecttimer(a1)=objecttimer(a0)
	objecttimermax1(a1)=objecttimermax1(a0)
	objecttimermax2(a1)=objecttimermax2(a0)
	objectteleportable(a1)=objectteleportable(a0)
	objectbuttonpush(a1)=objectbuttonpush(a0)
	objectwaterreact(a1)=objectwaterreact(a0)
	objecttelekinesisable(a1)=objecttelekinesisable(a0)
	objectfreezable(a1)=objectfreezable(a0)
	objectreactive(a1)=objectreactive(a0)
	objectchild(a1)=objectchild(a0)
	objectparent(a1)=objectparent(a0)
	;v1=0
	For v1=0 To 9
		objectdata(a1,v1)=objectdata(a0,v1)
		;v1=v1+1
	Next
	;v1=0
	For v1=0 To 3
		objecttextdata(a1,v1)=objecttextdata(a0,v1)
		;v1=v1+1
	Next
	objecttalkable(a1)=objecttalkable(a0)
	objectcurrentanim(a1)=objectcurrentanim(a0)
	objectstandardanim(a1)=objectstandardanim(a0)
	objecttilex(a1)=objecttilex(a0)
	objecttiley(a1)=objecttiley(a0)
	objecttilex2(a1)=objecttilex2(a0)
	objecttiley2(a1)=objecttiley2(a0)
	objectmovementtimer(a1)=objectmovementtimer(a0)
	objectmovementspeed(a1)=objectmovementspeed(a0)
	objectmovexgoal(a1)=objectmovexgoal(a0)
	objectmoveygoal(a1)=objectmoveygoal(a0)
	objecttiletypecollision(a1)=objecttiletypecollision(a0)
	objectobjecttypecollision(a1)=objectobjecttypecollision(a0)
	objectcaged(a1)=objectcaged(a0)
	objectdead(a1)=objectdead(a0)
	objectdeadtimer(a1)=objectdeadtimer(a0)
	objectexclamation(a1)=objectexclamation(a0)
	objectshadow(a1)=objectshadow(a0)
	objectlinked(a1)=objectlinked(a0)
	objectlinkback(a1)=objectlinkback(a0)
	objectflying(a1)=objectflying(a0)
	objectfrozen(a1)=objectfrozen(a0)
	objectfutureint23(a1)=objectfutureint23(a0)
	objectfutureint24(a1)=objectfutureint24(a0)
	objectfutureint25(a1)=objectfutureint25(a0)
	objectscaleadjust(a1)=objectscaleadjust(a0)
	objectscalexadjust(a1)=objectscalexadjust(a0)
	objectscaleyadjust(a1)=objectscaleyadjust(a0)
	objectscalezadjust(a1)=objectscalezadjust(a0)
	objectfuturefloat5(a1)=objectfuturefloat5(a0)
	objectfuturefloat6(a1)=objectfuturefloat6(a0)
	objectfuturefloat7(a1)=objectfuturefloat7(a0)
	objectfuturefloat8(a1)=objectfuturefloat8(a0)
	objectfuturefloat9(a1)=objectfuturefloat9(a0)
	objectfuturefloat10(a1)=objectfuturefloat10(a0)
	objectfuturestring1(a1)=objectfuturestring1(a0)
	objectfuturestring2(a1)=objectfuturestring1(a0)
	If a0=playerobject Then
		playerobject=a1
	End If
	If a0=stinkerobject Then
		stinkerobject=a1
	End If
	If a0=camerafocusobject Then
		camerafocusobject=a1
	End If
	If a0=telekinesisobject Then
		telekinesisobject=a1
	End If
	If a0=dialogobject1 Then
		dialogobject1=a1
	End If
	If a0=dialogobject2 Then
		dialogobject2=a1
	End If
	If a0=playertalktogoalobject Then
		playertalktogoalobject=a1
	End If
	;v2=0
	For v2=0 To nofobjects
		If objectparent(v2)=a0 Then
			objectparent(v2)=a1
		End If
		If objectchild(v2)=a0 Then
			objectchild(v2)=a1
		End If
		If objectlinked(v2)=a0 Then
			objectlinked(v2)=a1
		End If
		If objectlinkback(v2)=a0 Then
			objectlinkback(v2)=a1
		End If
		;v2=v2+1
	Next
End Function

Function adjustleveltilelogic(a0,a1,a2)
	
	If objectfrozen(a2)>0 Then
		Select objecttype(a2)
		Case 1,110,120,150,220,230,250,260,290,370,390,400
			If (objecttilelogic(a0,a1) And (1024))=0 Then
				objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+1024.0
			End If
			Return 0
		End Select
	End If
	Select objecttype(a2)
	Case 1
		If (objecttilelogic(a0,a1) And (2))=0 Then
			objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+2.0
		End If
	Case 10
	Case 30
		If objectactive(a2)=1001 Then
			leveltilelogic(a0,a1)=3
		End If
	Case 40
		If objectactive(a2)=1001 Then
			leveltilelogic(a0,a1)=4
		End If
	Case 80,81,82,83,84,85,86,87
		If (((objecttype(a2)=80 Or (objecttype(a2)=81)) Or (objecttype(a2)=86)) Or (objecttype(a2)=85)) Then
			leveltilelogic(a0,a1)=1
		End If
	Case 90,91,92
		leveltilelogic(a0,a1)=9
	Case 110,180,330
		If (((objecttilelogic(a0,a1) And (4)))=0 And (objectactive(a2)>0)) Then
			objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+4.0
		End If
		If objecttype(a2)=180 Then
			leveltilelogic(a0,a1)=1
		End If
	Case 120,400
		If (((objecttilelogic(a0,a1) And (8)))=0 And (objectactive(a2)=1001)) Then
			objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+8.0
		End If
	Case 130
		leveltilelogic(a0,a1)=10
	Case 140
		If objectactive(a2)=1001 Then
			leveltilelogic(a0,a1)=11
		End If
	Case 150,340
		If (objecttilelogic(a0,a1) And (32))=0 Then
			objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+32.0
		End If
	Case 160,165
		If objectmodelname(a2)="!Obstacle46" Then
			If (objectzadjust(a2)>-1.0 And (objectzadjust(a2)<1.0)) Then
				leveltilelogic(a0,a1)=0
			End If
		Else If (objecttexturename(a2)<>"!Cottage" And (objecttexturename(a2)<>"!Townhouse")) Then
			leveltilelogic(a0,a1)=1
		End If
	Case 170,171,172,173,174,175,176,177,178,179,425
		If (((objecttilelogic(a0,a1) And (16)))=0 And (objectactive(a2)=1001)) Then
			objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+16.0
		End If
	Case 210
		leveltilelogic(a0,a1)=4
		If (objecttilelogic(a0,a1) And (64))=0 Then
			objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+64.0
		End If
	Case 220
		If objectstatus(a2)<2 Then
			If (objecttilelogic(a0,a1) And (128))=0 Then
				objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+128.0
			End If
		Else
			If (objecttilelogic(a0,a1) And (64))=0 Then
				objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+64.0
			End If
			leveltilelogic(a0,a1)=0
		End If
	Case 230,310
		If (((objecttilelogic(a0,a1) And (128)))=0 And (objectactive(a2)>0)) Then
			objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+128.0
		End If
	Case 290,390
		If objecttalkable(a2)>0 Then
			If (((objecttilelogic(a0,a1) And (4)))=0 And (objectactive(a2)>0)) Then
				objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+4.0
			End If
		Else If (((objecttilelogic(a0,a1) And (128)))=0 And (objectactive(a2)>0)) Then
			objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+128.0
		End If
	Case 250,260,420,422,423
		If (objecttilelogic(a0,a1) And (256))=0 Then
			objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+256.0
		End If
	Case 240,241,242
		If (objecttilelogic(a0,a1) And (512))=0 Then
			objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+512.0
		End If
	Case 370
		If objectstatus(a2)<2 Then
			If objectdata(a2,1)>1 Then
				If (objecttilelogic(a0,a1) And (128))=0 Then
					objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+128.0
				End If
			Else If (objecttilelogic(a0,a1) And (32))=0 Then
				objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+32.0
			End If
		Else
			If (objecttilelogic(a0,a1) And (64))=0 Then
				objecttilelogic(a0,a1)=objecttilelogic(a0,a1)+64.0
			End If
			leveltilelogic(a0,a1)=0
		End If
	Case 410
		leveltilelogic(a0,a1)=0
		If (objectactive(a2)>0 And (objectactive(a2) Mod 2=1)) Then
			Select objectdata(a2,2)
			Case 0,4
				v4=0
				v5=-1
				v6=3
			Case 1,5
				v4=1
				v5=-1
				v6=2
			Case 2,6
				v4=1
				v5=0
				v6=3
			Case 3,7
				v4=1
				v5=1
				v6=2
			End Select
			;v7=1
			For v7=1 To v6
				objectdata(a2,3)=leveltilelogic(a0-(v7*v4),a1-(v7*v5))
				leveltilelogic(a0-(v7*v4),a1-(v7*v5))=0
				leveltilelogic(v7*v4+a0,v7*v5+a1)=0
				;v7=v7+1
			Next
		End If
	End Select
End Function

Function controlobjects()
	
	v1=CameraPick(camera,MouseX(),MouseY())
	If v1>0 Then
		mousepickx=PickedX()
		mousepicky=-PickedZ()
	End If
	nofweestinkersfollowinglast=nofweestinkersfollowing
	nofweestinkersfollowing=0
	;v2=0
	For v2=0 To nofobjects-1
		If (objectexists(v2)=1 And (objectreactive(v2)=1)) Then
			If (objectactive(v2)>0 And (objectactive(v2) Mod 2=0)) Then
				objectactive(v2)=objectactive(v2)-objectactivationspeed(v2)
			Else If (objectactive(v2)<1001 And (objectactive(v2) Mod 2=1)) Then
				objectactive(v2)=objectactive(v2)+objectactivationspeed(v2)
			End If
			If objectactive(v2)<0 Then
				objectactive(v2)=0
			End If
			If objectactive(v2)>1001 Then
				objectactive(v2)=1001
			End If
			If (objectlastactive(v2)=0 And (objectactive(v2)>0)) Then
				If (((objecttype(v2)=110 Or (objecttype(v2)=290)) Or (objecttype(v2)=60)) Or (objecttype(v2)=230) Or (objecttype(v4)=390)) Then
					occupyobjecttile(v2,objecttilex(v2),objecttiley(v2))
				End If
			End If
			If (objectlastactive(v2)>0 And (objectactive(v2)=0)) Then
				If (((objecttype(v2)=110 Or (objecttype(v2)=290)) Or (objecttype(v2)=60)) Or (objecttype(v2)=230)) Then
					vacateobjecttile(v2)
					If (objectmovementtimer(v2)>0 And ((objecttilex2(v2)<>objecttilex(v2) Or (objecttiley2(v2)<>objecttiley(v2))))) Then
						v3=objecttilex(v2)
						v4=objecttiley(v2)
						objecttilex(v2)=objecttilex2(v2)
						objecttiley(v2)=objecttiley2(v2)
						vacateobjecttile(v2)
						objecttilex(v2)=v3
						objecttiley(v2)=v4
					End If
				End If
			End If
			v5#=objectxscale(v2)*objectscalexadjust(v2)
			v6#=objectyscale(v2)*objectscaleyadjust(v2)
			v7#=objectzscale(v2)*objectscalezadjust(v2)
			Select objectactivationtype(v2)
			Case 0
			Case 1
				v7#=v7#*objectactive(v2)/1001.0
			Case 2
				v5#=v5#*objectactive(v2)/1001.0
				v6#=v6#*objectactive(v2)/1001.0
				v7#=v7#*objectactive(v2)/1001.0
			Case 3
				v5#=v5#*objectactive(v2)/1001.0
				v6#=v6#*objectactive(v2)/1001.0
			Case 11
				objectz(v2)=-0.99+(objectactive(v2)/1001.0)
			Case 12,13,14,15,16
				objectz(v2)=(-(objectactivationtype(v2)-6))-0.01+(((objectactivationtype(v2)-11)*objectactive(v2))/1001.0)
			Case 21
				EntityAlpha objectentity(v2),objectactive(v2)/1001.0
			Case 31
				objectz(v2)=1.01-(objectactive(v2)/1001.0)
			Case 41
				objectyaw(v2)=-160.0+160.0*objectactive(v2)/1001.0
			End Select
			If (objectcaged(v2)=0 And (objectdead(v2)=0)) Then
				If objectmovementtimer(v2)=0 Then
					endmovetilecheck(v2,objecttilex(v2),objecttiley(v2))
					controlmoveobject(v2)
				End If
				If objectmovementtimer(v2)>0 Then
					objectduringmove(v2)
				End If
			End If
			Select objecttype(v2)
			Case 0
			Case 1
				controlplayer(v2)
			Case 10
				controlgate(v2)
			Case 11,426
				controlstargate(v2)
			Case 20
				controltrap(v2)
			Case 30
				controlteleporter(v2)
			Case 40
				controlsteppingstone(v2)
			Case 50
				controlspellball(v2)
			Case 60,805
				controliceblock(v2)
			Case 70
				controlpickupitem(v2)
			Case 71
				controluseditem(v2)
			Case 80,81,82,83,84,85,86,87
				controlkeyblock(v2)
			Case 90
				controlbutton(v2)
			Case 100
				controlaccessory(v2)
			Case 101
				controlshadow(v2)
			Case 110,111,112,113,114,115,116,117,118,119
				controlnpc(v2)
			Case 120
				controlstinkerwee(v2)
			Case 130
				controlstinkerweeexit(v2)
			Case 140
				controlcage(v2)
			Case 150
				controlscritter(v2)
			Case 160
			Case 161
				If leveltimer Mod 60=0 Then
					playsoundfx(120,objectx(v2),objecty(v2))
				End If
				If Rand(0,200)=1 Then
					SoundPitch soundfx(124),Rand(18000,24000)
					playsoundfx(124,objectx(v2),objecty(v2))
				End If
				If Rand(0,100)=1 Then
					SoundPitch soundfx(125),Rand(18000,24000)
					playsoundfx(125,objectx(v2),objecty(v2))
				End If
				If objectyawadjust(v2)=0.0 Then
					v10=1
					v11=0
				End If
				If objectyawadjust(v2)=90.0 Then
					v10=0
					v11=1
				End If
				If (objectyawadjust(v2)=-90.0 Or (objectyawadjust(v2)=270.0)) Then
					v10=0
					v11=-1
				End If
				If Rand(0,100)<10 Then
					addparticle(5,Rnd((-0.5)*objectxscale(v2),0.5*objectxscale(v2))*v10+objectx(v2)+Rnd(0.55,0.6)*v11,objectzadjust(v2),(Rnd((-0.5)*objectxscale(v2),0.5*objectxscale(v2))*v11+-objecty(v2))-(Rnd(0.55,0.6)*v10),0.0,0.11,Rnd(-0.005,0.005)*v10+Rnd(0.0,0.005)*v11,Rnd(0.01,0.03),Rnd(0.0,0.001)*(-v10)+Rnd(-0.005,0.005)*v11,0.0,0.0,0.0,-0.0004,0.0,100,3)
				End If
				If Rand(0,100)<3 Then
					addparticle(6,Rnd((-0.5)*objectxscale(v2),0.5*objectxscale(v2))*v10+objectx(v2)+Rnd(0.65,0.7)*v11,Rnd(objectzadjust(v2),objectzadjust(v2)+objectzscale(v2)/2.0),(Rnd((-0.5)*objectxscale(v2),0.5*objectxscale(v2))*v11+-objecty(v2))-(v10*0.6),0.0,0.5,v11*Rnd(0.0,0.005),Rnd(0.01,0.02),0.0,0.0,0.01,0.0,0.0,0.0,100,3)
				End If
				If Rand(0,100)<10 Then
					addparticle(4,Rnd((-0.35)*objectxscale(v2),0.35*objectxscale(v2))*v10+objectx(v2)+(v11*0.5),(-0.2)*objectzscale(v2)+objectzadjust(v2),(Rnd((-0.35)*objectxscale(v2),0.35*objectxscale(v2))*v11+-objecty(v2))-(v10*0.5),0.0,0.2,0.0,0.0,0.0,0.0,0.012,0.0,0.0,0.0,100,4)
				End If
			Case 162
			Case 163
				If (objectyawadjust(v2)=0.0 Or (objectyawadjust(v2)=180.0)) Then
					objectroll(v2)=objectroll(v2)+1.0
				Else
					objectpitch(v2)=objectpitch(v2)+1.0
				End If
				objectzadjust(v2)=5.65
			Case 164
				If objectactive(v2)>0 Then
					addparticle(objectdata(v2,0),objecttilex(v2)+0.5,objectzadjust(v2)+0.5,(-objecttiley(v2))-0.5,0.0,0.1,Rnd(-0.01,0.01),Rnd(0.07,0.099),Rnd(-0.01,0.01),0.0,0.001,0.0,-0.001,0.0,150,3)
				End If
			Case 165
			Case 170
				controlgoldstar(v2)
			Case 171,174
				controlgoldcoin(v2)
			Case 172
				controlkey(v2)
			Case 173
				controlgem(v2)
			Case 179
				controlcustomitem(v2)
			Case 180
				controlsigns(v2)
			Case 190
				controlparticleemitters(v2)
			Case 200
				controlglovecharge(v2)
			Case 210
				controltransporter(v2)
			Case 220
				controlturtle(v2)
			Case 230
				controlfireflower(v2)
			Case 242
				objectxscale(v2)=0.9+Sin(leveltimer*2 Mod 360)*0.1
				objectyscale(v2)=0.9+Sin(leveltimer*2 Mod 360)*0.1
				objectzscale(v2)=0.9+Sin(leveltimer*2 Mod 360)*0.1
			Case 250
				controlchomper(v2)
			Case 260
				controlbowler(v2)
			Case 270
				controlbutterfly(v2)
			Case 280
				controlspring(v2)
			Case 290
				controlthwart(v2)
			Case 300
				controlicefloat(v2)
			Case 310
				controlrubberducky(v2)
			Case 320
				controlvoid(v2)
			Case 330
				controlwisp(v2)
			Case 340
				controltentacle(v2)
			Case 370
				controlcrab(v2)
			Case 390
				controlkaboom(v2)
			Case 400
				controlbabyboomer(v2)
			Case 410
				controlflipbridge(v2)
			Case 420
				controlretrocoily(v2)
			Case 421
				controlretroscouge(v2)
			Case 422,423
				controlretrozbotufo(v2)
			Case 424
				controlretrolasergate(v2)
			Case 425
				controlretrorainbowcoin(v2)
			End Select
			If objectentity(v2)>0 Then
				ScaleEntity objectentity(v2),v5#,v7#,v6#,0
				If (((((objecttilex(v2)<>0 Or (objecttilex2(v2)<>0)) Or (objecttiley(v2)<>0)) Or (objecttiley2(v2)<>0)) And (objectmodelname(v2)<>"!SpellBall")) And (objecttype(v2)<>270)) Then
					If (objecttype(v2)=10 And ((((objectsubtype(v2)=1 Or (objectsubtype(v2)=2)) Or (objectsubtype(v2)=3)) Or (objectsubtype(v2)=4)))) Then
					Else If objectlinked(v2)>=0 Then
						objectx(v2)=objectx(objectlinked(v2))
						objecty(v2)=objecty(objectlinked(v2))
					Else
						objectx(v2)=objecttilex(v2)+0.5+(((objecttilex2(v2)-objecttilex(v2))*objectmovementtimer(v2))/1000.0)
						objecty(v2)=objecttiley(v2)+0.5+(((objecttiley2(v2)-objecttiley(v2))*objectmovementtimer(v2))/1000.0)
					End If
				End If
				If objecttype(v2)=230 Then
					v12#=-26.0
					v13#=0.0
					PositionEntity objectentity(v2),objectx(v2)+objectxadjust(v2)+objectxscale(v2)*v12#*Cos(objectyaw(v2))+objectyscale(v2)*v13#*Sin(objectyaw(v2)),objectz(v2)+objectzadjust(v2),((-objecty(v2))-objectyadjust(v2)+objectxscale(v2)*v12#*Sin(objectyaw(v2)))-objectyscale(v2)*v13#*Cos(objectyaw(v2)),0
				Else If objecttype(v2)=220 Then
					v12#=-22.0
					v13#=0.0
					PositionEntity objectentity(v2),objectx(v2)+objectxadjust(v2)+objectxscale(v2)*v12#*Cos(objectyaw(v2))+objectyscale(v2)*v13#*Sin(objectyaw(v2)),objectz(v2)+objectzadjust(v2),((-objecty(v2))-objectyadjust(v2)+objectxscale(v2)*v12#*Sin(objectyaw(v2)))-objectyscale(v2)*v13#*Cos(objectyaw(v2)),0
				Else If objecttype(v2)=60 Then
					If objectchild(v2)>=0 Then
						PositionEntity objectentity(v2),objectx(objectchild(v2))+objectxadjust(objectchild(v2)),objectz(objectchild(v2))+objectzadjust(objectchild(v2)),(-objecty(objectchild(v2)))-objectyadjust(objectchild(v2)),0
					End If
				Else
					PositionEntity objectentity(v2),objectx(v2)+objectxadjust(v2),objectz(v2)+objectzadjust(v2),(-objecty(v2))-objectyadjust(v2),0
				End If
				If objecttype(v2)=100 Then
					RotateEntity objectentity(v2),objectpitch(v2),objectyaw(v2),objectroll(v2),0
				Else
					RotateEntity objectentity(v2),0.0,0.0,0.0,0
					TurnEntity objectentity(v2),objectpitch(v2)+objectpitchadjust(v2),0.0,objectroll(v2)+objectrolladjust(v2),0
					TurnEntity objectentity(v2),0.0,objectyaw(v2)+objectyawadjust(v2),0.0,0
					TurnEntity objectentity(v2),objectpitch2(v2),objectyaw2(v2),objectroll2(v2),0
					If (objectmodelname(v2)="!Crab") Then
						TurnEntity objectentity(v2),0.0,-90.0,0.0,0
					End If
					If (objectmodelname(v2)="!Kaboom" Or (objectmodelname(v2)="!BabyBoomer")) Then
						TurnEntity objectentity(v2),0.0,90.0,0.0,0
					End If
				End If
			End If
			If v2=playerobject Then
				PositionEntity spotlight,objectx(v2),5.0,(-objecty(v2))-3.0,0
			End If
			objectlastactive(v2)=objectactive(v2)
		End If
		;v2=v2+1
	Next
	If camerashaketimer>0 Then
		v14#=Rnd(-0.1,0.1)
		v15#=Rnd(-0.1,0.1)
		camerashaketimer=camerashaketimer-1
	End If
	If (gamemode<>12 Or (((currentmenu<>10 And (currentmenu<>21)) And (currentmenu<>23)))) Then
		If ((currentcharm<>3 Or (leveltimer<50)) Or (leveltimer>=1000000000)) Then
			If KeyDown(82) Then
				PositionEntity camera,objectx(camerafocusobject),5.0,(-objecty(camerafocusobject))-3.5,0
			Else If leveltimer<50 Then
				PositionEntity camera,objectx(camerafocusobject)+cameraaddxcurrent,(12.0+cameraaddycurrent)-10.0+(leveltimer/5.0),((-objecty(camerafocusobject))-10.0+10.0)-(leveltimer/5.0)+cameraaddzcurrent,0
			Else If (leveltimer>=1000000000 And (leveltimer<1000001000)) Then
				PositionEntity camera,objectx(camerafocusobject)+cameraaddxcurrent,(12.0+cameraaddycurrent)-((leveltimer-1000000000)/4.5),(-objecty(camerafocusobject))-10.0+((leveltimer-1000000000)/5.0)+cameraaddzcurrent,0
			Else If (leveltimer>=1000001000 And (leveltimer<1000002000)) Then
				PositionEntity camera,objectx(camerafocusobject)+cameraaddxcurrent,(12.0+cameraaddycurrent)-((leveltimer-1000001000)/180.0),(-objecty(camerafocusobject))-10.0+((leveltimer-1000001000)/200.0)+cameraaddzcurrent,0
			Else If (leveltimer>=1000002000 And (leveltimer<1000003000)) Then
				PositionEntity camera,adventurelostcamerax+cameraaddxcurrent,12.0+cameraaddycurrent,adventurelostcameray-10.0+cameraaddzcurrent,0
			Else
				PositionEntity camera,objectx(camerafocusobject)+cameraaddxcurrent+v14#,12.0+cameraaddycurrent+v15#,(-objecty(camerafocusobject))-10.0+cameraaddzcurrent,0
			End If
		Else
			v16#=mousepickx
			v17#=mousepicky
			If v16#<0.0 Then
				v16#=0.0
			End If
			If v17#<0.0 Then
				v17#=0.0
			End If
			If v16#>levelwidth Then
				v16#=levelwidth
			End If
			If v17#>levelheight Then
				v17#=levelheight
			End If
			PositionEntity camera,((v16#+objectx(camerafocusobject))/2.0+v16#)/2.0,12.0,((-((v17#+objecty(camerafocusobject))/2.0+v17#))/2.0)-10.0,0
		End If
	End If
	v18=0
	;v2=0
	For v2=0 To nofobjects-1
		If objectexists(v2)=0 Then
			If objectentity(v2)>0 Then
				FreeEntity objectentity(v2)
				objectentity(v2)=0
			End If
			If objecttexture(v2)>0 Then
				FreeTexture objecttexture(v2)
				objecttexture(v2)=0
			End If
			v18=v18+1
		Else If v18>0 Then
			copyobjectdata(v2,v2-v18)
		End If
		;v2=v2+1
	Next
	nofobjects=nofobjects-v18
	;v2=0
	For v2=0 To 9
		If teleportertexture(v2)>0 Then
			PositionTexture teleportertexture(v2),0.0,(-Float(leveltimer/3 Mod 100))/100.0
		End If
		;v2=v2+1
	Next
End Function

Function activateobject(a0)
	
	If (objectactive(a0)=0 And ((objecttype(a0)=330 Or (objecttype(a0)=110)))) Then
		v1=objecttilex(a0)
		v2=objecttiley(a0)
		If (objecttilelogic(v1,v2) And (4))=0 Then
			objecttilelogic(v1,v2)=objecttilelogic(v1,v2)+4.0
		End If
	End If
	If (objectactive(a0)<1001 And (objectactive(a0) Mod 2=0)) Then
		If objecttype(a0)=410 Then
			activateflipbridge(a0)
		Else
			objectactive(a0)=objectactive(a0)+objectactivationspeed(a0)+1
		End If
		If objectactive(a0)>1001 Then
			objectactive(a0)=1001
		End If
	End If
End Function

Function deactivateobject(a0)
	
	If objecttype(a0)=330 Then
		vacateobjecttile(a0)
	End If
	If (objectactive(a0)>0 And (objectactive(a0) Mod 2=1)) Then
		If objecttype(a0)=410 Then
			deactivateflipbridge(a0)
		Else
			objectactive(a0)=(objectactive(a0)-objectactivationspeed(a0))-1
		End If
	End If
	If objectactive(a0)<0 Then
		objectactive(a0)=0
	End If
End Function

Function toggleobject(a0)
	
	If (objectactive(a0)<1001 And (objectactive(a0) Mod 2=0)) Then
		If objecttype(a0)=410 Then
			activateflipbridge(a0)
		Else
			objectactive(a0)=objectactive(a0)+objectactivationspeed(a0)+1
		End If
	Else If (objectactive(a0)>0 And (objectactive(a0) Mod 2=1)) Then
		If objecttype(a0)=410 Then
			deactivateflipbridge(a0)
		Else
			objectactive(a0)=(objectactive(a0)-objectactivationspeed(a0))-1
		End If
	End If
End Function

Function destroyobject(a0,a1)
	
	If (objectdead(a0)>0 Or (objectexists(a0)=0)) Then
		Return 0
	End If
	If (a0=playerobject And (leveltimer>=1000000000)) Then
		Return 0
	End If
	If (objecttype(a0)=230 And (objectdata(a0,3)>1)) Then
		objectdata(a0,3)=objectdata(a0,3)-1
		Return 0
	End If
	If ((objecttype(a0)=230 Or (objecttype(a0)=250)) Or (objecttype(a0)=260)) Then
		addparticle(15,objecttilex(a0)+0.5,1.6,(-objecttiley(a0))-0.5,0.0,1.0,0.0,0.01,0.0,0.0,0.01,0.0,0.0,0.0,50,3)
		playerscore=playerscore+250
		currentadventurescore=currentadventurescore+250
	End If
	v1=objecttilex(a0)
	v2=objecttiley(a0)
	vacateobjecttile(a0)
	If (objectmovementtimer(a0)>0 And ((objecttilex2(a0)<>objecttilex(a0) Or (objecttiley2(a0)<>objecttiley(a0))))) Then
		objecttilex(a0)=objecttilex2(a0)
		objecttiley(a0)=objecttiley2(a0)
		vacateobjecttile(a0)
	End If
	If (objecttype(a0)=210 And (objectlinkback(a0)>=0)) Then
		objecttilex(objectlinkback(a0))=objecttilex2(a0)
		objecttiley(objectlinkback(a0))=objecttiley2(a0)
		vacateobjecttile(objectlinkback(a0))
		objecttilex(objectlinkback(a0))=v1
		objecttiley(objectlinkback(a0))=v2
		destroyobject(objectlinkback(a0),0)
	End If
	;v3=0
	For v3=0 To nofobjects-1
		If (objectparent(v3)=a0 And (objecttype(v3)=101)) Then
			destroyobject(v3,0)
		End If
		;v3=v3+1
	Next
	Select objecttype(a0)
	Case 1
		playercontrolmode=0
		If objectfrozen(a0)=0 Then
			If a1=0 Then
				playsoundfx(Rand(150,151),-1,-1)
				adventurelostreason="Better Watch Your Step!"
				Animate GetChild(objectentity(a0),3),1,0.5,11,0.0
				objectdead(a0)=1
				objectdeadtimer(a0)=0
			Else If a1=1 Then
				playsoundfx(Rand(150,151),-1,-1)
				adventurelostreason="Careful... Stinkers Are Flammable!"
				Animate GetChild(objectentity(a0),3),1,0.5,9,0.0
				EntityTexture GetChild(objectentity(a0),3),stinkersmokedtexture,0,0
				objectdead(a0)=2
				objectdeadtimer(a0)=0
				;v3=1
				For v3=1 To 360
					v5#=Rnd(0.1,0.2)
					addparticle(Rand(16,23),objectx(a0)+Rnd(-0.2,0.2),objectz(a0)+0.5,-objecty(a0)+Rnd(-0.2,0.0),0.0,0.8,Rnd(-0.12,0.12),Rnd(0.0,0.12),Rnd(-0.12,0.12),5.0,0.0,0.0,0.0,0.0,75,3)
					;v3=v3+1
				Next
			Else If a1=2 Then
				playsoundfx(152,-1,-1)
				adventurelostreason="Careful... Stinkers Are Not Waterproof!"
				Animate GetChild(objectentity(a0),3),1,0.5,11,0.0
				objectdead(a0)=3
				objectdeadtimer(a0)=0
				addparticle(4,objectx(a0),-0.2,-objecty(a0),0.0,0.8,0.0,0.0,0.0,0.0,0.01,0.0,0.0,0.0,200,4)
			End If
			Return 0
		Else
			playsoundfx(Rand(150,151),-1,-1)
			adventurelostreason="Better Watch Your Step!"
			Animate GetChild(objectentity(a0),3),1,0.5,11,0.0
			objectdead(a0)=1
			objectdeadtimer(a0)=0
		End If
	Case 110
		playsoundfx(Rand(150,151),-1,-1)
		adventurelostreason="You Must Protect All Stinkers From Harm!"
		adventurelostcamerax=objectx(a0)
		adventurelostcameray=-objecty(a0)
		adventurelost()
		;v3=0
		For v3=0 To nofobjects-1
			If (objectparent(v3)=a0 And (objecttype(v3)=100)) Then
				destroyobject(v3,0)
			End If
			;v3=v3+1
		Next
	Case 120
		adventurelostreason="You Must Protect The Wee Stinkers From Harm!"
		adventurelostcamerax=objectx(a0)
		adventurelostcameray=-objecty(a0)
		adventurelost()
		nofweestinkersinadventure=nofweestinkersinadventure-1
		If objectfrozen(a0)=0 Then
			If a1=2 Then
				playsoundfx(67,-1,-1)
				AnimateMD2 objectentity(a0),1,0.5,161,180,1.0
				objectdead(a0)=3
				objectdeadtimer(a0)=0
				addparticle(4,objectx(a0),-0.2,-objecty(a0),0.0,0.8,0.0,0.0,0.0,0.0,0.01,0.0,0.0,0.0,200,3)
			Else
				playsoundfx(65,-1,-1)
				AnimateMD2 objectentity(a0),1,0.5,161,180,1.0
				objectdead(a0)=1
				objectdeadtimer(a0)=0
				;v3=0
				For v3=0 To 360 Step 2
					v5#=Rnd(0.7,1.5)
					addparticle(Rand(16,23),objectx(a0),objectz(a0)+0.5,-objecty(a0),0.0,0.4,v5#*0.12*Sin(v3),0.0,v5#*0.12*Cos(v3),5.0,0.001,(-v5#)*0.0021*Sin(v3),0.0,(-v5#)*0.0021*Cos(v3),75,3)
					;v3=v3+2
				Next
			End If
			Return 0
		End If
	Case 150
		nofscrittersinadventure=nofscrittersinadventure-1
		playsoundfx(15,-1,-1)
	Case 230
		noffireflowersinadventure=noffireflowersinadventure-1
		playsoundfx(105,objecttilex(a0),objecttiley(a0))
	Case 241
		;v3=0
		For v3=0 To 7
			createspellball(objectx(a0),objecty(a0),0.7,0.02*Sin(v3*45),0.02*Cos(v3*45),1,objectx(a0)+2.0*Sin(v3*45),objecty(a0)+2.0*Cos(v3*45),0,50)
			;v3=v3+1
		Next
		camerashaketimer=4
	Case 242
		camerashaketimer=4
		playsoundfx(110,objecttilex(a0),objecttiley(a0))
		nofbricksinadventure=nofbricksinadventure-1
	Case 220,250,260,290
		If (waepisode<>1 Or (adventurecurrentnumber<>70)) Then
			playsoundfx(15,-1,-1)
		End If
	Case 370
		nofcrabsinadventure=nofcrabsinadventure-1
	Case 390
		playsoundfx(Rand(150,151),-1,-1)
		adventurelostreason="You Must Protect All Kaboom!s From Harm!"
		adventurelostcamerax=objectx(a0)
		adventurelostcameray=-objecty(a0)
		adventurelost()
		;v3=0
		For v3=0 To nofobjects-1
			If (objectparent(v3)=a0 And (objecttype(v3)=100)) Then
				destroyobject(v3,0)
			End If
			;v3=v3+1
		Next
	Case 400
		playsoundfx(Rand(150,151),-1,-1)
		adventurelostreason="You Must Protect All Kaboom!s From Harm!"
		adventurelostcamerax=objectx(a0)
		adventurelostcameray=-objecty(a0)
		adventurelost()
		nofbabyboomersinadventure=nofbabyboomersinadventure-1
		If objectfrozen(a0)=0 Then
			If a1=2 Then
				AnimateMD2 objectentity(a0),1,4.0,1,30,0.0
				objectdead(a0)=3
				objectdeadtimer(a0)=0
				addparticle(4,objectx(a0),-0.2,-objecty(a0),0.0,0.8,0.0,0.0,0.0,0.0,0.01,0.0,0.0,0.0,200,3)
			Else
				AnimateMD2 objectentity(a0),0,1.0,1,3,1.0
				objectdead(a0)=1
				objectdeadtimer(a0)=0
				;v3=0
				For v3=0 To 360 Step 2
					v5#=Rnd(0.7,1.5)
					addparticle(Rand(16,23),objectx(a0),objectz(a0)+0.5,-objecty(a0),0.0,0.4,v5#*0.12*Sin(v3),0.0,v5#*0.12*Cos(v3),5.0,0.001,(-v5#)*0.0021*Sin(v3),0.0,(-v5#)*0.0021*Cos(v3),75,3)
					;v3=v3+2
				Next
			End If
			Return 0
		End If
	Case 420,421,422,423
		playsoundfx(15,objecttilex(a0),objecttiley(a0))
	End Select
	objectexists(a0)=0
	Select objectdestructiontype(a0)
	Case 0
	Case 1
		If nofparticles<500 Then
			a1=100
		Else If nofparticles<1000 Then
			a1=30
		Else
			a1=15
		End If
		;v3=0
		For v3=0 To a1
			addparticle(3,objectx(a0),objectz(a0)+0.5,-objecty(a0),0.0,0.2,Rnd(-0.05,0.05),Rnd(0.0,0.05),Rnd(-0.05,0.05),1.0,0.0,0.0,0.0,0.0,Rand(50,150),3)
			;v3=v3+1
		Next
	End Select
	If (telekinesisactive=1 And (telekinesisobject=a0)) Then
		telekinesisactive=0
		lastplayercontrol=3
		objectdx(a0)=0.0
		objectdy(a0)=0.0
	End If
	If ((objecttype(a0)=60 Or (objecttype(a0)=805)) And (objectchild(a0)>=0)) Then
		destroyobject(objectchild(a0),0)
	End If
	If objectparent(a0)>=0 Then
		If objectchild(objectparent(a0))=a0 Then
			objectchild(objectparent(a0))=-1
		End If
	End If
	If objectchild(a0)>=0 Then
		If objectparent(objectchild(a0))=a0 Then
			objectparent(objectchild(a0))=-1
		End If
	End If
	If objectlinkback(a0)>=0 Then
		If objectlinked(objectlinkback(a0))=a0 Then
			objectlinked(objectlinkback(a0))=-1
		End If
	End If
	If objectlinked(a0)>=0 Then
		If objectlinkback(objectlinked(a0))=a0 Then
			objectlinkback(objectlinked(a0))=-1
		End If
	End If
	If playertalktogoalobject=a0 Then
		playertalktogoalobject=-2
	End If
End Function

Function canobjectmovetotile(a0,a1,a2,a3,a4)
	
	If objectlinked(a0)>=0 Then
		Return 0
	End If
	v1=objecttiletypecollision(a0)
	If (objectflying(a0)>0 And (((v1 And (4)))=0)) Then
		v1=v1+4.0
	End If
	If (((a1<0 Or (a2<0)) Or (a1>=levelwidth)) Or (a2>=levelheight)) Then
		Return 0
	End If
	v2=leveltilelogic(a1,a2)
	If (v1 And (2.0^v2))=0 Then
		Return 0
	End If
	If a4=0 Then
		If v2=3 Then
			Return 0
		End If
	End If
	v3=objecttilelogic(a1,a2)
	If (v3>0 And (((objectobjecttypecollision(a0) And (v3)))<>v3)) Then
		Return 0
	End If
	If a3=1 Then
		If (Abs(objecttilex(a0)-a1)=1 And (Abs(objecttiley(a0)-a2)=1)) Then
			If (v1 And (2))=0 Then
				If (leveltilelogic(objecttilex(a0),a2)=1 Or (leveltilelogic(a1,objecttiley(a0))=1)) Then
					Return 0
				End If
			End If
			If (v1 And (2))=0 Then
				If (leveltilelogic(objecttilex(a0),a2)=13 Or (leveltilelogic(a1,objecttiley(a0))=13)) Then
					Return 0
				End If
			End If
		End If
	End If
	Return 1
End Function

Function controlmoveobject(a0)
	
	If objectflying(a0)/10=1 Then
		v1=0
		v2=0
		If (objectflying(a0) Mod 10>=1 And (objectflying(a0) Mod 10<=3)) Then
			v1=1
		End If
		If (objectflying(a0) Mod 10>=5 And (objectflying(a0) Mod 10<=7)) Then
			v1=-1
		End If
		If (objectflying(a0) Mod 10>=3 And (objectflying(a0) Mod 10<=5)) Then
			v2=1
		End If
		If (objectflying(a0) Mod 10>=7 Or (objectflying(a0) Mod 10<=1)) Then
			v2=-1
		End If
		v3=objecttilex(a0)
		v4=objecttiley(a0)
		If canobjectmovetotile(a0,v3+v1,v4+v2,1,1) Then
			moveobjecttotile(a0,v3+v1,v4+v2)
		Else
			objectflying(a0)=0
			objectmovexgoal(a0)=objecttilex(a0)
			objectmoveygoal(a0)=objecttiley(a0)
			If objecttype(a0)=120 Then
				playsoundfx(70,objecttilex(a0),objecttiley(a0))
			End If
		End If
		Return 0
	End If
	If objectflying(a0)/10=2 Then
		v1=0
		v2=0
		If (objectflying(a0) Mod 10>=1 And (objectflying(a0) Mod 10<=3)) Then
			v1=1
		End If
		If (objectflying(a0) Mod 10>=5 And (objectflying(a0) Mod 10<=7)) Then
			v1=-1
		End If
		If (objectflying(a0) Mod 10>=3 And (objectflying(a0) Mod 10<=5)) Then
			v2=1
		End If
		If (objectflying(a0) Mod 10>=7 Or (objectflying(a0) Mod 10<=1)) Then
			v2=-1
		End If
		v3=objecttilex(a0)
		v4=objecttiley(a0)
		If (canobjectmovetotile(a0,v3+v1,v4+v2,1,1) And (((leveltilelogic(v3,v4)=11 Or (leveltilelogic(v3,v4)=12)) Or (leveltilelogic(v3,v4)=14)))) Then
			moveobjecttotile(a0,v3+v1,v4+v2)
		Else
			objectflying(a0)=0
			objectmovexgoal(a0)=objecttilex(a0)
			objectmoveygoal(a0)=objecttiley(a0)
		End If
		Return 0
	End If
	If objectfrozen(a0)>0 Then
		Return 0
	End If
	Select objectmovementtype(a0)
	Case 10,11,12,13,14,15,16,17,18
		v6=(objectmovementtype(a0)-10) Mod 3
		If (Abs(objecttilex(a0)-objectmovexgoal(a0))>v6 Or (Abs(objecttiley(a0)-objectmoveygoal(a0))>v6)) Then
			If ((Abs(objecttilex(a0)-objectmovexgoal(a0))<=1 And (Abs(objecttiley(a0)-objectmoveygoal(a0))<=1)) And (canobjectmovetotile(a0,objectmovexgoal(a0),objectmoveygoal(a0),1,1)=1)) Then
				moveobjecttotile(a0,objectmovexgoal(a0),objectmoveygoal(a0))
			Else If objectmovementtypedata(a0)>0 Then
				objectmovementtypedata(a0)=objectmovementtypedata(a0)-1
			Else
				If objectmovementtype(a0)<13 Then
					astar(a0,objecttilex(a0),objecttiley(a0),objectmovexgoal(a0),objectmoveygoal(a0),3,400,objectmovementtype(a0)-10)
				Else If objectmovementtype(a0)<16 Then
					astar(a0,objecttilex(a0),objecttiley(a0),objectmovexgoal(a0),objectmoveygoal(a0),3,200,objectmovementtype(a0)-13)
				Else
					astar(a0,objecttilex(a0),objecttiley(a0),objectmovexgoal(a0),objectmoveygoal(a0),3,75,objectmovementtype(a0)-16)
				End If
				If (astarpathnode(1)=-1 And (objecttype(a0)=120) Or (objecttype(a0)=400)) Then
					objectobjecttypecollision(a0)=objectobjecttypecollision(a0)+8.0
					astar(a0,objecttilex(a0),objecttiley(a0),objectmovexgoal(a0),objectmoveygoal(a0),3,200,1)
					objectobjecttypecollision(a0)=objectobjecttypecollision(a0)-8.0
				End If
				If astarpathnode(1)=-1 Then
					v7=(objecttilex(a0)-objectmovexgoal(a0))^2.0+(objecttiley(a0)-objectmoveygoal(a0))^2.0
					v8=0
					v9=0
					;v10=-1
					For v10=-1 To 1
						;v11=-1
						For v11=-1 To 1
							If canobjectmovetotile(a0,objecttilex(a0)+v10,objecttiley(a0)+v11,1,0) Then
								If ((objecttilex(a0)+v10)-objectmovexgoal(a0))^2.0+((objecttiley(a0)+v11)-objectmoveygoal(a0))^2.0<v7 Then
									v7=((objecttilex(a0)+v10)-objectmovexgoal(a0))^2.0+((objecttiley(a0)+v11)-objectmoveygoal(a0))^2.0
									v8=v10
									v9=v11
								End If
							End If
							;v11=v11+1
						Next
						;v10=v10+1
					Next
					If (v8<>0 Or (v9<>0)) Then
						moveobjecttotile(a0,objecttilex(a0)+v8,objecttiley(a0)+v9)
						If objecttype(a0)=1 Then
							playercancelmove=0
						End If
					Else
						objectmovementtypedata(a0)=30
						If objecttype(a0)=1 Then
							playercancelmove=playercancelmove+1
							If playercancelmove>=20 Then
								objectmovexgoal(a0)=objecttilex(a0)
								objectmoveygoal(a0)=objecttiley(a0)
								playercancelmove=0
							End If
						End If
					End If
				Else
					;v12=3
					For v12=3 To 1 Step -1
						If ((Abs(astarx(astarpathnode(v12))-objecttilex(a0))<=1 And (Abs(astary(astarpathnode(v12))-objecttiley(a0))<=1)) And (canobjectmovetotile(a0,astarx(astarpathnode(v12)),astary(astarpathnode(v12)),1,0)=1)) Then
							moveobjecttotile(a0,astarx(astarpathnode(v12)),astary(astarpathnode(v12)))
							v12=-3
						End If
						;v12=v12+-1
					Next
					If v12>-3 Then
						objectmovementtypedata(a0)=30
					End If
				End If
			End If
		End If
	Case 20
		v13=leveltileplayerpathscore(objecttilex(a0),objecttiley(a0))
		v14=-1
		;v15=-1
		For v15=-1 To 1
			;v16=-1
			For v16=-1 To 1
				v3=objecttilex(a0)+v15
				v4=objecttiley(a0)+v16
				If leveltileplayerpathscore(v3,v4)<v13 Then
					If canobjectmovetotile(a0,v3,v4,1,0)=1 Then
						v13=leveltileplayerpathscore(v3,v4)
						v14=v3
						v17=v4
					End If
				End If
				;v16=v16+1
			Next
			;v15=v15+1
		Next
		If v14<0 Then
			;v15=-1
			For v15=-1 To 1
				;v16=-1
				For v16=-1 To 1
					v3=objecttilex(a0)+v15
					v4=objecttiley(a0)+v16
					If canobjectmovetotile(a0,v3,v4,1,0)=1 Then
						If (v15+v16) Mod 2=0 Then
							If leveltileplayerpathscore(v3+v15,v4+v16)<v13 Then
								v13=leveltileplayerpathscore(v3,v4)
								v14=v3
								v17=v4
							End If
							If leveltileplayerpathscore(v3+0,v4+v16)<v13 Then
								v13=leveltileplayerpathscore(v3,v4)
								v14=v3
								v17=v4
							End If
							If leveltileplayerpathscore(v3+v15,v4+0)<v13 Then
								v13=leveltileplayerpathscore(v3,v4)
								v14=v3
								v17=v4
							End If
						Else If v15=0 Then
							If leveltileplayerpathscore(v3-1,v4+v16)<v13 Then
								v13=leveltileplayerpathscore(v3,v4)
								v14=v3
								v17=v4
							End If
							If leveltileplayerpathscore(v3+0,v4+v16)<v13 Then
								v13=leveltileplayerpathscore(v3,v4)
								v14=v3
								v17=v4
							End If
							If leveltileplayerpathscore(v3+1,v4+v16)<v13 Then
								v13=leveltileplayerpathscore(v3,v4)
								v14=v3
								v17=v4
							End If
						Else If v16=0 Then
							If leveltileplayerpathscore(v3+v15,v4-1)<v13 Then
								v13=leveltileplayerpathscore(v3,v4)
								v14=v3
								v17=v4
							End If
							If leveltileplayerpathscore(v3+v15,v4+0)<v13 Then
								v13=leveltileplayerpathscore(v3,v4)
								v14=v3
								v17=v4
							End If
							If leveltileplayerpathscore(v3+v15,v4+1)<v13 Then
								v13=leveltileplayerpathscore(v3,v4)
								v14=v3
								v17=v4
							End If
						End If
					End If
					;v16=v16+1
				Next
				;v15=v15+1
			Next
		End If
		If v14>=0 Then
			moveobjecttotile(a0,v14,v17)
		End If
	Case 30,31,32,33,34
		If (Abs(objecttilex(a0)-objecttilex(playerobject))<objectmovementtype(a0)-29 And (Abs(objecttiley(a0)-objecttiley(playerobject))<objectmovementtype(a0)-29)) Then
			If (objecttype(a0)=370 And (objectsubtype(a0)=1)) Then
				objectmovementtype(a0)=33
			End If
			v10=-1
			v11=-1
			If objecttilex(a0)=objecttilex(playerobject) Then
				If objecttiley(a0)>objecttiley(playerobject) Then
					If canobjectmovetotile(a0,objecttilex(a0),objecttiley(a0)+1,1,1)=1 Then
						v10=objecttilex(a0)
						v11=objecttiley(a0)+1
					End If
				Else
					If canobjectmovetotile(a0,objecttilex(a0),objecttiley(a0)-1,1,1)=1 Then
						v10=objecttilex(a0)
						v11=objecttiley(a0)-1
					End If
				End If
			Else If objecttiley(a0)=objecttiley(playerobject) Then
				If objecttilex(a0)>objecttilex(playerobject) Then
					If canobjectmovetotile(a0,objecttilex(a0)+1,objecttiley(a0),1,1)=1 Then
						v10=objecttilex(a0)+1
						v11=objecttiley(a0)
					End If
				Else
					If canobjectmovetotile(a0,objecttilex(a0)-1,objecttiley(a0),1,1)=1 Then
						v10=objecttilex(a0)-1
						v11=objecttiley(a0)
					End If
				End If
			End If
			If v10=-1 Then
				v18=(objecttilex(a0)-objecttilex(playerobject))^2.0+(objecttiley(a0)-objecttiley(playerobject))^2.0
				v19=1
				v20=1
				If Rand(0,100)<50 Then
					v19=-1
				End If
				If Rand(0,100)<50 Then
					v20=-1
				End If
				;v3=-1
				For v3=-1 To 1
					;v4=-1
					For v4=-1 To 1
						If canobjectmovetotile(a0,objecttilex(a0)+v3*v19,objecttiley(a0)+v4*v20,1,1)=1 Then
							If ((objecttilex(a0)+v3*v19)-objecttilex(playerobject))^2.0+((objecttiley(a0)+v4*v20)-objecttiley(playerobject))^2.0>v18 Then
								v10=objecttilex(a0)+v3*v19
								v11=objecttiley(a0)+v4*v20
								v18=((objecttilex(a0)+v3*v19)-objecttilex(playerobject))^2.0+((objecttiley(a0)+v4*v20)-objecttiley(playerobject))^2.0
							End If
						End If
						;v4=v4+1
					Next
					;v3=v3+1
				Next
			End If
			If v10>-1 Then
				moveobjecttotile(a0,v10,v11)
			End If
		Else If (objecttype(a0)=370 And (objectsubtype(a0)=1)) Then
			objectmovementtype(a0)=32
		End If
	Case 41,42,43,44,45,46,47,48
		v1=0
		v2=0
		If (objectmovementtype(a0)=41 Or (objectmovementtype(a0)=42)) Then
			v2=-1
		Else If (objectmovementtype(a0)=43 Or (objectmovementtype(a0)=44)) Then
			v1=1
		Else If (objectmovementtype(a0)=45 Or (objectmovementtype(a0)=46)) Then
			v2=1
		Else If (objectmovementtype(a0)=47 Or (objectmovementtype(a0)=48)) Then
			v1=-1
		End If
		v21=0
		If canobjectmovetotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2,1,1)=1 Then
			moveobjecttotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2)
		Else
			If objectmovementtype(a0) Mod 2=1 Then
				v19=v1
				v1=v2
				v2=-v19
			Else
				v19=v1
				v1=-v2
				v2=v19
			End If
			If canobjectmovetotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2,1,1)=1 Then
				moveobjecttotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2)
				v21=1
			Else
				v1=-v1
				v2=-v2
				If canobjectmovetotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2,1,1)=1 Then
					moveobjecttotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2)
					v21=1
				Else
					If objectmovementtype(a0) Mod 2=0 Then
						v19=v1
						v1=v2
						v2=-v19
					Else
						v19=v1
						v1=-v2
						v2=v19
					End If
					If canobjectmovetotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2,1,1)=1 Then
						moveobjecttotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2)
						v21=1
					End If
				End If
			End If
		End If
		If v21=1 Then
			If (v1=0 And (v2=-1)) Then
				objectmovementtype(a0)=(objectmovementtype(a0)-41) Mod 2+41
			Else If (v1=1 And (v2=0)) Then
				objectmovementtype(a0)=(objectmovementtype(a0)-41) Mod 2+43
			Else If (v1=0 And (v2=1)) Then
				objectmovementtype(a0)=(objectmovementtype(a0)-41) Mod 2+45
			Else If (v1=-1 And (v2=0)) Then
				objectmovementtype(a0)=(objectmovementtype(a0)-41) Mod 2+47
			End If
		End If
	Case 51,52,53,54,55,56,57,58
		v1=0
		v2=0
		If (objectmovementtype(a0)=51 Or (objectmovementtype(a0)=52)) Then
			v2=-1
		Else If (objectmovementtype(a0)=53 Or (objectmovementtype(a0)=54)) Then
			v1=1
		Else If (objectmovementtype(a0)=55 Or (objectmovementtype(a0)=56)) Then
			v2=1
		Else If (objectmovementtype(a0)=57 Or (objectmovementtype(a0)=58)) Then
			v1=-1
		End If
		If ((leveltilelogic(objecttilex(a0)+v1,objecttiley(a0)+v2)=2 And (((objecttilelogic(objecttilex(a0)+v1,objecttiley(a0)+v2) And (64)))=0)) And (((objecttilelogic(objecttilex(a0)+v1,objecttiley(a0)+v2) And (128)))=0)) Then
			moveobjecttotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2)
		Else
			AnimateMD2 objectentity(a0),3,0.2,31,49,0.0
			objectcurrentanim(a0)=2
			vacateobjecttile(a0)
			objectstatus(a0)=2
			occupyobjecttile(a0,objecttilex(a0),objecttiley(a0))
			objectmovementtype(a0)=objectmovementtype(a0)+10
			addparticle(4,objectx(a0),-0.2,-objecty(a0),0.0,0.8,0.0,0.0,0.0,0.0,0.01,0.0,0.0,0.0,200,4)
		End If
	Case 61,62,63,64,65,66,67,68
	Case 71,73,75,77
		v1=0
		v2=0
		Select objectmovementtype(a0)
		Case 71
			v2=-1
		Case 73
			v1=1
		Case 75
			v2=1
		Case 77
			v1=-1
		End Select
		If canobjectmovetotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2,1,1)=1 Then
			moveobjecttotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2)
		Else
			If canobjectmovetotile(a0,objecttilex(a0)-v1,objecttiley(a0)-v2,1,1)=1 Then
				moveobjecttotile(a0,objecttilex(a0)-v1,objecttiley(a0)-v2)
				objectmovementtype(a0)=(objectmovementtype(a0)-71+4) Mod 8+71
			End If
		End If
	Case 72,74,76,78
		v1=0
		v2=0
		Select objectmovementtype(a0)
		Case 72
			v2=-1
			v1=1
		Case 74
			v1=1
			v2=1
		Case 76
			v1=-1
			v2=1
		Case 78
			v1=-1
			v2=-1
		End Select
		If canobjectmovetotile(a0,objecttilex(a0)+v1,objecttiley(a0),1,1)=0 Then
			v1=-v1
		End If
		If canobjectmovetotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2,1,1)=0 Then
			v2=-v2
		End If
		If canobjectmovetotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2,1,1)=1 Then
			moveobjecttotile(a0,objecttilex(a0)+v1,objecttiley(a0)+v2)
		End If
		If (v2=-1 And (v1=1)) Then
			objectmovementtype(a0)=72
		End If
		If (v2=1 And (v1=1)) Then
			objectmovementtype(a0)=74
		End If
		If (v2=1 And (v1=-1)) Then
			objectmovementtype(a0)=76
		End If
		If (v2=-1 And (v1=-1)) Then
			objectmovementtype(a0)=78
		End If
	End Select
End Function

Function moveobjecttotile(a0,a1,a2)
	
	occupyobjecttile(a0,a1,a2)
	objecttilex2(a0)=a1
	objecttiley2(a0)=a2
	If objectflying(a0)/10=1 Then
		objectmovementtimer(a0)=10
	Else If objectflying(a0)/10=2 Then
		objectmovementtimer(a0)=20
	Else
		objectmovementtimer(a0)=objectmovementspeed(a0)
	End If
	If objecttype(a0)=150 Then
		playsoundfx(100,objecttilex(a0),objecttiley(a0))
	End If
End Function

Function occupyobjecttile(a0,a1,a2)
	
	If objectfrozen(a0)>0 Then
		Select objecttype(a0)
		Case 1,110,120,150,220,230,250,260,290,370,390,400,420,421,422,423
			If (objecttilelogic(a1,a2) And (1024))=0 Then
				objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+1024.0
			End If
			Return 0
		End Select
	End If
	Select objecttype(a0)
	Case 1
		If (objecttilelogic(a1,a2) And (2))=0 Then
			objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+2.0
		End If
	Case 110,330,390
		If (((objecttilelogic(a1,a2) And (4)))=0 And (objectactive(a0)>0)) Then
			objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+4.0
		End If
	Case 120,400
		If (objecttilelogic(a1,a2) And (8))=0 Then
			objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+8.0
		End If
	Case 150
		If (objecttilelogic(a1,a2) And (32))=0 Then
			objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+32.0
		End If
	Case 210
		If (objecttilelogic(a1,a2) And (64))=0 Then
			objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+64.0
		End If
	Case 220
		If objectstatus(a0)<2 Then
			If (objecttilelogic(a1,a2) And (128))=0 Then
				objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+128.0
			End If
		Else If (objecttilelogic(a1,a2) And (64))=0 Then
			objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+64.0
		End If
	Case 370
		If objectstatus(a0)<2 Then
			If objectdata(a0,1)>1 Then
				If (objecttilelogic(a1,a2) And (128))=0 Then
					objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+128.0
				End If
			Else If (objecttilelogic(a1,a2) And (32))=0 Then
				objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+32.0
			End If
		Else If (objecttilelogic(a1,a2) And (64))=0 Then
			objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+64.0
		End If
	Case 230,290,310
		If (objecttilelogic(a1,a2) And (128))=0 Then
			objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+128.0
		End If
	Case 250,260,420,422,423
		If (objecttilelogic(a1,a2) And (256))=0 Then
			objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+256.0
		End If
	Case 240,241,242
		If (objecttilelogic(a1,a2) And (512))=0 Then
			objecttilelogic(a1,a2)=objecttilelogic(a1,a2)+512.0
		End If
	End Select
End Function

Function objectduringmove(a0)
	
	If objectflying(a0)/10=1 Then
		objectmovementtimer(a0)=objectmovementtimer(a0)+150
	Else If objectflying(a0)/20=1 Then
		objectmovementtimer(a0)=objectmovementtimer(a0)+75
	Else
		objectmovementtimer(a0)=objectmovementtimer(a0)+objectmovementspeed(a0)
	End If
	If objectmovementtimer(a0)>=1000 Then
		endmoveobject(a0)
	End If
End Function

Function endmoveobject(a0)
	
	vacateobjecttile(a0)
	If watertileheight(objecttilex(a0),objecttiley(a0))>0.0 Then
		addparticle(4,(objecttilex(a0)+objecttilex(a0))/2.0+0.5+Rnd(-0.1,0.1),watertileheight(objecttilex(a0),objecttiley(a0))+0.05,((-(objecttiley(a0)+objecttiley(a0)))/2.0)-0.5+Rnd(-0.1,0.1),0.0,0.01,0.0,0.0,0.0,0.0,0.01,0.0,0.0,0.0,40,4)
		addparticle(4,(objecttilex(a0)+objecttilex2(a0))/2.0+0.5+Rnd(-0.1,0.1),watertileheight(objecttilex(a0),objecttiley(a0))+0.05,((-(objecttiley(a0)+objecttiley2(a0)))/2.0)-0.5+Rnd(-0.1,0.1),0.0,0.001,0.0,0.0,0.0,0.0,0.007,0.0,0.0,0.0,60,4)
	End If
	objectmovementtimer(a0)=0
	v1=objecttilex(a0)
	v2=objecttiley(a0)
	objecttilex(a0)=objecttilex2(a0)
	objecttiley(a0)=objecttiley2(a0)
	endmovetilecheck(a0,v1,v2)
End Function

Function vacateobjecttile(a0)
	
	v1=objecttilex(a0)
	v2=objecttiley(a0)
	If objectfrozen(a0)>0 Then
		Select objecttype(a0)
		Case 1,110,120,150,220,230,250,260,290,370,390,400,420,421,422,423
			If (objecttilelogic(v1,v2) And (1024))>0 Then
				objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-1024.0
			End If
			Return 0
		End Select
	End If
	Select objecttype(a0)
	Case 1
		If (objecttilelogic(v1,v2) And (2))>0 Then
			objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-2.0
		End If
	Case 110,330,390
		If (objecttilelogic(v1,v2) And (4))>0 Then
			objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-4.0
		End If
	Case 120,400
		If (objecttilelogic(v1,v2) And (8))>0 Then
			objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-8.0
		End If
	Case 150
		If (objecttilelogic(v1,v2) And (32))>0 Then
			objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-32.0
		End If
	Case 210
		If (objecttilelogic(v1,v2) And (64))>0 Then
			objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-64.0
		End If
	Case 220
		If objectstatus(a0)<2 Then
			If (objecttilelogic(v1,v2) And (128))>0 Then
				objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-128.0
			End If
		Else If (objecttilelogic(v1,v2) And (64))>0 Then
			objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-64.0
		End If
	Case 370
		If objectstatus(a0)<2 Then
			If objectdata(a0,1)>1 Then
				If (objecttilelogic(v1,v2) And (128))>0 Then
					objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-128.0
				End If
			Else If (objecttilelogic(v1,v2) And (32))>0 Then
				objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-32.0
			End If
		Else If (objecttilelogic(v1,v2) And (64))>0 Then
			objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-64.0
		End If
	Case 230,290,310
		If (objecttilelogic(v1,v2) And (128))>0 Then
			objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-128.0
		End If
	Case 250,260,420,422,423
		If (objecttilelogic(v1,v2) And (256))>0 Then
			objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-256.0
		End If
	Case 240,241,242
		If (objecttilelogic(v1,v2) And (512))>0 Then
			objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-512.0
		End If
	End Select
End Function

Function endmovetilecheck(a0,a1,a2)
	
	If objectlinked(a0)>=0 Then
		Return 0
	End If
	Select leveltilelogic(objecttilex(a0),objecttiley(a0))
	Case 0
	Case 1
		If ((((((((((((objecttype(a0)=1 Or (objecttype(a0)=110)) Or (objecttype(a0)=120)) Or (objecttype(a0)=150)) Or (objecttype(a0)=220)) Or (objecttype(a0)=250)) Or (objecttype(a0)=260)) Or (objecttype(a0)=290)) Or (objecttype(a0)=390)) Or (objecttype(a0)=400)) Or (objecttype(a0)=420)) Or (objecttype(a0)=422)) Or (objecttype(a0)=423)) Then
			destroyobject(a0,0)
		End If
	Case 2
		If (objectflying(a0)=0 Or (objectflying(a0)>=20)) Then
			If (((((((((objecttype(a0)=1 Or (objecttype(a0)=110)) Or (objecttype(a0)=120)) Or (objecttype(a0)=150)) Or ((objecttype(a0)=250 And (objectdata(a0,1)<>1)))) Or (objecttype(a0)=260)) Or (objecttype(a0)=290)) Or (objecttype(a0)=390)) Or (objecttype(a0)=400)) Or (objecttype(a0)=423)) Then
				destroyobject(a0,2)
			End If
			If ((objecttype(a0)=220 Or (objecttype(a0)=370)) And (objectstatus(a0)=0)) Then
					playsoundfx(108,objectx(a0),objecty(a0))
					vacateobjecttile(a0)
					objectstatus(a0)=1
					occupyobjecttile(a0,objecttilex(a0),objecttiley(a0))
					If objecttype(a0)=220 Then
						objectmovementtype(a0)=objectmovementtype(a0) Mod 10+50
					Else
						objectmovementtype(a0)=0
						AnimateMD2 objectentity(a0),3,1.0,31,49,0.0
						objectcurrentanim(a0)=4
						vacateobjecttile(a0)
						objectstatus(a0)=2
						occupyobjecttile(a0,objecttilex(a0),objecttiley(a0))
					End If
					addparticle(4,objectx(a0),-0.2,-objecty(a0),0.0,0.8,0.0,0.0,0.0,0.0,0.01,0.0,0.0,0.0,200,4)
				End If
		End If
	Case 3
		If objectteleportable(a0)=1 Then
			v2=-99999
			;v3=0
			For v3=0 To nofobjects-1
				If ((objecttype(v3)=30 And (objectactive(v3)=1001)) And (objectexists(v3)=1)) Then
					If (objecttilex(v3)=objecttilex(a0) And (objecttiley(v3)=objecttiley(a0))) Then
						v2=objectid(v3)
						v4=v3
					End If
				End If
				;v3=v3+1
			Next
			If v2<>-99999 Then
				;v3=0
				For v3=0 To nofobjects-1
					If (((objecttype(v3)=30 And (objectactive(v3)=1001)) And (objectexists(v3)=1)) And (objectid(v3)=v2)) Then
						If (objecttilex(v3)<>objecttilex(a0) Or (objecttiley(v3)<>objecttiley(a0))) Then
							If objecttilelogic(objecttilex(v3),objecttiley(v3))=0 Then
								playsoundfx(42,objecttilex(a0),objecttiley(a0))
								vacateobjecttile(a0)
								objecttilex(a0)=objecttilex(v3)
								objecttiley(a0)=objecttiley(v3)
								objecttilex2(a0)=objecttilex(v3)
								objecttiley2(a0)=objecttiley(v3)
								objectmovexgoal(a0)=objecttilex(v3)
								objectmoveygoal(a0)=objecttiley(v3)
								occupyobjecttile(a0,objecttilex(a0),objecttiley(a0))
								;v5=1
								For v5=1 To 360 Step 4
									addparticle(23,objectx(v4)+0.8*Sin(v5*3),Rnd(1.0,2.0),(-objecty(v4))-(0.8*Cos(v5*3)),0.0,0.5,(-0.01)*Sin(v5*3),-Rnd(0.01,0.02),0.01*Cos(v5*3),1.0,0.0,0.0,0.0,0.0,Rand(30,75),3)
									addparticle(23,objectx(v3)+0.2*Sin(v5*3),Rnd(0.0,1.0),(-objecty(v3))-(0.2*Cos(v5*3)),0.0,0.5,0.01*Sin(v5*3),Rnd(0.01,0.02),(-0.01)*Cos(v5*3),1.0,0.0,0.0,0.0,0.0,Rand(30,75),3)
									;v5=v5+4
								Next
								deactivateobject(v3)
								deactivateobject(v4)
							End If
						End If
					End If
					;v3=v3+1
				Next
			End If
		End If
	Case 4
		If ((objecttype(a0)=220 Or (objecttype(a0)=370)) And (objectstatus(a0)>0)) Then
			vacateobjecttile(a0)
			If objecttilelogic(objecttilex(a0),objecttiley(a0))>0 Then
				destroyobject(a0,0)
			Else
				objectstatus(a0)=0
				If objecttype(a0)=220 Then
					objectmovementtype(a0)=objectmovementtype(a0) Mod 10+40
				Else If objecttype(a0)=370 Then
					If objectsubtype(a0)=0 Then
						objectmovementtype(a0)=14
					Else
						objectmovementtype(a0)=32
					End If
					objectdata(a0,1)=0
					AnimateMD2 objectentity(a0),3,-0.5,49,31,0.0
					objectcurrentanim(a0)=5
				End If
				occupyobjecttile(a0,objecttilex(a0),objecttiley(a0))
			End If
		End If
	Case 10
		If (objecttype(a0)=120 And (objectactive(a0)=1001)) Then
			playsoundfx(Rand(71,73),objecttilex(a0),objecttiley(a0))
			turnobjecttowarddirection(a0,0.0,1.0,10,-90)
			AnimateMD2 objectentity(a0),3,0.2,101,120,0.0
			objectcurrentanim(a0)=4
			objectactive(a0)=1000
			objectactivationtype(a0)=2
			objectactivationspeed(a0)=10
			objectsubtype(a0)=-1
			objectmovementtype(a0)=0
			vacateobjecttile(a0)
			nofweestinkersinadventure=nofweestinkersinadventure-1
			addparticle(14,objecttilex(a0)+0.5,2.0,(-objecttiley(a0))-0.5,0.0,1.0,0.0,0.01,0.0,0.0,0.01,0.0,0.0,0.0,50,3)
			playerscore=playerscore+100
			currentadventurescore=currentadventurescore+100
		End If
		If (objecttype(a0)=400 And (objectactive(a0)=1001)) Then
			playsoundfx(Rand(75,76),objecttilex(a0),objecttiley(a0))
			objectactive(a0)=1000
			objectactivationtype(a0)=2
			objectactivationspeed(a0)=10
			objectsubtype(a0)=-1
			objectmovementtype(a0)=0
			vacateobjecttile(a0)
			nofbabyboomersinadventure=nofbabyboomersinadventure-1
			addparticle(14,objecttilex(a0)+0.5,2.0,(-objecttiley(a0))-0.5,0.0,1.0,0.0,0.01,0.0,0.0,0.01,0.0,0.0,0.0,50,3)
			playerscore=playerscore+100
			currentadventurescore=currentadventurescore+100
		End If
	Case 11,14
		If objectflying(a0)=0 Then
			v6=objecttilex(a0)-a1
			v7=objecttiley(a0)-a2
			If (((v6<>0 Or (v7<>0)) And (Abs(v6)<=1)) And (Abs(v7)<=1)) Then
				objectflying(a0)=1
				If (v6=0 And (v7=-1)) Then
					objectflying(a0)=20
				End If
				If (v6=1 And (v7=-1)) Then
					objectflying(a0)=21
				End If
				If (v6=1 And (v7=0)) Then
					objectflying(a0)=22
				End If
				If (v6=1 And (v7=1)) Then
					objectflying(a0)=23
				End If
				If (v6=0 And (v7=1)) Then
					objectflying(a0)=24
				End If
				If (v6=-1 And (v7=1)) Then
					objectflying(a0)=25
				End If
				If (v6=-1 And (v7=0)) Then
					objectflying(a0)=26
				End If
				If (v6=-1 And (v7=-1)) Then
					objectflying(a0)=27
				End If
				If objectflying(a0)=1 Then
					objectflying(a0)=0
				End If
				If objecttype(a0)=1 Then
					If objectflying(a0)/10=2 Then
						playsoundfx(Rand(170,172),-1,-1)
					End If
				End If
				If (objecttype(a0)=110 Or (objecttype(a0)=120)) Then
					If objectflying(a0)/10=2 Then
						playsoundfx(70,-1,-1)
					End If
				End If
			End If
		End If
		If objectflying(a0)/10=2 Then
			If (((leveltilelogic(objecttilex(a0),objecttiley(a0))=14 And (objecttype(a0)<>50)) And (objecttype(a0)<>300)) And (objecttype(a0)<>40)) Then
				;v8=0
				For v8=0 To nofobjects-1
					If objecttype(v8)=300 Then
						If (objecttilex(v8)=objecttilex(a0) And (objecttiley(v8)=objecttiley(a0))) Then
							deactivateobject(v8)
							objectdata(v8,0)=20
						End If
					End If
					;v8=v8+1
				Next
			End If
		End If
		If objectflying(a0)/10=2 Then
			playsoundfx(20,objectx(a0),objecty(a0))
		End If
	Case 12
		v9=objectflying(a0)
		v10=objecttilex(a0)
		v11=objecttiley(a0)
		v6=objecttilex(a0)-a1
		v7=objecttiley(a0)-a2
		If (objectflying(a0)=0 Or (objectflying(a0)/10=2)) Then
			v12=objectflying(a0)
			v13=0
			Select leveltilerotation(v10,v11)
			Case 0,7
				If (v7=-1 And ((v6=0 Or (v6=1)))) Then
					objectflying(a0)=22
				Else If (v6=-1 And ((v7=0 Or (v7=1)))) Then
					objectflying(a0)=24
				Else
					v13=1
				End If
			Case 1,4
				If (v6=1 And ((v7=0 Or (v7=1)))) Then
					objectflying(a0)=24
				Else If (v7=-1 And ((v6=0 Or (v6=-1)))) Then
					objectflying(a0)=26
				Else
					v13=1
				End If
			Case 2,5
				If (v7=1 And ((v6=0 Or (v6=-1)))) Then
					objectflying(a0)=26
				Else If (v6=1 And ((v7=0 Or (v7=-1)))) Then
					objectflying(a0)=20
				Else
					v13=1
				End If
			Case 3,6
				If (v7=1 And ((v6=0 Or (v6=1)))) Then
					objectflying(a0)=22
				Else If (v6=-1 And ((v7=0 Or (v7=-1)))) Then
					objectflying(a0)=20
				Else
					v13=1
				End If
			End Select
			If v13=1 Then
				If (v6=0 And (v7=-1)) Then
					objectflying(a0)=20
				End If
				If (v6=1 And (v7=-1)) Then
					objectflying(a0)=21
				End If
				If (v6=1 And (v7=0)) Then
					objectflying(a0)=22
				End If
				If (v6=1 And (v7=1)) Then
					objectflying(a0)=23
				End If
				If (v6=0 And (v7=1)) Then
					objectflying(a0)=24
				End If
				If (v6=-1 And (v7=1)) Then
					objectflying(a0)=25
				End If
				If (v6=-1 And (v7=0)) Then
					objectflying(a0)=26
				End If
				If (v6=-1 And (v7=-1)) Then
					objectflying(a0)=27
				End If
			End If
			If objecttype(a0)=1 Then
				If (v9/10<>2 And (objectflying(a0)/10=2)) Then
					playsoundfx(Rand(170,172),-1,-1)
				End If
			End If
			If (objecttype(a0)=110 Or (objecttype(a0)=120)) Then
				If (v9/10<>2 And (objectflying(a0)/10=2)) Then
					playsoundfx(70,-1,-1)
				End If
			End If
			If objectflying(a0)/10=2 Then
				playsoundfx(20,objectx(a0),objecty(a0))
			End If
		End If
	End Select
End Function

Function turnobjecttowarddirection(a0,a1#,a2#,a3,a4)
	
	If (a1#<>0.0 Or (a2#<>0.0)) Then
		v1=ATan2(-a2#,a1#)+90.0+a4
		While v1>180
			v1=v1-360
		Wend
		While v1<=-180
			v1=v1+360
		Wend
		If Abs(v1-objectyaw(a0))>a3 Then
			v2=a3
		Else
			v2=1
		End If
		If objectyaw(a0)>v1 Then
			If objectyaw(a0)-v1<180.0 Then
				objectyaw(a0)=objectyaw(a0)-v2
			Else
				objectyaw(a0)=objectyaw(a0)+v2
			End If
		Else If objectyaw(a0)<v1 Then
			If v1-objectyaw(a0)<180.0 Then
				objectyaw(a0)=objectyaw(a0)+v2
			Else
				objectyaw(a0)=objectyaw(a0)-v2
			End If
		End If
		If objectyaw(a0)>180.0 Then
			objectyaw(a0)=objectyaw(a0)-360.0
		End If
		If objectyaw(a0)<-180.0 Then
			objectyaw(a0)=objectyaw(a0)+360.0
		End If
	End If
End Function

Function objectcollision(a0)
	
End Function

Function objectobjectcollision(a0,a1)
	
End Function

Function objectobject3dcollision(a0,a1)
	
End Function

Function createplayer(a0#,a1#)
	
	v1=Floor(a0#)
	v2=Floor(a1#)
	v3=createnewobject()
	objectmodelname(v3)="!Player"
	objecttexturename(v3)="!T00"+playertexturebody+"c"
	If playeracc1>0 Then
		If playeracc1<10 Then
			objecttexturename(v3)=objecttexturename(v3)+"00"+playeracc1+Chr$(64+playertexacc1)+"0"
		Else
			objecttexturename(v3)=objecttexturename(v3)+"0"+playeracc1+Chr$(64+playertexacc1)+"0"
		End If
		If playeracc2>0 Then
			objecttexturename(v3)=objecttexturename(v3)+" "
		End If
	End If
	If playeracc2>0 Then
		objecttexturename(v3)=objecttexturename(v3)+playeracc2+Chr$(64+playertexacc2)+"0"
	End If
	createstinkermodel(v3,playersizex,playersizey,playersizez,objecttexturename(v3))
	objectx(v3)=v1
	objecty(v3)=v2
	objecttilex(v3)=Floor(v1)
	objecttiley(v3)=Floor(v2)
	objecttilex2(v3)=Floor(v1)
	objecttiley2(v3)=Floor(v2)
	objectmovementtype(v3)=10
	objectmovementtimer(v3)=0
	objectmovementspeed(v3)=40
	objectmovexgoal(v3)=objecttilex(v3)
	objectmoveygoal(v3)=objecttiley(v3)
	objectyaw(v3)=0.0
	objectspeed(v3)=0.06
	objectradius(v3)=0.4
	objectdata(v3,2)=0
	PositionEntity objectentity(v3),v1,0.0,-v2,0
	PositionEntity camera,objectx(0),15.0,(-objecty(0))-8.0,0
	objectteleportable(v3)=1
	objectbuttonpush(v3)=1
	objectwaterreact(v3)=10
	playerobject=v3
	camerafocusobject=v3
	objectactive(v3)=1001
	objecttype(v3)=1
	objectid(v3)=-1
	;v4=0
	For v4=0 To 99
		playertilepathx(v4)=v1
		playertilepathy(v4)=v2
		;v4=v4+1
	Next
	playertilepathpos=0
	;v4=0
	For v4=0 To levelwidth-1
		;v5=0
		For v5=0 To levelheight-1
			leveltileplayerpathscore(v4,v5)=100
			;v5=v5+1
		Next
		;v4=v4+1
	Next
	leveltileplayerpathscore(v1,v2)=0
	objecttiletypecollision(v3)=24089
	objectobjecttypecollision(v3)=376
	occupyobjecttile(v3,v1,v2)
	playertalktogoalobject=-1
	EntityFX objectentity(v3),0
End Function

Function createstinkermodel(a0,a1#,a2#,a3#,a4$)
	
	objectentity(a0)=CopyEntity(stinkermesh,0)
	objectxscale(a0)=a1#
	objectyscale(a0)=a2#
	objectzscale(a0)=a3#
	v1=(Asc(Mid$(a4$,3,1))-48)*100+(Asc(Mid$(a4$,4,1))-48)*10+Asc(Mid$(a4$,5,1))-48
	If v1=5 Then
		v1=1
		objectdata(a0,0)=5
	End If
	EntityTexture GetChild(objectentity(a0),3),stinkertexture(v1,0),0,0
	objecttexture(a0)=0
	Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
	objectcurrentanim(a0)=10
	;v2=1
	For v2=1 To (Len(a4$)-5)/6
		Select Mid$(a4$,v2*6+5,1)
		Case "0"
			v4=FindChild(objectentity(a0),"hat_bone")
		End Select
		createaccessory(v4,a1#,a2#,a3#,Mid$(a4$,v2*6+1,4))
		If Mid$(a4$,v2*6+1,1)="0" Then
			objectchild(a0)=nofobjects-1
		End If
		objectparent((nofobjects-1))=a0
		;v2=v2+1
	Next
	createshadow(a0,(a1#+a2#)*11.6)
End Function

Function controlplayer(a0)
	
	If currentcharm=3 Then
		HideEntity levelcursor
		If ((mouse1=1 Or (mouse2=1)) And (mousegamemode=-1)) Then
			ShowEntity levelcursor
			currentcharm=0
			turnonicons()
			deleteicon(1)
			mousegamemode=-2
		End If
		Return 0
	End If
	If gamemode=8 Then
		If dialogobject1>=0 Then
			turnobjecttowarddirection(a0,objectx(dialogobject1)-objectx(a0),objecty(dialogobject1)-objecty(a0),4,0)
		End If
		If dialogobject2>=0 Then
			turnobjecttowarddirection(dialogobject2,objectx(a0)-objectx(dialogobject2),objecty(a0)-objecty(dialogobject2),4,-objectyawadjust(dialogobject2))
		End If
		If (objectmovementtimer(a0)=0 And (objectcurrentanim(a0)<>10)) Then
			Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
			objectcurrentanim(a0)=10
		End If
	Else
		controlplayeringame(a0)
	End If
End Function

Function controlplayeringame(a0)
	
	If objectdead(a0)=1 Then
		EntityTexture GetChild(objectentity(a0),3),stinkertexture(playertexturebody,4),0,0
		objectdeadtimer(a0)=objectdeadtimer(a0)+1
		If objectdeadtimer(a0)<100 Then
			objectyaw(a0)=(objectyaw(a0)+10.0) Mod 360.0
			objectz(a0)=objectz(a0)+0.015
		End If
		If objectdeadtimer(a0)=100 Then
			HideEntity objectentity(a0)
			objectactive(a0)=0
			;v1=0
			For v1=0 To 360 Step 2
				v2#=Rnd(0.7,1.5)
				addparticle(Rand(16,23),objectx(a0),objectz(a0)+0.5,-objecty(a0),0.0,0.4,v2#*0.12*Sin(v1),0.0,v2#*0.12*Cos(v1),5.0,0.001,(-v2#)*0.0021*Sin(v1),0.0,(-v2#)*0.0021*Cos(v1),75,3)
				;v1=v1+2
			Next
			;v1=0
			For v1=0 To nofobjects-1
				If (objectparent(v1)=a0 And (objectchild(a0)<>v1)) Then
					HideEntity objectentity(v1)
				End If
				;v1=v1+1
			Next
		End If
		If (objectdeadtimer(a0)=150 And (leveltimer<1000000000)) Then
			adventurelostcamerax=objectx(a0)
			adventurelostcameray=-objecty(a0)
			adventurelostcameraz=objectz(a0)
			adventurelost()
		End If
		If objectchild(a0)>=0 Then
			If objectdeadtimer(a0)=100 Then
				objecttype(objectchild(a0))=0
			End If
			If objectdeadtimer(a0)>100 Then
				objectyaw(objectchild(a0))=(objectyaw(objectchild(a0))+4.0) Mod 360.0
				objectroll2(objectchild(a0))=-40.0
				v3=objectdata(objectchild(a0),0)
				objectx(objectchild(a0))=EntityX(v3,1)
				objecty(objectchild(a0))=-EntityZ(v3,1)
				objectz(objectchild(a0))=objectz(objectchild(a0))-0.005
			End If
		End If
		Return 0
	End If
	If objectdead(a0)=2 Then
		objectdeadtimer(a0)=objectdeadtimer(a0)+1
		turnobjecttowarddirection(a0,0.0,1.0,4,0)
		v2#=Rnd(0.1,0.2)
		v1=Rand(0,90)*4
		addparticle(0,objectx(a0)+Rnd(-0.1,0.1),objectz(a0)+0.5,-objecty(a0)+Rnd(-0.1,0.0),0.0,0.4,v2#*0.12*Sin(v1),0.03,v2#*0.12*Cos(v1),5.0,0.001,(-v2#)*0.0021*Sin(v1),0.0,(-v2#)*0.0021*Cos(v1),75,3)
		If (objectdeadtimer(a0)=200 And (leveltimer<1000000000)) Then
			adventurelostcamerax=objectx(a0)
			adventurelostcameray=-objecty(a0)
			adventurelostcameraz=objectz(a0)
			adventurelost()
		End If
		Return 0
	End If
	If objectdead(a0)=3 Then
		objectyaw(a0)=0.0
		EntityTexture GetChild(objectentity(a0),3),stinkertexture(playertexturebody,1),0,0
		objectdeadtimer(a0)=objectdeadtimer(a0)+1
		If objectdeadtimer(a0)<=18 Then
			objectpitch2(a0)=objectpitch2(a0)+1.0
			objectz(a0)=objectz(a0)-0.06
			objecty(a0)=objecty(a0)+0.008
		Else
			objectz(a0)=objectz(a0)-0.002
		End If
		If (objectdeadtimer(a0)=150 And (leveltimer<1000000000)) Then
			adventurelostcamerax=objectx(a0)
			adventurelostcameray=-objecty(a0)
			adventurelostcameraz=objectz(a0)
			adventurelost()
		End If
		If objectchild(a0)>=0 Then
			objecttype(objectchild(a0))=0
			objectyaw(objectchild(a0))=(objectyaw(objectchild(a0))+0.5) Mod 360.0
			objectroll2(objectchild(a0))=-40.0
			v3=objectdata(objectchild(a0),0)
			objectx(objectchild(a0))=EntityX(v3,1)
			objecty(objectchild(a0))=-EntityZ(v3,1)
			If objectz(objectchild(a0))>-0.2 Then
				objectz(objectchild(a0))=objectz(objectchild(a0))-0.02
			End If
		End If
		Return 0
	End If
	If objectfrozen(a0)=1 Then
		objectfrozen(a0)=1000
		objectmovexgoal(a0)=objecttilex2(a0)
		objectmoveygoal(a0)=objecttiley2(a0)
		playertalktogoalobject=-1
		Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
		objectcurrentanim(a0)=10
	End If
	If objectfrozen(a0)=2 Then
		objectfrozen(a0)=0
	End If
	If objectfrozen(a0)>2 Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If leveltimer>=1000000000 Then
		If (leveltimer>1000001000 And (leveltimer<1000002000)) Then
			If objectcurrentanim(a0)<>12 Then
				Animate GetChild(objectentity(a0),3),1,0.3,12,0.0
			End If
			objectcurrentanim(a0)=12
			objectyaw(a0)=objectyaw(a0)+2.0
		End If
		If (leveltimer>1000002000 And (leveltimer<1000003000)) Then
			If objectcurrentanim(a0)<>10 Then
				Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
			End If
			objectcurrentanim(a0)=10
		End If
		If (leveltimer>1000000000 And (leveltimer<1000001000)) Then
			If objectcurrentanim(a0)<>10 Then
				Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
			End If
			objectcurrentanim(a0)=10
		End If
		Return 0
	End If
	If playertalktogoalobject>=0 Then
		If (((objectmovementtimer(playertalktogoalobject)<>0 Or (objecttalkable(playertalktogoalobject)=0)) Or (objectactive(playertalktogoalobject)<1001)) Or (objectfrozen(playertalktogoalobject)>0)) Then
			playertalktogoalobject=-2
		Else If (Abs(objecttilex2(a0)-objecttilex(playertalktogoalobject))<2 And (Abs(objecttiley2(a0)-objecttiley(playertalktogoalobject))<2)) Then
			If (objecttalkable(playertalktogoalobject)>0 And (objecttalkable(playertalktogoalobject)<10001)) Then
				playsoundfx(169,-1,-1)
				startdialog(objecttalkable(playertalktogoalobject),-1,0)
				cameraaddx=(objectx(playertalktogoalobject)-objectx(a0))/2.0
				cameraaddz=(-(objecty(playertalktogoalobject)-objecty(a0)))/2.0+7.0
				cameraaddy=-5.0
				dialogobject1=playertalktogoalobject
				If objecttype(v4)<>290 Then
					dialogobject2=playertalktogoalobject
				End If
			Else If objecttalkable(playertalktogoalobject)>=10001 Then
				startdialog(objecttalkable(playertalktogoalobject)-10000,-1,0)
				dialogobject1=playertalktogoalobject
				playsoundfx(176,-1,-1)
			End If
			playertalktogoalobject=-2
		End If
	End If
	If playertalktogoalobject=-2 Then
		objectmovexgoal(a0)=objecttilex2(a0)
		objectmoveygoal(a0)=objecttiley2(a0)
		playertalktogoalobject=-1
	End If
	If (((mouse2 And (mouseheld=0)) And (currentspell>=0)) And (currentspellpower>0)) Then
		togglespell()
	End If
	If keyboardmode=2 Then
		If ((playercontrolmode=0 And (gamemode=0)) And (objectmovementtimer(a0)=0)) Then
			v5=0
			v6=0
			If (KeyDown(71) Or ((KeyDown(200) And (KeyDown(203)))) Or (KeyDown(17) And (KeyDown(30)))) Then
				v5=-1
				v6=-1
			Else If (KeyDown(73) Or ((KeyDown(200) And (KeyDown(205)))) Or (KeyDown(17) And (KeyDown(32)))) Then
				v5=1
				v6=-1
			Else If (KeyDown(79) Or ((KeyDown(208) And (KeyDown(203)))) Or (KeyDown(31) And (KeyDown(30)))) Then
				v5=-1
				v6=1
			Else If (KeyDown(81) Or ((KeyDown(205) And (KeyDown(208)))) Or (KeyDown(32) And (KeyDown(31)))) Then
				v5=1
				v6=1
			Else If (KeyDown(72) Or (KeyDown(200)) Or (KeyDown(17))) Then
				v5=0
				v6=-1
			Else If (KeyDown(205) Or (KeyDown(77)) Or (KeyDown(32))) Then
				v5=1
				v6=0
			Else If (KeyDown(208) Or (KeyDown(80)) Or (KeyDown(31))) Then
				v5=0
				v6=1
			Else If (KeyDown(203) Or (KeyDown(75)) Or (KeyDown(30))) Then
				v5=-1
				v6=0
			End If
			If ((v5<>0 Or (v6<>0)) And (canobjectmovetotile(a0,objecttilex(a0)+v5,objecttiley(a0)+v6,0,1))) Then
				PositionEntity levelcursor,objecttilex(a0)+v5+0.5,0.05,(-(objecttiley(a0)+v6))-0.5,0
				ScaleEntity levelcursor,1.0,1.0,1.0,0
				EntityAlpha levelcursor,0.0
				EntityColor levelcursor,255.0,255.0,255.0
				VertexTexCoords GetSurface(levelcursor,1),0,0.0,0.0,1.0,0
				VertexTexCoords GetSurface(levelcursor,1),1,0.25,0.0,1.0,0
				VertexTexCoords GetSurface(levelcursor,1),2,0.0,0.25,1.0,0
				VertexTexCoords GetSurface(levelcursor,1),3,0.25,0.25,1.0,0
				playertalktogoalobject=-1
				objectmovexgoal(a0)=objecttilex(a0)+v5
				objectmoveygoal(a0)=objecttiley(a0)+v6
				movecursornewtarget=20
				EntityColor levelcursor,100.0,255.0,100.0
				playercontrolmode=1
				objectmovementtypedata(a0)=0
				turnofficons()
				spellactive=0
			End If
		End If
	End If
	v7=Floor(mousepickx)
	v8=Floor(mousepicky)
	If (((v7>=0 And (v8>=0)) And (v7<levelwidth)) And (v8<levelheight)) Then
		v9=1
	End If
	If (mouse1 Or (mouse2)) Then
		mouseheld=mouseheld+1
	Else
		mouseheld=0
	End If
	ScaleEntity levelcursor,1.0,1.0,1.0,0
	If (mousegamemode=-1 And (gamemode=0)) Then
		Select playercontrolmode
		Case 0
			If v9=1 Then
				If spellactive=1 Then
					If (currentspell=4 Or (canobjectmovetotile(a0,v7,v8,0,1))) Then
						PositionEntity levelcursor,v7+0.5,0.05,(-v8)-0.5,0
						EntityAlpha levelcursor,0.6
						EntityColor levelcursor,255.0,255.0,255.0
						VertexTexCoords GetSurface(levelcursor,1),0,0.5,0.25,1.0,0
						VertexTexCoords GetSurface(levelcursor,1),1,0.75,0.25,1.0,0
						VertexTexCoords GetSurface(levelcursor,1),2,0.5,0.5,1.0,0
						VertexTexCoords GetSurface(levelcursor,1),3,0.75,0.5,1.0,0
						ScaleEntity levelcursor,1.25+Sin(leveltimer*6 Mod 360)*0.25,1.25+Sin(leveltimer*6 Mod 360)*0.25,1.25+Sin(leveltimer*6 Mod 360)*0.25,0
						If mouse1 Then
							v11=v7-objecttilex(a0)
							v12=v8-objecttiley(a0)
							v13=Sqr(v11^2.0+v12^2.0)
							If v13>=1 Then
								v14=1
								If (v11>1 And (v12=0)) Then
									If leveltilelogic(objecttilex(a0)+1,objecttiley(a0))=1 Then
										v14=0
									End If
								End If
								If (v11<1 And (v12=0)) Then
									If leveltilelogic(objecttilex(a0)-1,objecttiley(a0))=1 Then
										v14=0
									End If
								End If
								If (v11=0 And (v12>1)) Then
									If leveltilelogic(objecttilex(a0),objecttiley(a0)+1)=1 Then
										v14=0
									End If
								End If
								If (v11=0 And (v12<1)) Then
									If leveltilelogic(objecttilex(a0),objecttiley(a0)-1)=1 Then
										v14=0
									End If
								End If
								If (v11>0 And (v12>0)) Then
									If (leveltilelogic(objecttilex(a0),objecttiley(a0)+1)=1 And (leveltilelogic(objecttilex(a0)+1,objecttiley(a0))=1)) Then
										v14=0
									End If
								End If
								If (v12<0 And (v11>0)) Then
									If (leveltilelogic(objecttilex(a0),objecttiley(a0)-1)=1 And (leveltilelogic(objecttilex(a0)+1,objecttiley(a0))=1)) Then
										v14=0
									End If
								End If
								If (v12>0 And (v11<0)) Then
									If (leveltilelogic(objecttilex(a0),objecttiley(a0)+1)=1 And (leveltilelogic(objecttilex(a0)-1,objecttiley(a0))=1)) Then
										v14=0
									End If
								End If
								If (v12<0 And (v11<0)) Then
									If (leveltilelogic(objecttilex(a0),objecttiley(a0)-1)=1 And (leveltilelogic(objecttilex(a0)-1,objecttiley(a0))=1)) Then
										v14=0
									End If
								End If
								If (wallblinking=0 And (v14=0)) Then
									playercontrolmode=6
									createspellball(objecttilex(a0)+0.5+0.6*v11/v13,objecttiley(a0)+0.5+0.6*v12/v13,0.7,0.1*v11/v13,0.1*v12/v13,currentspell+10,v7,v8,1,2)
									currentspellpower=currentspellpower-1
									If currentspellpower=0 Then
										playsoundfx(91,-1,-1)
										;v1=0
										For v1=0 To 99
											If inventoryitem(v1)=1001 Then
												inventorytexture(v1)=23
												spellactive=0
												currentspell=-1
												deleteicon(0)
											End If
											;v1=v1+1
										Next
									Else
										iconsubtext(0)="- "+currentspellpower+" -"
									End If
									objectyaw(a0)=ATan2(-(v8-objecttiley(a0)),v7-objecttilex(a0))+90.0
								End If
								If (wallblinking=1 Or (v14=1)) Then
									If currentspell=6 Then
										playercontrolmode=5
									Else
										playercontrolmode=6
									End If
									createspellball(objecttilex(a0)+0.5+0.6*v11/v13,objecttiley(a0)+0.5+0.6*v12/v13,0.7,0.1*v11/v13,0.1*v12/v13,currentspell,v7,v8,1,300)
									currentspellpower=currentspellpower-1
									If currentspellpower=0 Then
										playsoundfx(91,-1,-1)
										;v1=0
										For v1=0 To 99
											If inventoryitem(v1)=1001 Then
												inventorytexture(v1)=23
												spellactive=0
												currentspell=-1
												deleteicon(0)
											End If
											;v1=v1+1
										Next
									Else
										iconsubtext(0)="- "+currentspellpower+" -"
									End If
									objectyaw(a0)=ATan2(-(v8-objecttiley(a0)),v7-objecttilex(a0))+90.0
									objectcurrentanim(a0)=5
									Animate GetChild(objectentity(a0),3),3,2.0,5,0.0
								End If
							End If
						End If
						Goto endofplayercontrol
					Else
						EntityAlpha levelcursor,0.0
						Goto endofplayercontrol
					End If
				End If
				If (objecttilelogic(v7,v8) And (8))>0 Then
					;v1=0
					For v1=0 To nofobjects-1
						If (objectexists(v1)=1 And (objecttype(v1)=120 Or (objecttype(v1)=400))) Then
							If (((objectsubtype(v1)=1 Or (objectsubtype(v1)=2)) And (objectmovementtimer(v1)=0)) And (objectcurrentanim(v1)<>7)) Then
								If (objecttilex(v1)=v7 And (objecttiley(v1)=v8)) Then
									PositionEntity levelcursor,v7+0.5,0.05,(-v8)-0.5,0
									ScaleEntity levelcursor,1.0,1.0,1.0,0
									EntityAlpha levelcursor,0.6
									EntityColor levelcursor,255.0,255.0,255.0
									VertexTexCoords GetSurface(levelcursor,1),0,0.25,0.0,1.0,0
									VertexTexCoords GetSurface(levelcursor,1),1,0.5,0.0,1.0,0
									VertexTexCoords GetSurface(levelcursor,1),2,0.25,0.25,1.0,0
									VertexTexCoords GetSurface(levelcursor,1),3,0.5,0.25,1.0,0
									If mouse1 Then
										playercontrolmode=3
										stinkerobject=v1
										If objecttype(v1)=400 Then
											playsoundfx(74,-1,-1)
										Else
											playsoundfx(Rand(55,58),-1,-1)
										End If
										turnofficons()
									End If
									Goto endofplayercontrol
								End If
							End If
						End If
						;v1=v1+1
					Next
				End If
				If (((objecttilelogic(v7,v8) And (4)))>0 And (objectmovementtimer(a0)=0)) Then
					;v1=0
					For v1=0 To nofobjects-1
						If (objectexists(v1)=1 And ((((objecttype(v1)=110 Or (objecttype(v1)=180)) Or (objecttype(v1)=290)) Or (objecttype(v1)=330) Or (objecttype(v1)=390)))) Then
							If ((objectmovementtimer(v1)=0 And (objecttalkable(v1)>0)) And (objectactive(v1)=1001)) Then
								If (objecttilex(v1)=v7 And (objecttiley(v1)=v8)) Then
									PositionEntity levelcursor,v7+0.5,0.5,-v8,0
									ScaleEntity levelcursor,1.0,1.0,1.0,0
									EntityAlpha levelcursor,0.6
									EntityColor levelcursor,255.0,255.0,0.0
									If objecttalkable(v1)>10000 Then
										VertexTexCoords GetSurface(levelcursor,1),0,0.25,0.25,1.0,0
										VertexTexCoords GetSurface(levelcursor,1),1,0.5,0.25,1.0,0
										VertexTexCoords GetSurface(levelcursor,1),2,0.25,0.5,1.0,0
										VertexTexCoords GetSurface(levelcursor,1),3,0.5,0.5,1.0,0
									Else
										VertexTexCoords GetSurface(levelcursor,1),0,0.0,0.25,1.0,0
										VertexTexCoords GetSurface(levelcursor,1),1,0.25,0.25,1.0,0
										VertexTexCoords GetSurface(levelcursor,1),2,0.0,0.5,1.0,0
										VertexTexCoords GetSurface(levelcursor,1),3,0.25,0.5,1.0,0
									End If
									RotateEntity levelcursor,0.0,0.0,0.0,0
									If mouse1 Then
										v4=v1
										If (Abs(objecttilex(a0)-objecttilex(v4))>1 Or (Abs(objecttiley(a0)-objecttiley(v4))>1)) Then
											playertalktogoalobject=v4
											objectmovexgoal(a0)=v7
											objectmoveygoal(a0)=v8
											movecursornewtarget=36
											EntityColor levelcursor,100.0,255.0,100.0
											playercontrolmode=1
											objectmovementtypedata(a0)=0
										Else If (objecttalkable(v4)>0 And (objecttalkable(v4)<10001)) Then
											playsoundfx(169,-1,-1)
											startdialog(objecttalkable(v4),-1,0)
											cameraaddx=(objectx(v4)-objectx(a0))/2.0
											cameraaddz=(-(objecty(v4)-objecty(a0)))/2.0+7.0
											cameraaddy=-5.0
											dialogobject1=v4
											If objecttype(v4)<>290 Then
												dialogobject2=v4
											End If
										Else If objecttalkable(v4)>=10001 Then
											startdialog(objecttalkable(v4)-10000,-1,0)
											dialogobject1=v4
											playsoundfx(176,-1,-1)
										End If
										turnofficons()
									End If
									Goto endofplayercontrol
								End If
							End If
						End If
						;v1=v1+1
					Next
				End If
				If canobjectmovetotile(a0,v7,v8,0,1) Then
					PositionEntity levelcursor,v7+0.5,0.05,(-v8)-0.5,0
					ScaleEntity levelcursor,1.0,1.0,1.0,0
					EntityAlpha levelcursor,0.6
					EntityColor levelcursor,255.0,255.0,255.0
					VertexTexCoords GetSurface(levelcursor,1),0,0.0,0.0,1.0,0
					VertexTexCoords GetSurface(levelcursor,1),1,0.25,0.0,1.0,0
					VertexTexCoords GetSurface(levelcursor,1),2,0.0,0.25,1.0,0
					VertexTexCoords GetSurface(levelcursor,1),3,0.25,0.25,1.0,0
					If mouse1 Then
						playertalktogoalobject=-1
						objectmovexgoal(a0)=v7
						objectmoveygoal(a0)=v8
						movecursornewtarget=36
						EntityColor levelcursor,100.0,255.0,100.0
						playercontrolmode=1
						objectmovementtypedata(a0)=0
						turnofficons()
					End If
					Goto endofplayercontrol
				Else
					EntityAlpha levelcursor,0.0
					If (((mouse1 And (waepisode=1)) And (adventurecurrentlevel=-9)) And (clickonunwalkable=0)) Then
						clickonunwalkable=1
						activatecommand(21,1,8,0,0)
					End If
				End If
				turnonicons()
				.endofplayercontrol
			Else
				EntityAlpha levelcursor,0.0
			End If
		Case 1
			movecursornewtarget=movecursornewtarget-1
			RotateEntity levelcursor,0.0,movecursornewtarget*10,0.0,0
			ScaleEntity levelcursor,0.1+(movecursornewtarget/36.0),0.1+(movecursornewtarget/36.0),0.1+(movecursornewtarget/36.0),0
			If movecursornewtarget=0 Then
				If mouseheld>35 Then
					playercontrolmode=2
				Else
					playercontrolmode=0
				End If
			End If
		Case 2
			objectmovexgoal(a0)=v7
			objectmoveygoal(a0)=v8
			movecursornewtarget=36
			PositionEntity levelcursor,v7+0.5,0.05,(-v8)-0.5,0
			ScaleEntity levelcursor,1.0,1.0,1.0,0
			EntityColor levelcursor,100.0,255.0,100.0
			If mouse1=0 Then
				playercontrolmode=1
			End If
		Case 3
			PositionEntity levelcursor,v7+0.5,0.05,(-v8)-0.5,0
			ScaleEntity levelcursor,1.0,1.0,1.0,0
			EntityAlpha levelcursor,0.6
			EntityColor levelcursor,255.0,255.0,100.0
			VertexTexCoords GetSurface(levelcursor,1),0,0.0,0.0,1.0,0
			VertexTexCoords GetSurface(levelcursor,1),1,0.25,0.0,1.0,0
			VertexTexCoords GetSurface(levelcursor,1),2,0.0,0.25,1.0,0
			VertexTexCoords GetSurface(levelcursor,1),3,0.25,0.25,1.0,0
			If mouse1=0 Then
				If (v7=objecttilex(stinkerobject) And (v8=objecttiley(stinkerobject))) Then
					If (objecttype(stinkerobject)<>400 Or (objectdata(stinkerobject,8)<50)) Then
						objectmovexgoal(a0)=v7
						objectmoveygoal(a0)=v8
					Else
						objectmovexgoal(a0)=objecttilex(a0)
						objectmoveygoal(a0)=objecttiley(a0)
					End If
					movecursornewtarget=36
					EntityColor levelcursor,100.0,255.0,100.0
					playercontrolmode=1
					objectmovementtypedata(a0)=0
				Else If ((objectmovementtimer(playerobject)=0 And (v7=objecttilex(playerobject))) And (v8=objecttiley(playerobject))) Then
					If objecttype(stinkerobject)=400 Then
						playsoundfx(Rand(75,76),-1,-1)
					Else
						playsoundfx(Rand(60,64),-1,-1)
					End If
					objectsubtype(stinkerobject)=1
					playercontrolmode=4
					movecursornewtarget=18
					objectmovexgoal(stinkerobject)=v7
					objectmoveygoal(stinkerobject)=v8
					objectmovementtype(stinkerobject)=14
				Else
					If objecttype(stinkerobject)=400 Then
						playsoundfx(Rand(75,76),-1,-1)
					Else
						playsoundfx(Rand(60,64),-1,-1)
					End If
					playercontrolmode=4
					movecursornewtarget=18
					objectmovexgoal(stinkerobject)=v7
					objectmoveygoal(stinkerobject)=v8
					objectmovementtype(stinkerobject)=13
					objectsubtype(stinkerobject)=2
				End If
				If (objecttype(stinkerobject)=400 And (objectdata(stinkerobject,8)>0)) Then
					objectdata(stinkerobject,8)=1
				End If
			Else If (objecttype(stinkerobject)=400 And (objectdata(stinkerobject,8)>0)) Then
				If (v7=objecttilex(stinkerobject) And (v8=objecttiley(stinkerobject))) Then
					objectdata(stinkerobject,8)=objectdata(stinkerobject,8)+1
					If objectdata(stinkerobject,8)=120 Then
						objectdata(stinkerobject,8)=0
						;v18=0
						For v18=0 To 7
							createspellball(objectx(stinkerobject)+0.7*Sin(v18*45),objecty(stinkerobject)+0.7*Cos(v18*45),0.7,0.02*Sin(v18*45),0.02*Cos(v18*45),1,-1,-1,0,50)
							;v18=v18+1
						Next
						;v18=0
						For v18=0 To 50
							addparticle(Rand(16,18),objectx(stinkerobject),Rnd(0.7,0.8),-objecty(stinkerobject),0.0,0.4,Rnd(-0.05,0.05),Rnd(0.0,0.05),Rnd(-0.05,0.05),0.0,0.004,0.0,-0.0001,0.0,50,3)
							;v18=v18+1
						Next
						playsoundfx(78,-1,-1)
						camerashaketimer=30
						playercontrolmode=7
						movecursornewtarget=18
					End If
				Else
					objectdata(stinkerobject,8)=1
				End If
			End If
		Case 4
			PositionEntity levelcursor,v7+0.5,0.05,(-v8)-0.5,0
			movecursornewtarget=movecursornewtarget-1
			RotateEntity levelcursor,0.0,movecursornewtarget*20,0.0,0
			ScaleEntity levelcursor,0.1+(movecursornewtarget/18.0),0.1+(movecursornewtarget/18.0),0.1+(movecursornewtarget/18.0),0
			If (movecursornewtarget<=0 And (mouse1=0)) Then
				playercontrolmode=0
			End If
		Case 5
		Case 6
			If mouse1=0 Then
				playercontrolmode=0
				Animate GetChild(objectentity(playerobject),3),3,0.4,7,0.0
				objectcurrentanim(playerobject)=7
			End If
		Case 7
			If mouse1=0 Then
				playercontrolmode=0
			End If
		End Select
	End If
	If objectmovementtimer(a0)>0 Then
		objectdata(a0,2)=0
	Else
		objectdata(a0,2)=objectdata(a0,2)+1
	End If
	If objectmovementtimer(a0)>0 Then
		If objectflying(a0)/10=1 Then
			If objectcurrentanim(a0)<>11 Then
				Animate GetChild(objectentity(a0),3),1,1.0,11,0.0
				objectcurrentanim(a0)=11
			End If
		Else If objectflying(a0)/10=2 Then
			If objectcurrentanim(a0)<>13 Then
				Animate GetChild(objectentity(a0),3),3,2.0,13,0.0
				objectcurrentanim(a0)=13
			End If
		Else If objectcurrentanim(a0)<>2 Then
			If adventuregoal=6 Then
				Animate GetChild(objectentity(a0),3),1,0.4,3,0.0
			Else
				Animate GetChild(objectentity(a0),3),1,0.4,2,0.0
			End If
			objectcurrentanim(a0)=2
		End If
	End If
	If (objectcurrentanim(a0)=2 And (objectdata(a0,2)=2)) Then
		Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
		objectcurrentanim(a0)=10
	End If
	If (objectcurrentanim(a0)=11 And (objectdata(a0,2)=2)) Then
		Animate GetChild(objectentity(a0),3),3,1.0,14,0.0
		objectcurrentanim(a0)=10
		;v1=0
		For v1=0 To 19
			addparticle(18,objectx(a0)+0.2*Sin(v1*18),objectz(a0)+0.7,(-objecty(a0))-(0.2*Cos(v1*18)),0.0,0.3,0.02*Sin(v1*18),0.0,(-0.02)*Cos(v1*18),10.0,0.0,0.0,0.0,0.0,50,3)
			;v1=v1+1
		Next
	End If
	If (objectcurrentanim(a0)=13 And (objectdata(a0,2)=2)) Then
		Animate GetChild(objectentity(a0),3),3,-0.4,17,0.0
		objectcurrentanim(a0)=17
	End If
	If (objectcurrentanim(a0)=17 And (Animating(GetChild(objectentity(a0),3))=0)) Then
		Animate GetChild(objectentity(a0),3),3,0.04,10,0.0
		objectcurrentanim(a0)=10
	End If
	If objectmovementtimer(a0)>0 Then
		If objectflying(a0)/10=2 Then
			objectyaw(a0)=objectyaw(a0)+4.0
		Else
			turnobjecttowarddirection(a0,objecttilex2(a0)-objecttilex(a0),objecttiley2(a0)-objecttiley(a0),11,0)
		End If
	End If
End Function

Function createaccessory(a0,a1#,a2#,a3#,a4$)
	
	v1=createnewobject()
	objecttilex(v1)=0
	objecttiley(v1)=0
	objecttilex2(v1)=0
	objecttiley2(v1)=0
	objectmodelname(v1)="!Hat"
	objectentity(v1)=myloadmesh("data/models/stinker/accessory"+Left$(a4$,3)+".3ds",0)
	objecttexture(v1)=myloadtexture("data/models/stinker/accessory"+a4$+".jpg",4)
	objectxscale(v1)=a2#
	objectyscale(v1)=a1#
	objectzscale(v1)=a3#
	EntityTexture objectentity(v1),objecttexture(v1),0,0
	objectdata(v1,0)=a0
	objecttype(v1)=100
End Function

Function controlaccessory(a0)
	
	v1=objectdata(a0,0)
	objectx(a0)=EntityX(v1,1)
	objecty(a0)=-EntityZ(v1,1)
	objectz(a0)=EntityY(v1,1)
	objectpitch(a0)=EntityPitch(v1,1)
	objectyaw(a0)=EntityYaw(v1,1)
	objectroll(a0)=EntityRoll(v1,1)
	If objectparent(a0)<0 Then
		Return 0
	End If
	If objectactive(objectparent(a0))=0 Then
		HideEntity objectentity(a0)
	Else
		ShowEntity objectentity(a0)
	End If
End Function

Function createshadow(a0,a1#)
	
	v1=createnewobject()
	objectentity(v1)=CreateMesh(0)
	v2=CreateSurface(objectentity(v1),0)
	AddVertex(v2,(-0.49)*a1#,0.05,0.49*a1#,0.0,0.0,1.0)
	AddVertex(v2,0.49*a1#,0.05,0.49*a1#,1.0,0.0,1.0)
	AddVertex(v2,(-0.49)*a1#,0.05,(-0.49)*a1#,0.0,1.0,1.0)
	AddVertex(v2,0.49*a1#,0.05,(-0.49)*a1#,1.0,1.0,1.0)
	AddTriangle(v2,0,1,2)
	AddTriangle(v2,1,3,2)
	UpdateNormals objectentity(v1)
	EntityTexture objectentity(v1),shadowtexture(0),0,0
	objecttype(v1)=101
	objectparent(v1)=a0
	EntityBlend objectentity(v1),2
	EntityFX objectentity(v1),1
	objectmodelname(v1)="!Shadow"
End Function

Function controlshadow(a0)
	
	objectx(a0)=objectx(objectparent(a0))+0.03
	objecty(a0)=objecty(objectparent(a0))+0.1
	objectz(a0)=0.06
	If (objecttype(objectparent(a0))=120 And (objectsubtype(objectparent(a0))=0)) Then
		objectx(a0)=objectx(objectparent(a0))+0.1
		objecty(a0)=objecty(objectparent(a0))-0.15
	End If
	If (objecttype(objectparent(a0))=120 And (objectcurrentanim(objectparent(a0))=7)) Then
		objectx(a0)=objectx(objectparent(a0))+0.06
		objecty(a0)=objecty(objectparent(a0))-0.07
	End If
	If objectactive(objectparent(a0))=0 Then
		HideEntity objectentity(a0)
	Else
		ShowEntity objectentity(a0)
		If objecttype(objectparent(a0))=220 Then
			If objectstatus(objectparent(a0))>0 Then
				HideEntity objectentity(a0)
			Else
				ShowEntity objectentity(a0)
			End If
		End If
		If objecttype(objectparent(a0))=370 Then
			If (objectstatus(objectparent(a0))>0 Or (objectdata(objectparent(a0),1)>1)) Then
				HideEntity objectentity(a0)
			Else
				ShowEntity objectentity(a0)
			End If
		End If
	End If
End Function

Function controlstinkerwee(a0)
	
	If objectfrozen(a0)=1 Then
		objectfrozen(a0)=1000
		AnimateMD2 objectentity(a0),3,1.0,161,178,1.0
		objectpitch(a0)=Rand(-30,30)
		objectroll(a0)=Rand(-30,30)
		objectz(a0)=0.3
		playsoundfx(85,objectx(a0),objecty(a0))
	End If
	If objectfrozen(a0)=2 Then
		objectfrozen(a0)=0
		AnimateMD2 objectentity(a0),1,Rnd(0.01,0.08),141,160,1.0
		objectcurrentanim(a0)=3
		objectpitch(a0)=0.0
		objectroll(a0)=0.0
		objectz(a0)=0.0
	End If
	If objectfrozen(a0)>2 Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If objecttiletypecollision(a0)=0 Then
		objecttiletypecollision(a0)=24089
		objectobjecttypecollision(a0)=320
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
		objecttilex2(a0)=Floor(objectx(a0))
		objecttiley2(a0)=Floor(objecty(a0))
		objectmovementtype(a0)=0
		objectmovementtimer(a0)=0
		objectmovementspeed(a0)=35
		objectsubtype(a0)=0
		AnimateMD2 objectentity(a0),1,Rnd(0.002,0.008),217,219,1.0
		objectcurrentanim(a0)=1
		objectxscale(a0)=0.025
		objectyscale(a0)=0.025
		objectzscale(a0)=0.025
	End If
	If objectdead(a0)=1 Then
		objectyaw(a0)=(objectyaw(a0)+10.0) Mod 360.0
		objectz(a0)=objectz(a0)+0.01
		objectsubtype(a0)=-2
		Return 0
	End If
	If objectdead(a0)=3 Then
		objectyaw(a0)=90.0
		objectz(a0)=objectz(a0)-0.005
		objectsubtype(a0)=-2
		Return 0
	End If
	If objectsubtype(a0)=-1 Then
		turnobjecttowarddirection(a0,0.0,1.0,4,0)
		Return 0
	End If
	If ((objectcaged(a0)=1 And (objectsubtype(a0)<>4)) And (objectsubtype(a0)<>5)) Then
		EntityTexture objectentity(a0),stinkerweetexturesad,0,0
		playsoundfx(66,objecttilex(a0),objecttiley(a0))
		If objectsubtype(a0)=2 Then
			objectsubtype(a0)=5
		Else
			objectsubtype(a0)=4
		End If
		AnimateMD2 objectentity(a0),1,0.2,108,114,1.0
	End If
	If (objectcaged(a0)=0 And ((objectsubtype(a0)=4 Or (objectsubtype(a0)=5)))) Then
		EntityTexture objectentity(a0),stinkerweetexture,0,0
		objectsubtype(a0)=objectsubtype(a0)-3
		AnimateMD2 objectentity(a0),1,0.4,1,20,1.0
		objectcurrentanim(a0)=4
		objectmovementtypedata(a0)=0
		If ((objectsubtype(a0)=2 And (objecttilex(a0)=objectmovexgoal(a0))) And (objecttiley(a0)=objectmoveygoal(a0))) Then
			v1=1
			v2=1
			If Rand(0,100)<50 Then
				v1=-1
			End If
			If Rand(0,100)<50 Then
				v2=-1
			End If
			;v3=-1
			For v3=-1 To 1
				;v4=-1
				For v4=-1 To 1
					If canobjectmovetotile(a0,objecttilex(a0)+v3*v1,objecttiley(a0)+v4*v2,1,1)=1 Then
						moveobjecttotile(a0,objecttilex(a0)+v3*v1,objecttiley(a0)+v4*v2)
						objectmovexgoal(a0)=objecttilex(a0)+v3*v1
						objectmoveygoal(a0)=objecttiley(a0)+v4*v2
						v3=2
						v4=2
					End If
					;v4=v4+1
				Next
				;v3=v3+1
			Next
		End If
	End If
	If objectcaged(a0)=1 Then
		turnobjecttowarddirection(a0,objecttilex(playerobject)-objecttilex(a0),objecttiley(playerobject)-objecttiley(a0),3,0)
		Return 0
	End If
	If objectsubtype(a0)=1 Then
		nofweestinkersfollowing=nofweestinkersfollowing+1
	End If
	If objectsubtype(a0)=0 Then
		EntityTexture objectentity(a0),stinkerweetexturesleep,0,0
	Else
		EntityTexture objectentity(a0),stinkerweetexture,0,0
	End If
	If objectmovementtimer(a0)>0 Then
		objectdata(a0,1)=0
		objectdata(a0,2)=0
		If objectflying(a0)/10=1 Then
			If objectcurrentanim(a0)<>8 Then
				AnimateMD2 objectentity(a0),1,0.4,161,180,1.0
				objectcurrentanim(a0)=8
			End If
			turnobjecttowarddirection(a0,objecttilex2(a0)-objecttilex(a0),objecttiley2(a0)-objecttiley(a0),4,0)
		Else If objectflying(a0)/10=2 Then
			If objectcurrentanim(a0)<>9 Then
				AnimateMD2 objectentity(a0),3,2.0,201,219,1.0
				objectcurrentanim(a0)=9
			End If
			objectyaw(a0)=objectyaw(a0)+4.0
		Else
			If objectcurrentanim(a0)<>6 Then
				AnimateMD2 objectentity(a0),1,0.4,21,40,1.0
				objectcurrentanim(a0)=6
			End If
			turnobjecttowarddirection(a0,objecttilex2(a0)-objecttilex(a0),objecttiley2(a0)-objecttiley(a0),4,0)
		End If
		objectdata(a0,1)=0
	Else If objectsubtype(a0)=3 Then
		AnimateMD2 objectentity(a0),3,0.2,201,217,1.0
		objectcurrentanim(a0)=7
		objectdata(a0,0)=0
		objectdata(a0,1)=0
		objectdata(a0,2)=4
		objectsubtype(a0)=2
		objectmovexgoal(a0)=objecttilex(a0)
		objectmoveygoal(a0)=objecttiley(a0)
	Else If objectdata(a0,2)<4 Then
		objectdata(a0,2)=objectdata(a0,2)+1
	Else If objectsubtype(a0)=0 Then
		objectdata(a0,2)=objectdata(a0,2)+1
		If objectdata(a0,2)>200 Then
			If Rand(0,100)<3 Then
				addparticle(9,objecttilex(a0)+0.5,0.9,(-objecttiley(a0))-0.5,0.0,0.5,0.0,0.01,0.0,0.0,0.001,0.0,0.0,0.0,200,3)
				objectdata(a0,2)=0
				playsoundfx(59,objecttilex(a0),objecttiley(a0))
			End If
		End If
		If objectcurrentanim(a0)<>1 Then
			AnimateMD2 objectentity(a0),1,Rnd(0.002,0.008),217,219,1.0
			objectcurrentanim(a0)=1
		End If
		If objectyaw(a0)<>180.0 Then
			turnobjecttowarddirection(a0,0.0,1.0,5,0)
		End If
	Else
		If objectcurrentanim(a0)<>7 Then
			turnobjecttowarddirection(a0,objecttilex(playerobject)-objecttilex(a0),objecttiley(playerobject)-objecttiley(a0),3,0)
		End If
		If (((objectcurrentanim(a0)<>3 And (objectcurrentanim(a0)<>4)) And (objectcurrentanim(a0)<>5)) And (objectcurrentanim(a0)<>7)) Then
			AnimateMD2 objectentity(a0),1,Rnd(0.01,0.08),141,160,1.0
			objectcurrentanim(a0)=3
			objectdata(a0,0)=0
		Else If objectcurrentanim(a0)=3 Then
			If (Rand(0,1000)<2 And (objectdata(a0,1)>100)) Then
				If Rand(0,100)<50 Then
					playsoundfx(Rand(50,54),objecttilex(a0),objecttiley(a0))
					AnimateMD2 objectentity(a0),3,0.2,101,120,1.0
					objectcurrentanim(a0)=4
				Else If objectsubtype(a0)=2 Then
					AnimateMD2 objectentity(a0),1,0.2,121,140,1.0
					objectcurrentanim(a0)=5
				End If
			End If
		Else If objectcurrentanim(a0)=4 Then
			objectdata(a0,0)=objectdata(a0,0)+1
			If objectdata(a0,0)>100 Then
				objectdata(a0,0)=0
				AnimateMD2 objectentity(a0),1,Rnd(0.01,0.03),141,160,1.0
				objectcurrentanim(a0)=3
			End If
		Else If objectcurrentanim(a0)=5 Then
			objectdata(a0,0)=objectdata(a0,0)+1
			If objectdata(a0,0)>1500 Then
				objectdata(a0,0)=0
				AnimateMD2 objectentity(a0),1,Rnd(0.01,0.03),141,160,1.0
				objectcurrentanim(a0)=3
			End If
		Else If objectcurrentanim(a0)=7 Then
			objectdata(a0,0)=objectdata(a0,0)+1
			If objectyaw(a0)<>180.0 Then
				turnobjecttowarddirection(a0,0.0,1.0,1,0)
			End If
			If objectdata(a0,0)>100 Then
				AnimateMD2 objectentity(a0),1,Rnd(0.002,0.008),217,219,1.0
				objectcurrentanim(a0)=1
				objectsubtype(a0)=0
			End If
		End If
		If objectsubtype(a0)=1 Then
			objectdata(a0,1)=objectdata(a0,1)+1
			If (objectdata(a0,1)>5000 And (leveltimer Mod 5000=0)) Then
				playsoundfx(68,objecttilex(a0),objecttiley(a0))
				objectdata(a0,1)=0
			End If
		End If
		If objectsubtype(a0)=2 Then
			objectdata(a0,1)=objectdata(a0,1)+1
			If objectdata(a0,1)>4800 Then
				playsoundfx(69,objecttilex(a0),objecttiley(a0))
				AnimateMD2 objectentity(a0),3,0.2,201,217,1.0
				objectcurrentanim(a0)=7
				objectdata(a0,0)=0
				objectdata(a0,1)=0
			End If
		End If
	End If
	If objectmovementtimer(a0)=0 Then
		If objectsubtype(a0)=1 Then
			objectmovexgoal(a0)=objecttilex(playerobject)
			objectmoveygoal(a0)=objecttiley(playerobject)
		End If
		If (objecttilelogic(objecttilex(a0),objecttiley(a0)) And (2))>0 Then
			If objectsubtype(a0)=0 Then
				playsoundfx(Rand(50,54),objecttilex(a0),objecttiley(a0))
			End If
			If objectsubtype(a0)=2 Then
				playsoundfx(64,objecttilex(a0),objecttiley(a0))
			End If
			objectsubtype(a0)=1
			objectmovementtype(a0)=14
			v5=0
			v1=1
			v2=1
			If Rand(0,100)<50 Then
				v1=-1
			End If
			If Rand(0,100)<50 Then
				v2=-1
			End If
			;v3=-1
			For v3=-1 To 1
				;v4=-1
				For v4=-1 To 1
					If canobjectmovetotile(a0,objecttilex(a0)+v3*v1,objecttiley(a0)+v4*v2,1,1)=1 Then
						moveobjecttotile(a0,objecttilex(a0)+v3*v1,objecttiley(a0)+v4*v2)
						v3=2
						v4=2
						v5=1
					End If
					;v4=v4+1
				Next
				;v3=v3+1
			Next
			If v5=0 Then
				v3=objecttilex(playerobject)
				v4=objecttiley(playerobject)
				If (((v3<>objecttilex(a0) Or (v4<>objecttiley(a0))) And (Abs(v3-objecttilex(a0))<=1)) And (Abs(v4-objecttiley(a0))<=1)) Then
					v6=1
					If (objecttilelogic(v3,v4) And (2))>0 Then
						objecttilelogic(v3,v4)=objecttilelogic(v3,v4)-2.0
						If canobjectmovetotile(a0,v3,v4,1,1)=1 Then
							moveobjecttotile(a0,v3,v4)
							v5=1
						End If
						objecttilelogic(v3,v4)=objecttilelogic(v3,v4)+2.0
					End If
				End If
			End If
			If v5=0 Then
			End If
		End If
	End If
End Function

Function controlstinkerweeexit(a0)
	
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	If leveltimer Mod 3=0 Then
		addparticle(Rand(16,23),objecttilex(a0)+0.5+0.2*Sin(leveltimer*10),0.0,((-objecttiley(a0))-0.5)-(0.2*Cos(leveltimer*10)),Rand(0,360),0.1,0.0,0.02,0.0,0.0,0.005,0.0,0.0,0.0,100,3)
	End If
	;v1=0
	For v1=0 To nofobjects-1
		If (((objectexists(v1)=1 And ((objecttype(v1)=120 Or (objecttype(v1)=400)))) And (objectmovementtimer(v1)=0)) And (objectsubtype(v1)=1)) Then
			If (Abs(objecttilex(v1)-objecttilex(a0))<=3 And (Abs(objecttiley(v1)-objecttiley(a0))<=3)) Then
				objectmovexgoal(v1)=objecttilex(a0)
				objectmoveygoal(v1)=objecttiley(a0)
				objectmovementtype(v1)=13
				objectsubtype(v1)=2
			End If
		End If
		;v1=v1+1
	Next
End Function

Function controlnpc(a0)
	
	If objectfrozen(a0)=1 Then
		objectfrozen(a0)=1000
		objectcurrentanim(a0)=11
		Animate GetChild(objectentity(a0),3),3,1.0,11,0.0
		playsoundfx(85,objectx(a0),objecty(a0))
	End If
	If objectfrozen(a0)=2 Then
		objectfrozen(a0)=0
		objectcurrentanim(a0)=10
		Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
	End If
	If objectfrozen(a0)>2 Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If objecttiletypecollision(a0)=0 Then
		objectdata10(a0)=-1
		objecttiletypecollision(a0)=23065
		objectobjecttypecollision(a0)=64
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
		objecttilex2(a0)=Floor(objectx(a0))
		objecttiley2(a0)=Floor(objecty(a0))
		If (objectmovexgoal(a0)=0 And (objectmoveygoal(a0)=0)) Then
			objectmovexgoal(a0)=Floor(objectx(a0))
			objectmoveygoal(a0)=Floor(objecty(a0))
			objectcurrentanim(a0)=10
		End If
	End If
	If objectactive(a0)=0 Then
		HideEntity objectentity(a0)
	Else
		ShowEntity objectentity(a0)
	End If
	v1=maximum2(Abs(objecttilex(a0)-objecttilex(playerobject)),Abs(objecttiley(a0)-objecttiley(playerobject)))
	If ((objectexclamation(a0)>=100 And (objectexclamation(a0)<200)) And (v1>4)) Then
		objectexclamation(a0)=objectexclamation(a0)-100
	End If
	If ((objectexclamation(a0)>=0 And (objectexclamation(a0)<100)) And (v1<4)) Then
		addparticle(objectexclamation(a0),objecttilex(a0)+0.5,1.3,(-objecttiley(a0))-0.5,0.0,0.5,0.0,0.0125,0.0,0.0,0.004,0.0,-0.0001,0.0,150,3)
		objectexclamation(a0)=objectexclamation(a0)+100
	End If
	If (((gamemode<>8 Or (dialogobject1<>a0)) And (objectlinked(a0)=-1)) And (objectdata10(a0)>=0)) Then
		objectmovexgoal(a0)=objectdata10(a0) Mod 200
		objectmoveygoal(a0)=objectdata10(a0)/200
		objectmovementtype(a0)=10
		objectdata10(a0)=-1
	End If
	If (gamemode=8 And (dialogobject1=a0)) Then
		If (objectcurrentanim(a0)<>10 And (objectdata(a0,8)<>7)) Then
			objectcurrentanim(a0)=10
			Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
		End If
	Else If objectmovementtype(a0)>0 Then
		If objectmovementtimer(a0)=0 Then
			objectdata(a0,9)=objectdata(a0,9)+1
		End If
		If objectmovementtimer(a0)>0 Then
			objectdata(a0,9)=0
		End If
		If objectdata(a0,9)>10 Then
			Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
			objectcurrentanim(a0)=10
			turnobjecttowarddirection(a0,-(objecttilex(a0)-objectmovexgoal(a0)),-(objecttiley(a0)-objectmoveygoal(a0)),4,-objectyawadjust(a0))
		Else
			If objectcurrentanim(a0)<>1 Then
				Animate GetChild(objectentity(a0),3),1,0.4,objectdata(a0,6)+1,0.0
				objectcurrentanim(a0)=1
			End If
			turnobjecttowarddirection(a0,-(objecttilex(a0)-objecttilex2(a0)),-(objecttiley(a0)-objecttiley2(a0)),4,-objectyawadjust(a0))
		End If
		If ((objectmovementtimer(a0)=0 And (objecttilex(a0)=objectmovexgoal(a0))) And (objecttiley(a0)=objectmoveygoal(a0))) Then
			objectmovementtype(a0)=0
			objectcurrentanim(a0)=10
			Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
		End If
	Else If objectflying(a0)/10=1 Then
		If objectcurrentanim(a0)<>11 Then
			Animate GetChild(objectentity(a0),3),1,1.0,11,0.0
			objectcurrentanim(a0)=11
		End If
		turnobjecttowarddirection(a0,-(objecttilex(a0)-objecttilex2(a0)),-(objecttiley(a0)-objecttiley2(a0)),10,-objectyawadjust(a0))
	Else If objectflying(a0)/10=2 Then
		If objectcurrentanim(a0)<>13 Then
			Animate GetChild(objectentity(a0),3),3,2.0,13,0.0
			objectcurrentanim(a0)=13
		End If
	Else
		Select objectdata(a0,7) Mod 10
		Case 0
			If objectyaw(a0)<>0.0 Then
				turnobjecttowarddirection(a0,0.0,1.0,4,0)
			End If
		Case 1
			turnobjecttowarddirection(a0,objectx(playerobject)-objectx(a0),objecty(playerobject)-objecty(a0),6,-objectyawadjust(a0))
		Case 2
			objectyaw(a0)=(objectyaw(a0)+0.5) Mod 360.0
		Case 3
			objectyaw(a0)=(objectyaw(a0)+2.0) Mod 360.0
		Case 4
			objectyaw(a0)=(objectyaw(a0)-0.5) Mod 360.0
		Case 5
			objectyaw(a0)=(objectyaw(a0)-2.0) Mod 360.0
		End Select
		If objectdata(a0,7)/10=1 Then
			objectz(a0)=0.4*Abs(Sin(leveltimer*3.6 Mod 360.0))
		Else If objectdata(a0,7)/10=2 Then
			objectz(a0)=0.2*Abs(Sin(leveltimer*7.2 Mod 360.0))
		End If
		Select objectdata(a0,8)
		Case 0
			If objectcurrentanim(a0)<>10 Then
				objectcurrentanim(a0)=10
				Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
			End If
		Case 1
			If objectcurrentanim(a0)=10 Then
				If (Rand(1,10)<5 And (leveltimer Mod 120=0)) Then
					objectcurrentanim(a0)=8
					Animate GetChild(objectentity(a0),3),3,0.2,8,0.0
				End If
			Else
				If Animating(GetChild(objectentity(a0),3))=0 Then
					objectcurrentanim(a0)=10
					Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
				End If
			End If
		Case 2
			If objectcurrentanim(a0)<>15 Then
				objectcurrentanim(a0)=15
				Animate GetChild(objectentity(a0),3),1,0.2,15,0.0
			End If
		Case 3
			If objectcurrentanim(a0)=10 Then
				If (Rand(1,10)<5 And (leveltimer Mod 240=0)) Then
					objectcurrentanim(a0)=9
					Animate GetChild(objectentity(a0),3),1,0.4,9,0.0
				End If
			Else If Rand(0,1000)<2 Then
				objectcurrentanim(a0)=10
				Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
			End If
		Case 4
			If objectcurrentanim(a0)<>9 Then
				objectcurrentanim(a0)=9
				Animate GetChild(objectentity(a0),3),1,0.2,9,0.0
			End If
		Case 5
			If objectcurrentanim(a0)<>12 Then
				objectcurrentanim(a0)=12
				If objectdata(a0,7)>=20 Then
					Animate GetChild(objectentity(a0),3),1,0.4,12,0.0
				Else
					Animate GetChild(objectentity(a0),3),1,0.2,12,0.0
				End If
			End If
		Case 6
			If objectcurrentanim(a0)<>14 Then
				objectcurrentanim(a0)=14
				Animate GetChild(objectentity(a0),3),3,0.2,14,0.0
			End If
		Case 7
			If (objectcurrentanim(a0)<>14 And (v1>3)) Then
				objectcurrentanim(a0)=14
				Animate GetChild(objectentity(a0),3),3,0.4,14,0.0
			End If
			If (objectcurrentanim(a0)<>114 And (v1<=3)) Then
				objectcurrentanim(a0)=114
				Animate GetChild(objectentity(a0),3),3,-0.4,14,0.0
			End If
		Case 8
			v1=maximum2(Abs(objecttilex(a0)-objecttilex(playerobject)),Abs(objecttiley(a0)-objecttiley(playerobject)))
			If (objectcurrentanim(a0)<>14 And (v1>3)) Then
				objectcurrentanim(a0)=14
				Animate GetChild(objectentity(a0),3),3,0.4,14,0.0
			End If
			If (objectcurrentanim(a0)<>114 And (v1<=3)) Then
				objectcurrentanim(a0)=114
				Animate GetChild(objectentity(a0),3),3,-0.4,14,0.0
			End If
			If (objectcurrentanim(a0)=114 And (Animating(GetChild(objectentity(a0),3))=0)) Then
				Animate GetChild(objectentity(a0),3),3,0.4,15,0.0
			End If
		Case 9
			If objectcurrentanim(a0)=10 Then
				If (Rand(1,10)<5 And (leveltimer Mod 240=0)) Then
					objectcurrentanim(a0)=11
					Animate GetChild(objectentity(a0),3),1,0.4,11,0.0
					If objectdata(a0,v4)<10 Then
						objectdata(a0,7)=objectdata(a0,7)+20
					End If
				End If
			Else If leveltimer Mod 120=0 Then
				objectcurrentanim(a0)=10
				Animate GetChild(objectentity(a0),3),1,0.05,10,0.0
				objectdata(a0,7)=objectdata(a0,7)-20
				objectz(a0)=0.0
			End If
		Case 10
			If objectcurrentanim(a0)<>11 Then
				objectcurrentanim(a0)=11
				If objectdata(a0,7)>=20 Then
					Animate GetChild(objectentity(a0),3),1,0.4,11,0.0
				Else
					Animate GetChild(objectentity(a0),3),1,0.2,11,0.0
				End If
			End If
		End Select
	End If
End Function

Function controlthwart(a0)
	
	If objectfrozen(a0)=1 Then
		objectfrozen(a0)=1000
		AnimateMD2 objectentity(a0),3,0.5,121,135,0.0
		playsoundfx(87,objectx(a0),objecty(a0))
	End If
	If objectfrozen(a0)=2 Then
		AnimateMD2 objectentity(a0),2,0.005,81,82,0.0
		objectcurrentanim(a0)=10
		objecttimer(a0)=objectdata(a0,7)
		objectfrozen(a0)=0
	End If
	If objectfrozen(a0)>2 Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If objecttiletypecollision(a0)=0 Then
		objectdata10(a0)=-1
		objecttiletypecollision(a0)=23065
		objectobjecttypecollision(a0)=80
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
		objecttilex2(a0)=Floor(objectx(a0))
		objecttiley2(a0)=Floor(objecty(a0))
		If (objectmovexgoal(a0)=0 And (objectmoveygoal(a0)=0)) Then
			objectmovexgoal(a0)=Floor(objectx(a0))
			objectmoveygoal(a0)=Floor(objecty(a0))
			AnimateMD2 objectentity(a0),2,0.005,81,82,0.0
			objectcurrentanim(a0)=10
		End If
	End If
	If objectdata(a0,2)>0 Then
		EntityTexture objectentity(a0),thwarttexture(objectdata(a0,2) Mod 8),0,0
	End If
	If objectactive(a0)=0 Then
		HideEntity objectentity(a0)
	Else
		ShowEntity objectentity(a0)
	End If
	v1=maximum2(Abs(objecttilex(a0)-objecttilex(playerobject)),Abs(objecttiley(a0)-objecttiley(playerobject)))
	If (((gamemode<>8 Or (dialogobject1<>a0)) And (objectlinked(a0)=-1)) And (objectdata10(a0)>=0)) Then
		objectmovexgoal(a0)=objectdata10(a0) Mod 200
		objectmoveygoal(a0)=objectdata10(a0)/200
		objectmovementtype(a0)=10
		objectdata10(a0)=-1
	End If
	If (gamemode=8 And (dialogobject1=a0)) Then
		If (objectcurrentanim(a0)<>10 And (objectdata(a0,8)<>7)) Then
			objectcurrentanim(a0)=10
		End If
	Else If objectmovementtype(a0)>0 Then
		If objectmovementtimer(a0)=0 Then
			objectdata(a0,9)=objectdata(a0,9)+1
		End If
		If objectmovementtimer(a0)>0 Then
			objectdata(a0,9)=0
		End If
		If objectdata(a0,9)>10 Then
			AnimateMD2 objectentity(a0),2,0.005,81,82,0.0
			objectcurrentanim(a0)=10
			turnobjecttowarddirection(a0,objecttilex(a0)-objectmovexgoal(a0),objecttiley(a0)-objectmoveygoal(a0),4,-objectyawadjust(a0))
		Else
			If objectcurrentanim(a0)<>1 Then
				If objectdata(a0,1)=1 Then
					AnimateMD2 objectentity(a0),2,1.0,41,80,0.0
				Else
					AnimateMD2 objectentity(a0),2,1.0,1,40,0.0
				End If
				objectcurrentanim(a0)=1
			End If
			turnobjecttowarddirection(a0,objecttilex(a0)-objecttilex2(a0),objecttiley(a0)-objecttiley2(a0),4,-objectyawadjust(a0))
		End If
		If ((objectmovementtimer(a0)=0 And (objecttilex(a0)=objectmovexgoal(a0))) And (objecttiley(a0)=objectmoveygoal(a0))) Then
			objectmovementtype(a0)=0
			objectcurrentanim(a0)=10
			AnimateMD2 objectentity(a0),2,0.005,81,82,0.0
		End If
	Else If objectflying(a0)/10=1 Then
		If objectcurrentanim(a0)<>11 Then
			objectcurrentanim(a0)=11
		End If
		turnobjecttowarddirection(a0,objecttilex(a0)-objecttilex2(a0),objecttiley(a0)-objecttiley2(a0),10,-objectyawadjust(a0))
	Else If objectflying(a0)/10=2 Then
		If objectcurrentanim(a0)<>13 Then
			objectcurrentanim(a0)=13
		End If
	Else
		If (objecttype(playerobject)=1 And (playerobject<nofobjects)) Then
			turnobjecttowarddirection(a0,-objectx(playerobject)+objectx(a0),-objecty(playerobject)+objecty(a0),6,-objectyawadjust(a0))
		Else If objectstatus(a0)=0 Then
			objectyaw(a0)=objectyaw(a0)+180.0
			objectstatus(a0)=1
		End If
		If objectdata(a0,6)>0 Then
			v2#=objectx(playerobject)-objectx(a0)
			v3#=objecty(playerobject)-objecty(a0)
			v4#=Sqr(v2#^2.0+v3#^2.0)
			v2#=v2#/v4#
			v3#=v3#/v4#
			objecttimer(a0)=objecttimer(a0)-1
			If objecttimer(a0)<0 Then
				If objecttimer(a0)=-10 Then
					objectdata(a0,4)=v2#*10000.0
					objectdata(a0,5)=v3#*10000.0
				End If
				If objecttimer(a0)=-1 Then
					AnimateMD2 objectentity(a0),3,1.0,81,120,1.0
				End If
				If objecttimer(a0)=-40 Then
					objecttimer(a0)=objectdata(a0,7)
				End If
				If objecttimer(a0)=-30 Then
					v2#=objectdata(a0,4)/10000.0
					v3#=objectdata(a0,5)/10000.0
					createspellball(objecttilex(a0)+0.5+0.6*v2#,objecttiley(a0)+0.5+0.6*v3#,1.1,0.1*v2#,0.1*v3#,1,-1,-1,0,300)
					playsoundfx(103,objecttilex(a0),objecttiley(a0))
				End If
			End If
		End If
	End If
	If (objecttilelogic(objecttilex(a0),objecttiley(a0)) And (16))>0 Then
		;v5=0
		For v5=0 To nofobjects-1
			If (objecttype(v5)/10=17 And (objectactive(v5)=1001)) Then
				If (objecttilex(v5)=objecttilex(a0) And (objecttiley(v5)=objecttiley(a0))) Then
					playsoundfx(107,objectx(a0),objecty(a0))
					objecttilelogic(objecttilex(a0),objecttiley(a0))=objecttilelogic(objecttilex(a0),objecttiley(a0))-16.0
					objectactivationtype(v5)=0
					objectactivationspeed(v5)=20
					deactivateobject(v5)
				End If
			End If
			;v5=v5+1
		Next
	End If
	If (objectmovementtimer(a0)>0 And (objectdata(a0,3)=0)) Then
		playsoundfx(106,objectx(a0),objecty(a0))
	End If
	objectdata(a0,3)=objectmovementtimer(a0)
End Function

Function controlwisp(a0)
	
	If objecttiletypecollision(a0)=0 Then
		objecttiletypecollision(a0)=24093
		objectobjecttypecollision(a0)=320
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
		objecttilex2(a0)=Floor(objectx(a0))
		objecttiley2(a0)=Floor(objecty(a0))
		objectmovexgoal(a0)=Floor(objectx(a0))
		objectmoveygoal(a0)=Floor(objecty(a0))
		objectmovementtype(a0)=10
		objectmovementspeed(a0)=45
		objectstatus(a0)=0
	End If
	EntityFX objectentity(a0),1
	If (((gamemode<>8 Or (dialogobject1<>a0)) And (objectlinked(a0)=-1)) And (objectdata10(a0)>=0)) Then
		objectmovexgoal(a0)=objectdata10(a0) Mod 200
		objectmoveygoal(a0)=objectdata10(a0)/200
		objectmovementtype(a0)=10
		objectdata10(a0)=-1
	End If
	If leveltimer Mod 360=0 Then
		v1=Rand(0,100)
		If v1<60 Then
			objectstatus(a0)=0
		Else If v1<80 Then
			objectstatus(a0)=1
		Else If v1<90 Then
			objectstatus(a0)=2
		Else
			objectstatus(a0)=3
		End If
	End If
	If objectstatus(a0)=0 Then
		objectz(a0)=0.6+Sin(leveltimer Mod 360)*0.1
		objectyaw(a0)=30.0*Sin(leveltimer*4 Mod 360)
		objectroll(a0)=20.0*Sin(leveltimer*2 Mod 360)
	Else If objectstatus(a0)=1 Then
		objectz(a0)=0.6+Sin(leveltimer Mod 360)*0.1
		objectyaw(a0)=180.0*Sin(leveltimer Mod 360)
		objectroll(a0)=20.0*Sin(leveltimer*2 Mod 360)
	Else If objectstatus(a0)=2 Then
		objectz(a0)=0.6+Sin(leveltimer Mod 360)*0.1
		objectyaw(a0)=360.0*Sin(leveltimer/2 Mod 360)
		objectroll(a0)=180.0*Sin(leveltimer*2 Mod 360)
	Else If objectstatus(a0)=3 Then
		objectz(a0)=0.6+Sin(leveltimer Mod 180)*0.4
		objectyaw(a0)=60.0*Sin(leveltimer*4 Mod 360)
		objectroll(a0)=20.0*Sin(leveltimer*2 Mod 360)
	End If
	If (Rand(0,100)<3 And (objectactive(a0)=1001)) Then
		addparticle(Rand(16,23),objecttilex(a0)+0.5,0.7,(-objecttiley(a0))-0.5,Rand(0,360),0.16,Rnd(-0.015,0.015),0.03,Rnd(-0.015,0.015),0.0,0.001,0.0,-0.00025,0.0,100,3)
	End If
End Function

Function createcolourgatemesh(a0,a1)
	
	v1=CreateMesh(0)
	v2=CreateSurface(v1,0)
	AddVertex(v2,-0.496,1.04,0.496,a0*0.25+0.01,0.26,1.0)
	AddVertex(v2,0.496,1.04,0.496,a0*0.25+0.24,0.26,1.0)
	AddVertex(v2,-0.496,1.04,-0.496,a0*0.25+0.01,0.49,1.0)
	AddVertex(v2,0.496,1.04,-0.496,a0*0.25+0.24,0.49,1.0)
	AddTriangle(v2,0,1,2)
	AddTriangle(v2,1,3,2)
	AddVertex(v2,-0.25,1.08,0.25,a1 Mod 8*0.125+0.01,a1/8*0.125+0.51,1.0)
	AddVertex(v2,0.25,1.08,0.25,a1 Mod 8*0.125+0.115,a1/8*0.125+0.51,1.0)
	AddVertex(v2,-0.25,1.08,-0.25,a1 Mod 8*0.125+0.01,a1/8*0.125+0.51+0.115,1.0)
	AddVertex(v2,0.25,1.08,-0.25,a1 Mod 8*0.125+0.115,a1/8*0.125+0.51+0.115,1.0)
	AddTriangle(v2,4,5,6)
	AddTriangle(v2,5,7,6)
	;v3=0
	For v3=0 To 3
		Select v3
		Case 0
			v5#=-0.49
			v6#=0.49
			v7#=-0.49
			v8#=-0.49
		Case 1
			v5#=0.49
			v6#=0.49
			v7#=-0.49
			v8#=0.49
		Case 2
			v5#=0.49
			v6#=-0.49
			v7#=0.49
			v8#=0.49
		Case 3
			v5#=-0.49
			v6#=-0.49
			v7#=0.49
			v8#=-0.49
		End Select
		AddVertex(v2,v5#,1.04,v7#,a0*0.25+0.01,0.01,1.0)
		AddVertex(v2,v6#,1.04,v8#,a0*0.25+0.24,0.01,1.0)
		AddVertex(v2,v5#,0.0,v7#,a0*0.25+0.01,0.24,1.0)
		AddVertex(v2,v6#,0.0,v8#,a0*0.25+0.24,0.24,1.0)
		AddTriangle(v2,v3*8+8,v3*8+9,v3*8+10)
		AddTriangle(v2,v3*8+9,v3*8+11,v3*8+10)
		AddVertex(v2,v5#*1.01,0.8,v7#*1.01,a1 Mod 8*0.125+0.01,a1/8*0.125+0.51,1.0)
		AddVertex(v2,v6#*1.01,0.8,v8#*1.01,a1 Mod 8*0.125+0.115,a1/8*0.125+0.51,1.0)
		AddVertex(v2,v5#*1.01,0.6,v7#*1.01,a1 Mod 8*0.125+0.01,a1/8*0.125+0.51+0.115,1.0)
		AddVertex(v2,v6#*1.01,0.6,v8#*1.01,a1 Mod 8*0.125+0.115,a1/8*0.125+0.51+0.115,1.0)
		AddTriangle(v2,v3*8+12,v3*8+13,v3*8+14)
		AddTriangle(v2,v3*8+13,v3*8+15,v3*8+14)
		;v3=v3+1
	Next
	UpdateNormals v1
	EntityTexture v1,gatetexture,0,0
	Return v1
End Function

Function redogatetexture(a0)
	
	v1=GetSurface(objectentity(a0),1)
	v2=(objectid(a0)-500)/5
	;v3=0
	For v3=0 To 4
		VertexTexCoords v1,v3*8+4,v2 Mod 8*0.125+0.01,v2/8*0.125+0.51,1.0,0
		VertexTexCoords v1,v3*8+5,v2 Mod 8*0.125+0.115,v2/8*0.125+0.51,1.0,0
		VertexTexCoords v1,v3*8+6,v2 Mod 8*0.125+0.01,v2/8*0.125+0.51+0.115,1.0,0
		VertexTexCoords v1,v3*8+7,v2 Mod 8*0.125+0.115,v2/8*0.125+0.51+0.115,1.0,0
		;v3=v3+1
	Next
	UpdateNormals objectentity(a0)
End Function

Function controlgate(a0)
	
	If objectid(a0)=-1 Then
		objectid(a0)=objectdata(a0,0)*5+500+objectdata(a0,1)
	End If
	If (objectsubtype(a0)=1 And (objectyawadjust(a0)=90.0)) Then
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))-1.0
	Else If (objectsubtype(a0)=1 And (objectyawadjust(a0)=315.0)) Then
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))+1.0
	Else If (objectsubtype(a0)=1 And (objectyawadjust(a0)=45.0)) Then
		objecttilex(a0)=Floor(objectx(a0))+1.0
		objecttiley(a0)=Floor(objecty(a0))
	Else If (objectsubtype(a0)=2 And (objectyawadjust(a0)=0.0)) Then
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))-1.0
	Else If (objectsubtype(a0)=2 And (objectyawadjust(a0)=90.0)) Then
		objecttilex(a0)=Floor(objectx(a0))-1.0
		objecttiley(a0)=Floor(objecty(a0))-1.0
	Else If (objectsubtype(a0)=2 And (objectyawadjust(a0)=180.0)) Then
		objecttilex(a0)=Floor(objectx(a0))-1.0
		objecttiley(a0)=Floor(objecty(a0))
	Else If (objectsubtype(a0)=3 And (objectyawadjust(a0)=90.0)) Then
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))-1.0
	Else If (objectsubtype(a0)=3 And (objectyawadjust(a0)=315.0)) Then
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))+1.0
	Else If (objectsubtype(a0)=3 And (objectyawadjust(a0)=45.0)) Then
		objecttilex(a0)=Floor(objectx(a0))+1.0
		objecttiley(a0)=Floor(objecty(a0))
	Else If (objectsubtype(a0)=4 And (objectyawadjust(a0)=90.0)) Then
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))-1.0
	Else If (objectsubtype(a0)=4 And (objectyawadjust(a0)=315.0)) Then
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))+1.0
	Else If (objectsubtype(a0)=4 And (objectyawadjust(a0)=45.0)) Then
		objecttilex(a0)=Floor(objectx(a0))+1.0
		objecttiley(a0)=Floor(objecty(a0))+1.0
	Else
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
	End If
	If objectactive(a0)<objectactivationspeed(a0)*4 Then
		If leveltilelogic(objecttilex(a0),objecttiley(a0))<>0 Then
			leveltilelogic(objecttilex(a0),objecttiley(a0))=0
		End If
	Else If leveltilelogic(objecttilex(a0),objecttiley(a0))<>1 Then
		leveltilelogic(objecttilex(a0),objecttiley(a0))=1
	End If
	If ((objectlastactive(a0) Mod 2=0 And (objectlastactive(a0)>0)) And (objectactive(a0) Mod 2=1)) Then
		If objectsubtype(a0)=0 Then
			playsoundfx(36,objecttilex(a0),objecttiley(a0))
		Else
			playsoundfx(37,objecttilex(a0),objecttiley(a0))
		End If
	End If
	If (objectlastactive(a0) Mod 2=1 And (objectactive(a0) Mod 2=0)) Then
		If objectsubtype(a0)=0 Then
			playsoundfx(35,objecttilex(a0),objecttiley(a0))
		Else
			playsoundfx(37,objecttilex(a0),objecttiley(a0))
		End If
	End If
End Function

Function controlstargate(a0)
	
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	If objectdata(a0,0)<0 Then
		objectdata(a0,0)=playerstars-objectdata(a0,0)
	End If
	If objectactive(a0)=0 Then
		leveltilelogic(objecttilex(a0),objecttiley(a0))=0
		Return 0
	Else
		leveltilelogic(objecttilex(a0),objecttiley(a0))=1
	End If
	If (objectactive(a0)=1001 And (objecttype(a0)<>426)) Then
		If (Abs(objecttilex(a0)-objecttilex(playerobject))<=1 And (Abs(objecttiley(a0)-objecttiley(playerobject))<=1)) Then
			If objectdata(a0,1)=0 Then
				If playerstars>=objectdata(a0,0) Then
					deactivateobject(a0)
					playsoundfx(1,-1,-1)
				Else
					messagelinetimer=30
					messagelinetext1="This StarGate will open once you"
					messagelinetext2="have earned "+objectdata(a0,0)+" stars."
				End If
			Else If playercoins>=objectdata(a0,0) Then
				deactivateobject(a0)
				playsoundfx(1,-1,-1)
				playercoins=playercoins-objectdata(a0,0)
			Else
				messagelinetimer=30
				messagelinetext1="This TollGate will open at the"
				messagelinetext2="cost of "+objectdata(a0,0)+" coins."
			End If
		End If
	End If
End Function

Function controlcage(a0)
	
	If objectid(a0)=-1 Then
		objectid(a0)=objectdata(a0,0)*5+500+objectdata(a0,1)
	End If
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	If (objectactive(a0) Mod 2=1 Or (objectactive(a0)=0)) Then
		v1=1
		;v2=0
		For v2=0 To nofobjects-1
			If ((objecttype(v2)=90 And (objectsubtype(v2)=1)) And (objectstatus(v2)=1)) Then
				;v3=0
				For v3=0 To 3
					If (objectexists(v2)=1 And (objectid(a0)=(objectdata(v2,v3)-16)*5+500+objectdata(v2,v3+4))) Then
						v1=0
					End If
					;v3=v3+1
				Next
			End If
			;v2=v2+1
		Next
		If v1=1 Then
			;v3=0
			For v3=0 To nofobjects-1
				If ((((a0<>v3 And (objectmovementtimer(v3)=0)) And (objectexists(v3)=1)) And (objectcaged(v3)=0)) And (objecttype(v3)<>50)) Then
					If ((objecttilex(v3)=objecttilex(a0) And (objecttiley(v3)=objecttiley(a0))) And (objectflying(v3)/10<>1)) Then
						activateobject(a0)
						objectcaged(v3)=1
						playsoundfx(32,objecttilex(a0),objecttiley(a0))
					End If
				End If
				;v3=v3+1
			Next
		End If
	End If
	If (objectactive(a0) Mod 2=0 And (((objectactive(a0)<=100 And (objectlastactive(a0)>100)) Or (objectlastactive(a0) Mod 2=1)))) Then
		;v3=0
		For v3=0 To nofobjects-1
			If ((a0<>v3 And (objectexists(v3)=1)) And (objectcaged(v3)=1)) Then
				If (objecttilex(v3)=objecttilex(a0) And (objecttiley(v3)=objecttiley(a0))) Then
					objectcaged(v3)=0
				End If
			End If
			;v3=v3+1
		Next
	End If
	If objectactive(a0)=0 Then
		leveltilelogic(objecttilex(a0),objecttiley(a0))=0
	Else
		leveltilelogic(objecttilex(a0),objecttiley(a0))=8
	End If
End Function

Function controlscritter(a0)
	
	If objectfrozen(a0)=1 Then
		objectfrozen(a0)=1000
		objectpitch(a0)=Rand(-30,30)
		objectroll(a0)=Rand(-30,30)
		objectz(a0)=0.3
	End If
	If objectfrozen(a0)=2 Then
		objectfrozen(a0)=0
		objectpitch(a0)=0.0
		objectroll(a0)=0.0
		objectz(a0)=0.0
	End If
	If objectfrozen(a0)>2 Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If (objectcaged(a0)=1 And (objectsubtype(a0)=0)) Then
		objectsubtype(a0)=1
		nofscrittersinadventure=nofscrittersinadventure-1
		playsoundfx(101,objecttilex(a0),objecttiley(a0))
		addparticle(14,objecttilex(a0)+0.5,1.6,(-objecttiley(a0))-0.5,0.0,1.0,0.0,0.01,0.0,0.0,0.01,0.0,0.0,0.0,50,3)
		playerscore=playerscore+100
		currentadventurescore=currentadventurescore+100
	End If
	If (objectcaged(a0)=0 And (objectsubtype(a0)=1)) Then
		objectsubtype(a0)=0
		nofscrittersinadventure=nofscrittersinadventure+1
		playerscore=playerscore-100
		currentadventurescore=currentadventurescore-100
		If objectmovementtimer(a0)=0 Then
			v1=1
			v2=1
			If Rand(0,100)<50 Then
				v1=-1
			End If
			If Rand(0,100)<50 Then
				v2=-1
			End If
			;v3=-1
			For v3=-1 To 1
				;v4=-1
				For v4=-1 To 1
					If canobjectmovetotile(a0,objecttilex(a0)+v3*v1,objecttiley(a0)+v4*v2,1,1)=1 Then
						moveobjecttotile(a0,objecttilex(a0)+v3*v1,objecttiley(a0)+v4*v2)
						playsoundfx(100,objecttilex(a0),objecttiley(a0))
						objectmovexgoal(a0)=objecttilex(a0)+v3*v1
						objectmoveygoal(a0)=objecttiley(a0)+v4*v2
						v3=2
						v4=2
					End If
					;v4=v4+1
				Next
				;v3=v3+1
			Next
		End If
	End If
	If objecttiletypecollision(a0)=0 Then
		objecttiletypecollision(a0)=24089
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
		objecttilex2(a0)=Floor(objectx(a0))
		objecttiley2(a0)=Floor(objecty(a0))
		objectmovementtimer(a0)=0
		objectmovementspeed(a0)=50
		objectobjecttypecollision(a0)=64
	End If
	If objectmovementtimer(a0)>0 Then
		objectz(a0)=0.4*Abs(Sin(objectmovementtimer(a0)*360/1000))
		turnobjecttowarddirection(a0,objecttilex2(a0)-objecttilex(a0),objecttiley2(a0)-objecttiley(a0),10,0)
	Else
		turnobjecttowarddirection(a0,objecttilex(playerobject)-objecttilex(a0),objecttiley(playerobject)-objecttiley(a0),6,0)
	End If
End Function

Function controltrap(a0)
	
	If objectid(a0)=-1 Then
		objectid(a0)=objectdata(a0,0)*5+500+objectdata(a0,1)
	End If
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	objectz(a0)=0.04
	If objectactive(a0)=1001 Then
		If objectstatus(a0)=0 Then
			objecttimer(a0)=objecttimer(a0)-1
			If objecttimer(a0)<=0 Then
				playsoundfx(30,objecttilex(a0),objecttiley(a0))
				objecttimer(a0)=objecttimermax1(a0)
				objectstatus(a0)=1
			End If
		Else
			objecttimer(a0)=objecttimer(a0)-1
			If leveltimer Mod 50=0 Then
				playsoundfx(31,objecttilex(a0),objecttiley(a0))
			End If
			If objecttimer(a0)<=0 Then
				objecttimer(a0)=objecttimermax2(a0)
				objectstatus(a0)=0
			End If
		End If
		v1=0
		If (objectstatus(a0)=1 And (v1=0)) Then
			;v2=0
			For v2=0 To nofobjects-1
				If v2<>a0 Then
					If (objectactive(v2)=1001 And (((objecttype(v2)=1 Or (objecttype(v2)=120)) Or (objecttype(v2)=150)))) Then
						If (((objectmovementtimer(v2)>objectmovementspeed(v2)/2 And (objecttilex(a0)=objecttilex(v2))) And (objecttiley(a0)=objecttiley(v2))) Or (((objectmovementtimer(v2)<=objectmovementspeed(v2)/2 And (objecttilex(a0)=objecttilex2(v2))) And (objecttiley(a0)=objecttiley2(v2))))) Then
							destroyobject(v2,1)
						End If
					End If
				End If
				;v2=v2+1
			Next
		End If
		Select objectsubtype(a0)
		Case 0
			If objectstatus(a0)=1 Then
				If v1=0 Then
					If Rand(0,100)<50 Then
						addparticle(2,objectx(a0)+Rnd(-0.1,0.1),objectzadjust(a0),-objecty(a0),0.0-Rnd(-0.1,0.1),0.5,Rnd(-0.005,0.005),0.05,Rnd(-0.005,0.005),0,.01,0,-.0001,0,50,0)
					End If
				Else If Rand(0,100)<5 Then
					addparticle(0,objectx(a0)+Rnd(-0.1,0.1),objectzadjust(a0),-objecty(a0),0.0-Rnd(-0.1,0.1),0.3,Rnd(-0.005,0.005),0.02,Rnd(-0.005,0.005),0,.01,0,-.0001,0,50,0)
				End If
			End If
		End Select
	Else If Rand(0,100)<2 Then
		addparticle(0,objectx(a0)+Rnd(-0.1,0.1),objectzadjust(a0),-objecty(a0),0.0-Rnd(-0.1,0.1),0.3,Rnd(-0.005,0.005),0.02,Rnd(-0.005,0.005),0,.01,0,-.0001,0,50,0)
	End If
End Function

Function controlsteppingstone(a0)
	
	If objectid(a0)=-1 Then
		objectid(a0)=(objectdata(a0,0)+8)*5+500+objectdata(a0,1)
	End If
	v1=Floor(objectx(a0))
	v2=Floor(objecty(a0))
	objecttilex(a0)=v1
	objecttiley(a0)=v2
	If objectdata(a0,2)=1 Then
		v3=0
		;v4=0
		For v4=0 To nofobjects-1
			If ((objectexists(v4)=1 And (objectbuttonpush(v4)=1)) And (a0<>v4)) Then
				If (((objecttilex(v4)=objecttilex(a0) And (objecttiley(v4)=objecttiley(a0))) And (objectmovementtimer(v4)<500)) Or (((objecttilex2(v4)=objecttilex(a0) And (objecttiley2(v4)=objecttiley(a0))) And (objectmovementtimer(v4)>=500)))) Then
					If objectflying(v4)/10<>1 Then
						v3=1
					End If
				End If
			End If
			;v4=v4+1
		Next
		If objectstatus(a0)=1 Then
			If v3=0 Then
				objectstatus(a0)=0
				deactivateobject(a0)
			End If
		Else If v3=1 Then
			objectstatus(a0)=1
		End If
	End If
	If objectdata(a0,2)=2 Then
		objecttimer(a0)=objecttimer(a0)-1
		If objecttimer(a0)<0 Then
			objecttimer(a0)=objecttimermax1(a0)
		End If
		If objecttimer(a0)=0 Then
			toggleobject(a0)
			objecttimer(a0)=objecttimermax1(a0)
		End If
	End If
	If (objectactive(a0)<1001-(objectactivationspeed(a0)*4) And (objectlastactive(a0)>=1001-(objectactivationspeed(a0)*4))) Then
		If objectdata(a0,3)=0 Then
			playsoundfx(34,objectx(a0),objecty(a0))
			leveltilelogic(v1,v2)=2
			addparticle(4,Floor(objectx(a0))+0.5,-0.4,(-Floor(objecty(a0)))-0.5,0.0,0.6,0.0,0.0,0.0,0.0,0.006,0.0,0.0,0.0,50,4)
		Else If objectdata(a0,3)=1 Then
			playsoundfx(35,objectx(a0),objecty(a0))
			leveltilelogic(v1,v2)=2
		Else If objectdata(a0,3)=2 Then
			playsoundfx(90,objectx(a0),objecty(a0))
			leveltilelogic(v1,v2)=2
		End If
	End If
	If (objectactive(a0)>=1001-(objectactivationspeed(a0)*4) And (objectlastactive(a0)<1001-(objectactivationspeed(a0)*4))) Then
		If objectdata(a0,3)=0 Then
			playsoundfx(33,objectx(a0),objecty(a0))
			leveltilelogic(v1,v2)=4
			addparticle(4,Floor(objectx(a0))+0.5,-0.4,(-Floor(objecty(a0)))-0.5,0.0,1.0,0.0,0.0,0.0,0.0,0.006,0.0,0.0,0.0,100,4)
		Else If objectdata(a0,3)=1 Then
			playsoundfx(36,objectx(a0),objecty(a0))
			leveltilelogic(v1,v2)=4
		Else If objectdata(a0,3)=2 Then
			playsoundfx(91,objectx(a0),objecty(a0))
			leveltilelogic(v1,v2)=4
		End If
		;v4=0
		For v4=0 To nofobjects-1
			If (objecttype(v4)=210 Or (objecttype(v4)=300)) Then
				If ((objecttilex(v4)=objecttilex(a0) And (objecttiley(v4)=objecttiley(a0))) Or ((objecttilex2(v4)=objecttilex(a0) And (objecttiley2(v4)=objecttiley(a0))))) Then
					destroyobject(v4,0)
				End If
			End If
			;v4=v4+1
		Next
	End If
End Function

Function createteleportermesh(a0)
	
	v1=CreateCylinder(16,0,0)
	PositionMesh v1,0.0,1.0,0.0
	ScaleMesh v1,0.4,2.0,0.4
	EntityAlpha v1,0.6
	EntityBlend v1,3
	EntityFX v1,2
	;v2=0
	For v2=0 To 16
		VertexColor GetSurface(v1,1),v2*2,0.0,0.0,0.0,1.0
		;v2=v2+1
	Next
	If teleportertexture(a0)>0 Then
		EntityTexture v1,teleportertexture(a0),0,0
	Else
		EntityTexture v1,teleportertexture(0),0,0
	End If
	Return v1
End Function

Function controlteleporter(a0)
	
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	If objectid(a0)=-1 Then
		objectid(a0)=objectdata(a0,0)*5+500+objectdata(a0,1)
	End If
	If (Rand(0,100)<5 And (objectactive(a0)>0)) Then
		v1=Rand(0,360)
		v2#=Rnd(0.002,0.006)
		addparticle(23,objectx(a0)+0.5*Sin(v1),0.0,(-objecty(a0))-(0.5*Cos(v1)),0.0,0.2,v2#*Sin(v1),0.015,(-v2#)*Cos(v1),1.0,0.0,0.0,0.0,0.0,150,3)
	End If
	objectyaw(a0)=objectyaw(a0)+0.5
	If objectid(a0) Mod 5<3 Then
		ScaleEntity objectentity(a0),1.0,objectactive(a0)/1001.0,1.0,0
	Else If objectid(a0) Mod 5=3 Then
		objectyaw(a0)=objectyaw(a0)+4.5
		objectxscale(a0)=0.6+Sin(leveltimer/7 Mod 360)*0.4
		objectzscale(a0)=objectactive(a0)/1001.0
		objectyscale(a0)=0.6+Cos(leveltimer/2 Mod 360)*0.4
	Else
		objectyaw(a0)=objectyaw(a0)+9.5
		objectxscale(a0)=0.6+Sin(leveltimer Mod 360)*0.4
		objectzscale(a0)=objectactive(a0)/1001.0
		objectyscale(a0)=0.6+Sin(leveltimer Mod 360)*0.4
	End If
	If (objectactive(a0)>0 And (objectlastactive(a0)=0)) Then
		playsoundfx(90,objecttilex(a0),objecttiley(a0))
	End If
	If (objectactive(a0)=1001 And (objectlastactive(a0)<1001)) Then
		leveltilelogic(objecttilex(a0),objecttiley(a0))=3
	End If
	If (objectactive(a0)<1001 And (objectlastactive(a0)=1001)) Then
		leveltilelogic(objecttilex(a0),objecttiley(a0))=0
		playsoundfx(91,objecttilex(a0),objecttiley(a0))
	End If
End Function

Function createuseditem(a0,a1,a2)
	
	v1=createnewobject()
	objectx(v1)=a0+0.5
	objecty(v1)=a1+0.5
	objectz(v1)=2.0
	objectmodelname(v1)="!Item"
	objecttexturename(v1)="models\icons-standard.bmp"
	objectentity(v1)=createpickupitemmesh(a2)
	EntityTexture objectentity(v1),icontexturestandard,0,0
	objecttype(v1)=71
	objectid(v1)=-1
	objecttimer(v1)=120
End Function

Function controluseditem(a0)
	
	objectyaw(a0)=(objectyaw(a0)+10.0) Mod 360.0
	If objecttimer(a0)=120 Then
		;v1=0
		For v1=0 To 29
			v2=Rand(0,360)
			addparticle(23,objectx(a0)+1.8*Sin(v2),objectz(a0),(-objecty(a0))-(1.8*Cos(v2)),0.0,0.4,(-0.06)*Sin(v2),0.0,0.06*Cos(v2),5.0,0.0,0.0,0.0,0.0,30,3)
			;v1=v1+1
		Next
	End If
	objecttimer(a0)=objecttimer(a0)-1
	If objecttimer(a0)<=0 Then
		destroyobject(a0,0)
	End If
End Function

Function createbuttonmesh(a0,a1,a2,a3,a4,a5)
	
	If (a1=11 Or (a1>=32)) Then
		objectentity(a0)=CreatePivot(0)
		Return 0
	End If
	If a1=13 Then
		If adventurecompleted(objectdata(a0,0))=1 Then
			objectsubtype(a0)=14
			a1=14
		End If
	End If
	If (a1>=5 And (a1<10)) Then
		a4=a2
		a5=a3
	End If
	If (a1=16 Or (a1=17)) Then
		a3=a2
		a4=a2
		a5=a2
	End If
	objectentity(a0)=CreateMesh(0)
	v1=CreateSurface(objectentity(a0),0)
	AddVertex(v1,-0.45,0.06,0.45,a1 Mod 8*0.125,a1/8*0.125,1.0)
	AddVertex(v1,0.45,0.06,0.45,a1 Mod 8*0.125+0.125,a1/8*0.125,1.0)
	AddVertex(v1,-0.45,0.06,-0.45,a1 Mod 8*0.125,a1/8*0.125+0.125,1.0)
	AddVertex(v1,0.45,0.06,-0.45,a1 Mod 8*0.125+0.125,a1/8*0.125+0.125,1.0)
	AddTriangle(v1,0,1,2)
	AddTriangle(v1,1,3,2)
	If (a1<10 Or (a1>14)) Then
		Select a1
		Case 0,5
			v3#=0.01
			v4#=0.4
			v5=1
		Case 1,6,16,17
			v3#=0.01
			v4#=0.3
			v5=1
		Case 2,3,7,8
			v3#=0.01
			v4#=0.4
			v5=0
		Case 4,9
			v3#=0.01
			v4#=0.28
			v5=1
		End Select
		v6#=0.002
		AddVertex(v1,-v4#,0.02,v4#,a2 Mod 8*0.125+v3#,a2/8*0.125+0.5+v3#,1.0)
		AddVertex(v1,v6#,0.02,v4#,(a2 Mod 8*0.125+0.125)-v3#,a2/8*0.125+0.5+v3#,1.0)
		AddVertex(v1,-v4#,0.02,-v6#,a2 Mod 8*0.125+v3#,(a2/8*0.125+0.5+0.125)-v3#,1.0)
		AddVertex(v1,v6#,0.02,-v6#,(a2 Mod 8*0.125+0.125)-v3#,(a2/8*0.125+0.5+0.125)-v3#,1.0)
		If v5=1 Then
			AddTriangle(v1,4,5,6)
			AddTriangle(v1,5,7,6)
		Else
			AddTriangle(v1,5,7,6)
		End If
		AddVertex(v1,-v6#,0.02,v4#,a3 Mod 8*0.125+v3#,a3/8*0.125+0.5+v3#,1.0)
		AddVertex(v1,v4#,0.02,v4#,(a3 Mod 8*0.125+0.125)-v3#,a3/8*0.125+0.5+v3#,1.0)
		AddVertex(v1,-v6#,0.02,-v6#,a3 Mod 8*0.125+v3#,(a3/8*0.125+0.5+0.125)-v3#,1.0)
		AddVertex(v1,v4#,0.02,-v6#,(a3 Mod 8*0.125+0.125)-v3#,(a3/8*0.125+0.5+0.125)-v3#,1.0)
		If v5=1 Then
			AddTriangle(v1,8,9,10)
			AddTriangle(v1,9,11,10)
		Else
			AddTriangle(v1,8,11,10)
		End If
		AddVertex(v1,-v4#,0.02,v6#,a4 Mod 8*0.125+v3#,a4/8*0.125+0.5+v3#,1.0)
		AddVertex(v1,v6#,0.02,v6#,(a4 Mod 8*0.125+0.125)-v3#,a4/8*0.125+0.5+v3#,1.0)
		AddVertex(v1,-v4#,0.02,-v4#,a4 Mod 8*0.125+v3#,(a4/8*0.125+0.5+0.125)-v3#,1.0)
		AddVertex(v1,v6#,0.02,-v4#,(a4 Mod 8*0.125+0.125)-0.02,(a4/8*0.125+0.5+0.125)-v3#,1.0)
		If v5=1 Then
			AddTriangle(v1,12,13,14)
			AddTriangle(v1,13,15,14)
		Else
			AddTriangle(v1,12,13,15)
		End If
		AddVertex(v1,-v6#,0.02,v6#,a5 Mod 8*0.125+v3#,a5/8*0.125+0.5+v3#,1.0)
		AddVertex(v1,v4#,0.02,v6#,(a5 Mod 8*0.125+0.125)-v3#,a5/8*0.125+0.5+v3#,1.0)
		AddVertex(v1,-v6#,0.02,-v4#,a5 Mod 8*0.125+v3#,(a5/8*0.125+0.5+0.125)-v3#,1.0)
		AddVertex(v1,v4#,0.02,-v4#,(a5 Mod 8*0.125+0.125)-v3#,(a5/8*0.125+0.5+0.125)-v3#,1.0)
		If v5=1 Then
			AddTriangle(v1,16,17,18)
			AddTriangle(v1,17,19,18)
		Else
			AddTriangle(v1,16,17,18)
		End If
	End If
	If a1=10 Then
		EntityFX objectentity(a0),1
	End If
	UpdateNormals objectentity(a0)
	EntityTexture objectentity(a0),buttontexture,0,0
End Function

Function controlbutton(a0)
	
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	objectz(a0)=0.02
	If objectactive(a0)=1001 Then
		v1=0
		;v2=0
		For v2=0 To nofobjects-1
			If ((objectexists(v2)=1 And (objectbuttonpush(v2)=1)) And (a0<>v2)) Then
				If (((objecttilex(v2)=objecttilex(a0) And (objecttiley(v2)=objecttiley(a0))) And (objectmovementtimer(v2)<500)) Or (((objecttilex2(v2)=objecttilex(a0) And (objecttiley2(v2)=objecttiley(a0))) And (objectmovementtimer(v2)>=500)))) Then
					v1=1
					If (v2<>playerobject And ((objectsubtype(a0)=10 Or (objectsubtype(a0)=13)))) Then
						v1=0
					End If
					If (objectdata(a0,8)>0 And (objectid(v2)<>objectdata(a0,8))) Then
						v1=0
					End If
					If (objectdata(a0,8)=-2 And (v2<>playerobject)) Then
						v1=0
					End If
					If objectflying(v2)/10=1 Then
						v1=0
					End If
				End If
			End If
			;v2=v2+1
		Next
		If v1=1 Then
			objectdata10(a0)=0
			activatebutton(a0)
		End If
		If v1=0 Then
			If objectdata10(a0)>=0 Then
				objectdata10(a0)=-1
			Else
				objectdata10(a0)=objectdata10(a0)-1
				If objectdata10(a0)<-5 Then
					Select objectsubtype(a0)
					Case 0,32
					Case 1,33
						If (v1=0 And (objectstatus(a0)=1)) Then
							objectstatus(a0)=0
							;v2=0
							For v2=0 To 3
								If objectdata(a0,v2)>15 Then
									v4=0
									;v5=0
									For v5=0 To nofobjects-1
										If (objectexists(v5)=1 And (objecttype(v5)=90)) Then
											If ((objectsubtype(v5)=1 Or (objectsubtype(v5)=33)) And (objectstatus(v5)=1)) Then
												;v6=0
												For v6=0 To 3
													If objectdata(a0,v2) Mod 16*5+objectdata(a0,v2+4)=objectdata(v5,v6) Mod 16*5+objectdata(v5,v6+4) Then
														v4=1
													End If
													;v6=v6+1
												Next
											End If
										End If
										;v5=v5+1
									Next
									If v4=0 Then
										;v5=0
										For v5=0 To nofobjects-1
											If (objectexists(v5)=1 And (objectid(v5)=(objectdata(a0,v2)-16)*5+500+objectdata(a0,v2+4))) Then
												If ((objecttype(v5)=10 Or (objecttype(v5)=140)) Or (objecttype(v5)=20)) Or (objecttype(v5)=424) Then
													activateobject(v5)
												Else If objecttype(v5)=210 Then
												Else
													deactivateobject(v5)
												End If
											End If
											;v5=v5+1
										Next
									End If
									objectdata(a0,v2)=objectdata(a0,v2)-16
									If objectsubtype(a0)<32 Then
										redobuttontexture(a0)
									End If
								End If
								;v2=v2+1
							Next
						End If
					Case 2,34
					Case 3,35
						If (v1=0 And (objectstatus(a0)=1)) Then
							objectstatus(a0)=0
							;v2=0
							For v2=0 To 3
								If objectdata(a0,v2)>15 Then
									;v7=v2+1
									For v7=v2+1 To 3
										If objectdata(a0,v7)=objectdata(a0,v2) Then
											objectdata(a0,v7)=objectdata(a0,v7)-16
										End If
										;v7=v7+1
									Next
									objectdata(a0,v2)=objectdata(a0,v2)-16
									If objectsubtype(a0)<32 Then
										redobuttontexture(a0)
									End If
								End If
								;v2=v2+1
							Next
						End If
					Case 4,36
						objectyaw(a0)=-(objectstatus(a0) Mod 360)
						If (v1=0 And (objectstatus(a0)>360)) Then
							objectstatus(a0)=objectstatus(a0)-360
						End If
						If objectstatus(a0) Mod 360<>0 Then
							objectstatus(a0)=objectstatus(a0)+1
						End If
						If (objectstatus(a0)=360 Or (objectstatus(a0)=720)) Then
							If objectstatus(a0)=360 Then
								objectstatus(a0)=0
							End If
							;v2=0
							For v2=0 To 3
								If objectdata(a0,v2)>15 Then
									;v5=0
									For v5=0 To nofobjects-1
										If (objectexists(v5)=1 And (objectid(v5)=(objectdata(a0,v2)-16)*5+500+objectdata(a0,v2+4))) Then
											If ((objecttype(v5)=10 Or (objecttype(v5)=140)) Or (objecttype(v5)=20)) Or (objecttype(v5)=424) Then
												activateobject(v5)
											Else If objecttype(v5)=210 Then
											Else
												deactivateobject(v5)
											End If
										End If
										;v5=v5+1
									Next
									objectdata(a0,v2)=objectdata(a0,v2)-16
									If objectsubtype(a0)<32 Then
										redobuttontexture(a0)
									End If
								End If
								;v2=v2+1
							Next
						End If
					Case 5,6,37,38
						If (v1=0 And (objectstatus(a0)=1)) Then
							objectstatus(a0)=0
							;v2=0
							For v2=0 To 2 Step 2
								If (objectsubtype(a0) Mod 32=6 And (objectdata(a0,v2)>15)) Then
									objectdata(a0,v2)=objectdata(a0,v2)-16
									objectdata(a0,v2+1)=objectdata(a0,v2+1)-16
								End If
								redobuttontexture(a0)
								;v2=v2+2
							Next
						End If
					Case 7,8,39,40
						If (v1=0 And (objectstatus(a0)=1)) Then
							objectstatus(a0)=0
							v2=0
							If (objectsubtype(a0) Mod 32=8 And (objectdata(a0,v2)>15)) Then
								objectdata(a0,v2)=objectdata(a0,v2)-16
								objectdata(a0,v2+1)=objectdata(a0,v2+1)-16
							End If
							redobuttontexture(a0)
						End If
					End Select
				End If
			End If
		End If
		Select objectsubtype(a0)
		Case 9,41
			objectyaw(a0)=-(objectstatus(a0) Mod 360)
			If (v1=0 And (objectstatus(a0)>360)) Then
				objectstatus(a0)=objectstatus(a0)-360
			End If
			If objectstatus(a0) Mod 360<>0 Then
				objectstatus(a0)=objectstatus(a0)+1
			End If
			If (objectstatus(a0)=360 Or (objectstatus(a0)=720)) Then
				If objectstatus(a0)=360 Then
					objectstatus(a0)=0
				End If
				v2=0
				If objectdata(a0,v2)>15 Then
					objectdata(a0,v2)=objectdata(a0,v2)-16
					objectdata(a0,v2+1)=objectdata(a0,v2+1)-16
					;v5=0
					For v5=0 To nofobjects-1
						If (objectexists(v5)=1 And (objectid(v5)=objectdata(a0,v2+1)*5+500+objectdata(a0,v2+3))) Then
							If objecttype(v5)=10 Then
								objectid(v5)=objectdata(a0,v2+0)*5+500+objectdata(a0,v2+2)
								redogatetexture(v5)
							Else If objecttype(v5)=30 Then
								objectid(v5)=objectdata(a0,v2+0)*5+500+objectdata(a0,v2+2)
								EntityTexture objectentity(v5),teleportertexture(((objectid(v5)-500)/5)),0,0
							Else If objecttype(v5)=210 Then
								objectid(v5)=objectdata(a0,v2+0)*5+500+objectdata(a0,v2+2)
								redotransportertexture(v5)
							Else If objecttype(v5)=410 Then
								objectid(v5)=objectdata(a0,v2+0)*5+500+objectdata(a0,v2+2)
								objectdata(v5,0)=objectdata(a0,v2)
								objectdata(v5,1)=objectdata(a0,v2+2)
								redoflipbridgetexture(v5)
							Else If objecttype(v5)=40 Then
								If (objectdata(a0,v2+0)>=8 And (objectdata(a0,v2+0)<12)) Then
									objectid(v5)=objectdata(a0,v2+0)*5+500+objectdata(a0,v2+2)
									objectdata(v5,0)=objectdata(a0,v2+0)-8
									objectdata(v5,1)=objectdata(a0,v2+2)
									EntityTexture objectentity(v5),steppingstonetexture(objectdata(v5,0)),0,0
								End If
							End If
						End If
						;v5=v5+1
					Next
					redobuttontexture(a0)
				End If
			End If
		Case 10
			If v1=1 Then
				activatecommand(7,objectdata(a0,1),objectdata(a0,2),objectdata(a0,3),0)
			End If
		Case 11
			If v1=1 Then
				If objectdata(a0,0)=0 Then
					If objectdata(a0,6)=0 Then
						objectdata(a0,6)=objectdata(a0,5)
					End If
					If objectdata(a0,5)<=0 Then
						objectdata(a0,5)=objectdata(a0,6)
						If gamemode<>8 Then
							activatecommand(61,objectdata(a0,1),objectdata(a0,2),objectdata(a0,3),0)
						End If
						If objectdata(a0,4)=1 Then
							objectactive(a0)=0
						End If
					Else
						objectdata(a0,5)=objectdata(a0,5)-1
					End If
				Else If objectdata(a0,0)=1 Then
					activatecommand(62,objectdata(a0,1),objectdata(a0,2),objectdata(a0,3),objectdata(a0,4))
					activatecommand(63,objectdata(a0,1),objectdata(a0,6),objectdata(a0,7),objectdata(a0,9))
					If objectdata(a0,5)=1 Then
						objectactive(a0)=0
					End If
				Else If objectdata(a0,0)=2 Then
					activatecommand(64,objectdata(a0,1),objectdata(a0,2),objectdata(a0,3),0)
					If objectdata(a0,4)=1 Then
						objectactive(a0)=0
					Else
						objectactive(a0)=1
						objectactivationspeed(a0)=2
					End If
				End If
			End If
		Case 12
		Case 13
			If v1=1 Then
				activatecommand(8,objectdata(a0,0),0,0,0)
			End If
		Case 14
		Case 15
			If (v1=1 And (objectstatus(a0)=0)) Then
				activatecommand(objectdata(a0,0),objectdata(a0,1),objectdata(a0,2),objectdata(a0,3),objectdata(a0,4))
				If objectdata(a0,5)=1 Then
					objectactive(a0)=0
				End If
				objectstatus(a0)=1
			End If
			If (v1=0 And (objectstatus(a0)=1)) Then
				objectstatus(a0)=0
			End If
		Case 16,17,48,49
			If (v1=0 And (objectstatus(a0)=1)) Then
				objectstatus(a0)=0
			End If
		End Select
	End If
	If objectsubtype(a0)=13 Then
		If (objectactive(a0)>20 And (objectlastactive(a0)<=20)) Then
			;v2=0
			For v2=0 To 359 Step 20
				addparticle(19,objecttilex(a0)+0.5+0.3*Sin(v2),0.0,((-objecttiley(a0))-0.5)-(0.3*Cos(v2)),0.0,0.1,0.02*Sin(v2),0.004,(-0.02)*Cos(v2),8.0,0.002,0.0,-0.0,0.0,70,4)
				;v2=v2+20
			Next
		End If
	End If
End Function

Function activatebutton(a0)
	
	v1=1
	Select objectsubtype(a0)
	Case 0,32
		If v1=1 Then
			;v3=0
			For v3=0 To 3
				If objectdata(a0,v3)<16 Then
					If objectsubtype(a0)<32 Then
						playsoundfx(21,objecttilex(a0),objecttiley(a0))
					End If
					;v4=0
					For v4=0 To nofobjects-1
						If (objectexists(v4)=1 And (objectid(v4)=objectdata(a0,v3)*5+500+objectdata(a0,v3+4))) Then
							If ((objecttype(v4)=10 Or (objecttype(v4)=140)) Or (objecttype(v4)=20)) Or (objecttype(v4)=424) Then
								deactivateobject(v4)
							Else If objecttype(v4)=210 Then
								activatetransporter(v4)
							Else
								activateobject(v4)
							End If
						End If
						;v4=v4+1
					Next
					objectdata(a0,v3)=31
					If objectsubtype(a0)<32 Then
						redobuttontexture(a0)
					End If
				End If
				;v3=v3+1
			Next
		End If
	Case 1,33
		If v1=1 Then
			objectstatus(a0)=1
			;v3=0
			For v3=0 To 3
				If objectdata(a0,v3)<16 Then
					If objectsubtype(a0)<32 Then
						playsoundfx(21,objecttilex(a0),objecttiley(a0))
					End If
					;v4=0
					For v4=0 To nofobjects-1
						If (objectexists(v4)=1 And (objectid(v4)=objectdata(a0,v3)*5+500+objectdata(a0,v3+4))) Then
							If ((objecttype(v4)=10 Or (objecttype(v4)=140)) Or (objecttype(v4)=20)) Or (objecttype(v4)=424) Then
								deactivateobject(v4)
							Else If objecttype(v4)=210 Then
								activatetransporter(v4)
							Else
								activateobject(v4)
							End If
						End If
						;v4=v4+1
					Next
					objectdata(a0,v3)=objectdata(a0,v3)+16
					If objectsubtype(a0)<32 Then
						redobuttontexture(a0)
					End If
				End If
				;v3=v3+1
			Next
		End If
	Case 2,34
		If v1=1 Then
			;v3=0
			For v3=0 To 3
				If objectdata(a0,v3)<16 Then
					If objectsubtype(a0)<32 Then
						playsoundfx(21,objecttilex(a0),objecttiley(a0))
					End If
					;v4=0
					For v4=0 To nofobjects-1
						If (objectexists(v4)=1 And (objectid(v4)=objectdata(a0,v3)*5+500+objectdata(a0,v3+4))) Then
							If objecttype(v4)=210 Then
								activatetransporter(v4)
							Else
								toggleobject(v4)
							End If
						End If
						;v4=v4+1
					Next
					;v5=v3+1
					For v5=v3+1 To 3
						If (objectdata(a0,v5)=objectdata(a0,v3) And (objectdata(a0,v5+4)=objectdata(a0,v3+4))) Then
							objectdata(a0,v5)=objectdata(a0,v5)+16
						End If
						;v5=v5+1
					Next
					objectdata(a0,v3)=objectdata(a0,v3)+16
					If objectsubtype(a0)<32 Then
						redobuttontexture(a0)
					End If
				End If
				;v3=v3+1
			Next
		End If
	Case 3,35
		If v1=1 Then
			objectstatus(a0)=1
			;v3=0
			For v3=0 To 3
				If objectdata(a0,v3)<16 Then
					If objectsubtype(a0)<32 Then
						playsoundfx(21,objecttilex(a0),objecttiley(a0))
					End If
					;v4=0
					For v4=0 To nofobjects-1
						If (objectexists(v4)=1 And (objectid(v4)=objectdata(a0,v3)*5+500+objectdata(a0,v3+4))) Then
							If objecttype(v4)=210 Then
								activatetransporter(v4)
							Else
								toggleobject(v4)
							End If
						End If
						;v4=v4+1
					Next
					;v5=v3+1
					For v5=v3+1 To 3
						If (objectdata(a0,v5)=objectdata(a0,v3) And (objectdata(a0,v5+4)=objectdata(a0,v3+4))) Then
							objectdata(a0,v5)=objectdata(a0,v5)+16
						End If
						;v5=v5+1
					Next
					objectdata(a0,v3)=objectdata(a0,v3)+16
					If objectsubtype(a0)<32 Then
						redobuttontexture(a0)
					End If
				End If
				;v3=v3+1
			Next
		End If
	Case 4,36
		If (v1=1 And (objectstatus(a0)<360)) Then
			If objectsubtype(a0)<32 Then
				playsoundfx(23,objecttilex(a0),objecttiley(a0))
			End If
			objectstatus(a0)=361
			;v3=0
			For v3=0 To 3
				If objectdata(a0,v3)<16 Then
					;v4=0
					For v4=0 To nofobjects-1
						If (objectexists(v4)=1 And (objectid(v4)=objectdata(a0,v3)*5+500+objectdata(a0,v3+4))) Then
							If ((objecttype(v4)=10 Or (objecttype(v4)=140)) Or (objecttype(v4)=20)) Or (objecttype(v4)=424) Then
								deactivateobject(v4)
							Else If objecttype(v4)=210 Then
								activatetransporter(v4)
							Else
								activateobject(v4)
							End If
						End If
						;v4=v4+1
					Next
					objectdata(a0,v3)=objectdata(a0,v3)+16
					If objectsubtype(a0)<32 Then
						redobuttontexture(a0)
					End If
				End If
				;v3=v3+1
			Next
		End If
	Case 5,6,37,38
		If v1=1 Then
			objectstatus(a0)=1
			v3=0
			If objectdata(a0,v3)<15 Then
				If objectsubtype(a0)<32 Then
					playsoundfx(24,objecttilex(a0),objecttiley(a0))
				End If
				;v4=0
				For v4=0 To nofobjects-1
					If (objectexists(v4)=1 And (objectid(v4)=objectdata(a0,v3)*5+500+objectdata(a0,v3+2))) Then
						If objecttype(v4)=10 Then
							objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
							redogatetexture(v4)
						Else If objecttype(v4)=30 Then
							objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
							EntityTexture objectentity(v4),teleportertexture(((objectid(v4)-500)/5)),0,0
						Else If objecttype(v4)=210 Then
							objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
							redotransportertexture(v4)
						Else If objecttype(v4)=410 Then
							objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
							objectdata(v4,0)=objectdata(a0,v3+1)
							objectdata(v4,1)=objectdata(a0,v3+3)
							redoflipbridgetexture(v4)
						Else If objecttype(v4)=40 Then
							If (objectdata(a0,v3+1)>=8 And (objectdata(a0,v3+1)<12)) Then
								objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
								objectdata(v4,0)=objectdata(a0,v3+1)-8
								objectdata(v4,1)=objectdata(a0,v3+3)
								EntityTexture objectentity(v4),steppingstonetexture(objectdata(v4,0)),0,0
							End If
						End If
					End If
					;v4=v4+1
				Next
				If objectsubtype(a0) Mod 32=5 Then
					objectdata(a0,v3)=15
					objectdata(a0,v3+1)=15
				Else
					objectdata(a0,v3)=objectdata(a0,v3)+16
					objectdata(a0,v3+1)=objectdata(a0,v3+1)+16
				End If
				redobuttontexture(a0)
			End If
		End If
	Case 7,8,39,40
		If v1=1 Then
			objectstatus(a0)=1
			v3=0
			If objectdata(a0,v3)<15 Then
				If objectsubtype(a0)<32 Then
					playsoundfx(24,objecttilex(a0),objecttiley(a0))
				End If
				;v4=0
				For v4=0 To nofobjects-1
					If (objectexists(v4)=1 And (objectid(v4)=objectdata(a0,v3)*5+500+objectdata(a0,v3+2))) Then
						If objecttype(v4)=10 Then
							objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
							redogatetexture(v4)
						Else If objecttype(v4)=30 Then
							objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
							EntityTexture objectentity(v4),teleportertexture(((objectid(v4)-500)/5)),0,0
						Else If objecttype(v4)=210 Then
							objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
							redotransportertexture(v4)
						Else If objecttype(v4)=410 Then
							objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
							objectdata(v4,0)=objectdata(a0,v3+1)
							objectdata(v4,1)=objectdata(a0,v3+3)
							redoflipbridgetexture(v4)
						Else If objecttype(v4)=40 Then
							If (objectdata(a0,v3+1)>=8 And (objectdata(a0,v3+1)<12)) Then
								objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
								objectdata(v4,0)=objectdata(a0,v3+1)-8
								objectdata(v4,1)=objectdata(a0,v3+3)
								EntityTexture objectentity(v4),steppingstonetexture(objectdata(v4,0)),0,0
							End If
						End If
					Else If (objectexists(v4)=1 And (objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3))) Then
						If objecttype(v4)=10 Then
							objectid(v4)=objectdata(a0,v3)*5+500+objectdata(a0,v3+2)
							redogatetexture(v4)
						Else If objecttype(v4)=30 Then
							objectid(v4)=objectdata(a0,v3)*5+500+objectdata(a0,v3+2)
							EntityTexture objectentity(v4),teleportertexture(((objectid(v4)-500)/5)),0,0
						Else If objecttype(v4)=210 Then
							objectid(v4)=objectdata(a0,v3)*5+500+objectdata(a0,v3+2)
							redotransportertexture(v4)
						Else If objecttype(v4)=410 Then
							objectid(v4)=objectdata(a0,v3)*5+500+objectdata(a0,v3+2)
							objectdata(v4,0)=objectdata(a0,v3)
							objectdata(v4,1)=objectdata(a0,v3+2)
							redoflipbridgetexture(v4)
						Else If objecttype(v4)=40 Then
							If (objectdata(a0,v3)>=8 And (objectdata(a0,v3)<12)) Then
								objectid(v4)=objectdata(a0,v3)*5+500+objectdata(a0,v3+2)
								objectdata(v4,0)=objectdata(a0,v3)-8
								objectdata(v4,1)=objectdata(a0,v3+2)
								EntityTexture objectentity(v4),steppingstonetexture(objectdata(v4,0)),0,0
							End If
						End If
					End If
					;v4=v4+1
				Next
				If objectsubtype(a0) Mod 32=7 Then
					objectdata(a0,v3)=15
					objectdata(a0,v3+1)=15
				Else
					objectdata(a0,v3)=objectdata(a0,v3)+16
					objectdata(a0,v3+1)=objectdata(a0,v3+1)+16
				End If
				redobuttontexture(a0)
			End If
		End If
	Case 9,41
		If (v1=1 And (objectstatus(a0)<360)) Then
			objectstatus(a0)=361
			v3=0
			If objectdata(a0,v3)<15 Then
				If objectsubtype(a0)<32 Then
					playsoundfx(24,objecttilex(a0),objecttiley(a0))
				End If
				;v4=0
				For v4=0 To nofobjects-1
					If (objectexists(v4)=1 And (objectid(v4)=objectdata(a0,v3)*5+500+objectdata(a0,v3+2))) Then
						If objecttype(v4)=10 Then
							objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
							redogatetexture(v4)
						Else If objecttype(v4)=30 Then
							objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
							EntityTexture objectentity(v4),teleportertexture(((objectid(v4)-500)/5)),0,0
						Else If objecttype(v4)=210 Then
							objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
							redotransportertexture(v4)
						Else If objecttype(v4)=410 Then
							objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
							objectdata(v4,0)=objectdata(a0,v3+1)
							objectdata(v4,1)=objectdata(a0,v3+3)
							redoflipbridgetexture(v4)
						Else If objecttype(v4)=40 Then
							If (objectdata(a0,v3+1)>=8 And (objectdata(a0,v3+1)<12)) Then
								objectid(v4)=objectdata(a0,v3+1)*5+500+objectdata(a0,v3+3)
								objectdata(v4,0)=objectdata(a0,v3+1)-8
								objectdata(v4,1)=objectdata(a0,v3+3)
								EntityTexture objectentity(v4),steppingstonetexture(objectdata(v4,0)),0,0
							End If
						End If
					End If
					;v4=v4+1
				Next
				objectdata(a0,v3)=objectdata(a0,v3)+16
				objectdata(a0,v3+1)=objectdata(a0,v3+1)+16
				redobuttontexture(a0)
			End If
		End If
	Case 16,17,48,49
		If objectstatus(a0)=0 Then
			objectstatus(a0)=1
			playsoundfx(22,objecttilex(a0),objecttiley(a0))
			;v4=0
			For v4=0 To nofobjects-1
				If (objectexists(v4)=1 And (objectid(v4)=objectdata(a0,0)*5+500+objectdata(a0,1))) Then
					If objecttype(v4)=280 Then
						If objectdata(a0,2)=0 Then
							objectdata(v4,2)=(objectdata(v4,2)-1+8) Mod 8
						Else
							objectdata(v4,2)=(objectdata(v4,2)+1) Mod 8
						End If
					End If
					If (objecttype(v4)=210 And (objectstatus(v4)=0)) Then
						If objectdata(a0,2)<>0 Then
							objectdata(v4,2)=(objectdata(v4,2)-1+4) Mod 4
						Else
							objectdata(v4,2)=(objectdata(v4,2)+1) Mod 4
						End If
					End If
					If objecttype(v4)=410 Then
						turnflipbridge(v4,objectdata(a0,2))
					End If
				End If
				;v4=v4+1
			Next
		End If
	End Select
End Function

Function controlkeyblock(a0)
	
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	If objecttype(a0)>=84 Then
		objecttimer(a0)=objecttimer(a0)-1
		If objecttimer(a0)<=0 Then
			activatecommand(objectdata(a0,0),objectdata(a0,1),objectdata(a0,2),objectdata(a0,3),objectdata(a0,4))
			If objecttype(a0)=85 Then
				leveltilelogic(objecttilex(a0),objecttiley(a0))=0
			End If
			If (objecttype(a0)=85 Or (objecttype(a0)=87)) Then
				destroyobject(a0,0)
			End If
		End If
	End If
End Function

Function redobuttontexture(a0)
	
	If objectsubtype(a0)>=32 Then
		Return 0
	End If
	v1#=0.01
	v2=GetSurface(objectentity(a0),1)
	v3=objectdata(a0,0)
	VertexTexCoords v2,4,v3 Mod 8*0.125+v1#,v3/8*0.125+0.5+v1#,1.0,0
	VertexTexCoords v2,5,(v3 Mod 8*0.125+0.125)-v1#,v3/8*0.125+0.5+v1#,1.0,0
	VertexTexCoords v2,6,v3 Mod 8*0.125+v1#,(v3/8*0.125+0.5+0.125)-v1#,1.0,0
	VertexTexCoords v2,7,(v3 Mod 8*0.125+0.125)-v1#,(v3/8*0.125+0.5+0.125)-v1#,1.0,0
	v4=objectdata(a0,1)
	VertexTexCoords v2,8,v4 Mod 8*0.125+v1#,v4/8*0.125+0.5+v1#,1.0,0
	VertexTexCoords v2,9,(v4 Mod 8*0.125+0.125)-v1#,v4/8*0.125+0.5+v1#,1.0,0
	VertexTexCoords v2,10,v4 Mod 8*0.125+v1#,(v4/8*0.125+0.5+0.125)-v1#,1.0,0
	VertexTexCoords v2,11,(v4 Mod 8*0.125+0.125)-v1#,(v4/8*0.125+0.5+0.125)-v1#,1.0,0
	If (objectsubtype(a0)>=5 And (objectsubtype(a0)<10)) Then
		v5=objectdata(a0,0)
	Else
		v5=objectdata(a0,2)
	End If
	VertexTexCoords v2,12,v5 Mod 8*0.125+v1#,v5/8*0.125+0.5+v1#,1.0,0
	VertexTexCoords v2,13,(v5 Mod 8*0.125+0.125)-v1#,v5/8*0.125+0.5+v1#,1.0,0
	VertexTexCoords v2,14,v5 Mod 8*0.125+v1#,(v5/8*0.125+0.5+0.125)-v1#,1.0,0
	VertexTexCoords v2,15,(v5 Mod 8*0.125+0.125)-0.02,(v5/8*0.125+0.5+0.125)-v1#,1.0,0
	If (objectsubtype(a0)>=5 And (objectsubtype(a0)<10)) Then
		v6=objectdata(a0,1)
	Else
		v6=objectdata(a0,3)
	End If
	VertexTexCoords v2,16,v6 Mod 8*0.125+v1#,v6/8*0.125+0.5+v1#,1.0,0
	VertexTexCoords v2,17,(v6 Mod 8*0.125+0.125)-v1#,v6/8*0.125+0.5+v1#,1.0,0
	VertexTexCoords v2,18,v6 Mod 8*0.125+v1#,(v6/8*0.125+0.5+0.125)-v1#,1.0,0
	VertexTexCoords v2,19,(v6 Mod 8*0.125+0.125)-v1#,(v6/8*0.125+0.5+0.125)-v1#,1.0,0
End Function

Function createwaterfallmesh()
	
	v1=CreateMesh(0)
	v2=CreateSurface(v1,0)
	AddVertex(v2,-0.5,0.81,-0.51,0.0,0.0,1.0)
	AddVertex(v2,0.5,0.81,-0.51,1.0,0.0,1.0)
	AddVertex(v2,-0.5,-0.21,-0.51,0.0,1.0,1.0)
	AddVertex(v2,0.5,-0.21,-0.51,1.0,1.0,1.0)
	AddVertex(v2,-0.5,0.31,-0.51,0.0,1.0,1.0)
	AddVertex(v2,0.5,0.31,-0.51,1.0,1.0,1.0)
	AddVertex(v2,-0.5,0.31,-0.51,0.0,0.0,1.0)
	AddVertex(v2,0.5,0.31,-0.51,1.0,0.0,1.0)
	AddTriangle(v2,0,1,2)
	AddTriangle(v2,1,3,2)
	AddTriangle(v2,0,1,4)
	AddTriangle(v2,1,5,4)
	AddTriangle(v2,6,7,2)
	AddTriangle(v2,7,3,2)
	AddTriangle(v2,1,0,3)
	AddTriangle(v2,0,2,3)
	EntityTexture v1,waterfalltexture,0,0
	EntityAlpha v1,0.5
	UpdateNormals v1
	Return v1
End Function

Function controlgoldstar(a0)
	
	objectz(a0)=0.8
	If adventurecurrentstatus=0 Then
		objectxscale(a0)=0.5
		objectyscale(a0)=0.5
		objectzscale(a0)=0.5
		objectz(a0)=0.4
	End If
	objectyaw(a0)=objectyaw(a0)+2.0
	If objectactive(a0)<1001 Then
		Return 0
	End If
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	v1=maximum2(Abs(objecttilex(a0)-objecttilex(playerobject)),Abs(objecttiley(a0)-objecttiley(playerobject)))
	If leveltimer<1000000000 Then
		v2=Rand(0,300)
		If (((((v1<3 And (v2<50)) Or ((v1<4 And (v2<40)))) Or ((v1<5 And (v2<28)))) Or ((v1<6 And (v2<15)))) Or ((v1<7 And (v2<2)))) Then
			addparticle(19,objecttilex(a0)+0.5,0.7,(-objecttiley(a0))-0.5,Rand(0,360),0.16,Rnd(-0.015,0.015),0.03,Rnd(-0.015,0.015),0.0,0.001,0.0,-0.00025,0.0,100,3)
		End If
	End If
	If (objectmovementtimer(playerobject)=0 And (v1=0)) Then
		If adventurecurrentstatus=0 Then
			playsoundfx(1,-1,-1)
			playerstars=playerstars+1
			messagelinetext1="You have earned a Star!"
			messagelinetext2="Total Stars: "+playerstars
			messagelinetimer=180
			destroyobject(a0,0)
		Else
			adventurewon()
			HideEntity objectentity(a0)
		End If
	End If
End Function

Function controlgoldcoin(a0)
	
	If objectactive(a0)<1001 Then
		objectyaw(a0)=objectyaw(a0)+10.0
		If objectactive(a0)>600 Then
			objectz(a0)=0.2+((1000-objectactive(a0))/400.0)
		Else
			objectz(a0)=1.2
		End If
		If objectactive(a0)=400 Then
			;v1=1
			For v1=1 To 20
				addparticle(19,objecttilex(a0)+0.5,1.6,(-objecttiley(a0))-0.5,Rand(0,360),0.15,Rnd(-0.035,0.035),Rnd(-0.015,0.015),Rnd(-0.035,0.035),0.0,0.0,0.0,0.0,0.0,50,3)
				;v1=v1+1
			Next
		End If
		If objectactive(a0)<600 Then
			objectscalexadjust(a0)=objectactive(a0)/600.0
			objectscaleyadjust(a0)=objectactive(a0)/600.0
			objectscalezadjust(a0)=objectactive(a0)/600.0
		End If
	Else
		objectyaw(a0)=objectyaw(a0)+3.0
		objectz(a0)=0.0
		v2=maximum2(Abs(objecttilex(a0)-objecttilex(playerobject)),Abs(objecttiley(a0)-objecttiley(playerobject)))
		If (objectmovementtimer(playerobject)=0 And (v2=0)) Then
			If objecttype(a0)=171 Then
				If (objecttilelogic(objecttilex(a0),objecttiley(a0)) And (16))>0 Then
					objecttilelogic(objecttilex(a0),objecttiley(a0))=objecttilelogic(objecttilex(a0),objecttiley(a0))-16.0
				End If
				playercoins=playercoins+1
				playercoinscollected=v3+1
				currentadventurecoins=currentadventurecoins+1
				objectactivationtype(a0)=0
				objectactivationspeed(a0)=20
				deactivateobject(a0)
				playsoundfx(12,-1,-1)
				playsoundfx(173,-1,-1)
			Else If inventorysize^2.0>nofinventoryitems Then
				If (objecttilelogic(objecttilex(a0),objecttiley(a0)) And (16))>0 Then
					objecttilelogic(objecttilex(a0),objecttiley(a0))=objecttilelogic(objecttilex(a0),objecttiley(a0))-16.0
				End If
				objectactivationtype(a0)=0
				objectactivationspeed(a0)=20
				deactivateobject(a0)
				playsoundfx(12,-1,-1)
				playsoundfx(173,-1,-1)
				additemtoinventory(-1,2031,-1,69,"Token","Play!")
				iconsize(8)=601
				;v1=0
				For v1=0 To 359 Step 10
					addparticle2(16,1.74+0.5*Sin(v1),1.63+0.5*Cos(v1),5.0,0.0,0.08,(-0.01)*Sin(v1),(-0.01)*Cos(v1),0.0,0.0,-0.001,0.0,0.0,0.0,50,2)
					;v1=v1+10
				Next
				objectid(a0)=-1
			Else
				messagelinetext1="You Cannot Carry Any More"
				messagelinetext2=""
				messagelinetimer=100
			End If
		End If
	End If
End Function

Function createkeymesh(a0)
	
	v1=CopyMesh(keymesh,0)
	;v2=0
	For v2=0 To CountVertices(GetSurface(v1,1))-1
		If VertexU(GetSurface(v1,1),v2,0)>0.124 Then
			v3#=0.124
		Else
			v3#=VertexU(GetSurface(v1,1),v2,0)
		End If
		If a0=8 Then
			VertexV(GetSurface(v1,1),v2,0)
			VertexTexCoords GetSurface(v1,1),v2,a0 Mod 8+(a0 Mod 8*0.125),v3#*0.7+0.5+Floor(a0/8)*0.125,1.0,0
		Else
			VertexTexCoords GetSurface(v1,1),v2,v3#+(a0 Mod 8*0.125),VertexV(GetSurface(v1,1),v2,0)+0.5+Floor(a0/8)*0.125,1.0,0
		End If
		;v2=v2+1
	Next
	UpdateNormals v1
	EntityTexture v1,buttontexture,0,0
	Return v1
End Function

Function controlkey(a0)
	
	If objectactive(a0)<1001 Then
		objectyaw(a0)=objectyaw(a0)+10.0
		If objectactive(a0)>600 Then
			objectz(a0)=0.6+((1000-objectactive(a0))*2.0/400.0)
		Else
			objectz(a0)=2.6
		End If
		If objectactive(a0)=400 Then
			;v1=1
			For v1=1 To 60
				addparticle(Rnd(16.0,23.0),objecttilex(a0)+0.5,2.6,(-objecttiley(a0))-0.5,Rand(0,360),0.2,Rnd(-0.035,0.035),Rnd(-0.015,0.015),Rnd(-0.035,0.035),0.0,0.0,0.0,0.0,0.0,50,3)
				;v1=v1+1
			Next
		End If
		If objectactive(a0)<600 Then
			objectscalexadjust(a0)=objectactive(a0)/600.0
			objectscaleyadjust(a0)=objectactive(a0)/600.0
			objectscalezadjust(a0)=objectactive(a0)/600.0
		End If
	Else
		objectroll2(a0)=30.0*Sin(leveltimer Mod 360)
		objectz(a0)=0.4
		v2=maximum2(Abs(objecttilex(a0)-objecttilex(playerobject)),Abs(objecttiley(a0)-objecttiley(playerobject)))
		If (objectmovementtimer(playerobject)=0 And (v2=0)) Then
			If inventorysize^2.0>nofinventoryitems Then
				If (objecttilelogic(objecttilex(a0),objecttiley(a0)) And (16))>0 Then
					objecttilelogic(objecttilex(a0),objecttiley(a0))=objecttilelogic(objecttilex(a0),objecttiley(a0))-16.0
				End If
				additemtoinventory(-1,3001,objectdata(a0,0)*5+500+objectdata(a0,1),objectdata(a0,0)+48,"Key","Use")
				iconsize(8)=601
				;v1=0
				For v1=0 To 359 Step 10
					addparticle2(16,1.74+0.5*Sin(v1),1.63+0.5*Cos(v1),5.0,0.0,0.08,(-0.01)*Sin(v1),(-0.01)*Cos(v1),0.0,0.0,-0.001,0.0,0.0,0.0,50,2)
					;v1=v1+10
				Next
				objectactivationtype(a0)=0
				objectactivationspeed(a0)=10
				deactivateobject(a0)
				objectid(a0)=-1
				playsoundfx(174,-1,-1)
			Else
				messagelinetext1="You Cannot Carry Any More"
				messagelinetext2=""
				messagelinetimer=100
			End If
		End If
	End If
End Function

Function controlgem(a0)
	
	If objectactive(a0) Mod 2=1 Then
		ShowEntity objectentity(a0)
	End If
	If objectactive(a0)<1001 Then
		objectyaw(a0)=objectyaw(a0)+10.0
		If objectactive(a0)>600 Then
			objectz(a0)=0.6+((1000-objectactive(a0))/400.0)
		Else
			objectz(a0)=1.6
		End If
		If objectactive(a0)=400 Then
			;v1=1
			For v1=1 To 20
				addparticle(19,objecttilex(a0)+0.5,1.6,(-objecttiley(a0))-0.5,Rand(0,360),0.15,Rnd(-0.035,0.035),Rnd(-0.015,0.015),Rnd(-0.035,0.035),0.0,0.0,0.0,0.0,0.0,50,3)
				;v1=v1+1
			Next
			If (waepisode=1 And ((adventurecurrentnumber>=200 And (adventurecurrentnumber<=203)))) Then
			Else
				If objectdata(a0,0)=0 Then
					addparticle(14,objecttilex(a0)+0.5,1.6,(-objecttiley(a0))-0.5,0.0,1.0,0.0,0.01,0.0,0.0,0.01,0.0,0.0,0.0,50,3)
				End If
				If objectdata(a0,0)=1 Then
					addparticle(15,objecttilex(a0)+0.5,1.6,(-objecttiley(a0))-0.5,0.0,1.0,0.0,0.01,0.0,0.0,0.01,0.0,0.0,0.0,50,3)
				End If
			End If
		End If
		If objectactive(a0)<600 Then
			objectscalexadjust(a0)=objectactive(a0)/600.0
			objectscaleyadjust(a0)=objectactive(a0)/600.0
			objectscalezadjust(a0)=objectactive(a0)/600.0
		End If
		If objectactive(a0)<100 Then
			HideEntity objectentity(a0)
		End If
	Else
		If (objecttilelogic(objecttilex(a0),objecttiley(a0)) And (16))=0 Then
			objecttilelogic(objecttilex(a0),objecttiley(a0))=objecttilelogic(objecttilex(a0),objecttiley(a0))+16.0
		End If
		If objectdata(a0,0)=2 Then
			If Rand(0,10)<3 Then
				addparticle(objectdata(a0,1)+16+Rand(0,1)*8,objecttilex(a0)+0.5,Rnd(0.0,1.0),(-objecttiley(a0))-0.5,0.0,0.01,Rnd(-0.01,0.01),Rnd(-0.01,0.01),Rnd(0.0,0.02),Rnd(-4.0,4.0),0.01,0.0,0.0,0.0,70,3)
			End If
		End If
		If (objectyaw(a0)=0.0 And (objectdata(a0,0)<>1)) Then
			objectroll(a0)=Rand(-10,10)
			objectyaw(a0)=Rand(1,180)
		End If
		If (objectdata(a0,0)=0 Or (objectdata(a0,0)=2)) Then
			objectyaw(a0)=objectyaw(a0)+Rnd(1.8,2.2)
		End If
		If objectdata(a0,0)=1 Then
			objectpitch(a0)=Rnd(2.0,3.0)+objectpitch(a0)+(a0 Mod 3/3.0)
		End If
		objectz(a0)=0.4
		v2=maximum2(Abs(objecttilex(a0)-objecttilex(playerobject)),Abs(objecttiley(a0)-objecttiley(playerobject)))
		If (objectmovementtimer(playerobject)=0 And (v2=0)) Then
			If objectdata(a0,0)=2 Then
				If inventorysize^2.0>nofinventoryitems Then
					If (objecttilelogic(objecttilex(a0),objecttiley(a0)) And (16))>0 Then
						objecttilelogic(objecttilex(a0),objecttiley(a0))=objecttilelogic(objecttilex(a0),objecttiley(a0))-16.0
					End If
					additemtoinventory(-1,3021,objectdata(a0,1),objectdata(a0,1)+40,"Shard","Use")
					iconsize(8)=601
					;v1=0
					For v1=0 To 359 Step 10
						addparticle2(16,1.74+0.5*Sin(v1),1.63+0.5*Cos(v1),5.0,0.0,0.08,(-0.01)*Sin(v1),(-0.01)*Cos(v1),0.0,0.0,-0.001,0.0,0.0,0.0,50,2)
						;v1=v1+10
					Next
					objectactivationtype(a0)=0
					objectactivationspeed(a0)=10
					deactivateobject(a0)
					objectid(a0)=-1
					playsoundfx(174,-1,-1)
				Else
					messagelinetext1="You Cannot Carry Any More"
					messagelinetext2=""
					messagelinetimer=100
				End If
			Else
				If (objecttilelogic(objecttilex(a0),objecttiley(a0)) And (16))>0 Then
					objecttilelogic(objecttilex(a0),objecttiley(a0))=objecttilelogic(objecttilex(a0),objecttiley(a0))-16.0
				End If
				If ((waepisode=1 And (adventurecurrentnumber>=200)) And (adventurecurrentnumber<=202)) Then
				Else
					If objectdata(a0,0)=0 Then
						playerscore=playerscore+100
						currentadventurescore=currentadventurescore+100
					End If
					If objectdata(a0,0)=1 Then
						playerscore=playerscore+250
						currentadventurescore=currentadventurescore+250
					End If
				End If
				currentadventuregems=currentadventuregems+1
				objectactivationtype(a0)=0
				objectactivationspeed(a0)=20
				nofgemsinadventure=nofgemsinadventure-1
				If ((waepisode=1 And (adventurecurrentnumber>=200)) And (adventurecurrentnumber<=202)) Then
					playsoundfx(14,-1,-1)
				Else
					playsoundfx(11,-1,-1)
				End If
				deactivateobject(a0)
			End If
		End If
	End If
End Function

Function createcustomitemmesh(a0)
	
	v1=CreateMesh(0)
	v2=CreateSurface(v1,0)
	AddVertex(v2,-0.4,0.4,-0.13,a0 Mod 8*0.125+0.013,Floor(a0 Mod 64/8)*0.125+0.013,1.0)
	AddVertex(v2,0.4,0.4,-0.13,a0 Mod 8*0.125+0.1135,Floor(a0 Mod 64/8)*0.125+0.013,1.0)
	AddVertex(v2,-0.4,-0.4,-0.13,a0 Mod 8*0.125+0.013,Floor(a0 Mod 64/8)*0.125+0.0945,1.0)
	AddVertex(v2,0.4,-0.4,-0.13,a0 Mod 8*0.125+0.1135,Floor(a0 Mod 64/8)*0.125+0.0945,1.0)
	AddVertex(v2,-0.4,0.4,0.13,a0 Mod 8*0.125+0.013,Floor(a0 Mod 64/8)*0.125+0.013,1.0)
	AddVertex(v2,0.4,0.4,0.13,a0 Mod 8*0.125+0.1135,Floor(a0 Mod 64/8)*0.125+0.013,1.0)
	AddVertex(v2,-0.4,-0.4,0.13,a0 Mod 8*0.125+0.013,Floor(a0 Mod 64/8)*0.125+0.0945,1.0)
	AddVertex(v2,0.4,-0.4,0.13,a0 Mod 8*0.125+0.1135,Floor(a0 Mod 64/8)*0.125+0.0945,1.0)
	AddTriangle(v2,0,1,2)
	AddTriangle(v2,1,3,2)
	AddTriangle(v2,5,4,6)
	AddTriangle(v2,5,6,7)
	a0=63
	AddVertex(v2,-0.45,0.45,-0.0951,a0 Mod 8*0.125+0.013,Floor(a0 Mod 64/8)*0.125+0.013,1.0)
	AddVertex(v2,0.45,0.45,-0.0951,a0 Mod 8*0.125+0.1135,Floor(a0 Mod 64/8)*0.125+0.013,1.0)
	AddVertex(v2,-0.45,-0.45,-0.0951,a0 Mod 8*0.125+0.013,Floor(a0 Mod 64/8)*0.125+0.0945,1.0)
	AddVertex(v2,0.45,-0.45,-0.0951,a0 Mod 8*0.125+0.1135,Floor(a0 Mod 64/8)*0.125+0.0945,1.0)
	AddVertex(v2,-0.45,0.45,0.0951,a0 Mod 8*0.125+0.013,Floor(a0 Mod 64/8)*0.125+0.013,1.0)
	AddVertex(v2,0.45,0.45,0.0951,a0 Mod 8*0.125+0.1135,Floor(a0 Mod 64/8)*0.125+0.013,1.0)
	AddVertex(v2,-0.45,-0.45,0.0951,a0 Mod 8*0.125+0.013,Floor(a0 Mod 64/8)*0.125+0.0945,1.0)
	AddVertex(v2,0.45,-0.45,0.0951,a0 Mod 8*0.125+0.1135,Floor(a0 Mod 64/8)*0.125+0.0945,1.0)
	AddTriangle(v2,8,9,10)
	AddTriangle(v2,9,11,10)
	AddTriangle(v2,13,12,14)
	AddTriangle(v2,13,14,15)
	AddTriangle(v2,12,13,9)
	AddTriangle(v2,8,12,9)
	AddTriangle(v2,11,15,14)
	AddTriangle(v2,11,14,10)
	AddTriangle(v2,12,8,14)
	AddTriangle(v2,8,10,14)
	AddTriangle(v2,9,13,15)
	AddTriangle(v2,9,15,11)
	UpdateNormals v1
	EntityTexture v1,icontexturecustom,0,0
	Return v1
End Function

Function controlcustomitem(a0)
	
	If objectactive(a0)<1001 Then
		objectyaw(a0)=objectyaw(a0)+10.0
		If objectactive(a0)>600 Then
			objectz(a0)=0.6+((1000-objectactive(a0))*2.0/400.0)
		Else
			objectz(a0)=2.6
		End If
		If objectactive(a0)=400 Then
			;v1=1
			For v1=1 To 60
				addparticle(Rnd(16.0,23.0),objecttilex(a0)+0.5,2.6,(-objecttiley(a0))-0.5,Rand(0,360),0.2,Rnd(-0.035,0.035),Rnd(-0.015,0.015),Rnd(-0.035,0.035),0.0,0.0,0.0,0.0,0.0,50,3)
				;v1=v1+1
			Next
		End If
		If objectactive(a0)<600 Then
			objectscalexadjust(a0)=objectactive(a0)/600.0
			objectscaleyadjust(a0)=objectactive(a0)/600.0
			objectscalezadjust(a0)=objectactive(a0)/600.0
		End If
	Else
		objectyaw(a0)=objectyaw(a0)+Cos(leveltimer Mod 360)
		objectz(a0)=0.5
		v2=maximum2(Abs(objecttilex(a0)-objecttilex(playerobject)),Abs(objecttiley(a0)-objecttiley(playerobject)))
		If (objectmovementtimer(playerobject)=0 And (v2=0)) Then
			If inventorysize^2.0>nofinventoryitems Then
				If (objecttilelogic(objecttilex(a0),objecttiley(a0)) And (16))>0 Then
					objecttilelogic(objecttilex(a0),objecttiley(a0))=objecttilelogic(objecttilex(a0),objecttiley(a0))-16.0
				End If
				If (objectsubtype(a0)<10 Or (objectsubtype(a0)>=20)) Then
					If objectsubtype(a0)=-1 Then
						additemtoinventory(-1,1001,-1,23,"Gloves","Examine")
						objectsubtype(a0)=0
					Else If objectsubtype(a0)=-2 Then
						additemtoinventory(-1,2001,-1,66,"Lamp","- 99 -")
						currentlightpower=99
					Else If objectsubtype(a0)=-3 Then
						additemtoinventory(-1,2011,-1,67,"GlowGem","Charged")
						currentlightpower=-1
						;v1=0
						For v1=0 To 99
							If inventoryitem(v1)=2001 Then
								removeitemfrominventory(v1)
							End If
							;v1=v1+1
						Next
					Else If objectsubtype(a0)=-4 Then
						additemtoinventory(-1,2021,-1,68,"Spy-Eye","Use")
					Else
						additemtoinventory(-1,objectsubtype(a0)*10+4001,objectdata(a0,1),objectdata(a0,0)+64,objecttextdata(a0,0),objecttextdata(a0,1))
					End If
					playsoundfx(174,-1,-1)
					iconsize(8)=601
					;v1=0
					For v1=0 To 359 Step 10
						addparticle2(16,1.74+0.5*Sin(v1),1.63+0.5*Cos(v1),5.0,0.0,0.08,(-0.01)*Sin(v1),(-0.01)*Cos(v1),0.0,0.0,-0.001,0.0,0.0,0.0,50,2)
						;v1=v1+10
					Next
					objectactivationspeed(a0)=10
					If objectsubtype(a0) Mod 10=1 Then
						adventurewon()
					End If
				Else
					v3=objectsubtype(a0)
					v4=v3 Mod 10
					v5=0
					If v4=1 Then
						adventurewon()
					Else If (v4>=2 And (v4<=7)) Then
						v6=Floor(objectx(a0))
						v7=Floor(objecty(a0))
						;v1=0
						For v1=0 To nofobjects-1
							If (objectexists(v1)=1 And (objectid(v1)=objectdata(a0,1))) Then
								If ((((Abs(objecttilex(v1)-v6)<=1 And (Abs(objecttiley(v1)-v7)<=1)) Or (v4=5)) Or (v4=6)) Or (v4=7)) Then
									If (v4=2 Or (v4=5)) Then
										activateobject(v1)
									Else If (v4=3 Or (v4=6)) Then
										deactivateobject(v1)
									Else If (v4=4 Or (v4=7)) Then
										toggleobject(v1)
									End If
									v5=1
								End If
							End If
							;v1=v1+1
						Next
					End If
					objectactivationspeed(a0)=100
				End If
				objectactivationtype(a0)=0
				objectid(a0)=-1
				deactivateobject(a0)
			Else
				messagelinetext1="You Cannot Carry Any More"
				messagelinetext2=""
				messagelinetimer=100
			End If
		End If
	End If
End Function

Function controlsigns(a0)
	
	Select objectdata(a0,2)
	Case 0
	Case 1
		objectpitch(a0)=5.0*Sin(leveltimer*1.5 Mod 360.0)
		objectyaw(a0)=5.0*Sin(leveltimer/2 Mod 360)
		objectroll(a0)=5.0*Sin(leveltimer Mod 360)
	Case 2
		objectscalezadjust(a0)=1.0+Sin(leveltimer*4 Mod 360)*0.15
		objectroll(a0)=5.0*Sin(leveltimer*2 Mod 360)
	Case 3
		objectyaw(a0)=objectyaw(a0)+3.0
	End Select
End Function

Function controlparticleemitters(a0)
	
	If objectactive(a0)=0 Then
		Return 0
	End If
	Select objectsubtype(a0)
	Case 1
		If objectstatus(a0)=0 Then
			If Rand(0,400)<=objectdata(a0,1)*2 Then
				objectstatus(a0)=1
			End If
		Else
			If Rand(0,objectdata(a0,1)*200)<2 Then
				objectstatus(a0)=0
			End If
			Select objectdata(a0,2)
			Case 0
				If Rand(0,25)<objectdata(a0,1)*3-2 Then
					addparticle(objectdata(a0,0),objectxadjust(a0)+objecttilex(a0)+0.5,objectzadjust(a0),((-objectyadjust(a0))-objecttiley(a0))-0.5,0.0,0.2,0.0,0.03,0.0,0.0,0.01,0.0,0.0,0.0,100,3)
				End If
			Case 1
				If Rand(0,10)<objectdata(a0,1) Then
					addparticle(objectdata(a0,0),objectxadjust(a0)+objecttilex(a0)+0.5,objectzadjust(a0),((-objectyadjust(a0))-objecttiley(a0))-0.5,0.0,0.2,0.0,-0.03,0.0,0.0,0.01,0.0,0.0,0.0,100,3)
				End If
			Case 2
				If Rand(0,10)<objectdata(a0,1) Then
					addparticle(objectdata(a0,0),objectxadjust(a0)+objecttilex(a0)+0.5,objectzadjust(a0),((-objectyadjust(a0))-objecttiley(a0))-0.5,0.0,0.2,0.03,0.0,0.0,0.0,0.01,0.0,0.0,0.0,100,3)
				End If
			Case 3
				If Rand(0,10)<objectdata(a0,1) Then
					addparticle(objectdata(a0,0),objectxadjust(a0)+objecttilex(a0)+0.5,objectzadjust(a0),((-objectyadjust(a0))-objecttiley(a0))-0.5,0.0,0.2,-0.03,0.0,0.0,0.0,0.01,0.0,0.0,0.0,100,3)
				End If
			Case 4
				If Rand(0,10)<objectdata(a0,1) Then
					addparticle(objectdata(a0,0),objectxadjust(a0)+objecttilex(a0)+0.5,objectzadjust(a0),((-objectyadjust(a0))-objecttiley(a0))-0.5,0.0,0.2,0.0,0.0,0.03,0.0,0.01,0.0,0.0,0.0,100,3)
				End If
			Case 5
				If Rand(0,10)<objectdata(a0,1) Then
					addparticle(objectdata(a0,0),objectxadjust(a0)+objecttilex(a0)+0.5,objectzadjust(a0),((-objectyadjust(a0))-objecttiley(a0))-0.5,0.0,0.2,0.0,0.0,-0.03,0.0,0.01,0.0,0.0,0.0,100,3)
				End If
			End Select
		End If
	Case 2
		If Rand(0,1000)<=objectdata(a0,1)*2 Then
			addparticle(objectdata(a0,0),objectxadjust(a0)+objecttilex(a0)+0.5,objectzadjust(a0),((-objectyadjust(a0))-objecttiley(a0))-0.5,0.0,0.01,0.0,0.0,0.0,0.0,0.01,0.0,0.0,0.0,100,4)
		End If
	Case 3
		Select objectdata(a0,2)
		Case 0
			If Rand(0,12)<objectdata(a0,1)*3-2 Then
				addparticle(objectdata(a0,0),objectxadjust(a0)+objecttilex(a0)+0.5,objectzadjust(a0),((-objectyadjust(a0))-objecttiley(a0))-0.5,0.0,0.2,Rnd(-0.01,0.01),Rnd(0.05,0.07),Rnd(-0.01,0.01),0.0,0.001,0.0,-0.001,0.0,100,3)
			End If
		Case 1
			If Rand(0,12)<objectdata(a0,1)*3-2 Then
				addparticle(objectdata(a0,0),objectxadjust(a0)+objecttilex(a0)+0.5,objectzadjust(a0),((-objectyadjust(a0))-objecttiley(a0))-0.5,0.0,0.2,Rnd(-0.01,0.01),-Rnd(0.0,0.02),Rnd(-0.01,0.01),0.0,0.001,0.0,-0.001,0.0,100,3)
			End If
		Case 2
			If Rand(0,12)<objectdata(a0,1)*3-2 Then
				addparticle(objectdata(a0,0),objectxadjust(a0)+objecttilex(a0)+0.5,objectzadjust(a0),((-objectyadjust(a0))-objecttiley(a0))-0.5,0.0,0.2,Rnd(0.05,0.07),Rnd(0.02,0.01),Rnd(-0.01,0.01),0.0,0.001,0.0,-0.001,0.0,100,3)
			End If
		Case 3
			If Rand(0,12)<objectdata(a0,1)*3-2 Then
				addparticle(objectdata(a0,0),objectxadjust(a0)+objecttilex(a0)+0.5,objectzadjust(a0),((-objectyadjust(a0))-objecttiley(a0))-0.5,0.0,0.2,-Rnd(0.05,0.07),Rnd(0.02,0.01),Rnd(-0.01,0.01),0.0,0.001,0.0,-0.001,0.0,100,3)
			End If
		Case 4
			If Rand(0,12)<objectdata(a0,1)*3-2 Then
				addparticle(objectdata(a0,0),objectxadjust(a0)+objecttilex(a0)+0.5,objectzadjust(a0),((-objectyadjust(a0))-objecttiley(a0))-0.5,0.0,0.2,Rnd(-0.01,0.01),Rnd(0.02,0.01),Rnd(0.05,0.07),0.0,0.001,0.0,-0.001,0.0,100,3)
			End If
		Case 5
			If Rand(0,12)<objectdata(a0,1)*3-2 Then
				addparticle(objectdata(a0,0),objectxadjust(a0)+objecttilex(a0)+0.5,objectzadjust(a0),((-objectyadjust(a0))-objecttiley(a0))-0.5,0.0,0.2,Rnd(-0.01,0.01),Rnd(0.02,0.01),-Rnd(0.05,0.07),0.0,0.001,0.0,-0.001,0.0,100,3)
			End If
		End Select
	End Select
End Function

Function controlglovecharge(a0)
	
	objectz(a0)=0.04
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	v1=objectdata(a0,0)+16
	EntityFX objectentity(a0),2
	v2=0
	v3=0
	v4=0
	;v5=0
	For v5=0 To 3
		Select objectdata(a0,0)
		Case 0
			v2=255
		Case 1
			v2=255
			v3=100
		Case 2
			v2=255
			v3=255
		Case 3
			v3=255
		Case 4
			v3=255
			v4=255
		Case 5
			v4=255
		Case 6
			v2=255
			v4=255
		Case 7
			v2=255
			v4=255
			v3=255
		Case 8
			v2=128.0+Sin(leveltimer Mod 360)*120.0
			v3=128.0+Cos(leveltimer Mod 360)*120.0
			v4=128.0-(Sin(leveltimer Mod 360)*120.0)
		End Select
		VertexColor GetSurface(objectentity(a0),1),v5,v2,v3,v4,1.0
		;v5=v5+1
	Next
	objectdata(a0,3)=1
	v7=Rand(0,359)
	If objectdata(a0,1)=1 Then
		If leveltimer Mod 5=0 Then
			addparticle(v1,objecttilex(a0)+0.5+0.3*Sin(v7*3),0.0,((-objecttiley(a0))-0.5)-(0.3*Cos(v7*3)),0.0,0.2,0.0,0.03,0.0,4.0,0.0,0.0,0.0,0.0,50,3)
		End If
	Else If objectdata(a0,1)=0 Then
		If leveltimer Mod 2=0 Then
			addparticle(v1,objecttilex(a0)+0.5+0.3*Sin(v7*3),0.0,((-objecttiley(a0))-0.5)-(0.3*Cos(v7*3)),0.0,0.3,0.0,0.04,0.0,4.0,0.0,0.0,0.0,0.0,50,3)
		End If
	End If
	If (objecttilex(playerobject)=objecttilex(a0) And (objecttiley(playerobject)=objecttiley(a0))) Then
		If ((objectmovementtimer(playerobject)=0 And (objectdata(a0,1)<2)) And ((currentspell<>objectdata(a0,0) Or ((currentspell=objectdata(a0,0) And (currentspellpower<9)))))) Then
			;v8=0
			For v8=0 To 99
				If inventoryitem(v8)=1001 Then
					If (currentspellpower<8 Or (objectdata(a0,9)=0)) Then
						playsoundfx(80,-1,-1)
					End If
					objectdata(a0,9)=1
					addparticle(v1+16,objecttilex(a0)+0.5,0.0,(-objecttiley(a0))-0.5,0.0,0.9,0.0,0.04,0.0,0.0,0.0,0.0,0.0,0.0,75,4)
					addparticle(v1+16,objecttilex(a0)+0.5,2.0,(-objecttiley(a0))-0.5,0.0,0.9,0.0,-0.03,0.0,0.0,0.0,0.0,0.0,0.0,75,4)
					addparticle(v1+16,objecttilex(a0)+0.5,0.3,(-objecttiley(a0))-0.5,0.0,0.9,0.0,0.02,0.0,0.0,0.0,0.0,0.0,0.0,75,4)
					inventorytexture(v8)=objectdata(a0,0)+16
					currentspell=objectdata(a0,0)
					currentspellpower=9
					If objectdata(a0,1)=1 Then
						objectdata(a0,1)=2
					End If
					deleteicon(0)
					createicon(0,0,16+currentspell,1002+currentspell,"- 9 -","Activate")
				End If
				;v8=v8+1
			Next
		End If
	Else
		objectdata(a0,9)=0
	End If
End Function

Function createtransportermesh(a0)
	
	v1=CreateMesh(0)
	v2=CreateSurface(v1,0)
	v3=3
	AddVertex(v2,-0.495,0.01,0.495,v3*0.25+0.01,0.26,1.0)
	AddVertex(v2,0.495,0.01,0.495,v3*0.25+0.24,0.26,1.0)
	AddVertex(v2,-0.495,0.01,-0.495,v3*0.25+0.01,0.49,1.0)
	AddVertex(v2,0.495,0.01,-0.495,v3*0.25+0.24,0.49,1.0)
	AddTriangle(v2,0,1,2)
	AddTriangle(v2,1,3,2)
	AddVertex(v2,-0.25,0.02,0.25,a0 Mod 8*0.125+0.01,a0/8*0.125+0.51,1.0)
	AddVertex(v2,0.25,0.02,0.25,a0 Mod 8*0.125+0.115,a0/8*0.125+0.51,1.0)
	AddVertex(v2,-0.25,0.02,-0.25,a0 Mod 8*0.125+0.01,a0/8*0.125+0.51+0.115,1.0)
	AddVertex(v2,0.25,0.02,-0.25,a0 Mod 8*0.125+0.115,a0/8*0.125+0.51+0.115,1.0)
	AddTriangle(v2,4,5,6)
	AddTriangle(v2,5,7,6)
	;v4=0
	For v4=0 To 3
		Select v4
		Case 0
			v6#=-0.49
			v7#=0.49
			v8#=-0.49
			v9#=-0.49
		Case 1
			v6#=0.49
			v7#=0.49
			v8#=-0.49
			v9#=0.49
		Case 2
			v6#=0.49
			v7#=-0.49
			v8#=0.49
			v9#=0.49
		Case 3
			v6#=-0.49
			v7#=-0.49
			v8#=0.49
			v9#=-0.49
		End Select
		AddVertex(v2,v6#,0.0,v8#,v3*0.25+0.01,0.01,1.0)
		AddVertex(v2,v7#,0.0,v9#,v3*0.25+0.24,0.01,1.0)
		AddVertex(v2,v6#,-0.3,v8#,v3*0.25+0.01,0.24,1.0)
		AddVertex(v2,v7#,-0.3,v9#,v3*0.25+0.24,0.24,1.0)
		AddTriangle(v2,v4*4+8,v4*4+9,v4*4+10)
		AddTriangle(v2,v4*4+9,v4*4+11,v4*4+10)
		;v4=v4+1
	Next
	UpdateNormals v1
	EntityTexture v1,gatetexture,0,0
	Return v1
End Function

Function controltransporter(a0)
	
	If objectid(a0)=-1 Then
		objectid(a0)=objectdata(a0,0)*5+500+objectdata(a0,1)
	End If
	If ((objecttilex(a0)=0 And (objecttiley(a0)=0)) And (objectmovementtimer(a0)=0)) Then
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
	End If
	v1=objecttilex(a0)
	v2=objecttiley(a0)
	Select (objectdata(a0,2)+40) Mod 4
	Case 0
		v4=0
		v5=-1
	Case 1
		v4=-1
		v5=0
	Case 2
		v4=0
		v5=1
	Case 3
		v4=1
		v5=0
	End Select
	turnobjecttowarddirection(a0,v4,v5,20,180)
	v6=0
	v7=-1
	;v8=0
	For v8=0 To nofobjects-1
		If ((objectexists(v8)=1 And (objectbuttonpush(v8)=1)) And (a0<>v8)) Then
			If (((objecttilex(v8)=objecttilex(a0) And (objecttiley(v8)=objecttiley(a0))) And (objectmovementtimer(v8)=0)) And (objectlinked(a0)=-1)) Then
				If objectflying(v8)/10<>1 Then
					v6=1
					v7=v8
					If (objectdata(a0,8)>0 And (objectid(v8)<>objectdata(a0,8))) Then
						v6=0
					End If
				End If
			End If
		End If
		;v8=v8+1
	Next
	If objectactive(a0)=1001 Then
		If objectstatus(a0)=0 Then
			If v6=1 Then
				If (leveltilelogic(v1+v4,v2+v5)=2 And ((objecttilelogic(v1+v4,v2+v5)=0 Or ((objecttilelogic(v1+v4,v2+v5)=16.0 And (v7=playerobject)))))) Then
					playsoundfx(40,v1,v2)
					objectstatus(a0)=1
					leveltilelogic(v1,v2)=2
					objectlinked(v7)=a0
					objectlinkback(a0)=v7
					objectmovementspeed(a0)=50
					moveobjecttotile(a0,v1+v4,v2+v5)
					If objectlinkback(a0)>=0 Then
						occupyobjecttile(objectlinkback(a0),v1+v4,v2+v5)
					End If
				Else
					playsoundfx(41,v1,v2)
					objectstatus(a0)=2
					objectdata(a0,2)=(objectdata(a0,2)+2) Mod 4
				End If
			End If
		Else If objectstatus(a0)=1 Then
			If objectmovementtimer(a0)=0 Then
				v9=0
				If objectlinkback(a0)=-1 Then
					v9=1
				Else If objectlinkback(a0)=playerobject Then
					v9=1
				End If
				If (leveltilelogic(v1+v4,v2+v5)=2 And ((objecttilelogic(v1+v4,v2+v5)=0 Or ((objecttilelogic(v1+v4,v2+v5)=16.0 And (v9=1)))))) Then
					playsoundfx(40,v1,v2)
					moveobjecttotile(a0,v1+v4,v2+v5)
					If objectlinkback(a0)>=0 Then
						vacateobjecttile(objectlinkback(a0))
						If ((objectdata10(objectlinkback(a0))=-1 And (objecttype(objectlinkback(a0))=110)) And ((objectmovexgoal(objectlinkback(a0))<>objecttilex(objectlinkback(a0)) Or (objectmoveygoal(objectlinkback(a0))<>objecttiley(objectlinkback(a0)))))) Then
							objectdata10(objectlinkback(a0))=objectmovexgoal(objectlinkback(a0))+objectmoveygoal(objectlinkback(a0))*200
						End If
						objecttilex(objectlinkback(a0))=v1
						objecttiley(objectlinkback(a0))=v2
						objecttilex2(objectlinkback(a0))=v1
						objecttiley2(objectlinkback(a0))=v2
						objectmovexgoal(objectlinkback(a0))=v1
						objectmoveygoal(objectlinkback(a0))=v2
						occupyobjecttile(objectlinkback(a0),v1+v4,v2+v5)
					End If
				Else
					playsoundfx(41,v1,v2)
					If objectlinkback(a0)>=0 Then
						vacateobjecttile(objectlinkback(a0))
						objectlinked(objectlinkback(a0))=-1
						objecttilex(objectlinkback(a0))=v1
						objecttiley(objectlinkback(a0))=v2
						objecttilex2(objectlinkback(a0))=v1
						objecttiley2(objectlinkback(a0))=v2
						objectmovexgoal(objectlinkback(a0))=v1
						objectmoveygoal(objectlinkback(a0))=v2
						objectlinkback(a0)=-1
					End If
					objectstatus(a0)=2
					leveltilelogic(objecttilex(a0),objecttiley(a0))=4
					objectdata(a0,2)=(objectdata(a0,2)+2) Mod 4
				End If
			End If
		Else If objectstatus(a0)=2 Then
			If v6=0 Then
				objectstatus(a0)=3
			End If
		Else If objectstatus(a0)=3 Then
			If v6=0 Then
				objectstatus(a0)=0
			End If
		End If
	End If
End Function

Function activatetransporter(a0)
	
	If (objectactive(a0)<1001 Or (objectstatus(a0)=1)) Then
		Return 0
	End If
	v1=objecttilex(a0)
	v2=objecttiley(a0)
	Select (objectdata(a0,2)+40) Mod 4
	Case 0
		v4=0
		v5=-1
	Case 1
		v4=-1
		v5=0
	Case 2
		v4=0
		v5=1
	Case 3
		v4=1
		v5=0
	End Select
	v6=0
	If objectlinkback(a0)=-1 Then
		v6=1
	Else If objectlinkback(a0)=playerobject Then
		v6=1
	End If
	If (leveltilelogic(v1+v4,v2+v5)=2 And ((objecttilelogic(v1+v4,v2+v5)=0 Or ((objecttilelogic(v1+v4,v1+v5)=16.0 And (v6=1)))))) Then
		v7=0
		v8=-1
		;v9=0
		For v9=0 To nofobjects-1
			If ((objectexists(v9)=1 And (objectbuttonpush(v9)=1)) And (a0<>v9)) Then
				If (((objecttilex(v9)=objecttilex(a0) And (objecttiley(v9)=objecttiley(a0))) And (objectmovementtimer(v9)=0)) And (objectlinked(a0)=-1)) Then
					v7=1
					v8=v9
					If (objectdata(a0,8)>0 And (objectid(v9)<>objectdata(a0,8))) Then
						v7=0
					End If
				End If
			End If
			;v9=v9+1
		Next
		objectstatus(a0)=1
		leveltilelogic(v1,v2)=2
		playsoundfx(40,v1,v2)
		objectmovementspeed(a0)=50
		moveobjecttotile(a0,v1+v4,v2+v5)
		If v7=1 Then
			objectlinked(v8)=a0
			objectlinkback(a0)=v8
			occupyobjecttile(objectlinkback(a0),v1+v4,v2+v5)
		End If
	Else
		objectdata(a0,2)=(objectdata(a0,2)+2) Mod 4
	End If
End Function

Function redotransportertexture(a0)
	
	v1=GetSurface(objectentity(a0),1)
	v2=(objectid(a0)-500)/5
	;v3=0
	For v3=0 To 0
		VertexTexCoords v1,v3*8+4,v2 Mod 8*0.125+0.01,v2/8*0.125+0.51,1.0,0
		VertexTexCoords v1,v3*8+5,v2 Mod 8*0.125+0.115,v2/8*0.125+0.51,1.0,0
		VertexTexCoords v1,v3*8+6,v2 Mod 8*0.125+0.01,v2/8*0.125+0.51+0.115,1.0,0
		VertexTexCoords v1,v3*8+7,v2 Mod 8*0.125+0.115,v2/8*0.125+0.51+0.115,1.0,0
		;v3=v3+1
	Next
	UpdateNormals objectentity(a0)
End Function

Function controlturtle(a0)
	
	If objectfrozen(a0)=1 Then
		objectfrozen(a0)=1000
		objectpitch(a0)=Rand(-30,30)
		objectroll(a0)=Rand(-30,30)
		objectz(a0)=0.3
		AnimateMD2 objectentity(a0),0,0.01,1,2,0.0
		objectcurrentanim(a0)=0
	End If
	If objectfrozen(a0)=2 Then
		objectfrozen(a0)=0
		objectpitch(a0)=0.0
		objectroll(a0)=0.0
		objectz(a0)=0.0
	End If
	If objectfrozen(a0)>2 Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If objecttiletypecollision(a0)=0 Then
		objectyawadjust(a0)=0.0
		objectmovementspeed(a0)=25
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
		objecttiletypecollision(a0)=24093
		objectobjecttypecollision(a0)=64
		objectmovementtype(a0)=objectdata(a0,0)*2+41+objectdata(a0,1)
		createshadow(a0,0.9)
	End If
	v1=0
	v2=0
	If (objectmovementtype(a0)=41 Or (objectmovementtype(a0)=42)) Then
		v2=-1
	Else If (objectmovementtype(a0)=43 Or (objectmovementtype(a0)=44)) Then
		v1=1
	Else If (objectmovementtype(a0)=45 Or (objectmovementtype(a0)=46)) Then
		v2=1
	Else If (objectmovementtype(a0)=47 Or (objectmovementtype(a0)=48)) Then
		v1=-1
	End If
	turnobjecttowarddirection(a0,-v1,-v2,4,0)
	If objectstatus(a0)=0 Then
		If objectz(a0)<>0.0 Then
			objectz(a0)=0.0
		End If
		If objectmovementtimer(a0)>0 Then
			objectdata(a0,9)=0
			If objectcurrentanim(a0)<>1 Then
				AnimateMD2 objectentity(a0),1,1.0,1,30,0.0
				objectcurrentanim(a0)=1
			End If
		End If
		If (objectcurrentanim(a0)=1 And (objectmovementtimer(a0)=0)) Then
			objectdata(a0,9)=objectdata(a0,9)+1
			If objectdata(a0,9)=5 Then
				AnimateMD2 objectentity(a0),0,0.01,1,2,0.0
				objectcurrentanim(a0)=0
			End If
		End If
	End If
	If objectstatus(a0)=1 Then
		If objectz(a0)>-0.6 Then
			objectz(a0)=objectz(a0)-0.1
		End If
		If objectcurrentanim(a0)<>3 Then
			AnimateMD2 objectentity(a0),1,0.1,1,30,0.0
			objectcurrentanim(a0)=3
		End If
	End If
	If objectstatus(a0)=2 Then
		If objectz(a0)<-0.2 Then
			objectz(a0)=objectz(a0)+0.05
		End If
		If objectz(a0)>-0.25 Then
			objectz(a0)=objectz(a0)-0.05
		End If
		leveltilelogic(objecttilex(a0),objecttiley(a0))=0
	End If
End Function

Function controlfireflower(a0)
	
	If objectfrozen(a0)=1 Then
		objectfrozen(a0)=1000
		AnimateMD2 objectentity(a0),3,0.5,61,67,1.0
	End If
	If objectfrozen(a0)=2 Then
		objectfrozen(a0)=0
		AnimateMD2 objectentity(a0),1,0.2,1,20,1.0
		objecttimer(a0)=objecttimermax1(a0)
		objectdata(a0,2)=0
	End If
	If objectfrozen(a0)>2 Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If objectdata(a0,3)>objectdata(a0,4) Then
		objectdata(a0,4)=objectdata(a0,3)
	End If
	If objectdata(a0,3)<objectdata(a0,4) Then
		playsoundfx(104,objecttilex(a0),objecttiley(a0))
		objecttimer(a0)=objecttimermax1(a0)+30
		AnimateMD2 objectentity(a0),3,1.0,61,88,1.0
		objectdata(a0,2)=2
		objectdata(a0,4)=objectdata(a0,3)
	End If
	If ((objecttimer(a0)>=0 And (objectdata(a0,2)=0)) Or ((objectdata(a0,2)=2 And (objecttimer(a0)=objecttimermax1(a0))))) Then
		objectdata(a0,2)=1
		AnimateMD2 objectentity(a0),1,0.2,1,20,1.0
	End If
	If objectactive(a0)<1001 Then
		objecttimer(a0)=objecttimermax1(a0)
	End If
	objecttimer(a0)=objecttimer(a0)-1
	objectdata(a0,0)=(objectdata(a0,0)+80) Mod 8
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	objectyawadjust(a0)=0.0
	v1=objecttilex(a0)
	v2=objecttiley(a0)
	If ((objectactive(a0)>0 And (objectlastactive(a0)=0)) And ((waepisode<>1 Or (adventurecurrentnumber<>70)))) Then
		playsoundfx(102,objecttilex(a0),objecttiley(a0))
	End If
	If (((objecttilelogic(v1,v2) And (128)))=0 And (objectactive(a0)>0)) Then
		objecttilelogic(v1,v2)=objecttilelogic(v1,v2)+128.0
	End If
	If (((objecttilelogic(v1,v2) And (128)))=128.0 And (objectactive(a0)=0)) Then
		objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-128.0
	End If
	v3#=0.0
	v4#=0.0
	If objectsubtype(a0)=1 Then
		v3#=objectx(playerobject)-objectx(a0)
		v4#=objecty(playerobject)-objecty(a0)
		v5#=Sqr(v3#^2.0+v4#^2.0)
		v3#=v3#/v5#
		v4#=v4#/v5#
	Else
		If (objectdata(a0,0)>0 And (objectdata(a0,0)<4)) Then
			v3#=1.0
		End If
		If objectdata(a0,0)>4 Then
			v3#=-1.0
		End If
		If (objectdata(a0,0)<2 Or (objectdata(a0,0)>6)) Then
			v4#=-1.0
		End If
		If (objectdata(a0,0)>2 And (objectdata(a0,0)<6)) Then
			v4#=1.0
		End If
	End If
	If objecttimer(a0)>-10 Then
		turnobjecttowarddirection(a0,v3#,v4#,3,180)
	End If
	If objecttimer(a0)<0 Then
		If objecttimer(a0)=-10 Then
			objectdata(a0,8)=v3#*10000.0
			objectdata(a0,9)=v4#*10000.0
		End If
		If objectdata(a0,2)=1 Then
			AnimateMD2 objectentity(a0),1,0.5,21,60,1.0
			objectdata(a0,2)=0
		End If
		If objecttimer(a0)=-80 Then
			objecttimer(a0)=objecttimermax1(a0)
		End If
		If objecttimer(a0)=-60 Then
			v3#=objectdata(a0,8)/10000.0
			v4#=objectdata(a0,9)/10000.0
			createspellball(objecttilex(a0)+0.5+0.6*v3#,objecttiley(a0)+0.5+0.6*v4#,1.1,0.1*v3#,0.1*v4#,1-objectdata(a0,1),-1,-1,0,300)
			playsoundfx(103,objecttilex(a0),objecttiley(a0))
			If objectsubtype(a0)=2 Then
				objectdata(a0,0)=(objectdata(a0,0)+1) Mod 8
			End If
			If objectsubtype(a0)=3 Then
				objectdata(a0,0)=(objectdata(a0,0)-1) Mod 8
			End If
		End If
	End If
End Function

Function controlchomper(a0)
	
	;v1=0
	For v1=0 To nofobjects-1
		If (objecttype(v1)=1 Or (objecttype(v1)=120)) Then
			If (objectx(a0)-objectx(v1))^2.0+(objecty(a0)-objecty(v1))^2.0<0.5 Then
				destroyobject(v1,0)
			End If
		End If
		;v1=v1+1
	Next
	If objectfrozen(a0)=1 Then
		objectfrozen(a0)=1000
		AnimateMD2 objectentity(a0),0,0.01,1,2,0.0
		objectpitch(a0)=Rand(-30,30)
		objectroll(a0)=Rand(-30,30)
		objectz(a0)=0.3
		playsoundfx(86,objectx(a0),objecty(a0))
	End If
	If objectfrozen(a0)=2 Then
		objectfrozen(a0)=0
		AnimateMD2 objectentity(a0),1,0.6,1,29,0.0
		objectpitch(a0)=0.0
		objectroll(a0)=0.0
		objectz(a0)=0.0
	End If
	If objectfrozen(a0)>2 Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If objecttiletypecollision(a0)=0 Then
		AnimateMD2 objectentity(a0),1,0.6,1,29,0.0
		objectyawadjust(a0)=0.0
		objectmovementspeed(a0)=objectdata(a0,0)*5+20
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
		objecttiletypecollision(a0)=24089
		objectobjecttypecollision(a0)=74
		objectmovementtype(a0)=13
		If objectdata(a0,1)=1 Then
			objectobjecttypecollision(a0)=82
			EntityBlend objectentity(a0),3
		End If
		If objectdata(a0,1)=2 Then
			EntityFX objectentity(a0),1
		End If
	End If
	If objectdata(a0,1)=1 Then
		If leveltimer Mod 360<180 Then
			EntityAlpha objectentity(a0),Abs(Sin(leveltimer Mod 360))
		Else
			EntityAlpha objectentity(a0),0.3*Abs(Sin(leveltimer Mod 360))
		End If
	End If
	objectmovexgoal(a0)=objecttilex2(playerobject)
	objectmoveygoal(a0)=objecttiley2(playerobject)
	If objectmovementtimer(a0)>0 Then
		turnobjecttowarddirection(a0,objecttilex2(a0)-objecttilex(a0),objecttiley2(a0)-objecttiley(a0),3,180)
	Else
		turnobjecttowarddirection(a0,objecttilex(playerobject)-objecttilex(a0),objecttiley(playerobject)-objecttiley(a0),1,180)
	End If
	If (objectmovementtimer(a0)>0 And (objectdata10(a0)=0)) Then
		playsoundfx(101,objectx(a0),objecty(a0))
	End If
	objectdata10(a0)=objectmovementtimer(a0)
End Function

Function controlbowler(a0)
	
	;v1=0
	For v1=0 To nofobjects-1
		If (((((objecttype(v1)=1 Or (objecttype(v1)=120)) Or (objecttype(v1)=110)) Or (Floor(objecttype(v1)/10)=24.0)) Or (objecttype(v1)=400)) Or (objecttype(v1)=390)) Then
			If (objectx(a0)-objectx(v1))^2.0+(objecty(a0)-objecty(v1))^2.0<0.5 Then
				destroyobject(v1,0)
			End If
		End If
		;v1=v1+1
	Next
	If objectfrozen(a0)=1 Then
		objectfrozen(a0)=1000
		objectpitch(a0)=Rand(-30,30)
		objectroll(a0)=Rand(-30,30)
		objectz(a0)=0.3
	End If
	If objectfrozen(a0)=2 Then
		objectfrozen(a0)=0
		objectpitch(a0)=0.0
		objectroll(a0)=0.0
		objectz(a0)=0.0
	End If
	If objectfrozen(a0)>2 Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If objecttiletypecollision(a0)=0 Then
		objectdata(a0,0)=objectdata(a0,0) Mod 8
		objectyawadjust(a0)=0.0
		objectmovementspeed(a0)=objectdata(a0,2)*5+25
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
		objecttiletypecollision(a0)=24093
		objectobjecttypecollision(a0)=590
		If (objectdata(a0,1)=0 Or (objectdata(a0,1)=1)) Then
			objectmovementtype(a0)=objectdata(a0,0)*2+41+objectdata(a0,1)
		Else If objectdata(a0,1)=2 Then
			objectmovementtype(a0)=objectdata(a0,0)+71
		End If
	End If
	v2=objecttilex2(a0)-objecttilex(a0)
	v3=objecttiley2(a0)-objecttiley(a0)
	If (v2<>0 Or (v3<>0)) Then
		turnobjecttowarddirection(a0,v2,v3,4,180)
	End If
	objectpitch2(a0)=(objectpitch2(a0)+Rnd(3.0,5.0)) Mod 360.0
	objectz(a0)=0.4+Sin(leveltimer*4 Mod 180)*0.4
	If leveltimer Mod 45=0 Then
		playsoundfx(109,objecttilex(a0),objecttiley(a0))
	End If
End Function

Function controlbutterfly(a0)
	
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	If objecttiletypecollision(a0)=0 Then
		objecttiletypecollision(a0)=-1
		If objectmodelname(a0)="!Busterfly" Then
			objectxscale(a0)=0.01
			objectyscale(a0)=0.01
			objectzscale(a0)=0.01
			objectroll2(a0)=90.0
			AnimateMD2 objectentity(a0),2,0.4,2,9,0.0
		Else
			EntityBlend objectentity(a0),3
		End If
		objectmovexgoal(a0)=objecttilex(a0)
		objectmoveygoal(a0)=objecttiley(a0)
		objectdata(a0,1)=Rand(0,360)
		objectdata(a0,2)=Rand(1,4)
	End If
	If (objecttilex(a0)=objectmovexgoal(a0) And (objecttiley(a0)=objectmoveygoal(a0))) Then
		If Rand(0,100)<30 Then
			objectdata(a0,3)=Rand(-1,1)
			objectdata(a0,4)=Rand(-1,1)
		End If
		v1=objecttilex(a0)+objectdata(a0,3)
		v2=objecttiley(a0)+objectdata(a0,4)
		If (((v1>=0 And (v2>=0)) And (v1<levelwidth)) And (v2<levelheight)) Then
			If (leveltilelogic(v1,v2)=0 And (objecttilelogic(v1,v2)=0)) Then
				If (((leveltilelogic(objecttilex(a0),v2)=0 Or (leveltilelogic(objecttilex(a0),v2)=2)) Or (leveltilelogic(objecttilex(a0),v2)=4)) And (objecttilelogic(objecttilex(a0),v2)=0)) Then
					If (((leveltilelogic(v1,objecttiley(a0))=0 Or (leveltilelogic(v1,objecttiley(a0))=2)) Or (leveltilelogic(v1,objecttiley(a0))=4)) And (objecttilelogic(v1,objecttiley(a0))=0)) Then
						objectmovexgoal(a0)=v1
						objectmoveygoal(a0)=v2
					End If
				End If
			End If
		End If
	End If
	If (objectmovexgoal(a0)+0.5>objectx(a0) And (objectdx(a0)<0.015)) Then
		objectdx(a0)=objectdx(a0)+0.001
	End If
	If (objectmovexgoal(a0)+0.5<objectx(a0) And (objectdx(a0)>-0.015)) Then
		objectdx(a0)=objectdx(a0)-0.001
	End If
	If (objectmoveygoal(a0)+0.5>objecty(a0) And (objectdy(a0)<0.015)) Then
		objectdy(a0)=objectdy(a0)+0.001
	End If
	If (objectmoveygoal(a0)+0.5<objecty(a0) And (objectdy(a0)>-0.015)) Then
		objectdy(a0)=objectdy(a0)-0.001
	End If
	objectx(a0)=objectx(a0)+objectdx(a0)
	objecty(a0)=objecty(a0)+objectdy(a0)
	If objectmodelname(a0)="!Busterfly" Then
		v3#=0.2*Sin((objectdata(a0,2)*(objectdata(a0,1)+leveltimer)) Mod 360)
		turnobjecttowarddirection(a0,objectdx(a0),objectdy(a0),2,90)
		objectz(a0)=0.4+v3#
	Else
		v3#=0.2*Sin((objectdata(a0,1)+leveltimer) Mod 360)
		objectz(a0)=0.4+v3#
		v4#=0.4+2.0*v3#
		If v4#<0.0 Then
			v4#=0.0
		End If
		objectxscale(a0)=v4#
		objectyscale(a0)=v4#
		objectzscale(a0)=v4#
		If leveltimer Mod 4=1 Then
			addparticle(Rand(24,30),objectx(a0)-(3.0*objectdx(a0)),objectz(a0),-objecty(a0)+3.0*objectdy(a0),0.0,0.3*v4#,0.0,0.0,0.0,3.0,0.0,0.0,0.0,0.0,15,3)
		End If
	End If
End Function

Function controlspring(a0)
	
	objectyawadjust(a0)=0.0
	objectz(a0)=0.5
	objectdata(a0,2)=(objectdata(a0,2)+80) Mod 8
	objectid(a0)=objectdata(a0,0)*5+500+objectdata(a0,1)
	v1=0
	v2=0
	If (objectdata(a0,2)>=1 And (objectdata(a0,2)<=3)) Then
		v1=1
	End If
	If (objectdata(a0,2)>=5 And (objectdata(a0,2)<=7)) Then
		v1=-1
	End If
	If (objectdata(a0,2)>=3 And (objectdata(a0,2)<=5)) Then
		v2=1
	End If
	If (objectdata(a0,2)<=1 Or (objectdata(a0,2)>=7)) Then
		v2=-1
	End If
	v3=Floor(objectx(a0))
	v4=Floor(objecty(a0))
	turnobjecttowarddirection(a0,v1,v2,10,180)
	;v5=0
	For v5=0 To nofobjects-1
		If (objectbuttonpush(v5)=1 And (objectmovementtimer(v5)=0)) Then
			If (((objecttilex(v5)=v3+v1 And (objecttiley(v5)=v4+v2)) And (objectdead(v5)=0)) And (objectexists(v5)=1)) Then
				v6=objecttiletypecollision(v5)
				If (objecttiletypecollision(v5) And (4))=0 Then
					objecttiletypecollision(v5)=objecttiletypecollision(v5)+4
				End If
				If canobjectmovetotile(v5,v1*2+v3,v2*2+v4,1,1)=1 Then
					objectflying(v5)=objectdata(a0,2)+10
				Else
					destroyobject(v5,0)
				End If
				objectdata(a0,4)=30
				objecttiletypecollision(v5)=v6
				playsoundfx(10,objecttilex(a0),objecttiley(a0))
			End If
		End If
		;v5=v5+1
	Next
	If objectdata(a0,4)>0 Then
		objectdata(a0,4)=objectdata(a0,4)-1
		objectxadjust(a0)=v1*objectdata(a0,4)/60.0
		objectyadjust(a0)=v2*objectdata(a0,4)/60.0
	End If
End Function

Function createpickupitemmesh(a0)
	
	v1=CreateMesh(0)
	v2=CreateSurface(v1,0)
	AddVertex(v2,0.0,0.1,0.0,0.9375,0.9375,1.0)
	v3#=0.3
	AddVertex(v2,v3#,0.1,0.5+v3#,0.875,0.875,1.0)
	AddVertex(v2,0.5+v3#,0.1,v3#,0.875,1.0,1.0)
	AddTriangle(v2,0,1,2)
	AddVertex(v2,0.5+v3#,0.1,-v3#,1.0,1.0,1.0)
	AddTriangle(v2,0,2,3)
	AddVertex(v2,v3#,0.1,(-0.5)-v3#,1.0,0.875,1.0)
	AddTriangle(v2,0,3,4)
	AddVertex(v2,-v3#,0.1,(-0.5)-v3#,0.875,0.875,1.0)
	AddTriangle(v2,0,4,5)
	AddVertex(v2,(-0.5)-v3#,0.1,-v3#,1.0,0.875,1.0)
	AddTriangle(v2,0,5,6)
	AddVertex(v2,(-0.5)-v3#,0.1,v3#,1.0,1.0,1.0)
	AddTriangle(v2,0,6,7)
	AddVertex(v2,-v3#,0.1,0.5+v3#,0.875,1.0,1.0)
	AddTriangle(v2,0,7,8)
	AddTriangle(v2,0,8,1)
	AddVertex(v2,-0.5,0.2,0.5,a0 Mod 8*0.125+0.013,Floor(a0 Mod 64/8)*0.125+0.013,1.0)
	AddVertex(v2,0.5,0.2,0.5,a0 Mod 8*0.125+0.1135,Floor(a0 Mod 64/8)*0.125+0.013,1.0)
	AddVertex(v2,-0.5,0.2,-0.5,a0 Mod 8*0.125+0.013,Floor(a0 Mod 64/8)*0.125+0.0945,1.0)
	AddVertex(v2,0.5,0.2,-0.5,a0 Mod 8*0.125+0.1135,Floor(a0 Mod 64/8)*0.125+0.0945,1.0)
	AddTriangle(v2,9,10,11)
	AddTriangle(v2,10,12,11)
	AddVertex(v2,0.0,1.5,0.0,0.9375,0.9375,1.0)
	AddTriangle(v2,13,1,2)
	AddTriangle(v2,13,2,3)
	AddTriangle(v2,13,3,4)
	AddTriangle(v2,13,4,5)
	AddTriangle(v2,13,5,6)
	AddTriangle(v2,13,6,7)
	AddTriangle(v2,13,7,8)
	AddTriangle(v2,13,8,1)
	;v4=0
	For v4=0 To 8
		VertexColor v2,v4,255.0,255.0,255.0,0.5
		;v4=v4+1
	Next
	VertexColor v2,13,255.0,255.0,255.0,0.5
	EntityFX v1,34
	ScaleMesh v1,0.5,0.5,0.5
	UpdateNormals v1
	Return v1
End Function

Function controlpickupitem(a0)
	
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	objectyaw(a0)=(objectyaw(a0)+2.0) Mod 360.0
	objectpitch2(a0)=10.0*Sin(leveltimer Mod 360)
	If objectactive(a0)=1001 Then
		If (((objecttilex(a0)=objecttilex(playerobject) And (objecttiley(a0)=objecttiley(playerobject))) And (objectmovementtimer(playerobject)<500)) Or (((objecttilex(a0)=objecttilex2(playerobject) And (objecttiley(a0)=objecttiley2(playerobject))) And (objectmovementtimer(playerobject)>=500)))) Then
			If inventorysize^2.0>v1 Then
				If (objecttilelogic(objecttilex(a0),objecttiley(a0)) And (16))>0 Then
					objecttilelogic(objecttilex(a0),objecttiley(a0))=objecttilelogic(objecttilex(a0),objecttiley(a0))-16.0
				End If
				destroyobject(a0,0)
				;v2=0
				For v2=0 To 29
					v3=v2*12
					v4#=0.02
					addparticle(Rand(16,23),objectx(a0)+0.1*Sin(v3),0.0,(-objecty(a0))-(0.1*Cos(v3)),0.0,0.5,v4#*Sin(v3),0.05,(-v4#)*Cos(v3),1.0,0.0,0.0,0.0,0.0,50,3)
					;v2=v2+1
				Next
				If ((currentspell=0 And (objectdata(a0,0)>1000)) And (objectdata(a0,0)<2000)) Then
					selectspell((objectdata(a0,0)-1001)/10+1,-1)
				Else
					additemtoinventory(-1,objectdata(a0,0),objectdata(a0,1),objectdata(a0,2),objecttextdata(a0,0),objecttextdata(a0,1))
				End If
				iconsize(8)=601
				;v2=0
				For v2=0 To 359 Step 10
					addparticle2(16,1.74+0.5*Sin(v2),1.63+0.5*Cos(v2),5.0,0.0,0.08,(-0.01)*Sin(v2),(-0.01)*Cos(v2),0.0,0.0,-0.001,0.0,0.0,0.0,50,2)
					;v2=v2+10
				Next
			End If
		End If
	Else
	End If
End Function

Function createspellball(a0#,a1#,a2#,a3#,a4#,a5,a6,a7,a8,a9)
	
	If (a0#<0.0 Or (a1#<0.0)) Then
		Delay 10000
	End If
	playsoundfx(82,a0#,a1#)
	v1=createnewobject()
	objectmodelname(v1)="!SpellBall"
	objecttexturename(v1)=""
	objectentity(v1)=createspellballmesh(a5 Mod 10)
	objectx(v1)=a0#
	objecty(v1)=a1#
	objectz(v1)=a2#
	objecttilex(v1)=Floor(a0#)
	objecttiley(v1)=Floor(a1#)
	objecttype(v1)=50
	objectsubtype(v1)=a5
	objectid(v1)=-1
	objectstatus(v1)=a8
	objectactive(v1)=1001
	objectdx(v1)=a3#
	objectdy(v1)=a4#
	objecttiletypecollision(v1)=32285
	objectobjecttypecollision(v1)=-1
	objectdata(v1,0)=a6
	objectdata(v1,1)=a7
	objectdata(v1,2)=objecttilex(v1)
	objectdata(v1,3)=objecttiley(v1)
	If (waepisode=1 And ((adventurecurrentnumber>=212 And (adventurecurrentnumber<=214)))) Then
		a9=a9*2
	End If
	objecttimer(v1)=a9
End Function

Function createspellballmesh(a0)
	
	v1=CreateSphere(4,0)
	Select a0
	Case 7,8
		EntityColor v1,255.0,255.0,255.0
	Case 0
		EntityColor v1,255.0,120.0,0.0
	Case 1
		EntityColor v1,255.0,180.0,50.0
	Case 2
		EntityColor v1,255.0,255.0,50.0
	Case 3
		EntityColor v1,50.0,255.0,50.0
	Case 4
		EntityColor v1,100.0,200.0,255.0
	Case 5
		EntityColor v1,50.0,50.0,255.0
	Case 6
		EntityColor v1,255.0,50.0,255.0
	End Select
	ScaleMesh v1,0.15,0.15,0.15
	EntityBlend v1,3
	Return v1
End Function

Function controlspellball(a0)
	
	objecttimer(a0)=objecttimer(a0)-1
	If objecttimer(a0)=0 Then
		destroyobject(a0,0)
		Return 0
	End If
	objectx(a0)=objectx(a0)+objectdx(a0)
	If leveltilelogic(Floor(objectx(a0)),Floor(objecty(a0)))=13 Then
		playsoundfx(88,objecttilex(a0),objecttiley(a0))
		objectdx(a0)=-objectdx(a0)
		objectx(a0)=objectx(a0)+objectdx(a0)
	End If
	objecty(a0)=objecty(a0)+objectdy(a0)
	If leveltilelogic(Floor(objectx(a0)),Floor(objecty(a0)))=13 Then
		playsoundfx(88,objecttilex(a0),objecttiley(a0))
		objectdy(a0)=-objectdy(a0)
		objecty(a0)=objecty(a0)+objectdy(a0)
	End If
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	If objectsubtype(a0)=0 Then
		v1#=0.05
		If (objectx(a0)<objectx(playerobject) And (objectdx(a0)<v1#)) Then
			objectdx(a0)=objectdx(a0)+0.001
		End If
		If (objectx(a0)>objectx(playerobject) And (objectdx(a0)>-v1#)) Then
			objectdx(a0)=objectdx(a0)-0.001
		End If
		If (objecty(a0)<objecty(playerobject) And (objectdy(a0)<v1#)) Then
			objectdy(a0)=objectdy(a0)+0.001
		End If
		If (objecty(a0)>objecty(playerobject) And (objectdy(a0)>-v1#)) Then
			objectdy(a0)=objectdy(a0)-0.001
		End If
		If objectdx(a0)>v1# Then
			objectdx(a0)=v1#
		End If
		If objectdx(a0)<-v1# Then
			objectdx(a0)=-v1#
		End If
		If objectdy(a0)>v1# Then
			objectdy(a0)=v1#
		End If
		If objectdy(a0)<-v1# Then
			objectdy(a0)=-v1#
		End If
	End If
	If objectsubtype(a0)<8 Then
		v2=objectsubtype(a0)+24
	Else
		v2=Rand(24,31)
	End If
	If leveltimer Mod 2=0 Then
		addparticle(v2,objectx(a0)+Rnd(-0.1,0.1),objectz(a0)+Rnd(-0.1,0.1),-objecty(a0)+Rnd(-0.1,0.1),0.0,0.5,0.0,0.0,0.0,3.0,0.01,0.0,0.0,0.0,75,3)
	End If
	v3#=0.0
	v4#=0.0
	;v5=0
	For v5=0 To 3
		v3#=(2.0*Floor(v5/2)-1.0)*0.1
		If v5=1 Then
			v4#=-0.1
		End If
		If v5=3 Then
			v4#=0.1
		End If
		v6=Floor(objectx(a0)+v3#)
		v7=Floor(objecty(a0)+v4#)
		If (canobjectmovetotile(a0,v6,v7,0,1)=0 And ((v6<>objectdata(a0,2) Or (v7<>objectdata(a0,3))))) Then
			destroyobject(a0,0)
			If objecttimer(a0)<0 Then
				;v8=1
				For v8=1 To 360 Step 16
					addparticle(v2-8,objectx(a0)+0.2*Sin(v8*3),Rnd(0.0,1.0),(-objecty(a0))-(0.2*Cos(v8*3)),0.0,0.25,0.01*Sin(v8*3),Rnd(0.01,0.02),(-0.01)*Cos(v8*3),1.0,0.0,0.0,0.0,0.0,Rand(30,40),3)
					;v8=v8+16
				Next
			End If
			If objectstatus(a0)=1 Then
				playercontrolmode=6
			End If
			Return 0
		End If
		;v5=v5+1
	Next
	;v5=0
	For v5=0 To nofobjects-1
		If (((objectx(a0)-objectx(v5))^2.0+(objecty(a0)-objecty(v5))^2.0<0.3 And (objectexists(v5)=1)) And (objectactive(v5)>0)) Then
			v9=0
			Select objecttype(v5)
			Case 1
				If objectsubtype(a0)<2 Then
					destroyobject(v5,1)
				End If
				v9=1
			Case 110,390,400
				If objectsubtype(a0)<2 Then
					destroyobject(v5,1)
				End If
				If objectsubtype(a0)=4 Then
					createiceblock(objectx(v5),objecty(v5),v5)
				End If
				v9=1
			Case 120
				If objectsubtype(a0)<2 Then
					destroyobject(v5,1)
				End If
				If objectsubtype(a0)=4 Then
					createiceblock(objectx(v5),objecty(v5),v5)
				End If
				v9=1
			Case 150
				If objectsubtype(a0)<2 Then
					destroyobject(v5,1)
				End If
				If objectsubtype(a0)=4 Then
					createiceblock(objectx(v5),objecty(v5),v5)
				End If
				v9=1
			Case 170,171,172,173,174,175,176,177,178,179,425
				v9=1
			Case 220
				If objectstatus(v5)=0 Then
					v9=1
				End If
				If (objectsubtype(a0)=4 And (objectstatus(v5)=0)) Then
					createiceblock(objectx(v5),objecty(v5),v5)
					v9=1
				End If
			Case 230
				If objectsubtype(a0)<2 Then
					destroyobject(v5,1)
				End If
				If objectsubtype(a0)=4 Then
					createiceblock(objectx(v5),objecty(v5),v5)
				End If
				v9=1
			Case 240,241,242
				If objectsubtype(a0)<2 Then
					destroyobject(v5,1)
				End If
				v9=1
			Case 370
				If objectstatus(v5)=0 Then
					If objectsubtype(a0)<2 Then
						If objectsubtype(v5)=0 Then
							If objectdata(v5,1)>1 Then
								vacateobjecttile(v5)
								objectdata(v5,1)=1
								occupyobjecttile(v5,objecttilex2(v5),objecttiley2(v5))
							Else
								objectdata(v5,1)=1
							End If
							objectmovementtype(v5)=14
							If (objectdata(v5,1)=2 Or (objectdata(v5,1)=3)) Then
								AnimateMD2 objectentity(v5),3,-0.5,49,31,0.0
								objectcurrentanim(v5)=5
								playsoundfx(116,objectx(a0),objecty(a0))
							End If
						Else If (objectdata(v5,1)=0 Or (objectdata(v5,1)=1)) Then
							vacateobjecttile(v5)
							objectdata(v5,1)=3
							occupyobjecttile(v5,objecttilex2(v5),objecttiley2(v5))
							playsoundfx(117,objectx(a0),objecty(a0))
							objectmovementtype(v5)=0
							AnimateMD2 objectentity(v5),3,0.5,31,49,0.0
							objectcurrentanim(v5)=4
						End If
					End If
					If objectsubtype(a0)=4 Then
						createiceblock(objectx(v5),objecty(v5),v5)
					End If
					v9=1
				End If
			Case 250,260,290,420,422,423
				If objectsubtype(a0)<2 Then
					destroyobject(v5,1)
				End If
				If objectsubtype(a0)=4 Then
					createiceblock(objectx(v5),objecty(v5),v5)
				End If
				v9=1
			Case 330
				If objectsubtype(a0)<2 Then
					destroyobject(v5,1)
				End If
				v9=1
			Case 340,421
				If (leveltilelogic(Floor(objectx(v4)),Floor(objecty(v4)))<>13 And (objectactive(v4)>1)) Then
					v8=1
				End If
			End Select
			If v9=1 Then
				destroyobject(a0,0)
				If objecttimer(a0)<0 Then
					;v8=1
					For v8=1 To 360 Step 16
						addparticle(v2-8,objectx(a0)+0.2*Sin(v8*3),Rnd(0.0,1.0),(-objecty(a0))-(0.2*Cos(v8*3)),0.0,0.25,0.01*Sin(v8*3),Rnd(0.01,0.02),(-0.01)*Cos(v8*3),1.0,0.0,0.0,0.0,0.0,Rand(30,40),3)
						;v8=v8+16
					Next
				End If
				If objectstatus(a0)=1 Then
					playercontrolmode=6
				End If
				Return 0
			End If
		End If
		;v5=v5+1
	Next
	If (((objecttilex(a0)=objectdata(a0,0) And (objecttiley(a0)=objectdata(a0,1))) And (Abs((objectx(a0)-objecttilex(a0))-0.5)<0.25)) And (Abs((objecty(a0)-objecttiley(a0))-0.5)<0.25)) Then
		Select objectsubtype(a0)
		Case 2
			;v5=0
			For v5=0 To nofobjects-1
				If ((objecttype(v5)=90 And (objectactive(v5)=1001)) And (objectdata(v5,8)=0)) Then
					If (objecttilex(v5)=objectdata(a0,0) And (objecttiley(v5)=objectdata(a0,1))) Then
						activatebutton(v5)
					End If
				End If
				If (objecttype(v5)=210 And (objectactive(v5)=1001)) Then
					If (objecttilex(v5)=objectdata(a0,0) And (objecttiley(v5)=objectdata(a0,1))) Then
						activatetransporter(v5)
					End If
				End If
				If (objecttype(v5)=40 And (objectactive(v5)=1001)) Then
					If (objecttilex(v5)=objectdata(a0,0) And (objecttiley(v5)=objectdata(a0,1))) Then
						deactivateobject(v5)
					End If
				End If
				;v5=v5+1
			Next
		Case 4
			If (leveltilelogic(objectdata(a0,0),objectdata(a0,1))=2 And (objecttilelogic(objectdata(a0,0),objectdata(a0,1))=0)) Then
				createicefloat(objectdata(a0,0),objectdata(a0,1))
			End If
		Case 6
			If objectdead(playerobject)=0 Then
				playsoundfx(81,-1,-1)
				vacateobjecttile(playerobject)
				objectx(playerobject)=objectdata(a0,0)+0.5
				objecty(playerobject)=objectdata(a0,1)+0.5
				objecttilex(playerobject)=objectdata(a0,0)
				objecttiley(playerobject)=objectdata(a0,1)
				objecttilex2(playerobject)=objectdata(a0,0)
				objecttiley2(playerobject)=objectdata(a0,1)
				objectmovexgoal(playerobject)=objectdata(a0,0)
				objectmoveygoal(playerobject)=objectdata(a0,1)
				occupyobjecttile(playerobject,objecttilex(playerobject),objecttiley(playerobject))
				If objectstatus(a0)=1 Then
					playercontrolmode=6
				End If
				Animate GetChild(objectentity(playerobject),3),1,0.05,10,0.0
				objectcurrentanim(playerobject)=10
			End If
		End Select
		destroyobject(a0,0)
		If objecttimer(a0)<0 Then
			;v8=1
			For v8=1 To 360 Step 4
				addparticle(v2-8,objectdata(a0,0)+0.5+0.2*Sin(v8*3),Rnd(0.0,1.0),((-objectdata(a0,1))-0.5)-(0.2*Cos(v8*3)),0.0,0.5,0.01*Sin(v8*3),Rnd(0.01,0.02),(-0.01)*Cos(v8*3),1.0,0.0,0.0,0.0,0.0,Rand(30,75),3)
				;v8=v8+4
			Next
		End If
	End If
End Function

Function createiceblock(a0#,a1#,a2)
	
	If objectfrozen(a2)>0 Then
		Return 0
	End If
	playsoundfx(83,a0#,a1#)
	v1=createnewobject()
	objectmodelname(v1)="!IceBlock"
	objecttexturename(v1)=""
	objectentity(v1)=createiceblockmesh()
	objecttexture(v1)=0
	objectdestructiontype(v1)=1
	objectx(v1)=a0#
	objecty(v1)=a1#
	objectactive(v1)=501
	objectactivationspeed(v1)=20
	objectactivationtype(v1)=2
	objectdx(v1)=0.0
	objectdy(v1)=0.0
	PositionEntity objectentity(v1),objectx(v1),0.5,-objecty(v1),0
	objectchild(v1)=a2
	objectdata(v1,1)=objectz(a2)*1000.0
	objectdata(v1,2)=Rand(-6,6)
	objecttype(v1)=60
	vacateobjecttile(a2)
	If objectlinked(a2)>=0 Then
		If objecttype(objectlinked(a2))=210 Then
			v2=objecttilex(a2)
			v3=objecttiley(a2)
			objecttilex(a2)=objecttilex2(objectlinked(a2))
			objecttiley(a2)=objecttiley2(objectlinked(a2))
			vacateobjecttile(a2)
			objecttilex(a2)=objecttilex(objectlinked(a2))
			objecttiley(a2)=objecttiley(objectlinked(a2))
			vacateobjecttile(a2)
			objecttilex(a2)=v2
			objecttiley(a2)=v3
		End If
	End If
	If objectmovementtimer(a2)>0 Then
		v2=objecttilex(a2)
		v3=objecttiley(a2)
		objecttilex(a2)=objecttilex2(a2)
		objecttiley(a2)=objecttiley2(a2)
		vacateobjecttile(a2)
		objecttilex(a2)=v2
		objecttiley(a2)=v3
	End If
	objectfrozen(a2)=1
	If objectmovementtimer(a2)>0 Then
		occupyobjecttile(a2,objecttilex2(a2),objecttiley2(a2))
	Else
		occupyobjecttile(a2,objecttilex(a2),objecttiley(a2))
	End If
	If objecttype(a2)=110 Then
		objectdata(v1,0)=objectdata(a2,1)
		activatecommand(62,objectid(a2),-1,1,-1)
	End If
End Function

Function createiceblockmesh()
	
	v1=CreateCube(0)
	ScaleMesh v1,0.52,0.75,0.52
	PositionMesh v1,0.0,0.75,0.0
	EntityAlpha v1,0.5
	EntityBlend v1,3
	EntityColor v1,100.0,255.0,255.0
	Return v1
End Function

Function controliceblock(a0)
	
	v1=objectchild(a0)
	objectx(a0)=objectx(v1)
	objecty(a0)=objecty(v1)
	If objectfrozen(objectchild(a0))=0 Then
		playsoundfx(84,objectx(a0),objecty(a0))
		objectfrozen(v1)=1
		vacateobjecttile(v1)
		If objectmovementtimer(v1)>0 Then
			v2=objecttilex(v1)
			v3=objecttiley(v1)
			objecttilex(v1)=objecttilex2(v1)
			objecttiley(v1)=objecttiley2(v1)
			vacateobjecttile(v1)
			objecttilex(v1)=v2
			objecttiley(v1)=v3
		End If
		objectfrozen(v1)=0
		occupyobjecttile(v1,objecttilex(v1),objecttiley(v1))
		If objecttype(objectchild(a0))=110 Then
			objectdata(objectchild(a0),1)=objectdata(a0,0)
			activatecommand(62,objectid(objectchild(a0)),-1,objectdata(objectchild(a0),1),-1)
		End If
		objectchild(a0)=-1
		destroyobject(a0,0)
	End If
End Function

Function createicefloat(a0,a1)
	
	v1=createnewobject()
	playsoundfx(83,a0,a1)
	objectmodelname(v1)="!IceFloat"
	objecttexturename(v1)=""
	objectentity(v1)=createicefloatmesh()
	objecttexture(v1)=0
	objectdestructiontype(v1)=0
	objectactive(v1)=501
	objectactivationspeed(v1)=20
	objectactivationtype(v1)=2
	leveltilelogic(a0,a1)=14
	objecttype(v1)=300
	objectx(v1)=a0+0.5
	objecty(v1)=a1+0.5
	objecttilex(v1)=a0
	objecttiley(v1)=a1
	objectdata(v1,1)=Rand(0,360)
	objectdata(v1,2)=Rand(-3,3)
	objectdata(v1,3)=Rand(-3,3)
End Function

Function createicefloatmesh()
	
	v1=CreateCylinder(16,1,0)
	ScaleMesh v1,0.45,0.05,0.45
	PositionMesh v1,0.0,-0.1,0.0
	EntityAlpha v1,0.8
	EntityColor v1,255.0,255.0,255.0
	Return v1
End Function

Function controlicefloat(a0)
	
	If objectdata(a0,0)>0 Then
		objectdata(a0,0)=objectdata(a0,0)-1
		If objectdata(a0,0)=0 Then
			If leveltilelogic(objecttilex(a0),objecttiley(a0))=14 Then
				leveltilelogic(objecttilex(a0),objecttiley(a0))=2
			End If
			destroyobject(a0,0)
		End If
	End If
	objectpitch(a0)=objectdata(a0,2)*2*Sin((objectdata(a0,1)+leveltimer) Mod 360)
	objectroll(a0)=objectdata(a0,3)*3*Cos((objectdata(a0,1)+leveltimer) Mod 360)
End Function

Function controlrubberducky(a0)
	
	If objecttiletypecollision(a0)=0 Then
		objecttiletypecollision(a0)=-1
		objectobjecttypecollision(a0)=-1
		objectmovexgoal(a0)=objecttilex(a0)
		objectmoveygoal(a0)=objecttiley(a0)
		objectdata(a0,1)=Rand(1,3)
		objectdata(a0,2)=Rand(0,360)
		objectmovementspeed(a0)=4
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
	End If
	If objectdata(a0,0)=1 Then
		If objectmovementtimer(a0)=0 Then
			If Rand(0,1000)<30 Then
				objectdata(a0,3)=Rand(-1,1)
				objectdata(a0,4)=Rand(-1,1)
				v1=objecttilex(a0)+objectdata(a0,3)
				v2=objecttiley(a0)+objectdata(a0,4)
				If (((v1>=0 And (v2>=0)) And (v1<levelwidth)) And (v2<levelheight)) Then
					If (leveltilelogic(v1,v2)=2 And (objecttilelogic(v1,v2)=0)) Then
						If (leveltilelogic(objecttilex(a0),v2)=2 And (objecttilelogic(objecttilex(a0),v2)=0)) Then
							If (leveltilelogic(v1,objecttiley(a0))=2 And (objecttilelogic(v1,objecttiley(a0))=0)) Then
								moveobjecttotile(a0,v1,v2)
								objectmovexgoal(a0)=v1
								objectmoveygoal(a0)=v2
							End If
						End If
					End If
				End If
			End If
		Else
			turnobjecttowarddirection(a0,objecttilex2(a0)-objecttilex(a0),objecttiley2(a0)-objecttiley(a0),2,0)
			If Rand(0,100)<5 Then
				addparticle(4,objectx(a0),-0.4,-objecty(a0),0.0,0.1,0.0,0.0,0.0,0.0,0.004,0.0,0.0,0.0,100,4)
			End If
		End If
	Else
		turnobjecttowarddirection(a0,objectx(playerobject)-objectx(a0),objecty(playerobject)-objecty(a0),2,0)
	End If
	objectroll2(a0)=objectdata(a0,1)*1*Sin((objectdata(a0,2)+leveltimer) Mod 360)
	objectpitch2(a0)=objectdata(a0,1)*2*Cos((leveltimer*3+objectdata(a0,2)) Mod 360)
	If Rand(0,1500)<3 Then
		SoundPitch soundfx(121),Rand(19000,22000)
		playsoundfx(121,objectx(a0),objecty(a0))
	End If
	If leveltilelogic(Floor(objectx(a0)),Floor(objecty(a0)))<>2 Then
		destroyobject(a0,0)
	End If
End Function

Function createvoidmesh()
	
	v1=CreateMesh(0)
	v2=CreateSurface(v1,0)
	;v3=0
	For v3=0 To 17
		AddVertex(v2,0.5*Sin(v3*20),1.0,0.5*Cos(v3*20),v3*0.0555,0.0,1.0)
		AddVertex(v2,0.1*Sin(v3*20),0.0,0.1*Cos(v3*20),v3*0.0555,1.0,1.0)
		;v3=v3+1
	Next
	;v3=0
	For v3=0 To 16
		AddTriangle(v2,v3*2,v3*2+2,v3*2+1)
		AddTriangle(v2,v3*2+2,v3*2+3,v3*2+1)
		AddTriangle(v2,v3*2+1,v3*2+2,v3*2)
		AddTriangle(v2,v3*2+1,v3*2+3,v3*2+2)
		;v3=v3+1
	Next
	AddTriangle(v2,34,0,35)
	AddTriangle(v2,0,1,35)
	AddTriangle(v2,35,0,34)
	AddTriangle(v2,35,1,1)
	;v3=0
	For v3=0 To 17
		AddVertex(v2,0.7*Sin(v3*20),0.5,0.7*Cos(v3*20),v3*0.0555,0.0,1.0)
		AddVertex(v2,0.15*Sin(v3*20),0.0,0.15*Cos(v3*20),v3*0.0555,1.0,1.0)
		;v3=v3+1
	Next
	;v3=18
	For v3=18 To 34
		AddTriangle(v2,v3*2,v3*2+2,v3*2+1)
		AddTriangle(v2,v3*2+2,v3*2+3,v3*2+1)
		AddTriangle(v2,v3*2+1,v3*2+2,v3*2)
		AddTriangle(v2,v3*2+1,v3*2+3,v3*2+2)
		;v3=v3+1
	Next
	AddTriangle(v2,70,36,71)
	AddTriangle(v2,36,37,71)
	AddTriangle(v2,71,36,70)
	AddTriangle(v2,71,37,36)
	UpdateNormals v1
	EntityBlend v1,3
	EntityTexture v1,voidtexture,0,0
	Return v1
End Function

Function controlvoid(a0)
	
	If objectdata(a0,0)=0 Then
		objectdata(a0,0)=Rand(1,360)
	End If
	objectz(a0)=-0.2
	PositionTexture voidtexture,leveltimer/10 Mod 100/100.0,leveltimer/10 Mod 100/100.0
	If objectactive(a0)>0 Then
		leveltilelogic(Floor(objectx(a0)),Floor(objecty(a0)))=1
		If objectlastactive(a0)=0 Then
			camerashaketimer=120
			playsoundfx(122,-1,-1)
		End If
		If leveltimer Mod 400=0 Then
			playsoundfx(123,objectx(a0),objecty(a0))
		End If
	Else
		leveltilelogic(Floor(objectx(a0)),Floor(objecty(a0)))=0
	End If
	objectxscale(a0)=((Sin((objectdata(a0,0)+leveltimer) Mod 360))*0.4+0.8)*(1.0+objectdata(a0,2))
	objectyscale(a0)=((Sin((objectdata(a0,0)+leveltimer) Mod 360))*0.4+0.8)*(1.0+objectdata(a0,2))
	objectzscale(a0)=1.3+Sin((leveltimer*2+objectdata(a0,0)) Mod 360)*0.6
	TurnEntity objectentity(a0),0.0,0.1,0.0,0
	v1=GetSurface(objectentity(a0),1)
	;a0=0
	For a0=0 To 17
		VertexCoords v1,a0*2,VertexX(v1,a0*2),1.0+Sin(a0*80+leveltimer*4 Mod 360)*0.6,VertexZ(v1,a0*2)
		;a0=a0+1
	Next
	;a0=18
	For a0=18 To 35
		VertexCoords v1,a0*2,VertexX(v1,a0*2),0.5+Sin(a0*160+leveltimer*4 Mod 360)*0.4,VertexZ(v1,a0*2)
		;a0=a0+1
	Next
End Function

Function controltentacle(a0)
	
	If objectdata(a0,0)=0 Then
		objectdata(a0,0)=Rand(-10,10)
	End If
	TurnEntity GetChild(objectentity(a0),3),0.0,objectdata(a0,0)/10.0,0.0,0
	v1=Floor(objectx(a0))
	v2=Floor(objecty(a0))
	v3=0
	;v4=0
	For v4=0 To nofobjects-1
		If ((objecttype(v4)=1 Or (objecttype(v4)=110)) Or (objecttype(v4)=120)) Then
			If (Abs(objecttilex(v4)-Floor(objectx(a0)))<3.0 And (Abs(objecttiley(v4)-Floor(objecty(a0)))<3.0)) Then
				v3=1
				v4=nofobjects
			End If
		End If
		;v4=v4+1
	Next
	If v3=1 Then
		If objectactive(a0)>1 Then
			If objectactive(a0)=1001 Then
				playsoundfx(112,Floor(objectx(a0)),Floor(objecty(a0)))
			End If
			objectactive(a0)=objectactive(a0)-80
			If objectactive(a0)<1 Then
				objectactive(a0)=1
			End If
			If objectactive(a0)=1 Then
				If (objecttilelogic(v1,v2) And (32))>0 Then
					objecttilelogic(v1,v2)=objecttilelogic(v1,v2)-32.0
				End If
			End If
		End If
	Else
		If (objectactive(a0)<1001 And ((objectactive(a0)>1 Or (objecttilelogic(Floor(objectx(a0)),Floor(objecty(a0)))=0)))) Then
			If objectactive(a0)=1 Then
				playsoundfx(111,Floor(objectx(a0)),Floor(objecty(a0)))
			End If
			objectactive(a0)=objectactive(a0)+20
			If (objecttilelogic(v1,v2) And (32))=0 Then
				objecttilelogic(v1,v2)=objecttilelogic(v1,v2)+32.0
			End If
		End If
	End If
End Function

Function controlcrab(a0)
	
	If objecttiletypecollision(a0)=0 Then
		If objectsubtype(a0)=0 Then
			objecttiletypecollision(a0)=24089
			objectobjecttypecollision(a0)=64
			Select objectdata(a0,1)
			Case 0
				objectmovementtype(a0)=0
			Case 1
				objectmovementtype(a0)=32
			Case 2,3
				objectmovementtype(a0)=0
				AnimateMD2 objectentity(a0),3,1.0,48,49,0.0
			End Select
			objectxscale(a0)=0.006
			objectyscale(a0)=0.006
			objectzscale(a0)=0.006
		Else
			objecttiletypecollision(a0)=24093
			objectobjecttypecollision(a0)=64
			Select objectdata(a0,1)
			Case 0
				objectmovementtype(a0)=32
			Case 1
				objectmovementtype(a0)=0
			Case 2,3
				objectmovementtype(a0)=0
				AnimateMD2 objectentity(a0),3,1.0,48,49,0.0
			End Select
		End If
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
		objecttilex2(a0)=Floor(objectx(a0))
		objecttiley2(a0)=Floor(objecty(a0))
		objectmovementtimer(a0)=0
		objectcurrentanim(a0)=0
		objectmovementspeed(a0)=40
	End If
	If objectfrozen(a0)>0 Then
		AnimateMD2 objectentity(a0),2,0.01,1,2,0.0
		objectcurrentanim(a0)=0
	Else If ((objectmovementtimer(a0)=0 And ((objectcurrentanim(a0)=0 Or (objectcurrentanim(a0)=3)))) And (objectdata(a0,1)<2)) Then
		AnimateMD2 objectentity(a0),2,Rnd(0.02,0.04),1,13,0.0
		objectcurrentanim(a0)=1
	Else If objectcurrentanim(a0)=2 Then
		objectcurrentanim(a0)=3
	Else If (objectmovementtimer(a0)>0 And (((objectcurrentanim(a0)=0 Or (objectcurrentanim(a0)=1)) Or (objectcurrentanim(a0)=20)))) Then
		AnimateMD2 objectentity(a0),1,1.0,1,30,0.0
		objectcurrentanim(a0)=2
	Else If (objectcurrentanim(a0)>=5 And (objectcurrentanim(a0)<20)) Then
		objectcurrentanim(a0)=objectcurrentanim(a0)+1
	End If
	If objectfrozen(a0)=1 Then
		objectfrozen(a0)=objectfrozen(a0)*1000
		objectpitch(a0)=Rand(-30,30)
		objectroll(a0)=Rand(-30,30)
		objectz(a0)=0.3
	End If
	If objectfrozen(a0)=2 Then
		objectfrozen(a0)=0
		objectpitch(a0)=0.0
		objectroll(a0)=0.0
		objectz(a0)=0.0
		objectcurrentanim(a0)=0
		objectdata(a0,1)=0
		If objectsubtype(a0)=1 Then
			objectmovementtype(a0)=32
		End If
	End If
	If (objectfrozen(a0)>2 Or (objectfrozen(a0)<0)) Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If (((objectstatus(a0)=0 And (objectmovementtimer(a0)=0)) And (Abs(objectx(a0)-objectx(playerobject))<0.5)) And (Abs(objecty(a0)-objecty(playerobject))<0.5)) Then
		v3=1
		v4=1
		If Rand(0,100)<50 Then
			v3=-1
		End If
		If Rand(0,100)<50 Then
			v4=-1
		End If
		;v5=-1
		For v5=-1 To 1
			;v6=-1
			For v6=-1 To 1
				If ((v5<>0 Or (v6<>0)) And (canobjectmovetotile(a0,objecttilex(a0)+v5*v3,objecttiley(a0)+v6*v4,1,1)=1)) Then
					moveobjecttotile(a0,objecttilex(a0)+v5*v3,objecttiley(a0)+v6*v4)
					objectmovexgoal(a0)=objecttilex(a0)+v5*v3
					objectmoveygoal(a0)=objecttiley(a0)+v6*v4
					v5=2
					v6=2
				End If
				;v6=v6+1
			Next
			;v5=v5+1
		Next
	End If
	If objectstatus(a0)=0 Then
		Select objectdata(a0,1)
		Case 0
			If (objectsubtype(a0)=0 And (objectstatus(a0)=0)) Then
				If (Abs(objecttilex(a0)-objecttilex(playerobject))<4 And (Abs(objecttiley(a0)-objecttiley(playerobject))<6)) Then
					objectmovementtype(a0)=14
				End If
			End If
		Case 1
			If (objectsubtype(a0)=1 And (objectstatus(a0)=0)) Then
				If (Abs(objecttilex(a0)-objecttilex(playerobject))<4 And (Abs(objecttiley(a0)-objecttiley(playerobject))<6)) Then
					objectmovementtype(a0)=14
				End If
			End If
		Case 2
			If (Abs(objecttilex(a0)-objecttilex(playerobject))<4 And (Abs(objecttiley(a0)-objecttiley(playerobject))<4)) Then
				vacateobjecttile(a0)
				objectdata(a0,1)=0
				occupyobjecttile(a0,objecttilex2(a0),objecttiley2(a0))
				If objectsubtype(a0)=0 Then
					objectmovementtype(a0)=14
				Else
					objectmovementtype(a0)=32
				End If
				AnimateMD2 objectentity(a0),3,-0.5,49,31,0.0
				objectcurrentanim(a0)=5
				SoundPitch soundfx(116),Rand(39000,42000)
				playsoundfx(116,objectx(a0),objecty(a0))
			End If
		End Select
	End If
	If (objectcaged(a0)=1 And (objectdata(a0,0)=0)) Then
		objectdata(a0,0)=1
		nofcrabsinadventure=nofcrabsinadventure-1
		playsoundfx(101,objecttilex(a0),objecttiley(a0))
		addparticle(14,objecttilex(a0)+0.5,1.6,(-objecttiley(a0))-0.5,0.0,1.0,0.0,0.01,0.0,0.0,0.01,0.0,0.0,0.0,50,3)
		playerscore=playerscore+100
		currentadventurescore=currentadventurescore+100
	End If
	If (objectcaged(a0)=0 And (objectdata(a0,0)=1)) Then
		objectdata(a0,0)=0
		nofcrabsinadventure=nofcrabsinadventure+1
		playerscore=playerscore-100
		currentadventurescore=currentadventurescore-100
		If objectmovementtimer(a0)=0 Then
			v3=1
			v4=1
			If Rand(0,100)<50 Then
				v3=-1
			End If
			If Rand(0,100)<50 Then
				v4=-1
			End If
			;v5=-1
			For v5=-1 To 1
				;v6=-1
				For v6=-1 To 1
					If canobjectmovetotile(a0,objecttilex(a0)+v5*v3,objecttiley(a0)+v6*v4,1,1)=1 Then
						moveobjecttotile(a0,objecttilex(a0)+v5*v3,objecttiley(a0)+v6*v4)
						objectmovexgoal(a0)=objecttilex(a0)+v5*v3
						objectmoveygoal(a0)=objecttiley(a0)+v6*v4
						v5=2
						v6=2
					End If
					;v6=v6+1
				Next
				;v5=v5+1
			Next
		End If
	End If
	If objectmovementtype(a0)=14 Then
		objectmovexgoal(a0)=objecttilex(playerobject)
		objectmoveygoal(a0)=objecttiley(playerobject)
	End If
	If objectstatus(a0)=2 Then
		objectz(a0)=-0.1
		leveltilelogic(objecttilex(a0),objecttiley(a0))=0
	End If
	If (objectstatus(a0)=0 And (objectdata(a0,1)<2)) Then
		objectz(a0)=0.0
		If objectmovementtimer(a0)>0 Then
			turnobjecttowarddirection(a0,-(objecttilex2(a0)-objecttilex(a0)),-(objecttiley2(a0)-objecttiley(a0)),10,0)
		Else
			turnobjecttowarddirection(a0,-(objectx(playerobject)-objectx(a0)),-(objecty(playerobject)-objecty(a0)),6,0)
		End If
	End If
	If (objectmovementtimer(a0)>0 And (objectdata10(a0)=0)) Then
		If objectsubtype(a0)=0 Then
			SoundPitch soundfx(115),20000
		Else
			SoundPitch soundfx(115),18000
		End If
		SoundVolume soundfx(115),0.1
		playsoundfx(115,objectx(a0),objecty(a0))
	End If
	objectdata10(a0)=objectmovementtimer(a0)
End Function

Function controlkaboom(a0)
	
	If objectfrozen(a0)=1 Then
		objectfrozen(a0)=objectfrozen(a0)*1000
		objectcurrentanim(a0)=11
		AnimateMD2 objectentity(a0),3,2.0,31,50,0.0
	End If
	If objectfrozen(a0)=2 Then
		objectfrozen(a0)=0
		objectcurrentanim(a0)=10
		AnimateMD2 objectentity(a0),0,0.2,1,2,0.0
	End If
	If (objectfrozen(a0)>2 Or (objectfrozen(a0)<0)) Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If objecttiletypecollision(a0)=0 Then
		objectdata10(a0)=-1
		objecttiletypecollision(a0)=23065
		objectobjecttypecollision(a0)=64
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
		objecttilex2(a0)=Floor(objectx(a0))
		objecttiley2(a0)=Floor(objecty(a0))
		objectactivationspeed(a0)=50
		If (objectmovexgoal(a0)=0 And (objectmoveygoal(a0)=0)) Then
			objectmovexgoal(a0)=Floor(objectx(a0))
			objectmoveygoal(a0)=Floor(objecty(a0))
			objectcurrentanim(a0)=10
			AnimateMD2 objectentity(a0),0,0.2,1,2,0.0
		End If
	End If
	If objectdead(a0)=1 Then
		objectyaw(a0)=(objectyaw(a0)+10.0) Mod 360.0
		objectz(a0)=objectz(a0)+0.01
		Return 0
	End If
	If objectdead(a0)=3 Then
		objectyaw(a0)=0.0
		objectz(a0)=objectz(a0)-0.005
		Return 0
	End If
	If objectactive(a0)=0 Then
		HideEntity objectentity(a0)
	Else
		ShowEntity objectentity(a0)
	End If
	v1=maximum2(Abs(objecttilex(a0)-objecttilex(playerobject)),Abs(objecttiley(a0)-objecttiley(playerobject)))
	If ((objectexclamation(a0)>=100 And (objectexclamation(a0)<200)) And (v1>4)) Then
		objectexclamation(a0)=objectexclamation(a0)-100
	End If
	If ((objectexclamation(a0)>=0 And (objectexclamation(a0)<100)) And (v1<4)) Then
		addparticle(objectexclamation(a0),objecttilex(a0)+0.5,1.3,(-objecttiley(a0))-0.5,0.0,0.5,0.0,0.0125,0.0,0.0,0.004,0.0,-0.0001,0.0,150,3)
		objectexclamation(a0)=objectexclamation(a0)+100
	End If
	If (((gamemode<>8 Or (dialogobject1<>a0)) And (objectlinked(a0)=-1)) And (objectdata10(a0)>=0)) Then
		objectmovexgoal(a0)=objectdata10(a0) Mod 200
		objectmoveygoal(a0)=objectdata10(a0)/200
		objectmovementtype(a0)=10
		objectdata10(a0)=-1
	End If
	If (gamemode=8 And (dialogobject1=a0)) Then
		If (objectcurrentanim(a0)<>10 And (objectcurrentanim(a0)<>16)) Then
			objectcurrentanim(a0)=10
			AnimateMD2 objectentity(a0),0,0.2,1,2,0.0
		End If
		objectz(a0)=0.0
	Else If objectmovementtype(a0)>0 Then
		If objectmovementtimer(a0)=0 Then
			objectdata(a0,9)=objectdata(a0,9)+1
		End If
		If objectmovementtimer(a0)>0 Then
			objectdata(a0,9)=0
		End If
		objectz(a0)=0.0
		If objectdata(a0,9)>10 Then
			AnimateMD2 objectentity(a0),0,0.2,1,2,0.0
			objectcurrentanim(a0)=10
			turnobjecttowarddirection(a0,-(objecttilex(a0)-objectmovexgoal(a0)),-(objecttiley(a0)-objectmoveygoal(a0)),4,-objectyawadjust(a0))
		Else
			If objectcurrentanim(a0)<>1 Then
				AnimateMD2 objectentity(a0),1,1.5,1,30,0.0
				objectcurrentanim(a0)=1
			End If
			turnobjecttowarddirection(a0,-(objecttilex(a0)-objecttilex2(a0)),-(objecttiley(a0)-objecttiley2(a0)),4,-objectyawadjust(a0))
		End If
		If ((objectmovementtimer(a0)=0 And (objecttilex(a0)=objectmovexgoal(a0))) And (objecttiley(a0)=objectmoveygoal(a0))) Then
			objectmovementtype(a0)=0
			objectcurrentanim(a0)=10
			AnimateMD2 objectentity(a0),0,0.2,1,2,0.0
		End If
	Else If objectflying(a0)/10=1 Then
		If objectcurrentanim(a0)<>11 Then
			AnimateMD2 objectentity(a0),3,2.0,31,60,0.0
			objectcurrentanim(a0)=11
		End If
		turnobjecttowarddirection(a0,-(objecttilex(a0)-objecttilex2(a0)),-(objecttiley(a0)-objecttiley2(a0)),10,-objectyawadjust(a0))
	Else If objectflying(a0)/10=2 Then
		If objectcurrentanim(a0)<>11 Then
			AnimateMD2 objectentity(a0),3,2.0,31,60,0.0
			objectcurrentanim(a0)=11
		End If
	Else
		Select objectdata(a0,7) Mod 10
		Case 0
			If objectyaw(a0)<>0.0 Then
				turnobjecttowarddirection(a0,0.0,1.0,4,0)
			End If
		Case 1
			turnobjecttowarddirection(a0,objectx(playerobject)-objectx(a0),objecty(playerobject)-objecty(a0),6,-objectyawadjust(a0))
		Case 2
			objectyaw(a0)=(objectyaw(a0)-0.5) Mod 360.0
		Case 3
			objectyaw(a0)=(objectyaw(a0)-2.0) Mod 360.0
		Case 4
			objectyaw(a0)=(objectyaw(a0)+0.5) Mod 360.0
		Case 5
			objectyaw(a0)=(objectyaw(a0)+2.0) Mod 360.0
		End Select
		If objectdata(a0,7)/10=1 Then
			objectz(a0)=0.4*Abs(Sin(leveltimer*3.6 Mod 360.0))
		Else If objectdata(a0,7)/10=2 Then
			objectz(a0)=0.2*Abs(Sin(leveltimer*7.2 Mod 360.0))
		End If
		Select objectdata(a0,8)
		Case 0
			If objectcurrentanim(a0)<>10 Then
				objectcurrentanim(a0)=10
				AnimateMD2 objectentity(a0),0,0.2,1,2,0.0
			End If
		Case 1
			If objectcurrentanim(a0)<>13 Then
				objectcurrentanim(a0)=13
				AnimateMD2 objectentity(a0),3,0.5,31,50,0.0
			End If
		Case 2
			If (objectcurrentanim(a0)<>13 And (v1>3)) Then
				objectcurrentanim(a0)=13
				AnimateMD2 objectentity(a0),3,0.5,31,50,0.0
			End If
			If (objectcurrentanim(a0)<>113 And (v1<=3)) Then
				objectcurrentanim(a0)=113
				AnimateMD2 objectentity(a0),3,-0.5,50,31,0.0
			End If
		Case 3
			If objectcurrentanim(a0)=10 Then
				If (Rand(1,10)<5 And (leveltimer Mod 240=0)) Then
					objectcurrentanim(a0)=15
					AnimateMD2 objectentity(a0),2,0.5,55,70,0.0
				End If
			Else If leveltimer Mod 240=0 Then
				objectcurrentanim(a0)=10
				AnimateMD2 objectentity(a0),3,-0.2,70,53,0.0
			End If
		Case 4
			If objectcurrentanim(a0)<>15 Then
				objectcurrentanim(a0)=15
				AnimateMD2 objectentity(a0),2,0.5,59,70,0.0
			End If
		Case 5
			If objectcurrentanim(a0)<>16 Then
				objectcurrentanim(a0)=16
				AnimateMD2 objectentity(a0),2,0.5,31,50,0.0
			End If
		End Select
	End If
End Function

Function controlbabyboomer(a0)
	
	If objectfrozen(a0)=1 Then
		objectfrozen(a0)=objectfrozen(a0)*1000
		objectcurrentanim(a0)=11
		AnimateMD2 objectentity(a0),3,2.0,31,50,0.0
	End If
	If objectfrozen(a0)=2 Then
		objectfrozen(a0)=0
		objectcurrentanim(a0)=10
		AnimateMD2 objectentity(a0),0,0.2,1,2,0.0
	End If
	If (objectfrozen(a0)>2 Or (objectfrozen(a0)<0)) Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If objecttiletypecollision(a0)=0 Then
		objecttiletypecollision(a0)=24089
		objectobjecttypecollision(a0)=320
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
		objecttilex2(a0)=Floor(objectx(a0))
		objecttiley2(a0)=Floor(objecty(a0))
		objectmovementtype(a0)=0
		objectmovementtimer(a0)=0
		objectmovementspeed(a0)=35
		objectsubtype(a0)=1
		objectcurrentanim(a0)=3
	End If
	If objectdead(a0)=1 Then
		objectyaw(a0)=(objectyaw(a0)+10.0) Mod 360.0
		objectz(a0)=objectz(a0)+0.01
		objectsubtype(a0)=-2
		Return 0
	End If
	If objectdead(a0)=3 Then
		objectyaw(a0)=90.0
		objectz(a0)=objectz(a0)-0.005
		objectsubtype(a0)=-2
		Return 0
	End If
	If objectsubtype(a0)=-1 Then
		Return 0
	End If
	If objectdata(a0,8)=1 Then
		If Rand(0,100)<20 Then
			addparticle(23,objectx(a0),Rnd(0.7,0.8),-objecty(a0),0.0,0.05,Rnd(-0.005,0.005),Rnd(0.0,0.005),Rnd(-0.005,0.005),0.0,0.004,0.0,0.0,0.0,50,3)
		End If
	End If
	If objectdata(a0,8)>0 Then
		EntityTexture objectentity(a0),kaboomtexturesquint,0,0
		If (objectdata(a0,8) Mod 10=0 And (objectdata(a0,8)>=50)) Then
			SoundPitch soundfx(77),objectdata(a0,8)*75+44000
			playsoundfx(77,-1,-1)
		End If
		;v1=1
		For v1=1 To 5
			If Rand(0,100)<objectdata(a0,8) Then
				addparticle(Rand(16,18),objectx(a0),Rnd(0.7,0.8),-objecty(a0),0.0,0.1,Rnd(-0.02,0.02),Rnd(0.0,0.02),Rnd(-0.02,0.02),0.0,0.004,0.0,-0.0001,0.0,50,3)
			End If
			;v1=v1+1
		Next
	End If
	If objectdata(a0,8)>=50 Then
		EntityTexture objectentity(a0),kaboomtexturesquint,0,0
	Else
		EntityTexture objectentity(a0),kaboomtexture(1),0,0
	End If
	If ((objectcaged(a0)=1 And (objectsubtype(a0)<>4)) And (objectsubtype(a0)<>5)) Then
		playsoundfx(79,objecttilex(a0),objecttiley(a0))
		If objectsubtype(a0)=2 Then
			objectsubtype(a0)=5
		Else
			objectsubtype(a0)=4
		End If
		AnimateMD2 objectentity(a0),0,0.2,1,2,0.0
		objectcurrentanim(a0)=10
	End If
	If (objectcaged(a0)=0 And ((objectsubtype(a0)=4 Or (objectsubtype(a0)=5)))) Then
		objectsubtype(a0)=objectsubtype(a0)-3
		objectmovementtypedata(a0)=0
		If ((objectsubtype(a0)=2 And (objecttilex(a0)=objectmovexgoal(a0))) And (objecttiley(a0)=objectmoveygoal(a0))) Then
			v2=1
			v3=1
			If Rand(0,100)<50 Then
				v2=-1
			End If
			If Rand(0,100)<50 Then
				v3=-1
			End If
			;v4=-1
			For v4=-1 To 1
				;v5=-1
				For v5=-1 To 1
					If canobjectmovetotile(a0,objecttilex(a0)+v4*v2,objecttiley(a0)+v5*v3,1,1)=1 Then
						moveobjecttotile(a0,objecttilex(a0)+v4*v2,objecttiley(a0)+v5*v3)
						objectmovexgoal(a0)=objecttilex(a0)+v4*v2
						objectmoveygoal(a0)=objecttiley(a0)+v5*v3
						v4=2
						v5=2
					End If
					;v5=v5+1
				Next
				;v4=v4+1
			Next
		End If
	End If
	If objectcaged(a0)=1 Then
		turnobjecttowarddirection(a0,objecttilex(playerobject)-objecttilex(a0),objecttiley(playerobject)-objecttiley(a0),3,0)
		Return 0
	End If
	If objectmovementtype(a0)>0 Then
		If objectmovementtimer(a0)=0 Then
			objectdata(a0,9)=objectdata(a0,9)+1
		End If
		If objectmovementtimer(a0)>0 Then
			objectdata(a0,9)=0
		End If
		objectz(a0)=0.0
		If (objectcurrentanim(a0)<>1 And (objectdata(a0,9)<10)) Then
			AnimateMD2 objectentity(a0),1,1.5,1,30,0.0
			objectcurrentanim(a0)=1
		End If
		turnobjecttowarddirection(a0,-(objecttilex(a0)-objecttilex2(a0)),-(objecttiley(a0)-objecttiley2(a0)),4,-objectyawadjust(a0))
		If ((objectmovementtimer(a0)=0 And (objecttilex(a0)=objectmovexgoal(a0))) And (objecttiley(a0)=objectmoveygoal(a0))) Then
			If objectsubtype(a0)=2 Then
				objectmovementtype(a0)=0
				objectcurrentanim(a0)=10
			End If
			AnimateMD2 objectentity(a0),0,0.2,1,2,0.0
		End If
	Else If objectflying(a0)/10=1 Then
		If objectcurrentanim(a0)<>11 Then
			AnimateMD2 objectentity(a0),3,2.0,31,60,0.0
			objectcurrentanim(a0)=11
		End If
		turnobjecttowarddirection(a0,-(objecttilex(a0)-objecttilex2(a0)),-(objecttiley(a0)-objecttiley2(a0)),10,-objectyawadjust(a0))
	Else If objectflying(a0)/10=2 Then
		If objectcurrentanim(a0)<>11 Then
			AnimateMD2 objectentity(a0),3,2.0,31,60,0.0
			objectcurrentanim(a0)=11
		End If
	Else
		AnimateMD2 objectentity(a0),0,0.2,1,2,0.0
	End If
	If objectdata(a0,9)=10 Then
		objectcurrentanim(a0)=10
		AnimateMD2 objectentity(a0),0,0.2,1,2,0.0
	End If
	If objectmovementtimer(a0)=0 Then
		If objectsubtype(a0)=1 Then
			objectmovexgoal(a0)=objecttilex(playerobject)
			objectmoveygoal(a0)=objecttiley(playerobject)
		End If
		If (objecttilelogic(objecttilex(a0),objecttiley(a0)) And (2))>0 Then
			If objectsubtype(a0)=2 Then
				playsoundfx(74,objecttilex(a0),objecttiley(a0))
			End If
			objectsubtype(a0)=1
			objectmovementtype(a0)=14
			v6=0
			v2=1
			v3=1
			If Rand(0,100)<50 Then
				v2=-1
			End If
			If Rand(0,100)<50 Then
				v3=-1
			End If
			;v4=-1
			For v4=-1 To 1
				;v5=-1
				For v5=-1 To 1
					If canobjectmovetotile(a0,objecttilex(a0)+v4*v2,objecttiley(a0)+v5*v3,1,1)=1 Then
						moveobjecttotile(a0,objecttilex(a0)+v4*v2,objecttiley(a0)+v5*v3)
						v4=2
						v5=2
						v6=1
					End If
					;v5=v5+1
				Next
				;v4=v4+1
			Next
			If v6=0 Then
				v4=objecttilex(playerobject)
				v5=objecttiley(playerobject)
				If (((v4<>objecttilex(a0) Or (v5<>objecttiley(a0))) And (Abs(v4-objecttilex(a0))<=1)) And (Abs(v5-objecttiley(a0))<=1)) Then
					v7=1
					If (objecttilelogic(v4,v5) And (2))>0 Then
						objecttilelogic(v4,v5)=objecttilelogic(v4,v5)-2.0
						If canobjectmovetotile(a0,v4,v5,1,1)=1 Then
							moveobjecttotile(a0,v4,v5)
							v6=1
						End If
						objecttilelogic(v4,v5)=objecttilelogic(v4,v5)+2.0
					End If
				End If
			End If
			If v6=0 Then
			End If
		End If
	End If
End Function

Function createflipbridgemesh(a0)
	
	v1=3
	v2=CreateMesh(0)
	v3=CreateSurface(v2,0)
	AddVertex(v3,-0.25,0.1,0.49,0.76,0.01,1.0)
	AddVertex(v3,0.25,0.1,0.49,1.0,0.01,1.0)
	AddVertex(v3,-0.25,0.1,-0.49,0.76,0.24,1.0)
	AddVertex(v3,0.25,0.1,-0.49,1.0,0.24,1.0)
	AddTriangle(v3,0,1,2)
	AddTriangle(v3,1,3,2)
	AddVertex(v3,-0.2,0.105,0.45,a0 Mod 8*0.125+0.01,a0/8*0.125+0.51,1.0)
	AddVertex(v3,-0.1,0.105,0.45,a0 Mod 8*0.125+0.115,a0/8*0.125+0.51,1.0)
	AddVertex(v3,-0.2,0.105,-0.45,a0 Mod 8*0.125+0.01,a0/8*0.125+0.51+0.115,1.0)
	AddVertex(v3,-0.1,0.105,-0.45,a0 Mod 8*0.125+0.115,a0/8*0.125+0.51+0.115,1.0)
	AddTriangle(v3,4,5,6)
	AddTriangle(v3,5,7,6)
	AddVertex(v3,0.1,0.105,0.45,a0 Mod 8*0.125+0.01,a0/8*0.125+0.51,1.0)
	AddVertex(v3,0.2,0.105,0.45,a0 Mod 8*0.125+0.115,a0/8*0.125+0.51,1.0)
	AddVertex(v3,0.1,0.105,-0.45,a0 Mod 8*0.125+0.01,a0/8*0.125+0.51+0.115,1.0)
	AddVertex(v3,0.2,0.105,-0.45,a0 Mod 8*0.125+0.115,a0/8*0.125+0.51+0.115,1.0)
	AddTriangle(v3,8,9,10)
	AddTriangle(v3,9,11,10)
	;v4=0
	For v4=0 To 3
		Select v4
		Case 0
			v6#=-0.25
			v7#=0.25
			v8#=-0.49
			v9#=-0.49
		Case 1
			v6#=0.25
			v7#=0.25
			v8#=-0.49
			v9#=0.49
		Case 2
			v6#=0.25
			v7#=-0.25
			v8#=0.49
			v9#=0.49
		Case 3
			v6#=-0.25
			v7#=-0.25
			v8#=0.49
			v9#=-0.49
		End Select
		AddVertex(v3,v6#,0.104,v8#,v1*0.25+0.01,0.01,1.0)
		AddVertex(v3,v7#,0.104,v9#,v1*0.25+0.24,0.01,1.0)
		AddVertex(v3,v6#,-0.4,v8#,v1*0.25+0.01,0.24,1.0)
		AddVertex(v3,v7#,-0.4,v9#,v1*0.25+0.24,0.24,1.0)
		AddTriangle(v3,v4*4+12,v4*4+13,v4*4+14)
		AddTriangle(v3,v4*4+13,v4*4+15,v4*4+14)
		;v4=v4+1
	Next
	UpdateNormals v2
	EntityTexture v2,gatetexture,0,0
	Return v2
End Function

Function redoflipbridgetexture(a0)
	
	v1=GetSurface(objectentity(a0),1)
	v2=(objectid(a0)-500)/5
	;v3=0
	For v3=0 To 1
		VertexTexCoords v1,v3*4+4,v2 Mod 8*0.125+0.01,v2/8*0.125+0.51,1.0,0
		VertexTexCoords v1,v3*4+5,v2 Mod 8*0.125+0.115,v2/8*0.125+0.51,1.0,0
		VertexTexCoords v1,v3*4+6,v2 Mod 8*0.125+0.01,v2/8*0.125+0.51+0.115,1.0,0
		VertexTexCoords v1,v3*4+7,v2 Mod 8*0.125+0.115,v2/8*0.125+0.51+0.115,1.0,0
		;v3=v3+1
	Next
	UpdateNormals objectentity(a0)
End Function

Function controlflipbridge(a0)
	
	objectyawadjust(a0)=0.0
	If objectid(a0)=-1 Then
		objectid(a0)=objectdata(a0,0)*5+500+objectdata(a0,1)
	End If
	objectscaleyadjust(a0)=1.0+5.6*objectactive(a0)/1001.0
	Select objectdata(a0,2)
	Case 0
		v2=0
		v3=-1
	Case 1
		v2=1
		v3=-1
	Case 2
		v2=1
		v3=0
	Case 3
		v2=1
		v3=1
	Case 4
		v2=0
		v3=1
	Case 5
		v2=-1
		v3=1
	Case 6
		v2=-1
		v3=0
	Case 7
		v2=-1
		v3=-1
	End Select
	turnobjecttowarddirection(a0,v2,v3,2,0)
End Function

Function activateflipbridge(a0)
	
	v1=1
	v2=Floor(objectx(a0))
	v3=Floor(objecty(a0))
	Select objectdata(a0,2)
	Case 0,4
		v5=0
		v6=-1
		v7=3
	Case 1,5
		v5=1
		v6=-1
		v7=2
	Case 2,6
		v5=1
		v6=0
		v7=3
	Case 3,7
		v5=1
		v6=1
		v7=2
	End Select
	;v8=1
	For v8=1 To v7
		If (leveltilelogic(v8*v5+v2,v8*v6+v3)<>2 And (leveltilelogic(v8*v5+v2,v8*v6+v3)<>5)) Then
			v1=0
		Else If (leveltilelogic(v2-(v8*v5),v3-(v8*v6))<>2 And (leveltilelogic(v2-(v8*v5),v3-(v8*v6))<>5)) Then
			v1=0
		Else If ((objecttilelogic(v8*v5+v2,v8*v6+v3)>0 And (objecttilelogic(v8*v5+v2,v8*v6+v3)<>1024.0)) Or ((objecttilelogic(v2-(v8*v5),v3-(v8*v6))>0 And (objecttilelogic(v2-(v8*v5),v3-(v8*v6))<>1024.0)))) Then
			v1=0
		End If
		;v8=v8+1
	Next
	If v1=0 Then
		objectactive(a0)=200
	Else
		objectactive(a0)=objectactive(a0)+objectactivationspeed(a0)+1
		If objectactive(a0)>1001 Then
			objectactive(a0)=1001
		End If
		;v8=1
		For v8=1 To v7
			objectdata(a0,3)=leveltilelogic(v2-(v8*v5),v3-(v8*v6))
			leveltilelogic(v2-(v8*v5),v3-(v8*v6))=0
			leveltilelogic(v8*v5+v2,v8*v6+v3)=0
			;v8=v8+1
		Next
	End If
End Function

Function deactivateflipbridge(a0)
	
	v1=Floor(objectx(a0))
	v2=Floor(objecty(a0))
	Select objectdata(a0,2)
	Case 0,4
		v4=0
		v5=-1
		v6=3
	Case 1,5
		v4=1
		v5=-1
		v6=2
	Case 2,6
		v4=1
		v5=0
		v6=3
	Case 3,7
		v4=1
		v5=1
		v6=2
	End Select
	objectactive(a0)=(objectactive(a0)-objectactivationspeed(a0))-1
	If objectactive(a0)<0 Then
		objectactive(a0)=0
	End If
	;v7=1
	For v7=1 To v6
		leveltilelogic(v1-(v7*v4),v2-(v7*v5))=objectdata(a0,3)
		leveltilelogic(v7*v4+v1,v7*v5+v2)=objectdata(a0,3)
		;v7=v7+1
	Next
End Function

Function turnflipbridge(a0,a1)
	
	v1=0
	v2=Floor(objectx(a0))
	v3=Floor(objecty(a0))
	v4=objectdata(a0,2)
	v5=1
	Select a1
	Case 1
		Select v4
		Case 0,4
			v8=1
			If ((checkflipbridgedestination(v5*1*v8+v2,v3-(3*v8)) And (checkflipbridgedestination(v5*2*v8+v2,v3-(3*v8)))) And (checkflipbridgedestination(v5*1*v8+v2,v3-(v8*2)))) Then
				v8=-1
				If ((checkflipbridgedestination(v5*1*v8+v2,v3-(3*v8)) And (checkflipbridgedestination(v5*2*v8+v2,v3-(3*v8)))) And (checkflipbridgedestination(v5*1*v8+v2,v3-(v8*2)))) Then
					v1=1
				End If
			End If
		Case 1,5
			v8=1
			If ((checkflipbridgedestination(3*v5*v8+v2,v3-(v8*2)) And (checkflipbridgedestination(v5*2*v8+v2,v3-(v8*1)))) And (checkflipbridgedestination(3*v5*v8+v2,v3-(v8*1)))) Then
				v8=-1
				If ((checkflipbridgedestination(3*v5*v8+v2,v3-(v8*2)) And (checkflipbridgedestination(v5*2*v8+v2,v3-(v8*1)))) And (checkflipbridgedestination(3*v5*v8+v2,v3-(v8*1)))) Then
					v1=1
				End If
			End If
		Case 2,6
			v8=1
			If ((checkflipbridgedestination(v5*2*v8+v2,v8*1+v3) And (checkflipbridgedestination(3*v5*v8+v2,v8*1+v3))) And (checkflipbridgedestination(3*v5*v8+v2,v8*2+v3))) Then
				v8=-1
				If ((checkflipbridgedestination(v5*2*v8+v2,v8*1+v3) And (checkflipbridgedestination(3*v5*v8+v2,v8*1+v3))) And (checkflipbridgedestination(3*v5*v8+v2,v8*2+v3))) Then
					v1=1
				End If
			End If
		Case 3,7
			v8=1
			If ((checkflipbridgedestination(v5*1*v8+v2,3*v8+v3) And (checkflipbridgedestination(v5*2*v8+v2,3*v8+v3))) And (checkflipbridgedestination(v5*1*v8+v2,v8*2+v3))) Then
				v8=-1
				If ((checkflipbridgedestination(v5*1*v8+v2,3*v8+v3) And (checkflipbridgedestination(v5*2*v8+v2,3*v8+v3))) And (checkflipbridgedestination(v5*1*v8+v2,v8*2+v3))) Then
					v1=1
				End If
			End If
		End Select
	Case 0
		Select v4
		Case 0,4
			v8=1
			If ((checkflipbridgedestination(v2-(v5*1*v8),v3-(3*v8)) And (checkflipbridgedestination(v2-(v5*2*v8),v3-(3*v8)))) And (checkflipbridgedestination(v2-(v5*1*v8),v3-(v8*2)))) Then
				v8=-1
				If ((checkflipbridgedestination(v2-(v5*1*v8),v3-(3*v8)) And (checkflipbridgedestination(v2-(v5*2*v8),v3-(3*v8)))) And (checkflipbridgedestination(v2-(v5*1*v8),v3-(v8*2)))) Then
					v1=1
				End If
			End If
		Case 1,5
			v8=1
			If ((checkflipbridgedestination(v5*2*v8+v2,v3-(3*v8)) And (checkflipbridgedestination(v5*1*v8+v2,v3-(v8*2)))) And (checkflipbridgedestination(v5*1*v8+v2,v3-(3*v8)))) Then
				v8=-1
				If ((checkflipbridgedestination(v5*2*v8+v2,v3-(3*v8)) And (checkflipbridgedestination(v5*1*v8+v2,v3-(v8*2)))) And (checkflipbridgedestination(v5*1*v8+v2,v3-(3*v8)))) Then
					v1=1
				End If
			End If
		Case 2,6
			v8=1
			If ((checkflipbridgedestination(v5*2*v8+v2,v3-(v8*1)) And (checkflipbridgedestination(3*v5*v8+v2,v3-(v8*1)))) And (checkflipbridgedestination(3*v5*v8+v2,v3-(v8*2)))) Then
				v8=-1
				If ((checkflipbridgedestination(v5*2*v8+v2,v3-(v8*1)) And (checkflipbridgedestination(3*v5*v8+v2,v3-(v8*1)))) And (checkflipbridgedestination(3*v5*v8+v2,v3-(v8*2)))) Then
					v1=1
				End If
			End If
		Case 3,7
			v8=1
			If ((checkflipbridgedestination(3*v5*v8+v2,v8*1+v3) And (checkflipbridgedestination(3*v5*v8+v2,v8*2+v3))) And (checkflipbridgedestination(v5*2*v8+v2,v8*1+v3))) Then
				v8=-1
				If ((checkflipbridgedestination(3*v5*v8+v2,v8*1+v3) And (checkflipbridgedestination(3*v5*v8+v2,v8*2+v3))) And (checkflipbridgedestination(v5*2*v8+v2,v8*1+v3))) Then
					v1=1
				End If
			End If
		End Select
	End Select
	v10=0
	If (objectactive(a0)>0 And (objectactive(a0) Mod 2=1)) Then
		v10=1
	End If
	If v10=1 Then
		deactivateflipbridge(a0)
	End If
	If a1=0 Then
		objectdata(a0,2)=(objectdata(a0,2)-1+8) Mod 8
	Else
		objectdata(a0,2)=(objectdata(a0,2)+1) Mod 8
	End If
	If v1=1 Then
		If v10=1 Then
			activateflipbridge(a0)
		End If
	End If
End Function

Function checkflipbridgedestination(a0,a1)
	
	If ((leveltilelogic(a0,a1)=2 Or (leveltilelogic(a0,a1)=5)) And (objecttilelogic(a0,a1)=0)) Then
		Return 1
	End If
	Return 0
End Function

Function controlretrozbotufo(a0)
	
	;v1=0
	For v1=0 To nofobjects-1
		If ((((objecttype(v1)=1 Or (objecttype(v1)=120)) Or (objecttype(v1)=400)) Or (objecttype(v1)=110)) Or (objecttype(v1)=390)) Then
			If (objectx(a0)-objectx(v1))^2.0+(objecty(a0)-objecty(v1))^2.0<0.5 Then
				destroyobject(v1,0)
			End If
		End If
		;v1=v1+1
	Next
	If objectfrozen(a0)=1  Then
		objectfrozen(a0)=objectfrozen(a0)*1000
		objectpitch(a0)=Rand(-30,30)
		objectroll(a0)=Rand(-30,30)
		objectz(a0)=0.3
		playsoundfx(86,objectx(a0),objecty(a0))
	End If
	If objectfrozen(a0)=2 Then
		objectfrozen(a0)=0
		objectpitch(a0)=0.0
		objectroll(a0)=0.0
		objectz(a0)=0.0
	End If
	If (objectfrozen(a0)>2 Or (objectfrozen(a0)<0)) Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If objecttiletypecollision(a0)=0 Then
		If objecttype(a0)=423 Then
			objectmovementspeed(a0)=60
		Else
			objectmovementspeed(a0)=20
		End If
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
		objecttiletypecollision(a0)=24125
		objectobjecttypecollision(a0)=74
		objectmovementtype(a0)=objectdata(a0,0)*2+41+objectdata(a0,1)
	End If
	If objecttype(a0)=423 Then
		If objectdata(a0,0)=0 Then
			turnobjecttowarddirection(a0,objecttilex2(a0)-objecttilex(a0),objecttiley2(a0)-objecttiley(a0),4,-180)
		Else If objectdata(a0,0)=1 Then
			turnobjecttowarddirection(a0,objecttilex2(a0)-objecttilex(a0),objecttiley2(a0)-objecttiley(a0),4,-90)
		Else If objectdata(a0,0)=2 Then
			turnobjecttowarddirection(a0,objecttilex2(a0)-objecttilex(a0),objecttiley2(a0)-objecttiley(a0),4,0)
		Else If objectdata(a0,0)=3 Then
			turnobjecttowarddirection(a0,objecttilex2(a0)-objecttilex(a0),objecttiley2(a0)-objecttiley(a0),4,90)
		End If
	Else
		objectyaw(a0)=objectyaw(a0)+2.0
	End If
	objectdata10(a0)=objectmovementtimer(a0)
	If objecttype(a0)=422 Then
		If objectdata(a0,3)>0 Then
			objectdata(a0,3)=objectdata(a0,3)-1
		Else
			If objecttilex(a0)=objecttilex(playerobject) Then
				If objecttiley(a0)<objecttiley(playerobject) Then
					If leveltilelogic(objecttilex(a0),objecttiley(a0)+1)<>1 Then
						createspellball(objectx(a0),objecty(a0)+0.5,0.5,0.0,0.1,1,-1,-1,0,300)
						objectdata(a0,3)=60
					End If
				Else If leveltilelogic(objecttilex(a0),objecttiley(a0)-1)<>1 Then
					createspellball(objectx(a0),objecty(a0)-0.5,0.5,0.0,-0.1,1,-1,-1,0,300)
					objectdata(a0,3)=60
				End If
			End If
			If objecttiley(a0)=objecttiley(playerobject) Then
				If objecttilex(a0)<objecttilex(playerobject) Then
					If leveltilelogic(objecttilex(a0)+1,objecttiley(a0))<>1 Then
						createspellball(objectx(a0)+0.5,objecty(a0),0.5,0.1,0.0,1,-1,-1,0,300)
						objectdata(a0,3)=60
					End If
				Else If leveltilelogic(objecttilex(a0)-1,objecttiley(a0))<>1 Then
					createspellball(objectx(a0)-0.5,objecty(a0),0.5,-0.1,0.0,1,-1,-1,0,300)
					objectdata(a0,3)=60
				End If
			End If
		End If
	End If
End Function

Function controlretrocoily(a0)
	
	;v1=0
	For v1=0 To nofobjects-1
		If ((((objecttype(v1)=1 Or (objecttype(v1)=120)) Or (objecttype(v1)=400)) Or (objecttype(v1)=110)) Or (objecttype(v1)=390)) Then
			If (objectx(a0)-objectx(v1))^2.0+(objecty(a0)-objecty(v1))^2.0<0.5 Then
				destroyobject(v1,0)
			End If
		End If
		;v1=v1+1
	Next
	If objectfrozen(a0)=1 Then
		objectfrozen(a0)=objectfrozen(a0)*1000
		objectpitch(a0)=Rand(-30,30)
		objectroll(a0)=Rand(-30,30)
		objectz(a0)=0.3
		playsoundfx(86,objectx(a0),objecty(a0))
	End If
	If objectfrozen(a0)=2 Then
		objectfrozen(a0)=0
		objectpitch(a0)=0.0
		objectroll(a0)=0.0
		objectz(a0)=0.0
	End If
	If (objectfrozen(a0)>2 Or (objectfrozen(a0)<0)) Then
		objectfrozen(a0)=objectfrozen(a0)-1
		Return 0
	End If
	If objecttiletypecollision(a0)=0 Then
		objectmovementspeed(a0)=30
		objecttilex(a0)=Floor(objectx(a0))
		objecttiley(a0)=Floor(objecty(a0))
		objecttiletypecollision(a0)=17929
		objectobjecttypecollision(a0)=74
		objectmovementtype(a0)=objectdata(a0,0)*2+41+objectdata(a0,1)
	End If
	objectyaw(a0)=objectyaw(a0)+2.0
	If objectmovementtimer(a0)=0 Then
		objectz(a0)=0.0
		v2=Rand(0,3)
		Select v2
		Case 0
			v4=0
			v5=-1
		Case 1
			v4=1
			v5=0
		Case 2
			v4=0
			v5=1
		Case 3
			v4=-1
			v5=0
		End Select
		If canobjectmovetotile(a0,objecttilex(a0)+v4,objecttiley(a0)+v5,0,1) Then
			moveobjecttotile(a0,objecttilex(a0)+v4,objecttiley(a0)+v5)
			playsoundfx(118,objectx(a0),objecty(a0))
		End If
	Else
		objectz(a0)=Sin(objectmovementtimer(a0)/1001.0*180.0)
	End If
End Function

Function controlretroscouge(a0)
	
	objecttimer(a0)=objecttimer(a0)-1
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	v1=objecttilex(a0)
	v2=objecttiley(a0)
	leveltilelogic(v1,v2)=1
	v3#=0.0
	v4#=0.0
	Select objectdata(a0,0)
	Case 0
		v3#=0.0
		v4#=-1.0
	Case 1
		v3#=1.0
		v4#=0.0
	Case 2
		v3#=0.0
		v4#=1.0
	Case 3
		v3#=-1.0
		v4#=0.0
	End Select
	If objecttimer(a0)<0 Then
		objecttimer(a0)=objecttimermax1(a0)
		If leveltilelogic(objecttilex(a0)+v3#,objecttiley(a0)+v4#)<>1 Then
			createspellball(objectx(a0)+0.6*v3#,objecty(a0)+0.6*v4#,0.5,0.1*v3#,0.1*v4#,1,-1,-1,0,300)
		End If
		playsoundfx(103,objecttilex(a0),objecttiley(a0))
	End If
End Function

Function controlretrorainbowcoin(a0)
	
	If objectactive(a0)<1001 Then
		objectyaw(a0)=objectyaw(a0)+10.0
		If objectactive(a0)>600 Then
			objectz(a0)=1.2+((1000-objectactive(a0))/400.0)
		Else
			objectz(a0)=2.2
		End If
		If objectactive(a0)=400 Then
			;v1=1
			For v1=1 To 20
				addparticle(19,objecttilex(a0)+0.5,2.6,(-objecttiley(a0))-0.5,Rand(0,360),0.15,Rnd(-0.035,0.035),Rnd(-0.015,0.015),Rnd(-0.035,0.035),0.0,0.0,0.0,0.0,0.0,50,3)
				;v1=v1+1
			Next
		End If
		If objectactive(a0)<600 Then
			objectscalexadjust(a0)=objectactive(a0)/600.0
			objectscaleyadjust(a0)=objectactive(a0)/600.0
			objectscalezadjust(a0)=objectactive(a0)/600.0
		End If
	Else
		objectyaw(a0)=objectyaw(a0)+3.0
		objectz(a0)=0.0
		v2=maximum2(Abs(objecttilex(a0)-objecttilex(playerobject)),Abs(objecttiley(a0)-objecttiley(playerobject)))
		If (objectmovementtimer(playerobject)=0 And (v2=0)) Then
			If (objecttilelogic(objecttilex(a0),objecttiley(a0)) And (16))>0 Then
				objecttilelogic(objecttilex(a0),objecttiley(a0))=objecttilelogic(objecttilex(a0),objecttiley(a0))-16.0
			End If
			deactivateobject(a0)
			playsoundfx(173,-1,-1)
			v3=1
			;v1=0
			For v1=0 To nofobjects-1
				If (objecttype(v1)=425 And (objectactive(v1)=1001)) Then
					v3=0
				End If
				;v1=v1+1
			Next
			If v3=1 Then
				;v1=0
				For v1=0 To nofobjects-1
					If (objecttype(v1)=426 And (objectactive(v1)=1001)) Then
						deactivateobject(v1)
						playsoundfx(12,-1,-1)
					End If
					;v1=v1+1
				Next
			End If
		End If
	End If
End Function

Function createretrolasergatemesh(a0)
	
	v1=CreateMesh(0)
	v2=CreateCylinder(6,0,0)
	ScaleMesh v2,0.05,0.5,0.05
	RotateMesh v2,0.0,0.0,90.0
	PositionMesh v2,0.0,0.25,0.0
	AddMesh v2,v1
	PositionMesh v2,0.0,-0.375,0.2165
	AddMesh v2,v1
	PositionMesh v2,0.0,0.0,-0.433
	AddMesh v2,v1
	FreeEntity v2
	EntityAlpha v1,0.5
	If a0=0 Then
		EntityColor v1,255.0,0.0,0.0
	Else If a0=1 Then
		EntityColor v1,255.0,128.0,0.0
	Else If a0=2 Then
		EntityColor v1,255.0,255.0,0.0
	Else If a0=3 Then
		EntityColor v1,0.0,255.0,0.0
	Else If a0=4 Then
		EntityColor v1,0.0,255.0,255.0
	Else If a0=5 Then
		EntityColor v1,0.0,0.0,255.0
	Else
		EntityColor v1,255.0,0.0,255.0
	End If
	Return v1
End Function

Function controlretrolasergate(a0)
	
	If objectid(a0)=-1 Then
		objectid(a0)=objectdata(a0,0)*5+500+objectdata(a0,1)
	End If
	objecttilex(a0)=Floor(objectx(a0))
	objecttiley(a0)=Floor(objecty(a0))
	If objectactive(a0)=0 Then
		If leveltilelogic(objecttilex(a0),objecttiley(a0))<>0 Then
			leveltilelogic(objecttilex(a0),objecttiley(a0))=0
		End If
	Else If leveltilelogic(objecttilex(a0),objecttiley(a0))<>1 Then
		leveltilelogic(objecttilex(a0),objecttiley(a0))=1
	End If
	If (objectyawadjust(a0)=0.0 Or (objectyawadjust(a0)=180.0)) Then
		objectpitch(a0)=(objectpitch(a0)+2.0) Mod 360.0
	Else
		objectroll(a0)=(objectroll(a0)+2.0) Mod 360.0
	End If
End Function

Function activatecommand(a0,a1,a2,a3,a4)
	
	Select a0
	Case 0
		Return 0
	Case 1
		;v2=0
		For v2=0 To nofobjects-1
			If objectexists(v2)=1 Then
				If objectid(v2)=a1 Then
					activateobject(v2)
				End If
			End If
			;v2=v2+1
		Next
	Case 2
		;v2=0
		For v2=0 To nofobjects-1
			If objectexists(v2)=1 Then
				If objectid(v2)=a1 Then
					deactivateobject(v2)
				End If
			End If
			;v2=v2+1
		Next
	Case 3
		;v2=0
		For v2=0 To nofobjects-1
			If objectexists(v2)=1 Then
				If objectid(v2)=a1 Then
					toggleobject(v2)
				End If
			End If
			;v2=v2+1
		Next
	Case 4
		If (a4=0 Or (a4=adventurecurrentlevel)) Then
			changeintcurrentlevel(a1,a2,a3)
		Else If a4>0 Then
			changeintacrosslevels(globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+a4+".wlv",a1,a2,a3)
		Else If a4<0 Then
			changeintacrosslevels(globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+(-a4)+".wlv",a1,a2,a3)
		End If
	Case 5
		;v2=0
		For v2=0 To nofobjects-1
			If objectexists(v2)=1 Then
				If objectid(v2)=a1 Then
					destroyobject(v2,0)
				End If
			End If
			;v2=v2+1
		Next
	Case 6
		setlight(a1,a2,a3,1,a1/2,a2/2,a3/2,1)
	Case 7
		If leveltimer<1000000000 Then
			delaycommand=7
			delaydata1=a1
			delaydata2=a2
			delaydata3=a3
			leveltimer=1000000000
			lightredgoal2=lightredgoal
			lightgreengoal2=lightgreengoal
			lightbluegoal2=lightbluegoal
			ambientredgoal2=ambientredgoal
			ambientgreengoal2=ambientgreengoal
			ambientbluegoal2=ambientbluegoal
			setlight(0,0,0,7,0,0,0,7)
			objectmovexgoal(playerobject)=objecttilex2(playerobject)
			objectmoveygoal(playerobject)=objecttiley2(playerobject)
			playertalktogoalobject=-1
			;v2=0
			For v2=0 To nofobjects-1
				If (objecttype(v2)=90 And (objectsubtype(v2)=10)) Then
					EntityFX objectentity(v2),0
				End If
				;v2=v2+1
			Next
			If (gamemode=5 Or (gamemode=6)) Then
				closerucksack(8)
			End If
		End If
	Case 8
		If leveltimer<1000000000 Then
			delaycommand=8
			delaydata1=a1
			leveltimer=1000000000
			lightredgoal2=lightredgoal
			lightgreengoal2=lightgreengoal
			lightbluegoal2=lightbluegoal
			ambientredgoal2=ambientredgoal
			ambientgreengoal2=ambientgreengoal
			ambientbluegoal2=ambientbluegoal
			setlight(0,0,0,7,0,0,0,7)
			;v2=0
			For v2=0 To 79
				deactivateicon(v2)
				;v2=v2+1
			Next
			If gamemode=8 Then
				enddialog()
			End If
			EntityAlpha levelcursor,0.0
			EntityAlpha mousecursor,0.0
			objectmovexgoal(playerobject)=objecttilex2(playerobject)
			objectmoveygoal(playerobject)=objecttiley2(playerobject)
			;v2=0
			For v2=0 To nofobjects-1
				If (objecttype(v2)=90 And (objectsubtype(v2)=10)) Then
					EntityFX objectentity(v2),0
				End If
				;v2=v2+1
			Next
		Else If (leveltimer>=1000002000 And (leveltimer<=1000002500)) Then
			endlevel()
			adventurecanceldata()
			endadventure()
			dialogbackgroundsize=0
			HideEntity dialogbackgroundentity
			deleteicon(9)
			startadventure(adventurecurrentname,adventurecurrentstatus,adventurecurrentnumber)
		End If
	Case 9
		camerashaketimer=a1
		playsoundfx(122,-1,-1)
	Case 21
		startdialog(a1,a2,a3)
		playsoundfx(131,-1,-1)
	Case 22
		loaddialog(a1)
		startinginterchange=a2
		savedialog(a1)
	Case 23
		If (gamemode<>8 Or (a1<>currentdialog)) Then
			If gamemode=8 Then
				savedialog(currentdialog)
			End If
			loaddialog(a1)
		End If
		askaboutactive(a2)=-2
		If (gamemode<>8 Or (a1<>currentdialog)) Then
			savedialog(a1)
			If gamemode=8 Then
				loaddialog(currentdialog)
			End If
		End If
	Case 24
		If (gamemode<>8 Or (a1<>currentdialog)) Then
			If gamemode=8 Then
				savedialog(currentdialog)
			End If
			loaddialog(a1)
		End If
		askaboutactive(a2)=-1
		If (gamemode<>8 Or (a1<>currentdialog)) Then
			savedialog(a1)
			If gamemode=8 Then
				loaddialog(currentdialog)
			End If
		End If
	Case 25
		If (gamemode<>8 Or (a1<>currentdialog)) Then
			If gamemode=8 Then
				savedialog(currentdialog)
			End If
			loaddialog(a1)
		End If
		If askaboutactive(a2)=-1 Then
			askaboutactive(a2)=-2
		Else
			askaboutactive(a2)=-1
		End If
		If (gamemode<>8 Or (a1<>currentdialog)) Then
			savedialog(a1)
			If gamemode=8 Then
				loaddialog(currentdialog)
			End If
		End If
	Case 26
		If (gamemode<>8 Or (a1<>currentdialog)) Then
			If gamemode=8 Then
				savedialog(currentdialog)
			End If
			loaddialog(a1)
		End If
		askaboutactive(a2)=a3
		If (gamemode<>8 Or (a1<>currentdialog)) Then
			savedialog(a1)
			If gamemode=8 Then
				loaddialog(currentdialog)
			End If
		End If
	Case 27
		If (gamemode<>8 Or (a1<>currentdialog)) Then
			If gamemode=8 Then
				savedialog(currentdialog)
			End If
			loaddialog(a1)
		End If
		askaboutinterchange(a2)=a3
		If (gamemode<>8 Or (a1<>currentdialog)) Then
			savedialog(a1)
			If gamemode=8 Then
				loaddialog(currentdialog)
			End If
		End If
	Case 28
		masteraskaboutactive(a1)=1
	Case 29
		masteraskaboutactive(a1)=0
	Case 30
		masteraskaboutactive(a1)=1-masteraskaboutactive(a1)
	Case 51
		;v2=0
		For v2=0 To nofobjects-1
			If objectexists(v2)=1 Then
				If objectid(v2)=a1 Then
					objectmovementtype(v2)=a4
					objectxgoal(v2)=a2+0.5
					objectygoal(v2)=a3+0.5
					objectspeed(v2)=0.015
				End If
			End If
			;v2=v2+1
		Next
	Case 52
		;v2=0
		For v2=0 To nofobjects-1
			If objectexists(v2)=1 Then
				If objectid(v2)=a1 Then
					objectmovementtype(v2)=a2
					objectmovementtypedata(v2)=a3
				End If
			End If
			;v2=v2+1
		Next
	Case 61
		;v2=0
		For v2=0 To nofobjects-1
			If (objectexists(v2)=1 And (((objecttype(v2)=110 Or (objecttype(v2)=290)) Or (objecttype(v2)=330)) Or (objecttype(v2)=390))) Then
				If (objectid(v2)=a1 And ((objectmovementtimer(v2)>0 Or ((a2<>objecttilex(v2) Or (a3<>objecttiley(v2))))))) Then
					If (v2=dialogobject1 And (gamemode=8)) Then
						objectdata10(v2)=a3*200+a2
					Else
						objectmovementtype(v2)=10
						objectmovexgoal(v2)=a2
						objectmoveygoal(v2)=a3
					End If
				End If
			End If
			;v2=v2+1
		Next
	Case 62
		;v2=0
		For v2=0 To nofobjects-1
			If (objectexists(v2)=1 And (((objecttype(v2)=110 Or (objecttype(v2)=330)) Or (objecttype(v2)=180)) Or (objecttype(v2)=390))) Then
				If objectid(v2)=a1 Then
					If a2>=0 Then
						objecttalkable(v2)=a2
					End If
					If objectyawadjust(v2)<>a4 Then
						;v3=1
						For v3=1 To 3
							If objectentity(v2)>0 Then
								If a4>=0 Then
									RotateEntity GetChild(objectentity(v2),v3),0.0,a4-objectyawadjust(v2),0.0,0
								End If
							End If
							;v3=v3+1
						Next
					End If
					If a3>=0 Then
						objectdata(v2,1)=a3
						If objectentity(v2)>0 Then
							EntityTexture GetChild(objectentity(v2),3),stinkertexture(objectdata(v2,0),a3),0,0
						End If
					End If
					If a4>=0 Then
						objectyawadjust(v2)=a4
					End If
				End If
			End If
			;v2=v2+1
		Next
	Case 63
		;v2=0
		For v2=0 To nofobjects-1
			If (objectexists(v2)=1 And ((objecttype(v2)=110 Or (objecttype(v2)=290)))) Then
				If objectid(v2)=a1 Then
					If a2>=0 Then
						objectdata(v2,6)=a2
					End If
					If a3>=0 Then
						objectdata(v2,7)=a3
					End If
					If a4>=0 Then
						objectdata(v2,8)=a4
					End If
				End If
			End If
			;v2=v2+1
		Next
	Case 64
		If a1=-1 Then
			addparticle(a2,objecttilex(playerobject)+0.5,1.3,(-objecttiley(playerobject))-0.5,0.0,0.5,0.0,0.0125,0.0,0.0,0.004,0.0,-0.0001,0.0,150,3)
			If a3>1 Then
				;v3=2
				For v3=2 To a3
					addparticle(a2,objecttilex(playerobject)+0.5,1.3,(-objecttiley(playerobject))-0.5,0.0,0.4,Rnd(-0.01,0.01),Rnd(0.01,0.014),Rnd(-0.01,0.01),0.0,0.004,0.0,Rnd(-0.0002,0.00005),0.0,Rand(50,150),3)
					;v3=v3+1
				Next
			End If
		Else
			;v2=0
			For v2=0 To nofobjects-1
				If objectexists(v2)=1 Then
					If objectid(v2)=a1 Then
						addparticle(a2,objecttilex(v2)+0.5,1.3,(-objecttiley(v2))-0.5,0.0,0.5,0.0,0.0125,0.0,0.0,0.004,0.0,-0.0001,0.0,150,3)
						If a3>1 Then
							;v3=2
							For v3=2 To a3
								addparticle(a2,objecttilex(v2)+0.5,1.3,(-objecttiley(v2))-0.5,0.0,0.4,Rnd(-0.01,0.01),Rnd(0.01,0.014),Rnd(-0.01,0.01),0.0,0.004,0.0,Rnd(-0.0002,0.00005),0.0,Rand(50,150),3)
								;v3=v3+1
							Next
						End If
					End If
				End If
				;v2=v2+1
			Next
		End If
	Case 102
		lightredgoal2=lightredgoal
		lightgreengoal2=lightgreengoal
		lightbluegoal2=lightbluegoal
		ambientredgoal2=ambientredgoal
		ambientgreengoal2=ambientgreengoal
		ambientbluegoal2=ambientbluegoal
		delaycommand=102
		;v2=0
		For v2=0 To 79
			deleteicon(v2)
			;v2=v2+1
		Next
	Case 103,104
		v4=0
		;v3=0
		For v3=0 To 99
			If inventoryitem(v3)=3021 Then
				v4=v4+1
			End If
			;v3=v3+1
		Next
		If ((v4=4 And (a0=103)) Or ((v4=3 And (a0=104)))) Then
			masteraskaboutactive(2)=1
			v5$=globaldirname+"\Player Profiles\"+playername+"\Current\Hub\21.wlv"
			loadlevel(v5$,0,0)
			lightredgoal2=lightredgoal
			lightgreengoal2=lightgreengoal
			lightbluegoal2=lightbluegoal
			ambientredgoal2=ambientredgoal
			ambientgreengoal2=ambientgreengoal
			ambientbluegoal2=ambientbluegoal
			activatecommand(62,1,71,-1,-1)
			activatecommand(62,21,72,-1,-1)
			savelevel(v5$)
			If a0=103 Then
				v5$=globaldirname+"\Player Profiles\"+playername+"\Current\Hub\41.wlv"
			Else If a0=104 Then
				v5$=globaldirname+"\Player Profiles\"+playername+"\Current\Hub\65.wlv"
			End If
			loadlevel(v5$,0,0)
			lightredgoal2=lightredgoal
			lightgreengoal2=lightgreengoal
			lightbluegoal2=lightbluegoal
			ambientredgoal2=ambientredgoal
			ambientgreengoal2=ambientgreengoal
			ambientbluegoal2=ambientbluegoal
			activatecommand(1,39,0,0,0)
			savelevel(v5$)
		End If
	Case 111
		currentlightpower=99
	Case 112
		inventorysize=4
	Case 113
		inventorysize=5
	Case 114
		shardsareactive=1
	Case 115
		delaycommand=115
		playsoundfxnow(42)
		startmenu(8)
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
	End Select
End Function

Function changeintcurrentlevel(a0,a1,a2)
	
	;v1=0
	For v1=0 To nofobjects-1
		If objectexists(v1)=1 Then
			If objectid(v1)=a0 Then
				Select a1
				Case 1
					objectmovementtype(v1)=a2
				Case 2
					objectmovementtypedata(v1)=a2
				Case 3
					objectradiustype(v1)=a2
				Case 4
					objectdata10(v1)=a2
				Case 5
					objectattackpower(v1)=a2
				Case 6
					objectdefensepower(v1)=a2
				Case 7
					objectdestructiontype(v1)=a2
				Case 8
					objectid(v1)=a2
				Case 9
					objecttype(v1)=a2
				Case 10
					objectsubtype(v1)=a2
				Case 11
					objectactive(v1)=a2
				Case 12
					objectactivationtype(v1)=a2
				Case 13
					objectactivationspeed(v1)=a2
				Case 14
					objectstatus(v1)=a2
				Case 15
					objecttimer(v1)=a2
				Case 16
					objecttimermax1(v1)=a2
				Case 17
					objecttimermax2(v1)=a2
				Case 18
					objectteleportable(v1)=a2
				Case 19
					objectbuttonpush(v1)=a2
				Case 20
					objectwaterreact(v1)=a2
				Case 21
					objecttelekinesisable(v1)=a2
				Case 22
					objectfreezable(v1)=a2
				Case 23,24,25,26,27,28,29,30,31,32
					objectdata(v1,a1-23)=a2
				End Select
			End If
		End If
		;v1=v1+1
	Next
End Function

Function changeintacrosslevels(a0$,a1,a2,a3)
	
	Select a2
	Case 1,2
		a2=(a2-1)*4+108
	Case 3,4
		a2=(a2-3)*4+124
	Case 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22
		a2=(a2-5)*4+140
	Case 23,24,25,26,27,28,29,30,31,32
		a2=(a2-23)*4+228
	End Select
	v2=OpenFile(a0$)
	v3=ReadInt(v2)
	v4=ReadInt(v2)
	SeekFile(v2,(v3*v4*13+3)*4+8)
	v5=ReadInt(v2)
	;v6=1
	For v6=1 To v5
		ReadString(v2)
		ReadString(v2)
		v7=FilePos(v2)
		SeekFile(v2,v7+152)
		v8=ReadInt(v2)
		If v8=a1 Then
			SeekFile(v2,v7+a2)
			WriteInt(v2,a3)
			SeekFile(v2,FilePos(v2))
		End If
		SeekFile(v2,v7+268)
		SeekFile(v2,FilePos(v2))
		;v9=0
		For v9=0 To 3
			ReadString(v2)
			;v9=v9+1
		Next
		SeekFile(v2,FilePos(v2)+140)
		ReadString(v2)
		ReadString(v2)
		;v6=v6+1
	Next
	CloseFile(v2)
End Function

Function minimum2#(a0#,a1#)
	
	If a0#<a1# Then
		Return a0#
	Else
		Return a1#
	End If
End Function

Function minimum4#(a0#,a1#,a2#,a3#)
	
	If ((a0#<=a1# And (a0#<=a2#)) And (a0#<=a3#)) Then
		Return a0#
	Else If ((a1#<=a0# And (a1#<=a2#)) And (a1#<=a3#)) Then
		Return a1#
	Else If ((a2#<=a0# And (a2#<=a1#)) And (a2#<=a3#)) Then
		Return a2#
	Else
		Return a3#
	End If
End Function

Function maximum2#(a0#,a1#)
	
	If a0#>a1# Then
		Return a0#
	Else
		Return a1#
	End If
End Function

Function value(a0$)
	
	v1=0
	;v2=1
	For v2=1 To Len(a0$)
		v3=Asc(Mid$(a0$,v2,1))-48
		If (v3>=0 And (v3<10)) Then
			v1=(v1+v3)*10
		End If
		;v2=v2+1
	Next
	Return v1/10
End Function

Function astar(a0,a1,a2,a3,a4,a5,a6,a7)

	If a5<3 Then
		a5=3
	End If
	If a5>100 Then
		a5=100
	End If
	v1=1
	astarparent(1)=1
	astarx(1)=a1
	astary(1)=a2
	astaropen(1)=1
	astarh(1)=(a3-a1)^2.0+(a4-a2)^2.0
	astarg(1)=0
	astarf(1)=astarg(1)+astarh(1)
	astargrid(a1,a2)=1
	v2=0
	v3=0
	Repeat
		v4=99999
		v5=-1
		;v6=1
		For v6=1 To v1
			If (astaropen(v6)=1 And (astarf(v6)<v4)) Then
				v5=v6
				v4=astarf(v6)
			End If
			;v6=v6+1
		Next
		If (v5=-1 Or (v1>=a6)) Then
			v3=1
			Exit
		End If
		astaropen(v5)=2
		astargrid(astarx(v5),astary(v5))=9999
		;v6=1
		For v6=1 To 4
			Select v6
			Case 1
				v8=astarx(v5)+1
				v9=astary(v5)
			Case 2
				v8=astarx(v5)-1
				v9=astary(v5)
			Case 3
				v8=astarx(v5)
				v9=astary(v5)+1
			Case 4
				v8=astarx(v5)
				v9=astary(v5)-1
			End Select
			If (((v8>=0 And (v8<100)) And (v9>=0)) And (v9<100)) Then
				If (canobjectmovetotile(a0,v8,v9,0,0)=1 Or ((v8=a3 And (v9=a4)))) Then
					If astargrid(v8,v9)=0 Then
						v1=v1+1
						astarparent(v1)=v5
						astarx(v1)=v8
						astary(v1)=v9
						astaropen(v1)=1
						astarh(v1)=(a3-v8)^2.0+(a4-v9)^2.0
						astarg(v1)=astarg(v5)+10
						astarf(v1)=astarg(v1)+astarh(v1)
						astargrid(v8,v9)=1
					Else If astaropen(astargrid(v8,v9))=1 Then
						v10=(a3-v8)^2.0+(a4-v9)^2.0
						v11=astarg(v5)+10
						If v11+v10<astarf(astargrid(v8,v9)) Then
							astarg(astargrid(v8,v9))=v11
							astarh(astargrid(v8,v9))=v10
							astarf(astargrid(v8,v9))=v11+v10
							astarparent(astargrid(v8,v9))=v5
						End If
					End If
					If (Abs(v8-a3)<=a7 And (Abs(v9-a4)<=a7)) Then
						v2=1
						v6=4
					End If
				End If
			End If
			;v6=v6+1
		Next
	Until (v2=1 Or (v3=1))
	;v6=1
	For v6=1 To v1
		astargrid(astarx(v6),astary(v6))=0
		;v6=v6+1
	Next
	If v3=1 Then
		astarpathnode(1)=-1
		Return 0
	End If
	;v6=1
	For v6=1 To a5
		astarpathnode(v6)=v1
		;v6=v6+1
	Next
	Repeat
		;v6=a5
		For v6=a5 To 2 Step -1
			astarpathnode(v6)=astarpathnode((v6-1))
			;v6=v6+-1
		Next
		astarpathnode(1)=astarparent(astarpathnode(1))
	Until (astarx(astarparent(astarpathnode(1)))=a1 And (astary(astarparent(astarpathnode(1)))=a2))
End Function

Function setupmenu()
	
	dialogbackgroundentity=CreateMesh(camera)
	v1=CreateSurface(dialogbackgroundentity,0)
	AddVertex(v1,-2.0,1.3,5.0,0.0,0.0,1.0)
	AddVertex(v1,2.0,1.3,5.0,1.0,0.0,1.0)
	AddVertex(v1,-2.0,-0.5,5.0,0.0,1.0,1.0)
	AddVertex(v1,2.0,-0.5,5.0,1.0,1.0,1.0)
	AddTriangle(v1,0,1,2)
	AddTriangle(v1,2,1,3)
	EntityColor dialogbackgroundentity,200.0,50.0,30.0
	EntityAlpha dialogbackgroundentity,0.5
	EntityOrder dialogbackgroundentity,-9
	HideEntity dialogbackgroundentity
	dialogbackgroundentity2=CreateMesh(camera)
	v1=CreateSurface(dialogbackgroundentity2,0)
	AddVertex(v1,-3.0,-1.9,5.0,0.0,0.0,1.0)
	AddVertex(v1,3.0,-1.9,5.0,1.0,0.0,1.0)
	AddVertex(v1,-3.0,-2.3,5.0,0.0,1.0,1.0)
	AddVertex(v1,3.0,-2.3,5.0,1.0,1.0,1.0)
	AddTriangle(v1,0,1,2)
	AddTriangle(v1,2,1,3)
	EntityColor dialogbackgroundentity2,120.0,100.0,80.0
	EntityAlpha dialogbackgroundentity2,0.5
	EntityOrder dialogbackgroundentity2,-9
	If waepisode=0 Then
		titlemenuentity(60)=createsquare()
		titlemenutexture(60)=myloadtexture("data\graphics\logos\wonderlandadventures.bmp",4)
		EntityTexture titlemenuentity(60),titlemenutexture(60),0,0
		RotateEntity titlemenuentity(60),-90.0,0.0,0.0,0
		PositionEntity titlemenuentity(60),0.0,0.35,2.0,0
		ScaleEntity titlemenuentity(60),0.8,0.8,0.8,0
		EntityFX titlemenuentity(60),1
		HideEntity titlemenuentity(60)
		titlemenuentity(80)=CreatePlane(1,0)
		PositionEntity titlemenuentity(80),0.0,0.0,200.0,0
		RotateEntity titlemenuentity(80),-90.0,0.0,0.0,0
		TurnEntity titlemenuentity(80),0.0,90.0,0.0,0
		titlemenutexture(80)=myloadtexture("data\graphics\logos\starpaper2.jpg",1)
		ScaleTexture titlemenutexture(80),70.0,70.0
		EntityTexture titlemenuentity(80),titlemenutexture(80),0,0
		EntityFX titlemenuentity(80),1
		;v2=81
		For v2=81 To 99
			titlemenuentity(v2)=CopyEntity(starmesh,0)
			RotateEntity titlemenuentity(v2),-90.0,0.0,0.0,0
			EntityFX titlemenuentity(v2),1
			PositionEntity titlemenuentity(v2),Rnd(-10.0,30.0),Rnd(15.0,30.0),Rnd(20.0,30.0),0
			;v2=v2+1
		Next
	End If
	;v2=0
	For v2=0 To 9
		saveslotentity(v2)=CreateMesh(camera)
		v1=CreateSurface(saveslotentity(v2),0)
		AddVertex(v1,-1.0,1.0,0.0,0.0,0.0,1.0)
		AddVertex(v1,1.0,1.0,0.0,1.0,0.0,1.0)
		AddVertex(v1,-1.0,-0.5,0.0,0.0,0.75,1.0)
		AddVertex(v1,1.0,-0.5,0.0,1.0,0.75,1.0)
		AddTriangle(v1,0,1,2)
		AddTriangle(v1,1,3,2)
		UpdateNormals saveslotentity(v2)
		EntityFX saveslotentity(v2),1
		If v2=0 Then
			ScaleEntity saveslotentity(v2),2.0,2.0,2.0,0
			TranslateEntity saveslotentity(v2),0.0,-0.6,12.0,0
		Else
			TranslateEntity saveslotentity(v2),1.5*(v2-5),2.5,16.0,0
			ScaleEntity saveslotentity(v2),0.5,0.5,0.5,0
		End If
		EntityOrder saveslotentity(v2),-10
		HideEntity saveslotentity(v2)
		;v2=v2+1
	Next
	Return 0
	saveslotimage=CreateImage(256,256,1)
	;v2=0
	For v2=0 To 9
		saveslotentity(v2)=CreateMesh(camera)
		v1=CreateSurface(saveslotentity(v2),0)
		AddVertex(v1,-1.0,1.0,0.0,0.01,0.01,1.0)
		AddVertex(v1,1.0,1.0,0.0,0.99,0.01,1.0)
		AddVertex(v1,-1.0,-0.5,0.0,0.01,0.74,1.0)
		AddVertex(v1,1.0,-0.5,0.0,0.99,0.74,1.0)
		AddTriangle(v1,0,1,2)
		AddTriangle(v1,1,3,2)
		UpdateNormals saveslotentity(v2)
		EntityFX saveslotentity(v2),1
		If v2=0 Then
			ScaleEntity saveslotentity(v2),2.0,2.0,2.0,0
			TranslateEntity saveslotentity(v2),-2.0,-1.15,9.7,0
			v3=LoadTexture("saveslot.bmp",1)
			EntityTexture saveslotentity(v2),v3,0,0
		Else
			TranslateEntity saveslotentity(v2),1.5*(v2-5),2.2,16.0,0
			ScaleEntity saveslotentity(v2),0.5,0.5,0.5,0
		End If
		EntityOrder saveslotentity(v2),-10
		;v2=v2+1
	Next
End Function

Function createicon(a0,a1,a2,a3,a4$,a5$)
	
	If iconentity((a1*10+a0))>0 Then
		Return 0
	End If
	iconx((a1*10+a0))=-0.9+0.2*a0
	icony((a1*10+a0))=0.65-(0.187*a1)
	icontexture((a1*10+a0))=a2
	iconentity((a1*10+a0))=CreateMesh(camera)
	v1=CreateSurface(iconentity((a1*10+a0)),0)
	AddVertex(v1,-0.04,0.04,0.0,a2 Mod 8*0.125+0.001,Floor(a2 Mod 64/8)*0.125+0.001,1.0)
	AddVertex(v1,0.04,0.04,0.0,a2 Mod 8*0.125+0.1249,Floor(a2 Mod 64/8)*0.125+0.001,1.0)
	AddVertex(v1,-0.04,-0.04,0.0,a2 Mod 8*0.125+0.001,Floor(a2 Mod 64/8)*0.125+0.1249,1.0)
	AddVertex(v1,0.04,-0.04,0.0,a2 Mod 8*0.125+0.1249,Floor(a2 Mod 64/8)*0.125+0.1249,1.0)
	AddTriangle(v1,0,1,2)
	AddTriangle(v1,1,3,2)
	UpdateNormals iconentity((a1*10+a0))
	If a2>=64 Then
		EntityTexture iconentity((a1*10+a0)),icontexturecustom,0,0
	Else
		EntityTexture iconentity((a1*10+a0)),icontexturestandard,0,0
	End If
	EntityOrder iconentity((a1*10+a0)),-10
	EntityPickMode iconentity((a1*10+a0)),2,1
	EntityFX iconentity((a1*10+a0)),1
	ScaleEntity iconentity((a1*10+a0)),0.0,0.0,0.0,0
	PositionEntity iconentity((a1*10+a0)),iconx((a1*10+a0))/camerazoomlevel,icony((a1*10+a0))/camerazoomlevel,1.0,0
	iconsize((a1*10+a0))=1
	icontype((a1*10+a0))=a3
	iconsubtext((a1*10+a0))=a4$
	iconhelptext((a1*10+a0))=a5$
End Function

Function controlicons()
	
	v1=CameraPick(camera,MouseX(),MouseY())
	iconpicked=-1
	;v2=0
	For v2=0 To 79
		If iconentity(v2)>0 Then
			If iconsize(v2)=1201 Then
				iconsize(v2)=1001
			End If
			If (((v1=iconentity(v2) And (iconsize(v2)=1001)) And (mousegamemode=-1)) And (playercontrolmode=0)) Then
				v3=0
				If (gamemode=0 Or ((gamemode=12 And ((oldgamemode<>8 Or (icontype(v2)=4)))))) Then
					v3=1
				Else If (gamemode=5 Or (gamemode=6)) Then
					If ((icontype(v2)=2 Or (icontype(v2)=4)) Or ((icontype(v2)>=1000 And ((icontype(v2)-1001) Mod 10=0)))) Then
						v3=1
					End If
					If (mouse2=1 And (mouse1=0)) Then
						If (icontype(v2)>=1000 And ((icontype(v2)-1001) Mod 10=1)) Then
							v3=1
						End If
					End If
				Else If gamemode=8 Then
					If icontype(v2)=4 Then
						v3=1
					Else
						v3=0
					End If
				End If
				If v3=1 Then
					iconsize(v2)=1201
					iconpicked=v2
					EntityAlpha mousecursor,0.8
					HideEntity levelcursor
					If mouse1=1 Then
						activateicon(v2,1)
						mousegamemode=-2
						;v4=0
						For v4=0 To 79
							If iconentity(v4)>0 Then
								EntityPickMode iconentity(v4),0,1
							End If
							;v4=v4+1
						Next
					Else If mouse2=1 Then
						activateicon(v2,2)
						mousegamemode=-2
						;v4=0
						For v4=0 To 79
							If iconentity(v4)>0 Then
								EntityPickMode iconentity(v4),0,1
							End If
							;v4=v4+1
						Next
					End If
				End If
			End If
			If (iconsize(v2)>0 And (iconsize(v2) Mod 2=0)) Then
				iconsize(v2)=iconsize(v2)-50
				If iconsize(v2)<0 Then
					iconsize(v2)=0
				End If
			Else If (iconsize(v2)<1001 And (iconsize(v2) Mod 2=1)) Then
				iconsize(v2)=iconsize(v2)+50
				If iconsize(v2)>1001 Then
					iconsize(v2)=1001
				End If
			End If
			If iconentity(v2)>0 Then
				ScaleEntity iconentity(v2),iconsize(v2)/1001.0,iconsize(v2)/1001.0,iconsize(v2)/1001.0,0
			End If
			If iconsize(v2)=0 Then
				deleteicon(v2)
			End If
		End If
		;v2=v2+1
	Next
	If gamemode<10 Then
		If leveltimer<1000000000 Then
			If (nofweestinkersinadventure>0 And (adventuregoal=1)) Then
				createicon(7,0,8,3,nofweestinkersinadventure,"Rescue")
				iconsubtext(7)=nofweestinkersinadventure
			End If
			If (nofgemsinadventure>0 And (adventuregoal=3)) Then
				createicon(7,0,9,3,nofgemsinadventure,"Collect")
				iconsubtext(7)=nofgemsinadventure
			End If
			If (nofscrittersinadventure>0 And (adventuregoal=2)) Then
				createicon(7,0,10,3,nofscrittersinadventure,"Capture")
				iconsubtext(7)=nofscrittersinadventure
			End If
			If (noffireflowersinadventure>0 And (adventuregoal=5)) Then
				createicon(7,0,11,3,noffireflowersinadventure,"Destroy")
				iconsubtext(7)=noffireflowersinadventure
			End If
			If (nofbricksinadventure>0 And (adventuregoal=4)) Then
				createicon(7,0,12,3,nofbricksinadventure,"Destroy")
				iconsubtext(7)=nofbricksinadventure
			End If
			If (nofcrabsinadventure>0 And (adventuregoal=7)) Then
				createicon(7,0,13,3,nofcrabsinadventure,"Capture")
				iconsubtext(7)=nofcrabsinadventure
			End If
			If (nofbabyboomersinadventure>0 And (adventuregoal=8)) Then
				createicon(7,0,14,3,nofbabyboomersinadventure,"Rescue")
				iconsubtext(7)=nofbabyboomersinadventure
			End If
		End If
		If (currentcharm=1 And (currentlightpower>0)) Then
			If leveltimer Mod 800=0 Then
				currentlightpower=currentlightpower-1
				iconsubtext(1)="- "+currentlightpower+" -"
				If currentlightpower=0 Then
					messagelinetext1="Your lamp has run out."
					messagelinetext2=""
					messagelinetimer=100
					deleteicon(1)
					currentcharm=0
				End If
				;v4=0
				For v4=0 To 99
					If inventoryitem(v4)=2001 Then
						inventoryhelptext(v4)="- "+currentlightpower+" -"
					End If
					;v4=v4+1
				Next
			End If
		End If
		If spellactive=1 Then
			If leveltimer Mod 3=0 Then
				v5#=0.1+Sin(leveltimer Mod 360)*0.04
				v6=leveltimer*4 Mod 360
				addparticle2(Rand(16,23),-2.25+v5#*Sin(v6),1.65+v5#*Cos(v6),5.0,0.0,0.05,0.0005*Sin(v6),0.0005*Cos(v6),0.0,0.04,0.001,0.0,0.0,0.0,50,2)
				v6=(v6+180) Mod 360
				addparticle2(Rand(16,23),-2.25+v5#*Sin(v6),1.65+v5#*Cos(v6),5.0,0.0,0.05,0.0005*Sin(v6),0.0005*Cos(v6),0.0,0.04,0.001,0.0,0.0,0.0,50,2)
			End If
		End If
		If shardhitcounter=4 Then
			shardmelodytimer=shardmelodytimer+1
			If shardmelodytimer Mod 60=0 Then
				v6=shardmelodytimer/60-1
				SoundPitch soundfx(13),inventoryid(shardmelody(v6))*22000/7+22000
				playsoundfx(13,-1,-1)
				v7=19-inventorysize+shardmelody(v6) Mod inventorysize+Floor(shardmelody(v6)/inventorysize)*10.0
				iconsize(v7)=401
				If v6=6 Then
					shardhitcounter=5
					shardmelodytimer=0
				End If
			End If
		End If
	End If
End Function

Function activateicon(a0,a1)
	
	If shardhitcounter=4 Then
		shardhitcounter=0
		shardlasthit=-1
	End If
	Select icontype(a0)
	Case 1
		If (leveltimer<1000000000 Or (leveltimer>1000000050)) Then
			openrucksack(a0)
			playsoundfx(131,-1,-1)
		End If
	Case 2
		closerucksack(a0)
		playsoundfx(132,-1,-1)
	Case 3
	Case 4
		If gamemode<>12 Then
			playsoundfx(131,-1,-1)
			startmenu(0)
		Else
			endmenu()
		End If
	Case 1001
		If gamemode=6 Then
			If inventoryswapicon<>a0 Then
				swapitem(a0)
			End If
		Else If a1=1 Then
			If currentspellpower<=0 Then
				playsoundfx(175,-1,-1)
				messagelinetext1="It's a pair of Rainbow Gloves."
				messagelinetext2="They are currently not charged."
				messagelinetimer=100
			Else If currentspell < 0 Then
				playsoundfx(176,-1,-1)
				messagelinetext1="These gloves are charged"
				messagelinetext2="with an unknown destructive magic!"
				messagelinetimer=100
			Else Select currentspell
			Case 3
				playsoundfx(176,-1,-1)
				messagelinetext1="These gloves are charged"
				messagelinetext2="with 'Green' Magic!"
				messagelinetimer=100
			Case 5
				playsoundfx(176,-1,-1)
				messagelinetext1="These gloves are charged"
				messagelinetext2="with 'Indigo' Magic!"
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
		Else If a1=2 Then
			gamemode=6
			v3=Floor(a0/10)-1.0
			v4=a0 Mod 10-(9-inventorysize)
			inventoryswapitem=v3*inventorysize+v4
			inventoryswapicon=a0
		End If
	Case 1002,1003,1004,1005,1006,1007,1008,1009,1010
		togglespell()
	Case 2001,2011
		If gamemode=6 Then
			If inventoryswapicon<>a0 Then
				swapitem(a0)
			End If
		Else If a1=1 Then
			If toodark()=0 Then
				playsoundfx(175,-1,-1)
				messagelinetext1="This item will activate automatically"
				messagelinetext2="if you enter a dark area."
				messagelinetimer=180
			Else
				deleteicon(1)
				If icontype(a0)=2001 Then
					createicon(1,0,66,2002,"- "+currentlightpower+" -","Remove")
					currentcharm=1
				Else
					createicon(1,0,67,2012,"Light","Remove")
					currentcharm=2
				End If
				closerucksack(8)
			End If
		Else If a1=2 Then
			gamemode=6
			v3=Floor(a0/10)-1.0
			v4=a0 Mod 10-(9-inventorysize)
			inventoryswapitem=v3*inventorysize+v4
			inventoryswapicon=a0
		End If
	Case 2021
		If gamemode=6 Then
			If inventoryswapicon<>a0 Then
				swapitem(a0)
			End If
		Else If a1=1 Then
			If objectmovementtimer(playerobject)>0 Then
				messagelinetext1="You must be standing still"
				messagelinetext2="to use the Spy-Eye."
				messagelinetimer=180
			Else
				playsoundfx(176,-1,-1)
				deleteicon(1)
				createicon(1,0,68,2022,"Spy-Eye","Remove")
				currentcharm=3
				closerucksack(8)
				turnofficons()
				MoveMouse gfxwidth/2,9*gfxheight/24
			End If
		Else If a1=2 Then
			gamemode=6
			v3=Floor(a0/10)-1.0
			v4=a0 Mod 10-(9-inventorysize)
			inventoryswapitem=v3*inventorysize+v4
			inventoryswapicon=a0
		End If
	Case 2031
		If gamemode=6 Then
			If inventoryswapicon<>a0 Then
				swapitem(a0)
			End If
		Else If a1=1 Then
			;v5=0
			For v5=0 To nofobjects-1
				If objecttype(v5)=165 Then
					If (Abs(Floor(objectx(v5))-Floor(objectx(playerobject)))<1.1 And (Abs(Floor(objecty(v5))-Floor(objecty(playerobject)))<1.1)) Then
						If objectsubtype(v5)=1 Then
							v5=nofobjects+10
						Else
							v3=Floor(a0/10)-1.0
							v4=a0 Mod 10-(9-inventorysize)
							v6=v3*inventorysize+v4
							playsoundfx(12,-1,-1)
							activatecommand(1,objectdata(v5,0),0,0,0)
							objectdata(v5,0)=objectdata(v5,0)+1
							If (objectdata(v5,0)-200) Mod 3=0 Then
								objectsubtype(v5)=1
							End If
							removeitemfrominventory(v6)
							closerucksack(8)
							v5=nofobjects+20
						End If
					End If
				End If
				;v5=v5+1
			Next
			If v5<nofobjects+10 Then
				messagelinetext1="To use a token you must find and stand"
				messagelinetext2="next to an active arcade game machine."
				messagelinetimer=180
				closerucksack(8)
			Else If v5<nofobjects+20 Then
				messagelinetext1="You have already played all three levels"
				messagelinetext2="on this arcade game."
				messagelinetimer=180
				closerucksack(8)
			End If
		Else If a1=2 Then
			gamemode=6
			v3=Floor(a0/10)-1.0
			v4=a0 Mod 10-(9-inventorysize)
			inventoryswapitem=v3*inventorysize+v4
			inventoryswapicon=a0
		End If
	Case 2002,2012
		deleteicon(1)
		currentcharm=0
	Case 2022
	Case 3001
		If gamemode=6 Then
			If inventoryswapicon<>a0 Then
				swapitem(a0)
			End If
		Else If a1=1 Then
			v3=Floor(a0/10)-1.0
			v4=a0 Mod 10-(9-inventorysize)
			v6=v3*inventorysize+v4
			v7=Floor(objectx(playerobject))
			v8=Floor(objecty(playerobject))
			v9=0
			;v5=0
			For v5=0 To nofobjects-1
				If ((objecttype(v5)=10 And (objectexists(v5)=1)) And (objectactive(v5)=1001)) Then
					If (Abs(objecttilex(v5)-v7)<=1 And (Abs(objecttiley(v5)-v8)<=1)) Then
						v9=1
						If objectid(v5)=inventoryid(v6) Then
							playsoundfx(176,-1,-1)
							deactivateobject(v5)
							v5=nofobjects+5
							removeitemfrominventory(v6)
							closerucksack(8)
						End If
					End If
				End If
				;v5=v5+1
			Next
			If v5<nofobjects+5 Then
				If v9=1 Then
					messagelinetext1="Your key doesn't fit"
					messagelinetext2="this lock."
				Else
					messagelinetext1="To use a key, stand directly next to"
					messagelinetext2="a gate with matching colours."
				End If
				playsoundfx(175,-1,-1)
				messagelinetimer=200
				closerucksack(8)
			End If
		Else If a1=2 Then
			gamemode=6
			v3=Floor(a0/10)-1.0
			v4=a0 Mod 10-(9-inventorysize)
			inventoryswapitem=v3*inventorysize+v4
			inventoryswapicon=a0
		End If
	Case 3011
		If gamemode=6 Then
			If inventoryswapicon<>a0 Then
				swapitem(a0)
			End If
		Else If a1=1 Then
			addparticle(4,objectx(playerobject),0.1,-objecty(playerobject),0.0,1.0,0.0,0.0,0.0,0.0,0.05,0.0,0.0,0.0,60,4)
			Animate GetChild(objectentity(playerobject),3),3,0.3,8,0.0
			;v5=0
			For v5=0 To nofobjects-1
				If ((objecttype(v5)=120 And ((objectsubtype(v5)=0 Or (objectsubtype(v5)=3)))) And (objectexists(v5)=1)) Then
					If (Abs(objecttilex(v5)-objecttilex(playerobject))<=3 And (Abs(objecttiley(v5)-objecttiley(playerobject))<=3)) Then
						objectsubtype(v5)=1
						objectmovementtype(v5)=14
						EntityTexture objectentity(v5),stinkerweetexture,0,0
					End If
				End If
				;v5=v5+1
			Next
			closerucksack(8)
		Else If a1=2 Then
			gamemode=6
			v3=Floor(a0/10)-1.0
			v4=a0 Mod 10-(9-inventorysize)
			inventoryswapitem=v3*inventorysize+v4
			inventoryswapicon=a0
		End If
	Case 3021
		If gamemode=6 Then
			If inventoryswapicon<>a0 Then
				swapitem(a0)
			End If
		Else If a1=1 Then
			v3=Floor(a0/10)-1.0
			v4=a0 Mod 10-(9-inventorysize)
			v6=v3*inventorysize+v4
			If shardsareactive=0 Then
				messagelinetext1="The shard makes a beautiful sound,"
				messagelinetext2="but nothing happens."
				messagelinetimer=200
			Else If ((adventurecurrentlevel=-93 Or (adventurecurrentlevel=-94)) Or (adventurecurrentlevel=-95)) Then
				messagelinetext1="The shard makes a dull sound."
				messagelinetext2="Something is wrong."
				messagelinetimer=200
			Else If adventurecurrentstatus>0 Then
				messagelinetext1="You cannot use the shards"
				messagelinetext2="in an adventure."
				messagelinetimer=200
			Else If shardhitcounter<4 Then
				If inventoryid(v6)=shardlasthit Then
					shardhitcounter=shardhitcounter+1
				Else
					shardhitcounter=1
				End If
				Select shardhitcounter
				Case 2
					messagelinetext1="The shard has begun to vibrate..."
					messagelinetext2="gently at first, but growing stronger."
					messagelinetimer=200
				Case 3
					messagelinetext1="A beautiful song begins to play."
					messagelinetext2=""
					messagelinetimer=200
					shardhitcounter=4
					StopChannel musicchannel
					currentmusic=0
					;v5=0
					For v5=0 To 6
						Repeat
							v11=Rand(0,inventorysize^2.0-1.0)
						Until inventoryitem(v11)=3021
						shardmelody(v5)=v11
						;v5=v5+1
					Next
					shardmelodytimer=0
				Default
					shardhitcounter=1
					messagelinetext1="A gentle and beautiful glow"
					messagelinetext2="has begun to eminate from the shard."
					messagelinetimer=200
				End Select
				shardlasthit=inventoryid(v6)
			Else If shardhitcounter=5 Then
				If v6=shardmelody(shardmelodytimer) Then
					shardmelodytimer=shardmelodytimer+1
					If shardmelodytimer=7 Then
						Select shardlasthit
						Case 0
							activatecommand(7,-70,11,15,0)
						Case 1
							activatecommand(7,-12,17,19,0)
						Case 2
							activatecommand(7,-44,34,14,0)
						Case 3
							activatecommand(7,-90,16,15,0)
						Case 4
							activatecommand(7,-64,14,12,0)
						Case 5
							activatecommand(7,-21,10,16,0)
						Case 6
							activatecommand(7,-86,11,12,0)
						End Select
						closerucksack(8)
					End If
				Else
					shardhitcounter=0
					shardlasthit=-1
					messagelinetext1="I think you played"
					messagelinetext2="a wrong note."
					messagelinetimer=200
				End If
			End If
			SoundPitch soundfx(13),inventoryid(v6)*22000/7+22000
			playsoundfx(13,-1,-1)
		Else If a1=2 Then
			gamemode=6
			v3=Floor(a0/10)-1.0
			v4=a0 Mod 10-(9-inventorysize)
			inventoryswapitem=v3*inventorysize+v4
			inventoryswapicon=a0
		End If
	Case 3091
		If gamemode=6 Then
			If inventoryswapicon<>a0 Then
				swapitem(a0)
			End If
		Else If a1=1 Then
			messagelinetext1="You cannot use this item here."
			messagelinetext2=""
			messagelinetimer=100
			closerucksack(8)
		Else If a1=2 Then
			gamemode=6
			v3=Floor(a0/10)-1.0
			v4=a0 Mod 10-(9-inventorysize)
			inventoryswapitem=v3*inventorysize+v4
			inventoryswapicon=a0
		End If
	Case 4001,4011,4021,4031,4041,4051,4061,4071,4081,4091,4101,4111,4121,4131,4141,4151,4161,4171,4181,4191,4201,4211,4221,4231,4241,4251,4261,4271,4281,4291
		If gamemode=6 Then
			If inventoryswapicon<>a0 Then
				swapitem(a0)
			End If
		Else If a1=1 Then
			v13=Floor((icontype(a0)-4001)/10)
			v14=v13 Mod 10
			v9=0
			v3=Floor(a0/10)-1.0
			v4=a0 Mod 10-(9-inventorysize)
			v6=v3*inventorysize+v4
			If v14=1 Then
				adventurewon()
			Else If (v14>=2 And (v14<=7)) Then
				v7=Floor(objectx(playerobject))
				v8=Floor(objecty(playerobject))
				;v5=0
				For v5=0 To nofobjects-1
					If (objectexists(v5)=1 And (objectid(v5)=inventoryid(v6))) Then
						If ((((Abs(objecttilex(v5)-v7)<=1 And (Abs(objecttiley(v5)-v8)<=1)) Or (v14=5)) Or (v14=6)) Or (v14=7)) Then
							If (v14=2 Or (v14=5)) Then
								If objectactive(v5) Mod 2=0 Then
									activateobject(v5)
									v9=1
								Else
									v9=0
								End If
							Else If (v14=3 Or (v14=6)) Then
								If objectactive(v5) Mod 2=1 Then
									deactivateobject(v5)
									v9=1
								Else
									v9=0
								End If
							Else If (v14=4 Or (v14=7)) Then
								toggleobject(v5)
								v9=1
							End If
						End If
					End If
					;v5=v5+1
				Next
			End If
			If v9=0 Then
				messagelinetext1="You cannot use this item here."
				messagelinetext2=""
				messagelinetimer=100
			Else If v13<10 Then
				removeitemfrominventory(v6)
			End If
			closerucksack(8)
		Else If a1=2 Then
			gamemode=6
			v3=Floor(a0/10)-1.0
			v4=a0 Mod 10-(9-inventorysize)
			inventoryswapitem=v3*inventorysize+v4
			inventoryswapicon=a0
		End If
	Case 9091
		If gamemode=6 Then
			If inventoryswapicon<>a0 Then
				swapitem(a0)
			End If
		Else If a1=2 Then
			gamemode=6
			v3=Floor(a0/10)-1.0
			v4=a0 Mod 10-(9-inventorysize)
			inventoryswapitem=v3*inventorysize+v4
			inventoryswapicon=a0
		End If
	End Select
End Function

Function deactivateicon(a0)
	
	If iconsize(a0)>=1001 Then
		iconsize(a0)=1000
	Else If (iconsize(a0) Mod 2=1 And (iconsize(a0)>0)) Then
		iconsize(a0)=iconsize(a0)-1
	End If
End Function

Function deleteicon(a0)
	
	If iconentity(a0)>0 Then
		FreeEntity iconentity(a0)
	End If
	iconentity(a0)=0
End Function

Function turnofficons()
	
	;v1=0
	For v1=0 To 79
		If iconentity(v1)>0 Then
			EntityPickMode iconentity(v1),0,1
		End If
		;v1=v1+1
	Next
End Function

Function turnonicons()
	
	;v1=0
	For v1=0 To 79
		If iconentity(v1)>0 Then
			EntityPickMode iconentity(v1),2,1
		End If
		;v1=v1+1
	Next
End Function

Function openrucksack(a0)
	
	shardhitcounter=0
	shardlasthit=-1
	If gamemode=12 Then
		endmenu()
	End If
	icontype(a0)=2
	v1=1
	VertexTexCoords GetSurface(iconentity(a0),1),0,v1 Mod 8*0.125+0.001,Floor(v1 Mod 64/8)*0.125+0.001,1.0,0
	VertexTexCoords GetSurface(iconentity(a0),1),1,v1 Mod 8*0.125+0.1249,Floor(v1 Mod 64/8)*0.125+0.001,1.0,0
	VertexTexCoords GetSurface(iconentity(a0),1),2,v1 Mod 8*0.125+0.001,Floor(v1 Mod 64/8)*0.125+0.1249,1.0,0
	VertexTexCoords GetSurface(iconentity(a0),1),3,v1 Mod 8*0.125+0.1249,Floor(v1 Mod 64/8)*0.125+0.1249,1.0,0
	iconhelptext(a0)="Close"
	v2=0
	;v3=1
	For v3=1 To inventorysize
		;v4=9-inventorysize
		For v4=9-inventorysize To 8
			If (iconsize((v3*10+v4))>0 And (iconsize((v3*10+v4)) Mod 2=0)) Then
				iconsize((v3*10+v4))=1001
			Else
				createicon(v4,v3,inventorytexture(v2),inventoryitem(v2),inventorysubtext(v2),inventoryhelptext(v2))
			End If
			v2=v2+1
			;v4=v4+1
		Next
		;v3=v3+1
	Next
	If (iconsize((v3*10+v4))>0 And (iconsize((v3*10+v4)) Mod 2=0)) Then
		iconsize(((inventorysize+1)*10+7))=1001
	Else
		createicon(7,inventorysize+1,6,-1,"","")
	End If
	If (iconsize((v3*10+v4))>0 And (iconsize((v3*10+v4)) Mod 2=0)) Then
		iconsize(((inventorysize+1)*10+8))=1001
	Else
		createicon(8,inventorysize+1,7,-1,"","")
	End If
	gamemode=5
End Function

Function closerucksack(a0)
	
	shardhitcounter=0
	shardlasthit=-1
	icontype(a0)=1
	v1=0
	VertexTexCoords GetSurface(iconentity(a0),1),0,v1 Mod 8*0.125+0.001,Floor(v1 Mod 64/8)*0.125+0.001,1.0,0
	VertexTexCoords GetSurface(iconentity(a0),1),1,v1 Mod 8*0.125+0.1249,Floor(v1 Mod 64/8)*0.125+0.001,1.0,0
	VertexTexCoords GetSurface(iconentity(a0),1),2,v1 Mod 8*0.125+0.001,Floor(v1 Mod 64/8)*0.125+0.1249,1.0,0
	VertexTexCoords GetSurface(iconentity(a0),1),3,v1 Mod 8*0.125+0.1249,Floor(v1 Mod 64/8)*0.125+0.1249,1.0,0
	iconhelptext(a0)="Open"
	;v2=9-inventorysize
	For v2=9-inventorysize To 8
		;v3=1
		For v3=1 To inventorysize
			deactivateicon(v3*10+v2)
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	deactivateicon((inventorysize+1)*10+7)
	deactivateicon((inventorysize+1)*10+8)
	gamemode=0
End Function

Function additemtoinventory(a0,a1,a2,a3,a4$,a5$)
	
	If (nofinventoryitems=0 And (usedinventoryonce=0)) Then
		createicon(8,0,0,1,"Items","Open")
		usedinventoryonce=1
	End If
	If a0=-1 Then
		;a0=0
		For a0=0 To 100
			If inventoryitem(a0)=9091 Then
				Exit
			End If
			;a0=a0+1
		Next
	End If
	inventoryitem(a0)=a1
	inventoryid(a0)=a2
	inventorytexture(a0)=a3
	inventorysubtext(a0)=a4$
	inventoryhelptext(a0)=a5$
	nofinventoryitems=nofinventoryitems+1
	v1=9-inventorysize+a0 Mod inventorysize
	v2=Floor(a0/inventorysize)+1.0
	If iconentity((v2*10+v1))>0 Then
		deleteicon(v2*10+v1)
		createicon(v1,v2,a3,a1,a4$,a5$)
	End If
End Function

Function removeitemfrominventory(a0)
	
	inventoryitem(a0)=9091
	inventoryid(a0)=-1
	inventorytexture(a0)=3
	inventorysubtext(a0)=""
	inventoryhelptext(a0)="Empty"
	nofinventoryitems=nofinventoryitems-1
End Function

Function selectspell(a0,a1)
	
	Restore dataLabel203
	;v1=1
	For v1=1 To a0
		Read v2$
		Read v3$
		;v1=v1+1
	Next
	deleteicon(0)
	createicon(0,0,(16+a0)-1,(a0-1)*10+1002,v2$,v3$)
	If a1>=0 Then
		v4=Floor(a1/10)-1.0
		v5=a1 Mod 10-(9-inventorysize)
		removeitemfrominventory(v4*inventorysize+v5)
	End If
	If (currentspell<>a0 And (currentspell>0)) Then
		Restore dataLabel203
		.spelldata
		;v1=1
		For v1=1 To currentspell
			Read v2$
			Read v3$
			;v1=v1+1
		Next
		If v6=-1 Then
			additemtoinventory(-1,(currentspell-1)*10+1001,-1,(16+currentspell)-1,v2$,"Put On")
		Else
			additemtoinventory(v4*inventorysize+v5,(currentspell-1)*10+1001,-1,(16+currentspell)-1,v2$,"Put On")
		End If
	End If
	currentspell=a0
End Function

Function togglespell()
	
	spellactive=spellactive=0
	If spellactive=1 Then
		objectmovexgoal(playerobject)=objecttilex2(playerobject)
		objectmoveygoal(playerobject)=objecttiley2(playerobject)
		playertalktogoalobject=-1
		iconsubtext(0)="- "+currentspellpower+" -"
		iconhelptext(0)="Remove"
	Else
		iconsubtext(0)="- "+currentspellpower+" -"
		iconhelptext(0)="Activate"
	End If
End Function

Function selectcharm(a0,a1)
	
	Restore dataLabel211
	;v1=1
	For v1=1 To a0
		Read v2$
		Read v3$
		;v1=v1+1
	Next
	deleteicon(1)
	createicon(1,0,(32+a0)-1,(a0-1)*10+2002,v2$,v3$)
	If a1>=0 Then
		v4=Floor(a1/10)-1.0
		v5=a1 Mod 10-(9-inventorysize)
		removeitemfrominventory(v4*inventorysize+v5)
	End If
	If (currentcharm<>a0 And (currentcharm>0)) Then
		Restore dataLabel211
		;v1=1
		For v1=1 To currentcharm
			Read v2$
			Read v3$
			;v1=v1+1
		Next
		If v6=-1 Then
			additemtoinventory(-1,(currentcharm-1)*10+2001,-1,(32+currentcharm)-1,v2$,"Wear")
		Else
			additemtoinventory(v4*inventorysize+v5,(currentcharm-1)*10+2001,-1,(32+currentcharm)-1,v2$,"Wear")
		End If
	End If
	currentcharm=a0
End Function

Function toodark()
	
	If lightredgoal+lightbluegoal+lightgreengoal+ambientredgoal+ambientbluegoal+ambientgreengoal<500 Then
		Return 1
	End If
	Return 0
End Function

Function turnonlightspell()
	
End Function

Function swapitem(a0)
	
	gamemode=5
	v1=Floor(a0/10)-1.0
	v2=a0 Mod 10-(9-inventorysize)
	v3=v1*inventorysize+v2
	v4=inventoryitem(v3)
	v5=inventoryid(v3)
	v6=inventorytexture(v3)
	v7$=inventorysubtext(v3)
	v8$=inventoryhelptext(v3)
	v9=inventoryswapitem
	additemtoinventory(v3,inventoryitem(v9),inventoryid(v9),inventorytexture(v9),inventorysubtext(v9),inventoryhelptext(v9))
	additemtoinventory(inventoryswapitem,v4,v5,v6,v7$,v8$)
	nofinventoryitems=nofinventoryitems-2
End Function

Function startdialog(a0,a1,a2)
	
	gamemode=8
	playercontrolmode=0
	dialogobject1=-1
	dialogobject2=-1
	objectmovexgoal(playerobject)=objecttilex2(playerobject)
	objectmoveygoal(playerobject)=objecttiley2(playerobject)
	currentdialog=a0
	currentinterchange=a1
	If a2=0 Then
		dialoglinelength=38
	Else
		dialoglinelength=30
	End If
	loaddialog(a0)
	If a1<0 Then
		currentinterchange=startinginterchange
	End If
	startinterchange()
	MoveMouse gfxwidth/2.0,gfxheight*14/24.0
	ShowEntity dialogbackgroundentity
End Function

Function enddialog()
	
	savedialog(currentdialog)
	cameraaddzoom=0.0
	cameraaddx=0.0
	cameraaddy=0.0
	cameraaddz=0.0
	gamemode=0
	dialogobject1=-1
	dialogobject2=-1
End Function

Function loaddialog(a0)
	
	startinginterchange=0
	nofinterchanges=1
	;v1=0
	For v1=0 To 99
		nofinterchangetextlines(v1)=0
		;v2=0
		For v2=0 To 6
			interchangetextline(v1,v2)=""
			;v2=v2+1
		Next
		noftextcommands(v1)=0
		;v2=0
		For v2=0 To 199
			dialogtextcommand(v1,v2)=""
			dialogtextcommandpos(v1,v2)=-1
			;v2=v2+1
		Next
		nofinterchangereplies(v1)=1
		;v2=0
		For v2=0 To 7
			interchangereplytext(v1,v2)=""
			interchangereplyfunction(v1,v2)=0
			interchangereplydata(v1,v2)=0
			interchangereplycommand(v1,v2)=0
			;v3=0
			For v3=0 To 3
				interchangereplycommanddata(v1,v2,v3)=0
				;v3=v3+1
			Next
			;v2=v2+1
		Next
		;v1=v1+1
	Next
	nofaskabouts=0
	askabouttoptext=""
	;v1=0
	For v1=0 To 99
		askabouttext(v1)=""
		askaboutactive(v1)=0
		askaboutinterchange(v1)=0
		askaboutrepeat(v1)=0
		;v1=v1+1
	Next
	If adventurecurrentlevel<0 Then
		v4=ReadFile(globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+a0+".dia")
	Else
		v4=ReadFile(globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+a0+".dia")
	End If
	nofinterchanges=ReadInt(v4)
	;v1=0
	For v1=0 To nofinterchanges-1
		nofinterchangetextlines(v1)=ReadInt(v4)
		;v2=0
		For v2=0 To nofinterchangetextlines(v1)-1
			interchangetextline(v1,v2)=ReadString(v4)
			;v2=v2+1
		Next
		noftextcommands(v1)=ReadInt(v4)
		;v2=0
		For v2=0 To noftextcommands(v1)-1
			dialogtextcommand(v1,v2)=ReadString(v4)
			dialogtextcommandpos(v1,v2)=ReadInt(v4)
			;v2=v2+1
		Next
		nofinterchangereplies(v1)=ReadInt(v4)
		;v2=0
		For v2=0 To nofinterchangereplies(v1)-1
			interchangereplytext(v1,v2)=ReadString(v4)
			interchangereplyfunction(v1,v2)=ReadInt(v4)
			interchangereplydata(v1,v2)=ReadInt(v4)
			interchangereplycommand(v1,v2)=ReadInt(v4)
			;v3=0
			For v3=0 To 3
				interchangereplycommanddata(v1,v2,v3)=ReadInt(v4)
				;v3=v3+1
			Next
			;v2=v2+1
		Next
		;v1=v1+1
	Next
	nofaskabouts=ReadInt(v4)
	askabouttoptext=ReadString(v4)
	;v1=0
	For v1=0 To nofaskabouts-1
		askabouttext(v1)=ReadString(v4)
		askaboutactive(v1)=ReadInt(v4)
		askaboutinterchange(v1)=ReadInt(v4)
		askaboutrepeat(v1)=ReadInt(v4)
		;v1=v1+1
	Next
	startinginterchange=ReadInt(v4)
	CloseFile(v4)
End Function

Function savedialog(a0)
	
	If adventurecurrentlevel<0 Then
		v1=WriteFile(globaldirname+"\Player Profiles\"+playername+"\Current\Hub\"+a0+".dia")
	Else
		v1=WriteFile(globaldirname+"\Player Profiles\"+playername+"\Current\Adventure\"+a0+".dia")
	End If
	WriteInt(v1,nofinterchanges)
	;v2=0
	For v2=0 To nofinterchanges-1
		WriteInt(v1,nofinterchangetextlines(v2))
		;v3=0
		For v3=0 To nofinterchangetextlines(v2)-1
			WriteString(v1,interchangetextline(v2,v3))
			;v3=v3+1
		Next
		WriteInt(v1,noftextcommands(v2))
		;v3=0
		For v3=0 To noftextcommands(v2)-1
			WriteString(v1,dialogtextcommand(v2,v3))
			WriteInt(v1,dialogtextcommandpos(v2,v3))
			;v3=v3+1
		Next
		WriteInt(v1,nofinterchangereplies(v2))
		;v3=0
		For v3=0 To nofinterchangereplies(v2)-1
			WriteString(v1,interchangereplytext(v2,v3))
			WriteInt(v1,interchangereplyfunction(v2,v3))
			WriteInt(v1,interchangereplydata(v2,v3))
			WriteInt(v1,interchangereplycommand(v2,v3))
			;v4=0
			For v4=0 To 3
				WriteInt(v1,interchangereplycommanddata(v2,v3,v4))
				;v4=v4+1
			Next
			;v3=v3+1
		Next
		;v2=v2+1
	Next
	WriteInt(v1,nofaskabouts)
	WriteString(v1,askabouttoptext)
	;v2=0
	For v2=0 To nofaskabouts-1
		WriteString(v1,askabouttext(v2))
		WriteInt(v1,askaboutactive(v2))
		WriteInt(v1,askaboutinterchange(v2))
		WriteInt(v1,askaboutrepeat(v2))
		;v2=v2+1
	Next
	WriteInt(v1,startinginterchange)
	CloseFile(v1)
End Function

Function startinterchange()
	
	v1=38
	v2=GetSurface(dialogbackgroundentity,1)
	VertexCoords v2,0,-2.0,1.3,5.0
	VertexCoords v2,1,2.0,1.3,5.0
	VertexCoords v2,2,-2.0,(-0.5)-((nofinterchangereplies(currentinterchange)-1)*0.16),5.0
	VertexCoords v2,3,2.0,(-0.5)-((nofinterchangereplies(currentinterchange)-1)*0.16),5.0
	dialogtimer=0
	mousegamemode=-2
End Function

Function displaydialog()
	
	dialogcurrentred=255
	dialogcurrentgreen=255
	dialogcurrentblue=255
	dialogcurrenteffect=0
	If currentinterchange=-1 Then
		displayaskabout()
		Return 0
	End If
	v1=38
	If nofinterchangetextlines(currentinterchange)<7 Then
		v2=7-nofinterchangetextlines(currentinterchange)
	End If
	v3=0
	;v4=0
	For v4=0 To nofinterchangetextlines(currentinterchange)-1
		If Len(interchangetextline(currentinterchange,v4))+v3<=dialogtimer Then
			v5=Len(interchangetextline(currentinterchange,v4))
		Else If v3>dialogtimer Then
			v5=0
		Else
			v5=dialogtimer-v3
		End If
		dialoglinelength=Len(interchangetextline(currentinterchange,v4))
		;v6=1
		For v6=1 To v5
			;v7=0
			For v7=0 To noftextcommands(currentinterchange)
				If (v4*38+v6)-1=dialogtextcommandpos(currentinterchange,v7) Then
					Select dialogtextcommand(currentinterchange,v7)
					Case "CWHI"
						dialogcurrentred=255
						dialogcurrentgreen=255
						dialogcurrentblue=255
					Case "CGRY"
						dialogcurrentred=195
						dialogcurrentgreen=195
						dialogcurrentblue=195
					Case "CRED"
						dialogcurrentred=255
						dialogcurrentgreen=100
						dialogcurrentblue=100
					Case "CORA"
						dialogcurrentred=255
						dialogcurrentgreen=155
						dialogcurrentblue=0
					Case "CYEL"
						dialogcurrentred=255
						dialogcurrentgreen=255
						dialogcurrentblue=0
					Case "CGRE"
						dialogcurrentred=0
						dialogcurrentgreen=255
						dialogcurrentblue=0
					Case "CCYA"
						dialogcurrentred=0
						dialogcurrentgreen=255
						dialogcurrentblue=255
					Case "CBLU"
						dialogcurrentred=130
						dialogcurrentgreen=130
						dialogcurrentblue=255
					Case "CPUR"
						dialogcurrentred=255
						dialogcurrentgreen=100
						dialogcurrentblue=255
					Case "CRAI"
						dialogcurrentred=Rand(0,255)
						dialogcurrentgreen=Rand(0,255)
						dialogcurrentblue=Rand(0,255)
					Case "CBLI"
						dialogcurrentred=150.0+105.0*Sin(dialogtimer*8)
						dialogcurrentgreen=150.0+105.0*Sin(dialogtimer*8)
						dialogcurrentblue=150.0+105.0*Sin(dialogtimer*8)
					Case "CWAR"
						dialogcurrentred=150.0+105.0*Sin(dialogtimer*8)
						dialogcurrentgreen=60
						dialogcurrentblue=60
					Case "ENON"
						dialogcurrenteffect=0
					Case "ESHI"
						dialogcurrenteffect=1
					Case "EJIT"
						dialogcurrenteffect=2
					Case "EWAV"
						dialogcurrenteffect=3
					Case "EBOU"
						dialogcurrenteffect=4
					Case "EZOO"
						dialogcurrenteffect=5
					Case "EZSH"
						dialogcurrenteffect=6
					Case "ECIR"
						dialogcurrenteffect=7
					Case "EEIG"
						dialogcurrenteffect=8
					Case "EUPD"
						dialogcurrenteffect=9
					Case "ELER"
						dialogcurrenteffect=10
					Case "EROT"
						dialogcurrenteffect=11
					End Select
				End If
				;v7=v7+1
			Next
			v9#=1.0
			v10#=1.0
			v11=0
			v12#=0.0
			v13#=0.0
			Select dialogcurrenteffect
			Case 1
				v12#=Rnd(-0.1,0.1)
			Case 2
				v12#=Rnd(-0.15,0.15)
				v13#=Rnd(-0.1,0.1)
			Case 3
				v13#=0.2*Sin((v3+dialogtimer)*10)
			Case 4
				v9#=1.0+0.3*Sin((v3+dialogtimer)*10)
				v10#=1.0/v9#
			Case 5
				If dialogtimer<v3*2 Then
					v9#=0.00001
				Else If dialogtimer<v3*2+5 Then
					v9#=4.0-(Sin((dialogtimer-(v3*2))*18)*3.0)
					v10#=1.0/v9#
				End If
			Case 6
				If dialogtimer<v3*2 Then
					v9#=0.00001
				Else If dialogtimer<v3*2+5 Then
					v9#=4.0-(Sin((dialogtimer-(v3*2))*18)*3.0)
					v10#=1.0/v9#
				End If
				v12#=Rnd(-0.15,0.15)
				v13#=Rnd(-0.1,0.1)
			Case 7
				v12#=Cos(dialogtimer*4)
				v13#=Sin(dialogtimer*4)
			Case 8
				v12#=Cos(dialogtimer*2)
				v13#=Sin(dialogtimer*4)
			Case 9
				v13#=Sin(dialogtimer*8)
			Case 10
				v12#=Cos(dialogtimer*8)
			End Select
			v15#=(40-v1)/2.0+5.0+((v1-dialoglinelength)/2)+(v6-1)+v12#
			v16#=v2/2.0+4.0+v4+v13#
			v17=Asc(Mid$(interchangetextline(currentinterchange,v4),v6,1))-32
			addletter(v17,(v15#*0.0396*v9#*v10#+-0.97)/camerazoomlevel,(0.7-(v16#*0.0623*v9#*v10#))/camerazoomlevel,1.0,0.0,0.044*v9#/camerazoomlevel,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0,dialogcurrentred,dialogcurrentgreen,dialogcurrentblue)
			v3=v3+1
			;v6=v6+1
		Next
		;v4=v4+1
	Next
	If interchangereplytext(currentinterchange,0)<>"(OK)" Then
		displaytext("Choose Your Response:",39.0,25.0,0.5,1.0,255,230,0)
	End If
	v18=0
	;v4=0
	For v4=0 To nofinterchangereplies(currentinterchange)-1
		v19#=1.0
		If dialogtimer<25 Then
			v19#=dialogtimer/25.0
		End If
		If v4=currentinterchangereply Then
			v18=1
			v9#=(Sin(leveltimer*4 Mod 360)*0.25+1.0)*v19#
			v20#=1.0
		Else
			v9#=1.0*v19#
			v20#=0.75
		End If
		If interchangereplytext(currentinterchange,v4)<>"(OK)" Then
			v5=Len(interchangereplytext(currentinterchange,v4))+2
			displaytext(Chr$(34)+interchangereplytext(currentinterchange,v4)+Chr$(34),25.0-(v5/2.0),13.5+v4,v9#,1.0/v9#,255,255.0*v20#,0)
		Else
			v5=Len(interchangereplytext(currentinterchange,v4))
			displaytext(interchangereplytext(currentinterchange,v4),25.0-(v5/2.0),13.5+v4,v9#,1.0/v9#,255,255.0*v20#,0)
		End If
		;v4=v4+1
	Next
	If v18=1 Then
		EntityAlpha mousecursor,0.4
	Else
		EntityAlpha mousecursor,0.8
	End If
End Function

Function startaskabout()
	
	dialogtextline(0)=askabouttoptext
	v1=1
	;v2=0
	For v2=0 To nofaskabouts-1
		If askaboutrepeat(v2)<>0 Then
			If askaboutactive(v2)>=0 Then
				If masteraskaboutactive(askaboutactive(v2))=1 Then
					dialogtextline(v1)=askabouttext(v2)
					v1=v1+1
				End If
			Else If askaboutactive(v2)=-2 Then
				dialogtextline(v1)=askabouttext(v2)
				v1=v1+1
			End If
		End If
		;v2=v2+1
	Next
	currentinterchangenoflines=v1
	v3=GetSurface(dialogbackgroundentity,1)
	VertexCoords v3,2,-2.0,-0.5,5.0
	VertexCoords v3,3,2.0,-0.5,5.0
	dialogtimer=0
End Function

Function displayaskabout()
	
	If currentinterchangenoflines<10 Then
		v1=10-currentinterchangenoflines
	End If
	displaytext(dialogtextline(0),(50-Len(dialogtextline(0)))/2,4.0+(v1/2.0),1.0,1.0,255,230,0)
	v2=0
	;v3=1
	For v3=1 To currentinterchangenoflines-1
		v4#=1.0
		If dialogtimer<25 Then
			v4#=dialogtimer/25.0
		End If
		If v3=currentinterchangereply Then
			v5#=(Sin(leveltimer*4 Mod 360)*0.25+1.0)*v4#
			v6#=1.0
			v2=1
		Else
			v5#=1.0*v4#
			v6#=0.75
		End If
		displaytext(dialogtextline(v3),(50-Len(dialogtextline(v3)))/2,v1/2.0+4.5+v3,v5#,1.0/v5#,255,255.0*v6#,0)
		;v3=v3+1
	Next
	If v2=1 Then
		EntityAlpha mousecursor,0.4
	Else
		EntityAlpha mousecursor,0.8
	End If
End Function

Function controldialog()
	
	If menukeydown=1 Then
		If (((KeyDown(208)=0 And (KeyDown(200)=0)) And (KeyDown(156)=0)) And (KeyDown(28)=0)) Then
			menukeydown=0
		End If
	End If
	dialogtimer=dialogtimer+1
	PositionEntity dialogbackgroundentity,0.0,0.0,20.0-(20.0*Sin(dialogbackgroundsize)),0
	EntityAlpha dialogbackgroundentity,dialogbackgroundsize/180.0
	If gamemode=8 Then
		If dialogbackgroundsize<90 Then
			dialogbackgroundsize=dialogbackgroundsize+2
			Return 0
		End If
	Else If dialogbackgroundsize>0 Then
		dialogbackgroundsize=dialogbackgroundsize-2
	Else
		HideEntity dialogbackgroundentity
	End If
	If gamemode<>8 Then
		Return 0
	End If
	HideEntity levelcursor
	currentinterchangereply=-1
	v1#=Float(MouseX()*50.0)/Float(gfxwidth)
	v2#=Float(MouseY()*24.0)/Float(gfxheight)
	If currentinterchange=-1 Then
		v3=0
		If currentinterchangenoflines<10 Then
			v3=10-currentinterchangenoflines
		End If
		;v4=1
		For v4=1 To currentinterchangenoflines-1
			If (((v1#>15.0 And (v1#<45.0)) And (v3/2.0+(5+v4)<v2#)) And (v3/2.0+(6+v4)>v2#)) Then
				currentinterchangereply=v4
			End If
			;v4=v4+1
		Next
		If (KeyDown(200) And (menukeydown=0)) Then
			menukeydown=1
			If currentinterchangereply=-1 Then
				currentinterchangereply=1
			Else
				currentinterchangereply=currentinterchangereply-1
				If currentinterchangereply=0 Then
					currentinterchangereply=currentinterchangenoflines-1
				End If
			End If
			MoveMouse gfxwidth/2.0,(5.5+currentinterchangereply+(v3/2.0))*gfxheight/24.0
		End If
		If (KeyDown(208) And (menukeydown=0)) Then
			menukeydown=1
			If currentinterchangereply=-1 Then
				currentinterchangereply=1
			Else
				currentinterchangereply=currentinterchangereply+1
				If currentinterchangereply=currentinterchangenoflines Then
					currentinterchangereply=1
				End If
			End If
			MoveMouse gfxwidth/2.0,(5.5+currentinterchangereply+(v3/2.0))*gfxheight/24.0
		End If
		v5=0
		If ((KeyDown(28) Or (KeyDown(156))) And (menukeydown=0)) Then
			v5=1
			If currentinterchangereply=-1 Then
				currentinterchangereply=1
			End If
		End If
		If (((mouse1 Or (v5)) And (mousegamemode<>-2)) And (currentinterchangereply>=0)) Then
			menukeydown=1
			v6=0
			;v3=0
			For v3=0 To 20
				If askaboutrepeat(v3)<>0 Then
					If askaboutactive(v3)>=0 Then
						If masteraskaboutactive(askaboutactive(v3))=1 Then
							v6=v6+1
						End If
					Else If askaboutactive(v3)=-2 Then
						v6=v6+1
					End If
				End If
				If v6=currentinterchangereply Then
					Exit
				End If
				;v3=v3+1
			Next
			If askaboutrepeat(v3)>0 Then
				askaboutrepeat(v3)=askaboutrepeat(v3)-1
			End If
			playsoundfxnow(136)
			currentinterchange=askaboutinterchange(v3)
			startinterchange()
		End If
	Else
		;v4=0
		For v4=0 To nofinterchangereplies(currentinterchange)-1
			If (((v1#>5.0 And (v1#<45.0)) And (13.5+v4<v2#)) And (14.5+v4>v2#)) Then
				currentinterchangereply=v4
			End If
			;v4=v4+1
		Next
		If (KeyDown(200) And (menukeydown=0)) Then
			menukeydown=1
			If currentinterchangereply=-1 Then
				currentinterchangereply=0
			Else
				currentinterchangereply=currentinterchangereply-1
				If currentinterchangereply=-1 Then
					currentinterchangereply=nofinterchangereplies(currentinterchange)-1
				End If
			End If
			MoveMouse gfxwidth/2.0,(14.0+currentinterchangereply)*gfxheight/24.0
		End If
		If (KeyDown(208) And (menukeydown=0)) Then
			menukeydown=1
			If currentinterchangereply=-1 Then
				currentinterchangereply=0
			Else
				currentinterchangereply=currentinterchangereply+1
				If currentinterchangereply=nofinterchangereplies(currentinterchange) Then
					currentinterchangereply=0
				End If
			End If
			MoveMouse gfxwidth/2.0,(14.0+currentinterchangereply)*gfxheight/24.0
		End If
		v5=0
		If ((KeyDown(28) Or (KeyDown(156))) And (menukeydown=0)) Then
			v5=1
			If currentinterchangereply=-1 Then
				currentinterchangereply=0
			End If
		End If
		If (((mouse1 Or (v5=1)) And (mousegamemode<>-2)) And (currentinterchangereply>=0)) Then
			menukeydown=1
			activatecommand(interchangereplycommand(currentinterchange,currentinterchangereply),interchangereplycommanddata(currentinterchange,currentinterchangereply,0),interchangereplycommanddata(currentinterchange,currentinterchangereply,1),interchangereplycommanddata(currentinterchange,currentinterchangereply,2),interchangereplycommanddata(currentinterchange,currentinterchangereply,3))
			playsoundfxnow(136)
			v7=interchangereplydata(currentinterchange,currentinterchangereply)
			Select interchangereplyfunction(currentinterchange,currentinterchangereply)
			Case 1
				If v7>=0 Then
					startinginterchange=v7
				End If
				enddialog()
			Case 2
				currentinterchange=v7
				startinterchange()
			Case 3
				currentinterchange=-1
				startaskabout()
			Case 4
				If playercoins>=v7 Then
					playercoins=playercoins-v7
					currentinterchange=currentinterchange+2
					startinterchange()
				Else
					currentinterchange=currentinterchange+1
					startinterchange()
				End If
			Case 5
				v9=0
				;v3=0
				For v3=0 To 99
					If inventoryid(v3)=v7 Then
						v9=1
						v4=v3
					End If
					;v3=v3+1
				Next
				If v9=1 Then
					removeitemfrominventory(v4)
					currentinterchange=currentinterchange+2
					startinterchange()
				Else
					currentinterchange=currentinterchange+1
					startinterchange()
				End If
			End Select
			mousegamemode=-2
		End If
	End If
End Function

Function startmenu(a0)
	
	currentmenu=a0
	currentmenunofitems=0
	;v1=0
	For v1=0 To 9
		menuactive(a0,v1)=2
		If menutext(a0,v1)<>"" Then
			currentmenunofitems=v1+1
		End If
		;v1=v1+1
	Next
	;v1=0
	For v1=0 To 9
		HideEntity saveslotentity(v1)
		;v1=v1+1
	Next
	menutime=Millisecs()
	RotateEntity levellight,35.0,-35.0,0.0,0
	If a0=0 Then
		exitafterthissave=0
		If saveslotimage>0 Then
			FreeImage saveslotimage
		End If
		saveslotimage=CreateImage(256,256,1)
		If saveslotimage2>0 Then
			FreeImage saveslotimage2
		End If
		saveslotimage2=CreateImage(2048,2048,1)
		GrabImage saveslotimage2,0,0,0
		If gamemode=8 Then
			menuactive(a0,1)=1
			menuactive(a0,2)=1
		End If
		If adventurecurrentstatus=0 Then
			menuactive(a0,3)=1
			menuactive(a0,4)=1
		End If
		If (leveltimer>=1000002000 And (leveltimer<=1000002500)) Then
			menuactive(a0,2)=1
		End If
	Else If ((a0=1 Or (a0=2)) Or (a0=3)) Then
		menuactive(a0,0)=3
		menuactive(a0,1)=3
		menuactive(a0,2)=3
	Else If ((a0=4 Or (a0=5)) Or (a0=16)) Then
		menuactive(a0,0)=3
		menuactive(a0,1)=3
		;v1=1
		For v1=1 To 9
			If saveslottexture(v1)>0 Then
				FreeTexture saveslottexture(v1)
				saveslottexture(v1)=0
			End If
			If FileType(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+v1+"\wla")=0 Then
				saveslotlevelname(v1)=""
				saveslotdatetime(v1)=""
				saveslottexture(v1)=myloadtexture("data\graphics\emptyslot.jpg",1)
				EntityTexture saveslotentity(v1),saveslottexture(v1),0,0
				ShowEntity saveslotentity(v1)
			Else
				v2=ReadFile(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+v1+"\wla")
				saveslotdatetime(v1)=ReadString(v2)
				saveslotlevelname(v1)=ReadString(v2)
				v3=ReadInt(v2)
				CloseFile(v2)
				saveslottexture(v1)=LoadTexture(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+v1+"\"+v3+".bmp",1)
				If saveslottexture(v1)>0 Then
					EntityTexture saveslotentity(v1),saveslottexture(v1),0,0
					ShowEntity saveslotentity(v1)
				End If
			End If
			;v1=v1+1
		Next
	Else If a0=6 Then
		menuactive(a0,0)=3
		menuactive(a0,1)=3
		menuactive(a0,2)=3
		menuactive(a0,3)=3
		menutext(a0,1)=gamenametobesaved
	Else If a0=8 Then
		currentmenunofitems=8
		currentreplayadventure=1
		currentreplayadventurename="Stinker Rescue"
	Else If a0=11 Then
		CameraClsColor camera,0.0,0.0,0.0
		ShowEntity titlemenuentity(60)
		menuactive(a0,0)=3
		v2=WriteFile(globaldirname+"\global.wdf")
		WriteString(v2,playername)
		WriteString(v2,playercharactername)
		WriteInt(v2,globalsoundvolume2)
		WriteInt(v2,globalmusicvolume2)
		WriteInt(v2,keyboardmode)
		CloseFile(v2)
		menuactive(a0,3)=1
		;v1=1
		For v1=1 To 9
			If FileType(globaldirname+"\Player Profiles\"+playername+"\SaveFiles\"+v1+"\wla")=1 Then
				menuactive(a0,3)=2
			End If
			;v1=v1+1
		Next
	Else If a0=12 Then
		If FileType(globaldirname+"\Player Profiles")<>2 Then
			CreateDir globaldirname+"\Player Profiles"
		End If
		If playername<>"" Then
			oldplayername=playername
			oldplayercharactername=playercharactername
			playername=""
			playercharactername=""
		End If
		menuactive(a0,0)=3
		;v1=1
		For v1=1 To 8
			menutext(a0,v1)=""
			;v1=v1+1
		Next
		v4=ReadDir(globaldirname+"\Player Profiles")
		v1=1
		v5$=NextFile(v4)
		Repeat
			If ((FileType(globaldirname+"\Player Profiles\"+v5$)=2 And (v5$<>".")) And (v5$<>"..")) Then
				menutext(a0,v1)=v5$
				v1=v1+1
			End If
			v5$=NextFile(v4)
		Until (v5$="" Or (v1=9))
		CloseDir v4
		If v1=9 Then
			menutext(a0,9)=""
			menuactive(a0,9)=3
		Else
			menutext(a0,9)="Create New Profile"
			menuactive(a0,9)=2
		End If
		If v1=1 Then
			startmenu(13)
		End If
	Else If a0=13 Then
		menuactive(a0,0)=3
		menuactive(a0,2)=3
		menutext(a0,2)="_"
	Else If a0=14 Then
		menuactive(a0,0)=3
		menuactive(a0,9)=0
		;v1=5
		For v1=5 To 9
			titlemenuentity(v1)=CopyEntity(stinkermesh,0)
			If v1=9 Then
				EntityColor GetChild(titlemenuentity(v1),3),10.0,10.0,10.0
			Else
				EntityTexture GetChild(titlemenuentity(v1),3),stinkertexture(v1-4,0),0,0
			End If
			;v1=v1+1
		Next
		PositionEntity titlemenuentity(5),-1.0,0.2,7.0,0
		ScaleEntity titlemenuentity(5),0.035,0.035,0.035,0
		PointEntity titlemenuentity(5),camera,0.0
		TurnEntity titlemenuentity(5),-20.0,180.0,0.0,0
		titlemenuentity(10)=myloadmesh("data/models/stinker/accessory001.3ds",0)
		titlemenutexture(10)=myloadtexture("data/models/stinker/accessory001a.jpg",4)
		EntityTexture titlemenuentity(10),titlemenutexture(10),0,0
		ScaleEntity titlemenuentity(10),0.035,0.035,0.035,0
		Animate GetChild(titlemenuentity(5),3),1,0.05,10,0.0
		PositionEntity titlemenuentity(6),1.0,0.2,7.0,0
		ScaleEntity titlemenuentity(6),0.027,0.027,0.027,0
		PointEntity titlemenuentity(6),camera,0.0
		TurnEntity titlemenuentity(6),-20.0,180.0,0.0,0
		titlemenuentity(11)=myloadmesh("data/models/stinker/accessory001.3ds",0)
		titlemenutexture(11)=myloadtexture("data/models/stinker/accessory001b.jpg",4)
		EntityTexture titlemenuentity(11),titlemenutexture(11),0,0
		ScaleEntity titlemenuentity(11),0.027,0.027,0.027,0
		Animate GetChild(titlemenuentity(6),3),1,0.12,10,0.0
		PositionEntity titlemenuentity(7),-2.0,-1.4,7.0,0
		ScaleEntity titlemenuentity(7),0.038,0.038,0.034,0
		PointEntity titlemenuentity(7),camera,0.0
		TurnEntity titlemenuentity(7),-25.0,180.0,0.0,0
		titlemenuentity(12)=myloadmesh("data/models/stinker/accessory001.3ds",0)
		titlemenutexture(12)=myloadtexture("data/models/stinker/accessory001c.jpg",4)
		EntityTexture titlemenuentity(12),titlemenutexture(12),0,0
		ScaleEntity titlemenuentity(12),0.038,0.034,0.038,0
		Animate GetChild(titlemenuentity(7),3),1,0.08,10,0.0
		EntityPickMode titlemenuentity(7),3,1
		PositionEntity titlemenuentity(8),0.0,-1.4,7.0,0
		ScaleEntity titlemenuentity(8),0.035,0.035,0.035,0
		PointEntity titlemenuentity(8),camera,0.0
		TurnEntity titlemenuentity(8),-20.0,180.0,0.0,0
		titlemenuentity(13)=myloadmesh("data/models/stinker/accessory002.3ds",0)
		titlemenutexture(13)=myloadtexture("data/models/stinker/accessory002a.jpg",4)
		EntityTexture titlemenuentity(13),titlemenutexture(13),0,0
		ScaleEntity titlemenuentity(13),0.035,0.035,0.035,0
		Animate GetChild(titlemenuentity(8),3),1,0.1,10,0.0
		PositionEntity titlemenuentity(9),2.0,-1.4,7.0,0
		ScaleEntity titlemenuentity(9),0.035,0.035,0.035,0
		PointEntity titlemenuentity(9),camera,0.0
		TurnEntity titlemenuentity(9),-20.0,180.0,0.0,0
		Animate GetChild(titlemenuentity(9),3),1,0.02,10,0.0
		titlemenupointat=0
	Else If a0=15 Then
		menuactive(15,0)=3
		titlemenuentity(5)=CopyEntity(stinkermesh,0)
		EntityTexture GetChild(titlemenuentity(5),3),stinkertexture(1,0),0,0
		titlemenuentity(6)=0
		titlemenuentity(7)=0
		playercharactername=""
		playertexturebody=1
		playeracc1=0
		playertexacc1=0
		playeracc2=0
		playertexacc2=0
		playersizex=0.035
		playersizey=0.035
		playersizez=0.035
		playervoice=1
		PositionEntity titlemenuentity(5),-1.0,-0.2,5.0,0
		Animate GetChild(titlemenuentity(5),3),1,0.02,10,0.0
		PointEntity titlemenuentity(5),camera,0.0
		TurnEntity titlemenuentity(5),-45.0,180.0,0.0,0
	Else If a0=17 Then
		;v1=0
		For v1=0 To 5
			menuactive(a0,v1)=3
			;v1=v1+1
		Next
	Else If a0=18 Then
		menuactive(a0,0)=3
		If keyboardmode=1 Then
			menutext(18,3)="Mouse Control"
		Else
			menutext(18,3)="Mouse/Keyboard"
		End If
		menutext(18,4)="Sound Volume: "+globalsoundvolume2
		menutext(18,5)="Music Volume: "+globalmusicvolume2
	Else If a0=19 Then
		menuactive(a0,0)=3
		menuactive(a0,1)=3
		menuactive(a0,2)=3
	End If
	If (gamemode=5 Or (gamemode=6)) Then
		gamemode=0
		closerucksack(8)
	End If
	oldgamemode=gamemode
	gamemode=12
	iconsize(9)=1
	dialogtimer=0
	iconhelptext(9)="Close"
	v6=GetSurface(dialogbackgroundentity,1)
	VertexCoords v6,0,-2.2,0.2+0.16*currentmenunofitems,5.0
	VertexCoords v6,1,2.2,0.2+0.16*currentmenunofitems,5.0
	VertexCoords v6,2,-2.2,(-0.16)*currentmenunofitems,5.0
	VertexCoords v6,3,2.2,(-0.16)*currentmenunofitems,5.0
	If a0<10 Then
		ShowEntity dialogbackgroundentity
	Else
		HideEntity dialogbackgroundentity
		;v1=80
		For v1=80 To 99
			ShowEntity titlemenuentity(v1)
			;v1=v1+1
		Next
		If currentmusic<>1 Then
			If globalmusicvolume2>0 Then
				If ChannelPlaying(musicchannel) Then
					StopChannel musicchannel
				End If
				musicchannel=PlayMusic("data\music\1.ogg")
				ChannelVolume musicchannel,globalmusicvolume
				currentmusic=1
			Else
				currentmusic=-1
			End If
		End If
		PositionEntity camera,0.0,0.0,0.0,0
		RotateEntity camera,0.0,0.0,0.0,0
		AmbientLight 255.0,255.0,255.0
		RotateEntity levellight,35.0,-35.0,0.0,0
		CameraFogMode camera,0
		CameraRange camera,0.1,1000.0
		;v1=0
		For v1=0 To 79
			deleteicon(v1)
			;v1=v1+1
		Next
	End If
	dialogbackgroundsize=70
End Function

Function updatemenu()
	
	;v1=7
	For v1=7 To 8
		If (iconsize(v1)>0 And ((iconsize(v1) Mod 2=1 Or (iconsize(v1)=1000)))) Then
			iconsize(v1)=1
		End If
		;v1=v1+1
	Next
	If currentmenu<100 Then
		updateoldmenu()
	Else
		Select currentmenu
		Case 100
			customselectmenu()
		Case 101
			customdeletemenu()
		Case 102
			waeditortitlemenu()
		Case 103
			customarchivemenu()
		End Select
	End If
End Function

Function updateoldmenu()
	
	UpdateWorld 1.0
	mouse1=0
	mouse2=0
	If (MouseDown(1)=1 Or (MouseHit(1)>0)) Then
		mouse1=1
	End If
	If (MouseDown(2)=1 Or (MouseHit(2)>0)) Then
		mouse2=1
	End If
	ShowEntity mousecursor
	mousecursorvisible=1
	If currentmenu>10 Then
		PositionTexture titlemenutexture(80),(-(menutimer Mod 2500))/2500.0,menutimer Mod 5000/5000.0
		;v1=81
		For v1=81 To 99
			TranslateEntity titlemenuentity(v1),-Float(v1/10000.0),-Float(v1*2/10000.0),0.0,0
			If (EntityX(titlemenuentity(v1),0)<-14.0 Or (EntityY(titlemenuentity(v1),0)<-14.0)) Then
				FreeEntity titlemenuentity(v1)
				titlemenuentity(v1)=CopyEntity(starmesh,0)
				RotateEntity titlemenuentity(v1),-90.0,0.0,0.0,0
				EntityFX titlemenuentity(v1),1
				PositionEntity titlemenuentity(v1),Rnd(-10.0,20.0),14.0,Rnd(20.0,30.0),0
			End If
			TurnEntity titlemenuentity(v1),0.0,1.0,0.0,0
			;v1=v1+1
		Next
		RotateEntity titlemenuentity(60),-90.0,0.0,0.0,0
		TurnEntity titlemenuentity(60),0.0,5.0*Sin(menutimer Mod 360),0.0,0
	End If
	If currentmenu=4 Then
		v2=0
		HideEntity saveslotentity(0)
		;v1=1
		For v1=1 To 9
			;If (((v1*75*gfxwidth/800.0<MouseX() And (MouseX()>MouseX())) And (MouseY()<MouseY())) And (200*gfxheight/600.0>MouseY())) Then
			If MouseX()>v1*75*GfxWidth/800.0 And MouseX()<(v1*75+50)*GfxWidth/800.0 And MouseY()>150*GfxHeight/600.0 And MouseY()<200*GfxHeight/600.0 Then
				ScaleEntity saveslotentity(v1),0.7,0.7,0.7,0
				If saveslotdatetime(v1)<>"" Then
					ShowEntity saveslotentity(0)
					EntityTexture saveslotentity(0),saveslottexture(v1),0,0
					displaytext(saveslotlevelname(v1),25.0-(Len(saveslotlevelname(v1))*0.5),16.5,1.0,1.0,255,255,255)
					displaytext(saveslotdatetime(v1),25.0-(Len(saveslotdatetime(v1))*0.5),17.5,1.0,1.0,255,255,255)
				End If
			Else
				ScaleEntity saveslotentity(v1),0.5,0.5,0.5,0
			End If
			If saveslotdatetime(v1)<>"" Then
				v2=1
			End If
			;v1=v1+1
		Next
		If v2=0 Then
			v3$="Select one of the nine 'Save Slots' above."
			displaytext(v3$,25.0-(Len(v3$)*0.5),12.0,1.0,1.0,200,200,200)
			v3$="Once saved, you can resume your game from"
			displaytext(v3$,25.0-(Len(v3$)*0.5),13.0,1.0,1.0,200,200,200)
			v3$="this position using the Load Game function."
			displaytext(v3$,25.0-(Len(v3$)*0.5),14.0,1.0,1.0,200,200,200)
		End If
	Else If (currentmenu=5 Or (currentmenu=16)) Then
		v2=0
		HideEntity saveslotentity(0)
		;v1=1
		For v1=1 To 9
			;If (((v1*75*gfxwidth/800.0<MouseX() And (MouseX()>MouseX())) And (MouseY()<MouseY())) And (200*gfxheight/600.0>MouseY())) Then
			If MouseX()>v1*75*GfxWidth/800.0 And MouseX()<(v1*75+50)*GfxWidth/800.0 And MouseY()>150*GfxHeight/600.0 And MouseY()<200*GfxHeight/600.0 Then
				If saveslotdatetime(v1)<>"" Then
					ScaleEntity saveslotentity(v1),0.7,0.7,0.7,0
					ShowEntity saveslotentity(0)
					EntityTexture saveslotentity(0),saveslottexture(v1),0,0
					displaytext(saveslotlevelname(v1),25.0-(Len(saveslotlevelname(v1))*0.5),16.5,1.0,1.0,255,255,255)
					displaytext(saveslotdatetime(v1),25.0-(Len(saveslotdatetime(v1))*0.5),17.5,1.0,1.0,255,255,255)
				End If
			Else
				ScaleEntity saveslotentity(v1),0.5,0.5,0.5,0
			End If
			If saveslotdatetime(v1)<>"" Then
				v2=1
			End If
			;v1=v1+1
		Next
		If v2=0 Then
			v3$="You have no Saved Games available."
			displaytext(v3$,25.0-(Len(v3$)*0.5),12.0,1.0,1.0,200,200,200)
			v3$="You need to use the Save Game function"
			displaytext(v3$,25.0-(Len(v3$)*0.5),13.0,1.0,1.0,200,200,200)
			v3$="to be able to resume from a saved spot."
			displaytext(v3$,25.0-(Len(v3$)*0.5),14.0,1.0,1.0,200,200,200)
		End If
	Else If currentmenu=8 Then
		v4$="Select Adventure To Replay:"
		displaytext(v4$,(50-Len(v4$))/2.0,7.0,1.0,1.0,255,255,0)
		v4$=currentreplayadventurename
		displaytext(v4$,(50-Len(v4$))/2.0,9.0,1.0,1.0,255,255,255)
		v4$="Coins: "+adventurecompletedcoins(currentreplayadventure)+" of "+adventurecompletedcoinstotal(currentreplayadventure)
		v4$=v4$+", Gems: "+adventurecompletedgems(currentreplayadventure)+" of "+adventurecompletedgemstotal(currentreplayadventure)
		v4$=v4$+", Score: "+adventurecompletedscore(currentreplayadventure)
		displaytext(v4$,(50-Len(v4$))/2.0,10.0,1.0,1.0,255,255,255)
		v4$="<Back 10>   <Back>   <PLAY>   <Next>   <Next 10>"
		displaytext(v4$,(50-Len(v4$))/2.0,12.0,1.0,1.0,255,255,0)
		v4$="<CANCEL>"
		displaytext(v4$,(50-Len(v4$))/2.0,14.0,1.0,1.0,255,255,0)
		If (mousegamemode=-1 And (mouse1=1)) Then
			mousegamemode=-2
			If (((Float(MouseX())/Float(gfxwidth)>0.42 And (Float(MouseX())/Float(gfxwidth)<0.58)) And (Float(MouseY())/Float(gfxheight)>0.59)) And (Float(MouseY())/Float(gfxheight)<0.65)) Then
				endmenu()
				playsoundfxnow(130)
			End If
			If (((Float(MouseX())/Float(gfxwidth)>0.62 And (Float(MouseX())/Float(gfxwidth)<0.75)) And (Float(MouseY())/Float(gfxheight)>0.5)) And (Float(MouseY())/Float(gfxheight)<0.56)) Then
				Repeat
					currentreplayadventure=currentreplayadventure+1
					If currentreplayadventure=500 Then
						currentreplayadventure=1
					End If
				Until adventurecompleted(currentreplayadventure)=1
				v5=ReadFile("data\adventures\adventure"+currentreplayadventure+"\master.dat")
				currentreplayadventurename=ReadString(v5)
				CloseFile(v5)
			End If
			If ((Float(MouseX())/Float(gfxwidth)>0.8 And (MouseY()/600.0>0.5)) And (Float(MouseY())/Float(gfxheight)<0.56)) Then
				;v6=1
				For v6=1 To 10
					Repeat
						currentreplayadventure=currentreplayadventure+1
						If currentreplayadventure=500 Then
							currentreplayadventure=1
						End If
					Until adventurecompleted(currentreplayadventure)=1
					;v6=v6+1
				Next
				v5=ReadFile("data\adventures\adventure"+currentreplayadventure+"\master.dat")
				currentreplayadventurename=ReadString(v5)
				CloseFile(v5)
			End If
			If (((Float(MouseX())/Float(gfxwidth)>0.25 And (Float(MouseX())/Float(gfxwidth)<0.38)) And (Float(MouseY())/Float(gfxheight)>0.5)) And (Float(MouseY())/Float(gfxheight)<0.56)) Then
				Repeat
					currentreplayadventure=currentreplayadventure-1
					If currentreplayadventure=0 Then
						currentreplayadventure=499
					End If
				Until adventurecompleted(currentreplayadventure)=1
				v5=ReadFile("data\adventures\adventure"+currentreplayadventure+"\master.dat")
				currentreplayadventurename=ReadString(v5)
				CloseFile(v5)
			End If
			If ((Float(MouseX())/Float(gfxwidth)<0.2 And (Float(MouseY())/Float(gfxheight)>0.5)) And (Float(MouseY())/Float(gfxheight)<0.56)) Then
				;v6=1
				For v6=1 To 10
					Repeat
						currentreplayadventure=currentreplayadventure-1
						If currentreplayadventure=0 Then
							currentreplayadventure=499
						End If
					Until adventurecompleted(currentreplayadventure)=1
					;v6=v6+1
				Next
				v5=ReadFile("data\adventures\adventure"+currentreplayadventure+"\master.dat")
				currentreplayadventurename=ReadString(v5)
				CloseFile(v5)
			End If
			If (((Float(MouseX())/Float(gfxwidth)>0.44 And (Float(MouseX())/Float(gfxwidth)<0.56)) And (Float(MouseY())/Float(gfxheight)>0.5)) And (Float(MouseY())/Float(gfxheight)<0.56)) Then
				endmenu()
				adventurecurrentstatus=3
				activatecommand(8,currentreplayadventure,0,0,0)
				playsoundfxnow(42)
			End If
		End If
	Else If currentmenu=11 Then
		v4$="Player: "+playername
		displaytext(v4$,(66.5-Len(v4$))/2.0,28.595001,0.75,1.0,255,255,0)
		v4$="(click to change)"
		displaytext(v4$,(66.5-Len(v4$))/2.0,29.925001,0.75,1.0,255,255,0)
		If ((mouse1=1 And (mousegamemode=-1)) And (gfxheight*0.9<MouseY())) Then
			mousegamemode=-2
			endmenu()
			startmenu(12)
		End If
	Else If currentmenu=13 Then
		If menutimer Mod 60<30 Then
			menutext(13,2)=Left$(menutext(13,2),Len(menutext(13,2))-1)+" "
		Else
			menutext(13,2)=Left$(menutext(13,2),Len(menutext(13,2))-1)+"_"
		End If
		v7=GetKey()
		If v7=13 Then
			playername=Left$(menutext(13,2),Len(menutext(13,2))-1)
			If Left$(playername,1)=" " Then
				Repeat
					playername=Right$(playername,Len(playername)-1)
				Until Left$(playername,1)<>" "
			End If
			If playername<>"" Then
				If FileType(globaldirname+"\Player Profiles\"+playername)=2 Then
					endmenu()
					startmenu(17)
				Else
					endmenu()
					playsoundfxnow(131)
					startmenu(14)
				End If
			End If
		Else If v7=8 Then
			menutext(13,2)="_"
		Else If (((((v7>=65 And (v7<90)) Or ((v7>=97 And (v7<=122)))) Or ((v7>=48 And (v7<=57)))) Or (v7=32)) And (Len(menutext(13,2))<21)) Then
			menutext(13,2)=Left$(menutext(13,2),Len(menutext(13,2))-1)+Chr$(v7)+"_"
		End If
	Else If currentmenu=14 Then
		;v1=5
		For v1=5 To 8
			v8=FindChild(titlemenuentity(v1),"hat_bone")
			PositionEntity titlemenuentity((v1+5)),EntityX(v8,1),EntityY(v8,1),EntityZ(v8,1),0
			RotateEntity titlemenuentity((v1+5)),EntityPitch(v8,1),EntityYaw(v8,1),EntityRoll(v8,1),0
			;v1=v1+1
		Next
		v9=MouseX()
		v10=MouseY()
		;If (v9-(gfxwidth*287/800))^2.0+(v10-(gfxheight*224/600))^2.0<75*gfxwidth/800^2.0 Then
		If (v9-GfxWidth*287/800)^2+(v10-GfxHeight*224/600)^2<((75*GfxWidth)/800)^2
			v11=1
		End If
		;If (v9-(gfxwidth*519/800))^2.0+(v10-(gfxheight*229/600))^2.0<75*gfxwidth/800^2.0 Then
		If (v9-GfxWidth*519/800)^2+(v10-GfxHeight*229/600)^2<((75*GfxWidth)/800)^2
			v11=2
		End If
		;If (v9-(gfxwidth*173/800))^2.0+(v10-(gfxheight*414/600))^2.0<75*gfxwidth/800^2.0 Then
		If (v9-GfxWidth*173/800)^2+(v10-GfxHeight*414/600)^2<((75*GfxWidth)/800)^2
			v11=3
		End If
		;If (v9-(gfxwidth*408/800))^2.0+(v10-(gfxheight*414/600))^2.0<75*gfxwidth/800^2.0 Then
		If (v9-GfxWidth*408/800)^2+(v10-GfxHeight*414/600)^2<((75*GfxWidth)/800)^2
			v11=4
		End If
		;If (v9-(gfxwidth*631/800))^2.0+(v10-(gfxheight*414/600))^2.0<75*gfxwidth/800^2.0 Then
		If (v9-GfxWidth*631/800)^2+(v10-GfxHeight*414/600)^2<((75*GfxWidth)/800)^2
			v11=5
		End If
		If (v11=1 And (titlemenupointat<>1)) Then
			Animate GetChild(titlemenuentity(5),3),1,0.1,15,0.0
		End If
		If (v11<>1 And (titlemenupointat=1)) Then
			Animate GetChild(titlemenuentity(5),3),1,0.05,10,0.0
		End If
		If (v11=2 And (titlemenupointat<>2)) Then
			Animate GetChild(titlemenuentity(6),3),1,0.6,11,0.0
		End If
		If (v11<>2 And (titlemenupointat=2)) Then
			Animate GetChild(titlemenuentity(6),3),1,0.12,10,0.0
		End If
		If (v11=3 And (titlemenupointat<>3)) Then
			Animate GetChild(titlemenuentity(7),3),1,0.3,12,0.0
		End If
		If (v11<>3 And (titlemenupointat=3)) Then
			Animate GetChild(titlemenuentity(7),3),1,0.08,10,0.0
		End If
		If (v11=4 And (titlemenupointat<>4)) Then
			Animate GetChild(titlemenuentity(8),3),1,0.4,9,0.0
		End If
		If (v11<>4 And (titlemenupointat=4)) Then
			Animate GetChild(titlemenuentity(8),3),1,0.1,10,0.0
		End If
		If v11=5 Then
			TurnEntity titlemenuentity(9),0.0,2.0,0.0,0
		End If
		If v11<>5 Then
		End If
		titlemenupointat=v11
		If ((mouse1=1 And (mousegamemode=-1)) And (v11>0)) Then
			mousegamemode=-2
			If (v11>=1 And (v11<=4)) Then
				endmenu()
				FreeSound soundfx(177)
				soundfx(177)=myloadsound("data\sound\voices\"+v11+"\intro.wav")
				playsoundfxnow(177)
				v12=Millisecs()
				resettext("data/graphics/font.bmp")
				AmbientLight 255.0,255.0,255.0
				v13=CreateCube(camera)
				v14=myloadtexture("load.jpg",1)
				EntityTexture v13,v14,0,0
				PositionEntity v13,0.0,0.0,10.0,0
				RenderWorld 1.0
				Text gfxwidth*0.5,gfxheight*2/7,"...Creating Player...",1,0
				Text gfxwidth*0.5,gfxheight*2/3,"...Please Wait...",1,0
				Flip 1
				Repeat
				Until Millisecs()-v12>4000
			End If
			Select v11
			Case 1
				playercharactername="Stinky"
				playertexturebody=1
				playeracc1=1
				playertexacc1=1
				playeracc2=0
				playertexacc2=0
				playersizex=0.035
				playersizey=0.035
				playersizez=0.035
				playervoice=1
				createnewplayer()
				startmenu(11)
			Case 2
				playercharactername="Loof"
				playertexturebody=2
				playeracc1=1
				playertexacc1=2
				playeracc2=0
				playertexacc2=0
				playersizex=0.029
				playersizey=0.029
				playersizez=0.029
				playervoice=2
				createnewplayer()
				startmenu(11)
			Case 3
				playercharactername="Qookie"
				playertexturebody=3
				playeracc1=1
				playertexacc1=3
				playeracc2=0
				playertexacc2=0
				playersizex=0.038
				playersizey=0.038
				playersizez=0.034
				playervoice=3
				createnewplayer()
				startmenu(11)
			Case 4
				playercharactername="Peegue"
				playertexturebody=4
				playeracc1=2
				playertexacc1=1
				playeracc2=0
				playertexacc2=0
				playersizex=0.035
				playersizey=0.035
				playersizez=0.035
				playervoice=4
				createnewplayer()
				startmenu(11)
			Case 5
				endmenu()
				startmenu(15)
			End Select
			If (v11>=1 And (v11<=4)) Then
				FreeTexture v14
				FreeEntity v13
			End If
		End If
		If currentmenu=14 Then
			displaytext(v16$,v17#,v18#,v19#,v20#,v21,v22,v23)
			displaytext("Stinky",14.8,11.2,1.0,1.0,255,255,255)
			displaytext("Loof",30.3,11.2,1.0,1.0,255,255,255)
			displaytext("Qookie",7.5,18.6,1.0,1.0,255,255,255)
			displaytext("Peegue",22.0,18.6,1.0,1.0,255,255,255)
			displaytext("Custom",36.5,18.6,1.0,1.0,255,255,255)
		End If
	Else If currentmenu=15 Then
		v24=-1
		;If (400.0*gfxwidth/800.0<MouseX() And (MouseX()>MouseX())) Then
		If MouseX()>(400.0*GfxWidth)/800.0 And MouseX()<(720.0*GfxWidth)/800.0
			v24=Floor((MouseY()-(234.0*gfxheight/600.0))/(151.0*gfxheight/600.0/6.0))
		End If
		TurnEntity titlemenuentity(5),0.0,0.5,0.0,0
		ScaleEntity titlemenuentity(5),playersizex,playersizez,playersizey,0
		EntityTexture GetChild(titlemenuentity(5),3),stinkertexture(playertexturebody,0),0,0
		;v1=6
		For v1=6 To 7
			If titlemenuentity(v1)>0 Then
				v8=FindChild(titlemenuentity(5),"hat_bone")
				PositionEntity titlemenuentity(v1),EntityX(v8,1),EntityY(v8,1),EntityZ(v8,1),0
				RotateEntity titlemenuentity(v1),EntityPitch(v8,1),EntityYaw(v8,1),EntityRoll(v8,1),0
				ScaleEntity titlemenuentity(v1),playersizex,playersizez,playersizey,0
			End If
			;v1=v1+1
		Next
		v4$="Customize:"
		displaytext(v4$,((30-Len(v4$))/2.0+18.0)/1.5,4.6666665,1.5,1.0,255,255,0)
		v25=255
		If v24=0 Then
			v25=0
		End If
		v4$="Hat"
		displaytext(v4$,20.0+((30-Len(v4$))/2.0),9.0,1.0,1.0,255,255,v25)
		v25=255
		If v24=1 Then
			v25=0
		End If
		v4$="Eyes/Shoes"
		displaytext(v4$,20.0+((30-Len(v4$))/2.0),10.0,1.0,1.0,255,255,v25)
		v25=255
		If v24=2 Then
			v25=0
		End If
		v4$="Glasses"
		displaytext(v4$,20.0+((30-Len(v4$))/2.0),11.0,1.0,1.0,255,255,v25)
		v25=255
		If v24=3 Then
			v25=0
		End If
		If playersizez<0.03 Then
			v4$="Height: Tiny"
		Else If playersizez<0.033 Then
			v4$="Height: Small"
		Else If playersizez<0.036 Then
			v4$="Height: Medium"
		Else If playersizez<0.039 Then
			v4$="Height: Large"
		Else
			v4$="Height: Huge"
		End If
		displaytext(v4$,20.0+((30-Len(v4$))/2.0),12.0,1.0,1.0,255,255,v25)
		v25=255
		If v24=4 Then
			v25=0
		End If
		If playersizex<0.03 Then
			v4$="Width: Tiny"
		Else If playersizex<0.033 Then
			v4$="Width: Small"
		Else If playersizex<0.036 Then
			v4$="Width: Medium"
		Else If playersizex<0.039 Then
			v4$="Width: Large"
		Else
			v4$="Width: Huge"
		End If
		displaytext(v4$,20.0+((30-Len(v4$))/2.0),13.0,1.0,1.0,255,255,v25)
		v25=255
		If v24=5 Then
			v25=0
		End If
		Select playervoice
		Case 1
			v4$="Voice: Stinky"
		Case 2
			v4$="Voice: Loof"
		Case 3
			v4$="Voice: Qookie"
		Case 4
			v4$="Voice: Peegue"
		End Select
		displaytext(v4$,20.0+((30-Len(v4$))/2.0),14.0,1.0,1.0,255,255,v25)
		v25=255
		If v24=6 Then
			v25=0
		End If
		v25=255
		v4$="(click any above to change)"
		displaytext(v4$,20.0+((30-Len(v4$))/2.0),15.5,1.0,1.0,255,255,255)
		v7=GetKey()
		If v7=8 Then
			playercharactername=""
		Else If (((((v7>=65 And (v7<90)) Or ((v7>=97 And (v7<=122)))) Or ((v7>=48 And (v7<=57)))) Or (v7=32)) And (Len(playercharactername)<12)) Then
			playercharactername=playercharactername+Chr$(v7)
		End If
		If (((mouse1=1 And (mousegamemode=-1)) And (v24>=0)) And (v24<=6)) Then
			mousegamemode=-2
			Select v24
			Case 0
				playsoundfxnow(130)
				playertexacc1=playertexacc1+1
				If playeracc1>9 Then
					v4$=""
				Else
					v4$="0"
				End If
				If myfiletype("data\models\stinker/accessory0"+v4$+playeracc1+Chr$(64+playertexacc1)+".jpg")=0 Then
					If titlemenuentity(6)>0 Then
						FreeEntity titlemenuentity(6)
						FreeTexture titlemenutexture(6)
						titlemenuentity(6)=0
						titlemenutexture(6)=0
					End If
					playertexacc1=1
					playeracc1=playeracc1+1
					If playeracc1>9 Then
						v4$=""
					Else
						v4$="0"
					End If
					If playeracc1=22 Then
						playeracc1=0
					Else
						titlemenuentity(6)=myloadmesh("data\models\stinker/accessory0"+v4$+playeracc1+".3ds",0)
						titlemenutexture(6)=myloadtexture("data\models\stinker/accessory0"+v4$+playeracc1+Chr$(64+playertexacc1)+".jpg",4)
						EntityTexture titlemenuentity(6),titlemenutexture(6),0,0
						ScaleEntity titlemenuentity(6),0.01,0.01,0.01,0
					End If
				Else
					FreeTexture titlemenutexture(6)
					titlemenutexture(6)=myloadtexture("data\models\stinker/accessory0"+v4$+playeracc1+Chr$(64+playertexacc1)+".jpg",4)
					EntityTexture titlemenuentity(6),titlemenutexture(6),0,0
				End If
			Case 1
				playsoundfxnow(130)
				playertexturebody=playertexturebody+1
				If playertexturebody=5 Then
					playertexturebody=1
				End If
			Case 2
				playsoundfxnow(130)
				playertexacc2=playertexacc2+1
				If myfiletype("data\models\stinker/accessory"+playeracc2+Chr$(64+playertexacc2)+".jpg")=0 Then
					If titlemenuentity(7)>0 Then
						FreeEntity titlemenuentity(7)
						FreeTexture titlemenutexture(7)
						titlemenuentity(7)=0
						titlemenutexture(7)=0
					End If
					playertexacc2=1
					playeracc2=playeracc2+1
					If playeracc2=1 Then
						playeracc2=101
					End If
					If playeracc2=103 Then
						playeracc2=0
					Else
						titlemenuentity(7)=myloadmesh("data\models\stinker/accessory"+playeracc2+".3ds",0)
						titlemenutexture(7)=myloadtexture("data\models\stinker/accessory"+playeracc2+Chr$(64+playertexacc2)+".jpg",4)
						EntityTexture titlemenuentity(7),titlemenutexture(7),0,0
						ScaleEntity titlemenuentity(7),0.01,0.01,0.01,0
					End If
				Else
					FreeTexture titlemenutexture(7)
					titlemenutexture(7)=myloadtexture("data\models\stinker/accessory"+playeracc2+Chr$(64+playertexacc2)+".jpg",4)
					EntityTexture titlemenuentity(7),titlemenutexture(7),0,0
				End If
			Case 3
				playsoundfxnow(130)
				playersizez=playersizez+0.003
				If playersizez>=0.041 Then
					playersizez=0.029
				End If
			Case 4
				playsoundfxnow(130)
				playersizex=playersizex+0.003
				If playersizex>=0.041 Then
					playersizex=0.029
				End If
				playersizey=playersizex
			Case 5
				playervoice=playervoice+1
				If playervoice=5 Then
					playervoice=1
				End If
				FreeSound soundfx(177)
				soundfx(177)=myloadsound("data\sound\voices\"+playervoice+"\intro.wav")
				playsoundfxnow(177)
			End Select
		End If
	End If
	v28#=1.0+0.5*(10-currentmenunofitems)
	If dialogbackgroundsize<90 Then
		dialogbackgroundsize=dialogbackgroundsize+2
	End If
	If currentmenu=24 Then
		PositionEntity dialogbackgroundentity,0.0,0.0,20.0-(21.0*Sin(dialogbackgroundsize)),0
	Else
		PositionEntity dialogbackgroundentity,0.0,0.0,20.0-(20.0*Sin(dialogbackgroundsize)),0
	End If
	EntityAlpha dialogbackgroundentity,dialogbackgroundsize/100.0
	controlicons()
	PositionEntity mousecursor,-10.0+MouseX()*20.0/gfxwidth,7.5-(MouseY()*15.0/gfxheight),20.0,0
	If (mouse1=0 And (mouse2=0)) Then
		mousegamemode=-1
		;v1=0
		For v1=0 To 79
			If iconentity(v1)>0 Then
				EntityPickMode iconentity(v1),2,1
			End If
			;v1=v1+1
		Next
	End If
	menutimer=menutimer+1
	dialogtimer=dialogtimer+1
	v29=-1
	If (MouseX()>gfxwidth/5 And (MouseX()<gfxwidth*4/5)) Then
		v29=((MouseY()-((50.0*v28#+-10.0)*gfxheight/600.0))/(50*gfxheight/600))-0.5
	End If
	;v1=0
	For v1=0 To currentmenunofitems-1
		If menuactive(currentmenu,v1)=1 Then
			v30#=1.0
			v31$=menutext(currentmenu,v1)
			displaytext(v31$,(26.0-(Len(v31$)*v30#))/(v30#*2.0),(v28#+v1)/v30#,2.0,v30#,100,100,0)
		Else If menuactive(currentmenu,v1)=2 Then
			If v1<>v29 Then
				v30#=1.05+Sin(dialogtimer*2+v1*60)*0.05
				v31$=menutext(currentmenu,v1)
				displaytext(v31$,(26.0-(Len(v31$)*v30#))/(v30#*2.0),(v28#+v1)/v30#,2.0,v30#,255,255,0)
			Else
				v30#=1.1+Sin(dialogtimer*2+v1*60)*0.1
				v31$=menutext(currentmenu,v1)
				displaytext(v31$,(26.0-(Len(v31$)*v30#))/(v30#*2.0),(v28#+v1)/v30#,2.0,v30#,255,255,255)
			End If
		Else If menuactive(currentmenu,v1)=3 Then
			v30#=1.0
			v31$=menutext(currentmenu,v1)
			If (currentmenu=12 And (v1=0)) Then
				v32#=0.4
			Else
				v32#=0.0
			End If
			displaytext(v31$,(26.0-(Len(v31$)*v30#))/(v30#*2.0),((v28#+v1)-v32#)/v30#,2.0,v30#,255,255,100)
		End If
		;v1=v1+1
	Next
	If ((mouse1=1 And (mousegamemode=-1)) And (((currentmenu=4 Or (currentmenu=5)) Or (currentmenu=16)))) Then
		;v1=1
		For v1=1 To 9
			;If (((v1*75*gfxwidth/800.0<MouseX() And (MouseX()>MouseX())) And (MouseY()<MouseY())) And (200*gfxheight/600.0>MouseY())) Then
			If MouseX()>v1*75*GfxWidth/800.0 And MouseX()<(v1*75+50)*GfxWidth/800.0 And MouseY()>150*GfxHeight/600.0 And MouseY()<200*GfxHeight/600.0 Then
				If currentmenu=4 Then
					If saveslotdatetime(v1)="" Then
						If lightredgoal2=-1 Then
							lightredgoal2=lightredgoal
							lightgreengoal2=lightgreengoal
							lightbluegoal2=lightbluegoal
							ambientredgoal2=ambientredgoal
							ambientgreengoal2=ambientgreengoal
							ambientbluegoal2=ambientbluegoal
						End If
						v4$=Mid$(CurrentDate(),4,4)+Left$(CurrentDate(),2)+" "
						v4$=v4$+" "+CurrentTime()
						savegame(v1,v4$,adventuretitle4saving)
						endmenu()
						messagelinetext1="Game Saved in Slot #"+v1
						messagelinetext2=""
						messagelinetimer=300
						playsoundfxnow(132)
						timeoflastgamesaved=Millisecs()
						If exitafterthissave=1 Then
							endlevel()
							endadventure()
							startmenu(11)
						End If
					Else
						endmenu()
						gameslottobesaved=v1
						gamenametobesaved=saveslotdatetime(v1)
						playsoundfxnow(135)
						menutext(6,0)="Overwrite Slot #"+v1+"?"
						startmenu(6)
					End If
				Else If saveslotdatetime(v1)<>"" Then
					endmenu()
					endlevel()
					endadventure()
					playsoundfxnow(132)
					loadgame(v1)
					messagelinetext1="Game Loaded From Slot #"+v1
					messagelinetext2=""
					messagelinetimer=300
				End If
			End If
			;v1=v1+1
		Next
	End If
	If (((mouse1=1 And (mousegamemode=-1)) And (v29>=0)) And (v29<currentmenunofitems)) Then
		If menuactive(currentmenu,v29)=2 Then
			Select currentmenu
			Case 0
				Select v29
				Case 0
					endmenu()
					playsoundfxnow(130)
				Case 1
					endmenu()
					startmenu(5)
					playsoundfxnow(133)
				Case 2
					endmenu()
					startmenu(4)
					playsoundfxnow(134)
				Case 3
					endmenu()
					startmenu(2)
					playsoundfxnow(131)
				Case 4
					endmenu()
					startmenu(1)
					playsoundfxnow(131)
				Case 5
					endmenu()
					startmenu(3)
					playsoundfxnow(131)
				End Select
			Case 1
				Select v29
				Case 3
					endlevel()
					endadventure()
					adventurecanceldata()
					Select adventurecurrentstatus
					Case 0,1
						starthublevel(-adventureexitlostlevel,adventureexitlostx,adventureexitlosty)
					Case 2
						HideEntity dialogbackgroundentity
						startcustomselectmenu()
					Case 3
						starthublevel(-23,27,13)
					End Select
				Case 4
					endmenu()
					playsoundfxnow(130)
				End Select
			Case 2
				Select v29
				Case 3
					endmenu()
					playsoundfxnow(132)
					adventurecanceldata()
					If (adventurecurrentstatus=1 Or (adventurecurrentstatus=3)) Then
						activatecommand(8,adventurecurrentnumber,0,0,0)
					Else If adventurecurrentstatus=2 Then
						activatecommand(8,0,0,0,0)
					End If
				Case 4
					playsoundfxnow(130)
					endmenu()
				End Select
			Case 3
				Select v29
				Case 3
					endmenu()
					If waepisode=0 Then
						endlevel()
						endadventure()
						playsoundfxnow(132)
						startmenu(11)
					Else
						If Millisecs()-timeoflastgamesaved>60000 Then
							playsoundfxnow(135)
							startmenu(7)
						Else
							endlevel()
							endadventure()
							playsoundfxnow(132)
							startmenu(11)
						End If
					End If
				Case 4
					playsoundfxnow(130)
					endmenu()
				End Select
			Case 4
				If v29=9 Then
					playsoundfxnow(130)
					endmenu()
				End If
			Case 5
				If v29=9 Then
					playsoundfxnow(130)
					endmenu()
				End If
			Case 6
				Select v29
				Case 4
					playsoundfxnow(132)
					If lightredgoal2=-1 Then
						lightredgoal2=lightredgoal
						lightgreengoal2=lightgreengoal
						lightbluegoal2=lightbluegoal
						ambientredgoal2=ambientredgoal
						ambientgreengoal2=ambientgreengoal
						ambientbluegoal2=ambientbluegoal
					End If
					v4$=Mid$(CurrentDate(),4,4)+Left$(CurrentDate(),2)+" "
					v4$=v4$+" "+CurrentTime()
					savegame(gameslottobesaved,v4$,adventuretitle4saving)
					endmenu()
					messagelinetext1="Game Saved in Slot #"+gameslottobesaved
					messagelinetext2=""
					messagelinetimer=300
					timeoflastgamesaved=Millisecs()
					If exitafterthissave=1 Then
						endlevel()
						endadventure()
						startmenu(11)
					End If
				Case 5
					playsoundfxnow(130)
					endmenu()
					startmenu(4)
				End Select
			Case 7
				Select v29
				Case 4
					endmenu()
					endadventure()
					startmenu(11)
				Case 5
					endmenu()
					startmenu(4)
					exitafterthissave=1
				End Select
			Case 11
				Select v29
				Case 4
					playsoundfxnow(131)
					endmenu()
					startcustomselectmenu()
				Case 5
					endmenu()
					playsoundfxnow(133)
					startmenu(16)
				Case 6
					endmenu()
					playsoundfxnow(131)
					startmenu(18)
				Case 7
					ExecFile("http://www.midnightsynergy.com/adventures/levelex/index.html")
					End
				Case 8
					endmenu()
					playsoundfxnow(131)
					startmenu(19)
				End Select
			Case 12
				Select v29
				Case 1,2,3,4,5,6,7,8
					If menutext(currentmenu,v29)<>"" Then
						playername=menutext(currentmenu,v29)
						v5=ReadFile(globaldirname+"\Player Profiles\"+playername+"\Current\Playerfile.wpf")
						If v5=0 Then
							playercharactername=""
							v43=0
						Else
							playername=ReadString(v5)
							playercharactername=ReadString(v5)
							CloseFile(v5)
						End If
						endmenu()
						If playercharactername="" Then
							playsoundfxnow(131)
							startmenu(14)
						Else
							playsoundfxnow(132)
							startmenu(11)
						End If
					End If
				Case 9
					endmenu()
					playsoundfxnow(131)
					startmenu(13)
				End Select
			Case 13
				Select v29
				Case 4
					playername=Left$(menutext(13,2),Len(menutext(13,2))-1)
					If Left$(playername,1)=" " Then
						Repeat
							playername=Right$(playername,Len(playername)-1)
						Until Left$(playername,1)<>" "
					End If
					If playername<>"" Then
						If FileType(globaldirname+"\Player Profiles\"+playername)=2 Then
							endmenu()
							startmenu(17)
						Else
							endmenu()
							playsoundfxnow(131)
							startmenu(14)
						End If
					End If
				Case 5
					endmenu()
					playsoundfxnow(130)
					startmenu(12)
				End Select
			Case 15
				If v29=8 Then
					If Left$(playercharactername,1)=" " Then
						Repeat
							playercharactername=Right$(playercharactername,Len(playercharactername)-1)
						Until Left$(playercharactername,1)<>" "
					End If
					If playercharactername="" Then
						playercharactername="Anonymous"
					End If
					endmenu()
					v12=Millisecs()
					resettext("data/graphics/font.bmp")
					AmbientLight 255.0,255.0,255.0
					v13=CreateCube(camera)
					v14=myloadtexture("load.jpg",1)
					EntityTexture v13,v14,0,0
					PositionEntity v13,0.0,0.0,10.0,0
					RenderWorld 1.0
					Text gfxwidth*0.5,gfxheight*2/7,"...Creating Player...",1,0
					Text gfxwidth*0.5,gfxheight*2/3,"...Please Wait...",1,0
					Flip 1
					createnewplayer()
					playsoundfxnow(132)
					Repeat
					Until Millisecs()-v12>2000
					FreeTexture v14
					FreeEntity v13
					startmenu(11)
				End If
				If v29=9 Then
					playsoundfxnow(130)
					endmenu()
					startmenu(14)
				End If
			Case 16
				If v29=9 Then
					endmenu()
					playsoundfxnow(130)
					startmenu(11)
				End If
			Case 17
				Select v29
				Case 6
					endmenu()
					playsoundfxnow(131)
					startmenu(12)
				End Select
			Case 18
				Select v29
				Case 2
					endmenu()
					playsoundfxnow(131)
					startmenu(12)
				Case 3
					playsoundfxnow(130)
					keyboardmode=3-keyboardmode
					endmenu()
					startmenu(18)
				Case 4
					globalsoundvolume2=(globalsoundvolume2+1) Mod 6
					globalsoundvolume=globalsoundvolume2*0.2
					menutext(18,4)="Sound Volume: "+globalsoundvolume2
					playsoundfxnow(130)
				Case 5
					globalmusicvolume2=(globalmusicvolume2+1) Mod 6
					globalmusicvolume=globalmusicvolume2*0.2
					menutext(18,5)="Music Volume: "+globalmusicvolume2
					If ChannelPlaying(musicchannel)=1 Then
						StopChannel musicchannel
					End If
					If globalmusicvolume2>0 Then
						musicchannel=PlayMusic("data\music\1.ogg")
						ChannelVolume musicchannel,globalmusicvolume
						currentmusic=1
					Else
						currentmusic=-1
					End If
					playsoundfxnow(130)
				Case 6
					playsoundfxnow(132)
					endmenu()
					startmenu(11)
				End Select
			Case 19
				Select v29
				Case 3
					If (fullversion=1 Or (traileralreadyplayed=1)) Then
						End
					Else
						endmenu()
						startmenu(25)
						exitaftertrailer=1
					End If
				Case 4
					endmenu()
					playsoundfxnow(130)
					startmenu(11)
				End Select
			End Select
			mousegamemode=-2
		End If
	End If
End Function

Function endmenu()
	
	gamemode=oldgamemode
	iconhelptext(9)="Open"
	CameraProjMode camera,1
	If (gamemode=8 And (currentinterchange>=0)) Then
		v1=GetSurface(dialogbackgroundentity,1)
		VertexCoords v1,0,-2.0,1.3,5.0
		VertexCoords v1,1,2.0,1.3,5.0
		VertexCoords v1,2,-2.0,(-0.5)-((nofinterchangereplies(currentinterchange)-1)*0.16),5.0
		VertexCoords v1,3,2.0,(-0.5)-((nofinterchangereplies(currentinterchange)-1)*0.16),5.0
		dialogtimer=1000
	End If
	;v2=0
	For v2=0 To 10
		If titlemenuentity(v2)>0 Then
			FreeEntity titlemenuentity(v2)
			titlemenuentity(v2)=0
		End If
		If titlemenutexture(v2)>0 Then
			FreeTexture titlemenutexture(v2)
			titlemenutexture(v2)=0
		End If
		;v2=v2+1
	Next
	;v2=11
	For v2=11 To 30
		If titlemenuentity(v2)>0 Then
			FreeEntity titlemenuentity(v2)
			titlemenuentity(v2)=0
		End If
		;v2=v2+1
	Next
	HideEntity titlemenuentity(60)
	;v2=80
	For v2=80 To 99
		HideEntity titlemenuentity(v2)
		;v2=v2+1
	Next
	If (currentmenu>=10 And (currentmenu<>24)) Then
		endlevel()
	End If
	;v2=0
	For v2=0 To 9
		HideEntity saveslotentity(v2)
		;v2=v2+1
	Next
End Function

Function updatetitlemenu()
	
	leveltimer=leveltimer+1
	controlparticles()
	controlobjects()
	TranslateEntity titlemenuentity(0),0.01,0.03,0.02,0
	If menutimer<1000 Then
		If menutimer<100 Then
			AmbientLight leveltimer,leveltimer,leveltimer
			LightColor levellight,leveltimer*1.55,leveltimer*1.55,leveltimer*1.55
		End If
		;v1=11
		For v1=11 To 30
			PositionEntity titlemenuentity(v1),5.0*Sin(v1*72*v1 Mod 360),((-(v1*17 Mod 10))/5.0-2.5)-(v1/45.0)+(3*menutimer/1000.0),(menutimer-(v1*30))*0.2,0
			TurnEntity titlemenuentity(v1),0.0,2.0,0.0,0
			;v1=v1+1
		Next
	Else If menutimer<1100 Then
		;v1=11
		For v1=11 To 30
			EntityAlpha titlemenuentity(v1),(1100-menutimer)/100.0
			PositionEntity titlemenuentity(v1),5.0*Sin(v1*72*v1 Mod 360),((Float(menutimer-1000)/Float(v1-9)-(v1*17 Mod 10/5.0))-2.5)-(v1/45.0)+(3*menutimer/1000.0),(menutimer-(v1*30))*0.2,0
			TurnEntity titlemenuentity(v1),0.0,2.0,0.0,0
			;v1=v1+1
		Next
	End If
	TurnEntity titlemenuentity(1),0.0,-0.2,0.0,0
	If menutimer<500 Then
		PositionEntity titlemenuentity(1),1.5-(2.35*(menutimer/500.0)),0.5+(menutimer/500.0*0.6),0.5+(4.5*(menutimer/500.0)),0
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
				;v1=0
				For v1=0 To 359
					v2#=Rnd(0.3,1.0)
					addparticle(18,EntityX(titlemenuentity(3),1),EntityY(titlemenuentity(3),1),EntityZ(titlemenuentity(3),1)-0.011,0.0,0.04,v2#*0.06*Sin(v1),v2#*0.06*Cos(v1),0.0,5.0,0.0003,(-v2#)*0.0011*Sin(v1),(-v2#)*0.0011*Cos(v1),0.0,75,3)
					;v1=v1+1
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
		;v3=0
		For v3=0 To nofobjects-1
			If objectid(v3)=1 Then
				titlemenupointat=v3
			End If
			;v3=v3+1
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
		;v1=0
		For v1=0 To 359
			v2#=Rnd(0.3,1.0)
			addparticle(18,EntityX(titlemenuentity(3),1),EntityY(titlemenuentity(3),1),EntityZ(titlemenuentity(3),1)-0.011,0.0,0.04,v2#*0.06*Sin(v1),v2#*0.06*Cos(v1),0.0,5.0,0.0003,(-v2#)*0.0011*Sin(v1),(-v2#)*0.0011*Cos(v1),0.0,75,3)
			;v1=v1+1
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
		;v1=11
		For v1=11 To 30
			EntityAlpha titlemenuentity(v1),1.0
			;v1=v1+1
		Next
		leveltimer=0
	End If
End Function

Function updatecutscene1()
	
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

Function updatecutscene2()
	
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

Function updatecutscene3()
	
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

Function createsquare()
	
	v1=CreateMesh(camera)
	v2=CreateSurface(v1,0)
	AddVertex(v2,-0.5,0.0,0.5,0.0,0.0,1.0)
	AddVertex(v2,0.5,0.0,0.5,1.0,0.0,1.0)
	AddVertex(v2,-0.5,0.0,-0.5,0.0,1.0,1.0)
	AddVertex(v2,0.5,0.0,-0.5,1.0,1.0,1.0)
	AddTriangle(v2,0,1,2)
	AddTriangle(v2,1,3,2)
	UpdateNormals v1
	Return v1
End Function

Function startcustomselectmenu()
	
	gamemode=12
	currentmenu=100
	menutimer=0
	PositionEntity camera,0.0,0.0,0.0,0
	RotateEntity camera,0.0,0.0,0.0,0
	AmbientLight 255.0,255.0,255.0
	RotateEntity levellight,35.0,-35.0,0.0,0
	CameraFogMode camera,0
	CameraRange camera,0.1,1000.0
	If currentmusic<>1 Then
		If globalmusicvolume2>0 Then
			If ChannelPlaying(musicchannel) Then
				StopChannel musicchannel
			End If
			musicchannel=PlayMusic("data\music\1.ogg")
			ChannelVolume musicchannel,globalmusicvolume
			currentmusic=1
		Else
			currentmusic=-1
		End If
	End If
	;v1=80
	For v1=80 To 99
		ShowEntity titlemenuentity(v1)
		;v1=v1+1
	Next
	;v1=0
	For v1=0 To 79
		deleteicon(v1)
		;v1=v1+1
	Next
	ShowEntity mousecursor
	mousecursorvisible=1
	checkfornewcompiledlevels(1)
	loadcustomtags()
	If customcurrentarchive=0 Then
		getcurrentcustomlevels()
	Else
		getarchivecustomlevels()
	End If
	customlevellistselected=-1
End Function

Function getcurrentcustomlevels()
	
	;nofcustomlevels=0
	For nofcustomlevels=0 To 4999
		customlevellistfilename(nofcustomlevels)=""
		customlevellistname(nofcustomlevels)=""
		customlevellistcreator(nofcustomlevels)=""
		customlevellistgems(nofcustomlevels)=0
		customlevellistgemstotal(nofcustomlevels)=0
		customlevellistcoins(nofcustomlevels)=0
		customlevellistcoinstotal(nofcustomlevels)=0
		customlevellistscore(nofcustomlevels)=0
		;nofcustomlevels=nofcustomlevels+1
	Next
	customcurrentarchive=0
	nofcustomlevels=0
	v1=ReadDir(globaldirname+"\Adventures\Current")
	Repeat
		customlevellistfilename(nofcustomlevels)=""
		customlevellistname(nofcustomlevels)=""
		customlevellistcreator(nofcustomlevels)=""
		customlevellistgems(nofcustomlevels)=0
		customlevellistgemstotal(nofcustomlevels)=0
		customlevellistcoins(nofcustomlevels)=0
		customlevellistcoinstotal(nofcustomlevels)=0
		customlevellistscore(nofcustomlevels)=0
		v2$=NextFile(v1)
		If (((v2$<>"." And (v2$<>"..")) And (v2$<>"")) And (FileType(globaldirname+"\Adventures\Current\"+v2$)=2)) Then
			v3=ReadFile(globaldirname+"\Adventures\Current\"+v2$+"\master.dat")
			If v3>0 Then
				v4=0
				v5=ReadDir(globaldirname+"\Adventures\Current\"+v2$)
				Repeat
					v6$=NextFile(v5)
					If Right$(Upper$(v6$),4)=".TAG" Then
						v4=1
					End If
				Until v6$=""
				CloseDir v5
				If ((currentcustomtag="All" Or ((currentcustomtag="Not Archived" And (v4=0)))) Or (FileType(globaldirname+"\Adventures\Current\"+v2$+"\"+currentcustomtag+".tag")=1)) Then
					customlevellistfilename(nofcustomlevels)=v2$
					customlevellistname(nofcustomlevels)=ReadString(v3)
					;v7=0
					For v7=0 To 4
						ReadString(v3)
						;v7=v7+1
					Next
					customlevellistcreator(nofcustomlevels)=ReadString(v3)
					If customlevellistcreator(nofcustomlevels)="" Then
						customlevellistcreator(nofcustomlevels)="(Unknown)"
					End If
					CloseFile(v3)
					customlevellistcompleted(nofcustomlevels)=0
					v3=ReadFile(globaldirname+"\Adventures\Current\"+v2$+"\"+playername+".score")
					If v3>0 Then
						ReadInt(v3)
						ReadInt(v3)
						customlevellistgems(nofcustomlevels)=ReadInt(v3)
						customlevellistgemstotal(nofcustomlevels)=ReadInt(v3)
						customlevellistcoins(nofcustomlevels)=ReadInt(v3)
						customlevellistcoinstotal(nofcustomlevels)=ReadInt(v3)
						customlevellistscore(nofcustomlevels)=ReadInt(v3)
						CloseFile(v3)
						customlevellistcompleted(nofcustomlevels)=1
						If (customlevellistcoinstotal(nofcustomlevels)=customlevellistcoins(nofcustomlevels) And (customlevellistgemstotal(nofcustomlevels)=customlevellistgems(nofcustomlevels))) Then
							customlevellistcompleted(nofcustomlevels)=2
						End If
					End If
					nofcustomlevels=nofcustomlevels+1
				Else
					CloseFile(v3)
				End If
			End If
		End If
	Until v2$=""
	CloseDir v1
	If (nofcustomlevels=0 And (currentcustomtag<>"All")) Then
		removecurrentcustomtag()
		getcurrentcustomlevels()
	End If
End Function

Function getarchivecustomlevels()
	
End Function

Function customselectmenu()
	
	menutimer=menutimer+1
	If MouseDown(1)=False And MouseDown(2)=False 
		MouseGameMode=-1
	EndIf

	PositionTexture titlemenutexture(80),(-(menutimer Mod 2500))/2500.0,menutimer Mod 5000/5000.0
	PositionEntity MouseCursor,-10+20*Float(MouseX())/Float(GFXWidth),7.5-15*Float(MouseY())/Float(GfxHeight),20
	;v1=81
	For v1=81 To 99
		TranslateEntity titlemenuentity(v1),-Float(v1/10000.0),-Float(v1*2/10000.0),0.0,0
		If (EntityX(titlemenuentity(v1),0)<-14.0 Or (EntityY(titlemenuentity(v1),0)<-14.0)) Then
			FreeEntity titlemenuentity(v1)
			titlemenuentity(v1)=CopyEntity(starmesh,0)
			RotateEntity titlemenuentity(v1),-90.0,0.0,0.0,0
			EntityFX titlemenuentity(v1),1
			PositionEntity titlemenuentity(v1),Rnd(-10.0,20.0),14.0,Rnd(20.0,30.0),0
		End If
		TurnEntity titlemenuentity(v1),0.0,1.0,0.0,0
		;v1=v1+1
	Next
	displaytext("Select A Custom Adventure:",12.0,0.7,1.0,1.0,255,255,0)
	displaytext("Adventure Name                         Creator            Complete",1.0,3.0,0.7,1.0,255,255,0)
	displaytext("-----------------------------------------------------------------------",0.0,3.6,0.7,1.0,255,255,0)
	;v1=0
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

	If nofcustomlevels>15 Then
		;v1=0
		For v1=0 To 14
			displaytext(":  :",67.0,4.5+(v1*1.5),0.7,1.0,255,255,0)
			;v1=v1+1
		Next
		;If ((750*gfxwidth/800.0<MouseX() And (MouseY()<MouseY())) And (142*gfxheight/600.0>MouseY())) Then
		If MouseX()>750*Gfxwidth/800.0 And MouseY()>82*gfxheight/600.0 And MouseY()<142*gfxheight/600.0 Then
			displaytext("Pg",68.0+Sin(menutimer Mod 360)*0.1,4.5+Cos(menutimer Mod 360)*0.1,0.7,1.0,255,255,155)
			displaytext("Up",68.0+Sin(menutimer Mod 360)*0.1,6.0+Cos(menutimer Mod 360)*0.1,0.7,1.0,255,255,155)
		Else
			displaytext("Pg",68.0,4.5,0.7,1.0,200,200,200)
			displaytext("Up",68.0,6.0,0.7,1.0,200,200,200)
		End If
		displaytext("--",68.0,6.9,0.7,1.0,255,255,0)
		displaytext("--",68.0,23.1,0.7,1.0,255,255,0)
		;If ((750*gfxwidth/800.0<MouseX() And (MouseY()<MouseY())) And (482*gfxheight/600.0>MouseY())) Then
		If MouseX()>750*Gfxwidth/800.0 And MouseY()>422*gfxheight/600.0 And MouseY()<482*gfxheight/600.0 Then
			displaytext("Pg",68.0+Sin(menutimer Mod 360)*0.1,24.0+Cos(menutimer Mod 360)*0.1,0.7,1.0,255,255,155)
			displaytext("Dn",68.0+Sin(menutimer Mod 360)*0.1,25.5+Cos(menutimer Mod 360)*0.1,0.7,1.0,255,255,155)
		Else
			displaytext("Pg",68.0,24.0,0.7,1.0,200,200,200)
			displaytext("Dn",68.0,25.5,0.7,1.0,200,200,200)
		End If
	End If
	displaytext("-----------------------------------------------------------------------",0.0,26.3,0.7,1.0,255,255,0)
	If customlevellistselected>=0 Then
		displaytext(customlevellistname(customlevellistselected),25.0-(Len(customlevellistname(customlevellistselected))*0.5),19.3,1.0,1.0,255,255,255)
		If customlevellistcompleted(customlevellistselected)=0 Then
			v6$="This Adventure Has Not Been Completed."
		Else
			v6$="Score: "+customlevellistscore(customlevellistselected)+"  Gems: "+customlevellistgems(customlevellistselected)+" of "+customlevellistgemstotal(customlevellistselected)+"  Coins: "+customlevellistcoins(customlevellistselected)+" of "+customlevellistcoinstotal(customlevellistselected)
		End If
		displaytext(v6$,25.0-(Len(v6$)*0.5),20.3,1.0,1.0,255,255,255)
		;If ((540*gfxheight/600.0<MouseY() And (MouseX()<MouseX())) And (210*gfxwidth/800.0>MouseX())) Then
		If MouseY()>540*gfxheight/600.0 And MouseX()>110*Gfxwidth/800.0 And MouseX()<210*Gfxwidth/800.0 Then
			displaytext(">PLAY<",7.0+Sin(menutimer Mod 360)*0.1,22.0+Cos(menutimer Mod 360)*0.1,1.0,1.0,255,255,100)
		Else
			displaytext("PLAY",8.0,22.0,1.0,1.0,200,200,200)
		End If
		;If ((540*gfxheight/600.0<MouseY() And (MouseX()<MouseX())) And (370*gfxwidth/800.0>MouseX())) Then
		If MouseY()>540*gfxheight/600.0 And MouseX()>270*Gfxwidth/800.0 And MouseX()<370*Gfxwidth/800.0 Then
			displaytext(">CANCEL<",16.0+Sin(menutimer Mod 360)*0.1,22.0+Cos(menutimer Mod 360)*0.1,1.0,1.0,255,255,100)
		Else
			displaytext("CANCEL",17.0,22.0,1.0,1.0,200,200,200)
		End If
		;If ((540*gfxheight/600.0<MouseY() And (MouseX()<MouseX())) And (530*gfxwidth/800.0>MouseX())) Then
		If MouseY()>540*gfxheight/600.0 And MouseX()>430*Gfxwidth/800.0 And MouseX()<530*Gfxwidth/800.0 Then
			displaytext(">ARCHIVE<",25.5+Sin(menutimer Mod 360)*0.1,22.0+Cos(menutimer Mod 360)*0.1,1.0,1.0,255,255,100)
		Else
			displaytext("ARCHIVE",26.5,22.0,1.0,1.0,200,200,200)
		End If
		;If ((540*gfxheight/600.0<MouseY() And (MouseX()<MouseX())) And (690*gfxwidth/800.0>MouseX())) Then
		If MouseY()>540*gfxheight/600.0 And MouseX()>590*Gfxwidth/800.0 And MouseX()<690*Gfxwidth/800.0 Then
			displaytext(">DELETE<",36.5+Sin(menutimer Mod 360)*0.1,22.0+Cos(menutimer Mod 360)*0.1,1.0,1.0,255,255,100)
		Else
			displaytext("DELETE",37.5,22.0,1.0,1.0,200,200,200)
		End If
	Else
		v6$="Show: "+currentcustomtag
		;If (((500*gfxheight/600.0<MouseY() And (MouseY()>MouseY())) And (MouseX()<MouseX())) And (660*gfxwidth/800.0>MouseX())) Then
		If MouseY()>500*gfxheight/600.0 And MouseY()<530*gfxheight/600.0 And MouseX()>150*Gfxwidth/800.0 And MouseX()<660*Gfxwidth/800.0 Then
			displaytext(">"+v6$+"<",24.0-(Len(v6$)*0.5)+Sin(menutimer Mod 360)*0.1,20.0+Cos(menutimer Mod 360)*0.1,1.0,1.0,255,255,100)
		Else
			displaytext(v6$,25.0-(Len(v6$)*0.5),20.0,1.0,1.0,200,200,200)
		End If
		;If ((540*gfxheight/600.0<MouseY() And (MouseX()<MouseX())) And (460*gfxwidth/800.0>MouseX())) Then
		If MouseY()>540*gfxheight/600.0 And MouseX()>350*Gfxwidth/800.0 And MouseX()<460*Gfxwidth/800.0 Then
			displaytext(" >EXIT<",21.0+Sin(menutimer Mod 360)*0.1,22.0+Cos(menutimer Mod 360)*0.1,1.0,1.0,255,255,100)
		Else
			displaytext(" EXIT",22.0,22.0,1.0,1.0,200,200,200)
		End If
	End If
	mouse1=MouseDown(1)
	mouse2=MouseDown(2)
	If (mouse1 Or mouse2) And MouseGameMode=-1 Then
		mousegamemode=2
		;v1=0
		For i=0 To 14
			If MouseY()>=(90.0+i*26.5)*gfxheight/600.0 And MouseY()<(90.0+(i+1)*26.5)*gfxheight/600.0 And MouseX()<750*Gfxwidth/800.0
				If CustomLevelListName$(i)<>"" Then CustomLevellistselected=i+CustomLevelListStart
				PlaysoundfxNow(130)
			EndIf
		Next

		If customlevellistselected>=0 Then
			;If ((540*gfxheight/600.0<MouseY() And (MouseX()<MouseX())) And (210*gfxwidth/800.0>MouseX())) Then
			If MouseY()>540*gfxheight/600.0 And MouseX()>110*Gfxwidth/800.0 And MouseX()<210*Gfxwidth/800.0 Then
				playsoundfxnow(131)
				endcustomselectmenu()
				v6$=globaldirname+"\adventures\"
				If customcurrentarchive=0 Then
					v6$=v6$+"current\"
				Else
					v6$=v6$+"archive\"
				End If
				startadventure(v6$+customlevellistfilename(customlevellistselected),2,0)
			End If
			;If ((540*gfxheight/600.0<MouseY() And (MouseX()<MouseX())) And (370*gfxwidth/800.0>MouseX())) Then
			If MouseY()>540*gfxheight/600.0 And MouseX()>270*Gfxwidth/800.0 And MouseX()<370*Gfxwidth/800.0 Then
				playsoundfxnow(132)
				customlevellistselected=-1
			End If
			;If ((540*gfxheight/600.0<MouseY() And (MouseX()<MouseX())) And (530*gfxwidth/800.0>MouseX())) Then
			If MouseY()>540*gfxheight/600.0 And MouseX()>430*Gfxwidth/800.0 And MouseX()<530*Gfxwidth/800.0 Then
				playsoundfxnow(132)
				startcustomarchivemenu()
			End If
			;If ((540*gfxheight/600.0<MouseY() And (MouseX()<MouseX())) And (690*gfxwidth/800.0>MouseX())) Then
			If MouseY()>540*gfxheight/600.0 And MouseX()>590*Gfxwidth/800.0 And MouseX()<690*Gfxwidth/800.0 Then
				playsoundfxnow(135)
				startcustomdeletemenu()
			End If
		Else
			If MouseY()>500*gfxheight/600.0 And MouseY()<530*gfxheight/600.0 And MouseX()>150*Gfxwidth/800.0 And MouseX()<660*Gfxwidth/800.0
			
				;change tag
				If mouse1
 				
					currentcustomtagnumber=currentcustomtagnumber+1
					If currentcustomtagnumber>=nofcustomtags
						currentcustomtagnumber=-2
						currentcustomtag$="Not Archived"
					Else If currentcustomtagnumber=-1
						currentcustomtag$="All"
					Else
						currentcustomtag$=customtag$(currentcustomtagnumber)
					EndIf
				Else
					currentcustomtagnumber=currentcustomtagnumber-1
					If currentcustomtagnumber=-3
						currentcustomtagnumber=nofcustomtags-1
						currentcustomtag$=customtag$(currentcustomtagnumber)
						
					Else If currentcustomtagnumber=-2
						currentcustomtag$="Not Archived"
					Else If currentcustomtagnumber=-1
						currentcustomtag$="All"
					Else
						currentcustomtag$=customtag$(currentcustomtagnumber)
					EndIf
				EndIf
				If nofcustomtags>0 
					;endcustomselectmenu()
					;startcustomselectmenu()
					GetCurrentCustomLevels()
				EndIf
			EndIf
		
			If MouseY()>540*gfxheight/600.0 And MouseX()>350*Gfxwidth/800.0 And MouseX()<460*Gfxwidth/800.0

				;exit
				PlaysoundfxNow(132)
				EndCustomSelectMenu()
				StartMenu(11)
				
			EndIf

		
		EndIf

		;If ((750*gfxwidth/800.0<MouseX() And (MouseY()<MouseY())) And (142*gfxheight/600.0>MouseY())) Then
		If MouseX()>750*Gfxwidth/800.0 And MouseY()>82*gfxheight/600.0 And MouseY()<142*gfxheight/600.0 Then
			customlevelliststart=customlevelliststart-15
			playsoundfxnow(130)
		End If
		;If ((750*gfxwidth/800.0<MouseX() And (MouseY()<MouseY())) And (482*gfxheight/600.0>MouseY())) Then
		If MouseX()>750*Gfxwidth/800.0 And MouseY()>422*gfxheight/600.0 And MouseY()<482*gfxheight/600.0 Then
			customlevelliststart=customlevelliststart+15
			playsoundfxnow(130)
		End If
	End If
	If customlevelliststart>nofcustomlevels-15 Then
		customlevelliststart=nofcustomlevels-15
	End If
	If customlevelliststart<0 Then
		customlevelliststart=0
	End If
	If KeyDown(88) Then
		startcustomselectmenu()
		playsoundfxnow(130)
	End If
End Function

Function endcustomselectmenu()
	
	;v1=80
	For v1=80 To 99
		HideEntity titlemenuentity(v1)
		;v1=v1+1
	Next
End Function

Function loadcustomtags()
	
	nofcustomtags=0
	currentcustomtagnumber=-2
	v1=ReadFile(globaldirname+"\adventures\current.tags")
	If v1>0 Then
		Repeat
			If Eof(v1)=0 Then
				customtag(nofcustomtags)=ReadString(v1)
			End If
			If currentcustomtag=customtag(nofcustomtags) Then
				currentcustomtagnumber=nofcustomtags
			End If
			nofcustomtags=nofcustomtags+1
		Until Eof(v1)
		CloseFile(v1)
		If (currentcustomtagnumber=-1 Or (nofcustomtags=0)) Then
			currentcustomtag="All"
		End If
	Else
		currentcustomtag="Not Archived"
		currentcustomtagnumber=-2
	End If
End Function

Function savecustomtags()
	
	v1=WriteFile(globaldirname+"\adventures\current.tags")
	;v2=0
	For v2=0 To nofcustomtags-1
		WriteString(v1,customtag(v2))
		;v2=v2+1
	Next
	CloseFile(v1)
End Function

Function removecurrentcustomtag()
	
	If currentcustomtagnumber=nofcustomtags-1 Then
		nofcustomtags=nofcustomtags-1
		customtag(nofcustomtags)=""
		currentcustomtagnumber=-1
		currentcustomtag="All"
	Else
		;v1=currentcustomtagnumber
		For v1=currentcustomtagnumber To nofcustomtags-1
			customtag(v1)=customtag((v1+1))
			;v1=v1+1
		Next
		nofcustomtags=nofcustomtags-1
		customtag(nofcustomtags)=""
		currentcustomtag=customtag(currentcustomtagnumber)
	End If
	savecustomtags()
End Function

Function startcustomdeletemenu()
	
	currentmenu=101
End Function

Function customdeletemenu()
	
	menutimer=menutimer+1
	If (MouseDown(1)=0 And (MouseDown(2)=0)) Then
		mousegamemode=-1
	End If
	PositionEntity mousecursor,-10.0+MouseX()*20.0/gfxwidth,7.5-(MouseY()*15.0/gfxheight),20.0,0
	;v1=81
	For v1=81 To 99
		TranslateEntity titlemenuentity(v1),-Float(v1/10000.0),-Float(v1*2/10000.0),0.0,0
		If (EntityX(titlemenuentity(v1),0)<-14.0 Or (EntityY(titlemenuentity(v1),0)<-14.0)) Then
			FreeEntity titlemenuentity(v1)
			titlemenuentity(v1)=CopyEntity(starmesh,0)
			RotateEntity titlemenuentity(v1),-90.0,0.0,0.0,0
			EntityFX titlemenuentity(v1),1
			PositionEntity titlemenuentity(v1),Rnd(-10.0,20.0),14.0,Rnd(20.0,30.0),0
		End If
		TurnEntity titlemenuentity(v1),0.0,1.0,0.0,0
		;v1=v1+1
	Next
	v2$="Delete Custom Adventure?"
	displaytext(v2$,25.0-(Len(v2$)*0.5),4.5,1.0,1.0,255,255,0)
	v2$="------------------------"
	displaytext(v2$,25.0-(Len(v2$)*0.5),5.3,1.0,1.0,255,255,0)
	v2$=customlevellistname(customlevellistselected)
	displaytext(v2$,25.0-(Len(v2$)*0.5),7.5,1.0,1.0,255,255,255)
	v2$="by"
	displaytext(v2$,25.0-(Len(v2$)*0.5),8.45,1.0,1.0,255,255,0)
	v2$=customlevellistcreator(customlevellistselected)
	displaytext(v2$,25.0-(Len(v2$)*0.5),9.5,1.0,1.0,255,255,255)
	v2$="Please Confirm:"
	displaytext(v2$,25.0-(Len(v2$)*0.5),12.0,1.0,1.0,255,255,0)
	v2$="Yes, Delete This Adventure"
	If (340*gfxheight/600.0<MouseY() And (370*gfxheight/600.0>MouseY())) Then
		displaytext(">"+v2$+"<",24.0-(Len(v2$)*0.5)+Sin(menutimer Mod 360)*0.1,13.5+Cos(menutimer Mod 360)*0.1,1.0,1.0,255,255,100)
	Else
		displaytext(v2$,25.0-(Len(v2$)*0.5),13.5,1.0,1.0,200,200,200)
	End If
	v2$="No, Keep This Adventure"
	If (370*gfxheight/600.0<MouseY() And (405*gfxheight/600.0>MouseY())) Then
		displaytext(">"+v2$+"<",24.0-(Len(v2$)*0.5)+Sin(menutimer Mod 360)*0.1,15.0+Cos(menutimer Mod 360)*0.1,1.0,1.0,255,255,100)
	Else
		displaytext(v2$,25.0-(Len(v2$)*0.5),15.0,1.0,1.0,200,200,200)
	End If
	If (MouseDown(1) And (mousegamemode=-1)) Then
		mousegamemode=2
		If (340*gfxheight/600.0<MouseY() And (370*gfxheight/600.0>MouseY())) Then
			playsoundfxnow(132)
			v3=ReadDir(globaldirname+"\Adventures\Current\"+customlevellistfilename(customlevellistselected))
			Repeat
				v4$=NextFile(v3)
				If ((v4$<>"" And (v4$<>".")) And (v4$<>"..")) Then
					DeleteFile globaldirname+"\Adventures\Current\"+customlevellistfilename(customlevellistselected)+"\"+v4$
				End If
			Until v4$=""
			CloseDir v3
			DeleteDir globaldirname+"\Adventures\Current\"+customlevellistfilename(customlevellistselected)
			startcustomselectmenu()
		End If
		If (370*gfxheight/600.0<MouseY() And (405*gfxheight/600.0>MouseY())) Then
			playsoundfxnow(130)
			currentmenu=100
			customlevellistselected=-1
		End If
	End If
End Function

Function startcustomarchivemenu()
	
	currentmenu=103
	newtagnameentered=""
	Repeat
	Until GetKey()=0
End Function

Function customarchivemenu()
	
	menutimer=menutimer+1
	If (MouseDown(1)=0 And (MouseDown(2)=0)) Then
		mousegamemode=-1
	End If
	PositionEntity MouseCursor,-10+20*Float(MouseX())/Float(GFXWidth),7.5-15*Float(MouseY())/Float(GfxHeight),20
	;v1=81
	For v1=81 To 99
		TranslateEntity titlemenuentity(v1),-Float(v1/10000.0),-Float(v1*2/10000.0),0.0,0
		If (EntityX(titlemenuentity(v1),0)<-14.0 Or (EntityY(titlemenuentity(v1),0)<-14.0)) Then
			FreeEntity titlemenuentity(v1)
			titlemenuentity(v1)=CopyEntity(starmesh,0)
			RotateEntity titlemenuentity(v1),-90.0,0.0,0.0,0
			EntityFX titlemenuentity(v1),1
			PositionEntity titlemenuentity(v1),Rnd(-10.0,20.0),14.0,Rnd(20.0,30.0),0
		End If
		TurnEntity titlemenuentity(v1),0.0,1.0,0.0,0
		;v1=v1+1
	Next
	v2$="Select Archive Folder:"
	displaytext(v2$,0.0,2.0,1.0,1.0,255,255,0)
	v2$="--------------------------------------------------"
	displaytext(v2$,0.0,3.0,1.0,1.0,255,255,0)
	;v1=0
	For v1=0 To 11
		displaytext(":",16.0,4+v1,1.0,1.0,255,255,0)
		displaytext(":",33.0,4+v1,1.0,1.0,255,255,0)
		;v1=v1+1
	Next
	v3=-2
	;If (105*gfxheight/600.0<=MouseY() And (405*gfxheight/600.0>MouseY())) Then
	If MouseY()>=105*GfxHeight/600.0 And MouseY()<405*gfxHeight/600.0
		v4=Floor((Floor(Float(MouseY()*600.0)/Float(gfxheight))-105.0)/25.0)
		If v4<0 Then
			v4=0
		End If
		If v4>11 Then
			v4=11
		End If
		v5=0
		If MouseX()>268*GfxWidth/800.0 Then v5=1
		If MouseX()>268*2*GfxWidth/800.0 Then v5=2
		v3=(v5*12+v4)-1
	End If
	If v3=-1 Then
		v6=255
		v7=200
		v8#=0.1
	Else
		v6=200
		v7=200
		v8#=0.0
	End If
	DisplayText("(Un-Archive)",0+v8*Sin(menutimer Mod 360),4+v8*Cos(menutimer Mod 360),1,1,v6,v6,v7)
	;displaytext("(Un-Archive)",0.0+Sin(menutimer Mod 360)*v8#,4.0+Cos(menutimer Mod 360)*v8#,1.0,1.0,v6,v6,v7)
	;v1=0
	For v1=0 To nofcustomtags-1
		If v3=v1 Then
			v6=255
			v7=200
			v8#=0.1
		Else
			v6=200
			v7=200
			v8#=0.0
		End If
		;Floor((v1+1)/12)
		DisplayText(CustomTag(v1),Floor((v1+1)/12)*17+v8*Sin(menutimer Mod 360),4+((v1+1) Mod 12)+v8*Cos(menutimer Mod 360),1,1,v6,v6,v7)
		;displaytext(customtag(v1),menutimer Mod 360+Sin(menutimer Mod 360)*v8#,menutimer Mod 360+Cos(menutimer Mod 360)*v8#,1.0,1.0,v6,v6,v7)
		;v1=v1+1
	Next
	v2$="--------------------------------------------------"
	displaytext(v2$,0.0,16.0,1.0,1.0,255,255,0)
	v2$="OR Enter New Archive Folder Name:"+newtagnameentered
	If menutimer Mod 100<50 Then
		v2$=v2$+"_"
	End If
	displaytext(v2$,0.0,17.0,1.0,1.0,255,255,0)
	v2$="--------------------------------------------------"
	displaytext(v2$,0.0,18.0,1.0,1.0,255,255,0)
	If (395*gfxheight/480.0<MouseY() And (425*gfxheight/480.0>MouseY())) Then
		v2$=">CANCEL<"
		v6=255
		v7=0
		v8#=0.1
	Else
		v2$="CANCEL"
		v6=200
		v7=200
		v8#=0.0
	End If
	displaytext(v2$,25.0-(Len(v2$)*0.5)+Sin(menutimer Mod 360)*v8#,20.0+Cos(menutimer Mod 360)*v8#,1.0,1.0,v6,v6,v7)
	If (MouseDown(1) And (mousegamemode=-1)) Then
		mousegamemode=2
		If v3>=-1 Then
			v9=ReadDir(globaldirname+"\adventures\current\"+customlevellistfilename(customlevellistselected))
			Repeat
				v10$=NextFile(v9)
				If Upper$(Right$(v10$,4))=".TAG" Then
					DeleteFile globaldirname+"\adventures\current\"+customlevellistfilename(customlevellistselected)+"\"+v10$
				End If
			Until v10$=""
			CloseDir v9
			If v3>=0 Then
				v11=WriteFile(globaldirname+"\adventures\current\"+customlevellistfilename(customlevellistselected)+"\"+customtag(v3)+".tag")
				CloseFile(v11)
			End If
			playsoundfxnow(130)
			currentmenu=100
			customlevellistselected=-1
			getcurrentcustomlevels()
		End If
		If (395*gfxheight/480.0<MouseY() And (425*gfxheight/480.0>MouseY())) Then
			playsoundfxnow(130)
			currentmenu=100
			customlevellistselected=-1
		End If
	End If
	v12=GetKey()
	If v12=13 Then
		customtag(nofcustomtags)=newtagnameentered
		If Left$(newtagnameentered,1)=" " Then
			Repeat
				newtagnameentered=Right$(newtagnameentered,Len(newtagnameentered)-1)
			Until Left$(newtagnameentered,1)<>" "
		End If
		v13=1
		;v1=0
		For v1=0 To nofcustomtags-1
			If Upper$(customtag(v1))=Upper$(newtagnameentered) Then
				v13=0
			End If
			;v1=v1+1
		Next
		If newtagnameentered<>"" Then
			If v13=1 Then
				customtag(nofcustomtags)=newtagnameentered
				nofcustomtags=nofcustomtags+1
				savecustomtags()
			End If
			v9=ReadDir(globaldirname+"\adventures\current\"+customlevellistfilename(customlevellistselected))
			Repeat
				v10$=NextFile(v9)
				If Upper$(Right$(v10$,4))=".TAG" Then
					DeleteFile globaldirname+"\adventures\current\"+customlevellistfilename(customlevellistselected)+"\"+v10$
				End If
			Until v10$=""
			CloseDir v9
			v11=WriteFile(globaldirname+"\adventures\current\"+customlevellistfilename(customlevellistselected)+"\"+newtagnameentered+".tag")
			CloseFile(v11)
			playsoundfxnow(130)
			currentmenu=100
			customlevellistselected=-1
			getcurrentcustomlevels()
		End If
	Else If v12=8 Then
		newtagnameentered=""
	Else If (((((v12>=65 And (v12<90)) Or ((v12>=97 And (v12<=122)))) Or ((v12>=48 And (v12<=57)))) Or (v12=32)) And (Len(newtagnameentered)<20)) Then
		newtagnameentered=newtagnameentered+Chr$(v12)
	End If
End Function

Function startwaeditortitlemenu()
	
	currentmenu=102
	gamemode=12
	PositionEntity camera,0.0,0.0,0.0,0
	RotateEntity camera,0.0,0.0,0.0,0
	AmbientLight 255.0,255.0,255.0
	RotateEntity levellight,35.0,-35.0,0.0,0
	CameraFogMode camera,0
	CameraRange camera,0.1,1000.0
	If currentmusic<>1 Then
		If globalmusicvolume2>0 Then
			If ChannelPlaying(musicchannel) Then
				StopChannel musicchannel
			End If
			musicchannel=PlayMusic("data\music\1.ogg")
			ChannelVolume musicchannel,globalmusicvolume
			currentmusic=1
		Else
			currentmusic=-1
		End If
	End If
	;v1=60
	For v1=60 To 61
		ShowEntity titlemenuentity(v1)
		;v1=v1+1
	Next
	;v1=80
	For v1=80 To 99
		ShowEntity titlemenuentity(v1)
		;v1=v1+1
	Next
	;v1=0
	For v1=0 To 79
		deleteicon(v1)
		;v1=v1+1
	Next
	ShowEntity mousecursor
	mousecursorvisible=1
End Function

Function waeditortitlemenu()
	
	menutimer=menutimer+1
	If (MouseDown(1)=0 And (MouseDown(2)=0)) Then
		mousegamemode=-1
	End If
	PositionTexture titlemenutexture(80),(-(menutimer Mod 2500))/2500.0,menutimer Mod 5000/5000.0
	PositionEntity mousecursor,-10.0+MouseX()*20.0/gfxwidth,7.5-(MouseY()*15.0/gfxheight),20.0,0
	;v1=81
	For v1=81 To 99
		TranslateEntity titlemenuentity(v1),-Float(v1/10000.0),-Float(v1*2/10000.0),0.0,0
		If (EntityX(titlemenuentity(v1),0)<-14.0 Or (EntityY(titlemenuentity(v1),0)<-14.0)) Then
			FreeEntity titlemenuentity(v1)
			titlemenuentity(v1)=CopyEntity(starmesh,0)
			RotateEntity titlemenuentity(v1),-90.0,0.0,0.0,0
			EntityFX titlemenuentity(v1),1
			PositionEntity titlemenuentity(v1),Rnd(-10.0,20.0),14.0,Rnd(20.0,30.0),0
		End If
		TurnEntity titlemenuentity(v1),0.0,1.0,0.0,0
		;v1=v1+1
	Next
	RotateEntity titlemenuentity(60),-90.0,0.0,0.0,0
	TurnEntity titlemenuentity(60),0.0,5.0*Sin(menutimer Mod 360),0.0,0
	;v1=0
	For v1=0 To 3
		RotateEntity titlemenuentity((61+v1)),0.0,v1 Mod 3*Sin(((v1 Mod 3/6.0+0.4)*menutimer+(v1*70)) Mod 360.0),0.0,0
		;v1=v1+1
	Next
	v2$="@ 2008 Midnight Synergy"
	displaytext(v2$,50.0-(Len(v2$)*0.5),43.0,0.5,1.0,255,255,0)
	v2$="www.midnightsynergy.com"
	displaytext(v2$,50.0-(Len(v2$)*0.5),44.5,0.5,1.0,255,255,0)
End Function

Function endwaeditortitlemenu()
	
	;v1=60
	For v1=60 To 61
		HideEntity titlemenuentity(v1)
		;v1=v1+1
	Next
	;v1=80
	For v1=80 To 99
		HideEntity titlemenuentity(v1)
		;v1=v1+1
	Next
End Function

Function resetsounds()
	
	;v1=0
	For v1=0 To 500
		soundfxvolume(v1)=-1.0
		;v1=v1+1
	Next
End Function

Function playsoundfx(a0,a1,a2)
	
	If (a1=-1 And (a2=-1)) Then
		soundfxvolume(a0)=1.0*globalsoundvolume
		Return 0
	End If
	v1#=(a1-EntityX(camera,0))^2.0+(a2-((-EntityZ(camera,0))-10.0))^2.0
	If v1#<16.0 Then
		soundfxvolume(a0)=1.0*globalsoundvolume
	Else
		v2#=(1.0-((v1#-9.0)/64.0))*globalsoundvolume
		If (v2#>0.0 And (v2#>soundfxvolume(a0))) Then
			soundfxvolume(a0)=v2#
		End If
	End If
End Function

Function playsoundfxnow(a0)
	
	SoundVolume soundfx(a0),globalsoundvolume
	PlaySound(soundfx(a0))
End Function

Function playallsounds()
	
	;v1=0
	For v1=0 To 500
		If soundfxvolume(v1)>0.0 Then
			SoundVolume soundfx(v1),soundfxvolume(v1)
			If v1=11 Then
				SoundPitch soundfx(v1),20000.0+(gempitch/8.0*20000.0)
				gempitch=(gempitch+1) Mod 9
			End If
			PlaySound(soundfx(v1))
		End If
		;v1=v1+1
	Next
End Function

Function preloadmodels()
	
	levelcursor=CreateMesh(0)
	v1=CreateSurface(levelcursor,0)
	AddVertex(v1,-0.5,0.0,0.5,0.0,0.0,1.0)
	AddVertex(v1,0.5,0.0,0.5,0.25,0.0,1.0)
	AddVertex(v1,-0.5,0.0,-0.5,0.0,0.25,1.0)
	AddVertex(v1,0.5,0.0,-0.5,0.25,0.25,1.0)
	AddTriangle(v1,0,1,2)
	AddTriangle(v1,2,1,3)
	UpdateNormals levelcursor
	EntityAlpha levelcursor,0.5
	EntityOrder levelcursor,-50
	v2=myloadtexture("data\graphics\cursors.bmp",4)
	EntityTexture levelcursor,v2,0,0
	mousecursor=CreateMesh(camera)
	v1=CreateSurface(mousecursor,0)
	AddVertex(v1,-1.0,1.0,0.0,0.75,0.0,1.0)
	AddVertex(v1,1.0,1.0,0.0,1.0,0.0,1.0)
	AddVertex(v1,-1.0,-1.0,0.0,0.75,0.25,1.0)
	AddVertex(v1,1.0,-1.0,0.0,1.0,0.25,1.0)
	AddTriangle(v1,0,1,2)
	AddTriangle(v1,2,1,3)
	UpdateNormals mousecursor
	EntityAlpha mousecursor,0.8
	EntityOrder mousecursor,-51
	EntityFX mousecursor,1
	EntityTexture mousecursor,v2,0,0
	icontexturestandard=myloadtexture("data\graphics\icons-standard.bmp",4)
	icontexturecustom=myloadtexture("data\graphics\icons-custom.bmp",4)
	particletexture=myloadtexture("data\graphics\particles.bmp",1)
	stinkermesh=myloadanimmesh("data/models/stinker/body.b3d",0)
	UpdateNormals GetChild(stinkermesh,3)
	ExtractAnimSeq(GetChild(stinkermesh,3),1,20,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),21,40,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),41,60,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),61,100,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),61,80,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),80,84,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),84,100,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),101,120,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),121,140,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),141,160,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),161,180,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),181,200,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),201,220,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),201,218,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),108,114,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),221,240,0)
	ExtractAnimSeq(GetChild(stinkermesh,3),201,220,0)
	HideEntity stinkermesh
	stinkersmokedtexture=myloadtexture("data/models/stinker/bodysmoked.jpg",1)
	;v3=1
	For v3=1 To 4
		;v4=0
		For v4=0 To 4
			stinkertexture(v3,v4)=myloadtexture("data/models/stinker/body00"+v3+Chr$(65+v4)+".jpg",1)
			;v4=v4+1
		Next
		;v3=v3+1
	Next
	stinkerweemesh=myloadmd2("data/models/stinkerwee/stinkerwee.md2")
	stinkerweetexture=myloadtexture("data/models/stinkerwee/stinkerwee.jpg",1)
	stinkerweetexturesleep=myloadtexture("data/models/stinkerwee/stinkerweesleep.jpg",1)
	stinkerweetexturesad=myloadtexture("data/models/stinkerwee/stinkerweesad.jpg",1)
	EntityTexture stinkerweemesh,stinkerweetexturesleep,0,0
	HideEntity stinkerweemesh
	cagemesh=myloadmesh("data/models/cage/cage.3ds",0)
	RotateMesh cagemesh,-90.0,0.0,0.0
	cagetexture=myloadtexture("data/models/cage/cage.jpg",1)
	EntityTexture cagemesh,cagetexture,0,0
	HideEntity cagemesh
	stargatemesh=myloadmesh("data/models/gate/gate.3ds",0)
	RotateMesh stargatemesh,-90.0,0.0,0.0
	HideEntity stargatemesh
	;v5=0
	For v5=0 To 8
		teleportertexture(v5)=myloadtexture("data/models/teleport/teleport"+v5+".jpg",1)
		;v5=v5+1
	Next
	scrittermesh=myloadmesh("data/models/scritter/scritter.3ds",0)
	RotateMesh scrittermesh,-90.0,0.0,0.0
	scrittertexture=myloadtexture("data/models/scritter/scritter.jpg",1)
	EntityTexture scrittermesh,scrittertexture,0,0
	HideEntity scrittermesh
	;v5=0
	For v5=0 To 3
		steppingstonetexture(v5)=myloadtexture("data\models\bridges\bridge"+v5+".jpg",1)
		;v5=v5+1
	Next
	waterfalltexture=myloadtexture("data\leveltextures\waterfall.jpg",1)
	waterfallmesh=createwaterfallmesh()
	HideEntity waterfallmesh
	starmesh=myloadmesh("data\models\star\star.3ds",0)
	goldstartexture=myloadtexture("data\models\star\goldstar.jpg",1)
	wisptexture=myloadtexture("data\models\star\wisp.bmp",1)
	EntityTexture starmesh,goldstartexture,0,0
	HideEntity starmesh
	coinmesh=myloadmesh("data\models\coin\coin.3ds",0)
	goldcointexture=myloadtexture("data\models\coin\coin.jpg",1)
	tokencointexture=myloadtexture("data\models\coin\token.jpg",1)
	EntityTexture coinmesh,goldcointexture,0,0
	HideEntity coinmesh
	keymesh=myloadmesh("data\models\keys\key.3ds",0)
	HideEntity keymesh
	;v5=0
	For v5=0 To 3
		signmesh(v5)=myloadmesh("data\models\sign\sign"+v5+".3ds",0)
		HideEntity signmesh(v5)
		signtexture(v5)=myloadtexture("data\models\sign\sign"+v5+".jpg",1)
		;v5=v5+1
	Next
	;v5=0
	For v5=0 To 2
		doortexture(v5)=myloadtexture("data\models\houses\door"+v5+".png",1)
		;v5=v5+1
	Next
	;v5=0
	For v5=0 To 1
		cottagetexture(v5)=myloadtexture("data\models\houses\cottage"+v5+".png",4)
		;v5=v5+1
	Next
	;v5=0
	For v5=0 To 1
		housetexture(v5)=myloadtexture("data\models\houses\townhouse"+v5+".png",4)
		If v5=0 Then
			exa1=housetexture(v5)
		End If
		If v5=1 Then
			exa2=housetexture(v5)
		End If
		;v5=v5+1
	Next
	;v5=0
	For v5=0 To 0
		windmilltexture(v5)=myloadtexture("data\models\houses\windmill"+v5+".png",4)
		;v5=v5+1
	Next
	;v5=0
	For v5=0 To 0
		fencetexture(v5)=myloadtexture("data\models\houses\fence"+v5+".png",4)
		;v5=v5+1
	Next
	;v5=0
	For v5=0 To 0
		shadowtexture(v5)=myloadtexture("data\graphics\shadow"+v5+".bmp",1)
		;v5=v5+1
	Next
	;v5=0
	For v5=0 To 2
		gemmesh(v5)=myloadmesh("data\models\gems\gem"+v5+".3ds",0)
		HideEntity gemmesh(v5)
		;v5=v5+1
	Next
	turtlemesh=myloadmd2("data\models\turtle\dragonturtle.md2")
	turtletexture=myloadtexture("data\models\turtle\dragonturtle2.png",1)
	EntityTexture turtlemesh,turtletexture,0,0
	ScaleEntity turtlemesh,0.03,0.025,0.03,0
	HideEntity turtlemesh
	kaboommesh=myloadmd2("data\models\kaboom\kaboom.md2")
	;v5=1
	For v5=1 To 5
		kaboomtexture(v5)=myloadtexture("data\models\kaboom\kaboom0"+v5+".jpg",1)
		;v5=v5+1
	Next
	EntityTexture kaboommesh,kaboomtexture(1),0,0
	kaboomtexturesquint=myloadtexture("data\models\kaboom\kaboom00_squint.bmp",1)
	HideEntity kaboommesh
	fireflowermesh=myloadmd2("data\models\fireflower\fireflower.wdf")
	fireflowertexture=myloadtexture("data\models\fireflower\fireflower04.png",4)
	EntityTexture fireflowermesh,fireflowertexture,0,0
	crabmesh=myloadmd2("data\models\crab\crab.md2")
	crabtexture1=myloadtexture("data\models\crab\crab03a.jpg",1)
	crabtexture2=myloadtexture("data\models\crab\crab03b.jpg",1)
	EntityTexture crabmesh,crabtexture1,0,0
	HideEntity crabmesh
	HideEntity fireflowermesh
	barrelmesh=myloadmesh("data\models\barrels\barrel.b3d",0)
	barreltexture1=myloadtexture("Data\models\barrels\barrel1.jpg",1)
	barreltexture2=myloadtexture("Data\models\barrels\barrel2.jpg",1)
	HideEntity barrelmesh
	If fullversion=1 Then
		If portalversion=0 Then
			chompermesh=myloadmd2("data\models\chomper\chomper.md2")
		Else
			chompermesh=myloadmd2("data\models\chomper\chomper2.md2")
		End If
		chompertexture=myloadtexture("Data\models\chomper\chomper.png",1)
		EntityTexture chompermesh,chompertexture,0,0
		HideEntity chompermesh
		bowlermesh=myloadmesh("data\models\spikyball\spikeyball01.b3d",0)
		bowlertexture=myloadtexture("Data\models\spikyball\spikeyball01.png",1)
		EntityTexture bowlermesh,bowlertexture,0,0
		HideEntity bowlermesh
	End If
	busterflymesh=myloadmd2("data\models\busterfly\buster.md2")
	busterflytexture=myloadtexture("Data\models\busterfly\buster1.bmp",4)
	EntityTexture busterflymesh,busterflytexture,0,0
	HideEntity busterflymesh
	rubberduckymesh=myloadmesh("data\models\rubberducky\rubberducky.b3d",0)
	rubberduckytexture=myloadtexture("data\models\rubberducky\rubberducky.png",1)
	EntityTexture rubberduckymesh,rubberduckytexture,0,0
	HideEntity rubberduckymesh
	springtexture=myloadtexture("Data\models\bridges\spring.jpg",1)
	voidtexture=myloadtexture("Data\models\void\void.jpg",1)
	firetraptexture=myloadtexture("data\models\squares\firetrap.bmp",4)
	thwartmesh=myloadmd2("data\models\thwart\thwart05.md2")
	;v5=0
	For v5=0 To 7
		thwarttexture(v5)=myloadtexture("data\models\thwart\thwart"+v5+".jpg",1)
		;v5=v5+1
	Next
	EntityTexture thwartmesh,thwarttexture(0),0,0
	HideEntity thwartmesh
	tentaclemesh=myloadanimmesh("data\models\trees\tentacle.b3d",0)
	ExtractAnimSeq(GetChild(tentaclemesh,3),41,60,0)
	tentacletexture=myloadtexture("data\models\trees\tentacle.jpg",1)
	;v5=1
	For v5=1 To CountChildren(tentaclemesh)
		EntityTexture GetChild(tentaclemesh,v5),tentacletexture,0,0
		;v5=v5+1
	Next
	HideEntity tentaclemesh
	retroboxmesh=myloadmesh("data\models\retro\box.3ds",0)
	retroboxtexture=myloadtexture("data\models\retro\woodbox.bmp",1)
	EntityTexture retroboxmesh,retroboxtexture,0,0
	HideEntity retroboxmesh
	retrocoilymesh=myloadmd2("data\models\retro\coily.md2")
	retrocoilytexture=myloadtexture("data\models\retro\coily.bmp",1)
	EntityTexture retrocoilymesh,retrocoilytexture,0,0
	HideEntity retrocoilymesh
	retroscougemesh=myloadmesh("data\models\retro\scouge.3ds",0)
	retroscougetexture=myloadtexture("data\models\retro\scouge3.bmp",1)
	EntityTexture retroscougemesh,retroscougetexture,0,0
	RotateMesh retroscougemesh,-90.0,0.0,0.0
	RotateMesh retroscougemesh,0.0,-90.0,0.0
	HideEntity retroscougemesh
	retroufomesh=myloadmesh("data\models\retro\ufo.3ds",0)
	retroufotexture=myloadtexture("data\models\retro\ufo.bmp",1)
	EntityTexture retroufomesh,retroufotexture,0,0
	RotateMesh retroufomesh,-90.0,0.0,0.0
	RotateMesh retroufomesh,0.0,-90.0,0.0
	HideEntity retroufomesh
	retrozbotmesh=myloadmesh("data\models\retro\zbot.3ds",0)
	retrozbottexture=myloadtexture("data\models\retro\zbot.bmp",1)
	EntityTexture retrozbotmesh,retrozbottexture,0,0
	RotateMesh retrozbotmesh,-90.0,0.0,0.0
	RotateMesh retrozbotmesh,0.0,90.0,0.0
	HideEntity retrozbotmesh
	retrorainbowcointexture=myloadtexture("data\models\retro\rainbowcoin.bmp",1)
	obstaclemesh(1)=myloadmesh("data\models\Trees\rock1.3ds",0)
	obstacletexture(1)=myloadtexture("data\models\Trees\rocks.jpg",1)
	EntityTexture obstaclemesh(1),obstacletexture(1),0,0
	HideEntity obstaclemesh(1)
	obstaclemesh(2)=myloadmesh("data\models\Trees\rock2.3ds",0)
	obstacletexture(2)=myloadtexture("data\models\Trees\rocks2.jpg",1)
	EntityTexture obstaclemesh(2),obstacletexture(2),0,0
	HideEntity obstaclemesh(2)
	obstaclemesh(5)=myloadmesh("data\models\Trees\flower.3ds",0)
	obstacletexture(5)=myloadtexture("data\models\Trees\flower1.jpg",1)
	EntityTexture obstaclemesh(5),obstacletexture(5),0,0
	HideEntity obstaclemesh(5)
	obstaclemesh(6)=myloadmesh("data\models\Trees\flower2.3ds",0)
	obstacletexture(6)=myloadtexture("data\models\Trees\flower2.bmp",1)
	EntityTexture obstaclemesh(6),obstacletexture(6),0,0
	UpdateNormals obstaclemesh(6)
	HideEntity obstaclemesh(6)
	obstaclemesh(10)=myloadmesh("data\models\Trees\mushroom.3ds",0)
	obstacletexture(10)=myloadtexture("data\models\Trees\mushroom.jpg",1)
	EntityTexture obstaclemesh(10),obstacletexture(10),0,0
	HideEntity obstaclemesh(10)
	obstaclemesh(15)=myloadmesh("data\models\Trees\leaftree01.b3d",0)
	obstacletexture(15)=myloadtexture("data\models\Trees\leaftree01_03.png",4)
	EntityTexture obstaclemesh(15),obstacletexture(15),0,0
	HideEntity obstaclemesh(15)
	obstaclemesh(16)=myloadmesh("data\models\Trees\evergreentree01.b3d",0)
	obstacletexture(16)=myloadtexture("data\models\Trees\evergreen_01.png",4)
	EntityTexture obstaclemesh(16),obstacletexture(16),0,0
	HideEntity obstaclemesh(16)
	obstaclemesh(17)=myloadmesh("data\models\Trees\evergreentree01.b3d",0)
	obstacletexture(17)=myloadtexture("data\models\Trees\evergreen_02.png",4)
	EntityTexture obstaclemesh(17),obstacletexture(17),0,0
	HideEntity obstaclemesh(17)
	obstaclemesh(18)=myloadmesh("data\models\Trees\leaftree01.b3d",0)
	obstacletexture(18)=myloadtexture("data\models\Trees\leaftree01_02.png",4)
	EntityTexture obstaclemesh(18),obstacletexture(18),0,0
	HideEntity obstaclemesh(18)
	obstaclemesh(19)=myloadmesh("data\models\Trees\leaftree01.b3d",0)
	obstacletexture(19)=myloadtexture("data\models\Trees\leaftree01_01.png",4)
	EntityTexture obstaclemesh(19),obstacletexture(19),0,0
	HideEntity obstaclemesh(19)
	obstaclemesh(20)=myloadmesh("data\models\Trees\leaftree02.b3d",0)
	obstacletexture(20)=myloadtexture("data\models\Trees\leaftree02_01.png",4)
	EntityTexture obstaclemesh(20),obstacletexture(20),0,0
	HideEntity obstaclemesh(20)
	obstaclemesh(21)=myloadmesh("data\models\Trees\leaftree02.b3d",0)
	obstacletexture(21)=myloadtexture("data\models\Trees\leaftree02_02.png",4)
	EntityTexture obstaclemesh(21),obstacletexture(21),0,0
	HideEntity obstaclemesh(21)
	obstaclemesh(25)=myloadmesh("data\models\Bridges\bridgeend.3ds",0)
	obstacletexture(25)=myloadtexture("data\models\Bridges\bridgebrick.png",1)
	EntityTexture obstaclemesh(25),obstacletexture(25),0,0
	HideEntity obstaclemesh(25)
	obstaclemesh(26)=myloadmesh("data\models\houses\canopy.3ds",0)
	obstacletexture(26)=myloadtexture("data\models\houses\canopy.jpg",1)
	EntityTexture obstaclemesh(26),obstacletexture(26),0,0
	HideEntity obstaclemesh(26)
	obstaclemesh(27)=myloadmesh("data\models\houses\streetlight01.b3d",0)
	obstacletexture(27)=myloadtexture("data\models\houses\streetlight02.png",4)
	EntityTexture obstaclemesh(27),obstacletexture(27),0,0
	HideEntity obstaclemesh(27)
	obstaclemesh(28)=myloadmesh("data\models\houses\pillar.3ds",0)
	obstacletexture(28)=myloadtexture("data\models\houses\pillar1.jpg",1)
	EntityTexture obstaclemesh(28),obstacletexture(28),0,0
	HideEntity obstaclemesh(28)
	obstaclemesh(29)=myloadmesh("data\models\ladder\ladder.3ds",0)
	obstacletexture(29)=myloadtexture("data\models\houses\pillar1.jpg",1)
	EntityTexture obstaclemesh(29),obstacletexture(29),0,0
	HideEntity obstaclemesh(29)
	obstaclemesh(30)=myloadmesh("data\models\furniture\table.3ds",0)
	obstacletexture(30)=myloadtexture("data\models\furniture\table.jpg",1)
	EntityTexture obstaclemesh(30),obstacletexture(30),0,0
	HideEntity obstaclemesh(30)
	obstaclemesh(31)=myloadmesh("data\models\furniture\chair.3ds",0)
	obstacletexture(31)=myloadtexture("data\models\furniture\chair.jpg",1)
	EntityTexture obstaclemesh(31),obstacletexture(31),0,0
	HideEntity obstaclemesh(31)
	obstaclemesh(32)=myloadmesh("data\models\furniture\bed.3ds",0)
	obstacletexture(32)=myloadtexture("data\models\furniture\bed.jpg",1)
	EntityTexture obstaclemesh(32),obstacletexture(32),0,0
	HideEntity obstaclemesh(32)
	obstaclemesh(33)=myloadmesh("data\models\furniture\bookshelf01.b3d",0)
	obstacletexture(33)=myloadtexture("data\models\furniture\bookshelf01.png",1)
	EntityTexture obstaclemesh(33),obstacletexture(33),0,0
	HideEntity obstaclemesh(33)
	obstaclemesh(34)=myloadmesh("data\models\furniture\arcade.3ds",0)
	obstacletexture(34)=myloadtexture("data\models\furniture\arcade.jpg",1)
	EntityTexture obstaclemesh(34),obstacletexture(34),0,0
	HideEntity obstaclemesh(34)
	obstaclemesh(35)=myloadmesh("data\models\houses\pyramid.3ds",0)
	obstacletexture(35)=myloadtexture("data\models\houses\pyramid.jpg",1)
	EntityTexture obstaclemesh(35),obstacletexture(35),0,0
	HideEntity obstaclemesh(35)
	obstaclemesh(36)=myloadmesh("data\models\houses\cottage.b3d",0)
	HideEntity obstaclemesh(36)
	obstaclemesh(37)=myloadmesh("data\models\houses\townhouse_01a.b3d",0)
	HideEntity obstaclemesh(37)
	obstaclemesh(38)=myloadmesh("data\models\houses\townhouse_01b.b3d",0)
	HideEntity obstaclemesh(38)
	obstaclemesh(39)=myloadmesh("data\models\houses\townhouse_02a.b3d",0)
	HideEntity obstaclemesh(39)
	obstaclemesh(40)=myloadmesh("data\models\houses\townhouse_02b.b3d",0)
	HideEntity obstaclemesh(40)
	obstaclemesh(41)=myloadmesh("data\models\houses\windmill_main.b3d",0)
	HideEntity obstaclemesh(41)
	obstaclemesh(42)=myloadmesh("data\models\houses\windmill_rotor.b3d",0)
	HideEntity obstaclemesh(42)
	ObstacleMesh(46)=myLoadMesh("data\models\houses\bridge.3ds",0)
	ObstacleTexture(46)=myLoadTexture("data\models\cage\cage.jpg",1)
	EntityTexture ObstacleMesh(46),ObstacleTexture(46)
	HideEntity ObstacleMesh(46)
	buttontexture=myloadtexture("data/graphics/buttons1.bmp",4)
	gatetexture=myloadtexture("data/graphics/gates.bmp",1)
	adventuretitlebackgroundtex=myloadtexture("data\graphics\logos\starpaper.jpg",1)
	If fullversion=1 Then
		leveltexture(0)=myloadtexture("data\leveltextures\leveltex abstract.bmp",1)
	End If
	leveltexture(1)=myloadtexture("data\leveltextures\leveltex cave.bmp",1)
	leveltexture(2)=myloadtexture("data\leveltextures\leveltex cellar.bmp",1)
	If fullversion=1 Then
		leveltexture(3)=myloadtexture("data\leveltextures\leveltex forest.bmp",1)
	End If
	leveltexture(4)=myloadtexture("data\leveltextures\leveltex hills.bmp",1)
	leveltexture(5)=myloadtexture("data\leveltextures\leveltex snow.bmp",1)
	If fullversion=1 Then
		leveltexture(6)=myloadtexture("data\leveltextures\leveltex temple.bmp",1)
	End If
	If fullversion=1 Then
		leveltexture(7)=myloadtexture("data\leveltextures\leveltex town.bmp",1)
	End If
	If fullversion=1 Then
		backgroundtexture1(0)=myloadtexture("data\leveltextures\backgroundtex abstract1.bmp",1)
	End If
	If fullversion=1 Then
		backgroundtexture2(0)=myloadtexture("data\leveltextures\backgroundtex abstract2.bmp",1)
	End If
	backgroundtexture1(1)=myloadtexture("Data\leveltextures\backgroundtex cave1.bmp",1)
	backgroundtexture2(1)=myloadtexture("data\leveltextures\backgroundtex cave2.bmp",1)
	backgroundtexture1(2)=myloadtexture("data\leveltextures\backgroundtex cellar1.bmp",1)
	backgroundtexture2(2)=myloadtexture("data\leveltextures\backgroundtex cellar2.bmp",1)
	If fullversion=1 Then
		backgroundtexture1(3)=myloadtexture("data\leveltextures\backgroundtex forest1.bmp",1)
	End If
	If fullversion=1 Then
		backgroundtexture2(3)=myloadtexture("data\leveltextures\backgroundtex forest2.bmp",1)
	End If
	backgroundtexture1(4)=myloadtexture("data\leveltextures\backgroundtex hills1.bmp",1)
	backgroundtexture2(4)=myloadtexture("data\leveltextures\backgroundtex hills2.bmp",1)
	backgroundtexture1(5)=myloadtexture("data\leveltextures\backgroundtex snow1.bmp",1)
	backgroundtexture2(5)=myloadtexture("data\leveltextures\backgroundtex snow2.bmp",1)
	If fullversion=1 Then
		backgroundtexture1(6)=myloadtexture("data\leveltextures\backgroundtex temple1.bmp",1)
	End If
	If fullversion=1 Then
		backgroundtexture2(6)=myloadtexture("data\leveltextures\backgroundtex temple2.bmp",1)
	End If
	If fullversion=1 Then
		backgroundtexture1(7)=myloadtexture("data\leveltextures\backgroundtex town1.bmp",1)
	End If
	If fullversion=1 Then
		backgroundtexture2(7)=myloadtexture("data\leveltextures\backgroundtex town2.bmp",1)
	End If
	watertexture(0)=myloadtexture("data\leveltextures\watertex 1.jpg",1)
	cylinder=myloadmesh("data\models\bridges\cylinder1.b3d",0)
	HideEntity cylinder
	fence1=myloadmesh("data\models\houses\fence.3ds",0)
	HideEntity fence1
	fence2=myloadmesh("data\models\houses\fenceb.b3d",0)
	HideEntity fence2
	fencepost=myloadmesh("data\models\houses\fence_post.3ds",0)
	HideEntity fencepost
	door01b3d=myloadmesh("data\models\houses\door01.b3d",0)
	HideEntity door01b3d
	door013ds=myloadmesh("data\models\houses\door01.3ds",0)
	HideEntity door013ds
	square=myloadmesh("data\models\squares\square1.b3d",0)
	HideEntity square
	firetraptex=myloadtexture("data\models\squares\firetrap.bmp",4)
	glovetex=myloadtexture("data\models\squares\glove.bmp",4)
	fountain=myloadmesh("data\models\houses\fountain01.b3d",0)
	v6=myloadtexture("data\models\houses\fountain01.png",1)
	EntityTexture fountain,v6,0,0
	HideEntity fountain
	adventurestartlogotex=myloadtexture("data\graphics\logos\wonderlandadventures.bmp",4)
	adventurecompletedlogotex=myloadtexture("data\graphics\logos\adventurecompleted.bmp",4)
	adventurelostlogotex=myloadtexture("data\graphics\logos\adventurelost.bmp",4)
	adventuretitlestar=myloadmesh("data\models\star\star.3ds",camera)
	HideEntity adventuretitlestar
	adventuretitlestartex1=myloadtexture("data\models\star\goldstar.jpg",1)
	adventuretitlestartex2=myloadtexture("data\models\star\shadowstar.jpg",1)
	townhouse01a=myloadmesh("Data\Models\Houses\townhouse_01a.b3d",0)
	HideEntity townhouse01a
	townhouse01b=myloadmesh("Data\Models\Houses\townhouse_01b.b3d",0)
	HideEntity townhouse01b
	townhouse02a=myloadmesh("Data\Models\Houses\townhouse_02a.b3d",0)
	HideEntity townhouse02a
	townhouse02b=myloadmesh("Data\Models\Houses\townhouse_02b.b3d",0)
	HideEntity townhouse02b
	cottage=myloadmesh("Data\Models\Houses\cottage.b3d",0)
	HideEntity cottage
	Restore dataLabel215
	;v5=0
	For v5=0 To 159
		Read v7$
		If v7$<>"---" Then
			soundfx(v5)=myloadsound("data\sound\"+v7$+".wav")
		End If
		;v5=v5+1
	Next
End Function

Function convertname(a0$)
	
	Select Lower$(a0$)
	Case v2
	End Select
End Function

Function myloadtexture(a0$,a1)
	
	v1$=a0$
	v2=Len(a0$)
	Repeat
		v2=v2-1
	Until ((Mid$(a0$,v2,1)="/" Or (Mid$(a0$,v2,1)="\")) Or (v2=1))
	If v2=1 Then
		v3$=""
		v2=0
	Else
		v3$=Left$(a0$,v2)
	End If
	Repeat
		v2=v2+1
		v4=Asc(Mid$(Lower$(a0$),v2,1))
		If (v4>=97 And (v4<=122)) Then
			v4=v4+1
			If v4=123 Then
				v4=97
			End If
		End If
		v3$=v3$+Chr$(v4)
	Until Mid$(a0$,v2,1)="."
	v3$=v3$+"wdf"
	v5=LoadTexture(v3$,a1)
	If v5=0 Then
		v5=LoadTexture(v1$,a1)
		If v5=0 Then
			If FileType(v3$)<>1 Then
				If a0$="load.jpg" Then
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
					End
				End If
			End If
		End If
	End If
	Return v5
End Function

Function myloadmesh(a0$,a1)
	
	v1=Len(a0$)
	Repeat
		v1=v1-1
	Until ((Mid$(a0$,v1,1)="/" Or (Mid$(a0$,v1,1)="\")) Or (v1=1))
	If v1=1 Then
		v2$=""
		v1=0
	Else
		v2$=Left$(a0$,v1)
	End If
	Repeat
		v1=v1+1
		v3=Asc(Mid$(Lower$(a0$),v1,1))
		If (v3>=97 And (v3<=122)) Then
			v3=v3+1
			If v3=123 Then
				v3=97
			End If
		End If
		v2$=v2$+Chr$(v3)
	Until Mid$(a0$,v1,1)="."
	If Lower$(Right$(a0$,3))="3ds" Then
		v2$=v2$+"wd3"
	Else
		v2$=v2$+"wd1"
	End If
	CopyFile v2$,a0$
	If a1>0 Then
		v4=LoadMesh(a0$,a1)
	Else
		v4=LoadMesh(a0$,0)
	End If
	DeleteFile a0$
	If v4=0 Then
		v5=0
		Repeat
			v5=v5+1
		Until FileType("debug."+v5)=0
		v6=WriteFile("debug."+v5)
		Print "Couldn't Load Mesh:"+a0$
		Delay 5000
		WriteString(v6,a0$)
		WriteString(v6,v2$)
		WriteInt(v6,TotalVidMem())
		WriteInt(v6,AvailVidMem())
		End
	End If
	Return v4
End Function

Function myloadanimmesh(a0$,a1)
	
	v1=Len(a0$)
	Repeat
		v1=v1-1
	Until ((Mid$(a0$,v1,1)="/" Or (Mid$(a0$,v1,1)="\")) Or (v1=1))
	If v1=1 Then
		v2$=""
		v1=0
	Else
		v2$=Left$(a0$,v1)
	End If
	Repeat
		v1=v1+1
		v3=Asc(Mid$(Lower$(a0$),v1,1))
		If (v3>=97 And (v3<=122)) Then
			v3=v3+1
			If v3=123 Then
				v3=97
			End If
		End If
		v2$=v2$+Chr$(v3)
	Until Mid$(a0$,v1,1)="."
	If Lower$(Right$(a0$,3))="3ds" Then
		v2$=v2$+"wd3"
	Else
		v2$=v2$+"wd1"
	End If
	CopyFile v2$,a0$
	If a1>0 Then
		v4=LoadAnimMesh(a0$,a1)
	Else
		v4=LoadAnimMesh(a0$,0)
	End If
	DeleteFile a0$
	If v4=0 Then
		v5=0
		Repeat
			v5=v5+1
		Until FileType("debug."+v5)=0
		v6=WriteFile("debug."+v5)
		Print "Couldn't Load AnimMesh:"+a0$
		Delay 5000
		WriteString(v6,a0$)
		WriteString(v6,v2$)
		WriteInt(v6,TotalVidMem())
		WriteInt(v6,AvailVidMem())
		End
	End If
	Return v4
End Function

Function myloadmd2(a0$)
	
	v1=Len(a0$)
	Repeat
		v1=v1-1
	Until ((Mid$(a0$,v1,1)="/" Or (Mid$(a0$,v1,1)="\")) Or (v1=1))
	If v1=1 Then
		v2$=""
		v1=0
	Else
		v2$=Left$(a0$,v1)
	End If
	Repeat
		v1=v1+1
		v3=Asc(Mid$(Lower$(a0$),v1,1))
		If (v3>=97 And (v3<=122)) Then
			v3=v3+1
			If v3=123 Then
				v3=97
			End If
		End If
		v2$=v2$+Chr$(v3)
	Until Mid$(a0$,v1,1)="."
	v2$=v2$+"wd2"
	v4=LoadMD2(v2$,v5)
	If v4=0 Then
		v6=0
		Repeat
			v6=v6+1
		Until FileType("debug."+v6)=0
		v7=WriteFile("debug."+v6)
		Print "Couldn't Load MD2:"+a0$
		Delay 5000
		WriteString(v7,a0$)
		WriteString(v7,v2$)
		WriteInt(v7,TotalVidMem())
		WriteInt(v7,AvailVidMem())
		End
	End If
	Return v4
End Function

Function myloadsound(a0$)
	
	v1=Len(a0$)
	Repeat
		v1=v1-1
	Until ((Mid$(a0$,v1,1)="/" Or (Mid$(a0$,v1,1)="\")) Or (v1=1))
	If v1=1 Then
		v2$=""
		v1=0
	Else
		v2$=Left$(a0$,v1)
	End If
	Repeat
		v1=v1+1
		v3=Asc(Mid$(Lower$(a0$),v1,1))
		If (v3>=97 And (v3<=122)) Then
			v3=v3+1
			If v3=123 Then
				v3=97
			End If
		End If
		v2$=v2$+Chr$(v3)
	Until Mid$(a0$,v1,1)="."
	v2$=v2$+"wdf"
	v4=LoadSound(v2$)
	If v4=0 Then
		v5=0
		Repeat
			v5=v5+1
		Until FileType("debug."+v5)=0
		v6=WriteFile("debug."+v5)
		WriteString(v6,a0$)
		WriteString(v6,v2$)
		WriteInt(v6,TotalVidMem())
		WriteInt(v6,AvailVidMem())
	End If
	Return v4
End Function

Function myfiletype(a0$)
	
	v1=Len(a0$)
	Repeat
		v1=v1-1
	Until ((Mid$(a0$,v1,1)="/" Or (Mid$(a0$,v1,1)="\")) Or (v1=1))
	If v1=1 Then
		v2$=""
		v1=0
	Else
		v2$=Left$(a0$,v1)
	End If
	Repeat
		v1=v1+1
		v3=Asc(Mid$(Lower$(a0$),v1,1))
		If (v3>=97 And (v3<=122)) Then
			v3=v3+1
			If v3=123 Then
				v3=97
			End If
		End If
		v2$=v2$+Chr$(v3)
	Until Mid$(a0$,v1,1)="."
	v2$=v2$+"wdf"
	Return FileType(v2$)
End Function

Function mywritestring(a0,a1$)
	
	;v1=1
	For v1=1 To Len(a1$)
		WriteByte(a0,Asc(Mid$(a1$,v1,1)))
		;v1=v1+1
	Next
	WriteByte(a0,13)
	WriteByte(a0,10)
End Function

Function whichleveltexture(a0$)
	
	Select Lower$(a0$)
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
	End Select
	Return -1
End Function

.dataLabel0
Data "Resume Game"
Data "Load Game"
Data "Save Game"
Data "Restart Adventure"
Data "Abort Adventure"
Data "Exit Game"
Data ""
Data ""
Data ""
Data ""
Data "Abort Adventure"
Data "Are You Sure?"
Data "-------------"
Data "Yes, Please"
Data "No, Thanks!"
Data ""
Data ""
Data ""
Data ""
Data ""
Data "Restart Adventure"
Data "Are You Sure?"
Data "-------------"
Data "Yes, Please"
Data "No, Thanks!"
Data ""
Data ""
Data ""
Data ""
Data ""
Data "Exit Game"
Data "Are You Sure?"
Data "-------------"
Data "Yes, Please"
Data "No, Thanks!"
Data ""
Data ""
Data ""
Data ""
Data ""
Data "Save Game"
Data "Select A Save Slot:"
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data "Cancel"
Data "Load Game"
Data "Select A Save Slot:"
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data "Cancel"
Data "Overwrite Game"
Data "sss"
Data "Are You Sure?"
Data "-------------"
Data "Yes, Please"
Data "No, Thanks!"
Data ""
Data ""
Data ""
Data ""
Data "Do you want to"
Data "exit without saving"
Data "your game?"
Data ""
Data "Yes, that's fine."
Data "No, save my game!"
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data "Start New Game"
Data "Load Saved Game"
Data "Options"
Data "Discussion Forum"
Data "Exit Game"
Data ""
Data "Select Player Profile:"
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data "Create New Profile"
Data "Please Enter Your Name:"
Data ""
Data ""
Data ""
Data "OK"
Data "Cancel"
Data ""
Data ""
Data ""
Data ""
Data "Select A Character:"
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data "."
Data "Create Your Character"
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data "Done"
Data "Back"
Data "Load Game"
Data "Select Saved Game:"
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data ""
Data "Cancel"
Data "This Profile"
Data "Already Exists!"
Data ""
Data "Please Enter"
Data "A Different Name."
Data ""
Data "OK"
Data ""
Data ""
Data ""
Data "Options"
Data ""
Data "Change Player"
Data "Mouse Control"
Data "Sound Volume: 5"
Data "Music Volume: 3"
Data "Back"
Data ""
Data ""
Data ""
Data "Exit to Windows"
Data "Are You Sure?"
Data "-------------"
Data "Yes, Please"
Data "No, Thanks!"
Data ""
Data ""
Data ""
Data ""
Data ""
.dataLabel200
Data "THIS EDITOR VERSION HAS EXPIRED."
Data "PLEASE VISIT WWW.MIDNIGHTSYNERGY.COM"
Data "FOR UPDATE INFORMATION."
.dataLabel203
Data "Power"
Data "Activate"
Data "Ice"
Data "Activate"
Data "Fire"
Data "Activate"
Data "Time"
Data "Activate"
.dataLabel211
Data "Vision"
Data "Remove"
Data "Light"
Data "Detect"
.dataLabel215
Data "adventurewon1"
Data "adventurewon2"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "pinball2"
Data "pickupjewel"
Data "pickupcoin2"
Data "shard"
Data "wakka"
Data "explosion"
Data "---"
Data "---"
Data "---"
Data "---"
Data "ice"
Data "buttonoff"
Data "buttonturn"
Data "buttontimer"
Data "colourchange"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "fireon2"
Data "fireduring2"
Data "cageclose"
Data "bridgeup"
Data "bridgedown"
Data "gateon1"
Data "gateoff1"
Data "gatedoor"
Data "---"
Data "---"
Data "transporter"
Data "transporterflip"
Data "teleport"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "weehello1"
Data "weehello2"
Data "weehello3"
Data "weehello4"
Data "weehello5"
Data "weeyes1"
Data "weeyes2"
Data "weeyes3"
Data "weeyes4"
Data "weezee"
Data "weeok1"
Data "weeok2"
Data "weeok3"
Data "weeok4"
Data "weeok5"
Data "weeouch1"
Data "weeouch2"
Data "weeouch3"
Data "weebored"
Data "weetired"
Data "weewoo"
Data "weethanks"
Data "weebye"
Data "weeyeay"
Data "kaboom1"
Data "kaboom2"
Data "kaboom3"
Data "kaboom4"
Data "kaboom5"
Data "kaboom6"
Data "magiccharge"
Data "magicblink2"
Data "magiccast"
Data "freeze"
Data "freezebreak"
Data "freezestinker"
Data "freezechomper"
Data "freezethwart"
Data "spellballbounce"
Data "---"
Data "magicon"
Data "magicoff"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "scritterhop"
Data "chomper"
Data "flowergrow"
Data "flowerfire"
Data "flowerhit"
Data "flowerdie"
Data "thwart"
Data "thwartpickup"
Data "splosh"
Data "spikeyball"
Data "brick"
Data "tentacleup"
Data "tentacledown"
Data "---"
Data "---"
Data "crabwalk"
Data "crabup"
Data "crabdown"
Data "bounce"
Data "---"
Data "waterfall"
Data "quack"
Data "quake"
Data "void"
Data "bubble"
Data "splash"
Data "---"
Data "---"
Data "---"
Data "---"
Data "menuclick"
Data "invenopen"
Data "invenclose"
Data "loadgame"
Data "savegame"
Data "areyousure"
Data "menuclick2"
Data "loadinggame"
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
Data "voices\death1"
Data "voices\death2"
Data "voices\death3"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "lost1"
Data "lost2"
Data "lost3"
Data "lost4"
Data "start1"
Data "start2"
Data "start3"
Data "start4"
Data "start5"
Data "hello"
Data "ice1"
Data "ice2"
Data "ice3"
Data "coin"
Data "item"
Data "item-no"
Data "aha"
Data "intro"
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
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"
Data "---"