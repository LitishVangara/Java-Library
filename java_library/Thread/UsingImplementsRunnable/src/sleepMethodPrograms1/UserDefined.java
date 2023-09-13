package sleepMethodPrograms1;

public class UserDefined extends Thread
{
	public void run()
	{
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("Black.");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
