package striingToAnyTypePrograms;

import java.util.Scanner;

public class SecondHalfIsPalindromeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Number : ");
		int n = scan.nextInt();
		String s = Integer.toString(n);
		String s1 = s.substring(0,(s.length()/2));
		String s2 = s.substring((s.length()/2));
		StringBuffer sb= new StringBuffer(s2);
		String res = sb.toString();
		int num = Integer.parseInt(res);
		int num1 = num;
		System.out.println("The Second Half of the Number is : "+num);
		int reverse = 0;
		int ld = 0;
		while (num!=0)
		{
			ld = num%10;
			reverse = reverse*10+ld;
			num = num/10;
		}
		if (num1==reverse)
		{
			System.out.println("it is a Palindrome Number.");
		}
		else
		{
			System.out.println("It is not a Palindrome Number.");
		}
	}
}
