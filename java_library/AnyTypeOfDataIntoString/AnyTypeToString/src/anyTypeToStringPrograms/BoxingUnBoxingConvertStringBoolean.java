package anyTypeToStringPrograms;

import java.util.Scanner;

public class BoxingUnBoxingConvertStringBoolean 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Boolean Value : ");
		boolean b = scan.nextBoolean();
		Boolean b1 = b;
		boolean b2 = b1; 
		String s = Boolean.toString(b2);
		System.out.println("Vowel Characters aare : ");
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println(ch);break;
			}
		}
	}
}
