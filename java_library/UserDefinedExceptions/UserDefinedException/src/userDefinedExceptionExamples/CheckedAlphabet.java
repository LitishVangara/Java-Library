package userDefinedExceptionExamples;

import java.util.Scanner;

public class CheckedAlphabet 
{
	public static void main(String[] args) throws NotAlphabetException
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Character : ");
		char ch = scan.next().charAt(0);
		if (ch>='A' && ch<='Z' || ch>='a' && ch<='z') 
		{
			System.out.println(ch+" is an Alphabet.");
		}
		else
		{
			throw new NotAlphabetException();
		}
	}
}
