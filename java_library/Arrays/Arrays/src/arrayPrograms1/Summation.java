package arrayPrograms1;
//import java.util.Scanner;

public class Summation {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		int a[] = {8, 5, 6, 3, 56, 65};
		int sum = 0;
		//System.out.println("Enter array Elements : ");
		for (int i = 0; i<a.length; i++)
		{
			sum = a[i] + sum;
		}
		System.out.println(sum);
	}
}
