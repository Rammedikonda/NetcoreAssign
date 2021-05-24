package com.Flipkart.GenericRepository;

import org.testng.ITestListener;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener
{
	
public void onTestFailure(ITestResult result)
{
	String faildTestname = result.getMethod().getMethodName();
	
	EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.driver);
	File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
	File dstFile = new File("./screenShot/"+faildTestname+".png");
	
	try {
		FileUtils.copyFile(srcFile, dstFile);
	} catch (Exception ep) {
    
	   ep.printStackTrace();
	}
}

}
