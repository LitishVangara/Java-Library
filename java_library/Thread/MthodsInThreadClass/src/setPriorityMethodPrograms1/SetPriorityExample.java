package setPriorityMethodPrograms1;

public class SetPriorityExample 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Main Thread Priority is : "+t.getPriority());
		t.setPriority(7);
		System.out.println("AFter Changing Main Thread Priority is : "+t.getPriority());
		UserDefinedThread ud = new UserDefinedThread();
		System.out.println("Child Thread Priority is : "+ud.getPriority());
		ud.setPriority(10);
		ud.start();
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("Hello.");
		}
	}
}
