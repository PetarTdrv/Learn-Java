package First_steps_in_coding_lecture;

import java.util.Scanner;

public class greeting_by_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String greet = ("Hello, " + name + "!");
        System.out.println(greet);
    }
}
