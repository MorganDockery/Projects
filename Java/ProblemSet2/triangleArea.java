import java.util.Scanner;
import java.lang.Math; 
public class triangleArea {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        System.out.println("Enter the coordinates of three points, seperated by spaces.\nExample: X1 Y1 X2 Y2 X3 Y3");
        String coordinates = ui.nextLine();

        String[] locations = coordinates.split(" "); //Split splits the string by a variable. [] means list. Source: https://www.w3schools.com/java/ref_string_split.asp

        Double X1 = Double.parseDouble(locations[0]);    //[] refers to which number in the list
        Double Y1 = Double.parseDouble(locations[1]);
        Double X2 = Double.parseDouble(locations[2]);
        Double Y2 = Double.parseDouble(locations[3]);
        Double X3 = Double.parseDouble(locations[4]);
        Double Y3 = Double.parseDouble(locations[5]);

        Double side1 = Math.sqrt(((X2-X1)*(X2-X1))+((Y2-Y1)*(Y2-Y1)));
        Double side2 = Math.sqrt(((X3-X2)*(X3-X2))+((Y3-Y2)*(Y3-Y2)));
        Double side3 = Math.sqrt(((X1-X3)*(X1-X3))+((Y1-Y3)*(Y1-Y3)));
        Double s =(side1+side2+side3)/2;

        Double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        Double areaRounded = Math.round(area * 10.0) / 10.0;

        System.out.printf("The area is %s",areaRounded);

        ui.close();
    }
}
