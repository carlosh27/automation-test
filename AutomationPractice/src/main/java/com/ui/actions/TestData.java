package com.ui.actions;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * Author: Carlos Humbrto Garcia Durán
 * Creation date: 01-28-2021
 * mail: carlos.h27@hotmail.com
 */

public class TestData extends BaseTest{
	
	public TestData () {
		super();
	}
	
	//Create the testData object
	public JSONObject testData; 

	//Parse the testData object using the a JSON file, parameters testData path and test cases number from testSpec File
	public JSONObject testDataParse(String testDataPath, String testNumber) throws IOException, ParseException {		
		String projectPath = System.getProperty("user.dir");
		FileReader readFile = new FileReader(projectPath + testDataPath);
		JSONParser jsonParse = new JSONParser();
		Object objData = jsonParse.parse(readFile);
		JSONObject jsonData = (JSONObject) objData;
		testData = (JSONObject) jsonData.get(testNumber);
		printInConsole(testData.toString());
		return testData;
	}
	
	//get the value from a json key in test data and convert to string
	public String getData(String jsonKey) {
		return testData.get(jsonKey).toString();		
	}
	
	//get the value from a json key in test data and convert to int
	public int getIntData(String jsonKey) {
		return Integer.parseInt(testData.get(jsonKey).toString());
	}
	
	//set new data to the test data 
	public void setStringData(String jsonKey, String value) {
		testData.put(jsonKey, value);
	}
}
