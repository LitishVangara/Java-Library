package overrideObjectClasshashCodeMethod1;

public class BankDetails {
	public static void main(String[] args) {
		Bank b1 = new Bank("SBI", 456896, 1000, "SBI785412");
		System.out.println(b1.hashCode());
		Bank b2 = new Bank("ICICI", 562345, 500, "ICICI852456");
		System.out.println(b2.hashCode());
	}
}
