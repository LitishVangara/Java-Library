package treeSetPrograms2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class DuplicateElementsInDescendingOrder 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.add(45);
		ll.add(68);
		ll.add(69);
		ll.add(91);
		ll.add(21);
		ll.add(45);
		ll.add(68);
		ll.add(23);
		ll.add(21);
		ll.add(91);
		duplicates(ll);
	}
	public static void duplicates(Collection obj)
	{
		HashSet set = new HashSet();
		ArrayList al = new ArrayList();
        for (Object num : obj) 
        {
            if (!set.add(num)) 
            {
            	al.add(num);
            }
        }
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);
	}
}
