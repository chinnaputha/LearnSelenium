package com.training.tests;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.traing.pages.LoginPage;
import com.training.utils.TestBaseUtils;

public class LoginTest extends TestBaseUtils{

	
	@Test(alwaysRun = true)
	public void openBrowser() {
		lanuchBrowser("https://www.facebook.com");
	}
	
	@Test(dependsOnMethods = "openBrowser")
	public void loginFB() throws Exception {
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.loginFacebook(driver);
		captureScreenshot();
	}
}
