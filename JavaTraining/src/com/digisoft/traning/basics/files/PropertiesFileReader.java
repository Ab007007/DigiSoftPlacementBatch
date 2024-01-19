package com.digisoft.traning.basics.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

	static FileInputStream fis = null;
	static Properties props = null;
	
	public static void main(String[] args) {
		
		getPropertyValue("name");
		getPropertyValue("password");
		getPropertyValue("url");
		
		
		
	}

	private static String getPropertyValue(String key) {
		
		Properties props;
		String value = null;
		try {
			fis = new FileInputStream(new File("data/config.properties"));
			props = new Properties();
			props.load(fis);
			value = props.getProperty(key);
			System.out.println("Getting value from properties file " + value);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fis.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value;
	}
	
	
}
