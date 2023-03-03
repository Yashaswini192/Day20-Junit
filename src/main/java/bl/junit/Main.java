package bl.junit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Regex");
		
		User_Registration user = new  User_Registration();
		user.firstName();
		user.secondName();
		user.checkEmail();
		user.phoneNumber();
		user.password();
		user.checkSampleEmail();
	
	}
}
