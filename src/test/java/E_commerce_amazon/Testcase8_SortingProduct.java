package E_commerce_amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Utility_project.listeners_ss.class)
public class Testcase8_SortingProduct extends AmazonLaunch_BM_AM
{

	@Test//(retryAnalyzer=Utility_project.Retry.class)
	public void sorting()
	{
		SearchProduct_TC5 s1=new SearchProduct_TC5(driver);
		s1.searchbook();
		
		
		SortingProduct_TC8 sp=new SortingProduct_TC8(driver);
		//sp.Filter();
		sp.Discount();
		sp.Sorting();
		
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url.contains("review"), true,"review is not found please check again");
	
	
	}
}















/*	List<WebElement> l1= driver.findElements(By.xpath("(//ul[@id='filter-p_n_pct-off-with-tax']/span/span/li)"));
int count=l1.size();
System.out.println(count);

for (int i=0; i<count;i++)
{
WebElement selectdiscount=l1.get(i);
String text=selectdiscount.getText();
System.out.println(text);
if(text.contains("70% Off or more"))
{
selectdiscount.click();
}
}

/*String url=driver.getCurrentUrl();
Assert.assertEquals("please try again", true,url.contains(""));
*/
