package com.digisoft.traning.basics.files;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicOperationsOnFiles {

	static String fileName = "./data/myFile.txt";
	public static void main(String[] args) throws IOException {
		createFile(fileName);

		File f = new File(fileName);
		printFileInformation(f);
	
	
	
	}

	private static void printFileInformation(File f) throws IOException {
		System.out.println("Is it a file " + f.isFile());
		System.out.println("Is it writable " + f.canWrite());
		System.out.println("Is Readable "  + f.canRead());
		
		System.out.println("Last Updated " + f.lastModified());
		System.out.println("Last Updated in Date format " + new Date(f.lastModified()));
		System.out.println("formatted Date " + new SimpleDateFormat("MMMM yyyy, dd HH:mm:ss").format(f.lastModified()));
		System.out.println("Absolute Path of a file " + f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		System.out.println("Name : " + f.getName());
	}

	private static void createFile(String name) {
		File f = new File(name);
		
		if(!f.exists()) {
			try 
			{
				f.createNewFile();
			}
			catch (IOException e) 
			{
				System.out.println("Exception, While Creting a file ");
			}
			System.out.println("File Created Successfully!!!!");
		}
		else
		{
			System.out.println("File Already Exist!!!!");
		}
	}
}
