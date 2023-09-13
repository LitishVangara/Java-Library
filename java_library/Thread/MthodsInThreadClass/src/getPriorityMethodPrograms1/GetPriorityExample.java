package getPriorityMethodPrograms1;

public class GetPriorityExample 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Main Thread Priority is : "+t.getPriority());
		UserDefinedThread ud = new UserDefinedThread();
		System.out.println("Child Thread Priority is : "+ud.getPriority());
	}
}
