package project3selenium;

import java.sql.DriverAction;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandrop {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions actn = new Actions(driver);
		WebElement sourch = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		actn.dragAndDrop(sourch, target).build().perform();
		Thread.sleep(3000);
		//driver.close();
		driver.switchTo().defaultContent();
		WebElement searchbox = driver.findElement(By.name("s"));
		
		searchbox.sendKeys("test");
		//driver.close();
		
		
		
		

	}

}
