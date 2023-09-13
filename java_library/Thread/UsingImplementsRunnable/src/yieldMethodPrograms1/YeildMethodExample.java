package yieldMethodPrograms1;

public class YeildMethodExample 
{
	public static void main(String[] args) 
	{
		UserDefined1 ud1 = new UserDefined1();
		ud1.start();
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("White.");
		}
	}
}
