import random
cpuint=random.randint(0,2)
userchoice=""
cpuchoice=""
userint=int(input("Quick! Scissor (0), Rock (1), Paper (2), shoot! "))
if userint==0:
    userchoice="Scissors"
elif userint==1:
    userchoice="Rock"
elif userint==2:
    userchoice="Paper"
if cpuint==0:
    cpuchoice="Scissors"
elif cpuint==1:
    cpuchoice="Rock"
elif cpuint==2:
    cpuchoice="Paper"
if (userchoice=="Paper") and (cpuchoice=="Rock"):
    print(f"The computer is {cpuchoice}. You are {userchoice}. You win!")
elif (userchoice=="Rock") and (cpuchoice=="Scissors"):
    print(f"The computer is {cpuchoice}. You are {userchoice}. You win!")
elif (userchoice=="Scissors") and (cpuchoice=="Paper"):
    print(f"The computer is {cpuchoice}. You are {userchoice}. You win!")
elif (userchoice=="Rock") and (cpuchoice=="Paper"):
    print(f"The computer is {cpuchoice}. You are {userchoice}. You lose!!!")
elif (userchoice=="Scissors") and (cpuchoice=="Rock"):
    print(f"The computer is {cpuchoice}. You are {userchoice}. You lose!!!")
elif (userchoice=="Paper") and (cpuchoice=="Scissors"):
    print(f"The computer is {cpuchoice}. You are {userchoice}. You lose!!!")
elif (userchoice=="Paper") and (cpuchoice=="Paper"):
    print(f"The computer is {cpuchoice}. You are {userchoice} as well. It's a draw!")
elif (userchoice=="Scissors") and (cpuchoice=="Scissors"):
    print(f"The computer is {cpuchoice}. You are {userchoice} as well. It's a draw!")
elif (userchoice=="Rock") and (cpuchoice=="Rock"):
    print(f"The computer is {cpuchoice}. You are {userchoice} as well. It's a draw!")
