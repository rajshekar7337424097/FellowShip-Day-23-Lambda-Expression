package com.bl.lambda_address_bookk;

import java.util.Scanner;
import java.util.regex.Pattern;

interface IEmail {
	public String validata(String regex, String userEntry);
}

public class EmailID {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmailID");
		String userEntry = sc.next();
		IEmail isEmailId = (pattern, emailId) -> {
			return "The input is " + Pattern.compile(pattern).matcher(userEntry).matches();
		};
		System.out.println(isEmailId.validata("abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$", userEntry));
	}
}
