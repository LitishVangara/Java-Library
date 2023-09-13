package scannerClassMethods1;

import java.util.Scanner;

public class ReadCharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character value : ");
		char value = scan.next().charAt(0);
		System.out.println("The Character value is : "+value);
	}
}
