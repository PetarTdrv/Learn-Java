package if_else_statements_exercise;
import java.util.Scanner;

public class world_swimming_record {
    public static void main(String[] args) {
        Scanner Scan_Swimming = new Scanner(System.in);

        double Swimming_Record = Double.parseDouble(Scan_Swimming.nextLine());
        double Swimming_Distance = Double.parseDouble(Scan_Swimming.nextLine());
        double Swimming_Time = Double.parseDouble(Scan_Swimming.nextLine());

        double SmoothDive = Swimming_Distance * Swimming_Time;
        double Resistance = (Math.floor(Swimming_Distance / 15)) * 12.5;
        double Swimming_Total_Time = SmoothDive + Resistance ;
        double Swimming_Time_Quit = Swimming_Total_Time - Swimming_Record;
        
        if (Swimming_Total_Time < Swimming_Record) {
            System.out.printf(" Yes, he succeeded! The new world record is %.2f seconds.", Swimming_Total_Time);
        } else if (Swimming_Total_Time == Swimming_Record) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Swimming_Time_Quit);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Swimming_Time_Quit);
        }

    }
}
