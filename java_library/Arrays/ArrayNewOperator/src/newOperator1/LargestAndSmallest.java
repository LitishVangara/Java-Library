package newOperator1;
import java.util.Scanner;

public class LargestAndSmallest 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int size=scan.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the value for Indexes : "+i);
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < a.length; i++) 
		{
			int n = a[i];
			int large = 0;
			int small = 9;
			while (n!=0)
			{
				int digit = n%10;
				if (large<digit)
				{
					large = digit;
				}
				if (small>digit)
				{
					small = digit;
				}
				n/=10;
			}
			System.out.println("The largest Digit in "+a[i]+" is : "+large);
			System.out.println("The smallest Digit in "+a[i]+" is : "+small);
			System.out.println("-----------------------------------------------------");
		}
	}
}
