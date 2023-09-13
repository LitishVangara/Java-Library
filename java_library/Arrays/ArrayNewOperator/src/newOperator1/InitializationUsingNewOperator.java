package newOperator1;

import java.util.Scanner;

public class InitializationUsingNewOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Size : ");
		int size = scan.nextInt();
		double d[] = new double[size];
		for (int i=0;i<d.length;i++)
		{
			System.out.println("Enter the vlaues for Indexes : ");
			d[i] = scan.nextDouble();
		}
		System.out.println("Elements are : ");
		for (int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
	}
}
