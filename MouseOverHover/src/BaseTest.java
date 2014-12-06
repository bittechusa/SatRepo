import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {
	
	FirefoxDriver dr=new FirefoxDriver();
	
	@Before
	public void m1()
	{
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
		
	}

	@After
	public void m2() throws Throwable
	{
		Thread.sleep(3000);
		dr.quit();
	}
	
}
