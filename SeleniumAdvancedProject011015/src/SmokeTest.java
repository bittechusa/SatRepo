import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SmokeTest 
{
	FirefoxDriver dr=new FirefoxDriver();
	@Test
	public void dragAndDrop() throws InterruptedException
	{
		/*@Test
		public void drugable() throws Throwable
		{
		driver.get("http://www.jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement dropable=driver.findElement(By.id("draggable"));//source file
		WebElement moga2=driver.findElement(By.id("droppable"));//target file
		new Actions(driver).dragAndDropBy(dropable, 200, 10).build().perform();//this for anywhere based on pixel
		new Actions(driver).dragAndDrop(dropable, moga2).build().perform();//this for specific place
		Thread.sleep(4000);*/
		dr.get("http://www.jqueryui.com/droppable/");
		dr.switchTo().frame(0);
		WebElement drug=dr.findElement(By.id("draggable"));
		WebElement drop=dr.findElement(By.id("droppable"));
		Actions ac=new Actions(dr);
		ac.dragAndDropBy(drug, 200, 10).build().perform();
		Thread.sleep(2000);
		ac.dragAndDrop(drug, drop).build().perform();
		Thread.sleep(3000);
		
		
		
	}

	@Test
	public void demoWait()
	{
		dr.get("http://www.facebook.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*dr.findElement(By.id("u_0_n")).click();
		WebDriverWait wait=new WebDriverWait(dr, 10);
		wait.until(ExpectedConditions.);
		
		dr.findElement(By.id("email")).sendKeys("fggh");
		//dr.manage().addCookie("7eer.net");
*/		Set<Cookie> c=dr.manage().getCookies();

          for(Cookie d:c)
          {
        	  System.out.println(d);
          }
          dr.manage().deleteAllCookies();
          System.out.println("vcbhfc");
          System.out.println(dr.manage().getCookies());
	}
	@Test
	public void frame() throws InterruptedException
	{
		//dr.get("http://localhost/frame1.html");
		//dr.switchTo().frame(0);
		//dr.findElement(By.xpath(".//*[@id='leftcol']/a[7]")).click();
		dr.get("http://localhost/alert.html");
		dr.findElement(By.xpath("//input[@value='login']")).click();
		
		dr.switchTo().alert().accept();
		dr.findElement(By.xpath("//input[@value='login1']")).click();
		dr.switchTo().alert().dismiss();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@value='login2']")).click();
		Alert a=dr.switchTo().alert();
		Thread.sleep(2000);
		a.sendKeys("regd");
		a.accept();
		
	}

}
