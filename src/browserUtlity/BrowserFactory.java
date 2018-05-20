/**
 * 
 */
package browserUtlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author AbhishekPriya
 *Browser Factory for HDFC app
 */
public class BrowserFactory 
{
	static WebDriver driver;
	
	public static WebDriver openBrowser(String browser,String url) 
	{
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhishekPriya\\Downloads\\Software\\Selenium drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.IE.driver", "C:\\Users\\AbhishekPriya\\Downloads\\Software\\Selenium drivers\\chromedriver.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}

}
