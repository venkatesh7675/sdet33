package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartingAt 
{
	
	@FindBy(xpath = "//div[@class='filter-dropdown']/select")
	private WebElement dropDown;
	
	//@FindBy(xpath="//div[text()='RIO GIRLS']/../../div[@class='imgHolder']")
	//private WebElement rioGirl;
	
	public StartingAt(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	//public WebElement getRioGirl() {
	//	return rioGirl;
	//}
	
	public WebElement getDropDown() {
		return dropDown;
	}

	// void riogirlselect() 
	//{
	//	rioGirl.click();
	//}
	
	public void dropDownselect() 
	{
		dropDown.click();
	}
	
	
}
