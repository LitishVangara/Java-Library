package arrayPrograms2;

public class PrimeElements {
	public static void main(String[] args) {
		int arr[] = {1,3,5,7,12,11,13,18,29};
		for (int j=0;j<arr.length;j++)
		{
			int n = arr[j];
			int count = 0;
			for (int i=1;i<=n;i++)
			{
				if (n%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println("Prime Numbers are : "+arr[j]);
			}
		}
	}
}
