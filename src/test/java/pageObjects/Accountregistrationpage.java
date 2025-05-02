package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountregistrationpage extends basePage {

	public Accountregistrationpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastname;

	@FindBy(xpath = "//input[@placeholder='E-Mail']")
	WebElement email;

	@FindBy(xpath = "//input[@placeholder='Telephone']")
	WebElement telephone;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath = "//input[@placeholder='Password Confirm']")
	WebElement confirmpswd;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement checkbox;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btncontinue;

	@FindBy(xpath = "//body/div/div/div/h1[1]")
	WebElement msgconfirmation;

	public void setfirstname(String fname) {

		firstname.sendKeys(fname);
	}

	public void setlastname(String lname) {

		lastname.sendKeys(lname);
	}

	public void setemail(String emailadress) {

		email.sendKeys(emailadress);
	}

	public void settelephone(String telenum) {

		telephone.sendKeys(telenum);
	}

	public void setpassword(String pass) {

		password.sendKeys(pass);
	}

	public void setconfirmpassword(String confirmpass) {

		confirmpswd.sendKeys(confirmpass);
	}

	public void checkboxclick() {

		checkbox.click();

	}

	public void buttoncontinue() {

		btncontinue.click();

	}

	public String confirmtext() {
		try {

			return (msgconfirmation.getText());

		} catch (Exception e) {
			return (e.getMessage());

		}

	}
}
