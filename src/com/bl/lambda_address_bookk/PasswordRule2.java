package com.bl.lambda_address_bookk;

import java.util.Scanner;
import java.util.regex.Pattern;

interface IPasswordRule2{
	public String validate(String regex, String userEntry);
}
public class PasswordRule2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password as per given conditions");
		System.out.println("Password must contain atleast one UpperCase");
		String userEntry = sc.next();
		sc.close();
		IPasswordRule2 isPasswordRule2 = (pattern, passwordRule2) -> { 
			return "The given password is " +Pattern.compile(pattern).matcher(userEntry).matches();
		};
		System.out.println(isPasswordRule2.validate("^[A-Z]{1}[a-z]{3,9}$", userEntry));
	}
}
