package com.tutorialninja.qa.test;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Locators {
	public static WebDriver driver;
	@Test
	public void searchLocator() {
		


		driver = new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class = 'signinbtn']")).click();
		driver.findElement(By.cssSelector("a[class = rd_logout]")).click();
		driver.findElement(By.linkText("Rediff Home")).click();
		//driver.findElement(By.partialLinkText("Business")).click();
		//List<WebElement>allLInks = driver.findElements(By.tagName("a"));
		driver.quit();
		
//System.out.println("The total number of links with tagname a are:"+allLInks.size());
//for(int i = 0;i<allLInks.size();i++) {
	//System.out.println(allLInks.get(i).getText());

	

	}
}


