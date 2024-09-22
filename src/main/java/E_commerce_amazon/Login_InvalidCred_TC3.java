package E_commerce_amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_InvalidCred_TC3 
{
	ChromeDriver driver;
	@FindBy(xpath="(//span[@class='nav-line-1 nav-progressive-content'])[2]")
	WebElement accountlist;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement Act_List_signin;
	
	@FindBy(name="email")
	WebElement email;
	
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(id="signInSubmit")
	WebElement signinafterpassword;
	
	@FindBy(id="auth-error-message-box")
	WebElement incorrect;
	
	public void accountslist(ChromeDriver driver) 
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountlist).perform();
	}
	
	public void signin()
	{
		Act_List_signin.click();
	}
	
	
	public void username()
	{
	
		email.sendKeys("98763210" + Keys.ENTER);
	}
	
	public void password()
	{
		pass.sendKeys("cscvsj33" );
	}
	
	public void signinPassword()
	{
		signinafterpassword.click();
	}
	
	public boolean incorrectMbl()
	{
	return	incorrect.isDisplayed();
	}
	
	
	public Login_InvalidCred_TC3(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	

}
