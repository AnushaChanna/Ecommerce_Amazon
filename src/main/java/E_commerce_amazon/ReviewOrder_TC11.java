package E_commerce_amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_project.DDT_project;

public class ReviewOrder_TC11 extends DDT_project
{
	/*	@FindBy(id="nav-cart-count-container")
		WebElement cartsymbol;
		
		@FindBy(id = "sc-buy-box-ptc-button")
		WebElement proccedtobuy ;
	*/	
	@FindBy(id="buy-now-button")
	WebElement buy;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[6]")
	WebElement cod;
	
	
	@FindBy(xpath="//span[@id='orderSummaryPrimaryActionBtn']/span/input")
	WebElement usethispayment;
	
	@FindBy(id="spcViewButtonId")
	WebElement revieworder;

	@FindBy(xpath="//div[@class='a-box a-spacing-']")
	WebElement arriving;
	
		public void BuyNow(ChromeDriver driver)
		{
			Set<String> ids=driver.getWindowHandles();
			Iterator<String> id =ids.iterator();
			String Parent_ID=id.next();
			String Child_ID=id.next();
			driver.switchTo().window(Child_ID);
					
			buy.click();
			
		}
	
		public void COD()
		{
			cod.click();
		}
		
		public void UseThisPayment()
		{
			usethispayment.click();
		}
		
		public void Review()
		{
			revieworder.click();
		}
		
		public boolean Arrivingdate()
		{
			return arriving.isDisplayed();
		}
		
		public ReviewOrder_TC11(ChromeDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

	
		
		
}


/*	@FindBy(id="pp-VayXp2-98")
WebElement CCorDC ;

@FindBy(id="pp-VayXp2-101")
WebElement clickentercarddetails ;

	@FindBy(xpath="//div[@class='a-row address-row list-address-selected']//div")
		WebElement selectaddress ;
		
		@FindBy(xpath="//span[@id='orderSummaryPrimaryActionBtn']/span/input")
		WebElement  usethisadress;
		//xpath = "((//div[@class='a-row'])[14]//descendant::span)[4]"
         
		
		@FindBy(id="pp-lRawvU-124")
		WebElement otherupi;
		
		@FindBy(id="pp-zt5Upo-112")
		WebElement upipay  ;
		
		@FindBy(name="ppw-widgetEvent:ValidateUpiIdEvent")
		WebElement verifyupi;
		
		@FindBy(id="pp-zt5Upo-136-announce")
		WebElement usethispay;
	
		@FindBy(xpath="//input[@aria-labelledby='cdp-save-button-announce']")
		WebElement addinstructions;
		
		/*	public void Cartlogo ()
		{
			cartsymbol.click();
		}
		
		public void proccedtobuybutton()
		{
			proccedtobuy.click();
		}
		
		public WebElement waitforaddress()
		{
			return usethisadress;
		}
		
		public void UseThisAdressButton()
		{
		
			
			//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("orderSummaryPrimaryActionBtn-announce")));
			usethisadress.click();
		}
		
		public void OtherUPI()
		{
			otherupi.click();
		}
		public void UPIPay()
		{
			upipay.click();
			upipay.sendKeys(upi);
		}
		
		public void VerifyUPI()
		{
			verifyupi.click();
		}
		
		public void UseThisPay()
		{
			usethispay.click();
		}
		
		public boolean ReviewOrder()
		{
			return revieworder.isEnabled();
		}
		*/