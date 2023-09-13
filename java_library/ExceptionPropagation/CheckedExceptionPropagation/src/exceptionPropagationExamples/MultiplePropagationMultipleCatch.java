package exceptionPropagationExamples;
import java.io.*;
import java.sql.*;

public class MultiplePropagationMultipleCatch 
{
	public static void check1() throws SQLException, FileNotFoundException
	{
		System.out.println("Start : ");
		DriverManager.getConnection("hello");
		new FileOutputStream("P://abc.txt");
		System.out.println("Last : ");
	}
	public static void check() throws SQLException, ArithmeticException, FileNotFoundException
	{
		System.out.println("Begins : ");
		check1();
		System.out.println(100/0);
		System.out.println("Ends : ");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts : ");
		try
		{
			check();
		}
		catch (FileNotFoundException a)
		{
			System.out.println("FileNotFoundException...");
		}
		catch (SQLException b)
		{
			System.out.println("SQLException...");
		}
		catch (ArithmeticException c)
		{
			System.out.println("ArithmeticException...");
		}
		System.out.println("Main Ends : ");
	}
}
