import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
	FirefoxDriver dr=new FirefoxDriver();
	@Before
	public void start()
	{
		dr.manage().window().maximize();
		dr.get("http://www.bluefly.com");
	}
	@After
	public void end()
	{
		dr.quit();
	}

}
