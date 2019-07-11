package com.ph.testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ph.pageobject.Loginobjects;

public class Main_Testcase extends Ph_baseclass{

		@Test(priority=1)
		public void Login_test() throws Exception {
			Loginobjects obj=new Loginobjects(driver);
			//Loginobjects hp = PageFactory.initElements(driver, Loginobjects.class);
			obj.setusername(user);
			obj.setpassword(password);
			obj.login();
			logs.info("Login test passed");
			Thread.sleep(2000);
			//logs.info("IMEI available or not");
			obj.estimation(IMEI);
	        logs.info("IMEI not available then print count");
	        captureScreen(driver, "Login_test");
	       // obj.repairinprogress(IMEI, imagepath);
	        
			}
		@Test(enabled=false)
		public void createOrderApi() throws Exception {
			Ordercreationapi createOrder=new Ordercreationapi();
			createOrder.createrepairorder();
		}
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

	}
		
