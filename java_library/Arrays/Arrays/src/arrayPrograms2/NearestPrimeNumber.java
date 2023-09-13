package arrayPrograms2;
import java.util.Scanner;

public class NearestPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Size : ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the value for Indexes : "+i);
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < arr.length; i++) 
		{
			int small = 0;
			int large = 0;
			int n = arr[i];
			for (int j = 1; ; j++) 
			{
				int count = 0;
				for (int k = 1; k <= j; k++) 
				{
					if (j%k==0) 
					{
						count++;
					}
				}
				if (count==2) 
				{
					if (j<n) 
					{
						small = j;
					}
					else if (j>n)
					{
						large = j;
						break;
					}
				}
			}
			System.out.println("For "+n+" Smallest Prime Number is : "+small);
			System.out.println("For "+n+" Largest Prime Number is : "+large);
			System.out.println("****************************************************");
		}
	}
}
