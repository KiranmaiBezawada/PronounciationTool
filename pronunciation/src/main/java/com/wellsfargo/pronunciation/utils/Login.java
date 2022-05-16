package com.wellsfargo.pronunciation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.wellsfargo.pronunciation.pages.Locators;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;


public class Login {
	public void loginAdmin(){
    System.setProperty("webdriver.chrome.driver","D:\\QART\\pronunciation\\pronunciation\\Server\\chromedriver.exe");        
        // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();       
      // Launch Website  
   driver.get("https://wfnps-ui.azurewebsites.net");  
   Reporter.log("Validating title");
   String title=driver.getTitle();
   Assert.assertEquals(title, "Name Pronounciation Tool","Succesfully validated"); 
   if(title.equals("Name Pronounciation Tool"))
   	Reporter.log("Name Pronounciation Tool title is displayed");
   else
   	Reporter.log("Name Pronounciation Tool title is not displayed");
    //Maximize the browser  
     driver.manage().window().maximize();     
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
     driver.findElement(By.xpath("//button/span[contains(text(),'Sign in')]")).click();
     Reporter.log("Validating Header");
    String header= driver.findElement(By.xpath("//header[@class='App-header']/div")).getText();
    Assert.assertEquals(header, "ADMIN","Succesfully validated");  
    if(header.equals("ADMIN"))
    	Reporter.log("Admin is displayed");
    else
    	Reporter.log("Admin not displayed");
    
    
    String footer= driver.findElement(By.xpath(" //span[@class='button__label']")).getText();
    Assert.assertEquals(footer, "Privacy, Cookies, Security, and Legal","Succesfully validated");  
    if(header.equals("Privacy, Cookies, Security, and Legal"))
    	Reporter.log("Privacy, Cookies, Security, and Legal is displayed");
    else
    	Reporter.log("Privacy, Cookies, Security, and Legal not displayed");
    
 
     driver.close();
	}

	public void loginUser(){
	    System.setProperty("webdriver.chrome.driver","D:\\QART\\pronunciation\\pronunciation\\Server\\chromedriver.exe");        
	        // Instantiate a ChromeDriver class.     
	   WebDriver driver=new ChromeDriver();       
	      // Launch Website  
	   driver.get("https://wfnps-ui.azurewebsites.net");  
	   Reporter.log("Validating title");
	   String title=driver.getTitle();
	   Assert.assertEquals(title, "Name Pronounciation Tool","Succesfully validated"); 
	   if(title.equals("Name Pronounciation Tool"))
	   	Reporter.log("Name Pronounciation Tool title is displayed");
	   else
	   	Reporter.log("Name Pronounciation Tool title is not displayed");
	    //Maximize the browser  
	     driver.manage().window().maximize();     
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Kiranma");
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kiranmai");
	     driver.findElement(By.xpath("//button/span[contains(text(),'Sign in')]")).click();
	     Reporter.log("Validating Header");
	    String header= driver.findElement(By.xpath("//header[@class='App-header']/div")).getText();
	    Assert.assertEquals(header, "KIRANMA","Succesfully validated");  
	    if(header.equals("KIRANMA"))
	    	Reporter.log("user name kiranma is displayed");
	    else
	    	Reporter.log("user name kiranma not displayed");
	    
	    String footer= driver.findElement(By.xpath(" //span[@class='button__label']")).getText();
	    Assert.assertEquals(footer, "Privacy, Cookies, Security, and Legal","Succesfully validated");  
	    if(header.equals("Privacy, Cookies, Security, and Legal"))
	    	Reporter.log("Privacy, Cookies, Security, and Legal is displayed");
	    else
	    	Reporter.log("Privacy, Cookies, Security, and Legal not displayed");
	     driver.close();
		}

	public void loginExistingUser(){
	    System.setProperty("webdriver.chrome.driver","D:\\QART\\pronunciation\\pronunciation\\Server\\chromedriver.exe");        
	        // Instantiate a ChromeDriver class.     
	   WebDriver driver=new ChromeDriver();       
	      // Launch Website  
	   driver.get("https://wfnps-ui.azurewebsites.net");  
	   Reporter.log("Validating title");
	   String title=driver.getTitle();
	   Assert.assertEquals(title, "Name Pronounciation Tool","Succesfully validated"); 
	   if(title.equals("Name Pronounciation Tool"))
	   	Reporter.log("Name Pronounciation Tool title is displayed");
	   else
	   	Reporter.log("Name Pronounciation Tool title is not displayed");
	    //Maximize the browser  
	     driver.manage().window().maximize();     
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("u829006");
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("u829006");
	     driver.findElement(By.xpath("//button/span[contains(text(),'Sign in')]")).click();
	     Reporter.log("Validating Header");
	    String header= driver.findElement(By.xpath("//header[@class='App-header']/div")).getText();
	    Assert.assertEquals(header, "U829006","Succesfully validated");  
	    if(header.equals("U829006"))
	    	Reporter.log("u829006  is displayed");
	    else
	    	Reporter.log("u829006 not displayed");
	    String footer= driver.findElement(By.xpath(" //span[@class='button__label']")).getText();
	    Assert.assertEquals(footer, "Privacy, Cookies, Security, and Legal","Succesfully validated");  
	    if(header.equals("Privacy, Cookies, Security, and Legal"))
	    	Reporter.log("Privacy, Cookies, Security, and Legal is displayed");
	    else
	    	Reporter.log("Privacy, Cookies, Security, and Legal not displayed");
	     driver.close();
		}

}
