package checkedExceptionPrograms1;
import java.sql.DriverManager;
public class Checkedexception 
{
	public static void main(String[] args) 
	{
		DriverManager.getConnection("Hello");
	}
}
