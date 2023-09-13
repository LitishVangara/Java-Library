package scannerClassMethods1;
import java.util.Scanner;
public class ReadDouble {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Double value : ");
		double value = scan.nextDouble();
		System.out.println("The Double value is : "+value);
	}
}
