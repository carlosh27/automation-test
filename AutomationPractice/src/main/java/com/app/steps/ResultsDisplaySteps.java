package com.app.steps;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import com.app.pages.ResultsDisplayPage;

/*
 * Author: Carlos Humbrto Garcia Durán
 * Creation date: 01-28-2021
 * mail: carlos.h27@hotmail.com
 */

public class ResultsDisplaySteps extends ResultsDisplayPage{

	public ResultsDisplaySteps(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Create page object for Results Display Page
	ResultsDisplayPage page = new ResultsDisplayPage(driver);

	//Validate if the page for selected card is displayed
	public void validatePageDisplayed(String titleExpected) {
		String title = getText(page.headerTitle());
		assertEquals(title,titleExpected);
		printInConsole("Page is displayed for card with title " + titleExpected);
	}
	
	
}
