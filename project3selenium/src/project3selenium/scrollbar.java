package project3selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollbar {
//		void openpage(WebDriver driver){
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		
//		WebElement searchbox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
//		searchbox.sendKeys("test");
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.ENTER).build().perform();
//	    //Thread.sleep(3000);
//	     
//	    act.sendKeys(Keys.PAGE_DOWN).build().perform();
//	    act.sendKeys(Keys.PAGE_UP).build().perform();
//	    
//		
//	}
	public static void main(String[] args) throws Exception {
		scrollbar obj = new scrollbar();
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//obj.openpage(driver);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		searchbox.sendKeys("test");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
	    Thread.sleep(3000);
	     
	    act.sendKeys(Keys.PAGE_DOWN).build().perform();
	    
	   Thread.sleep(3000);
	    act.sendKeys(Keys.PAGE_UP).build().perform();
	    
		
		
	}

}
