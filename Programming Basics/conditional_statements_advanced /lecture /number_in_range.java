package conditional_statements_advanced;
import java.util.Scanner;

public class number_in_space {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if ((number > 0) && (number <= 100)) {
            System.out.println("Yes");
        } else if ((number < 0) && (number >= -100)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
