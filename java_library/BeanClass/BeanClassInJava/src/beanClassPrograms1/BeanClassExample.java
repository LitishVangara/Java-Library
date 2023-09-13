package beanClassPrograms1;

public class BeanClassExample 
{
	public static void main(String[] args) 
	{
		Bank b = new Bank();
		b.setName("Litish");
		System.out.println(b.getName());
		b.setAccNo(1000);
		System.out.println(b.getAccNo());
		b.setBal(1000);
		System.out.println(b.getBal());
	}
}
