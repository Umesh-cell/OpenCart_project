package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends basePage {

	public Loginpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='E-Mail Address']")
	WebElement email;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginenter;

	public void emailenter(String setemail)

	{

		email.sendKeys(setemail);

	}

	public void pswdenter(String setpswd)

	{

		password.sendKeys(setpswd);

	}

	public void loginclick()

	{

		loginenter.click();

	}

}
