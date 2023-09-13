package printArrayElements;

public class Evene {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 5, 8, 13};
		for (int i = 0; i<a.length; i++)
		{
			if (a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
