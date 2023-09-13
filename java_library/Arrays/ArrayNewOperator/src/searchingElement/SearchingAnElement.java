package searchingElement;
import java.util.Scanner;

public class SearchingAnElement 
{
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
		System.out.println("Enter the Element to Search : ");
		int n = scan.nextInt();
		if (search(arr,n)) 
		{
			System.out.println("Element found...");
		}
		else
		{
			System.out.println("Element Not Found...");
		}
	}
	public static boolean search (int temp[],int value)
	{
		for (int i = 0; i < temp.length; i++) 
		{
			if (temp[i]==value) 
			{
				return true;
			}
		}
		return false;
	}
}
