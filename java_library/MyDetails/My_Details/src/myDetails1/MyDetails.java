package myDetails1;
import java.util.Scanner;
public class MyDetails {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name = scan.nextLine();
		System.out.println("Enter your Age : ");
		int age = scan.nextInt();
		System.out.println("Enter your Mobile Number : ");
		long number = scan.nextLong();
		System.out.println("Enter your Email : ");
		scan.nextLine();
		String email = scan.next();
		System.out.println("Enter your Address : ");
		scan.nextLine();
		String address = scan.nextLine();
		System.out.println("Enter your Gender : ");
		String gender = scan.nextLine();
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Mobile Number : "+number);
		System.out.println("Email : "+email);
		System.out.println("Address : "+address);
		System.out.println("Gender : "+gender);
	}
}
