package com.spider.UIAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class class3 {
	WebDriver driver;
  @BeforeMethod
public void method1() {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\Chromedriver.exe");
	 driver = new ChromeDriver();
  }
	
	@Test
	public void method2() {
	driver.get("url");
	driver.manage().window().maximize();
	class2 obj = new class2(driver);
	obj.method2().sendKeys("name");
}
	


	

 
}