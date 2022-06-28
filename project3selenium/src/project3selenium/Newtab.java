 package project3selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtab {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\Chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://localhost:3000/");
		WebElement text = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div[1]"));
		text.click();
		WebElement email = driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div/div[1]/input"));
		email.sendKeys("suhas.awale");
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div/div[2]/input"));
		pass.sendKeys("suhas@123");
		WebElement log = driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div/div[3]/button"));
		email.click();
		Thread.sleep(2000);
		log.click();
		WebElement newtab = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[1]/button"));
		newtab.click();
		//getwindowhandles will store
		Set<String> windows = driver.getWindowHandles();
		 //one by one stored by selenium
		
		Iterator<String> itr = windows.iterator();
		String parentwindow = itr.next();
		String childwindow = itr.next();
		
		Thread.sleep(2000);
		driver.switchTo().window(childwindow);
		driver.getTitle();
		System.out.println(driver.getTitle());
		WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"input\"]"));
		searchbox.sendKeys("test data");
		
		driver.switchTo().window(parentwindow);
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.quit();
		Thread.sleep(2000);
		WebElement alertbox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		alertbox.sendKeys("tsets data");
		
		
		  
	

	}

}
