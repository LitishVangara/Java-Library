package overrideObjectClasshashCodeMethod3;

public class Bike {
	public String brand;
	public String brakeType;
	public String wheels;
	public int price;
	public Bike () {}
	public Bike(String brand, String brakeType, String wheels, int price) 
	{
		this.brand = brand;
		this.brakeType = brakeType;
		this.wheels = wheels;
		this.price = price;
	}
	public String toString()
	{
		String res = "Bike brand is : "+this.brand+", Braketype is : "+this.brakeType+" and Wheels are : "+this.wheels;
		return res;
	}
	public int hashCode() 
	{
		return price;
	}
	public boolean equals(Object obj) 
	{
		Bike b = (Bike) obj;
		return this.price == b.price;
	}
	
}
