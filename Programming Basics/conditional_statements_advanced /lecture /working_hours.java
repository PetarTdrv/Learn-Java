package conditional_statements_advanced;
import java.util.Scanner;

public class working_hours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if ((day.equals("Monday")) | (day.equals("Tuesday")) | (day.equals("Wednesday")) | (day.equals("Thursday"))
                | (day.equals("Friday")) | (day.equals("Saturday"))) {
            if ((hour >= 10) && (hour <= 18)) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else {
            System.out.println("closed");
        }
    }
}
