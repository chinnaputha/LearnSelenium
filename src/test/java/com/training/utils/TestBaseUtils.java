package com.training.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestBaseUtils {
	
	public WebDriver driver;
	public  void lanuchBrowser(String url) {
		// set the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// FirefoxDriver implements WebDriver
		driver = new ChromeDriver();

		// get method - open the browser
		driver.get(url);

		// maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	public  void closeBrowser() {
		driver.quit();
	}
	
	/*public void openApplication() throws Exception {
		System.out.println("super class method");
	}*/

	public  void captureScreenshot() throws Exception {
		String timeStamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime());
		File source_file = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source_file, new File("images\\screenshot_"+timeStamp +".png"));
	}


}
