package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_switch
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 12");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		Thread.sleep(3000);
		
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		
		for(String x:s)
		{
			driver.switchTo().window(x);
		}
		
		String p=driver.findElement(By.xpath("(//div[@class='_3LWZlK'])[1]")).getText();
		System.out.println(p);
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
