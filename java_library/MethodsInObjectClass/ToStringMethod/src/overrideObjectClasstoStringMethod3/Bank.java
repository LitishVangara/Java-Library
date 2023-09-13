package overrideObjectClasstoStringMethod3;

public class Bank {
	public String name;
	public Bank() {}
	public Bank(String name) 
	{
		this.name = name;
	}
	public String toString()
	{
		String res = "Bank Name is : "+this.name;
		return res;
	}
}
