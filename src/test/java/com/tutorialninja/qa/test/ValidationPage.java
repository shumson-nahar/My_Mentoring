package com.tutorialninja.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidationPage {
	public static WebDriver driver;

	public static void main(String[] args) {
		 driver = new FirefoxDriver();

        // Navigate to a web page
        driver.get("https://tutorialsninja.com/demo/");

        // Use getTitle() and getCurrentUrl() methods
        String pageTitle = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();

        // Print the results
        System.out.println("Page Title: " + pageTitle);
        System.out.println("Current URL: " + currentUrl);

        // Close the browser
        driver.quit();
    }

	}


