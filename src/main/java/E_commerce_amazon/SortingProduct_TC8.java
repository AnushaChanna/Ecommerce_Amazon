package E_commerce_amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SortingProduct_TC8
{
	ChromeDriver driver;
	
	@FindBy(xpath="//span[.='Family & Relationships']")
	WebElement filterBook;
	
	
	@FindBy(xpath="//span[.='70% Off or more']")
	WebElement discount;
	
	@FindBy(id="s-result-sort-select")
	WebElement sort;
	
	public void Filter()
	{
		filterBook.click();
	}
	public void Discount()
	{
		discount.click();
	}
	
	public void Sorting()
	{
		Select s1=new Select(sort);
		s1.selectByVisibleText("Avg. Customer Review");
	}
	
	// tried to locate discount
	
	/*@FindBy (linkText="Discount")
	WebElement discount;

	public void SortWithDiscount()
	{
		List<WebElement> l1= driver.findElements(By.xpath("(//ul[@id='filter-p_n_pct-off-with-tax']/span/span/li)"));
		int count=l1.size();
System.out.println(count);

for (int i=0; i<count;i++)
{
	WebElement selectdiscount=l1.get(i);
	String text=selectdiscount.getText();
	System.out.println(text);
	if(text.contains("70% Off or more"))
	{
		selectdiscount.click();
	}
}
	}*/
	
	
	public SortingProduct_TC8(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
}
