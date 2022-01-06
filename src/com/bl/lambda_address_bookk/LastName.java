package com.bl.lambda_address_bookk;

import java.util.Scanner;
import java.util.regex.Pattern;

interface ILastName{
	public String validate(String regex, String userEntry);
}

public class LastName {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name :");
		String userEntry = sc.next();
		sc.close();
		ILastName isLastName = (pattern, lastName) -> {
			
			return "The input provided is " + Pattern.compile(pattern).matcher(lastName).matches();
		};
		System.out.println(isLastName.validate("^[A-Z]{1}[a-z]{3,9}$", userEntry));
	}

}
