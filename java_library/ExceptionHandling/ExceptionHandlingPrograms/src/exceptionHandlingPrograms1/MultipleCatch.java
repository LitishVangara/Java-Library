package exceptionHandlingPrograms1;

public class MultipleCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[] = {10, 20, 30, 50};
			System.out.println(a[10]);
			System.out.println(100/0);
			System.out.println("Hello".charAt(50));
		}
		catch (StringIndexOutOfBoundsException a)
		{
			System.out.println("StringIndexOutOfBoundsException");
		}
		catch (ArrayIndexOutOfBoundsException b)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch (ArithmeticException c)
		{
			System.out.println("Arithmetic Exception");
		}
	}
}
