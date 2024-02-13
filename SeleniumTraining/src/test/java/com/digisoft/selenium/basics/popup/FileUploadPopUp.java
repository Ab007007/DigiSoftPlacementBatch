package com.digisoft.selenium.basics.popup;

import java.io.IOException;

import org.testng.annotations.Test;

import com.digisoft.selenium.basics.utils.FormyUtils;

public class FileUploadPopUp extends FormyUtils
{

	static {
		try {
			Runtime.getRuntime().exec("D:/EclipseWS/autoIT/fileUplod.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void fileUpload() {
		getDriver();
		launch("https://formy-project.herokuapp.com/fileupload");
		click("id", "file-upload-field");
		
	}
}
