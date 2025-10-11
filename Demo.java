import java.util.*;
class Student {
    String usn,name;
    int credits[],num;
    float marks[];
    int total_credits=0;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter usn:");
        usn=sc.next();
        System.out.print("Enter name:");
        name=sc.next();
        System.out.print("Enter the number of subjects:");
        num = sc.nextInt();
        credits = new int[num];
        marks = new float[num];
        for(int i=0;i<num;i++)
        {
            System.out.print("Enter the credits of subject "+(i+1)+":");
            credits[i]=sc.nextInt();
            total_credits+=credits[i];
        }
        for(int i=0;i<num;i++)
        {
            System.out.print("Enter the marks of subject "+(i+1)+":");
            marks[i]=sc.nextFloat();
        }
        sc.close();
    }
    float calculate()
    {
        float grade_points=0;
        for(int i=0;i<num;i++)
        {
            if(marks[i]>89 && marks[i]<=100)
                grade_points+=credits[i]*10;
            else if(marks[i]>79 && marks[i]<=89)
                grade_points+=credits[i]*9;
            else if(marks[i]>69 && marks[i]<=79)
                grade_points+=credits[i]*8;
            else if(marks[i]>59 && marks[i]<=69)
                grade_points+=credits[i]*7;
            else if(marks[i]>49 && marks[i]<=59)
                grade_points+=credits[i]*6;
            else if(marks[i]>=40 && marks[i]<=49)
                grade_points+=credits[i]*5;
            else
                grade_points+=0;
       }
       return grade_points/total_credits;
    }
    void display()
    {
        System.out.println("\n\nStudent Details\n\n");
        System.out.println("Name:"+name);
        System.out.println("USN:"+usn);
        System.out.println("Credits\t\tMarks:");
        for(int i=0;i<num;i++)
        {
            System.out.println(credits[i]+"\t\t"+marks[i]);
        }
        System.out.printf("SGPA: %.2f\n",calculate());
    }
    
}
public class Demo
{
    public static void main(String[] args) {
        Student s=new Student();
        s.accept();
        s.display();
    }
}
