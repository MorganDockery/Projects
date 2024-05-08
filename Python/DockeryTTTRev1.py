#import statements

#global variables
artboard='''
    |   |
--------------
    |   |
--------------
    |   |
'''
gameBoard=[[" "," "," "],
       [" "," "," "],
       [" "," "," "]]

#functions
def printBoard(board):
    for i in range(3):
        print(f"{board[i][0]}|{board[i][1]}|{board[i][2]}")
        if i != 2:
            print("-"*5)
    print()

def checkForWinner(board):
    #horizontal checking
    for r in range(len(board)):
        if (board[r][0]==board[r][1] and board[r][1]==board[r][2] and board[r][0]!=" "):
            #TO DO: MAKE MORE DYNAMIC
            print(f"Winner winner chicken dinner! {winnersymbol} wins!")
            printBoard(board)
            return True
        
    #vertical checking
    for c in range(len(board)):
        if (board[0][c]==board[1][c] and board[1][c]==board[2][c] and board[0][c]!=" "):
            #TO DO: MAKE MORE DYNAMIC
            print(f"Winner winner chicken dinner! {winnersymbol} wins!")
            printBoard(board)
            return True

    #diagonally
    if (board[0][0]==board[1][1] and board[1][1]==board[2][2] and board[0][0]!=" "):
            #TO DO: MAKE MORE DYNAMIC
            print(f"Winner winner chicken dinner! {winnersymbol} wins!")
            printBoard(board)
            return True
    elif (board[2][0]==board[1][1] and board[1][1]==board[0][2] and board[2][0]!=" "):
            #TO DO: MAKE MORE DYNAMIC
            print(f"Winner winner chicken dinner! {winnersymbol} wins!")
            printBoard(board)
            return True

    return False

def checkForTie(board):
    #CAT or Tie or Scratch
    for row in board:
        if " " in row:
            return False
    printBoard(board)
    print("Tie")
    return True

def spotIsTaken(symbol,board,row,col):
    if board[row][col] == " ":
        board[row][col]=symbol
        return False
    return True

symbol="X"
#program loop

#Keep looping until a winner
while(symbol!="Q"):
    #print the game board
    printBoard(gameBoard)
    #player takes a turn
    goodSpot=False #if valid input and spot not taken
    while not goodSpot: 
        row=int(input("row: "))-1
        col=int(input("col: "))-1
        if row in range(3) and col in range(3):
            #check if spot taken
            if spotIsTaken(symbol,gameBoard,row,col):
                print("Spot Taken")
            else:
                goodSpot=True
            winnersymbol=symbol
   #check for a winner or CAT
    if checkForWinner(gameBoard) or checkForTie(gameBoard):
        symbol="Q"
        
    #swap turns
    if symbol=="X":
        symbol="O"
    elif symbol=="O":
        symbol="X"