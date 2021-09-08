package com.tiendavirtual.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.AccionesMouse;

public class LoginPage {
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement Email;
	@FindBy(xpath="//*[@id=\"passwd\"]")
	WebElement Password;
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
	WebElement btnSingIn;
	@FindBy(xpath="//*[@id=\"center_column\"]/h1")
	WebElement carText;
 
AccionesMouse selenium;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selenium = new AccionesMouse();
	}
	
	public boolean LoginPages(WebDriver driver){
		
		selenium.click(Email);
		selenium.setText("qwerty@gmail.com", Email );
		selenium.click(Password);
		selenium.setText("12345", Password);
		selenium.click(btnSingIn);
		selenium.validateText(driver, carText, "MY ACCOUNT");
		return selenium.validateText(driver, carText, "MY ACCOUNT");
  }
}