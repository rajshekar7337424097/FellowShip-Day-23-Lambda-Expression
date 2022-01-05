package com.bl.lambda_address_bookk;

import java.util.Scanner;

interface ILastName{
	public String validate(String regex, String userEntry);
}

public class LastName {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name :");
		String userEntry = sc.next();
	}

}
