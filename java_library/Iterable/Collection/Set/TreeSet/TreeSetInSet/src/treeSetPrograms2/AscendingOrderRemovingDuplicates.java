package treeSetPrograms2;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AscendingOrderRemovingDuplicates 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(45);
		lhs.add(68);
		lhs.add(91);
		lhs.add(21);
		lhs.add(45);
		lhs.add(21);
		TreeSet ts = new TreeSet(lhs);
		System.out.println(ts);
	}
}
