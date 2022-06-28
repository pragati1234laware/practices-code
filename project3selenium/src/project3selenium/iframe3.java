package project3selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe3 {
	void openwebpage(WebDriver driver) {
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		}
	 void countframe(WebDriver driver) {
		 List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		 System.out.println(frame.size());
	 }
	
	
	void closepage(WebDriver driver) {
		driver.close();
		
	}
	public static void main(String[] args) throws Exception {
		iframe3 obj = new iframe3();
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		obj.openwebpage(driver);
		Thread.sleep(2000);
		obj.countframe(driver);
		obj.closepage(driver);
		
		
	}

}
