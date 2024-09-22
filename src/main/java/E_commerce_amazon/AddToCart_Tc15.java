package E_commerce_amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_Tc15
{
	ChromeDriver driver;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-fixed-height'])[10]")
	WebElement selectbook;
	
	@FindBy(id="add-to-cart-button")
	WebElement producttocart;
	
	public void SelectProduct()
	{
		selectbook.click();	
	}
	
	public void clickaddtocart(ChromeDriver driver)
	{
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> id= ids.iterator();
		String parentid=id.next();
		String childid=id.next();
		driver.switchTo().window(childid);
		
		producttocart.click();
	}
	public AddToCart_Tc15(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
