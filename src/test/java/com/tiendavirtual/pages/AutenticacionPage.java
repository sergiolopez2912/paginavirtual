package com.tiendavirtual.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import StepDefinitions.AccionesMouse;

public class AutenticacionPage {
	
	
	
	@FindBy(xpath="//*[@id=\"email_create\"]")
	WebElement emailAddress;
	@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")
	WebElement createAccount;
	@FindBy(xpath="//*[@id=\"id_gender1\"]")
	WebElement title;
	@FindBy(xpath="//*[@id=\"customer_firstname\"]")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"customer_lastname\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"passwd\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement yourFirstName;
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement yourLastName;
	@FindBy(xpath="//*[@id=\"address1\"]")
	WebElement address;
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city;
	@FindBy(css="#id_state")
	WebElement state;
	@FindBy(css=("#postcode"))
	WebElement postalCode;
	@FindBy(xpath=("//*[@id=\"uniform-id_country\"]"))
	WebElement country;
	@FindBy(xpath=("//*[@id=\"phone_mobile\"]"))
	WebElement mobilePhone;
	@FindBy(xpath="//*[@id=\"alias\"]")
	WebElement myAdress;
	@FindBy(xpath="//*[@id=\"submitAccount\"]/span")
	WebElement register;
	@FindBy(xpath="//*[@id=\"center_column\"]/p")
	WebElement welcome;
	
AccionesMouse selenium;
	
	public AutenticacionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selenium = new AccionesMouse();
	
	}
	public boolean AutenticacionTest(WebDriver driver) {
		
		
		
		selenium.click(emailAddress);
		selenium.setText("qqqqq@hotmail.com", emailAddress);
		
		
		selenium.click(createAccount);
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.elementToBeClickable(title));
		
		selenium.click(title);
		
		
		selenium.click(firstname);
		selenium.setText("Sergio", firstname);
		
		selenium.click(lastname);
		selenium.setText("Lopez", lastname);
		
		selenium.click(email);
		
		selenium.click(password);
		selenium.setText("12345", password);
		
		selenium.click(yourFirstName);
		
		selenium.click(yourLastName);
		
		selenium.click(address);
		selenium.setText("CL 93B#10-15", address);
		
		selenium.click(city);
		selenium.setText("Bogota", city);
				
		selenium.click(state);
		Select selectObject = new Select(state);
		selectObject.selectByValue("1");
		
		
		selenium.click(postalCode);
		
		
		
		selenium.setText("00000", postalCode);
		
		selenium.click(country);
		
		selenium.click(mobilePhone);
		selenium.setText("3134595649", mobilePhone);
		
		selenium.click(myAdress);
		selenium.setText("checho", myAdress);
		
		
		
		selenium.click(register);
		wait.until(ExpectedConditions.elementToBeClickable(welcome));
		
		selenium.validateText(driver, welcome, "Welcome to your account. Here you can manage all of your personal information and orders.");
		return selenium.validateText(driver, welcome, "Welcome to your account. Here you can manage all of your personal information and orders.");
		
}
}