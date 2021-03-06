package bridgelabz.junit;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AssertionTest7{
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String password;
	
	public AssertionTest7(final String firstName,final String lastName,
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
		return Arrays.asList(new Object[][]{{"Shubham","Mittal","shubham.05@gmail.com","91 9876543210","abcS9edff"},
							   {"Shubham","mittal","shubham.@gmail.com","919876543210","abshdyu9ECddf"},
							   {"shubham","mittal","shubham@gmail.com.in.au","9 9876543210","ancasuQ"},
							   {"shubham","Mittal","shubham@.gmail.com","91 98765432","ascsfcae4"}});
	}
	
	@Test
	public void lastNameTest() {
		final String type1 = "[A-Z]{1}[a-zA-Z0-9]{2,}";
		assertTrue("last name not satisfying first letter capital and"
				+ " atleast 3 characters ",lastName.matches(type1));
	}
	
	@Test
	public void firstNameTest() {
		final String type1 = "[A-Z]{1}[a-zA-Z0-9]{2,}";
		
		assertTrue("first name not satisfying first letter capital and"
				+ " atleast 3 characters ",firstName.matches(type1));
	}
	
	@Test
	public void emailTest() {
		final String type2 = "^[a-zA-Z0-9|_|-][a-zA-Z0-9|_|-|\\+]*(\\.)?[a-zA-Z0-9|_|-]{1,}\\@[0-9a-zA-Z]{1,}\\.[a-zA-Z]{2,}(\\.)?[a-zA-Z]*$";
		assertTrue("the email does not match the required format",email.matches(type2));
	}
	
	@Test
	public void phoneTest() {
		final String type1 = "[1-9]{2}\\s[1-9]{1}[0-9]{9}";
		assertTrue("the phone number does not match the required format",mobile.matches(type1));
	}
	
	@Test
	public void passwordTest() {
		final String type1 = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}";;
		assertTrue("the password does not match the required format",password.matches(type1));
	}
}