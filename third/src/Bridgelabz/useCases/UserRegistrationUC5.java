package Bridgelabz.useCases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Shubham , class UserRegistrationUC2 for verifying username
 *
 */
public class UserRegistrationUC5{
	/**
	 * @param password, the password provided by the user
	 */
	/**
	 * @param lastName, the last name for the person
	 */
	/**
	 * @param matcher1, matches password against pattern1
	 */
	/**
	 * @param pattern1, ensures 8 or more characters in password
 	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.nextLine();
		final String mpass = "[a-zA-Z0-9]{8,}";
		Pattern pattern1 = Pattern.compile(mpass);
		Matcher matcher1 = pattern1.matcher(password);
		System.out.println("The password matches the pattern :- " + matcher1.matches());
	}
}