package linkedHashSetPrograms1;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add('A');
		al.add('E');
		al.add('A');
		al.add('I');
		al.add('O');
		al.add('E');
		al.add('U');
		LinkedHashSet lhs = new LinkedHashSet(al);
		System.out.println(lhs);
	}
}
