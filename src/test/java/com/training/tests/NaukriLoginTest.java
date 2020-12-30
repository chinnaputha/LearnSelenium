package com.training.tests;

import org.testng.annotations.Test;

import com.traing.pages.NaukriLoginPage;
import com.training.utils.NaukriTestBaseUtils;

public class NaukriLoginTest extends NaukriTestBaseUtils {

	@Test(alwaysRun = true)
	public void openBrowser() {
		lanuchBrowser("https://www.naukri.com/");
	}

	@Test(dependsOnMethods = "openBrowser")
	public void loginFB() throws Exception {
		NaukriLoginPage nl = new NaukriLoginPage(driver);
		nl.loginNaukri();
	}
}
