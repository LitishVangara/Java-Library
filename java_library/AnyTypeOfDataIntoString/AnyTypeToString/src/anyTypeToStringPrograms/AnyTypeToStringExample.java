package anyTypeToStringPrograms;

public class AnyTypeToStringExample 
{
	public static void main(String[] args) 
	{
		int a = 100;
		System.out.println("Integer : "+(a+50));
		String a1 = Integer.toString(a);
		System.out.println("String : "+(a1+50));
		boolean b = false;
		System.out.println("Boolean : "+b);
		String b1 = Boolean.toString(b);
		System.out.println("String : "+(b+"Hi"));
	}
}
