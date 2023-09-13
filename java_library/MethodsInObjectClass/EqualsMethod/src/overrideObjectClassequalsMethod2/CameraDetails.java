package overrideObjectClassequalsMethod2;

public class CameraDetails {
	public static void main(String[] args) {
		Camera c1 = new Camera("Sony", 300, 300000, 6000);
		Camera c2 = new Camera("Canon", 150, 250000, 4500);
		Camera c3 = new Camera("Nixon", 220, 275000, 5000);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		if (c3.equals(c1))
		{
			System.out.println("Both the Camera have same Pixel.");
		}
		else
		{
			System.out.println("Both the Camera have different Pixel.");
		}
	}
}
