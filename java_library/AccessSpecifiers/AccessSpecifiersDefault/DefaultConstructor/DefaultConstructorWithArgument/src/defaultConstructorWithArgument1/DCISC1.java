package defaultConstructorWithArgument1;

public class DCISC1 {
	int z;
	DCISC1(int z)
	{
		this.z = z;
	}
	public static void main(String[] args) {
		DCISC1 o1 = new DCISC1(822);
		System.out.println(o1.z);
	}
}
