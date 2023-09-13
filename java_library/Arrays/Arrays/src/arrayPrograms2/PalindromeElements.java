package arrayPrograms2;

public class PalindromeElements {
	public static void main(String[] args) {
		int arr[] = {121,858,3553,565,8998,5335,131,141,515};
		for (int j=0;j<arr.length;j++)
		{
			int n = arr[j];
			int temp = n;
			int reverse = 0;
			int ld = 0;
			for (int i=0;i<=n;i++)
			{
				ld = n%10;
				reverse = reverse * 10+ld;
				n = n/10;
			}
			if (reverse==temp)
			{
				System.out.println(arr[j]+"is a Palindrome.");
			}
		}
	}
}
