package bothtoStringAndequalsMethod1;

public class BulbDetails {
	public static void main(String[] args) {
		Bulb b1 = new Bulb("Motile", 10, "Fluoresent");
		Bulb b2 = new Bulb("Vibex", 12, "LED");
		Bulb b3 = b1;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
	}
}
