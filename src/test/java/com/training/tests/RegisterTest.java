package com.training.tests;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.traing.pages.RegisterPage;
import com.training.utils.TestBaseUtils;

public class RegisterTest extends TestBaseUtils{

	
	@Test(alwaysRun = true)
	public void openBrowser() {
		lanuchBrowser("https://www.facebook.com");
	}
	
	@Test(dependsOnMethods = "openBrowser")
	public void registerFB() throws Exception {
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.registerSignup();
		captureScreenshot();
	}
}
