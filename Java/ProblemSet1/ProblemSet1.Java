import java.util.Scanner;

public class ProblemSet1 {

    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);

        //PROBLEM 1
        System.out.println("PROBLEM 1");

        //Prompt for miles
        System.out.println("Enter miles here: ");
        Double miles = ui.nextDouble();

        //Calculations
        Double kilometers = (miles * 16 / 10);

        //Print out
        System.out.println("Kilometers: "+kilometers+"\n");

        //PROBLEM 2
        System.out.println("PROBLEM 2");

        //Prompts for values
        System.out.print("Enter the amount of water in kilograms: ");
        Double waterMass = ui.nextDouble();
        System.out.print("Enter the initial temperature: ");
        Double initialTemp = ui.nextDouble();
        System.out.print("Enter the final temperature: ");
        Double finalTemp = ui.nextDouble();
    
        //Average temperature calculations, as well as energy
        Double averageTemp = (finalTemp - initialTemp);
        Double energy = (waterMass * averageTemp * 4184);
    
        Double roundedEnergy = Math.round(energy * 100.0) / 100.0; //Math.round rounds. The number multiplied and divided by equals the decimals. Source: https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
    
        //Final print out
        System.out.println("The energy needed is "+roundedEnergy+" joules.\n");    

        //PROBLEM 3
        System.out.println("PROBLEM 3");

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