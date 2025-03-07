package listenerpack;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("Hello I'm listener & I'm listening & test case is started");
		System.out.println(result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test case is listened & is successful");
		System.out.println(result.getName());

	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test case is listened & is failed");
		System.out.println(result.getName());
		System.out.println(result.getThrowable());
		System.out.println("I've captured screenshot");
	}
}
