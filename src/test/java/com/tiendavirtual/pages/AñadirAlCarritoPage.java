package com.tiendavirtual.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.AccionesMouse;

public class AñadirAlCarritoPage {
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
	WebElement itemImage;
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]")
	WebElement btnMore;
	@FindBy(xpath="//*[@id=\"quantity_wanted\"]")
	WebElement txtQuantity;
	@FindBy(xpath="//*[@id=\"group_1\"]")
	WebElement selectSize;
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button")
	WebElement btnAddToCart;
	@FindBy(css="body.product.product-2.product-blouse.category-7.category-blouses.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div.clearfix div.layer_cart_cart.col-xs-12.col-md-6 div.button-container:nth-child(5) a.btn.btn-default.button.button-medium > span:nth-child(1)")
	WebElement btnCheckout;
	@FindBy(xpath="//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]/span[1]")
	WebElement carText;
	
	AccionesMouse selenium;
	
	public AñadirAlCarritoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selenium = new AccionesMouse();
	}
	
	public boolean AñadiraLaPaginaDelCarritoAccion(WebDriver driver) {
		selenium.performMouseHover(itemImage, driver);
		selenium.click(btnMore);
		selenium.clear(txtQuantity);
		selenium.setText("3", txtQuantity);
		selenium.selectByVisibleText(selectSize, "M");
		selenium.click(btnAddToCart);
		selenium.clickUsingJavaScriptExecutor(btnCheckout, driver);
		selenium.refresh(driver);
		selenium.validateText(driver, carText, "3");
		return selenium.validateText(driver, carText, "3");
	}
}
