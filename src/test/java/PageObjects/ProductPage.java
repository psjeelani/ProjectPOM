package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

	public ProductPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy (xpath="//img[@alt='Siemens 7.5KW 3 Phase Squirrel Cage-Motor, 1LE7503-1CB23-5AA4']")
	WebElement img_product;
	
	@FindBy (xpath="//button[@class='btn add-to-cart-btn default-btn']")
	WebElement btn_Addtocart;
	
	
	
	public void Click_Product()
	{
		img_product.click();
	}
	
	public void Click_AddToCart()
	{
		btn_Addtocart.click();;
	}
	

}
