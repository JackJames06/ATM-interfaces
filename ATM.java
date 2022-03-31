
package Java_Project;
import java.util.Scanner;
public class ATM
{
	int Avl_Bal=76500;
	Scanner jk=new Scanner(System.in);
	public void Input()
	{
	int Atm_pin;
	long  Aco_no,Mob_no;
	System.out.println("Enter Your 4 Digit Pin :");
	Atm_pin=jk.nextInt();
	System.out.println("Enter Your Account Number :");
	Aco_no=jk.nextLong();
	System.out.println("Enter Mobile Number :");
	Mob_no=jk.nextLong();
    }
	public void Cash_Withdraw()
	{
		System.out.println("Enter Withdraw Amount : ");
		int Withdraw=jk.nextInt();
		
		if(Avl_Bal>=Withdraw)
		{
			System.out.println("Your Amount Withdraw Successfully ");
			int Bal=Avl_Bal-Withdraw;
			System.out.println("Available Balance is : " +Bal);	
		}
		if (Avl_Bal<Withdraw) 
		{
			
			System.out.println("Sorry Your Account Has Been Only " +Avl_Bal+ " So Insufficent Balance");
		}
	}
	public void Fast_Cash()
	{
		System.out.println(" Welcome to Fast Cash ");
		System.out.println(" 1.Withdrawal Amount 100    :  ");
		System.out.println(" 2.Withdrawal Amount 200    : ");
		System.out.println(" 3.Withdrawal Amount 500    : ");
		System.out.println(" 4.Withdrawal Amount 2000  : ");
		System.out.println(" 5.Withdrawal Amount 5000  : ");
		int fcash=jk.nextInt();
		 int j;
       switch(fcash)
       {
       case 1:
       {
    	System.out.println(" Amount 100 Withdraw Successfully  ");
    	j=Avl_Bal-100;
    	System.out.println("Available Balance is  : "+j);
    	break;
       }
       case 2:
       {
    	   System.out.println(" Amount 200 Withdraw Successfully  ");
    	   j=Avl_Bal-200;
       	System.out.println("Available Balance is  : "+j);
       break;
       }
       case 3:
       {
    	   System.out.println(" Amount 500 Withdraw Successfully  ");
    	   j=Avl_Bal-500;
       	System.out.println("Available Balance is  : "+j);
       break;
       }
       case 4:
       {
    	   System.out.println(" Amount  2000  Withdraw Successfully  ");
    	   j=Avl_Bal-2000;
       	System.out.println("Available Balance is  : "+j);
       break;
       }
       case 5:
       {
    	   System.out.println(" Amount 5000  Withdraw Successfully  ");
    	   j=Avl_Bal-5000;
       	System.out.println("Available Balance is  : "+j);
       break;
       }
       default :
       {
    	   System.out.println("Sorry Invaild Input ");
       }
       }
	}
	public void Balance_Enquiry()
	{
		System.out.println("Your Account Balance is : " +Avl_Bal);
	}
	public void Cash_Deposit()
	{
		int Dep;
		System.out.println("Enter Deposit Amount : ");
		Dep=jk.nextInt();
		int Deposit=Avl_Bal+Dep;
		System.out.println(" Your Cash Deposited Successfully");
		System.out.println("Your Account BAlance is : "+Deposit);
   	}
	public void Change_pin()
	{
		int New_pin,Atm_pin;
		System.out.println("Enter Your Old Pin Number :");
		Atm_pin=jk.nextInt();
		System.out.println("Enter Your New 4 Digit Pin :  ");
	    New_pin=jk.nextInt();
		if(Atm_pin==Atm_pin)
		{
		System.out.println("Successfully Your Pin  Was Changed : "+New_pin);
		}
		else if(New_pin != Atm_pin)
		{
			System.out.println("Sorry Pin Was Not Changed For Security Reasons ");
		}
	}
	public void Cardless_Cash()
	{ 
		int aco,mob,amo,avl;
		System.out.println("  Welcome To Cardless Cash ");
		System.out.println(" Enter Account Number :");
		aco=jk.nextInt();
		System.out.println(" Enter Mobbile Number  :");
		mob=jk.nextInt();
		System.out.println(" Enter Withdraw Amount :");
		amo=jk.nextInt();
		
		if(amo<=Avl_Bal)
		{
			System.out.println(" Amount Withdraw Successfully ");
			avl=Avl_Bal-amo;
			System.out.println(" Available Balance is :" +avl);
		}
		else if(amo>Avl_Bal)
		{
			System.out.println(" Insufficent Balance");
		}
	}
	public static void main(String args[])
	{
		System.out.println("                                         -------  WELCOME TO STATE BANK OF INDIA  -------                  "); 
		System.out.println("                         (All The Way, A Bank of The Comman Man, The Banker to Every Indian)" );
		System.out.println("                                                                                                                                                                                   ");
		
		Scanner kj=new Scanner(System.in);
		ATM obj=new ATM();
		obj.Input();
		System.out.println("1.Cash Withdrawal ");
		System.out.println("2.Fast Cash ");
		System.out.println("3. Balance Enquiry ");
		System.out.println("4.Cash Deposit ");
		System.out.println("5.Change Pin ");
		System.out.println("6.Cardless Cash  ");
		System.out.println("7.Exit ");
		int ch=kj.nextInt();
		switch(ch)
		{
		case 1:
		{
			obj.Cash_Withdraw();
			System.out.println(" Thanks For Using Have a Great Day ");
			break;
		}
		case 2:
		{
			obj.Fast_Cash();
			System.out.println(" Thanks For Using Have a Great Day ");
			break;
		}
		case 3:
		{
			obj.Balance_Enquiry();
			System.out.println(" Thanks For Using Have a Great Day ");
		    break;
		}
		case 4:
		{
			obj.Cash_Deposit();
			System.out.println(" Thanks For Using Have a Great Day ");
			break;
		}
		case 5:
		{
			obj.Change_pin();
			System.out.println(" Thanks For Using Have a Great Day ");
			break;
		}
		case 6:
		{
			obj.Cardless_Cash();
			System.out.println(" Thanks For Using Have a Great Day ");
			break;
		}
		default:
		{
			System.out.println(" Thanks For Using Have a Great Day ");
		}
		}		
	}
}
