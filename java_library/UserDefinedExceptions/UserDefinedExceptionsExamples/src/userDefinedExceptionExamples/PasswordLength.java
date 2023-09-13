package userDefinedExceptionExamples;

import java.util.Scanner;

public class PasswordLength 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Password : ");
		String password = scan.next();
		int length = password.length();
		if (length>=8 && length<=15) 
		{
			System.out.println(password+" ");
		}
		else
		{
			throw new LengthException();
		}
	}
}
