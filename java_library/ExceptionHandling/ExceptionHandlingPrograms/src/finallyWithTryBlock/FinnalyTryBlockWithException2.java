package finallyWithTryBlock;

public class FinnalyTryBlockWithException2 
{
	static FinnalyTryBlockWithException2 e;
	int a;
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(e.a);
		}
		finally
		{
			System.out.println("I am Finally Blocked.");
		}
	}
}
