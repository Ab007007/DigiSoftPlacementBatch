package com.digisoft.traning.basics.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PrintAllFileNames
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the Absolute Path of a folder!!!");
		Scanner sc = new Scanner(System.in);
		String folder = sc.next();
		File f = new File(folder);
		// Recurssive Function
		if (f.isDirectory())
		{
			FileOutputStream fos = null;
			File fw = new File("data/mynewFile123.txt");
			fos = new FileOutputStream(fw, true);
			String[] fileNames = f.list();
			for (String fileName : fileNames)
			{
				
				if (!fw.exists())
				{
					fw.createNewFile();
					System.out.println("Created new file");
				} else
				{
					System.out.println("File Already Exist!!!!");
				}

				fos.write(fileName.getBytes());
				fos.write("\n".getBytes());
				
			}
			fos.flush();
			fos.close();
		}

	}

}
