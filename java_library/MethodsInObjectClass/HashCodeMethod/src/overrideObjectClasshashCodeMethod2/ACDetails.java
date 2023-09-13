package overrideObjectClasshashCodeMethod2;

public class ACDetails {
	public static void main(String[] args) {
		AC a1 = new AC("Samsung", 50000, 2.0, "Non-Inverter", "Copper");
		System.out.println(a1);
		AC a2 = new AC("Whirlpool", 45000, 1.5, "Non-Inverter", "Copper");
		System.out.println(a2);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		if (a1.equals(a2))
		{
			System.out.println("Both the AC's have same Technology.");
		}
		else
		{
			System.out.println("Both the AC's have different Technology.");
		}
	}
}
