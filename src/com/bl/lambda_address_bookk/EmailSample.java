package com.bl.lambda_address_bookk;

import java.util.Scanner;
import java.util.regex.Pattern;

interface IEmailSample{
	public String validate(String regex, String userEntry);
}

public class EmailSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email sample");
		String userEntry = sc.next();
		sc.close();
		IEmailSample isEmail = (pattern, emailSample) -> {
			return "The given Email sample is "+Pattern.compile(pattern).matcher(userEntry).matches();
		};
		System.out.println(isEmail.validate("^[a-zA-Z0-9_!#$%&@'*+-/=?`{|}~[];'+(?:\\\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\\\\\\\.[a-zA-Z0-9-]+)*$\"", userEntry));
	}
}
