package com.digisoft.traning.basics.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = null;
		File f = new File("data/mynewFile123.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		String[] words = null;
		Map<String,Integer> mp = new LinkedHashMap<String,Integer>();
		while ((line = br.readLine()) != null)
		{
			words = line.split("-");
			if(words.length > 1)
			{
				System.out.println(words[1]);
				if(!mp.containsKey(words[1]))
				{
					mp.put(words[1], 1);
				}
				else
				{
					mp.put(words[1], mp.get(words[1])+1);
				}
			}
			
		}
		
		Set<String> keys = mp.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext())
		{
			String string = (String) it.next();
			System.out.println(string + " : " + mp.get(string));
			
		}

		br.close();
		fr.close();

	}

}
