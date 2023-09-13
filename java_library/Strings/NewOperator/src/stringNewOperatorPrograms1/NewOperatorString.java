package stringNewOperatorPrograms1;

public class NewOperatorString //and concat method.
{
	public static void main(String[] args) 
	{
		String s1 = new String();
		String s2 = new String("Hello");
		s2.concat("Hyderabad");
		char ch[] = {'a', 'b', 'c'};
		String s3 = new String(ch);
		System.out.println(s1);
		System.out.println("-----------------");
		System.out.println(s2);
		System.out.println("-----------------");
		System.out.println(s3);
		System.out.println("-----------------");
		String s4 = new String("Jspiders");
		s4 = s4.concat("JNTU");
		System.out.println(s4);
	}
}
