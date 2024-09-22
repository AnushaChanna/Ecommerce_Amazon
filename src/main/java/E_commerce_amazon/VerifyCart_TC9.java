package E_commerce_amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyCart_TC9
{
		@FindBy(name="proceedToRetailCheckout")
		WebElement proccedtobuy;
		
		public boolean ProceedBuy()
		{
			return proccedtobuy.isEnabled();
			
		}
		
public VerifyCart_TC9(ChromeDriver driver)
{
	PageFactory.initElements(driver, this);
}


}
