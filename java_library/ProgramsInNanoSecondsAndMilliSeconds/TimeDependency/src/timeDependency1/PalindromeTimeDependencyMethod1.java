package timeDependency1;
import java.util.Scanner;
public class PalindromeTimeDependencyMethod1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long time = System.currentTimeMillis();
		long nanoTime = System.nanoTime();
		System.out.println("Enter the Value : ");
		int num = scan.nextInt();
		int temp = num;
		int reverse = 0;
		int ld = 0;
		while (num!=0)
		{
			ld = num%10;
			reverse = reverse*10+ld;
			num/=10;
		}
		if (temp==reverse)
		{
			System.out.println("It is a Palindrome Number.");
		}
		else
		{
			System.out.println("It is not a Palindrome Number.");
		}
		System.out.println("Time taken to Execute the Program in Milli Seconds = "+(System.currentTimeMillis()-time)+" Milli Seconds.");
		System.out.println("Time taken to Execute the Program in Nano Seconds = "+(System.nanoTime()-nanoTime)+" Nano Seconds.");
	}
}
