package overrideObjectClassequalsMethod4;

public class Shoes {
	public String brand;
	public String colour;
	public String gender;
	public int price;
	public Shoes() {}
	public Shoes(String brand, String colour, String gender, int price) 
	{
		this.brand = brand;
		this.colour = colour;
		this.gender = gender;
		this.price = price;
	}
	public String toString()
	{
		String res = "Shoe Brand Name is : "+this.brand+", its Colour is : "+this.colour+", Gender : "+this.gender+" and price is : "+this.price;
		return res;
	}
	public boolean equals(Object obj)
	{
		Shoes s = (Shoes) obj;
		return this.colour == s.colour;
	}
}
