import java.util.*;
public class Calculator {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first operand:");
        float a=sc.nextFloat();
        System.out.print("Enter the second operand:");
        float b=sc.nextFloat();
        System.out.println("Sum:"+(a+b));
        System.out.println("Difference:"+(a-b));
        System.out.println("Product:"+(a*b));
        System.out.println("Division:"+(a/b));
    }
}
