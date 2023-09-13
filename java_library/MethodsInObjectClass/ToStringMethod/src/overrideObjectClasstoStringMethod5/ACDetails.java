package overrideObjectClasstoStringMethod5;

public class ACDetails {
	public static void main(String[] args) {
		AC a1 = new AC("Samsung", 50000, 2.0, "Non-Inverter", "Copper");
		System.out.println(a1);
		AC a2 = new AC("Whirlpool", 45000, 1.5, "Non-Inverter", "Copper");
		System.out.println(a2);
	}
}
