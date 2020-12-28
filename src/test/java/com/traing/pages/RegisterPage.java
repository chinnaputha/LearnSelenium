package com.traing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	
	
	
	@FindBy(xpath= "//a[@role='button']")
	private WebElement createNewAccount;
	
	@FindBy(xpath= "//input[@placeholder='First name']")
	private WebElement firstName;
	
	@FindBy(xpath= "//input[@name='lastname']")
	private WebElement lastName;
	
	
	public void registerSignup() throws InterruptedException {
		createNewAccount.click();
		Thread.sleep(2000);
		firstName.sendKeys("hello");
		lastName.sendKeys("sdfasfs");
	}

}
