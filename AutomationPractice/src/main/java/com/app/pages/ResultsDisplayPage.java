package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ui.actions.BaseTest;

public class ResultsDisplayPage extends BaseTest{

	public ResultsDisplayPage(WebDriver driver) {
		this.driver = driver;
	}	
	
	public By headerTitle(){
		By element = By.xpath("//div[*]/header/h1");
		return element;
	}
	
}
