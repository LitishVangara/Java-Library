package bothtoStringAndequalsMethod1;

public class Bike {
	public String name;
	public String colour;
	public int milage;
	public int price;
	public Bike() {}
	public Bike(String name, String colour, int milage, int price) 
	{
		this.name = name;
		this.colour = colour;
		this.milage = milage;
		this.price = price;
	}
	public String toString()
	{
		return this.name+" car with "+this.colour+" colour and it will give milage of "+this.milage+"Km/l"+" and price is "+this.price;
	}
}
