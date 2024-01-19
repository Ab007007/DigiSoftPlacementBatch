package com.digisoft.traning.basics.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFileDemo {

	
	public static void main(String[] args) throws IOException
	{
		File f = new File("data/myFile.txt");
		
		FileInputStream fis = new FileInputStream(f);
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
		fis.close();
		
		
	}
}
