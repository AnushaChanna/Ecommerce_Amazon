package E_commerce_amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage_TC7
{
	ChromeDriver driver;
	
	@FindBy (xpath="(//span[@class='a-price-whole'])[1]")
	WebElement prodPrice;
	
	@FindBy (id="acrCustomerReviewText")
	WebElement	reviews;
	
	@FindBy (id="bookDescription_feature_div")
	WebElement	proddesc;
	
	public boolean price(ChromeDriver driver)
	{
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> id=ids.iterator();
		String parent_ID= id.next();
		String child_id = id.next();
		driver.switchTo().window(child_id);
		
	return	prodPrice.isDisplayed();
		
	}
	
	public boolean reviews()
	{
		return reviews.isDisplayed();
	}
	
	public boolean ProdctDescription()
	{
		return proddesc.isDisplayed();
	}

	public ProductDetailsPage_TC7(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
