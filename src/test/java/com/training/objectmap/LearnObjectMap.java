package com.training.objectmap;

public interface LearnObjectMap {
	
	
	String FB_LOGIN_USERNAME_XPATH="//input[@id='email']"; //public static final String FB_LOGIN_username="//input[@id='email']";
	String FB_LOGIN_PASSWORD_XPATH="//input[@id='pass']"; 
	String FB_LOGIN_XPATH="//button[@name='login']"; 
	String FB_LOGIN_ERROR_MSG_XPATH="//div[@id='loginform']/div[2]/div[2]";
	
	String FB_REGISTER_CREATENEWACCOUNT_XPATH = "//a[@role='button']";
	String FB_REGISTER_FIRSTNAME_XPATH = "//input[@placeholder='First name']";
	String FB_REGISTER_LASTNAME_XPATH = "//input[@name='lastname']"; 
	
	 
	
}
