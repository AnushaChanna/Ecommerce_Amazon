package E_commerce_amazon;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_project.DDT_project;
@Listeners(Utility_project.listeners_ss.class)
public class Testcase11_OrderReview extends AmazonLaunch_BM_AM
{
@Test(retryAnalyzer=Utility_project.Retry.class)
public void FinalReviewOrder() throws EncryptedDocumentException, IOException, InterruptedException 
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
	r1.COD();
	Thread.sleep(3000);
	r1.UseThisPayment();
	
	//r1.Review();
	
	boolean b1= r1.Arrivingdate();
	Assert.assertEquals(b1, true);
}
	
	
	
}



/*//r1.Cartlogo();
	//r1.proccedtobuybutton();
	r1.BuyNow();
	r1.SelectAddress();
	r1.SaveInstructions();
	
//	WebElement w1=r1.waitforaddress();
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	//wait.until(ExpectedConditions.visibilityOf(w1));
	
	r1.UseThisAdressButton();
	r1.OtherUPI();//
	r1.UPIPay();
	r1.VerifyUPI();
	r1.UseThisPay();
	
	*/