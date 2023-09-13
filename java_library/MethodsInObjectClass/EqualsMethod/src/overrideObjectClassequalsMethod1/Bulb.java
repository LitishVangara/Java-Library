package overrideObjectClassequalsMethod1;

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
	public boolean equals(Object obj)
	{
		Bulb b = (Bulb) obj;
		return this.type.equals(b.type) && this.wattage==b.wattage;
	}
}
