package com.application;
import java.util.Objects;

import com.exception.AcademyException;

public class EmailValidator {
	public static boolean validateEmailId(String emailId) throws AcademyException {

		if (Objects.isNull(emailId) || emailId.equals(" "))
			throw new AcademyException("Invalid Email ID");
		return emailId.matches("^(.+)@(\\S+).(com|in)$");
	}
}
