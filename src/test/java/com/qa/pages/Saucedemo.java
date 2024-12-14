package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemo {
WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='user-name' and @name='user-name']")
	WebElement Username;
	public WebElement getUsername(){
		return Username;
	}	
	
	@FindBy(xpath="//input[@id='password' and @name='password']")
	WebElement Password;
	public WebElement getPassword(){
		return Password;
	}
	
	@FindBy(xpath="//input[@id='login-button' and @type='submit']")
	WebElement Loginbutton;
	public WebElement getLoginbutton(){
		return Loginbutton;
	}
	
	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[1]/div[3]/select")
	WebElement Sort;
	public WebElement getSort(){
		return Sort;
	}
	
	
	@FindBy(xpath="//div[@class='inventory_item_name' and text()='Sauce Labs Bike Light']")
	WebElement ProductName;
	public WebElement getProductName(){
		return ProductName;
	}
	
	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/button")
	WebElement Add2Cart;
	public WebElement getAdd2Cart(){
		return Add2Cart;
	}
	
	@FindBy(xpath="/html/body/div/div[2]/div[1]/div[2]/a")
	WebElement Cart;
	public WebElement getCart(){
		return Cart;
	}

	@FindBy(xpath="//a[text()='CHECKOUT']")
	WebElement Checkout;
	public WebElement getCheckout(){
		return Checkout;
	}
	
	@FindBy(id="first-name")
	WebElement FirstName;
	public WebElement getFirstName(){
		return FirstName;
	}
	
	@FindBy(id="last-name")
	WebElement LastName;
	public WebElement getLastName(){
		return LastName;
	}
	
	@FindBy(id="postal-code")
	WebElement Postal;
	public WebElement getPostal(){
		return Postal;
	}
	
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/form/div[2]/input")
	WebElement Continuebutton;
	public WebElement getContinuebutton(){
		return Continuebutton;
	}
	
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]")
	WebElement Finish;
	public WebElement getFinish(){
		return Finish;
	}
	public Saucedemo(WebDriver driver2){
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}


	
}
