import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args){

        Scanner ui = new Scanner(System.in);

        System.out.println("Enter miles here: ");
        Double miles = ui.nextDouble();
        Double kilometers = (miles * 1.6);

        System.out.println("Kilometers: "+kilometers+"");

        ui.close();     //best practice
    }
}
