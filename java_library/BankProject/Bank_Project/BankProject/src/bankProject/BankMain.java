package bankProject;
import java.util.Scanner;

public class BankMain 
{
	public static void main(String[] args) 
	{
		Bank b = new Bank();
		Scanner scan = new Scanner (System.in);
		while(true)
		{
			System.out.println("Enter 1 for Create Account : ");
			System.out.println("Enter 2 for Printing Details : ");
			System.out.println("Enter 3 for Search an Object : ");
			int input = scan.nextInt();
			switch(input)
			{
				case 1:b.create();
				break;
				case 2:b.print();
				break;
				case 3:break;
				default : System.err.println("Invalid Input....");
			}
			System.out.println("Enter 4 for continue or 5 for Exit : ");
			if (scan.nextInt()==4) 
			{
				continue;
			}
			else if (scan.nextInt()==5)
			{
				break;
			}
		}
	}
}