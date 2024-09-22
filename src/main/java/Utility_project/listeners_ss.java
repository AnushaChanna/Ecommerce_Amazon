package Utility_project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listeners_ss implements ITestListener
{
	public static ChromeDriver driver;

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		ITestListener.super.onTestSuccess(result);
		
		Reporter.log("testcase is pass > report from Listeners");
		
		TakesScreenshot T1=driver;
		
		File source = T1.getScreenshotAs(OutputType.FILE);
		File destination=new File ("C:\\Users\\LENOVO\\eclipse-workspace\\Project_Screenshot\\Pass\\amazon"+ Math.random() + ".png");
			
		try 
		{
			FileHandler.copy(source, destination);
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		ITestListener.super.onTestFailure(result);
		
		Reporter.log("testcase is fail > report from Listeners");
		
		TakesScreenshot T1=driver;
		
		File source=T1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Project_Screenshot\\Fail\\amazon"+ Math.random() + ".png");
		
				try {
					FileHandler.copy(source, destination);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	
	}

	

}

