package com.wellsfargo.pronunciation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wellsfargo.pronunciation.base.Development;
import com.wellsfargo.pronunciation.utils.Login;


public class TestPronounciationAsAdmin {
	
	@Test
	public void  testLoginAsAdmin() {
	  
		Login login=new Login();
		login.loginAdmin(); 		

}  
	@Test
	public void  testAdminLandingPage() {
		
		Development dev=new Development();
		dev.adminLandingPage();

}
	@Test
		public void  testAdminPage() {
			
			Development dev=new Development();
			dev.adminPage();
	
	}
	@Test
		public void  testAdminPreferences() {
			
			Development dev=new Development();
			dev.adminPreferences();
	
	}
	@Test
		public void  testAdminRecord() {
			
			Development dev=new Development();
			dev.adminRecord();
	
	}  
	@Test
	public void  testAdminUpload() {
		
		Development dev=new Development();
		dev.adminUpload();

}  
	
}