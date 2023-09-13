package anyTypeToStringPrograms;

import java.util.Scanner;

public class NumberIntoStringMethod3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Value : ");
		int n = scan.nextInt();
		String s = Integer.toString(n);
		char []ch = s.toCharArray();
		String rev = "";
		for (int i = ch.length-1; i >=0; i--) 
		{
			rev +=ch[i];
		}
		System.out.println("After Reversing : "+rev);
	}
}
