package overrideObjectClassequalsMethod3;

public class MobileDtetails {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Apple Iphone", 130000, 256, 6);
		System.out.println(m1);
		Mobile m2 = new Mobile("Realme", 30000, 128, 8);
		System.out.println(m2);
		if (m1.equals(m2))
		{
			System.out.println("Both the Mobiles have same Storage.");
		}
		else
		{
			System.out.println("Both the Mobiles have different Storage.");
		}
	}
}
