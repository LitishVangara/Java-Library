package removeAllMethod;

import java.util.ArrayList;

public class RemoveAllMethod 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(40);
		al.add(60);
		al.add(100);
		al.add(40);
		al.add(100);
		System.out.println("al : "+al);
		ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(40);
		System.out.println("al1 : "+al1);
		al.removeAll(al1);
		System.out.println("al : "+al1);
	}
}
