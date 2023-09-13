package publicConstructorWithArgument1;

public class PCISBC extends PCISC{
	public static void main(String[] args) {
		PCISC o1 = new PCISC(256);
		System.out.println(o1.x);
	}
}
