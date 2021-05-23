package com.Flipkart.GenericRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public static WebDriver driver;
	public DataHandlerUtility dh=new DataHandlerUtility();
	
		@BeforeClass
		public void configBeforeClass() throws Exception
		{
			if(dh.getDataFromProperty("browser").equals("chrome"))
			{
			
			  System.setProperty("webdriver.chrome.driver", AutomationConstants.CHROME_PATH);
					driver=new ChromeDriver();
				}else if(dh.getDataFromProperty("browser").equals("firefox")) 
				{
					 System.setProperty("webdriver.firefox.driver",AutomationConstants.FIREFOX_PATH);
					driver=new FirefoxDriver();
				}
				else if(dh.getDataFromProperty("browser").equals("opera")) 
				{
					driver=new OperaDriver();
				}
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(AutomationConstants.implicitwaittime, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		@BeforeMethod
		public void configBeforeMethod() throws Exception
		{
			/*
			 * launch application with url
			 */
			driver.get(dh.getDataFromProperty("url"));
		}
		

}
