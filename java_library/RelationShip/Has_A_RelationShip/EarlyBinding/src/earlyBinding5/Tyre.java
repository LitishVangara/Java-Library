package earlyBinding5;

public class Tyre {
	public int tyres;
	public Tyre() {}
	public Tyre(int tyres)
	{
		this.tyres = tyres;
	}
	Air a1 = new Air();
	public void use()
	{
		System.out.println("Insert "+this.tyres+"Atm gas into tyres.");
		System.out.println("You can use the Tyre now.");
	}
}
