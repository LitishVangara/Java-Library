package privateConstructorWithArgument;

public class PRCISC {
	private int w;
	private PRCISC() {}
	private PRCISC(int w)
	{
		this.w = w;
	}
	public static void main(String[] args) {
		PRCISC o1 = new PRCISC(856);
		System.out.println(o1.w);
	}
}
