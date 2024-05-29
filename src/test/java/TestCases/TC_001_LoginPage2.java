package TestCases;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjects.DashBoardPage;
import PageObjects.LoginPage;
import TestBase.BaseClass;
import TestBase.Utils;

public class TC_001_LoginPage2 extends BaseClass{
	
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
		
			String email=Utils.getCellData(file,"Sheet3", 1, 0);
			
		lp.set_Email(email);
		Thread.sleep(2000);

//		lp.click_Autocomplete();
//		Thread.sleep(2000);

		lp.click_Secondry();
		Thread.sleep(2000);
		
//		String password=Utils.getCellData(file,"Sheet3", 1, 1);
//
//		lp.set_Password(password);
//		Thread.sleep(2000);
//
//		lp.click_Continue();
//		Thread.sleep(2000);
		
       String exp="Enter valid Email-ID";
		
	   String act=driver.findElement(By.xpath("//p[text()='Enter valid Email-ID']")).getText();
	   
		if(act.equals(exp))
		{
			System.out.println("Test is passed :Actual Result is " +act);
			}
		else
		{
			System.out.println("Test is failed :Actual Result is  "+act);
		}
		
		}
	}

		

	




