package First_steps_in_coding_exercise;
import java.util.Scanner;

public class basketball_equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annual_tax = Integer.parseInt(scanner.nextLine());

        double sneakers = annual_tax -(annual_tax * 0.40);
        double sport_kit = sneakers -(sneakers * 0.20);
        double basketball_ball = sport_kit / 4;
        double accesoaries = basketball_ball / 5;
        double total_price = sneakers + sport_kit + basketball_ball + accesoaries + annual_tax;

        System.out.println(total_price);
    }
}
