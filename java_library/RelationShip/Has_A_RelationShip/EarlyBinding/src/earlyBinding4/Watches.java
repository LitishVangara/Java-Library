package earlyBinding4;

public class Watches {
	public int cell;
	public Watches() {}
	public Watches(int cell)
	{
		this.cell = cell;
	}
	Cells c1 = new Cells();
	public void use()
	{
		System.out.println(this.cell+" Cells are used to use Watch.");
		System.out.println("You can use the Watch now.");
	}
}
