package com.app.ui.tests;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.pages.GuitarInventoryPage;
import com.app.pages.SearchResultsPage;
import com.app.steps.GuitarInventorySteps;
import com.app.steps.SearchResultsSteps;
import com.ui.actions.BaseTest;

public class AppSeleniumTest  extends BaseTest{



	@BeforeTest
	public void Setup() throws IOException {
		driver = webDriverConnection();
	}
	
	@AfterTest
	public void Teardown() {
//		driver.quit();
	}
	
	@Test
	public void seleniumTest() throws IOException, InterruptedException {
		String url = "http://localhost:3000/shows";
		driver.get(url);		
		
		GuitarInventorySteps guitarInventorySteps = new GuitarInventorySteps(driver);
		SearchResultsSteps searchResultSteps = new SearchResultsSteps(driver);
		SearchResultsPage page = new SearchResultsPage(driver);
		
		guitarInventorySteps.TypeSearch("batman");
		guitarInventorySteps.submitSearch();
		
		//searchResultSteps.clickUrlCardResult(2);
		//navigate("back");
		WebElement table = findElement(page.resultConteiner());
		List<WebElement> rows = table.findElements(By.tagName("div"));
		System.out.println (rows);
		System.out.println (rows.size());
		
	
	}
	
}