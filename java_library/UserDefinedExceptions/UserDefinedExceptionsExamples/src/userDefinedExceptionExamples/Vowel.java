package userDefinedExceptionExamples;
import java.util.Scanner;
public class Vowel 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Character : ");
		char ch = scan.next().charAt(0);
		switch(ch)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': System.out.println(ch+" is a Vowel");break;
		default : throw new NotVowelException();
		}
	}
}
