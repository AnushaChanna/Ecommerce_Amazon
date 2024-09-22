package E_commerce_amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_project.DDT_project;
@Listeners(Utility_project.listeners_ss.class)
public class Testcase3_LoginIvalid extends AmazonLaunch_BM_AM
{
	@Test//(retryAnalyzer=Utility_project.Retry.class)
	public void login_amazon_Invalid() throws EncryptedDocumentException, IOException
	{ 
		
		DDT_project d1 =new DDT_project();
		d1.login_credentials();
		
		Login_InvalidCred_TC3 l1=new Login_InvalidCred_TC3(driver);
		l1.accountslist(driver);
		l1.signin();
		l1.username();
		//l1.password();
		//l1.signinPassword();
		
		
		boolean b1=l1.incorrectMbl();
		Assert.assertEquals(b1, true,"testcase pass login failed with invalid cred");
		
		
	}
}
