package Week3;
import java.util.*;
class Account {
    private int accountNumber;
    private float balance;
    void setDetails(int acc_no,float bal)
    {
        accountNumber=acc_no;
        balance=bal;
    }
    void getDetails()
    {
        System.out.println("Account No.= "+accountNumber);
        System.out.println("Balance= "+balance);
    }
}
public class Acc
{
    public static void main(String[] args) {
        Account a=new Account();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the account number: ");
        int acc_no=sc.nextInt();
        System.out.print("Enter the current balance: ");
        float bal=sc.nextFloat();
        a.setDetails(acc_no,bal);
        a.getDetails();
    }
}