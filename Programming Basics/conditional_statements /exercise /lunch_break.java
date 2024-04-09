package if_else_statements_exercise;
import java.util.Scanner;

public class lunch_break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name_of_serial = scanner.nextLine();
        int time_of_episode = Integer.parseInt(scanner.nextLine());
        int time_of_break = Integer.parseInt(scanner.nextLine());

        float time_for_lunch = (float) time_of_break / 8;
        float time_for_chill = (float) time_of_break / 4;
        float time_left = time_of_break - time_for_lunch - time_for_chill;

        if (time_left >= time_of_episode) {
            double difference = time_left - time_of_episode;
            System.out.print("You have enough time to watch " + name_of_serial + " and left with ");
            System.out.print((int)Math.ceil(difference));
            System.out.print(" minutes free time.");
        } else {
            System.out.print("You don't have enough time to watch " + name_of_serial + ", you need ");
            double difference = Math.abs(time_left - time_of_episode);
            System.out.print((int)Math.ceil(difference));
            System.out.print(" more minutes.");
        }
    }
}
