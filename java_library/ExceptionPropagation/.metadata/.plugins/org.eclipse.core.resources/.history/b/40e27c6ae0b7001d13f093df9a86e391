package exceptionPropagationExamples;

public class ExceptionPropagationNullAndArray 
{
	static ExceptionPropagationNullAndArray e;
	int a;
	public static void eP1()
	{
		System.out.println("Execution Starts : ");
		System.out.println(e);
		System.out.println(e.a);
		System.out.println("Execution Ends : ");
	}
	public static void eP()
	{
		int a[] = {10, 20, 30, 50};
		eP1();
		System.out.println(a[10]);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts : ");
		eP();
		System.out.println("Main Ends : ");
	}
}
