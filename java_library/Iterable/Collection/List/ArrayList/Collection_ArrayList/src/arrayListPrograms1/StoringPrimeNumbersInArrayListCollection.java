package arrayListPrograms1;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringPrimeNumbersInArrayListCollection 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		ArrayList al = new ArrayList();
		int m = 1;
		System.out.println("Enter the Maximum Value : ");
		int n=scan.nextInt();
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
				al.add(a);
		    }
		}
		System.out.print("The Prime Numbers which are Stored in a Array List Collection are : ");
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.print(al.get(i)+" ");
		}
	}
}
