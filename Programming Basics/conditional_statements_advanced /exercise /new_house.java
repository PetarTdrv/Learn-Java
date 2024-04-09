package conditionala_statements_advanced_exercise;
import java.util.Scanner;

public class new_house {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"

        //Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left.
        //"Not enough money, you need {нужната сума} leva more."


        String type_of_flower = scanner.nextLine();
        int count_of_flowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double full_price = 0;

        if (type_of_flower.equals("Roses")) {
            if (count_of_flowers > 80) {
                full_price = (count_of_flowers * 5) * 0.9;
                if (full_price <= budget) {
                    double difference = budget - full_price;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Hey, you have a great garden with %d %s and %s leva left.",
                            count_of_flowers, type_of_flower, formatted_difference);
                } else if (full_price > budget) {
                    double difference = full_price - budget;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Not enough money, you need %s leva more.", formatted_difference);
                }
            } else {
                full_price = count_of_flowers * 5;
                if (full_price <= budget) {
                    double difference = budget - full_price;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Hey, you have a great garden with %d %s and %s leva left.",
                            count_of_flowers, type_of_flower, formatted_difference);
                } else if (full_price > budget) {
                    double difference = full_price - budget;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Not enough money, you need %s leva more.", formatted_difference);
                }
            }
        } else if (type_of_flower.equals("Dahlias")) {
            if (count_of_flowers > 90) {
                full_price = (count_of_flowers * 3.80) * 0.85;
                if (full_price <= budget) {
                    double difference = budget - full_price;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Hey, you have a great garden with %d %s and %s leva left.",
                            count_of_flowers, type_of_flower, formatted_difference);
                } else if (full_price > budget) {
                    double difference = full_price - budget;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Not enough money, you need %s leva more.", formatted_difference);
                }
            } else {
                full_price = count_of_flowers * 3.80;
                if (full_price <= budget) {
                    double difference = budget - full_price;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Hey, you have a great garden with %d %s and %s leva left.",
                            count_of_flowers, type_of_flower, formatted_difference);
                } else if (full_price > budget) {
                    double difference = full_price - budget;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Not enough money, you need %s leva more.", formatted_difference);
                }
            }
        } else if (type_of_flower.equals("Tulips")) {
            if (count_of_flowers > 80) {
                full_price = (count_of_flowers * 2.80) * 0.85;
                if (full_price <= budget) {
                    double difference = budget - full_price;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Hey, you have a great garden with %d %s and %s leva left.",
                            count_of_flowers, type_of_flower, formatted_difference);
                } else if (full_price > budget) {
                    double difference = full_price - budget;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Not enough money, you need %s leva more.", formatted_difference);
                }
            } else {
                full_price = count_of_flowers * 2.80;
                if (full_price <= budget) {
                    double difference = budget - full_price;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Hey, you have a great garden with %d %s and %s leva left.",
                            count_of_flowers, type_of_flower, formatted_difference);
                } else if (full_price > budget) {
                    double difference = full_price - budget;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Not enough money, you need %s leva more.", formatted_difference);
                }
            }
        } else if (type_of_flower.equals("Narcissus")) {
            if (count_of_flowers < 120) {
                full_price = (count_of_flowers * 3) * 1.15;
                if (full_price <= budget) {
                    double difference = budget - full_price;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Hey, you have a great garden with %d %s and %s leva left.",
                            count_of_flowers, type_of_flower, formatted_difference);
                } else if (full_price > budget) {
                    double difference = full_price - budget;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Not enough money, you need %s leva more.", formatted_difference);
                }
            } else {
                full_price = count_of_flowers * 3;
                if (full_price <= budget) {
                    double difference = budget - full_price;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Hey, you have a great garden with %d %s and %s leva left.",
                            count_of_flowers, type_of_flower, formatted_difference);
                } else if (full_price > budget) {
                    double difference = full_price - budget;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Not enough money, you need %s leva more.", formatted_difference);
                }
            }
        } else if (type_of_flower.equals("Gladiolus")) {
            if (count_of_flowers < 80) {
                full_price = (count_of_flowers * 2.50) * 1.20;
                if (full_price <= budget) {
                    double difference = budget - full_price;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Hey, you have a great garden with %d %s and %s leva left.",
                            count_of_flowers, type_of_flower, formatted_difference);
                } else if (full_price > budget) {
                    double difference = full_price - budget;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Not enough money, you need %s leva more.", formatted_difference);
                }
            } else {
                full_price = count_of_flowers * 2.50;
                if (full_price <= budget) {
                    double difference = budget - full_price;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Hey, you have a great garden with %d %s and %s leva left.",
                            count_of_flowers, type_of_flower, formatted_difference);
                } else if (full_price > budget) {
                    double difference = full_price - budget;
                    String formatted_difference = String.format("%.2f", difference);
                    System.out.printf("Not enough money, you need %s leva more.", formatted_difference);
                }
            }
        }
    }
}
