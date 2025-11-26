package Week7;
import java.util.Scanner;

public class BankHandling extends Exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the balance amount: ");
        double balance = sc.nextDouble();

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                System.out.println("Error: Insufficient funds.");
            }else {
                balance -= amount;
                System.out.println("Withdrawal successful! Remaining balance: " + balance);
            }

        } catch (Exception e) {
            System.out.println("Error: Please enter a numeric amount.");
        }
    }
}
