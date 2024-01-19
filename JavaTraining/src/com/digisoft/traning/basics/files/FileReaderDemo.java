package com.digisoft.traning.basics.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	
	public static void main(String[] args) throws Exception
	{
		File f = new File("data/myFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line =null;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}

		br.close();
		fr.close();
	}
}
