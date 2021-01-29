package com.app.steps;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.app.pages.GuitarInventoryPage;

/*
 * Author: Carlos Humbrto Garcia Durán
 * Creation date: 01-28-2021
 * mail: carlos.h27@hotmail.com
 */

public class GuitarInventorySteps extends GuitarInventoryPage{

	public GuitarInventorySteps(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Create page object for guitar inventory
	GuitarInventoryPage page = new GuitarInventoryPage(driver);
	
	// type on search field 
	public void TypeSearch(String inputText) {
		type(inputText,page.searchField());
	}
	
	//click on search button
	public void submitSearch() {
		click((By) page.searchButton());
	}
	
	//validat if the search field is empty
	public void validateEmptySearchField() {
		String actualValue = getText(page.searchField());
		String expectedValue = "";
		assertEquals(actualValue, expectedValue);
	}
}
