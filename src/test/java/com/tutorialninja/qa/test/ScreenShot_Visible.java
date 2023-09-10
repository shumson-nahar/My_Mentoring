package com.tutorialninja.qa.test;





import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;







public class ScreenShot_Visible {
	
	
	public static WebDriver driver;
public static void main(String[] args) throws IOException {


	
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("signin")).click();
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshotFile, new File("C:\\Users\\Shumson Nahar\\Desktop\\Screenshot\\redifflogin.png"));
				
}

	
}
		 
		
