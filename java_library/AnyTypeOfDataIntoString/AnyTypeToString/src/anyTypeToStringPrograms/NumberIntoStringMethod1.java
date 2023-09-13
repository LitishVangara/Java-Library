package anyTypeToStringPrograms;

import java.util.Scanner;

public class NumberIntoStringMethod1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Value : ");
		int n = scan.nextInt();
		String s = Integer.toString(n);
		String rev = "";
		for (int i = s.length()-1; i >=0; i--) 
		{
			rev+=s.charAt(i);
		}
		System.out.println("After Reversing : "+rev);
	}
}
