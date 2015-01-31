import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {
	
	FirefoxDriver dr=new FirefoxDriver();
	
	@Before
	public void m1()
	{
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
		dr.findElement(By.xpath(".//*[@id='signup-lightbox']/div[1]")).click();
		
	}

	@After
	public void m2() throws Throwable
	{
		Thread.sleep(3000);
		dr.quit();
	}
	
}
