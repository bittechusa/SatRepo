import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MouseOver extends BaseTestForDataFromExeclProject
{
	 
	@Test
	public void mouseOver1() throws Throwable
	{  
		//dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement ele=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a/b"));
		//WebElement ele2=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a"));
		//WebElement ele3=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[3]/a"));


		Actions x=new Actions(dr);
		x.moveToElement(ele).perform();
		Thread.sleep(2000);
		List<WebElement> subele=dr.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div"));
		for(int i=1; i<=subele.size(); i++) 
		{
			if (i==1)
			{
				x.moveToElement(ele).perform();
				Thread.sleep(2000);
				List<WebElement> subele4=dr.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[1]/ul/li"));
				/*for(int g=1; g<=subele4.size();g++){
					List<WebElement> subele2=dr.findElements(By.xpath(".//*[@id='main-nav-woman']/div/div[3]/ul["+g+"]/li"));*/
					for(int d=1; d<=subele4.size(); d++){
						
							//WebElement ele3=dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a"));
							//Actions s=new Actions(dr);
							x.moveToElement(ele).perform();
							dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[1]/ul/li["+d+"]/a")).click();
							Thread.sleep(2000);
							}
				
			}
			else 
			{
				x.moveToElement(ele).perform();
				Thread.sleep(2000);
				List<WebElement> subele4=dr.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[2]/ul/li"));

				for(int g=1; g<=subele4.size();g++)
				{
					x.moveToElement(ele).perform();
					Thread.sleep(2000);
					dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[2]/ul/li["+g+"]/a")).click();
					Thread.sleep(2000);


				}
					
			}
		}
			/*List<WebElement> subele1=dr.findElements(By.xpath(".//*[@id='main-nav-woman']/div/div["+i+"]/ul/li"));
			for(int j=1; j<=subele1.size(); j++){
				
					//WebElement ele1=dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a"));
					//Actions y=new Actions(dr);
					x.moveToElement(ele3).perform();
					dr.findElement(By.xpath(".//*[@id='main-nav-woman']/div/div["+i+"]/ul/li["+j+"]/a")).click();
					Thread.sleep(2000);
					
		}*/
			
	
	}		
	}


