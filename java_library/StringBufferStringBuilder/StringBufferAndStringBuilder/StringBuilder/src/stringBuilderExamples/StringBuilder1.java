package stringBuilderExamples;

public class StringBuilder1 {
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		s1.concat("Hyderabad");
		System.out.println("Strings : "+s1);
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("hyderabad");
		System.out.println("String Builder : "+sb);
	}
}
