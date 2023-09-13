package checkedExceptionPrograms1;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class CheckedException 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Execution Starts : ");
			new FileOutputStream("H://Demo.txt");
			System.out.println("File Assessed.");
			System.out.println("Execution Ends : ");
		}
		catch (FileNotFoundException a)
		{
			System.out.println("File is not Present.....");
		}
	}
}
