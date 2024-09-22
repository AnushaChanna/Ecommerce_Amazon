package E_commerce_amazon;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility_project.DDT_project;

public class Register_TC1 extends DDT_project
{
	
	@FindBy(linkText="Start here.")
	WebElement start;
	
	@FindBy(name="customerName")
	WebElement name;
	
	@FindBy(id="ap_phone_number")
	WebElement mobile;
	
	@FindBy(xpath="//input[@aria-describedby='ap_password_context_message_section']")
	WebElement newpass;
	
	@FindBy(id="continue")
	WebElement verify;
	
	@FindBy(xpath="//div[@class='a-alert-content']/ul/li")
	WebElement alertboxinEnd;
	
	
	@FindBy(name="cvf_captcha_input")
	WebElement captcha;
	
	@FindBy(xpath="//span[@class='a-button-text']")
	WebElement captchaCont;
	
	
/*	@FindBy(name="Start Puzzle")
	WebElement puzzle;*/
	
	@FindBy(xpath="//span[@class='a-button-inner']")
	WebElement createbutton;
	
	public void startforReg()
	{
		start.click();
	}
	
	public void username()
	{
		name.sendKeys("Anusha");
	}
	
	public void phonenumber()
	{
		mobile.sendKeys("9912117833");
	}
	
	public void PassWordReg()
	{
		newpass.sendKeys("AA@1234");
	}
	
	public void VerifyPhnNum()
	{
		verify.click();
	}
	
	public void TypeCaptcha()
	{
		captcha.click();
	}
	
	public void CaptchaCont()
	{
		captchaCont.click();
	}
	
/*	public void Puzzle()
	{
		puzzle.click();
	}*/
	
	public boolean AlertPopup()
	{
		return alertboxinEnd.isEnabled();
	}
	
	public void createaccount()
	{
		createbutton.click();
	}
	
	public Register_TC1(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
