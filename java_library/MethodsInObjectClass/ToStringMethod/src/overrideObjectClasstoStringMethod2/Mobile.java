package overrideObjectClasstoStringMethod2;

public class Mobile {
	public String brand;
	public int cost;
	public int storage;
	public int ram;
	public Mobile() {}
	public Mobile(String brand, int cost, int storage, int ram) 
	{
		this.brand = brand;
		this.cost = cost;
		this.storage = storage;
		this.ram = ram;
	}
	public String toString()
	{
		String res = "Mobile Brand : "+this.brand+", its Cost is : "+this.cost+" and its Storage is :"+this.storage;
		return res;
	}
}
