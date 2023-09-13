package lazyInstanstiationPrograms1;

public class LazySingleton 
{
	public static String msg;
	private LazySingleton()
	{
		msg = "New Object Created...!!!";
	}
	private static LazySingleton ls = null;
	public static LazySingleton getObject()
	{
		if (ls==null) 
		{
			ls = new LazySingleton();
		}
		else
		{
			msg = "Object is already Created...!!!";
		}
		return ls;
	}
}
