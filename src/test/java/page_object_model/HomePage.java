package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
		
		
	}
	@FindBy (xpath = "//span[text()='My Account']")
      WebElement clickAccount;
	@FindBy (linkText="Login")
	WebElement clickLogin;
 
    

     public void clickAccountBtn() {
    	 clickAccount.click();
    	 
	
}
     public void clickLogin() {
    	 clickLogin.click();
     }
}