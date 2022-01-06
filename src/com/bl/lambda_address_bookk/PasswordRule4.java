package com.bl.lambda_address_bookk;

import java.util.Scanner;
import java.util.regex.Pattern;

interface IPasswordRule4 {
	public String validate(String regex, String userEntry);
}

public class PasswordRule4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password as per rule 4 :");
		System.out.println("Password must has one Special Charactor");
		String userEntry = sc.next();
		sc.close();
		IPasswordRule4  isPasswordRule4 = (pattern, passwordRule4) -> { 
			return "The given password is" +Pattern.compile(pattern).matcher(userEntry).matches();
		};
		System.out.println(isPasswordRule4.validate("^(?=.*[A-Z])(?=.*[0-9])[@$!%*#?&][A-Za-z0-9@$!%*#?&]{8,}$", userEntry));
	}
}
