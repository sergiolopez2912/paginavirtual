package com.automatizacion.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tiendavirtual.pages.AutenticacionPage;

public class AutenticacionTest {
	
	public class LoginTest {
		
		WebDriver driver;
		AutenticacionPage page;
		
		@BeforeTest
		public  void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\OSCAR LOPEZ\\eclipse-workspace\\TiendaVirtual\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php?controller=authentication#account-creation");
			driver.manage().window().maximize();
			page = new AutenticacionPage(driver); 
		}
		
		@Test 
		public void LoginPage() {
			Assert.assertTrue(page.AutenticacionTest(driver));
			System.out.println("Test Passed");
		}
		
		@AfterTest
		public void cerrarNavegador() throws InterruptedException {
			driver.quit();	
		}

	}


}
