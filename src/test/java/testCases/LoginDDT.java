package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Myaccountpage;
import testBase.Baseclass;
import utilities.Dataproviders;

public class LoginDDT extends Baseclass {

	@Test(dataProvider = "LoginData", dataProviderClass = Dataproviders.class)

	public void verify_loginDDT(String email, String pswd, String exp) {

		Homepage hp = new Homepage(driver);
		hp.clickmyaccount();
		hp.loginpress();

		// Loginpage
		Loginpage lp = new Loginpage(driver);
		lp.emailenter(email);
		lp.pswdenter(pswd);
		lp.loginclick();

		// myaccount

		Myaccountpage myac = new Myaccountpage(driver);
		Boolean targetpage = myac.myaccountdisplay();

		// 1. Credential is valid Logout is successfull

		if (exp.equalsIgnoreCase("Valid")) {

			if (targetpage == true)

			{
				Assert.assertTrue(true);
				myac.clicklogout();
			} else {

				Assert.assertTrue(false);
			}
		}

		// 2. credentail is invalid(wrong email) logout is successfull , it should be
		// login page also

		if (exp.equalsIgnoreCase("Invalid")) {
			if (targetpage == true)

			{
				myac.clicklogout();
				Assert.assertTrue(false);
				;

			} else {

				assertTrue(true);

			}

		}

	}

}