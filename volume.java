import java.util.*;
class volume
{
    public int length;
    public int breadth;
    public int height;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        length=sc.nextInt();
        System.out.println("Enter the breadth:");
        breadth=sc.nextInt();
        System.out.println("Enter the height:");
        height=sc.nextInt();
        sc.close();

    }
    void display()
    {
        System.out.println("Length:"+length);
        System.out.println("Breadth:"+breadth);
        System.out.println("Height:"+height);
    }
    int volume1()
    {
        return length*breadth*height;
    }
}
class demo
{
    public static void main(String args[])
    {
        volume v=new volume();
        v.read();
        v.display();
        int vol=v.volume1();
        System.out.println("Volume of the box is:"+vol);
    }
}