package com.app.ui.tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

/*
 * Author: Carlos Humbrto Garcia Durán
 * Creation date: 01-28-2021
 * mail: carlos.h27@hotmail.com
 */

public class Test_Application_GuitarInventory extends ApplicationBaseTest{
	
	String testDataPath = 	"/src/main/resources/testSpec/app/testData/app_testSpec.json";
	
	@Test
	public void Test_Application_GI_Batman() throws IOException, InterruptedException, ParseException {
		String testCaseNumber = "Test01";		
		seleniumBaseTest(testCaseNumber, testDataPath);
	}
	
	@Test
	public void Test_Application_GI_Superman() throws IOException, InterruptedException, ParseException {
		String testCaseNumber = "Test02";		
		seleniumBaseTest(testCaseNumber, testDataPath);
	}

}
