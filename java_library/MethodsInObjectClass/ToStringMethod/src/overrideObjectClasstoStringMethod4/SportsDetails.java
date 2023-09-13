package overrideObjectClasstoStringMethod4;

public class SportsDetails {
	public static void main(String[] args) {
		Sports s1 = new Sports("Chess", "Individual", "Stage", 2);
		System.out.println(s1);
		Sports s2 = new Sports("Cricket", "Team", "Ground", 11);
		System.out.println(s2);
	}
}
