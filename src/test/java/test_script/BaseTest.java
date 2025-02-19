package test_script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobject.LoginPageObject;

public class BaseTest {
	@Test
	public void tc1()
	{
		WebDriver driver=new ChromeDriver();
		LoginPageObject lp=new LoginPageObject(driver);
		lp.openLoginPage();
		lp.enterUnandPw("meghna@gmail.com", "meghna@313");
	}
}
