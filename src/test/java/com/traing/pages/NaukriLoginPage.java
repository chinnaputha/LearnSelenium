package com.traing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.objectmap.NaukriObjectMap;

public class NaukriLoginPage {
	WebDriver driver;

	public NaukriLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Method to login naukri
	 */

	public void loginNaukri() {

		driver.findElement(By.xpath(NaukriObjectMap.NAUKRI_LOGIN_XPATH)).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NaukriObjectMap.NAUKRI_LOGIN_XPATH)));

		driver.findElement(By.xpath(NaukriObjectMap.NAUKRI_LOGIN_USERNAME_XPATH)).sendKeys("veerabhaskar.test@gmail.com");
		driver.findElement(By.xpath(NaukriObjectMap.NAUKRI_LOGIN_PASSWORD_XPATH)).sendKeys("Bhaskar@123");

		driver.findElement(By.xpath(NaukriObjectMap.NAUKRI_CLICK_LOGIN__XPATH)).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NaukriObjectMap.NAUKRI_CLICK_LOGIN__XPATH)));
       
		driver.findElement(By.xpath(NaukriObjectMap.NAUKRI_UPDATE_XPATH)).click();
		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NaukriObjectMap.NAUKRI_UPDATE_XPATH)));
		
		
	}

}
