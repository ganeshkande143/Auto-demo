package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo 
{
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("holiday_category_id")).sendKeys("India");
		Thread.sleep(3000);
		driver.findElement(By.id("holiday_category_id")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("dphh1")).click();
		Thread.sleep(3000);
		
		
		List<WebElement>wb=driver.findElements(By.xpath("//div[@class='datepicker dropdown-menu' and @style='display: block; top: 282.5px; left: 413.969px;']/div/table/tbody/tr/td"));
		
		for(WebElement x: wb)
		{
			
			String d=x.getAttribute("class");
			System.out.println(d);
			
			String s=x.getText();
			System.out.println(s);
			
			//Thread.sleep(1000);
			if(d.equalsIgnoreCase("day  active"))
			{
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("arguments[0].click();", x);
			}	
		}
		Thread.sleep(3000);
	
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}
}
