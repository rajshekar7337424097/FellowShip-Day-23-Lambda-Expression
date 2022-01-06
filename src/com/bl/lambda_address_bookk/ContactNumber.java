package com.bl.lambda_address_bookk;

import java.util.Scanner;
import java.util.regex.Pattern;

interface IContactNumber{
	public String validate(String regex, String userEntry);
}
public class ContactNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone number");
		String userEntry = sc.next();
		sc.close();
		IContactNumber isContactNumber = (pattern, contactNumber) -> {
			return "The Input provided is "+Pattern.compile(pattern).matcher(userEntry).matches();
		};
		System.out.println(isContactNumber.validate("^[0-9]{2}\\s{1}[0-9]{10}$", userEntry));
	}

}
