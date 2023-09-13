package genericCollectionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class CountStringPalindromes 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		ArrayList<String> al = new ArrayList<String>();
		while (true) 
		{
			System.out.println("Enter the Value : ");
			al.add(scan.next());
			System.out.println("Enter 'yes' or 'y' to Continue.");
			System.out.println("Enter 'No' or 'n' to Stop.");
			String value = scan.next();
			if (value.equalsIgnoreCase("yes") || value.equalsIgnoreCase("y")) 
			{
				continue;
			}
			else
			{
				System.out.println("Thank you.");
				break;
			}
		}
		System.out.println("Elements are : "+al);
		int count = 0;
		for (int i = 0; i < al.size(); i++) 
		{
			String s = al.get(i);
			StringBuffer sb = new StringBuffer(s);
			String rev = sb.reverse().toString();
			if (rev.equalsIgnoreCase(s)) 
			{
				count++;
			}
		}
		System.out.println("The count is : "+count);
	}
}
