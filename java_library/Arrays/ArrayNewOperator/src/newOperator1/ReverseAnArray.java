package newOperator1;
import java.util.Scanner;

public class ReverseAnArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Size : ");
		int size = scan.nextInt();
		int arr[] = new int [size];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the values for Indexes : "+i);
			arr[i] = scan.nextInt();
		}
		int res[] = new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			int n = arr[i];
			int rev = 0;
			while (n!=0)
			{
				rev = rev * 10 + (n % 10);
				n = n/10;
			}
			res[i] = rev;
		}
		System.out.println("Before Reversing : ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("After Reversing : ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(res[i]+" ");
		}
	}
}


/*int arr[] = {91,75,32,64,13};
int rev = 0;
for (int i=0;i<arr.length;i++)
{
	int n = arr[i];
	int ld = 0;
	while (n!=0)
	{
		ld = n % 10;
		rev = rev * 10 + ld;
		n = n/10;
	}			
}
System.out.print("{"+rev+"}");*/