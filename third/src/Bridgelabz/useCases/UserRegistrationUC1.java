package Bridgelabz.useCases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String input = sc.nextLine();
		final String type = "[A-Z]{1}[a-zA-Z0-9]{2,}";
		Pattern pattern = Pattern.compile(type);
		Matcher matcher = pattern.matcher(input);
		System.out.println("The input matches the pattern :- " + matcher.matches());
	}
}