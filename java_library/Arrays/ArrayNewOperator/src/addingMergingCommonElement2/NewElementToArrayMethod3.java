package addingMergingCommonElement2;
import java.util.Scanner;

public class NewElementToArrayMethod3 
{
	public static int[] insert (int org[], int value)
	{
		int dup[] = new int [org.length+1];
		for (int i = 0; i < org.length; i++) 
		{
			dup[i] = org[i];
		}
		dup[org.length]=value;
		return dup;
	}
	public static void print(int c[])
	{
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}
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
		System.out.println("---------------------------------------------");
		while (true)
		{
			System.out.println("Enter the new Element : ");
			int n = scan.nextInt();
			System.out.println("Before adding new Element : ");
			print(arr);
			arr = insert(arr,n);
			System.out.println("Ater adding new Element : ");
			print(arr);
			System.out.println("Enter 1 for Continue or 2 for Exit : ");
			if (scan.nextInt()==1) 
			{
				continue;
			}
			else
			{
				break;
			}
		}
	}
}
