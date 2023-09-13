package arrayIndexElements;
import java.util.Scanner;

public class Swap2IndexElements 
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
		System.out.println("Enter the First Index Value : ");
		int first = scan.nextInt();
		System.out.println("Enter the Second Index Vlaue : ");
		int second = scan.nextInt();
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		System.out.println("After Swaping : ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
}
