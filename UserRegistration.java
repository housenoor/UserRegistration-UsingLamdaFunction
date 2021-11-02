package com.bl.lamdafunction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateName(String name) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);

		// Returns false if user does not enter any name.
		if (name.isEmpty())
			return false;

		Matcher matcher = pattern.matcher(name);
		return matcher.matches();

	}

	public boolean validateEmail(String mail) {
		String regex = "^[0-9A-Za-z]+(([._+-]{0,1})[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mail);
		return matcher.matches();
	}

	public boolean validateMobileNumber(String mobileNumber) {
		// Space is not used, as console wont accept space.
		String regex = "^(91)[\\s][0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}

	public boolean validatePassword(String password) {
		String regex = ("^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$");
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
}