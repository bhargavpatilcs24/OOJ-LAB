import java.util.*;
public class Quadratic {
    public int a,b,c;
    public double r1,r2,r,D;
    public void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 'a':");
        a=sc.nextInt();
        System.out.println("Enter the value of 'b':");
        b=sc.nextInt();
        System.out.println("Enter the value of 'c':");
        c=sc.nextInt();
        sc.close();
    }
    public void compute()
    {
        D=(Math.pow(b,2)-4*a*c);  
    }
    public void display()
    {
        if(a<=0)
        {
            System.out.println("No Solution.");
        }
        else
        {
            if(D<0)
            {
                System.out.println("Imaginary roots.");
            }
            else if(D==0)
            {
                System.out.println("The roots are real and equal.");
                r=-b/(2*a);
                System.out.println("The root r is:"+r);
            }
            else
            {
                System.out.println("The roots are real and distinct.");
                r1=(-b+Math.sqrt(D))/(2*a);
                r2=(-b-Math.sqrt(D))/(2*a);
                System.out.println("The root r1 is:"+r1);
                System.out.println("The root r2 is:"+r2);
            }
        }
    }
    public static void main(String args[])
    {
        Quadratic q=new Quadratic();
        q.read();
        q.compute();
        q.display();
    }
}
