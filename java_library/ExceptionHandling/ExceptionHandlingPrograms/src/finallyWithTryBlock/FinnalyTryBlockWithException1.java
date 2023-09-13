package finallyWithTryBlock;

public class FinnalyTryBlockWithException1 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(100/0);
		}
		finally
		{
			System.out.println("I am Finally Blocked.");
		}
	}
}
