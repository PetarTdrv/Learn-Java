package First_steps_in_coding_exercise;
import java.util.Scanner;

public class deposit_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposited_sum = Double.parseDouble(scanner.nextLine());
        int deposit_term = Integer.parseInt(scanner.nextLine());
        double annual_interest_rate = Double.parseDouble(scanner.nextLine());

        double accrued_interest = deposited_sum * (annual_interest_rate / 100);
        double interest_per_month = accrued_interest / 12;

        double sum = deposited_sum + (deposit_term * interest_per_month);

        System.out.println(sum);
    }
}
