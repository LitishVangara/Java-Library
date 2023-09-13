package defaultNonStaticMethod1;
public class DMISC1 {
	void animal()
	{
		System.out.println("Tiger is Roaming....");
	}
	public static void main(String[] args) 
	{
		DMISC1 o1 = new DMISC1();
		o1.animal();
	}
}
