import java.util.Scanner;

interface Division {
    double divide(String a, String b);
}

class DivisionImpl implements Division {
    public double divide(String a, String b) {
        try {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
        
            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        } catch (NumberFormatException e) {
            System.out.println("Enter valid numbers.");
            return 0;
        }
    }
}

public class DivisionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DivisionImpl divisionImpl = new DivisionImpl();
        
        String a = null, b = null;
        System.out.print("Enter numerator: ");
        a = scanner.next();
        
        System.out.print("Enter denominator: ");
        b = scanner.next();
        
        double result = divisionImpl.divide(a, b);
        
        if (result != 0) { 
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
