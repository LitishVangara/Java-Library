package exceptionHandlingPrograms1;

public class SingleException 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Hello".charAt(7));
		} 
		catch (Throwable e) 
		{
			System.out.println("Exception Handled....");
		}
	}
}
