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


	@Test
	public void check_First_Name() throws UserRegistrationException {

		User_Registration name = new User_Registration();

		Assertions.assertEquals("Yashaswini", name.firstname.lambda("Yashaswini"));

	}

	@Test
	public void check_Second_Name() throws UserRegistrationException{

		User_Registration secondName = new User_Registration();

		Assertions.assertEquals("Voruganti", secondName.secondName.lambda("Voruganti"));

	}

	@Test
	public void check_Email() throws UserRegistrationException{

		User_Registration email = new User_Registration();

		Assertions.assertEquals("yash@gmail.com", email.email.lambda("yash@gmail.com"));

	}

	@Test
	public void check_Phone_Number() throws UserRegistrationException{

		User_Registration phoneNumber = new User_Registration();

		Assertions.assertEquals("91 9666324594", phoneNumber.phoneNumber.lambda("91 9666324594"));

	}

	@Test
	public void check_Password() throws UserRegistrationException{

		User_Registration password = new User_Registration();

		Assertions.assertEquals("Tgsy6%gs", password.password.lambda("Tgsy6%gs"));

	}

}
