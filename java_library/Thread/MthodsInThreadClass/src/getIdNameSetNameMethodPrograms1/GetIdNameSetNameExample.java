package getIdNameSetNameMethodPrograms1;

public class GetIdNameSetNameExample 
{
	public static void main(String[] args) 
	{
		System.out.println("Minimum Priority : "+Thread.MIN_PRIORITY);
		System.out.println("Normal Priority : "+Thread.NORM_PRIORITY);
		System.out.println("Maximum Priority : "+Thread.MAX_PRIORITY);
		Thread t = Thread.currentThread();
		System.out.println("Current Thread Name is : "+t.getName());
		System.out.println("Current Thread ID is : "+t.getId());
		t.setName("TECA37");
		System.out.println("After Changing the Name of Current Thread is : "+t.getName());
		UserDefinedThread ud = new UserDefinedThread();
		System.out.println("Child Thread Name is : "+ud.getName());
		System.out.println("Child Thread ID is : "+ud.getId());
		ud.setName("Child");
		System.out.println("After Changing the Name of Child Thread is : "+ud.getName());
	}
}
