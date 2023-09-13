package yieldMethodPrograms1;

public class UserDefined1 extends Thread
{
	public void run()
	{
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("Black.");
			Thread.yield();
		}
	}
}
