package TestNG;



import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class reportss 

{	
	WebDriver driver;
	
	ExtentHtmlReporter htmlreporter;
	ExtentTest test;
	ExtentReports extent;
	
	
	 @BeforeSuite
	  public void OpenBrowser() 
	 {
		  System.out.println("In openBrowser method under BeforeSuite");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			 driver=new ChromeDriver();
		  System.out.println("Chrome browser is opened successfully"); 
	  }
	 
	 @BeforeTest
	  public void EnterURL() 
	 {
		 
		 htmlreporter = new ExtentHtmlReporter("extent.html");
		 extent =new ExtentReports();
		 extent.attachReporter(htmlreporter);
		 test=extent.createTest("login");
		 
		 System.out.println("In enterApplicationURL method under BeforeTest");
		  driver.get("https://www.mercurytravels.co.in");
		  System.out.println("Application url has entered successfully"); 
	  }
	 
	 @BeforeClass
	  public void Maximize_browsere()
	 {
		 System.out.println("In maximizeBrowser method under BeforeClass");
		  driver.manage().window().maximize();
		  System.out.println("Chrome browser is maximized successfully"); 
	  }
	 
	 @BeforeMethod
	  public void getcookies()
	 {

		  System.out.println("In getAllCookies method under BeforeMethod");
			/*
			 * Set<Cookie> cookies=driver.manage().getCookies(); for (Cookie cookie:cookies)
			 * { System.out.println(cookie.getName()); }
			 */
	  }
	 
	 @Test 
	  public void ABCB() throws InterruptedException
	  {
		 System.out.println("login ");
		
		test.info("Into test");
		 test.info("login");
		  System.out.println("ABCB");
		  System.out.println("In Test");
		  Thread.sleep(4000);
		  
		  Actions a =new Actions(driver);
		  a.moveToElement(driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"))).build().perform();
		  Thread.sleep(2000);
		 test.info("click on login");
		  driver.findElement(By.xpath("(//a[contains(text(),'User Login')])[2]")).click ();
		  Thread.sleep(2000);
		  
		
		 driver.findElement(By.id("sign_user_email")).sendKeys("sonawanesushil57@gmail.com");
		 Thread.sleep(2000);
		 test.info("Enter email id");
		 driver.findElement(By.id("sign_user_password")).sendKeys("Sushil@123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		 Thread.sleep(2000);
		test.info("enter password");
		 
		 WebElement welcomeUser=driver.findElement(By.xpath("(//span[@class='caret'])[6]"));
			
		
			Actions action = new Actions(driver);
			action.moveToElement(welcomeUser).build().perform();
			
			Thread.sleep(2000);
			WebElement logout=driver.findElement(By.xpath("(//a[text()=' Log Out'])[2]"));
	     logout.click();
			
			System.out.println("Logout successfully");
			test.pass("Pass the login test");
		//test.pass("pass");
		 
	  }
	
 
  

  @AfterMethod
  public void getScreenshot()  throws IOException
  {
	  System.out.println("In captureScreenshot under AfterMethod");
	  File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFileToDirectory(src, new File("C:\\Users\\Ganesh\\eclipse-workspace\\Selenium\\ss"));  
  }

  

  @AfterClass
  public void deleteallcookies() 
  {
	  System.out.println("In deleteAllCookies method under AfterTest");
	  driver.manage().deleteAllCookies();
	  
  }

 

  @AfterTest
  public void dbconnection_close() 
  {
	  
	  extent.flush();
	  System.out.println("In dbConnectionClosed method under AfterTest");
  }

 

  @AfterSuite
  public void CLoseBrowser() 
  {
	  System.out.println("In closeBrowser method under AfterSuite");
	  driver.close();
  }

}
