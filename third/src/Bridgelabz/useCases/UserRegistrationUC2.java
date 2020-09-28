package Bridgelabz.useCases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Shubham , class UserRegistrationUC2 for verifying username
 *
 */
public class UserRegistrationUC2{
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
		System.out.println("Enter the first name");
		String firstName = sc.nextLine();
		System.out.println("Enter the last name");
		String lastName = sc.nextLine();
		final String type1 = "[A-Z]{1}[a-zA-Z0-9]{2,}";
		Pattern pattern1 = Pattern.compile(type1);
		Matcher matcher1 = pattern1.matcher(firstName);
		Matcher matcher2 = pattern1.matcher(lastName);
		System.out.println("The first name matches the pattern :- " + matcher1.matches());
		System.out.println("The last name matches the pattern :- " + matcher2.matches());
	}
}