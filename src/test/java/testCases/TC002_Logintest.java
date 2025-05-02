package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Myaccountpage;
import testBase.Baseclass;

public class TC002_Logintest extends Baseclass {

	@Test(groups= {"Sanity","Regression"})
	public void verify_login() {

		// homepage
		Homepage hp = new Homepage(driver);
		hp.clickmyaccount();
		hp.loginpress();

		// Loginpage
		Loginpage lp = new Loginpage(driver);
		lp.emailenter("demo@yourstore.com");
		lp.pswdenter("demo123");
		lp.loginclick();

		// myaccount

		Myaccountpage myac = new Myaccountpage(driver);
		Boolean targetpage = myac.myaccountdisplay();

		Assert.assertEquals(targetpage, true, "Login error");

	}

}
