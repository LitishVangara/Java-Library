package duplicatesRemovalArray1;
import java.util.Scanner;

public class DuplicatesRemoval {
	public static int[] find(int c[])
	{
		int arr[] = new int[c.length];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = c[i];
		}
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]==arr[j])
				{
					arr[j]=0;
				}
			}
		}
		System.out.println("After Replacing ZERO with Duplicates : ");
		print(arr);
		int count=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]!=0)
			{
				count++;
			}
		}
		System.out.println("The Element count after Removing Duplicates is : "+count);
		System.out.println("-------------------------------------------------");
		int res[] = new int[count];
		int index = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]!=0)
			{
				res[index++]=arr[i];
			}
		}
		System.out.println("After Removing Duplicates : ");
		print(res);
		return res;
	}
	public static void print(int arr[])
	{
		System.out.println("Array Elements are : ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int size = scan.nextInt();
		System.out.println("-------------------------------------------------");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter the value for Indexes : "+i);
			a[i] = scan.nextInt();
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Before Removing Duplicates : ");
		print(a);
		int b[] = find(a);
	}
}
