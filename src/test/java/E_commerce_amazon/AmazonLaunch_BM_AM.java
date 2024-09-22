package E_commerce_amazon;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utility_project.listeners_ss;

public class AmazonLaunch_BM_AM extends listeners_ss
{
//public static ChromeDriver driver;
	@BeforeMethod
	public void amazonlaunch()
	{
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void amazonlogout()
	{
		driver.quit();
	}
	
}
