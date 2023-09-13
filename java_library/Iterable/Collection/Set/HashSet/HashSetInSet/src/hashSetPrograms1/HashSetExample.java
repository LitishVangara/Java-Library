package hashSetPrograms1;

import java.util.HashSet;

public class HashSetExample 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add(20);
		System.out.println(hs.add("Hello"));
		hs.add(false);
		hs.add('r');
		hs.add(null);
		hs.add(569.9);
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.add("Hello"));
		System.out.println(hs);
	}
}
