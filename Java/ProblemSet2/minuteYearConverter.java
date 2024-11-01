import java.util.Scanner;
public class minuteYearConverter {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

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

    ui.close();
}
}

