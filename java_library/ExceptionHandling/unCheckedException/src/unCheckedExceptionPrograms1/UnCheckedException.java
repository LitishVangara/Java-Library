package unCheckedExceptionPrograms1;

public class UnCheckedException 
{
	public static void main(String[] args) 
	{
		try
		{
			int a = 10;
			System.out.println("A : "+a);
			int b = 0;
			System.out.println("B : "+b);
			System.out.println(a/b);
		}
		catch (ArithmeticException a)
		{
			System.out.println("Exception Handled...");
		}
	}
}
