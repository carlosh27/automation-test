package com.ui.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BaseTest {
	String browser = "web";
	String chromeDriverPath = "test";
	public WebDriver driver;	

	public WebDriver webDriverConnection() {
		System.setProperty(browser, chromeDriverPath);
		driver = new ChromeDriver();
		return driver;
	}	
	public WebElement findElement(By element) {
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
	
	public void navigate(String direction) {
		
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
}
