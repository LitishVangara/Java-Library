package earlyBinding3;

public class Atm {
	public int cash;
	public Atm() {}
	public Atm(int cash)
	{
		this.cash = cash;
	}
	Cash c1 = new Cash();
	public void money()
	{
		System.out.println("I want to withdraw "+this.cash+" Rs/-.");
		System.out.println("Use ATM to draw the Money.....");
	}
}
