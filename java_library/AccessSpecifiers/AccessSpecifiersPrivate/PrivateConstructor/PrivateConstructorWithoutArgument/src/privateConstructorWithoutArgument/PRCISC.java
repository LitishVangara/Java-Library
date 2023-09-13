package privateConstructorWithoutArgument;

public class PRCISC {
	private PRCISC()
	{
		System.out.println("Hai,Hello");
	}
	public static void main(String[] args) {
		PRCISC o1 = new PRCISC();
	}
}
