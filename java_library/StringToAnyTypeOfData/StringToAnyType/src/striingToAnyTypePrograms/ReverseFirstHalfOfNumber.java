package striingToAnyTypePrograms;

import java.util.Scanner;

public class ReverseFirstHalfOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Number : ");
		int n = scan.nextInt();
		String s = Integer.toString(n);
		String s1 = s.substring(0,(s.length()/2));
		String s2 = s.substring((s.length()/2));
		StringBuffer sb= new StringBuffer(s1);
		String res = sb.reverse().toString();
		int a = Integer.parseInt(res+s2);
		System.out.println(" "+a);
	}
}
