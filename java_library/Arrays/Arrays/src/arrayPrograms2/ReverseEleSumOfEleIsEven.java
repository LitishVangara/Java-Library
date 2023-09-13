package arrayPrograms2;

public class ReverseEleSumOfEleIsEven {
	public static void main(String[] args) {
		int arr[] = {91,75,32,64,13};
		for (int i=0;i<arr.length;i++)
		{
			int n = arr[i];
			int sum = 0;
			int temp = arr[i];
			while (n!=0)
			{
				int lds = 0;
				lds = n%10;
				sum = sum + lds;
				n/=10;
			}
			if (sum%2==0)
			{
				int ld = 0;
				int rev = 0;
				while (sum!=0)
				{
					ld = sum % 10;
					rev = rev * 10 + ld;
					sum = sum/10;
				}
				System.out.println(rev+" ");
			}
			else
			{
				System.out.println(temp+" ");
			}
		}
	}
}
