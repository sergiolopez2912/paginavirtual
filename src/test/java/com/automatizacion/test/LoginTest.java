package com.automatizacion.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tiendavirtual.pages.LoginPage; 


public class LoginTest {
	
	WebDriver driver;
	LoginPage page;
	
	@BeforeTest
	public  void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OSCAR LOPEZ\\eclipse-workspace\\TiendaVirtual\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		page = new LoginPage(driver); 
	}
	
	@Test 
	public void LoginPage() {
		Assert.assertTrue(page.LoginPages(driver));
		System.out.println("Test Passed");
	}
	
	@AfterTest
	public void cerrarNavegador() {
		driver.quit();	
	}

}



