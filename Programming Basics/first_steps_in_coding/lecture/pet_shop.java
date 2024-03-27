package First_steps_in_coding_lecture;
import java.util.Scanner;

public class pet_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double dog_food = 2.50;
        int cat_food = 4;

        double dog_food_quantity = Double.parseDouble(scanner.nextLine());
        int cat_food_quantity = Integer.parseInt(scanner.nextLine());

        double total_dog_food_price = dog_food_quantity * dog_food;
        int total_cat_food_price = cat_food_quantity * cat_food;

        double total_price = total_cat_food_price + total_dog_food_price;

        System.out.println(total_price + " lv.");
    }
}
