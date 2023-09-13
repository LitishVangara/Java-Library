package overrideObjectClassequalsMethod5;

public class SportsDetails {
	public static void main(String[] args) {
		Sports s1 = new Sports("Chess", "Individual", "Stage", 2);
		System.out.println(s1);
		Sports s2 = new Sports("Cricket", "Team", "Ground", 11);
		System.out.println(s2);
		if (s1.equals(s2))
		{
			System.out.println("Both the Sports to be at same place type.");
		}
		else 
		{
			System.out.println("Both the Sports have different places to play.");
		}
	}
}
