package publicConstructorWithArgument1;
public class PCISC1 
{
	public int x;
	public PCISC1() {}
	public PCISC1(int x)
	{
		this.x = x;
	}
	public static void main(String[] args) {
		PCISC1 o1 = new PCISC1(202);
		System.out.println(o1.x);
	}
}
