package com.digisoft.traning.basics.strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String text = sc.next();
		String revText ="";
		
		for (int i = text.length()-1; i >= 0 ; i--) 
		{
			revText = revText + text.charAt(i);
			
		}
	
		if(text.equalsIgnoreCase(revText))
		{
			System.out.println("User entered String is Palindrome");
		}
		else
		{
			System.out.println("User entered string is not a palindrome");
		}
	
	
	}
}
