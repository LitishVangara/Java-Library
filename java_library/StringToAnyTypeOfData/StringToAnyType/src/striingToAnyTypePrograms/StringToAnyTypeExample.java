package striingToAnyTypePrograms;

public class StringToAnyTypeExample 
{
	public static void main(String[] args) 
	{
		String s = "100";
		System.out.println("String : "+(s+50));
		int a = Integer.parseInt(s);
		System.out.println("Integer : "+(a+50));
		String s1 = "true";
		System.out.println("String : "+(s1+"hi"));
		boolean b = new Boolean(s1);
		System.out.println("Boolean : "+b);
		
	}
}
