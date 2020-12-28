package com.traing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.training.objectmap.LearnObjectMap;

/**
 * Class  for login page related code using POM Normal apporach
 * @author Chinna
 *	
 */
public class LoginPage_POM {
	WebDriver driver;
	
	public LoginPage_POM(WebDriver driver){
		this.driver=driver;
	}
	

	/**
	 * Method fo login to facebook
	 * @param driver
	 */
	public void loginFacebook() {
		driver.findElement(By.xpath(LearnObjectMap.FB_LOGIN_USERNAME_XPATH)).sendKeys("9705033563");
		driver.findElement(By.xpath(LearnObjectMap.FB_LOGIN_PASSWORD_XPATH)).sendKeys("asfczc");
		driver.findElement(By.xpath(LearnObjectMap.FB_LOGIN_XPATH)).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LearnObjectMap.FB_LOGIN_ERROR_MSG_XPATH)));
		String errorMsg = driver.findElement(By.xpath(LearnObjectMap.FB_LOGIN_ERROR_MSG_XPATH)).getText();
		System.out.println("Error message -->"+errorMsg);
		Assert.assertEquals(errorMsg, "The password that you've entered is incorrect. Forgotten password?","Error message validation Failed");
		
	}
	
	
}
