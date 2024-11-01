import java.util.Scanner;

public class EnergyWater {
    
    public static void main(String[] args){

        Scanner ui = new Scanner(System.in);

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
        System.out.print("The energy needed is "+roundedEnergy+" joules.");

        ui.close();

    }
}