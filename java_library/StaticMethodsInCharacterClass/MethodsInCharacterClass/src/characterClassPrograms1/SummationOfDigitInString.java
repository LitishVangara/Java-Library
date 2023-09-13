package characterClassPrograms1;

import java.util.Scanner;

public class SummationOfDigitInString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the String with Integer : ");
		String s = scan.next();
		String s1 = "";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) 
			{
				s1 = s1 + s.charAt(i);
			}
		}
		int n = Integer.parseInt(s1);
		while (n!=0) 
		{
			sum = sum + n%10;
			n = n/10;
		}
		System.out.println(sum);
	}
}
