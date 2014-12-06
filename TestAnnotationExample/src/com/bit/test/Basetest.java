package com.bit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basetest {
	
	static FirefoxDriver dr=new FirefoxDriver();
	
	@BeforeClass
	public static void k1()
	{
		dr.manage().window().maximize();
		
		dr.get("http://www.google.com");
		
	}
	
@AfterClass
public static void k2() throws Throwable
{Thread.sleep(3000);
dr.quit();	
}
}
