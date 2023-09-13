package getClassMethodPrograms1;

public class GetClassMethodExample 
{
	public static void main(String[] args) 
	{
		Object obj1 = new Bank();
		Object obj2 = new Student();
		Class c1 = obj1.getClass();
		Class c2 = obj2.getClass();
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		Object obj3 = new String();
		Class c3 = obj3.getClass();
		System.out.println(c3.getName());
	}
}
