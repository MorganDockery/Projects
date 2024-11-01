import java.util.Scanner;
import java.lang.Math; 
public class ProblemSet2 {
    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in);

        //PROBLEM 1
        System.out.print("\nPROBLEM 1\n");
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

        System.out.printf("The area is %s\n\n",areaRounded);

        //PROBLEM 2
            //First Row
    Double firstRowX1 = Double.valueOf(0);
    Double firstRowY1 = Double.valueOf(0);

    Double firstRowX2 = Double.valueOf(2);
    Double firstRowY2 = Double.valueOf(1);

    Double firstRowXAvg = ((firstRowX1/2)+(firstRowX2/2));
    Double firstRowYAvg = ((firstRowY1/2)+(firstRowY2/2));

    //Second Row
    Double secondRowX1 = Double.valueOf(1);
    Double secondRowY1 = Double.valueOf(4);

    Double secondRowX2 = Double.valueOf(4);
    Double secondRowY2 = Double.valueOf(2);

    Double secondRowXAvg = ((secondRowX1/2)+(secondRowX2/2));
    Double secondRowYAvg = ((secondRowY1/2)+(secondRowY2/2));

    //Third Row
    Double thirdRowX1 = Double.valueOf(2);
    Double thirdRowY1 = Double.valueOf(7);

    Double thirdRowX2 = Double.valueOf(6);
    Double thirdRowY2 = Double.valueOf(3);

    Double thirdRowXAvg = ((thirdRowX1/2)+(thirdRowX2/2));
    Double thirdRowYAvg = ((thirdRowY1/2)+(thirdRowY2/2));

    //Fourth Row
    Double fourthRowX1 = Double.valueOf(3);
    Double fourthRowY1 = Double.valueOf(9);

    Double fourthRowX2 = Double.valueOf(10);
    Double fourthRowY2 = Double.valueOf(5);

    Double fourthRowXAvg = ((fourthRowX1/2)+(fourthRowX2/2));
    Double fourthRowYAvg = ((fourthRowY1/2)+(fourthRowY2/2));

    //Fifth Row
    Double fifthRowX1 = Double.valueOf(4);
    Double fifthRowY1 = Double.valueOf(11);

    Double fifthRowX2 = Double.valueOf(12);
    Double fifthRowY2 = Double.valueOf(7);
    
    Double fifthRowXAvg = ((fifthRowX1/2)+(fifthRowX2/2));
    Double fifthRowYAvg = ((fifthRowY1/2)+(fifthRowY2/2));

    //Table
    System.out.print("PROBLEM 2");
    System.out.println("\n     a\t\t     b\t\tMiddle Point\n");
    System.out.printf("(%s,  %s)\t(%s,  %s)\t (%s, %s)\n",firstRowX1, firstRowY1, firstRowX2, firstRowY2, firstRowXAvg, firstRowYAvg);
    System.out.printf("(%s,  %s)\t(%s,  %s)\t (%s, %s)\n",secondRowX1, secondRowY1, secondRowX2, secondRowY2, secondRowXAvg, secondRowYAvg);
    System.out.printf("(%s,  %s)\t(%s,  %s)\t (%s, %s)\n",thirdRowX1, thirdRowY1, thirdRowX2, thirdRowY2, thirdRowXAvg, thirdRowYAvg);
    System.out.printf("(%s,  %s)\t(%s, %s)\t (%s, %s)\n",fourthRowX1, fourthRowY1, fourthRowX2, fourthRowY2, fourthRowXAvg, fourthRowYAvg);
    System.out.printf("(%s, %s)\t(%s, %s)\t (%s, %s)\n",fifthRowX1, fifthRowY1, fifthRowX2, fifthRowY2, fifthRowXAvg, fifthRowYAvg);

    //PROBLEM 3
    System.out.println("\nPROBLEM 3");
    System.out.print("Enter the number of minutes: ");
    Double minutes = ui.nextDouble();
    Double daysBeta = Double.valueOf(minutes/1440);
    Double days = Math.floor(daysBeta * 1.0) / 1.0; //Source: https://www.w3schools.com/java/ref_math_floor.asp
    Double years = Double.valueOf(0);
    while (days>365){
        days-=365;
        years++;
}
        System.out.printf("\n%s minutes is approximately %s years and %s days.",minutes,years,days);

    //PROBLEM 4
    System.out.println("\n\nPROBLEM 4\n");
    System.out.println("Enter the length of the sides and the height of an equillateral triangle.");
        Double length = ui.nextDouble();
        Double areaProb4 = (((Math.sqrt(3))/4)*(length*length));
        Double areaRoundedProb4 = Math.round(areaProb4 * 100.0) / 100.0;
        Double volume = areaRoundedProb4*length;
        Double volumeRounded = Math.round(volume * 100.0) / 100.0;
        
        System.out.printf("Area: %s\nVolume: %s",areaRoundedProb4,volumeRounded);


        ui.close();
    }
}
