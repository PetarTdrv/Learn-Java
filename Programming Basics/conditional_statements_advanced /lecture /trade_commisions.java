package conditional_statements_advanced;
import java.util.Scanner;

public class trade_comissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city_name = scanner.nextLine();
        double sales_volume = Double.parseDouble(scanner.nextLine());

        double comissions = 0;

        // format the resul 2 digits after float point
        switch (city_name) {
            case "Sofia":
                if ((sales_volume >= 0) && (sales_volume <= 500)) {
                    comissions = sales_volume * (0.05);
                    String formatted_comissions = String.format("%.2f", comissions);
                    System.out.println(formatted_comissions);
                    break;
                } else if ((sales_volume > 500) && (sales_volume <= 1000)) {
                    comissions = sales_volume * (0.07);
                    String formatted_comissions = String.format("%.2f", comissions);
                    System.out.println(formatted_comissions);
                    break;
                } else if ((sales_volume > 1000) && (sales_volume <= 10000)) {
                    comissions = sales_volume * (0.08);
                    String formatted_comissions = String.format("%.2f", comissions);
                    System.out.println(formatted_comissions);
                    break;
                } else if ((sales_volume > 10000)) {
                    comissions = sales_volume * (0.12);
                    String formatted_comissions = String.format("%.2f", comissions);
                    System.out.println(formatted_comissions);
                    break;
                } else {
                    System.out.println("error");
                    break;
                }
            case "Varna":
                if ((sales_volume >= 0) && (sales_volume <= 500)) {
                    comissions = sales_volume * (0.045);
                    String formatted_comissions = String.format("%.2f", comissions);
                    System.out.println(formatted_comissions);
                    break;
                } else if ((sales_volume > 500) && (sales_volume <= 1000)) {
                    comissions = sales_volume * (0.075);
                    String formatted_comissions = String.format("%.2f", comissions);
                    System.out.println(formatted_comissions);
                    break;
                } else if ((sales_volume > 1000) && (sales_volume <= 10000)) {
                    comissions = sales_volume * (0.1);
                    String formatted_comissions = String.format("%.2f", comissions);
                    System.out.println(formatted_comissions);
                    break;
                } else if ((sales_volume > 10000)) {
                    comissions = sales_volume * (0.13);
                    String formatted_comissions = String.format("%.2f", comissions);
                    System.out.println(formatted_comissions);
                    break;
                } else {
                    System.out.println("error");
                    break;
                }
            case "Plovdiv":
                if ((sales_volume >= 0) && (sales_volume <= 500)) {
                    comissions = sales_volume * (0.055);
                    String formatted_comissions = String.format("%.2f", comissions);
                    System.out.println(formatted_comissions);
                    break;
                } else if ((sales_volume > 500) && (sales_volume <= 1000)) {
                    comissions = sales_volume * (0.08);
                    String formatted_comissions = String.format("%.2f", comissions);
                    System.out.println(formatted_comissions);
                    break;
                } else if ((sales_volume > 1000) && (sales_volume <= 10000)) {
                    comissions = sales_volume * (0.12);
                    String formatted_comissions = String.format("%.2f", comissions);
                    System.out.println(formatted_comissions);
                    break;
                } else if ((sales_volume > 10000)) {
                    comissions = sales_volume * (0.145);
                    String formatted_comissions = String.format("%.2f", comissions);
                    System.out.println(formatted_comissions);
                    break;
                } else {
                    System.out.println("error");
                    break;
                }
            default:
                System.out.println("error");
                break;
        }
    }
}
