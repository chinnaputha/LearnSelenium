package com.training.tests;

import org.testng.annotations.Test;

import com.traing.pages.NaukriUpdatePage;
import com.training.utils.NaukriTestBaseUtils;

public class NaukriUpdateTest extends NaukriTestBaseUtils{
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
