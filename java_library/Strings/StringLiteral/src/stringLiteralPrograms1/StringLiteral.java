package stringLiteralPrograms1;

public class StringLiteral 
{
	public static void main(String[] args) 
	{
		String s1 = "Jspiders";
		String s2 = "JNTU";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		String s3 = "Jspiders";
		System.out.println(s3);
		System.out.println(s1==s3);
		String s4 = "JNTU1";
		System.out.println(s2==s4);
		String s5 = s4;
		System.out.println(s4==s5);
	}
}
