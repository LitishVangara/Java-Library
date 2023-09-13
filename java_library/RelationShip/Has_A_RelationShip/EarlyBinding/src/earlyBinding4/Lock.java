package earlyBinding4;

public class Lock {
	public int locks;
	public Lock() {}
	public Lock(int locks)
	{
		this.locks = locks;
	}
	Key k1 = new Key();
	public void open()
	{
		System.out.println("There are "+this.locks+" Locks.");
		System.out.println("Choose the correct Lock and Open the Lock....");
	}
}
