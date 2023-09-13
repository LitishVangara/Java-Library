package anyTypeToStringPrograms;

import java.util.Scanner;

public class NumberIntoStringMethod4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Value : ");
		int n = scan.nextInt();
		String s = Integer.toString(n);
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println("After Reversing : "+sb);
	}
}
