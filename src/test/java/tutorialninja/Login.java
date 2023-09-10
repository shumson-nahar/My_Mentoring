package tutorialninja;


import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
  WebDriver driver;
  @BeforeMethod
	  
  
  public void setup() {
	  driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
	  
	  
  }
	
	@Test(priority = 1)
	public void verifyWithValidCredentials() {
		
		
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("naharshumson@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Farabi1234");
		driver.findElement(By.cssSelector("input.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed(),
				"Edit your Account Information option is not displayed");
		//driver.quit();
		
	}
	@Test(priority=2)
	public void verifyLoginWithInvalidCredentials() {
		
		driver.findElement(By.id("input-email")).sendKeys("naharshumson1"+generateTimeStamp()+"@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Farabi123456");
		driver.findElement(By.cssSelector("input.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage),"Expected Warning message is not displayed" );
	//driver.quit();
		
	}
	@Test(priority = 3)
	public void verifyLoginWithInvalidEmailAndValidPassword() {
		
		driver.findElement(By.id("input-email")).sendKeys("naharshumson1"+generateTimeStamp()+"@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Farabi1234");
		driver.findElement(By.cssSelector("input.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage),"Expected Warning message is not displayed" );
	    //driver.quit();
		
	}
	@Test(priority = 4)
	public void verifyLoginWithValidEmailAndInvalidPassword() {
		
		driver.findElement(By.id("input-email")).sendKeys("naharshumson@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Farabi12345");
		driver.findElement(By.cssSelector("input.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage),"Expected Warning message is not displayed" );
	    //driver.quit();
		
		
	}
	@Test(priority = 5)
	public void verifyLoginWithoutProvidingCredentials() {
		
		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.cssSelector("input.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage),"Expected Warning message is not displayed" );
	   // driver.quit();
		
	}
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	
	
	
	public String generateTimeStamp() {
		Date date = new Date();
		return date.toString().replace("", "_").replace(":", "_");
	}

}
