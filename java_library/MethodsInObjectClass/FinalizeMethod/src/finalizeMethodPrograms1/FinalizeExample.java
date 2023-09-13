package finalizeMethodPrograms1;

public class FinalizeExample 
{
	int a;
	public FinalizeExample() {}
	public FinalizeExample(int a)
	{
		this.a = a;
	}
	protected void finalize() throws Throwable
	{
		System.out.println("Object Removed!!!");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Execution Starts : ");
		FinalizeExample d1 = new FinalizeExample(100);
		Thread.sleep(3000);
		System.out.println(d1.a);
		new FinalizeExample();
		d1 = null;
		System.gc();
	}
}
