package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsPage
{
	@FindBy(xpath ="//a[@href='/s/starting-at-rs-199-4625-8751']")
	private WebElement topsAndTees;

	public KidsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTopsAndTees() {
		return topsAndTees;
	}	
	 public void selectTopsAndTees() 
	 {
		 getTopsAndTees().click();
	 }
}

