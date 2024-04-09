package if_else_statements_exercise;
import java.util.Scanner;

public class kids_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double prize_of_excursion = Double.parseDouble(scanner.nextLine());

        int number_of_puzzles = Integer.parseInt(scanner.nextLine());
        int number_of_speaking_dolls = Integer.parseInt(scanner.nextLine());
        int number_of_bears = Integer.parseInt(scanner.nextLine());
        int number_of_minions = Integer.parseInt(scanner.nextLine());
        int number_of_camions = Integer.parseInt(scanner.nextLine());

        int total_toys_count = number_of_puzzles + number_of_speaking_dolls + number_of_bears +
                number_of_minions + number_of_camions;

        double full_price_for_puzzles = number_of_puzzles * 2.60;
        double full_price_for_speaking_dolls = number_of_speaking_dolls * 3;
        double full_price_for_bears = number_of_bears * 4.10;
        double full_price_for_minions = number_of_minions * 8.20;
        double full_price_for_camions = number_of_camions * 2;

        double total_price = full_price_for_puzzles + full_price_for_speaking_dolls + full_price_for_bears
        + full_price_for_minions + full_price_for_camions;

        if (total_toys_count >= 50) {
            total_price -= total_price * 0.25;
        }

        total_price -= total_price * 0.10;

        if (total_price >= prize_of_excursion){
            double money = total_price - prize_of_excursion;
            System.out.print("Yes! ");
            System.out.printf("%.2f", money);
            System.out.print(" lv left.");
        } else{
            double not_money = Math.abs(total_price - prize_of_excursion);
            System.out.print("Not enough money! ");
            System.out.printf("%.2f", not_money);
            System.out.print(" lv needed.");
        }
    }
}
