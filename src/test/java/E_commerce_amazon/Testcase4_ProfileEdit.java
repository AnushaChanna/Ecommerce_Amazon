package E_commerce_amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_project.DDT_project;

@Listeners(Utility_project.listeners_ss.class)
public class Testcase4_ProfileEdit extends AmazonLaunch_BM_AM
{
	@Test (retryAnalyzer=Utility_project.Retry.class)
	public void EditProfile() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		DDT_project d1=new DDT_project();
		d1.login_credentials();
		
		Login_TC2 l1=new Login_TC2(driver);
		l1.accountslist(driver);
		l1.signin();
		l1.username();
		l1.password();
		l1.signinPassword();
		
		
		Profile_Edit_TC4 p1=new Profile_Edit_TC4(driver);
		p1.Acct_List_Click();
		p1.Profile_Click();
		p1.EditYourProfile();
		p1.profilename();
		p1.ClickSave();
		p1.backToProfile();
		
		String t1= p1.changedname(driver);
		Assert.assertEquals(t1.contains("Anusha Channa"), true,"Profile edited successfully");
	
	}

	
}
