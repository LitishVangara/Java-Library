package finallyWithTryCatchBlock;

public class FinnalyTryCatchBlockWithException 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[] = {10, 50, 60, 90};
			System.out.println(a[9]);
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
