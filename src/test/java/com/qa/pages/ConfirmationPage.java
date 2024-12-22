package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage {

	public  WebDriver driver;
	
	
	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
	}


    // Locators
    private By successMessage = By.xpath("//*[contains(text(), 'Congratulations Students') or contains(text(), 'You successfully logged in!')]");
    private By logoutButton = By.xpath("//a[text()='Log out']");
    private By errorMessage = By.id("error");
 // Actions (Methods)
    public boolean isSuccessMessageDisplayed() {
        try {
            WebElement messageElement = driver.findElement(successMessage);
            return messageElement.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    
	public boolean isLogoutButtonDisplayed() {
        WebElement logoutButtonElement = driver.findElement(logoutButton);
        return logoutButtonElement.isDisplayed();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    
    public String getErrorMessageText() {
        WebElement errorElement = driver.findElement(errorMessage);
        return errorElement.getText();
    }

    // Action: Check if the error message is displayed
    public boolean isErrorMessageDisplayed() {
        try {
            WebElement errorElement = driver.findElement(errorMessage);
            return errorElement.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    
}
