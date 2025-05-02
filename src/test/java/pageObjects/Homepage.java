package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends basePage {

	public Homepage(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")

	WebElement lnkmyaccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")

	WebElement Lnkreg;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement login;

	public void clickmyaccount() {

		lnkmyaccount.click();

	}

	public void clickregister() {

		Lnkreg.click();

	}

	public void loginpress() {

		login.click();

	}

}
