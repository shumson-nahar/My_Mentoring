package com.tutorialninja.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Login1 {
	@Test
	public void verifyLoginWithValidCredentials() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.get("https://tutorialsninja.com/demo/");
				driver.findElement(By.xpath("//span[text()='My Account']")).click();
				driver.findElement(By.linkText("Login")).click();
				driver.findElement(By.id("input-email")).sendKeys("naharshumson@gmail.com");
				driver.findElement(By.name("password")).sendKeys("Farabi@123");
				
		
	}

}
