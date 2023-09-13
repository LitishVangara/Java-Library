package anyTypeToStringPrograms;

import java.util.Scanner;

public class NumberIntoStringMethod2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Value : ");
		int n = scan.nextInt();
		String s = Integer.toString(n);
		String rev = "";
		for (int i = 0; i < s.length(); i++) 
		{
			rev = s.charAt(i)+rev;
		}
		System.out.println("After Reversing : "+rev);
	}
}
