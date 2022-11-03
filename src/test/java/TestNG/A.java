package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class A 
{
	WebDriver driver;
	
	@Test
	public void chrome() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 Thread.sleep(3000);
		 driver.close();
	}
  
	@Test
	public void firefox() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ganesh\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.close();
	}
  
}
