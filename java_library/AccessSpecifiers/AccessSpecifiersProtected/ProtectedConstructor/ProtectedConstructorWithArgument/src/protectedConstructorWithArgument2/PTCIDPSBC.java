package protectedConstructorWithArgument2;
import protectedConstructorWithArgument1.PTCISC;
public class PTCIDPSBC extends PTCISC{
	public static void main(String[] args) {
		PTCISC o1 = new PTCISC(5642);
		System.out.println(o1.y);
	}

}
