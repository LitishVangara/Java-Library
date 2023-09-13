package hashtablePrograams1;

import java.util.Hashtable;

public class HashTableExample 
{
	public static void main(String[] args) 
	{
		Hashtable ht = new Hashtable();
		ht.put(new HashTable(26), 'O');
		ht.put(new HashTable(2), 'A');
		ht.put(new HashTable(5), 'I');
		ht.put(new HashTable(16), 'E');
		ht.put(new HashTable(3), 'U');
		ht.put(new HashTable(21), 'A');
		System.out.println(ht);
	}
}
