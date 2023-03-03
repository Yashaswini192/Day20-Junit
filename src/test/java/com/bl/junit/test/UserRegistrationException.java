package com.bl.junit.test;

public class UserRegistrationException extends RuntimeException {
	enum ExceptionType{
		FIRSTNAME,SECONDNAME, EMAIL,PHONENUMBER,PASSWORD
	}
	ExceptionType Type;
	
	public UserRegistrationException(ExceptionType type, String message) {
		super(message);
		this.Type= type;
	}

}
