package project3selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class class1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
		WebElement Uilink = driver.findElement(By.xpath("//div[contains(text(),'UI Automation Testing')]"));
		Uilink.click();
		 
		WebElement email = driver.findElement(By.className("email_input"));
		email.sendKeys("suhas.awale");
		
		WebElement password = driver.findElement(By.className("password_input"));
		password.sendKeys("suhas@123");
		email.click();
		
		WebElement Login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		Login.click();
		
		 WebElement text = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[1]/input"));
		 text.sendKeys("pragati");
		  Thread.sleep(2000);
		  
		  WebElement num = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/input"));
		  num.sendKeys("7775939789");
		  Thread.sleep(3000);
		  
//		  WebElement date = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[3]/input"));
//		  date.click();
//		  Select cal = new Select(date);
//		  cal.selectByValue("2022-03-19");
//		  
//		  Thread.sleep(3000);
		  
		 
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/select"));
		Select sel = new Select(dropdown);
		 
	 
		sel.selectByValue("option3");
		 Thread.sleep(2000);
		 
		 sel.selectByVisibleText("Option 4");
		 Thread.sleep(3000);
		 
		WebElement check = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[4]/input"));
		check.click();
		  
		 WebElement radio = driver.findElement(By.xpath("//*[@id=\"radio2\"]"));
		 radio.click();
		 Thread.sleep(2000);
		 
		 
//	  // newtab open
		 
		 WebElement newtab = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[1]/button"));
		 newtab.click();
	   Set<String> windows = driver.getWindowHandles();
	  Iterator<String>itr = windows.iterator();
	  String parentwindow = itr.next();
	  String childwindow = itr.next();
	  Thread.sleep(2000);
	  driver.switchTo().window(childwindow);
   //  driver.getTitle(childwindow);
	  WebElement searchbox = driver.findElement(By.xpath("//*[@name = 'q']"));
	  searchbox.sendKeys("tset match");
	  Actions action = new Actions(driver);
	  action.sendKeys(Keys.ENTER).build().perform();
      System.out.println(driver.getTitle());
	  Thread.sleep(3000);
	  driver.switchTo().window(childwindow);
	  
	  
	  driver.close();
	  Thread.sleep(2000);
	  driver.switchTo().window(parentwindow);
	   
//		
////		//open Newwindow
//		WebElement window = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[2]/button"));
//		window.click(); 
//		Set<String> newwindows = driver.getWindowHandles();
//		  Iterator<String>itr1 = windows.iterator();
//		  String newparentwindow = itr.next();
//		  String newchildwindow = itr.next();
//		  Thread.sleep(2000);
//		  driver.switchTo().window(newchildwindow);
//	   //  driver.getTitle(childwindow);
//		  WebElement newsearchbox = driver.findElement(By.xpath("//*[@name = 'q']"));
//		  newsearchbox.sendKeys("test match");
//	      System.out.println(driver.getTitle());
//		  Thread.sleep(3000);
//		  driver.switchTo().window(newchildwindow);
//		 // driver.close();
//		  Thread.sleep(2000);
//		  driver.switchTo().window(newparentwindow);
//		  
		  
		
		
		//Alert
		WebElement Alert = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[3]/input"));
		Alert.sendKeys("test");
		WebElement Alert2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[3]/button"));
		Alert2.click();
		Thread.sleep(2000); 
		driver.switchTo().alert().accept();
		
//		datepicker
		
		WebElement datapicker = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[3]/input"));
		datapicker.click();
		    
		 
		 
		 
		 
		
	}

}
