package iteratorPrograms1;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeElementSummation 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(89);
		al.add(23);
		al.add(2);
		al.add(7);
		al.add(50);
		al.add(56);
		System.out.println("Element are : "+al);
		Iterator i = al.iterator();
		int sum = 0;
		while (i.hasNext()) 
		{
			int num = (int) i.next();
			int f= num;
			int count =0;
			for (int a=1;a<=f;a++)
			{
				if (f%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println("Prime Elements are : "+f);
				sum = sum + f;
			}
		}
		System.out.println("The Sum of Prime Elements is : "+sum);
	}
}
