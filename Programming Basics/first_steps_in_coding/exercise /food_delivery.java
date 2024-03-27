package First_steps_in_coding_exercise;
import java.util.Scanner;

public class food_delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float chicken_menus = Float.parseFloat(scanner.nextLine());
        float fish_menus = Float.parseFloat(scanner.nextLine());
        float vegan_menus = Float.parseFloat(scanner.nextLine());

        double total_price_without_desert = (chicken_menus * 10.35) + (fish_menus * 12.40) + (vegan_menus * 8.15);
        double desert_price = total_price_without_desert * 0.20;
        double total_price = total_price_without_desert + desert_price + 2.50;

        System.out.println(total_price);
    }
}
