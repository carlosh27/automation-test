package com.ui.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*BaseTest contain the general methods use for a test
 * Author: Carlos Humbrto Garcia Durán
 * Creation date: 01-28-2021
 * mail: carlos.h27@hotmail.com
 */

public class BaseTest {
	String browser = "web";
	String chromeDriverPath = "test";
	public WebDriver driver;	

	public WebDriver webDriverConnection() {
		System.setProperty(browser, chromeDriverPath);
		driver = new ChromeDriver();
		return driver;
	}	
	
	public void openApplication(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public WebElement getElement(By element) {
		return driver.findElement(element);
	}
	
	public void type(String inputText, By element){
		driver.findElement(element).sendKeys(inputText);
	}
	
	public void click(By element){
		driver.findElement(element).click();
	}
	
	public String getText(By element) {
		return driver.findElement(element).getText();
	}
	
	public void browserNavigate(String direction) {
		
		switch (direction) {
		case "back":
			driver.navigate().back();
			break;
		case "forward":
			driver.navigate().forward();
			break;			
		}
	}
	
	public String getAtribute(By element, String atribute) {
		return driver.findElement(element).getAttribute(atribute);
	}
	
	public boolean isDisplayed(By element) {
		boolean display = false;
		try {
			display = driver.findElement(element).isDisplayed();
		}
		catch (NoSuchElementException e) {
			printInConsole("Element no displayed" + element);
		}
		return display;
	}
	
	public void printInConsole(String message) {
		System.out.println(message);
	}
	
	public void wait(int seconds) throws InterruptedException {
		seconds = seconds * 1000;
		Thread.sleep(seconds); 
	}
	 
	

}
