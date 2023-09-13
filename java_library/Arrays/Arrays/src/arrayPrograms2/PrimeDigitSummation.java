package arrayPrograms2;

public class PrimeDigitSummation {
	public static void main(String[] args) {
		int arr[] = {72,29,17,23,67,59};
		for (int j=0;j<arr.length;j++)
		{
			int n = arr[j];
			int ld = 0;
			int sum = 0;
			while (n!=0)
			{
				ld = n % 10;
				int count =0;
				for (int a=1;a<=ld;a++)
				{
					if (ld%a==0)
					{
						count++;
					}
				}
				if (count==2)
				{
					sum = sum + ld;
				}
				n/=10;
			}
			System.out.println(sum);
		}
	}
}