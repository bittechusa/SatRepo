import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SmokeTest extends BaseTest
{
	
	@Test
	public void mouseOver() throws Throwable
	{
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement ele=dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a"));
		Actions x=new Actions(dr);
		x.moveToElement(ele).perform();
		Thread.sleep(2000);
		List<WebElement> subele=dr.findElements(By.xpath(".//*[@id='main-nav-woman']/div/div[1]/ul/li"));
		for(int i=1; i<=subele.size(); i++) 
		{
			WebElement ele1=dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a"));
			Actions y=new Actions(dr);
			y.moveToElement(ele1).perform();
			dr.findElement(By.xpath(".//*[@id='main-nav-woman']/div/div[1]/ul/li["+i+"]/a")).click();
			Thread.sleep(2000);
			
		}
					
	}

}
