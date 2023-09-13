package checkedExceptionPrograms;
import java.sql.*;
public class ExceptionPropagationExample2 
{
	public void method2() throws SQLException
	{
		System.out.println("Begins : ");
		DriverManager.getConnection("hello");
		System.out.println("Ends : ");
	}
	public void method1() throws SQLException
	{
		System.out.println("Hi");
		method2();
		System.out.println("Hello");
	}
	public static void main(String[] args) 
	{
		ExceptionPropagationExample2 ep1 = new ExceptionPropagationExample2();
		try
		{
			ep1.method1();
		}
		catch (SQLException a)
		{
			System.out.println("Exception Handled...");
		}
	}
}
