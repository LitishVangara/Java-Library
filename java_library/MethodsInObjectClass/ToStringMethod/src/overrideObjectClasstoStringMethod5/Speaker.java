package overrideObjectClasstoStringMethod5;

public class Speaker {
	public String brand;
	public String features;
	public String colour;
	public int price;
	public Speaker() {}
	public Speaker(String brand, String features, String colour, int price) 
	{
		this.brand = brand;
		this.features = features;
		this.colour = colour;
		this.price = price;
	}
	public String toString()
	{
		String res = "Speaker Brand : "+this.brand+", its Features are : "+this.features+" and its Price is : "+this.price;
		return res;
	}
}
