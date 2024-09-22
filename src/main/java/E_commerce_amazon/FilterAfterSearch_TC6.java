package E_commerce_amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility_project.DDT_project;


public class FilterAfterSearch_TC6 extends DDT_project
{
//@FindBy(xpath="//span[@class='a-dropdown-prompt']")
@FindBy(id="s-result-sort-select")
WebElement filter;


public void clickonfeatured()
{
	//filter.click();
//	WebElement w1=driver.findElement(By.xpath("//div[@class='a-popover-inner']/ul/li"));
	Select s1=new Select(filter);
	s1.selectByVisibleText("Price: Low to High");
	

}
public FilterAfterSearch_TC6(ChromeDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
