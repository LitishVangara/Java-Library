package scannerClassMethods1;

import java.util.Scanner;

public class ReadByte {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Byte value : ");
		byte value = scan.nextByte();
		System.out.println("The Byte value is : "+value);
	}
}
