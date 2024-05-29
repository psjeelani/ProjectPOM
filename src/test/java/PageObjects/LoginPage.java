package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath="//button[@class='btn secondry-full-btn']")
	WebElement btn_EmailID;
	
	@FindBy (xpath="//input[@formcontrolname='email']")
	WebElement txt_Email;
	
	@FindBy (xpath="//div[@class='auto-complete-list']")
	WebElement btn_autocomplete;
	
	@FindBy (xpath="//button[@class='btn secondry-btn']")
	WebElement btn_secondary;
	
	@FindBy (xpath="//input[@type='password']")
	WebElement txt_password;
	
	@FindBy (xpath="//button[text()='CONTINUE']")
	WebElement btn_continue;
	
	
	
	public void click_EmailID()
	{
		btn_EmailID.click();;
	}
	
	public void set_Email(String email)
	{
		txt_Email.sendKeys(email);
	}
	
	public void click_Autocomplete()
	{
		btn_autocomplete.click();;
	}
	
	public void click_Secondry()
	{
		btn_secondary.click();
	}
	
	public void set_Password(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void click_Continue()
	{
		btn_continue.click();;
	}
}