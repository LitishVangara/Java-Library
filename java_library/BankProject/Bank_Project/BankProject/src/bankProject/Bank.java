package bankProject;
import java.util.Scanner;

public class Bank 
{
	static Scanner scan = new Scanner (System.in);
	public String name;
	public int accNo;
	public double bal;
	public Bank () {}
	static Bank store[] = new Bank[0];
	public Bank (String name, int accNo, double bal) 
	{
		this.name = name;
		this.accNo = accNo;
		this.bal = bal;
	}
	public void create()
	{
		Bank []temp = new Bank[store.length+1];
		for (int i = 0; i < store.length; i++) 
		{
			temp[i] = store[i];
		}
		System.out.println("Enter the Name : ");
		String name = scan.next();
		System.out.println("Account Number : ");
		int accNo = scan.nextInt();
		System.out.println("Enter the Balance : ");
		double bal = scan.nextDouble();
		temp[store.length] = new Bank (name, accNo, bal);
		store = temp;
	}
	public void print()
	{
		System.out.println("====================Details===================");
		for (int i = 0; i < store.length; i++) 
		{
			System.out.println("------------------------------------------------");
			System.out.println("Name : "+store[i].name);
			System.out.println("Account Number : "+store[i].accNo);
			System.out.println("Balance : "+store[i].bal);
			System.out.println("------------------------------------------------");
		}
	}
}
