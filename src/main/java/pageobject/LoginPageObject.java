package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableabstractcomponents.AbstractComponent;

public class LoginPageObject extends AbstractComponent
{
	WebDriver driver;
	public LoginPageObject(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email") WebElement un;
	@FindBy(name="pass") WebElement pwd;
	@FindBy(name="login") WebElement lgn_btn;
	public void openLoginPage()
	{
		driver.get("https://www.facebook.com/");
		impWait(3);
		max();
	}
	public void enterUnandPw(String str_un, String str_pwd)
	{
		un.sendKeys(str_un);
		pwd.sendKeys(str_pwd);
		lgn_btn.click();
		//close();
	}
}
