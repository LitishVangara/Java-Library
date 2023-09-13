package overrideObjectClasshashCodeMethod4;

public class BankDetails {
	public static void main(String[] args) {
		Bank b1 = new Bank("SBI", 456896, 1000, "SBI785412");
		System.out.println(b1);
		Bank b2 = new Bank("ICICI", 562345, 500, "ICICI852456");
		System.out.println(b2);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		if (b2.equals(b1))
		{
			System.out.println("Both the Bank Accounts have same balance.");
		}
		else
		{
			System.out.println("Both the Bank Accounts have different balance.");
		}
	}
}
