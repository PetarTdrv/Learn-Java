package if_else_statements_lecture;
import java.util.Scanner;

public class area_of_figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        String formatted_area = "";

        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double area = a * a;
            formatted_area = String.format("%.3f", area);
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = a * b;
            formatted_area = String.format("%.3f", area);
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * (r * r);
            formatted_area = String.format("%.3f", area);
        } else if (figure.equals("triangle")) {
            double lenght = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double area = (lenght * height) / 2;
            formatted_area = String.format("%.3f", area);
        }

        System.out.println(formatted_area);
    }
}
