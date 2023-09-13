package unCheckedExceptionPrograms;

public class ExceptionPropagationExample1 
{
	public void method2()
	{
		System.out.println("Begins : ");
		System.out.println(100/0);
		System.out.println("Ends : ");
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
		ExceptionPropagationExample1 ep1 = new ExceptionPropagationExample1();
		ep1.method1();
		System.out.println("Main Ends : ");
	}
}
