package overrideObjectClassequalsMethod5;

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
	public boolean equals(Object obj)
	{
		Bank b = (Bank) obj;
		return this.name == b.name;
	}
}
