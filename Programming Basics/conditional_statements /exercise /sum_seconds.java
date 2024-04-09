package if_else_statements_exercise;

import java.util.Scanner;

public class sum_seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first_person = Integer.parseInt(scanner.nextLine());
        int second_person = Integer.parseInt(scanner.nextLine());
        int third_person = Integer.parseInt(scanner.nextLine());
        
        int total_time = first_person + second_person + third_person;

        int minutes = total_time / 60;
        int seconds = total_time % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
