package bubbleSorting;

public class BubbleSorting 
{
	public static void main(String[] args) 
	{
		int a[] = {45, 78, 23, 67, 10, 34, 55};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]>a[j]) 
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
	}
}
