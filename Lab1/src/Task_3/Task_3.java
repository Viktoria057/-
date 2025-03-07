package Task_3;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number(byte): ");
        byte num = scanner.nextByte();
        double doubleNum = num;
        double result = doubleNum * 2.5;
        int finalResult = (int) result;
        System.out.println("answer: " + num);
        scanner.close();
    }
}