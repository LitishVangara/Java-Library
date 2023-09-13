package objectClasshashCodeMethod1;

public class StudentDetails {
	public static void main(String[] args) {
		Student s1 = new Student("Litish", 301, 85, "BSc");
		System.out.println(s1);
		Student s2 = new Student("Vishnu", 302, 85, "BSc");
		System.out.println(s2);
		if (s1.equals(s2))
		{
			System.out.println("Performance is same.");
		}
		else
		{
			System.out.println("Performance is different.");
		}
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
