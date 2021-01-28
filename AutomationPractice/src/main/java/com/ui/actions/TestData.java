package com.ui.actions;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestData extends BaseTest{
	
	public TestData () {
		super();
	}
	
	public JSONObject testData; 

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
	
	public String getData(String key) {
		return testData.get(key).toString();		
	}
	
}
