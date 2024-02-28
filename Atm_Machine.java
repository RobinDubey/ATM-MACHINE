import java.util.*;
class Atm 
{
double amount,balance=12000.50;
Scanner sc=new Scanner(System.in);
public void withdraw()
{
System.out.print("Enter the withdraw amount: ");
amount=sc.nextDouble();
if(amount>balance)
{
System.out.println("INSUFFICIENT BALANCE");
}
else
{
balance=balance-amount;
}
}
public void deposit()
{
System.out.print("Enter the deposit amount: ");
amount=sc.nextDouble();
balance=balance+amount;
}
public void checkBalance()
{
System.out.println("The Balance is "+balance);
}
}
class Main 
{    
    public static void main(String args[] )  
    {  
      Atm f=new Atm(); 
      Scanner s=new Scanner(System.in);
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");
            int choice=s.nextInt(); 
            switch(choice)
            {
            case 1:
            {
             f.withdraw();
             break;
            }
            case 2:
            {
             f.deposit();
             break;
            }
            case 3:
            {
             f.checkBalance();
             break;
            }
            case 4:
            {
             System.exit(0);
            }
          
            }  
        }  
    }  
}