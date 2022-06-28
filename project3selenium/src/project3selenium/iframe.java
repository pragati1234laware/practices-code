//openclose webpage.

package project3selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iframe {
	void openwebpage( WebDriver driver) {
		driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			
	}
	void closewebpage(WebDriver driver) {
		driver.close();
		
	}
	public static void main(String[] args) {
		iframe obj = new iframe();
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 obj.openwebpage(driver);
		 obj.closewebpage(driver);
		
	}

}
