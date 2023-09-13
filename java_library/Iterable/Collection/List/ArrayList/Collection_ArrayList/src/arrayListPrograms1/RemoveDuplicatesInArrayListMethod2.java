package arrayListPrograms1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInArrayListMethod2 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(50);
		System.out.println("Before Removing Duplicates : "+al);
		Set s = new LinkedHashSet(al);
		System.out.println("After Removing Duplicates : "+s);
	}
}
