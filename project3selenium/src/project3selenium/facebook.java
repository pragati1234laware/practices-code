package project3selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=sign+up+facebook&rlz=1C1CHBD_enIN994IN994&oq=sign+up+fac&aqs=chrome.0.0i433i512j0i512j69i57j0i512l7.4469j0j15&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		WebElement Uilink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/a/h3"));
		Uilink.click();
		 WebElement firstname = driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]\r\n"
		 		+ ""));
		 firstname.sendKeys("pragati");
		 Thread.sleep(2000);
		 WebElement surname = driver.findElement(By.xpath("//*[@id=\"u_0_l_gB\"]"));
		 surname.sendKeys("laware");
		

	}

}
