package checkedExceptionPrograms;
import java.io.*;
import java.sql.*;
public class ThrowsMultipleException 
{
	public static void check() throws SQLException, FileNotFoundException
	{
		System.out.println("Begins : ");
		DriverManager.getConnection("hello");
		new FileOutputStream("P://abc.txt");
		System.out.println("Ends : ");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts : ");
		try
		{
			check();
		}
		catch (Exception a)
		{
			System.out.println("Exception handled...");
		}
		System.out.println("Main Ends : ");
	}
}
