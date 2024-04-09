package conditionala_statements_advanced_exercise;

import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type_of_projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double all_seats = rows * columns;
        double full_price = 0;

        String full_price_formatted = "";

        switch (type_of_projection) {
            case "Premiere":
                full_price = all_seats * 12.00;
                full_price_formatted = String.format("%.2f", full_price);
                System.out.println(full_price_formatted + " leva");
                break;
            case "Normal":
                full_price = all_seats * 7.50;
                full_price_formatted = String.format("%.2f", full_price);
                System.out.println(full_price_formatted + " leva");
                break;
            case "Discount":
                full_price = all_seats * 5;
                full_price_formatted = String.format("%.2f", full_price);
                System.out.println(full_price_formatted + " leva");
                break;
        }
    }
