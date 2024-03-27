package First_steps_in_coding_exercise;
import java.util.Scanner;

public class usd_to_bgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double enough_usd = Double.parseDouble(scanner.nextLine());
        double one_usd_to_bgn = 1.79549;
        double total_bgn = enough_usd * one_usd_to_bgn;

        System.out.println(total_bgn);         
    }
}
