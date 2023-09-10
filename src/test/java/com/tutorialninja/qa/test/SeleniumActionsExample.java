package com.tutorialninja.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumActionsExample {
	public static WebDriver driver;
	@Test
	public void actiontest() {
		
		
        driver = new FirefoxDriver();
       

        
		 driver.manage().window().maximize();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 Actions actions = new Actions(driver);
		 WebElement Username = driver.findElement(By.id("login1"));
		 WebElement password = driver.findElement(By.id("password"));
		 WebElement SignButton = driver.findElement(By.className("signinbtn"));
		 actions.click(Username).sendKeys("seleniumpanda@rediffmail.com").perform();
		 actions.click( password).sendKeys("Selenium@123").perform();
		 actions.click(SignButton).perform();
				
		
		 
		 
        // Close the browser
        driver.quit();
    }

}
