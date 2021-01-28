package com.app.steps;

import static org.testng.Assert.assertEquals;

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
		type(inputText,page.searchField());
	}
	
	public void submitSearch() {
		click((By) page.searchButton());
	}
	
	public void validateEmptySearchField() {
		String actualValue = getText(page.searchField());
		String expectedValue = "";
		assertEquals(actualValue, expectedValue);
	}
}
