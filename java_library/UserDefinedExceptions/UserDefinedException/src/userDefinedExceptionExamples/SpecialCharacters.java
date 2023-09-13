package userDefinedExceptionExamples;

import java.util.Scanner;

public class SpecialCharacters 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Special Character : ");
		char ch = scan.next().charAt(0);
		if (ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='&') 
		{
			System.out.println(ch+" is a Special Character.");
		}
		else
		{
			throw new SpecialCharacterException();
		}
	}
}
