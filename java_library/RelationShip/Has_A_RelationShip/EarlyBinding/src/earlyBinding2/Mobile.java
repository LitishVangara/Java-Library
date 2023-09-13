package earlyBinding2;

public class Mobile {
	public int bper;
	public Mobile() {}
	public Mobile(int bper)
	{
		this.bper = bper;;
	}
	Battery b1 = new Battery();
	public void use()
	{
		System.out.println(this.bper+"% Battery Charged...");
		System.out.println("You can use the Mobile.");
	}
}
