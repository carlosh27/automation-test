package com.app.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.app.pages.GuitarInventoryPage;

public class GuitarInventorySteps extends GuitarInventoryPage{

	public GuitarInventorySteps(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	GuitarInventoryPage page = new GuitarInventoryPage(driver);
	
	public void TypeSearch(String inputText) {
		type(inputText, (By) page.searchField());
	}
}
