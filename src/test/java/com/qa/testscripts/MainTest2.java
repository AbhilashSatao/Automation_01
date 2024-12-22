package com.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest2 extends BaseClass {

	
	@Test(priority=0)
	public void HomepageLanding1() {
		boolean homepage=driver.getCurrentUrl().contains("https://practicetestautomation.com/");
		if(homepage) {
			System.out.println("The User is landed on the Correct page");
		}
		else {
			System.out.println("The User is not Landed on the Correct Page");
			Assert.assertTrue(homepage);
		}
	}
	
	@Test(priority=1)
	public void LoginTest2() throws InterruptedException {
		
		String username="student";
		String password="Password123";
		Thread.sleep(2000);
		logintest2.getPractice().click();
		Thread.sleep(2200);
		logintest2.getLoginTest().click();
		boolean homepage=driver.getCurrentUrl().contains("https://practicetestautomation.com/practice-test-login/");
	    Assert.assertTrue(homepage,"The User is landed on the Correct page");
	    Thread.sleep(2000);
		logintest2.getUsername().sendKeys(username);
		Thread.sleep(2200);
		logintest2.getPassword().sendKeys(password);
		Thread.sleep(2200);
		logintest2.getSubmitbtn().click();
		Thread.sleep(1500);
		
		
        wait.until(driver -> driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
          
        // Step 5: Verify the new page contains the expected text ('Congratulations' or 'successfully logged in')
        Assert.assertTrue(cpage.isSuccessMessageDisplayed(), "Success message is not displayed");
        Thread.sleep(1500);
        // Step 6: Verify that the "Log out" button is displayed on the new page
        Assert.assertTrue(cpage.isLogoutButtonDisplayed(), "Log out button is not displayed");
        Thread.sleep(1500);
        // Step 7: Verify that the URL contains 'logged-in-successfully'
        String currentUrl = cpage.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("practicetestautomation.com/logged-in-successfully/"), "URL does not contain 'logged-in-successfully'");
        Thread.sleep(1500);
}	    
	
	@Test(priority=2)
	public void negativeusername() throws InterruptedException {
		String username="student1";
		String password="Password123";
		Thread.sleep(2000);
		driver.navigate().to("https://practicetestautomation.com/");
		logintest2.getPractice().click();
		Thread.sleep(2200);
		logintest2.getLoginTest().click();
		boolean homepage=driver.getCurrentUrl().contains("https://practicetestautomation.com/practice-test-login/");
	    Assert.assertTrue(homepage,"The User is landed on the Correct page");
	    Thread.sleep(2000);
		logintest2.getUsername().sendKeys(username);
		Thread.sleep(2200);
		logintest2.getPassword().sendKeys(password);
		Thread.sleep(2200);
		logintest2.getSubmitbtn().click();
		Thread.sleep(1500);
		// Step 4: Verify that the error message is displayed
        Assert.assertTrue(cpage.isErrorMessageDisplayed(), "Error message is not displayed");

        // Step 5: Verify that the error message text is "Your username is invalid!"
        String errorMessage = cpage.getErrorMessageText();
        Assert.assertEquals(errorMessage, "Your username is invalid!", "Error message text is not as expected");
	}
	
	@Test(priority=3)
	public void negativepassword() throws InterruptedException {
		String username="student";
		String password="Password12";
		Thread.sleep(2000);
		driver.navigate().to("https://practicetestautomation.com/");
		logintest2.getPractice().click();
		Thread.sleep(2200);
		logintest2.getLoginTest().click();
		boolean homepage=driver.getCurrentUrl().contains("https://practicetestautomation.com/practice-test-login/");
	    Assert.assertTrue(homepage,"The User is landed on the Correct page");
	    Thread.sleep(2000);
		logintest2.getUsername().sendKeys(username);
		Thread.sleep(2200);
		logintest2.getPassword().sendKeys(password);
		Thread.sleep(2200);
		logintest2.getSubmitbtn().click();
		Thread.sleep(1500);
		// Step 4: Verify that the error message is displayed
        Assert.assertTrue(cpage.isErrorMessageDisplayed(), "Error message is not displayed");

        // Step 5: Verify that the error message text is "Your username is invalid!"
        String errorMessage = cpage.getErrorMessageText();
        Assert.assertEquals(errorMessage, "Your password is invalid!", "Error message text is not as expected");
		
		
		
	}
}
