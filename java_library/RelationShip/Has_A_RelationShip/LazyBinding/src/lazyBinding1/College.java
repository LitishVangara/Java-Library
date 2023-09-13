package lazyBinding1;

public class College {
	Student s1;
	public void admission()
	{
		s1 = new Student();
		System.out.println("Student took Admission.");
	}
}
