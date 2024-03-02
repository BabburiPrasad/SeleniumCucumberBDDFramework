package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseDriver{
	
	public static WebDriver driver;
	public WebDriver launchBrowser()
	{
		
		//options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
        
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		return driver;
	}
	
	public void close()
	{
		driver.close();
	}

}
