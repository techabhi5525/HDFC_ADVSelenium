/**
 * 
 */
package hdfc.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author AbhishekPriya
 *
 *HDFC netbanking login page
 */
public class netBankingLogin 
{

	WebDriver driver;
	
	public netBankingLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.NAME,using="fldLoginUserId")
	WebElement userID;
	
	@FindBy(how=How.XPATH,using="//a[contains(@href,'javascript')]/img")
	WebElement continueButton;
	
	public void enterUserID(String user)
	{
		userID.sendKeys(user);
		//driver.findElement(By.name("fldLoginUserId")).sendKeys(user);
	}
	
	public void clickContiue() 
	{
		continueButton.click();
	}
	
}
