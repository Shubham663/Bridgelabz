package bridgelabz.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
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
	private boolean expected;
	private validateUser user;
	
	@Before
	public void init() {
		user = new validateUser();
	}
	
	public AssertionTest11(final String firstName,final String lastName,
			final String email, final String mobile,final String password, final boolean expected) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.expected = expected;
	}

	@Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][]{{"Shubham","Mittal","abc@yahoo.com","91 9876543210","abcS9@edff",true},
											{"Shubham","Mittal","abc-100@yahoo.com","91 9876543210","abcS9@edff",true},
											{"Shubham","Mittal","abc.100@yahoo.com","91 9876543210","abcS9@edff",true},
											{"Shubham","Mittal","abc111@yahoo.com","91 9876543210","abcS9e@dff",true},
											{"Shubham","Mittal","abc-100@abc.net","91 9876543210","abcS9ed@ff",true},
											{"Shubham","Mittal","abc.100@abc.com.au","91 9876543210","abcS@9edff",true},
											{"Shubham","Mittal","abc@1.com","91 9876543210","abcS9ed@ff",true},
											{"Shubham","Mittal","abc@gmail.com.com","91 9876543210","ab@cS9edff",true},
											{"Shubham","Mittal","abc+100@gmail.com","91 9876543210","abc@S9edff",true},
											{"Shubham","Mittal","abc","91 9876543210","abcS@9edff",false},
											{"Shubham","Mittal","abc@.com.my","91 9876543210","abc@S9edff",false},
											{"Shubham","Mittal","abc123@gmail.a","91 9876543210","ab@cS9edff",false},
											{"Shubham","Mittal","abc123@.com","91 9876543210","abcS9e@dff",false},
											{"Shubham","Mittal","abc123@.com.com","91 9876543210","abc@S9edff",false},
											{"Shubham","Mittal",".abc@abc.com","91 9876543210","abcS9ed@ff",false},
											{"Shubham","Mittal","abc()*@gmail.com","91 9876543210","abcS@9edff",false},
											{"Shubham","Mittal","abc@%*.com","91 9876543210","abcS9e@dff",false},
											{"Shubham","Mittal","abc..2002@gmail.com","91 9876543210","ab@cS9edff",false},
											{"Shubham","Mittal","abc.@gmail.com","91 9876543210","abcS9e@dff",false},
											{"Shubham","Mittal","abc@abc@gmail.com","91 9876543210","abcS@9edff",false},
											{"Shubham","Mittal","abc@gmail.com.1a","91 9876543210","abcS9@edff",false},
											{"Shubham","Mittal","abc@gmail.com.aa.au","91 9876543210","abc@S9edff",false}
							   });
	}
	
	@Test
	public void lastNameTest_True() {
		Assert.assertEquals(true ,user.validateLastName(lastName));
	}
	
	@Test
	public void lastNameTest_False() {
		lastName="Ca";
		Assert.assertEquals(false ,user.validateLastName(lastName));
	}
	
	@Test
	public void firstNameTest_True() {
		Assert.assertEquals(true ,user.validateFirstName(firstName));
	}
	
	@Test
	public void firstNameTest_False() {
		firstName= "Sh";
		Assert.assertEquals(false ,user.validateFirstName(firstName));
	}
	
	@Test
	public void emailTest() {
		Assert.assertEquals(this.expected ,user.validateEmail(email));
	}
	
	
	@Test
	public void phoneTest_True() {
		Assert.assertEquals(true ,user.validateMobile(mobile));
	}
	
	@Test
	public void phoneTest_False() {
		mobile = "9 9876543210";
		Assert.assertEquals(false ,user.validateMobile(mobile));
	}
	
	@Test
	public void passwordTest_True() {
		Assert.assertEquals(true ,user.validatePassword(password));
	}
	
	@Test
	public void passwordTest_False() {
		password = "ShubhamM05";
		Assert.assertEquals(false ,user.validatePassword(password));
	}
	
}