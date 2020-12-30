package com.training.tests;

import org.testng.annotations.Test;

import com.traing.pages.NaukriUpdatePage;
import com.training.utils.TestBaseUtils;

public class NaukriUpdateTest extends TestBaseUtils{
	@Test(alwaysRun = true)
	public void openBrowser() {
		lanuchBrowser("https://www.naukri.com/");
	}

	@Test(dependsOnMethods = "openBrowser")
	public void updateNaukri() throws Exception {
		NaukriUpdatePage np = new NaukriUpdatePage(driver);
		np.updateNaukri();
	}
}
