package com.app.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.app.pages.SearchResultsPage;

public class SearchResultsSteps extends SearchResultsPage{

	public SearchResultsSteps(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	SearchResultsPage page = new SearchResultsPage(driver);
	
	public void clickUrlCardResult(int number) {
		click((By) page.results(2));
	}
	
	public void changeCSSBackgound() {
		
	}
	

}
