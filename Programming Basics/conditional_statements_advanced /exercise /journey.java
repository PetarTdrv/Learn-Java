package conditionala_statements_advanced_exercise;

import java.util.Scanner;

public class travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String hotel_or_camp = "";
        double full_price = 0;




        // лято къмпинг , зима хотел , в европа - хотел

        switch (season) {
            case "summer":
                if (budget <= 100) {
                    full_price = budget * 0.30;
                    hotel_or_camp = "Camp";
                    System.out.println("Somewhere in Bulgaria");
                    String formatted_full_price = String.format("%.2f", full_price);
                    System.out.printf("%s - %s", hotel_or_camp, formatted_full_price);
                    break;
                } else if (budget <= 1000) {
                    full_price = budget * 0.40;
                    hotel_or_camp = "Camp";
                    System.out.println("Somewhere in Balkans");
                    String formatted_full_price = String.format("%.2f", full_price);
                    System.out.printf("%s - %s", hotel_or_camp, formatted_full_price);
                    break;
                } else if (budget > 1000) {
                    full_price = budget * 0.90;
                    hotel_or_camp = "Hotel";
                    System.out.println("Somewhere in Europe");
                    String formatted_full_price = String.format("%.2f", full_price);
                    System.out.printf("%s - %s", hotel_or_camp, formatted_full_price);
                    break;
                }

            case "winter":
                if (budget <= 100) {
                    full_price = budget * 0.70;
                    hotel_or_camp = "Hotel";
                    System.out.println("Somewhere in Bulgaria");
                    String formatted_full_price = String.format("%.2f", full_price);
                    System.out.printf("%s - %s", hotel_or_camp, formatted_full_price);
                    break;
                } else if (budget <= 1000) {
                    full_price = budget * 0.80;
                    hotel_or_camp = "Hotel";
                    System.out.println("Somewhere in Balkans");
                    String formatted_full_price = String.format("%.2f", full_price);
                    System.out.printf("%s - %s", hotel_or_camp, formatted_full_price);
                    break;
                } else if (budget > 1000) {
                    full_price = budget * 0.90;
                    hotel_or_camp = "Hotel";
                    System.out.println("Somewhere in Europe");
                    String formatted_full_price = String.format("%.2f", full_price);
                    System.out.printf("%s - %s", hotel_or_camp, formatted_full_price);
                    break;
                }
        }
    }
}
