package First_steps_in_coding_lecture;

import java.util.Scanner;

public class rectangle_area{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int area = a * b;
        
        System.out.println(area);
    }
}
