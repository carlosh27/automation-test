package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ui.actions.BaseTest;

public class GuitarInventoryPage extends BaseTest{
	
		
	public GuitarInventoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//By searchField = By.xpath("//input[@name='search']");
	//@FindBy(xpath = "//input[@name='search']")
	public By searchField(){
		By element = By.xpath("//input[@name='search']");
		return element;
	}

//	public void TypeSearch(String inputText) {
//		type(inputText, (By) searchField);
//	}
}
