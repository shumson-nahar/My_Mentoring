package com.tutorialninja.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		String Ninjalogo = driver.findElement(By.xpath("//a[contains(text(),'Qafox.com')]")).getText();
		System.out.println("The text of the logo is -----"+ Ninjalogo);
		String MacBookLink = driver.findElement(By.xpath("//a[contains(text(),'MacBook')]")).getText();
		System.out.println("The text of the macbook link is-----"+ MacBookLink);
		String DesktopsLink = driver.findElement(By.linkText("Desktops")).getText();
		System.out.println("The text of the desktopsLink is ----"+ DesktopsLink );
		
		
		
		
	}

}
