package com.training.other;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.training.utils.TestBaseUtils;

public class FileUploadTest2 extends TestBaseUtils {
	@Test(alwaysRun = true)
	public void openDemoqa() {
		lanuchBrowser("http://demo.automationtesting.in/FileUpload.html");
	}

	@Test(dependsOnMethods = "openDemoqa")
	public void uploadFile() throws InterruptedException, IOException {
		WebElement browse = driver.findElement(By.xpath("//input[@type='file']"));

		String filePath="autoimages/Screenshot.png";
		File f= new File(filePath);
		String abPath = f.getAbsolutePath();
		System.out.println("complete path "+abPath);
		browse.sendKeys("C:\\Users\\Chinna.Putha\\eclipse-workspace\\LearnSelenium\\autoimages\\Screenshot.png");
		Thread.sleep(4000);

	}
}
