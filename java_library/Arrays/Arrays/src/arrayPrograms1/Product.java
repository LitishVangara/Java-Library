package arrayPrograms1;

public class Product {
	public static void main(String[] args) {
		int a[] = {8, 5, 6};
		int pro = 1;
		for (int i = 0; i<a.length; i++)
		{
			pro = a[i] * pro;
		}
		System.out.println(pro);
	}
}
