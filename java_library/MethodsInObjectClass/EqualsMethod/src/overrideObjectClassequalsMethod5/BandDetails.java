package overrideObjectClassequalsMethod5;

public class BandDetails {
	public static void main(String[] args) {
		Bank b1 = new Bank("SBI");
		System.out.println(b1);
		Bank b2 = new Bank("SBH");
		System.out.println(b2);
		if (b2.equals(b1))
		{
			System.out.println("Both the Bank names are same.");
		}
		else
		{
			System.out.println("Both the Bank names are different.");
		}
	}
}
