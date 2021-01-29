package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ui.actions.BaseTest;

/*
 * Author: Carlos Humbrto Garcia Durán
 * Creation date: 01-28-2021
 * mail: carlos.h27@hotmail.com
 */

public class SearchResultsPage extends BaseTest{

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By backButton(){
		By element = By.xpath("//a[@class='btn btn-primary']");
		return element;
	}
	
	public By results(int number){
		By element = By.xpath("//div[@class='container']/div[" + number + "]/div/div/div[2]/a");
		return element;
	}
	
	public By resultCardTitle(int number){
		By element = By.xpath("//div[@class='container']/div[" + number + "]/div/div/div[1]/span");
		return element;
	}
	
	public By resultConteiner() {
		By element = By.xpath("//div[@class='container']/div");
		return element;
	}
	
	
}
