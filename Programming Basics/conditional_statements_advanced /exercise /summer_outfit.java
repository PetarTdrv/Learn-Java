package conditionala_statements_advanced_exercise;

import java.util.Scanner;

public class summer_outfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"It's {градуси} degrees, get your {облекло} and {обувки}."

        int degrees = Integer.parseInt(scanner.nextLine());
        String part_of_day = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        switch (part_of_day) {
            case "Morning":
                if ((degrees >= 10) && (degrees <= 18)) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    System.out.print("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
                    break;
                } else if ((degrees > 18) && (degrees <= 24)) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.print("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
                    break;
                } else if (degrees >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    System.out.print("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
                    break;
                }
            case "Afternoon":
                if ((degrees >= 10) && (degrees <= 18)) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.print("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
                    break;
                } else if ((degrees > 18) && (degrees <= 24)) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    System.out.print("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
                    break;
                } else if (degrees >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    System.out.print("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
                    break;
                }
            case "Evening":
                if ((degrees >= 10) && (degrees <= 18)) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.print("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
                    break;
                } else if ((degrees > 18) && (degrees <= 24)) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.print("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
                    break;
                } else if (degrees >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.print("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
                    break;
                }
        }
    }
}
