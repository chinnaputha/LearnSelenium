package com.training.tests;

import org.testng.annotations.Test;

import com.traing.pages.LoginPage_POM;
import com.training.utils.TestBaseUtils;
/**
 * Class for POM using normal approach
 * @author Chinna.Putha
 *
 */
public class LoginPOMTest extends TestBaseUtils {

	@Test(alwaysRun = true)
	public void openBrowser() {
		lanuchBrowser("https://www.facebook.com");
	}

	@Test(dependsOnMethods = "openBrowser")
	public void loginFB() throws Exception {
		LoginPage_POM lp = new LoginPage_POM(driver);
		lp.loginFacebook();
	}

}
