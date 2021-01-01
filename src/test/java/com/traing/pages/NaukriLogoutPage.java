package com.traing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.objectmap.NaukriObjectMap;

public class NaukriLogoutPage {
	WebDriver driver;
	WebDriverWait wait;
	public NaukriLogoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void logoutNaukri() {
		
		WebElement ele = driver.findElement(By.xpath(NaukriObjectMap.NAUKRI_MOUSE_HOVER_XPATH));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NaukriObjectMap.NAUKRI_MOUSE_HOVER_XPATH)));
		
		driver.findElement(By.xpath(NaukriObjectMap.NAUKRI_LOGOUT_XPATH)).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NaukriObjectMap.NAUKRI_LOGOUT_XPATH)));
		
		driver.findElement(By.xpath(NaukriObjectMap.NAUKRI_HOMEPAGE_XPATH)).sendKeys("something");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NaukriObjectMap.NAUKRI_HOMEPAGE_XPATH)));
	}
	
	
	
	
	
	
	
	
	
}
