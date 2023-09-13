package overrideObjectClasstoStringMethod2;

public class MobileDtetails {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Apple Iphone", 130000, 256, 6);
		System.out.println(m1);
		Mobile m2 = new Mobile("Realme", 30000, 128, 8);
		System.out.println(m2);
	}
}
