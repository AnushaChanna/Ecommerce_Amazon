package E_commerce_amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_project.DDT_project;

@Listeners(Utility_project.listeners_ss.class)

public class Testcase2_Login extends AmazonLaunch_BM_AM
{
	@Test//(retryAnalyzer=Utility_project.Retry.class)
	public void login_amazon_valid() throws EncryptedDocumentException, IOException, InterruptedException
	{ 
		
		DDT_project data =new DDT_project();
		data.login_credentials();
		
		Login_TC2 l1=new Login_TC2(driver);
		l1.accountslist(driver);
		l1.signin();		
		l1.username();
		l1.password();
		l1.signinPassword();
		
		
		//String title= driver.getCurrentUrl();
		//String title1= driver.getTitle();
	//	System.out.println(title1);
	String b1 = l1.LoginSuccess(driver);
	System.out.println(b1);
		Assert.assertEquals(b1,"Hello, Anusha" , "login successfull");
	}
	
}
