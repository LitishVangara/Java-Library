package listIteratorPrograms1;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample 
{
	public static void main(String[] args) 
	{
		LinkedList ls = new LinkedList();
		ls.add(56.6);
		ls.add("bye");
		ls.add(false);
		ls.add('M');
		ls.add(26);
		System.out.println("In Forward Direction : ");
		ListIterator li1 = ls.listIterator();
		while (li1.hasNext()) 
		{
			System.out.print(li1.next()+" ");
		}
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("In Backword Direction : ");
		ListIterator li = ls.listIterator(ls.size());
		while (li.hasPrevious()) 
		{
			System.out.print(li.previous()+" ");
		}
		System.out.println();
		System.out.println("------------------------------");
	}
}
