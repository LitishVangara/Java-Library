package overrideObjectClasshashCodeMethod4;

public class ShoesDetails {
	public static void main(String[] args) {
		Shoes s1 = new Shoes("Clarks", "Black", "Male", 4500);
		System.out.println(s1);
		Shoes s2 = new Shoes("Puma", "Red", "Female", 5500);
		System.out.println(s2);
		System.out.println(s1.hashCOde());
		System.out.println(s2.hashCOde());
		if (s1.equals(s2))
		{
			System.out.println("Both the Shoes have same Colour.");
		}
		else
		{
			System.out.println("Both the Shoes have different Colour.");
		}
	}
}
