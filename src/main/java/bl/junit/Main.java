package bl.junit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Regex");
		
		User_Registration user = new  User_Registration();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter FirstName:");
		String firstName = s.nextLine();
		System.out.println("Enter SecondName:");
		String secondName = s.nextLine();
		System.out.println("Enter Email:");
		String email = s.nextLine();
		System.out.println("enter PhoneNumber:");
		String phoneNumber = s.nextLine();
		System.out.println("enter Password:");
		String password = s.nextLine();
	}
}
