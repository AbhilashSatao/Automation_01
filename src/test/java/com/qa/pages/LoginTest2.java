package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest2 {

	
		WebDriver driver;

		@FindBy(xpath="//a[text()='Practice']")
		WebElement Practice;
		public WebElement getPractice(){
			return Practice;
		}	
		
		@FindBy(xpath="//a[text()='Test Login Page']")
		WebElement LoginTest;
		public WebElement getLoginTest(){
			return LoginTest;
		}	
		
		@FindBy(id="username")
		WebElement Username;
		public WebElement getUsername(){
			return Username;
		}
		
		@FindBy(id="password")
		WebElement Password;
		public WebElement getPassword(){
			return Password;
		}
		
		@FindBy(id="submit")
		WebElement Submitbtn;
		public WebElement getSubmitbtn(){
			return Submitbtn;
		}
		
		public LoginTest2(WebDriver driver2){
			this.driver = driver2;
			PageFactory.initElements(driver2, this);
		
		}

}
