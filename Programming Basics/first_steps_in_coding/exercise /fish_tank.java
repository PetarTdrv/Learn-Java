package First_steps_in_coding_exercise;
import java.util.Scanner;

public class aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        float percent = Float.parseFloat(scanner.nextLine());

        float value = lenght * width * height;
        float value_in_liters = value / 1000;
        float getted_value = percent / 100;

        float needed_liters = value_in_liters * (1 - getted_value);

        System.out.println(needed_liters);
    }
}
