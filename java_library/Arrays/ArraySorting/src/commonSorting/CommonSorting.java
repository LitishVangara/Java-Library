package commonSorting;

public class CommonSorting 
{
	public static void main(String[] args) 
	{
		int a[] = {67, 34, 23, 78, 18, 83, 5};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if (a[i]<a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After Sorting : ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
