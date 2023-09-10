package com.tutorialninja.qa.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	private WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		
	}
	@Test
	public void testLoginWithValidCredentials() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.clickLogin();
		loginpage.clickloginButton();
		loginpage.clickSigninButton();
		loginpage.enterPassword("Farabi1234");
		loginpage.enterUsername("naharshumson@gmail.com");
		
		
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
