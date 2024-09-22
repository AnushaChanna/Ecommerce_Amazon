package E_commerce_amazon;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Utility_project.listeners_ss.class)
public class Testcase10_quantity_delete extends AmazonLaunch_BM_AM
{
		@Test (retryAnalyzer=Utility_project.Retry.class)
		public void verifyingCart() throws InterruptedException
		{			
											//searching book 
			SearchProduct_TC5 s1=new SearchProduct_TC5(driver);
			s1.searchbook();
			
											//selecting book 
			AddToCart_Tc15 a1=new AddToCart_Tc15(driver);
			a1.SelectProduct();
			a1.clickaddtocart(driver);
			
			CartQuantity_Delete_TC10 c1=new CartQuantity_Delete_TC10(driver);
			c1.GoToCart();
			c1.Quantity(driver);
			Thread.sleep(3000);
			c1.DeleteItem();
				
			String m1=c1.cartemptymessage();
			Assert.assertEquals(m1.contains("Your Amazon Cart is empty"), true);
			
		}
}

