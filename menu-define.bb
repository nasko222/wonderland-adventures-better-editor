

; Custom Level Stuff
Global CustomCurrentArchive=0 ; 0-current, 1-archive
Global CustomLevelListStart=0
Global CustomLevelListSelected=-1 ; -1: none selected
Dim CustomLevelListFileName$(5000)
Dim CustomLevelListName$(5000)
Dim CustomLevelListCreator$(5000)
Dim CustomLevelListCompleted(5000)
Dim CustomLevelListScore(5000)
Dim CustomLevelListGems(5000)
Dim CustomLevelListGemsTotal(5000)
Dim CustomLevelListCoins(5000)
Dim CustomLevelListCoinsTotal(5000)
Global NofCustomLevels

Global SaveSlotImage,SaveSlotImage2
Global AdventureTitle4Saving$
Dim SaveSlotEntity(9),SaveSlotTexture(9),SaveSlotDateTime$(9),SaveSlotLevelName$(9)

Global DialogBackGroundEntity,DialogBackGroundEntity2,DialogBackGroundSize


; Dialog
Global CurrentDialog, CurrentInterchange, CurrentInterChangeNofLines, CurrentInterChangeReply
Global DialogTimer, DialogLineLength
Global DialogCurrentRed,DialogCurrentGreen,DialogCurrentBlue,DialogCurrentEffect

Global DialogObject1,DialogObject2

Const MaxInterChanges=100
Global StartingInterChange
Global NofInterchanges	
Dim NofInterChangeTextLines(MaxInterChanges)	
Dim InterChangeTextLine$(MaxInterChanges,7)
Dim DialogTextCommand$(MaxInterChanges,200),DialogTextCommandPos(MaxInterChanges,200),NofTextCommands(MaxInterChanges)	

Dim NofInterChangeReplies(MaxInterChanges)
Dim InterChangeReplyText$(MaxInterChanges,8)
Dim InterChangeReplyFunction(MaxInterChanges,8)
Dim InterChangeReplyData(MaxInterChanges,8)
Dim InterChangeReplyCommand(MaxInterChanges,8)
Dim InterChangeReplyCommandData(MaxInterChanges,8,4)
Const MaxAskAbouts=100
Global NofAskAbouts
Global AskAboutTopText$
Dim AskAboutText$(MaxAskAbouts)
Dim AskAboutActive(MaxAskAbouts)
Dim AskAboutInterchange(MaxAskAbouts)
Dim AskAboutRepeat(MaxAskAbouts)



; AskAbout Masterlist
Global NofMasterAskAbouts
Dim MasterAskAboutActive(1000)

Dim DialogTextLine$(10)


; Icons (in-game)

; There are 80 icons, from x=0-9 and y=0-7

Global IconTextureStandard, IconTextureCustom

Dim IconEntity(100)
Dim IconX#(100),IconY#(100)
Dim IconTexture(100)
Dim IconSize(100) ;0%-100%, for fade in-out
Dim IconType(100)
Dim IconHelpText$(100),IconSubText$(100)


Global IconPicked=-1 ; -1 if none, otherwise 0 to 79


Dim TitleMenuEntity(100),TitleMenuTexture(100)
Global Titlemenuflag,Titlemenupointat

Global ClickonUnwalkable=False
Global UsedInventoryOnce=False

Global MessageLineText1$,Messagelinetext2$,MessageLineTimer

Global CurrentMenu, CurrentMenuNofItems, MenuTimer, MenuTime
Dim MenuText$(30,10)
Dim MenuActive(30,10)

Restore Menutexts
For i=0 To 19
	For j=0 To 9
		Read menutext$(i,j)
		
		
	Next
Next

Global GameSlotToBeSaved,GameNameToBeSaved$

; In Game

.Menutexts

; 0 in-game Main Menu
Data "Resume Game","Load Game","Save Game","Restart Adventure","Abort Adventure","Exit Game","","","",""

; 1 abort adventure - are you sure
Data "Abort Adventure","Are You Sure?","-------------","Yes, Please","No, Thanks!","","","","",""

; 2 restart adventure - are you sure
Data "Restart Adventure","Are You Sure?","-------------","Yes, Please","No, Thanks!","","","","",""

; 3 exit game - are you sure
Data "Exit Game","Are You Sure?","-------------","Yes, Please","No, Thanks!","","","","",""

; 4 save game
Data "Save Game","Select A Save Slot:","","","","","","","","Cancel"

; 5 load game
Data "Load Game","Select A Save Slot:","","","","","","","","Cancel"

; 6 overwrite game
Data "Overwrite Game","sss","Are You Sure?","-------------","Yes, Please","No, Thanks!","","","",""

; 7 save before exit?
Data "Do you want to","exit without saving","your game?","","Yes, that's fine.","No, save my game!","","","",""




; 8 Floinging
Data "","","","","","","","","",""

Data "","","","","","","","","","" ; in-game not used
Data "","","","","","","","","","" ; in-game not used


; Out of Game


; 11 - main menu
Data "","","","","Start New Game","Load Saved Game","Options","Discussion Forum","Exit Game",""
; 12 - select profile
Data "Select Player Profile:","","","","","","","","","Create New Profile"
; 13 - enter new profile name
Data "Please Enter Your Name:","","","","OK","Cancel","","","",""
; 14 - select character
Data "Select A Character:","","","","","","","","","."
; 15 - create custom character
Data "Create Your Character","","","","","","","","Done","Back"
; 16 - load game from main menu
Data "Load Game","Select Saved Game:","","","","","","","","Cancel"
; 17 - profile name already exists
Data "This Profile","Already Exists!","","Please Enter","A Different Name.","","OK","","",""
; 18 - options
Data "Options","","Change Player","Mouse Control","Sound Volume: 5","Music Volume: 3","Back","","",""
; 19 exit to windows - are you sure
Data "Exit to Windows","Are You Sure?","-------------","Yes, Please","No, Thanks!","","","","",""

