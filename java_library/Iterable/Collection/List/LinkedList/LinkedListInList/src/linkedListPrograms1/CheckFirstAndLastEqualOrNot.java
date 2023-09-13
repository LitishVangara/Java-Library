package linkedListPrograms1;
import java.util.LinkedList;
import java.util.Scanner;

public class CheckFirstAndLastEqualOrNot 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		LinkedList<Integer> ls = new LinkedList<Integer>();
		while (true) 
		{
			System.out.println("Enter the Value : ");
			System.out.println("--------------------------------------");
			ls.add(scan.nextInt());
			System.out.println("Enter 'y' to continue or 'n' for stop.");
			String s = scan.next();
			if (s.equalsIgnoreCase("y")) 
			{
				continue;
			}
			else
			{
				break;
			}
		}
		System.out.println("Before Modification : "+ls);
		if (ls.getLast().equals(ls.getFirst())) 
		{
			System.out.println("Enter the Element to Replace the Last Element : ");
			int i = scan.nextInt();
			//ls.set(ls.indexOf(ls.getLast()), 26);
			ls.removeLast();
			ls.addLast(i);
		}
		else
		{
			ls.remove(ls.getFirst());
		}
		System.out.println("After Modification : "+ls);
	}
}
