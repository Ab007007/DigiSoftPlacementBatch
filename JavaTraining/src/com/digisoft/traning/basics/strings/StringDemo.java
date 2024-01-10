package com.digisoft.traning.basics.strings;

public class StringDemo 
{
	
	public static void main(String[] args)
	{
		String str1 = "aru03.info@gmail.com";
		
		System.out.println("Index of @ symbol " + str1.indexOf("@"));
		System.out.println("First index of a " + str1.indexOf("a"));
		System.out.println("Search from index 1 for a char - a " + str1.indexOf("a",1));
		System.out.println("Second occurnce of a " + str1.indexOf("a",str1.indexOf("a")+1));
	
		System.out.println("Char at a index 10 : " + str1.charAt(10));
	
	
		String details= "Name=Arvinda;Occuption=IT;Phonenumber=544554;Location=Bangalore";
	
		String[] userdetails = details.split(";");
		
		System.out.println(userdetails[0].split("=")[1]);
		
		for (int i = 0; i < userdetails.length; i++) 
		{
			
			System.out.println(userdetails[i].split("=")[1]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
