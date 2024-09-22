package E_commerce_amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_project.DDT_project;
@Listeners(Utility_project.listeners_ss.class)
public class Testcase14_RatelastOrder extends AmazonLaunch_BM_AM
{
@Test(retryAnalyzer=Utility_project.Retry.class)
public void RateLastOrder() throws EncryptedDocumentException, IOException
{
	DDT_project d1 =new DDT_project();
	d1.login_credentials();
	
	Login_TC2 l1=new Login_TC2(driver);
	l1.accountslist(driver);
	l1.signin();
	l1.username();
	l1.password();
	l1.signinPassword();
	
	RateOrder_TC14 r1=new RateOrder_TC14(driver);
	r1.clickOnOrders();
	r1.selectOrderfilter();
	r1.selectyear();
	r1.Writereview();
	r1.fivestars();
	r1.onestars();
	
	boolean b1=r1.ReviewStarsSubmitted();
	Assert.assertEquals(b1, true);
	
}
	
}




//div[@class='a-section']/div/div/div