package exceptionHandlingPrograms1;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MultipleCatchWithSuperAndSubClass2 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(100/0);
			int a[] = {10, 20, 60, 80};
			DriverManager.getConnection("ABC");
			System.out.println(a[9]);
			System.out.println("Hyderrabad".charAt(20));
		}
		catch (StringIndexOutOfBoundsException a)
		{
			System.out.println("StringIndexOutOfBoundsException");
		}
		catch (ArrayIndexOutOfBoundsException b)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch (RuntimeException c)
		{
			System.out.println("Runtime Exception");
		}
		catch (SQLException d)
		{
			System.out.println("SQL Exception");
		}
		catch (Throwable e)
		{
			System.out.println("Throwable Exception");
		}
	}
}
