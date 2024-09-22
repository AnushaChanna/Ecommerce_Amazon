package E_commerce_amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_project.DDT_project;

public class CouponCode_TC13 extends DDT_project
{
	/*@FindBy(name="submit.buy-now")
	WebElement buynow;*/
	
	@FindBy(xpath="//input[@placeholder='Enter Code']")
	WebElement entercode;
	
	@FindBy(name="ppw-claimCodeApplyPressed")
	WebElement apply;
	
	@FindBy(xpath="//div[@class='a-column a-span12 pmts-error-message-inline']")
	WebElement alert;
	
	/*public void ClickBuyNow()
	{
		buynow.click();
	}*/
	public void CouponCode()
	{
		entercode.sendKeys("WVMTTK242");
	}
	
	public void ApplyCoupon()
	{
		apply.click();
	}
	
	public boolean AlertMess()
	{
		return alert.isEnabled();
	}
	
	public CouponCode_TC13(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
