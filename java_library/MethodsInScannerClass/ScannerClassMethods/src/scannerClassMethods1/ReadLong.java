package scannerClassMethods1;

import java.util.Scanner;

public class ReadLong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Long value : ");
		long value = scan.nextLong();
		System.out.println("The Long value is : "+value);
	}
}
