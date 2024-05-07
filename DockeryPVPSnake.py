#---import section
import turtle as t
# from turtle import *
import random as r
import time

#---global var or objects or game config
delay=0.1
bodyParts=[]                            #bodyPart(s) plural so should be a list

wn=t.Screen()
wn.setup(width=600,height=600)          #each time the game turns on, sets the w,h
wn.bgcolor("gray")

head = t.Turtle(shape="square")
head.speed(0)
head.penup()
head.direction="stop"                   #direction the object is pointing

food = t.Turtle(shape="square")
food.speed(0)
food.penup()
food.teleport(100,100)
food.color("red")

scoreKeeper=t.Turtle()
scoreKeeper.penup()
scoreKeeper.teleport(150,220)
scoreKeeper.pendown()
scoreKeeper.speed(0)
scoreKeeper.hideturtle()    #Still writes, but can't see the turtle

eraser=t.Turtle()
eraser.penup()
eraser.teleport(140,220)
eraser.pendown()
eraser.speed(0)
eraser.hideturtle()    #Still writes, but can't see the turtle
eraser.color("gray")
eraser.fillcolor("gray")

score=0
p1Score=0
p2Score=0
turnTracker=1

#---functions
#move up
def up():
    global turnTracker
    if head.direction != "down":
        head.direction="up"
    while turnTracker>2:
        turnTracker=1
        erase()
#move down
def down():
    global turnTracker
    if head.direction != "up":
        head.direction="down"
    while turnTracker>2:
        turnTracker=1
        erase()
#move left
def left():
    global turnTracker
    if head.direction != "right":
        head.direction="left"
    while turnTracker>2:
        turnTracker=1
        erase()
#move right
def right():
    global turnTracker
    if head.direction != "left":
        head.direction="right"
    while turnTracker>2:
        turnTracker=1
        erase()
#stop
def stop():
    head.direction="stop"
#moves the head forward 
def move():
    if head.direction=="up":
        head.sety(head.ycor()+20)
    elif head.direction=="down":
        head.sety(head.ycor()-20)
    elif head.direction=="left":
        head.setx(head.xcor()-20)
    elif head.direction=="right":
        head.setx(head.xcor()+20)
    elif head.direction=="stop":
        head.setx(head.xcor())
        head.sety(head.ycor())

def wallCollideCheck():
                #top             #bottom             #left               #right
    if head.ycor()>290 or head.ycor()<-290 or head.xcor()<-290 or head.xcor()>290:
        hideTheBodyParts()
def foodCollideCheck():
        global score
        global delay
        if head.distance(food) < 20:
            score+=1
            food.teleport(r.randint(-290,290),r.randint(-290,290))
            bodyPart = t.Turtle(shape="square")
            bodyPart.speed(0)
            bodyPart.penup()
            bodyParts.append(bodyPart)

#game over function
def hideTheBodyParts():
    global bodyParts                        #this tells py that bodyParts is a global var
    global score
    global p1Score
    global p2Score
    global turnTracker
    
    head.teleport(0,0)
    head.direction="stop"
    if turnTracker==1:
        p1Score=score
        score=0
        scoreKeeper.teleport(scoreKeeper.xcor(), scoreKeeper.ycor()-20)
        scoreKeeper.write(f"P1: {p1Score}")
        turnTracker+=1
    elif turnTracker==2:
        p2Score=score
        score=0
        scoreKeeper.teleport(scoreKeeper.xcor(), scoreKeeper.ycor()-20)
        scoreKeeper.write(f"P2: {p2Score}")
        scoreKeeper.teleport(scoreKeeper.xcor(), scoreKeeper.ycor()-20)
        if p1Score>p2Score:
            scoreKeeper.write("P1 wins.")
        elif p2Score>p1Score:
            scoreKeeper.write("P2 wins.")
        elif p1Score==p2Score:
            scoreKeeper.write("Tie.")
        turnTracker+=1
        scoreKeeper.teleport(scoreKeeper.xcor(), scoreKeeper.ycor()+60)
            
    for eachBodyPart in bodyParts:
        # eachBodyPart.hideturtle()
        eachBodyPart.goto(1000,1000)       #Not the best, but it hides the body
    bodyParts=[]                            #"clearing the list" - reset the list

def erase():
    eraser.begin_fill()
    for i in range(4):
        eraser.fd(60)
        eraser.rt(90)
    eraser.end_fill()
    eraser.teleport(scoreKeeper.xcor()-10, scoreKeeper.ycor())

def followTheLeader():
    for i in range(len(bodyParts)-1,0,-1):
        newX=bodyParts[i-1].xcor()
        newY=bodyParts[i-1].ycor()
        bodyParts[i].goto(newX,newY)
          
    #Move the neck to the head
    if len(bodyParts)>0:                    #only runs when there are bodyParts
        newX=head.xcor()
        newY=head.ycor()
        neck=bodyParts[0]
        neck.goto(newX,newY)

def bodyCollideCheck():
    for eachBodyPart in bodyParts:
        if head.distance(eachBodyPart)<10:
            hideTheBodyParts()

#---events
#window.onkeypress(command,"keyboard character")
wn.onkeypress(up,"w")                        #keyboard bindings from the window object
wn.onkeypress(down,"s")                      #keyboard bindings from the window object
wn.onkeypress(left,"a")                      #keyboard bindings from the window object
wn.onkeypress(right,"d")                     #keyboard bindings from the window object
wn.listen()                                  #tells the window to listen for key presses

#---main loop
while True:                        #runs the code over and over
    wn.update()                   #update or refresh the screen
    wallCollideCheck()      
    foodCollideCheck()
    followTheLeader()
    move()
    bodyCollideCheck()
    scoreKeeper.clear
    time.sleep(delay)                  #time module tells the program to sleep by some delay value
