package com.wellsfargo.pronunciation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Locators {
	
	
	 @FindBy(xpath="//input[@name='username']")
	 private WebElement username;
	 
	
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username ) {
		this.username = username;
	}
	 
}
