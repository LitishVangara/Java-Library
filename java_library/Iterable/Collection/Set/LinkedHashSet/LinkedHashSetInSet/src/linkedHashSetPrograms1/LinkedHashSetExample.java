package linkedHashSetPrograms1;

import java.util.LinkedHashSet;

public class LinkedHashSetExample 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Hello");
		lhs.add('R');
		lhs.add(45.8);
		lhs.add(false);
		lhs.add('R');
		lhs.add(234);
		lhs.add(false);
		System.out.println(lhs);
	}
}
