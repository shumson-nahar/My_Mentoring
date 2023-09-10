package com.tutorialninja.qa.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Screenshot_Visible1 {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		
		//interface - TakesScreenshot - it enables WebDriver to capture screenshot in different ways
		// method - getScreenshotAs() - it captures the screeshot and stores in the specified location
		//Ist step - we convert the WebDriver object (driver) to take screenshot. It calls the method getScreenshotAs() to create an image file 
		//by providing an input parameter "OutputType.FILE"
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshotFile, new File("C:\\Users\\Shumson Nahar\\Desktop\\Screenshot\\ninjalogin.png"));
	driver.quit();
	}

}
