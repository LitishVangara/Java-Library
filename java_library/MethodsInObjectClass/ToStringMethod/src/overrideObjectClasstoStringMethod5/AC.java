package overrideObjectClasstoStringMethod5;

public class AC {
	public  String brand;
	public int price;
	public double capacity;
	public String technology;
	public String condenserCoil;
	public AC () {}
	public AC(String brand, int price, double capacity, String technology, String condenserCoil) 
	{
		this.brand = brand;
		this.price = price;
		this.capacity = capacity;
		this.technology = technology;
		this.condenserCoil = condenserCoil;
	}
	public String toString()
	{
		String res = "Brand Name : "+this.brand+", its capacity is : "+this.capacity+" and its Price is : "+this.price;
		return res;
	}
}
