package hashMapPrograms1;

import java.util.HashMap;

public class HashMapExample 
{
	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		hm.put(117, "Hello");
		hm.put(102, 100);
		hm.put(105, "jspiders");
		hm.put('a', "hai");
		hm.put(103, "bye");
		hm.put(null, "xyz");
		hm.put(null, "abc");
		System.out.println(hm);
	}
}
