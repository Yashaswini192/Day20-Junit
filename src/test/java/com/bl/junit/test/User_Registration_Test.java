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

import bl.junit.User_Registration;

public class User_Registration_Test {

	User_Registration user1 = new User_Registration();

	@Test
	public void check_First_Name() {

		boolean firstname = user1.firstName();
		Assertions.assertEquals(true, firstname);
		//Assertions.assertEquals(false, firstname);
	}

	@Test
	public void check_Second_Name() {
		boolean lastname = user1.secondName();
		Assertions.assertEquals(true, lastname);
		//Assertions.assertEquals(false, lastname);
	}

	@Test
	public void check_Email() {
		boolean email = user1.checkEmail("yashaswini@gmail.com");
		Assertions.assertEquals(true , email,"yashaswini@gmail.com");
		//Assertions.assertEquals(false, email);
	}

	@Test
	public void check_Phone_Number() {
		boolean phonenumber = user1.phoneNumber();
		Assertions.assertEquals(true, phonenumber);
		//Assertions.assertEquals(false, phonenumber);
	}

	@Test
	public void check_Password() {
		boolean password = user1.password();
		Assertions.assertEquals(true ,password);
		//Assertions.assertEquals(false, password);
	}

}
