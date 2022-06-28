package com.spider.UIAutomation;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class class2 {
	WebDriver driver;
	 
	 public class2(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 
	 @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]")
	 WebElement name;
	 @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[4]/input[1]")
	 WebElement surname;
	 public WebElement method2() {
		return name;
		/*FileReader read = new FileReader("Data.propertise");
		Properties prop = new Properties();
		prop.load(read);
		System.out.println(prop.getProperty("url"));*/
		
		
	 }

	
	 

}
