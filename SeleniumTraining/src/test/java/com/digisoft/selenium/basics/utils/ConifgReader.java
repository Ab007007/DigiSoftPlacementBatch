package com.digisoft.selenium.basics.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConifgReader 
{
	
	//Read the properties file
	// Create global Variables and assign the value
	
	
	public void configReader()
	{
		System.out.println("Setting Global Variables for the Project!!!");
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File("data/config.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GlobalVariables.url = props.getProperty("actitimeURL");
		GlobalVariables.userName = props.getProperty("username");
		GlobalVariables.password = props.getProperty("password");
		GlobalVariables.timeout = props.getProperty("timeout");
		GlobalVariables.browser = props.getProperty("browser");
		
		System.out.println("URL : " + GlobalVariables.url);
		System.out.println("UserName : " + GlobalVariables.userName);
		System.out.println("Password : " + GlobalVariables.password);
		System.out.println("TimeOut : " + GlobalVariables.timeout);
		System.out.println("Browser : " + GlobalVariables.browser);
		
	}

}
