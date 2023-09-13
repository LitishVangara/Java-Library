package overrideObjectClasstoStringMethod1;

public class Car {
	public String name;
	public String colour;
	public double milage;
	public double price;
	public Car() {}
	public Car(String name, String colour, double milage, double price) 
	{
		this.name = name;
		this.colour = colour;
		this.milage = milage;
		this.price = price;
	}
	public String toString()
	{
		String res = this.name+" car with "+this.colour+" colour and it will give milage of "+this.milage+"Km/l"+" and price is "+this.price;
		return res;
	}
	
}
