package test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.application.PasswordValidator;
import com.exception.AcademyException;

import junit.framework.TestCase;

public class PasswordValidatorTest extends TestCase {

static PasswordValidator passwordValidator;
	
	@BeforeAll
	static void SetUp()  {
		passwordValidator = new PasswordValidator();
	}

	

	@Test
	void testValidatePassword() throws  AcademyException {
		assertTrue(passwordValidator.validatePassword("Asdf1234"));
	}

	@Test
	void testInvalidValidatePassword() throws  AcademyException {
		assertTrue(passwordValidator.validatePassword("asdf"));
	}
	
	
	@Test
	public void validatePasswordInvalidPasswordException() throws AcademyException {
		String passString = null;
		assertThrows(AcademyException.class, () -> passwordValidator.validatePassword(passString));
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "Qwerty","Qwerty1234","Qwertyxdfgsdfdsfdsf","zxcv12365" })
	public void validatePasswordParameterizedPassword(String abc) throws AcademyException {
		assertNotNull(abc);
	}

}
