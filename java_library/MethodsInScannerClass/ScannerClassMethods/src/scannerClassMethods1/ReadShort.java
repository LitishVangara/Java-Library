package scannerClassMethods1;

import java.util.Scanner;

public class ReadShort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Short value : ");
		short value = scan.nextShort();
		System.out.println("The short value is : "+value);
	}
}
