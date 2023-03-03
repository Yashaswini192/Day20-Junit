package com.bl.junit.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import bl.junit.UserRegistrationException;
import bl.junit.User_Registration;

public class User_Registration_Test {

	User_Registration user1 = new User_Registration();

	@Test
	public void check_First_Name() throws UserRegistrationException {

		boolean firstname = user1.firstName();
		Assertions.assertEquals(true, firstname);
		
	}

	@Test
	public void check_Second_Name() throws UserRegistrationException{
		boolean lastname = user1.secondName();
		Assertions.assertEquals(true, lastname);
		
	}

	@Test
	public void check_Email() throws UserRegistrationException{
		boolean email = user1.checkEmail("yashaswini@gmail.com");
		Assertions.assertEquals(true , email,"yashaswini@gmail.com");
		
	}

	@Test
	public void check_Phone_Number() throws UserRegistrationException{
		boolean phonenumber = user1.phoneNumber();
		Assertions.assertEquals(true, phonenumber);
		
	}

	@Test
	public void check_Password() throws UserRegistrationException{
		boolean password = user1.password();
		Assertions.assertEquals(true ,password);
		
	}

}
