package conditional_statements_advanced;
import java.util.Scanner;

public class nevalid_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (((number >= 100) && (number <= 200)) | (number == 0)) {
            int price = 0;
        } else {
            System.out.println("invalid");
        }
    }
}
