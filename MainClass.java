package Week4;
import mypackage.*;
class MainClass
{
    public static void main(String[] args) {
        Addition a=new Addition();
        int sum=a.add(6, 7);
        System.out.println("Sum: "+sum);
    }
}