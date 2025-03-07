package Task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("answer: " + area);
        scanner.close();
    }
}

