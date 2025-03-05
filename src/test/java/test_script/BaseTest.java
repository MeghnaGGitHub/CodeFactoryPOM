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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.LoginPageObject;
import utilitiespack.ScreenshotUtility;

public class BaseTest extends ReusableTestComponents {
	
	
	@Test(dataProvider="excelData")
	public void tc1(String username,String password) throws IOException
	{
		System.out.println(username+" "+password);
	}
	
	
	@DataProvider(name="excelData")
	public Object[][] getExcelData() throws IOException
	{
		String filepath="C:\\Users\\Meghna\\Desktop\\DataDriven\\MyCSV.xlsx";
		String sheetName="MySheet";
		return  ExcelUtil.readExcelData(filepath,sheetName);
	}
	
}