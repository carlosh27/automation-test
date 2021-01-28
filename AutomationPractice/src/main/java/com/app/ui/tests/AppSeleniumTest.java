package com.app.ui.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.pages.GuitarInventoryPage;
import com.app.steps.GuitarInventorySteps;
import com.ui.actions.BaseTest;

public class AppSeleniumTest  extends BaseTest{



	@BeforeTest
	public void Setup() throws IOException {
		driver = webDriverConnection();
	}
	
	@Test
	public void seleniumTest() throws IOException, InterruptedException {
		String url = "http://localhost:3000/shows";
		driver.get(url);
		
//		GuitarInventoryPage page = new GuitarInventoryPage(driver);
//		page.TypeSearch("Testeo");
		
		GuitarInventorySteps steps = new GuitarInventorySteps(driver);
		steps.TypeSearch("Testeo");
	}
	
}