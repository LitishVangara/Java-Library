package overrideObjectClasshashCodeMethod4;

public class Bank {
	public String name;
	public int accNo;
	public int bal;
	public String ifsc;
	public Bank() {}
	public Bank(String name, int accNo, int bal, String ifsc) 
	{
		this.name = name;
		this.accNo = accNo;
		this.bal = bal;
		this.ifsc = ifsc;
	}
	public String toString() 
	{
		return "Bank [name=" + name + ", accNo=" + accNo + ", bal=" + bal + ", ifsc=" + ifsc + "]";
	}
	public boolean equals(Object obj)
	{
		Bank b = (Bank) obj;
		return this.bal == b.bal;
	}
	public int hashCode()
	{
		return accNo;
	}
}
