package com.training.tests;

import org.testng.annotations.Test;

import com.traing.pages.RegisterPage_POM;
import com.training.utils.TestBaseUtils;

public class RegisterPOMTest extends TestBaseUtils {
	
	
	@Test(alwaysRun = true)
	public void openBrowser() {
		lanuchBrowser("https://www.facebook.com");
	}
	
	@Test(dependsOnMethods = "openBrowser")
	public void registerFB() throws Exception {
		RegisterPage_POM rp = new RegisterPage_POM(driver);
		rp.registerSignup();
		captureScreenshot();
	}

}
