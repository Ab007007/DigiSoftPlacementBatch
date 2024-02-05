package com.digisoft.traning.basics.strings;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		String str1 = "aru03.info@gmail.com";

		for (int i = str1.length()-1; i >= 0 ; i--) 
		{
			System.out.print(str1.charAt(i));
			
		}
	}

/*
 * 
 *  OUTPUT : 
 *  moc.liamg@ofni.30ura
 */
}
