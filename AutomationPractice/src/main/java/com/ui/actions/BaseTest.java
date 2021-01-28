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
}
