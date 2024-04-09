package conditionala_statements_advanced_exercise;
import java.util.Scanner;

public class operations_between_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num1, operator, num2, (int) result );
                    break;
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, operator, num2, (int) result);
                    break;
                }
            case "-":
                result = num1 - num2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num1, operator, num2, (int) result );
                    break;
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, operator, num2, (int) result);
                    break;
                }
            case "*":
                result = num1 * num2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %f - even", num1, operator, num2,(int) result );
                    break;
                } else {
                    System.out.printf("%d %s %d = %f - odd", num1, operator, num2, (int) result);
                    break;
                }
            case "/":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                    break;
                } else {
                    result = (double) num1 / num2;
                    String formatted_result = String.format("%.2f", result);
                    System.out.printf("%d / %d = %s", num1, num2, formatted_result );
                    break;
                }
            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                    break;
                } else {
                    result = num1 % num2;
                    System.out.printf("%d % %d = %d", num1, num2, result );
                    break;
                }
        }
    }
}
