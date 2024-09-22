package E_commerce_amazon;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Utility_project.listeners_ss.class)
public class Tescase9_VerifyCart extends AmazonLaunch_BM_AM
{
	
	@Test(retryAnalyzer=Utility_project.Retry.class)
	public void verifyingcart()
	{
	
			SearchProduct_TC5 s1=new SearchProduct_TC5(driver);
			s1.searchbook();
			
			AddToCart_Tc15 a1=new AddToCart_Tc15(driver);
			a1.SelectProduct();			
			a1.clickaddtocart(driver);
					
			VerifyCart_TC9 v1=new VerifyCart_TC9(driver);
			
			boolean b1=v1.ProceedBuy();
			Assert.assertEquals(b1, true,"please try again");
			

	}
}
