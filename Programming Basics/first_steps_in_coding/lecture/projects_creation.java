package First_steps_in_coding_lecture;
import java.util.Scanner;

public class projects_creation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int needed_time = projects * 3;

        String message = ("The architect " + name + " will need " + needed_time + " hours to complete " + projects + " project/s.");
        System.out.println(message);
    }
}
