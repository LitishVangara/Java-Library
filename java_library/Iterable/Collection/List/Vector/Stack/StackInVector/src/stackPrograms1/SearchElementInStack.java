package stackPrograms1;

import java.util.Scanner;
import java.util.Stack;

public class SearchElementInStack 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		Stack s = new Stack();
		while(true)
		{
			System.out.println("Enter the Value : ");
			System.out.println("--------------------------------------");
			s.push(scan.nextInt());
			System.out.println("Enter 'y' to continue or 'n' for stop.");
			String st = scan.next();
			if (st.equalsIgnoreCase("y")) 
			{
				continue;
			}
			else
			{
				break;
			}
		}
		System.out.println("The Elements are : "+s);
		System.out.println("Enter the Element to Search : ");
		int num = scan.nextInt();
		System.out.println("The Offset value of Given Number is : "+s.search(num));
	}
}
