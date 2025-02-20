package test_script;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobject.LoginPageObject;

public class BaseTest extends ReusableTestComponents {
	@Test
	public void tc1() throws IOException
	{
		launchAndLogin();
	}
}