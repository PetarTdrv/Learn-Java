package First_steps_in_coding_exercise;
import java.util.Scanner;

public class school_suplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number_of_pens_packs = Integer.parseInt(scanner.nextLine());
        int number_of_marker_packs = Integer.parseInt(scanner.nextLine());
        int liters_for_cleaning_preparate = Integer.parseInt(scanner.nextLine());
        int percent_discount = Integer.parseInt(scanner.nextLine());

        double total_pens_price = number_of_pens_packs * 5.80;
        double total_markers_price = number_of_marker_packs * 7.20;
        double total_price_for_preparate = liters_for_cleaning_preparate * 1.20;

        double discount_percent = (percent_discount / 100.0);

        double total_sum_without_discount = total_pens_price + total_markers_price + total_price_for_preparate;
        double total_sum = total_sum_without_discount - (total_sum_without_discount * discount_percent);

        System.out.println(total_sum);
    }
}
