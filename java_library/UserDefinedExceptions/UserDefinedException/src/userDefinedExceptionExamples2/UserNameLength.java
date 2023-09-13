package userDefinedExceptionExamples2;

import java.util.Scanner;

public class UserNameLength 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Username : ");
		String userName = scan.next();
		int length = userName.length();
		if (length>=8 && length<=15) 
		{
			System.out.println(userName+" ");
		}
		else
		{
			throw new LengthException();
		}
	}
}
