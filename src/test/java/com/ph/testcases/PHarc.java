package com.ph.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ph.testcases .DBconnect;

            
public class PHarc  {
	WebDriver drv;
	String psw="arc@123";
	public static Logger log;
	DBconnect db=new DBconnect();
	/*@Test(dependsOnMethods = { "pending_Estimation" })
public void datacheck() {
		db.connect();
	}
	*/
@BeforeSuite
	
	public void start_browser() {
	log=Logger.getLogger("PHrepairportal");
	PropertyConfigurator.configure("Log4j.properties");
	System. setProperty("webdriver.chrome.driver", "C:\\Users\\abha.singh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 drv=new ChromeDriver();
	}
@Test(priority=2)
public void login_arc() throws InterruptedException {
	log.info("Login done");
	drv.get("http://arc-uat.amtrust.asia/#/login/ph");
	drv.manage().window().maximize();
	drv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	drv.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("arc_ph");
	drv.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(psw);
	drv.findElement(By.xpath("//button[@class='mat-raised-button mat-accent']")).click();
	Thread.sleep(4000);
}

@Test(priority=3)
public void pending_Estimation() throws Exception{
	log.info("Estimation done");
/*	WebElement username = this.getWebElement("input", "id", "mat-input-0");
	WebElement password = this.getWebElement("input", "id", "mat-input-1");
	WebElement button = this.getWebElement("button", "class", "mat-raised-button mat-accent");
	username.sendKeys("rahul.vijay");
	password.sendKeys("rahul@123");
	button.click();*/
	
  
	List<WebElement> pending_estimation=drv.findElements(By.xpath("//span[@class='mat-button-wrapper' and text()='Estimation']//ancestor::tbody"));
	for(int i=0;i<pending_estimation.size();i++) {
    	//System.out.println(pending_estimation.get(0).getText());
    	if ((pending_estimation.get(i).getText()).contains("865720041497659")) {
   drv.findElement(By.xpath("//span[contains(text(),'865720041497659')]//parent::button//parent::td//parent::tr//child::span[text()='Estimation']")).click();
   System.out.println("estimation pop clicked and wait for 20 seconds");
   Thread.sleep(5000);
   System.out.println("after that click to show dropdown");
   WebDriverWait wait = new WebDriverWait(drv,20);  
   WebElement check1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@placeholder='Select ARC Model']")));
   check1.click();
   
   System.out.println("waiting for 20 sec");
   Thread.sleep(5000);
   WebElement options= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text' and contains(text(),\"TA-1032\") ]")));
    
  //System.out.println(options);
  this.clickElement(options);
  Thread.sleep(5000);
 
  WebElement submit_button=drv.findElement(By.xpath("//span[@class='mat-button-wrapper' and text()='Submit']"));
  submit_button.click();
  Thread.sleep(3000);
  this.uploadfile();
  drv.findElement(By.xpath("//div[contains(text(),'Bill of Material')]")).click();
  Thread.sleep(3000);
  drv.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']")).click();
  drv.findElement(By.className("mat-input-element")).sendKeys("2000");
 
  WebElement check2= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@placeholder='Tax (%)']")));
  check2.click();
  WebElement options1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text' and contains(text(),\"12.0\") ]")));
  this.clickElement(options1);
  drv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  WebElement calculate_button=drv.findElement(By.xpath("//span[contains(text(),'Calculate')]"));                                  
  calculate_button.click();
  this.waiting();
  drv.findElement(By.xpath("//textarea[@placeholder='Comments']")).sendKeys("Test123");
  this.waiting();
  drv.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
  
  Thread.sleep(3000);
  drv.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
  Thread.sleep(3000);
  break;
   }
   else
   {
	   System.out.println("Pending estimation---IMEI not found for Pending estimation");
   }}
}

	
	


public void waiting() {
	drv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

  public void clickElement(WebElement element) {
	  
	  element.click();
  }
  public WebElement getWebElement(String elem,String type,String type_val) {
	  
	  WebElement webElem = drv.findElement(By.xpath("//"+elem+"[@"+type+"='"+type_val+"']"));
	  return webElem;
  }
  //--------------for uploading Mobile images----------
  public void uploadfile() throws Exception {
	  log.info("Upload file done");
	  drv.findElement(By.xpath("//div[contains(text(),'Upload Files')]")).click();
	  Thread.sleep(2000);
	 drv.findElement(By.xpath("//mat-select[@id='picklist']")).click();
	  
	  WebDriverWait wait = new WebDriverWait(drv,10);  
	  
	  WebElement topimage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text' and contains(text(),\"Top Image\") ]")));
	   topimage.click();
	  // drv.findElement(By.xpath("//input[@id='img']")).click();
	    WebElement fileselect= drv.findElement(By.xpath("//input[@type='file']"));
		 fileselect.sendKeys("C:\\Users\\abha.singh\\Documents\\Repair portal\\quality check.png");
		 drv.findElement(By.xpath(" //span[contains(text(),'Upload')]")).click();
		 Thread.sleep(6000);
	   drv.findElement(By.xpath("//mat-select[@id='picklist']")).click();
	   WebElement bottomimage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text' and contains(text(),\"Bottom Image\") ]")));
	   bottomimage.click();
	   // drv.findElement(By.xpath("//input[@id='img']")).click();
		fileselect.sendKeys("C:\\Users\\abha.singh\\Documents\\Repair portal\\quality check.png");
		 drv.findElement(By.xpath(" //span[contains(text(),'Upload')]")).click();
		 Thread.sleep(6000);
		 drv.findElement(By.xpath("//mat-select[@id='picklist']")).click();
		   WebElement backimage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text' and contains(text(),\"Back Image\") ]")));
		   backimage.click();
		  //  drv.findElement(By.xpath("//input[@id='img']")).click();
			fileselect.sendKeys("C:\\Users\\abha.singh\\Documents\\Repair portal\\quality check.png");
			 drv.findElement(By.xpath(" //span[contains(text(),'Upload')]")).click();
			 Thread.sleep(7000);
			 
			 drv.findElement(By.xpath("//mat-select[@id='picklist']")).click();
			   WebElement frontimage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text' and contains(text(),\"Front Image\") ]")));
			   frontimage.click();
			   // drv.findElement(By.xpath("//input[@id='img']")).click();
				fileselect.sendKeys("C:\\Users\\abha.singh\\Documents\\Repair portal\\quality check.png");
				 drv.findElement(By.xpath(" //span[contains(text(),'Upload')]")).click();
	    
				 Thread.sleep(7000);
				 drv.findElement(By.xpath("//mat-select[@id='picklist']")).click();
				   WebElement leftimage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text' and contains(text(),\"Left Image\") ]")));
				   leftimage.click();
				   // drv.findElement(By.xpath("//input[@id='img']")).click();
					fileselect.sendKeys("C:\\Users\\abha.singh\\Documents\\Repair portal\\quality check.png");
					 drv.findElement(By.xpath(" //span[contains(text(),'Upload')]")).click();
					 Thread.sleep(7000);
					 drv.findElement(By.xpath("//mat-select[@id='picklist']")).click();
					   WebElement rightimage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-option-text' and contains(text(),\"Right Image\") ]")));
					   rightimage.click();
					   // drv.findElement(By.xpath("//input[@id='img']")).click();
						fileselect.sendKeys("C:\\Users\\abha.singh\\Documents\\Repair portal\\quality check.png");
						 drv.findElement(By.xpath(" //span[contains(text(),'Upload')]")).click();
						 Thread.sleep(7000);
					 
  }
  
  @Test(priority=4)
      public void repairinprogress() throws Exception {
	  log.info("Repair done");
	 // String str=drv.findElement(By.xpath("//span[@class='mat-button-wrapper' and text()='Repair Complete']//ancestor::tbody")).getText();
	 //  System.out.println(str);
	  List<WebElement> pending=drv.findElements(By.xpath("//span[@class='mat-button-wrapper' and text()='Repair Complete']//ancestor::tbody"));
	  for(int i=0;i<pending.size();i++) {
		  if ((pending.get(i).getText()).contains("865720041497659")) {
	  drv.findElement(By.xpath("//span[contains(text(),'865720041497659')]//parent::button//parent::td//parent::tr//child::span[text()='Repair Complete']")).click();
	 WebElement fileselect= drv.findElement(By.xpath("//input[@type='file']"));
	 fileselect.sendKeys("C:\\Users\\abha.singh\\Documents\\Repair portal\\quality check.png");
	  drv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 drv.findElement(By.className("mat-input-element")).sendKeys("Test123");
	 drv.findElement(By.className("mat-radio-outer-circle")).click();
	 drv.findElement(By.xpath("//button[@id='submitButton']")).click();
	 Thread.sleep(3000);
	 break;
	 
	 }
	 else
	 {
		 System.out.println("Repair In Progress---IMEI not found");
	 }}
  }
   
  
  @Test(enabled=false)
  public void pendingforDispatchSpoors() throws Exception {
	  log.info("Pending for dispatch done");
	  this.scrollpage();
	  List<WebElement> pending_for_dispatch=drv.findElements(By.xpath("//span[@class='mat-button-wrapper' and text()='Dispatch']//ancestor::tbody"));
	  for(int i=0;i<pending_for_dispatch.size();i++) {
	    	//System.out.println(pending_for_dispatch.get(0).getText());
	    	if ((pending_for_dispatch.get(i).getText()).contains("865720041497659")) {
	
	  drv.findElement(By.xpath("//span[text()='865720041497659']//parent::button//parent::td//parent::tr//child::span[text()='Dispatch']")).click();
	  WebDriverWait wait1 = new WebDriverWait(drv,20); 
	  WebElement check2= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='AWB Number']//parent::div//child::input")));
	// WebElement awb= drv.findElement(By.xpath("//input[@placeholder='AWB Number']"));
	 if(check2!=null) {
		drv.findElement(By.xpath("//span[text()='Picked Up By  ']//parent::div//child::input")).sendKeys("test");
	   drv.findElement(By.xpath("//input[@placeholder='Pick Up Date/Time']")).click();
	  // drv.findElement(By.xpath("//span[text()='Set']")).click();
	   drv.findElement(By.xpath("//span[contains(text(),'Set')]")).click();
	   Thread.sleep(3000);
	  // drv.findElement(By.xpath("//input[@placeholder='Delivery Date/Time']")).click();
	  // drv.findElement(By.xpath("//span[contains(text(),'Set')]")).click();
	   drv.findElement(By.xpath("//textarea[@placeholder='Comments']")).sendKeys("test");
	   drv.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
	  break;
	   }
	   else {
		   System.out.println("Pending for dispatch---IMEI not available");
	   }}}
  }
  
 
   public void UploadInvoices() {
	   this.scrollpage();
	  /* WebDriverWait wait = new WebDriverWait(drv, 10 );
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-button-wrapper' and text()='Upload Invoices']")));*/
	  
	 //  drv.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	WebElement uI=   drv.findElement(By.xpath("//span[@class='mat-button-wrapper' and text()='Upload Invoices']"));
	 boolean b1=  uI.isDisplayed();
	   System.out.println(b1);
	   uI.click();
	   
	String str1=   drv.findElement(By.xpath("//td[contains(text(),'4545667788990023')]")).getText();
	   System.out.println(str1);
	   Assert.assertTrue(str1.equalsIgnoreCase("4545667788990023"));
	   drv.findElement(By.xpath(" //tr[@class='ng-star-inserted odd']//input[@type='file']")).click();
	  }
   public void scrollpage() {
		JavascriptExecutor js = (JavascriptExecutor) drv;
		 js.executeScript("window.scrollBy(0,1000)");
	}
	
   
   }
  


