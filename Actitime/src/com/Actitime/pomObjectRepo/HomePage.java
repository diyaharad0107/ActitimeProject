package com.Actitime.pomObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//decleration
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasklnk;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportlnk;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement usertlnk;
	
	@FindBy(id = "logoutLink")
	private WebElement lgoutlnk;
	
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getTasklnk() {
		return tasklnk;
	}
	}
