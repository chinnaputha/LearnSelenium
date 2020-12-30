package com.training.other;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.training.utils.TestBaseUtils;

public class FileUploadTest extends TestBaseUtils {
	@Test(alwaysRun = true)
	public void openDemoqa() {
		lanuchBrowser("http://demo.automationtesting.in/FileUpload.html");
	}

	@Test(dependsOnMethods = "openDemoqa")
	public void uploadFile() throws InterruptedException, IOException {
		WebElement browse = driver.findElement(By.xpath("//span[text()='Browse …']"));

		Actions act = new Actions(driver);
		act.click(browse).build().perform();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", browse);

		// browse.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("autoIt\\fileupload2.exe");
		Thread.sleep(2000);

	}
}
