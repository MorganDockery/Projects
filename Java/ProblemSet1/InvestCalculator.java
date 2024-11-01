import java.util.Scanner;

public class InvestCalculator {
    public static void main(String[] args){
    
    Scanner ui = new Scanner(System.in);
    

            //Prompts for values
            System.out.print("Enter investment amount: $");
            Double investment = ui.nextDouble();
            System.out.print("Enter annual interest rate in percentage: ");
            Double interest = ui.nextDouble();
            System.out.print("Enter number of years: ");
            Double years = ui.nextDouble();
    
            //Calculations
            Double yearExponent = (years*12);
            Double interestPercentage = (interest/100);
            Double monthlyInterest = ((interestPercentage/12));
            Double monthlyInterestTot = (monthlyInterest+1);
            Double secondHalf = Math.pow(monthlyInterestTot, yearExponent); //Second half of the equation. Math.pow is powers. Source: https://www.geeksforgeeks.org/math-pow-method-in-java-with-example/#
            Double value = (investment * secondHalf);
            Double roundedValue = Math.round(value * 100.0) / 100.0;
    
            //Final print out
            System.out.println("Future value is $"+roundedValue+"");
    ui.close();
    }   

}