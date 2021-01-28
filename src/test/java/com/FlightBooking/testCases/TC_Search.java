package com.FlightBooking.testCases;
import java.util.concurrent.TimeUnit;

//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;

//import java.io.IOException;

//import org.openqa.selenium.NoAlertPresentException;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FlightBooking.pageObjects.Searchpage;

//import com.inetbanking.utilities.XLUtils;

public class TC_Search extends BaseClass
{

	@Test()
	public void Search() throws InterruptedException
	{
		Searchpage sp=new Searchpage(driver);
		sp.Dropdown();
		logger.info("Click on Source dropdown");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		sp.clickFrom();
		logger.info("Click on Bangalore");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		sp.clickTo();
		logger.info("Click on Delhi");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		sp.clickDate();
		logger.info("Click on Date");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		sp.clickDatepicker();
		logger.info("Click on datepicker");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		sp.Searchres();
		logger.info("Click on Search");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
		
	/*	if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login passed");
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
			
		}
		
		
	}
	
	
	public boolean isAlertPresent() //user defined method created to check alert is presetn or not
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
*/	
}

