package E_commerce_amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RateOrder_TC14 //extends DDT_project
{
	
	@FindBy(xpath="(//span[@class='nav-line-2'])[2]")
	WebElement orders;
	
	@FindBy(className="a-dropdown-prompt")										//(//div[@class='a-popover-inner']/ul/li)[3]
	WebElement filteryear;
	
	@FindBy(xpath="//select[@id='time-filter']")
	WebElement selectyear;
	
	@FindBy(xpath="(//a[@id='Write-a-product-review_2'])[1]")
	WebElement writereview;
	
	@FindBy(xpath="//span[.='Submitted']")
	WebElement submitted;
	
	@FindBy(xpath="(//button[@class='ryp__star__button'])[5]")
	WebElement rate5;
	
	@FindBy(xpath="(//button[@class='ryp__star__button'])[1]")
	WebElement rate1;
	
	public void clickOnOrders()
	{
		orders.click();
	}

	public void selectOrderfilter()
	{
		filteryear.click();
		
	}
	
	public void selectyear()
	{
		
		Select s1=new Select(selectyear);
		s1.selectByValue("year-2024");

	}

	public void Writereview()
	{
		writereview.click();
   
		
	}

	public void fivestars()
	{
		rate5.click();
	}
	
	public void onestars()
	{
		rate1.click();
	}
	public boolean ReviewStarsSubmitted()
	{
		 
		return submitted.isDisplayed();
	}
	public RateOrder_TC14(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
}












/*	public void selectOrderfilter()
{
filteryear.click();
Select s1=new Select(selectyear);
s1.selectByValue("3");

/*List<WebElement> s1=driver.findElements(By.xpath("//div[@class='a-popover-inner']/ul/li"));
int count= s1.size();

	for (int i=0 ; i<count ; i++)
	{
		WebElement click=s1.get(i);
		String text = click.getText();
		if(text.contains("2024"))
		{
			click.click();
		}
	}*/

