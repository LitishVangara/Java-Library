package vectorPrograms1;

import java.util.Scanner;
import java.util.Vector;

public class PrimeNumberVector 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		Vector v = new Vector();
		while (true) 
		{
			System.out.println("Enter the Value : ");
			System.out.println("--------------------------------------");
			v.add(scan.nextInt());
			System.out.println("Enter 'y' to continue or 'n' for stop.");
			String s = scan.next();
			if (s.equalsIgnoreCase("y")) 
			{
				continue;
			}
			else
			{
				break;
			}
		}
		int m = (Integer) v.firstElement();
		int n = (Integer) v.lastElement();
		System.out.println("The prime numbers between first and second element in the vector are : ");
		for (int a=m;a<=n;a++)
		{
            int count =0;
			for (int i=1;i<=a;i++)
			{
				if (a%i==0)
			    {   
                    count++;
			    }
			}
			if (count==2)
		    {
				System.out.print(a+" ");
	        }
		}
	}
}
