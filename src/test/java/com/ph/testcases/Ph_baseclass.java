package com.ph.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.ph.utilities.Readconfig;

import org.testng.annotations.AfterClass;
public class Ph_baseclass {

Readconfig readConfig=new Readconfig();
public String url=readConfig.getApplicationUrl();
public String user=readConfig.getUserName();
public String password=readConfig.password();
public String IMEI=readConfig.getIMEI();
public String imagepath=readConfig.imagepath();
public static WebDriver driver;
public static Logger logs;

@Parameters("browser")
@BeforeClass
public void setup(String br) {
	
	logs=Logger.getLogger("PHrepairportal");
	PropertyConfigurator.configure("Log4j.properties");
	
	if(br.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", readConfig.chromepath());
	driver=new ChromeDriver();
	}
	else if(br.equals("IE")) {
		System.setProperty("webdriver.ie.driver", readConfig.IEpath());
		driver=new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(url);

}

@AfterClass
 public void teardown() {
	    driver.quit();
}

public void captureScreen(WebDriver driver,String name) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+"/screenshots/"+name+".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
}
}


