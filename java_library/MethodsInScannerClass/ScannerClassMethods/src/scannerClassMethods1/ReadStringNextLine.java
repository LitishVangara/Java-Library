package scannerClassMethods1;
import java.util.Scanner;
public class ReadStringNextLine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String value : ");
		String value = scan.nextLine();
		System.out.println("The String value is : "+value);
	}
}
