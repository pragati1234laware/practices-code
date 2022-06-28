package project3selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriveer.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		driver.getTitle();
		driver.manage().window().maximize();
		WebElement simpleAlert = driver.findElement(By.xpath("//*[@id=\"alertButton\"]"));
		
		simpleAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		

	}

}
