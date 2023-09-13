package startMethodPrograms1;

public class StartMethodExample 
{
	public static void main(String[] args) 
	{
		UserDefinedThread ud = new UserDefinedThread();
		ud.start();
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("Jspiders.");
		}
	}
}
