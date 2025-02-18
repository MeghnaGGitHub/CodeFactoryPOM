package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject 
{
	WebDriver driver;
	WebElement email;
	WebElement pwd;
	
	
	public LoginPageObject(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void openLoginPage()
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	public void enterUnandPw()
	{
		email=driver.findElement(By.id("email"));
		pwd=driver.findElement(By.id("pass"));
		email.sendKeys("meghna@gmail.com");
		pwd.sendKeys("ABC");
	}
}
