package com.bit.support;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class C 
{
	FirefoxDriver dr=new FirefoxDriver();
	public void m1() throws InterruptedException
	{
		//dr.get("http://www.facebook.com");
		//dr.manage().window().maximize();
		//dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(7000);
		//dr.findElement(By.xpath(".//*[@id='revslider-395']/ul/li[1]/div[5]/a")).click();
		//dr.findElement(By.xpath(".//*[@id='small-searchterms']")).sendKeys("hgf");
		//dr.findElement(By.xpath("html/body/div[4]/header/section[2]/div/div[2]/div/div[2]/form/button")).click();
		//dr.navigate().back();
		//dr.quit();
		/*List<WebElement> count=dr.findElements(By.tagName("a"));
		int s=count.size();
		System.out.println(s);
		for(WebElement link:count)
		{
			System.out.println(link.getText());
		}get all text link*/
		/*WebElement e=dr.findElement(By.id("year"));
		//assign select object
		new Select(e).selectByVisibleText("1985");
		int s1=new Select(e).getOptions().size();
		System.out.println(s1);
		//select value by text
		//s.selectByVisibleText("r");
		//list box size
		//int listboxSize=s.getOptions().size();
		//select last value by index
		for(int i=1;i<s1;i++)
		{
		new Select(e).selectByIndex(s1-i);
		Thread.sleep(2000);
		}get size and last index from drop down menu*/
	}
		@Test
		public void multipleWindowHandle() throws Throwable
		{

			FirefoxDriver dr=new FirefoxDriver();
			dr.get("http://bittech.bittechusa.com:8081/site1.html");
			dr.findElement(By.xpath("html/body/form/a/img")).click();
			Thread.sleep(3000);
			
			String ph=dr.getWindowHandle();
			Set<String> handls=dr.getWindowHandles();
			for(String h1:handls)
			{
				if(!h1.equals(ph))
				{
					
					dr.switchTo().window(ph);
					Thread.sleep(2000);
					dr.findElement(By.xpath(".//*[@id='name']")).sendKeys("shahid");
					dr.close();
					//Thread.sleep(5000);
					//dr.findElement(By.xpath(".//*[@id='main-nav-new']/a")).click();
					dr.quit();
				}
			}
		}
			@Test
			public void rightMouseClick() throws InterruptedException
			{
				dr.get("http://www.facebook.com");
				dr.manage().window().maximize();
				dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement ele=dr.findElement(By.xpath(".//*[@id='pageFooter']/div[2]/table/tbody/tr[1]/td[1]/a"));
				Actions ac=new Actions(dr);
				ac.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
				
				Thread.sleep(2000);
			}
			@Test
			public void getAttribute()
			{
				dr.get("http://www.facebook.com");
				dr.manage().window().maximize();
				dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement ele=dr.findElement(By.xpath(".//*[@id='pageFooter']/div[2]/table/tbody/tr[1]/td[1]/a"));
				System.out.println(ele.getAttribute("title"));
			}
		
		
	

}
