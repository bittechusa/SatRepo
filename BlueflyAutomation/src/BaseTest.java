import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
	FirefoxDriver driver=new FirefoxDriver();
	@Before
	public void start()
	{
		driver.manage().window().maximize();
		driver.get("http://www.bluefly.com");
	}
	@After
	public void end()
	{
		driver.quit();
	}

}
