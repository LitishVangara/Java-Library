package bothtoStringAndequalsMethod1;

public class Bulb {
	public String brand;
	public int wattage;
	public String type;
	public Bulb () {}
	public Bulb(String brand, int wattage, String type) 
	{
		this.brand = brand;
		this.wattage = wattage;
		this.type = type;
	}
	public String toString()
	{
		String res = "Bulb Brand Name : "+this.brand+", wattage : "+this.wattage+" and type is : "+this.type;
		return res;
	}
	
}
