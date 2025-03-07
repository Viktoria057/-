package Task_1;
import java.util.Scanner ;
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();
        System.out.println("age: " + age);
        scanner.close();
    }
}