import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Вести довжину прямокутника: ");
        double length = scanner.nextDouble();

        System.out.print("Ведіть ширину прямокутника:");
        double width =scanner.nextDouble();
        double area = length * width ;
        System.out.println("Площа прямокутника:" +area );
        scanner.close();

    }
}