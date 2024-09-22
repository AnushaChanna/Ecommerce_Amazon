package E_commerce_amazon;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Utility_project.listeners_ss.class)
public class Testcase5_Search extends AmazonLaunch_BM_AM
{
	@Test (retryAnalyzer=Utility_project.Retry.class)
	public void amazon_Search()
	{
	SearchProduct_TC5 s1=new SearchProduct_TC5(driver);
	s1.searchbook();

	String title=driver.getCurrentUrl();
	System.out.println(title);
	Assert.assertEquals(title.contains("books"), true, "Fail please try again");
}
}