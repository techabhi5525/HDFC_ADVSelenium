/**
 * 
 */
package hdfc.TestCases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import browserUtlity.BrowserFactory;
import hdfc.PageFactory.netBankingLogin;
import hdfc.TestData.hdfcTestData;

/**
 * @author AbhishekPriya
 *
 *Test case for hdfc login page
 */
public class TestCase 
{
	WebDriver driver;

		@Test(dataProvider="HDFC")
		public void validateUserID(String user)
		{
		driver=	BrowserFactory.openBrowser("firefox","https://netbanking.hdfcbank.com/netbanking/");
		netBankingLogin login=PageFactory.initElements(driver, netBankingLogin.class);
		
		login.enterUserID(user);
		login.clickContiue();
		
		String actualTitle=driver.getTitle();
		
		System.out.println("Page title is : "+actualTitle);
		
		//Assert.assertTrue(actualTitle.contains("));
		
		}
		
		@AfterMethod
		public void closeBrowser()
		{
			driver.quit();
		}
		
		@DataProvider(name="HDFC")
		public Object[][] passData()
		{
			Object data[][]=new Object[1][1];
			
			hdfcTestData obj=new hdfcTestData();
			
			obj.TestData("C:\\Users\\AbhishekPriya\\Selenium\\AdvSelenium\\TestData\\TestData.xlsx");
			
			int row=obj.rowCount(1);
			
			for(int i=0;i<row;i++)
			{
				data[0][0]=obj.getSheetdata(1, 0, 0);
			}
			
			return data;
		} 
	
}
