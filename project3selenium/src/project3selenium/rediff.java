package project3selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediff {

	public static void main(String[] args) throws Exception {
		// TODO Auto-genera'wted method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		fullname.sendKeys("pragati");
		Thread.sleep(2000);
		WebElement chooseid = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		chooseid.sendKeys("spiderman");
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input"));
		pass.sendKeys("pass@12234");
		Thread.sleep(2000);
		WebElement repass = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input"));
		repass.sendKeys("polk");
		Thread.sleep(2000);
		WebElement email= driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input"));
		email.sendKeys("pragati25@gmail.com");
        Thread.sleep(2000);	
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
        checkbox.click();
        Thread.sleep(2000);
       WebElement tick = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select"));
       tick.click();
       Select sel = new Select(tick);  
       sel.selectByIndex(2);
       Thread.sleep(2000);
        WebElement enterasns = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input"));
        enterasns.sendKeys("this is rediff website");
        WebElement mothername = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input"));
        mothername.sendKeys("sunita");
         Thread.sleep(2000);
         WebElement date = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
         
         date.click();
         Select co = new Select(date);
         co.selectByValue("04");
         
         WebElement month = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
         month.click();
         Select mo = new Select(month);
         mo.selectByIndex(3);
         
         
         WebElement year = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
         year.click();
         Select ye = new Select(year);
         ye.selectByIndex(3);
          Thread.sleep(2000);
         
         WebElement gender = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
         gender.click();
         Thread.sleep(2000);
         
         WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
         country.click();
         Select india = new Select(country);
         india.selectByIndex(4);
         Thread.sleep(2000);
         
         
          WebElement text = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[32]/td[3]/input"));
          text.sendKeys("s45g6h7");
         

	}

}
