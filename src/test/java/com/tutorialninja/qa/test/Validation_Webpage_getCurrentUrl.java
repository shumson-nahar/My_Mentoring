package com.tutorialninja.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation_Webpage_getCurrentUrl {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.rediff.com/");
         driver.findElement(By.className("signin")).click();
         System.out.println(driver.getCurrentUrl());
         String actualCurrentUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
         String expectedCurrrentUrl = driver.getCurrentUrl();
        		 if(expectedCurrrentUrl.equals(actualCurrentUrl)){
        			 System.out.println("This is the correct currentURL of RediffLogin page");
        			 
        		 }else {
        			 System.out.println("This is the incorrect currentURL of RediffLogin page");
        		 }
        				 
	}

}
