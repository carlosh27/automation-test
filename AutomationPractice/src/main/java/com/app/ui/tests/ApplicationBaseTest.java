package com.app.ui.tests;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.app.steps.GuitarInventorySteps;
import com.app.steps.SearchResultsSteps;
import com.ui.actions.BaseTest;
import com.ui.actions.TestData;

public class ApplicationBaseTest  extends BaseTest{

	@BeforeTest
	public void Setup() throws IOException {
		driver = webDriverConnection();
	}
	
	@AfterTest
	public void Teardown() {
		driver.quit();
	}
	
	@Test
	public void seleniumBaseTest(String testCaseNumber, String testDataPath) throws IOException, InterruptedException, ParseException {
		//Set TestData for JSON
		TestData testData = new TestData();
		testData.testDataParse(testDataPath, testCaseNumber);
		
		//open application 
		openApplication(testData.getData("appURL"));	
		
		//create object for page steps
		GuitarInventorySteps guitarInventorySteps = new GuitarInventorySteps(driver);
		SearchResultsSteps searchResultSteps = new SearchResultsSteps(driver);
		
		//Start execution of test Steps
		guitarInventorySteps.TypeSearch(testData.getData("searchCriteria"));
		guitarInventorySteps.submitSearch();		
		searchResultSteps.clickUrlCardResult(2);
		browserNavigate("back");
		searchResultSteps.changeCSSBackgoundByCardTitle(testData.getData("cardTitleChange"), testData.getData("backgroundColorCode"));
		searchResultSteps.pressBack();
	}
	
}