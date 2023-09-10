package page_object_model;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Main {
	WebDriver driver;
	HomePage homepage;
	Login login;
	
	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	//@Test
	//public void navigatetoHomePage() {
		// homepage = new HomePage(driver);
		// homepage.clickAccountBtn();
		// homepage.clickLogin();
		
	//}
	@Test
	public void validCredential() {
		login = new Login(driver);
		login.enterUsername("naharshumson@gmail.com");
		login.enterPassword("Farabi1234");
		login.clickOnLoginBtn();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
