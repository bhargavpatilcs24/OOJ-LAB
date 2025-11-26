package Week7;
import java.util.Scanner;

public class IndexHandling {
    public static void main(String[] args) {
        String[] items = {"apple", "banana", "cherry", "date"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Items:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + ": " + items[i]);
        }

        try {
            System.out.print("Enter an index: ");
            int index = sc.nextInt();

            System.out.println("You selected: " + items[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range.");
        } 
        catch (Exception e) {
            System.out.println("Error: Please enter a valid integer.");
        }
    }
}
