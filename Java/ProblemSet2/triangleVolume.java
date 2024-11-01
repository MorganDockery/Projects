
import java.lang.Math; 
import java.util.Scanner;
public class triangleVolume {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        System.out.println("Enter the length of the sides and the height of an equillateral triangle.");
        Double length = ui.nextDouble();
        Double area = (((Math.sqrt(3))/4)*(length*length));
        Double areaRounded = Math.round(area * 100.0) / 100.0;
        Double volume = areaRounded*length;
        Double volumeRounded = Math.round(volume * 100.0) / 100.0;
        
        System.out.printf("Area: %s\nVolume: %s",areaRounded,volumeRounded);

        ui.close();
    }
}
