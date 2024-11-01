import java.util.Scanner;
import java.util.Random;

public class rpsBattle {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        Random randy = new Random();

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
        
        ui.close();
        
}
}
