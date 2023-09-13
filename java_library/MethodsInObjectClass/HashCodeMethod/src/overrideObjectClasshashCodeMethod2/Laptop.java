package overrideObjectClasshashCodeMethod2;

public class Laptop {
	public String brand;
	public int cost;
	public String processor;
	public String gpu;
	public String screenSize;
	public Laptop () {}
	public Laptop(String brand, int cost, String processor, String gpu, String screenSize) 
	{
		this.brand = brand;
		this.cost = cost;
		this.processor = processor;
		this.gpu = gpu;
		this.screenSize = screenSize;
	}
	public String toString()
	{
		String res = "Brand Name : "+this.brand+", its processor is : "+this.processor+", its GPU is : "+this.gpu+" and its cost is : "+this.cost;
		return res;
	}
	public boolean equals(Object obj)
	{
		Laptop l = (Laptop) obj;
		return this.processor == l.processor || this.gpu == l.gpu;
	}
	public int hashCode()
	{
		return cost;	
	}
}
