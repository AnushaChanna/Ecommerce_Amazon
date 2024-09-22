package E_commerce_amazon;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Utility_project.listeners_ss.class)
public class Testcase7_ProductDetailsPage extends AmazonLaunch_BM_AM
{

	@Test //(retryAnalyzer=Utility_project.Retry.class)
	public void productpagedetails()
	{
		SearchProduct_TC5 s1=new SearchProduct_TC5(driver);
		s1.searchbook();
		
		
		AddToCart_Tc15 a1=new AddToCart_Tc15(driver);
		a1.SelectProduct();
		
	
		ProductDetailsPage_TC7	pd1=new ProductDetailsPage_TC7(driver);
		
		
		boolean b1 = pd1.price(driver);
		Assert.assertEquals(b1, true);
		
		boolean b2 = pd1.reviews();
		Assert.assertEquals(b2, true);
		
		boolean b3 = pd1.ProdctDescription();
		Assert.assertEquals(b3, true);
		
		
		
	}
	
	
}
