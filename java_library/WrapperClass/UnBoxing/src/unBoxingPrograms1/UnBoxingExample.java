package unBoxingPrograms1;

public class UnBoxingExample 
{
	public static void main(String[] args) 
	{
		Character c = new Character('A');
		System.out.println("Non -  Primitive : "+c.toString());
		char ch = c.charValue();
		System.out.println("Primitive : "+ch);
		System.out.println("----------------------");
		Double d = new Double (100.8);
		System.out.println("Non - Primitive : "+d);
		double d1 = d.doubleValue();
		System.out.println("Primitive : "+d1);
	}
}
