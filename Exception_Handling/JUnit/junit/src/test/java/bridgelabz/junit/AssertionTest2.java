package bridgelabz.junit;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AssertionTest2{
	private String firstName;
	private String lastName;
	private String email;
	
	public AssertionTest2(final String firstName,final String lastName,final String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Parameters
	public static String[][] input() {
		return (new String[][]{{"Shubham","Mittal","shubham.05@gmail.com"},
							   {"Shubham","mittal","shubham.@gmail.com"},
							   {"shubham","mittal","shubham@gmail.com.in.au"},
							   {"shubham","Mittal","shubham@.gmail.com"}});
	}
	
	@Test
	public void lastNameTest() {
		final String type1 = "[A-Z]{1}[a-zA-Z0-9]{2,}";
		final String type2 = "^[a-zA-Z0-9|_|-][a-zA-Z0-9|_|-|\\+]*(\\.)?[a-zA-Z0-9|_|-]{1,}\\@[0-9a-zA-Z]{1,}\\.[a-zA-Z]{2,}(\\.)?[a-zA-Z]*$";
		assertTrue("last name not satisfying first letter capital and"
				+ " atleast 3 characters ",lastName.matches(type1));
		assertTrue("first name not satisfying first letter capital and"
				+ " atleast 3 characters ",firstName.matches(type1));
		assertTrue("the email does not match the required format",email.matches(type2));
	}
}