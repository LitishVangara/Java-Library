package overrideObjectClassequalsMethod3;

public class LaptopDetails {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Apple", 250000, "Apple M2 Pro Max", "Apple 38 cores GPU", "16Inch");
		System.out.println(l1);
		Laptop l2 = new Laptop("Asus", 200000, "i9 13Gen", "RTX4070", "16Inch");
		System.out.println(l2);
		if (l1.equals(l2))
		{
			System.out.println("Both the Laptop's consists of same Processor or GPU.");
		}
		else
		{
			System.out.println("Both the Laptop's consists of different Processor or GPU.");
		}
	}
}
