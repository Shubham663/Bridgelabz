package Bridgelabz.useCases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Shubham , class UserRegistrationUC2 for verifying username
 *
 */
public class UserRegistrationUC4{
	/**
	 * @param firstName, the first name for the person
	 */
	/**
	 * @param lastName, the last name for the person
	 */
	/**
	 * @param matcher1 and matcher2, matach first and last names against pattern1
	 */
	/**
	 * @param arpattern1, ensures 1st letter caps and minimum 3 characters
 	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile no along with country code");
		String mobileNumber = sc.nextLine();
//		final String name = "[A-Z]{1}[a-zA-Z0-9]{2,}";
//		[.]{0,1}[a-zA-Z0-9]{0,} exchanged with  	?(.[a-zA-Z0-9]{1,})
//		[a-zA-Z0-9|_|-]{1,}\\@[0-9a-zA-Z]{1,0}\\.[a-zA-Z]{2,}
//		final String mail = "[a-zA-Z0-9|_|-]{1,}\\@[0-9a-zA-Z]{1,}\\.[a-zA-Z]{2,}";
//		final String mail = "[a-zA-Z0-9|_|-]{1,}?(\\.[a-zA-Z0-9]{1,})\\@[0-9a-zA-Z]{1,}\\.[a-zA-Z]{2,}?(\\.[a-zA-Z]{1,})";
//		final String mail = "[a-zA-Z0-9|_|-]{1,}[\\.&&[[a-zA-Z0-9]{1,}]]{0,1}\\@[0-9a-zA-Z]{1,}\\.[a-zA-Z]{2,}[\\.&&[[a-zA-Z]{1,}]]{0,1}";
//		final String mail = "[a-zA-Z0-9|_|-]{1,}[\\.+[[a-zA-Z0-9]{1,}]]{0,1}\\@[0-9a-zA-Z]{1,}\\.[a-zA-Z]{2,}[\\.&&[[a-zA-Z]{1,}]]{0,1}";
//		final String mail = "[a-zA-Z0-9|_|-]{1,}+@[0-9a-zA-Z]{1,}\\.[a-zA-Z]{2,}";
//		final String mail = "^[a-zA-Z0-9|_|-][a-zA-Z0-9|_|-|\\+]*(\\.)?[a-zA-Z0-9|_|-]{1,}\\@[0-9a-zA-Z]{1,}\\.[a-zA-Z]{2,}(\\.)?[a-zA-Z]*$";
		final String mobile = "[1-9]{2}\\s[1-9]{1}[0-9]{9}";
		Pattern pattern1 = Pattern.compile(mobile);
//		Pattern pattern2 = Pattern.compile(mail);
		Matcher matcher1 = pattern1.matcher(mobileNumber);
//		Matcher matcher2 = pattern1.matcher(lastName);
//		Matcher matcher3 = pattern2.matcher(email);
//		System.out.println("The first name matches the pattern :- " + matcher1.matches());
//		System.out.println("The last name matches the pattern :- " + matcher2.matches());
		System.out.println("The phone number matches the pattern :- " + matcher1.matches());
	}
}