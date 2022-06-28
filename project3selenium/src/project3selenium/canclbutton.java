package project3selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class canclbutton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/alerts");
		driver.getTitle();
		WebElement cancel = driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
		cancel.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		

	}

}
