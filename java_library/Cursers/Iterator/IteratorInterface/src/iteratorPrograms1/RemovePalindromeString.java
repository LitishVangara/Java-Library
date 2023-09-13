package iteratorPrograms1;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovePalindromeString 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("hello");
		al.add("dad");
		al.add("jspiders");
		al.add("mom");
		al.add("jntu");
		System.out.println("Elements are : "+al);
		Iterator i = al.iterator();
		while (i.hasNext()) 
		{
			String s = (String) i.next();
			StringBuffer sb = new StringBuffer(s);
			String rev = sb.reverse().toString();
			if (s.equalsIgnoreCase(rev)) 
			{
				i.remove();
			}
		}
		System.out.println("After Removing Palindromes : "+al);
	}
}
