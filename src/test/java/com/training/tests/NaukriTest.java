package com.training.tests;

import org.testng.annotations.Test;

import com.traing.pages.NaukriLoginPage;
import com.traing.pages.NaukriLogoutPage;
import com.traing.pages.NaukriUpdatePage;
import com.training.utils.TestBaseUtils;

public class NaukriTest extends TestBaseUtils {

	@Test(alwaysRun = true)
	public void openBrowser() {
		lanuchBrowser("https://www.naukri.com/");
	}

	@Test(dependsOnMethods = "openBrowser")
	//@Parameters({ "userName", "password" })
	public void loginNaukri() throws Exception {
		NaukriLoginPage nl = new NaukriLoginPage(driver);
		nl.loginNaukri();

	}

	@Test(dependsOnMethods = "loginNaukri")
	public void updateNaukri() throws Exception {
		NaukriUpdatePage np = new NaukriUpdatePage(driver);
		np.updateNaukri();

	}

	@Test(dependsOnMethods = "updateNaukri")
	public void logoutNaukri() throws Exception {
		NaukriLogoutPage ln = new NaukriLogoutPage(driver);
		ln.logoutNaukri();

	}

}
