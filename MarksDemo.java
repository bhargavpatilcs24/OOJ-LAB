import java.util.*;
import CIE.*;
import SEE.*;

public class MarksDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Internals internal[] = new Internals[n];
        External external[] = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            int im[] = new int[5];
            System.out.println("Enter 5 internal marks (out of 50):");
            for (int j = 0; j < 5; j++)
                im[j] = sc.nextInt();

            int sm[] = new int[5];
            System.out.println("Enter 5 SEE marks (out of 100):");
            for (int j = 0; j < 5; j++)
                sm[j] = sc.nextInt();

            internal[i] = new Internals(im);
            external[i] = new External(usn, name, sem, sm);
        }

        System.out.println("\n----- FINAL MARKS OF STUDENTS -----");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("USN: " + external[i].usn);
            System.out.println("Name: " + external[i].name);
            System.out.println("Semester: " + external[i].sem);

            System.out.println("Final Marks in 5 Courses:");
            for (int j = 0; j < 5; j++) {
                int finalMark = internal[i].internalMarks[j] + external[i].seeMarks[j] / 2;
                System.out.println("Course " + (j + 1) + ": " + finalMark);
            }
        }
        sc.close();
    }
}

