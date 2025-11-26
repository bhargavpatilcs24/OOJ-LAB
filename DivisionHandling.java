package Week7;
import java.util.Scanner;

public class DivisionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the value of num1: ");
            int a = sc.nextInt();

            System.out.print("Enter the value of num2: ");
            int b = sc.nextInt();

            double c=a/b;
            System.out.println("Result: " + c);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers.");
        }
    }
}
