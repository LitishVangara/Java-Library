package joinMethodPrograms1;

public class JoinMethodExample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		UserDefined ud = new UserDefined();
		ud.start();
		ud.join();
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("White.");
		}
	}
}
