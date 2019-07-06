package com.ph.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
Properties pro;
public Readconfig() {
	File src=new File("./configuration/config.properties");
	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	} catch (Exception e) {
	System.out.println("Exception is:"+ e.getMessage());
		e.printStackTrace();
	}
}
	public String getApplicationUrl() {
		String url=pro.getProperty("url");
		return url;
		
	}
	
	public String getUserName() {
		String user=pro.getProperty("user");
		return user;
	}
	public String password() {
		String psw=pro.getProperty("password");
		return psw;
	}
	public String getIMEI() {
		String IMEI=pro.getProperty("IMEI");
		return IMEI;
	}
	public String imagepath() {
		String imagepath=pro.getProperty("imagepath");
		return imagepath;
	}
	public String chromepath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String IEpath() {
		String IEpath=pro.getProperty("IEpath");
		return IEpath;
	}
	
}

