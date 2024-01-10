package com.digisoft.traning.basics.strings;

public class WordReverse {

	
	public static void main(String[] args) {
		
		String greeting = "Hey Hi, How are you today";
		
		String[] words = greeting.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			//System.out.print(words[i] + " ");
			for (int j = words[i].length()-1; j >= 0 ; j--) 
			{
				System.out.print(words[i].charAt(j));
				
			}
			System.out.print(" ");
		}
	}
}
