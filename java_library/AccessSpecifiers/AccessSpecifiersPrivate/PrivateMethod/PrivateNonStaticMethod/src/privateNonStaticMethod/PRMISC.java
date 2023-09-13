package privateNonStaticMethod;

public class PRMISC {
	private void animal()
	{
		System.out.println("Lion is King.....");
	}
	public static void main(String[] args) {
		PRMISC o1 = new PRMISC();
		o1.animal();	
	}
}
