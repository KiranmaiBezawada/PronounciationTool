package com.wellsfargo.pronunciation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wellsfargo.pronunciation.base.Development;
import com.wellsfargo.pronunciation.utils.Login;


public class TestPronounciationAsUser {
	
	@Test
	public void  testLoginAsUser() {
	  
		Login login=new Login();
		login.loginUser(); 		

}  
	@Test
	public void  testUserLandingPage() {
		
		Development dev=new Development();
		dev.userLandingPage();
	}
		@Test
		public void  testUserPage() {
			
			Development dev=new Development();
			dev.userPage();

}
		@Test
				public void  testUserPreferences() {
					
					Development dev=new Development();
					dev.userPreferences();
		
		}
		@Test
				public void  testUserPreferencesButton() {
					
					Development dev=new Development();
					dev.userPreferencesButton();
		
		}  
		@Test
		public void  testUserPreferencesRecord() {
			
			Development dev=new Development();
			dev.userPreferencesRecord();

}  
		@Test
		public void  testUserPreferencesUpload() {
			
			Development dev=new Development();
			dev.userPreferencesUploadButton();

}  
	
}