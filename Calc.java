package Week3;
class ComplexNumber
{
    double real;
    double imaginary;
    public ComplexNumber(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    public String toString()
    {
        return real + " + " + imaginary + "i";
    }
}
class Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }
    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2)
    {
        double sumReal = c1.real + c2.real;
        double sumImaginary = c1.imaginary + c2.imaginary;
        return new ComplexNumber(sumReal, sumImaginary);
    }
}
public class Calc
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        int sumInt = calc.add(5, 7);
        System.out.println("Sum of integers: " + sumInt);
        ComplexNumber c1 = new ComplexNumber(3.5, 2.5);
        ComplexNumber c2 = new ComplexNumber(1.5, 4.5);
        ComplexNumber sumComplex = calc.add(c1, c2);
        System.out.println("Sum of complex numbers: " + sumComplex);
    }
}
