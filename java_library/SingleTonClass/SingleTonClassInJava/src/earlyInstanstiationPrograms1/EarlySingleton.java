package earlyInstanstiationPrograms1;

public class EarlySingleton 
{
	public String status;
	private EarlySingleton()
	{
		status = "Object Created...!!!";
	}
	private static EarlySingleton es = new EarlySingleton();
	public static EarlySingleton getObject()
	{
		return es;
	}
}
