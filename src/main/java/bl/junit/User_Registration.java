package bl.junit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {
	Scanner s = new Scanner(System.in);

	public boolean firstName() {
		//UC1
		System.out.println("Enter FirstName:");
		String firstname = s.nextLine();

		try {
			boolean result = (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstname));

			if(!result) {
				return true;
			}	else {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRSTNAME,"Please Enter FIRST NAME");
			}
		}
		catch(UserRegistrationException e){
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRSTNAME,"Please Enter Valid Name");
		}	
	}

	public boolean secondName() {
		//UC2
		System.out.println("Enter SecondName:");
		String lastName = s.nextLine();
		try {
			boolean result1 = (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName));
			if(!result1) {
				return true;
			}	else {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.SECONDNAME," Enter second NAME");
			}
		}
		catch(UserRegistrationException e){
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.SECONDNAME,"Enter Valid second Name");
		}	

	}
	public boolean checkEmail(String email) {
		//UC3
		System.out.println("Enter Email:");
		email = s.nextLine();

		try {
			boolean result2 = (Pattern.matches("^[A-z]+[a-zA-Z0-9]*[-._+/]?+[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$", email));
			if(!result2) {

				return true;
			}	else {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMAIL,"Enter email");
			}
		}
		catch(UserRegistrationException e){
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMAIL," Enter valid emial");
		}	

	}

	public boolean phoneNumber() {
		//UC4
		System.out.println("enter PhoneNumber:");
		String phoneNumber = s.nextLine();
		try {
			boolean result3 = (Pattern.matches("^[0-91]{2}[\\s]?[0-9]{10}$", phoneNumber));
			if(!result3) {
				return true;
			}	else {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.PHONENUMBER," Enter Phonenumber");
			}
		}
		catch(UserRegistrationException e){
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.PHONENUMBER," Enter Valid Phonenumber");
		}	

	}

	public boolean password() {
		//UC5-password

		System.out.println("enter Password:");
		String password = s.nextLine();
		try {
			boolean result4 = (Pattern.matches("((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8}$)", password));
			if(!result4) {

				return true;
			}	else {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.PASSWORD," Enter Password");
			}
		}
		catch(UserRegistrationException e){
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.PASSWORD," Enter Valid Password");
		}	

	}

	public class MultipleEmailtest {
		private String email1;


		public MultipleEmailtest(String email1) {
			super();
			this.email1 = email1;
		}
	}

	public boolean checkSampleEmail(ArrayList<String> email) {
		System.out.println("Checking Sample Emails ");
		// array for emails
		email = new ArrayList<String>();
		// valid EmailIDs
		email.add("abc@yahoo.com");
		email.add("abc-100@yahoo.com");
		email.add("abc.100@yahoo.com");
		email.add("abc111@abc.com");
		email.add("abc-100@abc.net");
		email.add("abc.100@abc.com.au");
		email.add("abc@1.com");
		email.add("abc@gmail.com.com");
		email.add("abc+100@gmail.com");
		// invalid EmailIDs
		email.add("abc");
		email.add("abc..");
		email.add("abc..@gmail.com");
		email.add("abc@abc@gmail.com");
		email.add("abc@.com.my");
		email.add("abc123@gmail.a");
		email.add("abc123@.com");
		email.add("abc123@.com.com");
		email.add(".abc@abc.com");
		email.add("abc()*@gmail.com");
		email.add("abc..2002@gmail.com");
		email.add("abc.@gmail.com");
		email.add("abc@abc@gmail.com");
		email.add("abc@gmail.com.1a");
		email.add("abc..@gmail.com");
		email.add("abc@gmail.com.aa.au");

		String reGex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
		// Creating/Defining a pattern to be searched
		Pattern pattern = Pattern.compile(reGex);

		for (String str : email) {
			Matcher matcher = pattern.matcher(str);
			if (matcher.matches()) {
				System.out.println("valid email: " + str + " :" + matcher.matches());
			} else {
				System.out.println("Invalid email: " + str + " :" + matcher.matches());
			}
		}
		return true;


	}


}


