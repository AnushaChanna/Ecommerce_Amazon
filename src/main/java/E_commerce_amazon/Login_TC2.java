package E_commerce_amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_project.DDT_project;

public class Login_TC2 extends DDT_project
{
	
	@FindBy(xpath="//span[.='Hello, sign in']")
	WebElement accountlist;
	
	@FindBy(xpath="//span[.='Sign in']")
	WebElement Act_List_signin;
	
	@FindBy(name="email")
	WebElement email;
	
	
	@FindBy(id="ap_password")
	WebElement pass;
	
	@FindBy(id="signInSubmit")
	WebElement signinpassword;
	
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement compare;
	
	
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
	
		email.sendKeys(un + Keys.ENTER);
	}
	
	public void password()
	{
		pass.sendKeys(pw);
	}
	
	public void signinPassword()
	{
		signinpassword.click();
	}
	
	public String LoginSuccess(ChromeDriver driver)
	{
		return compare.getText();
	}
	
	public Login_TC2(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
