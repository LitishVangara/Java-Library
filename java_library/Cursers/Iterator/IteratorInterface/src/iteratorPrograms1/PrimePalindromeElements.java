package iteratorPrograms1;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimePalindromeElements 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(101);
		al.add(201);
		al.add(131);                //11, 181, 131, 151, 181, 191, 313, 353, 373, 383, 727, 757, 787, 797, 919, 929.
		al.add(89);
		al.add(515);
		al.add(16);
		System.out.println("Element are : "+al);
		Iterator i = al.iterator();
		while (i.hasNext()) 
		{
			int a = (int) i.next();
			int num = a;
			int ld = 0;
			int reverse = 0;
			int temp=num;
			int num1 = num;
			while (temp!=0)
			{
				ld = temp%10;
				reverse = reverse*10+ld;
				temp = temp/10;
			}
			if (num==reverse)
			{
				int count =0;
			    for (int b=1;b<=num1;b++)
			    {
					if (num1%b==0)
					{ 
						count++;
					}
				}
				if (count==2)
				{
					System.out.println("Prime Palindrome Elements are : "+num1);
				}
			}
		}
	}
}
