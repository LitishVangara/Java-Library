package overrideObjectClasshashCodeMethod3;

public class Marker {
	public String brand;
	public String colour;
	public int price;
	public Marker () {}
	public Marker(String brand, String colour, int price) 
	{
		this.brand = brand;
		this.colour = colour;
		this.price = price;
	}
	public String toString()
	{
		String res = "Marker Brand Name is : "+this.brand+", its Colour is : "+this.colour+" and its Price is : "+this.price;
		return res;
	}
	public boolean equals(Object obj)
	{
		Marker m = (Marker) obj;
		return this.price == m.price;
	}
	public int hashCode()
	{
		return price;
	}
}
