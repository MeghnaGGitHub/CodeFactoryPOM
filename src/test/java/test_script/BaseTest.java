package test_script;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageobject.LoginPageObject;
import utilitiespack.ScreenshotUtility;

public class BaseTest extends ReusableTestComponents {
	@Test
	public void tc1() throws IOException
	{
		launchAndLogin();
		Assert.assertFalse(true);
	}
	@AfterMethod
	public void faultCapture(ITestResult result) throws IOException
	{
		if (ITestResult.FAILURE==result.getStatus()) 
		{
			ScreenshotUtility su=new ScreenshotUtility(driver);
			su.takeScreenshot(driver);
			System.out.println(result.getMethod().getMethodName());
			System.out.println(result.getThrowable());
		}
	}
}