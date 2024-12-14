package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[3]/h5")
	WebElement Elements1;
	public WebElement getElements1(){
		return Elements1;
	}	
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]")
	WebElement Elements2;
	public WebElement getElements2(){
		return Elements2;
	}
	
	public LoginPage(WebDriver driver2){
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}
	
}
