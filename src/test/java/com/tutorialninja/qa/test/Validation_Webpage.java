package com.tutorialninja.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Webpage {
	public static WebDriver driver;
	//getTitle(); , get CurrentUrl()
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.rediff.com/");
		 System.out.println(driver.getTitle());
		 String actualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		 String expectedTitle = driver.getTitle();
		 if(expectedTitle.equals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping")) {
			 System.out.println("This is the correct landing page of Rediff");
		 }else {
				 System.out.println("this is the incorrect landing page of Rediff");
			 }
		 if(expectedTitle.equals(actualTitle)) {
			 System.out.println("This is the correct landing page of Rediff");
		 }else {
			 System.out.println("this is the incorrect landing page of Rediff");
		 }
		 }
	}


