package characterClassPrograms1;

import java.util.Scanner;

public class ConvertNumberIntoString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scan.nextInt();
		if (a<0 && a>999) 
		{
			System.out.println("Enter number below 999 : ");
		}
		else
		{
			int x = a%10;
			int y = a/10;
			int z = y%10;
			int k = a/100;
			String p[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
			String s[] = {"Eleven", "twele", "thriteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
			String q[] = {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
			String r = "Hundered";
			if (a<10)
			{
				System.out.println(p[a]);
			}
			else if (a<20)
			{
				System.out.println(s[x-1]);
			}
			else if (a<100)
			{
				System.out.println(q[2]+" "+p[x]);
			}
			else
			{
				System.out.println(p[k]+r+q[z]+" "+p[x]);
			}
		}
	}
}
