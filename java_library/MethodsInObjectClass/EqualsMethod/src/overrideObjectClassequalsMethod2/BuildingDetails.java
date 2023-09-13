package overrideObjectClassequalsMethod2;

public class BuildingDetails {
	public static void main(String[] args) {
		Building b1 = new Building("Litish", "East", 30, 5500000, 5, 2050, 2, 6);
		Building b2 = new Building("Vishnu", "East", 25, 4000000, 4, 1600, 1, 4);
		Building b3 = new Building("RK", "West", 20, 4800000, 3, 1800, 1, 3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		if (b2.equals(b1))
		{
			System.out.println("Both the Buildings have same Expiry.");
		}
		else
		{
			System.out.println("Both the Buildings have differnt Expiry.");
		}
	}
}
