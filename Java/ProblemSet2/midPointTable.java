import java.util.Scanner;

public class midPointTable {
    public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
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
    System.out.println("\n     a\t\t     b\t\tMiddle Point\n");
    System.out.printf("(%s,  %s)\t(%s,  %s)\t (%s, %s)\n",firstRowX1, firstRowY1, firstRowX2, firstRowY2, firstRowXAvg, firstRowYAvg);
    System.out.printf("(%s,  %s)\t(%s,  %s)\t (%s, %s)\n",secondRowX1, secondRowY1, secondRowX2, secondRowY2, secondRowXAvg, secondRowYAvg);
    System.out.printf("(%s,  %s)\t(%s,  %s)\t (%s, %s)\n",thirdRowX1, thirdRowY1, thirdRowX2, thirdRowY2, thirdRowXAvg, thirdRowYAvg);
    System.out.printf("(%s,  %s)\t(%s, %s)\t (%s, %s)\n",fourthRowX1, fourthRowY1, fourthRowX2, fourthRowY2, fourthRowXAvg, fourthRowYAvg);
    System.out.printf("(%s, %s)\t(%s, %s)\t (%s, %s)\n",fifthRowX1, fifthRowY1, fifthRowX2, fifthRowY2, fifthRowXAvg, fifthRowYAvg);



    ui.close();
    }
}
