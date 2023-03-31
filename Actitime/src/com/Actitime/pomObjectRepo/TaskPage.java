package com.Actitime.pomObjectRepo;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TaskPage {
	//decleration
	@FindBy(xpath = "")
	private WebElement addnewbtn;
	
	FindBy(xpath = "")
	private WebElement newcust;
	
	@FindBy(xpath = "")
	private WebElement custname;
	
	@FindBy(xpath = "")
	private WebElement custdesp;
	
	@FindBy(xpath = "")
	private WebElement createcust;
	
	public TaskPage(Webdriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddnewbtn() {
		
	}
}
