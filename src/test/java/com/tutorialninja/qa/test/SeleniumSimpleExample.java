package com.tutorialninja.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumSimpleExample {
	public static WebDriver driver;

	@Test
	public void validatingPage() {
		
		// Initialize the WebDriver and open the website
        WebDriver driver = new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/");

        // Find the elements by their IDs
        driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
        WebElement usernameField = driver.findElement(By.id("input-email"));
        WebElement passwordField =driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("input.btn-primary"));

        // Using isDisplayed, isEnabled, and isSelected without if-else

        System.out.println("usernameField is displayed: " +  usernameField.isDisplayed());
        System.out.println("usernameField is selected: " +  usernameField.isSelected());

        System.out.println(" passwordField is displayed: " +passwordField.isDisplayed());
        
        System.out.println(" passwordField is enabled: " + passwordField.isEnabled());

        System.out.println(" loginButton is displayed: " +loginButton.isDisplayed());
       

        // Close the WebDriver
        driver.quit();
    }
}
	


