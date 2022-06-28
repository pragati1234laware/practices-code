package com.spider.UIAutomation;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class textfileread {
	private void manin() throws Exception {
		
		// TODO Auto-generated method stub
		FileReader read = new FileReader("Data.propertise");
		Properties prop = new Properties();
		prop.load(read);
		//System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		

	}

}
