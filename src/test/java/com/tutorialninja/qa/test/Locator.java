package com.tutorialninja.qa.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Locator {
	public static WebDriver driver;
	@Test
	public void searchLocator() {
		
		driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("naharshumson@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Farabi1234");
		driver.findElement(By.cssSelector("input.btn-primary")).click();
		driver.findElement(By.partialLinkText("Edit your account")).click();
		driver.findElement(By.className("form-control")).sendKeys("Shumson");
		driver.findElement(By.name("lastname")).sendKeys("Nahar");
		driver.findElement(By.id("input-email")).sendKeys("naharshumson@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("2676001308");
		List<WebElement>allLinks = driver.findElements(By.tagName("a"));
	   // System.out.println("This is the link "+ allLinks);
		driver.quit();
	}

}
