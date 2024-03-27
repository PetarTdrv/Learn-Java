package First_steps_in_coding_exercise;
import java.util.Scanner;

public class required_reading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number_of_pages = Integer.parseInt(scanner.nextLine());
        int pages_per_hour = Integer.parseInt(scanner.nextLine());
        int days_to_read = Integer.parseInt(scanner.nextLine());

        int total_time_for_book = number_of_pages / pages_per_hour;
        int needed_hours_per_day = total_time_for_book / days_to_read;

        System.out.println(needed_hours_per_day);
    }
}
