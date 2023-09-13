package arrayInDecendingOrder;

public class DecendingOrder 
{
	public static void main(String[] args) 
	{
		int a[] = {67, 34, 23, 78, 18, 83, 5};
		for (int i = 0; i < a.length - 1; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]<a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Ater Sorting : ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
