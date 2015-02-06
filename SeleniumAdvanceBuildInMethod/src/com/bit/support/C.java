package com.bit.support;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.Select;


public class C 
{
	
	@Test//get all text link
	public void textLink() throws InterruptedException
	{	FirefoxDriver dr=new FirefoxDriver();

		dr.get("http://www.facebook.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Implicit wait is global variable, waits up to that time what is given, it works for the entire user interface
		/*dr.findElement(By.xpath(".//*[@id='revslider-395']/ul/li[1]/div[5]/a")).click();
		dr.findElement(By.xpath(".//*[@id='small-searchterms']")).sendKeys("hgf");
		dr.findElement(By.xpath("html/body/div[4]/header/section[2]/div/div[2]/div/div[2]/form/button")).click();
		dr.navigate().back();
		dr.quit();*/ 
		List<WebElement> count=dr.findElements(By.tagName("a"));
		int s=count.size();

		System.out.println(s);
		
		for(WebElement link:count)
		{
			System.out.println(link.getText());
		
		}
		}// end get all text link
		
	
	    @Test
		public void dropDownManuSize() throws InterruptedException
		{	FirefoxDriver dr=new FirefoxDriver();

			dr.get("http://www.facebook.com");
		WebElement manu=dr.findElement(By.id("year"));
		//assign select object
		new Select(manu).selectByVisibleText("1985");
		int s1=new Select(manu).getOptions().size();		//list box size
		new Select(manu).selectByIndex(s1-1);		//select last value by index

		System.out.println(s1);
		for(int i=1;i<s1;i=i++)
		{
		new Select(manu).selectByIndex(s1-i);		//select  value by index

		Thread.sleep(2000);
		}		dr.quit();
//get size and last index from drop down menu*/
	}
		@Test
		public void multipleWindowHandle() throws Throwable
		{

			FirefoxDriver dr=new FirefoxDriver();
			dr.get("http://bittech.bittechusa.com:8081/site1.html");
			dr.findElement(By.xpath("html/body/form/a/img")).click();
			Thread.sleep(3000);
			//explicit wait, wait exactly for the given time, local variable, it works for only one web element
			String parentwin=dr.getWindowHandle();
			Set<String> childwin=dr.getWindowHandles();
			for(String window:childwin)
			{
				if(!window.equals(parentwin))
				{
					
					dr.switchTo().window(parentwin);
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
			{	FirefoxDriver dr=new FirefoxDriver();

				dr.get("http://www.facebook.com");
				dr.manage().window().maximize();
				dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement ele=dr.findElement(By.xpath(".//*[@id='pageFooter']/div[2]/table/tbody/tr[1]/td[1]/a"));
				Actions ac=new Actions(dr);
				ac.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
				
				Thread.sleep(2000);
			}
			@Test
			public void getAttribute()
			{	FirefoxDriver dr=new FirefoxDriver();

				dr.get("http://www.facebook.com");
				dr.manage().window().maximize();
				dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement ele=dr.findElement(By.xpath(".//*[@id='pageFooter']/div[2]/table/tbody/tr[1]/td[1]/a"));
				System.out.println(ele.getAttribute("title"));
			}
		@Test
		public void forEachLoop()
		{	// for each loop
			int a[]={10,3,3,5,6,5};
			for(int num:a)
			{
				
				System.out.println(num);
			}
			System.out.println("start for loop");
			
			for(int i=0; i<a[i]; i++)
			{System.out.println(a[i]);}
			
}
		@Test
		public void getkeyboard() throws Throwable
		{	FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.bluefly.com");
		Keyboard b=((HasInputDevices)dr).getKeyboard();
		b.pressKey(Keys.F5);
		Thread.sleep(2000);
		b.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"p"));
		String parentwin=dr.getWindowHandle();
		Set<String> childwin=dr.getWindowHandles();
		for(String window:childwin)
		{
			if(! dr.equals(parentwin))
			{
	
				dr.switchTo().window(window);
				
				
				}}
		
		dr.get("http://www.google.com");
		}
		
		@Test
		public void screenshotKeyboard() throws Exception
		{
			FirefoxDriver dr=new FirefoxDriver();
			dr.get("http://www.bluefly.com");
			Keyboard b=dr.getKeyboard();
			b.sendKeys(Keys.CONTROL, Keys.SHIFT, "p");
			File f=dr.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\paion\\Desktop\\Selenium\\m.png"), true);
			
			
		}
		@Test
		public void screenshot() throws Exception
		{
			FirefoxDriver dr=new FirefoxDriver();
			dr.get("http://www.bluefly.com");
			File g=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(g,  new File("C:\\Users\\paion\\Desktop\\Selenium\\g.png"), true);
		}
		@Test
		public void getAttributecompare()
		{	FirefoxDriver dr=new FirefoxDriver();

			dr.get("http://www.teachwise.com");		
			String e=dr.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[3]/ul/li[1]/a/img")).getAttribute("src");
			System.out.println(e);
			dr.findElement(By.xpath(".//*[@id='nav']/li[1]/a/span")).click();;
			String e1=dr.findElement(By.xpath(".//*[@id='products-list']/li[1]/a/img")).getAttribute("src");
			System.out.println(e1);
			if(e.equals(e1))
				{
				System.out.println(true);
				}
			else
				System.out.println("false");
	}
}