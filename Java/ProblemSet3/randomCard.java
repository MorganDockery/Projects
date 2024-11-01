import java.util.Scanner;
import java.util.Random;

public class randomCard {
    public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    Random randy = new Random();

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
}
