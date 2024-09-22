package E_commerce_amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utility_project.listeners_ss.class)
public class Testcase1_Register extends AmazonLaunch_BM_AM

{
	@Test //(retryAnalyzer=Utility_project.Retry.class)
	public void register() throws InterruptedException
	{
		Login_TC2 l1=new Login_TC2(driver);
		l1.accountslist(driver);
		
		Register_TC1 r1=new Register_TC1(driver);
		r1.startforReg();
		r1.username();
		r1.phonenumber();
		r1.PassWordReg();
		r1.VerifyPhnNum();
		/*try
		{
		r1.TypeCaptcha();
		
	
			r1.CaptchaCont();
			
		}
		catch (Exception e)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Start Puzzle")));
		}
		finally
		{*/
		
	boolean c1=r1.AlertPopup();
	Assert.assertEquals(c1, true,"User already registered");
		
		
		
	
	}
}
