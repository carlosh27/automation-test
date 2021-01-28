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
		type(inputText, (By) page.searchField());
		String validator = getText(page.searchButton());
		boolean actual = false;
		if(validator != "") {
			actual = true;
		}
		System.out.println (validator);
		assertEquals(actual, true);
	}
	
	public void submitSearch() {
		click((By) page.searchButton());
	}
}
