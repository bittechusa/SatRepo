package com.saturday;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.DefaultSelenium;

public class Raza {

	public static void main(String[] args) {
		DefaultSelenium dr= new DefaultSelenium("localhost",4444,"firefox","http://www.facebook.com");
	   
		//FirefoxDriver driver= new FirefoxDriver();
		dr.start();
		dr.open("/");
		dr.windowMaximize();
		//dr.type("", value);
	}

}
