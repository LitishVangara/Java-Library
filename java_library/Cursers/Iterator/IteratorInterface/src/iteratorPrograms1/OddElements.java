package iteratorPrograms1;

import java.util.ArrayList;
import java.util.Iterator;

public class OddElements 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(86);
		al.add(23);
		al.add(90);
		al.add(71);
		al.add(57);
		System.out.println("Element are : "+al);
		Iterator i = al.iterator();
		while (i.hasNext()) 
		{
			int a = (int) i.next();
			if (a%2==1) 
			{
				System.out.print(a+" ");
			}
		}
	}
}
