package arrayListPrograms1;

import java.util.ArrayList;

public class FiveHeterogenousValuesToArray 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Hai");
		al.add('H');
		al.add(10.9);
		al.add("Hello");
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		
	}
}
