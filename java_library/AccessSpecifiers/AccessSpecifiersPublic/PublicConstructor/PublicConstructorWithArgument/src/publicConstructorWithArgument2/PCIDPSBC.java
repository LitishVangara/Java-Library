package publicConstructorWithArgument2;
import publicConstructorWithArgument1.PCISC;
public class PCIDPSBC extends PCISC{
	public static void main(String[] args) {
		PCISC o1 = new PCISC(856);
		System.out.println(o1.x);
	}
}
