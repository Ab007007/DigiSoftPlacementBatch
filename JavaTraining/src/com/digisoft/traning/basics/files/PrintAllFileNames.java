package com.digisoft.traning.basics.files;

import java.io.File;
import java.util.Scanner;

public class PrintAllFileNames
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Absolute Path of a folder!!!");
		Scanner sc = new Scanner(System.in);
		String folder = sc.next();
		File f = new File(folder);
		//Recurssive Function
		if(f.isDirectory())
		{
			String[] fileNames = f.list();
			for(String fileName :  fileNames)
			{
				System.out.println(fileName);
			}
		}
		
		
		
	}

}
