package arrayListPrograms1;
import java.util.ArrayList;
import java.util.Scanner;

public class NnumberOfElementsInCollectionOnlyChar 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int size = scan.nextInt();
		ArrayList al = new ArrayList();
		System.out.println("Enter the Character Value to Store in Collection : ");
		for (int i = 1; i <= size; i++) 
		{
			al.add(scan.next().charAt(0));
		}
		System.out.print("The Character Values in a Collection are : ");
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.print(al.get(i)+" ");
		}
	}
}
