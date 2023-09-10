package com.tutorialninja.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedClass {
	public WebDriver driver;
	@Test
	public void currentURL() {
		driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		String actualURL = driver.getCurrentUrl();
		//System.out.println(actualURL);
		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/login";
		Assert.assertEquals(actualURL,  expectedURL );
		driver.quit();
	}

}
