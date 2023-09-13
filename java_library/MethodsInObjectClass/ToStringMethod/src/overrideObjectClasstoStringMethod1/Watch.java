package overrideObjectClasstoStringMethod1;

public class Watch {
	public String brand;
	public String colour;
	public String material;
	public String displayType;
	public String dialShape;
	public double price;
	public Watch() {}
	public Watch(String brand, String colour, String material, String displayType, String dialShape, double price) 
	{
		this.brand = brand;
		this.colour = colour;
		this.material = material;
		this.displayType = displayType;
		this.dialShape = dialShape;
		this.price = price;
	}
	public String toString()
	{
		String res = "Watch Brand : "+this.brand+System.lineSeparator()+
		"Colour : "+this.colour+System.lineSeparator()+
		"Material : "+this.material+System.lineSeparator()+
		"Display Type : "+this.displayType+System.lineSeparator()+
		"Dial Shape : "+this.dialShape+System.lineSeparator()+
		"Price : "+this.price;
		return res;
	}
	
}
