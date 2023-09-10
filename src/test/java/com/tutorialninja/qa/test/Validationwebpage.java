package com.tutorialninja.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Validationwebpage {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		
	    driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	    System.out.println(driver.getTitle());
	    String actualTitle ="Account Login" ;
	    String expectedTitle = driver.getTitle();
	    if(expectedTitle.equals("Account Login")) {
	    	System.out.println("This is the correct landing page of TutorialNinja");
	    }else {
	    	System.out.println("This is the incorrect landing page of TutorialNinja");
	    }
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("This is the correct landng page of TutorialNinja");
		}else {
			System.out.println("This is the incorrect landing  page of TutorialNinja");
		
		}
		
		

	}


}