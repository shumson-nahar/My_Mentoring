package com.tutorialninja.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private  WebDriver driver;
	@FindBy (xpath = "//span[contains(text(),'My Account')]")
	private WebElement signinlink;
	@FindBy (xpath = "//a[contains(text(),'Login')]")
	private WebElement loginButton;
	@FindBy(id="input-email")
	private WebElement usernameField;
	@FindBy(id="input-password")
	private WebElement passwordField;
	@FindBy (css="input.btn-primary")
	private WebElement login;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
	}
	public void clickSigninButton() {
		 signinlink.click();
		
	}
	public void clickloginButton() {
		 loginButton.click();
		
	}
	public void enterUsername(String username) {
		usernameField.sendKeys(username);
		
	}
	public void enterPassword(String password) {
		usernameField.sendKeys(password);
		
	}
	public void clickLogin() {
		login.click();
		
	}

}
