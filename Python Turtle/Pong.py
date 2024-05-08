#---IMPORTS
import turtle as t
import random as r
#---GLOBAL VAR/OBJECTS/GAME CONFIG
wn=t.Screen()
wn.bgcolor("black")
SCREEN_H = 600
SCREEN_W = 1000
PADDLE_WIDTH=50
wn.setup(width=SCREEN_W+100, height=SCREEN_H+100)
startx=-500
starty=300

leftScore=0
rightScore=0

fontSettings=("Times New Roman", 30, "normal")

lScore = t.Turtle(visible=False)
lScore.color("White")
lScore.speed(0)
lScore.penup()
lScore.setposition(-SCREEN_W/4,SCREEN_H/2)
lScore.write(leftScore,font=fontSettings)

rScore = t.Turtle(visible=False)
rScore.color("White")
rScore.speed(0)
rScore.penup()
rScore.setposition(SCREEN_W/4,SCREEN_H/2)
rScore.write(rightScore,font=fontSettings)

courtMaker=t.Turtle(visible=False)
courtMaker.color("white")
courtMaker.speed(0)
cMDirection="right"

ball=t.Turtle("circle")
ball.color("Yellow")
ball.penup()
ball.speed(0)

leftPlayer=t.Turtle()
leftPlayer.color("blue")
leftPlayer.shape("square")
leftPlayer.speed(0)
leftPlayer.turtlesize(4,1)  #Turtlesize will stretch the turtle
leftPlayer.teleport(-SCREEN_W/2-10,0)
leftPlayer.penup()

rightPlayer=t.Turtle()
rightPlayer.color("red")
rightPlayer.shape("square")
rightPlayer.speed(0)
rightPlayer.turtlesize(4,1)  #Turtlesize will stretch the turtle
rightPlayer.teleport(SCREEN_W/2-10,0)
rightPlayer.penup()

#---FUNCTIONS
def courtLines():
    #Top border
    courtMaker.teleport(startx, starty)
    courtMaker.fd(1000)
    #Bottom border
    courtMaker.teleport(startx, starty-SCREEN_H)
    courtMaker.fd(1000)
    #Half-court lines
    courtMaker.teleport(0, starty)
    courtMaker.rt(90)
    cMDirection="down"
    for i in range(SCREEN_H//50):   #// returns int value
        courtMaker.fd(26)
        courtMaker.teleport(courtMaker.xcor(), courtMaker.ycor()-26)
    #Remove turtle from screen

def leftPlayerUp():
    if leftPlayer.ycor()<SCREEN_H/2-PADDLE_WIDTH:   #Not out of bounds & not above top line
        leftPlayer.goto(leftPlayer.xcor(),leftPlayer.ycor()+20)
def leftPlayerDown():
    if leftPlayer.ycor()>-SCREEN_H/2+PADDLE_WIDTH:
        leftPlayer.goto(leftPlayer.xcor(),leftPlayer.ycor()-20)
def rightPlayerUp():
    if rightPlayer.ycor()<SCREEN_H/2-PADDLE_WIDTH:
        rightPlayer.goto(rightPlayer.xcor(),rightPlayer.ycor()+20)

def rightPlayerDown():
    if rightPlayer.ycor()>-SCREEN_H/2+PADDLE_WIDTH:
        rightPlayer.goto(rightPlayer.xcor(),rightPlayer.ycor()-20)

def resetBall():
    ball.setposition(0,0)
     #randomizer for who serves first
    if r.randint(0,1)==0:    #left first
          ball.setheading(r.randint(150,210))
    else:
          ball.setheading(r.randint(-30,30))

def moveBall():
    global leftScore
    global rightScore
    ball.fd(20)
    #Top or bottom wall bounce
    if ball.ycor()>(SCREEN_H/2) or ball.ycor()<(-SCREEN_H/2):
         ball.setheading(-ball.heading())
    #Left or right wall miss
    elif ball.xcor()<((-SCREEN_W/2)-50) or ball.xcor()>((SCREEN_W/2)+50):
        if ball.xcor()<0:
            rightScore+=1
            rScore.clear()
            rScore.pendown()
            rScore.write(rightScore,font=fontSettings)
            resetBall()
        else:
            leftScore+=1
            lScore.clear()
            lScore.pendown()
            lScore.write(leftScore,font=fontSettings)
        resetBall()
    else:
        collideWithPaddle(leftPlayer,ball)
        collideWithPaddle(rightPlayer,ball)
    wn.ontimer(moveBall,20) #Recursion where you call the f(x) inside itself to loop

def collideWithPaddle(paddle,ball):
    #did we collide with paddle?
    if paddle.distance(ball) < 20:
        ball.setheading(180-ball.heading()) #flip the heading it was going
        #Which paddle did we collide with?
        if ball.xcor()>0: #Right paddle
            ball.setx(ball.xcor()-5)
        else:           #Left Paddle
            ball.setx(ball.xcor()+5)
        ball.fd(10)
    #the ball should react accordingly

#EVENTS
wn.onkeypress(leftPlayerUp,"w")
wn.onkeypress(leftPlayerDown,"s")
wn.onkeypress(rightPlayerUp,"Up")
wn.onkeypress(rightPlayerDown,"Down")
wn.listen()

#---MAIN LOOP
        
courtLines()
moveBall()

wn.mainloop()