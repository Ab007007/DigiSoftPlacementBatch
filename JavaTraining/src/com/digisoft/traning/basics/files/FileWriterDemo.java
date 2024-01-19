package com.digisoft.traning.basics.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileWriterDemo 
{
	static Scanner sc = null;
	public static void main(String[] args) throws IOException
	{
		
		sc =  new Scanner(System.in);
		String name = new Date().toString().replace(" ", "_").replace(":", "_");
		System.out.println("Enter the number for which you want to generte table");
		int num = sc.nextInt();
		
		File f = new File("data/Table_For_"+num + "_on_" + name +".txt");
		
		if(!f.exists())
		{
			f.createNewFile();
			System.out.println("Created new file");
		}
		else
		{
			System.out.println("File Already Exist!!!!");
		}
		
		FileWriter fw = new FileWriter(f, true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (int i = 1; i <= 20 ; i++)
		{
			bw.write(num + " * " + i + " = " + (num*i));
			bw.newLine();
		}
		
		bw.close();
		fw.close();
		
		System.out.println("Done!!!!, Writing the output");
	}
	

}
