package printStackTracePrograms;
import java.sql.*;
public class PrintStackTraceExampleProgram 
{
	public static void check() throws SQLException
	{
		System.out.println("Hi Baby.");
		DriverManager.getConnection("Hello Baby");
		System.out.println("Bye Baby.");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts.");
		try
		{
			check();
		}
		catch (SQLException a)
		{
			a.printStackTrace();
		}
		System.out.println("Main Ends.");
	}
}
