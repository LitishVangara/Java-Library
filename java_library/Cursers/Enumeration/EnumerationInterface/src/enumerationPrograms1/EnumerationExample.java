package enumerationPrograms1;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add('a');
		v.add('e');
		v.add('i');
		v.add('o');
		v.add('u');
		System.out.println("Elements are : ");
		Enumeration e = v.elements();
		while (e.hasMoreElements()) 
		{
			System.out.println(e.nextElement());
		}
	}
}
