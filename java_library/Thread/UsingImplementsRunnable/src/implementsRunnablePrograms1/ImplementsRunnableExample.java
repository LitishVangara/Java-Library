package implementsRunnablePrograms1;

public class ImplementsRunnableExample 
{
	public static void main(String[] args) 
	{
		UserDefinedRunnable ud = new UserDefinedRunnable();
		Thread t = new Thread(ud);
		t.start();
		System.out.println("Main Method.");
	}
}
