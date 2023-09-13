package userDefinedExceptionExamples2;

public class PrimePalindromeDigitsException extends RuntimeException
{
	int Exception = 0;
	public PrimePalindromeDigitsException (int conditionViolated)
	{
		Exception = conditionViolated;
	}
	public String printMessage()
	{
		switch(Exception)
		{
		case 1: return ("The given Number is Not a Palindrome.");
		case 2: return ("The given Number is Not a Prime Number.");
		case 3: return ("The Digits in Given Number are not Prime.");
		default : System.out.println();
		}
		return "";
	}
}
