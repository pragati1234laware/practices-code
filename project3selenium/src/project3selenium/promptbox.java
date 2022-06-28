package project3selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.getTitle();
		WebElement promptalert = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptalert.click();
		driver.switchTo().alert().sendKeys("test adat");
		driver.switchTo().alert().accept();
		

	}

}
