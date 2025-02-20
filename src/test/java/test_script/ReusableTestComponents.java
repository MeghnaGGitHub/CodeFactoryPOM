package test_script;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageobject.LoginPageObject;

public class ReusableTestComponents 
{
	WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Meghna\\Desktop\\FreameworkCF\\src\\main\\java\\resources\\global_data.properties");
		prop.load(fis);
		String browser_name =prop.getProperty("browser");
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();
		}
		return driver;	
	}
	public void launchApplication() throws IOException
	{
		driver=initializeDriver();
		LoginPageObject lpo=new LoginPageObject(driver);
		lpo.openLoginPage();
	}
	public void launchAndLogin() throws IOException
	{
		driver=initializeDriver();
		LoginPageObject lpo=new LoginPageObject(driver);
		lpo.openLoginPage();
		lpo.enterUnandPw("meghna@gmail.com", "ABC");
	}
	
	
}
