package if_else_statements_exercise;

import java.util.Scanner;

public class bonus_points {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus_points = 0;

        if (number <= 100) {
            bonus_points = 5;
        } else if (1000 < number) {
            bonus_points = (number * 0.1);
        } else {
            bonus_points = (number * 0.2);
        }


        String string_number = Integer.toString(number);

        if (number % 2 == 0) {
            bonus_points += 1;
        } else if (string_number.endsWith("5")) {
            bonus_points += 2;
        }

        System.out.println(bonus_points);
        System.out.println(bonus_points + number);
    }
}
