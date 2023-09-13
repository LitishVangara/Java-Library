package exceptionPropagationExamples;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionPropagationCheckedAndUnChecked 
{
	public void method4() throws SQLException
	{
		System.out.println("Begins : ");
		DriverManager.getConnection("hello");
		System.out.println("Ends : ");
	}
	public void method3() throws SQLException
	{
		System.out.println("Hey");
		method4();
		System.out.println("Bye");
	}
	public void method2()
	{
		System.out.println("Start : ");
		System.out.println(100/0);
		System.out.println("Last : ");
	}
	public void method1()
	{
		System.out.println("Hi");
		method2();
		System.out.println("Hello");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts : ");
		ExceptionPropagationCheckedAndUnChecked ep1 = new ExceptionPropagationCheckedAndUnChecked();
		ExceptionPropagationCheckedAndUnChecked ep2 = new ExceptionPropagationCheckedAndUnChecked();
		ep1.method1();
		try
		{
			ep2.method3();
		}
		catch (Throwable a)
		{
			System.out.println("Exception Handled...");
		}
		System.out.println("Main Ends : ");
	}
}
