package com.crm.genericlibrary;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class provides methods for performing actions on WebElement and WebDriver
 * @author DELL
 *
 */
public class WebDriverUtility
{
	WebDriver driver=null;

	/**
	 * This Method is used to maximize the window
	 * @param driver
	 */
	public static void maximizeTheWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * This method is used to open the browser
	 * @param driver
	 * @return 
	 */
	public static WebDriver openBrowser(WebDriver driver,String url)
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();

		driver= new ChromeDriver(options);

		maximizeTheWindow(driver);
		driver.get(url);
		return driver;
	}
	/**
	 * This method is used to wait until elements get load
	 * @param driver
	 * @param time
	 */
	public static void impliWait(WebDriver driver,long time)
	{
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}

	/***
	 * This method is used to close the browser
	 * @param driver
	 */
	public static void close(WebDriver driver) 
	{
		driver.quit();
	}

	/***
	 * This method is used to transfer the control to alert
	 * @param driver
	 */
	public static void transferToAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}

	public static void transferToNewWindow(WebDriver driver,String winId)
	{
		driver.switchTo().window(winId);
	}

	public static  String getWinId(WebDriver driver)
	{
		String data = driver.getWindowHandle();
		return data;
	}
	public static  Set<String> getWinIds(WebDriver driver)
	{
		Set<String> data = driver.getWindowHandles();
		return data;
	}
	public static void select(WebElement ele,String text) 
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}
	public static void select(String text,WebElement ele)
	{
		Select select = new Select(ele);
		select.selectByValue(text);
	}
}

