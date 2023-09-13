package protectedConstructorWithArgument1;

public class PTCISC1 {
	protected int y;
	protected PTCISC1() {}
	protected PTCISC1(int y)
	{
		this.y = y;
	}
	public static void main(String[] args) {
		PTCISC1 o1 = new PTCISC1(256);
		System.out.println(o1.y);
	}
}
