package pojoClassPrograms1;

public class PojoClassExample 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setName("Litish");
		System.out.println(s.getName());
		s.setId(125678);
		System.out.println(s.getId());
		s.setDegree(80);
		System.out.println(s.getDegree());
	}
}
