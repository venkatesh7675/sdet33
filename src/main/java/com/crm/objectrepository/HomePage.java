package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(xpath = "//a[@title='KIDS']")
	private WebElement kidsTab;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getKidsTab() {
		return kidsTab;
	}
	
	public void selectKid() 
	{
		kidsTab.click();	
	}
}
