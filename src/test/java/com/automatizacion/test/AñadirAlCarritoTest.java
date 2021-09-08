package com.automatizacion.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tiendavirtual.pages.AñadirAlCarritoPage;

public class AñadirAlCarritoTest {
	
	WebDriver driver;
	AñadirAlCarritoPage page;
	
	@BeforeTest
	public  void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OSCAR LOPEZ\\eclipse-workspace\\TiendaVirtual\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		page = new AñadirAlCarritoPage(driver); 
	}
	
	@Test 
	public void validateAñadiraLaPaginaDelCarrito() {
		Assert.assertTrue(page.AñadiraLaPaginaDelCarritoAccion(driver));
		System.out.println("Test Passed");	
	}
	
	@AfterTest
	public void cerrarNavegador() {
		driver.quit();	
	}

}
