package First_steps_in_coding_lecture;
import java.util.Scanner;

public class yard_greening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double per_square_meter = 7.61;
        double squares = Double.parseDouble(scanner.nextLine());

        double total_price = squares * per_square_meter;
        double discount = total_price * 0.18;
        double total_price_with_discount = total_price - discount;
        double difference = total_price - total_price_with_discount;

        System.out.println("The final price is: " + total_price_with_discount + " lv.");
        System.out.println("The discount is: " + difference + " lv.");
    }
}
