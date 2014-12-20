import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class SmokeTest extends BaseTest{

	@Test
public void run() throws Throwable
{
		dr.findElement(By.xpath("//a[@class='main-nav-link main-nav-link-women']")).click();
		List<WebElement> elements=dr.findElements(By.xpath("html/body/div[2]/div[3]/div/div[2]/div[1]/div/div[2]/ul/li"));
		int size=elements.size();
		for (int i=1; i<size; i++)
		{
			Thread.sleep(3000);
			dr.findElement(By.xpath(".//*[@id='slotMcolMain1']/div/div[2]/ul/li["+i+"]/a/div/img")).click();
			Thread.sleep(3000);
			dr.navigate().back();// to go back to the previous page
		}
		
	}
}
