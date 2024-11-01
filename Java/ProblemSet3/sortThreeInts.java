import java.util.Scanner;
public class sortThreeInts {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
    
        System.out.println("Give me a number.");
        int firstNum = ui.nextInt();

        System.out.println("Give me another number.");
        int secondNum = ui.nextInt();

        System.out.println("Give me a final number.");
        int thirdNum = ui.nextInt();

        if(firstNum>secondNum || secondNum>thirdNum || firstNum>thirdNum){ //Source for formatting: https://stackoverflow.com/questions/24743366/the-operator-is-undefined-for-the-argument-types-boolean-int
            System.out.printf("%s, %s, %s",firstNum,secondNum,thirdNum);
        }

        else if(firstNum>thirdNum || thirdNum>secondNum || firstNum>secondNum){
            System.out.printf("%s, %s, %s",firstNum,thirdNum,secondNum);
        }

        else if(secondNum>firstNum || firstNum>thirdNum || secondNum>thirdNum){
            System.out.printf("%s, %s, %s",secondNum,firstNum,thirdNum);
        }

        else if(secondNum>thirdNum || thirdNum>firstNum || thirdNum>firstNum){
            System.out.printf("%s, %s, %s",secondNum,thirdNum,firstNum);
        }

        else if(thirdNum>secondNum || secondNum>firstNum || thirdNum>firstNum){
            System.out.printf("%s, %s, %s",thirdNum,secondNum,firstNum);
        }

        else{
            System.out.printf("%s, %s, %s",thirdNum,firstNum,secondNum);
        }
        ui.close();
        
}

}