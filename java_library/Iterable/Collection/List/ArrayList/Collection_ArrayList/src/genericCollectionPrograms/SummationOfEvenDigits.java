package genericCollectionPrograms;

import java.util.ArrayList;

public class SummationOfEvenDigits 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(68);
		al.add(11);
		al.add(16);
		al.add(27);
		System.out.println("Elements are : "+al);
		int sum = 0;
		for (int i = 0; i < al.size(); i++) 
		{
			int a = al.get(i);
			while (a!=0) 
			{
				int digit = a%10;
				if (digit%2==0) 
				{
					sum +=digit;
				}
				a /=10;
			}
		}
		System.out.println("The sun is : "+sum);
	}
}
