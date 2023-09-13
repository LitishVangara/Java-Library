package stringNewOperatorPrograms1;

public class NewOperatorExample 
{
	public static void main(String[] args) 
	{
		String s1 = new String("Sample");
		String s2 = new String("Demo");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		String s3 = new String("Sample");
		System.out.println(s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
	}
}
