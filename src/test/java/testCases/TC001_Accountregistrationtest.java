package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Accountregistrationpage;
import pageObjects.Homepage;
import testBase.Baseclass;

public class TC001_Accountregistrationtest extends Baseclass {

	@Test(groups= {"Sanity","Regression"})
	public void openregister() {

		Homepage Hp = new Homepage(driver);
		Hp.clickmyaccount();
		Hp.clickregister();

		Accountregistrationpage Arp = new Accountregistrationpage(driver);
		Arp.setfirstname(randomstring());
		Arp.setlastname(randomstring());
		Arp.setemail(randomstring() + "@gmail.com");
		Arp.settelephone(randomnumber());
		String pswd = randomalphanumeric();
		Arp.setpassword(pswd);
		Arp.setconfirmpassword(pswd);
		Arp.checkboxclick();
		Arp.buttoncontinue();
		String confirmmsg = Arp.confirmtext();
		Assert.assertEquals(confirmmsg, "Your Account Has Been Created!");

	}

}
