package overrideObjectClasstoStringMethod5;

public class Bike {
	public String brand;
	public String brakeType;
	public String wheels;
	public Bike () {}
	public Bike(String brand, String brakeType, String wheels) 
	{
		this.brand = brand;
		this.brakeType = brakeType;
		this.wheels = wheels;
	}
	public String toString()
	{
		String res = "Bike brand is : "+this.brand+", Braketype is : "+this.brakeType+" and Wheels are : "+this.wheels;
		return res;
	}
}
