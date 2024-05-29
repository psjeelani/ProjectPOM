package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjects.ProductPage;
import PageObjects.SearchPage;
import TestBase.BaseClass;
import TestBase.Utils;

public class TC_002_SearchProduct extends BaseClass{
	
		
@Test(priority=2)
	public void Addtocart() throws Exception {
		
		SearchPage sp=new SearchPage(driver);
		ProductPage pg=new ProductPage(driver);
		
		sp.set_Search();
		sp.Click_Search();
		Thread.sleep(2000);
		
		pg.Click_Product();
		Thread.sleep(2000);

		Set<String>tabs=driver.getWindowHandles();
		
		Iterator<String>ids=tabs.iterator();   //to get IDs from set using Iterator
		String parent=ids.next();              // first ID will be parent  
		String child=ids.next(); 
		
		driver.switchTo().window(child); 
		
		pg.Click_AddToCart();
		Thread.sleep(2000);

	}
		
	}
		