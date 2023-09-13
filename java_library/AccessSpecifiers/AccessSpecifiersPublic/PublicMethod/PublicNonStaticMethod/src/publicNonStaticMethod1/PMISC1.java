package publicNonStaticMethod1;

public class PMISC1 {
	public void run()
	{
		System.out.println("Running......");
	}
	public static void main(String[] args) {
		PMISC1 o1 = new PMISC1();
		o1.run();

	}

}
