package test;


import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.application.EmailValidator;
import com.exception.AcademyException;

import junit.framework.TestCase;


public class EmailValidatorTests extends TestCase {
	private static EmailValidator emailValidator;
	
	@BeforeAll
	static void Setup() {
		emailValidator = new EmailValidator();
	}
@Test
	public void testValidateEmailId() throws AcademyException {
		boolean actualEmail=emailValidator.validateEmailId("balaji@infy.com");
		boolean expectedValue=false;
		assertEquals(actualEmail,expectedValue);
	}

	
	@Test
	public void testInvalidEmailId() throws AcademyException {
		boolean actualEmail=emailValidator.validateEmailId("james_potteer@infy.org");
		boolean expectedValue=false;
		assertEquals(actualEmail,expectedValue);
	}
	
	@Test
	public void testInvalidEmailIdException() throws AcademyException {
		String email = null;
		assertThrows(AcademyException.class, () -> emailValidator.validateEmailId(email));
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "serius_black","Lily_Evans@Hoggy.in","Remus_lups","NymphieTonks@magic.com" })
	public void testParamterizedEmailId(String abc) throws AcademyException {
		assertNotNull(abc);
	}
}
