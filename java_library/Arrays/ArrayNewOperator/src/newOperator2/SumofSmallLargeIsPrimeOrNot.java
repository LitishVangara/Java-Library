package newOperator2;
import java.util.Scanner;

public class SumofSmallLargeIsPrimeOrNot {
	public static void main(String[] args) {
		Scanner scan  = new Scanner (System.in);
		System.out.println("Enter the Size : ");
		int size=scan.nextInt();
		System.out.println("-----------------------------------------------------");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the value for Indexes : "+i);
			a[i] = scan.nextInt();
		}
		System.out.println("-----------------------------------------------------");
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
			int sum = 0;
			sum = large + small;
			System.out.println("Sum of smallest and Largest Digit is : "+sum);
			int count =0;
			for (int b=1;b<=sum;b++)
			{
				if (sum%b==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(sum+" is a Prime Number.");
				System.out.println("-----------------------------------------------------");
			}
			else
		    {
				System.out.println(sum+" is not a Prime Number.");
				System.out.println("-----------------------------------------------------");
		    }
		}
	}
}
