package boxingPrograms1;

public class BoxingExample 
{
	public static void main(String[] args) 
	{
		int a = 65;
		System.out.println("Primitive : "+a);
		Integer i = new Integer(a);
		System.out.println("way 1 : "+i.toString());
		Integer i1 = Integer.valueOf(a);
		System.out.println("way 2 : "+i1.toString());
		System.out.println("-----------------------");
		boolean b = true;
		System.out.println("Primitive : "+b);
		Boolean b1 = new Boolean (b);
		System.out.println("way 1 : "+b1);
		Boolean b2 = Boolean.valueOf(b);
		System.out.println("way 2 :"+b2.toString());
	}
}
