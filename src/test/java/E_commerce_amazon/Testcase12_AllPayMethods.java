package E_commerce_amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_project.DDT_project;


@Listeners(Utility_project.listeners_ss.class)
public class Testcase12_AllPayMethods extends AmazonLaunch_BM_AM
{
	@Test (retryAnalyzer=Utility_project.Retry.class)
	public void PaymentRadioButton() throws EncryptedDocumentException, IOException
	{
		DDT_project d1=new DDT_project();
		d1.login_credentials();
		
		Login_TC2 l1=new Login_TC2(driver);
		l1.accountslist(driver);
		l1.signin();
		l1.username();
		l1.password();
		l1.signinPassword();
		
		SearchProduct_TC5 s1=new SearchProduct_TC5(driver);
		s1.searchbook();
								
		AddToCart_Tc15 a1=new AddToCart_Tc15(driver);
		a1.SelectProduct();
		
		ReviewOrder_TC11 r1=new ReviewOrder_TC11(driver);
		r1.BuyNow(driver);
		
		AllPayMethods_TC12 p1=new AllPayMethods_TC12(driver);
		/*p1.AmazonPay();
		boolean b1=p1.amazonpaycompare();
		Assert.assertEquals(b1, true);*/
		
		p1.CC_DC();
		boolean b2=p1.CCDCcompare();
		Assert.assertEquals(b2, true);
		
		p1.NetBanking();
		boolean b3=p1.NetBankcompare();
		Assert.assertEquals(b3, true);
		
		p1.UPI();
		boolean b4=p1.upicompare();
		Assert.assertEquals(b4, true);
		
		
		p1.COD();
		boolean b6=p1.codcompare();
		Assert.assertEquals(b6, true);		
		
		
	}
	
}
