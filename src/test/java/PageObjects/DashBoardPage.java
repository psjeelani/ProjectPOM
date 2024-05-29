package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageObjects.BasePage;

public class DashBoardPage extends BasePage{
	
	public DashBoardPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy (xpath="//div[@class='user-name profile-item']")
	WebElement link_LoginNow;
	
	public void click_LoginNow()
	{
		link_LoginNow.click();
	}


}
