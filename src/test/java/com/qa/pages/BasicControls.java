package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicControls {
	public WebDriver driver;

	@FindBy(xpath="//input[@placeholder='Enter First Name']")
	WebElement FirstName;
	public WebElement getFirstName(){
		return FirstName;
	}
	
	
	@FindBy(xpath="//input[@placeholder='Enter Last Name']")
	WebElement LastName;
	public WebElement getLastName(){
		return LastName;
	}
	
	@FindBy(xpath="//input[@id='malerb']")
	WebElement MaleRadiobutton;
	public WebElement getMaleRadiobutton(){
		return MaleRadiobutton;
	}
	
	
	@FindBy(xpath="//input[@id='englishchbx']")
	WebElement EngCheckbox;
	public WebElement getEngCheckbox(){
		return EngCheckbox;
	}
	
	@FindBy(xpath="//input[@id='hindichbx']")
	WebElement HinCheckbox;
	public WebElement getHinCheckbox(){
		return HinCheckbox;
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	public WebElement getEmail(){
		return Email;
	}	
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	public WebElement getEPassword(){
		return Password;
	}	
	
	
	@FindBy(id="registerbtn")
	WebElement Register;
	public WebElement getRegister(){
		return Register;
	}
	
	@FindBy(xpath="clearbtn")
	WebElement ClearButton;
	public WebElement getClearButton(){
		return ClearButton;
	}

	
	@FindBy(xpath="//input[@id='']")
	WebElement link;
	public WebElement getlink(){
		return link;
	}
	
	
	public BasicControls(WebDriver driver2){
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}
	
}
