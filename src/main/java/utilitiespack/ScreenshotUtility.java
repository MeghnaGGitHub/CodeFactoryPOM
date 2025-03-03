package utilitiespack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility 
{
	WebDriver driver;
	public ScreenshotUtility(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void takeScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot src=(TakesScreenshot)driver;
		File source=src.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Meghna\\Desktop\\ScreenshotFramework\\Scr2.png");
		FileUtils.copyFile(source, destination);
	}
}
