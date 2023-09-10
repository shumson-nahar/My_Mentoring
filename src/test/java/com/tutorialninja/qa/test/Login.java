package com.tutorialninja.qa.test;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void longinCredentials() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("signin")).click();
		System.out.println(driver.getCurrentUrl());
		String actualCurrentUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
		String expectedCurrentUrl = driver.getCurrentUrl();
		if(expectedCurrentUrl.equals(expectedCurrentUrl)) {
			System.out.println("This is the corrent currentURL of Rediff Login Page");
		
			{
				
			}
		}else {
			System.out.println("This is the incorrent currentURL of Rediff Login Page");
		}
		System.out.println(driver.getTitle());
		String actualTitle = "Rediffmail";
		String expectedTitle = driver.getTitle();
		if(expectedTitle.equals(expectedTitle)) {
			System.out.println("This is the correct title of Rediff");
		}
		
		//driver.quit();
		
		
	}
	

}
