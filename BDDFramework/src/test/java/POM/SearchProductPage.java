package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.BaseDriver;

public class SearchProductPage extends BaseDriver
{
	public static String searchfieldloc = "//input[@class='form-control input-lg']";
	public static String searchbuttonloc = "//button[@class='btn btn-default btn-lg']";
	
	public static String searchElements = "//div[@class='caption']";
	
	public static String selectproduct = ("//a[text()='MacBook Pro'])[2]");
	
	public SearchProductPage(WebDriver driver)
	{
		BaseDriver.driver = driver;
	}
	
	public void enterSearchinput()
	{
		driver.findElement(By.xpath(searchbuttonloc)).sendKeys("Mac");
	}
	
	public void clickonSearchbutton()
	{
		driver.findElement(By.xpath(searchbuttonloc)).click();
	}
	
	public void getsearchresults()
	{
		driver.findElement(By.xpath(selectproduct)).click();
		
	}
}
