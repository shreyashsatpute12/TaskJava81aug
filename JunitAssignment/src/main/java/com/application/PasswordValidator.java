package com.application;

import java.util.Objects;

import com.exception.AcademyException;



public class PasswordValidator {
	public boolean validatePassword(String password) throws AcademyException {
		if (Objects.isNull(password) || password.equals(" "))
			throw new AcademyException("Invalid Password.");
		return password.matches("[A-Za-z0-9]{8,20}");
	}
}
