package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo 
{
	
	WebDriver driver;
	
	@BeforeSuite
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 System.out.println("open browser");
	}	
	
	@BeforeTest
	public void geturl()
	{
		driver.get("https://www.mercurytravels.co.in/");
		System.out.println("get url");
	}
	
	@BeforeClass
	public void maximizebrowser()
	{
		driver.manage().window().maximize();
		System.out.println("max browser");
	}
	
	@BeforeMethod
	public void getcookies()
	{
		System.out.println("getcookies");
	}
	
	@Test
	public void BCA() throws InterruptedException
	{
		Thread.sleep(4000);
		  System.out.println("BCA");
		  Actions a =new Actions(driver);
		  a.moveToElement(driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"))).build().perform();
		  Thread.sleep(2000);
		 
		  driver.findElement(By.xpath("(//a[contains(text(),'User Login')])[2]")).click ();
		  Thread.sleep(2000);
		  
		
		 driver.findElement(By.id("sign_user_email")).sendKeys("sonawanesushil57@gmail.com");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("sign_user_password")).sendKeys("Sushil@123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		 Thread.sleep(2000);
		
		 
		 WebElement welcomeUser=driver.findElement(By.xpath("(//span[@class='caret'])[6]"));
			
		
			Actions action = new Actions(driver);
			action.moveToElement(welcomeUser).build().perform();
			
			Thread.sleep(2000);
			WebElement logout=driver.findElement(By.xpath("(//a[text()=' Log Out'])[2]"));
	     logout.click();
			
			System.out.println("Logout successfully");
			
	}
	
	
	@Test(enabled = false)
	public void ABC() throws InterruptedException
	{
		Thread.sleep(4000);
		  System.out.println("ABC");
		  Actions a =new Actions(driver);
		  a.moveToElement(driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"))).build().perform();
		  Thread.sleep(2000);
		 
		  driver.findElement(By.xpath("(//a[contains(text(),'User Login')])[2]")).click ();
		  Thread.sleep(2000);
		  
		
		 driver.findElement(By.id("sign_user_email")).sendKeys("sonawanesushil57@gmail.com");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("sign_user_password")).sendKeys("Sushil@123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		 Thread.sleep(2000);
		
		 
		 WebElement welcomeUser=driver.findElement(By.xpath("(//span[@class='caret'])[6]"));
			
		
			Actions action = new Actions(driver);
			action.moveToElement(welcomeUser).build().perform();
			
			Thread.sleep(2000);
			WebElement logout=driver.findElement(By.xpath("(//a[text()=' Log Out'])[2]"));
	     logout.click();
			
			System.out.println("Logout successfully");
			
	}
	
	@Test
	public void GBK() throws InterruptedException
	{
		Thread.sleep(4000);
		  System.out.println("GBK");
		  Actions a =new Actions(driver);
		  a.moveToElement(driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"))).build().perform();
		  Thread.sleep(2000);
		 
		  driver.findElement(By.xpath("(//a[contains(text(),'User Login')])[2]")).click ();
		  Thread.sleep(2000);
		  
		
		 driver.findElement(By.id("sign_user_email")).sendKeys("sonawanesushil57@gmail.com");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("sign_user_password")).sendKeys("Sushil@123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		 Thread.sleep(2000);
		
		 
		 WebElement welcomeUser=driver.findElement(By.xpath("(//span[@class='caret'])[6]"));
			
		
			Actions action = new Actions(driver);
			action.moveToElement(welcomeUser).build().perform();
			
			Thread.sleep(2000);
			WebElement logout=driver.findElement(By.xpath("(//a[text()=' Log Out'])[2]"));
	     logout.click();
			
			System.out.println("Logout successfully");
			
	}
	
	@AfterMethod
	public void getscreenshot() throws IOException
	{
		System.out.println("ss");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src,new File("C:\\Users\\Ganesh\\eclipse-workspace\\Feb_Batch_Automation\\ss") );
	}
	
	@AfterClass
	public void deletecookies()
	{
		System.out.println("dltcookies");
	}
	
	@AfterTest
	public void dbconnectionclosed()
	{
		System.out.println("dbconnection close");
	}
	
	@AfterSuite
	public void closebrowser()
	{
		System.out.println("closebrowser");
		driver.close();
	}
	
	
}
