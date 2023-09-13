package newOperator2;
import java.util.Scanner;

public class RepeatedDigit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int size = scan.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter the value for Indexes : "+i);
			a[i] = scan.nextInt();
		}
		System.out.println("---------------------------------------------");
		System.out.println("Repeated Digits Elements are : ");
		for (int i = 0; i < a.length; i++) 
		{
			int n = a[i];
			while (n!=0)
			{
				int outerDigit = n%10;
				int temp = a[i];
				int count = 0;
				while (temp!=0)
				{
					int innerDigit = temp%10;
					if (outerDigit==innerDigit)
					{
						count++;
					}
					temp/=10;
				}
				if (count>1)
				{
					System.out.println(a[i]);
					break;
				}
				n/=10;
			}
		}
	}
}
