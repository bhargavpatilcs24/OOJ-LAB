package Week6;
import java.util.*;
class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}
class Father {
    int fatherAge;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative!");
        }
        this.fatherAge = age;
    }
}
class Son extends Father {
    int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);

        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age must be less than father's age!");
        }

        this.sonAge = sonAge;
    }
}
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Enter the age of father and son: ");
            int fatherAge=sc.nextInt();
            int sonAge=sc.nextInt();
            Son s = new Son(fatherAge,sonAge);
            System.out.println("Object created successfully!");

        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            System.out.print("Enter the age of father and son: ");
            int fatherAge1=sc.nextInt();
            int sonAge1=sc.nextInt();
            Son s2 = new Son(fatherAge1,sonAge1);
        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            System.out.print("Enter the age of father and son: ");
            int fatherAge2=sc.nextInt();
            int sonAge2=sc.nextInt();
            Son s3 = new Son(fatherAge2,sonAge2);
        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
