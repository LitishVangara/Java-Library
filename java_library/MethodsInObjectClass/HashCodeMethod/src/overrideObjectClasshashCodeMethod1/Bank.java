package overrideObjectClasshashCodeMethod1;

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
	public int hashCode()
	{
		return accNo;
	}
}
