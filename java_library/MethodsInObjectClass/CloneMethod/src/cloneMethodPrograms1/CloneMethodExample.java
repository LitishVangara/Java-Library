package cloneMethodPrograms1;

public class CloneMethodExample 
{
	public static void main(String[] args) 
	{
		double d[] = {10.1, 20.2, 30.3, 40.4};
		System.out.println("First Array Elements are : ");
		for (int i = 0; i < d.length; i++) 
		{
			System.out.println(d[i]);
		}
		double d1[] = d.clone();
		System.out.println("Second Array Elements are : ");
		for (int i = 0; i < d1.length; i++) 
		{
			System.out.println(d1[i]);
		}
	}
}
