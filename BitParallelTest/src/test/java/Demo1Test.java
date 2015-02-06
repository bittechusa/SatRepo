import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Demo1Test extends BaseTest 
{

	@Test
	public void testLink()throws Exception{
        getDriver().get("http://facebook.com");
        WebElement textBox = getDriver().findElement(By.xpath("//input[@value='Your Email']"));
        textBox.click();
        textBox.sendKeys("Just a test!");
        Thread.sleep(2000);
    }

}
