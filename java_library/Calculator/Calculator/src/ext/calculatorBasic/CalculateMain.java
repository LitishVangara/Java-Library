package ext.calculatorBasic;

import java.util.Scanner;

public class CalculateMain 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("********************Calculator********************");
		System.out.println("Enter add for Addition.");
		System.out.println("Enter substract for Substraction.");
		System.out.println("Enter multiply for Multiplication.");
		System.out.println("Enter divide for Division.");
		System.out.println("Enter power for Multiplication from Power value.");
		String s = scan.next();
		switch(s)
		{
		case "add" : 
		{
			System.out.println("Enter the Value : ");
			System.out.println("a : ");
			double a =  scan.nextDouble();
			System.out.println("b : ");
			double b =  scan.nextDouble();
			double d = add(a,b);
			System.out.println(d);
			break;
		}
		case "substract" : 
		{
			System.out.println("Enter the Value : ");
			System.out.println("a : ");
			double a =  scan.nextDouble();
			System.out.println("b : ");
			double b =  scan.nextDouble();
			double d = subtract(a,b);
			System.out.println(d);
			break;
		}
		case "multiply" : 
		{
			System.out.println("Enter the Value : ");
			System.out.println("a : ");
			double a =  scan.nextDouble();
			System.out.println("b : ");
			double b =  scan.nextDouble();
			double d = multiply(a,b);
			System.out.println(d);
			break;
		}
		case "divide" :
		{
			System.out.println("Enter the Value : ");
			System.out.println("a : ");
			double a =  scan.nextDouble();
			System.out.println("b : ");
			double b =  scan.nextDouble();
			double d = divide(a,b);
			System.out.println(d);
			break;
		}
		case "power" : 
		{
			System.out.println("Enter the Value : ");
			System.out.println("a : ");
			long a = scan.nextLong();
			System.out.println("b : ");
			long b = scan.nextLong();
			long l = powerOf(a,b);
			System.out.println(l);
			break;
		}
		default : System.out.println("Enter Valid Input.");
		}
	}
	public static double add(double a, double b) 
	{
		return a+b;
	}
	public static double subtract(double a, double b) 
	{
		return a-b;
	}
	public static double multiply(double a, double b) 
	{
		return a*b;
	}
	
	public static double divide(double a, double b) 
	{
		return a/b;
	}
	
	public static long powerOf(long a, long b) 
	{
		if(b == 0)
			return 1;
		if(b < 0)
			return -1;
		long base = a;
		for(int i=2; i<=b; i++) 
		{
			a = base * a;
		}
		return a;
	}
}
