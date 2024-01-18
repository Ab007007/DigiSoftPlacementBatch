package com.digisoft.traning.basics.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class ExceptionWithOneCatch {

	
	public static void main(String[] args) {
		System.out.println("--- Main Started ---");
		int marks[] = {74,82,94,69,108,55};
		ExceptionWithOneCatch eObj = new ExceptionWithOneCatch();
		try {
			eObj.printArray(marks);
			
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Exception Caught!!!!!" + ex.getMessage());
		}
		try
		{
			eObj.printFile("resume.txt");
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("Given file does not exist!!! Please check the file " + fnfe.getMessage());
		}
		catch(IOException ioe)
		{
			System.out.println("File doesn't have permisssion to write!!!! please check user permission ");
		}
		System.out.println("--- Main Ended ---");
	}
	
	
	public void printArray(int a[])
	{
		for (int i = 0; i <= a.length; i++)
		{
			System.out.println("Array at index " + i + " is " + a[i]);
			
		}
	}
	
	
	public void printFile(String fileName) throws FileNotFoundException,IOException
	{
		File file = new File(fileName);
		FileImageInputStream fis = new FileImageInputStream(file);
	}
	
	
	
	
	
}
