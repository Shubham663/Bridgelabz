package bridgelabz.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AssertionTest11{
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String password;
	
	public AssertionTest11(final String firstName,final String lastName,
			final String email, final String mobile,final String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}

	@Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][]{{"Shubham","Mittal","abc@yahoo.com","91 9876543210","abcS9edff"},
											{"Shubham","Mittal","abc-100@yahoo.com","91 9876543210","abcS9edff"},
											{"Shubham","Mittal","abc.100@yahoo.com","91 9876543210","abcS9edff"},
											{"Shubham","Mittal","abc111@yahoo.com","91 9876543210","abcS9edff"},
											{"Shubham","Mittal","abc-100@abc.net","91 9876543210","abcS9edff"},
											{"Shubham","Mittal","abc.100@abc.com.au","91 9876543210","abcS9edff"},
											{"Shubham","Mittal","abc@1.com","91 9876543210","abcS9edff"},
											{"Shubham","Mittal","abc@gmail.com.com","91 9876543210","abcS9edff"},
											{"Shubham","Mittal","abc+100@gmail.com","91 9876543210","abcS9edff"},
							   });
	}
	
	@Test
	public void lastNameTest_True() {
		final String type1 = "[A-Z]{1}[a-zA-Z0-9]{2,}";
//		lastName = "Mittal";
		assertTrue("last name not satisfying first letter capital and"
				+ " atleast 3 characters ",lastName.matches(type1));
	}
	
	@Test
	public void lastNameTest_False() {
		final String type1 = "[A-Z]{1}[a-zA-Z0-9]{2,}";
		lastName = "mittal";
		assertFalse("last name not satisfying first letter capital and"
				+ " atleast 3 characters ",lastName.matches(type1));
	}
	
	@Test
	public void firstNameTest_True() {
		final String type1 = "[A-Z]{1}[a-zA-Z0-9]{2,}";
//		firstName = "Shubham";
		assertTrue("first name not satisfying first letter capital and"
				+ " atleast 3 characters ",firstName.matches(type1));
	}
	
	@Test
	public void firstNameTest_False() {
		final String type1 = "[A-Z]{1}[a-zA-Z0-9]{2,}";
		firstName = "Sh";
		assertFalse("first name not satisfying first letter capital and"
				+ " atleast 3 characters ",firstName.matches(type1));
	}
	
	@Test
	public void emailTest_True() {
		final String type2 = "^[a-zA-Z0-9|_|-][a-zA-Z0-9|_|-|\\+]*(\\.)?[a-zA-Z0-9|_|-]{1,}\\@[0-9a-zA-Z]{1,}\\.[a-zA-Z]{2,}(\\.)?[a-zA-Z]*$";
//		email = "mittal@gmail.com";
		assertTrue("the email does not match the required format",email.matches(type2));
	}
	
	@Test
	public void emailTest_False() {
		final String type2 = "^[a-zA-Z0-9|_|-][a-zA-Z0-9|_|-|\\+]*(\\.)?[a-zA-Z0-9|_|-]{1,}\\@[0-9a-zA-Z]{1,}\\.[a-zA-Z]{2,}(\\.)?[a-zA-Z]*$";
		email = "mittal.@gmail.com";
		assertFalse("the email does not match the required format",email.matches(type2));
	}
	
	@Test
	public void phoneTest_True() {
		final String type1 = "[1-9]{2}\\s[1-9]{1}[0-9]{9}";
//		mobile = "91 9876543210";
		assertTrue("the phone number does not match the required format",mobile.matches(type1));
	}
	
	@Test
	public void phoneTest_False() {
		final String type1 = "[1-9]{2}\\s[1-9]{1}[0-9]{9}";
		mobile = "9 9876543210";
		assertFalse("the phone number does not match the required format",mobile.matches(type1));
	}
	
	@Test
	public void passwordTest_True() {
		final String type1 = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}";
//		password = "Shubham205";
		assertTrue("the password does not match the required format",password.matches(type1));
	}
	
	@Test
	public void passwordTest_False() {
		final String type1 = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}";
		password = "ShubhamM";
		assertFalse("the password does not match the required format",password.matches(type1));
	}
	
}