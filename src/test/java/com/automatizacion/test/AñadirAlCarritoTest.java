package com.automatizacion.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tiendavirtual.pages.A�adirAlCarritoPage;

public class A�adirAlCarritoTest {
	
	WebDriver driver;
	A�adirAlCarritoPage page;
	
	@BeforeTest
	public  void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OSCAR LOPEZ\\eclipse-workspace\\TiendaVirtual\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		page = new A�adirAlCarritoPage(driver); 
	}
	
	@Test 
	public void validateA�adiraLaPaginaDelCarrito() {
		Assert.assertTrue(page.A�adiraLaPaginaDelCarritoAccion(driver));
		System.out.println("Test Passed");	
	}
	
	@AfterTest
	public void cerrarNavegador() {
		driver.quit();	
	}

}
