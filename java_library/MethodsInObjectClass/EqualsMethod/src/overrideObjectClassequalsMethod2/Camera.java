package overrideObjectClassequalsMethod2;

public class Camera {
	public String name;
	public int pixel;
	public int price;
	public int battery;
	public Camera() {}
	public Camera(String name, int pixel, int price, int battery) 
	{
		this.name = name;
		this.pixel = pixel;
		this.price = price;
		this.battery = battery;
	}
	public String toString() 
	{
		return "Camera [name=" + name + ", pixel=" + pixel + ", price=" + price + ", battery=" + battery + "]";
	}
	public boolean equals(Object obj) 
	{
		Camera c = (Camera) obj;
		return this.pixel == c.pixel;
	}
		
}
