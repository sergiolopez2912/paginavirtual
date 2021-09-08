package StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;


//import io.cucumber.java.en.*;

public class GoogleSearchSteps {


	WebDriver driver = null;
	

	
	
	@Given("el usuario desea ingresar a la tienda")
	public void el_usuario_desea_ingresar_a_la_tienda() {
		
		System.out.println("agregar paso-estoy en el Given");
		
		   
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\OSCAR LOPEZ\\eclipse-workspace\\TiendaVirtual\\chromedriver.exe");
		  
		  driver = new ChromeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		  
		  driver.manage().window().maximize();
		  
		  driver.navigate().to("http://automationpractice.com/index.php");
		
	}

	@When("da click en el boton Sign in creara una cuenta")
	public void da_click_en_el_boton_sign_in_creara_una_cuenta() {
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]"));
		
		
	}

	@When("ingresara un correo electrinico")
	public void inputingresara_un_correo_electrinico() {
		
		driver.findElement(By.id("email_create")).sendKeys("sjhgjs@hotmail.com");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]")).click();
		
		
	}

	@When("dara click en el boton crete an account")
	public void dara_click_en_el_boton_crete_an_account() {
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]/i[1]"));
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]/i[1]")).click();
		
	}

	@When("llenara la lista de datos solicitados")
	public void llenara_la_lista_de_datos_solicitados() throws InterruptedException {
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]/div[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Sergio");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]")).sendKeys("Lopez");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[4]/input[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[5]/input[1]")).sendKeys("12345");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/p[1]/input[1]"));
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/p[2]/input[1]"));
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/p[3]/input[1]")).sendKeys("qwerty");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/p[4]/input[1]")).sendKeys("cll 45");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/p[6]/input[1]")).sendKeys("Miami");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/p[7]/div[1]/select[1]")).sendKeys("Florida");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/p[8]/input[1]")).sendKeys("00000");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/p[9]/div[1]/select[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/p[13]/input[1]")).sendKeys("3134595648");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/p[14]/input[1]")).sendKeys("checho");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")).click();
		
		
	}

	@Then("quedara registrado en la pagina")
	public void quedara_registrado_en_la_pagina() {
		
		
		
	}

	@Then("seleccionara una prenda")
	public void seleccionara_una_prenda() {
		
		
		
		
		
	}
		

	@Then("la agregara al carrito de compras")
	public void la_agregara_al_carrito_de_compras() {
			
		
	
		
	}

	@Then("tendra la opcion de realizar el pago en linea")
	public void tendra_la_opcion_de_realizar_el_pago_en_linea() {
		
		
		
	}

}

