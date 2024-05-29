package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

	public SearchPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy (xpath="//input[@type='text']")
	WebElement txt_Search;
	
	@FindBy (xpath="//div[@class='input-group']")
	WebElement btn_Search;
	
	
	
	public void set_Search()
	{
		txt_Search.sendKeys("10hp motor");
	}
	
	public void Click_Search()
	{
		btn_Search.click();;
	}
	

}
