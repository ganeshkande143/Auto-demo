package Basic;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class A 
{
	public static void main(String[] args)
	{
		WebDriver driver ;
		
		
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		File addonpath = new File("C:\\Users\\Ganesh\\Downloads\\v0.31.0.xpi");
		
		firefoxProfile.addExtension(addonpath);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		
		String profile = null;
		capabilities.getCapability(FirefoxDriver.PROFILE);
		driver = new FirefoxDriver(capabilities);
		driver.get("http://www.helloselenium.com");
		driver.quit();

	
	}

	
}
