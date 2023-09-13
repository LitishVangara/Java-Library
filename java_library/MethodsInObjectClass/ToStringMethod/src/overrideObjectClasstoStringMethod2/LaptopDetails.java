package overrideObjectClasstoStringMethod2;

public class LaptopDetails {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Apple", 250000, "Apple M2 Pro Max", "Apple GPU", "16Inch");
		System.out.println(l1);
		Laptop l2 = new Laptop("Asus", 200000, "i9 13Gen", "RTX4070", "16Inch");
		System.out.println(l2);
	}
}
