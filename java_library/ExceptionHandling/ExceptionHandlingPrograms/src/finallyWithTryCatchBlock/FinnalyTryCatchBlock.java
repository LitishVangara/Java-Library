package finallyWithTryCatchBlock;

public class FinnalyTryCatchBlock 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Jspiders".charAt(10));
		}
		catch (StringIndexOutOfBoundsException a)
		{
			System.out.println("StringIndexOutOfBoundsException");
		}
		finally
		{
			System.out.println("I am Finally Blocked.");
		}
	}
}
