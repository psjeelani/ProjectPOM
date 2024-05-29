package TestCases;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjects.DashBoardPage;
import PageObjects.LoginPage;
import PageObjects.ProductPage;
import PageObjects.SearchPage;
import TestBase.BaseClass;
import TestBase.Utils;

public class TC_001_LoginPage extends BaseClass{
	
	@Test(priority=1)
	public void loginAccount() throws Exception
	{
		
		DashBoardPage db=new DashBoardPage(driver);
		LoginPage lp=new LoginPage(driver);
		
		db.click_LoginNow();
		Thread.sleep(3000);
		
		lp.click_EmailID();
		Thread.sleep(3000);
		
		String file=System.getProperty("user.dir")+"/TestData/CombinedExcel.xlsx";
		
			String email=Utils.getCellData(file,"Sheet3", 0, 0);
			
		lp.set_Email(email);
		Thread.sleep(2000);

		lp.click_Autocomplete();
		Thread.sleep(2000);

		lp.click_Secondry();
		Thread.sleep(2000);
		
		String password=Utils.getCellData(file,"Sheet3", 0, 1);

		lp.set_Password(password);
		Thread.sleep(2000);

		lp.click_Continue();
		Thread.sleep(2000);
		
       String exp="Jeelani Basha Pathan";
		
	   String act=driver.findElement(By.xpath("//p[text()='Jeelani Basha Pathan']")).getText();
	   
		if(act.equals(exp))
		{
			System.out.println("Test is passed :Actual Result is " +act);
			}
		else
		{
			System.out.println("Test is failed :Actual Result is "+act);
		}
		
		}
	
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
	

		

	




