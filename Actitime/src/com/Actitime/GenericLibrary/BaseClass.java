package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	FileLibrary f=new FileLibrary();
	
	
	@BeforeSuite
	public void databaseconnection () {
		Reporter.log("Database connected successfully",true);
		
	}
@AfterSuite
public void databasedisconnnection () {
	Reporter.log("database isconnected successfully",true);
}
@BeforeClass
public void launchbrowser() throws IOException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	  String URL = f.readDataFromProperty("url");
	  driver.get(URL);
	  Reporter.log("browser is launched",true);
	  
	 
	  }
   @AfterClass
   public void  closeBrowser () {
	   driver.close();
	   Reporter.log("lo);
}
}
