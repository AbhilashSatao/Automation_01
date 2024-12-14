package com.qa.testscripts;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.Elements;
import com.qa.pages.LoginPage;
import com.qa.pages.Saucedemo;

public class BaseClass {

	WebDriver driver;
	LoginPage loginpage;
	Elements elements;
	Saucedemo saucedemo;
	JavascriptExecutor JSE;
	TakesScreenshot TSS;
	WebDriverWait wait;
	@Parameters({"Browser","Url"})
	@BeforeClass
//    public void Start() {
//		System.out.println("Test Suite Start Running");
//	}
	public void setup(String Browser, String Url) {
		if(Browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Abhi\\Desktop\\Automation Testing\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
			System.out.println("Edge Browser Opened");
		}
		else if (Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Abhi\\Desktop\\Automation Testing\\edgedriver_win64\\msedgedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(Url);
		loginpage=new LoginPage(driver);
		elements=new Elements(driver);
		saucedemo=new Saucedemo(driver);
		JSE= (JavascriptExecutor) driver;
		TSS= (TakesScreenshot) driver;
		//wait=new WebDriverWait(driver, 10);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		}
	public void CaptureScreenshot(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+ tname+ ".png");
		FileUtils.copyFile(src, target);
	}
	
	@AfterClass
	public void TearDown()
	{
		driver.close();
     	driver.quit();
	}
	
	}
	

