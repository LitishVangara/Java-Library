package autoBoxingPrograms1;

public class AutoBoxingExample 
{
	public static void main(String[] args) 
	{
		int a = 50;
		System.out.println("Primitive : "+a);
		Integer i = Integer.valueOf(a);
		System.out.println("Non - Primitive Boxing : "+i.toString());
		Integer i1 = a;
		System.out.println("Non - Primitive AutoBoxing: "+i.toString());
	}
}
