package E_commerce_amazon;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_project.DDT_project;
@Listeners(Utility_project.listeners_ss.class)
public class Testcase13_CouponCode extends AmazonLaunch_BM_AM
{

@Test (retryAnalyzer=Utility_project.Retry.class)
public void ApplyCoupon() throws EncryptedDocumentException, IOException
{
	DDT_project d1=new DDT_project();
	d1.login_credentials();
	
	Login_TC2 l1=new Login_TC2(driver);
	l1.accountslist(driver);
	l1.signin();
	l1.username();
	l1.password();
	l1.signinPassword();
	
	SearchProduct_TC5 sp=new SearchProduct_TC5(driver);
	sp.searchbook();
	
	AddToCart_Tc15 ac=new AddToCart_Tc15(driver);
	ac.SelectProduct();

	
	ReviewOrder_TC11 r1=new ReviewOrder_TC11(driver);
	r1.BuyNow(driver);
	
	CouponCode_TC13 c1=new CouponCode_TC13(driver);
	c1.CouponCode();
	c1.ApplyCoupon();
	
	boolean a1=c1.AlertMess();
	Assert.assertEquals(a1,true,"Test case is pass");
	
}
}
