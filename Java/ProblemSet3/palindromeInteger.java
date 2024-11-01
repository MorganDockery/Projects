import java.util.Scanner;
public class palindromeInteger {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
    
        System.out.println("Give me a number.");
        int firstNum = ui.nextInt();

        int flipNum = reverseNum(firstNum,0);
        if (flipNum==firstNum){
            System.out.printf("%s is a palindrome.",firstNum);
        }
        else{
            System.out.printf("%s is not a palindrome.",firstNum);
        }

        
    
        ui.close();
        }

        public static int reverseNum(int firstNum, int flipNum){
            if(firstNum==0){
                return flipNum;
            }
            flipNum = flipNum * 10 + firstNum % 10; //Spirce fpr the math: https://www.geeksforgeeks.org/java-reverse-number-program/
            return reverseNum(firstNum/10, flipNum);
        }
}
