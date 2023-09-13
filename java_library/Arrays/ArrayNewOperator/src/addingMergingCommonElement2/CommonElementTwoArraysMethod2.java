package addingMergingCommonElement2;

public class CommonElementTwoArraysMethod2 
{
	public static void main(String[] args) 
	{
		int a[] = {10,50,70,30,10};
		int b[] = {30,10,50};
		for (int i = 0; i < b.length; i++) 
		{
			int count = 0;
			for (int j = 0; j < a.length; j++) 
			{
				if (b[i] == a[j]) 
				{
					count++;
				}
			}
			if (count>0) 
			{
				System.out.print(b[i]+" ");
			}
		}
		System.out.println();
	}
}
