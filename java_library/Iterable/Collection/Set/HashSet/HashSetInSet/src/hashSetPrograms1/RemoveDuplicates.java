package hashSetPrograms1;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(65);
		al.add(10);
		al.add(65);
		al.add(50);
		al.add(10);
		al.add(66);
		System.out.println("Before Removing Duplicates : "+al);
		HashSet hs = new HashSet(al);
		System.out.println("After Removing Duplicates : "+hs);
	}
}
