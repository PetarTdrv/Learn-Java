package if_else_statements_exercise;
import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Float.parseFloat(scanner.nextLine());
        int number_of_videocards = Integer.parseInt(scanner.nextLine());
        int number_of_processors = Integer.parseInt(scanner.nextLine());
        int number_of_ram = Integer.parseInt(scanner.nextLine());

//        15% отстъпка от крайната

        double price_of_videocards = number_of_videocards * 250;
        double price_of_processors = number_of_processors * (price_of_videocards * 0.35);
        double price_of_ram = number_of_ram * (price_of_videocards * 0.10);

        double total_price = price_of_videocards + price_of_processors + price_of_ram;
        if (number_of_videocards > number_of_processors) {
            total_price = total_price * 0.85;
        }

        if (total_price <= budget) {
            double difference = Math.abs(budget - total_price);
            System.out.print("You have ");
            System.out.printf("%.2f", difference);
            System.out.print(" leva left!");
        } else {
            double difference = Math.abs(total_price - budget);
            System.out.print("Not enough money! You need ");
            System.out.printf("%.2f", difference);
            System.out.print(" leva more!");
        }
    }
}
