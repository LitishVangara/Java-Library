package overrideObjectClasstoStringMethod1;

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee e1 = new Employee("Litish", 202, 30000);
		System.out.println(e1.toString());
		Employee e2 = new Employee("Vishnu", 201, 40000);
		System.out.println(e2);
		Employee e3 = new Employee("RK", 203, 50000);
		System.out.println(e3);
	}
}
