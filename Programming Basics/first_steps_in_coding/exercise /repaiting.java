package First_steps_in_coding_exercise;
import java.util.Scanner;

public class repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int needed_nylon = Integer.parseInt(scanner.nextLine());
        double needed_dye = Double.parseDouble(scanner.nextLine());
        int needed_thinner = Integer.parseInt(scanner.nextLine());
        int needed_hours = Integer.parseInt(scanner.nextLine());

        double nylon_price = 1.50;
        double dye_price = 14.50;
        double thinner_price = 5.00;
        double bags_price = 0.40;

        needed_dye += needed_dye * 0.10;
        needed_nylon += 2;

        
        double total_nylon_price = needed_nylon * nylon_price;
        double total_dye_price = needed_dye * dye_price;
        double total_thinner_price = needed_thinner * thinner_price;

        double total_price_for_products = total_nylon_price + total_dye_price + total_thinner_price + bags_price;
        double per_one_hour_for_masters = total_price_for_products * 0.30;
        double total_price_for_masters = needed_hours * per_one_hour_for_masters;

        total_price_for_products += total_price_for_masters;

        double total_price = total_price_for_products;

        System.out.println(total_price);
    }
}
