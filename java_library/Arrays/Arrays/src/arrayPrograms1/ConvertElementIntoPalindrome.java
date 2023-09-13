package arrayPrograms1;
import java.util.Scanner;

public class ConvertElementIntoPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Integer : ");
		int num = scan.nextInt();
		scan.close();
		int firstDigit = getFirstDigit(num);
		int palindromeNum = createPalindrome(num,firstDigit);
		System.out.println("The Palindrome Number is : "+palindromeNum);
	}
	public static int getFirstDigit (int num)
	{
		while (num>=10) 
		{
			num/=10;
		}
		return num;
	}
	public static int createPalindrome (int num, int firstDigit)
	{
		int palindromeNum = num;
		while (num>0) 
		{
			palindromeNum = palindromeNum*10+(num%10);
			num/=10;
		}
		if (getFirstDigit(palindromeNum)!= firstDigit) 
		{
			palindromeNum = (palindromeNum/10)*10+firstDigit;
		}
		return palindromeNum;
	}
}
