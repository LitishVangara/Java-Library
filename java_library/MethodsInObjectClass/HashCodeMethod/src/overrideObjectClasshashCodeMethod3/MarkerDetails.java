package overrideObjectClasshashCodeMethod3;

public class MarkerDetails {
	public static void main(String[] args) {
		Marker m1 = new Marker("Aarohi", "Red", 1299);
		System.out.println(m1);
		Marker m2 = new Marker("Brustro", "Multi Colour", 1500);
		System.out.println(m2);
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		if (m1.equals(m2))
		{
			System.out.println("Both the Markers have same price.");
		}
		else
		{
			System.out.println("Both the Markers have different price.");
		}
	}
}
