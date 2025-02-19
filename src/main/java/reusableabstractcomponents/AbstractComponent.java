package reusableabstractcomponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class AbstractComponent 
{
	WebDriver driver;
	public AbstractComponent(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void max()
	{
	driver.manage().window().maximize();
	}
	public void impWait(int a)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	}
	public void close()
	{
		driver.close();
	}
}
