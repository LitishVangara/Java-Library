package lazyInstanstiationPrograms1;

public class LazySingletonExample 
{
	public static void main(String[] args) 
	{
		System.out.println(LazySingleton.msg);
		LazySingleton obj = LazySingleton.getObject();
		System.out.println(obj.msg);
		LazySingleton obj1 = LazySingleton.getObject();
		System.out.println(obj1.msg);
		System.out.println(obj.msg);
		System.out.println(obj == obj1);
	}
}
