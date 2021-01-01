package com.training.objectmap;

public interface NaukriObjectMap {
/***************************** Naukri**********************************************/
	String NAUKRI_LOGIN_XPATH = "//div[text()='Login']";
	String NAUKRI_LOGIN_USERNAME_XPATH = "//input[@placeholder='Enter your active Email ID / Username']";
	String NAUKRI_LOGIN_PASSWORD_XPATH = "//input[@placeholder='Enter your password']";
	String NAUKRI_CLICK_LOGIN__XPATH = "//button[text()='Login']";
	String NAUKRI_UPDATE_XPATH = "//div[text()='UPDATE PROFILE']";
	
	String NAUKRI_LOGOUT_XPATH = "//a[text()='Logout']";
	String NAUKRI_MOUSE_HOVER_XPATH = "//div[text()='My Naukri']";
	
	String NAUKRI_HOMEPAGE_XPATH = "//input[@name='keyword']";

}
