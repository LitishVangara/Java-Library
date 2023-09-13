package objectClassequalsMethod1;

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee e1 = new Employee("Litish", 202, 30000);
		Employee e2 = new Employee("Vishnu", 201, 40000);
		Employee e3 = new Employee("RK", 203, 50000);
		Employee e4 = e1;
		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e3));
		System.out.println(e4.equals(e2));
		System.out.println(e1.equals(e4));
	}
}
