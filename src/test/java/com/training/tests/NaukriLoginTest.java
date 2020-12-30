package com.training.tests;

import org.testng.annotations.Test;

import com.traing.pages.NaukriLoginPage;
import com.training.utils.TestBaseUtils;

public class NaukriLoginTest extends TestBaseUtils {

	@Test(alwaysRun = true)
	public void openBrowser() {
		lanuchBrowser("https://www.naukri.com/");
	}

	@Test(dependsOnMethods = "openBrowser")
	public void loginNaukri() throws Exception {
		NaukriLoginPage nl = new NaukriLoginPage(driver);
		nl.loginNaukri();
		
	}
}
