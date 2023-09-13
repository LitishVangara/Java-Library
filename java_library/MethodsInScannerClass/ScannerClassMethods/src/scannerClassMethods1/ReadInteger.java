package scannerClassMethods1;
import java.util.Scanner;
public class ReadInteger {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Interger value : ");
		int value = scan.nextInt();
		System.out.println("The Interger value is : "+value);
	}
}
