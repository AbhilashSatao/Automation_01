package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
WebDriver driver;

@FindBy(xpath="//span[text()='Text Box']")
WebElement TextBox;
public WebElement getTextBox(){
	return TextBox;
}	


public Elements(WebDriver driver2){
	this.driver = driver2;
	PageFactory.initElements(driver2, this);

}



//span[text()='Text Box']

}
