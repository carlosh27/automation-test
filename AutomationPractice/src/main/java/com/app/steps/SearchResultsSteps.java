package com.app.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoSuchElementException;

import com.app.pages.SearchResultsPage;
import com.ui.actions.TestData;

/*
 * Author: Carlos Humbrto Garcia Durán
 * Creation date: 01-28-2021
 * mail: carlos.h27@hotmail.com
 */

public class SearchResultsSteps extends SearchResultsPage{

	public SearchResultsSteps(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//JavaScript executor declaration and create page object for Search Results
	JavascriptExecutor js = (JavascriptExecutor) driver;
	SearchResultsPage page = new SearchResultsPage(driver);
	
	public void clickUrlCardResultByPosition(int position) {
		click((By) page.results(position));
	}
	
	//Change the CSS background using javaScript
	public void changeCSSBackgoundByCardTitle(String cardTitle, String backGroundColorCode) throws InterruptedException {
		int position = findCartPositionByTitle(cardTitle);
		js.executeScript("document.getElementsByClassName(\"card\")["+ position +"].className='card'");
		js.executeScript("document.getElementsByClassName(\"card\")["+ position +"].style.backgroundColor='"+backGroundColorCode+"'");
		getElement(page.resultCardTitle(position+2)).click();
		wait(5);
	}
	
	//Find the postion of a Cart using the card title
	public int findCartPositionByTitle(String title) {
		int position = 1;
		boolean cardDisplayed = isDisplayed(page.resultCardTitle(position));	
				do {
					String cardTitle = getText(page.resultCardTitle(position));
					if(title.equals(cardTitle)) {
						break;
					}					
					position ++;					
					cardDisplayed = isDisplayed(page.resultCardTitle(position));
				}
				while(cardDisplayed);
				position = position - 1;
				printInConsole(String.valueOf(position));
		return position;
	}
	
	//press back button
	public void pressBack() throws InterruptedException {
		click(page.backButton());

	}
	
	//get the title of cart using the position
	public String obtainCardTitleByPosition(int position){
		return getText(page.resultCardTitle(position));
	}
	
}
