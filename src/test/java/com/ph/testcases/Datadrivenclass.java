package com.ph.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ph.pageobject.Loginobjects;
import com.ph.utilities.Readconfig;
import com.ph.utilities.XLUtils;

public class Datadrivenclass extends Ph_baseclass {

	@Test(dataProvider="LoginData")
	public void Dataread(String username,String password) throws InterruptedException, IOException {
		Loginobjects lobj=new Loginobjects(driver);
		lobj.setusername(username);
		logs.info("user name provided"+username);
		lobj.setpassword(password);
		logs.info("psw name provided"+password);
		lobj.login();
		Thread.sleep(4000);
		lobj.logout();
		Thread.sleep(3000);
		Ph_baseclass base=new Ph_baseclass();
		base.captureScreen(driver, "name1");
		driver.close();
	}
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException {
		String path="C://Users//abha.singh//eclipse-workspace//PHrepairportal//src//test//java//com//ph//testdata//Datadriven.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		String logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}
}
