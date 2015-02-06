import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Demo2Test extends BaseTest 
{
	 @Test
	    public void testLink()throws Exception
	    {
	        getDriver().get("https://twitter.com");
	        WebElement textBox = getDriver().findElement(By.xpath("//label1"));
	        textBox.click();
	        textBox.sendKeys("Just another test!");
	        Thread.sleep(2000);
	    }

}
