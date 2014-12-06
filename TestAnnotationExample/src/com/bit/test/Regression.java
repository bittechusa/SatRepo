package com.bit.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class Regression extends Basetest

{

	@Test
	public void test1() throws Throwable
	{
		dr.findElement(By.xpath("//div[@class='gb_e gb_f']/a")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//div[@class='maia-util']/a[1]")).click();
		Thread.sleep(1000);

		dr.findElement(By.xpath("//form[@id='gaia_loginform']/input[10]")).sendKeys("paion6");
		dr.findElement(By.xpath("//form[@id='gaia_loginform']/input[11]")).sendKeys("hhkjh");
		dr.findElement(By.xpath("//form[@id='gaia_loginform']/input[@id='signIn']")).click();
		
	}
	@Test
	public void test3()
	{
		
	}
	
	@Test
	public void test4()
	{
		
	}
}
