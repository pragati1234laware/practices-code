package project3selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iframe2 {
	void openwebpage(WebDriver driver) {
		driver.get("https://www.merriam-webster.com/dictionary/story");
		driver.manage().window().maximize();
		
	}
	void string( WebDriver driver) {
	WebElement text =  driver.findElement(By.xpath("//*[@id=\"dictionary-entry-3\"]/div[2]/div[1]/span[1]/div/span[2]/span"));
	String s = text.getText();
	System.out.println(s);
	}
//	void closewebpage(WebDriver driver) {
//		driver.close();
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iframe2 obj = new iframe2();
    System.setProperty("webdriver.chrome.driver" ,"E:\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver,20);
    obj.openwebpage(driver);
    obj.string(driver);
    //obj.closewebpage(driver);
    
    
	}

}
