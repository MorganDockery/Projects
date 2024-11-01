import java.util.Scanner;
import java.util.Random;
public class ProblemSet3 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        Random randy = new Random();

        //PROBLEM 1
        System.out.println("\n\nPROBLEM 1\n");
        System.out.print("Enter the day of the week. 0 is Sunday, 1 is Monday, up to Saturday: ");
        int dayInput = ui.nextInt();

        String today="";
        String futureDay="";
        if(dayInput>6){
            System.out.print("6 is the highest you can go, i.e. Saturday. Please reput today's date: ");
            dayInput = ui.nextInt();
        }
        
        if(dayInput==0){
            today="Sunday";
        }
        else if(dayInput==1){
            today="Monday";
        }
        else if(dayInput==2){
            today="Tuesday";
        }
        else if(dayInput==3){
            today="Wednesday";
        }
        else if(dayInput==4){
            today="Thursday";
        }
        else if(dayInput==5){
            today="Friday";
        }
        else{
            today="Saturday";
        }

        System.out.print("How many days have passed since then? ");
        int daysPassed = ui.nextInt();

        int daysTotal = dayInput+daysPassed;
        int weeks = Math.round(daysTotal/7);
        

        int finalDaySetter = daysTotal-(weeks*7);

        if(finalDaySetter==0){
            futureDay="Sunday";
        }
        else if(finalDaySetter==1){
            futureDay="Monday";
        }
        else if(finalDaySetter==2){
            futureDay="Tuesday";
        }
        else if(finalDaySetter==3){
            futureDay="Wednesday";
        }
        else if(finalDaySetter==4){
            futureDay="Thursday";
        }
        else if(finalDaySetter==5){
            futureDay="Friday";
        }
        else{
            futureDay="Saturday";
        }



        System.out.printf("Today is %s, and the future day is %s. %s weeks will pass.",today,futureDay,weeks);

        //PROBLEM 2
        System.out.println("\n\nPROBLEM 2\n");
        System.out.println("Give me a number.");
        int firstNum = ui.nextInt();

        System.out.println("Give me another number.");
        int secondNum = ui.nextInt();

        System.out.println("Give me a final number.");
        int thirdNum = ui.nextInt();

        int smallest, middle, largest;

        if (firstNum <= secondNum || firstNum <= thirdNum) {
            smallest = firstNum;
            if (secondNum <= thirdNum) {
                middle = secondNum;
                largest = thirdNum;
            } else {
                middle = thirdNum;
                largest = secondNum;
            }
        } else if (secondNum <= firstNum || secondNum <= thirdNum) {
            smallest = secondNum;
            if (firstNum <= thirdNum) {
                middle = firstNum;
                largest = thirdNum;
            } else {
                middle = thirdNum;
                largest = firstNum;
            }
        } else {
            smallest = thirdNum;
            if (firstNum <= secondNum) {
                middle = firstNum;
                largest = secondNum;
            } else {
                middle = secondNum;
                largest = firstNum;
            }
        }
        System.out.printf("%s, %s, %s",smallest,middle,largest);

        //PROBLEM 3
        System.out.println("\n\nPROBLEM 3\n");
        System.out.println("Give me a three-digit number.");
        int firstPalinNum = ui.nextInt();

        int flipNum = reverseNum(firstPalinNum,0);
        if (flipNum==firstPalinNum){
            System.out.printf("%s is a palindrome.",firstPalinNum);
        }
        else{
            System.out.printf("%s is not a palindrome.",firstPalinNum);
        }

        //PROBLEM 4
        System.out.println("\n\nPROBLEM 4\n");
        System.out.print("Scissors (0), Rock (1), or Paper (2)? ");
        int userInput = ui.nextInt();
        String userChoice = "";

        if (userInput > 2){
            System.out.print("Any number over 2 isn't allowed. Please select Scissors (0), Rock (1), or Paper (2)? ");
            userInput = ui.nextInt();
        }
        else if (userInput < 0){
            System.out.print("Any number over under 0 isn't allowed. Please select Scissors (0), Rock (1), or Paper (2)? ");
            userInput = ui.nextInt();
        }
        if (userInput == 0){
            userChoice = "Scissors";
        }

        else if (userInput == 1){
            userChoice = "Rock";
        }

        else{
            userChoice = "Paper";
        }

        int CPUInput = randy.nextInt(0,3);
        String CPUChoice = "";
        if (CPUInput == 0){
            CPUChoice = "Scissors";
        }
        else if (CPUInput == 1){
            CPUChoice = "Rock";
        }
        else{
            CPUChoice = "Paper";
        }

        String winner = "";

        if (userInput==2){  //Paper
            if (CPUInput==1){ 
            winner="The user";
            }
            else if (CPUInput==0){
                winner="The CPU";
                }
            else{
                winner="Nobody";
            }
        }
        else if (userInput==1){ //Rock
            if (CPUInput==0){
            winner="The User";
            }
            else if (CPUInput==2){
                winner="The Scissors";
                }
            else{
                winner="Nobody";
            }
        }
        else{   //Scissors
            if (CPUInput==2){
            winner="The user";
            }
            else if (CPUInput==1){
                winner="The CPU";
                }
            else{
                winner="Nobody";
            }
        }

        System.out.printf("CPU: %s \nUSER: %s \n%s wins!",CPUChoice,userChoice,winner);

        //PROBLEM 5
        System.out.println("\n\nPROBLEM 5\n");
        int suit = randy.nextInt(1,4);
    int number = randy.nextInt(1,13);
    String userSuit="";
    String userNumber="";


    if(suit==1){
        userSuit="Clubs";
    }
    else if(suit==2){
        userSuit="Diamonds";
    }
    else if(suit==3){
        userSuit="Hearts";
    }
    else{
        userSuit="Spades";
    }

    if(number==1){
        userNumber="an Ace";
    }

    else if(number==2){
        userNumber="a two";
    }
    else if(number==3){
        userNumber="a three";
    }
    else if(number==4){
        userNumber="a four";
    }
    else if(number==5){
        userNumber="a five";
    }
    else if(number==6){
        userNumber="a six";
    }
    else if(number==7){
        userNumber="a seven";
    }
    else if(number==8){
        userNumber="an eight";
    }
    else if(number==9){
        userNumber="a nine";
    }
    else if(number==10){
        userNumber="a ten";
    }

    else if(number==11){
        userNumber="a Jack";
    }
    else if(number==12){
        userNumber="a Queen";
    }
    else{
        userNumber="a King";
    }


    System.out.printf("You pulled %s of %s!",userNumber,userSuit);

    ui.close();    
}


public static int reverseNum(int firstPalinNum, int flipNum){
    if(firstPalinNum==0){
        return flipNum;
    }

    flipNum = flipNum * 10 + firstPalinNum % 10; //Source for the math: https://www.geeksforgeeks.org/java-reverse-number-program/
    return reverseNum(firstPalinNum/10, flipNum);
}
}