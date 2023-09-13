package palindromeElements;
import java.util.Scanner;

public class SortingPalindromeElements 
{
	public static int paliCount (int arr[])
	{
		int count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			int n = arr[i];
			int rev = 0;
			while (n!=0) 
			{
				rev = rev * 10 + (n%10);
				n/=10;
			}
			if (arr[i] == rev) 
			{
				count++;
			}
		}
		return count;
	}
	public static int[] storePali (int arr[], int paliCount)
	{
		int temp[] = new int [paliCount];
		int index = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			int n = arr[i];
			int rev = 0;
			while (n!=0) 
			{
				rev = rev * 10 + (n % 10);
				n/=10;
			}
			if (rev == arr[i]) 
			{
				temp[index++] = arr[i];
			}
		}
		return temp;
	}
	public static int[] sort (int arr[])
	{
		for (int i = 0; i < arr.length - 1; i++) 
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[i]>arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void print (int arr[])
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Size : ");
		int size = scan.nextInt();
		System.out.println("--------------------------------------------------");
		int org[] = new int[size];
		for (int i = 0; i < org.length; i++) 
		{
			System.out.println("Enter the values for Indexes : "+i);
			org[i] = scan.nextInt();
		}
		int count = paliCount(org);
		int []res = storePali(org, count);
		res = sort(res);
		System.out.println("--------------------------------------------------");
		System.out.println("After Sorting Palindrome Elements : ");
		print(res);
 	}
}
