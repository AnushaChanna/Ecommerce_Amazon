package E_commerce_amazon;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Utility_project.listeners_ss.class)
public class Testcase6_Filter extends AmazonLaunch_BM_AM
{

	@Test//(retryAnalyzer=Utility_project.Retry.class)
	public void productfilter()
	{
		SearchProduct_TC5 s1=new SearchProduct_TC5(driver);
		s1.searchbook();
		
		FilterAfterSearch_TC6 f1=new FilterAfterSearch_TC6(driver);
		f1.clickonfeatured();

		
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url.contains("price-asc"), true);


		
		
	}
}


/*List<WebElement> dropdown=driver.findElements(By.xpath("//div[@class='a-popover-inner']/ul/li"));
int count = dropdown.size();
System.out.println(count);

for (int i=0; i<=count-1;i++ )
{
	WebElement d1=dropdown.get(i);
	String text=d1.getText();
	System.out.println(text);
	if (text.contains("Low to High"))
	{
	d1.click();
	}	
}*/