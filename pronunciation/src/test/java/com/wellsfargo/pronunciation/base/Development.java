package com.wellsfargo.pronunciation.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Development {
	public void  adminLandingPage() {
	 System.setProperty("webdriver.chrome.driver","D:\\QART\\pronunciation\\pronunciation\\Server\\chromedriver.exe");        
     // Instantiate a ChromeDriver class.     
	 WebDriver driver=new ChromeDriver();       
   // Launch Website  
driver.get("https://wfnps-ui.azurewebsites.net"); 
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
  driver.findElement(By.xpath("//button/span[contains(text(),'Sign in')]")).click();

driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
  Reporter.log("Validating title");
  String title=driver.getTitle();
  Assert.assertEquals(title, "Name Pronounciation Tool","Succesfully validated");  
  if(title.equals("Name Pronounciation Tool"))
  	Reporter.log("Name Pronounciation Tool title is displayed");
  else
  	Reporter.log("Name Pronounciation Tool title is not displayed");
  driver.manage().window().maximize();  
  
  Reporter.log("Validating Admin Header");
  String header= driver.findElement(By.xpath("//header[@class='App-header']/div")).getText();
  Assert.assertEquals(header, "ADMIN","Succesfully validated");  
  if(header.equals("ADMIN"))
  	Reporter.log("Admin is displayed");
  else
  	Reporter.log("Admin not displayed");
  
  
  Reporter.log("Validating Wellsfargo Logo");
  boolean logo= driver.findElement(By.xpath("//header[@class='App-header']/img")).isDisplayed();
  Assert.assertEquals(true, logo, "Logo is displayed");
  if(logo==true)
  	Reporter.log("logo is displayed");
  else
  	Reporter.log("logo not displayed");
  
  
  Reporter.log("Validating header");
  WebDriverWait wait = new WebDriverWait(driver,30);
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='tool-header']")));
 
  
  String header1= driver.findElement(By.xpath("//div[@class='tool-header']")).getText();
 Assert.assertEquals(header1,"Name Pronounciation Tool", "Name Pronounciation Tool displayed");
  if(header1.equals("Name Pronounciation Tool"))
  	Reporter.log("Name Pronounciation Tool Header is displayed");
  else
  	Reporter.log("Name Pronounciation Tool Header not displayed");
  
  Reporter.log("Validating Name Search TextBox");
  wait = new WebDriverWait(driver,30);
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='name-search']")));  
  boolean nameSearchTextBox= driver.findElement(By.xpath("//div[@class='name-search']")).isDisplayed();
 Assert.assertEquals(true,nameSearchTextBox, "Name Search Text Box displayed");
  if(nameSearchTextBox==true)
  	Reporter.log("Name Search Text Box is displayed");
  else
  	Reporter.log("Name Search Text Box not displayed");
  
  Reporter.log("Validating Name Search TextBox dropdown");
  wait = new WebDriverWait(driver,30);
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Open']")));  
  boolean nameSearchdropdown= driver.findElement(By.xpath("//button[@aria-label='Open']")).isDisplayed();
 Assert.assertEquals(true,nameSearchdropdown, "Name Search Text Box displayed");
  if(nameSearchdropdown==true)
  	Reporter.log("Name Search Drop down is displayed");
  else
  	Reporter.log("Name Search Drop down not displayed");  
  
   driver.close();
  }

	

	public void userLandingPage() {
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
	    
	    Reporter.log("Validating Wellsfargo Logo");
	    boolean logo= driver.findElement(By.xpath("//header[@class='App-header']/img")).isDisplayed();
	    Assert.assertEquals(true, logo, "Logo is displayed");
	    if(logo==true)
	    	Reporter.log("logo is displayed");
	    else
	    	Reporter.log("logo not displayed");
		driver.close();
	}

	public void  adminPage() {
		 System.setProperty("webdriver.chrome.driver","D:\\QART\\pronunciation\\pronunciation\\Server\\chromedriver.exe");        
	     // Instantiate a ChromeDriver class.     
		 WebDriver driver=new ChromeDriver();       
	   // Launch Website  
	driver.get("https://wfnps-ui.azurewebsites.net"); 
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//button/span[contains(text(),'Sign in')]")).click();
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  Reporter.log("Validating title");
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Name Pronounciation Tool","Succesfully validated");  
	  if(title.equals("Name Pronounciation Tool"))
	  	Reporter.log("Name Pronounciation Tool title is displayed");
	  else
	  	Reporter.log("Name Pronounciation Tool title is not displayed");
	  driver.manage().window().maximize();  
	 
	  
	  WebDriverWait wait = new WebDriverWait(driver,50);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='name-search']")));
	  
	  driver.findElement(By.xpath("//button[@aria-label='Open']")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	  try {
		Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_DOWN); 
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER); 
		 r.keyRelease(KeyEvent.VK_ENTER);
	        
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  Reporter.log("Name Search Text Selected");
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='name-audio']")));
	  
	  System.out.println("hello"+driver.findElement(By.xpath("//span[@class='name-audio']")).getText());
	  
	  String pronounciationaudio= driver.findElement(By.xpath("//span[@class='name-audio']")).getText();
	  Assert.assertEquals(pronounciationaudio, "Pronounciation of Aby", "Pronounciation of Aby displayed");
	  if(pronounciationaudio.equals("Pronounciation of Aby"))
	  	Reporter.log("Pronounciation of Aby is displayed");
	  else
	  	Reporter.log("Pronounciation of Aby not displayed");
	  
	  Reporter.log("Validating table data");	  
		String  tabledata= driver.findElement(By.xpath("//tr/th[1]")).getText();
	  Assert.assertEquals(tabledata, "Legal First Name", "Legal First Name displayed");
	  if(tabledata.equals("Legal First Name"))
	  	Reporter.log("Legal First Name is displayed");
	  else
	  	Reporter.log("Legal First Name not displayed");
	  
	  tabledata= driver.findElement(By.xpath("//tr/th[2]")).getText();
	  Assert.assertEquals(tabledata, "Legal Last Name", "Legal Last Name displayed");
	  if(tabledata.equals("Legal Last Name"))
	  	Reporter.log("Legal Last Name is displayed");
	  else
	  	Reporter.log("Legal Last Name not displayed");
	  
	  tabledata= driver.findElement(By.xpath("//tr/th[3]")).getText();
	  Assert.assertEquals(tabledata, "Preferred Name", "Preferred Name displayed");
	  if(tabledata.equals("Preferred Name"))
	  	Reporter.log("Preferred Name is displayed");
	  else
	  	Reporter.log("Preferred Name not displayed");
	  
	  tabledata= driver.findElement(By.xpath("//tr/th[4]")).getText();
	  Assert.assertEquals(tabledata, "Phonetics", "Phonetics displayed");
	  if(tabledata.equals("Phonetics"))
	  	Reporter.log("Phonetics is displayed");
	  else
	  	Reporter.log("Phonetics not displayed");
	  
	  Reporter.log("validating Admin buttons");
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='MuiButton-label'][1]")));
	  System.out.println("HAI"+driver.findElement(By.xpath("//span[@class='MuiButton-label'][1]")).getText());
	  String tool= driver.findElement(By.xpath("//span[@class='MuiButton-label'][1]")).getText();
	  Assert.assertEquals(tool, "PREFERENCES", "Preferences button displayed");
	  if(tool.equals("PREFERENCES"))
	  	Reporter.log("Preferences button is displayed");
	  else
	  	Reporter.log("Preferences button not displayed");
	  
	  System.out.println("HAI"+driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).getText());
	  tool= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).getText();
	  Assert.assertEquals(tool, "RECORD ABY", "RECORD ABY button displayed");
	  if(tool.equals("RECORD ABY"))
	  	Reporter.log("RECORD ABY button is displayed");
	  else
	  	Reporter.log("RECORD ABY button not displayed");
	  
	  
	  System.out.println("HAI"+driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[3]")).getText());
	 tool= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[3]")).getText();
	  Assert.assertEquals(tool, "UPLOAD AUDIO", "UPLOAD AUDIO button displayed");
	  if(tool.equals("UPLOAD AUDIO"))
	  	Reporter.log("UPLOAD AUDIO button is displayed");
	  else
	  	Reporter.log("UPLOAD AUDIO button not displayed");
	  

	  
	  
	   driver.close();
	  }

	public void adminPreferences() {
		 System.setProperty("webdriver.chrome.driver","D:\\QART\\pronunciation\\pronunciation\\Server\\chromedriver.exe");        
	     // Instantiate a ChromeDriver class.     
		 WebDriver driver=new ChromeDriver();       
	   // Launch Website  
	driver.get("https://wfnps-ui.azurewebsites.net"); 
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//button/span[contains(text(),'Sign in')]")).click();
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  Reporter.log("Validating title");
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Name Pronounciation Tool","Succesfully validated");  
	  if(title.equals("Name Pronounciation Tool"))
	  	Reporter.log("Name Pronounciation Tool title is displayed");
	  else
	  	Reporter.log("Name Pronounciation Tool title is not displayed");
	  driver.manage().window().maximize();  
	 
	  
	  WebDriverWait wait = new WebDriverWait(driver,50);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='name-search']")));
	  
	  driver.findElement(By.xpath("//button[@aria-label='Open']")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	  try {
		Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_DOWN); 
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER); 
		 r.keyRelease(KeyEvent.VK_ENTER);
	        
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='MuiButton-label'][1]")));
	  
	   driver.findElement(By.xpath("//span[@class='MuiButton-label'][1]")).click();
	   
	   
	   Reporter.log("Validating preference dialog box");
	   driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2")));
		 
		  String preferencesHeader=driver.findElement(By.xpath("//h2")).getText();
		  Assert.assertEquals(preferencesHeader, "Preferences", "Preferences heading displayed");
		  if(preferencesHeader.equals("Preferences"))
		  	Reporter.log("Preferences heading is displayed");
		  else
		  	Reporter.log("Preferences heading not displayed");
		  
		  String dialogContent=driver.findElement(By.xpath("//div[@class='MuiDialogContent-root']/div")).getText();
		  Assert.assertEquals(dialogContent, "Select a country and voice in which you would like to listen the pronounciation in", "dialogContent displayed");
		  if(dialogContent.equals("Select a country and voice in which you would like to listen the pronounciation in"))
		  	Reporter.log("Select a country and voice in which you would like to listen the pronounciation in is displayed");
		  else
		  	Reporter.log("Select a country and voice in which you would like to listen the pronounciation in not displayed");
		  
		  
		  String option1=driver.findElement(By.xpath("(//div[@class='MuiDialogContent-root']/div/div/div/label)[1]")).getText();
		  Assert.assertEquals(option1, "Select a Country", "option1 displayed");
		  if(option1.equals("Select a Country"))
		  	Reporter.log("Select a Country is displayed");
		  else
		  	Reporter.log("Select a Country not displayed");
		  
		  String option2=driver.findElement(By.xpath("(//div[@class='MuiDialogContent-root']/div/div/div/label)[2]")).getText();
		  Assert.assertEquals(option2, "Select Gender", "option2 displayed");
		  if(option1.equals("Select Gender"))
		  	Reporter.log("Select Gender is displayed");
		  else
		  	Reporter.log("Select Gender not displayed");
		  
		  String button=driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[1]")).getText();
		  Assert.assertEquals(button, "PLAY", "Play button displayed");
		  if(button.equals("PLAY"))
		  	Reporter.log("PLAY button is displayed");
		  else
		  	Reporter.log("PLAY buttonnot displayed");
		
		 boolean playbutton= driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[1]")).isEnabled();
		  Assert.assertEquals(false, playbutton, "Play button Disabled");
		  if(playbutton==false)
		  	Reporter.log("Play button Disabled");
		  else
		  	Reporter.log("Play button not Disabled");
		  
		  button=driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[2]")).getText();
		  Assert.assertEquals(button, "SAVE", "SAVE button displayed");
		  if(button.equals("SAVE"))
		  	Reporter.log("SAVE button is displayed");
		  else
		  	Reporter.log("SAVE buttonnot displayed");
		
		 playbutton= driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[2]")).isEnabled();
		  Assert.assertEquals(false, playbutton, "SAVE button Disabled");
		  if(playbutton==false)
		  	Reporter.log("SAVE button Disabled");
		  else
		  	Reporter.log("SAVE button not Disabled");
		  
		  button=driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[3]")).getText();
		  Assert.assertEquals(button, "CANCEL", "CANCEL button displayed");
		  if(button.equals("CANCEL"))
		  	Reporter.log("CANCEL button is displayed");
		  else
		  	Reporter.log("CANCEL buttonnot displayed");
		
		 playbutton= driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[3]")).isEnabled();
		  Assert.assertEquals(true, playbutton, "CANCEL button Disabled");
		  if(playbutton==true)
		  	Reporter.log("CANCEL button Enable");
		  else
		  	Reporter.log("CANCEL button not Enable");
		  
		  driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[3]")).click();
		  String  tabledata= driver.findElement(By.xpath("//tr/th[1]")).getText();
		  Assert.assertEquals(tabledata, "Legal First Name", "Legal First Name displayed");
		  if(tabledata.equals("Legal First Name"))
		  	Reporter.log("Legal First Name is displayed");
		  driver.close();
	
	}
	
	public void adminRecord() {
		 System.setProperty("webdriver.chrome.driver","D:\\QART\\pronunciation\\pronunciation\\Server\\chromedriver.exe");        
	     // Instantiate a ChromeDriver class.     
		 WebDriver driver=new ChromeDriver();       
	   // Launch Website  
	driver.get("https://wfnps-ui.azurewebsites.net"); 
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//button/span[contains(text(),'Sign in')]")).click();
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  Reporter.log("Validating title");
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Name Pronounciation Tool","Succesfully validated");  
	  if(title.equals("Name Pronounciation Tool"))
	  	Reporter.log("Name Pronounciation Tool title is displayed");
	  else
	  	Reporter.log("Name Pronounciation Tool title is not displayed");
	  driver.manage().window().maximize();  
	 
	  
	  WebDriverWait wait = new WebDriverWait(driver,50);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='name-search']")));
	  
	  driver.findElement(By.xpath("//button[@aria-label='Open']")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	  try {
		Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_DOWN); 
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER); 
		 r.keyRelease(KeyEvent.VK_ENTER);
	        
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='MuiButton-label'])[2]")));
	  
	   driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();
	   
	   
	   Reporter.log("Validating preference dialog box");
	   driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2")));
		 
		  String recordHeader=driver.findElement(By.xpath("//h2")).getText();
		  Assert.assertEquals(recordHeader, "Record Aby", "Preferences heading displayed");
		  if(recordHeader.equals("Record Aby"))
		  	Reporter.log("Record Aby heading is displayed");
		  else
		  	Reporter.log("Record Aby heading not displayed");
		  
		  String dialogContent=driver.findElement(By.xpath("//div[@class='MuiDialogContent-root']/div")).getText();
		  Assert.assertEquals(dialogContent, "Go to a quiet place and the click on the record button", "dialogContent displayed");
		  if(dialogContent.equals("Go to a quiet place and the click on the record button"))
		  	Reporter.log("Go to a quiet place and the click on the record button  is displayed");
		  else
		  	Reporter.log(" Go to a quiet place and the click on the record button  not displayed");
		  
		  
		  String option1=driver.findElement(By.xpath("//div[@class='mic-icon-info']")).getText();
		  Assert.assertEquals(option1, "Click the button to start recording", "option1 displayed");
		  if(option1.equals("Click the button to start recording"))
		  	Reporter.log("Click the button to start recording is displayed");
		  else
		  	Reporter.log("Click the button to start recording not displayed");
		  
		
		  
		  boolean button= driver.findElement(By.xpath("//h2/button")).isDisplayed();
		  Assert.assertEquals(true, button, "CANCEL button Disabled");
		  if(button==true)
		  	Reporter.log("CANCEL button displayed");
		  else
		  	Reporter.log("CANCEL button not displayed");
		  
		  
		  driver.findElement(By.xpath("//h2/button")).click();
		  String  tabledata= driver.findElement(By.xpath("//tr/th[1]")).getText();
		  Assert.assertEquals(tabledata, "Legal First Name", "Legal First Name displayed");
		  if(tabledata.equals("Legal First Name"))
		  	Reporter.log("Legal First Name is displayed");
		  driver.close();
	
	
	}
	
	public void adminUpload() {
		 System.setProperty("webdriver.chrome.driver","D:\\QART\\pronunciation\\pronunciation\\Server\\chromedriver.exe");        
	     // Instantiate a ChromeDriver class.     
		 WebDriver driver=new ChromeDriver();       
	   // Launch Website  
	driver.get("https://wfnps-ui.azurewebsites.net"); 
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//button/span[contains(text(),'Sign in')]")).click();
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  Reporter.log("Validating title");
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Name Pronounciation Tool","Succesfully validated");  
	  if(title.equals("Name Pronounciation Tool"))
	  	Reporter.log("Name Pronounciation Tool title is displayed");
	  else
	  	Reporter.log("Name Pronounciation Tool title is not displayed");
	  driver.manage().window().maximize();  
	 
	  
	  WebDriverWait wait = new WebDriverWait(driver,50);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='name-search']")));
	  
	  driver.findElement(By.xpath("//button[@aria-label='Open']")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	  try {
		Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_DOWN); 
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER); 
		 r.keyRelease(KeyEvent.VK_ENTER);
	        
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='MuiButton-label'])[3]")));
	  
	  boolean button= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[3]")).isEnabled();
	  Assert.assertEquals(true, button, "Upload button Disabled");
	  if(button==true)
	  	Reporter.log("Upload button displayed");
	  else
	  	Reporter.log("Upload button not displayed");
	  driver.close();
	}
	
	public void  userPage() {
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
    
	  
	  WebDriverWait wait = new WebDriverWait(driver,50);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='name-search']")));
	  
	  driver.findElement(By.xpath("//button[@aria-label='Open']")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	  try {
		Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_DOWN); 
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER); 
		 r.keyRelease(KeyEvent.VK_ENTER);
	        
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  Reporter.log("Name Search Text Selected");
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='name-audio']")));
	  
	  System.out.println("hello"+driver.findElement(By.xpath("//span[@class='name-audio']")).getText());
	  
	  String pronounciationaudio= driver.findElement(By.xpath("//span[@class='name-audio']")).getText();
	  Assert.assertEquals(pronounciationaudio, "Pronounciation of Aby", "Pronounciation of Aby displayed");
	  if(pronounciationaudio.equals("Pronounciation of Aby"))
	  	Reporter.log("Pronounciation of Aby is displayed");
	  else
	  	Reporter.log("Pronounciation of Aby not displayed");
	  Reporter.log("Validating table data");	  
		String  tabledata= driver.findElement(By.xpath("//tr/th[1]")).getText();
	  Assert.assertEquals(tabledata, "Legal First Name", "Legal First Name displayed");
	  if(tabledata.equals("Legal First Name"))
	  	Reporter.log("Legal First Name is displayed");
	  else
	  	Reporter.log("Legal First Name not displayed");
	  
	  tabledata= driver.findElement(By.xpath("//tr/th[2]")).getText();
	  Assert.assertEquals(tabledata, "Legal Last Name", "Legal Last Name displayed");
	  if(tabledata.equals("Legal Last Name"))
	  	Reporter.log("Legal Last Name is displayed");
	  else
	  	Reporter.log("Legal Last Name not displayed");
	  
	  tabledata= driver.findElement(By.xpath("//tr/th[3]")).getText();
	  Assert.assertEquals(tabledata, "Preferred Name", "Preferred Name displayed");
	  if(tabledata.equals("Preferred Name"))
	  	Reporter.log("Preferred Name is displayed");
	  else
	  	Reporter.log("Preferred Name not displayed");
	  
	  tabledata= driver.findElement(By.xpath("//tr/th[4]")).getText();
	  Assert.assertEquals(tabledata, "Phonetics", "Phonetics displayed");
	  if(tabledata.equals("Phonetics"))
	  	Reporter.log("Phonetics is displayed");
	  else
	  	Reporter.log("Phonetics not displayed");
	  
	
	  driver.close();
	}



	public void  userPreferences() {
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
	    
		  
		  WebDriverWait wait = new WebDriverWait(driver,50);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='name-search']")));
		  
		  driver.findElement(By.xpath("//button[@aria-label='Open']")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		  try {
			Robot r = new Robot();
			 r.keyPress(KeyEvent.VK_UP); 
			 r.keyRelease(KeyEvent.VK_UP);
			 r.keyPress(KeyEvent.VK_ENTER); 
			 r.keyRelease(KeyEvent.VK_ENTER);
		        
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  Reporter.log("Name Search Text Selected");
		  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='name-audio']")));
		  
		  System.out.println("hello"+driver.findElement(By.xpath("//span[@class='name-audio']")).getText());
		  
		  String pronounciationaudio= driver.findElement(By.xpath("//span[@class='name-audio']")).getText();
		  Assert.assertEquals(pronounciationaudio, "Pronounciation of Madan Mohan", "Pronounciation of Madan Mohandisplayed");
		  if(pronounciationaudio.equals("Pronounciation of Madan Mohan"))
		  	Reporter.log("Pronounciation of Madan Mohan is displayed");
		  else
		  	Reporter.log("Pronounciation of Madan Mohan not displayed");
		  Reporter.log("Validating table data");	  
			String  tabledata= driver.findElement(By.xpath("//tr/th[1]")).getText();
		  Assert.assertEquals(tabledata, "Legal First Name", "Legal First Name displayed");
		  if(tabledata.equals("Legal First Name"))
		  	Reporter.log("Legal First Name is displayed");
		  else
		  	Reporter.log("Legal First Name not displayed");
		  
		  tabledata= driver.findElement(By.xpath("//tr/th[2]")).getText();
		  Assert.assertEquals(tabledata, "Legal Last Name", "Legal Last Name displayed");
		  if(tabledata.equals("Legal Last Name"))
		  	Reporter.log("Legal Last Name is displayed");
		  else
		  	Reporter.log("Legal Last Name not displayed");
		  
		  tabledata= driver.findElement(By.xpath("//tr/th[3]")).getText();
		  Assert.assertEquals(tabledata, "Preferred Name", "Preferred Name displayed");
		  if(tabledata.equals("Preferred Name"))
		  	Reporter.log("Preferred Name is displayed");
		  else
		  	Reporter.log("Preferred Name not displayed");
		  
		  tabledata= driver.findElement(By.xpath("//tr/th[4]")).getText();
		  Assert.assertEquals(tabledata, "Phonetics", "Phonetics displayed");
		  if(tabledata.equals("Phonetics"))
		  	Reporter.log("Phonetics is displayed");
		  else
		  	Reporter.log("Phonetics not displayed");
		  
		
		 
		
		 driver.close();
		  
		}



	public void userPreferencesButton() {
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
    
	  
	  WebDriverWait wait = new WebDriverWait(driver,50);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='name-search']")));
	  
	  driver.findElement(By.xpath("//button[@aria-label='Open']")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	  try {
		Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_UP); 
		 r.keyRelease(KeyEvent.VK_UP);
		 r.keyPress(KeyEvent.VK_ENTER); 
		 r.keyRelease(KeyEvent.VK_ENTER);
	        
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='MuiButton-label'][1]")));
	  
	   driver.findElement(By.xpath("//span[@class='MuiButton-label'][1]")).click();
	   
	   
	   Reporter.log("Validating preference dialog box");
	   driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2")));
		 
		  String preferencesHeader=driver.findElement(By.xpath("//h2")).getText();
		  Assert.assertEquals(preferencesHeader, "Preferences", "Preferences heading displayed");
		  if(preferencesHeader.equals("Preferences"))
		  	Reporter.log("Preferences heading is displayed");
		  else
		  	Reporter.log("Preferences heading not displayed");
		  
		  String dialogContent=driver.findElement(By.xpath("//div[@class='MuiDialogContent-root']/div")).getText();
		  Assert.assertEquals(dialogContent, "Select a country and voice in which you would like to listen the pronounciation in", "dialogContent displayed");
		  if(dialogContent.equals("Select a country and voice in which you would like to listen the pronounciation in"))
		  	Reporter.log("Select a country and voice in which you would like to listen the pronounciation in is displayed");
		  else
		  	Reporter.log("Select a country and voice in which you would like to listen the pronounciation in not displayed");
		  
		  
		  String option1=driver.findElement(By.xpath("(//div[@class='MuiDialogContent-root']/div/div/div/label)[1]")).getText();
		  Assert.assertEquals(option1, "Select a Country", "option1 displayed");
		  if(option1.equals("Select a Country"))
		  	Reporter.log("Select a Country is displayed");
		  else
		  	Reporter.log("Select a Country not displayed");
		  
		  String option2=driver.findElement(By.xpath("(//div[@class='MuiDialogContent-root']/div/div/div/label)[2]")).getText();
		  Assert.assertEquals(option2, "Select Gender", "option2 displayed");
		  if(option1.equals("Select Gender"))
		  	Reporter.log("Select Gender is displayed");
		  else
		  	Reporter.log("Select Gender not displayed");
		  
		  String button=driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[1]")).getText();
		  Assert.assertEquals(button, "PLAY", "Play button displayed");
		  if(button.equals("PLAY"))
		  	Reporter.log("PLAY button is displayed");
		  else
		  	Reporter.log("PLAY buttonnot displayed");
		
		 boolean playbutton= driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[1]")).isEnabled();
		  Assert.assertEquals(false, playbutton, "Play button Disabled");
		  if(playbutton==false)
		  	Reporter.log("Play button Disabled");
		  else
		  	Reporter.log("Play button not Disabled");
		  
		  button=driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[2]")).getText();
		  Assert.assertEquals(button, "SAVE", "SAVE button displayed");
		  if(button.equals("SAVE"))
		  	Reporter.log("SAVE button is displayed");
		  else
		  	Reporter.log("SAVE buttonnot displayed");
		
		 playbutton= driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[2]")).isEnabled();
		  Assert.assertEquals(false, playbutton, "SAVE button Disabled");
		  if(playbutton==false)
		  	Reporter.log("SAVE button Disabled");
		  else
		  	Reporter.log("SAVE button not Disabled");
		  
		  button=driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[3]")).getText();
		  Assert.assertEquals(button, "CANCEL", "CANCEL button displayed");
		  if(button.equals("CANCEL"))
		  	Reporter.log("CANCEL button is displayed");
		  else
		  	Reporter.log("CANCEL buttonnot displayed");
		
		 playbutton= driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[3]")).isEnabled();
		  Assert.assertEquals(true, playbutton, "CANCEL button Disabled");
		  if(playbutton==true)
		  	Reporter.log("CANCEL button Enable");
		  else
		  	Reporter.log("CANCEL button not Enable");
		  
		  driver.findElement(By.xpath("(//div[contains(@class,'user-details margin-bottom')]/button)[3]")).click();
		  String  tabledata= driver.findElement(By.xpath("//tr/th[1]")).getText();
		  Assert.assertEquals(tabledata, "Legal First Name", "Legal First Name displayed");
		  if(tabledata.equals("Legal First Name"))
		  	Reporter.log("Legal First Name is displayed");
		  driver.close();
	}



	public void userPreferencesRecord() {
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
    
	  
	  WebDriverWait wait = new WebDriverWait(driver,50);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='name-search']")));
	  
	  driver.findElement(By.xpath("//button[@aria-label='Open']")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	  try {
		Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_UP); 
		 r.keyRelease(KeyEvent.VK_UP);
		 r.keyPress(KeyEvent.VK_ENTER); 
		 r.keyRelease(KeyEvent.VK_ENTER);
	        
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  Reporter.log("Name Search Text Selected");
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='name-audio']")));
	  
	  System.out.println("hello"+driver.findElement(By.xpath("//span[@class='name-audio']")).getText());
	  
	  String pronounciationaudio= driver.findElement(By.xpath("//span[@class='name-audio']")).getText();
	  Assert.assertEquals(pronounciationaudio, "Pronounciation of Madan Mohan", "Pronounciation of Madan Mohandisplayed");
	  if(pronounciationaudio.equals("Pronounciation of Madan Mohan"))
	  	Reporter.log("Pronounciation of Madan Mohan is displayed");
	  else
	  	Reporter.log("Pronounciation of Madan Mohan not displayed");
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='MuiButton-label'])[2]")));
	  
	   driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();
	   
	   
	   Reporter.log("Validating preference dialog box");
	   driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2")));
		 
		  String recordHeader=driver.findElement(By.xpath("//h2")).getText();
		  Assert.assertEquals(recordHeader, "Record Madan Mohan", "Record Madan Mohan heading displayed");
		  if(recordHeader.equals("Record Madan Mohan"))
		  	Reporter.log("Record Madan Mohan heading is displayed");
		  else
		  	Reporter.log("Record Madan Mohan heading not displayed");
		  
		  String dialogContent=driver.findElement(By.xpath("//div[@class='MuiDialogContent-root']/div")).getText();
		  Assert.assertEquals(dialogContent, "Go to a quiet place and the click on the record button", "dialogContent displayed");
		  if(dialogContent.equals("Go to a quiet place and the click on the record button"))
		  	Reporter.log("Go to a quiet place and the click on the record button  is displayed");
		  else
		  	Reporter.log(" Go to a quiet place and the click on the record button  not displayed");
		  
		  
		  String option1=driver.findElement(By.xpath("//div[@class='mic-icon-info']")).getText();
		  Assert.assertEquals(option1, "Click the button to start recording", "option1 displayed");
		  if(option1.equals("Click the button to start recording"))
		  	Reporter.log("Click the button to start recording is displayed");
		  else
		  	Reporter.log("Click the button to start recording not displayed");
		  
		
		  
		  boolean button= driver.findElement(By.xpath("//h2/button")).isDisplayed();
		  Assert.assertEquals(true, button, "CANCEL button Disabled");
		  if(button==true)
		  	Reporter.log("CANCEL button displayed");
		  else
		  	Reporter.log("CANCEL button not displayed");
		  
		  
		  driver.findElement(By.xpath("//h2/button")).click();
		  String  tabledata= driver.findElement(By.xpath("//tr/th[1]")).getText();
		  Assert.assertEquals(tabledata, "Legal First Name", "Legal First Name displayed");
		  if(tabledata.equals("Legal First Name"))
		  	Reporter.log("Legal First Name is displayed");
		  driver.close();
	}



	public void userPreferencesUploadButton() {
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
    
	  
	  WebDriverWait wait = new WebDriverWait(driver,50);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='name-search']")));
	  
	  driver.findElement(By.xpath("//button[@aria-label='Open']")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	  try {
		Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_UP); 
		 r.keyRelease(KeyEvent.VK_UP);
		 r.keyPress(KeyEvent.VK_ENTER); 
		 r.keyRelease(KeyEvent.VK_ENTER);
	        
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='MuiButton-label'])[3]")));
	  
	  boolean button= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[3]")).isEnabled();
	  Assert.assertEquals(true, button, "Upload button Disabled");
	  if(button==true)
	  	Reporter.log("Upload button displayed");
	  else
	  	Reporter.log("Upload button not displayed");
	  driver.close();
	}
}
