import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class AssertTest {
	
	@Test
	public void assertMethod ()
	{FirefoxDriver dr=new FirefoxDriver();

		
			Assert.assertEquals("jfkdgj", "jfkdgj", "dsfg");
			System.out.println("hi");
			Assert.assertTrue(dr.getTitle().contains("facebook"));
			System.out.println("hdjgfj");
			Assert.assertFalse(dr.getPageSource().contains("login"));
			System.out.println("xgff");
		}
		@Test
		public void ajaxCall() throws Throwable
		{
			FirefoxProfile profile = new FirefoxProfile(); 
			FirefoxDriver dr = new FirefoxDriver(profile);

			   final String firebugPath = "C:\firebug-2.0.7.xpi";
			   //final String firepathPath = "C:\\firepath.xpi";
			         
			   //profile.addExtension(new File(firebugPath));
			   
				
				dr.get("http://www.bluefly.com");
			WebDriverWait wait=new WebDriverWait(dr, 10);
			//wait.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.xpath("hjhkh"))));
			
			//FluentWait wait1=new FluentWait(dr);
			//wait1.withTimeout(25, TimeUnit.SECONDS).pollingEvery(25, TimeUnit.SECONDS).until(isTrue)
		}
		
		@Test
		
		public void FrameElementFind()
		{FirefoxDriver dr=new FirefoxDriver();
		
			dr.get("http://localhost/iframe.html");
			//dr.findElement(By.xpath("http://localhost/iframe.html"));
			
			dr.switchTo().frame(0);//
			dr.findElement(By.xpath(".//*[@id='leftcol']/a[5]")).click();;
			dr.navigate().back();
			}
		@Test
		public void alertHandling() throws Throwable
		{FirefoxDriver dr=new FirefoxDriver();
			dr.get("http://localhost/onclick.html");
			Thread.sleep(3000);
			dr.findElement(By.xpath(".//input[@value='login']")).click();
			Thread.sleep(3000);
			dr.switchTo().alert().accept();
			dr.findElement(By.xpath(".//input[@value='login1']")).click();
			Thread.sleep(3000);
			String e=dr.switchTo().alert().getText();
			System.out.println(e);
			if(e.equals("fjdlkf"))
			{
				System.out.println("t");
			}
			
			else
				System.out.println("f");
			
			dr.switchTo().alert().dismiss();
			dr.findElement(By.xpath(".//input[@value='login2']")).click();
			Alert el=dr.switchTo().alert();
			Thread.sleep(3000);

			el.sendKeys("fds");
			Thread.sleep(3000);

			el.accept();
			
		}
		
		@Test
		public void cookieHandle() throws Throwable
		{FirefoxDriver dr=new FirefoxDriver();
			//dr.get("http://userId:password @google.com");//to get the password and userid dialog box
		dr.get("http://www.facebook.com");
		Set<Cookie> c=dr.manage().getCookies();
		for (Cookie d:c)
		{System.out.println(d);
		}
		dr.manage().deleteAllCookies();
		System.out.println(c);
		System.out.println("no cookie");
		System.out.println(dr.manage().getCookies());
		dr.close();
		}
		@Test
		public void dragDrop() throws Throwable
		{FirefoxDriver dr=new FirefoxDriver();
			dr.get("http://jqueryui.com/draggable/");
			dr.switchTo().frame(0);
			WebElement drug=dr.findElement(By.id("draggable"));
			WebElement drop=dr.findElement(By.id("droppable"));

			Actions c=new Actions (dr);
			
			c.dragAndDropBy(drug, 200, 10).build().perform();
			Thread.sleep(3000);

		    c.dragAndDrop(drug, drop).build().perform();
		    Thread.sleep(3000);
			
		}
		
		@Test
		public void reverseString()
		{
			String a="welcome";
			String b="paion";
			String reverse=new StringBuffer(a).reverse().toString();
			System.out.println(reverse);
			System.out.println(new StringBuilder(b).reverse().toString());
			}
		
		
}

