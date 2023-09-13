package bothtoStringAndequalsMethod1;

public class BikeDetails {
	public static void main(String[] args) {
		Bike b1 = new Bike("Pulsar", "Blue", 30, 100000);
		Bike b2 = new Bike("Yamaha", "Black", 25, 150000);
		Bike b3 = new Bike("TVS", "Grey", 29, 90000);
		Bike b4=b1;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b1==b2);
		System.out.println(b2==b3);
		System.out.println(b1==b4);
	}
}
