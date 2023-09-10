package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	@FindBy  (id = "input-email")
	WebElement username;
	@FindBy (name= "password")
	WebElement password;
    @FindBy(css="input.btn-primary")
   WebElement loginBtn;
    
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
		
	}
	

public void enterUsername(String arg) {
	username.sendKeys( arg);
	
	
}
public void enterPassword(String arg1) {
	password.sendKeys(arg1);
	
}
public void clickOnLoginBtn() {
	loginBtn.click();
}
}
