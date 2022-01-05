package com.bl.lambda_firstname;

import java.util.Scanner;
import java.util.regex.Pattern;

interface IFirstName {
	public String validate(String regex, String userEntry);
}

public class FirstName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String userEntry = sc.next();
		IFirstName isFirstName = (pattern, firstName) -> {

			return "The input provided is " + Pattern.compile(pattern).matcher(firstName).matches();
		};
		System.out.println(isFirstName.validate("^[A-Z]{1}[a-z]{3,9}$", userEntry));
	}

}
