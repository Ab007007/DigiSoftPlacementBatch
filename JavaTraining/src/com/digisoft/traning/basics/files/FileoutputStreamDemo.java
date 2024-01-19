package com.digisoft.traning.basics.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		File f = new File("data/mynewFile.txt");

		FileOutputStream fos = new FileOutputStream(f, true);

		if (!f.exists())
		{
			f.createNewFile();
			System.out.println("Created new file");
		} else
		{
			System.out.println("File Already Exist!!!!");
		}

		fos.write("Hello all, content is from java\n".getBytes());
		fos.flush();

		fos.close();
	}
}
