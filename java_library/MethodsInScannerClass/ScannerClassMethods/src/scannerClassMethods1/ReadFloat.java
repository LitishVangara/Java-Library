package scannerClassMethods1;

import java.util.Scanner;

public class ReadFloat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Float value : ");
		float value = scan.nextFloat();
		System.out.println("The Float value is : "+value);
	}
}
