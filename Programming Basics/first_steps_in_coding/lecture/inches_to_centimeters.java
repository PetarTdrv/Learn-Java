package First_steps_in_coding_lecture;

import java.util.Scanner;

public class inches_to_centimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double centimeter = Double.parseDouble(scanner.nextLine());
        double inches = centimeter * 2.54;

        System.out.println(inches);

    }
}
