package getMessagePrograms;

public class GetMessageExampleProgram 
{
	int a;
	static GetMessageExampleProgram g;
	public static void main(String[] args) 
	{
		System.out.println("Main Starts.");
		try
		{
			System.out.println(100/0);
			System.out.println(g.a);
		}
		catch (NullPointerException a)
		{
			String msg = a.getMessage();
			System.err.println(msg);
		}
		catch (ArithmeticException b)
		{
			String msg1 = b.getMessage();
			System.err.println(msg1);
		}
		System.out.println("Main Ends.");
	}
}
