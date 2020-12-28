package com.traing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement login;
	
	@FindBy(xpath="//div[@id='loginform']/div[2]/div[2]")
	private WebElement errMsg;
	
	

	public void loginFacebook(WebDriver driver) {
		userName.sendKeys("9705033563");
		password.sendKeys("sdfsfsdf");
		login.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='loginform']/div[2]/div[2]")));
		System.out.println("Error message -->"+errMsg.getText());
		Assert.assertEquals(errMsg.getText(), "The password that you've entered is incorrect. Forgotten password?","Error message validation Failed");
		
	}
	
}
