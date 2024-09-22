package E_commerce_amazon;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility_project.DDT_project;

public class Profile_Edit_TC4 extends DDT_project
{
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement acct_list;

	@FindBy(xpath="(//div[@class='a-box-inner']//span[@class='a-list-item'])[16]")
	WebElement profile;

	@FindBy(xpath="//div[@class='button-header-container-rows']//child::button[.='Edit your profile']")
	WebElement editbutton;
	
	@FindBy(id="profile_name")
	WebElement name;
	
	
	@FindBy(xpath="//span[@id='a-autoid-0']")
	WebElement back;
	
	@FindBy(id="save-public-activity")
	WebElement save ;
	
	
	@FindBy(xpath="//span[@class='a-size-extra-large card-title']")
	WebElement changedname ;
	
	public void Acct_List_Click()
	{
	acct_list.click();
	}
	public void Profile_Click()
	{
	profile.click();
	}
	public void EditYourProfile()
	{
		editbutton.click();
	}
	
	public void profilename()
	{
		name.click();
		name.clear();
		name.sendKeys("Anusha Channa");
	}
	
	public void backToProfile()
	{
		back.click();
	}
	

	public void ClickSave()
	{
		save.click();
	}
	
	
	public String changedname(ChromeDriver driver)
	{
		return changedname.getText();
	}
	public Profile_Edit_TC4(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
