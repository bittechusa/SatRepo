import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class smoke extends BaseTest
{
	
	@Test
	public void mouseOver() throws Throwable
	{
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement ele=dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a"));
		Actions x=new Actions(dr);
		x.moveToElement(ele).perform();
		Thread.sleep(2000);
		List<WebElement> subele=dr.findElements(By.xpath(".//*[@id='main-nav-woman']/div/div"));
		for(int i=1; i<=subele.size(); i++) 
		{
			if (i==3)
			{
				List<WebElement> subele4=dr.findElements(By.xpath(".//*[@id='main-nav-woman']/div/div[3]/ul"));
				for(int g=1; g<=subele4.size();g++){
					List<WebElement> subele2=dr.findElements(By.xpath(".//*[@id='main-nav-woman']/div/div[3]/ul["+g+"]/li"));
					for(int d=1; d<=subele2.size(); d++){
						
							WebElement ele3=dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a"));
							Actions s=new Actions(dr);
							s.moveToElement(ele3).perform();
							dr.findElement(By.xpath(".//*[@id='main-nav-woman']/div/div[3]/ul["+g+"]/li["+d+"]/a")).click();
							Thread.sleep(2000);
							}
				
			}		
		}
			List<WebElement> subele1=dr.findElements(By.xpath(".//*[@id='main-nav-woman']/div/div["+i+"]/ul/li"));
			for(int j=1; j<=subele1.size(); j++){
				
					WebElement ele1=dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a"));
					Actions y=new Actions(dr);
					y.moveToElement(ele1).perform();
					dr.findElement(By.xpath(".//*[@id='main-nav-woman']/div/div["+i+"]/ul/li["+j+"]/a")).click();
					Thread.sleep(2000);
					
		}
			
	
	}		
	}
}














