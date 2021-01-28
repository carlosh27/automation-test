package com.app.steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.app.pages.ResultsDisplayPage;

public class ResultsDisplaySteps extends ResultsDisplayPage{

	public ResultsDisplaySteps(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	ResultsDisplayPage page = new ResultsDisplayPage(driver);

	public void validatePageDisplayed(String titleExpected) {
		String title = getText(page.headerTitle());
		assertEquals(title,titleExpected);
		printInConsole("Page is displayed for card with title " + titleExpected);
	}
	
	
}
