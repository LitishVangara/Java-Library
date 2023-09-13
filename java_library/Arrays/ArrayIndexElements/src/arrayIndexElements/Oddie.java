package arrayIndexElements;

public class Oddie {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 5, 8, 10};
		for (int i = 0; i<a.length; i++)
		{
			if (i%2==1)
			{
				System.out.println(a[i]);
			}
		}
	}
}
