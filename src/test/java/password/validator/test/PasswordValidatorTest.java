package password.validator.test;

import org.junit.Test;

import com.password.validator.ms.exception.NotAcceptableException;
import com.password.validator.ms.model.Password;
import com.password.validator.ms.service.PasswordValidatorService;

public class PasswordValidatorTest {

	@Test(expected = NotAcceptableException.class)
	public void testEightCharactersThrowException() {
		PasswordValidatorService service = new PasswordValidatorService();
		
		service.validation(new Password("12345678"), null);
	}
	
	@Test(expected = NotAcceptableException.class)
	public void testNoUpperCaseCharacterThrowException() {
		PasswordValidatorService service = new PasswordValidatorService();
		
		service.validation(new Password("123456789a#"), null);
	}
	
	@Test(expected = NotAcceptableException.class)
	public void testNoLowerCaseCharacterThrowException() {
		PasswordValidatorService service = new PasswordValidatorService();
		
		service.validation(new Password("123456789A#"), null);
	}
	
	@Test(expected = NotAcceptableException.class)
	public void testNoDigitThrowException() {
		PasswordValidatorService service = new PasswordValidatorService();
		
		service.validation(new Password("aaaaaaaaA#"), null);
	}
	
	@Test(expected = NotAcceptableException.class)
	public void testNoSpecialCharacterThrowException() {
		PasswordValidatorService service = new PasswordValidatorService();
		
		service.validation(new Password("123456789Aa"), null);
	}
	
	@Test
	public void testValidPassword() {
		PasswordValidatorService service = new PasswordValidatorService();
		
		service.validation(new Password("123456789Aa#"), null);
	}
}
