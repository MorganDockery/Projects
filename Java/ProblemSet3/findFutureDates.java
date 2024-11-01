import java.util.Scanner;
public class findFutureDates {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter the day of the week. 0 is Sunday, 1 is Monday, up to Saturday: ");
        int dayInput = ui.nextInt();

        String today="";
        String futureDay="";
        if(dayInput>6){
            System.out.print("6 is the highest you can go, i.e. Saturday. Please reput today's date: ");
            dayInput = ui.nextInt();
        }
        
        if(dayInput==0){
            today="Sunday";
        }
        else if(dayInput==1){
            today="Monday";
        }
        else if(dayInput==2){
            today="Tuesday";
        }
        else if(dayInput==3){
            today="Wednesday";
        }
        else if(dayInput==4){
            today="Thursday";
        }
        else if(dayInput==5){
            today="Friday";
        }
        else{
            today="Saturday";
        }

        System.out.print("How many days have passed since then? ");
        int daysPassed = ui.nextInt();

        int daysTotal = dayInput+daysPassed;
        int weeks = Math.round(daysTotal/7);
        

        int finalDaySetter = daysTotal-(weeks*7);

        if(finalDaySetter==0){
            futureDay="Sunday";
        }
        else if(finalDaySetter==1){
            futureDay="Monday";
        }
        else if(finalDaySetter==2){
            futureDay="Tuesday";
        }
        else if(finalDaySetter==3){
            futureDay="Wednesday";
        }
        else if(finalDaySetter==4){
            futureDay="Thursday";
        }
        else if(finalDaySetter==5){
            futureDay="Friday";
        }
        else{
            futureDay="Saturday";
        }



        System.out.printf("Today is %s, and the future day is %s. %s weeks will pass.",today,futureDay,weeks);
        
    
    
        ui.close();
        }    
}
