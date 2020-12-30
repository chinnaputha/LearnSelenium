package com.traing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.objectmap.NaukriObjectMap;

public class NaukriUpdatePage {
	WebDriver driver;

	public NaukriUpdatePage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Method to update naukri
	 */

	public void updateNaukri() {

		driver.findElement(By.xpath(NaukriObjectMap.NAUKRI_UPDATED_XPATH)).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NaukriObjectMap.NAUKRI_UPDATED_XPATH)));

 	}

}
