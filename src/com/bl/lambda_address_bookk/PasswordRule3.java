package com.bl.lambda_address_bookk;

import java.util.Scanner;
import java.util.regex.Pattern;

interface IPasswordRule3 {
	public String validate(String regex, String userEntry);
}

public class PasswordRule3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password as per given condition :");
		System.out.println("Password contains atleast 1 numeric numbers ");
		String userEntry = sc.next();
		sc.close();
		IPasswordRule3 isPasswordRule3 = (pattern, passwordRule3) -> {
			return "The given password  is " +Pattern.compile(pattern).matcher(userEntry).matches();
		};
		System.out.println(isPasswordRule3.validate("^[A-Z]{1}[a-z]{3,9}[0-9]{1}$", userEntry));
	}
}
