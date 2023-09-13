package autoUnBoxingPrograms1;

public class AutoUnBoxingExample 
{
	public static void main(String[] args) 
	{
		Double d1 = new Double(10.8);
		System.out.println("Non - Primitive : "+d1.toString());
		double d2 = d1.doubleValue();
		System.out.println("Primitive : "+d2);
		double d3 = d1;
		System.out.println("Primitive by AutoBoxing : "+d3);
	}
}
