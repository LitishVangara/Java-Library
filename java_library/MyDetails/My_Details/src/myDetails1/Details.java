package myDetails1;
import java.util.Scanner;
public class Details {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your Mobile Number : ");
		long number = scan.nextLong();
		System.out.println("Enter Email : ");
		scan.nextLine();
		String email = scan.nextLine();
		System.out.println("Enter Password : ");
		String password = scan.nextLine();
		System.out.println("Enter Confirm Password : ");
		String cpassword = scan.nextLine();
		System.out.println("Mobile Number : "+number);
		System.out.println("Email : "+email);
		System.out.println("Passowrd : "+password);
		System.out.println("Confirm Password : "+cpassword);
	}

}
