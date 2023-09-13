package linkedHashMapPrograms1;

import java.util.LinkedHashMap;

public class LinkedHashMapExample 
{
	public static void main(String[] args) 
	{
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(117, 'g');
		lhm.put(105, "Hello");
		lhm.put('b', "bye");
		lhm.put(11.1, 56);
		lhm.put("hey", "hi");
		System.out.println(lhm);
	}
}
