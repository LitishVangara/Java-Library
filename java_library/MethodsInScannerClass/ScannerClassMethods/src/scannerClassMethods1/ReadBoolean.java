package scannerClassMethods1;
import java.util.Scanner;
public class ReadBoolean {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Boolean value : ");
		boolean value = scan.nextBoolean();
		System.out.println("The Boolean value is : "+value);
	}
}
