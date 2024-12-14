package com.qa.testscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseClass {

	@Test(priority=0)
	public void HomepageLanding() {
		//https://demoqa.com/books
		boolean homepage=driver.getCurrentUrl().contains("https://demoqa.com/elements");
		if(homepage) {
			System.out.println("The User is landed on the Correct page");
		}
		else {
			System.out.println("The User is not Landed on the Correct Page");
			Assert.assertTrue(homepage);
		}
	}
	
	@Test(priority=1)
	public void clickonElements() throws InterruptedException {
//		loginpage.getElements1().click();
//		Thread.sleep(2000);
//		loginpage.getElements2().click();
//		Thread.sleep(2000);
		elements.getTextBox().click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void saucedemologin() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/v1/");
		Thread.sleep(1000);
		saucedemo.getUsername().sendKeys("standard_user");
		Thread.sleep(1000);
		saucedemo.getPassword().sendKeys("secret_sauce");
		Thread.sleep(1000);
		saucedemo.getLoginbutton().click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		//WebElement sortdropdown=saucedemo.getSort();
		Select selectsort=new Select(saucedemo.getSort());
		selectsort.selectByVisibleText("Price (low to high)");
		Thread.sleep(1000);
//		String PName="Sauce Labs Bike Light";
//		String Productname=saucedemo.getProductName().getText();
//		System.out.println(Productname);
//		if(PName==Productname)
//		saucedemo.getAdd2Cart().click();
//		else
//			System.out.println("Item not found");
//			
//		Thread.sleep(2000);
		saucedemo.getAdd2Cart().click();
		Thread.sleep(2000);
		saucedemo.getCart().click();
		Thread.sleep(2000);
		saucedemo.getCheckout().click();
		Thread.sleep(2000);
		saucedemo.getFirstName().sendKeys("Abhilash");
		Thread.sleep(2000);
		saucedemo.getLastName().sendKeys("Satao");
		Thread.sleep(2000);
		saucedemo.getPostal().sendKeys("443101");
		Thread.sleep(2000);
		saucedemo.getContinuebutton().click();
		Thread.sleep(2000);
		saucedemo.getFinish().click();
		Thread.sleep(2000);
		}
}
