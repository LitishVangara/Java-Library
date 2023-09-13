package overrideObjectClasshashCodeMethod2;

public class StudentDetails {
	public static void main(String[] args) {
		Student s1 = new Student("Litish", 301, 85, "BSc");
		Student s2 = new Student("Vishnu", 302, 85, "BSc");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if (s2.equals(s2))
		{
			System.out.println("Both the student's ID are same.");
		}
		else
		{
			System.out.println("Both the students's have different ID.");
		}
	}
}
