package com.traing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.objectmap.LearnObjectMap;


/**
 * Class  for Registration page related code using @findby 
 * @author Chinna
 *	
 */
public class RegisterPage_POM {
	WebDriver driver;
	
	public RegisterPage_POM(WebDriver driver) {
		this.driver = driver;
	}
	
	public void registerSignup() throws InterruptedException {
		
		driver.findElement(By.xpath(LearnObjectMap.FB_REGISTER_CREATENEWACCOUNT_XPATH)).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LearnObjectMap.FB_REGISTER_FIRSTNAME_XPATH)));

		driver.findElement(By.xpath(LearnObjectMap.FB_REGISTER_FIRSTNAME_XPATH)).sendKeys("asfczc");
		driver.findElement(By.xpath(LearnObjectMap.FB_REGISTER_LASTNAME_XPATH)).sendKeys("something");
		
		
	}

}
