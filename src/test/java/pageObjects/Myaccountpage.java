package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountpage extends basePage {

	public Myaccountpage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//body//div//h2[1]")
	WebElement myaccount;
	
	@FindBy(xpath="//body//div//a[13]")
	WebElement logout;
	

	public boolean myaccountdisplay()

	{
		try {

			return myaccount.isDisplayed();
		}

		catch (Exception e) {

			return false;

		}
	}

	public void clicklogout()
	{
		
		logout.click();
		
	}
	
	
	
}
