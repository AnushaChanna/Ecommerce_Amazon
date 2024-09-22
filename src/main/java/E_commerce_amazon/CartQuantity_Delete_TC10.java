package E_commerce_amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartQuantity_Delete_TC10 

{
	@FindBy(id= "sw-gtc")
	WebElement gotocart;
	
	@FindBy(id="a-autoid-0")
	WebElement quantity;
	
@FindBy(id="sc-subtotal-label-buybox")
	WebElement subtotal;
	
	@FindBy(xpath="//div[@class='sc-list-item-content']//child::input[@value='Delete']")
	WebElement delete;
	
	@FindBy(xpath="//div[@class='a-row sc-cart-header']")
	WebElement message;
	
	public void GoToCart()
	{
		gotocart.click();
	}
	
	public void Quantity(ChromeDriver driver)
	{
		quantity.click();
		List<WebElement> drop=driver.findElements(By.xpath("//div[@class='a-popover-wrapper']/div/ul/li"));
		int count = drop.size();
		
		for(int i=0; i<count; i++)
		{
			WebElement increasequntity=drop.get(i);
			String text=increasequntity.getText();
			if(text.contains("3"))
			{
				increasequntity.click();
			}				
		}
	}
	
	public String Subtotal()
	{
		return subtotal.getText();
	}
	
	public void DeleteItem()
	{
		delete.click();
	}
	
	public String cartemptymessage()
	{
		return message.getText();
	}
	
	
public CartQuantity_Delete_TC10(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

