package overrideObjectClasstoStringMethod1;

public class CarDetails {
	public static void main(String[] args) {
		Car c1 = new Car("BMW", "Blue", 14, 1400000);
		System.out.println(c1);
		Car c2 = new Car("NANO", "Red", 23, 400000);
		System.out.println(c2);
	}
}
