package overrideObjectClasstoStringMethod1;

public class Employee {
	public String name;
	public int id;
	public double sal;
	public Employee() {}
	public Employee(String name, int id, double sal) 
	{
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public String toString()
	{
		String res = "Employee Name is : "+this.name+", ID is : "+this.id+" and Salary is : "+this.sal;
		return res;
	}
}
