package overrideObjectClasshashCodeMethod3;

public class BikeDetails {
	public static void main(String[] args) {
		Bike b1 = new Bike("TVS", "Disc", "Alloy", 80000);
		System.out.println(b1);
		Bike b2 = new Bike("Royal Enfield", "ABS", "Alloy", 125000);
		System.out.println(b2);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		if (b2.equals(b1))
		{
			System.out.println("Both the bikes have same price.");
		}
		else
		{
			System.out.println("Both the bikes have different price.");
		}
	}
}
