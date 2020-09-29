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
	
	public AssertionTest2(final String firstName,final String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Parameters
	public static String[][] input() {
		return (new String[][]{{"Shubham","Mittal"},{"Shubham","mittal"},{"shubham","mittal"}
		,{"shubham","Mittal"}});
	}
	
	@Test
	public void lastNameTest() {
		final String type = "[A-Z]{1}[a-zA-Z0-9]{2,}";
		assertTrue("last name not satisfying first letter capital and"
				+ " atleast 3 characters ",lastName.matches(type));
		assertTrue("first name not satisfying first letter capital and"
				+ " atleast 3 characters ",firstName.matches(type));
	}
}