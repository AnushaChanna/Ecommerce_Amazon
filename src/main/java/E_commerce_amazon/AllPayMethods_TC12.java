package E_commerce_amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AllPayMethods_TC12
{
	/*@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement amazonpay;*/
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement ccORdc;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement netbanking;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement upi;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement emi;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement cod;
	
	
	/*public void AmazonPay()
	{
		amazonpay.click();
		
		/*boolean b1=amazonpay.isSelected();
		Assert.assertEquals(b1, true);
	}
	*/
	public void CC_DC()
	{
		ccORdc.click();
		/*boolean b2=ccORdc.isSelected();
		Assert.assertEquals(b2, true);*/
	}
	
	public void NetBanking()
	{
		netbanking.click();
		
		/*boolean b3=netbanking.isSelected();
		Assert.assertEquals(b3, true);*/
	}
	
	public void UPI()
	{
		upi.click();
	
	}
	
	public void COD()
	{
		cod.click();
		/*boolean b6=netbanking.isSelected();
		Assert.assertEquals(b6, true);*/
	}
	
	/*public boolean amazonpaycompare()
	{
		return amazonpay.isSelected();

	}
	*/
	public boolean CCDCcompare()
	{
		return ccORdc.isSelected();

	}
	
	public boolean NetBankcompare()
	{
		return netbanking.isSelected();
		
	}
	
	public boolean upicompare()
	{
		return upi.isSelected();
		
	}
	
	public boolean codcompare()
	{
		return cod.isSelected();
		
	}
	
	
	public  AllPayMethods_TC12(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
}
