package com.bl.lambda_address_bookk;

import java.util.Scanner;
import java.util.regex.Pattern;

interface IPasswordRule1 {
	public String validate(String regex, String userEntry );
}
public class PasswordRule1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password as per rule 1");
		System.out.println("Password contains minimum 8 charectors");
		String userEntry = sc.next();
		sc.close();
		IPasswordRule1 isPasswordRule1 = (pattern , passwordRule1) -> {
			return "password give is "+Pattern.compile(pattern).matcher(userEntry).matches();
		};
		System.out.println(isPasswordRule1.validate("^[a-z]{8}$", userEntry));
	}
}
