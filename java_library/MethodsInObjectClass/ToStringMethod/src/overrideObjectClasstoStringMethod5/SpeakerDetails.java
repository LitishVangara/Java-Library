package overrideObjectClasstoStringMethod5;

public class SpeakerDetails {
	public static void main(String[] args) {
		Speaker s1 = new Speaker("Zebronics", "Bluetooth", "Black", 4500);
		System.out.println(s1);
		Speaker s2 = new Speaker("Boat", "Bluetooth", "Red", 6500);
		System.out.println(s2);
	}
}
