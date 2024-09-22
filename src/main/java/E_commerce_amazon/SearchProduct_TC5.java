package E_commerce_amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct_TC5 
{
	@FindBy(id="twotabsearchtextbox")
	WebElement search;

	public void searchbook()
	{
		search.sendKeys("books" + Keys.ENTER);
		
	}
	
	public SearchProduct_TC5(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
