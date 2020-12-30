package com.training.other;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.training.utils.TestBaseUtils;

public class JavascriptOperations extends TestBaseUtils {
	
	@Test(alwaysRun = true)
	public void openNaukri() {
		lanuchBrowser("https://www.naukri.com/");
	}
	
	@Test(dependsOnMethods = "openNaukri")
	public void personalGrowth() throws InterruptedException {
		WebElement personGrow= driver.findElement(By.xpath("//a[@title='Personal growth']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", personGrow);
		Thread.sleep(4000);
		//personGrow.click();
		js.executeScript("arguments[0].click();", personGrow);
		Thread.sleep(4000);
		
	}

}
