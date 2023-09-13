package iteratorExamplePrograms1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(54);
		al.add(89);
		al.add(26);
		al.add(73);
		System.out.println("Elements are : "+al);
		Iterator i = al.iterator();
		while (i.hasNext()) 
		{
			System.out.print(i.next()+" ");
		}
	}
}
