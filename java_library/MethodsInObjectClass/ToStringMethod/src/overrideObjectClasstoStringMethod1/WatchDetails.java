package overrideObjectClasstoStringMethod1;

public class WatchDetails {
	public static void main(String[] args) {
		Watch w1 = new Watch("Amazfit", "Grey", "Platinum", "Digital", "Square", 4000);
		System.out.println(w1);
		System.out.println("*************************");
		Watch w2 = new Watch("Casio", "White", "Copper", "Analogue", "Oval", 8000);
		System.out.println(w2);
	}
}
