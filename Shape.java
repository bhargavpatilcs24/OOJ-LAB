package Week4;

abstract class Shape {
    int a,b;
    abstract void printArea();
}
class Rectangle extends Shape
{
    Rectangle(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void printArea()
    {
        System.out.println("Area of Rectangle: "+(a*b));
    }
}
class Triangle extends Shape
{
    Triangle(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void printArea()
    {
        System.out.println("Area of Triangle: "+(0.5*a*b));
    }
}
class Circle extends Shape
{
    Circle(int a)
    {
        this.a=a;
    }
    void printArea()
    {
        System.out.println("Area of Circle: "+(3.14*a*a));
    }
}
class Area
{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(5, 4);
        r.printArea();
        Triangle t=new Triangle(5, 4);
        t.printArea();
        Circle c=new Circle(5);
        c.printArea();
    }
}