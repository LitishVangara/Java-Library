package vectorPrograms1;

import java.util.Collections;
import java.util.Vector;

public class SortAnArray 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(60);
		v.add(30);
		v.add(50);
		System.out.println("Before Sorting : "+v);
		Collections.sort(v);
		System.out.println("After Sorting : "+v);
	}
}
