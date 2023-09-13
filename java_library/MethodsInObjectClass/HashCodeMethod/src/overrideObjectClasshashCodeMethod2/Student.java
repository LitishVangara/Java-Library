package overrideObjectClasshashCodeMethod2;

public class Student {
	public String name;
	public int id;
	public int marks;
	public String stream;
	public Student() {}
	public Student(String name, int id, int marks, String stream) 
	{
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.stream = stream;
	}
	public String toString() 
	{
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + ", stream=" + stream + "]";
	}
	public boolean equals(Object o)
	{
		Student obj = (Student) o;
		boolean status = this.marks==obj.marks;
		return status;
	}
	public int hashCode()
	{
		return id;
	}
}
