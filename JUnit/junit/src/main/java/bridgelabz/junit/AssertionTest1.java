package bridgelabz.junit;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AssertionTest1{
	private String firstName;
	
	
	public AssertionTest1(final String firstName) {
		super();
		this.firstName = firstName;
	}

	@Parameters
	public static String[] input() {
		return (new String[]{"Shubham","shubham"});
	}
	
	@Test
	public void firstNameTest() {
		final String type = "[A-Z]{1}[a-zA-Z0-9]{2,}";
		boolean condition = firstName.matches(type);
		assertTrue("first name not satisfying first letter capital and"
				+ " atleast 3 characters ",firstName.matches(type));
	}
}