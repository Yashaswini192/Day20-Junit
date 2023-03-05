package bl.junit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {


	public Lambda  firstname = result ->{
		try {

			if(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", result)) {
				return result;
				//System.out.println(result);
			}	else {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRSTNAME,"Please Enter FIRST NAME");
			}
		}
		catch(UserRegistrationException e){
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRSTNAME,"Please Enter Valid Name");
		}	
	};

	public Lambda secondName = result1 -> {
		try {
			if(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", result1))
			{
				return result1;
			}	else {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.SECONDNAME," Enter second NAME");
			}
		}
		catch(UserRegistrationException e){
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.SECONDNAME,"Enter Valid second Name");
		}
	};

	public Lambda email = result2 -> {
		try {
			if(Pattern.matches("^[A-z]+[a-zA-Z0-9]*[-._+/]?+[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$", result2)){

				return result2;
			}	else {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMAIL,"Enter email");
			}
		}
		catch(UserRegistrationException e){
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMAIL," Enter valid emial");
		}
	};	

	public Lambda phoneNumber = result3 -> {
		try {
			if(Pattern.matches("^[0-91]{2}[\\s]?[0-9]{10}$", result3)){
				return result3;
			}	else {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.PHONENUMBER," Enter Phonenumber");
			}
		}
		catch(UserRegistrationException e){
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.PHONENUMBER," Enter Valid Phonenumber");
		}
	};

	public Lambda password = result1 -> {
		try {
			if(Pattern.matches("((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8}$)", result1)) {

				return result1;
			}	else {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.PASSWORD," Enter Password");
			}
		}
		catch(UserRegistrationException e){
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.PASSWORD," Enter Valid Password");
		}	

	};
}


/*	public class MultipleEmailtest {
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
 */


