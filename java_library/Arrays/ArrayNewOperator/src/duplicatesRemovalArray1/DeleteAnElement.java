package duplicatesRemovalArray1;
import java.util.Scanner;

public class DeleteAnElement 
{
	public static int[] delete (int org[], int value)
	{
		int dup[] = new int [org.length-1];
		int index = 0;
		for (int i = 0; i < org.length; i++) 
		{
			if (org[i]!=value) 
			{
				dup[index++] = org[i];
			}
		}
		return dup;
	}
	public static void print(int c[])
	{
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]+" ");
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
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the value for Indexes : "+i);
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the Element to delete : ");
		int n = scan.nextInt();
		System.out.println("-------------------------------------------------");
		System.out.println("Before Deleting the Element : ");
		print(arr);
		int res[] = delete(arr,n);
		System.out.println("After Deleting the Element : ");
		print(res);
	}
}
