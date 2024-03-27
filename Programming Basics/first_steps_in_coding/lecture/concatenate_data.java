package First_steps_in_coding_lecture;
import java.util.Scanner;

public class concatenate_data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first_name = scanner.nextLine();
        String last_name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        String message = ("You are " + first_name + " " + last_name + ", a " + age + "-years old person from " + town + ".");

        System.out.println(message);

    }
}
